package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* loaded from: classes-dex2jar.jar:o/realmSet$incomeSourceValue.class */
public final class realmSet$incomeSourceValue extends BroadcastReceiver {
    Context b;
    private final realmSet$job e;

    public realmSet$incomeSourceValue(realmSet$job realmset_job) {
        this.e = realmset_job;
    }

    public final void c(Context context) {
        this.b = context;
    }

    public final void e() {
        synchronized (this) {
            Context context = this.b;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.b = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.e.d();
            e();
        }
    }
}
