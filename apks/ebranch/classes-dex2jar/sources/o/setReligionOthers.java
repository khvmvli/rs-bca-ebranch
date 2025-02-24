package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/setReligionOthers.class */
public final class setReligionOthers implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        setFlagNPWP setflagnpwp = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            switch (SafeParcelReader.b(b)) {
                case 1:
                    setflagnpwp = (setFlagNPWP) SafeParcelReader.b(parcel, b, setFlagNPWP.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.j(parcel, b);
                    break;
                case 3:
                    z2 = SafeParcelReader.j(parcel, b);
                    break;
                case 4:
                    iArr = SafeParcelReader.e(parcel, b);
                    break;
                case 5:
                    i = SafeParcelReader.k(parcel, b);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.e(parcel, b);
                    break;
                default:
                    SafeParcelReader.p(parcel, b);
                    break;
            }
        }
        SafeParcelReader.d(parcel, a);
        return new setCurrentPage(setflagnpwp, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new setCurrentPage[i];
    }
}
