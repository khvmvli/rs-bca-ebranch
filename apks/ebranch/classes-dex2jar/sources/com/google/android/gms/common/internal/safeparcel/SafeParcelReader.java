package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/common/internal/safeparcel/SafeParcelReader.class */
public final class SafeParcelReader {

    /* loaded from: classes-dex2jar.jar:com/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException.class */
    public static class ParseException extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public ParseException(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                r0 = r5
                int r0 = r0.dataPosition()
                r6 = r0
                r0 = r5
                int r0 = r0.dataSize()
                r7 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r5 = r0
                r0 = r5
                r1 = r4
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                java.lang.String r1 = " Parcel: pos="
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                r1 = r6
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                java.lang.String r1 = " size="
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                r1 = r7
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r3
                r1 = r5
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static int a(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = (readInt & -65536) != -65536 ? (char) (readInt >> 16) : parcel.readInt();
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c == 20293) {
            int i = readInt2 + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            StringBuilder sb = new StringBuilder("Size read is invalid start=");
            sb.append(dataPosition);
            sb.append(" end=");
            sb.append(i);
            throw new ParseException(sb.toString(), parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static ArrayList<String> a(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + readInt);
        return createStringArrayList;
    }

    public static int b(int i) {
        return (char) i;
    }

    public static int b(Parcel parcel) {
        return parcel.readInt();
    }

    public static <T extends Parcelable> T b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + readInt);
        return createFromParcel;
    }

    public static String b(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + readInt);
        return readString;
    }

    public static Bundle c(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + readInt);
        return readBundle;
    }

    public static <T> ArrayList<T> c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + readInt);
        return createTypedArrayList;
    }

    private static void c(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String hexString = Integer.toHexString(i);
            StringBuilder sb = new StringBuilder("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(i);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    public static void d(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder("Overread allowed size end=");
            sb.append(i);
            throw new ParseException(sb.toString(), parcel);
        }
    }

    public static <T> T[] d(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + readInt);
        return tArr;
    }

    private static void e(Parcel parcel, int i, int i2) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        if (readInt != i2) {
            String hexString = Integer.toHexString(readInt);
            StringBuilder sb = new StringBuilder("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(readInt);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    public static int[] e(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + readInt);
        return createIntArray;
    }

    public static byte f(Parcel parcel, int i) {
        e(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static Double g(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        if (readInt == 0) {
            return null;
        }
        c(parcel, readInt, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Boolean h(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        if (readInt == 0) {
            return null;
        }
        c(parcel, readInt, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double i(Parcel parcel, int i) {
        e(parcel, i, 8);
        return parcel.readDouble();
    }

    public static boolean j(Parcel parcel, int i) {
        e(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int k(Parcel parcel, int i) {
        e(parcel, i, 4);
        return parcel.readInt();
    }

    public static IBinder l(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        int dataPosition = parcel.dataPosition();
        if (readInt == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + readInt);
        return readStrongBinder;
    }

    public static float m(Parcel parcel, int i) {
        e(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Integer n(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        if (readInt == 0) {
            return null;
        }
        c(parcel, readInt, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static Float o(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        if (readInt == 0) {
            return null;
        }
        c(parcel, readInt, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static void p(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + ((i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt()));
    }

    public static long r(Parcel parcel, int i) {
        e(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long t(Parcel parcel, int i) {
        int readInt = (i & -65536) != -65536 ? (char) (i >> 16) : parcel.readInt();
        if (readInt == 0) {
            return null;
        }
        c(parcel, readInt, 8);
        return Long.valueOf(parcel.readLong());
    }
}
