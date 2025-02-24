package o;

import java.util.Locale;
/* loaded from: classes-dex2jar.jar:o/getTheme.class */
public final class getTheme {
    public static final isCancelable c = new read(null, false) { // from class: o.getTheme$MediaBrowserCompat$CustomActionResultReceiver
        private final boolean b;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.b = r5;
        }

        @Override // o.getTheme.read
        protected boolean c() {
            return this.b;
        }
    };
    public static final isCancelable g = new read(null, true) { // from class: o.getTheme$MediaBrowserCompat$CustomActionResultReceiver
        private final boolean b;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.b = r5;
        }

        @Override // o.getTheme.read
        protected boolean c() {
            return this.b;
        }
    };
    public static final isCancelable a = new read(write.e, false) { // from class: o.getTheme$MediaBrowserCompat$CustomActionResultReceiver
        private final boolean b;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.b = r5;
        }

        @Override // o.getTheme.read
        protected boolean c() {
            return this.b;
        }
    };
    public static final isCancelable e = new read(write.e, true) { // from class: o.getTheme$MediaBrowserCompat$CustomActionResultReceiver
        private final boolean b;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.b = r5;
        }

        @Override // o.getTheme.read
        protected boolean c() {
            return this.b;
        }
    };
    public static final isCancelable d = new read(IconCompatParcelizer.d, false) { // from class: o.getTheme$MediaBrowserCompat$CustomActionResultReceiver
        private final boolean b;

        /* JADX INFO: Access modifiers changed from: package-private */
        {
            this.b = r5;
        }

        @Override // o.getTheme.read
        protected boolean c() {
            return this.b;
        }
    };
    public static final isCancelable b = MediaDescriptionCompat.d;

    /* loaded from: classes-dex2jar.jar:o/getTheme$IconCompatParcelizer.class */
    static class IconCompatParcelizer implements RemoteActionCompatParcelizer {
        static final IconCompatParcelizer d = new IconCompatParcelizer(true);
        private final boolean b;

        private IconCompatParcelizer(boolean z) {
            this.b = z;
        }

        @Override // o.getTheme.RemoteActionCompatParcelizer
        public int d(CharSequence charSequence, int i, int i2) {
            boolean z = false;
            for (int i3 = i; i3 < i2 + i; i3++) {
                int e = getTheme.e(Character.getDirectionality(charSequence.charAt(i3)));
                if (e != 0) {
                    if (e != 1) {
                        continue;
                    } else if (!this.b) {
                        return 1;
                    }
                } else if (this.b) {
                    return 0;
                }
                z = true;
            }
            if (z) {
                return this.b ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getTheme$MediaDescriptionCompat.class */
    static class MediaDescriptionCompat extends read {
        static final MediaDescriptionCompat d = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
            super(null);
        }

        @Override // o.getTheme.read
        protected boolean c() {
            boolean z = true;
            if (onCreate.a(Locale.getDefault()) != 1) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getTheme$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        int d(CharSequence charSequence, int i, int i2);
    }

    /* loaded from: classes-dex2jar.jar:o/getTheme$read.class */
    public static abstract class read implements isCancelable {
        private final RemoteActionCompatParcelizer d;

        public read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.d = remoteActionCompatParcelizer;
        }

        private boolean e(CharSequence charSequence, int i, int i2) {
            int d = this.d.d(charSequence, i, i2);
            if (d == 0) {
                return true;
            }
            if (d != 1) {
                return c();
            }
            return false;
        }

        protected abstract boolean c();

        @Override // o.isCancelable
        public boolean d(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.d == null ? c() : e(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getTheme$write.class */
    static class write implements RemoteActionCompatParcelizer {
        static final write e = new write();

        private write() {
        }

        @Override // o.getTheme.RemoteActionCompatParcelizer
        public int d(CharSequence charSequence, int i, int i2) {
            int i3 = 2;
            for (int i4 = i; i4 < i2 + i && i3 == 2; i4++) {
                i3 = getTheme.b(Character.getDirectionality(charSequence.charAt(i4)));
            }
            return i3;
        }
    }

    static int b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1 || i == 2) {
            return 0;
        }
        switch (i) {
            case 14:
            case 15:
                return 1;
            case 16:
            case 17:
                return 0;
            default:
                return 2;
        }
    }

    static int e(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }
}
