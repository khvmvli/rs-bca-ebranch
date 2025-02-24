package o;

import com.bca.smartbranch.activity.BN7PengambilanNotificationActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/share.class */
public final class share {
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] a = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/share$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<BN7PengambilanNotificationActivity> a;

        private RemoteActionCompatParcelizer(BN7PengambilanNotificationActivity bN7PengambilanNotificationActivity) {
            this.a = new WeakReference<>(bN7PengambilanNotificationActivity);
        }

        /* synthetic */ RemoteActionCompatParcelizer(BN7PengambilanNotificationActivity bN7PengambilanNotificationActivity, byte b) {
            this(bN7PengambilanNotificationActivity);
        }

        public final void a() {
            BN7PengambilanNotificationActivity bN7PengambilanNotificationActivity = this.a.get();
            if (bN7PengambilanNotificationActivity != null) {
                setOnHierarchyChangeListener.a(bN7PengambilanNotificationActivity, share.a, 6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/share$write.class */
    public static final class write implements LogRedirector.Logger {
        private final WeakReference<BN7PengambilanNotificationActivity> c;

        private write(BN7PengambilanNotificationActivity bN7PengambilanNotificationActivity) {
            this.c = new WeakReference<>(bN7PengambilanNotificationActivity);
        }

        /* synthetic */ write(BN7PengambilanNotificationActivity bN7PengambilanNotificationActivity, byte b) {
            this(bN7PengambilanNotificationActivity);
        }

        public final void a() {
            BN7PengambilanNotificationActivity bN7PengambilanNotificationActivity = this.c.get();
            if (bN7PengambilanNotificationActivity != null) {
                setOnHierarchyChangeListener.a(bN7PengambilanNotificationActivity, share.e, 5);
            }
        }
    }

    public static void b(BN7PengambilanNotificationActivity bN7PengambilanNotificationActivity) {
        String[] strArr = a;
        if (Predicate.c(bN7PengambilanNotificationActivity, strArr)) {
            bN7PengambilanNotificationActivity.t();
        } else if (Predicate.b(bN7PengambilanNotificationActivity, strArr)) {
            BN7PengambilanNotificationActivity.c((LogRedirector.Logger) new RemoteActionCompatParcelizer(bN7PengambilanNotificationActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(bN7PengambilanNotificationActivity, strArr, 6);
        }
    }

    public static void b(BN7PengambilanNotificationActivity bN7PengambilanNotificationActivity, int i, int[] iArr) {
        if (i != 5) {
            if (i == 6 && Predicate.c(iArr)) {
                bN7PengambilanNotificationActivity.t();
            }
        } else if (Predicate.c(iArr)) {
            bN7PengambilanNotificationActivity.s();
        }
    }

    public static void d(BN7PengambilanNotificationActivity bN7PengambilanNotificationActivity) {
        String[] strArr = e;
        if (Predicate.c(bN7PengambilanNotificationActivity, strArr)) {
            bN7PengambilanNotificationActivity.s();
        } else if (Predicate.b(bN7PengambilanNotificationActivity, strArr)) {
            BN7PengambilanNotificationActivity.c((LogRedirector.Logger) new write(bN7PengambilanNotificationActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(bN7PengambilanNotificationActivity, strArr, 5);
        }
    }
}
