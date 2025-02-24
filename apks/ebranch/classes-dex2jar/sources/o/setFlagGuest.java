package o;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/setFlagGuest.class */
public final class setFlagGuest extends setFotoPribadi {
    public static final Parcelable.Creator<setFlagGuest> CREATOR = new setKitasKitapFlag();
    private final int a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final int f;
    private final String h;
    private final int i;
    private final String j;

    public setFlagGuest(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.j = str;
        this.h = str2;
        this.f = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = this.b;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        int i4 = this.c;
        parcel.writeInt(262147);
        parcel.writeInt(i4);
        long j = this.d;
        parcel.writeInt(524292);
        parcel.writeLong(j);
        long j2 = this.e;
        parcel.writeInt(524293);
        parcel.writeLong(j2);
        String str = this.j;
        if (str != null) {
            parcel.writeInt(-65530);
            parcel.writeInt(0);
            int dataPosition2 = parcel.dataPosition();
            parcel.writeString(str);
            int dataPosition3 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition2 - 4);
            parcel.writeInt(dataPosition3 - dataPosition2);
            parcel.setDataPosition(dataPosition3);
        }
        String str2 = this.h;
        if (str2 != null) {
            parcel.writeInt(-65529);
            parcel.writeInt(0);
            int dataPosition4 = parcel.dataPosition();
            parcel.writeString(str2);
            int dataPosition5 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition4 - 4);
            parcel.writeInt(dataPosition5 - dataPosition4);
            parcel.setDataPosition(dataPosition5);
        }
        int i5 = this.f;
        parcel.writeInt(262152);
        parcel.writeInt(i5);
        int i6 = this.i;
        parcel.writeInt(262153);
        parcel.writeInt(i6);
        int dataPosition6 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition - 4);
        parcel.writeInt(dataPosition6 - dataPosition);
        parcel.setDataPosition(dataPosition6);
    }
}
