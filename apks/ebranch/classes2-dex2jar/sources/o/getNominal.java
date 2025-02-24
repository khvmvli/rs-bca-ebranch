package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes2-dex2jar.jar:o/getNominal.class */
public final class getNominal implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        setLanguage setlanguage = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 1) {
                i = SafeParcelReader.k(parcel, b);
            } else if (b2 != 2) {
                SafeParcelReader.p(parcel, b);
            } else {
                setlanguage = (setLanguage) SafeParcelReader.b(parcel, b, setLanguage.CREATOR);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new getJenisWarkat(i, setlanguage);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new getJenisWarkat[i];
    }
}
