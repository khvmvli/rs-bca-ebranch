package o;

import android.content.res.AssetManager;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import io.realm.internal.Property;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
/* loaded from: classes-dex2jar.jar:o/getSharedElementTargetNames.class */
public final class getSharedElementTargetNames {
    private static final RemoteActionCompatParcelizer[] B;
    private static final RemoteActionCompatParcelizer[] C;
    private static SimpleDateFormat V;
    private static final Pattern Z;
    private static final Pattern ac;
    static final Charset b;
    static final byte[] g;
    static final RemoteActionCompatParcelizer[][] j;
    private static final RemoteActionCompatParcelizer[] p;
    private static final RemoteActionCompatParcelizer[] q;
    private static final byte[] r;
    private static final RemoteActionCompatParcelizer[] t;
    private static final RemoteActionCompatParcelizer[] u;
    private static final RemoteActionCompatParcelizer[] w;
    private static final RemoteActionCompatParcelizer[] x;
    private static final RemoteActionCompatParcelizer[] z;
    private boolean Y;
    private AssetManager.AssetInputStream aa;
    private int ad;
    private Set<Integer> ae;
    private String af;
    private final HashMap<String, read>[] ag;
    private ByteOrder ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private boolean al;
    private int am;
    private int an;
    private FileDescriptor ao;
    private int ap;
    private int aq;
    private int ar;
    private byte[] as;
    private int at;
    private int au;
    private int av;
    private boolean aw;

