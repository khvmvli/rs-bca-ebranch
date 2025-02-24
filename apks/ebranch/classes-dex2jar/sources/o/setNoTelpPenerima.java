package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
/* loaded from: classes-dex2jar.jar:o/setNoTelpPenerima.class */
public final class setNoTelpPenerima implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 2) {
                f = SafeParcelReader.m(parcel, b);
            } else if (b2 == 3) {
                f2 = SafeParcelReader.m(parcel, b);
            } else if (b2 != 4) {
                SafeParcelReader.p(parcel, b);
            } else {
                f3 = SafeParcelReader.m(parcel, b);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new StreetViewPanoramaCamera(f, f2, f3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaCamera[i];
    }
}
