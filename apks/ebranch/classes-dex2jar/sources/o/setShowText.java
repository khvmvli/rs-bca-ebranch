package o;

import java.util.HashMap;
import o.setSwitchPadding;
/* loaded from: classes-dex2jar.jar:o/setShowText.class */
public final class setShowText<K, V> extends setSwitchPadding<K, V> {
    public HashMap<K, setSwitchPadding.write<K, V>> d = new HashMap<>();

    @Override // o.setSwitchPadding
    public final V a(K k) {
        V a = a(k);
        this.d.remove(k);
        return a;
    }

    @Override // o.setSwitchPadding
    protected final setSwitchPadding.write<K, V> b(K k) {
        return this.d.get(k);
    }

    @Override // o.setSwitchPadding
    public final V e(K k, V v) {
        setSwitchPadding.write<K, V> write = this.d.get(k);
        if (write != null) {
            return write.d;
        }
        this.d.put(k, b(k, v));
        return null;
    }
}
