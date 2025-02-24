package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.log.LogFileManager;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/common/CrashlyticsCore$read.class */
final class CrashlyticsCore$read implements LogFileManager.DirectoryProvider {
    private final FileStore e;

    public CrashlyticsCore$read(FileStore fileStore) {
        this.e = fileStore;
    }

    @Override // com.google.firebase.crashlytics.internal.log.LogFileManager.DirectoryProvider
    public final File getLogFileDir() {
        File file = new File(this.e.getFilesDir(), "log-files");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
