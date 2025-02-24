package o;

import com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC2AskAccountActivity.class */
public final class CC2AskAccountActivity {
    private static final String[] c = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC2AskAccountActivity$write.class */
    public static final class write implements LogRedirector.Logger {
        private final WeakReference<DetailBerhasilRONotificationActivity> c;

        private write(DetailBerhasilRONotificationActivity detailBerhasilRONotificationActivity) {
            this.c = new WeakReference<>(detailBerhasilRONotificationActivity);
        }

        /* synthetic */ write(DetailBerhasilRONotificationActivity detailBerhasilRONotificationActivity, byte b) {
            this(detailBerhasilRONotificationActivity);
        }

        public final void a() {
            DetailBerhasilRONotificationActivity detailBerhasilRONotificationActivity = this.c.get();
            if (detailBerhasilRONotificationActivity != null) {
                setOnHierarchyChangeListener.a(detailBerhasilRONotificationActivity, CC2AskAccountActivity.c, 23);
            }
        }
    }

    public static void a(DetailBerhasilRONotificationActivity detailBerhasilRONotificationActivity, int i, int[] iArr) {
        if (i == 23 && Predicate.c(iArr)) {
            detailBerhasilRONotificationActivity.s();
        }
    }

    public static void e(DetailBerhasilRONotificationActivity detailBerhasilRONotificationActivity) {
        String[] strArr = c;
        if (Predicate.c(detailBerhasilRONotificationActivity, strArr)) {
            detailBerhasilRONotificationActivity.s();
        } else if (Predicate.b(detailBerhasilRONotificationActivity, strArr)) {
            DetailBerhasilRONotificationActivity.b((LogRedirector.Logger) new write(detailBerhasilRONotificationActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilRONotificationActivity, strArr, 23);
        }
    }
}
