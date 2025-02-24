package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.BN1NoATMFragment_ViewBinding;
import o.BahasaLayananDialog;
import o.TipeNasabahDialog;
import o.getTujuanTransaksiCode;
import o.onChooseTujuanPembelian;
import o.onChooseTujuanPembelian$MediaBrowserCompat$CustomActionResultReceiver;
import o.realmGet;
import o.realmSet$localClearingCodeBank;
import o.setJatuhTempo;
import o.setJenisWarkat;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/messaging/EnhancedIntentService.class */
public abstract class EnhancedIntentService extends Service {
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock = new Object();
    private int runningTasks = 0;

    public EnhancedIntentService() {
        realmGet.tipeNasabahPenerimaId.b();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new getTujuanTransaksiCode("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            BN1NoATMFragment_ViewBinding.e(intent);
        }
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    public setJatuhTempo<Void> processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
            bahasaLayananDialog.e((Object) null);
            return bahasaLayananDialog;
        }
        setJenisWarkat setjeniswarkat = new setJenisWarkat();
        this.executor.execute(new Runnable(this, intent, setjeniswarkat) { // from class: o.TermConditionDialog
            private final EnhancedIntentService a;
            private final setJenisWarkat c;
            private final Intent d;

            {
                this.a = r4;
                this.d = r5;
                this.c = r6;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$processIntent$0$EnhancedIntentService(this.d, this.c);
            }
        });
        return setjeniswarkat.c;
    }

    protected Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    public final /* synthetic */ void lambda$onStartCommand$1$EnhancedIntentService(Intent intent, setJatuhTempo setjatuhtempo) {
        finishTask(intent);
    }

    public final /* synthetic */ void lambda$processIntent$0$EnhancedIntentService(Intent intent, setJenisWarkat setjeniswarkat) {
        try {
            handleIntent(intent);
        } finally {
            setjeniswarkat.c.e((Object) null);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Binder binder;
        synchronized (this) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new onChooseTujuanPembelian(new onChooseTujuanPembelian$MediaBrowserCompat$CustomActionResultReceiver() { // from class: com.google.firebase.messaging.EnhancedIntentService.3
                    @Override // o.onChooseTujuanPembelian$MediaBrowserCompat$CustomActionResultReceiver
                    public final setJatuhTempo<Void> d(Intent intent2) {
                        return EnhancedIntentService.this.processIntent(intent2);
                    }
                });
            }
            binder = this.binder;
        }
        return binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        setJatuhTempo<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.e()) {
            finishTask(intent);
            return 2;
        }
        processIntent.e(TipeNasabahDialog.a, new realmSet$localClearingCodeBank(this, intent) { // from class: o.TermConditionDialog_ViewBinding
            private final EnhancedIntentService b;
            private final Intent e;

            {
                this.b = r4;
                this.e = r5;
            }

            @Override // o.realmSet$localClearingCodeBank
            public final void b(setJatuhTempo setjatuhtempo) {
                this.b.lambda$onStartCommand$1$EnhancedIntentService(this.e, setjatuhtempo);
            }
        });
        return 3;
    }

    boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
