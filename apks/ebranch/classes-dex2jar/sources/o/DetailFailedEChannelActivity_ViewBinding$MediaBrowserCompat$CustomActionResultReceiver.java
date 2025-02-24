package o;

import com.bca.smartbranch.activity.UbahProfilActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/DetailFailedEChannelActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class DetailFailedEChannelActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver implements LogRedirector.Logger {
    private final WeakReference<UbahProfilActivity> c;

    private DetailFailedEChannelActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(UbahProfilActivity ubahProfilActivity) {
        this.c = new WeakReference<>(ubahProfilActivity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ DetailFailedEChannelActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(UbahProfilActivity ubahProfilActivity, byte b) {
        this(ubahProfilActivity);
    }

    public final void a() {
        UbahProfilActivity ubahProfilActivity = this.c.get();
        if (ubahProfilActivity != null) {
            setOnHierarchyChangeListener.a(ubahProfilActivity, DetailFailedEChannelActivity_ViewBinding.d, 60);
        }
    }
}
