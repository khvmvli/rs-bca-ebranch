package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/CreditCard.class */
public final class CreditCard extends realmGet$code implements getBcaDebitCardType {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CreditCard(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // o.getBcaDebitCardType
    public final realmSet$noHpKontakPengirim d(int i) throws RemoteException {
        Parcel m_ = m_();
        m_.writeInt(i);
        Parcel c = c(1, m_);
        realmSet$noHpKontakPengirim d = realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.d(c.readStrongBinder());
        c.recycle();
        return d;
    }
}
