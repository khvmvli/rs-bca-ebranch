package o;
/* loaded from: classes-dex2jar.jar:o/getTxnPurposeType.class */
public final class getTxnPurposeType {
    public Class<?> b;
    public Class<?> d;
    public Class<?> e;

    public getTxnPurposeType() {
    }

    public getTxnPurposeType(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.d = cls;
        this.b = cls2;
        this.e = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getTxnPurposeType gettxnpurposetype = (getTxnPurposeType) obj;
        return this.d.equals(gettxnpurposetype.d) && this.b.equals(gettxnpurposetype.b) && getTxnNotes2.a(this.e, gettxnpurposetype.e);
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.b.hashCode();
        Class<?> cls = this.e;
        return (((hashCode * 31) + hashCode2) * 31) + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiClassKey{first=");
        sb.append(this.d);
        sb.append(", second=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
