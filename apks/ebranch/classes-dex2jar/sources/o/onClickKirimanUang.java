package o;

import com.bca.smartbranch.activity.PhotoCardActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/onClickKirimanUang.class */
public final class onClickKirimanUang {
    private static final String[] d = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] a = {"android.permission.CAMERA"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/onClickKirimanUang$read.class */
    public static final class read implements LogRedirector.Logger {
        private final WeakReference<PhotoCardActivity> a;

        private read(PhotoCardActivity photoCardActivity) {
            this.a = new WeakReference<>(photoCardActivity);
        }

        /* synthetic */ read(PhotoCardActivity photoCardActivity, byte b) {
            this(photoCardActivity);
        }

        public final void a() {
            PhotoCardActivity photoCardActivity = this.a.get();
            if (photoCardActivity != null) {
                setOnHierarchyChangeListener.a(photoCardActivity, onClickKirimanUang.d, 48);
            }
        }
    }

    public static void c(PhotoCardActivity photoCardActivity) {
        String[] strArr = d;
        if (Predicate.c(photoCardActivity, strArr)) {
            photoCardActivity.t();
        } else if (Predicate.b(photoCardActivity, strArr)) {
            PhotoCardActivity.a((LogRedirector.Logger) new read(photoCardActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(photoCardActivity, strArr, 48);
        }
    }

    public static void d(PhotoCardActivity photoCardActivity) {
        String[] strArr = a;
        if (Predicate.c(photoCardActivity, strArr)) {
            photoCardActivity.s();
        } else {
            setOnHierarchyChangeListener.a(photoCardActivity, strArr, 49);
        }
    }

    public static void d(PhotoCardActivity photoCardActivity, int i, int[] iArr) {
        if (i != 48) {
            if (i == 49 && Predicate.c(iArr)) {
                photoCardActivity.s();
            }
        } else if (Predicate.c(iArr)) {
            photoCardActivity.t();
        } else {
            photoCardActivity.finish();
        }
    }
}
