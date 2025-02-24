package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
/* loaded from: classes-dex2jar.jar:o/setNegaraTujuanPenerima.class */
public final class setNegaraTujuanPenerima implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d = 0.0d;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            switch (SafeParcelReader.b(b)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.b(parcel, b, LatLng.CREATOR);
                    break;
                case 3:
                    d = SafeParcelReader.i(parcel, b);
                    break;
                case 4:
                    f = SafeParcelReader.m(parcel, b);
                    break;
                case 5:
                    i = SafeParcelReader.k(parcel, b);
                    break;
                case 6:
                    i2 = SafeParcelReader.k(parcel, b);
                    break;
                case 7:
                    f2 = SafeParcelReader.m(parcel, b);
                    break;
                case 8:
                    z = SafeParcelReader.j(parcel, b);
                    break;
                case 9:
                    z2 = SafeParcelReader.j(parcel, b);
                    break;
                case 10:
                    arrayList = SafeParcelReader.c(parcel, b, setKotaPenerima.CREATOR);
                    break;
                default:
                    SafeParcelReader.p(parcel, b);
                    break;
            }
        }
        SafeParcelReader.d(parcel, a);
        return new setKotaBankPenerima(latLng, d, f, i, i2, f2, z, z2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new setKotaBankPenerima[i];
    }
}
