package o;

import android.content.Context;
/* loaded from: classes-dex2jar.jar:o/realmGet$jenisWarkatTransaksi.class */
public final class realmGet$jenisWarkatTransaksi {
    public static final realmGet$jenisWarkatTransaksi a = new realmGet$jenisWarkatTransaksi();
    private realmGet$alamatPengirim b = null;

    public static realmGet$alamatPengirim b(Context context) {
        return a.e(context);
    }

    public final realmGet$alamatPengirim e(Context context) {
        realmGet$alamatPengirim realmget_alamatpengirim;
        synchronized (this) {
            if (this.b == null) {
                Context context2 = context;
                if (context.getApplicationContext() != null) {
                    context2 = context.getApplicationContext();
                }
                this.b = new realmGet$alamatPengirim(context2);
            }
            realmget_alamatpengirim = this.b;
        }
        return realmget_alamatpengirim;
    }
}
