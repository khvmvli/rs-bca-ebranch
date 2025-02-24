package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* loaded from: classes2-dex2jar.jar:o/getKodeBank.class */
public final class getKodeBank implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 1) {
                arrayList = SafeParcelReader.a(parcel, b);
            } else if (b2 != 2) {
                SafeParcelReader.p(parcel, b);
            } else {
                str = SafeParcelReader.b(parcel, b);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new getNamaBank(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new getNamaBank[i];
    }
}
