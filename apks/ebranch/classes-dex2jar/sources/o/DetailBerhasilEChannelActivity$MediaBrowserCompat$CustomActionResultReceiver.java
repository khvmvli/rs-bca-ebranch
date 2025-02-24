package o;

import com.bca.smartbranch.activity.ReservasiSuccessEChannelActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/DetailBerhasilEChannelActivity$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class DetailBerhasilEChannelActivity$MediaBrowserCompat$CustomActionResultReceiver implements LogRedirector.Logger {
    private final WeakReference<ReservasiSuccessEChannelActivity> b;

    private DetailBerhasilEChannelActivity$MediaBrowserCompat$CustomActionResultReceiver(ReservasiSuccessEChannelActivity reservasiSuccessEChannelActivity) {
        this.b = new WeakReference<>(reservasiSuccessEChannelActivity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ DetailBerhasilEChannelActivity$MediaBrowserCompat$CustomActionResultReceiver(ReservasiSuccessEChannelActivity reservasiSuccessEChannelActivity, byte b) {
        this(reservasiSuccessEChannelActivity);
    }

    public final void a() {
        ReservasiSuccessEChannelActivity reservasiSuccessEChannelActivity = this.b.get();
        if (reservasiSuccessEChannelActivity != null) {
            setOnHierarchyChangeListener.a(reservasiSuccessEChannelActivity, DetailBerhasilEChannelActivity.e, 55);
        }
    }
}
