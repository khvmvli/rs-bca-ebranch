package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/StatusNPWPDialog.class */
public final class StatusNPWPDialog extends CrashlyticsReport.Session.Application.Organization {
    private final String b;

    /* loaded from: classes2-dex2jar.jar:o/StatusNPWPDialog$write.class */
    public static final class write extends CrashlyticsReport.Session.Application.Organization.Builder {
        private String d;

        public write() {
        }

        private write(CrashlyticsReport.Session.Application.Organization organization) {
            this.d = organization.getClsId();
        }

        /* synthetic */ write(CrashlyticsReport.Session.Application.Organization organization, byte b) {
            this(organization);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public final CrashlyticsReport.Session.Application.Organization build() {
            String str = this.d == null ? " clsId" : "";
            if (str.isEmpty()) {
                return new StatusNPWPDialog(this.d, (byte) 0);
            }
            StringBuilder sb = new StringBuilder("Missing required properties:");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization.Builder
        public final CrashlyticsReport.Session.Application.Organization.Builder setClsId(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null clsId");
        }
    }

    private StatusNPWPDialog(String str) {
        this.b = str;
    }

    /* synthetic */ StatusNPWPDialog(String str, byte b) {
        this(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application.Organization) {
            return this.b.equals(((CrashlyticsReport.Session.Application.Organization) obj).getClsId());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    public final String getClsId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization
    public final CrashlyticsReport.Session.Application.Organization.Builder toBuilder() {
        return new write(this, (byte) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Organization{clsId=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
