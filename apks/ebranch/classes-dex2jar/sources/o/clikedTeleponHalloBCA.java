package o;

import com.bca.smartbranch.activity.OpenAccountSuccessActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/clikedTeleponHalloBCA.class */
public final class clikedTeleponHalloBCA {
    private static final String[] b = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/clikedTeleponHalloBCA$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<OpenAccountSuccessActivity> d;

        private RemoteActionCompatParcelizer(OpenAccountSuccessActivity openAccountSuccessActivity) {
            this.d = new WeakReference<>(openAccountSuccessActivity);
        }

        /* synthetic */ RemoteActionCompatParcelizer(OpenAccountSuccessActivity openAccountSuccessActivity, byte b) {
            this(openAccountSuccessActivity);
        }

        public final void a() {
            OpenAccountSuccessActivity openAccountSuccessActivity = this.d.get();
            if (openAccountSuccessActivity != null) {
                setOnHierarchyChangeListener.a(openAccountSuccessActivity, clikedTeleponHalloBCA.e, 45);
            }
        }
    }

    public static void a(OpenAccountSuccessActivity openAccountSuccessActivity) {
        String[] strArr = b;
        if (Predicate.c(openAccountSuccessActivity, strArr)) {
            openAccountSuccessActivity.t();
        } else if (Predicate.b(openAccountSuccessActivity, strArr)) {
            OpenAccountSuccessActivity.c((LogRedirector.Logger) new clikedTeleponHalloBCA$MediaBrowserCompat$CustomActionResultReceiver(openAccountSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(openAccountSuccessActivity, strArr, 44);
        }
    }

    public static void b(OpenAccountSuccessActivity openAccountSuccessActivity, int i, int[] iArr) {
        if (i != 44) {
            if (i == 45 && Predicate.c(iArr)) {
                openAccountSuccessActivity.v();
            }
        } else if (Predicate.c(iArr)) {
            openAccountSuccessActivity.t();
        }
    }

    public static void c(OpenAccountSuccessActivity openAccountSuccessActivity) {
        String[] strArr = e;
        if (Predicate.c(openAccountSuccessActivity, strArr)) {
            openAccountSuccessActivity.v();
        } else if (Predicate.b(openAccountSuccessActivity, strArr)) {
            OpenAccountSuccessActivity.c((LogRedirector.Logger) new RemoteActionCompatParcelizer(openAccountSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(openAccountSuccessActivity, strArr, 45);
        }
    }
}
