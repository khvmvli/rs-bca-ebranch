package o;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import o.getCode;
/* loaded from: classes-dex2jar.jar:o/getEmergencyCloseEndDate.class */
public final class getEmergencyCloseEndDate<T> implements CategoryResponse$$Parcelable<T, Bitmap> {
    private final setValueArray b;
    private final getEmergencyCloseEndDate$MediaBrowserCompat$CustomActionResultReceiver e;
    private final write<T> i;
    public static final getCode<Long> d = getCode.c("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new getCode.read<Long>() { // from class: o.getEmergencyCloseEndDate.1
        private final ByteBuffer c = ByteBuffer.allocate(8);

        @Override // o.getCode.read
        public final /* synthetic */ void c(byte[] bArr, Long l, MessageDigest messageDigest) {
            Long l2 = l;
            messageDigest.update(bArr);
            synchronized (this.c) {
                this.c.position(0);
                messageDigest.update(this.c.putLong(l2.longValue()).array());
            }
        }
    });
    public static final getCode<Integer> a = getCode.c("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new getCode.read<Integer>() { // from class: o.getEmergencyCloseEndDate.5
        private final ByteBuffer c = ByteBuffer.allocate(4);

        @Override // o.getCode.read
        public final /* synthetic */ void c(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 != null) {
                messageDigest.update(bArr);
                synchronized (this.c) {
                    this.c.position(0);
                    messageDigest.update(this.c.putInt(num2.intValue()).array());
                }
            }
        }
    });
    private static final getEmergencyCloseEndDate$MediaBrowserCompat$CustomActionResultReceiver c = new getEmergencyCloseEndDate$MediaBrowserCompat$CustomActionResultReceiver();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getEmergencyCloseEndDate$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements write<ByteBuffer> {
        IconCompatParcelizer() {
        }

        @Override // o.getEmergencyCloseEndDate.write
        public final /* synthetic */ void d(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            final ByteBuffer byteBuffer2 = byteBuffer;
            mediaMetadataRetriever.setDataSource(new MediaDataSource() { // from class: o.getEmergencyCloseEndDate.IconCompatParcelizer.5
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }

                @Override // android.media.MediaDataSource
                public final long getSize() {
                    return (long) byteBuffer2.limit();
                }

                @Override // android.media.MediaDataSource
                public final int readAt(long j, byte[] bArr, int i, int i2) {
                    if (j >= ((long) byteBuffer2.limit())) {
                        return -1;
                    }
                    byteBuffer2.position((int) j);
                    int min = Math.min(i2, byteBuffer2.remaining());
                    byteBuffer2.get(bArr, i, min);
                    return min;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getEmergencyCloseEndDate$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements write<AssetFileDescriptor> {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        @Override // o.getEmergencyCloseEndDate.write
        public final /* synthetic */ void d(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getEmergencyCloseEndDate$read.class */
    public static final class read implements write<ParcelFileDescriptor> {
        read() {
        }

        @Override // o.getEmergencyCloseEndDate.write
        public final /* synthetic */ void d(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getEmergencyCloseEndDate$write.class */
    public interface write<T> {
        void d(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    private getEmergencyCloseEndDate(setValueArray setvaluearray, write<T> write2) {
        this(setvaluearray, write2, c);
    }

    private getEmergencyCloseEndDate(setValueArray setvaluearray, write<T> write2, getEmergencyCloseEndDate$MediaBrowserCompat$CustomActionResultReceiver getemergencycloseenddate_mediabrowsercompat_customactionresultreceiver) {
        this.b = setvaluearray;
        this.i = write2;
        this.e = getemergencycloseenddate_mediabrowsercompat_customactionresultreceiver;
    }

    public static CategoryResponse$$Parcelable<ByteBuffer, Bitmap> b(setValueArray setvaluearray) {
        return new getEmergencyCloseEndDate(setvaluearray, new IconCompatParcelizer());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
        if (r0 == 270) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r8, long r9, int r11, int r12, int r13, o.getCurrencyCode r14) {
        /*
            r0 = r8
            r1 = 18
            java.lang.String r0 = r0.extractMetadata(r1)     // Catch: all -> 0x006a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: all -> 0x006a
            r15 = r0
            r0 = r8
            r1 = 19
            java.lang.String r0 = r0.extractMetadata(r1)     // Catch: all -> 0x006a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: all -> 0x006a
            r16 = r0
            r0 = r8
            r1 = 24
            java.lang.String r0 = r0.extractMetadata(r1)     // Catch: all -> 0x006a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: all -> 0x006a
            r17 = r0
            r0 = r17
            r1 = 90
            if (r0 == r1) goto L_0x0038
            r0 = r15
            r18 = r0
            r0 = r16
            r19 = r0
            r0 = r17
            r1 = 270(0x10e, float:3.78E-43)
            if (r0 != r1) goto L_0x0040
        L_0x0038:
            r0 = r15
            r19 = r0
            r0 = r16
            r18 = r0
        L_0x0040:
            r0 = r14
            r1 = r18
            r2 = r19
            r3 = r12
            r4 = r13
            float r0 = r0.b(r1, r2, r3, r4)     // Catch: all -> 0x006a
            r20 = r0
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r18
            float r3 = (float) r3     // Catch: all -> 0x006a
            r4 = r20
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)     // Catch: all -> 0x006a
            r4 = r20
            r5 = r19
            float r5 = (float) r5     // Catch: all -> 0x006a
            float r4 = r4 * r5
            int r4 = java.lang.Math.round(r4)     // Catch: all -> 0x006a
            android.graphics.Bitmap r0 = r0.getScaledFrameAtTime(r1, r2, r3, r4)     // Catch: all -> 0x006a
            r8 = r0
            r0 = r8
            return r0
        L_0x006a:
            r8 = move-exception
            java.lang.String r0 = "VideoDecoder"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = "VideoDecoder"
            java.lang.String r1 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            r2 = r8
            int r0 = android.util.Log.d(r0, r1, r2)
        L_0x007d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEmergencyCloseEndDate.c(android.media.MediaMetadataRetriever, long, int, int, int, o.getCurrencyCode):android.graphics.Bitmap");
    }

    public static CategoryResponse$$Parcelable<AssetFileDescriptor, Bitmap> d(setValueArray setvaluearray) {
        return new getEmergencyCloseEndDate(setvaluearray, new RemoteActionCompatParcelizer((byte) 0));
    }

    public static CategoryResponse$$Parcelable<ParcelFileDescriptor, Bitmap> e(setValueArray setvaluearray) {
        return new getEmergencyCloseEndDate(setvaluearray, new read());
    }

    @Override // o.CategoryResponse$$Parcelable
    public final boolean a(T t, CategoryResponse categoryResponse) {
        return true;
    }

    /* JADX WARN: Finally extract failed */
    @Override // o.CategoryResponse$$Parcelable
    public final setIbanFlag<Bitmap> d(T t, int i, int i2, CategoryResponse categoryResponse) throws IOException {
        getCode<Long> getcode = d;
        long longValue = ((Long) (categoryResponse.c.containsKey(getcode) ? categoryResponse.c.get(getcode) : getcode.a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            getCode<Integer> getcode2 = a;
            Integer num = (Integer) (categoryResponse.c.containsKey(getcode2) ? categoryResponse.c.get(getcode2) : getcode2.a);
            Integer num2 = num;
            if (num == null) {
                num2 = 2;
            }
            getCode<getCurrencyCode> getcode3 = getCurrencyCode.f;
            getCurrencyCode getcurrencycode = (getCurrencyCode) (categoryResponse.c.containsKey(getcode3) ? categoryResponse.c.get(getcode3) : getcode3.a);
            getCurrencyCode getcurrencycode2 = getcurrencycode;
            if (getcurrencycode == null) {
                getcurrencycode2 = getCurrencyCode.e;
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.i.d(mediaMetadataRetriever, t);
                int intValue = num2.intValue();
                Bitmap c2 = (Build.VERSION.SDK_INT < 27 || i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || getcurrencycode2 == getCurrencyCode.j) ? null : c(mediaMetadataRetriever, longValue, intValue, i, i2, getcurrencycode2);
                Bitmap bitmap = c2;
                if (c2 == null) {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
                }
                if (bitmap != null) {
                    mediaMetadataRetriever.release();
                    setValueArray setvaluearray = this.b;
                    if (bitmap == null) {
                        return null;
                    }
                    return new setIndonesian(bitmap, setvaluearray);
                }
                throw new RuntimeException() { // from class: o.getEmergencyCloseEndDate$MediaBrowserCompat$SearchResultReceiver
                };
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        } else {
            StringBuilder sb = new StringBuilder("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            sb.append(longValue);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
