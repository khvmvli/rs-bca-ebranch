package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/setNegaraBagianBankPenerima.class */
public final class setNegaraBagianBankPenerima extends setFotoPribadi {
    public static final Parcelable.Creator<setNegaraBagianBankPenerima> CREATOR = new setNegaraBagianBankPenerimaCode();
    public static final setNegaraBagianBankPenerima a = new setNegaraBagianBankPenerima(0);
    public static final setNegaraBagianBankPenerima e = new setNegaraBagianBankPenerima(1);
    private final int b;

    public setNegaraBagianBankPenerima(int i) {
        this.b = i;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setNegaraBagianBankPenerima) && this.b == ((setNegaraBagianBankPenerima) obj).b;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b)});
    }

    @Override // java.lang.Object
    public final String toString() {
        int i = this.b;
        return String.format("StreetViewSource:%s", i != 0 ? i != 1 ? String.format("UNKNOWN(%s)", Integer.valueOf(i)) : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        setHmAddress.e(parcel, dataPosition);
    }
}
