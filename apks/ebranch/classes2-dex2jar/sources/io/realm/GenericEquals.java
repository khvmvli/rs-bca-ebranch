package io.realm;
/* loaded from: classes2-dex2jar.jar:io/realm/GenericEquals.class */
class GenericEquals<K, V> extends EqualsHelper<K, V> {
    @Override // io.realm.EqualsHelper
    protected boolean compareInternal(V v, V v2) {
        if (v != null) {
            return v.equals(v2);
        }
        return v2 == null;
    }
}
