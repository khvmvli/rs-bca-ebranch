package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.ObservableMap;
import io.realm.internal.OsMap;
import io.realm.internal.util.Pair;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/MapValueOperator.class */
public abstract class MapValueOperator<K, V> {
    protected final BaseRealm baseRealm;
    protected final RealmMapEntrySet.IteratorType iteratorType;
    protected final OsMap osMap;
    protected final TypeSelectorForMap<K, V> typeSelectorForMap;
    protected final Class<V> valueClass;

    public MapValueOperator(Class<V> cls, BaseRealm baseRealm, OsMap osMap, TypeSelectorForMap<K, V> typeSelectorForMap, RealmMapEntrySet.IteratorType iteratorType) {
        this.valueClass = cls;
        this.baseRealm = baseRealm;
        this.osMap = osMap;
        this.typeSelectorForMap = typeSelectorForMap;
        this.iteratorType = iteratorType;
    }

    public void clear() {
        this.osMap.clear();
    }

    public boolean containsKey(Object obj) {
        return this.osMap.containsKey(obj);
    }

    public boolean containsValue(@Nullable Object obj) {
        if (obj == null || obj.getClass() == this.valueClass) {
            return containsValueInternal(obj);
        }
        StringBuilder sb = new StringBuilder("Only '");
        sb.append(this.valueClass.getSimpleName());
        sb.append("'  values can be used with 'containsValue'.");
        throw new ClassCastException(sb.toString());
    }

    abstract boolean containsValueInternal(@Nullable Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Set<Map.Entry<K, V>> entrySet();

    public Pair<BaseRealm, OsMap> freeze() {
        BaseRealm freeze = this.baseRealm.freeze();
        return new Pair<>(freeze, this.osMap.freeze(freeze.sharedRealm));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public abstract V get(K k);

    public boolean isEmpty() {
        return this.osMap.size() == 0;
    }

    public boolean isFrozen() {
        return this.baseRealm.isFrozen();
    }

    public boolean isValid() {
        if (this.baseRealm.isClosed()) {
            return false;
        }
        return this.osMap.isValid();
    }

    public Set<K> keySet() {
        return this.typeSelectorForMap.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public abstract V put(K k, @Nullable V v);

    /* JADX WARN: Multi-variable type inference failed */
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public void remove(Object obj) {
        this.osMap.remove(obj);
    }

    public int size() {
        return (int) this.osMap.size();
    }

    public void startListening(ObservableMap observableMap) {
        this.osMap.startListening(observableMap);
    }

    public void stopListening() {
        this.osMap.stopListening();
    }

    public Collection<V> values() {
        return this.typeSelectorForMap.getValues();
    }
}
