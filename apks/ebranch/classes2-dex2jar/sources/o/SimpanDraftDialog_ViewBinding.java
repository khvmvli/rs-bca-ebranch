package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/SimpanDraftDialog_ViewBinding.class */
public final class SimpanDraftDialog_ViewBinding extends CrashlyticsReport {
    private final String a;
    private final CrashlyticsReport.FilesPayload b;
    private final String c;
    private final String d;
    private final String e;
    private final CrashlyticsReport.Session g;
    private final String h;
    private final int j;

    /* loaded from: classes2-dex2jar.jar:o/SimpanDraftDialog_ViewBinding$write.class */
    public static final class write extends CrashlyticsReport.Builder {
        private String a;
        private CrashlyticsReport.FilesPayload b;
        private String c;
        private String d;
        private String e;
        private String f;
        private CrashlyticsReport.Session i;
        private Integer j;

        public write() {
        }

        private write(CrashlyticsReport crashlyticsReport) {
            this.f = crashlyticsReport.getSdkVersion();
            this.a = crashlyticsReport.getGmpAppId();
            this.j = Integer.valueOf(crashlyticsReport.getPlatform());
            this.d = crashlyticsReport.getInstallationUuid();
            this.c = crashlyticsReport.getBuildVersion();
            this.e = crashlyticsReport.getDisplayVersion();
            this.i = crashlyticsReport.getSession();
            this.b = crashlyticsReport.getNdkPayload();
        }

        /* synthetic */ write(CrashlyticsReport crashlyticsReport, byte b) {
            this(crashlyticsReport);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport build() {
            String str = this.f == null ? " sdkVersion" : "";
            String str2 = str;
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" gmpAppId");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.j == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" platform");
                str3 = sb2.toString();
            }
            String str4 = str3;
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(" installationUuid");
                str4 = sb3.toString();
            }
            String str5 = str4;
            if (this.c == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(" buildVersion");
                str5 = sb4.toString();
            }
            String str6 = str5;
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str5);
                sb5.append(" displayVersion");
                str6 = sb5.toString();
            }
            if (str6.isEmpty()) {
                return new SimpanDraftDialog_ViewBinding(this.f, this.a, this.j.intValue(), this.d, this.c, this.e, this.i, this.b, (byte) 0);
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str6);
            throw new IllegalStateException(sb6.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setBuildVersion(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setDisplayVersion(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setGmpAppId(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setInstallationUuid(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setNdkPayload(CrashlyticsReport.FilesPayload filesPayload) {
            this.b = filesPayload;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setPlatform(int i) {
            this.j = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setSdkVersion(String str) {
            if (str != null) {
                this.f = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder setSession(CrashlyticsReport.Session session) {
            this.i = session;
            return this;
        }
    }

    private SimpanDraftDialog_ViewBinding(String str, String str2, int i, String str3, String str4, String str5, CrashlyticsReport.Session session, CrashlyticsReport.FilesPayload filesPayload) {
        this.h = str;
        this.e = str2;
        this.j = i;
        this.a = str3;
        this.c = str4;
        this.d = str5;
        this.g = session;
        this.b = filesPayload;
    }

    /* synthetic */ SimpanDraftDialog_ViewBinding(String str, String str2, int i, String str3, String str4, String str5, CrashlyticsReport.Session session, CrashlyticsReport.FilesPayload filesPayload, byte b) {
        this(str, str2, i, str3, str4, str5, session, filesPayload);
    }

    public final boolean equals(Object obj) {
        CrashlyticsReport.Session session;
        CrashlyticsReport.FilesPayload filesPayload;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (!this.h.equals(crashlyticsReport.getSdkVersion()) || !this.e.equals(crashlyticsReport.getGmpAppId()) || this.j != crashlyticsReport.getPlatform() || !this.a.equals(crashlyticsReport.getInstallationUuid()) || !this.c.equals(crashlyticsReport.getBuildVersion()) || !this.d.equals(crashlyticsReport.getDisplayVersion()) || ((session = this.g) != null ? !session.equals(crashlyticsReport.getSession()) : crashlyticsReport.getSession() != null) || ((filesPayload = this.b) != null ? !filesPayload.equals(crashlyticsReport.getNdkPayload()) : crashlyticsReport.getNdkPayload() != null)) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getBuildVersion() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getDisplayVersion() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getGmpAppId() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getInstallationUuid() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.FilesPayload getNdkPayload() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final int getPlatform() {
        return this.j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String getSdkVersion() {
        return this.h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.Session getSession() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode();
        int hashCode2 = this.e.hashCode();
        int i = this.j;
        int hashCode3 = this.a.hashCode();
        int hashCode4 = this.c.hashCode();
        int hashCode5 = this.d.hashCode();
        CrashlyticsReport.Session session = this.g;
        int i2 = 0;
        int hashCode6 = session == null ? 0 : session.hashCode();
        CrashlyticsReport.FilesPayload filesPayload = this.b;
        if (filesPayload != null) {
            i2 = filesPayload.hashCode();
        }
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ i2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.Builder toBuilder() {
        return new write(this, (byte) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashlyticsReport{sdkVersion=");
        sb.append(this.h);
        sb.append(", gmpAppId=");
        sb.append(this.e);
        sb.append(", platform=");
        sb.append(this.j);
        sb.append(", installationUuid=");
        sb.append(this.a);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", displayVersion=");
        sb.append(this.d);
        sb.append(", session=");
        sb.append(this.g);
        sb.append(", ndkPayload=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
