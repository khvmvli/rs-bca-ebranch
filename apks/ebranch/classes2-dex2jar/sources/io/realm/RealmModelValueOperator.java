package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/RealmModelValueOperator.class */
public class RealmModelValueOperator<K, V> extends MapValueOperator<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public RealmModelValueOperator(BaseRealm baseRealm, OsMap osMap, TypeSelectorForMap<K, V> typeSelectorForMap) {
        super(RealmModel.class, baseRealm, osMap, typeSelectorForMap, RealmMapEntrySet.IteratorType.OBJECT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.MapValueOperator
    public boolean containsValue(@Nullable Object obj) {
        if (obj == null || RealmModel.class.isAssignableFrom(obj.getClass())) {
            return containsValueInternal(obj);
        }
        throw new ClassCastException("Only RealmModel values can be used with 'containsValue'.");
    }

    @Override // io.realm.MapValueOperator
    boolean containsValueInternal(@Nullable Object obj) {
        if (obj == null) {
            return this.osMap.containsPrimitiveValue(null);
        }
        if (obj instanceof RealmObjectProxy) {
            Row row$realm = ((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm();
            return this.osMap.containsRealmModel(row$realm.getObjectKey(), row$realm.getTable().getNativePtr());
        }
        throw new IllegalArgumentException("Only managed models can be contained in this dictionary.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.MapValueOperator
    public Set<Map.Entry<K, V>> entrySet() {
        return new RealmMapEntrySet(this.baseRealm, this.osMap, RealmMapEntrySet.IteratorType.OBJECT, this.typeSelectorForMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.MapValueOperator
    @Nullable
    public V get(Object obj) {
        long modelRowKey = this.osMap.getModelRowKey(obj);
        if (modelRowKey == -1) {
            return null;
        }
        return (V) this.typeSelectorForMap.getRealmModel(this.baseRealm, modelRowKey);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.MapValueOperator
    @Nullable
    public V put(K k, @Nullable V v) {
        return (V) this.typeSelectorForMap.putRealmModel(this.baseRealm, this.osMap, k, v);
    }
}
