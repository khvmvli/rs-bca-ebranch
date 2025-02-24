package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/IntegerValueOperator.class */
public class IntegerValueOperator<K> extends GenericPrimitiveValueOperator<K, Integer> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public IntegerValueOperator(BaseRealm baseRealm, OsMap osMap, TypeSelectorForMap<K, Integer> typeSelectorForMap) {
        super(Integer.class, baseRealm, osMap, typeSelectorForMap, RealmMapEntrySet.IteratorType.INTEGER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.GenericPrimitiveValueOperator
    public Integer processValue(Object obj) {
        return Integer.valueOf(((Long) obj).intValue());
    }
}
