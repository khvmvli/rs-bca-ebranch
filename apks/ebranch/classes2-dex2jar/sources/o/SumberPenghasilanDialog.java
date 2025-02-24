package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/SumberPenghasilanDialog.class */
public final class SumberPenghasilanDialog extends CrashlyticsReport.Session.OperatingSystem {
    private final String a;
    private final String c;
    private final boolean d;
    private final int e;

    /* loaded from: classes2-dex2jar.jar:o/SumberPenghasilanDialog$read.class */
    public static final class read extends CrashlyticsReport.Session.OperatingSystem.Builder {
        private Integer a;
        private Boolean b;
        private String d;
        private String e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem build() {
            String str = this.a == null ? " platform" : "";
            String str2 = str;
            if (this.e == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" version");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" buildVersion");
                str3 = sb2.toString();
            }
            String str4 = str3;
            if (this.b == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(" jailbroken");
                str4 = sb3.toString();
            }
            if (str4.isEmpty()) {
                return new SumberPenghasilanDialog(this.a.intValue(), this.e, this.d, this.b.booleanValue(), (byte) 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str4);
            throw new IllegalStateException(sb4.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder setBuildVersion(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder setJailbroken(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder setPlatform(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder setVersion(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    private SumberPenghasilanDialog(int i, String str, String str2, boolean z) {
        this.e = i;
        this.c = str;
        this.a = str2;
        this.d = z;
    }

    /* synthetic */ SumberPenghasilanDialog(int i, String str, String str2, boolean z, byte b) {
        this(i, str, str2, z);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.OperatingSystem)) {
            return false;
        }
        CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
        if (this.e != operatingSystem.getPlatform() || !this.c.equals(operatingSystem.getVersion()) || !this.a.equals(operatingSystem.getBuildVersion()) || this.d != operatingSystem.isJailbroken()) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final String getBuildVersion() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final int getPlatform() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final String getVersion() {
        return this.c;
    }

    public final int hashCode() {
        int i = this.e;
        int hashCode = this.c.hashCode();
        return ((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ this.a.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final boolean isJailbroken() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.e);
        sb.append(", version=");
        sb.append(this.c);
        sb.append(", buildVersion=");
        sb.append(this.a);
        sb.append(", jailbroken=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
