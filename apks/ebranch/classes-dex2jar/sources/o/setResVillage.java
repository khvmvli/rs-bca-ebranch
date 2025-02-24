package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setResVillage.class */
public abstract class setResVillage extends getBeritaPenerima implements setNumberID {
    public setResVillage() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static setNumberID e(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof setNumberID ? (setNumberID) queryLocalInterface : new setSalary(iBinder);
    }

    @Override // o.getBeritaPenerima
    public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            realmSet$noHpKontakPengirim e = e();
            parcel2.writeNoException();
            getBiayaTransfer.b(parcel2, e);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int c = c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
            return true;
        }
    }
}
