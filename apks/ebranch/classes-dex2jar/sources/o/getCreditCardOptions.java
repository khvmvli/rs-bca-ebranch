package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/getCreditCardOptions.class */
public final class getCreditCardOptions {
    private String a;
    private final Map<String, Object> c;
    private final long d;

    public getCreditCardOptions(String str, long j, Map<String, Object> map) {
        this.a = str;
        this.d = j;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final String a() {
        return this.a;
    }

    public final Map<String, Object> c() {
        return this.c;
    }

    public final void c(String str) {
        this.a = str;
    }

    public final long d() {
        return this.d;
    }

    public final Object e(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return null;
    }

    /* renamed from: e */
    public final getCreditCardOptions clone() {
        return new getCreditCardOptions(this.a, this.d, new HashMap(this.c));
    }

    public final void e(String str, Object obj) {
        if (obj == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCreditCardOptions)) {
            return false;
        }
        getCreditCardOptions getcreditcardoptions = (getCreditCardOptions) obj;
        if (this.d == getcreditcardoptions.d && this.a.equals(getcreditcardoptions.a)) {
            return this.c.equals(getcreditcardoptions.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.d;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        long j = this.d;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(valueOf).length());
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
