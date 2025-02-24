package o;

import android.content.Context;
/* loaded from: classes-dex2jar.jar:o/getCitizenOthers.class */
final class getCitizenOthers extends getDob {
    private final Context a;
    private final realmGet$businessField b;
    private final String c;
    private final realmGet$businessField d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getCitizenOthers(Context context, realmGet$businessField realmget_businessfield, realmGet$businessField realmget_businessfield2, String str) {
        if (context != null) {
            this.a = context;
            if (realmget_businessfield != null) {
                this.d = realmget_businessfield;
                if (realmget_businessfield2 != null) {
                    this.b = realmget_businessfield2;
                    if (str != null) {
                        this.c = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // o.getDob
    public final realmGet$businessField a() {
        return this.b;
    }

    @Override // o.getDob
    public final realmGet$businessField c() {
        return this.d;
    }

    @Override // o.getDob
    public final String d() {
        return this.c;
    }

    @Override // o.getDob
    public final Context e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getDob)) {
            return false;
        }
        getDob getdob = (getDob) obj;
        if (!this.a.equals(getdob.e()) || !this.d.equals(getdob.c()) || !this.b.equals(getdob.a()) || !this.c.equals(getdob.d())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.d);
        sb.append(", monotonicClock=");
        sb.append(this.b);
        sb.append(", backendName=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
