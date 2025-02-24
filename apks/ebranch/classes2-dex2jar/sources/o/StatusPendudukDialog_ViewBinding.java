package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.encoders.annotations.Encodable;
/* loaded from: classes2-dex2jar.jar:o/StatusPendudukDialog_ViewBinding.class */
public final class StatusPendudukDialog_ViewBinding extends CrashlyticsReport.Session {
    private final CrashlyticsReport.Session.Application a;
    private final CrashlyticsReport.Session.Device b;
    private final boolean c;
    private final Long d;
    private final ImmutableList<CrashlyticsReport.Session.Event> e;
    private final long f;
    private final int g;
    private final CrashlyticsReport.Session.OperatingSystem h;
    private final String i;
    private final String j;
    private final CrashlyticsReport.Session.User l;

    /* loaded from: classes2-dex2jar.jar:o/StatusPendudukDialog_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends CrashlyticsReport.Session.Builder {
        private Boolean a;
        private CrashlyticsReport.Session.Device b;
        private ImmutableList<CrashlyticsReport.Session.Event> c;
        private CrashlyticsReport.Session.Application d;
        private Long e;
        private Long f;
        private String g;
        private CrashlyticsReport.Session.OperatingSystem h;
        private Integer i;
        private String j;
        private CrashlyticsReport.Session.User m;

        public RemoteActionCompatParcelizer() {
        }

        private RemoteActionCompatParcelizer(CrashlyticsReport.Session session) {
            this.g = session.getGenerator();
            this.j = session.getIdentifier();
            this.f = Long.valueOf(session.getStartedAt());
            this.e = session.getEndedAt();
            this.a = Boolean.valueOf(session.isCrashed());
            this.d = session.getApp();
            this.m = session.getUser();
            this.h = session.getOs();
            this.b = session.getDevice();
            this.c = session.getEvents();
            this.i = Integer.valueOf(session.getGeneratorType());
        }

        /* synthetic */ RemoteActionCompatParcelizer(CrashlyticsReport.Session session, byte b) {
            this(session);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session build() {
            String str = this.g == null ? " generator" : "";
            String str2 = str;
            if (this.j == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" identifier");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.f == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" startedAt");
                str3 = sb2.toString();
            }
            String str4 = str3;
            if (this.a == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(" crashed");
                str4 = sb3.toString();
            }
            String str5 = str4;
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(" app");
                str5 = sb4.toString();
            }
            String str6 = str5;
            if (this.i == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str5);
                sb5.append(" generatorType");
                str6 = sb5.toString();
            }
            if (str6.isEmpty()) {
                return new StatusPendudukDialog_ViewBinding(this.g, this.j, this.f.longValue(), this.e, this.a.booleanValue(), this.d, this.m, this.h, this.b, this.c, this.i.intValue(), (byte) 0);
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str6);
            throw new IllegalStateException(sb6.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setApp(CrashlyticsReport.Session.Application application) {
            if (application != null) {
                this.d = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setCrashed(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setDevice(CrashlyticsReport.Session.Device device) {
            this.b = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setEndedAt(Long l) {
            this.e = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setEvents(ImmutableList<CrashlyticsReport.Session.Event> immutableList) {
            this.c = immutableList;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setGenerator(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setGeneratorType(int i) {
            this.i = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setIdentifier(String str) {
            if (str != null) {
                this.j = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setOs(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.h = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setStartedAt(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder setUser(CrashlyticsReport.Session.User user) {
            this.m = user;
            return this;
        }
    }

    private StatusPendudukDialog_ViewBinding(String str, String str2, long j, Long l, boolean z, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device, ImmutableList<CrashlyticsReport.Session.Event> immutableList, int i) {
        this.i = str;
        this.j = str2;
        this.f = j;
        this.d = l;
        this.c = z;
        this.a = application;
        this.l = user;
        this.h = operatingSystem;
        this.b = device;
        this.e = immutableList;
        this.g = i;
    }

    /* synthetic */ StatusPendudukDialog_ViewBinding(String str, String str2, long j, Long l, boolean z, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device, ImmutableList immutableList, int i, byte b) {
        this(str, str2, j, l, z, application, user, operatingSystem, device, immutableList, i);
    }

    public final boolean equals(Object obj) {
        Long l;
        CrashlyticsReport.Session.User user;
        CrashlyticsReport.Session.OperatingSystem operatingSystem;
        CrashlyticsReport.Session.Device device;
        ImmutableList<CrashlyticsReport.Session.Event> immutableList;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session)) {
            return false;
        }
        CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
        if (!this.i.equals(session.getGenerator()) || !this.j.equals(session.getIdentifier()) || this.f != session.getStartedAt() || ((l = this.d) != null ? !l.equals(session.getEndedAt()) : session.getEndedAt() != null) || this.c != session.isCrashed() || !this.a.equals(session.getApp()) || ((user = this.l) != null ? !user.equals(session.getUser()) : session.getUser() != null) || ((operatingSystem = this.h) != null ? !operatingSystem.equals(session.getOs()) : session.getOs() != null) || ((device = this.b) != null ? !device.equals(session.getDevice()) : session.getDevice() != null) || ((immutableList = this.e) != null ? !immutableList.equals(session.getEvents()) : session.getEvents() != null) || this.g != session.getGeneratorType()) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Application getApp() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Device getDevice() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final Long getEndedAt() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final ImmutableList<CrashlyticsReport.Session.Event> getEvents() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final String getGenerator() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final int getGeneratorType() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    @Encodable.Ignore
    public final String getIdentifier() {
        return this.j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.OperatingSystem getOs() {
        return this.h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final long getStartedAt() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.User getUser() {
        return this.l;
    }

    public final int hashCode() {
        int hashCode = this.i.hashCode();
        int hashCode2 = this.j.hashCode();
        long j = this.f;
        int i = (int) (j ^ (j >>> 32));
        Long l = this.d;
        int i2 = 0;
        int hashCode3 = l == null ? 0 : l.hashCode();
        int i3 = this.c ? 1231 : 1237;
        int hashCode4 = this.a.hashCode();
        CrashlyticsReport.Session.User user = this.l;
        int hashCode5 = user == null ? 0 : user.hashCode();
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.h;
        int hashCode6 = operatingSystem == null ? 0 : operatingSystem.hashCode();
        CrashlyticsReport.Session.Device device = this.b;
        int hashCode7 = device == null ? 0 : device.hashCode();
        ImmutableList<CrashlyticsReport.Session.Event> immutableList = this.e;
        if (immutableList != null) {
            i2 = immutableList.hashCode();
        }
        return ((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ hashCode3) * 1000003) ^ i3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ i2) * 1000003) ^ this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final boolean isCrashed() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Builder toBuilder() {
        return new RemoteActionCompatParcelizer(this, (byte) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.i);
        sb.append(", identifier=");
        sb.append(this.j);
        sb.append(", startedAt=");
        sb.append(this.f);
        sb.append(", endedAt=");
        sb.append(this.d);
        sb.append(", crashed=");
        sb.append(this.c);
        sb.append(", app=");
        sb.append(this.a);
        sb.append(", user=");
        sb.append(this.l);
        sb.append(", os=");
        sb.append(this.h);
        sb.append(", device=");
        sb.append(this.b);
        sb.append(", events=");
        sb.append(this.e);
        sb.append(", generatorType=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
