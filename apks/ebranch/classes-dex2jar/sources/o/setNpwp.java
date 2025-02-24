package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setNpwp.class */
final class setNpwp implements setEmailIB {
    private final IBinder d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setNpwp(IBinder iBinder) {
        this.d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    @Override // o.setEmailIB
    public final void e(setFlagDifResidency setflagdifresidency, setDebitCardType setdebitcardtype) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(setflagdifresidency != null ? setflagdifresidency.asBinder() : null);
            if (setdebitcardtype != null) {
                obtain.writeInt(1);
                setReligionValue.a(setdebitcardtype, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.d.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
