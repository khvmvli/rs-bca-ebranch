package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/setResAddress.class */
public final class setResAddress implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Bundle bundle = null;
        realmGet$job[] realmget_jobArr = null;
        setCurrentPage setcurrentpage = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 1) {
                bundle = SafeParcelReader.c(parcel, b);
            } else if (b2 == 2) {
                realmget_jobArr = (realmGet$job[]) SafeParcelReader.d(parcel, b, realmGet$job.CREATOR);
            } else if (b2 == 3) {
                i = SafeParcelReader.k(parcel, b);
            } else if (b2 != 4) {
                SafeParcelReader.p(parcel, b);
            } else {
                setcurrentpage = (setCurrentPage) SafeParcelReader.b(parcel, b, setCurrentPage.CREATOR);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new setReligion(bundle, realmget_jobArr, i, setcurrentpage);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new setReligion[i];
    }
}
