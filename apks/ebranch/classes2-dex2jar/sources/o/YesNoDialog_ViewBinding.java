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
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.ServiceStarter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:o/YesNoDialog_ViewBinding.class */
public final class YesNoDialog_ViewBinding implements Runnable {
    final FirebaseMessaging a;
    private final PowerManager.WakeLock c;
    private final long d;
    ExecutorService e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new getTujuanTransaksiCode("firebase-iid-executor"));

    public YesNoDialog_ViewBinding(FirebaseMessaging firebaseMessaging, long j) {
        this.a = firebaseMessaging;
        this.d = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.getApplicationContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    private boolean a() throws IOException {
        try {
            if (this.a.blockingGetToken() == null) {
                Log.e(Constants.TAG, "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable(Constants.TAG, 3)) {
                return true;
            } else {
                Log.d(Constants.TAG, "Token successfully retrieved");
                return true;
            }
        } catch (IOException e) {
            if (UserBlockedAfterLoginDialog_ViewBinding.a(e.getMessage())) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                Log.w(Constants.TAG, sb.toString());
                return false;
            } else if (e.getMessage() == null) {
                Log.w(Constants.TAG, "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException e2) {
            Log.w(Constants.TAG, "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public static boolean b() {
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

    public final boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getApplicationContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (ServiceStarter.getInstance().hasWakeLockPermission(this.a.getApplicationContext())) {
            this.c.acquire();
        }
        try {
            try {
                this.a.setSyncScheduledOrRunning(true);
                if (!this.a.isGmsCorePresent()) {
                    this.a.setSyncScheduledOrRunning(false);
                    if (!ServiceStarter.getInstance().hasWakeLockPermission(this.a.getApplicationContext())) {
                        return;
                    }
                } else if (!ServiceStarter.getInstance().hasAccessNetworkStatePermission(this.a.getApplicationContext()) || d()) {
                    if (a()) {
                        this.a.setSyncScheduledOrRunning(false);
                    } else {
                        this.a.syncWithDelaySecondsInternal(this.d);
                    }
                    if (!ServiceStarter.getInstance().hasWakeLockPermission(this.a.getApplicationContext())) {
                        return;
                    }
                } else {
                    YesNoDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver yesNoDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = new BroadcastReceiver(this) { // from class: o.YesNoDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver
                        @Nullable
                        YesNoDialog_ViewBinding c;

                        {
                            this.c = r4;
                        }

                        @Override // android.content.BroadcastReceiver
                        public final void onReceive(Context context, Intent intent) {
                            YesNoDialog_ViewBinding yesNoDialog_ViewBinding = this.c;
                            if (yesNoDialog_ViewBinding != null && yesNoDialog_ViewBinding.d()) {
                                if (YesNoDialog_ViewBinding.b()) {
                                    Log.d(Constants.TAG, "Connectivity changed. Starting background sync.");
                                }
                                this.c.a.enqueueTaskWithDelaySeconds(this.c, 0);
                                this.c.a.getApplicationContext().unregisterReceiver(this);
                                this.c = null;
                            }
                        }
                    };
                    if (b()) {
                        Log.d(Constants.TAG, "Connectivity change received registered");
                    }
                    yesNoDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.c.a.getApplicationContext().registerReceiver(yesNoDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (!ServiceStarter.getInstance().hasWakeLockPermission(this.a.getApplicationContext())) {
                        return;
                    }
                }
            } catch (IOException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e(Constants.TAG, sb.toString());
                this.a.setSyncScheduledOrRunning(false);
                if (!ServiceStarter.getInstance().hasWakeLockPermission(this.a.getApplicationContext())) {
                    return;
                }
            }
            this.c.release();
        } catch (Throwable th) {
            if (ServiceStarter.getInstance().hasWakeLockPermission(this.a.getApplicationContext())) {
                this.c.release();
            }
            throw th;
        }
    }
}
