package o;

import com.bca.smartbranch.activity.UbahProfilActivity;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/DetailFailedEChannelActivity_ViewBinding.class */
public final class DetailFailedEChannelActivity_ViewBinding {
    private static final String[] d = {"android.permission.READ_EXTERNAL_STORAGE"};

    public static void c(UbahProfilActivity ubahProfilActivity) {
        String[] strArr = d;
        if (Predicate.c(ubahProfilActivity, strArr)) {
            ubahProfilActivity.startActivityForResult(indexOf.b(ubahProfilActivity, 0), 7458);
        } else if (Predicate.b(ubahProfilActivity, strArr)) {
            UbahProfilActivity.d((LogRedirector.Logger) new DetailFailedEChannelActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(ubahProfilActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(ubahProfilActivity, strArr, 60);
        }
    }

    public static void c(UbahProfilActivity ubahProfilActivity, int i, int[] iArr) {
        if (i == 60 && Predicate.c(iArr)) {
            ubahProfilActivity.startActivityForResult(indexOf.b(ubahProfilActivity, 0), 7458);
        }
    }
}
