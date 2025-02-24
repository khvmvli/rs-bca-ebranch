package o;

import com.bca.smartbranch.activity.DetailBerhasilROActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC24SubVisaInfoActivity_ViewBinding.class */
public final class CC24SubVisaInfoActivity_ViewBinding {
    private static final String[] c = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC24SubVisaInfoActivity_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailBerhasilROActivity> c;

        private RemoteActionCompatParcelizer(DetailBerhasilROActivity detailBerhasilROActivity) {
            this.c = new WeakReference<>(detailBerhasilROActivity);
        }

        /* synthetic */ RemoteActionCompatParcelizer(DetailBerhasilROActivity detailBerhasilROActivity, byte b) {
            this(detailBerhasilROActivity);
        }

        public final void a() {
            DetailBerhasilROActivity detailBerhasilROActivity = this.c.get();
            if (detailBerhasilROActivity != null) {
                setOnHierarchyChangeListener.a(detailBerhasilROActivity, CC24SubVisaInfoActivity_ViewBinding.c, 22);
            }
        }
    }

    public static void a(DetailBerhasilROActivity detailBerhasilROActivity) {
        String[] strArr = c;
        if (Predicate.c(detailBerhasilROActivity, strArr)) {
            detailBerhasilROActivity.u();
        } else if (Predicate.b(detailBerhasilROActivity, strArr)) {
            DetailBerhasilROActivity.b((LogRedirector.Logger) new RemoteActionCompatParcelizer(detailBerhasilROActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilROActivity, strArr, 22);
        }
    }

    public static void d(DetailBerhasilROActivity detailBerhasilROActivity, int i, int[] iArr) {
        if (i == 22 && Predicate.c(iArr)) {
            detailBerhasilROActivity.u();
        }
    }
}
