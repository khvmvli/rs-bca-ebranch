package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
/* loaded from: classes2-dex2jar.jar:o/StatusPerkawinanDialog_ViewBinding.class */
public final class StatusPerkawinanDialog_ViewBinding extends CrashlyticsReport.Session.Event.Application.Execution {
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> a;
    private final CrashlyticsReport.Session.Event.Application.Execution.Signal b;
    private final CrashlyticsReport.ApplicationExitInfo c;
    private final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> d;
    private final CrashlyticsReport.Session.Event.Application.Execution.Exception e;

    /* loaded from: classes2-dex2jar.jar:o/StatusPerkawinanDialog_ViewBinding$read.class */
    public static final class read extends CrashlyticsReport.Session.Event.Application.Execution.Builder {
        private CrashlyticsReport.ApplicationExitInfo a;
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> b;
        private CrashlyticsReport.Session.Event.Application.Execution.Signal c;
        private CrashlyticsReport.Session.Event.Application.Execution.Exception d;
        private ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution build() {
            String str = this.c == null ? " signal" : "";
            String str2 = str;
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" binaries");
                str2 = sb.toString();
            }
            if (str2.isEmpty()) {
                return new StatusPerkawinanDialog_ViewBinding(this.e, this.d, this.a, this.c, this.b, (byte) 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setAppExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.a = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setBinaries(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> immutableList) {
            if (immutableList != null) {
                this.b = immutableList;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setException(CrashlyticsReport.Session.Event.Application.Execution.Exception exception) {
            this.d = exception;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setSignal(CrashlyticsReport.Session.Event.Application.Execution.Signal signal) {
            if (signal != null) {
                this.c = signal;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Builder setThreads(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> immutableList) {
            this.e = immutableList;
            return this;
        }
    }

    private StatusPerkawinanDialog_ViewBinding(ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> immutableList, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, CrashlyticsReport.ApplicationExitInfo applicationExitInfo, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> immutableList2) {
        this.d = immutableList;
        this.e = exception;
        this.c = applicationExitInfo;
        this.b = signal;
        this.a = immutableList2;
    }

    /* synthetic */ StatusPerkawinanDialog_ViewBinding(ImmutableList immutableList, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, CrashlyticsReport.ApplicationExitInfo applicationExitInfo, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ImmutableList immutableList2, byte b) {
        this(immutableList, exception, applicationExitInfo, signal, immutableList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (r3.a.equals(r0.getBinaries()) != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L_0x0009
            r0 = 1
            return r0
        L_0x0009:
            r0 = r4
            boolean r0 = r0 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
            if (r0 == 0) goto L_0x008f
            r0 = r4
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r0 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution) r0
            r4 = r0
            r0 = r3
            com.google.firebase.crashlytics.internal.model.ImmutableList<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread> r0 = r0.d
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0028
            r0 = r4
            com.google.firebase.crashlytics.internal.model.ImmutableList r0 = r0.getThreads()
            if (r0 != 0) goto L_0x008b
            goto L_0x0033
        L_0x0028:
            r0 = r6
            r1 = r4
            com.google.firebase.crashlytics.internal.model.ImmutableList r1 = r1.getThreads()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
        L_0x0033:
            r0 = r3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r0 = r0.e
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0046
            r0 = r4
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r0 = r0.getException()
            if (r0 != 0) goto L_0x008b
            goto L_0x0051
        L_0x0046:
            r0 = r6
            r1 = r4
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r1 = r1.getException()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
        L_0x0051:
            r0 = r3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r0 = r0.c
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0064
            r0 = r4
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r0 = r0.getAppExitInfo()
            if (r0 != 0) goto L_0x008b
            goto L_0x006f
        L_0x0064:
            r0 = r6
            r1 = r4
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r1 = r1.getAppExitInfo()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
        L_0x006f:
            r0 = r3
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal r0 = r0.b
            r1 = r4
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal r1 = r1.getSignal()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
            r0 = r3
            com.google.firebase.crashlytics.internal.model.ImmutableList<com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage> r0 = r0.a
            r1 = r4
            com.google.firebase.crashlytics.internal.model.ImmutableList r1 = r1.getBinaries()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x008d
        L_0x008b:
            r0 = 0
            r5 = r0
        L_0x008d:
            r0 = r5
            return r0
        L_0x008f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.StatusPerkawinanDialog_ViewBinding.equals(java.lang.Object):boolean");
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> getBinaries() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception getException() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final CrashlyticsReport.Session.Event.Application.Execution.Signal getSignal() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution
    public final ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> getThreads() {
        return this.d;
    }

    public final int hashCode() {
        ImmutableList<CrashlyticsReport.Session.Event.Application.Execution.Thread> immutableList = this.d;
        int i = 0;
        int hashCode = immutableList == null ? 0 : immutableList.hashCode();
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.e;
        int hashCode2 = exception == null ? 0 : exception.hashCode();
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.c;
        if (applicationExitInfo != null) {
            i = applicationExitInfo.hashCode();
        }
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.d);
        sb.append(", exception=");
        sb.append(this.e);
        sb.append(", appExitInfo=");
        sb.append(this.c);
        sb.append(", signal=");
        sb.append(this.b);
        sb.append(", binaries=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
