package o;

import com.bca.smartbranch.activity.ReservasiSuccessActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/DetailBerhasilBTNotificationActivity_ViewBinding.class */
public final class DetailBerhasilBTNotificationActivity_ViewBinding {
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] c = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/DetailBerhasilBTNotificationActivity_ViewBinding$read.class */
    public static final class read implements LogRedirector.Logger {
        private final WeakReference<ReservasiSuccessActivity> b;

        private read(ReservasiSuccessActivity reservasiSuccessActivity) {
            this.b = new WeakReference<>(reservasiSuccessActivity);
        }

        /* synthetic */ read(ReservasiSuccessActivity reservasiSuccessActivity, byte b) {
            this(reservasiSuccessActivity);
        }

        public final void a() {
            ReservasiSuccessActivity reservasiSuccessActivity = this.b.get();
            if (reservasiSuccessActivity != null) {
                setOnHierarchyChangeListener.a(reservasiSuccessActivity, DetailBerhasilBTNotificationActivity_ViewBinding.c, 53);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/DetailBerhasilBTNotificationActivity_ViewBinding$write.class */
    public static final class write implements LogRedirector.Logger {
        private final WeakReference<ReservasiSuccessActivity> e;

        private write(ReservasiSuccessActivity reservasiSuccessActivity) {
            this.e = new WeakReference<>(reservasiSuccessActivity);
        }

        /* synthetic */ write(ReservasiSuccessActivity reservasiSuccessActivity, byte b) {
            this(reservasiSuccessActivity);
        }

        public final void a() {
            ReservasiSuccessActivity reservasiSuccessActivity = this.e.get();
            if (reservasiSuccessActivity != null) {
                setOnHierarchyChangeListener.a(reservasiSuccessActivity, DetailBerhasilBTNotificationActivity_ViewBinding.e, 52);
            }
        }
    }

    public static void a(ReservasiSuccessActivity reservasiSuccessActivity) {
        String[] strArr = c;
        if (Predicate.c(reservasiSuccessActivity, strArr)) {
            reservasiSuccessActivity.u();
        } else if (Predicate.b(reservasiSuccessActivity, strArr)) {
            ReservasiSuccessActivity.b((LogRedirector.Logger) new read(reservasiSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(reservasiSuccessActivity, strArr, 53);
        }
    }

    public static void c(ReservasiSuccessActivity reservasiSuccessActivity, int i, int[] iArr) {
        if (i != 52) {
            if (i == 53 && Predicate.c(iArr)) {
                reservasiSuccessActivity.u();
            }
        } else if (Predicate.c(iArr)) {
            reservasiSuccessActivity.t();
        }
    }

    public static void d(ReservasiSuccessActivity reservasiSuccessActivity) {
        String[] strArr = e;
        if (Predicate.c(reservasiSuccessActivity, strArr)) {
            reservasiSuccessActivity.t();
        } else if (Predicate.b(reservasiSuccessActivity, strArr)) {
            ReservasiSuccessActivity.b((LogRedirector.Logger) new write(reservasiSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(reservasiSuccessActivity, strArr, 52);
        }
    }
}
