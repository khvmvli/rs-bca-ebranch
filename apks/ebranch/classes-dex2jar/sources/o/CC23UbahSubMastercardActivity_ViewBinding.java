package o;

import com.bca.smartbranch.activity.DetailBerhasilKliringActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC23UbahSubMastercardActivity_ViewBinding.class */
public final class CC23UbahSubMastercardActivity_ViewBinding {
    private static final String[] c = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CC23UbahSubMastercardActivity_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailBerhasilKliringActivity> b;

        private RemoteActionCompatParcelizer(DetailBerhasilKliringActivity detailBerhasilKliringActivity) {
            this.b = new WeakReference<>(detailBerhasilKliringActivity);
        }

        /* synthetic */ RemoteActionCompatParcelizer(DetailBerhasilKliringActivity detailBerhasilKliringActivity, byte b) {
            this(detailBerhasilKliringActivity);
        }

        public final void a() {
            DetailBerhasilKliringActivity detailBerhasilKliringActivity = this.b.get();
            if (detailBerhasilKliringActivity != null) {
                setOnHierarchyChangeListener.a(detailBerhasilKliringActivity, CC23UbahSubMastercardActivity_ViewBinding.c, 18);
            }
        }
    }

    public static void b(DetailBerhasilKliringActivity detailBerhasilKliringActivity, int i, int[] iArr) {
        if (i == 18 && Predicate.c(iArr)) {
            detailBerhasilKliringActivity.v();
        }
    }

    public static void d(DetailBerhasilKliringActivity detailBerhasilKliringActivity) {
        String[] strArr = c;
        if (Predicate.c(detailBerhasilKliringActivity, strArr)) {
            detailBerhasilKliringActivity.v();
        } else if (Predicate.b(detailBerhasilKliringActivity, strArr)) {
            DetailBerhasilKliringActivity.c((LogRedirector.Logger) new RemoteActionCompatParcelizer(detailBerhasilKliringActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilKliringActivity, strArr, 18);
        }
    }
}
