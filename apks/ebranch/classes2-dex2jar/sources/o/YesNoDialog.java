package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* loaded from: classes2-dex2jar.jar:o/YesNoDialog.class */
public final class YesNoDialog {
    private static WeakReference<YesNoDialog> b;
    private final Executor a;
    private WaktuHabisDialog c;
    private final SharedPreferences d;

    private YesNoDialog(SharedPreferences sharedPreferences, Executor executor) {
        this.a = executor;
        this.d = sharedPreferences;
    }

    public static YesNoDialog b(Context context, Executor executor) {
        synchronized (YesNoDialog.class) {
            try {
                WeakReference<YesNoDialog> weakReference = b;
                YesNoDialog yesNoDialog = weakReference != null ? weakReference.get() : null;
                if (yesNoDialog != null) {
                    return yesNoDialog;
                }
                YesNoDialog yesNoDialog2 = new YesNoDialog(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                synchronized (yesNoDialog2) {
                    yesNoDialog2.c = WaktuHabisDialog.a(yesNoDialog2.d, yesNoDialog2.a);
                }
                b = new WeakReference<>(yesNoDialog2);
                return yesNoDialog2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final YakinKeluarDialog a() {
        YakinKeluarDialog d;
        synchronized (this) {
            d = YakinKeluarDialog.d(this.c.e());
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(YakinKeluarDialog yakinKeluarDialog) {
        boolean e;
        synchronized (this) {
            e = this.c.e(yakinKeluarDialog.b);
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(YakinKeluarDialog yakinKeluarDialog) {
        boolean c;
        synchronized (this) {
            c = this.c.c(yakinKeluarDialog.b);
        }
        return c;
    }
}
