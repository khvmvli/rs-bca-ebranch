package o;

import com.bca.smartbranch.activity.ReservasiTundaSuccessActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/DetailBerhasilTarikanNotificationActivity.class */
public final class DetailBerhasilTarikanNotificationActivity {
    private static final String[] d = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] b = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/DetailBerhasilTarikanNotificationActivity$read.class */
    public static final class read implements LogRedirector.Logger {
        private final WeakReference<ReservasiTundaSuccessActivity> d;

        private read(ReservasiTundaSuccessActivity reservasiTundaSuccessActivity) {
            this.d = new WeakReference<>(reservasiTundaSuccessActivity);
        }

        /* synthetic */ read(ReservasiTundaSuccessActivity reservasiTundaSuccessActivity, byte b) {
            this(reservasiTundaSuccessActivity);
        }

        public final void a() {
            ReservasiTundaSuccessActivity reservasiTundaSuccessActivity = this.d.get();
            if (reservasiTundaSuccessActivity != null) {
                setOnHierarchyChangeListener.a(reservasiTundaSuccessActivity, DetailBerhasilTarikanNotificationActivity.b, 59);
            }
        }
    }

    public static void a(ReservasiTundaSuccessActivity reservasiTundaSuccessActivity, int i, int[] iArr) {
        if (i != 58) {
            if (i == 59 && Predicate.c(iArr)) {
                reservasiTundaSuccessActivity.y();
            }
        } else if (Predicate.c(iArr)) {
            reservasiTundaSuccessActivity.t();
        }
    }

    public static void b(ReservasiTundaSuccessActivity reservasiTundaSuccessActivity) {
        String[] strArr = d;
        if (Predicate.c(reservasiTundaSuccessActivity, strArr)) {
            reservasiTundaSuccessActivity.t();
        } else if (Predicate.b(reservasiTundaSuccessActivity, strArr)) {
            ReservasiTundaSuccessActivity.a((LogRedirector.Logger) new DetailBerhasilTarikanNotificationActivity$MediaBrowserCompat$CustomActionResultReceiver(reservasiTundaSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(reservasiTundaSuccessActivity, strArr, 58);
        }
    }

    public static void d(ReservasiTundaSuccessActivity reservasiTundaSuccessActivity) {
        String[] strArr = b;
        if (Predicate.c(reservasiTundaSuccessActivity, strArr)) {
            reservasiTundaSuccessActivity.y();
        } else if (Predicate.b(reservasiTundaSuccessActivity, strArr)) {
            ReservasiTundaSuccessActivity.a((LogRedirector.Logger) new read(reservasiTundaSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(reservasiTundaSuccessActivity, strArr, 59);
        }
    }
}
