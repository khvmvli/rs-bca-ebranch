package o;

import o.getCurrencyCode;
/* loaded from: classes-dex2jar.jar:o/getCurrencyCode.class */
public abstract class getCurrencyCode {
    public static final getCurrencyCode d;
    public static final getCurrencyCode e;
    public static final getCode<getCurrencyCode> f;
    public static final getCurrencyCode b = new IconCompatParcelizer();
    public static final getCurrencyCode c = new getCurrencyCode() { // from class: o.getCurrencyCode$MediaBrowserCompat$CustomActionResultReceiver
        @Override // o.getCurrencyCode
        public final getCurrencyCode.MediaMetadataCompat a(int i2, int i3, int i4, int i5) {
            return getCurrencyCode.MediaMetadataCompat.MEMORY;
        }

        @Override // o.getCurrencyCode
        public final float b(int i2, int i3, int i4, int i5) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i3) / ((float) i5), ((float) i2) / ((float) i4)));
            int i6 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i6 = 0;
            }
            return 1.0f / ((float) (max << i6));
        }
    };
    public static final getCurrencyCode g = new write();
    public static final getCurrencyCode a = new read();
    public static final getCurrencyCode j = new MediaDescriptionCompat();
    static final boolean i = true;

    /* loaded from: classes-dex2jar.jar:o/getCurrencyCode$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends getCurrencyCode {
        IconCompatParcelizer() {
        }

        @Override // o.getCurrencyCode
        public final MediaMetadataCompat a(int i, int i2, int i3, int i4) {
            return MediaMetadataCompat.QUALITY;
        }

        @Override // o.getCurrencyCode
        public final float b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            float f = 1.0f;
            if (min != 0) {
                f = 1.0f / ((float) Integer.highestOneBit(min));
            }
            return f;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getCurrencyCode$MediaDescriptionCompat.class */
    static final class MediaDescriptionCompat extends getCurrencyCode {
        MediaDescriptionCompat() {
        }

        @Override // o.getCurrencyCode
        public final MediaMetadataCompat a(int i, int i2, int i3, int i4) {
            return MediaMetadataCompat.QUALITY;
        }

        @Override // o.getCurrencyCode
        public final float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getCurrencyCode$MediaMetadataCompat.class */
    public enum MediaMetadataCompat {
        MEMORY,
        QUALITY
    }

    /* loaded from: classes-dex2jar.jar:o/getCurrencyCode$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends getCurrencyCode {
        RemoteActionCompatParcelizer() {
        }

        @Override // o.getCurrencyCode
        public final MediaMetadataCompat a(int i, int i2, int i3, int i4) {
            return MediaMetadataCompat.QUALITY;
        }

        @Override // o.getCurrencyCode
        public final float b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getCurrencyCode$read.class */
    static final class read extends getCurrencyCode {
        read() {
        }

        @Override // o.getCurrencyCode
        public final MediaMetadataCompat a(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, g.b(i, i2, i3, i4)) == 1.0f ? MediaMetadataCompat.QUALITY : g.a(i, i2, i3, i4);
        }

        @Override // o.getCurrencyCode
        public final float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, g.b(i, i2, i3, i4));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getCurrencyCode$write.class */
    static final class write extends getCurrencyCode {
        write() {
        }

        @Override // o.getCurrencyCode
        public final MediaMetadataCompat a(int i, int i2, int i3, int i4) {
            return i ? MediaMetadataCompat.QUALITY : MediaMetadataCompat.MEMORY;
        }

        @Override // o.getCurrencyCode
        public final float b(int i, int i2, int i3, int i4) {
            if (i) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            float f = 1.0f;
            if (max != 0) {
                f = 1.0f / ((float) Integer.highestOneBit(max));
            }
            return f;
        }
    }

    static {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        d = remoteActionCompatParcelizer;
        e = remoteActionCompatParcelizer;
        f = getCode.c("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", remoteActionCompatParcelizer);
    }

    public abstract MediaMetadataCompat a(int i2, int i3, int i4, int i5);

    public abstract float b(int i2, int i3, int i4, int i5);
}
