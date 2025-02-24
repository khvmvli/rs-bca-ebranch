package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
/* loaded from: classes-dex2jar.jar:o/setPPUNumber.class */
public final class setPPUNumber implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        setNegaraBagianBankPenerima setnegarabagianbankpenerima = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < a) {
            int b6 = SafeParcelReader.b(parcel);
            switch (SafeParcelReader.b(b6)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) SafeParcelReader.b(parcel, b6, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.b(parcel, b6);
                    break;
                case 4:
                    latLng = (LatLng) SafeParcelReader.b(parcel, b6, LatLng.CREATOR);
                    break;
                case 5:
                    num = SafeParcelReader.n(parcel, b6);
                    break;
                case 6:
                    b = SafeParcelReader.f(parcel, b6);
                    break;
                case 7:
                    b2 = SafeParcelReader.f(parcel, b6);
                    break;
                case 8:
                    b3 = SafeParcelReader.f(parcel, b6);
                    break;
                case 9:
                    b4 = SafeParcelReader.f(parcel, b6);
                    break;
                case 10:
                    b5 = SafeParcelReader.f(parcel, b6);
                    break;
                case 11:
                    setnegarabagianbankpenerima = (setNegaraBagianBankPenerima) SafeParcelReader.b(parcel, b6, setNegaraBagianBankPenerima.CREATOR);
                    break;
                default:
                    SafeParcelReader.p(parcel, b6);
                    break;
            }
        }
        SafeParcelReader.d(parcel, a);
        return new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b, b2, b3, b4, b5, setnegarabagianbankpenerima);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
