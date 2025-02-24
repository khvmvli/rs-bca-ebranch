package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/SumberDanaORDialog.class */
public final class SumberDanaORDialog extends CrashlyticsReport.Session.Event.Device {
    private final Double a;
    private final int b;
    private final long c;
    private final int d;
    private final boolean e;
    private final long i;

    /* loaded from: classes2-dex2jar.jar:o/SumberDanaORDialog$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends CrashlyticsReport.Session.Event.Device.Builder {
        private Double a;
        private Integer b;
        private Integer c;
        private Long d;
        private Boolean e;
        private Long i;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device build() {
            String str = this.c == null ? " batteryVelocity" : "";
            String str2 = str;
            if (this.e == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" proximityOn");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" orientation");
                str3 = sb2.toString();
            }
            String str4 = str3;
            if (this.i == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(" ramUsed");
                str4 = sb3.toString();
            }
            String str5 = str4;
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(" diskUsed");
                str5 = sb4.toString();
            }
            if (str5.isEmpty()) {
                return new SumberDanaORDialog(this.a, this.c.intValue(), this.e.booleanValue(), this.b.intValue(), this.i.longValue(), this.d.longValue(), (byte) 0);
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str5);
            throw new IllegalStateException(sb5.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder setBatteryLevel(Double d) {
            this.a = d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder setBatteryVelocity(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder setDiskUsed(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder setOrientation(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder setProximityOn(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder setRamUsed(long j) {
            this.i = Long.valueOf(j);
            return this;
        }
    }

    private SumberDanaORDialog(Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.e = z;
        this.d = i2;
        this.i = j;
        this.c = j2;
    }

    /* synthetic */ SumberDanaORDialog(Double d, int i, boolean z, int i2, long j, long j2, byte b) {
        this(d, i, z, i2, j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r5.c == r0.getDiskUsed()) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            r7 = r0
            r0 = r6
            r1 = r5
            if (r0 != r1) goto L_0x0009
            r0 = 1
            return r0
        L_0x0009:
            r0 = r6
            boolean r0 = r0 instanceof com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
            if (r0 == 0) goto L_0x0070
            r0 = r6
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r0 = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device) r0
            r6 = r0
            r0 = r5
            java.lang.Double r0 = r0.a
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L_0x0028
            r0 = r6
            java.lang.Double r0 = r0.getBatteryLevel()
            if (r0 != 0) goto L_0x006c
            goto L_0x0033
        L_0x0028:
            r0 = r8
            r1 = r6
            java.lang.Double r1 = r1.getBatteryLevel()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006c
        L_0x0033:
            r0 = r5
            int r0 = r0.b
            r1 = r6
            int r1 = r1.getBatteryVelocity()
            if (r0 != r1) goto L_0x006c
            r0 = r5
            boolean r0 = r0.e
            r1 = r6
            boolean r1 = r1.isProximityOn()
            if (r0 != r1) goto L_0x006c
            r0 = r5
            int r0 = r0.d
            r1 = r6
            int r1 = r1.getOrientation()
            if (r0 != r1) goto L_0x006c
            r0 = r5
            long r0 = r0.i
            r1 = r6
            long r1 = r1.getRamUsed()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x006c
            r0 = r5
            long r0 = r0.c
            r1 = r6
            long r1 = r1.getDiskUsed()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006e
        L_0x006c:
            r0 = 0
            r7 = r0
        L_0x006e:
            r0 = r7
            return r0
        L_0x0070:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SumberDanaORDialog.equals(java.lang.Object):boolean");
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final Double getBatteryLevel() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final int getBatteryVelocity() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final long getDiskUsed() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final int getOrientation() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final long getRamUsed() {
        return this.i;
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = d == null ? 0 : d.hashCode();
        int i = this.b;
        int i2 = this.e ? 1231 : 1237;
        int i3 = this.d;
        long j = this.i;
        int i4 = (int) (j ^ (j >>> 32));
        long j2 = this.c;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final boolean isProximityOn() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.e);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.i);
        sb.append(", diskUsed=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
