package androidx.lifecycle;

import o.onOptionsItemSelected;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.onResume;
import o.performContextItemSelected;
/* loaded from: classes-dex2jar.jar:androidx/lifecycle/ReflectiveGenericLifecycleObserver.class */
public class ReflectiveGenericLifecycleObserver implements onResume {
    private final Object a;
    private final onOptionsItemSelected.write c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.c = onOptionsItemSelected.b.a(obj.getClass());
    }

    @Override // o.onResume
    public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        onOptionsItemSelected.write write = this.c;
        Object obj = this.a;
        onOptionsItemSelected.write.a(write.a.get(onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver), performcontextitemselected, onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver, obj);
        onOptionsItemSelected.write.a(write.a.get(onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver.ON_ANY), performcontextitemselected, onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver, obj);
    }
}
