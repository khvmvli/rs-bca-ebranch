package o;

import com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/onClickedYes.class */
public final class onClickedYes {
    private static final String[] c = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void b(DetailBerhasilTellerNotificationActivity detailBerhasilTellerNotificationActivity) {
        String[] strArr = c;
        if (Predicate.c(detailBerhasilTellerNotificationActivity, strArr)) {
            detailBerhasilTellerNotificationActivity.s();
        } else if (Predicate.b(detailBerhasilTellerNotificationActivity, strArr)) {
            DetailBerhasilTellerNotificationActivity.b((LogRedirector.Logger) new onClickedYes$MediaBrowserCompat$CustomActionResultReceiver(detailBerhasilTellerNotificationActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilTellerNotificationActivity, strArr, 27);
        }
    }

    public static void b(DetailBerhasilTellerNotificationActivity detailBerhasilTellerNotificationActivity, int i, int[] iArr) {
        if (i == 27 && Predicate.c(iArr)) {
            detailBerhasilTellerNotificationActivity.s();
        }
    }
}
