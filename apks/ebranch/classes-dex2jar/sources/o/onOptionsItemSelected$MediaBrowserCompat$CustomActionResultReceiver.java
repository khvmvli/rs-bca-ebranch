package o;

import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver {
    final Method a;
    final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver(int i, Method method) {
        this.d = i;
        this.a = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver onoptionsitemselected_mediabrowsercompat_customactionresultreceiver = (onOptionsItemSelected$MediaBrowserCompat$CustomActionResultReceiver) obj;
        if (this.d != onoptionsitemselected_mediabrowsercompat_customactionresultreceiver.d || !this.a.getName().equals(onoptionsitemselected_mediabrowsercompat_customactionresultreceiver.a.getName())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return (this.d * 31) + this.a.getName().hashCode();
    }
}
