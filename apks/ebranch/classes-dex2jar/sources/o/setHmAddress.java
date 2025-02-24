package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setHmAddress.class */
public final class setHmAddress {
    public static void a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            parcel.writeBundle(bundle);
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    public static <T extends Parcelable> void a(Parcel parcel, int i, List<T> list, boolean z) {
        if (list != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                T t = list.get(i2);
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    d(parcel, t, 0);
                }
            }
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    public static int b(Parcel parcel) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void b(Parcel parcel, int i, float f) {
        parcel.writeInt(i | 262144);
        parcel.writeFloat(f);
    }

    public static void b(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            parcel.writeStrongBinder(iBinder);
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    public static void b(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            parcelable.writeToParcel(parcel, i2);
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    public static void b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            parcel.writeStringList(list);
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    public static void b(Parcel parcel, int i, boolean z) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(z ? 1 : 0);
    }

    public static <T extends Parcelable> void b(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            int length = tArr.length;
            parcel.writeInt(length);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    d(parcel, t, i2);
                }
            }
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    public static void c(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            parcel.writeInt(524296);
            parcel.writeDouble(d.doubleValue());
        }
    }

    public static void c(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(0);
            int dataPosition = parcel.dataPosition();
            parcel.writeString(str);
            int dataPosition2 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition - 4);
            parcel.writeInt(dataPosition2 - dataPosition);
            parcel.setDataPosition(dataPosition2);
        }
    }

    public static void d(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(i2);
    }

    public static void d(Parcel parcel, int i, Boolean bool, boolean z) {
        if (bool != null) {
            parcel.writeInt(262165);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static void d(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            parcel.writeInt(524292);
            parcel.writeLong(l.longValue());
        }
    }

    private static void d(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void e(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void e(Parcel parcel, int i, long j) {
        parcel.writeInt(i | 524288);
        parcel.writeLong(j);
    }

    public static void e(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            parcel.writeInt(i | 262144);
            parcel.writeFloat(f.floatValue());
        }
    }

    public static void e(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            parcel.writeInt(i | 262144);
            parcel.writeInt(num.intValue());
        }
    }
}
