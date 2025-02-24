package o;

import java.util.Map;
import o.getHmVillage;
/* loaded from: classes-dex2jar.jar:o/getHmSubDistrict.class */
public final class getHmSubDistrict extends getHmVillage {
    private final Map<getTxbDate, getHmVillage.IconCompatParcelizer> c;
    private final realmGet$businessField e;

    public getHmSubDistrict(realmGet$businessField realmget_businessfield, Map<getTxbDate, getHmVillage.IconCompatParcelizer> map) {
        if (realmget_businessfield != null) {
            this.e = realmget_businessfield;
            if (map != null) {
                this.c = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getHmVillage
    public final Map<getTxbDate, getHmVillage.IconCompatParcelizer> a() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getHmVillage
    public final realmGet$businessField b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getHmVillage)) {
            return false;
        }
        getHmVillage gethmvillage = (getHmVillage) obj;
        if (!this.e.equals(gethmvillage.b()) || !this.c.equals(gethmvillage.a())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((this.e.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SchedulerConfig{clock=");
        sb.append(this.e);
        sb.append(", values=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
