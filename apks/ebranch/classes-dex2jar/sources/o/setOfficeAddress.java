package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/setOfficeAddress.class */
public final class setOfficeAddress implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 1) {
                i = SafeParcelReader.k(parcel, b);
            } else if (b2 == 2) {
                z = SafeParcelReader.j(parcel, b);
            } else if (b2 == 3) {
                z2 = SafeParcelReader.j(parcel, b);
            } else if (b2 == 4) {
                i2 = SafeParcelReader.k(parcel, b);
            } else if (b2 != 5) {
                SafeParcelReader.p(parcel, b);
            } else {
                i3 = SafeParcelReader.k(parcel, b);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new setFlagNPWP(i, z, z2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new setFlagNPWP[i];
    }
}
