package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/SimpanDraftAndHitServiceDialog.class */
public final class SimpanDraftAndHitServiceDialog extends CrashlyticsReport.ApplicationExitInfo {
    private final String a;
    private final int b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;
    private final String i;
    private final long j;

    /* loaded from: classes2-dex2jar.jar:o/SimpanDraftAndHitServiceDialog$write.class */
    public static final class write extends CrashlyticsReport.ApplicationExitInfo.Builder {
        private Integer a;
        private Long b;
        private String c;
        private Integer d;
        private Integer e;
        private Long f;
        private String h;
        private Long i;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo build() {
            String str = this.e == null ? " pid" : "";
            String str2 = str;
            if (this.c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" processName");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" reasonCode");
                str3 = sb2.toString();
            }
            String str4 = str3;
            if (this.a == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(" importance");
                str4 = sb3.toString();
            }
            String str5 = str4;
            if (this.b == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(" pss");
                str5 = sb4.toString();
            }
            String str6 = str5;
            if (this.i == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str5);
                sb5.append(" rss");
                str6 = sb5.toString();
            }
            String str7 = str6;
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str6);
                sb6.append(" timestamp");
                str7 = sb6.toString();
            }
            if (str7.isEmpty()) {
                return new SimpanDraftAndHitServiceDialog(this.e.intValue(), this.c, this.d.intValue(), this.a.intValue(), this.b.longValue(), this.i.longValue(), this.f.longValue(), this.h, (byte) 0);
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str7);
            throw new IllegalStateException(sb7.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setPid(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setPss(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setRss(long j) {
            this.i = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(String str) {
            this.h = str;
            return this;
        }
    }

    private SimpanDraftAndHitServiceDialog(int i, String str, int i2, int i3, long j, long j2, long j3, String str2) {
        this.c = i;
        this.a = str;
        this.e = i2;
        this.b = i3;
        this.d = j;
        this.j = j2;
        this.f = j3;
        this.i = str2;
    }

    /* synthetic */ SimpanDraftAndHitServiceDialog(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, byte b) {
        this(i, str, i2, i3, j, j2, j3, str2);
    }

    public final boolean equals(Object obj) {
        String str;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
        if (!(this.c == applicationExitInfo.getPid() && this.a.equals(applicationExitInfo.getProcessName()) && this.e == applicationExitInfo.getReasonCode() && this.b == applicationExitInfo.getImportance() && this.d == applicationExitInfo.getPss() && this.j == applicationExitInfo.getRss() && this.f == applicationExitInfo.getTimestamp() && ((str = this.i) != null ? str.equals(applicationExitInfo.getTraceFile()) : applicationExitInfo.getTraceFile() == null))) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final int getImportance() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final int getPid() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final String getProcessName() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final long getPss() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final int getReasonCode() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final long getRss() {
        return this.j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final long getTimestamp() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final String getTraceFile() {
        return this.i;
    }

    public final int hashCode() {
        int i = this.c;
        int hashCode = this.a.hashCode();
        int i2 = this.e;
        int i3 = this.b;
        long j = this.d;
        int i4 = (int) (j ^ (j >>> 32));
        long j2 = this.j;
        int i5 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.f;
        int i6 = (int) (j3 ^ (j3 >>> 32));
        String str = this.i;
        return ((((((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationExitInfo{pid=");
        sb.append(this.c);
        sb.append(", processName=");
        sb.append(this.a);
        sb.append(", reasonCode=");
        sb.append(this.e);
        sb.append(", importance=");
        sb.append(this.b);
        sb.append(", pss=");
        sb.append(this.d);
        sb.append(", rss=");
        sb.append(this.j);
        sb.append(", timestamp=");
        sb.append(this.f);
        sb.append(", traceFile=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
