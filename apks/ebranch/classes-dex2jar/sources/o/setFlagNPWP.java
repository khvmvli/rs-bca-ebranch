package o;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/setFlagNPWP.class */
public final class setFlagNPWP extends setFotoPribadi {
    public static final Parcelable.Creator<setFlagNPWP> CREATOR = new setOfficeAddress();
    final int a;
    public final boolean b;
    private final boolean c;
    private final int d;
    private final int e;

    public setFlagNPWP(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.d;
    }

    public final boolean c() {
        return this.c;
    }

    public final int d() {
        return this.e;
    }

    public final boolean e() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.a;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        boolean z = this.b;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.c;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        int i3 = this.d;
        parcel.writeInt(262148);
        parcel.writeInt(i3);
        int i4 = this.e;
        parcel.writeInt(262149);
        parcel.writeInt(i4);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition - 4);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}
