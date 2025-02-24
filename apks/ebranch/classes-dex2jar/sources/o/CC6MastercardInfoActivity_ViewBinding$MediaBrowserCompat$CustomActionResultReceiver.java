package o;

import com.bca.smartbranch.activity.FotoActivity;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/CC6MastercardInfoActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class CC6MastercardInfoActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver implements LogRedirector.Logger {
    private final WeakReference<FotoActivity> d;

    private CC6MastercardInfoActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(FotoActivity fotoActivity) {
        this.d = new WeakReference<>(fotoActivity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ CC6MastercardInfoActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(FotoActivity fotoActivity, byte b) {
        this(fotoActivity);
    }

    public final void a() {
        FotoActivity fotoActivity = this.d.get();
        if (fotoActivity != null) {
            setOnHierarchyChangeListener.a(fotoActivity, CC6MastercardInfoActivity_ViewBinding.c, 39);
        }
    }
}
