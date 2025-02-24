package io.realm;

import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/RealmObjectSchema$FieldMetaData.class */
final class RealmObjectSchema$FieldMetaData {
    final RealmFieldType collectionType;
    final boolean defaultNullable;
    final RealmFieldType fieldType;

    RealmObjectSchema$FieldMetaData(RealmFieldType realmFieldType, @Nullable RealmFieldType realmFieldType2, boolean z) {
        this.fieldType = realmFieldType;
        this.collectionType = realmFieldType2;
        this.defaultNullable = z;
    }
}
