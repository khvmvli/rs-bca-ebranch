package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
/* loaded from: classes2-dex2jar.jar:o/SumberDanaDialog_ViewBinding.class */
public final class SumberDanaDialog_ViewBinding extends CrashlyticsReport.Session.Event.Application.Execution.Exception {
    private final int a;
    private final String b;
    private final CrashlyticsReport.Session.Event.Application.Execution.Exception c;
    private final String d;
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> e;

    /* loaded from: classes2-dex2jar.jar:o/SumberDanaDialog_ViewBinding$write.class */
    public static final class write extends CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder {
        private String a;
        private CrashlyticsReport.Session.Event.Application.Execution.Exception b;
        private Integer c;
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> d;
        private String e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception build() {
            String str = this.a == null ? " type" : "";
            String str2 = str;
            if (this.d == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" frames");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" overflowCount");
                str3 = sb2.toString();
            }
            if (str3.isEmpty()) {
                return new SumberDanaDialog_ViewBinding(this.a, this.e, this.d, this.b, this.c.intValue(), (byte) 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str3);
            throw new IllegalStateException(sb3.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setCausedBy(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.b = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setFrames(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList) {
            if (immutableList != null) {
                this.d = immutableList;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setOverflowCount(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setReason(String str) {
            this.e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setType(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    private SumberDanaDialog_ViewBinding(String str, String str2, ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i) {
        this.b = str;
        this.d = str2;
        this.e = immutableList;
        this.c = exception;
        this.a = i;
    }

    /* synthetic */ SumberDanaDialog_ViewBinding(String str, String str2, ImmutableList immutableList, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, int i, byte b) {
        this(str, str2, immutableList, exception, i);
    }

    public final boolean equals(Object obj) {
        String str;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Exception)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception2 = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
        if (!this.b.equals(exception2.getType()) || ((str = this.d) != null ? !str.equals(exception2.getReason()) : exception2.getReason() != null) || !this.e.equals(exception2.getFrames()) || ((exception = this.c) != null ? !exception.equals(exception2.getCausedBy()) : exception2.getCausedBy() != null) || this.a != exception2.getOverflowCount()) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception getCausedBy() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final int getOverflowCount() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final String getReason() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception
    public final String getType() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        String str = this.d;
        int i = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.e.hashCode();
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.c;
        if (exception != null) {
            i = exception.hashCode();
        }
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.b);
        sb.append(", reason=");
        sb.append(this.d);
        sb.append(", frames=");
        sb.append(this.e);
        sb.append(", causedBy=");
        sb.append(this.c);
        sb.append(", overflowCount=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
