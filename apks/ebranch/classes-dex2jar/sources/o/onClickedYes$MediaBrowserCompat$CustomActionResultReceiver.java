package o;

import com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/onClickedYes$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class onClickedYes$MediaBrowserCompat$CustomActionResultReceiver implements LogRedirector.Logger {
    private final WeakReference<DetailBerhasilTellerNotificationActivity> c;

    private onClickedYes$MediaBrowserCompat$CustomActionResultReceiver(DetailBerhasilTellerNotificationActivity detailBerhasilTellerNotificationActivity) {
        this.c = new WeakReference<>(detailBerhasilTellerNotificationActivity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ onClickedYes$MediaBrowserCompat$CustomActionResultReceiver(DetailBerhasilTellerNotificationActivity detailBerhasilTellerNotificationActivity, byte b) {
        this(detailBerhasilTellerNotificationActivity);
    }

    public final void a() {
        DetailBerhasilTellerNotificationActivity detailBerhasilTellerNotificationActivity = this.c.get();
        if (detailBerhasilTellerNotificationActivity != null) {
            setOnHierarchyChangeListener.a(detailBerhasilTellerNotificationActivity, onClickedYes.c, 27);
        }
    }
}
