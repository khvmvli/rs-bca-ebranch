package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.BN1NoATMFragment;
import o.BahasaLayananDialog;
import o.TransaksiBerkalaBerhasilDihapusDialog;
import o.TujuanPembelianBNDialog;
import o.TujuanPembelianBNDialog_ViewBinding;
import o.TujuanPemrekDialog;
import o.TujuanTransaksiDialog;
import o.TujuanTransaksiDialog_ViewBinding;
import o.TujuanTransaksiORDialog;
import o.TujuanTransaksiORDialog_ViewBinding;
import o.UpdateDaftarTransferDialog;
import o.UpdateDaftarTransferSuccessDialog;
import o.UpdateDaftarTransferSuccessDialog_ViewBinding;
import o.UpdateReceiverSuccessDialog;
import o.UpgradeAppDialog_ViewBinding;
import o.UserBlockedAfterLoginDialog_ViewBinding;
import o.UserBlockedDialog_ViewBinding;
import o.ValueTodayDialog;
import o.YakinKeluarDialog;
import o.YakinKeluarDialog_ViewBinding;
import o.YesNoDialog_ViewBinding;
import o.getStatusType;
import o.getTujuanTransaksiCode;
import o.ok;
import o.realmSet;
import o.realmSet$kodeBank;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setJatuhTempo;
import o.setJenisWarkat;
import o.setLocalClearingCodeBank;
/* loaded from: classes-dex2jar.jar:com/google/firebase/messaging/FirebaseMessaging.class */
public class FirebaseMessaging {
    @Deprecated
    public static final String INSTANCE_ID_SCOPE;
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private static YakinKeluarDialog_ViewBinding store;
    static ScheduledExecutorService syncExecutor;
    static getStatusType transportFactory;
    private final RemoteActionCompatParcelizer autoInit;
    private final Context context;
    private final Executor fileIoExecutor;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi fis;
    private final UserBlockedAfterLoginDialog_ViewBinding gmsRpc;
    private final FirebaseInstanceIdInternal iid;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final ValueTodayDialog metadata;
    private final UserBlockedDialog_ViewBinding requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Executor taskExecutor;
    private final setJatuhTempo<BN1NoATMFragment> topicsSubscriberTask;

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, getStatusType getstatustype, Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, getstatustype, subscriber, new ValueTodayDialog(firebaseApp.getApplicationContext()));
    }

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, getStatusType getstatustype, Subscriber subscriber, ValueTodayDialog valueTodayDialog) {
        this(firebaseApp, firebaseInstanceIdInternal, firebaseInstallationsApi, getstatustype, subscriber, valueTodayDialog, new UserBlockedAfterLoginDialog_ViewBinding(firebaseApp, valueTodayDialog, provider, provider2, firebaseInstallationsApi), Executors.newSingleThreadExecutor(new getTujuanTransaksiCode("Firebase-Messaging-Task")), new ScheduledThreadPoolExecutor(1, new getTujuanTransaksiCode("Firebase-Messaging-Init")));
    }

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, FirebaseInstallationsApi firebaseInstallationsApi, getStatusType getstatustype, Subscriber subscriber, ValueTodayDialog valueTodayDialog, UserBlockedAfterLoginDialog_ViewBinding userBlockedAfterLoginDialog_ViewBinding, Executor executor, Executor executor2) {
        this.syncScheduledOrRunning = false;
        transportFactory = getstatustype;
        this.firebaseApp = firebaseApp;
        this.iid = firebaseInstanceIdInternal;
        this.fis = firebaseInstallationsApi;
        this.autoInit = new RemoteActionCompatParcelizer(this, subscriber);
        Context applicationContext = firebaseApp.getApplicationContext();
        this.context = applicationContext;
        Application.ActivityLifecycleCallbacks tujuanPembelianBNDialog = new TujuanPembelianBNDialog();
        this.lifecycleCallbacks = tujuanPembelianBNDialog;
        this.metadata = valueTodayDialog;
        this.taskExecutor = executor;
        this.gmsRpc = userBlockedAfterLoginDialog_ViewBinding;
        this.requestDeduplicator = new UserBlockedDialog_ViewBinding(executor);
        this.fileIoExecutor = executor2;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(tujuanPembelianBNDialog);
        } else {
            String valueOf = String.valueOf(applicationContext2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + setHasDecor$MediaBrowserCompat$MediaItem.aM);
            sb.append("Context ");
            sb.append(valueOf);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new TujuanPembelianBNDialog_ViewBinding(this));
        }
        synchronized (FirebaseMessaging.class) {
            try {
                if (store == null) {
                    store = new YakinKeluarDialog_ViewBinding(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        executor2.execute(new TujuanPemrekDialog(this));
        setJatuhTempo<BN1NoATMFragment> b = BN1NoATMFragment.b(this, firebaseInstallationsApi, valueTodayDialog, userBlockedAfterLoginDialog_ViewBinding, applicationContext, new ScheduledThreadPoolExecutor(1, new getTujuanTransaksiCode("Firebase-Messaging-Topics-Io")));
        this.topicsSubscriberTask = b;
        b.b(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new getTujuanTransaksiCode("Firebase-Messaging-Trigger-Topics-Io")), (realmSet.nominal<? super BN1NoATMFragment>) new TujuanTransaksiORDialog(this));
    }

    public static FirebaseMessaging getInstance() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            try {
                instance = getInstance(FirebaseApp.getInstance());
            } catch (Throwable th) {
                throw th;
            }
        }
        return instance;
    }

    static FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            try {
                firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
                if (firebaseMessaging == null) {
                    throw new NullPointerException("Firebase Messaging component is not present");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return firebaseMessaging;
    }

    private String getSubtype() {
        return FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName()) ? "" : this.firebaseApp.getPersistenceKey();
    }

    public static getStatusType getTransportFactory() {
        return transportFactory;
    }

    /* renamed from: invokeOnTokenRefresh */
    public void bridge$lambda$0$FirebaseMessaging(String str) {
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(this.firebaseApp.getName());
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(valueOf) : new String("Invoking onNewToken for app: "));
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new FcmBroadcastProcessor(this.context).process(intent);
        }
    }

    public static final /* synthetic */ setJatuhTempo lambda$subscribeToTopic$6$FirebaseMessaging(String str, BN1NoATMFragment bN1NoATMFragment) throws Exception {
        setJatuhTempo d = bN1NoATMFragment.d(YakinKeluarDialog.a(str));
        if ((bN1NoATMFragment.d.a() != null) && !bN1NoATMFragment.b()) {
            bN1NoATMFragment.c(0);
        }
        return d;
    }

    public static final /* synthetic */ setJatuhTempo lambda$unsubscribeFromTopic$7$FirebaseMessaging(String str, BN1NoATMFragment bN1NoATMFragment) throws Exception {
        setJatuhTempo d = bN1NoATMFragment.d(YakinKeluarDialog.e(str));
        if ((bN1NoATMFragment.d.a() != null) && !bN1NoATMFragment.b()) {
            bN1NoATMFragment.c(0);
        }
        return d;
    }

    private void startSync() {
        synchronized (this) {
            if (!this.syncScheduledOrRunning) {
                syncWithDelaySecondsInternal(0);
            }
        }
    }

    public void startSyncIfNecessary() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public String blockingGetToken() throws IOException {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) setLocalClearingCodeBank.a(firebaseInstanceIdInternal.getTokenTask());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        } else {
            YakinKeluarDialog_ViewBinding.IconCompatParcelizer tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
            if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
                return tokenWithoutTriggeringSync.b;
            }
            String b = ValueTodayDialog.b(this.firebaseApp);
            try {
                String str = (String) setLocalClearingCodeBank.a(this.fis.getId().d(Executors.newSingleThreadExecutor(new getTujuanTransaksiCode("Firebase-Messaging-Network-Io")), new UpdateDaftarTransferSuccessDialog(this, b)));
                store.b(getSubtype(), b, str, this.metadata.c());
                if (tokenWithoutTriggeringSync == null || !str.equals(tokenWithoutTriggeringSync.b)) {
                    bridge$lambda$0$FirebaseMessaging(str);
                }
                return str;
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
    }

    public setJatuhTempo<Void> deleteToken() {
        if (this.iid != null) {
            setJenisWarkat setjeniswarkat = new setJenisWarkat();
            this.fileIoExecutor.execute(new UpdateDaftarTransferDialog(this, setjeniswarkat));
            return setjeniswarkat.c;
        } else if (getTokenWithoutTriggeringSync() == null) {
            BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
            bahasaLayananDialog.e(null);
            return bahasaLayananDialog;
        } else {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new getTujuanTransaksiCode("Firebase-Messaging-Network-Io"));
            return this.fis.getId().d(newSingleThreadExecutor, new TujuanTransaksiDialog(this, newSingleThreadExecutor));
        }
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
    }

    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (syncExecutor == null) {
                    syncExecutor = new ScheduledThreadPoolExecutor(1, new getTujuanTransaksiCode("TAG"));
                }
                syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    public setJatuhTempo<String> getToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.getTokenTask();
        }
        setJenisWarkat setjeniswarkat = new setJenisWarkat();
        this.fileIoExecutor.execute(new TujuanTransaksiORDialog_ViewBinding(this, setjeniswarkat));
        return setjeniswarkat.c;
    }

    YakinKeluarDialog_ViewBinding.IconCompatParcelizer getTokenWithoutTriggeringSync() {
        return store.e(getSubtype(), ValueTodayDialog.b(this.firebaseApp));
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.c();
    }

    public boolean isGmsCorePresent() {
        return this.metadata.e() != 0;
    }

    public final /* synthetic */ setJatuhTempo lambda$blockingGetToken$8$FirebaseMessaging(setJatuhTempo setjatuhtempo) {
        UserBlockedAfterLoginDialog_ViewBinding userBlockedAfterLoginDialog_ViewBinding = this.gmsRpc;
        String str = (String) setjatuhtempo.c();
        String b = ValueTodayDialog.b(userBlockedAfterLoginDialog_ViewBinding.a);
        Bundle bundle = new Bundle();
        userBlockedAfterLoginDialog_ViewBinding.e(str, b, "*", bundle);
        return userBlockedAfterLoginDialog_ViewBinding.e.c(bundle).b(ok.d, (realmSet$kodeBank<Bundle, TContinuationResult>) new UpgradeAppDialog_ViewBinding(userBlockedAfterLoginDialog_ViewBinding));
    }

    public final /* synthetic */ setJatuhTempo lambda$blockingGetToken$9$FirebaseMessaging(String str, setJatuhTempo setjatuhtempo) throws Exception {
        return this.requestDeduplicator.b(str, new UpdateDaftarTransferSuccessDialog_ViewBinding(this, setjatuhtempo));
    }

    public final /* synthetic */ void lambda$deleteToken$3$FirebaseMessaging(setJenisWarkat setjeniswarkat) {
        try {
            this.iid.deleteToken(ValueTodayDialog.b(this.firebaseApp), INSTANCE_ID_SCOPE);
            setjeniswarkat.c.e(null);
        } catch (Exception e) {
            setjeniswarkat.c.c(e);
        }
    }

    public final /* synthetic */ Void lambda$deleteToken$4$FirebaseMessaging(setJatuhTempo setjatuhtempo) throws Exception {
        YakinKeluarDialog_ViewBinding yakinKeluarDialog_ViewBinding = store;
        String subtype = getSubtype();
        String b = ValueTodayDialog.b(this.firebaseApp);
        synchronized (yakinKeluarDialog_ViewBinding) {
            String a = YakinKeluarDialog_ViewBinding.a(subtype, b);
            SharedPreferences.Editor edit = yakinKeluarDialog_ViewBinding.c.edit();
            edit.remove(a);
            edit.commit();
        }
        return null;
    }

    public final /* synthetic */ setJatuhTempo lambda$deleteToken$5$FirebaseMessaging(ExecutorService executorService, setJatuhTempo setjatuhtempo) throws Exception {
        UserBlockedAfterLoginDialog_ViewBinding userBlockedAfterLoginDialog_ViewBinding = this.gmsRpc;
        String str = (String) setjatuhtempo.c();
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        userBlockedAfterLoginDialog_ViewBinding.e(str, ValueTodayDialog.b(userBlockedAfterLoginDialog_ViewBinding.a), "*", bundle);
        return userBlockedAfterLoginDialog_ViewBinding.e.c(bundle).b(ok.d, (realmSet$kodeBank<Bundle, TContinuationResult>) new UpgradeAppDialog_ViewBinding(userBlockedAfterLoginDialog_ViewBinding)).b(executorService, (realmSet$kodeBank<TContinuationResult, TContinuationResult>) new TransaksiBerkalaBerhasilDihapusDialog(this));
    }

    public final /* synthetic */ void lambda$getToken$2$FirebaseMessaging(setJenisWarkat setjeniswarkat) {
        try {
            setjeniswarkat.c.e(blockingGetToken());
        } catch (Exception e) {
            setjeniswarkat.c.c(e);
        }
    }

    public final /* synthetic */ void lambda$new$0$FirebaseMessaging() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    public final /* synthetic */ void lambda$new$1$FirebaseMessaging(BN1NoATMFragment bN1NoATMFragment) {
        if (isAutoInitEnabled()) {
            if ((bN1NoATMFragment.d.a() != null) && !bN1NoATMFragment.b()) {
                bN1NoATMFragment.c(0);
            }
        }
    }

    public void send(RemoteMessage remoteMessage) {
        if (!TextUtils.isEmpty(remoteMessage.getTo())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.context, 0, intent2, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            intent.setPackage("com.google.android.gms");
            remoteMessage.populateSendMessageIntent(intent);
            this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void setAutoInitEnabled(boolean z) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.autoInit;
        synchronized (remoteActionCompatParcelizer) {
            remoteActionCompatParcelizer.a();
            EventHandler eventHandler = remoteActionCompatParcelizer.e;
            if (eventHandler != null) {
                remoteActionCompatParcelizer.a.unsubscribe(DataCollectionDefaultChange.class, eventHandler);
                remoteActionCompatParcelizer.e = null;
            }
            SharedPreferences.Editor edit = remoteActionCompatParcelizer.d.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                remoteActionCompatParcelizer.d.startSyncIfNecessary();
            }
            remoteActionCompatParcelizer.c = Boolean.valueOf(z);
        }
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        MessagingAnalytics.setDeliveryMetricsExportToBigQuery(z);
    }

    public void setSyncScheduledOrRunning(boolean z) {
        synchronized (this) {
            this.syncScheduledOrRunning = z;
        }
    }

    public setJatuhTempo<Void> subscribeToTopic(String str) {
        return this.topicsSubscriberTask.c(new TujuanTransaksiDialog_ViewBinding(str));
    }

    public void syncWithDelaySecondsInternal(long j) {
        synchronized (this) {
            enqueueTaskWithDelaySeconds(new YesNoDialog_ViewBinding(this, Math.min(Math.max(30L, j + j), MAX_DELAY_SEC)), j);
            this.syncScheduledOrRunning = true;
        }
    }

    boolean tokenNeedsRefresh(YakinKeluarDialog_ViewBinding.IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer == null) {
            return true;
        }
        return (System.currentTimeMillis() > (iconCompatParcelizer.e + YakinKeluarDialog_ViewBinding.IconCompatParcelizer.c) ? 1 : (System.currentTimeMillis() == (iconCompatParcelizer.e + YakinKeluarDialog_ViewBinding.IconCompatParcelizer.c) ? 0 : -1)) > 0 || !this.metadata.c().equals(iconCompatParcelizer.d);
    }

    public setJatuhTempo<Void> unsubscribeFromTopic(String str) {
        return this.topicsSubscriberTask.c(new UpdateReceiverSuccessDialog(str));
    }
}
