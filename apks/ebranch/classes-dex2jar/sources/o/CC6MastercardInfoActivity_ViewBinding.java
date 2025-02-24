package o;

import com.bca.smartbranch.activity.FotoActivity;
import o.LogRedirector;
import o.indexOf;
/* loaded from: classes-dex2jar.jar:o/CC6MastercardInfoActivity_ViewBinding.class */
public final class CC6MastercardInfoActivity_ViewBinding {
    private static final String[] e = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] c = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final String[] a = {"android.permission.CAMERA"};

    public static void a(FotoActivity fotoActivity) {
        String[] strArr = c;
        if (Predicate.c(fotoActivity, strArr)) {
            fotoActivity.s();
        } else if (Predicate.b(fotoActivity, strArr)) {
            FotoActivity.e((LogRedirector.Logger) new CC6MastercardInfoActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(fotoActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(fotoActivity, strArr, 39);
        }
    }

    public static void c(FotoActivity fotoActivity, int i, int[] iArr) {
        switch (i) {
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                if (Predicate.c(iArr)) {
                    new indexOf.read(fotoActivity, (byte) 0);
                    return;
                }
                return;
            case 39:
                if (Predicate.c(iArr)) {
                    fotoActivity.s();
                    return;
                } else {
                    fotoActivity.onBackPressed();
                    return;
                }
            case 40:
                if (Predicate.c(iArr)) {
                    fotoActivity.s();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static void e(FotoActivity fotoActivity) {
        String[] strArr = a;
        if (Predicate.c(fotoActivity, strArr)) {
            fotoActivity.s();
        } else {
            setOnHierarchyChangeListener.a(fotoActivity, strArr, 40);
        }
    }
}
