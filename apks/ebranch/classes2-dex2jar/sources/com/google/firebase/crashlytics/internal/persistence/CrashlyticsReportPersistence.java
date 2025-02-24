package com.google.firebase.crashlytics.internal.persistence;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/persistence/CrashlyticsReportPersistence.class */
public class CrashlyticsReportPersistence {
    private static final String APP_EXIT_INFO_FILE_NAME;
    private static final String EVENT_COUNTER_FORMAT;
    private static final int EVENT_COUNTER_WIDTH;
    private static final String EVENT_FILE_NAME_PREFIX;
    private static final String EVENT_TYPE_ANR;
    private static final int MAX_OPEN_SESSIONS;
    private static final String NATIVE_REPORTS_DIRECTORY;
    private static final String NORMAL_EVENT_SUFFIX;
    private static final String OPEN_SESSIONS_DIRECTORY_NAME;
    private static final String PRIORITY_EVENT_SUFFIX;
    private static final String PRIORITY_REPORTS_DIRECTORY;
    private static final String REPORTS_DIRECTORY;
    private static final String REPORT_FILE_NAME;
    private static final String SESSION_START_TIMESTAMP_FILE_NAME;
    private static final String USER_FILE_NAME;
    private static final String WORKING_DIRECTORY_NAME;
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final File nativeReportsDirectory;
    private final File openSessionsDirectory;
    private final File priorityReportsDirectory;
    private final File reportsDirectory;
    private final SettingsDataProvider settingsDataProvider;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final int EVENT_NAME_LENGTH = 15;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final Comparator<? super File> LATEST_SESSION_ID_FIRST_COMPARATOR = new Comparator() { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };
    private static final FilenameFilter EVENT_FILE_FILTER = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda2
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(CrashlyticsReportPersistence.EVENT_FILE_NAME_PREFIX);
        }
    };

    public CrashlyticsReportPersistence(File file, SettingsDataProvider settingsDataProvider) {
        File file2 = new File(file, WORKING_DIRECTORY_NAME);
        this.openSessionsDirectory = new File(file2, OPEN_SESSIONS_DIRECTORY_NAME);
        this.priorityReportsDirectory = new File(file2, PRIORITY_REPORTS_DIRECTORY);
        this.reportsDirectory = new File(file2, REPORTS_DIRECTORY);
        this.nativeReportsDirectory = new File(file2, NATIVE_REPORTS_DIRECTORY);
        this.settingsDataProvider = settingsDataProvider;
    }

    private List<File> capAndGetOpenSessions(String str) {
        List<File> filesInDirectory = getFilesInDirectory(this.openSessionsDirectory, new FileFilter(str) { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda0
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r4;
            }

            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return CrashlyticsReportPersistence.lambda$capAndGetOpenSessions$3(this.f$0, file);
            }
        });
        Collections.sort(filesInDirectory, LATEST_SESSION_ID_FIRST_COMPARATOR);
        if (filesInDirectory.size() <= 8) {
            return filesInDirectory;
        }
        for (File file : filesInDirectory.subList(8, filesInDirectory.size())) {
            recursiveDelete(file);
        }
        return filesInDirectory.subList(0, 8);
    }

    private static int capFilesCount(List<File> list, int i) {
        int size = list.size();
        for (File file : list) {
            if (size <= i) {
                return size;
            }
            recursiveDelete(file);
            size--;
        }
        return size;
    }

    private void capFinalizedReports() {
        int i = this.settingsDataProvider.getSettings().getSessionData().maxCompleteSessionsCount;
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        int size = allFinalizedReportFiles.size();
        if (size > i) {
            for (File file : allFinalizedReportFiles.subList(i, size)) {
                file.delete();
            }
        }
    }

    private static List<File> combineReportFiles(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (List<File> list : listArr) {
            i += list.size();
        }
        arrayList.ensureCapacity(i);
        for (List<File> list2 : listArr) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    private static long convertTimestampFromSecondsToMs(long j) {
        return j * 1000;
    }

    private static String generateEventFilename(int i, boolean z) {
        String format = String.format(Locale.US, EVENT_COUNTER_FORMAT, Integer.valueOf(i));
        String str = z ? PRIORITY_EVENT_SUFFIX : "";
        StringBuilder sb = new StringBuilder(EVENT_FILE_NAME_PREFIX);
        sb.append(format);
        sb.append(str);
        return sb.toString();
    }

    private static List<File> getAllFilesInDirectory(File file) {
        return getFilesInDirectory(file, (FileFilter) null);
    }

    private List<File> getAllFinalizedReportFiles() {
        return sortAndCombineReportFiles(combineReportFiles(getAllFilesInDirectory(this.priorityReportsDirectory), getAllFilesInDirectory(this.nativeReportsDirectory)), getAllFilesInDirectory(this.reportsDirectory));
    }

    private static String getEventNameWithoutPriority(String str) {
        return str.substring(0, EVENT_NAME_LENGTH);
    }

    private static List<File> getFilesInDirectory(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private static List<File> getFilesInDirectory(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private File getSessionDirectoryById(String str) {
        return new File(this.openSessionsDirectory, str);
    }

    private static boolean isHighPriorityEventFile(String str) {
        return str.startsWith(EVENT_FILE_NAME_PREFIX) && str.endsWith(PRIORITY_EVENT_SUFFIX);
    }

    public static boolean isNormalPriorityEventFile(File file, String str) {
        return str.startsWith(EVENT_FILE_NAME_PREFIX) && !str.endsWith(PRIORITY_EVENT_SUFFIX);
    }

    public static /* synthetic */ boolean lambda$capAndGetOpenSessions$3(String str, File file) {
        return file.isDirectory() && !file.getName().equals(str);
    }

    private static boolean makeDirectory(File file) {
        return file.exists() || file.mkdirs();
    }

    public static int oldestEventFileFirst(File file, File file2) {
        return getEventNameWithoutPriority(file.getName()).compareTo(getEventNameWithoutPriority(file2.getName()));
    }

    private static File prepareDirectory(File file) throws IOException {
        if (makeDirectory(file)) {
            return file;
        }
        StringBuilder sb = new StringBuilder("Could not create directory ");
        sb.append(file);
        throw new IOException(sb.toString());
    }

    private static String readTextFile(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), UTF_8);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private static void recursiveDelete(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    recursiveDelete(file2);
                }
            }
            file.delete();
        }
    }

    private static List<File> sortAndCombineReportFiles(List<File>... listArr) {
        for (List<File> list : listArr) {
            Collections.sort(list, LATEST_SESSION_ID_FIRST_COMPARATOR);
        }
        return combineReportFiles(listArr);
    }

    private static void synthesizeNativeReportFile(File file, File file2, CrashlyticsReport.FilesPayload filesPayload, String str) {
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = TRANSFORM;
            writeTextFile(new File(prepareDirectory(file2), str), crashlyticsReportJsonTransform.reportToJson(crashlyticsReportJsonTransform.reportFromJson(readTextFile(file)).withNdkPayload(filesPayload)));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Could not synthesize final native report file for ");
            sb.append(file);
            logger.w(sb.toString(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void synthesizeReport(java.io.File r9, long r10) {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence.synthesizeReport(java.io.File, long):void");
    }

    private static void synthesizeReportFile(File file, File file2, List<CrashlyticsReport.Session.Event> list, long j, boolean z, String str) {
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = TRANSFORM;
            CrashlyticsReport withEvents = crashlyticsReportJsonTransform.reportFromJson(readTextFile(file)).withSessionEndFields(j, z, str).withEvents(ImmutableList.from(list));
            CrashlyticsReport.Session session = withEvents.getSession();
            if (session != null) {
                writeTextFile(new File(prepareDirectory(file2), session.getIdentifier()), crashlyticsReportJsonTransform.reportToJson(withEvents));
            }
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Could not synthesize final report file for ");
            sb.append(file);
            logger.w(sb.toString(), e);
        }
    }

    private static int trimEvents(File file, int i) {
        List<File> filesInDirectory = getFilesInDirectory(file, new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda3
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return CrashlyticsReportPersistence.isNormalPriorityEventFile(file2, str);
            }
        });
        Collections.sort(filesInDirectory, new Comparator() { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
            }
        });
        return capFilesCount(filesInDirectory, i);
    }

    private static void writeTextFile(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void writeTextFile(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(convertTimestampFromSecondsToMs(j));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void deleteAllReports() {
        for (File file : getAllFinalizedReportFiles()) {
            file.delete();
        }
    }

    public void deleteFinalizedReport(String str) {
        CrashlyticsReportPersistence$$ExternalSyntheticLambda5 crashlyticsReportPersistence$$ExternalSyntheticLambda5 = new FilenameFilter(str) { // from class: com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence$$ExternalSyntheticLambda5
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r4;
            }

            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(this.f$0);
            }
        };
        for (File file : combineReportFiles(getFilesInDirectory(this.priorityReportsDirectory, crashlyticsReportPersistence$$ExternalSyntheticLambda5), getFilesInDirectory(this.nativeReportsDirectory, crashlyticsReportPersistence$$ExternalSyntheticLambda5), getFilesInDirectory(this.reportsDirectory, crashlyticsReportPersistence$$ExternalSyntheticLambda5))) {
            file.delete();
        }
    }

    public void finalizeReports(String str, long j) {
        for (File file : capAndGetOpenSessions(str)) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Finalizing report for session ");
            sb.append(file.getName());
            logger.v(sb.toString());
            synthesizeReport(file, j);
            recursiveDelete(file);
        }
        capFinalizedReports();
    }

    public void finalizeSessionWithNativeEvent(String str, CrashlyticsReport.FilesPayload filesPayload) {
        synthesizeNativeReportFile(new File(getSessionDirectoryById(str), REPORT_FILE_NAME), this.nativeReportsDirectory, filesPayload, str);
    }

    public long getStartTimestampMillis(String str) {
        return new File(getSessionDirectoryById(str), SESSION_START_TIMESTAMP_FILE_NAME).lastModified();
    }

    public boolean hasFinalizedReports() {
        return !getAllFinalizedReportFiles().isEmpty();
    }

    public List<String> listSortedOpenSessionIds() {
        List<File> allFilesInDirectory = getAllFilesInDirectory(this.openSessionsDirectory);
        Collections.sort(allFilesInDirectory, LATEST_SESSION_ID_FIRST_COMPARATOR);
        ArrayList arrayList = new ArrayList();
        for (File file : allFilesInDirectory) {
            arrayList.add(file.getName());
        }
        return arrayList;
    }

    public List<CrashlyticsReportWithSessionId> loadFinalizedReports() {
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(allFinalizedReportFiles.size());
        for (File file : getAllFinalizedReportFiles()) {
            try {
                arrayList.add(CrashlyticsReportWithSessionId.create(TRANSFORM.reportFromJson(readTextFile(file)), file.getName()));
            } catch (IOException e) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("Could not load report file ");
                sb.append(file);
                sb.append("; deleting");
                logger.w(sb.toString(), e);
                file.delete();
            }
        }
        return arrayList;
    }

    public void persistEvent(CrashlyticsReport.Session.Event event, String str) {
        persistEvent(event, str, false);
    }

    public void persistEvent(CrashlyticsReport.Session.Event event, String str, boolean z) {
        int i = this.settingsDataProvider.getSettings().getSessionData().maxCustomExceptionEvents;
        File sessionDirectoryById = getSessionDirectoryById(str);
        try {
            writeTextFile(new File(sessionDirectoryById, generateEventFilename(this.eventCounter.getAndIncrement(), z)), TRANSFORM.eventToJson(event));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Could not persist event for session ");
            sb.append(str);
            logger.w(sb.toString(), e);
        }
        trimEvents(sessionDirectoryById, i);
    }

    public void persistReport(CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.Session session = crashlyticsReport.getSession();
        if (session == null) {
            Logger.getLogger().d("Could not get session for report");
            return;
        }
        String identifier = session.getIdentifier();
        try {
            File prepareDirectory = prepareDirectory(getSessionDirectoryById(identifier));
            writeTextFile(new File(prepareDirectory, REPORT_FILE_NAME), TRANSFORM.reportToJson(crashlyticsReport));
            writeTextFile(new File(prepareDirectory, SESSION_START_TIMESTAMP_FILE_NAME), "", session.getStartedAt());
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Could not persist report for session ");
            sb.append(identifier);
            logger.d(sb.toString(), e);
        }
    }

    public void persistUserIdForSession(String str, String str2) {
        try {
            writeTextFile(new File(getSessionDirectoryById(str2), USER_FILE_NAME), str);
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Could not persist user ID for session ");
            sb.append(str2);
            logger.w(sb.toString(), e);
        }
    }
}
