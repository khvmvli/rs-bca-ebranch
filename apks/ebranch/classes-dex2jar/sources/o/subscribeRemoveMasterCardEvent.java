package o;

import com.bca.smartbranch.activity.DetailTundaTellerActivity;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/subscribeRemoveMasterCardEvent.class */
public final class subscribeRemoveMasterCardEvent {
    private static final String[] a = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void d(DetailTundaTellerActivity detailTundaTellerActivity, int i, int[] iArr) {
        if (i == 37 && Predicate.c(iArr)) {
            detailTundaTellerActivity.v();
        }
    }

    public static void e(DetailTundaTellerActivity detailTundaTellerActivity) {
        String[] strArr = a;
        if (Predicate.c(detailTundaTellerActivity, strArr)) {
            detailTundaTellerActivity.v();
        } else if (Predicate.b(detailTundaTellerActivity, strArr)) {
            DetailTundaTellerActivity.c((LogRedirector.Logger) new subscribeRemoveMasterCardEvent$MediaBrowserCompat$CustomActionResultReceiver(detailTundaTellerActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailTundaTellerActivity, strArr, 37);
        }
    }
}
