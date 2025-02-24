package androidx.fragment.app;

import android.os.Bundle;
import o.isDetached;
import o.onRequestPermissionsResult;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.onResume;
import o.performContextItemSelected;
/* loaded from: classes-dex2jar.jar:androidx/fragment/app/FragmentManager$6.class */
public class FragmentManager$6 implements onResume {
    final /* synthetic */ onRequestPermissionsResult a;
    final /* synthetic */ String b;
    final /* synthetic */ isDetached e;

    @Override // o.onResume
    public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_START && ((Bundle) this.e.t.get(this.b)) != null) {
            isDetached isdetached = this.e;
            isdetached.t.remove(this.b);
        }
        if (onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver == onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_DESTROY) {
            this.a.e(this);
            this.e.L.remove(this.b);
        }
    }
}
