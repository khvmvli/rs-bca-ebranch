package o;

import com.bca.smartbranch.activity.DetailBerhasilBTActivity;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC23UbahSubMastercardActivity.class */
public final class CC23UbahSubMastercardActivity {
    private static final String[] d = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void b(DetailBerhasilBTActivity detailBerhasilBTActivity) {
        String[] strArr = d;
        if (Predicate.c(detailBerhasilBTActivity, strArr)) {
            detailBerhasilBTActivity.u();
        } else if (Predicate.b(detailBerhasilBTActivity, strArr)) {
            DetailBerhasilBTActivity.e((LogRedirector.Logger) new CC23UbahSubMastercardActivity$MediaBrowserCompat$CustomActionResultReceiver(detailBerhasilBTActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilBTActivity, strArr, 14);
        }
    }

    public static void e(DetailBerhasilBTActivity detailBerhasilBTActivity, int i, int[] iArr) {
        if (i == 14 && Predicate.c(iArr)) {
            detailBerhasilBTActivity.u();
        }
    }
}
