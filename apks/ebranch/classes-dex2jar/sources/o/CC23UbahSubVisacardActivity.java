package o;

import com.bca.smartbranch.activity.DetailBerhasilORNotificationActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC23UbahSubVisacardActivity.class */
public final class CC23UbahSubVisacardActivity {
    private static final String[] a = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC23UbahSubVisacardActivity$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailBerhasilORNotificationActivity> c;

        private RemoteActionCompatParcelizer(DetailBerhasilORNotificationActivity detailBerhasilORNotificationActivity) {
            this.c = new WeakReference<>(detailBerhasilORNotificationActivity);
        }

        /* synthetic */ RemoteActionCompatParcelizer(DetailBerhasilORNotificationActivity detailBerhasilORNotificationActivity, byte b) {
            this(detailBerhasilORNotificationActivity);
        }

        public final void a() {
            DetailBerhasilORNotificationActivity detailBerhasilORNotificationActivity = this.c.get();
            if (detailBerhasilORNotificationActivity != null) {
                setOnHierarchyChangeListener.a(detailBerhasilORNotificationActivity, CC23UbahSubVisacardActivity.a, 21);
            }
        }
    }

    public static void c(DetailBerhasilORNotificationActivity detailBerhasilORNotificationActivity) {
        String[] strArr = a;
        if (Predicate.c(detailBerhasilORNotificationActivity, strArr)) {
            detailBerhasilORNotificationActivity.s();
        } else if (Predicate.b(detailBerhasilORNotificationActivity, strArr)) {
            DetailBerhasilORNotificationActivity.a((LogRedirector.Logger) new RemoteActionCompatParcelizer(detailBerhasilORNotificationActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilORNotificationActivity, strArr, 21);
        }
    }

    public static void e(DetailBerhasilORNotificationActivity detailBerhasilORNotificationActivity, int i, int[] iArr) {
        if (i == 21 && Predicate.c(iArr)) {
            detailBerhasilORNotificationActivity.s();
        }
    }
}
