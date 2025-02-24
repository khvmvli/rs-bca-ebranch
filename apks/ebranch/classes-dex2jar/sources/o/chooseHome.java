package o;

import com.bca.smartbranch.activity.MainActivity;
/* loaded from: classes-dex2jar.jar:o/chooseHome.class */
public final class chooseHome {
    private static final String[] b = {"android.permission.POST_NOTIFICATIONS"};

    public static void b(MainActivity mainActivity, int i, int[] iArr) {
        if (i == 43) {
            Predicate.c(iArr);
        }
    }

    public static void c(MainActivity mainActivity) {
        String[] strArr = b;
        if (!Predicate.c(mainActivity, strArr)) {
            setOnHierarchyChangeListener.a(mainActivity, strArr, 43);
        }
    }
}
