package o;

import com.bca.smartbranch.activity.DetailTundaTellerActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/subscribeRemoveMasterCardEvent$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class subscribeRemoveMasterCardEvent$MediaBrowserCompat$CustomActionResultReceiver implements LogRedirector.Logger {
    private final WeakReference<DetailTundaTellerActivity> d;

    private subscribeRemoveMasterCardEvent$MediaBrowserCompat$CustomActionResultReceiver(DetailTundaTellerActivity detailTundaTellerActivity) {
        this.d = new WeakReference<>(detailTundaTellerActivity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ subscribeRemoveMasterCardEvent$MediaBrowserCompat$CustomActionResultReceiver(DetailTundaTellerActivity detailTundaTellerActivity, byte b) {
        this(detailTundaTellerActivity);
    }

    public final void a() {
        DetailTundaTellerActivity detailTundaTellerActivity = this.d.get();
        if (detailTundaTellerActivity != null) {
            setOnHierarchyChangeListener.a(detailTundaTellerActivity, subscribeRemoveMasterCardEvent.a, 37);
        }
    }
}
