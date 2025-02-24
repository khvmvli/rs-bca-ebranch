package o;

import android.os.RemoteException;
import o.realmGet$salaryValue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmSet$numberID.class */
public final class realmSet$numberID extends realmGet$salaryValue {
    final /* synthetic */ realmGet$salaryValue.read c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public realmSet$numberID(realmGet$salaryValue.read read, realmGet$job[] realmget_jobArr, boolean z, int i) {
        super(realmget_jobArr, z, i);
        this.c = read;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.realmGet$salaryValue
    public final void b(realmGet$name$MediaBrowserCompat$CustomActionResultReceiver realmget_name_mediabrowsercompat_customactionresultreceiver, setJenisWarkat setjeniswarkat) throws RemoteException {
        this.c.a.b(realmget_name_mediabrowsercompat_customactionresultreceiver, setjeniswarkat);
    }
}
