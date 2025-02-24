package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
/* loaded from: classes-dex2jar.jar:o/realmSet$FlagFullAmountTransaksi.class */
public final class realmSet$FlagFullAmountTransaksi extends setFotoPribadi {
    public static final Parcelable.Creator<realmSet$FlagFullAmountTransaksi> CREATOR = new Parcelable.Creator<realmSet$FlagFullAmountTransaksi>() { // from class: o.realmSet$LimitMaxNominalTransaksi
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ realmSet$FlagFullAmountTransaksi createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                switch (SafeParcelReader.b(b)) {
                    case 1:
                        z = SafeParcelReader.j(parcel, b);
                        break;
                    case 2:
                        z2 = SafeParcelReader.j(parcel, b);
                        break;
                    case 3:
                        z3 = SafeParcelReader.j(parcel, b);
                        break;
                    case 4:
                        z4 = SafeParcelReader.j(parcel, b);
                        break;
                    case 5:
                        z5 = SafeParcelReader.j(parcel, b);
                        break;
                    case 6:
                        z6 = SafeParcelReader.j(parcel, b);
                        break;
                    default:
                        SafeParcelReader.p(parcel, b);
                        break;
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmSet$FlagFullAmountTransaksi(z, z2, z3, z4, z5, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ realmSet$FlagFullAmountTransaksi[] newArray(int i) {
            return new realmSet$FlagFullAmountTransaksi[i];
        }
    };
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean i;

    public realmSet$FlagFullAmountTransaksi(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.e = z;
        this.d = z2;
        this.a = z3;
        this.b = z4;
        this.c = z5;
        this.i = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        boolean z = this.e;
        parcel.writeInt(262145);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.d;
        parcel.writeInt(262146);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.a;
        parcel.writeInt(262147);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.b;
        parcel.writeInt(262148);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.c;
        parcel.writeInt(262149);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.i;
        parcel.writeInt(262150);
        parcel.writeInt(z6 ? 1 : 0);
        setHmAddress.e(parcel, dataPosition);
    }
}
