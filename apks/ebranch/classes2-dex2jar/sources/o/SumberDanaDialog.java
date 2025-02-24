package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
/* loaded from: classes2-dex2jar.jar:o/SumberDanaDialog.class */
public final class SumberDanaDialog extends CrashlyticsReport.Session.Event.Application.Execution.Thread {
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> a;
    private final int b;
    private final String e;

    /* loaded from: classes2-dex2jar.jar:o/SumberDanaDialog$read.class */
    public static final class read extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder {
        private Integer a;
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> c;
        private String d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread build() {
            String str = this.d == null ? " name" : "";
            String str2 = str;
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" importance");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" frames");
                str3 = sb2.toString();
            }
            if (str3.isEmpty()) {
                return new SumberDanaDialog(this.d, this.a.intValue(), this.c, (byte) 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str3);
            throw new IllegalStateException(sb3.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setFrames(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList) {
            if (immutableList != null) {
                this.c = immutableList;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setImportance(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setName(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    private SumberDanaDialog(String str, int i, ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> immutableList) {
        this.e = str;
        this.b = i;
        this.a = immutableList;
    }

    /* synthetic */ SumberDanaDialog(String str, int i, ImmutableList immutableList, byte b) {
        this(str, i, immutableList);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
        if (!this.e.equals(thread.getName()) || this.b != thread.getImportance() || !this.a.equals(thread.getFrames())) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public final int getImportance() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread
    public final String getName() {
        return this.e;
    }

    public final int hashCode() {
        return ((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.e);
        sb.append(", importance=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
