package o;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes-dex2jar.jar:o/setOccupationFlagFreeText.class */
public abstract class setOccupationFlagFreeText extends getBeritaPenerima implements setOfficeName {
    public static setOfficeName c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof setOfficeName ? (setOfficeName) queryLocalInterface : new setName(iBinder);
    }
}
