package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2-dex2jar.jar:o/getLocalClearingCodeBank.class */
public final class getLocalClearingCodeBank extends setSumberDanaTransaksi implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public getLocalClearingCodeBank(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(getJenisWarkat getjeniswarkat, getKodeJenisWarkat getkodejeniswarkat) throws RemoteException {
        Parcel d = d();
        setStatusKewarganegaraanPengirim.e(d, getjeniswarkat);
        setStatusKewarganegaraanPengirim.e(d, getkodejeniswarkat);
        c(12, d);
    }

    public final void c(int i) throws RemoteException {
        Parcel d = d();
        d.writeInt(i);
        c(7, d);
    }

    public final void e(setExpID setexpid, int i, boolean z) throws RemoteException {
        Parcel d = d();
        setStatusKewarganegaraanPengirim.e(d, setexpid);
        d.writeInt(i);
        d.writeInt(z ? 1 : 0);
        c(9, d);
    }
}
