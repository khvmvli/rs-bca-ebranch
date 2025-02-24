package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/getBcaDebitCardNumber.class */
public final class getBcaDebitCardNumber extends realmGet$code implements getAutodebetPercentage {
    /* JADX INFO: Access modifiers changed from: package-private */
    public getBcaDebitCardNumber(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // o.getAutodebetPercentage
    public final int a() throws RemoteException {
        Parcel c = c(18, m_());
        int readInt = c.readInt();
        c.recycle();
        return readInt;
    }

    @Override // o.getAutodebetPercentage
    public final boolean a(getAutodebetPercentage getautodebetpercentage) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, getautodebetpercentage);
        Parcel c = c(17, m_);
        boolean d = getAutodebetAccountNumber.d(c);
        c.recycle();
        return d;
    }

    @Override // o.getAutodebetPercentage
    public final void d() throws RemoteException {
        e(1, m_());
    }
}
