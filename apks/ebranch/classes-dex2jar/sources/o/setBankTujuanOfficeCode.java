package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/setBankTujuanOfficeCode.class */
public final class setBankTujuanOfficeCode implements Parcelable.Creator<C0026realmSet$norekPenerima> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C0026realmSet$norekPenerima createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Status status = null;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            if (SafeParcelReader.b(b) != 1) {
                SafeParcelReader.p(parcel, b);
            } else {
                status = (Status) SafeParcelReader.b(parcel, b, Status.CREATOR);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new C0026realmSet$norekPenerima(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C0026realmSet$norekPenerima[] newArray(int i) {
        return new C0026realmSet$norekPenerima[i];
    }
}
