package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/SuccessUpdateProfileDialog.class */
public final class SuccessUpdateProfileDialog extends CrashlyticsReport.Session.Event {
    private final CrashlyticsReport.Session.Event.Device a;
    private final CrashlyticsReport.Session.Event.Log b;
    private final CrashlyticsReport.Session.Event.Application c;
    private final String d;
    private final long e;

    /* loaded from: classes2-dex2jar.jar:o/SuccessUpdateProfileDialog$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends CrashlyticsReport.Session.Event.Builder {
        private String a;
        private CrashlyticsReport.Session.Event.Log b;
        private Long c;
        private CrashlyticsReport.Session.Event.Device d;
        private CrashlyticsReport.Session.Event.Application e;

        public RemoteActionCompatParcelizer() {
        }

        private RemoteActionCompatParcelizer(CrashlyticsReport.Session.Event event) {
            this.c = Long.valueOf(event.getTimestamp());
            this.a = event.getType();
            this.e = event.getApp();
            this.d = event.getDevice();
            this.b = event.getLog();
        }

        /* synthetic */ RemoteActionCompatParcelizer(CrashlyticsReport.Session.Event event, byte b) {
            this(event);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event build() {
            String str = this.c == null ? " timestamp" : "";
            String str2 = str;
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" type");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.e == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" app");
                str3 = sb2.toString();
            }
            String str4 = str3;
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(" device");
                str4 = sb3.toString();
            }
            if (str4.isEmpty()) {
                return new SuccessUpdateProfileDialog(this.c.longValue(), this.a, this.e, this.d, this.b, (byte) 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str4);
            throw new IllegalStateException(sb4.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setApp(CrashlyticsReport.Session.Event.Application application) {
            if (application != null) {
                this.e = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setDevice(CrashlyticsReport.Session.Event.Device device) {
            if (device != null) {
                this.d = device;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setLog(CrashlyticsReport.Session.Event.Log log) {
            this.b = log;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setTimestamp(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder setType(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    private SuccessUpdateProfileDialog(long j, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device, CrashlyticsReport.Session.Event.Log log) {
        this.e = j;
        this.d = str;
        this.c = application;
        this.a = device;
        this.b = log;
    }

    /* synthetic */ SuccessUpdateProfileDialog(long j, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device, CrashlyticsReport.Session.Event.Log log, byte b) {
        this(j, str, application, device, log);
    }

    public final boolean equals(Object obj) {
        CrashlyticsReport.Session.Event.Log log;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event)) {
            return false;
        }
        CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
        if (this.e != event.getTimestamp() || !this.d.equals(event.getType()) || !this.c.equals(event.getApp()) || !this.a.equals(event.getDevice()) || ((log = this.b) != null ? !log.equals(event.getLog()) : event.getLog() != null)) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Application getApp() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Device getDevice() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Log getLog() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final long getTimestamp() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final String getType() {
        return this.d;
    }

    public final int hashCode() {
        long j = this.e;
        int i = (int) (j ^ (j >>> 32));
        int hashCode = this.d.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.a.hashCode();
        CrashlyticsReport.Session.Event.Log log = this.b;
        return ((((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (log == null ? 0 : log.hashCode());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Builder toBuilder() {
        return new RemoteActionCompatParcelizer(this, (byte) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event{timestamp=");
        sb.append(this.e);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", app=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.a);
        sb.append(", log=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
