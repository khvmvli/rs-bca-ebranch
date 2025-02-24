package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/realmSet$statusKewarganegaraanPenerima.class */
public class realmSet$statusKewarganegaraanPenerima implements IInterface {
    private final IBinder c;
    private final String e;

    public realmSet$statusKewarganegaraanPenerima(IBinder iBinder, String str) {
        this.c = iBinder;
        this.e = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel b() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.e);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.c.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
