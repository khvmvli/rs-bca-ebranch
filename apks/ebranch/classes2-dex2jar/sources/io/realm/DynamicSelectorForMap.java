package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.util.Pair;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/DynamicSelectorForMap.class */
class DynamicSelectorForMap<K> extends TypeSelectorForMap<K, DynamicRealmObject> {
    private final String className;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DynamicSelectorForMap(BaseRealm baseRealm, OsMap osMap, String str) {
        super(baseRealm, osMap);
        this.className = str;
    }

    private <T> RealmResults<T> produceResults(BaseRealm baseRealm, Pair<Table, Long> pair, String str) {
        return new RealmResults<>(baseRealm, OsResults.createFromMap(baseRealm.sharedRealm, ((Long) pair.second).longValue()), str, false);
    }

    @Override // io.realm.TypeSelectorForMap
    public RealmDictionary<DynamicRealmObject> freeze(BaseRealm baseRealm) {
        return new RealmDictionary<>(baseRealm, this.osMap, this.className);
    }

    @Override // io.realm.TypeSelectorForMap
    public Map.Entry<K, DynamicRealmObject> getModelEntry(BaseRealm baseRealm, long j, K k) {
        return new AbstractMap.SimpleImmutableEntry(k, baseRealm.get(DynamicRealmObject.class, this.className, j));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.TypeSelectorForMap
    public DynamicRealmObject getRealmModel(BaseRealm baseRealm, long j) {
        return baseRealm.get(DynamicRealmObject.class, this.className, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.TypeSelectorForMap
    public Class<DynamicRealmObject> getValueClass() {
        return DynamicRealmObject.class;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.TypeSelectorForMap
    public String getValueClassName() {
        return this.className;
    }

    @Override // io.realm.TypeSelectorForMap
    public Collection<DynamicRealmObject> getValues() {
        return produceResults(this.baseRealm, this.osMap.tableAndValuePtrs(), this.className);
    }

    @Override // io.realm.TypeSelectorForMap
    public Set<K> keySet() {
        return new HashSet((Collection) produceResults(this.baseRealm, this.osMap.tableAndKeyPtrs(), this.className));
    }

    /* renamed from: putRealmModel  reason: avoid collision after fix types in other method */
    public DynamicRealmObject putRealmModel2(BaseRealm baseRealm, OsMap osMap, K k, @Nullable DynamicRealmObject dynamicRealmObject) {
        long modelRowKey = osMap.getModelRowKey(k);
        if (dynamicRealmObject == null) {
            osMap.put(k, null);
        } else if (baseRealm.getSchema().getSchemaForClass(this.className).isEmbedded()) {
            CollectionUtils.updateEmbeddedObject((Realm) baseRealm, dynamicRealmObject, osMap.createAndPutEmbeddedObject(k));
        } else {
            DynamicRealmObject dynamicRealmObject2 = dynamicRealmObject;
            if (CollectionUtils.checkCanObjectBeCopied(baseRealm, dynamicRealmObject, this.className, "dictionary")) {
                dynamicRealmObject2 = (DynamicRealmObject) CollectionUtils.copyToRealm(baseRealm, dynamicRealmObject);
            }
            osMap.putRow(k, dynamicRealmObject2.realmGet$proxyState().getRow$realm().getObjectKey());
        }
        if (modelRowKey == -1) {
            return null;
        }
        return baseRealm.get(DynamicRealmObject.class, this.className, modelRowKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.TypeSelectorForMap
    public /* bridge */ /* synthetic */ DynamicRealmObject putRealmModel(BaseRealm baseRealm, OsMap osMap, Object obj, @Nullable DynamicRealmObject dynamicRealmObject) {
        return putRealmModel2(baseRealm, osMap, (OsMap) obj, dynamicRealmObject);
    }
}
