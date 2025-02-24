package o;

import com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/subscribeChooseUbahMastercardEvent.class */
public final class subscribeChooseUbahMastercardEvent {
    private static final String[] c = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void c(DetailBerhasilBTNotificationActivity detailBerhasilBTNotificationActivity, int i, int[] iArr) {
        if (i == 15 && Predicate.c(iArr)) {
            detailBerhasilBTNotificationActivity.s();
        }
    }

    public static void e(DetailBerhasilBTNotificationActivity detailBerhasilBTNotificationActivity) {
        String[] strArr = c;
        if (Predicate.c(detailBerhasilBTNotificationActivity, strArr)) {
            detailBerhasilBTNotificationActivity.s();
        } else if (Predicate.b(detailBerhasilBTNotificationActivity, strArr)) {
            DetailBerhasilBTNotificationActivity.b((LogRedirector.Logger) new subscribeChooseUbahMastercardEvent$MediaBrowserCompat$CustomActionResultReceiver(detailBerhasilBTNotificationActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilBTNotificationActivity, strArr, 15);
        }
    }
}
