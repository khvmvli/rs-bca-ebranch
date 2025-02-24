package o;
/* loaded from: classes-dex2jar.jar:o/setAlamatLengkapPenerima.class */
public final class setAlamatLengkapPenerima {
    public static Boolean a(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static byte e(Boolean bool) {
        byte b;
        if (bool == null) {
            b = -1;
        } else if (bool.booleanValue()) {
            return 1;
        } else {
            b = 0;
        }
        return b;
    }
}
