package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/ShortValueOperator.class */
public class ShortValueOperator<K> extends GenericPrimitiveValueOperator<K, Short> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ShortValueOperator(BaseRealm baseRealm, OsMap osMap, TypeSelectorForMap<K, Short> typeSelectorForMap) {
        super(Short.class, baseRealm, osMap, typeSelectorForMap, RealmMapEntrySet.IteratorType.SHORT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.GenericPrimitiveValueOperator
    public Short processValue(Object obj) {
        return Short.valueOf(((Long) obj).shortValue());
    }
}
