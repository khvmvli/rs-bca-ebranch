package o;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmSet$cardGroupType.class */
public final class realmSet$cardGroupType implements Map.Entry, Comparable<realmSet$cardGroupType> {
    private Object a;
    final /* synthetic */ realmSet$cardName d;
    private final Comparable e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmSet$cardGroupType(realmSet$cardName realmset_cardname, Comparable comparable, Object obj) {
        this.d = realmset_cardname;
        this.e = comparable;
        this.a = obj;
    }

    private static final boolean a(Object obj, Object obj2) {
        boolean z;
        if (obj != null) {
            z = obj.equals(obj2);
        } else if (obj2 == null) {
            return true;
        } else {
            z = false;
        }
        return z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(realmSet$cardGroupType realmset_cardgrouptype) {
        return this.e.compareTo(realmset_cardgrouptype.e);
    }

    public final Comparable e() {
        return this.e;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.e, entry.getKey()) && a(this.a, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.a;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public final int hashCode() {
        Comparable comparable = this.e;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.a;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.d.a();
        Object obj2 = this.a;
        this.a = obj;
        return obj2;
    }

    @Override // java.lang.Object
    public final String toString() {
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
