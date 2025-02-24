package o;

import com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC24SubMastercardInfoActivity_ViewBinding.class */
public final class CC24SubMastercardInfoActivity_ViewBinding {
    private static final String[] d = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC24SubMastercardInfoActivity_ViewBinding$write.class */
    public static final class write implements LogRedirector.Logger {
        private final WeakReference<DetailBerhasilTarikanNotificationActivity> c;

        private write(DetailBerhasilTarikanNotificationActivity detailBerhasilTarikanNotificationActivity) {
            this.c = new WeakReference<>(detailBerhasilTarikanNotificationActivity);
        }

        /* synthetic */ write(DetailBerhasilTarikanNotificationActivity detailBerhasilTarikanNotificationActivity, byte b) {
            this(detailBerhasilTarikanNotificationActivity);
        }

        public final void a() {
            DetailBerhasilTarikanNotificationActivity detailBerhasilTarikanNotificationActivity = this.c.get();
            if (detailBerhasilTarikanNotificationActivity != null) {
                setOnHierarchyChangeListener.a(detailBerhasilTarikanNotificationActivity, CC24SubMastercardInfoActivity_ViewBinding.d, 25);
            }
        }
    }

    public static void a(DetailBerhasilTarikanNotificationActivity detailBerhasilTarikanNotificationActivity, int i, int[] iArr) {
        if (i == 25 && Predicate.c(iArr)) {
            detailBerhasilTarikanNotificationActivity.s();
        }
    }

    public static void d(DetailBerhasilTarikanNotificationActivity detailBerhasilTarikanNotificationActivity) {
        String[] strArr = d;
        if (Predicate.c(detailBerhasilTarikanNotificationActivity, strArr)) {
            detailBerhasilTarikanNotificationActivity.s();
        } else if (Predicate.b(detailBerhasilTarikanNotificationActivity, strArr)) {
            DetailBerhasilTarikanNotificationActivity.d((LogRedirector.Logger) new write(detailBerhasilTarikanNotificationActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilTarikanNotificationActivity, strArr, 25);
        }
    }
}
