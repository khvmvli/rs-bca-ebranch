package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes-dex2jar.jar:o/setNoIBANPenerima.class */
public final class setNoIBANPenerima implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str3 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        int i = 0;
        int i2 = 0;
        float f8 = 0.0f;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            switch (SafeParcelReader.b(b)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.b(parcel, b, LatLng.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.b(parcel, b);
                    break;
                case 4:
                    str2 = SafeParcelReader.b(parcel, b);
                    break;
                case 5:
                    iBinder = SafeParcelReader.l(parcel, b);
                    break;
                case 6:
                    f = SafeParcelReader.m(parcel, b);
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
                    z3 = SafeParcelReader.j(parcel, b);
                    break;
                case 11:
                    f3 = SafeParcelReader.m(parcel, b);
                    break;
                case 12:
                    f4 = SafeParcelReader.m(parcel, b);
                    break;
                case 13:
                    f5 = SafeParcelReader.m(parcel, b);
                    break;
                case 14:
                    f6 = SafeParcelReader.m(parcel, b);
                    break;
                case 15:
                    f7 = SafeParcelReader.m(parcel, b);
                    break;
                case 16:
                default:
                    SafeParcelReader.p(parcel, b);
                    break;
                case 17:
                    i = SafeParcelReader.k(parcel, b);
                    break;
                case 18:
                    iBinder2 = SafeParcelReader.l(parcel, b);
                    break;
                case 19:
                    i2 = SafeParcelReader.k(parcel, b);
                    break;
                case 20:
                    str3 = SafeParcelReader.b(parcel, b);
                    break;
                case 21:
                    f8 = SafeParcelReader.m(parcel, b);
                    break;
            }
        }
        SafeParcelReader.d(parcel, a);
        return new setNamaBankPenerima(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7, i, iBinder2, i2, str3, f8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new setNamaBankPenerima[i];
    }
}
