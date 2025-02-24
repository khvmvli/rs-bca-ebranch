package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setSumberDanaTransaksi.class */
public class setSumberDanaTransaksi implements IInterface {
    private final IBinder d;
    private final String e;

    public setSumberDanaTransaksi(IBinder iBinder, String str) {
        this.d = iBinder;
        this.e = str;
    }

    public final void a(int i, Parcel parcel) throws RemoteException {
        try {
            this.d.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    public final void c(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.d.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final Parcel d() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.e);
        return obtain;
    }
}
