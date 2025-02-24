package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/getBankTujuanCode.class */
public class getBankTujuanCode implements IInterface {
    private final IBinder b;
    private final String d;

    public getBankTujuanCode(IBinder iBinder, String str) {
        this.b = iBinder;
        this.d = str;
    }

    public final Parcel a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.b.transact(i, parcel, obtain, 0);
                obtain.readException();
                parcel.recycle();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }

    public final Parcel b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.d);
        return obtain;
    }
}
