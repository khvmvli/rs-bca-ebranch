package o;

import com.bca.smartbranch.activity.DetailBerhasilTellerActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/onCLickedBelum.class */
public final class onCLickedBelum {
    private static final String[] d = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/onCLickedBelum$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailBerhasilTellerActivity> d;

        private RemoteActionCompatParcelizer(DetailBerhasilTellerActivity detailBerhasilTellerActivity) {
            this.d = new WeakReference<>(detailBerhasilTellerActivity);
        }

        /* synthetic */ RemoteActionCompatParcelizer(DetailBerhasilTellerActivity detailBerhasilTellerActivity, byte b) {
            this(detailBerhasilTellerActivity);
        }

        public final void a() {
            DetailBerhasilTellerActivity detailBerhasilTellerActivity = this.d.get();
            if (detailBerhasilTellerActivity != null) {
                setOnHierarchyChangeListener.a(detailBerhasilTellerActivity, onCLickedBelum.d, 26);
            }
        }
    }

    public static void c(DetailBerhasilTellerActivity detailBerhasilTellerActivity) {
        String[] strArr = d;
        if (Predicate.c(detailBerhasilTellerActivity, strArr)) {
            detailBerhasilTellerActivity.y();
        } else if (Predicate.b(detailBerhasilTellerActivity, strArr)) {
            DetailBerhasilTellerActivity.c((LogRedirector.Logger) new RemoteActionCompatParcelizer(detailBerhasilTellerActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilTellerActivity, strArr, 26);
        }
    }

    public static void e(DetailBerhasilTellerActivity detailBerhasilTellerActivity, int i, int[] iArr) {
        if (i == 26 && Predicate.c(iArr)) {
            detailBerhasilTellerActivity.y();
        }
    }
}
