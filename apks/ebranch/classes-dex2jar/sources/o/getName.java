package o;

import com.facebook.stetho.server.http.HttpStatus;
import o.getOccupationValue;
/* loaded from: classes-dex2jar.jar:o/getName.class */
final class getName extends getOccupationValue {
    private final int a;
    private final int c;
    private final int d;
    private final long e;
    private final long f;

    /* loaded from: classes-dex2jar.jar:o/getName$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends getOccupationValue.write {
        private Integer a;
        private Long b;
        private Integer c;
        private Long d;
        private Integer e;

        @Override // o.getOccupationValue.write
        final getOccupationValue.write a(int i) {
            this.c = Integer.valueOf((int) HttpStatus.HTTP_OK);
            return this;
        }

        @Override // o.getOccupationValue.write
        final getOccupationValue.write c(int i) {
            this.e = 10000;
            return this;
        }

        @Override // o.getOccupationValue.write
        final getOccupationValue.write c(long j) {
            this.b = 10485760L;
            return this;
        }

        @Override // o.getOccupationValue.write
        final getOccupationValue c() {
            String str = this.b == null ? " maxStorageSizeInBytes" : "";
            String str2 = str;
            if (this.c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" loadBatchSize");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.e == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" criticalSectionEnterTimeoutMs");
                str3 = sb2.toString();
            }
            String str4 = str3;
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(" eventCleanUpAge");
                str4 = sb3.toString();
            }
            String str5 = str4;
            if (this.a == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(" maxBlobByteSizePerRow");
                str5 = sb4.toString();
            }
            if (str5.isEmpty()) {
                return new getName(this.b.longValue(), this.c.intValue(), this.e.intValue(), this.d.longValue(), this.a.intValue(), (byte) 0);
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str5);
            throw new IllegalStateException(sb5.toString());
        }

        @Override // o.getOccupationValue.write
        final getOccupationValue.write d(int i) {
            this.a = 81920;
            return this;
        }

        @Override // o.getOccupationValue.write
        final getOccupationValue.write d(long j) {
            this.d = 604800000L;
            return this;
        }
    }

    private getName(long j, int i, int i2, long j2, int i3) {
        this.f = j;
        this.d = i;
        this.a = i2;
        this.e = j2;
        this.c = i3;
    }

    /* synthetic */ getName(long j, int i, int i2, long j2, int i3, byte b) {
        this(j, i, i2, j2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getOccupationValue
    public final long a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getOccupationValue
    public final int b() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getOccupationValue
    public final int c() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getOccupationValue
    public final long d() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getOccupationValue
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getOccupationValue)) {
            return false;
        }
        getOccupationValue getoccupationvalue = (getOccupationValue) obj;
        if (!(this.f == getoccupationvalue.d() && this.d == getoccupationvalue.c() && this.a == getoccupationvalue.e() && this.e == getoccupationvalue.a() && this.c == getoccupationvalue.b())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        long j = this.f;
        int i = (int) (j ^ (j >>> 32));
        int i2 = this.d;
        int i3 = this.a;
        long j2 = this.e;
        return ((((((i2 ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f);
        sb.append(", loadBatchSize=");
        sb.append(this.d);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.a);
        sb.append(", eventCleanUpAge=");
        sb.append(this.e);
        sb.append(", maxBlobByteSizePerRow=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
