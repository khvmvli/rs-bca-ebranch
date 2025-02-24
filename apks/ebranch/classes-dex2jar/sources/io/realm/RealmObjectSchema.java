package io.realm;

import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectStore;
import io.realm.internal.Table;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes-dex2jar.jar:io/realm/RealmObjectSchema.class */
public abstract class RealmObjectSchema {
    static final Map<Class<?>, FieldMetaData> SUPPORTED_DICTIONARY_SIMPLE_FIELDS;
    static final Map<Class<?>, FieldMetaData> SUPPORTED_LINKED_FIELDS;
    static final Map<Class<?>, FieldMetaData> SUPPORTED_LIST_SIMPLE_FIELDS;
    static final Map<Class<?>, FieldMetaData> SUPPORTED_SET_SIMPLE_FIELDS;
    final ColumnInfo columnInfo;
    final BaseRealm realm;
    final RealmSchema schema;
    final Table table;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(String.class, new FieldMetaData(RealmFieldType.STRING, RealmFieldType.STRING_LIST, true));
        hashMap.put(Short.TYPE, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, false));
        hashMap.put(Short.class, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, true));
        hashMap.put(Integer.TYPE, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, false));
        hashMap.put(Integer.class, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, true));
        hashMap.put(Long.TYPE, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, false));
        hashMap.put(Long.class, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, true));
        hashMap.put(Float.TYPE, new FieldMetaData(RealmFieldType.FLOAT, RealmFieldType.FLOAT_LIST, false));
        hashMap.put(Float.class, new FieldMetaData(RealmFieldType.FLOAT, RealmFieldType.FLOAT_LIST, true));
        hashMap.put(Double.TYPE, new FieldMetaData(RealmFieldType.DOUBLE, RealmFieldType.DOUBLE_LIST, false));
        hashMap.put(Double.class, new FieldMetaData(RealmFieldType.DOUBLE, RealmFieldType.DOUBLE_LIST, true));
        hashMap.put(Boolean.TYPE, new FieldMetaData(RealmFieldType.BOOLEAN, RealmFieldType.BOOLEAN_LIST, false));
        hashMap.put(Boolean.class, new FieldMetaData(RealmFieldType.BOOLEAN, RealmFieldType.BOOLEAN_LIST, true));
        hashMap.put(Byte.TYPE, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, false));
        hashMap.put(Byte.class, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_LIST, true));
        hashMap.put(byte[].class, new FieldMetaData(RealmFieldType.BINARY, RealmFieldType.BINARY_LIST, true));
        hashMap.put(Date.class, new FieldMetaData(RealmFieldType.DATE, RealmFieldType.DATE_LIST, true));
        hashMap.put(ObjectId.class, new FieldMetaData(RealmFieldType.OBJECT_ID, RealmFieldType.OBJECT_ID_LIST, true));
        hashMap.put(Decimal128.class, new FieldMetaData(RealmFieldType.DECIMAL128, RealmFieldType.DECIMAL128_LIST, true));
        hashMap.put(UUID.class, new FieldMetaData(RealmFieldType.UUID, RealmFieldType.UUID_LIST, true));
        hashMap.put(RealmAny.class, new FieldMetaData(RealmFieldType.MIXED, RealmFieldType.MIXED_LIST, true));
        SUPPORTED_LIST_SIMPLE_FIELDS = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(String.class, new FieldMetaData(RealmFieldType.STRING, RealmFieldType.STRING_TO_STRING_MAP, true));
        hashMap2.put(Short.TYPE, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.STRING_TO_INTEGER_MAP, false));
        hashMap2.put(Short.class, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.STRING_TO_INTEGER_MAP, true));
        hashMap2.put(Integer.TYPE, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.STRING_TO_INTEGER_MAP, false));
        hashMap2.put(Integer.class, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.STRING_TO_INTEGER_MAP, true));
        hashMap2.put(Long.TYPE, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.STRING_TO_INTEGER_MAP, false));
        hashMap2.put(Long.class, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.STRING_TO_INTEGER_MAP, true));
        hashMap2.put(Float.TYPE, new FieldMetaData(RealmFieldType.FLOAT, RealmFieldType.STRING_TO_FLOAT_MAP, false));
        hashMap2.put(Float.class, new FieldMetaData(RealmFieldType.FLOAT, RealmFieldType.STRING_TO_FLOAT_MAP, true));
        hashMap2.put(Double.TYPE, new FieldMetaData(RealmFieldType.DOUBLE, RealmFieldType.STRING_TO_DOUBLE_MAP, false));
        hashMap2.put(Double.class, new FieldMetaData(RealmFieldType.DOUBLE, RealmFieldType.STRING_TO_DOUBLE_MAP, true));
        hashMap2.put(Boolean.TYPE, new FieldMetaData(RealmFieldType.BOOLEAN, RealmFieldType.STRING_TO_BOOLEAN_MAP, false));
        hashMap2.put(Boolean.class, new FieldMetaData(RealmFieldType.BOOLEAN, RealmFieldType.STRING_TO_BOOLEAN_MAP, true));
        hashMap2.put(Byte.TYPE, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.STRING_TO_INTEGER_MAP, false));
        hashMap2.put(Byte.class, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.STRING_TO_INTEGER_MAP, true));
        hashMap2.put(byte[].class, new FieldMetaData(RealmFieldType.BINARY, RealmFieldType.STRING_TO_BINARY_MAP, true));
        hashMap2.put(Date.class, new FieldMetaData(RealmFieldType.DATE, RealmFieldType.STRING_TO_DATE_MAP, true));
        hashMap2.put(ObjectId.class, new FieldMetaData(RealmFieldType.OBJECT_ID, RealmFieldType.STRING_TO_OBJECT_ID_MAP, true));
        hashMap2.put(Decimal128.class, new FieldMetaData(RealmFieldType.DECIMAL128, RealmFieldType.STRING_TO_DECIMAL128_MAP, true));
        hashMap2.put(UUID.class, new FieldMetaData(RealmFieldType.UUID, RealmFieldType.STRING_TO_UUID_MAP, true));
        hashMap2.put(RealmAny.class, new FieldMetaData(RealmFieldType.MIXED, RealmFieldType.STRING_TO_MIXED_MAP, true));
        SUPPORTED_DICTIONARY_SIMPLE_FIELDS = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(String.class, new FieldMetaData(RealmFieldType.STRING, RealmFieldType.STRING_SET, true));
        hashMap3.put(Short.TYPE, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_SET, false));
        hashMap3.put(Short.class, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_SET, true));
        hashMap3.put(Integer.TYPE, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_SET, false));
        hashMap3.put(Integer.class, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_SET, true));
        hashMap3.put(Long.TYPE, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_SET, false));
        hashMap3.put(Long.class, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_SET, true));
        hashMap3.put(Float.TYPE, new FieldMetaData(RealmFieldType.FLOAT, RealmFieldType.FLOAT_SET, false));
        hashMap3.put(Float.class, new FieldMetaData(RealmFieldType.FLOAT, RealmFieldType.FLOAT_SET, true));
        hashMap3.put(Double.TYPE, new FieldMetaData(RealmFieldType.DOUBLE, RealmFieldType.DOUBLE_SET, false));
        hashMap3.put(Double.class, new FieldMetaData(RealmFieldType.DOUBLE, RealmFieldType.DOUBLE_SET, true));
        hashMap3.put(Boolean.TYPE, new FieldMetaData(RealmFieldType.BOOLEAN, RealmFieldType.BOOLEAN_SET, false));
        hashMap3.put(Boolean.class, new FieldMetaData(RealmFieldType.BOOLEAN, RealmFieldType.BOOLEAN_SET, true));
        hashMap3.put(Byte.TYPE, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_SET, false));
        hashMap3.put(Byte.class, new FieldMetaData(RealmFieldType.INTEGER, RealmFieldType.INTEGER_SET, true));
        hashMap3.put(byte[].class, new FieldMetaData(RealmFieldType.BINARY, RealmFieldType.BINARY_SET, true));
        hashMap3.put(Date.class, new FieldMetaData(RealmFieldType.DATE, RealmFieldType.DATE_SET, true));
        hashMap3.put(ObjectId.class, new FieldMetaData(RealmFieldType.OBJECT_ID, RealmFieldType.OBJECT_ID_SET, true));
        hashMap3.put(Decimal128.class, new FieldMetaData(RealmFieldType.DECIMAL128, RealmFieldType.DECIMAL128_SET, true));
        hashMap3.put(UUID.class, new FieldMetaData(RealmFieldType.UUID, RealmFieldType.UUID_SET, true));
        hashMap3.put(RealmAny.class, new FieldMetaData(RealmFieldType.MIXED, RealmFieldType.MIXED_SET, true));
        SUPPORTED_SET_SIMPLE_FIELDS = Collections.unmodifiableMap(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(RealmObject.class, new FieldMetaData(RealmFieldType.OBJECT, (RealmFieldType) null, false));
        hashMap4.put(RealmList.class, new FieldMetaData(RealmFieldType.LIST, (RealmFieldType) null, false));
        hashMap4.put(RealmDictionary.class, new FieldMetaData(RealmFieldType.STRING_TO_LINK_MAP, (RealmFieldType) null, false));
        hashMap4.put(RealmSet.class, new FieldMetaData(RealmFieldType.LINK_SET, (RealmFieldType) null, false));
        SUPPORTED_LINKED_FIELDS = Collections.unmodifiableMap(hashMap4);
    }

    RealmObjectSchema(BaseRealm baseRealm, RealmSchema realmSchema, Table table, ColumnInfo columnInfo) {
        this.schema = realmSchema;
        this.realm = baseRealm;
        this.table = table;
        this.columnInfo = columnInfo;
    }

    public static void checkLegalName(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Field name can not be null or empty");
        } else if (str.contains(".")) {
            throw new IllegalArgumentException("Field name can not contain '.'");
        } else if (str.length() > 63) {
            throw new IllegalArgumentException("Field name is currently limited to max 63 characters.");
        }
    }

    RealmObjectSchema add(String str, RealmFieldType realmFieldType, RealmObjectSchema realmObjectSchema) {
        this.table.addColumnLink(realmFieldType, str, this.realm.getSharedRealm().getTable(Table.getTableNameForClass(realmObjectSchema.getClassName())));
        return this;
    }

    RealmObjectSchema add(String str, RealmFieldType realmFieldType, boolean z, boolean z2, boolean z3) {
        long addColumn = this.table.addColumn(realmFieldType, str, !z3);
        if (z2) {
            this.table.addSearchIndex(addColumn);
        }
        if (z) {
            OsObjectStore.setPrimaryKeyForObject(this.realm.sharedRealm, getClassName(), str);
        }
        return this;
    }

    public abstract RealmObjectSchema addField(String str, Class<?> cls, FieldAttribute... fieldAttributeArr);

    public abstract RealmObjectSchema addIndex(String str);

    public abstract RealmObjectSchema addPrimaryKey(String str);

    public abstract RealmObjectSchema addRealmDictionaryField(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema addRealmDictionaryField(String str, Class<?> cls);

    public abstract RealmObjectSchema addRealmListField(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema addRealmListField(String str, Class<?> cls);

    public abstract RealmObjectSchema addRealmObjectField(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema addRealmSetField(String str, RealmObjectSchema realmObjectSchema);

    public abstract RealmObjectSchema addRealmSetField(String str, Class<?> cls);

    void checkFieldExists(String str) {
        if (this.table.getColumnKey(str) == -1) {
            StringBuilder sb = new StringBuilder("Field name doesn't exist on object '");
            sb.append(getClassName());
            sb.append("': ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public long getAndCheckFieldColumnKey(String str) {
        long columnKey = this.columnInfo.getColumnKey(str);
        if (columnKey >= 0) {
            return columnKey;
        }
        StringBuilder sb = new StringBuilder("Field does not exist: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public String getClassName() {
        return this.table.getClassName();
    }

    public long getColumnKey(String str) {
        long columnKey = this.table.getColumnKey(str);
        if (columnKey != -1) {
            return columnKey;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Field name '%s' does not exist on schema for '%s'", str, getClassName()));
    }

    long getFieldColumnKey(String str) {
        return this.columnInfo.getColumnKey(str);
    }

    public Set<String> getFieldNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet((int) this.table.getColumnCount());
        for (String str : this.table.getColumnNames()) {
            linkedHashSet.add(str);
        }
        return linkedHashSet;
    }

    public RealmFieldType getFieldType(String str) {
        return this.table.getColumnType(getColumnKey(str));
    }

    public String getPrimaryKey() {
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, getClassName());
        if (primaryKeyForObject != null) {
            return primaryKeyForObject;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClassName());
        sb.append(" doesn't have a primary key.");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String getPropertyClassName(String str);

    public Table getTable() {
        return this.table;
    }

    public boolean hasField(String str) {
        return this.table.getColumnKey(str) != -1;
    }

    public boolean hasIndex(String str) {
        checkLegalName(str);
        checkFieldExists(str);
        Table table = this.table;
        return table.hasSearchIndex(table.getColumnKey(str));
    }

    public boolean hasPrimaryKey() {
        return OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, getClassName()) != null;
    }

    public boolean isEmbedded() {
        return this.table.isEmbedded();
    }

    public boolean isNullable(String str) {
        return this.table.isColumnNullable(getColumnKey(str));
    }

    public boolean isPrimaryKey(String str) {
        checkFieldExists(str);
        return str.equals(OsObjectStore.getPrimaryKeyForObject(this.realm.sharedRealm, getClassName()));
    }

    public boolean isPropertyAcceptableForEmbeddedObject(RealmFieldType realmFieldType) {
        return realmFieldType == RealmFieldType.OBJECT || realmFieldType == RealmFieldType.LIST;
    }

    public boolean isRequired(String str) {
        return !this.table.isColumnNullable(getColumnKey(str));
    }

    public abstract RealmObjectSchema removeField(String str);

    public abstract RealmObjectSchema removeIndex(String str);

    public abstract RealmObjectSchema removePrimaryKey();

    public abstract RealmObjectSchema renameField(String str, String str2);

    public abstract RealmObjectSchema setClassName(String str);

    public void setEmbedded(boolean z) {
        if (hasPrimaryKey()) {
            StringBuilder sb = new StringBuilder("Embedded classes cannot have primary keys. This class has a primary key defined so cannot be marked as embedded: ");
            sb.append(getClassName());
            throw new IllegalStateException(sb.toString());
        } else if (!this.table.setEmbedded(z) && z) {
            throw new IllegalStateException("The class could not be marked as embedded as some objects of this type break some of the Embedded Objects invariants. In order to convert all objects to be embedded, they must have one and exactly one parent objectpointing to them.");
        }
    }

    public abstract RealmObjectSchema setNullable(String str, boolean z);

    public abstract RealmObjectSchema setRequired(String str, boolean z);

    public abstract RealmObjectSchema transform(Function function);
}
