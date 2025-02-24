package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* loaded from: classes-dex2jar.jar:o/setNegaraTujuanTransaksi.class */
public final class setNegaraTujuanTransaksi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 2) {
                latLng = (LatLng) SafeParcelReader.b(parcel, b, LatLng.CREATOR);
            } else if (b2 != 3) {
                SafeParcelReader.p(parcel, b);
            } else {
                latLng2 = (LatLng) SafeParcelReader.b(parcel, b, LatLng.CREATOR);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
