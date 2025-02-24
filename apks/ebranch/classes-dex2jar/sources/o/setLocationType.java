package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import o.setFlagReservationTellerPrioritas;
/* loaded from: classes-dex2jar.jar:o/setLocationType.class */
final class setLocationType implements setFlagReservationTellerPrioritas {
    private final BroadcastReceiver a = new BroadcastReceiver() { // from class: o.setLocationType.3
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean z = setLocationType.this.c;
            setLocationType.this.c = setLocationType.c(context);
            if (z != setLocationType.this.c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder sb = new StringBuilder("connectivity changed, isConnected: ");
                    sb.append(setLocationType.this.c);
                    Log.d("ConnectivityMonitor", sb.toString());
                }
                setLocationType.this.b.a(setLocationType.this.c);
            }
        }
    };
    final setFlagReservationTellerPrioritas.IconCompatParcelizer b;
    boolean c;
    private boolean d;
    private final Context e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setLocationType(Context context, setFlagReservationTellerPrioritas.IconCompatParcelizer iconCompatParcelizer) {
        this.e = context.getApplicationContext();
        this.b = iconCompatParcelizer;
    }

    static boolean c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            boolean z = true;
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    z = false;
                }
                return z;
            } catch (RuntimeException e) {
                if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                    return true;
                }
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
                return true;
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    @Override // o.setVendorKiosk
    public final void a() {
        if (this.d) {
            this.e.unregisterReceiver(this.a);
            this.d = false;
        }
    }

    @Override // o.setVendorKiosk
    public final void c() {
    }

    @Override // o.setVendorKiosk
    public final void d() {
        if (!this.d) {
            this.c = c(this.e);
            try {
                this.e.registerReceiver(this.a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.d = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }
}
