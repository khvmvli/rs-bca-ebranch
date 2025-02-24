package o;

import com.bca.smartbranch.activity.LandingActivity;
/* loaded from: classes-dex2jar.jar:o/CekDokumenActivity_ViewBinding.class */
public final class CekDokumenActivity_ViewBinding {
    private static final String[] a = {"android.permission.POST_NOTIFICATIONS"};

    public static void a(LandingActivity landingActivity, int i, int[] iArr) {
        if (i == 42) {
            Predicate.c(iArr);
        }
    }

    public static void b(LandingActivity landingActivity) {
        String[] strArr = a;
        if (!Predicate.c(landingActivity, strArr)) {
            setOnHierarchyChangeListener.a(landingActivity, strArr, 42);
        }
    }
}
