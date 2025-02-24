package o;

import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/ReservasiCSDialog.class */
public final class ReservasiCSDialog extends CrashlyticsReportWithSessionId {
    private final CrashlyticsReport b;
    private final String e;

    public ReservasiCSDialog(CrashlyticsReport crashlyticsReport, String str) {
        if (crashlyticsReport != null) {
            this.b = crashlyticsReport;
            if (str != null) {
                this.e = str;
                return;
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        if (!this.b.equals(crashlyticsReportWithSessionId.getReport()) || !this.e.equals(crashlyticsReportWithSessionId.getSessionId())) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final CrashlyticsReport getReport() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final String getSessionId() {
        return this.e;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashlyticsReportWithSessionId{report=");
        sb.append(this.b);
        sb.append(", sessionId=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
