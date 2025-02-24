package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setSalary.class */
public final class setSalary extends getBankTujuanCode implements setNumberID {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setSalary(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // o.setNumberID
    public final int c() throws RemoteException {
        Parcel a = a(2, b());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    @Override // o.setNumberID
    public final realmSet$noHpKontakPengirim e() throws RemoteException {
        Parcel a = a(1, b());
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(a.readStrongBinder());
        a.recycle();
        return d;
    }
}
