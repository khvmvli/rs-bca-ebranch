package o;

import io.realm.internal.Property;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import o.R;
/* loaded from: classes-dex2jar.jar:o/setResponseContentType.class */
public final class setResponseContentType implements setTookMs, setScheme$com_github_ChuckerTeam_Chucker_library, Cloneable, ByteChannel {
    private static final byte[] e = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public long b;
    @Nullable
    Stetho d;

    private static boolean c(Stetho stetho, int i, setResponseMessage setresponsemessage, int i2, int i3) {
        int i4 = stetho.c;
        byte[] bArr = stetho.d;
        while (i2 < i3) {
            i4 = i4;
            stetho = stetho;
            int i5 = i;
            if (i == i4) {
                stetho = stetho.a;
                bArr = stetho.d;
                i5 = stetho.b;
                i4 = stetho.c;
            }
            if (bArr[i5] != setresponsemessage.a(i2)) {
                return false;
            }
            i = i5 + 1;
            i2++;
        }
        return true;
    }

    @Override // o.setScheme$com_github_ChuckerTeam_Chucker_library
    public final long a(defaultInspectorModulesProvider defaultinspectormodulesprovider) throws IOException {
        if (defaultinspectormodulesprovider != null) {
            long j = 0;
            while (true) {
                long read = defaultinspectormodulesprovider.read(this, 8192);
                if (read == -1) {
                    return j;
                }
                j += read;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    final String a(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (b(j2) == 13) {
                String e2 = e(j2, defaultDumperPluginsProvider.a);
                f(2L);
                return e2;
            }
        }
        String e3 = e(j, defaultDumperPluginsProvider.a);
        f(1L);
        return e3;
    }

    @Override // o.setTookMs
    public final String a(Charset charset) {
        try {
            return e(this.b, charset);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final setResponseContentType a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalAccessError(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 > str.length()) {
            StringBuilder sb3 = new StringBuilder("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(defaultDumperPluginsProvider.a)) {
            return e(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return a(bytes, 0, bytes.length);
        }
    }

    @Override // o.setScheme$com_github_ChuckerTeam_Chucker_library
    public final /* synthetic */ setScheme$com_github_ChuckerTeam_Chucker_library a(setResponseMessage setresponsemessage) throws IOException {
        if (setresponsemessage != null) {
            setresponsemessage.c(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public final void a() {
        try {
            f(this.b);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // o.setTookMs
    public final void a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int c = c(bArr, i, bArr.length - i);
            if (c != -1) {
                i += c;
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [long] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final byte b(long r8) {
        /*
            r7 = this;
            r0 = r7
            long r0 = r0.b
            r1 = r8
            r2 = 1
            o.defaultDumperPluginsProvider.a(r0, r1, r2)
            r0 = r7
            long r0 = r0.b
            r10 = r0
            r0 = r10
            r1 = r8
            long r0 = r0 - r1
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004c
            r0 = r7
            o.Stetho r0 = r0.d
            r12 = r0
        L_0x001c:
            r0 = r12
            int r0 = r0.c
            r1 = r12
            int r1 = r1.b
            int r0 = r0 - r1
            long r0 = (long) r0
            r10 = r0
            r0 = r8
            r1 = r10
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003e
            r0 = r12
            byte[] r0 = r0.d
            r1 = r12
            int r1 = r1.b
            r2 = r8
            int r2 = (int) r2
            int r1 = r1 + r2
            r0 = r0[r1]
            return r0
        L_0x003e:
            r0 = r8
            r1 = r10
            long r0 = r0 - r1
            r8 = r0
            r0 = r12
            o.Stetho r0 = r0.a
            r12 = r0
            goto L_0x001c
        L_0x004c:
            r0 = r8
            r1 = r10
            long r0 = r0 - r1
            r8 = r0
            r0 = r7
            o.Stetho r0 = r0.d
            r12 = r0
        L_0x0056:
            r0 = r12
            o.Stetho r0 = r0.g
            r13 = r0
            r0 = r8
            r1 = r13
            int r1 = r1.c
            r2 = r13
            int r2 = r2.b
            int r1 = r1 - r2
            long r1 = (long) r1
            long r0 = r0 + r1
            r10 = r0
            r0 = r13
            r12 = r0
            r0 = r10
            r8 = r0
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0056
            r0 = r13
            byte[] r0 = r0.d
            r1 = r13
            int r1 = r1.b
            r2 = r10
            int r2 = (int) r2
            int r1 = r1 + r2
            r0 = r0[r1]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType.b(long):byte");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long b() {
        /*
            r5 = this;
            r0 = r5
            long r0 = r0.b
            r6 = r0
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x000d
            r0 = 0
            return r0
        L_0x000d:
            r0 = r5
            o.Stetho r0 = r0.d
            o.Stetho r0 = r0.g
            r8 = r0
            r0 = r6
            r9 = r0
            r0 = r8
            int r0 = r0.c
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 >= r1) goto L_0x003a
            r0 = r6
            r9 = r0
            r0 = r8
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x003a
            r0 = r6
            r1 = r8
            int r1 = r1.c
            r2 = r8
            int r2 = r2.b
            int r1 = r1 - r2
            long r1 = (long) r1
            long r0 = r0 - r1
            r9 = r0
        L_0x003a:
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType.b():long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [long] */
    /* JADX WARN: Type inference failed for: r11v0, types: [long] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3, types: [long] */
    /* JADX WARN: Type inference failed for: r13v0, types: [long] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v4, types: [long] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r17v0, types: [long] */
    /* JADX WARN: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long b(byte r10, long r11, long r13) {
        /*
        // Method dump skipped, instructions count: 333
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType.b(byte, long, long):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [long] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v3, types: [long] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r9v0, types: [long] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [long] */
    /* JADX WARN: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long b(o.setResponseMessage r8, long r9) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType.b(o.setResponseMessage, long):long");
    }

    /* renamed from: b */
    public final setResponseContentType e(int i) {
        Stetho c = c(1);
        byte[] bArr = c.d;
        int i2 = c.c;
        c.c = i2 + 1;
        bArr[i2] = (byte) ((byte) i);
        this.b++;
        return this;
    }

    @Override // o.setTookMs
    public final int c(BuildConfig buildConfig) {
        int e2 = e(buildConfig, false);
        if (e2 == -1) {
            return -1;
        }
        try {
            f((long) buildConfig.e[e2].g());
            return e2;
        } catch (EOFException e3) {
            throw new AssertionError();
        }
    }

    public final int c(byte[] bArr, int i, int i2) {
        defaultDumperPluginsProvider.a((long) bArr.length, (long) i, (long) i2);
        Stetho stetho = this.d;
        if (stetho == null) {
            return -1;
        }
        int min = Math.min(i2, stetho.c - stetho.b);
        System.arraycopy(stetho.d, stetho.b, bArr, i, min);
        stetho.b += min;
        this.b -= (long) min;
        if (stetho.b == stetho.c) {
            this.d = stetho.c();
            InspectorModulesProvider.c(stetho);
        }
        return min;
    }

    @Override // o.setTookMs
    public final long c(initialize initialize) throws IOException {
        long j = this.b;
        if (j > 0) {
            initialize.write(this, j);
        }
        return j;
    }

    @Override // o.setTookMs
    public final long c(setResponseMessage setresponsemessage) {
        return c(setresponsemessage, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v87, types: [long] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3, types: [long] */
    /* JADX WARN: Type inference failed for: r9v5, types: [long] */
    /* JADX WARN: Type inference failed for: r9v6, types: [long] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long c(o.setResponseMessage r6, long r7) {
        /*
        // Method dump skipped, instructions count: 427
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType.c(o.setResponseMessage, long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r0.e == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final o.Stetho c(int r4) {
        /*
            r3 = this;
            r0 = r4
            if (r0 <= 0) goto L_0x0063
            r0 = r4
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 > r1) goto L_0x0063
            r0 = r3
            o.Stetho r0 = r0.d
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L_0x0029
            o.Stetho r0 = o.InspectorModulesProvider.c()
            r5 = r0
            r0 = r3
            r1 = r5
            r0.d = r1
            r0 = r5
            r1 = r5
            r0.g = r1
            r0 = r5
            r1 = r5
            r0.a = r1
            r0 = r5
            return r0
        L_0x0029:
            r0 = r5
            o.Stetho r0 = r0.g
            r6 = r0
            r0 = r6
            int r0 = r0.c
            r1 = r4
            int r0 = r0 + r1
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 > r1) goto L_0x0043
            r0 = r6
            r5 = r0
            r0 = r6
            boolean r0 = r0.e
            if (r0 != 0) goto L_0x0061
        L_0x0043:
            o.Stetho r0 = o.InspectorModulesProvider.c()
            r5 = r0
            r0 = r5
            r1 = r6
            r0.g = r1
            r0 = r5
            r1 = r6
            o.Stetho r1 = r1.a
            r0.a = r1
            r0 = r6
            o.Stetho r0 = r0.a
            r1 = r5
            r0.g = r1
            r0 = r6
            r1 = r5
            r0.a = r1
        L_0x0061:
            r0 = r5
            return r0
        L_0x0063:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType.c(int):o.Stetho");
    }

    @Override // o.setTookMs, o.setScheme$com_github_ChuckerTeam_Chucker_library
    public final setResponseContentType c() {
        return this;
    }

    @Override // o.setTookMs
    public final setResponseMessage c(long j) throws EOFException {
        return new setResponseMessage(e(j));
    }

    @Override // o.defaultInspectorModulesProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.setTookMs
    public final long d(setResponseMessage setresponsemessage) throws IOException {
        return b(setresponsemessage, 0);
    }

    @Override // o.setTookMs
    public final String d(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long b = b((byte) 10, 0, j2);
            if (b != -1) {
                return a(b);
            }
            if (j2 < this.b && b(j2 - 1) == 13 && b(j2) == 10) {
                return a(j2);
            }
            setResponseContentType setresponsecontenttype = new setResponseContentType();
            d(setresponsecontenttype, 0, Math.min(32L, this.b));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(this.b, j));
            sb.append(" content=");
            sb.append(new setResponseMessage(setresponsecontenttype.l()).e());
            sb.append((char) 8230);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: d */
    public final setResponseContentType clone() {
        setResponseContentType setresponsecontenttype = new setResponseContentType();
        if (this.b == 0) {
            return setresponsecontenttype;
        }
        Stetho stetho = this.d;
        stetho.i = true;
        Stetho stetho2 = new Stetho(stetho.d, stetho.b, stetho.c, true, false);
        setresponsecontenttype.d = stetho2;
        stetho2.g = stetho2;
        stetho2.a = stetho2;
        Stetho stetho3 = this.d;
        while (true) {
            stetho3 = stetho3.a;
            if (stetho3 != this.d) {
                Stetho stetho4 = setresponsecontenttype.d.g;
                stetho3.i = true;
                Stetho stetho5 = new Stetho(stetho3.d, stetho3.b, stetho3.c, true, false);
                stetho5.g = stetho4;
                stetho5.a = stetho4.a;
                stetho4.a.g = stetho5;
                stetho4.a = stetho5;
            } else {
                setresponsecontenttype.b = this.b;
                return setresponsecontenttype;
            }
        }
    }

    /* renamed from: d */
    public final setResponseContentType a(int i) {
        Stetho c = c(4);
        byte[] bArr = c.d;
        int i2 = c.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((byte) (i >>> 24));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((byte) (i >>> 16));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((byte) (i >>> 8));
        bArr[i5] = (byte) ((byte) i);
        c.c = i5 + 1;
        this.b += 4;
        return this;
    }

    public final setResponseContentType d(String str) {
        return e(str, 0, str.length());
    }

    /* renamed from: d */
    public final setResponseContentType e(String str, int i, int i2) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    Stetho c = c(1);
                    byte[] bArr = c.d;
                    int i3 = c.c - i;
                    int min = Math.min(i2, 8192 - i3);
                    bArr[i + i3] = (byte) ((byte) charAt2);
                    while (true) {
                        i++;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            break;
                        }
                        bArr[i + i3] = (byte) ((byte) charAt);
                    }
                    int i4 = (i3 + i) - c.c;
                    c.c += i4;
                    this.b += (long) i4;
                } else {
                    if (charAt2 < 2048) {
                        e((charAt2 >> 6) | 192);
                        e((charAt2 & '?') | Property.TYPE_ARRAY);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        e((charAt2 >> '\f') | 224);
                        e(((charAt2 >> 6) & 63) | Property.TYPE_ARRAY);
                        e((charAt2 & '?') | Property.TYPE_ARRAY);
                    } else {
                        int i5 = i + 1;
                        char charAt3 = i5 < i2 ? str.charAt(i5) : 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            e(63);
                            i = i5;
                        } else {
                            int i6 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                            e((i6 >> 18) | 240);
                            e(((i6 >> 12) & 63) | Property.TYPE_ARRAY);
                            e(((i6 >> 6) & 63) | Property.TYPE_ARRAY);
                            e((i6 & 63) | Property.TYPE_ARRAY);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder sb3 = new StringBuilder("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v2, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.setResponseContentType d(o.setResponseContentType r9, long r10, long r12) {
        /*
        // Method dump skipped, instructions count: 287
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType.d(o.setResponseContentType, long, long):o.setResponseContentType");
    }

    @Override // o.setTookMs
    public final void d(setResponseContentType setresponsecontenttype, long j) throws EOFException {
        long j2 = this.b;
        if (j2 >= j) {
            setresponsecontenttype.write(this, j);
        } else {
            setresponsecontenttype.write(this, j2);
            throw new EOFException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x018b, code lost:
        if (r6 == false) goto L_0x0191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018e, code lost:
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0193, code lost:
        return r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final int e(o.BuildConfig r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 404
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType.e(o.BuildConfig, boolean):int");
    }

    @Override // o.setTookMs
    public final long e(byte b) {
        return b((byte) 0, 0, Long.MAX_VALUE);
    }

    public final String e(long j, Charset charset) throws EOFException {
        defaultDumperPluginsProvider.a(this.b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return "";
        } else {
            Stetho stetho = this.d;
            if (((long) stetho.b) + j > ((long) stetho.c)) {
                return new String(e(j), charset);
            }
            String str = new String(stetho.d, stetho.b, (int) j, charset);
            stetho.b = (int) (((long) stetho.b) + j);
            this.b -= j;
            if (stetho.b == stetho.c) {
                this.d = stetho.c();
                InspectorModulesProvider.c(stetho);
            }
            return str;
        }
    }

    /* renamed from: e */
    public final setResponseContentType a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            defaultDumperPluginsProvider.a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                Stetho c = c(1);
                int min = Math.min(i3 - i, 8192 - c.c);
                System.arraycopy(bArr, i, c.d, c.c, min);
                i += min;
                c.c += min;
            }
            this.b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // o.setScheme$com_github_ChuckerTeam_Chucker_library
    public final setScheme$com_github_ChuckerTeam_Chucker_library e() {
        return this;
    }

    @Override // o.setScheme$com_github_ChuckerTeam_Chucker_library
    public final /* synthetic */ setScheme$com_github_ChuckerTeam_Chucker_library e(String str) throws IOException {
        return e(str, 0, str.length());
    }

    @Override // o.setScheme$com_github_ChuckerTeam_Chucker_library
    public final /* synthetic */ setScheme$com_github_ChuckerTeam_Chucker_library e(byte[] bArr) throws IOException {
        if (bArr != null) {
            return a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // o.setTookMs
    public final boolean e(long j, setResponseMessage setresponsemessage) {
        int g = setresponsemessage.g();
        if (g < 0 || this.b - 0 < ((long) g) || setresponsemessage.g() < g) {
            return false;
        }
        for (int i = 0; i < g; i++) {
            if (b(((long) i) + 0) != setresponsemessage.a(i + 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.setTookMs
    public final byte[] e(long j) throws EOFException {
        defaultDumperPluginsProvider.a(this.b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            a(bArr);
            return bArr;
        }
        StringBuilder sb = new StringBuilder("byteCount > Integer.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setResponseContentType)) {
            return false;
        }
        setResponseContentType setresponsecontenttype = (setResponseContentType) obj;
        long j = this.b;
        if (j != setresponsecontenttype.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        Stetho stetho = this.d;
        Stetho stetho2 = setresponsecontenttype.d;
        int i = stetho.b;
        int i2 = stetho2.b;
        while (j2 < this.b) {
            long min = (long) Math.min(stetho.c - i, stetho2.c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                if (stetho.d[i] != stetho2.d[i2]) {
                    return false;
                }
                i3++;
                i++;
                i2++;
            }
            stetho = stetho;
            i = i;
            if (i == stetho.c) {
                stetho = stetho.a;
                i = stetho.b;
            }
            i2 = i2;
            stetho2 = stetho2;
            if (i2 == stetho2.c) {
                stetho2 = stetho2.a;
                i2 = stetho2.b;
            }
            j2 += min;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [long] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // o.setTookMs
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void f(long r7) throws java.io.EOFException {
        /*
            r6 = this;
        L_0x0000:
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0080
            r0 = r6
            o.Stetho r0 = r0.d
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L_0x0078
            r0 = r7
            r1 = r9
            int r1 = r1.c
            r2 = r6
            o.Stetho r2 = r2.d
            int r2 = r2.b
            int r1 = r1 - r2
            long r1 = (long) r1
            long r0 = java.lang.Math.min(r0, r1)
            int r0 = (int) r0
            r10 = r0
            r0 = r6
            long r0 = r0.b
            r11 = r0
            r0 = r10
            long r0 = (long) r0
            r13 = r0
            r0 = r6
            r1 = r11
            r2 = r13
            long r1 = r1 - r2
            r0.b = r1
            r0 = r7
            r1 = r13
            long r0 = r0 - r1
            r11 = r0
            r0 = r6
            o.Stetho r0 = r0.d
            r9 = r0
            r0 = r9
            r1 = r9
            int r1 = r1.b
            r2 = r10
            int r1 = r1 + r2
            r0.b = r1
            r0 = r11
            r7 = r0
            r0 = r6
            o.Stetho r0 = r0.d
            int r0 = r0.b
            r1 = r6
            o.Stetho r1 = r1.d
            int r1 = r1.c
            if (r0 != r1) goto L_0x0000
            r0 = r6
            o.Stetho r0 = r0.d
            r9 = r0
            r0 = r6
            r1 = r9
            o.Stetho r1 = r1.c()
            r0.d = r1
            r0 = r9
            o.InspectorModulesProvider.c(r0)
            r0 = r11
            r7 = r0
            goto L_0x0000
        L_0x0078:
            java.io.EOFException r0 = new java.io.EOFException
            r1 = r0
            r1.<init>()
            throw r0
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType.f(long):void");
    }

    @Override // o.setTookMs
    public final boolean f() {
        return this.b == 0;
    }

    @Override // o.setScheme$com_github_ChuckerTeam_Chucker_library, o.initialize, java.io.Flushable
    public final void flush() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [long] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.setResponseContentType j(long r7) {
        /*
        // Method dump skipped, instructions count: 437
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType.j(long):o.setResponseContentType");
    }

    @Override // o.setScheme$com_github_ChuckerTeam_Chucker_library
    public final /* bridge */ /* synthetic */ setScheme$com_github_ChuckerTeam_Chucker_library g() throws IOException {
        return this;
    }

    @Override // o.setTookMs
    public final InputStream h() {
        return new 1(this);
    }

    @Override // o.setTookMs
    public final boolean h(long j) {
        return this.b >= j;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        Stetho stetho;
        Stetho stetho2 = this.d;
        if (stetho2 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = stetho2.c;
            for (int i3 = stetho2.b; i3 < i2; i3++) {
                i = (i * 31) + stetho2.d[i3];
            }
            stetho = stetho2.a;
            stetho2 = stetho;
            i = i;
        } while (stetho != this.d);
        return i;
    }

    @Override // o.setTookMs
    public final byte i() {
        if (this.b != 0) {
            Stetho stetho = this.d;
            int i = stetho.b;
            int i2 = stetho.c;
            byte[] bArr = stetho.d;
            int i3 = i + 1;
            byte b = bArr[i];
            this.b--;
            if (i3 == i2) {
                this.d = stetho.c();
                InspectorModulesProvider.c(stetho);
            } else {
                stetho.b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: i */
    public final setResponseContentType f(int i) {
        Stetho c = c(2);
        byte[] bArr = c.d;
        int i2 = c.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((byte) (i >>> 8));
        bArr[i3] = (byte) ((byte) i);
        c.c = i3 + 1;
        this.b += 2;
        return this;
    }

    @Override // o.setTookMs
    public final void i(long j) throws EOFException {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final setResponseContentType j(int i) {
        if (i < 128) {
            e(i);
        } else if (i < 2048) {
            e((i >> 6) | 192);
            e((i & 63) | Property.TYPE_ARRAY);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                e((i >> 12) | 224);
                e(((i >> 6) & 63) | Property.TYPE_ARRAY);
                e((i & 63) | Property.TYPE_ARRAY);
            } else {
                e(63);
            }
        } else if (i <= 1114111) {
            e((i >> 18) | 240);
            e(((i >> 12) & 63) | Property.TYPE_ARRAY);
            e(((i >> 6) & 63) | Property.TYPE_ARRAY);
            e((i & 63) | Property.TYPE_ARRAY);
        } else {
            StringBuilder sb = new StringBuilder("Unexpected code point: ");
            sb.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    @Override // o.setTookMs
    public final setTookMs j() {
        return ChuckerDatabase.b(new R.bool(this));
    }

    @Override // o.setTookMs
    public final int k() {
        return defaultDumperPluginsProvider.b(n());
    }

    @Override // o.setTookMs
    public final byte[] l() {
        try {
            return e(this.b);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140 A[EDGE_INSN: B:48:0x0140->B:42:0x0140 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // o.setTookMs
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long m() {
        /*
        // Method dump skipped, instructions count: 346
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType.m():long");
    }

    @Override // o.setTookMs
    public final int n() {
        int i;
        int i2;
        if (this.b >= 4) {
            Stetho stetho = this.d;
            int i3 = stetho.b;
            int i4 = stetho.c;
            if (i4 - i3 < 4) {
                i = ((i() & 255) << 24) | ((i() & 255) << 16) | ((i() & 255) << 8);
                i2 = i() & 255;
            } else {
                byte[] bArr = stetho.d;
                int i5 = i3 + 1;
                byte b = bArr[i3];
                int i6 = i5 + 1;
                byte b2 = bArr[i5];
                int i7 = i6 + 1;
                byte b3 = bArr[i6];
                int i8 = i7 + 1;
                byte b4 = bArr[i7];
                this.b -= 4;
                if (i8 == i4) {
                    this.d = stetho.c();
                    InspectorModulesProvider.c(stetho);
                } else {
                    stetho.b = i8;
                }
                i = ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
                i2 = b4 & 255;
            }
            return i | i2;
        }
        StringBuilder sb = new StringBuilder("size < 4: ");
        sb.append(this.b);
        throw new IllegalStateException(sb.toString());
    }

    public final setResponseContentType n(long j) {
        Stetho c = c(8);
        byte[] bArr = c.d;
        int i = c.c;
        int i2 = i + 1;
        bArr[i] = (byte) ((byte) ((int) ((j >>> 56) & 255)));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((byte) ((int) ((j >>> 48) & 255)));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((byte) ((int) ((j >>> 40) & 255)));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((byte) ((int) ((j >>> 32) & 255)));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((byte) ((int) ((j >>> 24) & 255)));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((byte) ((int) ((j >>> 16) & 255)));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((byte) ((int) ((j >>> 8) & 255)));
        bArr[i8] = (byte) ((byte) ((int) (j & 255)));
        c.c = i8 + 1;
        this.b += 8;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150 A[EDGE_INSN: B:53:0x0150->B:43:0x0150 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v60, types: [o.setResponseContentType] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [long] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [long] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Unknown variable types count: 4 */
    @Override // o.setTookMs
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long o() {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType.o():long");
    }

    /* renamed from: o */
    public final setResponseContentType m(long j) {
        if (j == 0) {
            return e(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        Stetho c = c(numberOfTrailingZeros);
        byte[] bArr = c.d;
        int i = c.c;
        for (int i2 = (c.c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = (byte) e[(int) (15 & j)];
            j >>>= 4;
        }
        c.c += numberOfTrailingZeros;
        this.b += (long) numberOfTrailingZeros;
        return this;
    }

    @Override // o.setTookMs
    public final short p() {
        return defaultDumperPluginsProvider.e(s());
    }

    @Override // o.setTookMs
    public final long q() {
        long j;
        long j2;
        if (this.b >= 8) {
            Stetho stetho = this.d;
            int i = stetho.b;
            int i2 = stetho.c;
            if (i2 - i < 8) {
                j = (((long) n()) & 4294967295L) << 32;
                j2 = 4294967295L & ((long) n());
            } else {
                byte[] bArr = stetho.d;
                int i3 = i + 1;
                long j3 = (long) bArr[i];
                int i4 = i3 + 1;
                long j4 = (long) bArr[i3];
                int i5 = i4 + 1;
                long j5 = (long) bArr[i4];
                int i6 = i5 + 1;
                long j6 = (long) bArr[i5];
                int i7 = i6 + 1;
                long j7 = (long) bArr[i6];
                int i8 = i7 + 1;
                long j8 = (long) bArr[i7];
                int i9 = i8 + 1;
                long j9 = (long) bArr[i8];
                int i10 = i9 + 1;
                long j10 = (long) bArr[i9];
                this.b -= 8;
                if (i10 == i2) {
                    this.d = stetho.c();
                    InspectorModulesProvider.c(stetho);
                } else {
                    stetho.b = i10;
                }
                j = j10 & 255;
                j2 = ((j9 & 255) << 8) | ((j3 & 255) << 56) | ((j4 & 255) << 48) | ((j5 & 255) << 40) | ((j6 & 255) << 32) | ((j7 & 255) << 24) | ((j8 & 255) << 16);
            }
            return j | j2;
        }
        StringBuilder sb = new StringBuilder("size < 8: ");
        sb.append(this.b);
        throw new IllegalStateException(sb.toString());
    }

    @Override // o.setTookMs
    public final String r() throws EOFException {
        return d(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        Stetho stetho = this.d;
        if (stetho == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), stetho.c - stetho.b);
        byteBuffer.put(stetho.d, stetho.b, min);
        stetho.b += min;
        this.b -= (long) min;
        if (stetho.b == stetho.c) {
            this.d = stetho.c();
            InspectorModulesProvider.c(stetho);
        }
        return min;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [long] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // o.defaultInspectorModulesProvider
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final long read(o.setResponseContentType r6, long r7) {
        /*
            r5 = this;
            r0 = r6
            if (r0 == 0) goto L_0x0050
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0033
            r0 = r5
            long r0 = r0.b
            r9 = r0
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001b
            r0 = -1
            return r0
        L_0x001b:
            r0 = r7
            r11 = r0
            r0 = r7
            r1 = r9
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0029
            r0 = r9
            r11 = r0
        L_0x0029:
            r0 = r6
            r1 = r5
            r2 = r11
            r0.write(r1, r2)
            r0 = r11
            return r0
        L_0x0033:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "byteCount < 0: "
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L_0x0050:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "sink == null"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setResponseContentType.read(o.setResponseContentType, long):long");
    }

    @Override // o.setTookMs
    public final short s() {
        int i;
        int i2;
        if (this.b >= 2) {
            Stetho stetho = this.d;
            int i3 = stetho.b;
            int i4 = stetho.c;
            if (i4 - i3 < 2) {
                i = (i() & 255) << 8;
                i2 = i() & 255;
            } else {
                byte[] bArr = stetho.d;
                int i5 = i3 + 1;
                byte b = bArr[i3];
                int i6 = i5 + 1;
                byte b2 = bArr[i5];
                this.b -= 2;
                if (i6 == i4) {
                    this.d = stetho.c();
                    InspectorModulesProvider.c(stetho);
                } else {
                    stetho.b = i6;
                }
                i = (b & 255) << 8;
                i2 = b2 & 255;
            }
            return (short) (i | i2);
        }
        StringBuilder sb = new StringBuilder("size < 2: ");
        sb.append(this.b);
        throw new IllegalStateException(sb.toString());
    }

    @Override // o.setTookMs
    public final String t() {
        try {
            return e(this.b, defaultDumperPluginsProvider.a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // o.defaultInspectorModulesProvider, o.initialize
    public final newInitializerBuilder timeout() {
        return newInitializerBuilder.NONE;
    }

    @Override // java.lang.Object
    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            int i = (int) j;
            return (i == 0 ? setResponseMessage.c : new initializeWithDefaults(this, i)).toString();
        }
        StringBuilder sb = new StringBuilder("size > Integer.MAX_VALUE: ");
        sb.append(this.b);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                Stetho c = c(1);
                int min = Math.min(i, 8192 - c.c);
                byteBuffer.get(c.d, c.c, min);
                i -= min;
                c.c += min;
            }
            this.b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // o.initialize
    public final void write(setResponseContentType setresponsecontenttype, long j) {
        Stetho stetho;
        if (setresponsecontenttype == null) {
            throw new IllegalArgumentException("source == null");
        } else if (setresponsecontenttype != this) {
            defaultDumperPluginsProvider.a(setresponsecontenttype.b, 0, j);
            while (j > 0) {
                int i = 0;
                if (j < ((long) (setresponsecontenttype.d.c - setresponsecontenttype.d.b))) {
                    Stetho stetho2 = this.d;
                    Stetho stetho3 = stetho2 != null ? stetho2.g : null;
                    if (stetho3 != null && stetho3.e) {
                        if ((((long) stetho3.c) + j) - ((long) (stetho3.i ? 0 : stetho3.b)) <= 8192) {
                            setresponsecontenttype.d.d(stetho3, (int) j);
                            setresponsecontenttype.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    Stetho stetho4 = setresponsecontenttype.d;
                    int i2 = (int) j;
                    if (i2 <= 0 || i2 > stetho4.c - stetho4.b) {
                        throw new IllegalArgumentException();
                    }
                    if (i2 >= 1024) {
                        stetho4.i = true;
                        stetho = new Stetho(stetho4.d, stetho4.b, stetho4.c, true, false);
                    } else {
                        stetho = InspectorModulesProvider.c();
                        System.arraycopy(stetho4.d, stetho4.b, stetho.d, 0, i2);
                    }
                    stetho.c = stetho.b + i2;
                    stetho4.b += i2;
                    Stetho stetho5 = stetho4.g;
                    stetho.g = stetho5;
                    stetho.a = stetho5.a;
                    stetho5.a.g = stetho;
                    stetho5.a = stetho;
                    setresponsecontenttype.d = stetho;
                }
                Stetho stetho6 = setresponsecontenttype.d;
                long j2 = (long) (stetho6.c - stetho6.b);
                setresponsecontenttype.d = stetho6.c();
                Stetho stetho7 = this.d;
                if (stetho7 == null) {
                    this.d = stetho6;
                    stetho6.g = stetho6;
                    stetho6.a = stetho6;
                } else {
                    Stetho stetho8 = stetho7.g;
                    stetho6.g = stetho8;
                    stetho6.a = stetho8.a;
                    stetho8.a.g = stetho6;
                    stetho8.a = stetho6;
                    Stetho stetho9 = stetho6.g;
                    if (stetho9 == stetho6) {
                        throw new IllegalStateException();
                    } else if (stetho9.e) {
                        int i3 = stetho6.c - stetho6.b;
                        int i4 = stetho9.c;
                        if (!stetho9.i) {
                            i = stetho9.b;
                        }
                        if (i3 <= (8192 - i4) + i) {
                            stetho6.d(stetho9, i3);
                            stetho6.c();
                            InspectorModulesProvider.c(stetho6);
                        }
                    }
                }
                setresponsecontenttype.b -= j2;
                this.b += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }
}
