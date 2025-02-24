package o;

import com.bca.smartbranch.activity.AktivasiEChannelSuccessActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/showDialogCaraPembayaran$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class showDialogCaraPembayaran$MediaBrowserCompat$CustomActionResultReceiver implements LogRedirector.Logger {
    private final WeakReference<AktivasiEChannelSuccessActivity> e;

    private showDialogCaraPembayaran$MediaBrowserCompat$CustomActionResultReceiver(AktivasiEChannelSuccessActivity aktivasiEChannelSuccessActivity) {
        this.e = new WeakReference<>(aktivasiEChannelSuccessActivity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ showDialogCaraPembayaran$MediaBrowserCompat$CustomActionResultReceiver(AktivasiEChannelSuccessActivity aktivasiEChannelSuccessActivity, byte b) {
        this(aktivasiEChannelSuccessActivity);
    }

    public final void a() {
        AktivasiEChannelSuccessActivity aktivasiEChannelSuccessActivity = this.e.get();
        if (aktivasiEChannelSuccessActivity != null) {
            setOnHierarchyChangeListener.a(aktivasiEChannelSuccessActivity, showDialogCaraPembayaran.d, 1);
        }
    }
}
