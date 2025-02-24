package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.ProviderProxyNativeComponent;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.ExecutorUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.crashlytics.internal.unity.ResourceUnityVersionProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import o.realmSet$kodeBank;
import o.setJatuhTempo;
import o.setLocalClearingCodeBank;
/* loaded from: classes-dex2jar.jar:com/google/firebase/crashlytics/FirebaseCrashlytics.class */
public class FirebaseCrashlytics {
    static final int APP_EXCEPTION_CALLBACK_TIMEOUT_MS = 500;
    static final String FIREBASE_CRASHLYTICS_ANALYTICS_ORIGIN = "clx";
    static final String LEGACY_CRASH_ANALYTICS_ORIGIN = "crash";
    private final CrashlyticsCore core;

    private FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
        this.core = crashlyticsCore;
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static FirebaseCrashlytics init(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Provider<CrashlyticsNativeComponent> provider, Deferred<AnalyticsConnector> deferred) {
        Context applicationContext = firebaseApp.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder("Initializing Firebase Crashlytics ");
        sb.append(CrashlyticsCore.getVersion());
        sb.append(" for ");
        sb.append(packageName);
        logger.i(sb.toString());
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(applicationContext, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        ProviderProxyNativeComponent providerProxyNativeComponent = new ProviderProxyNativeComponent(provider);
        AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferred);
        final CrashlyticsCore crashlyticsCore = new CrashlyticsCore(firebaseApp, idManager, providerProxyNativeComponent, dataCollectionArbiter, analyticsDeferredProxy.getDeferredBreadcrumbSource(), analyticsDeferredProxy.getAnalyticsEventLogger(), ExecutorUtils.buildSingleThreadExecutorService("Crashlytics Exception Handler"));
        String applicationId = firebaseApp.getOptions().getApplicationId();
        String mappingFileId = CommonUtils.getMappingFileId(applicationContext);
        Logger logger2 = Logger.getLogger();
        StringBuilder sb2 = new StringBuilder("Mapping file ID is: ");
        sb2.append(mappingFileId);
        logger2.d(sb2.toString());
        try {
            AppData create = AppData.create(applicationContext, idManager, applicationId, mappingFileId, new ResourceUnityVersionProvider(applicationContext));
            Logger logger3 = Logger.getLogger();
            StringBuilder sb3 = new StringBuilder("Installer package name is: ");
            sb3.append(create.installerPackageName);
            logger3.v(sb3.toString());
            ExecutorService buildSingleThreadExecutorService = ExecutorUtils.buildSingleThreadExecutorService("com.google.firebase.crashlytics.startup");
            final SettingsController create2 = SettingsController.create(applicationContext, applicationId, idManager, new HttpRequestFactory(), create.versionCode, create.versionName, dataCollectionArbiter);
            create2.loadSettingsData(buildSingleThreadExecutorService).b(buildSingleThreadExecutorService, new realmSet$kodeBank<Void, Object>() { // from class: com.google.firebase.crashlytics.FirebaseCrashlytics.1
                @Override // o.realmSet$kodeBank
                public final Object then(setJatuhTempo<Void> setjatuhtempo) throws Exception {
                    if (setjatuhtempo.b()) {
                        return null;
                    }
                    Logger.getLogger().e("Error fetching settings.", setjatuhtempo.d());
                    return null;
                }
            });
            final boolean onPreExecute = crashlyticsCore.onPreExecute(create, create2);
            setLocalClearingCodeBank.c(buildSingleThreadExecutorService, new Callable<Void>() { // from class: com.google.firebase.crashlytics.FirebaseCrashlytics.3
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Void call() throws Exception {
                    if (!onPreExecute) {
                        return null;
                    }
                    crashlyticsCore.doBackgroundInitializationAsync(create2);
                    return null;
                }
            });
            return new FirebaseCrashlytics(crashlyticsCore);
        } catch (PackageManager.NameNotFoundException e) {
            Logger.getLogger().e("Error retrieving app package info.", e);
            return null;
        }
    }

    public setJatuhTempo<Boolean> checkForUnsentReports() {
        return this.core.checkForUnsentReports();
    }

    public void deleteUnsentReports() {
        this.core.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.core.didCrashOnPreviousExecution();
    }

    public void log(String str) {
        this.core.log(str);
    }

    public void recordException(Throwable th) {
        if (th == null) {
            Logger.getLogger().w("A null value was passed to recordException. Ignoring.");
        } else {
            this.core.logException(th);
        }
    }

    public void sendUnsentReports() {
        this.core.sendUnsentReports();
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.core.setCrashlyticsCollectionEnabled(bool);
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.core.setCrashlyticsCollectionEnabled(Boolean.valueOf(z));
    }

    public void setCustomKey(String str, double d) {
        this.core.setCustomKey(str, Double.toString(d));
    }

    public void setCustomKey(String str, float f) {
        this.core.setCustomKey(str, Float.toString(f));
    }

    public void setCustomKey(String str, int i) {
        this.core.setCustomKey(str, Integer.toString(i));
    }

    public void setCustomKey(String str, long j) {
        this.core.setCustomKey(str, Long.toString(j));
    }

    public void setCustomKey(String str, String str2) {
        this.core.setCustomKey(str, str2);
    }

    public void setCustomKey(String str, boolean z) {
        this.core.setCustomKey(str, Boolean.toString(z));
    }

    public void setCustomKeys(CustomKeysAndValues customKeysAndValues) {
        this.core.setCustomKeys(customKeysAndValues.keysAndValues);
    }

    public void setUserId(String str) {
        this.core.setUserId(str);
    }
}
