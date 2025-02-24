package o;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2-dex2jar.jar:o/getJenisWarkat.class */
public final class getJenisWarkat extends setFotoPribadi {
    public static final Parcelable.Creator<getJenisWarkat> CREATOR = new getNominal();
    final setLanguage a;
    final int c;

    public getJenisWarkat(int i, setLanguage setlanguage) {
        this.c = i;
        this.a = setlanguage;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.d(parcel, 1, this.c);
        setHmAddress.b(parcel, 2, this.a, i, false);
        setHmAddress.e(parcel, b);
    }
}
