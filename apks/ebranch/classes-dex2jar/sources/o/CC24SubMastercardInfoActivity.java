package o;

import com.bca.smartbranch.activity.DetailBerhasilNotificationActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC24SubMastercardInfoActivity.class */
public final class CC24SubMastercardInfoActivity {
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC24SubMastercardInfoActivity$read.class */
    public static final class read implements LogRedirector.Logger {
        private final WeakReference<DetailBerhasilNotificationActivity> c;

        private read(DetailBerhasilNotificationActivity detailBerhasilNotificationActivity) {
            this.c = new WeakReference<>(detailBerhasilNotificationActivity);
        }

        /* synthetic */ read(DetailBerhasilNotificationActivity detailBerhasilNotificationActivity, byte b) {
            this(detailBerhasilNotificationActivity);
        }

        public final void a() {
            DetailBerhasilNotificationActivity detailBerhasilNotificationActivity = this.c.get();
            if (detailBerhasilNotificationActivity != null) {
                setOnHierarchyChangeListener.a(detailBerhasilNotificationActivity, CC24SubMastercardInfoActivity.e, 19);
            }
        }
    }

    public static void a(DetailBerhasilNotificationActivity detailBerhasilNotificationActivity) {
        String[] strArr = e;
        if (Predicate.c(detailBerhasilNotificationActivity, strArr)) {
            detailBerhasilNotificationActivity.s();
        } else if (Predicate.b(detailBerhasilNotificationActivity, strArr)) {
            DetailBerhasilNotificationActivity.c((LogRedirector.Logger) new read(detailBerhasilNotificationActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilNotificationActivity, strArr, 19);
        }
    }

    public static void a(DetailBerhasilNotificationActivity detailBerhasilNotificationActivity, int i, int[] iArr) {
        if (i == 19 && Predicate.c(iArr)) {
            detailBerhasilNotificationActivity.s();
        }
    }
}
