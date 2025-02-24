package o;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzp;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes-dex2jar.jar:o/realmGet$flagNPWP.class */
public final class realmGet$flagNPWP {
    private static realmGet$flagNPWP e;
    private final Context a;
    private final ScheduledExecutorService b;
    private realmGet$flagGuest c = new realmGet$flagGuest(this);
    private int d = 1;

    private realmGet$flagNPWP(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    private final int d() {
        int i;
        synchronized (this) {
            i = this.d;
            this.d = i + 1;
        }
        return i;
    }

    private final <T> setJatuhTempo<T> d(realmGet$hmCountry<T> realmget_hmcountry) {
        setJatuhTempo<T> c;
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(realmget_hmcountry);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
                sb.append("Queueing ");
                sb.append(valueOf);
                Log.d("MessengerIpcClient", sb.toString());
            }
            if (!this.c.d((realmGet$hmCountry<?>) realmget_hmcountry)) {
                realmGet$flagGuest realmget_flagguest = new realmGet$flagGuest(this);
                this.c = realmget_flagguest;
                realmget_flagguest.d((realmGet$hmCountry<?>) realmget_hmcountry);
            }
            c = realmget_hmcountry.e.c();
        }
        return c;
    }

    public static realmGet$flagNPWP e(Context context) {
        realmGet$flagNPWP realmget_flagnpwp;
        synchronized (realmGet$flagNPWP.class) {
            try {
                if (e == null) {
                    e = new realmGet$flagNPWP(context, getBankTujuanBIC.d().a(1, new getTujuanTransaksiCode("MessengerIpcClient"), getBankTujuanPenerima.e));
                }
                realmget_flagnpwp = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return realmget_flagnpwp;
    }

    public final setJatuhTempo<Bundle> b(int i, Bundle bundle) {
        return d(new realmGet$hmCountry<Bundle>(d(), 1, bundle) { // from class: o.realmGet$hmRW
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.realmGet$hmCountry
            public final boolean a() {
                return false;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.realmGet$hmCountry
            public final void d(Bundle bundle2) {
                Bundle bundle3 = bundle2.getBundle(Constants$ScionAnalytics$MessageType.DATA_MESSAGE);
                Bundle bundle4 = bundle3;
                if (bundle3 == null) {
                    bundle4 = Bundle.EMPTY;
                }
                b((realmGet$hmRW) bundle4);
            }
        });
    }

    public final setJatuhTempo<Void> c(int i, Bundle bundle) {
        return d(new realmGet$hmCountry<Void>(d(), 2, bundle) { // from class: o.realmGet$hmHouseStatus
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.realmGet$hmCountry
            public final boolean a() {
                return true;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.realmGet$hmCountry
            public final void d(Bundle bundle2) {
                if (bundle2.getBoolean("ack", false)) {
                    b((realmGet$hmHouseStatus) null);
                } else {
                    b(new zzp(4, "Invalid response to one way request"));
                }
            }
        });
    }
}
