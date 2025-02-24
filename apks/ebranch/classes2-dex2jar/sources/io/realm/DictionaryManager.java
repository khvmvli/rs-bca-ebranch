package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.util.Pair;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/DictionaryManager.class */
public class DictionaryManager<V> extends ManagedMapManager<String, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DictionaryManager(BaseRealm baseRealm, MapValueOperator<String, V> mapValueOperator, TypeSelectorForMap<String, V> typeSelectorForMap) {
        super(baseRealm, mapValueOperator, typeSelectorForMap);
    }

    @Override // io.realm.ManagedMapManager
    MapChangeSet<String> changeSetFactory(long j) {
        return new StringMapChangeSet(j);
    }

    @Override // io.realm.ManagedMapManager
    boolean containsKeyInternal(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null keys are not allowed when calling 'containsKey'.");
        } else if (isNotNullItemTypeValid(obj, String.class)) {
            return this.mapValueOperator.containsKey(obj);
        } else {
            throw new ClassCastException("Only String keys can be used with 'containsKey'.");
        }
    }

    @Override // io.realm.ManagedMapManager, java.util.Map
    public Set<Map.Entry<String, V>> entrySet() {
        return this.mapValueOperator.entrySet();
    }

    @Override // io.realm.ManagedMapManager
    RealmDictionary<V> freezeInternal(Pair<BaseRealm, OsMap> pair) {
        return this.typeSelectorForMap.freeze((BaseRealm) pair.first);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null keys are not allowed when calling 'get'.");
        } else if (isNotNullItemTypeValid(obj, String.class)) {
            return (V) this.mapValueOperator.get((String) obj);
        } else {
            throw new ClassCastException("Only String keys can be used with 'containsKey'.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.ManagedMapManager, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, @Nullable Object obj2) {
        return put((String) obj, (String) obj2);
    }

    public V put(String str, @Nullable V v) {
        if (str != null) {
            try {
                return (V) this.mapValueOperator.put(str, v);
            } catch (IllegalStateException e) {
                if (((String) Objects.requireNonNull(e.getMessage())).contains("Data type mismatch")) {
                    throw new NullPointerException("Cannot insert null values in a dictionary marked with '@Required'.");
                }
                throw e;
            }
        } else {
            throw new NullPointerException("Null keys are not allowed.");
        }
    }

    @Override // io.realm.ManagedMapManager
    void validateMap(Map<? extends String, ? extends V> map) {
        for (Map.Entry<? extends String, ? extends V> entry : map.entrySet()) {
            if (((String) entry.getKey()) == null) {
                throw new NullPointerException("Null keys are not allowed.");
            }
        }
    }
}
