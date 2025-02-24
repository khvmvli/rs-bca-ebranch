package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes-dex2jar.jar:o/realmGet$description.class */
public final class realmGet$description extends realmGet$code implements cascadeDelete {
    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$description(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // o.cascadeDelete
    public final int a() throws RemoteException {
        Parcel c = c(17, m_());
        int readInt = c.readInt();
        c.recycle();
        return readInt;
    }

    @Override // o.cascadeDelete
    public final LatLng b() throws RemoteException {
        Parcel c = c(4, m_());
        LatLng latLng = (LatLng) getAutodebetAccountNumber.e(c, LatLng.CREATOR);
        c.recycle();
        return latLng;
    }

    @Override // o.cascadeDelete
    public final void d() throws RemoteException {
        e(11, m_());
    }

    @Override // o.cascadeDelete
    public final void d(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, realmset_nohpkontakpengirim);
        e(18, m_);
    }

    @Override // o.cascadeDelete
    public final boolean d(cascadeDelete cascadedelete) throws RemoteException {
        Parcel m_ = m_();
        getAutodebetAccountNumber.c(m_, cascadedelete);
        Parcel c = c(16, m_);
        boolean d = getAutodebetAccountNumber.d(c);
        c.recycle();
        return d;
    }

    @Override // o.cascadeDelete
    public final void e() throws RemoteException {
        e(12, m_());
    }

    @Override // o.cascadeDelete
    public final void j() throws RemoteException {
        e(1, m_());
    }
}
