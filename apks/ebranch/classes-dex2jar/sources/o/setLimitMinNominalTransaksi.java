package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.setFlagIB;
/* loaded from: classes-dex2jar.jar:o/setLimitMinNominalTransaksi.class */
public final class setLimitMinNominalTransaksi extends setFotoPribadi {
    public static final Parcelable.Creator<setLimitMinNominalTransaksi> CREATOR = new setNegaraBagianPenerima();
    public final float a;
    public final float c;

    /* loaded from: classes-dex2jar.jar:o/setLimitMinNominalTransaksi$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        public float a;
        public float e;
    }

    public setLimitMinNominalTransaksi(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f) {
            z = false;
            if (f <= 90.0f) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        String obj = sb.toString();
        if (z) {
            this.a = f + 0.0f;
            this.c = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLimitMinNominalTransaksi)) {
            return false;
        }
        setLimitMinNominalTransaksi setlimitminnominaltransaksi = (setLimitMinNominalTransaksi) obj;
        return Float.floatToIntBits(this.a) == Float.floatToIntBits(setlimitminnominaltransaksi.a) && Float.floatToIntBits(this.c) == Float.floatToIntBits(setlimitminnominaltransaksi.c);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.c)});
    }

    @Override // java.lang.Object
    public final String toString() {
        return new setFlagIB.IconCompatParcelizer(this).b("tilt", Float.valueOf(this.a)).b("bearing", Float.valueOf(this.c)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(262146);
        parcel.writeFloat(f);
        float f2 = this.c;
        parcel.writeInt(262147);
        parcel.writeFloat(f2);
        setHmAddress.e(parcel, dataPosition);
    }
}
