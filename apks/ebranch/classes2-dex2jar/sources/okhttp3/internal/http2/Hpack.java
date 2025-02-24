package okhttp3.internal.http2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import io.realm.RealmFieldTypeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.ChuckerDatabase;
import o.defaultInspectorModulesProvider;
import o.setResponseContentType;
import o.setResponseMessage;
import o.setScheme;
import o.setTookMs;
import okhttp3.internal.Util;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Hpack.class */
public final class Hpack {
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    static final Header[] STATIC_HEADER_TABLE = {new Header(Header.TARGET_AUTHORITY, ""), new Header(Header.TARGET_METHOD, "GET"), new Header(Header.TARGET_METHOD, "POST"), new Header(Header.TARGET_PATH, "/"), new Header(Header.TARGET_PATH, "/index.html"), new Header(Header.TARGET_SCHEME, "http"), new Header(Header.TARGET_SCHEME, "https"), new Header(Header.RESPONSE_STATUS, "200"), new Header(Header.RESPONSE_STATUS, "204"), new Header(Header.RESPONSE_STATUS, "206"), new Header(Header.RESPONSE_STATUS, "304"), new Header(Header.RESPONSE_STATUS, "400"), new Header(Header.RESPONSE_STATUS, "404"), new Header(Header.RESPONSE_STATUS, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header(Constants.MessagePayloadKeys.FROM, ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header(FirebaseAnalytics.Param.LOCATION, ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
    static final Map<setResponseMessage, Integer> NAME_TO_FIRST_INDEX = nameToFirstIndex();

    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Hpack$Reader.class */
    static final class Reader {
        Header[] dynamicTable;
        int dynamicTableByteCount;
        int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final setTookMs source;

        Reader(int i, int i2, defaultInspectorModulesProvider defaultinspectormodulesprovider) {
            this.headerList = new ArrayList();
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = 7;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.source = ChuckerDatabase.b(defaultinspectormodulesprovider);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Reader(int i, defaultInspectorModulesProvider defaultinspectormodulesprovider) {
            this(i, i, defaultinspectormodulesprovider);
        }

        private void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            int i4 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length - 1;
                int i5 = i;
                while (true) {
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i5 <= 0) {
                        break;
                    }
                    i5 -= this.dynamicTable[length].hpackSize;
                    this.dynamicTableByteCount -= this.dynamicTable[length].hpackSize;
                    this.headerCount--;
                    i4++;
                    length--;
                }
                Header[] headerArr = this.dynamicTable;
                int i6 = i2 + 1;
                System.arraycopy(headerArr, i6, headerArr, i6 + i4, this.headerCount);
                this.nextHeaderIndex += i4;
                i3 = i4;
            }
            return i3;
        }

        private setResponseMessage getName(int i) throws IOException {
            if (isStaticHeader(i)) {
                return Hpack.STATIC_HEADER_TABLE[i].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    return headerArr[dynamicTableIndex].name;
                }
            }
            StringBuilder sb = new StringBuilder("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        private void insertIntoDynamicTable(int i, Header header) {
            this.headerList.add(header);
            int i2 = header.hpackSize;
            int i3 = i2;
            if (i != -1) {
                i3 = i2 - this.dynamicTable[dynamicTableIndex(i)].hpackSize;
            }
            int i4 = this.maxDynamicTableByteCount;
            if (i3 > i4) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i3) - i4);
            if (i == -1) {
                int i5 = this.headerCount;
                Header[] headerArr = this.dynamicTable;
                if (i5 + 1 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length << 1];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i6 = this.nextHeaderIndex;
                this.nextHeaderIndex = i6 - 1;
                this.dynamicTable[i6] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i + dynamicTableIndex(i) + evictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i3;
        }

        private boolean isStaticHeader(int i) {
            boolean z = true;
            if (i < 0 || i > Hpack.STATIC_HEADER_TABLE.length - 1) {
                z = false;
            }
            return z;
        }

        private int readByte() throws IOException {
            return this.source.i() & 255;
        }

        private void readIndexedHeader(int i) throws IOException {
            if (isStaticHeader(i)) {
                this.headerList.add(Hpack.STATIC_HEADER_TABLE[i]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.STATIC_HEADER_TABLE.length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    this.headerList.add(headerArr[dynamicTableIndex]);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("Header index too large ");
            sb.append(i + 1);
            throw new IOException(sb.toString());
        }

        private void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i), readByteString()));
        }

