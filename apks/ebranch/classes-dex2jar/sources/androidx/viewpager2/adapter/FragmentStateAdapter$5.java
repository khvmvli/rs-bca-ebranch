package androidx.viewpager2.adapter;

import android.os.Handler;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.onResume;
import o.performContextItemSelected;
/* loaded from: classes-dex2jar.jar:androidx/viewpager2/adapter/FragmentStateAdapter$5.class */
public class FragmentStateAdapter$5 implements onResume {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Handler e;

    @Override // o.onResume
    public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY) {
            this.e.removeCallbacks(this.a);
            performcontextitemselected.getLifecycle().e(this);
        }
    }
}
