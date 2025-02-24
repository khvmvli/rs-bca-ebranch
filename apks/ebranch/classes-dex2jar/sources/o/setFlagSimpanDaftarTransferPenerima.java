package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setFlagSimpanDaftarTransferPenerima.class */
public final class setFlagSimpanDaftarTransferPenerima extends realmGet$code implements realmSet$SumberDanaTransaksiKode {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setFlagSimpanDaftarTransferPenerima(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // o.realmSet$SumberDanaTransaksiKode
    public final void d(boolean z) throws RemoteException {
        Parcel m_ = m_();
        int i = getAutodebetAccountNumber.e;
        m_.writeInt(z ? 1 : 0);
        e(1, m_);
    }
}
