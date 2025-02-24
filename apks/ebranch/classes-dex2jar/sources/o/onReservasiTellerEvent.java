package o;

import com.bca.smartbranch.activity.BranchMapTarikanActivity;
/* loaded from: classes-dex2jar.jar:o/onReservasiTellerEvent.class */
public final class onReservasiTellerEvent {
    private static final String[] e = {"android.permission.CALL_PHONE"};
    private static final String[] b = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    public static void c(BranchMapTarikanActivity branchMapTarikanActivity) {
        String[] strArr = b;
        if (Predicate.c(branchMapTarikanActivity, strArr)) {
            branchMapTarikanActivity.D();
        } else {
            setOnHierarchyChangeListener.a(branchMapTarikanActivity, strArr, 10);
        }
    }

    public static void e(BranchMapTarikanActivity branchMapTarikanActivity) {
        String[] strArr = e;
        if (Predicate.c(branchMapTarikanActivity, strArr)) {
            branchMapTarikanActivity.C();
        } else {
            setOnHierarchyChangeListener.a(branchMapTarikanActivity, strArr, 9);
        }
    }

    public static void e(BranchMapTarikanActivity branchMapTarikanActivity, int i, int[] iArr) {
        if (i != 9) {
            if (i != 10) {
                return;
            }
            if (Predicate.c(iArr)) {
                branchMapTarikanActivity.D();
            } else {
                branchMapTarikanActivity.k();
            }
        } else if (Predicate.c(iArr)) {
            branchMapTarikanActivity.C();
        }
    }
}
