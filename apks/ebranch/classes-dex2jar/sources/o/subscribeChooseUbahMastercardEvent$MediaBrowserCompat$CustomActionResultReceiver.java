package o;

import com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/subscribeChooseUbahMastercardEvent$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class subscribeChooseUbahMastercardEvent$MediaBrowserCompat$CustomActionResultReceiver implements LogRedirector.Logger {
    private final WeakReference<DetailBerhasilBTNotificationActivity> a;

    private subscribeChooseUbahMastercardEvent$MediaBrowserCompat$CustomActionResultReceiver(DetailBerhasilBTNotificationActivity detailBerhasilBTNotificationActivity) {
        this.a = new WeakReference<>(detailBerhasilBTNotificationActivity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ subscribeChooseUbahMastercardEvent$MediaBrowserCompat$CustomActionResultReceiver(DetailBerhasilBTNotificationActivity detailBerhasilBTNotificationActivity, byte b) {
        this(detailBerhasilBTNotificationActivity);
    }

    public final void a() {
        DetailBerhasilBTNotificationActivity detailBerhasilBTNotificationActivity = this.a.get();
        if (detailBerhasilBTNotificationActivity != null) {
            setOnHierarchyChangeListener.a(detailBerhasilBTNotificationActivity, subscribeChooseUbahMastercardEvent.c, 15);
        }
    }
}
