package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/realmGet$tipeNasabahId.class */
public final class realmGet$tipeNasabahId implements Parcelable.Creator<realmGet$tipeNasabah> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(realmGet$tipeNasabah realmget_tipenasabah, Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.c(parcel, 2, realmget_tipenasabah.e, false);
        setHmAddress.b(parcel, 3, (Parcelable) realmget_tipenasabah.a, i, false);
        setHmAddress.c(parcel, 4, realmget_tipenasabah.d, false);
        setHmAddress.e(parcel, 5, realmget_tipenasabah.c);
        setHmAddress.e(parcel, b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ realmGet$tipeNasabah createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        realmGet$nomorRekening realmget_nomorrekening = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < a) {
            int b = SafeParcelReader.b(parcel);
            int b2 = SafeParcelReader.b(b);
            if (b2 == 2) {
                str = SafeParcelReader.b(parcel, b);
            } else if (b2 == 3) {
                realmget_nomorrekening = (realmGet$nomorRekening) SafeParcelReader.b(parcel, b, realmGet$nomorRekening.CREATOR);
            } else if (b2 == 4) {
                str2 = SafeParcelReader.b(parcel, b);
            } else if (b2 != 5) {
                SafeParcelReader.p(parcel, b);
            } else {
                j = SafeParcelReader.r(parcel, b);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new realmGet$tipeNasabah(str, realmget_nomorrekening, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ realmGet$tipeNasabah[] newArray(int i) {
        return new realmGet$tipeNasabah[i];
    }
}
