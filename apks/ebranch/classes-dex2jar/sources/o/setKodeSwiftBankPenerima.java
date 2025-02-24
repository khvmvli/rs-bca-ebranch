package o;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* loaded from: classes-dex2jar.jar:o/setKodeSwiftBankPenerima.class */
public final class setKodeSwiftBankPenerima {
    public static getBcaDebitCardType e;

    public static setKeteranganAlamatBankPenerima b(int i) {
        try {
            getBcaDebitCardType getbcadebitcardtype = e;
            if (getbcadebitcardtype != null) {
                return new setKeteranganAlamatBankPenerima(getbcadebitcardtype.d(i));
            }
            throw new NullPointerException("IBitmapDescriptorFactory is not initialized");
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }
}
