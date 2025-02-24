package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2-dex2jar.jar:o/BN2PembelianFragment.class */
public class BN2PembelianFragment implements ServiceConnection {
    private boolean a;
    private final Intent b;
    private final Context c;
    private onChooseTujuanPembelian d;
    private final Queue<BN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver> e;
    private final ScheduledExecutorService g;

    public BN2PembelianFragment(Context context) {
        this(context, new ScheduledThreadPoolExecutor(0, (ThreadFactory) new getTujuanTransaksiCode("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private BN2PembelianFragment(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.e = new ArrayDeque();
        this.a = false;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.g = scheduledExecutorService;
    }

    private void d() {
        while (!this.e.isEmpty()) {
            this.e.poll().d.c.a((Object) null);
        }
    }

    private void e() {
        getAlamatPengirim b;
        Context context;
        synchronized (this) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "flush queue called");
            }
            while (!this.e.isEmpty()) {
                if (Log.isLoggable(Constants.TAG, 3)) {
                    Log.d(Constants.TAG, "found intent to be delivered");
                }
                onChooseTujuanPembelian onchoosetujuanpembelian = this.d;
                if (onchoosetujuanpembelian == null || !onchoosetujuanpembelian.isBinderAlive()) {
                    if (Log.isLoggable(Constants.TAG, 3)) {
                        boolean z = this.a;
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("binder is dead. start connection? ");
                        sb.append(!z);
                        Log.d(Constants.TAG, sb.toString());
                    }
                    if (!this.a) {
                        this.a = true;
                        try {
                            b = getAlamatPengirim.b();
                            context = this.c;
                        } catch (SecurityException e) {
                            Log.e(Constants.TAG, "Exception while binding the service", e);
                        }
                        if (!b.c(context, context.getClass().getName(), this.b, this, 65, (Executor) null)) {
                            Log.e(Constants.TAG, "binding to the service failed");
                            this.a = false;
                            d();
                        }
                    }
                    return;
                }
                if (Log.isLoggable(Constants.TAG, 3)) {
                    Log.d(Constants.TAG, "binder is alive, sending the intent.");
                }
                BN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver poll = this.e.poll();
                onChooseTujuanPembelian onchoosetujuanpembelian2 = this.d;
                if (Binder.getCallingUid() == Process.myUid()) {
                    if (Log.isLoggable(Constants.TAG, 3)) {
                        Log.d(Constants.TAG, "service received new intent via bind strategy");
                    }
                    onchoosetujuanpembelian2.d.d(poll.e).e(BN1TujuanPembelian_ViewBinding.b, new realmSet$localClearingCodeBank(poll) { // from class: o.retryGetRate
                        private final BN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver c;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.c = r4;
                        }

                        @Override // o.realmSet$localClearingCodeBank
                        public final void b(setJatuhTempo setjatuhtempo) {
                            this.c.d.c.a((Object) null);
                        }
                    });
                } else {
                    throw new SecurityException("Binding only allowed within app");
                }
            }
        }
    }

    public final setJatuhTempo<Void> e(Intent intent) {
        BahasaLayananDialog bahasaLayananDialog;
        synchronized (this) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "new intent queued in the bind-strategy delivery");
            }
            BN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver bN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver = new BN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver(intent);
            ScheduledExecutorService scheduledExecutorService = this.g;
            bN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver.d.c.e(scheduledExecutorService, new realmSet$localClearingCodeBank(scheduledExecutorService.schedule(new Runnable(bN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver) { // from class: o.onClickDetailTujuan
                private final BN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.b = r4;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver bN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver2 = this.b;
                    String action = bN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver2.e.getAction();
                    StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
                    sb.append("Service took too long to process intent: ");
                    sb.append(action);
                    sb.append(" App may get closed.");
                    Log.w(Constants.TAG, sb.toString());
                    bN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver2.d.c.a((Object) null);
                }
            }, 9000, TimeUnit.MILLISECONDS)) { // from class: o.onAgreementBN
                private final ScheduledFuture b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.b = r4;
                }

                @Override // o.realmSet$localClearingCodeBank
                public final void b(setJatuhTempo setjatuhtempo) {
                    this.b.cancel(false);
                }
            });
            this.e.add(bN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver);
            e();
            bahasaLayananDialog = bN2PembelianFragment$MediaBrowserCompat$CustomActionResultReceiver.d.c;
        }
        return bahasaLayananDialog;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(valueOf);
                Log.d(Constants.TAG, sb.toString());
            }
            this.a = false;
            if (!(iBinder instanceof onChooseTujuanPembelian)) {
                String valueOf2 = String.valueOf(iBinder);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                sb2.append("Invalid service connection: ");
                sb2.append(valueOf2);
                Log.e(Constants.TAG, sb2.toString());
                d();
                return;
            }
            this.d = (onChooseTujuanPembelian) iBinder;
            e();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d(Constants.TAG, sb.toString());
        }
        e();
    }
}
