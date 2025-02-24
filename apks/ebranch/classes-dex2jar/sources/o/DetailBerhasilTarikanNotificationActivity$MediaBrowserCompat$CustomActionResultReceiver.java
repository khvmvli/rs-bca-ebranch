package o;

import com.bca.smartbranch.activity.ReservasiTundaSuccessActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/DetailBerhasilTarikanNotificationActivity$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class DetailBerhasilTarikanNotificationActivity$MediaBrowserCompat$CustomActionResultReceiver implements LogRedirector.Logger {
    private final WeakReference<ReservasiTundaSuccessActivity> a;

    private DetailBerhasilTarikanNotificationActivity$MediaBrowserCompat$CustomActionResultReceiver(ReservasiTundaSuccessActivity reservasiTundaSuccessActivity) {
        this.a = new WeakReference<>(reservasiTundaSuccessActivity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ DetailBerhasilTarikanNotificationActivity$MediaBrowserCompat$CustomActionResultReceiver(ReservasiTundaSuccessActivity reservasiTundaSuccessActivity, byte b) {
        this(reservasiTundaSuccessActivity);
    }

    public final void a() {
        ReservasiTundaSuccessActivity reservasiTundaSuccessActivity = this.a.get();
        if (reservasiTundaSuccessActivity != null) {
            setOnHierarchyChangeListener.a(reservasiTundaSuccessActivity, DetailBerhasilTarikanNotificationActivity.d, 58);
        }
    }
}
