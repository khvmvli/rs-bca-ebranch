package o;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.common.UserMetadata;
import com.google.firebase.crashlytics.internal.log.LogFileManager;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2-dex2jar.jar:o/ScreenshotSuccessDialog.class */
public class ScreenshotSuccessDialog {
    static final FilenameFilter e = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController$$ExternalSyntheticLambda0
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };
    public final profile a;
    public final Context c;
    public ScreenshotSuccessDialog_ViewBinding d;
    final FileStore f;
    public final ResetAccountSuccessDialog g;
    public final DataCollectionArbiter h;
    public final CrashlyticsNativeComponent i;
    public final SessionReportingCoordinator m;
    public final UserMetadata n;

    /* renamed from: o */
    private final AnalyticsEventLogger f53o;
    private final IdManager p;
    private final LogFileManager.DirectoryProvider q;
    private final AppData r;
    private final LogFileManager s;
    private final String t;
    public final setJenisWarkat<Boolean> l = new setJenisWarkat<>();
    public final setJenisWarkat<Boolean> j = new setJenisWarkat<>();
    public final setJenisWarkat<Void> k = new setJenisWarkat<>();
    public final AtomicBoolean b = new AtomicBoolean(false);

    public ScreenshotSuccessDialog(Context context, profile profile, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, ResetAccountSuccessDialog resetAccountSuccessDialog, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, LogFileManager.DirectoryProvider directoryProvider, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger) {
        this.c = context;
        this.a = profile;
        this.p = idManager;
        this.h = dataCollectionArbiter;
        this.f = fileStore;
        this.g = resetAccountSuccessDialog;
        this.r = appData;
        this.n = userMetadata;
        this.s = logFileManager;
        this.q = directoryProvider;
        this.i = crashlyticsNativeComponent;
        this.t = appData.unityVersionProvider.getUnityVersion();
        this.f53o = analyticsEventLogger;
        this.m = sessionReportingCoordinator;
    }

    static /* synthetic */ void a(File[] fileArr) {
        if (fileArr != null) {
            for (File file : fileArr) {
                file.delete();
            }
        }
    }

    private static boolean a() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    static /* synthetic */ long b(long j) {
        return j / 1000;
    }

    public setJatuhTempo<Void> d() {
        BahasaLayananDialog bahasaLayananDialog;
        ArrayList arrayList = new ArrayList();
        File[] c = c(e);
        for (File file : c) {
            try {
                final long parseLong = Long.parseLong(file.getName().substring(3));
                if (a()) {
                    Logger.getLogger().w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    bahasaLayananDialog = new BahasaLayananDialog();
                    bahasaLayananDialog.e((Object) null);
                } else {
                    Logger.getLogger().d("Logging app exception event to Firebase Analytics");
                    bahasaLayananDialog = setLocalClearingCodeBank.c(new ScheduledThreadPoolExecutor(1), new Callable<Void>() { // from class: o.ScreenshotSuccessDialog.3
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Void call() throws Exception {
                            Bundle bundle = new Bundle();
                            bundle.putInt("fatal", 1);
                            bundle.putLong("timestamp", parseLong);
                            ScreenshotSuccessDialog.this.f53o.logEvent("_ae", bundle);
                            return null;
                        }
                    });
                }
                arrayList.add(bahasaLayananDialog);
            } catch (NumberFormatException e2) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("Could not parse app exception timestamp from file ");
                sb.append(file.getName());
                logger.w(sb.toString());
            }
            file.delete();
        }
        return setLocalClearingCodeBank.c(arrayList);
    }

    public void e(long j) {
        try {
            File filesDir = this.f.getFilesDir();
            StringBuilder sb = new StringBuilder(".ae");
            sb.append(j);
            new File(filesDir, sb.toString()).createNewFile();
        } catch (IOException e2) {
            Logger.getLogger().w("Could not create app exception marker file.", e2);
        }
    }

    static /* synthetic */ void h(ScreenshotSuccessDialog screenshotSuccessDialog) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String obj = new ResetAccountSuccessDialog_ViewBinding(screenshotSuccessDialog.p).toString();
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder("Opening a new session with ID ");
        sb.append(obj);
        logger.d(sb.toString());
        screenshotSuccessDialog.i.openSession(obj);
        screenshotSuccessDialog.i.writeBeginSession(obj, String.format(Locale.US, "Crashlytics Android SDK/%s", CrashlyticsCore.getVersion()), currentTimeMillis);
        screenshotSuccessDialog.i.writeSessionApp(obj, screenshotSuccessDialog.p.getAppIdentifier(), screenshotSuccessDialog.r.versionCode, screenshotSuccessDialog.r.versionName, screenshotSuccessDialog.p.getCrashlyticsInstallId(), DeliveryMechanism.determineFrom(screenshotSuccessDialog.r.installerPackageName).getId(), screenshotSuccessDialog.t);
        screenshotSuccessDialog.i.writeSessionOs(obj, Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.isRooted(screenshotSuccessDialog.c));
        Context context = screenshotSuccessDialog.c;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        screenshotSuccessDialog.i.writeSessionDevice(obj, CommonUtils.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.getTotalRamInBytes(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), CommonUtils.isEmulator(context), CommonUtils.getDeviceState(context), Build.MANUFACTURER, Build.PRODUCT);
        screenshotSuccessDialog.s.setCurrentSession(obj);
        screenshotSuccessDialog.m.onBeginSession(obj, currentTimeMillis);
    }

    public final boolean c(SettingsDataProvider settingsDataProvider) {
        if (Boolean.TRUE.equals(this.a.a.get())) {
            ScreenshotSuccessDialog_ViewBinding screenshotSuccessDialog_ViewBinding = this.d;
            if (screenshotSuccessDialog_ViewBinding != null && screenshotSuccessDialog_ViewBinding.d.get()) {
                Logger.getLogger().w("Skipping session finalization because a crash has already occurred.");
                return false;
            }
            Logger.getLogger().v("Finalizing previously open sessions.");
            try {
                d(true, settingsDataProvider);
                Logger.getLogger().v("Closed all previously open sessions.");
                return true;
            } catch (Exception e2) {
                Logger.getLogger().e("Unable to finalize previously open sessions.", e2);
                return false;
            }
        } else {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    File[] c(FilenameFilter filenameFilter) {
        File[] listFiles = this.f.getFilesDir().listFiles(filenameFilter);
        File[] fileArr = listFiles;
        if (listFiles == null) {
            fileArr = new File[0];
        }
        return fileArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void d(boolean z, SettingsDataProvider settingsDataProvider) {
        List<String> listSortedOpenSessionIds = this.m.listSortedOpenSessionIds();
        if (listSortedOpenSessionIds.size() <= z) {
            Logger.getLogger().v("No open sessions to be closed.");
            return;
        }
        String str = listSortedOpenSessionIds.get(z ? 1 : 0);
        boolean z2 = settingsDataProvider.getSettings().getFeaturesData().collectAnrs;
        String str2 = null;
        if (z2) {
            if (Build.VERSION.SDK_INT >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.c.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 1);
                if (historicalProcessExitReasons.size() != 0) {
                    LogFileManager logFileManager = new LogFileManager(this.c, this.q, str);
                    UserMetadata userMetadata = new UserMetadata();
                    userMetadata.setCustomKeys(new onSelectTanggal(this.f.getFilesDir()).e(str, false));
                    this.m.persistAppExitInfoEvent(str, historicalProcessExitReasons.get(0), logFileManager, userMetadata);
                }
            } else {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("ANR feature enabled, but device is API ");
                sb.append(Build.VERSION.SDK_INT);
                logger.v(sb.toString());
            }
        }
        if (this.i.hasCrashDataForSession(str)) {
            Logger logger2 = Logger.getLogger();
            StringBuilder sb2 = new StringBuilder("Finalizing native report for session ");
            sb2.append(str);
            logger2.v(sb2.toString());
            NativeSessionFileProvider sessionFileProvider = this.i.getSessionFileProvider(str);
            File minidumpFile = sessionFileProvider.getMinidumpFile();
            if (minidumpFile == null || !minidumpFile.exists()) {
                Logger logger3 = Logger.getLogger();
                StringBuilder sb3 = new StringBuilder("No minidump data found for session ");
                sb3.append(str);
                logger3.w(sb3.toString());
            } else {
                long lastModified = minidumpFile.lastModified();
                LogFileManager logFileManager2 = new LogFileManager(this.c, this.q, str);
                File file = new File(new File(this.f.getFilesDir(), "native-sessions"), str);
                if (!file.mkdirs()) {
                    Logger.getLogger().w("Couldn't create directory to store native session files, aborting.");
                } else {
                    e(lastModified);
                    File filesDir = this.f.getFilesDir();
                    byte[] bytesForLog = logFileManager2.getBytesForLog();
                    onSelectTanggal onselecttanggal = new onSelectTanggal(filesDir);
                    File b = onselecttanggal.b(str);
                    File d = onselecttanggal.d(str);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new ReservasiCSDialog_ViewBinding("logs_file", "logs", bytesForLog));
                    arrayList.add(new SexDilaog("crash_meta_file", "metadata", sessionFileProvider.getMetadataFile()));
                    arrayList.add(new SexDilaog("session_meta_file", "session", sessionFileProvider.getSessionFile()));
                    arrayList.add(new SexDilaog("app_meta_file", "app", sessionFileProvider.getAppFile()));
                    arrayList.add(new SexDilaog("device_meta_file", "device", sessionFileProvider.getDeviceFile()));
                    arrayList.add(new SexDilaog("os_meta_file", "os", sessionFileProvider.getOsFile()));
                    arrayList.add(new SexDilaog("minidump_file", "minidump", sessionFileProvider.getMinidumpFile()));
                    arrayList.add(new SexDilaog("user_meta_file", "user", b));
                    arrayList.add(new SexDilaog("keys_file", "keys", d));
                    SetiapTanggalDialog_ViewBinding.b(file, arrayList);
                    this.m.finalizeSessionWithNativeEvent(str, arrayList);
                    logFileManager2.clearLog();
                }
            }
            if (!this.i.finalizeSession(str)) {
                Logger logger4 = Logger.getLogger();
                StringBuilder sb4 = new StringBuilder("Could not finalize native session: ");
                sb4.append(str);
                logger4.w(sb4.toString());
            }
        }
        if (z != 0) {
            str2 = listSortedOpenSessionIds.get(0);
        }
        this.m.finalizeSessions(System.currentTimeMillis() / 1000, str2);
    }

    public String e() {
        List<String> listSortedOpenSessionIds = this.m.listSortedOpenSessionIds();
        return !listSortedOpenSessionIds.isEmpty() ? listSortedOpenSessionIds.get(0) : null;
    }
}
