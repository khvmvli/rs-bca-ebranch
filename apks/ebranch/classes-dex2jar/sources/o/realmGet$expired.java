package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.Collections;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmGet$expired.class */
public final class realmGet$expired extends setFotoPribadi {
    final List<setCobIsoCode> a;
    final realmSet$NegaraBagianBankPenerimaCode b;
    final String d;
    static final List<setCobIsoCode> c = Collections.emptyList();
    static final realmSet$NegaraBagianBankPenerimaCode e = new realmSet$NegaraBagianBankPenerimaCode();
    public static final Parcelable.Creator<realmGet$expired> CREATOR = new Parcelable.Creator<realmGet$expired>() { // from class: o.realmSet$cardNumber
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ realmGet$expired createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            realmSet$NegaraBagianBankPenerimaCode realmset_negarabagianbankpenerimacode = realmGet$expired.e;
            List<setCobIsoCode> list = realmGet$expired.c;
            String str = null;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                int b2 = SafeParcelReader.b(b);
                if (b2 == 1) {
                    realmset_negarabagianbankpenerimacode = (realmSet$NegaraBagianBankPenerimaCode) SafeParcelReader.b(parcel, b, realmSet$NegaraBagianBankPenerimaCode.CREATOR);
                } else if (b2 == 2) {
                    list = SafeParcelReader.c(parcel, b, setCobIsoCode.CREATOR);
                } else if (b2 != 3) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    str = SafeParcelReader.b(parcel, b);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmGet$expired(realmset_negarabagianbankpenerimacode, list, str);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ realmGet$expired[] newArray(int i) {
            return new realmGet$expired[i];
        }
    };

    public realmGet$expired(realmSet$NegaraBagianBankPenerimaCode realmset_negarabagianbankpenerimacode, List<setCobIsoCode> list, String str) {
        this.b = realmset_negarabagianbankpenerimacode;
        this.a = list;
        this.d = str;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof realmGet$expired)) {
            return false;
        }
        realmGet$expired realmget_expired = (realmGet$expired) obj;
        return setFlagIB.d(this.b, realmget_expired.b) && setFlagIB.d(this.a, realmget_expired.a) && setFlagIB.d(this.d, realmget_expired.d);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        String str = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 77 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.b(parcel, 1, (Parcelable) this.b, i, false);
        setHmAddress.a(parcel, 2, (List) this.a, false);
        setHmAddress.c(parcel, 3, this.d, false);
        setHmAddress.e(parcel, b);
    }
}
