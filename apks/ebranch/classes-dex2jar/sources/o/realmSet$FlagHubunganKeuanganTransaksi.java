package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmSet$FlagHubunganKeuanganTransaksi.class */
public final class realmSet$FlagHubunganKeuanganTransaksi extends setFotoPribadi {
    public static final Parcelable.Creator<realmSet$FlagHubunganKeuanganTransaksi> CREATOR = new Parcelable.Creator<realmSet$FlagHubunganKeuanganTransaksi>() { // from class: o.realmSet$NamaBankPenerima
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ realmSet$FlagHubunganKeuanganTransaksi createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            boolean z = false;
            ArrayList arrayList = null;
            realmSet$KategoriTujuanTransaksi realmset_kategoritujuantransaksi = null;
            boolean z2 = false;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                int b2 = SafeParcelReader.b(b);
                if (b2 == 1) {
                    arrayList = SafeParcelReader.c(parcel, b, LocationRequest.CREATOR);
                } else if (b2 == 2) {
                    z = SafeParcelReader.j(parcel, b);
                } else if (b2 == 3) {
                    z2 = SafeParcelReader.j(parcel, b);
                } else if (b2 != 5) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    realmset_kategoritujuantransaksi = (realmSet$KategoriTujuanTransaksi) SafeParcelReader.b(parcel, b, realmSet$KategoriTujuanTransaksi.CREATOR);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmSet$FlagHubunganKeuanganTransaksi(arrayList, z, z2, realmset_kategoritujuantransaksi);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ realmSet$FlagHubunganKeuanganTransaksi[] newArray(int i) {
            return new realmSet$FlagHubunganKeuanganTransaksi[i];
        }
    };
    private final boolean a;
    private final List<LocationRequest> b;
    private final boolean c;
    private realmSet$KategoriTujuanTransaksi e;

    public realmSet$FlagHubunganKeuanganTransaksi(List<LocationRequest> list, boolean z, boolean z2, realmSet$KategoriTujuanTransaksi realmset_kategoritujuantransaksi) {
        this.b = list;
        this.c = z;
        this.a = z2;
        this.e = realmset_kategoritujuantransaksi;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        setHmAddress.a(parcel, 1, Collections.unmodifiableList(this.b), false);
        boolean z = this.c;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.a;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        setHmAddress.b(parcel, 5, (Parcelable) this.e, i, false);
        setHmAddress.e(parcel, dataPosition);
    }
}
