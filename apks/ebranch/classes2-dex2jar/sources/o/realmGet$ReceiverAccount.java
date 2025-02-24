package o;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes2-dex2jar.jar:o/realmGet$ReceiverAccount.class */
public final class realmGet$ReceiverAccount {
    private final realmGet$RecurringEndDate b;

    public realmGet$ReceiverAccount(realmGet$RecurringEndDate realmget_recurringenddate) {
        setFotoKtp.b(realmget_recurringenddate);
        this.b = realmget_recurringenddate;
    }

    public final void b(Context context, Intent intent) {
        realmGet$TxnPurpose c = realmGet$TxnPurpose.c(context, null, null);
        setIsInputAtmPemrek s_ = c.s_();
        if (intent == null) {
            s_.c().b("Receiver called with null intent");
            return;
        }
        c.n_();
        String action = intent.getAction();
        s_.i().e("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            s_.i().b("Starting wakeful intent.");
            this.b.e(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            s_.c().b("Install Referrer Broadcasts are deprecated");
        }
    }
}
