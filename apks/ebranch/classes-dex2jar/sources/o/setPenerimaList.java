package o;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes-dex2jar.jar:o/setPenerimaList.class */
public abstract class setPenerimaList extends setNoTelpKontakPengirim implements setNoHpKontakPengirim {
    public static setNoHpKontakPengirim a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof setNoHpKontakPengirim ? (setNoHpKontakPengirim) queryLocalInterface : new setSaranaPembayaranPengirim(iBinder);
    }
}
