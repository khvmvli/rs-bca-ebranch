package o;

import android.util.Log;
import com.google.errorprone.annotations.CheckReturnValue;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes-dex2jar.jar:o/realmGet$tujuanTransaksiCode.class */
public class realmGet$tujuanTransaksiCode {
    private static final realmGet$tujuanTransaksiCode a = new realmGet$tujuanTransaksiCode(true, 3, 1, null, null);
    @Nullable
    final String b;
    final boolean c;
    final int d;
    @Nullable
    final Throwable e;

    private realmGet$tujuanTransaksiCode(boolean z, int i, int i2, @Nullable String str, @Nullable Throwable th) {
        this.c = z;
        this.d = i;
        this.b = str;
        this.e = th;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static realmGet$tujuanTransaksiCode a(String str) {
        return new realmGet$tujuanTransaksiCode(false, 1, 5, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static realmGet$tujuanTransaksiCode b(int i, int i2, String str, @Nullable Throwable th) {
        return new realmGet$tujuanTransaksiCode(false, i, i2, str, th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static realmGet$tujuanTransaksiCode d() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static realmGet$tujuanTransaksiCode d(int i) {
        return new realmGet$tujuanTransaksiCode(true, i, 1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static realmGet$tujuanTransaksiCode e(String str, Throwable th) {
        return new realmGet$tujuanTransaksiCode(false, 1, 5, str, th);
    }

    @Nullable
    String a() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (!this.c && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.e != null) {
                Log.d("GoogleCertificatesRslt", a(), this.e);
            } else {
                Log.d("GoogleCertificatesRslt", a());
            }
        }
    }
}
