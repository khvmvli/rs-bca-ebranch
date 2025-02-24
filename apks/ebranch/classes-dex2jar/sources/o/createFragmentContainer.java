package o;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
/* loaded from: classes-dex2jar.jar:o/createFragmentContainer.class */
public class createFragmentContainer {

    /* loaded from: classes-dex2jar.jar:o/createFragmentContainer$IconCompatParcelizer.class */
    public static class IconCompatParcelizer {
        private final int a;
        private final Uri b;
        private final int c;
        private final int d;
        private final boolean e;

        @Deprecated
        public IconCompatParcelizer(Uri uri, int i, int i2, boolean z, int i3) {
            this.b = uri;
            this.a = i;
            this.c = i2;
            this.e = z;
            this.d = i3;
        }

        public static IconCompatParcelizer c(Uri uri, int i, int i2, boolean z, int i3) {
            return new IconCompatParcelizer(uri, i, i2, z, i3);
        }

        public boolean a() {
            return this.e;
        }

        public int b() {
            return this.d;
        }

        public Uri c() {
            return this.b;
        }

        public int d() {
            return this.a;
        }

        public int e() {
            return this.c;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/createFragmentContainer$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer {
        private final int a;
        private final IconCompatParcelizer[] d;

        @Deprecated
        public RemoteActionCompatParcelizer(int i, IconCompatParcelizer[] iconCompatParcelizerArr) {
            this.a = i;
            this.d = iconCompatParcelizerArr;
        }

        public static RemoteActionCompatParcelizer b(int i, IconCompatParcelizer[] iconCompatParcelizerArr) {
            return new RemoteActionCompatParcelizer(i, iconCompatParcelizerArr);
        }

        public IconCompatParcelizer[] a() {
            return this.d;
        }

        public int e() {
            return this.a;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/createFragmentContainer$read.class */
    public static class read {
        public void c(int i) {
        }

        public void c(Typeface typeface) {
        }
    }

    public static Typeface e(Context context, access$100 access_100, int i, boolean z, int i2, Handler handler, read read2) {
        access$200 access_200 = new access$200(read2, handler);
        return z ? access$000.e(context, access_100, access_200, i, i2) : access$000.d(context, access_100, i, null, access_200);
    }
}
