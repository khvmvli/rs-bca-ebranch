package o;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/setCurrentPage.class */
public final class setCurrentPage extends setFotoPribadi {
    public static final Parcelable.Creator<setCurrentPage> CREATOR = new setReligionOthers();
    private final setFlagNPWP a;
    private final int b;
    private final boolean c;
    private final int[] d;
    private final boolean e;
    private final int[] j;

    public setCurrentPage(setFlagNPWP setflagnpwp, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = setflagnpwp;
        this.c = z;
        this.e = z2;
        this.d = iArr;
        this.b = i;
        this.j = iArr2;
    }

    public final int[] a() {
        return this.j;
    }

    public final int b() {
        return this.b;
    }

    public final int[] c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.c;
    }

    public final setFlagNPWP i() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        setFlagNPWP setflagnpwp = this.a;
        if (setflagnpwp != null) {
            parcel.writeInt(-65535);
            parcel.writeInt(0);
            int dataPosition2 = parcel.dataPosition();
            setflagnpwp.writeToParcel(parcel, i);
            int dataPosition3 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition2 - 4);
            parcel.writeInt(dataPosition3 - dataPosition2);
            parcel.setDataPosition(dataPosition3);
        }
        boolean z = this.c;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.e;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        int[] iArr = this.d;
        if (iArr != null) {
            parcel.writeInt(-65532);
            parcel.writeInt(0);
            int dataPosition4 = parcel.dataPosition();
            parcel.writeIntArray(iArr);
            int dataPosition5 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition4 - 4);
            parcel.writeInt(dataPosition5 - dataPosition4);
            parcel.setDataPosition(dataPosition5);
        }
        int i2 = this.b;
        parcel.writeInt(262149);
        parcel.writeInt(i2);
        int[] iArr2 = this.j;
        if (iArr2 != null) {
            parcel.writeInt(-65530);
            parcel.writeInt(0);
            int dataPosition6 = parcel.dataPosition();
            parcel.writeIntArray(iArr2);
            int dataPosition7 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition6 - 4);
            parcel.writeInt(dataPosition7 - dataPosition6);
            parcel.setDataPosition(dataPosition7);
        }
        int dataPosition8 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition - 4);
        parcel.writeInt(dataPosition8 - dataPosition);
        parcel.setDataPosition(dataPosition8);
    }
}
