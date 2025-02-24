package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/realmGet$annualFeeAddOnAmount.class */
public final class realmGet$annualFeeAddOnAmount<K, V> extends LinkedHashMap<K, V> {
    private static final realmGet$annualFeeAddOnAmount e;
    private boolean a = true;

    static {
        realmGet$annualFeeAddOnAmount realmget_annualfeeaddonamount = new realmGet$annualFeeAddOnAmount();
        e = realmget_annualfeeaddonamount;
        realmget_annualfeeaddonamount.a = false;
    }

    private realmGet$annualFeeAddOnAmount() {
    }

    private realmGet$annualFeeAddOnAmount(Map<K, V> map) {
        super(map);
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return setNationality.c((byte[]) obj);
        }
        if (!(obj instanceof setIdentityCardType)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private final void c() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    public static <K, V> realmGet$annualFeeAddOnAmount<K, V> d() {
        return e;
    }

    public final realmGet$annualFeeAddOnAmount<K, V> a() {
        return isEmpty() ? new realmGet$annualFeeAddOnAmount<>() : new realmGet$annualFeeAddOnAmount<>(this);
    }

    public final void b(realmGet$annualFeeAddOnAmount<K, V> realmget_annualfeeaddonamount) {
        c();
        if (!realmget_annualfeeaddonamount.isEmpty()) {
            putAll(realmget_annualfeeaddonamount);
        }
    }

    public final boolean b() {
        return this.a;
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final void clear() {
        c();
        clear();
    }

    public final void e() {
        this.a = false;
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!((!(value instanceof byte[]) || !(obj2 instanceof byte[])) ? value.equals(obj2) : Arrays.equals((byte[]) value, (byte[]) obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.lang.Object
    public final int hashCode() {
        int i = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i += c(entry.getValue()) ^ c(entry.getKey());
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final V put(K k, V v) {
        c();
        setNationality.c(k);
        setNationality.c(v);
        return put(k, v);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final void putAll(Map<? extends K, ? extends V> map) {
        c();
        for (Object obj : map.keySet()) {
            setNationality.c(obj);
            setNationality.c(map.get(obj));
        }
        putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final V remove(Object obj) {
        c();
        return remove(obj);
    }
}
