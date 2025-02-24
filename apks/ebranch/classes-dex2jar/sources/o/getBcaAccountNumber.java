package o;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes-dex2jar.jar:o/getBcaAccountNumber.class */
public abstract class getBcaAccountNumber extends Category$$Parcelable implements getAutodebetPercentage {
    public static getAutodebetPercentage a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return queryLocalInterface instanceof getAutodebetPercentage ? (getAutodebetPercentage) queryLocalInterface : new getBcaDebitCardNumber(iBinder);
    }
}
