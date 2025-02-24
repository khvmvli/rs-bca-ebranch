package o;

import com.facebook.stetho.common.Utf8Charset;
import java.nio.charset.Charset;
/* loaded from: classes-dex2jar.jar:o/defaultDumperPluginsProvider.class */
public final class defaultDumperPluginsProvider {
    public static final Charset a = Charset.forName(Utf8Charset.NAME);

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static int b(int i) {
        return ((i & 65280) << 8) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((i & 255) << 24);
    }

    public static void d(Throwable th) {
        throw th;
    }

    public static short e(short s) {
        int i = s & 65535;
        return (short) (((i & 65280) >>> 8) | ((i & 255) << 8));
    }
}
