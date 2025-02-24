package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/setReligion.class */
public final class setReligion extends setFotoPribadi {
    public static final Parcelable.Creator<setReligion> CREATOR = new setResAddress();
    int a;
    realmGet$job[] c;
    Bundle d;
    setCurrentPage e;

    public setReligion() {
    }

    public setReligion(Bundle bundle, realmGet$job[] realmget_jobArr, int i, setCurrentPage setcurrentpage) {
        this.d = bundle;
        this.c = realmget_jobArr;
        this.a = i;
        this.e = setcurrentpage;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.a(parcel, 1, this.d, false);
        setHmAddress.b(parcel, 2, (Parcelable[]) this.c, i, false);
        setHmAddress.d(parcel, 3, this.a);
        setHmAddress.b(parcel, 4, (Parcelable) this.e, i, false);
        setHmAddress.e(parcel, b);
    }
}
