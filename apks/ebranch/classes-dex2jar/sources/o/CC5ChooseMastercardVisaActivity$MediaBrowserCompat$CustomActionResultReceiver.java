package o;

import com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/CC5ChooseMastercardVisaActivity$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class CC5ChooseMastercardVisaActivity$MediaBrowserCompat$CustomActionResultReceiver implements LogRedirector.Logger {
    private final WeakReference<DetailTundaEChannelNotificationActivity> e;

    private CC5ChooseMastercardVisaActivity$MediaBrowserCompat$CustomActionResultReceiver(DetailTundaEChannelNotificationActivity detailTundaEChannelNotificationActivity) {
        this.e = new WeakReference<>(detailTundaEChannelNotificationActivity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ CC5ChooseMastercardVisaActivity$MediaBrowserCompat$CustomActionResultReceiver(DetailTundaEChannelNotificationActivity detailTundaEChannelNotificationActivity, byte b) {
        this(detailTundaEChannelNotificationActivity);
    }

    public final void a() {
        DetailTundaEChannelNotificationActivity detailTundaEChannelNotificationActivity = this.e.get();
        if (detailTundaEChannelNotificationActivity != null) {
            setOnHierarchyChangeListener.a(detailTundaEChannelNotificationActivity, CC5ChooseMastercardVisaActivity.c, 33);
        }
    }
}
