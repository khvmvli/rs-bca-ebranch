package io.realm;

import io.realm.RealmMapEntrySet;
import io.realm.internal.OsMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/ByteValueOperator.class */
public class ByteValueOperator<K> extends GenericPrimitiveValueOperator<K, Byte> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteValueOperator(BaseRealm baseRealm, OsMap osMap, TypeSelectorForMap<K, Byte> typeSelectorForMap) {
        super(Byte.class, baseRealm, osMap, typeSelectorForMap, RealmMapEntrySet.IteratorType.BYTE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.GenericPrimitiveValueOperator
    public Byte processValue(Object obj) {
        return Byte.valueOf(((Long) obj).byteValue());
    }
}
