package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.log.LogFileManager;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import o.SetiapTanggalDialog;
import o.realmSet;
import o.setJatuhTempo;
import o.setLocalClearingCodeBank;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/common/SessionReportingCoordinator.class */
public class SessionReportingCoordinator {
    private static final int EVENT_THREAD_IMPORTANCE;
    private static final String EVENT_TYPE_CRASH;
    private static final String EVENT_TYPE_LOGGED;
    private static final int MAX_CHAINED_EXCEPTION_DEPTH;
    private final CrashlyticsReportDataCapture dataCapture;
    private final LogFileManager logFileManager;
    private final UserMetadata reportMetadata;
    private final CrashlyticsReportPersistence reportPersistence;
    private final DataTransportCrashlyticsReportSender reportsSender;

    SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager, UserMetadata userMetadata) {
        this.dataCapture = crashlyticsReportDataCapture;
        this.reportPersistence = crashlyticsReportPersistence;
        this.reportsSender = dataTransportCrashlyticsReportSender;
        this.logFileManager = logFileManager;
        this.reportMetadata = userMetadata;
    }

    private CrashlyticsReport.Session.Event addLogsAndCustomKeysToEvent(CrashlyticsReport.Session.Event event) {
        return addLogsAndCustomKeysToEvent(event, this.logFileManager, this.reportMetadata);
    }

    private CrashlyticsReport.Session.Event addLogsAndCustomKeysToEvent(CrashlyticsReport.Session.Event event, LogFileManager logFileManager, UserMetadata userMetadata) {
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        String logString = logFileManager.getLogString();
        if (logString != null) {
            builder.setLog(CrashlyticsReport.Session.Event.Log.builder().setContent(logString).build());
        } else {
            Logger.getLogger().v("No log data to include with this event.");
        }
        List<CrashlyticsReport.CustomAttribute> sortedCustomAttributes = getSortedCustomAttributes(userMetadata.getCustomKeys());
        List<CrashlyticsReport.CustomAttribute> sortedCustomAttributes2 = getSortedCustomAttributes(userMetadata.getInternalKeys());
        if (!sortedCustomAttributes.isEmpty()) {
            builder.setApp(event.getApp().toBuilder().setCustomAttributes(ImmutableList.from(sortedCustomAttributes)).setInternalKeys(ImmutableList.from(sortedCustomAttributes2)).build());
        }
        return builder.build();
    }

    private static CrashlyticsReport.ApplicationExitInfo convertApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        String str;
        try {
            str = convertInputStreamToString(applicationExitInfo.getTraceInputStream());
        } catch (IOException | NullPointerException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Could not get input trace in application exit info: ");
            sb.append(applicationExitInfo.toString());
            sb.append(" Error: ");
            sb.append(e);
            logger.w(sb.toString());
            str = null;
        }
        return CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReason()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(str).build();
    }

    public static String convertInputStreamToString(InputStream inputStream) throws IOException, NullPointerException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(StandardCharsets.UTF_8.name())));
        while (true) {
            try {
                int read = bufferedReader.read();
                if (read != -1) {
                    sb.append((char) read);
                } else {
                    String obj = sb.toString();
                    bufferedReader.close();
                    return obj;
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static SessionReportingCoordinator create(Context context, IdManager idManager, FileStore fileStore, AppData appData, LogFileManager logFileManager, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsDataProvider settingsDataProvider) {
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context, idManager, appData, stackTraceTrimmingStrategy), new CrashlyticsReportPersistence(new File(fileStore.getFilesDirPath()), settingsDataProvider), DataTransportCrashlyticsReportSender.create(context), logFileManager, userMetadata);
    }

    private static List<CrashlyticsReport.CustomAttribute> getSortedCustomAttributes(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(CrashlyticsReport.CustomAttribute.builder().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((CrashlyticsReport.CustomAttribute) obj).getKey().compareTo(((CrashlyticsReport.CustomAttribute) obj2).getKey());
            }
        });
        return arrayList;
    }

    public boolean onReportSendComplete(setJatuhTempo<CrashlyticsReportWithSessionId> setjatuhtempo) {
        if (setjatuhtempo.b()) {
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) setjatuhtempo.c();
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Crashlytics report successfully enqueued to DataTransport: ");
            sb.append(crashlyticsReportWithSessionId.getSessionId());
            logger.d(sb.toString());
            this.reportPersistence.deleteFinalizedReport(crashlyticsReportWithSessionId.getSessionId());
            return true;
        }
        Logger.getLogger().w("Crashlytics report could not be enqueued to DataTransport", setjatuhtempo.d());
        return false;
    }

    private void persistEvent(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        this.reportPersistence.persistEvent(addLogsAndCustomKeysToEvent(this.dataCapture.captureEventData(th, thread, str2, j, 4, 8, z)), str, str2.equals(EVENT_TYPE_CRASH));
    }

    public void finalizeSessionWithNativeEvent(String str, List<SetiapTanggalDialog> list) {
        ArrayList arrayList = new ArrayList();
        for (SetiapTanggalDialog setiapTanggalDialog : list) {
            CrashlyticsReport.FilesPayload.File a = setiapTanggalDialog.a();
            if (a != null) {
                arrayList.add(a);
            }
        }
        this.reportPersistence.finalizeSessionWithNativeEvent(str, CrashlyticsReport.FilesPayload.builder().setFiles(ImmutableList.from(arrayList)).build());
    }

    public void finalizeSessions(long j, String str) {
        this.reportPersistence.finalizeReports(str, j);
    }

    public boolean hasReportsToSend() {
        return this.reportPersistence.hasFinalizedReports();
    }

    public List<String> listSortedOpenSessionIds() {
        return this.reportPersistence.listSortedOpenSessionIds();
    }

    public void onBeginSession(String str, long j) {
        this.reportPersistence.persistReport(this.dataCapture.captureReportData(str, j));
    }

    public void onCustomKey(String str, String str2) {
        this.reportMetadata.setCustomKey(str, str2);
    }

    public void onLog(long j, String str) {
        this.logFileManager.writeToLog(j, str);
    }

    public void onUserId(String str) {
        this.reportMetadata.setUserId(str);
    }

    public void persistAppExitInfoEvent(String str, ApplicationExitInfo applicationExitInfo, LogFileManager logFileManager, UserMetadata userMetadata) {
        if (applicationExitInfo.getTimestamp() >= this.reportPersistence.getStartTimestampMillis(str) && applicationExitInfo.getReason() == 6) {
            CrashlyticsReport.Session.Event captureAnrEventData = this.dataCapture.captureAnrEventData(convertApplicationExitInfo(applicationExitInfo));
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Persisting anr for session ");
            sb.append(str);
            logger.d(sb.toString());
            this.reportPersistence.persistEvent(addLogsAndCustomKeysToEvent(captureAnrEventData, logFileManager, userMetadata), str, true);
        }
    }

    public void persistFatalEvent(Throwable th, Thread thread, String str, long j) {
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder("Persisting fatal event for session ");
        sb.append(str);
        logger.v(sb.toString());
        persistEvent(th, thread, str, EVENT_TYPE_CRASH, j, true);
    }

    public void persistNonFatalEvent(Throwable th, Thread thread, String str, long j) {
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder("Persisting non-fatal event for session ");
        sb.append(str);
        logger.v(sb.toString());
        persistEvent(th, thread, str, "error", j, false);
    }

    public void persistUserId(String str) {
        String userId = this.reportMetadata.getUserId();
        if (userId == null) {
            Logger.getLogger().v("Could not persist user ID; no user ID available");
        } else {
            this.reportPersistence.persistUserIdForSession(userId, str);
        }
    }

    public void removeAllReports() {
        this.reportPersistence.deleteAllReports();
    }

    public setJatuhTempo<Void> sendReports(Executor executor) {
        List<CrashlyticsReportWithSessionId> loadFinalizedReports = this.reportPersistence.loadFinalizedReports();
        ArrayList arrayList = new ArrayList();
        for (CrashlyticsReportWithSessionId crashlyticsReportWithSessionId : loadFinalizedReports) {
            arrayList.add(this.reportsSender.sendReport(crashlyticsReportWithSessionId).b(executor, new realmSet.kodeBank() { // from class: com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator$$ExternalSyntheticLambda1
                public final Object then(setJatuhTempo setjatuhtempo) {
                    return Boolean.valueOf(SessionReportingCoordinator.this.onReportSendComplete(setjatuhtempo));
                }
            }));
        }
        return setLocalClearingCodeBank.c(arrayList);
    }
}
