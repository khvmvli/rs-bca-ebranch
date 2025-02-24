package o;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import o.setCitizenValue;
/* loaded from: classes2-dex2jar.jar:o/setCodeTransaksi.class */
public final class setCodeTransaksi extends setCitizenValue<realmSet$isInputAtmPemrek> {
    public setCodeTransaksi(Context context, Looper looper, setCitizenValue.IconCompatParcelizer iconCompatParcelizer, setCitizenValue.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver) {
        super(context, looper, 93, iconCompatParcelizer, customActionResultReceiver, (String) null);
    }

    public final String A() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final String D() {
        return "com.google.android.gms.measurement.START";
    }

    public final int a() {
        return 12451000;
    }

    public final /* synthetic */ IInterface d(IBinder iBinder) {
        IInterface iInterface;
        if (iBinder == null) {
            iInterface = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
            iInterface = queryLocalInterface instanceof realmSet$isInputAtmPemrek ? (realmSet$isInputAtmPemrek) queryLocalInterface : new realmSet$noRekeningTeller(iBinder);
        }
        return iInterface;
    }
}
