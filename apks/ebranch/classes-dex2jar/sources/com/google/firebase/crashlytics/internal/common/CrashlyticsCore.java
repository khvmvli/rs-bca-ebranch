package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore$;
import com.google.firebase.crashlytics.internal.log.LogFileManager;
import com.google.firebase.crashlytics.internal.persistence.FileStoreImpl;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.io.File;
import java.lang.Thread;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.BahasaLayananDialog;
import o.ResetAccountSuccessDialog;
import o.ScreenshotSuccessDialog;
import o.ScreenshotSuccessDialog_ViewBinding;
import o.profile;
import o.setJatuhTempo;
import o.setJenisWarkat;
/* loaded from: classes-dex2jar.jar:com/google/firebase/crashlytics/internal/common/CrashlyticsCore.class */
public class CrashlyticsCore {
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_STACK_SIZE = 1024;
    private static final String MISSING_BUILD_ID_MSG = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.";
    static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    private final AnalyticsEventLogger analyticsEventLogger;
    private final FirebaseApp app;
    private final profile backgroundWorker;
    private final BreadcrumbSource breadcrumbSource;
    private final Context context;
    private ScreenshotSuccessDialog controller;
    private final ExecutorService crashHandlerExecutor;
    private ResetAccountSuccessDialog crashMarker;
    private final DataCollectionArbiter dataCollectionArbiter;
    private boolean didCrashOnPreviousExecution;
    private final IdManager idManager;
    private ResetAccountSuccessDialog initializationMarker;
    private final CrashlyticsNativeComponent nativeComponent;
    private final long startTime = System.currentTimeMillis();

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, CrashlyticsNativeComponent crashlyticsNativeComponent, DataCollectionArbiter dataCollectionArbiter, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger, ExecutorService executorService) {
        this.app = firebaseApp;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.context = firebaseApp.getApplicationContext();
        this.idManager = idManager;
        this.nativeComponent = crashlyticsNativeComponent;
        this.breadcrumbSource = breadcrumbSource;
        this.analyticsEventLogger = analyticsEventLogger;
        this.crashHandlerExecutor = executorService;
        this.backgroundWorker = new profile(executorService);
    }

    private void checkForPreviousCrash() {
        try {
            this.didCrashOnPreviousExecution = Boolean.TRUE.equals((Boolean) Utils.awaitEvenIfOnMainThread(this.backgroundWorker.e(new 4(this))));
        } catch (Exception e) {
            this.didCrashOnPreviousExecution = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public setJatuhTempo<Void> doBackgroundInitialization(SettingsDataProvider settingsDataProvider) {
        BahasaLayananDialog bahasaLayananDialog;
        BahasaLayananDialog bahasaLayananDialog2;
        try {
            markInitializationStarted();
            this.breadcrumbSource.registerBreadcrumbHandler(new CrashlyticsCore$.ExternalSyntheticLambda0(this));
            if (!settingsDataProvider.getSettings().getFeaturesData().collectReports) {
                Logger.getLogger().d("Collection of crash reports disabled in Crashlytics settings.");
                RuntimeException runtimeException = new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                BahasaLayananDialog bahasaLayananDialog3 = new BahasaLayananDialog();
                bahasaLayananDialog3.c(runtimeException);
                return bahasaLayananDialog3;
            }
            if (!this.controller.c(settingsDataProvider)) {
                Logger.getLogger().w("Previous sessions could not be finalized.");
            }
            ScreenshotSuccessDialog screenshotSuccessDialog = this.controller;
            setJatuhTempo<AppSettingsData> appSettings = settingsDataProvider.getAppSettings();
            if (!screenshotSuccessDialog.m.hasReportsToSend()) {
                Logger.getLogger().v("No crash reports are available to be sent.");
                setJenisWarkat setjeniswarkat = screenshotSuccessDialog.l;
                setjeniswarkat.c.a(Boolean.FALSE);
                BahasaLayananDialog bahasaLayananDialog4 = new BahasaLayananDialog();
                bahasaLayananDialog4.e(null);
                bahasaLayananDialog = bahasaLayananDialog4;
            } else {
                Logger.getLogger().v("Crash reports are available to be sent.");
                boolean isAutomaticDataCollectionEnabled = screenshotSuccessDialog.h.isAutomaticDataCollectionEnabled();
                Boolean bool = Boolean.TRUE;
                if (isAutomaticDataCollectionEnabled) {
                    Logger.getLogger().d("Automatic data collection is enabled. Allowing upload.");
                    setJenisWarkat setjeniswarkat2 = screenshotSuccessDialog.l;
                    setjeniswarkat2.c.a(Boolean.FALSE);
                    BahasaLayananDialog bahasaLayananDialog5 = new BahasaLayananDialog();
                    bahasaLayananDialog5.e(bool);
                    bahasaLayananDialog2 = bahasaLayananDialog5;
                } else {
                    Logger.getLogger().d("Automatic data collection is disabled.");
                    Logger.getLogger().v("Notifying that unsent reports are available.");
                    screenshotSuccessDialog.l.c.a(bool);
                    setJatuhTempo<TContinuationResult> c = screenshotSuccessDialog.h.waitForAutomaticDataCollectionEnabled().c(new ScreenshotSuccessDialog.5(screenshotSuccessDialog));
                    Logger.getLogger().d("Waiting for send/deleteUnsentReports to be called.");
                    bahasaLayananDialog2 = Utils.race(c, screenshotSuccessDialog.j.c);
                }
                bahasaLayananDialog = bahasaLayananDialog2.c(new ScreenshotSuccessDialog.1(screenshotSuccessDialog, appSettings));
            }
            return bahasaLayananDialog;
        } catch (Exception e) {
            Logger.getLogger().e("Crashlytics encountered a problem during asynchronous initialization.", e);
            BahasaLayananDialog bahasaLayananDialog6 = new BahasaLayananDialog();
            bahasaLayananDialog6.c(e);
            return bahasaLayananDialog6;
        } finally {
            markInitializationComplete();
        }
    }

    private void finishInitSynchronously(SettingsDataProvider settingsDataProvider) {
        Future<?> submit = this.crashHandlerExecutor.submit(new 3(this, settingsDataProvider));
        Logger.getLogger().d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Logger.getLogger().e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            Logger.getLogger().e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Logger.getLogger().e("Crashlytics timed out during initialization.", e3);
        }
    }

    public static String getVersion() {
        return "18.2.0";
    }

    static boolean isBuildIdValid(String str, boolean z) {
        if (!z) {
            Logger.getLogger().v("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            Log.e(Logger.TAG, ".");
            Log.e(Logger.TAG, ".     |  | ");
            Log.e(Logger.TAG, ".     |  |");
            Log.e(Logger.TAG, ".     |  |");
            Log.e(Logger.TAG, ".   \\ |  | /");
            Log.e(Logger.TAG, ".    \\    /");
            Log.e(Logger.TAG, ".     \\  /");
            Log.e(Logger.TAG, ".      \\/");
            Log.e(Logger.TAG, ".");
            Log.e(Logger.TAG, MISSING_BUILD_ID_MSG);
            Log.e(Logger.TAG, ".");
            Log.e(Logger.TAG, ".      /\\");
            Log.e(Logger.TAG, ".     /  \\");
            Log.e(Logger.TAG, ".    /    \\");
            Log.e(Logger.TAG, ".   / |  | \\");
            Log.e(Logger.TAG, ".     |  |");
            Log.e(Logger.TAG, ".     |  |");
            Log.e(Logger.TAG, ".     |  |");
            Log.e(Logger.TAG, ".");
            return false;
        }
    }

    public setJatuhTempo<Boolean> checkForUnsentReports() {
        ScreenshotSuccessDialog screenshotSuccessDialog = this.controller;
        if (screenshotSuccessDialog.b.compareAndSet(false, true)) {
            return screenshotSuccessDialog.l.c;
        }
        Logger.getLogger().w("checkForUnsentReports should only be called once per execution.");
        Boolean bool = Boolean.FALSE;
        BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
        bahasaLayananDialog.e(bool);
        return bahasaLayananDialog;
    }

    public setJatuhTempo<Void> deleteUnsentReports() {
        ScreenshotSuccessDialog screenshotSuccessDialog = this.controller;
        setJenisWarkat setjeniswarkat = screenshotSuccessDialog.j;
        setjeniswarkat.c.a(Boolean.FALSE);
        return screenshotSuccessDialog.k.c;
    }

    public boolean didCrashOnPreviousExecution() {
        return this.didCrashOnPreviousExecution;
    }

    boolean didPreviousInitializationFail() {
        ResetAccountSuccessDialog resetAccountSuccessDialog = this.initializationMarker;
        return new File(resetAccountSuccessDialog.c.getFilesDir(), resetAccountSuccessDialog.a).exists();
    }

    public setJatuhTempo<Void> doBackgroundInitializationAsync(SettingsDataProvider settingsDataProvider) {
        return Utils.callTask(this.crashHandlerExecutor, new 1(this, settingsDataProvider));
    }

    ScreenshotSuccessDialog getController() {
        return this.controller;
    }

    public void log(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.startTime;
        ScreenshotSuccessDialog screenshotSuccessDialog = this.controller;
        screenshotSuccessDialog.a.e(new ScreenshotSuccessDialog.8(screenshotSuccessDialog, currentTimeMillis - j, str));
    }

    public void logException(Throwable th) {
        ScreenshotSuccessDialog screenshotSuccessDialog = this.controller;
        Thread currentThread = Thread.currentThread();
        long currentTimeMillis = System.currentTimeMillis();
        profile profile = screenshotSuccessDialog.a;
        profile.e(new profile.2(profile, new ScreenshotSuccessDialog.6(screenshotSuccessDialog, currentTimeMillis, th, currentThread)));
    }

    void markInitializationComplete() {
        this.backgroundWorker.e(new 2(this));
    }

    void markInitializationStarted() {
        if (Boolean.TRUE.equals(this.backgroundWorker.a.get())) {
            this.initializationMarker.b();
            Logger.getLogger().v("Initialization marker file was created.");
            return;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public boolean onPreExecute(AppData appData, SettingsDataProvider settingsDataProvider) {
        if (isBuildIdValid(appData.buildId, CommonUtils.getBooleanResourceValue(this.context, CRASHLYTICS_REQUIRE_BUILD_ID, true))) {
            try {
                FileStoreImpl fileStoreImpl = new FileStoreImpl(this.context);
                this.crashMarker = new ResetAccountSuccessDialog(CRASH_MARKER_FILE_NAME, fileStoreImpl);
                this.initializationMarker = new ResetAccountSuccessDialog(INITIALIZATION_MARKER_FILE_NAME, fileStoreImpl);
                UserMetadata userMetadata = new UserMetadata();
                read read = new read(fileStoreImpl);
                LogFileManager logFileManager = new LogFileManager(this.context, read);
                this.controller = new ScreenshotSuccessDialog(this.context, this.backgroundWorker, this.idManager, this.dataCollectionArbiter, fileStoreImpl, this.crashMarker, appData, userMetadata, logFileManager, read, SessionReportingCoordinator.create(this.context, this.idManager, fileStoreImpl, appData, logFileManager, userMetadata, new MiddleOutFallbackStrategy((int) MAX_STACK_SIZE, new StackTraceTrimmingStrategy[]{new RemoveRepeatsStrategy(10)}), settingsDataProvider), this.nativeComponent, this.analyticsEventLogger);
                boolean didPreviousInitializationFail = didPreviousInitializationFail();
                checkForPreviousCrash();
                ScreenshotSuccessDialog screenshotSuccessDialog = this.controller;
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                screenshotSuccessDialog.a.e(new ScreenshotSuccessDialog.7(screenshotSuccessDialog));
                ScreenshotSuccessDialog_ViewBinding screenshotSuccessDialog_ViewBinding = new ScreenshotSuccessDialog_ViewBinding(new ScreenshotSuccessDialog.4(screenshotSuccessDialog), settingsDataProvider, defaultUncaughtExceptionHandler);
                screenshotSuccessDialog.d = screenshotSuccessDialog_ViewBinding;
                Thread.setDefaultUncaughtExceptionHandler(screenshotSuccessDialog_ViewBinding);
                if (!didPreviousInitializationFail || !CommonUtils.canTryConnection(this.context)) {
                    Logger.getLogger().d("Successfully configured exception handler.");
                    return true;
                }
                Logger.getLogger().d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                finishInitSynchronously(settingsDataProvider);
                return false;
            } catch (Exception e) {
                Logger.getLogger().e("Crashlytics was not started due to an exception during initialization", e);
                this.controller = null;
                return false;
            }
        } else {
            throw new IllegalStateException(MISSING_BUILD_ID_MSG);
        }
    }

    public setJatuhTempo<Void> sendUnsentReports() {
        ScreenshotSuccessDialog screenshotSuccessDialog = this.controller;
        setJenisWarkat setjeniswarkat = screenshotSuccessDialog.j;
        setjeniswarkat.c.a(Boolean.TRUE);
        return screenshotSuccessDialog.k.c;
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.dataCollectionArbiter.setCrashlyticsDataCollectionEnabled(bool);
    }

    public void setCustomKey(String str, String str2) {
        ScreenshotSuccessDialog screenshotSuccessDialog = this.controller;
        try {
            screenshotSuccessDialog.n.setCustomKey(str, str2);
            screenshotSuccessDialog.a.e(new ScreenshotSuccessDialog.9(screenshotSuccessDialog, screenshotSuccessDialog.n.getCustomKeys(), false));
        } catch (IllegalArgumentException e) {
            Context context = screenshotSuccessDialog.c;
            if (context == null || !CommonUtils.isAppDebuggable(context)) {
                Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e;
        }
    }

    public void setCustomKeys(Map<String, String> map) {
        ScreenshotSuccessDialog screenshotSuccessDialog = this.controller;
        screenshotSuccessDialog.n.setCustomKeys(map);
        screenshotSuccessDialog.a.e(new ScreenshotSuccessDialog.9(screenshotSuccessDialog, screenshotSuccessDialog.n.getCustomKeys(), false));
    }

    public void setInternalKey(String str, String str2) {
        ScreenshotSuccessDialog screenshotSuccessDialog = this.controller;
        try {
            screenshotSuccessDialog.n.setInternalKey(str, str2);
            screenshotSuccessDialog.a.e(new ScreenshotSuccessDialog.9(screenshotSuccessDialog, screenshotSuccessDialog.n.getInternalKeys(), true));
        } catch (IllegalArgumentException e) {
            Context context = screenshotSuccessDialog.c;
            if (context == null || !CommonUtils.isAppDebuggable(context)) {
                Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e;
        }
    }

    public void setUserId(String str) {
        ScreenshotSuccessDialog screenshotSuccessDialog = this.controller;
        screenshotSuccessDialog.n.setUserId(str);
        screenshotSuccessDialog.a.e(new ScreenshotSuccessDialog.10(screenshotSuccessDialog, screenshotSuccessDialog.n));
    }
}
