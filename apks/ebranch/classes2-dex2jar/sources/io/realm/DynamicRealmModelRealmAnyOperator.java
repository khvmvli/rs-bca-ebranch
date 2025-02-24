package io.realm;

import io.realm.internal.Table;
import io.realm.internal.core.NativeRealmAny;
/* loaded from: classes2-dex2jar.jar:io/realm/DynamicRealmModelRealmAnyOperator.class */
final class DynamicRealmModelRealmAnyOperator extends RealmModelOperator {
    DynamicRealmModelRealmAnyOperator(BaseRealm baseRealm, NativeRealmAny nativeRealmAny) {
        super(getRealmModel(baseRealm, nativeRealmAny));
    }

    private static <T extends RealmModel> T getRealmModel(BaseRealm baseRealm, NativeRealmAny nativeRealmAny) {
        return (T) baseRealm.get(DynamicRealmObject.class, Table.getClassNameForTable(nativeRealmAny.getRealmModelTableName(baseRealm.getSharedRealm())), nativeRealmAny.getRealmModelRowKey());
    }

    final Class<?> getTypedClass() {
        return DynamicRealmObject.class;
    }
}
