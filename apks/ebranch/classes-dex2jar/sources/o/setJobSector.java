package o;

import com.google.android.gms.internal.measurement.zzkn;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setJobSector.class */
public final class setJobSector {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(byte b, byte b2, char[] cArr, int i) throws zzkn {
        if (b < -62 || e(b2)) {
            throw zzkn.j();
        }
        cArr[i] = (char) ((char) (((b & 31) << 6) | (b2 & 63)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean b(byte b) {
        return b >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzkn {
        if (e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || e(b3) || e(b4)) {
            throw zzkn.j();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((char) ((i2 >>> 10) + 55232));
        cArr[i + 1] = (char) ((char) ((i2 & 1023) + 56320));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(byte b, byte b2, byte b3, char[] cArr, int i) throws zzkn {
        if (!e(b2)) {
            byte b4 = b;
            if (b == -32) {
                if (b2 >= -96) {
                    b4 = -32;
                }
            }
            byte b5 = b4;
            if (b4 == -19) {
                if (b2 < -96) {
                    b5 = -19;
                }
            }
            if (!e(b3)) {
                cArr[i] = (char) ((char) (((b5 & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63)));
                return;
            }
        }
        throw zzkn.j();
    }

    private static boolean e(byte b) {
        return b > -65;
    }
}
