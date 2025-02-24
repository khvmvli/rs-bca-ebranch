package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.util.Pair;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/SelectorForMap.class */
public class SelectorForMap<K, V> extends TypeSelectorForMap<K, V> {
    protected final Class<K> keyClass;
    protected final Class<V> valueClass;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SelectorForMap(BaseRealm baseRealm, OsMap osMap, Class<K> cls, Class<V> cls2) {
        super(baseRealm, osMap);
        this.keyClass = cls;
        this.valueClass = cls2;
    }

    private <T> RealmResults<T> produceResults(BaseRealm baseRealm, Pair<Table, Long> pair, boolean z, Class<T> cls) {
        return new RealmResults<>(baseRealm, OsResults.createFromMap(baseRealm.sharedRealm, ((Long) pair.second).longValue()), cls, z);
    }

    @Override // io.realm.TypeSelectorForMap
    public RealmDictionary<V> freeze(BaseRealm baseRealm) {
        return new RealmDictionary<>(baseRealm, this.osMap, this.valueClass);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.TypeSelectorForMap
    public Class<V> getValueClass() {
        return this.valueClass;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.TypeSelectorForMap
    public String getValueClassName() {
        return this.valueClass.getSimpleName();
    }

    @Override // io.realm.TypeSelectorForMap
    public Collection<V> getValues() {
        return produceResults(this.baseRealm, this.osMap.tableAndValuePtrs(), !CollectionUtils.isClassForRealmModel(this.valueClass), (Class<V>) this.valueClass);
    }

    @Override // io.realm.TypeSelectorForMap
    public Set<K> keySet() {
        return new HashSet((Collection) produceResults(this.baseRealm, this.osMap.tableAndKeyPtrs(), true, (Class<K>) this.keyClass));
    }
}
