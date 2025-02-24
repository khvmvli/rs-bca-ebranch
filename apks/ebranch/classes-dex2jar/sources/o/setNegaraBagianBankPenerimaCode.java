package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/setNegaraBagianBankPenerimaCode.class */
public final class setNegaraBagianBankPenerimaCode implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            if (SafeParcelReader.b(b) != 2) {
                SafeParcelReader.p(parcel, b);
            } else {
                i = SafeParcelReader.k(parcel, b);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new setNegaraBagianBankPenerima(i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new setNegaraBagianBankPenerima[i];
    }
}