        private void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingIndexedName(int i) throws IOException {
            this.headerList.add(new Header(getName(i), readByteString()));
        }

        private void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            ArrayList arrayList = new ArrayList(this.headerList);
            this.headerList.clear();
            return arrayList;
        }

        final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        final setResponseMessage readByteString() throws IOException {
            int readByte = readByte();
            boolean z = (readByte & RealmFieldTypeConstants.LIST_OFFSET) == 128;
            int readInt = readInt(readByte, Hpack.PREFIX_7_BITS);
            return z ? setResponseMessage.d(Huffman.get().decode(this.source.e((long) readInt))) : this.source.c((long) readInt);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void readHeaders() throws IOException {
            while (!this.source.f()) {
                int i = this.source.i() & 255;
                if (i == 128) {
                    throw new IOException("index == 0");
                } else if ((i & RealmFieldTypeConstants.LIST_OFFSET) == 128) {
                    readIndexedHeader(readInt(i, Hpack.PREFIX_7_BITS) - 1);
                } else if (i == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((i & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(i, 63) - 1);
                } else if ((i & 32) == 32) {
                    int readInt = readInt(i, 31);
                    this.maxDynamicTableByteCount = readInt;
                    if (readInt < 0 || readInt > this.headerTableSizeSetting) {
                        StringBuilder sb = new StringBuilder("Invalid dynamic table size update ");
                        sb.append(this.maxDynamicTableByteCount);
                        throw new IOException(sb.toString());
                    }
                    adjustDynamicTableByteCount();
                } else if (i == 16 || i == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(i, 15) - 1);
                }
            }
        }

        final int readInt(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & RealmFieldTypeConstants.LIST_OFFSET) == 0) {
                    return i2 + (readByte << i4);
                }
                i2 += (readByte & Hpack.PREFIX_7_BITS) << i4;
                i4 += 7;
            }
        }
    }

    /* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Hpack$Writer.class */
    static final class Writer {
        private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
        private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
        Header[] dynamicTable;
        int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        int headerCount;
        int headerTableSizeSetting;
        int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final setResponseContentType out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        Writer(int i, boolean z, setResponseContentType setresponsecontenttype) {
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = 7;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i;
            this.useCompression = z;
            this.out = setresponsecontenttype;
        }

        Writer(setResponseContentType setresponsecontenttype) {
            this(SETTINGS_HEADER_TABLE_SIZE, true, setresponsecontenttype);
        }

        private void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }

        private void clearDynamicTable() {
            Arrays.fill(this.dynamicTable, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            int i4 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length - 1;
                int i5 = i;
                while (true) {
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i5 <= 0) {
                        break;
                    }
                    i5 -= this.dynamicTable[length].hpackSize;
                    this.dynamicTableByteCount -= this.dynamicTable[length].hpackSize;
                    this.headerCount--;
                    i4++;
                    length--;
                }
                Header[] headerArr = this.dynamicTable;
                int i6 = i2 + 1;
                System.arraycopy(headerArr, i6, headerArr, i6 + i4, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i7 = this.nextHeaderIndex + 1;
                Arrays.fill(headerArr2, i7, i7 + i4, (Object) null);
                this.nextHeaderIndex += i4;
                i3 = i4;
            }
            return i3;
        }

        private void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount;
            Header[] headerArr = this.dynamicTable;
            if (i3 + 1 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length << 1];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        final void setHeaderTableSizeSetting(int i) {
            this.headerTableSizeSetting = i;
            int min = Math.min(i, (int) SETTINGS_HEADER_TABLE_SIZE_LIMIT);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 != min) {
                if (min < i2) {
                    this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
                }
                this.emitDynamicTableSizeUpdate = true;
                this.maxDynamicTableByteCount = min;
                adjustDynamicTableByteCount();
            }
        }

        final void writeByteString(setResponseMessage setresponsemessage) throws IOException {
            if (!this.useCompression || Huffman.get().encodedLength(setresponsemessage) >= setresponsemessage.g()) {
                writeInt(setresponsemessage.g(), Hpack.PREFIX_7_BITS, 0);
                setResponseContentType setresponsecontenttype = this.out;
                if (setresponsemessage != null) {
                    setresponsemessage.c(setresponsecontenttype);
                    return;
                }
                throw new IllegalArgumentException("byteString == null");
            }
            setScheme.com_github_ChuckerTeam_Chucker_library setresponsecontenttype2 = new setResponseContentType();
            Huffman.get().encode(setresponsemessage, setresponsecontenttype2);
            setResponseMessage setresponsemessage2 = new setResponseMessage(setresponsecontenttype2.l());
            writeInt(setresponsemessage2.g(), Hpack.PREFIX_7_BITS, RealmFieldTypeConstants.LIST_OFFSET);
            setresponsemessage2.c(this.out);
        }

        final void writeHeaders(List<Header> list) throws IOException {
            int i;
            int i2;
            if (this.emitDynamicTableSizeUpdate) {
                int i3 = this.smallestHeaderTableSizeSetting;
                if (i3 < this.maxDynamicTableByteCount) {
                    writeInt(i3, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Header header = list.get(i4);
                setResponseMessage i5 = header.name.i();
                setResponseMessage setresponsemessage = header.value;
                Integer num = Hpack.NAME_TO_FIRST_INDEX.get(i5);
                if (num != null) {
                    i = num.intValue() + 1;
                    if (i > 1 && i < 8) {
                        if (Util.equal(Hpack.STATIC_HEADER_TABLE[i - 1].value, setresponsemessage)) {
                            i2 = i;
                        } else if (Util.equal(Hpack.STATIC_HEADER_TABLE[i].value, setresponsemessage)) {
                            i2 = i;
                            i++;
                        }
                    }
                    i2 = i;
                    i = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                int i6 = i;
                int i7 = i2;
                if (i == -1) {
                    int i8 = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        i6 = i;
                        i7 = i2;
                        if (i8 >= length) {
                            break;
                        }
                        i2 = i2;
                        if (Util.equal(this.dynamicTable[i8].name, i5)) {
                            if (Util.equal(this.dynamicTable[i8].value, setresponsemessage)) {
                                i6 = Hpack.STATIC_HEADER_TABLE.length + (i8 - this.nextHeaderIndex);
                                i7 = i2;
                                break;
                            }
                            i2 = i2;
                            if (i2 == -1) {
                                i2 = (i8 - this.nextHeaderIndex) + Hpack.STATIC_HEADER_TABLE.length;
                            }
                        }
                        i8++;
                    }
                }
                if (i6 != -1) {
                    writeInt(i6, Hpack.PREFIX_7_BITS, RealmFieldTypeConstants.LIST_OFFSET);
                } else if (i7 == -1) {
                    this.out.b(64);
                    writeByteString(i5);
                    writeByteString(setresponsemessage);
                    insertIntoDynamicTable(header);
                } else {
                    setResponseMessage setresponsemessage2 = Header.PSEUDO_PREFIX;
                    if (!i5.d(0, setresponsemessage2, 0, setresponsemessage2.g()) || Header.TARGET_AUTHORITY.equals(i5)) {
                        writeInt(i7, 63, 64);
                        writeByteString(setresponsemessage);
                        insertIntoDynamicTable(header);
                    } else {
                        writeInt(i7, 15, 0);
                        writeByteString(setresponsemessage);
                    }
                }
            }
        }

        final void writeInt(int i, int i2, int i3) {
            if (i < i2) {
                this.out.b(i | i3);
                return;
            }
            this.out.b(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.out.b(128 | (i4 & Hpack.PREFIX_7_BITS));
                i4 >>>= 7;
            }
            this.out.b(i4);
        }
    }

    private Hpack() {
    }

    static setResponseMessage checkLowercase(setResponseMessage setresponsemessage) throws IOException {
        int g = setresponsemessage.g();
        for (int i = 0; i < g; i++) {
            byte a = setresponsemessage.a(i);
            if (a >= 65 && a <= 90) {
                StringBuilder sb = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(setresponsemessage.j());
                throw new IOException(sb.toString());
            }
        }
        return setresponsemessage;
    }

    private static Map<setResponseMessage, Integer> nameToFirstIndex() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(STATIC_HEADER_TABLE.length);
        int i = 0;
        while (true) {
            Header[] headerArr = STATIC_HEADER_TABLE;
            if (i >= headerArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(headerArr[i].name)) {
                linkedHashMap.put(headerArr[i].name, Integer.valueOf(i));
            }
            i++;
        }
    }
}
