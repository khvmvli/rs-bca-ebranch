package io.realm;

import io.realm.RealmModel;
import io.realm.internal.OsMap;
import io.realm.internal.RealmObjectProxy;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/LinkSelectorForMap.class */
public class LinkSelectorForMap<K, V extends RealmModel> extends SelectorForMap<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkSelectorForMap(BaseRealm baseRealm, OsMap osMap, Class<K> cls, Class<V> cls2) {
        super(baseRealm, osMap, cls, cls2);
    }

    @Override // io.realm.TypeSelectorForMap
    public Map.Entry<K, V> getModelEntry(BaseRealm baseRealm, long j, K k) {
        return new AbstractMap.SimpleImmutableEntry(k, baseRealm.get(this.valueClass, (String) null, j));
    }

    @Override // io.realm.TypeSelectorForMap
    public V getRealmModel(BaseRealm baseRealm, long j) {
        return (V) baseRealm.get(this.valueClass, (String) null, j);
    }

    public V putRealmModel(BaseRealm baseRealm, OsMap osMap, K k, @Nullable V v) {
        long modelRowKey = osMap.getModelRowKey(k);
        if (v == null) {
            osMap.put(k, null);
        } else if (baseRealm.getSchema().getSchemaForClass(this.valueClass).isEmbedded()) {
            CollectionUtils.updateEmbeddedObject((Realm) baseRealm, v, osMap.createAndPutEmbeddedObject(k));
        } else {
            RealmModel realmModel = v;
            if (CollectionUtils.checkCanObjectBeCopied(baseRealm, v, this.valueClass.getSimpleName(), "dictionary")) {
                realmModel = CollectionUtils.copyToRealm(baseRealm, v);
            }
            osMap.putRow(k, ((RealmObjectProxy) realmModel).realmGet$proxyState().getRow$realm().getObjectKey());
        }
        if (modelRowKey == -1) {
            return null;
        }
        return (V) baseRealm.get(this.valueClass, modelRowKey, false, new ArrayList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.TypeSelectorForMap
    public /* bridge */ /* synthetic */ Object putRealmModel(BaseRealm baseRealm, OsMap osMap, Object obj, @Nullable Object obj2) {
        return putRealmModel(baseRealm, osMap, (OsMap) obj, (Object) ((RealmModel) obj2));
    }
}
