package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/realmGet$token.class */
public final class realmGet$token extends setFotoPribadi {
    public static final Parcelable.Creator<realmGet$token> CREATOR = new Parcelable.Creator() { // from class: o.realmGet$totalBiayaTransfer
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            boolean z = false;
            String str = null;
            int i = 0;
            int i2 = 0;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                int b2 = SafeParcelReader.b(b);
                if (b2 == 1) {
                    z = SafeParcelReader.j(parcel, b);
                } else if (b2 == 2) {
                    str = SafeParcelReader.b(parcel, b);
                } else if (b2 == 3) {
                    i = SafeParcelReader.k(parcel, b);
                } else if (b2 != 4) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    i2 = SafeParcelReader.k(parcel, b);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmGet$token(z, str, i, i2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new realmGet$token[i];
        }
    };
    @Nullable
    private final String a;
    private final int c;
    private final boolean d;
    private final int e;

    public realmGet$token(boolean z, String str, int i, int i2) {
        this.d = z;
        this.a = str;
        this.e = realmGet$waktuPengirimanTransaksi.c(i) - 1;
        this.c = realmGet$noTelpKontakPengirim.e(i2) - 1;
    }

    public final boolean a() {
        return this.d;
    }

    public final int b() {
        return realmGet$noTelpKontakPengirim.e(this.c);
    }

    public final int c() {
        return realmGet$waktuPengirimanTransaksi.c(this.e);
    }

    @Nullable
    public final String d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.b(parcel, 1, this.d);
        setHmAddress.c(parcel, 2, this.a, false);
        setHmAddress.d(parcel, 3, this.e);
        setHmAddress.d(parcel, 4, this.c);
        setHmAddress.e(parcel, b);
    }
}
