package o;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/setCobIsoCode.class */
public final class setCobIsoCode extends setFotoPribadi {
    public static final Parcelable.Creator<setCobIsoCode> CREATOR = new setHmSubDistrict();
    public final String b;
    public final int d;

    public setCobIsoCode(int i, String str) {
        this.d = i;
        this.b = str;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setCobIsoCode)) {
            return false;
        }
        setCobIsoCode setcobisocode = (setCobIsoCode) obj;
        if (setcobisocode.d != this.d) {
            return false;
        }
        String str = setcobisocode.b;
        String str2 = this.b;
        return str == str2 || (str != null && str.equals(str2));
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.d;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(":");
        sb.append(this.b);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.d;
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        String str = this.b;
        if (str != null) {
            parcel.writeInt(-65534);
            parcel.writeInt(0);
            int dataPosition2 = parcel.dataPosition();
            parcel.writeString(str);
            int dataPosition3 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition2 - 4);
            parcel.writeInt(dataPosition3 - dataPosition2);
            parcel.setDataPosition(dataPosition3);
        }
        int dataPosition4 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition - 4);
        parcel.writeInt(dataPosition4 - dataPosition);
        parcel.setDataPosition(dataPosition4);
    }
}
