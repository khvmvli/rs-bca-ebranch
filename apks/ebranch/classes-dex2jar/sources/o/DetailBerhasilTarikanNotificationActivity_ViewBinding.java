package o;

import com.bca.smartbranch.activity.ReservasiTellerSuccessActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/DetailBerhasilTarikanNotificationActivity_ViewBinding.class */
public final class DetailBerhasilTarikanNotificationActivity_ViewBinding {
    private static final String[] d = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/DetailBerhasilTarikanNotificationActivity_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<ReservasiTellerSuccessActivity> d;

        private IconCompatParcelizer(ReservasiTellerSuccessActivity reservasiTellerSuccessActivity) {
            this.d = new WeakReference<>(reservasiTellerSuccessActivity);
        }

        /* synthetic */ IconCompatParcelizer(ReservasiTellerSuccessActivity reservasiTellerSuccessActivity, byte b) {
            this(reservasiTellerSuccessActivity);
        }

        public final void a() {
            ReservasiTellerSuccessActivity reservasiTellerSuccessActivity = this.d.get();
            if (reservasiTellerSuccessActivity != null) {
                setOnHierarchyChangeListener.a(reservasiTellerSuccessActivity, DetailBerhasilTarikanNotificationActivity_ViewBinding.e, 57);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/DetailBerhasilTarikanNotificationActivity_ViewBinding$read.class */
    public static final class read implements LogRedirector.Logger {
        private final WeakReference<ReservasiTellerSuccessActivity> a;

        private read(ReservasiTellerSuccessActivity reservasiTellerSuccessActivity) {
            this.a = new WeakReference<>(reservasiTellerSuccessActivity);
        }

        /* synthetic */ read(ReservasiTellerSuccessActivity reservasiTellerSuccessActivity, byte b) {
            this(reservasiTellerSuccessActivity);
        }

        public final void a() {
            ReservasiTellerSuccessActivity reservasiTellerSuccessActivity = this.a.get();
            if (reservasiTellerSuccessActivity != null) {
                setOnHierarchyChangeListener.a(reservasiTellerSuccessActivity, DetailBerhasilTarikanNotificationActivity_ViewBinding.d, 56);
            }
        }
    }

    public static void b(ReservasiTellerSuccessActivity reservasiTellerSuccessActivity) {
        String[] strArr = d;
        if (Predicate.c(reservasiTellerSuccessActivity, strArr)) {
            reservasiTellerSuccessActivity.t();
        } else if (Predicate.b(reservasiTellerSuccessActivity, strArr)) {
            ReservasiTellerSuccessActivity.e((LogRedirector.Logger) new read(reservasiTellerSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(reservasiTellerSuccessActivity, strArr, 56);
        }
    }

    public static void b(ReservasiTellerSuccessActivity reservasiTellerSuccessActivity, int i, int[] iArr) {
        if (i != 56) {
            if (i == 57 && Predicate.c(iArr)) {
                reservasiTellerSuccessActivity.y();
            }
        } else if (Predicate.c(iArr)) {
            reservasiTellerSuccessActivity.t();
        }
    }

    public static void c(ReservasiTellerSuccessActivity reservasiTellerSuccessActivity) {
        String[] strArr = e;
        if (Predicate.c(reservasiTellerSuccessActivity, strArr)) {
            reservasiTellerSuccessActivity.y();
        } else if (Predicate.b(reservasiTellerSuccessActivity, strArr)) {
            ReservasiTellerSuccessActivity.e((LogRedirector.Logger) new IconCompatParcelizer(reservasiTellerSuccessActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(reservasiTellerSuccessActivity, strArr, 57);
        }
    }
}
