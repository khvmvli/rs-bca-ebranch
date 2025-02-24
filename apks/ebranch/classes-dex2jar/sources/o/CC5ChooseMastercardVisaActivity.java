package o;

import com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/CC5ChooseMastercardVisaActivity.class */
public final class CC5ChooseMastercardVisaActivity {
    private static final String[] c = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void c(DetailTundaEChannelNotificationActivity detailTundaEChannelNotificationActivity) {
        String[] strArr = c;
        if (Predicate.c(detailTundaEChannelNotificationActivity, strArr)) {
            detailTundaEChannelNotificationActivity.y();
        } else if (Predicate.b(detailTundaEChannelNotificationActivity, strArr)) {
            DetailTundaEChannelNotificationActivity.e((LogRedirector.Logger) new CC5ChooseMastercardVisaActivity$MediaBrowserCompat$CustomActionResultReceiver(detailTundaEChannelNotificationActivity, (byte) 0));
        } else {
            setOnHierarchyChangeListener.a(detailTundaEChannelNotificationActivity, strArr, 33);
        }
    }

    public static void c(DetailTundaEChannelNotificationActivity detailTundaEChannelNotificationActivity, int i, int[] iArr) {
        if (i == 33 && Predicate.c(iArr)) {
            detailTundaEChannelNotificationActivity.y();
        }
    }
}
