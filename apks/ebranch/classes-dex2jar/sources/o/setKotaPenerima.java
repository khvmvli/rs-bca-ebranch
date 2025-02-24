package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/setKotaPenerima.class */
public final class setKotaPenerima extends setFotoPribadi {
    public static final Parcelable.Creator<setKotaPenerima> CREATOR = new setNoHpPengirim();
    private final Float c;
    private final int d;

    public setKotaPenerima(int i, Float f) {
        boolean z = i != 1 ? f != null && f.floatValue() >= 0.0f : true;
        StringBuilder sb = new StringBuilder("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(f);
        String obj = sb.toString();
        if (z) {
            this.d = i;
            this.c = f;
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setKotaPenerima)) {
            return false;
        }
        setKotaPenerima setkotapenerima = (setKotaPenerima) obj;
        if (this.d != setkotapenerima.d) {
            return false;
        }
        Float f = this.c;
        Float f2 = setkotapenerima.c;
        return f == f2 || (f != null && f.equals(f2));
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), this.c});
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("[PatternItem: type=");
        sb.append(this.d);
        sb.append(" length=");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.d;
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(262146);
        parcel.writeInt(i2);
        setHmAddress.e(parcel, 3, this.c, false);
        setHmAddress.e(parcel, dataPosition);
    }
}
