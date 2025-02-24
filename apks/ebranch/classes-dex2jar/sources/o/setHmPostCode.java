package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes-dex2jar.jar:o/setHmPostCode.class */
public final class setHmPostCode extends setSumberDanaTransaksi implements IInterface {
    public setHmPostCode(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void d(setHandPhoneNumber sethandphonenumber) throws RemoteException {
        Parcel d = d();
        setStatusKewarganegaraanPengirim.e(d, sethandphonenumber);
        a(1, d);
    }
}
