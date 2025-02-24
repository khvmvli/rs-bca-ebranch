package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/SuccessUpdateProfileDialog_ViewBinding.class */
public final class SuccessUpdateProfileDialog_ViewBinding extends CrashlyticsReport.Session.Event.Application.Execution.Signal {
    private final String a;
    private final long d;
    private final String e;

    /* loaded from: classes2-dex2jar.jar:o/SuccessUpdateProfileDialog_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {
        private Long b;
        private String d;
        private String e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal build() {
            String str = this.e == null ? " name" : "";
            String str2 = str;
            if (this.d == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" code");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" address");
                str3 = sb2.toString();
            }
            if (str3.isEmpty()) {
                return new SuccessUpdateProfileDialog_ViewBinding(this.e, this.d, this.b.longValue(), (byte) 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str3);
            throw new IllegalStateException(sb3.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    private SuccessUpdateProfileDialog_ViewBinding(String str, String str2, long j) {
        this.e = str;
        this.a = str2;
        this.d = j;
    }

    /* synthetic */ SuccessUpdateProfileDialog_ViewBinding(String str, String str2, long j, byte b) {
        this(str, str2, j);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
        if (!this.e.equals(signal.getName()) || !this.a.equals(signal.getCode()) || this.d != signal.getAddress()) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public final long getAddress() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public final String getCode() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public final String getName() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = this.a.hashCode();
        long j = this.d;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.e);
        sb.append(", code=");
        sb.append(this.a);
        sb.append(", address=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
