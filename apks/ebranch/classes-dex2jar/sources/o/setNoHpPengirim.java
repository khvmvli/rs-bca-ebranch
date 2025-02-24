package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/setNoHpPengirim.class */
public final class setNoHpPengirim implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Float f = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 2) {
                i = SafeParcelReader.k(parcel, b);
            } else if (b2 != 3) {
                SafeParcelReader.p(parcel, b);
            } else {
                f = SafeParcelReader.o(parcel, b);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new setKotaPenerima(i, f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new setKotaPenerima[i];
    }
}
