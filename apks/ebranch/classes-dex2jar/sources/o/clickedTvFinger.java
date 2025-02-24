package o;

import com.bca.smartbranch.activity.OpenCCSuccessActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/clickedTvFinger.class */
public final class clickedTvFinger {
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] d = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/clickedTvFinger$read.class */
    public static final class read implements LogRedirector.Logger {
        private final WeakReference<OpenCCSuccessActivity> e;

        private read(OpenCCSuccessActivity openCCSuccessActivity) {
            this.e = new WeakReference<>(openCCSuccessActivity);
        }

        /* synthetic */ read(OpenCCSuccessActivity openCCSuccessActivity, byte b) {
            this(openCCSuccessActivity);
        }

        public final void a() {
            OpenCCSuccessActivity openCCSuccessActivity = this.e.get();
            if (openCCSuccessActivity != null) {
                setOnHierarchyChangeListener.a(openCCSuccessActivity, clickedTvFinger.e, 46);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/clickedTvFinger$write.class */
    public static final class write implements LogRedirector.Logger {
        private final WeakReference<OpenCCSuccessActivity> a;

        private write(OpenCCSuccessActivity openCCSuccessActivity) {
            this.a = new WeakReference<>(openCCSuccessActivity);
        }

        /* synthetic */ write(OpenCCSuccessActivity openCCSuccessActivity, byte b) {
            this(openCCSuccessActivity);
        }

        public final void a() {
            OpenCCSuccessActivity openCCSuccessActivity = this.a.get();
            if (openCCSuccessActivity != null) {
                setOnHierarchyChangeListener.a(openCCSuccessActivity, clickedTvFinger.d, 47);
            }
        }
    }

    public static void a(OpenCCSuccessActivity openCCSuccessActivity) {
        String[] strArr = d;
        if (Predicate.c(openCCSuccessActivity, strArr)) {
            openCCSuccessActivity.s();
        } else if (Predicate.b(openCCSuccessActivity, strArr)) {
            OpenCCSuccessActivity.b((LogRedirector.Logger) new write(openCCSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(openCCSuccessActivity, strArr, 47);
        }
    }

    public static void a(OpenCCSuccessActivity openCCSuccessActivity, int i, int[] iArr) {
        if (i != 46) {
            if (i == 47 && Predicate.c(iArr)) {
                openCCSuccessActivity.s();
            }
        } else if (Predicate.c(iArr)) {
            openCCSuccessActivity.t();
        }
    }

    public static void d(OpenCCSuccessActivity openCCSuccessActivity) {
        String[] strArr = e;
        if (Predicate.c(openCCSuccessActivity, strArr)) {
            openCCSuccessActivity.t();
        } else if (Predicate.b(openCCSuccessActivity, strArr)) {
            OpenCCSuccessActivity.b((LogRedirector.Logger) new read(openCCSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(openCCSuccessActivity, strArr, 46);
        }
    }
}
