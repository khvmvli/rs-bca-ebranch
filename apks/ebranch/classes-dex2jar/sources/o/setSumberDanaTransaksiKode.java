package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
/* loaded from: classes-dex2jar.jar:o/setSumberDanaTransaksiKode.class */
public final class setSumberDanaTransaksiKode implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int b13 = SafeParcelReader.b(parcel);
            switch (SafeParcelReader.b(b13)) {
                case 2:
                    b = SafeParcelReader.f(parcel, b13);
                    break;
                case 3:
                    b2 = SafeParcelReader.f(parcel, b13);
                    break;
                case 4:
                    i = SafeParcelReader.k(parcel, b13);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.b(parcel, b13, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = SafeParcelReader.f(parcel, b13);
                    break;
                case 7:
                    b4 = SafeParcelReader.f(parcel, b13);
                    break;
                case 8:
                    b5 = SafeParcelReader.f(parcel, b13);
                    break;
                case 9:
                    b6 = SafeParcelReader.f(parcel, b13);
                    break;
                case 10:
                    b7 = SafeParcelReader.f(parcel, b13);
                    break;
                case 11:
                    b8 = SafeParcelReader.f(parcel, b13);
                    break;
                case 12:
                    b9 = SafeParcelReader.f(parcel, b13);
                    break;
                case 13:
                case 22:
                default:
                    SafeParcelReader.p(parcel, b13);
                    break;
                case 14:
                    b10 = SafeParcelReader.f(parcel, b13);
                    break;
                case 15:
                    b11 = SafeParcelReader.f(parcel, b13);
                    break;
                case 16:
                    f = SafeParcelReader.o(parcel, b13);
                    break;
                case 17:
                    f2 = SafeParcelReader.o(parcel, b13);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.b(parcel, b13, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = SafeParcelReader.f(parcel, b13);
                    break;
                case 20:
                    num = SafeParcelReader.n(parcel, b13);
                    break;
                case 21:
                    str = SafeParcelReader.b(parcel, b13);
                    break;
                case 23:
                    i2 = SafeParcelReader.k(parcel, b13);
                    break;
            }
        }
        SafeParcelReader.d(parcel, a);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12, num, str, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
