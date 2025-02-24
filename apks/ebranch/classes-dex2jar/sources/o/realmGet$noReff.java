package o;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import o.BankTransfer$$Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmGet$noReff.class */
public final class realmGet$noReff extends BankTransfer$$Parcelable.AnonymousClass1 {
    private final Context b;
    final /* synthetic */ realmGet$jobOthers d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public realmGet$noReff(realmGet$jobOthers realmget_jobothers, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.d = realmget_jobothers;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            int i = message.what;
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        realmGet$jobOthers realmget_jobothers = this.d;
        int d = realmget_jobothers.d(this.b);
        if (realmget_jobothers.a(d)) {
            this.d.d(this.b, d);
        }
    }
}
