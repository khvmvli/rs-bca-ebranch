package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
@Deprecated
/* loaded from: classes-dex2jar.jar:o/realmSet$KategoriTujuanTransaksi.class */
public final class realmSet$KategoriTujuanTransaksi extends setFotoPribadi {
    public static final Parcelable.Creator<realmSet$KategoriTujuanTransaksi> CREATOR = new Parcelable.Creator<realmSet$KategoriTujuanTransaksi>() { // from class: o.realmSet$KodePosPenerima
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ realmSet$KategoriTujuanTransaksi createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            String str = "";
            String str2 = "";
            String str3 = str2;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                int b2 = SafeParcelReader.b(b);
                if (b2 == 1) {
                    str2 = SafeParcelReader.b(parcel, b);
                } else if (b2 == 2) {
                    str3 = SafeParcelReader.b(parcel, b);
                } else if (b2 != 5) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    str = SafeParcelReader.b(parcel, b);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmSet$KategoriTujuanTransaksi(str, str2, str3);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ realmSet$KategoriTujuanTransaksi[] newArray(int i) {
            return new realmSet$KategoriTujuanTransaksi[i];
        }
    };
    private final String a;
    private final String c;
    private final String e;

    public realmSet$KategoriTujuanTransaksi(String str, String str2, String str3) {
        this.e = str;
        this.c = str2;
        this.a = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.c(parcel, 1, this.c, false);
        setHmAddress.c(parcel, 2, this.a, false);
        setHmAddress.c(parcel, 5, this.e, false);
        setHmAddress.e(parcel, b);
    }
}
