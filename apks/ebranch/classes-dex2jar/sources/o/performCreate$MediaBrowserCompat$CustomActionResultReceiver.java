package o;

import o.onRequestPermissionsResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/performCreate$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class performCreate$MediaBrowserCompat$CustomActionResultReceiver {
    onRequestPermissionsResult.read b;
    onResume c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public performCreate$MediaBrowserCompat$CustomActionResultReceiver(performActivityCreated performactivitycreated, onRequestPermissionsResult.read read) {
        this.c = performDestroy.b(performactivitycreated);
        this.b = read;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        onRequestPermissionsResult.read e = onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver.e();
        this.b = performCreate.d(this.b, e);
        this.c.b(performcontextitemselected, onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver);
        this.b = e;
    }
}
