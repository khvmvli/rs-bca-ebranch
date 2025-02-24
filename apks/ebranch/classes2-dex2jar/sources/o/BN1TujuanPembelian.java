package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/BN1TujuanPembelian.class */
public final class BN1TujuanPembelian implements Runnable {
    private static Boolean a;
    private static Boolean b;
    private static final Object c = new Object();
    private final Context d;
    private final ValueTodayDialog e;
    private final long g;
    private final PowerManager.WakeLock i;
    private final BN1NoATMFragment j;

    /* loaded from: classes2-dex2jar.jar:o/BN1TujuanPembelian$RemoteActionCompatParcelizer.class */
    final class RemoteActionCompatParcelizer extends BroadcastReceiver {
        private BN1TujuanPembelian d;

        public RemoteActionCompatParcelizer(BN1TujuanPembelian bN1TujuanPembelian) {
            this.d = bN1TujuanPembelian;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (this) {
                BN1TujuanPembelian bN1TujuanPembelian = this.d;
                if (bN1TujuanPembelian != null) {
                    if (bN1TujuanPembelian.c()) {
                        if (BN1TujuanPembelian.e()) {
                            Log.d(Constants.TAG, "Connectivity changed. Starting background sync.");
                        }
                        BN1NoATMFragment bN1NoATMFragment = this.d.j;
                        bN1NoATMFragment.c.schedule(this.d, 0, TimeUnit.SECONDS);
                        context.unregisterReceiver(this);
                        this.d = null;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BN1TujuanPembelian(BN1NoATMFragment bN1NoATMFragment, Context context, ValueTodayDialog valueTodayDialog, long j) {
        this.j = bN1NoATMFragment;
        this.d = context;
        this.g = j;
        this.e = valueTodayDialog;
        this.i = ((PowerManager) context.getSystemService("power")).newWakeLock(1, Constants.FCM_WAKE_LOCK);
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    private static boolean a(Context context) {
        boolean booleanValue;
        synchronized (c) {
            Boolean bool = a;
            Boolean valueOf = Boolean.valueOf(bool == null ? c(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            a = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        synchronized (this) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.d.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        }
    }

    private static boolean c(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable(Constants.TAG, 3)) {
            return z;
        }
        Log.d(Constants.TAG, a(str));
        return false;
    }

    private static boolean d(Context context) {
        boolean booleanValue;
        synchronized (c) {
            Boolean bool = b;
            Boolean valueOf = Boolean.valueOf(bool == null ? c(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            b = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    static /* synthetic */ boolean e() {
        boolean z = false;
        if (!Log.isLoggable(Constants.TAG, 3)) {
            if (Build.VERSION.SDK_INT == 23) {
                if (!Log.isLoggable(Constants.TAG, 3)) {
                    return false;
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (d(this.d)) {
            this.i.acquire(Constants.WAKE_LOCK_ACQUIRE_TIMEOUT_MILLIS);
        }
        try {
            try {
                BN1NoATMFragment bN1NoATMFragment = this.j;
                synchronized (bN1NoATMFragment) {
                    z = true;
                    bN1NoATMFragment.b = true;
                }
                if (this.e.e() == 0) {
                    z = false;
                }
                if (!z) {
                    BN1NoATMFragment bN1NoATMFragment2 = this.j;
                    synchronized (bN1NoATMFragment2) {
                        bN1NoATMFragment2.b = false;
                    }
                    if (d(this.d)) {
                        try {
                            this.i.release();
                        } catch (RuntimeException e) {
                            Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else if (!a(this.d) || c()) {
                    if (this.j.c()) {
                        BN1NoATMFragment bN1NoATMFragment3 = this.j;
                        synchronized (bN1NoATMFragment3) {
                            bN1NoATMFragment3.b = false;
                        }
                    } else {
                        this.j.c(this.g);
                    }
                    if (d(this.d)) {
                        try {
                            this.i.release();
                        } catch (RuntimeException e2) {
                            Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this);
                    if (e()) {
                        Log.d(Constants.TAG, "Connectivity change received registered");
                    }
                    BN1TujuanPembelian.this.d.registerReceiver(remoteActionCompatParcelizer, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (d(this.d)) {
                        try {
                            this.i.release();
                        } catch (RuntimeException e3) {
                            Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                }
            } catch (Throwable th) {
                if (d(this.d)) {
                    try {
                        this.i.release();
                    } catch (RuntimeException e4) {
                        Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            String valueOf = String.valueOf(e5.getMessage());
            Log.e(Constants.TAG, valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
            BN1NoATMFragment bN1NoATMFragment4 = this.j;
            synchronized (bN1NoATMFragment4) {
                bN1NoATMFragment4.b = false;
                if (d(this.d)) {
                    try {
                        this.i.release();
                    } catch (RuntimeException e6) {
                        Log.i(Constants.TAG, "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        }
    }
}
