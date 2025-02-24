package o;

import com.bca.smartbranch.activity.ReservasiROSuccessActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/DetailBerhasilEChannelNotificationActivity.class */
public final class DetailBerhasilEChannelNotificationActivity {
    private static final String[] d = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] a = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/DetailBerhasilEChannelNotificationActivity$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<ReservasiROSuccessActivity> a;

        private RemoteActionCompatParcelizer(ReservasiROSuccessActivity reservasiROSuccessActivity) {
            this.a = new WeakReference<>(reservasiROSuccessActivity);
        }

        /* synthetic */ RemoteActionCompatParcelizer(ReservasiROSuccessActivity reservasiROSuccessActivity, byte b) {
            this(reservasiROSuccessActivity);
        }

        public final void a() {
            ReservasiROSuccessActivity reservasiROSuccessActivity = this.a.get();
            if (reservasiROSuccessActivity != null) {
                setOnHierarchyChangeListener.a(reservasiROSuccessActivity, DetailBerhasilEChannelNotificationActivity.a, 51);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/DetailBerhasilEChannelNotificationActivity$read.class */
    public static final class read implements LogRedirector.Logger {
        private final WeakReference<ReservasiROSuccessActivity> b;

        private read(ReservasiROSuccessActivity reservasiROSuccessActivity) {
            this.b = new WeakReference<>(reservasiROSuccessActivity);
        }

        /* synthetic */ read(ReservasiROSuccessActivity reservasiROSuccessActivity, byte b) {
            this(reservasiROSuccessActivity);
        }

        public final void a() {
            ReservasiROSuccessActivity reservasiROSuccessActivity = this.b.get();
            if (reservasiROSuccessActivity != null) {
                setOnHierarchyChangeListener.a(reservasiROSuccessActivity, DetailBerhasilEChannelNotificationActivity.d, 50);
            }
        }
    }

    public static void a(ReservasiROSuccessActivity reservasiROSuccessActivity) {
        String[] strArr = a;
        if (Predicate.c(reservasiROSuccessActivity, strArr)) {
            reservasiROSuccessActivity.v();
        } else if (Predicate.b(reservasiROSuccessActivity, strArr)) {
            ReservasiROSuccessActivity.e((LogRedirector.Logger) new RemoteActionCompatParcelizer(reservasiROSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(reservasiROSuccessActivity, strArr, 51);
        }
    }

    public static void b(ReservasiROSuccessActivity reservasiROSuccessActivity) {
        String[] strArr = d;
        if (Predicate.c(reservasiROSuccessActivity, strArr)) {
            reservasiROSuccessActivity.t();
        } else if (Predicate.b(reservasiROSuccessActivity, strArr)) {
            ReservasiROSuccessActivity.e((LogRedirector.Logger) new read(reservasiROSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(reservasiROSuccessActivity, strArr, 50);
        }
    }

    public static void e(ReservasiROSuccessActivity reservasiROSuccessActivity, int i, int[] iArr) {
        if (i != 50) {
            if (i == 51 && Predicate.c(iArr)) {
                reservasiROSuccessActivity.v();
            }
        } else if (Predicate.c(iArr)) {
            reservasiROSuccessActivity.t();
        }
    }
}
