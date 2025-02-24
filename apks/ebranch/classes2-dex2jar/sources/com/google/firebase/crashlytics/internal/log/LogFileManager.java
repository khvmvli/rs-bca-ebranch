package com.google.firebase.crashlytics.internal.log;

import android.content.Context;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.util.Set;
import o.SimpanDraftAndHitServiceDialog_ViewBinding;
import o.StatusKewarganegaraanDialog;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/log/LogFileManager.class */
public class LogFileManager {
    private static final String COLLECT_CUSTOM_LOGS = "com.crashlytics.CollectCustomLogs";
    private static final String LOGFILE_EXT = ".temp";
    private static final String LOGFILE_PREFIX = "crashlytics-userlog-";
    static final int MAX_LOG_SIZE = 65536;
    private static final IconCompatParcelizer NOOP_LOG_STORE = new IconCompatParcelizer((byte) 0);
    private final Context context;
    private SimpanDraftAndHitServiceDialog_ViewBinding currentLog;
    private final DirectoryProvider directoryProvider;

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/log/LogFileManager$DirectoryProvider.class */
    public interface DirectoryProvider {
        File getLogFileDir();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/log/LogFileManager$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements SimpanDraftAndHitServiceDialog_ViewBinding {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        @Override // o.SimpanDraftAndHitServiceDialog_ViewBinding
        public final String a() {
            return null;
        }

        @Override // o.SimpanDraftAndHitServiceDialog_ViewBinding
        public final void b() {
        }

        @Override // o.SimpanDraftAndHitServiceDialog_ViewBinding
        public final void c() {
        }

        @Override // o.SimpanDraftAndHitServiceDialog_ViewBinding
        public final void d(long j, String str) {
        }

        @Override // o.SimpanDraftAndHitServiceDialog_ViewBinding
        public final byte[] e() {
            return null;
        }
    }

    public LogFileManager(Context context, DirectoryProvider directoryProvider) {
        this(context, directoryProvider, null);
    }

    public LogFileManager(Context context, DirectoryProvider directoryProvider, String str) {
        this.context = context;
        this.directoryProvider = directoryProvider;
        this.currentLog = NOOP_LOG_STORE;
        setCurrentSession(str);
    }

    private String getSessionIdForFile(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(LOGFILE_EXT);
        return lastIndexOf == -1 ? name : name.substring(20, lastIndexOf);
    }

    private File getWorkingFileForSession(String str) {
        StringBuilder sb = new StringBuilder(LOGFILE_PREFIX);
        sb.append(str);
        sb.append(LOGFILE_EXT);
        return new File(this.directoryProvider.getLogFileDir(), sb.toString());
    }

    public void clearLog() {
        this.currentLog.b();
    }

    public void discardOldLogFiles(Set<String> set) {
        File[] listFiles = this.directoryProvider.getLogFileDir().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(getSessionIdForFile(file))) {
                    file.delete();
                }
            }
        }
    }

    public byte[] getBytesForLog() {
        return this.currentLog.e();
    }

    public String getLogString() {
        return this.currentLog.a();
    }

    public final void setCurrentSession(String str) {
        this.currentLog.c();
        this.currentLog = NOOP_LOG_STORE;
        if (str != null) {
            if (!CommonUtils.getBooleanResourceValue(this.context, COLLECT_CUSTOM_LOGS, true)) {
                Logger.getLogger().d("Preferences requested no custom logs. Aborting log file creation.");
            } else {
                setLogFile(getWorkingFileForSession(str), MAX_LOG_SIZE);
            }
        }
    }

    void setLogFile(File file, int i) {
        this.currentLog = new StatusKewarganegaraanDialog(file, i);
    }

    public void writeToLog(long j, String str) {
        this.currentLog.d(j, str);
    }
}
