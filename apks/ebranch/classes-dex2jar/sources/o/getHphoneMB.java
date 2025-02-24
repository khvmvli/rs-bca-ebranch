package o;

import java.util.Set;
import o.getHmVillage;
/* loaded from: classes-dex2jar.jar:o/getHphoneMB.class */
final class getHphoneMB extends getHmVillage.IconCompatParcelizer {
    private final long a;
    private final Set<getHmVillage.read> b;
    private final long d;

    /* loaded from: classes-dex2jar.jar:o/getHphoneMB$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends getHmVillage$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver {
        private Long a;
        private Long b;
        public Set<getHmVillage.read> c;

        @Override // o.getHmVillage$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver
        public final getHmVillage$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver c(long j) {
            this.b = 86400000L;
            return this;
        }

        @Override // o.getHmVillage$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver
        public final getHmVillage$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver c(Set<getHmVillage.read> set) {
            if (set != null) {
                this.c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // o.getHmVillage$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver
        public final getHmVillage.IconCompatParcelizer c() {
            String str = this.a == null ? " delta" : "";
            String str2 = str;
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" maxAllowedDelay");
                str2 = sb.toString();
            }
            String str3 = str2;
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(" flags");
                str3 = sb2.toString();
            }
            if (str3.isEmpty()) {
                return new getHphoneMB(this.a.longValue(), this.b.longValue(), this.c, (byte) 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str3);
            throw new IllegalStateException(sb3.toString());
        }

        @Override // o.getHmVillage$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver
        public final getHmVillage$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver e(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    private getHphoneMB(long j, long j2, Set<getHmVillage.read> set) {
        this.d = j;
        this.a = j2;
        this.b = set;
    }

    /* synthetic */ getHphoneMB(long j, long j2, Set set, byte b) {
        this(j, j2, set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getHmVillage.IconCompatParcelizer
    public final long a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getHmVillage.IconCompatParcelizer
    public final long b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getHmVillage.IconCompatParcelizer
    public final Set<getHmVillage.read> e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getHmVillage.IconCompatParcelizer)) {
            return false;
        }
        getHmVillage.IconCompatParcelizer iconCompatParcelizer = (getHmVillage.IconCompatParcelizer) obj;
        if (!(this.d == iconCompatParcelizer.b() && this.a == iconCompatParcelizer.a() && this.b.equals(iconCompatParcelizer.e()))) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        long j = this.d;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.a;
        return ((((int) ((j2 >>> 32) ^ j2)) ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigValue{delta=");
        sb.append(this.d);
        sb.append(", maxAllowedDelay=");
        sb.append(this.a);
        sb.append(", flags=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
