package o;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setExpID.class */
public interface setExpID extends IInterface {

    /* loaded from: classes-dex2jar.jar:o/setExpID$read.class */
    public static abstract class read extends getBeritaPenerima implements setExpID {
        public read() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static setExpID a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof setExpID ? (setExpID) queryLocalInterface : new setResSubDistrict(iBinder);
        }

        @Override // o.getBeritaPenerima
        public final boolean c(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            Account d = d();
            parcel2.writeNoException();
            getBiayaTransfer.c(parcel2, d);
            return true;
        }
    }

    Account d() throws RemoteException;
}
