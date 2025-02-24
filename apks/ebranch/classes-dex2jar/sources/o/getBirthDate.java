package o;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes-dex2jar.jar:o/getBirthDate.class */
public abstract class getBirthDate extends Category$$Parcelable implements getBcaDebitCardType {
    public static getBcaDebitCardType c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return queryLocalInterface instanceof getBcaDebitCardType ? (getBcaDebitCardType) queryLocalInterface : new CreditCard(iBinder);
    }
}
