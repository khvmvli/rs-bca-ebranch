package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.facebook.stetho.common.Utf8Charset;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import o.DetailTransactionResponse;
/* loaded from: classes-dex2jar.jar:com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser.class */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    static final byte[] a = "Exif����".getBytes(Charset.forName(Utf8Charset.NAME));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes-dex2jar.jar:com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader.class */
    public interface Reader {

        /* loaded from: classes-dex2jar.jar:com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException.class */
        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        long a(long j) throws IOException;

        short a() throws IOException;

        int d() throws IOException;

        int e(byte[] bArr, int i) throws IOException;
    }

    /* loaded from: classes-dex2jar.jar:com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        final ByteBuffer b;

        RemoteActionCompatParcelizer(byte[] bArr, int i) {
            this.b = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$write.class */
    static final class write implements Reader {
        private final InputStream d;

        write(InputStream inputStream) {
            this.d = inputStream;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3, types: [long] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r6v0, types: [long] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final long a(long r6) throws java.io.IOException {
            /*
                r5 = this;
                r0 = r6
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 >= 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                r0 = r6
                r8 = r0
            L_0x000a:
                r0 = r8
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r0 = r5
                java.io.InputStream r0 = r0.d
                r1 = r8
                long r0 = r0.skip(r1)
                r10 = r0
                r0 = r10
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0024
                goto L_0x0032
            L_0x0024:
                r0 = r5
                java.io.InputStream r0 = r0.d
                int r0 = r0.read()
                r1 = -1
                if (r0 == r1) goto L_0x003a
                r0 = 1
                r10 = r0
            L_0x0032:
                r0 = r8
                r1 = r10
                long r0 = r0 - r1
                r8 = r0
                goto L_0x000a
            L_0x003a:
                r0 = r6
                r1 = r8
                long r0 = r0 - r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.write.a(long):long");
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short a() throws IOException {
            int read = this.d.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int d() throws IOException {
            int read = this.d.read();
            if (read != -1) {
                short s = (short) read;
                int read2 = this.d.read();
                if (read2 != -1) {
                    return (s << 8) | ((short) read2);
                }
                throw new Reader.EndOfFileException();
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int e(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i3 < i) {
                i2 = this.d.read(bArr, i3, i - i3);
                i2 = i2;
                if (i2 == -1) {
                    break;
                }
                i3 += i2;
            }
            if (i3 != 0 || i2 != -1) {
                return i3;
            }
            throw new Reader.EndOfFileException();
        }
    }

    private static int b(Reader reader) throws IOException {
        short a2;
        int d;
        long j;
        long a3;
        do {
            short a4 = reader.a();
            if (a4 == 255) {
                a2 = reader.a();
                if (a2 == 218) {
                    return -1;
                }
                if (a2 != 217) {
                    d = reader.d() - 2;
                    if (a2 == 225) {
                        return d;
                    }
                    j = (long) d;
                    a3 = reader.a(j);
                } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                } else {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                    return -1;
                }
            } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                return -1;
            } else {
                StringBuilder sb = new StringBuilder("Unknown segmentId=");
                sb.append((int) a4);
                Log.d("DfltImageHeaderParser", sb.toString());
                return -1;
            }
        } while (a3 == j);
        if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
            return -1;
        }
        StringBuilder sb2 = new StringBuilder("Unable to skip enough data, type: ");
        sb2.append((int) a2);
        sb2.append(", wanted to skip: ");
        sb2.append(d);
        sb2.append(", but actually skipped: ");
        sb2.append(a3);
        Log.d("DfltImageHeaderParser", sb2.toString());
        return -1;
    }

    private int c(Reader reader, DetailTransactionResponse detailTransactionResponse) throws IOException {
        int i;
        try {
            int d = reader.d();
            if ((d & 65496) == 65496 || d == 19789 || d == 18761) {
                int b2 = b(reader);
                if (b2 != -1) {
                    byte[] bArr = (byte[]) detailTransactionResponse.b(b2, byte[].class);
                    int e = reader.e(bArr, b2);
                    if (e != b2) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb = new StringBuilder("Unable to read exif segment data, length: ");
                            sb.append(b2);
                            sb.append(", actually read: ");
                            sb.append(e);
                            Log.d("DfltImageHeaderParser", sb.toString());
                        }
                    } else if (c(bArr, b2)) {
                        i = e(new RemoteActionCompatParcelizer(bArr, b2));
                        detailTransactionResponse.e(bArr);
                        return i;
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                    }
                    i = -1;
                    detailTransactionResponse.e(bArr);
                    return i;
                } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                } else {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                return -1;
            } else {
                StringBuilder sb2 = new StringBuilder("Parser doesn't handle magic number: ");
                sb2.append(d);
                Log.d("DfltImageHeaderParser", sb2.toString());
                return -1;
            }
        } catch (Reader.EndOfFileException e2) {
            return -1;
        }
    }

    private static boolean c(byte[] bArr, int i) {
        boolean z = false;
        z = bArr != null && i > a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i2 >= bArr2.length || bArr[i2] != bArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return z;
    }

    private static int e(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        ByteOrder byteOrder;
        short s = -1;
        short s2 = remoteActionCompatParcelizer.b.remaining() - 6 >= 2 ? remoteActionCompatParcelizer.b.getShort(6) : -1;
        if (s2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (s2 != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder("Unknown endianness = ");
                sb.append((int) s2);
                Log.d("DfltImageHeaderParser", sb.toString());
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        remoteActionCompatParcelizer.b.order(byteOrder);
        int i = (remoteActionCompatParcelizer.b.remaining() - 10 >= 4 ? remoteActionCompatParcelizer.b.getInt(10) : -1) + 6;
        short s3 = remoteActionCompatParcelizer.b.remaining() - i >= 2 ? remoteActionCompatParcelizer.b.getShort(i) : -1;
        for (int i2 = 0; i2 < s3; i2++) {
            int i3 = i + 2 + (i2 * 12);
            short s4 = remoteActionCompatParcelizer.b.remaining() - i3 >= 2 ? remoteActionCompatParcelizer.b.getShort(i3) : -1;
            if (s4 == 274) {
                int i4 = i3 + 2;
                short s5 = remoteActionCompatParcelizer.b.remaining() - i4 >= 2 ? remoteActionCompatParcelizer.b.getShort(i4) : -1;
                if (s5 > 0 && s5 <= 12) {
                    int i5 = i3 + 4;
                    int i6 = remoteActionCompatParcelizer.b.remaining() - i5 >= 4 ? remoteActionCompatParcelizer.b.getInt(i5) : -1;
                    if (i6 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb2 = new StringBuilder("Got tagIndex=");
                            sb2.append(i2);
                            sb2.append(" tagType=");
                            sb2.append((int) s4);
                            sb2.append(" formatCode=");
                            sb2.append((int) s5);
                            sb2.append(" componentCount=");
                            sb2.append(i6);
                            Log.d("DfltImageHeaderParser", sb2.toString());
                        }
                        int i7 = i6 + b[s5];
                        if (i7 <= 4) {
                            int i8 = i3 + 8;
                            if (i8 < 0 || i8 > remoteActionCompatParcelizer.b.remaining()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb3 = new StringBuilder("Illegal tagValueOffset=");
                                    sb3.append(i8);
                                    sb3.append(" tagType=");
                                    sb3.append((int) s4);
                                    Log.d("DfltImageHeaderParser", sb3.toString());
                                }
                            } else if (i7 >= 0 && i7 + i8 <= remoteActionCompatParcelizer.b.remaining()) {
                                if (remoteActionCompatParcelizer.b.remaining() - i8 >= 2) {
                                    s = remoteActionCompatParcelizer.b.getShort(i8);
                                }
                                return s;
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sb4 = new StringBuilder("Illegal number of bytes for TI tag data tagType=");
                                sb4.append((int) s4);
                                Log.d("DfltImageHeaderParser", sb4.toString());
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb5 = new StringBuilder("Got byte count > 4, not orientation, continuing, formatCode=");
                            sb5.append((int) s5);
                            Log.d("DfltImageHeaderParser", sb5.toString());
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb6 = new StringBuilder("Got invalid format code = ");
                    sb6.append((int) s5);
                    Log.d("DfltImageHeaderParser", sb6.toString());
                }
            }
        }
        return -1;
    }

    private static ImageHeaderParser.ImageType e(Reader reader) throws IOException {
        try {
            int d = reader.d();
            if (d == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int a2 = (d << 8) | reader.a();
            if (a2 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int a3 = (a2 << 8) | reader.a();
            if (a3 == -1991225785) {
                reader.a(21);
                try {
                    return reader.a() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException e) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (a3 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                reader.a(4);
                if (((reader.d() << 16) | reader.d()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int d2 = (reader.d() << 16) | reader.d();
                if ((d2 & -256) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = d2 & 255;
                if (i == 88) {
                    reader.a(4);
                    return (reader.a() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else if (i != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                } else {
                    reader.a(4);
                    return (reader.a() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
            }
        } catch (Reader.EndOfFileException e2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(InputStream inputStream, DetailTransactionResponse detailTransactionResponse) throws IOException {
        if (inputStream != null) {
            write write2 = new write(inputStream);
            if (detailTransactionResponse != null) {
                return c(write2, detailTransactionResponse);
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            return e(new Reader(byteBuffer) { // from class: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$MediaBrowserCompat$CustomActionResultReceiver
                private final ByteBuffer b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.b = r4;
                    r4.order(ByteOrder.BIG_ENDIAN);
                }

                @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
                public final long a(long j) {
                    int min = (int) Math.min((long) this.b.remaining(), j);
                    ByteBuffer byteBuffer2 = this.b;
                    byteBuffer2.position(byteBuffer2.position() + min);
                    return (long) min;
                }

                @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
                public final short a() throws DefaultImageHeaderParser.Reader.EndOfFileException {
                    if (this.b.remaining() > 0) {
                        return (short) (this.b.get() & 255);
                    }
                    throw new DefaultImageHeaderParser.Reader.EndOfFileException();
                }

                @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
                public final int d() throws DefaultImageHeaderParser.Reader.EndOfFileException {
                    if (this.b.remaining() > 0) {
                        short s = (short) (this.b.get() & 255);
                        if (this.b.remaining() > 0) {
                            return (s << 8) | ((short) (this.b.get() & 255));
                        }
                        throw new DefaultImageHeaderParser.Reader.EndOfFileException();
                    }
                    throw new DefaultImageHeaderParser.Reader.EndOfFileException();
                }

                @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
                public final int e(byte[] bArr, int i) {
                    int min = Math.min(i, this.b.remaining());
                    if (min == 0) {
                        return -1;
                    }
                    this.b.get(bArr, 0, min);
                    return min;
                }
            });
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType c(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            return e(new write(inputStream));
        }
        throw new NullPointerException("Argument must not be null");
    }
}
