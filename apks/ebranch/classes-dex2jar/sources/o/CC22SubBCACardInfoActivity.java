package o;

import com.bca.smartbranch.activity.DetailBerhasilActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC22SubBCACardInfoActivity.class */
public final class CC22SubBCACardInfoActivity {
    private static final String[] c = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC22SubBCACardInfoActivity$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailBerhasilActivity> c;

        private IconCompatParcelizer(DetailBerhasilActivity detailBerhasilActivity) {
            this.c = new WeakReference<>(detailBerhasilActivity);
        }

        /* synthetic */ IconCompatParcelizer(DetailBerhasilActivity detailBerhasilActivity, byte b) {
            this(detailBerhasilActivity);
        }

        public final void a() {
            DetailBerhasilActivity detailBerhasilActivity = this.c.get();
            if (detailBerhasilActivity != null) {
                setOnHierarchyChangeListener.a(detailBerhasilActivity, CC22SubBCACardInfoActivity.c, 13);
            }
        }
    }

    public static void a(DetailBerhasilActivity detailBerhasilActivity) {
        String[] strArr = c;
        if (Predicate.c(detailBerhasilActivity, strArr)) {
            detailBerhasilActivity.v();
        } else if (Predicate.b(detailBerhasilActivity, strArr)) {
            DetailBerhasilActivity.a((LogRedirector.Logger) new IconCompatParcelizer(detailBerhasilActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilActivity, strArr, 13);
        }
    }

    public static void a(DetailBerhasilActivity detailBerhasilActivity, int i, int[] iArr) {
        if (i == 13 && Predicate.c(iArr)) {
            detailBerhasilActivity.v();
        }
    }
}
