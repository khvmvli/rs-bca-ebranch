package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/setExpired.class */
public final class setExpired implements Parcelable.Creator<realmSet$expired> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ realmSet$expired createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        realmGet$expired realmget_expired = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 1) {
                i = SafeParcelReader.k(parcel, b);
            } else if (b2 == 2) {
                realmget_expired = (realmGet$expired) SafeParcelReader.b(parcel, b, realmGet$expired.CREATOR);
            } else if (b2 == 3) {
                iBinder = SafeParcelReader.l(parcel, b);
            } else if (b2 != 4) {
                SafeParcelReader.p(parcel, b);
            } else {
                iBinder2 = SafeParcelReader.l(parcel, b);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new realmSet$expired(i, realmget_expired, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ realmSet$expired[] newArray(int i) {
        return new realmSet$expired[i];
    }
}
