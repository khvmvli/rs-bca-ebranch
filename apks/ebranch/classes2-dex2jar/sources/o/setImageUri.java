package o;

import java.io.Serializable;
/* loaded from: classes2-dex2jar.jar:o/setImageUri.class */
public abstract class setImageUri {
    public static final read c = new read((byte) 0);
    private static final setImageUri d = clickOrangLain.c.d();

    /* loaded from: classes2-dex2jar.jar:o/setImageUri$read.class */
    public static final class read extends setImageUri implements Serializable {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        private final Object writeReplace() {
            return setImageUri$read$MediaBrowserCompat$CustomActionResultReceiver.a;
        }

        @Override // o.setImageUri
        public final int d() {
            return setImageUri.d.d();
        }

        @Override // o.setImageUri
        public final int d(int i) {
            return setImageUri.d.d(i);
        }
    }

    public int d() {
        return d(32);
    }

    public abstract int d(int i);
}
