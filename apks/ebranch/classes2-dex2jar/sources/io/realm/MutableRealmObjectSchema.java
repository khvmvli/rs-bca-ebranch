package io.realm;

import io.realm.internal.CheckedRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.Util;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes2-dex2jar.jar:io/realm/MutableRealmObjectSchema.class */
class MutableRealmObjectSchema extends RealmObjectSchema {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.realm.MutableRealmObjectSchema$1  reason: invalid class name */
    /* loaded from: classes2-dex2jar.jar:io/realm/MutableRealmObjectSchema$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$realm$RealmFieldType;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            $SwitchMap$io$realm$RealmFieldType = iArr;
            try {
                iArr[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$io$realm$RealmFieldType[RealmFieldType.DATE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    MutableRealmObjectSchema(BaseRealm baseRealm, RealmSchema realmSchema, Table table) {
        super(baseRealm, realmSchema, table, new RealmObjectSchema$DynamicColumnIndices(table));
    }

    private void addModifiers(String str, FieldAttribute[] fieldAttributeArr) {
        if (fieldAttributeArr != null) {
            boolean z = false;
            z = false;
            try {
                if (fieldAttributeArr.length > 0) {
                    if (containsAttribute(fieldAttributeArr, FieldAttribute.INDEXED)) {
                        addIndex(str);
                        z = true;
                    }
                    if (containsAttribute(fieldAttributeArr, FieldAttribute.PRIMARY_KEY)) {
                        addPrimaryKey(str);
                    }
                }
            } catch (Exception e) {
                long columnKey = getColumnKey(str);
                if (z) {
                    this.table.removeSearchIndex(columnKey);
                }
                throw ((RuntimeException) e);
            }
        }
    }

    private void checkAddPrimaryKeyForSync() {
        if (this.realm.configuration.isSyncConfiguration()) {
            throw new UnsupportedOperationException("'addPrimaryKey' is not supported by synced Realms.");
        }
    }

    private void checkEmpty(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Null or empty class names are not allowed");
        }
    }

    private void checkFieldNameIsAvailable(String str) {
        if (this.table.getColumnKey(str) != -1) {
            StringBuilder sb = new StringBuilder("Field already exists in '");
            sb.append(getClassName());
            sb.append("': ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void checkForObjectStoreInvalidPrimaryKeyTypes(String str, RealmFieldType realmFieldType) {
        int i = AnonymousClass1.$SwitchMap$io$realm$RealmFieldType[realmFieldType.ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder("Boolean fields cannot be marked as primary keys: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 2) {
            StringBuilder sb2 = new StringBuilder("Date fields cannot be marked as primary keys: ");
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private void checkForObjectStoreInvalidPrimaryKeyTypes(String str, Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            checkForObjectStoreInvalidPrimaryKeyTypes(str, RealmFieldType.BOOLEAN);
        }
        if (cls == Date.class) {
            checkForObjectStoreInvalidPrimaryKeyTypes(str, RealmFieldType.DATE);
        }
    }

    private void checkNewFieldName(String str) {
        checkLegalName(str);
        checkFieldNameIsAvailable(str);
    }

    static boolean containsAttribute(FieldAttribute[] fieldAttributeArr, FieldAttribute fieldAttribute) {
        if (fieldAttributeArr == null || fieldAttributeArr.length == 0) {
            return false;
        }
        for (FieldAttribute fieldAttribute2 : fieldAttributeArr) {
            if (fieldAttribute2 == fieldAttribute) {
                return true;
            }
        }
        return false;
    }

    public RealmObjectSchema addField(String str, Class<?> cls, FieldAttribute... fieldAttributeArr) {
        RealmObjectSchema$FieldMetaData realmObjectSchema$FieldMetaData = (RealmObjectSchema$FieldMetaData) SUPPORTED_LIST_SIMPLE_FIELDS.get(cls);
        boolean z = false;
        if (realmObjectSchema$FieldMetaData != null) {
            if (containsAttribute(fieldAttributeArr, FieldAttribute.PRIMARY_KEY)) {
                checkAddPrimaryKeyForSync();
                checkForObjectStoreInvalidPrimaryKeyTypes(str, cls);
            }
            checkNewFieldName(str);
            z = realmObjectSchema$FieldMetaData.defaultNullable;
            if (!containsAttribute(fieldAttributeArr, FieldAttribute.REQUIRED)) {
            }
            long addColumn = this.table.addColumn(realmObjectSchema$FieldMetaData.fieldType, str, z);
            try {
                addModifiers(str, fieldAttributeArr);
                return this;
            } catch (Exception e) {
                this.table.removeColumn(addColumn);
                throw e;
            }
        } else if (SUPPORTED_LINKED_FIELDS.containsKey(cls)) {
            StringBuilder sb = new StringBuilder("Use addRealmObjectField() instead to add fields that link to other RealmObjects: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (RealmModel.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(String.format(Locale.US, "Use 'addRealmObjectField()' instead to add fields that link to other RealmObjects: %s(%s)", str, cls));
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "Realm doesn't support this field type: %s(%s)", str, cls));
        }
    }

    public RealmObjectSchema addIndex(String str) {
        checkLegalName(str);
        checkFieldExists(str);
        long columnKey = getColumnKey(str);
        if (!this.table.hasSearchIndex(columnKey)) {
            this.table.addSearchIndex(columnKey);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" already has an index.");
        throw new IllegalStateException(sb.toString());
    }

    public RealmObjectSchema addPrimaryKey(String str) {
        checkAddPrimaryKeyForSync();
        checkLegalName(str);
        checkFieldExists(str);
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, getClassName());
        if (primaryKeyForObject == null) {
            long columnKey = getColumnKey(str);
            RealmFieldType fieldType = getFieldType(str);
            checkForObjectStoreInvalidPrimaryKeyTypes(str, fieldType);
            if (fieldType != RealmFieldType.STRING && !this.table.hasSearchIndex(columnKey)) {
                this.table.addSearchIndex(columnKey);
            }
            OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, getClassName(), str);
            return this;
        }
        throw new IllegalStateException(String.format(Locale.ENGLISH, "Field '%s' has been already defined as primary key.", primaryKeyForObject));
    }

    public RealmObjectSchema addRealmDictionaryField(String str, RealmObjectSchema realmObjectSchema) {
        checkLegalName(str);
        checkFieldNameIsAvailable(str);
        this.table.addColumnDictionaryLink(RealmFieldType.STRING_TO_LINK_MAP, str, this.realm.sharedRealm.getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }

    public RealmObjectSchema addRealmDictionaryField(String str, Class<?> cls) {
        checkLegalName(str);
        checkFieldNameIsAvailable(str);
        RealmObjectSchema$FieldMetaData realmObjectSchema$FieldMetaData = (RealmObjectSchema$FieldMetaData) SUPPORTED_DICTIONARY_SIMPLE_FIELDS.get(cls);
        if (realmObjectSchema$FieldMetaData != null) {
            this.table.addColumn(realmObjectSchema$FieldMetaData.collectionType, str, realmObjectSchema$FieldMetaData.defaultNullable);
            return this;
        } else if (cls.equals(RealmObjectSchema.class) || RealmModel.class.isAssignableFrom(cls)) {
            StringBuilder sb = new StringBuilder("Use 'addRealmDictionaryField(String name, RealmObjectSchema schema)' instead to add dictionaries that link to other RealmObjects: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "RealmDictionary does not support dictionaries with this type: %s(%s)", str, cls));
        }
    }

    public RealmObjectSchema addRealmListField(String str, RealmObjectSchema realmObjectSchema) {
        checkLegalName(str);
        checkFieldNameIsAvailable(str);
        this.table.addColumnLink(RealmFieldType.LIST, str, this.realm.sharedRealm.getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }

    public RealmObjectSchema addRealmListField(String str, Class<?> cls) {
        checkLegalName(str);
        checkFieldNameIsAvailable(str);
        RealmObjectSchema$FieldMetaData realmObjectSchema$FieldMetaData = (RealmObjectSchema$FieldMetaData) SUPPORTED_LIST_SIMPLE_FIELDS.get(cls);
        if (realmObjectSchema$FieldMetaData != null) {
            this.table.addColumn(realmObjectSchema$FieldMetaData.collectionType, str, realmObjectSchema$FieldMetaData.defaultNullable);
            return this;
        } else if (cls.equals(RealmObjectSchema.class) || RealmModel.class.isAssignableFrom(cls)) {
            StringBuilder sb = new StringBuilder("Use 'addRealmListField(String name, RealmObjectSchema schema)' instead to add lists that link to other RealmObjects: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "RealmList does not support lists with this type: %s(%s)", str, cls));
        }
    }

    public RealmObjectSchema addRealmObjectField(String str, RealmObjectSchema realmObjectSchema) {
        checkLegalName(str);
        checkFieldNameIsAvailable(str);
        this.table.addColumnLink(RealmFieldType.OBJECT, str, this.realm.sharedRealm.getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }

    public RealmObjectSchema addRealmSetField(String str, RealmObjectSchema realmObjectSchema) {
        checkLegalName(str);
        checkFieldNameIsAvailable(str);
        this.table.addColumnSetLink(RealmFieldType.LINK_SET, str, this.realm.sharedRealm.getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }

    public RealmObjectSchema addRealmSetField(String str, Class<?> cls) {
        checkLegalName(str);
        checkFieldNameIsAvailable(str);
        RealmObjectSchema$FieldMetaData realmObjectSchema$FieldMetaData = (RealmObjectSchema$FieldMetaData) SUPPORTED_SET_SIMPLE_FIELDS.get(cls);
        if (realmObjectSchema$FieldMetaData != null) {
            this.table.addColumn(realmObjectSchema$FieldMetaData.collectionType, str, realmObjectSchema$FieldMetaData.defaultNullable);
            return this;
        } else if (cls.equals(RealmObjectSchema.class) || RealmModel.class.isAssignableFrom(cls)) {
            StringBuilder sb = new StringBuilder("Use 'addRealmSetField(String name, RealmObjectSchema schema)' instead to add sets that link to other RealmObjects: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "RealmSet does not support sets with this type: %s(%s)", str, cls));
        }
    }

    String getPropertyClassName(String str) {
        String className = this.table.getLinkTarget(getColumnKey(str)).getClassName();
        if (!Util.isEmptyString(className)) {
            return className;
        }
        throw new IllegalArgumentException(String.format("Property '%s' not found.", str));
    }

    public RealmObjectSchema removeField(String str) {
        this.realm.checkNotInSync();
        checkLegalName(str);
        if (hasField(str)) {
            long columnKey = getColumnKey(str);
            String className = getClassName();
            if (str.equals(OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, className))) {
                OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, className, str);
            }
            this.table.removeColumn(columnKey);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" does not exist.");
        throw new IllegalStateException(sb.toString());
    }

    public RealmObjectSchema removeIndex(String str) {
        this.realm.checkNotInSync();
        checkLegalName(str);
        checkFieldExists(str);
        long columnKey = getColumnKey(str);
        if (this.table.hasSearchIndex(columnKey)) {
            this.table.removeSearchIndex(columnKey);
            return this;
        }
        StringBuilder sb = new StringBuilder("Field is not indexed: ");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    public RealmObjectSchema removePrimaryKey() {
        this.realm.checkNotInSync();
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, getClassName());
        if (primaryKeyForObject != null) {
            long columnKey = this.table.getColumnKey(primaryKeyForObject);
            if (this.table.hasSearchIndex(columnKey)) {
                this.table.removeSearchIndex(columnKey);
            }
            OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, getClassName(), (String) null);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClassName());
        sb.append(" doesn't have a primary key.");
        throw new IllegalStateException(sb.toString());
    }

    public RealmObjectSchema renameField(String str, String str2) {
        this.realm.checkNotInSync();
        checkLegalName(str);
        checkFieldExists(str);
        checkLegalName(str2);
        checkFieldNameIsAvailable(str2);
        this.table.renameColumn(getColumnKey(str), str2);
        return this;
    }

    public RealmObjectSchema setClassName(String str) {
        this.realm.checkNotInSync();
        checkEmpty(str);
        String tableNameForClass = Table.getTableNameForClass(str);
        if (str.length() > Table.CLASS_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException(String.format(Locale.US, "Class name is too long. Limit is %1$d characters: '%2$s' (%3$d)", Integer.valueOf(Table.CLASS_NAME_MAX_LENGTH), str, Integer.valueOf(str.length())));
        } else if (!this.realm.sharedRealm.hasTable(tableNameForClass)) {
            String name = this.table.getName();
            String className = this.table.getClassName();
            String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, className);
            if (primaryKeyForObject != null) {
                OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, className, (String) null);
            }
            this.realm.sharedRealm.renameTable(name, tableNameForClass);
            if (primaryKeyForObject != null) {
                try {
                    OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, str, primaryKeyForObject);
                } catch (Exception e) {
                    this.realm.sharedRealm.renameTable(this.table.getName(), name);
                    throw e;
                }
            }
            return this;
        } else {
            StringBuilder sb = new StringBuilder("Class already exists: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public RealmObjectSchema setNullable(String str, boolean z) {
        setRequired(str, !z);
        return this;
    }

    public RealmObjectSchema setRequired(String str, boolean z) {
        long columnKey = this.table.getColumnKey(str);
        boolean isRequired = isRequired(str);
        RealmFieldType columnType = this.table.getColumnType(columnKey);
        if (columnType == RealmFieldType.OBJECT) {
            StringBuilder sb = new StringBuilder("Cannot modify the required state for RealmObject references: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (columnType == RealmFieldType.LIST) {
            StringBuilder sb2 = new StringBuilder("Cannot modify the required state for RealmList references: ");
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        } else if (z && isRequired) {
            StringBuilder sb3 = new StringBuilder("Field is already required: ");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        } else if (z || isRequired) {
            if (z) {
                try {
                    this.table.convertColumnToNotNullable(columnKey);
                } catch (IllegalArgumentException e) {
                    if (e.getMessage().contains("Attempted to insert null into non-nullable column")) {
                        throw new IllegalStateException(String.format("The primary key field '%s' has 'null' values stored.", str));
                    }
                    throw e;
                }
            } else {
                this.table.convertColumnToNullable(columnKey);
            }
            return this;
        } else {
            StringBuilder sb4 = new StringBuilder("Field is already nullable: ");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    public RealmObjectSchema transform(RealmObjectSchema$Function realmObjectSchema$Function) {
        if (realmObjectSchema$Function != null) {
            OsResults createSnapshot = OsResults.createFromQuery(this.realm.sharedRealm, this.table.where()).createSnapshot();
            long size = createSnapshot.size();
            if (size <= 2147483647L) {
                int size2 = (int) createSnapshot.size();
                for (int i = 0; i < size2; i++) {
                    DynamicRealmObject dynamicRealmObject = new DynamicRealmObject(this.realm, new CheckedRow(createSnapshot.getUncheckedRow(i)));
                    if (dynamicRealmObject.isValid()) {
                        realmObjectSchema$Function.apply(dynamicRealmObject);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder("Too many results to iterate: ");
                sb.append(size);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        return this;
    }
}
