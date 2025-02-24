package o;

import com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/onCLickedPilihKartu.class */
public final class onCLickedPilihKartu {
    private static final String[] b = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/onCLickedPilihKartu$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailBNBerhasilNotificationActivity> d;

        private IconCompatParcelizer(DetailBNBerhasilNotificationActivity detailBNBerhasilNotificationActivity) {
            this.d = new WeakReference<>(detailBNBerhasilNotificationActivity);
        }

        /* synthetic */ IconCompatParcelizer(DetailBNBerhasilNotificationActivity detailBNBerhasilNotificationActivity, byte b) {
            this(detailBNBerhasilNotificationActivity);
        }

        public final void a() {
            DetailBNBerhasilNotificationActivity detailBNBerhasilNotificationActivity = this.d.get();
            if (detailBNBerhasilNotificationActivity != null) {
                setOnHierarchyChangeListener.a(detailBNBerhasilNotificationActivity, onCLickedPilihKartu.b, 12);
            }
        }
    }

    public static void c(DetailBNBerhasilNotificationActivity detailBNBerhasilNotificationActivity) {
        String[] strArr = b;
        if (Predicate.c(detailBNBerhasilNotificationActivity, strArr)) {
            detailBNBerhasilNotificationActivity.s();
        } else if (Predicate.b(detailBNBerhasilNotificationActivity, strArr)) {
            DetailBNBerhasilNotificationActivity.d((LogRedirector.Logger) new IconCompatParcelizer(detailBNBerhasilNotificationActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBNBerhasilNotificationActivity, strArr, 12);
        }
    }

    public static void d(DetailBNBerhasilNotificationActivity detailBNBerhasilNotificationActivity, int i, int[] iArr) {
        if (i == 12 && Predicate.c(iArr)) {
            detailBNBerhasilNotificationActivity.s();
        }
    }
}
