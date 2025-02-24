package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* loaded from: classes-dex2jar.jar:o/setHmVillage.class */
public final class setHmVillage implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 1) {
                i = SafeParcelReader.k(parcel, b);
            } else if (b2 != 2) {
                SafeParcelReader.p(parcel, b);
            } else {
                arrayList = SafeParcelReader.c(parcel, b, setFlagGuest.CREATOR);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new setHandPhoneNumber(i, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new setHandPhoneNumber[i];
    }
}