    /* renamed from: o  reason: collision with root package name */
    private static final boolean f159o = Log.isLoggable("ExifInterface", 3);
    private static final List<Integer> I = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> m = Arrays.asList(2, 7, 4, 5);
    public static final int[] e = {8, 8, 8};
    public static final int[] c = {4};
    public static final int[] a = {8};
    static final byte[] f = {-1, -40, -1};
    private static final byte[] s = {102, 116, 121, 112};
    private static final byte[] l = {109, 105, 102, 49};
    private static final byte[] k = {104, 101, 105, 99};
    private static final byte[] D = {79, 76, 89, 77, 80, 0};
    private static final byte[] A = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] F = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] G = {101, 88, 73, 102};
    private static final byte[] H = {73, 72, 68, 82};
    private static final byte[] E = {73, 69, 78, 68};
    private static final byte[] Q = {82, 73, 70, 70};
    private static final byte[] P = {87, 69, 66, 80};
    private static final byte[] N = {69, 88, 73, 70};
    private static final byte[] W = {-99, 1, 42};
    private static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] R = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] K = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] J = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] L = "ANMF".getBytes(Charset.defaultCharset());
    private static final byte[] S = "XMP ".getBytes(Charset.defaultCharset());
    static final String[] h = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] i = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] d = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final RemoteActionCompatParcelizer M = new RemoteActionCompatParcelizer("StripOffsets", 273, 3);
    private static final RemoteActionCompatParcelizer[] n = {new RemoteActionCompatParcelizer("SubIFDPointer", 330, 4), new RemoteActionCompatParcelizer("ExifIFDPointer", 34665, 4), new RemoteActionCompatParcelizer("GPSInfoIFDPointer", 34853, 4), new RemoteActionCompatParcelizer("InteroperabilityIFDPointer", 40965, 4), new RemoteActionCompatParcelizer("CameraSettingsIFDPointer", 8224, 1), new RemoteActionCompatParcelizer("ImageProcessingIFDPointer", 8256, 1)};
    private static final RemoteActionCompatParcelizer v = new RemoteActionCompatParcelizer("JPEGInterchangeFormat", 513, 4);
    private static final RemoteActionCompatParcelizer y = new RemoteActionCompatParcelizer("JPEGInterchangeFormatLength", 514, 4);
    private static final HashMap<Integer, RemoteActionCompatParcelizer>[] X = new HashMap[10];
    private static final HashMap<String, RemoteActionCompatParcelizer>[] U = new HashMap[10];
    private static final HashSet<String> ab = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
    private static final HashMap<Integer, Integer> T = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getSharedElementTargetNames$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends InputStream implements DataInput {
        private static final ByteOrder b = ByteOrder.LITTLE_ENDIAN;
        private static final ByteOrder c = ByteOrder.BIG_ENDIAN;
        final int a;
        ByteOrder d;
        int e;
        private DataInputStream i;

        public IconCompatParcelizer(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        private IconCompatParcelizer(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.d = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.i = dataInputStream;
            int available = dataInputStream.available();
            this.a = available;
            this.e = 0;
            this.i.mark(available);
            this.d = byteOrder;
        }

        public IconCompatParcelizer(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.i.available();
        }

        public final void c(long j) throws IOException {
            long j2 = (long) this.e;
            if (j2 > j) {
                this.e = 0;
                this.i.reset();
                this.i.mark(this.a);
            } else {
                j -= j2;
            }
            int i = (int) j;
            if (skipBytes(i) != i) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            this.e++;
            return this.i.read();
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.i.read(bArr, i, i2);
            this.e += read;
            return read;
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            this.e++;
            return this.i.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            int i = this.e + 1;
            this.e = i;
            if (i <= this.a) {
                int read = this.i.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            this.e += 2;
            return this.i.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            int length = this.e + bArr.length;
            this.e = length;
            if (length > this.a) {
                throw new EOFException();
            } else if (this.i.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.e + i2;
            this.e = i3;
            if (i3 > this.a) {
                throw new EOFException();
            } else if (this.i.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            int i = this.e + 4;
            this.e = i;
            if (i <= this.a) {
                int read = this.i.read();
                int read2 = this.i.read();
                int read3 = this.i.read();
                int read4 = this.i.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.d;
                    if (byteOrder == b) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == c) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder sb = new StringBuilder("Invalid byte order: ");
                    sb.append(this.d);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            int i = this.e + 8;
            this.e = i;
            if (i <= this.a) {
                int read = this.i.read();
                int read2 = this.i.read();
                int read3 = this.i.read();
                int read4 = this.i.read();
                int read5 = this.i.read();
                int read6 = this.i.read();
                int read7 = this.i.read();
                int read8 = this.i.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.d;
                    if (byteOrder == b) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == c) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder sb = new StringBuilder("Invalid byte order: ");
                    sb.append(this.d);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            int i = this.e + 2;
            this.e = i;
            if (i <= this.a) {
                int read = this.i.read();
                int read2 = this.i.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.d;
                    if (byteOrder == b) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == c) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder sb = new StringBuilder("Invalid byte order: ");
                    sb.append(this.d);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            this.e += 2;
            return this.i.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            this.e++;
            return this.i.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            int i = this.e + 2;
            this.e = i;
            if (i <= this.a) {
                int read = this.i.read();
                int read2 = this.i.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.d;
                    if (byteOrder == b) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == c) {
                        return (read << 8) + read2;
                    }
                    StringBuilder sb = new StringBuilder("Invalid byte order: ");
                    sb.append(this.d);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.a - this.e);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.i.skipBytes(min - i2);
            }
            this.e += i2;
            return i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getSharedElementTargetNames$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        RemoteActionCompatParcelizer(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.d = i2;
            this.c = -1;
        }

        RemoteActionCompatParcelizer(String str, int i, int i2, int i3) {
            this.b = str;
            this.a = i;
            this.d = 3;
            this.c = 4;
        }

        final boolean d(int i) {
            int i2;
            int i3 = this.d;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.c) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getSharedElementTargetNames$read.class */
    public static final class read {
        public final byte[] b;
        public final int c;
        public final long d;
        public final int e;

        read(int i, int i2, long j, byte[] bArr) {
            this.e = i;
            this.c = i2;
            this.d = j;
            this.b = bArr;
        }

        private read(int i, int i2, byte[] bArr) {
            this(i, i2, -1, bArr);
        }

        public static read a(long j, ByteOrder byteOrder) {
            return e(new long[]{j}, byteOrder);
        }

        public static read a(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[getSharedElementTargetNames.i[3]]);
            wrap.order(byteOrder);
            for (int i = 0; i <= 0; i++) {
                wrap.putShort((short) iArr[0]);
            }
            return new read(3, 1, wrap.array());
        }

        public static read e(int i, ByteOrder byteOrder) {
            return a(new int[]{i}, byteOrder);
        }

        public static read e(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append((char) 0);
            byte[] bytes = sb.toString().getBytes(getSharedElementTargetNames.b);
            return new read(2, bytes.length, bytes);
        }

        public static read e(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[getSharedElementTargetNames.i[4]]);
            wrap.order(byteOrder);
            for (int i = 0; i <= 0; i++) {
                wrap.putInt((int) jArr[0]);
            }
            return new read(4, 1, wrap.array());
        }

        public static read e(getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[] getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[getSharedElementTargetNames.i[5]]);
            wrap.order(byteOrder);
            for (int i = 0; i <= 0; i++) {
                getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiver = getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr[0];
                wrap.putInt((int) getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiver.c);
                wrap.putInt((int) getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiver.e);
            }
            return new read(5, 1, wrap.array());
        }

        public final String a(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d == null) {
                return null;
            }
            if (d instanceof String) {
                return (String) d;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            if (d instanceof long[]) {
                long[] jArr = (long[]) d;
                while (i4 < jArr.length) {
                    sb.append(jArr[i4]);
                    int i5 = i4 + 1;
                    i4 = i5;
                    if (i5 != jArr.length) {
                        sb.append(",");
                        i4 = i5;
                    }
                }
                return sb.toString();
            } else if (d instanceof int[]) {
                int[] iArr = (int[]) d;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    int i6 = i + 1;
                    i = i6;
                    if (i6 != iArr.length) {
                        sb.append(",");
                        i = i6;
                    }
                }
                return sb.toString();
            } else if (d instanceof double[]) {
                double[] dArr = (double[]) d;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    int i7 = i2 + 1;
                    i2 = i7;
                    if (i7 != dArr.length) {
                        sb.append(",");
                        i2 = i7;
                    }
                }
                return sb.toString();
            } else if (!(d instanceof getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[])) {
                return null;
            } else {
                getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[] getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr = (getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[]) d;
                while (i3 < getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr.length) {
                    sb.append(getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr[i3].c);
                    sb.append('/');
                    sb.append(getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr[i3].e);
                    int i8 = i3 + 1;
                    i3 = i8;
                    if (i8 != getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr.length) {
                        sb.append(",");
                        i3 = i8;
                    }
                }
                return sb.toString();
            }
        }

        final Object d(ByteOrder byteOrder) {
            Throwable th;
            InputStream inputStream;
            IOException e;
            IconCompatParcelizer iconCompatParcelizer;
            byte b;
            byte b2;
            try {
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(this.b);
                try {
                    iconCompatParcelizer2.d = byteOrder;
                    boolean z = true;
                    switch (this.e) {
                        case 1:
                        case 6:
                            byte[] bArr = this.b;
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                String str = new String(bArr, getSharedElementTargetNames.b);
                                try {
                                    iconCompatParcelizer2.close();
                                } catch (IOException e2) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                }
                                return str;
                            }
                            String str2 = new String(new char[]{(char) (b + 48)});
                            try {
                                iconCompatParcelizer2.close();
                            } catch (IOException e3) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                            }
                            return str2;
                        case 2:
                        case 7:
                            int i = 0;
                            if (this.c >= getSharedElementTargetNames.d.length) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < getSharedElementTargetNames.d.length) {
                                        if (this.b[i2] != getSharedElementTargetNames.d[i2]) {
                                            z = false;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                i = 0;
                                if (z) {
                                    i = getSharedElementTargetNames.d.length;
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (i < this.c && (b2 = this.b[i]) != 0) {
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                i++;
                            }
                            String obj = sb.toString();
                            try {
                                iconCompatParcelizer2.close();
                            } catch (IOException e4) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                            }
                            return obj;
                        case 3:
                            int[] iArr = new int[this.c];
                            for (int i3 = 0; i3 < this.c; i3++) {
                                iArr[i3] = iconCompatParcelizer2.readUnsignedShort();
                            }
                            try {
                                iconCompatParcelizer2.close();
                            } catch (IOException e5) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                            }
                            return iArr;
                        case 4:
                            long[] jArr = new long[this.c];
                            for (int i4 = 0; i4 < this.c; i4++) {
                                jArr[i4] = ((long) iconCompatParcelizer2.readInt()) & 4294967295L;
                            }
                            try {
                                iconCompatParcelizer2.close();
                            } catch (IOException e6) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                            }
                            return jArr;
                        case 5:
                            getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[] getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr = new getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[this.c];
                            for (int i5 = 0; i5 < this.c; i5++) {
                                getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr[i5] = new getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver(((long) iconCompatParcelizer2.readInt()) & 4294967295L, ((long) iconCompatParcelizer2.readInt()) & 4294967295L);
                            }
                            try {
                                iconCompatParcelizer2.close();
                            } catch (IOException e7) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                            }
                            return getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr;
                        case 8:
                            int[] iArr2 = new int[this.c];
                            for (int i6 = 0; i6 < this.c; i6++) {
                                iArr2[i6] = iconCompatParcelizer2.readShort();
                            }
                            try {
                                iconCompatParcelizer2.close();
                            } catch (IOException e8) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                            }
                            return iArr2;
                        case 9:
                            int[] iArr3 = new int[this.c];
                            for (int i7 = 0; i7 < this.c; i7++) {
                                iArr3[i7] = iconCompatParcelizer2.readInt();
                            }
                            try {
                                iconCompatParcelizer2.close();
                            } catch (IOException e9) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                            }
                            return iArr3;
                        case 10:
                            getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[] getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr2 = new getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[this.c];
                            for (int i8 = 0; i8 < this.c; i8++) {
                                getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr2[i8] = new getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver((long) iconCompatParcelizer2.readInt(), (long) iconCompatParcelizer2.readInt());
                            }
                            try {
                                iconCompatParcelizer2.close();
                            } catch (IOException e10) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                            }
                            return getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr2;
                        case 11:
                            double[] dArr = new double[this.c];
                            for (int i9 = 0; i9 < this.c; i9++) {
                                dArr[i9] = (double) iconCompatParcelizer2.readFloat();
                            }
                            try {
                                iconCompatParcelizer2.close();
                            } catch (IOException e11) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                            }
                            return dArr;
                        case 12:
                            double[] dArr2 = new double[this.c];
                            for (int i10 = 0; i10 < this.c; i10++) {
                                dArr2[i10] = iconCompatParcelizer2.readDouble();
                            }
                            try {
                                iconCompatParcelizer2.close();
                            } catch (IOException e12) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            }
                            return dArr2;
                        default:
                            try {
                                iconCompatParcelizer2.close();
                                return null;
                            } catch (IOException e13) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                return null;
                            }
                    }
                } catch (IOException e14) {
                    e = e14;
                    iconCompatParcelizer = iconCompatParcelizer2;
                    Log.w("ExifInterface", "IOException occurred during reading a value", e);
                    if (iconCompatParcelizer == null) {
                        return null;
                    }
                    try {
                        iconCompatParcelizer.close();
                        return null;
                    } catch (IOException e15) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        return null;
                    }
                }
            } catch (IOException e16) {
                e = e16;
                iconCompatParcelizer = null;
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e17) {
                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                    }
                }
                throw th;
            }
        }

        public final int e(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (d instanceof String) {
                return Integer.parseInt((String) d);
            } else {
                if (d instanceof long[]) {
                    long[] jArr = (long[]) d;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (d instanceof int[]) {
                    int[] iArr = (int[]) d;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(getSharedElementTargetNames.h[this.e]);
            sb.append(", data length:");
            sb.append(this.b.length);
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = {new RemoteActionCompatParcelizer("NewSubfileType", 254, 4), new RemoteActionCompatParcelizer("SubfileType", 255, 4), new RemoteActionCompatParcelizer("ImageWidth", Property.TYPE_SET, 3, 4), new RemoteActionCompatParcelizer("ImageLength", 257, 3, 4), new RemoteActionCompatParcelizer("BitsPerSample", 258, 3), new RemoteActionCompatParcelizer("Compression", 259, 3), new RemoteActionCompatParcelizer("PhotometricInterpretation", 262, 3), new RemoteActionCompatParcelizer("ImageDescription", 270, 2), new RemoteActionCompatParcelizer("Make", 271, 2), new RemoteActionCompatParcelizer("Model", 272, 2), new RemoteActionCompatParcelizer("StripOffsets", 273, 3, 4), new RemoteActionCompatParcelizer("Orientation", 274, 3), new RemoteActionCompatParcelizer("SamplesPerPixel", 277, 3), new RemoteActionCompatParcelizer("RowsPerStrip", 278, 3, 4), new RemoteActionCompatParcelizer("StripByteCounts", 279, 3, 4), new RemoteActionCompatParcelizer("XResolution", 282, 5), new RemoteActionCompatParcelizer("YResolution", 283, 5), new RemoteActionCompatParcelizer("PlanarConfiguration", 284, 3), new RemoteActionCompatParcelizer("ResolutionUnit", 296, 3), new RemoteActionCompatParcelizer("TransferFunction", 301, 3), new RemoteActionCompatParcelizer("Software", 305, 2), new RemoteActionCompatParcelizer("DateTime", 306, 2), new RemoteActionCompatParcelizer("Artist", 315, 2), new RemoteActionCompatParcelizer("WhitePoint", 318, 5), new RemoteActionCompatParcelizer("PrimaryChromaticities", 319, 5), new RemoteActionCompatParcelizer("SubIFDPointer", 330, 4), new RemoteActionCompatParcelizer("JPEGInterchangeFormat", 513, 4), new RemoteActionCompatParcelizer("JPEGInterchangeFormatLength", 514, 4), new RemoteActionCompatParcelizer("YCbCrCoefficients", 529, 5), new RemoteActionCompatParcelizer("YCbCrSubSampling", 530, 3), new RemoteActionCompatParcelizer("YCbCrPositioning", 531, 3), new RemoteActionCompatParcelizer("ReferenceBlackWhite", 532, 5), new RemoteActionCompatParcelizer("Copyright", 33432, 2), new RemoteActionCompatParcelizer("ExifIFDPointer", 34665, 4), new RemoteActionCompatParcelizer("GPSInfoIFDPointer", 34853, 4), new RemoteActionCompatParcelizer("SensorTopBorder", 4, 4), new RemoteActionCompatParcelizer("SensorLeftBorder", 5, 4), new RemoteActionCompatParcelizer("SensorBottomBorder", 6, 4), new RemoteActionCompatParcelizer("SensorRightBorder", 7, 4), new RemoteActionCompatParcelizer("ISO", 23, 3), new RemoteActionCompatParcelizer("JpgFromRaw", 46, 7), new RemoteActionCompatParcelizer("Xmp", 700, 1)};
        u = remoteActionCompatParcelizerArr;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr2 = {new RemoteActionCompatParcelizer("ExposureTime", 33434, 5), new RemoteActionCompatParcelizer("FNumber", 33437, 5), new RemoteActionCompatParcelizer("ExposureProgram", 34850, 3), new RemoteActionCompatParcelizer("SpectralSensitivity", 34852, 2), new RemoteActionCompatParcelizer("PhotographicSensitivity", 34855, 3), new RemoteActionCompatParcelizer("OECF", 34856, 7), new RemoteActionCompatParcelizer("SensitivityType", 34864, 3), new RemoteActionCompatParcelizer("StandardOutputSensitivity", 34865, 4), new RemoteActionCompatParcelizer("RecommendedExposureIndex", 34866, 4), new RemoteActionCompatParcelizer("ISOSpeed", 34867, 4), new RemoteActionCompatParcelizer("ISOSpeedLatitudeyyy", 34868, 4), new RemoteActionCompatParcelizer("ISOSpeedLatitudezzz", 34869, 4), new RemoteActionCompatParcelizer("ExifVersion", 36864, 2), new RemoteActionCompatParcelizer("DateTimeOriginal", 36867, 2), new RemoteActionCompatParcelizer("DateTimeDigitized", 36868, 2), new RemoteActionCompatParcelizer("OffsetTime", 36880, 2), new RemoteActionCompatParcelizer("OffsetTimeOriginal", 36881, 2), new RemoteActionCompatParcelizer("OffsetTimeDigitized", 36882, 2), new RemoteActionCompatParcelizer("ComponentsConfiguration", 37121, 7), new RemoteActionCompatParcelizer("CompressedBitsPerPixel", 37122, 5), new RemoteActionCompatParcelizer("ShutterSpeedValue", 37377, 10), new RemoteActionCompatParcelizer("ApertureValue", 37378, 5), new RemoteActionCompatParcelizer("BrightnessValue", 37379, 10), new RemoteActionCompatParcelizer("ExposureBiasValue", 37380, 10), new RemoteActionCompatParcelizer("MaxApertureValue", 37381, 5), new RemoteActionCompatParcelizer("SubjectDistance", 37382, 5), new RemoteActionCompatParcelizer("MeteringMode", 37383, 3), new RemoteActionCompatParcelizer("LightSource", 37384, 3), new RemoteActionCompatParcelizer("Flash", 37385, 3), new RemoteActionCompatParcelizer("FocalLength", 37386, 5), new RemoteActionCompatParcelizer("SubjectArea", 37396, 3), new RemoteActionCompatParcelizer("MakerNote", 37500, 7), new RemoteActionCompatParcelizer("UserComment", 37510, 7), new RemoteActionCompatParcelizer("SubSecTime", 37520, 2), new RemoteActionCompatParcelizer("SubSecTimeOriginal", 37521, 2), new RemoteActionCompatParcelizer("SubSecTimeDigitized", 37522, 2), new RemoteActionCompatParcelizer("FlashpixVersion", 40960, 7), new RemoteActionCompatParcelizer("ColorSpace", 40961, 3), new RemoteActionCompatParcelizer("PixelXDimension", 40962, 3, 4), new RemoteActionCompatParcelizer("PixelYDimension", 40963, 3, 4), new RemoteActionCompatParcelizer("RelatedSoundFile", 40964, 2), new RemoteActionCompatParcelizer("InteroperabilityIFDPointer", 40965, 4), new RemoteActionCompatParcelizer("FlashEnergy", 41483, 5), new RemoteActionCompatParcelizer("SpatialFrequencyResponse", 41484, 7), new RemoteActionCompatParcelizer("FocalPlaneXResolution", 41486, 5), new RemoteActionCompatParcelizer("FocalPlaneYResolution", 41487, 5), new RemoteActionCompatParcelizer("FocalPlaneResolutionUnit", 41488, 3), new RemoteActionCompatParcelizer("SubjectLocation", 41492, 3), new RemoteActionCompatParcelizer("ExposureIndex", 41493, 5), new RemoteActionCompatParcelizer("SensingMethod", 41495, 3), new RemoteActionCompatParcelizer("FileSource", 41728, 7), new RemoteActionCompatParcelizer("SceneType", 41729, 7), new RemoteActionCompatParcelizer("CFAPattern", 41730, 7), new RemoteActionCompatParcelizer("CustomRendered", 41985, 3), new RemoteActionCompatParcelizer("ExposureMode", 41986, 3), new RemoteActionCompatParcelizer("WhiteBalance", 41987, 3), new RemoteActionCompatParcelizer("DigitalZoomRatio", 41988, 5), new RemoteActionCompatParcelizer("FocalLengthIn35mmFilm", 41989, 3), new RemoteActionCompatParcelizer("SceneCaptureType", 41990, 3), new RemoteActionCompatParcelizer("GainControl", 41991, 3), new RemoteActionCompatParcelizer("Contrast", 41992, 3), new RemoteActionCompatParcelizer("Saturation", 41993, 3), new RemoteActionCompatParcelizer("Sharpness", 41994, 3), new RemoteActionCompatParcelizer("DeviceSettingDescription", 41995, 7), new RemoteActionCompatParcelizer("SubjectDistanceRange", 41996, 3), new RemoteActionCompatParcelizer("ImageUniqueID", 42016, 2), new RemoteActionCompatParcelizer("CameraOwnerName", 42032, 2), new RemoteActionCompatParcelizer("BodySerialNumber", 42033, 2), new RemoteActionCompatParcelizer("LensSpecification", 42034, 5), new RemoteActionCompatParcelizer("LensMake", 42035, 2), new RemoteActionCompatParcelizer("LensModel", 42036, 2), new RemoteActionCompatParcelizer("Gamma", 42240, 5), new RemoteActionCompatParcelizer("DNGVersion", 50706, 1), new RemoteActionCompatParcelizer("DefaultCropSize", 50720, 3, 4)};
        p = remoteActionCompatParcelizerArr2;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr3 = {new RemoteActionCompatParcelizer("GPSVersionID", 0, 1), new RemoteActionCompatParcelizer("GPSLatitudeRef", 1, 2), new RemoteActionCompatParcelizer("GPSLatitude", 2, 5), new RemoteActionCompatParcelizer("GPSLongitudeRef", 3, 2), new RemoteActionCompatParcelizer("GPSLongitude", 4, 5), new RemoteActionCompatParcelizer("GPSAltitudeRef", 5, 1), new RemoteActionCompatParcelizer("GPSAltitude", 6, 5), new RemoteActionCompatParcelizer("GPSTimeStamp", 7, 5), new RemoteActionCompatParcelizer("GPSSatellites", 8, 2), new RemoteActionCompatParcelizer("GPSStatus", 9, 2), new RemoteActionCompatParcelizer("GPSMeasureMode", 10, 2), new RemoteActionCompatParcelizer("GPSDOP", 11, 5), new RemoteActionCompatParcelizer("GPSSpeedRef", 12, 2), new RemoteActionCompatParcelizer("GPSSpeed", 13, 5), new RemoteActionCompatParcelizer("GPSTrackRef", 14, 2), new RemoteActionCompatParcelizer("GPSTrack", 15, 5), new RemoteActionCompatParcelizer("GPSImgDirectionRef", 16, 2), new RemoteActionCompatParcelizer("GPSImgDirection", 17, 5), new RemoteActionCompatParcelizer("GPSMapDatum", 18, 2), new RemoteActionCompatParcelizer("GPSDestLatitudeRef", 19, 2), new RemoteActionCompatParcelizer("GPSDestLatitude", 20, 5), new RemoteActionCompatParcelizer("GPSDestLongitudeRef", 21, 2), new RemoteActionCompatParcelizer("GPSDestLongitude", 22, 5), new RemoteActionCompatParcelizer("GPSDestBearingRef", 23, 2), new RemoteActionCompatParcelizer("GPSDestBearing", 24, 5), new RemoteActionCompatParcelizer("GPSDestDistanceRef", 25, 2), new RemoteActionCompatParcelizer("GPSDestDistance", 26, 5), new RemoteActionCompatParcelizer("GPSProcessingMethod", 27, 7), new RemoteActionCompatParcelizer("GPSAreaInformation", 28, 7), new RemoteActionCompatParcelizer("GPSDateStamp", 29, 2), new RemoteActionCompatParcelizer("GPSDifferential", 30, 3), new RemoteActionCompatParcelizer("GPSHPositioningError", 31, 5)};
        t = remoteActionCompatParcelizerArr3;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr4 = {new RemoteActionCompatParcelizer("InteroperabilityIndex", 1, 2)};
        q = remoteActionCompatParcelizerArr4;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr5 = {new RemoteActionCompatParcelizer("NewSubfileType", 254, 4), new RemoteActionCompatParcelizer("SubfileType", 255, 4), new RemoteActionCompatParcelizer("ThumbnailImageWidth", Property.TYPE_SET, 3, 4), new RemoteActionCompatParcelizer("ThumbnailImageLength", 257, 3, 4), new RemoteActionCompatParcelizer("BitsPerSample", 258, 3), new RemoteActionCompatParcelizer("Compression", 259, 3), new RemoteActionCompatParcelizer("PhotometricInterpretation", 262, 3), new RemoteActionCompatParcelizer("ImageDescription", 270, 2), new RemoteActionCompatParcelizer("Make", 271, 2), new RemoteActionCompatParcelizer("Model", 272, 2), new RemoteActionCompatParcelizer("StripOffsets", 273, 3, 4), new RemoteActionCompatParcelizer("ThumbnailOrientation", 274, 3), new RemoteActionCompatParcelizer("SamplesPerPixel", 277, 3), new RemoteActionCompatParcelizer("RowsPerStrip", 278, 3, 4), new RemoteActionCompatParcelizer("StripByteCounts", 279, 3, 4), new RemoteActionCompatParcelizer("XResolution", 282, 5), new RemoteActionCompatParcelizer("YResolution", 283, 5), new RemoteActionCompatParcelizer("PlanarConfiguration", 284, 3), new RemoteActionCompatParcelizer("ResolutionUnit", 296, 3), new RemoteActionCompatParcelizer("TransferFunction", 301, 3), new RemoteActionCompatParcelizer("Software", 305, 2), new RemoteActionCompatParcelizer("DateTime", 306, 2), new RemoteActionCompatParcelizer("Artist", 315, 2), new RemoteActionCompatParcelizer("WhitePoint", 318, 5), new RemoteActionCompatParcelizer("PrimaryChromaticities", 319, 5), new RemoteActionCompatParcelizer("SubIFDPointer", 330, 4), new RemoteActionCompatParcelizer("JPEGInterchangeFormat", 513, 4), new RemoteActionCompatParcelizer("JPEGInterchangeFormatLength", 514, 4), new RemoteActionCompatParcelizer("YCbCrCoefficients", 529, 5), new RemoteActionCompatParcelizer("YCbCrSubSampling", 530, 3), new RemoteActionCompatParcelizer("YCbCrPositioning", 531, 3), new RemoteActionCompatParcelizer("ReferenceBlackWhite", 532, 5), new RemoteActionCompatParcelizer("Copyright", 33432, 2), new RemoteActionCompatParcelizer("ExifIFDPointer", 34665, 4), new RemoteActionCompatParcelizer("GPSInfoIFDPointer", 34853, 4), new RemoteActionCompatParcelizer("DNGVersion", 50706, 1), new RemoteActionCompatParcelizer("DefaultCropSize", 50720, 3, 4)};
        w = remoteActionCompatParcelizerArr5;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr6 = {new RemoteActionCompatParcelizer("ThumbnailImage", Property.TYPE_SET, 7), new RemoteActionCompatParcelizer("CameraSettingsIFDPointer", 8224, 4), new RemoteActionCompatParcelizer("ImageProcessingIFDPointer", 8256, 4)};
        C = remoteActionCompatParcelizerArr6;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr7 = {new RemoteActionCompatParcelizer("PreviewImageStart", 257, 4), new RemoteActionCompatParcelizer("PreviewImageLength", 258, 4)};
        x = remoteActionCompatParcelizerArr7;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr8 = {new RemoteActionCompatParcelizer("AspectFrame", 4371, 3)};
        B = remoteActionCompatParcelizerArr8;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr9 = {new RemoteActionCompatParcelizer("ColorSpace", 55, 3)};
        z = remoteActionCompatParcelizerArr9;
        j = new RemoteActionCompatParcelizer[][]{remoteActionCompatParcelizerArr, remoteActionCompatParcelizerArr2, remoteActionCompatParcelizerArr3, remoteActionCompatParcelizerArr4, remoteActionCompatParcelizerArr5, remoteActionCompatParcelizerArr, remoteActionCompatParcelizerArr6, remoteActionCompatParcelizerArr7, remoteActionCompatParcelizerArr8, remoteActionCompatParcelizerArr9};
        Charset forName = Charset.forName("US-ASCII");
        b = forName;
        g = "Exif����".getBytes(forName);
        r = "http://ns.adobe.com/xap/1.0/��".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        V = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            RemoteActionCompatParcelizer[][] remoteActionCompatParcelizerArr10 = j;
            if (i2 < remoteActionCompatParcelizerArr10.length) {
                X[i2] = new HashMap<>();
                U[i2] = new HashMap<>();
                RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr11 = remoteActionCompatParcelizerArr10[i2];
                for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : remoteActionCompatParcelizerArr11) {
                    X[i2].put(Integer.valueOf(remoteActionCompatParcelizer.a), remoteActionCompatParcelizer);
                    U[i2].put(remoteActionCompatParcelizer.b, remoteActionCompatParcelizer);
                }
                i2++;
            } else {
                HashMap<Integer, Integer> hashMap = T;
                RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr12 = n;
                hashMap.put(Integer.valueOf(remoteActionCompatParcelizerArr12[0].a), 5);
                hashMap.put(Integer.valueOf(remoteActionCompatParcelizerArr12[1].a), 1);
                hashMap.put(Integer.valueOf(remoteActionCompatParcelizerArr12[2].a), 2);
                hashMap.put(Integer.valueOf(remoteActionCompatParcelizerArr12[3].a), 3);
                hashMap.put(Integer.valueOf(remoteActionCompatParcelizerArr12[4].a), 7);
                hashMap.put(Integer.valueOf(remoteActionCompatParcelizerArr12[5].a), 8);
                Z = Pattern.compile(".*[1-9].*");
                ac = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
        }
    }

    public getSharedElementTargetNames(InputStream inputStream) throws IOException {
        this(inputStream, false);
    }

    private getSharedElementTargetNames(InputStream inputStream, boolean z2) throws IOException {
        RemoteActionCompatParcelizer[][] remoteActionCompatParcelizerArr = j;
        this.ag = new HashMap[remoteActionCompatParcelizerArr.length];
        this.ae = new HashSet(remoteActionCompatParcelizerArr.length);
        this.ah = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.af = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.aa = (AssetManager.AssetInputStream) inputStream;
                this.ao = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (c(fileInputStream.getFD())) {
                        this.aa = null;
                        this.ao = fileInputStream.getFD();
                    }
                }
                this.aa = null;
                this.ao = null;
            }
            c(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    public getSharedElementTargetNames(String str) throws IOException {
        Throwable th;
        RemoteActionCompatParcelizer[][] remoteActionCompatParcelizerArr = j;
        this.ag = new HashMap[remoteActionCompatParcelizerArr.length];
        this.ae = new HashSet(remoteActionCompatParcelizerArr.length);
        this.ah = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        } else if (str != null) {
            FileInputStream fileInputStream = null;
            this.aa = null;
            this.af = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (c(fileInputStream2.getFD())) {
                        this.ao = fileInputStream2.getFD();
                    } else {
                        this.ao = null;
                    }
                    c(fileInputStream2);
                    b(fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    private read a(String str) {
        if (str != null) {
            String str2 = str;
            if ("ISOSpeedRatings".equals(str)) {
                if (f159o) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str2 = "PhotographicSensitivity";
            }
            for (int i2 = 0; i2 < j.length; i2++) {
                read read2 = this.ag[i2].get(str2);
                if (read2 != null) {
                    return read2;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    private void a(int i2, int i3) throws IOException {
        if (!this.ag[i2].isEmpty() && !this.ag[i3].isEmpty()) {
            read read2 = this.ag[i2].get("ImageLength");
            read read3 = this.ag[i2].get("ImageWidth");
            read read4 = this.ag[i3].get("ImageLength");
            read read5 = this.ag[i3].get("ImageWidth");
            if (read2 == null || read3 == null) {
                if (f159o) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (read4 != null && read5 != null) {
                int e2 = read2.e(this.ah);
                int e3 = read3.e(this.ah);
                int e4 = read4.e(this.ah);
                int e5 = read5.e(this.ah);
                if (e2 < e4 && e3 < e5) {
                    HashMap<String, read>[] hashMapArr = this.ag;
                    HashMap<String, read> hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            } else if (f159o) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f159o) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    private void a(IconCompatParcelizer iconCompatParcelizer) throws IOException {
        if (f159o) {
            StringBuilder sb = new StringBuilder("getPngAttributes starting with: ");
            sb.append(iconCompatParcelizer);
            Log.d("ExifInterface", sb.toString());
        }
        iconCompatParcelizer.d = ByteOrder.BIG_ENDIAN;
        byte[] bArr = F;
        iconCompatParcelizer.skipBytes(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = iconCompatParcelizer.readInt();
                byte[] bArr2 = new byte[4];
                if (iconCompatParcelizer.read(bArr2) == 4) {
                    int i2 = length + 4 + 4;
                    if (i2 == 16 && !Arrays.equals(bArr2, H)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, E)) {
                        if (Arrays.equals(bArr2, G)) {
                            byte[] bArr3 = new byte[readInt];
                            if (iconCompatParcelizer.read(bArr3) == readInt) {
                                int readInt2 = iconCompatParcelizer.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.ad = i2;
                                    a(bArr3, 0);
                                    d();
                                    return;
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                                sb2.append(readInt2);
                                sb2.append(", calculated CRC value: ");
                                sb2.append(crc32.getValue());
                                throw new IOException(sb2.toString());
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Failed to read given length for given PNG chunk type: ");
                            sb3.append(c(bArr2));
                            throw new IOException(sb3.toString());
                        }
                        int i3 = readInt + 4;
                        iconCompatParcelizer.skipBytes(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void a(IconCompatParcelizer iconCompatParcelizer, int i2) throws IOException {
        read read2;
        read read3 = this.ag[i2].get("ImageLength");
        read read4 = this.ag[i2].get("ImageWidth");
        if ((read3 == null || read4 == null) && (read2 = this.ag[i2].get("JPEGInterchangeFormat")) != null) {
            e(iconCompatParcelizer, read2.e(this.ah), i2);
        }
    }

    private void a(byte[] bArr, int i2) throws IOException {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(bArr);
        d(iconCompatParcelizer, bArr.length);
        c(iconCompatParcelizer, i2);
    }

    private boolean a(byte[] bArr) throws IOException {
        Throwable th;
        IconCompatParcelizer iconCompatParcelizer = null;
        IconCompatParcelizer iconCompatParcelizer2 = null;
        boolean z2 = false;
        try {
            iconCompatParcelizer2 = new IconCompatParcelizer(bArr);
            try {
                ByteOrder g2 = g(iconCompatParcelizer2);
                this.ah = g2;
                iconCompatParcelizer2.d = g2;
                if (iconCompatParcelizer2.readShort() == 85) {
                    z2 = true;
                }
                iconCompatParcelizer2.close();
                return z2;
            } catch (Exception e2) {
                iconCompatParcelizer = iconCompatParcelizer2;
                if (iconCompatParcelizer == null) {
                    return false;
                }
                iconCompatParcelizer.close();
                return false;
            } catch (Throwable th2) {
                th = th2;
                if (iconCompatParcelizer2 != null) {
                    iconCompatParcelizer2.close();
                }
                throw th;
            }
        } catch (Exception e3) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static long[] a(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    private static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
            }
        }
    }

    private void b(IconCompatParcelizer iconCompatParcelizer) throws IOException {
        read read2;
        d(iconCompatParcelizer, iconCompatParcelizer.available());
        c(iconCompatParcelizer, 0);
        e(iconCompatParcelizer, 0);
        e(iconCompatParcelizer, 5);
        e(iconCompatParcelizer, 4);
        d();
        if (this.am == 8 && (read2 = this.ag[1].get("MakerNote")) != null) {
            IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(read2.b);
            iconCompatParcelizer2.d = this.ah;
            iconCompatParcelizer2.c(6);
            c(iconCompatParcelizer2, 9);
            read read3 = this.ag[9].get("ColorSpace");
            if (read3 != null) {
                this.ag[1].put("ColorSpace", read3);
            }
        }
    }

    private boolean b(byte[] bArr) throws IOException {
        Throwable th;
        IconCompatParcelizer iconCompatParcelizer = null;
        iconCompatParcelizer = null;
        boolean z2 = false;
        try {
            iconCompatParcelizer = new IconCompatParcelizer(bArr);
        } catch (Exception e2) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder g2 = g(iconCompatParcelizer);
            this.ah = g2;
            iconCompatParcelizer.d = g2;
            short readShort = iconCompatParcelizer.readShort();
            if (readShort == 20306 || readShort == 21330) {
                z2 = true;
            }
            iconCompatParcelizer.close();
            return z2;
        } catch (Exception e3) {
            if (iconCompatParcelizer == null) {
                return false;
            }
            iconCompatParcelizer.close();
            return false;
        } catch (Throwable th3) {
            th = th3;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.close();
            }
            throw th;
        }
    }

    private static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(8);
        for (int i2 = 0; i2 < 4; i2++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i2])));
        }
        return sb.toString();
    }

    private void c() {
        String d2 = d("DateTimeOriginal");
        if (d2 != null && d("DateTime") == null) {
            this.ag[0].put("DateTime", read.e(d2));
        }
        if (d("ImageWidth") == null) {
            this.ag[0].put("ImageWidth", read.e(new long[]{0}, this.ah));
        }
        if (d("ImageLength") == null) {
            this.ag[0].put("ImageLength", read.e(new long[]{0}, this.ah));
        }
        if (d("Orientation") == null) {
            this.ag[0].put("Orientation", read.e(new long[]{0}, this.ah));
        }
        if (d("LightSource") == null) {
            this.ag[1].put("LightSource", read.e(new long[]{0}, this.ah));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x036e, code lost:
        if (r0 != 7) goto L_0x041d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03dc, code lost:
        if (java.util.Arrays.equals(r0, o.getSharedElementTargetNames.a) != false) goto L_0x03a7;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0406 A[Catch: IOException -> 0x0433, all -> 0x042f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0433, blocks: (B:5:0x0006, B:7:0x000e, B:9:0x0023, B:11:0x002a, B:12:0x003f, B:12:0x003f, B:13:0x0042, B:15:0x0051, B:16:0x0055, B:18:0x00a3, B:19:0x00ac, B:20:0x00b5, B:21:0x00bf, B:90:0x02d9, B:92:0x02e0, B:93:0x02e6, B:95:0x02e8, B:96:0x02f0, B:97:0x02f9, B:98:0x0302, B:99:0x030d, B:100:0x0316, B:102:0x033d, B:104:0x0352, B:111:0x0374, B:112:0x037e, B:114:0x038d, B:118:0x03ac, B:120:0x03b4, B:122:0x03c5, B:125:0x03d4, B:130:0x03e5, B:133:0x03f1, B:135:0x03f7, B:140:0x0406, B:141:0x0410, B:143:0x041e), top: B:163:0x0006, outer: #2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void c(java.io.InputStream r6) {
        /*
        // Method dump skipped, instructions count: 1142
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.c(java.io.InputStream):void");
    }

    private void c(IconCompatParcelizer iconCompatParcelizer) throws IOException {
        b(iconCompatParcelizer);
        if (this.ag[0].get("JpgFromRaw") != null) {
            e(iconCompatParcelizer, this.an, 5);
        }
        read read2 = this.ag[0].get("ISO");
        read read3 = this.ag[1].get("PhotographicSensitivity");
        if (read2 != null && read3 == null) {
            this.ag[1].put("PhotographicSensitivity", read2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0226  */
    /* JADX WARN: Type inference failed for: r0v256, types: [long] */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void c(o.getSharedElementTargetNames.IconCompatParcelizer r9, int r10) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1609
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.c(o.getSharedElementTargetNames$IconCompatParcelizer, int):void");
    }

    private void c(IconCompatParcelizer iconCompatParcelizer, HashMap hashMap) throws IOException {
        read read2 = (read) hashMap.get("JPEGInterchangeFormat");
        read read3 = (read) hashMap.get("JPEGInterchangeFormatLength");
        if (read2 != null && read3 != null) {
            int e2 = read2.e(this.ah);
            int e3 = read3.e(this.ah);
            int i2 = e2;
            if (this.am == 7) {
                i2 = e2 + this.aq;
            }
            int min = Math.min(e3, iconCompatParcelizer.a - i2);
            if (i2 > 0 && min > 0) {
                this.aj = true;
                int i3 = this.ad + i2;
                this.av = i3;
                this.at = min;
                if (this.af == null && this.aa == null && this.ao == null) {
                    byte[] bArr = new byte[min];
                    iconCompatParcelizer.c((long) i3);
                    iconCompatParcelizer.readFully(bArr);
                    this.as = bArr;
                }
            }
            if (f159o) {
                StringBuilder sb = new StringBuilder("Setting thumbnail attributes with offset: ");
                sb.append(i2);
                sb.append(", length: ");
                sb.append(min);
                Log.d("ExifInterface", sb.toString());
            }
        }
    }

    private static boolean c(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception e2) {
            if (!f159o) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private int d(BufferedInputStream bufferedInputStream) throws IOException {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f;
            z5 = true;
            if (i3 >= bArr2.length) {
                z2 = true;
                break;
            } else if (bArr[i3] != bArr2[i3]) {
                z2 = false;
                break;
            } else {
                i3++;
            }
        }
        if (z2) {
            return 4;
        }
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i4 = 0;
        while (true) {
            if (i4 >= bytes.length) {
                z3 = true;
                break;
            } else if (bArr[i4] != bytes[i4]) {
                z3 = false;
                break;
            } else {
                i4++;
            }
        }
        if (z3) {
            return 9;
        }
        if (d(bArr)) {
            return 12;
        }
        if (b(bArr)) {
            return 7;
        }
        if (a(bArr)) {
            return 10;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr3 = F;
            if (i5 >= bArr3.length) {
                z4 = true;
                break;
            } else if (bArr[i5] != bArr3[i5]) {
                z4 = false;
                break;
            } else {
                i5++;
            }
        }
        if (z4) {
            return 13;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr4 = Q;
            if (i6 >= bArr4.length) {
                int i7 = 0;
                while (true) {
                    byte[] bArr5 = P;
                    if (i7 >= bArr5.length) {
                        break;
                    } else if (bArr[Q.length + i7 + 4] != bArr5[i7]) {
                        break;
                    } else {
                        i7++;
                    }
                }
            } else if (bArr[i6] != bArr4[i6]) {
                break;
            } else {
                i6++;
            }
        }
        z5 = false;
        if (z5) {
            i2 = 14;
        }
        return i2;
    }

    private String d(String str) {
        double d2;
        read a2 = a(str);
        if (a2 == null) {
            return null;
        }
        if (!ab.contains(str)) {
            return a2.a(this.ah);
        }
        if (!str.equals("GPSTimeStamp")) {
            try {
                Object d3 = a2.d(this.ah);
                if (d3 != null) {
                    if (d3 instanceof String) {
                        d2 = Double.parseDouble((String) d3);
                    } else if (d3 instanceof long[]) {
                        long[] jArr = (long[]) d3;
                        if (jArr.length == 1) {
                            d2 = (double) jArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (d3 instanceof int[]) {
                        int[] iArr = (int[]) d3;
                        if (iArr.length == 1) {
                            d2 = (double) iArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (d3 instanceof double[]) {
                        double[] dArr = (double[]) d3;
                        if (dArr.length == 1) {
                            d2 = dArr[0];
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else if (d3 instanceof getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[]) {
                        getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[] getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr = (getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[]) d3;
                        if (getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr.length == 1) {
                            getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiver = getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr[0];
                            d2 = ((double) getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiver.c) / ((double) getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiver.e);
                        } else {
                            throw new NumberFormatException("There are more than one component");
                        }
                    } else {
                        throw new NumberFormatException("Couldn't find a double value");
                    }
                    return Double.toString(d2);
                }
                throw new NumberFormatException("NULL can't be converted to a double value");
            } catch (NumberFormatException e2) {
                return null;
            }
        } else if (a2.e == 5 || a2.e == 10) {
            getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[] getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr2 = (getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[]) a2.d(this.ah);
            if (getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr2 != null && getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr2.length == 3) {
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr2[0].c) / ((float) getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr2[0].e))), Integer.valueOf((int) (((float) getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr2[1].c) / ((float) getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr2[1].e))), Integer.valueOf((int) (((float) getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr2[2].c) / ((float) getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr2[2].e))));
            }
            StringBuilder sb = new StringBuilder("Invalid GPS Timestamp array. array=");
            sb.append(Arrays.toString(getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr2));
            Log.w("ExifInterface", sb.toString());
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder("GPS Timestamp format is not rational. format=");
            sb2.append(a2.e);
            Log.w("ExifInterface", sb2.toString());
            return null;
        }
    }

    private void d() throws IOException {
        a(0, 5);
        a(0, 4);
        a(5, 4);
        read read2 = this.ag[1].get("PixelXDimension");
        read read3 = this.ag[1].get("PixelYDimension");
        if (!(read2 == null || read3 == null)) {
            this.ag[0].put("ImageWidth", read2);
            this.ag[0].put("ImageLength", read3);
        }
        if (this.ag[4].isEmpty() && d(this.ag[5])) {
            HashMap<String, read>[] hashMapArr = this.ag;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!d(this.ag[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    private void d(IconCompatParcelizer iconCompatParcelizer) throws IOException {
        int i2;
        int i3;
        b(iconCompatParcelizer);
        read read2 = this.ag[1].get("MakerNote");
        if (read2 != null) {
            IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer(read2.b);
            iconCompatParcelizer2.d = this.ah;
            byte[] bArr = D;
            byte[] bArr2 = new byte[bArr.length];
            iconCompatParcelizer2.readFully(bArr2);
            iconCompatParcelizer2.c(0);
            byte[] bArr3 = A;
            byte[] bArr4 = new byte[bArr3.length];
            iconCompatParcelizer2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                iconCompatParcelizer2.c(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                iconCompatParcelizer2.c(12);
            }
            c(iconCompatParcelizer2, 6);
            read read3 = this.ag[7].get("PreviewImageStart");
            read read4 = this.ag[7].get("PreviewImageLength");
            if (!(read3 == null || read4 == null)) {
                this.ag[5].put("JPEGInterchangeFormat", read3);
                this.ag[5].put("JPEGInterchangeFormatLength", read4);
            }
            read read5 = this.ag[8].get("AspectFrame");
            if (read5 != null) {
                int[] iArr = (int[]) read5.d(this.ah);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder sb = new StringBuilder("Invalid aspect frame values. frame=");
                    sb.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                int i4 = iArr[2];
                int i5 = iArr[0];
                if (i4 > i5 && (i2 = iArr[3]) > (i3 = iArr[1])) {
                    int i6 = (i4 - i5) + 1;
                    int i7 = (i2 - i3) + 1;
                    int i8 = i6;
                    int i9 = i7;
                    if (i6 < i7) {
                        int i10 = i6 + i7;
                        i9 = i10 - i7;
                        i8 = i10 - i9;
                    }
                    read a2 = read.a(new int[]{i8}, this.ah);
                    read a3 = read.a(new int[]{i9}, this.ah);
                    this.ag[0].put("ImageWidth", a2);
                    this.ag[0].put("ImageLength", a3);
                }
            }
        }
    }

    private void d(IconCompatParcelizer iconCompatParcelizer, int i2) throws IOException {
        ByteOrder g2 = g(iconCompatParcelizer);
        this.ah = g2;
        iconCompatParcelizer.d = g2;
        int readUnsignedShort = iconCompatParcelizer.readUnsignedShort();
        int i3 = this.am;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = iconCompatParcelizer.readInt();
            if (readInt < 8 || readInt >= i2) {
                StringBuilder sb = new StringBuilder("Invalid first Ifd offset: ");
                sb.append(readInt);
                throw new IOException(sb.toString());
            }
            int i4 = readInt - 8;
            if (i4 > 0 && iconCompatParcelizer.skipBytes(i4) != i4) {
                StringBuilder sb2 = new StringBuilder("Couldn't jump to first Ifd: ");
                sb2.append(i4);
                throw new IOException(sb2.toString());
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Invalid start code: ");
        sb3.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(sb3.toString());
    }

    private void d(IconCompatParcelizer iconCompatParcelizer, HashMap hashMap) throws IOException {
        read read2 = (read) hashMap.get("StripOffsets");
        read read3 = (read) hashMap.get("StripByteCounts");
        if (read2 != null && read3 != null) {
            long[] a2 = a(read2.d(this.ah));
            long[] a3 = a(read3.d(this.ah));
            if (a2 == null || a2.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (a3 == null || a3.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (a2.length != a3.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j2 = 0;
                for (long j3 : a3) {
                    j2 += j3;
                }
                int i2 = (int) j2;
                byte[] bArr = new byte[i2];
                this.Y = true;
                this.al = true;
                this.aj = true;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < a2.length; i5++) {
                    int i6 = (int) a2[i5];
                    int i7 = (int) a3[i5];
                    if (i5 < a2.length - 1 && ((long) (i6 + i7)) != a2[i5 + 1]) {
                        this.Y = false;
                    }
                    int i8 = i6 - i4;
                    if (i8 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                    }
                    iconCompatParcelizer.c((long) i8);
                    byte[] bArr2 = new byte[i7];
                    iconCompatParcelizer.read(bArr2);
                    i4 = i4 + i8 + i7;
                    System.arraycopy(bArr2, 0, bArr, i3, i7);
                    i3 += i7;
                }
                this.as = bArr;
                if (this.Y) {
                    this.av = ((int) a2[0]) + this.ad;
                    this.at = i2;
                }
            }
        }
    }

    private boolean d(HashMap hashMap) throws IOException {
        read read2 = (read) hashMap.get("ImageLength");
        read read3 = (read) hashMap.get("ImageWidth");
        if (read2 == null || read3 == null) {
            return false;
        }
        return read2.e(this.ah) <= 512 && read3.e(this.ah) <= 512;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v84, types: [long] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static boolean d(byte[] r7) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 365
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.d(byte[]):boolean");
    }

    private void e() {
        for (int i2 = 0; i2 < this.ag.length; i2++) {
            StringBuilder sb = new StringBuilder("The size of tag group[");
            sb.append(i2);
            sb.append("]: ");
            sb.append(this.ag[i2].size());
            Log.d("ExifInterface", sb.toString());
            for (Map.Entry<String, read> entry : this.ag[i2].entrySet()) {
                read value = entry.getValue();
                StringBuilder sb2 = new StringBuilder("tagName: ");
                sb2.append(entry.getKey());
                sb2.append(", tagType: ");
                sb2.append(value.toString());
                sb2.append(", tagValue: '");
                sb2.append(value.a(this.ah));
                sb2.append("'");
                Log.d("ExifInterface", sb2.toString());
            }
        }
    }

    private void e(IconCompatParcelizer iconCompatParcelizer) throws IOException {
        iconCompatParcelizer.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        iconCompatParcelizer.read(bArr);
        iconCompatParcelizer.skipBytes(4);
        iconCompatParcelizer.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        e(iconCompatParcelizer, i2, 5);
        iconCompatParcelizer.c((long) i3);
        iconCompatParcelizer.d = ByteOrder.BIG_ENDIAN;
        int readInt = iconCompatParcelizer.readInt();
        if (f159o) {
            StringBuilder sb = new StringBuilder("numberOfDirectoryEntry: ");
            sb.append(readInt);
            Log.d("ExifInterface", sb.toString());
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = iconCompatParcelizer.readUnsignedShort();
            int readUnsignedShort2 = iconCompatParcelizer.readUnsignedShort();
            if (readUnsignedShort == M.a) {
                short readShort = iconCompatParcelizer.readShort();
                short readShort2 = iconCompatParcelizer.readShort();
                read e2 = read.e(readShort, this.ah);
                read e3 = read.e(readShort2, this.ah);
                this.ag[0].put("ImageLength", e2);
                this.ag[0].put("ImageWidth", e3);
                if (f159o) {
                    StringBuilder sb2 = new StringBuilder("Updated to length: ");
                    sb2.append((int) readShort);
                    sb2.append(", width: ");
                    sb2.append((int) readShort2);
                    Log.d("ExifInterface", sb2.toString());
                    return;
                }
                return;
            }
            iconCompatParcelizer.skipBytes(readUnsignedShort2);
        }
    }

    private void e(IconCompatParcelizer iconCompatParcelizer, int i2) throws IOException {
        read read2;
        read read3;
        read read4 = this.ag[i2].get("DefaultCropSize");
        read read5 = this.ag[i2].get("SensorTopBorder");
        read read6 = this.ag[i2].get("SensorLeftBorder");
        read read7 = this.ag[i2].get("SensorBottomBorder");
        read read8 = this.ag[i2].get("SensorRightBorder");
        if (read4 != null) {
            if (read4.e == 5) {
                getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[] getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr = (getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[]) read4.d(this.ah);
                if (getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr == null || getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr.length != 2) {
                    StringBuilder sb = new StringBuilder("Invalid crop size values. cropSize=");
                    sb.append(Arrays.toString(getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr));
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                read2 = read.e(new getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[]{getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr[0]}, this.ah);
                read3 = read.e(new getSharedElementTargetNames$MediaBrowserCompat$CustomActionResultReceiver[]{getsharedelementtargetnames_mediabrowsercompat_customactionresultreceiverArr[1]}, this.ah);
            } else {
                int[] iArr = (int[]) read4.d(this.ah);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder sb2 = new StringBuilder("Invalid crop size values. cropSize=");
                    sb2.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", sb2.toString());
                    return;
                }
                read2 = read.e(iArr[0], this.ah);
                read3 = read.e(iArr[1], this.ah);
            }
            this.ag[i2].put("ImageWidth", read2);
            this.ag[i2].put("ImageLength", read3);
        } else if (read5 == null || read6 == null || read7 == null || read8 == null) {
            a(iconCompatParcelizer, i2);
        } else {
            int e2 = read5.e(this.ah);
            int e3 = read7.e(this.ah);
            int e4 = read8.e(this.ah);
            int e5 = read6.e(this.ah);
            if (e3 > e2 && e4 > e5) {
                read e6 = read.e(e3 - e2, this.ah);
                read e7 = read.e(e4 - e5, this.ah);
                this.ag[i2].put("ImageLength", e6);
                this.ag[i2].put("ImageWidth", e7);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x02ef, code lost:
        r11.d = r10.ah;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02f7, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0182 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void e(o.getSharedElementTargetNames.IconCompatParcelizer r11, int r12, int r13) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 871
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSharedElementTargetNames.e(o.getSharedElementTargetNames$IconCompatParcelizer, int, int):void");
    }

    private static boolean e(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private void f(IconCompatParcelizer iconCompatParcelizer) throws IOException {
        if (f159o) {
            StringBuilder sb = new StringBuilder("getWebpAttributes starting with: ");
            sb.append(iconCompatParcelizer);
            Log.d("ExifInterface", sb.toString());
        }
        iconCompatParcelizer.d = ByteOrder.LITTLE_ENDIAN;
        iconCompatParcelizer.skipBytes(Q.length);
        int readInt = iconCompatParcelizer.readInt() + 8;
        int skipBytes = iconCompatParcelizer.skipBytes(P.length);
        int i2 = 8;
        while (true) {
            try {
                int i3 = skipBytes + i2;
                byte[] bArr = new byte[4];
                if (iconCompatParcelizer.read(bArr) == 4) {
                    int readInt2 = iconCompatParcelizer.readInt();
                    int i4 = i3 + 4 + 4;
                    if (Arrays.equals(N, bArr)) {
                        byte[] bArr2 = new byte[readInt2];
                        if (iconCompatParcelizer.read(bArr2) == readInt2) {
                            this.ad = i4;
                            a(bArr2, 0);
                            this.ad = i4;
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to read given length for given PNG chunk type: ");
                        sb2.append(c(bArr));
                        throw new IOException(sb2.toString());
                    }
                    int i5 = readInt2;
                    if (readInt2 % 2 == 1) {
                        i5 = readInt2 + 1;
                    }
                    int i6 = i4 + i5;
                    if (i6 != readInt) {
                        if (i6 <= readInt) {
                            int skipBytes2 = iconCompatParcelizer.skipBytes(i5);
                            if (skipBytes2 == i5) {
                                skipBytes = i4;
                                i2 = skipBytes2;
                            } else {
                                throw new IOException("Encountered WebP file with invalid chunk size");
                            }
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static ByteOrder g(IconCompatParcelizer iconCompatParcelizer) throws IOException {
        short readShort = iconCompatParcelizer.readShort();
        if (readShort == 18761) {
            if (f159o) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f159o) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder sb = new StringBuilder("Invalid byte order: ");
            sb.append(Integer.toHexString(readShort));
            throw new IOException(sb.toString());
        }
    }

    public final int b(String str, int i2) {
        read a2 = a(str);
        if (a2 == null) {
            return i2;
        }
        try {
            return a2.e(this.ah);
        } catch (NumberFormatException e2) {
            return i2;
        }
    }
}
