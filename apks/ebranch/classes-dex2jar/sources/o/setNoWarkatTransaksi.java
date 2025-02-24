package o;

import android.os.Parcel;
/* loaded from: classes-dex2jar.jar:o/setNoWarkatTransaksi.class */
public class setNoWarkatTransaksi {
    private static final ClassLoader c = setNoWarkatTransaksi.class.getClassLoader();

    private setNoWarkatTransaksi() {
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void b(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }
}
