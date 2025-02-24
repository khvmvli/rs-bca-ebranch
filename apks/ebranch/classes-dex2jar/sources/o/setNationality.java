package o;

import com.facebook.stetho.common.Utf8Charset;
import com.google.android.gms.internal.measurement.zzkn;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* loaded from: classes-dex2jar.jar:o/setNationality.class */
public final class setNationality {
    public static final setEmergencyContactBCACardNumber a;
    public static final ByteBuffer b;
    public static final byte[] d;
    static final Charset c = Charset.forName(Utf8Charset.NAME);
    static final Charset e = Charset.forName("ISO-8859-1");

    static {
        byte[] bArr = new byte[0];
        d = bArr;
        b = ByteBuffer.wrap(bArr);
        setEmergencyContactMobileNumber setemergencycontactmobilenumber = new setEmergencyContactMobileNumber(bArr, 0, 0, false, null);
        try {
            setemergencycontactmobilenumber.e(0);
            a = setemergencycontactmobilenumber;
        } catch (zzkn e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String a(byte[] bArr) {
        return new String(bArr, c);
    }

    public static Object b(Object obj, Object obj2) {
        return ((realmGet$cardDescription) obj).ao().d((realmGet$cardDescription) obj2).x();
    }

    public static boolean b(byte[] bArr) {
        return realmSet$supplementCardOptions.c(bArr);
    }

    public static int c(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int c(byte[] bArr) {
        int length = bArr.length;
        int e2 = e(length, bArr, 0, length);
        int i = e2;
        if (e2 == 0) {
            i = 1;
        }
        return i;
    }

    public static <T> T c(T t) {
        t.getClass();
        return t;
    }

    public static int d(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int e(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static <T> T e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
