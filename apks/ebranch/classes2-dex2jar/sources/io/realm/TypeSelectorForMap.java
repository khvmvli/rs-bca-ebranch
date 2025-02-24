package io.realm;

import io.realm.internal.OsMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/TypeSelectorForMap.class */
public abstract class TypeSelectorForMap<K, V> {
    protected final BaseRealm baseRealm;
    protected final OsMap osMap;

    public TypeSelectorForMap(BaseRealm baseRealm, OsMap osMap) {
        this.baseRealm = baseRealm;
        this.osMap = osMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract RealmDictionary<V> freeze(BaseRealm baseRealm);

    public Map.Entry<K, V> getModelEntry(BaseRealm baseRealm, long j, K k) {
        throw new UnsupportedOperationException("Function 'getModelEntry' can only be called from 'LinkSelectorForMap' instances.");
    }

    public V getRealmModel(BaseRealm baseRealm, long j) {
        throw new UnsupportedOperationException("Function 'getRealmModel' can only be called from 'LinkSelectorForMap' instances.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Class<V> getValueClass();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String getValueClassName();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Collection<V> getValues();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Set<K> keySet();

    public V putRealmModel(BaseRealm baseRealm, OsMap osMap, K k, @Nullable V v) {
        throw new UnsupportedOperationException("Function 'putRealmModel' can only be called from 'LinkSelectorForMap' instances.");
    }
}
