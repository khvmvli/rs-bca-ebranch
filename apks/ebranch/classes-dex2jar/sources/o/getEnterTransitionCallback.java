package o;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
/* loaded from: classes-dex2jar.jar:o/getEnterTransitionCallback.class */
public final class getEnterTransitionCallback {
    private final IconCompatParcelizer e;

    /* loaded from: classes-dex2jar.jar:o/getEnterTransitionCallback$IconCompatParcelizer.class */
    interface IconCompatParcelizer {
        Uri a();

        Object b();

        Uri c();

        ClipDescription d();

        void e();
    }

    /* loaded from: classes-dex2jar.jar:o/getEnterTransitionCallback$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer implements IconCompatParcelizer {
        final InputContentInfo b;

        RemoteActionCompatParcelizer(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.b = new InputContentInfo(uri, clipDescription, uri2);
        }

        RemoteActionCompatParcelizer(Object obj) {
            this.b = (InputContentInfo) obj;
        }

        @Override // o.getEnterTransitionCallback.IconCompatParcelizer
        public final Uri a() {
            return this.b.getLinkUri();
        }

        @Override // o.getEnterTransitionCallback.IconCompatParcelizer
        public final Object b() {
            return this.b;
        }

        @Override // o.getEnterTransitionCallback.IconCompatParcelizer
        public final Uri c() {
            return this.b.getContentUri();
        }

        @Override // o.getEnterTransitionCallback.IconCompatParcelizer
        public final ClipDescription d() {
            return this.b.getDescription();
        }

        @Override // o.getEnterTransitionCallback.IconCompatParcelizer
        public final void e() {
            this.b.requestPermission();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getEnterTransitionCallback$write.class */
    static final class write implements IconCompatParcelizer {
        private final Uri a;
        private final ClipDescription b;
        private final Uri c;

        write(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.c = uri;
            this.b = clipDescription;
            this.a = uri2;
        }

        @Override // o.getEnterTransitionCallback.IconCompatParcelizer
        public final Uri a() {
            return this.a;
        }

        @Override // o.getEnterTransitionCallback.IconCompatParcelizer
        public final Object b() {
            return null;
        }

        @Override // o.getEnterTransitionCallback.IconCompatParcelizer
        public final Uri c() {
            return this.c;
        }

        @Override // o.getEnterTransitionCallback.IconCompatParcelizer
        public final ClipDescription d() {
            return this.b;
        }

        @Override // o.getEnterTransitionCallback.IconCompatParcelizer
        public final void e() {
        }
    }

    public getEnterTransitionCallback(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.e = new RemoteActionCompatParcelizer(uri, clipDescription, uri2);
        } else {
            this.e = new write(uri, clipDescription, uri2);
        }
    }

    private getEnterTransitionCallback(IconCompatParcelizer iconCompatParcelizer) {
        this.e = iconCompatParcelizer;
    }

    public static getEnterTransitionCallback e(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new getEnterTransitionCallback(new RemoteActionCompatParcelizer(obj));
        }
        return null;
    }

    public final Uri a() {
        return this.e.c();
    }

    public final Uri b() {
        return this.e.a();
    }

    public final ClipDescription c() {
        return this.e.d();
    }

    public final void d() {
        this.e.e();
    }

    public final Object e() {
        return this.e.b();
    }
}
