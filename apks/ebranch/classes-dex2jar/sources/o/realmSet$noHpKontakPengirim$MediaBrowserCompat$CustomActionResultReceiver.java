package o;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes-dex2jar.jar:o/realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver.class */
public abstract class realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver extends getBeritaPenerima implements realmSet$noHpKontakPengirim {
    public realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static realmSet$noHpKontakPengirim d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof realmSet$noHpKontakPengirim ? (realmSet$noHpKontakPengirim) queryLocalInterface : new realmSet$noHpKontakPengirim(iBinder) { // from class: o.realmSet$statusPendudukPengirim
        };
    }
}
