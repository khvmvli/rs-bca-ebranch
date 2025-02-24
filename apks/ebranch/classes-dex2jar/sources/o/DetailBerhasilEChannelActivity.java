package o;

import com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/DetailBerhasilEChannelActivity.class */
public final class DetailBerhasilEChannelActivity {
    private static final String[] a = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/DetailBerhasilEChannelActivity$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<ReservasiSuccessEChannelActivity> d;

        private RemoteActionCompatParcelizer(ReservasiSuccessEChannelActivity reservasiSuccessEChannelActivity) {
            this.d = new WeakReference<>(reservasiSuccessEChannelActivity);
        }

        /* synthetic */ RemoteActionCompatParcelizer(ReservasiSuccessEChannelActivity reservasiSuccessEChannelActivity, byte b) {
            this(reservasiSuccessEChannelActivity);
        }

        public final void a() {
            ReservasiSuccessEChannelActivity reservasiSuccessEChannelActivity = this.d.get();
            if (reservasiSuccessEChannelActivity != null) {
                setOnHierarchyChangeListener.a(reservasiSuccessEChannelActivity, DetailBerhasilEChannelActivity.a, 54);
            }
        }
    }

    public static void c(ReservasiSuccessEChannelActivity reservasiSuccessEChannelActivity) {
        String[] strArr = a;
        if (Predicate.c(reservasiSuccessEChannelActivity, strArr)) {
            reservasiSuccessEChannelActivity.t();
        } else if (Predicate.b(reservasiSuccessEChannelActivity, strArr)) {
            ReservasiSuccessEChannelActivity.d((LogRedirector.Logger) new RemoteActionCompatParcelizer(reservasiSuccessEChannelActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(reservasiSuccessEChannelActivity, strArr, 54);
        }
    }

    public static void e(ReservasiSuccessEChannelActivity reservasiSuccessEChannelActivity) {
        String[] strArr = e;
        if (Predicate.c(reservasiSuccessEChannelActivity, strArr)) {
            reservasiSuccessEChannelActivity.y();
        } else if (Predicate.b(reservasiSuccessEChannelActivity, strArr)) {
            ReservasiSuccessEChannelActivity.d((LogRedirector.Logger) new DetailBerhasilEChannelActivity$MediaBrowserCompat$CustomActionResultReceiver(reservasiSuccessEChannelActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(reservasiSuccessEChannelActivity, strArr, 55);
        }
    }

    public static void e(ReservasiSuccessEChannelActivity reservasiSuccessEChannelActivity, int i, int[] iArr) {
        if (i != 54) {
            if (i == 55 && Predicate.c(iArr)) {
                reservasiSuccessEChannelActivity.y();
            }
        } else if (Predicate.c(iArr)) {
            reservasiSuccessEChannelActivity.t();
        }
    }
}
