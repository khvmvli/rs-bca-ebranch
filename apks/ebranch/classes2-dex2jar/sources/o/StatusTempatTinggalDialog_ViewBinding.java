package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
/* loaded from: classes2-dex2jar.jar:o/StatusTempatTinggalDialog_ViewBinding.class */
public final class StatusTempatTinggalDialog_ViewBinding extends CrashlyticsReport.Session.Device {
    private final String a;
    private final long b;
    private final int c;
    private final int d;
    private final String e;
    private final String f;
    private final long h;
    private final int i;
    private final boolean j;

    /* loaded from: classes2-dex2jar.jar:o/StatusTempatTinggalDialog_ViewBinding$write.class */
    public static final class write extends CrashlyticsReport.Session.Device.Builder {
        private Long a;
        private Integer b;
        private String c;
        private Integer d;
        private String e;
        private Long g;
        private Boolean h;
        private Integer i;
        private String j;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device build() {
            String str = this.d == null ? " arch" : "";
            String str2 = str;
            if (this.e == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" model");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" cores");
                str3 = sb2.toString();
            }
            String str4 = str3;
            if (this.g == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(" ram");
                str4 = sb3.toString();
            }
            String str5 = str4;
            if (this.a == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(" diskSpace");
                str5 = sb4.toString();
            }
            String str6 = str5;
            if (this.h == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str5);
                sb5.append(" simulator");
                str6 = sb5.toString();
            }
            String str7 = str6;
            if (this.i == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str6);
                sb6.append(" state");
                str7 = sb6.toString();
            }
            String str8 = str7;
            if (this.c == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str7);
                sb7.append(" manufacturer");
                str8 = sb7.toString();
            }
            String str9 = str8;
            if (this.j == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str8);
                sb8.append(" modelClass");
                str9 = sb8.toString();
            }
            if (str9.isEmpty()) {
                return new StatusTempatTinggalDialog_ViewBinding(this.d.intValue(), this.e, this.b.intValue(), this.g.longValue(), this.a.longValue(), this.h.booleanValue(), this.i.intValue(), this.c, this.j, (byte) 0);
            }
            StringBuilder sb9 = new StringBuilder("Missing required properties:");
            sb9.append(str9);
            throw new IllegalStateException(sb9.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setArch(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setCores(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setDiskSpace(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setManufacturer(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setModel(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setModelClass(String str) {
            if (str != null) {
                this.j = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setRam(long j) {
            this.g = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setSimulator(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder setState(int i) {
            this.i = Integer.valueOf(i);
            return this;
        }
    }

    private StatusTempatTinggalDialog_ViewBinding(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.d = i;
        this.a = str;
        this.c = i2;
        this.h = j;
        this.b = j2;
        this.j = z;
        this.i = i3;
        this.e = str2;
        this.f = str3;
    }

    /* synthetic */ StatusTempatTinggalDialog_ViewBinding(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3, byte b) {
        this(i, str, i2, j, j2, z, i3, str2, str3);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
        if (!(this.d == device.getArch() && this.a.equals(device.getModel()) && this.c == device.getCores() && this.h == device.getRam() && this.b == device.getDiskSpace() && this.j == device.isSimulator() && this.i == device.getState() && this.e.equals(device.getManufacturer()) && this.f.equals(device.getModelClass()))) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final int getArch() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final int getCores() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final long getDiskSpace() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final String getManufacturer() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final String getModel() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final String getModelClass() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final long getRam() {
        return this.h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final int getState() {
        return this.i;
    }

    public final int hashCode() {
        int i = this.d;
        int hashCode = this.a.hashCode();
        int i2 = this.c;
        long j = this.h;
        int i3 = (int) (j ^ (j >>> 32));
        long j2 = this.b;
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ this.i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final boolean isSimulator() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.d);
        sb.append(", model=");
        sb.append(this.a);
        sb.append(", cores=");
        sb.append(this.c);
        sb.append(", ram=");
        sb.append(this.h);
        sb.append(", diskSpace=");
        sb.append(this.b);
        sb.append(", simulator=");
        sb.append(this.j);
        sb.append(", state=");
        sb.append(this.i);
        sb.append(", manufacturer=");
        sb.append(this.e);
        sb.append(", modelClass=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
