package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/setHandPhoneNumber.class */
public final class setHandPhoneNumber extends setFotoPribadi {
    public static final Parcelable.Creator<setHandPhoneNumber> CREATOR = new setHmVillage();
    @Nullable
    public List b;
    public final int d;

    public setHandPhoneNumber(int i, @Nullable List list) {
        this.d = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.d;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        setHmAddress.a(parcel, 2, this.b, false);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition - 4);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }
}
