package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
/* loaded from: classes2-dex2jar.jar:o/StatusPendudukDialog.class */
public final class StatusPendudukDialog extends CrashlyticsReport.FilesPayload {
    private final ImmutableList<CrashlyticsReport.FilesPayload.File> a;
    private final String d;

    /* loaded from: classes2-dex2jar.jar:o/StatusPendudukDialog$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends CrashlyticsReport.FilesPayload.Builder {
        private ImmutableList<CrashlyticsReport.FilesPayload.File> c;
        private String d;

        public RemoteActionCompatParcelizer() {
        }

        private RemoteActionCompatParcelizer(CrashlyticsReport.FilesPayload filesPayload) {
            this.c = filesPayload.getFiles();
            this.d = filesPayload.getOrgId();
        }

        /* synthetic */ RemoteActionCompatParcelizer(CrashlyticsReport.FilesPayload filesPayload, byte b) {
            this(filesPayload);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload build() {
            String str = this.c == null ? " files" : "";
            if (str.isEmpty()) {
                return new StatusPendudukDialog(this.c, this.d, (byte) 0);
            }
            StringBuilder sb = new StringBuilder("Missing required properties:");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload.Builder setFiles(ImmutableList<CrashlyticsReport.FilesPayload.File> immutableList) {
            if (immutableList != null) {
                this.c = immutableList;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload.Builder setOrgId(String str) {
            this.d = str;
            return this;
        }
    }

    private StatusPendudukDialog(ImmutableList<CrashlyticsReport.FilesPayload.File> immutableList, String str) {
        this.a = immutableList;
        this.d = str;
    }

    /* synthetic */ StatusPendudukDialog(ImmutableList immutableList, String str, byte b) {
        this(immutableList, str);
    }

    public final boolean equals(Object obj) {
        String str;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload)) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
        if (!this.a.equals(filesPayload.getFiles()) || ((str = this.d) != null ? !str.equals(filesPayload.getOrgId()) : filesPayload.getOrgId() != null)) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public final ImmutableList<CrashlyticsReport.FilesPayload.File> getFiles() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public final String getOrgId() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.d;
        return ((hashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public final CrashlyticsReport.FilesPayload.Builder toBuilder() {
        return new RemoteActionCompatParcelizer(this, (byte) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
