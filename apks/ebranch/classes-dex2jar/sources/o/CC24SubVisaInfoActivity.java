package o;

import com.bca.smartbranch.activity.DetailBerhasilTarikanActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC24SubVisaInfoActivity.class */
public final class CC24SubVisaInfoActivity {
    private static final String[] c = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC24SubVisaInfoActivity$write.class */
    public static final class write implements LogRedirector.Logger {
        private final WeakReference<DetailBerhasilTarikanActivity> e;

        private write(DetailBerhasilTarikanActivity detailBerhasilTarikanActivity) {
            this.e = new WeakReference<>(detailBerhasilTarikanActivity);
        }

        /* synthetic */ write(DetailBerhasilTarikanActivity detailBerhasilTarikanActivity, byte b) {
            this(detailBerhasilTarikanActivity);
        }

        public final void a() {
            DetailBerhasilTarikanActivity detailBerhasilTarikanActivity = this.e.get();
            if (detailBerhasilTarikanActivity != null) {
                setOnHierarchyChangeListener.a(detailBerhasilTarikanActivity, CC24SubVisaInfoActivity.c, 24);
            }
        }
    }

    public static void b(DetailBerhasilTarikanActivity detailBerhasilTarikanActivity) {
        String[] strArr = c;
        if (Predicate.c(detailBerhasilTarikanActivity, strArr)) {
            detailBerhasilTarikanActivity.y();
        } else if (Predicate.b(detailBerhasilTarikanActivity, strArr)) {
            DetailBerhasilTarikanActivity.b((LogRedirector.Logger) new write(detailBerhasilTarikanActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilTarikanActivity, strArr, 24);
        }
    }

    public static void e(DetailBerhasilTarikanActivity detailBerhasilTarikanActivity, int i, int[] iArr) {
        if (i == 24 && Predicate.c(iArr)) {
            detailBerhasilTarikanActivity.y();
        }
    }
}
