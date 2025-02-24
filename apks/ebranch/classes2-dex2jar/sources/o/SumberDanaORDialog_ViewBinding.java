package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/SumberDanaORDialog_ViewBinding.class */
public final class SumberDanaORDialog_ViewBinding extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {
    private final long a;
    private final String b;
    private final String c;
    private final int d;
    private final long e;

    /* loaded from: classes2-dex2jar.jar:o/SumberDanaORDialog_ViewBinding$read.class */
    public static final class read extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {
        private Long a;
        private String b;
        private Integer c;
        private Long d;
        private String e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame build() {
            String str = this.a == null ? " pc" : "";
            String str2 = str;
            if (this.e == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" symbol");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.d == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" offset");
                str3 = sb2.toString();
            }
            String str4 = str3;
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(" importance");
                str4 = sb3.toString();
            }
            if (str4.isEmpty()) {
                return new SumberDanaORDialog_ViewBinding(this.a.longValue(), this.e, this.b, this.d.longValue(), this.c.intValue(), (byte) 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str4);
            throw new IllegalStateException(sb4.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    private SumberDanaORDialog_ViewBinding(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.e = j2;
        this.d = i;
    }

    /* synthetic */ SumberDanaORDialog_ViewBinding(long j, String str, String str2, long j2, int i, byte b) {
        this(j, str, str2, j2, i);
    }

    public final boolean equals(Object obj) {
        String str;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
        if (!(this.a == frame.getPc() && this.b.equals(frame.getSymbol()) && ((str = this.c) != null ? str.equals(frame.getFile()) : frame.getFile() == null) && this.e == frame.getOffset() && this.d == frame.getImportance())) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final String getFile() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final int getImportance() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final long getOffset() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final long getPc() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final String getSymbol() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (int) (j ^ (j >>> 32));
        int hashCode = this.b.hashCode();
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.e;
        return ((((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.e);
        sb.append(", importance=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
