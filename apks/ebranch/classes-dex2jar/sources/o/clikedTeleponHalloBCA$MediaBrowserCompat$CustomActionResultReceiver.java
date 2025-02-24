package o;

import com.bca.smartbranch.activity.OpenAccountSuccessActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/clikedTeleponHalloBCA$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class clikedTeleponHalloBCA$MediaBrowserCompat$CustomActionResultReceiver implements LogRedirector.Logger {
    private final WeakReference<OpenAccountSuccessActivity> b;

    private clikedTeleponHalloBCA$MediaBrowserCompat$CustomActionResultReceiver(OpenAccountSuccessActivity openAccountSuccessActivity) {
        this.b = new WeakReference<>(openAccountSuccessActivity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ clikedTeleponHalloBCA$MediaBrowserCompat$CustomActionResultReceiver(OpenAccountSuccessActivity openAccountSuccessActivity, byte b) {
        this(openAccountSuccessActivity);
    }

    public final void a() {
        OpenAccountSuccessActivity openAccountSuccessActivity = this.b.get();
        if (openAccountSuccessActivity != null) {
            setOnHierarchyChangeListener.a(openAccountSuccessActivity, clikedTeleponHalloBCA.b, 44);
        }
    }
}
