package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import o.ReservasiCSDialog;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/common/CrashlyticsReportWithSessionId.class */
public abstract class CrashlyticsReportWithSessionId {
    public static CrashlyticsReportWithSessionId create(CrashlyticsReport crashlyticsReport, String str) {
        return new ReservasiCSDialog(crashlyticsReport, str);
    }

    public abstract CrashlyticsReport getReport();

    public abstract String getSessionId();
}
