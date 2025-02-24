package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setNamaPengirim.class */
public class setNamaPengirim implements IInterface {
    private final IBinder d;
    private final String e;

    /* JADX INFO: Access modifiers changed from: protected */
    public setNamaPengirim(IBinder iBinder, String str) {
        this.d = iBinder;
        this.e = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel e(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.d.transact(i, parcel, obtain, 0);
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel k_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.e);
        return obtain;
    }
}
