package o;

import android.content.Context;
import android.database.ContentObserver;
import android.os.SystemClock;
import android.os.Vibrator;
import android.provider.Settings;
/* loaded from: classes2-dex2jar.jar:o/pilihJenisMataUang.class */
public final class pilihJenisMataUang {
    public Vibrator a;
    boolean b;
    public final ContentObserver c = new ContentObserver(null) { // from class: o.pilihJenisMataUang.4
        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            pilihJenisMataUang pilihjenismatauang = pilihJenisMataUang.this;
            boolean z2 = false;
            if (Settings.System.getInt(pilihjenismatauang.e.getContentResolver(), "haptic_feedback_enabled", 0) == 1) {
                z2 = true;
            }
            pilihjenismatauang.b = z2;
        }
    };
    private long d;
    public final Context e;

    public pilihJenisMataUang(Context context) {
        this.e = context;
    }

    public final void d() {
        Context context = this.e;
        boolean z = true;
        if (context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0) {
            this.a = (Vibrator) this.e.getSystemService("vibrator");
        }
        if (Settings.System.getInt(this.e.getContentResolver(), "haptic_feedback_enabled", 0) != 1) {
            z = false;
        }
        this.b = z;
        this.e.getContentResolver().registerContentObserver(Settings.System.getUriFor("haptic_feedback_enabled"), false, this.c);
    }

    public final void e() {
        if (this.a != null && this.b) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.d >= 125) {
                this.a.vibrate(50);
                this.d = uptimeMillis;
            }
        }
    }
}
