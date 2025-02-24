package o;

import com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/subscribeChooseUbahVisaCardEvent.class */
public final class subscribeChooseUbahVisaCardEvent {
    private static final String[] b = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/subscribeChooseUbahVisaCardEvent$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<DetailBerhasilEChannelNotificationActivity> a;

        private RemoteActionCompatParcelizer(DetailBerhasilEChannelNotificationActivity detailBerhasilEChannelNotificationActivity) {
            this.a = new WeakReference<>(detailBerhasilEChannelNotificationActivity);
        }

        /* synthetic */ RemoteActionCompatParcelizer(DetailBerhasilEChannelNotificationActivity detailBerhasilEChannelNotificationActivity, byte b) {
            this(detailBerhasilEChannelNotificationActivity);
        }

        public final void a() {
            DetailBerhasilEChannelNotificationActivity detailBerhasilEChannelNotificationActivity = this.a.get();
            if (detailBerhasilEChannelNotificationActivity != null) {
                setOnHierarchyChangeListener.a(detailBerhasilEChannelNotificationActivity, subscribeChooseUbahVisaCardEvent.b, 17);
            }
        }
    }

    public static void d(DetailBerhasilEChannelNotificationActivity detailBerhasilEChannelNotificationActivity, int i, int[] iArr) {
        if (i == 17 && Predicate.c(iArr)) {
            detailBerhasilEChannelNotificationActivity.s();
        }
    }

    public static void e(DetailBerhasilEChannelNotificationActivity detailBerhasilEChannelNotificationActivity) {
        String[] strArr = b;
        if (Predicate.c(detailBerhasilEChannelNotificationActivity, strArr)) {
            detailBerhasilEChannelNotificationActivity.s();
        } else if (Predicate.b(detailBerhasilEChannelNotificationActivity, strArr)) {
            DetailBerhasilEChannelNotificationActivity.b((LogRedirector.Logger) new RemoteActionCompatParcelizer(detailBerhasilEChannelNotificationActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailBerhasilEChannelNotificationActivity, strArr, 17);
        }
    }
}
