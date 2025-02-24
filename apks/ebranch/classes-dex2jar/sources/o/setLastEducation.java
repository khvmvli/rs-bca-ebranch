package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/setLastEducation.class */
public final class setLastEducation implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        IBinder iBinder = null;
        realmGet$jobValue realmget_jobvalue = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 1) {
                i = SafeParcelReader.k(parcel, b);
            } else if (b2 == 2) {
                iBinder = SafeParcelReader.l(parcel, b);
            } else if (b2 == 3) {
                realmget_jobvalue = (realmGet$jobValue) SafeParcelReader.b(parcel, b, realmGet$jobValue.CREATOR);
            } else if (b2 == 4) {
                z = SafeParcelReader.j(parcel, b);
            } else if (b2 != 5) {
                SafeParcelReader.p(parcel, b);
            } else {
                z2 = SafeParcelReader.j(parcel, b);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new setMaritalStatus(i, iBinder, realmget_jobvalue, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new setMaritalStatus[i];
    }
}
