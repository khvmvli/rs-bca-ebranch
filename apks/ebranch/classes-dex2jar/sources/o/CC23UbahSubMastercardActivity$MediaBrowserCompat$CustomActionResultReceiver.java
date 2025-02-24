package o;

import com.bca.smartbranch.activity.DetailBerhasilBTActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/CC23UbahSubMastercardActivity$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class CC23UbahSubMastercardActivity$MediaBrowserCompat$CustomActionResultReceiver implements LogRedirector.Logger {
    private final WeakReference<DetailBerhasilBTActivity> d;

    private CC23UbahSubMastercardActivity$MediaBrowserCompat$CustomActionResultReceiver(DetailBerhasilBTActivity detailBerhasilBTActivity) {
        this.d = new WeakReference<>(detailBerhasilBTActivity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ CC23UbahSubMastercardActivity$MediaBrowserCompat$CustomActionResultReceiver(DetailBerhasilBTActivity detailBerhasilBTActivity, byte b) {
        this(detailBerhasilBTActivity);
    }

    public final void a() {
        DetailBerhasilBTActivity detailBerhasilBTActivity = this.d.get();
        if (detailBerhasilBTActivity != null) {
            setOnHierarchyChangeListener.a(detailBerhasilBTActivity, CC23UbahSubMastercardActivity.d, 14);
        }
    }
}
