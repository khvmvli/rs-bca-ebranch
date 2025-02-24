package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/realmSet$FlagBicCode.class */
public final class realmSet$FlagBicCode extends setFotoPribadi implements realmGet$oldCustFlag {
    public static final Parcelable.Creator<realmSet$FlagBicCode> CREATOR = new Parcelable.Creator<realmSet$FlagBicCode>() { // from class: o.realmSet$KotaPenerima
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ realmSet$FlagBicCode createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            Status status = null;
            realmSet$FlagFullAmountTransaksi realmset_flagfullamounttransaksi = null;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                int b2 = SafeParcelReader.b(b);
                if (b2 == 1) {
                    status = (Status) SafeParcelReader.b(parcel, b, Status.CREATOR);
                } else if (b2 != 2) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    realmset_flagfullamounttransaksi = (realmSet$FlagFullAmountTransaksi) SafeParcelReader.b(parcel, b, realmSet$FlagFullAmountTransaksi.CREATOR);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmSet$FlagBicCode(status, realmset_flagfullamounttransaksi);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ realmSet$FlagBicCode[] newArray(int i) {
            return new realmSet$FlagBicCode[i];
        }
    };
    private final Status c;
    private final realmSet$FlagFullAmountTransaksi d;

    public realmSet$FlagBicCode(Status status, realmSet$FlagFullAmountTransaksi realmset_flagfullamounttransaksi) {
        this.c = status;
        this.d = realmset_flagfullamounttransaksi;
    }

    @Override // o.realmGet$oldCustFlag
    public final Status e() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        setHmAddress.b(parcel, 1, (Parcelable) e(), i, false);
        setHmAddress.b(parcel, 2, (Parcelable) this.d, i, false);
        setHmAddress.e(parcel, dataPosition);
    }
}
