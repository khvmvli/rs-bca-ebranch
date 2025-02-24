package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/StatusKewarganegaraanDialog_ViewBinding.class */
public final class StatusKewarganegaraanDialog_ViewBinding extends CrashlyticsReport.Session.Application {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final CrashlyticsReport.Session.Application.Organization i;
    private final String j;

    /* loaded from: classes2-dex2jar.jar:o/StatusKewarganegaraanDialog_ViewBinding$write.class */
    public static final class write extends CrashlyticsReport.Session.Application.Builder {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private CrashlyticsReport.Session.Application.Organization g;

        public write() {
        }

        private write(CrashlyticsReport.Session.Application application) {
            this.c = application.getIdentifier();
            this.f = application.getVersion();
            this.b = application.getDisplayVersion();
            this.g = application.getOrganization();
            this.a = application.getInstallationUuid();
            this.e = application.getDevelopmentPlatform();
            this.d = application.getDevelopmentPlatformVersion();
        }

        /* synthetic */ write(CrashlyticsReport.Session.Application application, byte b) {
            this(application);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application build() {
            String str = this.c == null ? " identifier" : "";
            String str2 = str;
            if (this.f == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" version");
                str2 = sb.toString();
            }
            if (str2.isEmpty()) {
                return new StatusKewarganegaraanDialog_ViewBinding(this.c, this.f, this.b, this.g, this.a, this.e, this.d, (byte) 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setDevelopmentPlatform(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setDevelopmentPlatformVersion(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setDisplayVersion(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setIdentifier(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setInstallationUuid(String str) {
            this.a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setOrganization(CrashlyticsReport.Session.Application.Organization organization) {
            this.g = organization;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder setVersion(String str) {
            if (str != null) {
                this.f = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    private StatusKewarganegaraanDialog_ViewBinding(String str, String str2, String str3, CrashlyticsReport.Session.Application.Organization organization, String str4, String str5, String str6) {
        this.c = str;
        this.j = str2;
        this.d = str3;
        this.i = organization;
        this.e = str4;
        this.b = str5;
        this.a = str6;
    }

    /* synthetic */ StatusKewarganegaraanDialog_ViewBinding(String str, String str2, String str3, CrashlyticsReport.Session.Application.Organization organization, String str4, String str5, String str6, byte b) {
        this(str, str2, str3, organization, str4, str5, str6);
    }

    public final boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Application.Organization organization;
        String str2;
        String str3;
        String str4;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
        if (!this.c.equals(application.getIdentifier()) || !this.j.equals(application.getVersion()) || ((str = this.d) != null ? !str.equals(application.getDisplayVersion()) : application.getDisplayVersion() != null) || ((organization = this.i) != null ? !organization.equals(application.getOrganization()) : application.getOrganization() != null) || ((str2 = this.e) != null ? !str2.equals(application.getInstallationUuid()) : application.getInstallationUuid() != null) || ((str3 = this.b) != null ? !str3.equals(application.getDevelopmentPlatform()) : application.getDevelopmentPlatform() != null) || ((str4 = this.a) != null ? !str4.equals(application.getDevelopmentPlatformVersion()) : application.getDevelopmentPlatformVersion() != null)) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String getDevelopmentPlatform() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String getDevelopmentPlatformVersion() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String getDisplayVersion() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String getIdentifier() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String getInstallationUuid() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final CrashlyticsReport.Session.Application.Organization getOrganization() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String getVersion() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = this.j.hashCode();
        String str = this.d;
        int i = 0;
        int hashCode3 = str == null ? 0 : str.hashCode();
        CrashlyticsReport.Session.Application.Organization organization = this.i;
        int hashCode4 = organization == null ? 0 : organization.hashCode();
        String str2 = this.e;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.b;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.a;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final CrashlyticsReport.Session.Application.Builder toBuilder() {
        return new write(this, (byte) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.c);
        sb.append(", version=");
        sb.append(this.j);
        sb.append(", displayVersion=");
        sb.append(this.d);
        sb.append(", organization=");
        sb.append(this.i);
        sb.append(", installationUuid=");
        sb.append(this.e);
        sb.append(", developmentPlatform=");
        sb.append(this.b);
        sb.append(", developmentPlatformVersion=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
