package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes-dex2jar.jar:o/setNegaraTujuanPenerimaISO.class */
public final class setNegaraTujuanPenerimaISO implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 2) {
                d = SafeParcelReader.i(parcel, b);
            } else if (b2 != 3) {
                SafeParcelReader.p(parcel, b);
            } else {
                d2 = SafeParcelReader.i(parcel, b);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new LatLng(d, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }
}
