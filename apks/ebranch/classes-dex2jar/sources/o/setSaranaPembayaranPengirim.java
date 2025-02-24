package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setSaranaPembayaranPengirim.class */
public final class setSaranaPembayaranPengirim extends setNamaPengirim implements setNoHpKontakPengirim {
    /* JADX INFO: Access modifiers changed from: package-private */
    public setSaranaPembayaranPengirim(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // o.setNoHpKontakPengirim
    public final String a() throws RemoteException {
        Parcel e = e(1, k_());
        String readString = e.readString();
        e.recycle();
        return readString;
    }

    @Override // o.setNoHpKontakPengirim
    public final boolean e() throws RemoteException {
        Parcel e = e(6, k_());
        boolean a = setNoWarkatTransaksi.a(e);
        e.recycle();
        return a;
    }

    @Override // o.setNoHpKontakPengirim
    public final boolean e(boolean z) throws RemoteException {
        Parcel k_ = k_();
        setNoWarkatTransaksi.b(k_, true);
        Parcel e = e(2, k_);
        boolean a = setNoWarkatTransaksi.a(e);
        e.recycle();
        return a;
    }
}
