package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;
import io.realm.internal.core.NativeRealmAny;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/RealmAnyValueOperator.class */
public class RealmAnyValueOperator<K> extends MapValueOperator<K, RealmAny> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public RealmAnyValueOperator(BaseRealm baseRealm, OsMap osMap, TypeSelectorForMap<K, RealmAny> typeSelectorForMap) {
        super(RealmAny.class, baseRealm, osMap, typeSelectorForMap, RealmMapEntrySet.IteratorType.MIXED);
    }

    @Override // io.realm.MapValueOperator
    boolean containsValueInternal(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof RealmAny) {
            return this.osMap.containsRealmAnyValue(((RealmAny) obj).getNativePtr());
        }
        throw new IllegalArgumentException("This dictionary can only contain 'RealmAny' values.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.MapValueOperator
    public Set<Map.Entry<K, RealmAny>> entrySet() {
        return new RealmMapEntrySet(this.baseRealm, this.osMap, RealmMapEntrySet.IteratorType.MIXED, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.MapValueOperator
    @Nullable
    public RealmAny get(Object obj) {
        long realmAnyPtr = this.osMap.getRealmAnyPtr(obj);
        if (realmAnyPtr == -1) {
            return null;
        }
        return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.baseRealm, new NativeRealmAny(realmAnyPtr)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public RealmAny put(Object obj, @Nullable RealmAny realmAny) {
        RealmAny realmAny2 = get(obj);
        if (realmAny == null) {
            this.osMap.put(obj, null);
        } else {
            this.osMap.putRealmAny(obj, CollectionUtils.copyToRealmIfNeeded(this.baseRealm, realmAny).getNativePtr());
        }
        return realmAny2;
    }
}
