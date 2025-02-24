package io.realm;

import java.util.Map;
/* loaded from: classes2-dex2jar.jar:io/realm/EqualsHelper.class */
abstract class EqualsHelper<K, V> {
    protected abstract boolean compareInternal(V v, V v2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean equalsHelper(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
        if (entry.getKey().equals(entry2.getKey())) {
            return compareInternal(entry.getValue(), entry2.getValue());
        }
        return false;
    }
}
