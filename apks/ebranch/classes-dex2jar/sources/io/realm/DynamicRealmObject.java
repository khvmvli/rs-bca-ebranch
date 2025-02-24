package io.realm;

import com.facebook.stetho.dumpapp.Framer;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsSet;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.android.JsonUtils;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes-dex2jar.jar:io/realm/DynamicRealmObject.class */
public class DynamicRealmObject extends RealmObject implements RealmObjectProxy {
    static final String MSG_LINK_QUERY_NOT_SUPPORTED;
    private final ProxyState<DynamicRealmObject> proxyState;

    public DynamicRealmObject(BaseRealm baseRealm, Row row) {
        ProxyState<DynamicRealmObject> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        proxyState.setRealm$realm(baseRealm);
        proxyState.setRow$realm(row);
        proxyState.setConstructionFinished();
    }

    public DynamicRealmObject(RealmModel realmModel) {
        ProxyState<DynamicRealmObject> proxyState = new ProxyState<>(this);
        this.proxyState = proxyState;
        if (realmModel == null) {
            throw new IllegalArgumentException("A non-null object must be provided.");
        } else if (realmModel instanceof DynamicRealmObject) {
            StringBuilder sb = new StringBuilder("The object is already a DynamicRealmObject: ");
            sb.append(realmModel);
            throw new IllegalArgumentException(sb.toString());
        } else if (!RealmObject.isManaged(realmModel)) {
            throw new IllegalArgumentException("An object managed by Realm must be provided. This is an unmanaged object.");
        } else if (RealmObject.isValid(realmModel)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmModel;
            Row row$realm = realmObjectProxy.realmGet$proxyState().getRow$realm();
            proxyState.setRealm$realm(realmObjectProxy.realmGet$proxyState().getRealm$realm());
            proxyState.setRow$realm(((UncheckedRow) row$realm).convertToChecked());
            proxyState.setConstructionFinished();
        } else {
            throw new IllegalArgumentException("A valid object managed by Realm must be provided. This object was deleted.");
        }
    }

    private void checkFieldType(String str, long j, RealmFieldType realmFieldType) {
        RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(j);
        if (columnType != realmFieldType) {
            String str2 = "";
            String str3 = (realmFieldType == RealmFieldType.INTEGER || realmFieldType == RealmFieldType.OBJECT) ? "n" : "";
            if (columnType == RealmFieldType.INTEGER || columnType == RealmFieldType.OBJECT) {
                str2 = "n";
            }
            throw new IllegalArgumentException(String.format(Locale.US, "'%s' is not a%s '%s', but a%s '%s'.", str, str3, realmFieldType, str2, columnType));
        }
    }

    private void checkIsPrimaryKey(String str) {
        RealmObjectSchema schemaForClass = this.proxyState.getRealm$realm().getSchema().getSchemaForClass(getType());
        if (schemaForClass.hasPrimaryKey() && schemaForClass.getPrimaryKey().equals(str)) {
            throw new IllegalArgumentException(String.format(Locale.US, "Primary key field '%s' cannot be changed after object was created.", str));
        }
    }

    private <E> ManagedListOperator<E> getOperator(BaseRealm baseRealm, OsList osList, RealmFieldType realmFieldType, Class<E> cls) {
        if (realmFieldType == RealmFieldType.STRING_LIST) {
            return new StringListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.INTEGER_LIST) {
            return new LongListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.BOOLEAN_LIST) {
            return new BooleanListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.BINARY_LIST) {
            return new BinaryListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.DOUBLE_LIST) {
            return new DoubleListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.FLOAT_LIST) {
            return new FloatListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.DATE_LIST) {
            return new DateListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.DECIMAL128_LIST) {
            return new Decimal128ListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.OBJECT_ID_LIST) {
            return new ObjectIdListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.UUID_LIST) {
            return new UUIDListOperator(baseRealm, osList, cls);
        }
        if (realmFieldType == RealmFieldType.MIXED_LIST) {
            return new RealmAnyListOperator(baseRealm, osList, cls);
        }
        StringBuilder sb = new StringBuilder("Unexpected list type: ");
        sb.append(realmFieldType.name());
        throw new IllegalArgumentException(sb.toString());
    }

    private RealmAny getRealmAny(long j) {
        return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.proxyState.getRealm$realm(), this.proxyState.getRow$realm().getNativeRealmAny(j)));
    }

    private <E> int primitiveTypeToCoreType(Class<E> cls) {
        if (cls.equals(Integer.class) || cls.equals(Long.class) || cls.equals(Short.class) || cls.equals(Byte.class)) {
            return 0;
        }
        if (cls.equals(Boolean.class)) {
            return 1;
        }
        if (cls.equals(String.class)) {
            return 2;
        }
        if (cls.equals(byte[].class)) {
            return 4;
        }
        if (cls.equals(Date.class)) {
            return 8;
        }
        if (cls.equals(Float.class)) {
            return 9;
        }
        if (cls.equals(Double.class)) {
            return 10;
        }
        if (cls.equals(Decimal128.class)) {
            return 11;
        }
        if (cls.equals(ObjectId.class)) {
            return 15;
        }
        if (cls.equals(UUID.class)) {
            return 17;
        }
        if (cls.equals(RealmAny.class)) {
            return 6;
        }
        StringBuilder sb = new StringBuilder("Unsupported element type. Only primitive types supported. Yours was: ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    private <E> RealmFieldType primitiveTypeToRealmFieldType(CollectionType collectionType, Class<E> cls) {
        int i;
        int primitiveTypeToCoreType = primitiveTypeToCoreType(cls);
        int i2 = 1.$SwitchMap$io$realm$DynamicRealmObject$CollectionType[collectionType.ordinal()];
        if (i2 == 1) {
            i = primitiveTypeToCoreType + Property.TYPE_SET;
        } else if (i2 == 2) {
            i = primitiveTypeToCoreType + Property.TYPE_DICTIONARY;
        } else if (i2 == 3) {
            i = primitiveTypeToCoreType + Property.TYPE_ARRAY;
        } else {
            StringBuilder sb = new StringBuilder("Type not supported: ");
            sb.append(collectionType);
            throw new IllegalArgumentException(sb.toString());
        }
        return RealmFieldType.fromNativeValue(i);
    }

    private void setModelDictionary(String str, RealmDictionary<DynamicRealmObject> realmDictionary) {
        boolean z;
        OsMap modelMap = this.proxyState.getRow$realm().getModelMap(this.proxyState.getRow$realm().getColumnKey(str));
        Table targetTable = modelMap.getTargetTable();
        String className = targetTable.getClassName();
        if (!realmDictionary.isManaged()) {
            z = false;
        } else {
            String valueClassName = realmDictionary.getValueClassName() != null ? realmDictionary.getValueClassName() : this.proxyState.getRealm$realm().getSchema().getTable(realmDictionary.getValueClass()).getClassName();
            if (className.equals(valueClassName)) {
                z = true;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "The elements in the dictionary are not the proper type. Was %s expected %s.", valueClassName, className));
            }
        }
        RealmDictionary realmDictionary2 = new RealmDictionary();
        for (Map.Entry entry : realmDictionary.entrySet()) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) entry.getValue();
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != this.proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element in 'dictionary' must belong to the same Realm instance.");
            } else if (z || targetTable.hasSameSchema(realmObjectProxy.realmGet$proxyState().getRow$realm().getTable())) {
                realmDictionary2.put((String) entry.getKey(), Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Element with key %s is not the proper type. Was '%s' expected '%s'.", entry.getKey(), realmObjectProxy.realmGet$proxyState().getRow$realm().getTable().getClassName(), className));
            }
        }
        modelMap.clear();
        for (Map.Entry entry2 : realmDictionary2.entrySet()) {
            modelMap.putRow(entry2.getKey(), ((Long) entry2.getValue()).longValue());
        }
    }

    private void setModelList(String str, RealmList<DynamicRealmObject> realmList) {
        boolean z;
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.proxyState.getRow$realm().getColumnKey(str));
        Table targetTable = modelList.getTargetTable();
        String className = targetTable.getClassName();
        if (realmList.className == null && realmList.clazz == null) {
            z = false;
        } else {
            String className2 = realmList.className != null ? realmList.className : this.proxyState.getRealm$realm().getSchema().getTable(realmList.clazz).getClassName();
            if (className.equals(className2)) {
                z = true;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "The elements in the list are not the proper type. Was %s expected %s.", className2, className));
            }
        }
        int size = realmList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            DynamicRealmObject dynamicRealmObject = realmList.get(i);
            if (dynamicRealmObject.realmGet$proxyState().getRealm$realm() != this.proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element in 'list' must belong to the same Realm instance.");
            } else if (z || targetTable.hasSameSchema(dynamicRealmObject.realmGet$proxyState().getRow$realm().getTable())) {
                jArr[i] = dynamicRealmObject.realmGet$proxyState().getRow$realm().getObjectKey();
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Element at index %d is not the proper type. Was '%s' expected '%s'.", Integer.valueOf(i), dynamicRealmObject.realmGet$proxyState().getRow$realm().getTable().getClassName(), className));
            }
        }
        modelList.removeAll();
        for (int i2 = 0; i2 < size; i2++) {
            modelList.addRow(jArr[i2]);
        }
    }

    private void setModelSet(String str, RealmSet<DynamicRealmObject> realmSet) {
        boolean z;
        OsSet modelSet = this.proxyState.getRow$realm().getModelSet(this.proxyState.getRow$realm().getColumnKey(str));
        Table targetTable = modelSet.getTargetTable();
        String className = targetTable.getClassName();
        if (!realmSet.isManaged()) {
            z = false;
        } else {
            String valueClassName = realmSet.getValueClassName() != null ? realmSet.getValueClassName() : this.proxyState.getRealm$realm().getSchema().getTable(realmSet.getValueClass()).getClassName();
            if (className.equals(valueClassName)) {
                z = true;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "The elements in the set are not the proper type. Was %s expected %s.", valueClassName, className));
            }
        }
        RealmSet realmSet2 = new RealmSet();
        Iterator it = realmSet.iterator();
        while (it.hasNext()) {
            DynamicRealmObject dynamicRealmObject = (DynamicRealmObject) it.next();
            if (dynamicRealmObject.realmGet$proxyState().getRealm$realm() != this.proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element in 'set' must belong to the same Realm instance.");
            } else if (z || targetTable.hasSameSchema(dynamicRealmObject.realmGet$proxyState().getRow$realm().getTable())) {
                realmSet2.add(Long.valueOf(dynamicRealmObject.realmGet$proxyState().getRow$realm().getObjectKey()));
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Set contains an element with not the proper type. Was '%s' expected '%s'.", dynamicRealmObject.realmGet$proxyState().getRow$realm().getTable().getClassName(), className));
            }
        }
        modelSet.clear();
        Iterator it2 = realmSet2.iterator();
        while (it2.hasNext()) {
            modelSet.addRow(((Long) it2.next()).longValue());
        }
    }

    private void setValue(String str, Object obj) {
        Class<?> cls = obj.getClass();
        if (cls == Boolean.class) {
            setBoolean(str, ((Boolean) obj).booleanValue());
        } else if (cls == Short.class) {
            setShort(str, ((Short) obj).shortValue());
        } else if (cls == Integer.class) {
            setInt(str, ((Integer) obj).intValue());
        } else if (cls == Long.class) {
            setLong(str, ((Long) obj).longValue());
        } else if (cls == Byte.class) {
            setByte(str, ((Byte) obj).byteValue());
        } else if (cls == Float.class) {
            setFloat(str, ((Float) obj).floatValue());
        } else if (cls == Double.class) {
            setDouble(str, ((Double) obj).doubleValue());
        } else if (cls == String.class) {
            setString(str, (String) obj);
        } else if (obj instanceof Date) {
            setDate(str, (Date) obj);
        } else if (obj instanceof byte[]) {
            setBlob(str, (byte[]) obj);
        } else if (cls == DynamicRealmObject.class) {
            setObject(str, (DynamicRealmObject) obj);
        } else if (cls == RealmList.class) {
            setList(str, (RealmList) obj);
        } else if (cls == Decimal128.class) {
            setDecimal128(str, (Decimal128) obj);
        } else if (cls == ObjectId.class) {
            setObjectId(str, (ObjectId) obj);
        } else if (cls == UUID.class) {
            setUUID(str, (UUID) obj);
        } else if (cls == RealmAny.class) {
            setRealmAny(str, (RealmAny) obj);
        } else {
            StringBuilder sb = new StringBuilder("Value is of an type not supported: ");
            sb.append(obj.getClass());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private <E> void setValueDictionary(String str, RealmDictionary<E> realmDictionary, RealmFieldType realmFieldType) {
        Class cls;
        OsMap valueMap = this.proxyState.getRow$realm().getValueMap(this.proxyState.getRow$realm().getColumnKey(str), realmFieldType);
        switch (1.$SwitchMap$io$realm$RealmFieldType[realmFieldType.ordinal()]) {
            case 14:
                cls = Long.class;
                break;
            case 15:
                cls = Boolean.class;
                break;
            case 16:
                cls = String.class;
                break;
            case 17:
                cls = byte[].class;
                break;
            case 18:
                cls = Date.class;
                break;
            case 19:
                cls = Float.class;
                break;
            case 20:
                cls = Double.class;
                break;
            case 21:
                cls = Decimal128.class;
                break;
            case 22:
                cls = ObjectId.class;
                break;
            case 23:
                cls = UUID.class;
                break;
            case 24:
                cls = RealmAny.class;
                break;
            default:
                StringBuilder sb = new StringBuilder("Unsupported type: ");
                sb.append(realmFieldType);
                throw new IllegalArgumentException(sb.toString());
        }
        RealmDictionary realmDictionary2 = new RealmDictionary(this.proxyState.getRealm$realm(), valueMap, cls);
        RealmDictionary realmDictionary3 = new RealmDictionary();
        for (Map.Entry entry : realmDictionary.entrySet()) {
            realmDictionary3.put((String) entry.getKey(), entry.getValue());
        }
        valueMap.clear();
        for (Map.Entry entry2 : realmDictionary3.entrySet()) {
            realmDictionary2.put((String) entry2.getKey(), entry2.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <E> void setValueList(String str, RealmList<E> realmList, RealmFieldType realmFieldType) {
        Object obj;
        OsList valueList = this.proxyState.getRow$realm().getValueList(this.proxyState.getRow$realm().getColumnKey(str), realmFieldType);
        switch (1.$SwitchMap$io$realm$RealmFieldType[realmFieldType.ordinal()]) {
            case 39:
                obj = Long.class;
                break;
            case 40:
                obj = Boolean.class;
                break;
            case 41:
                obj = String.class;
                break;
            case 42:
                obj = byte[].class;
                break;
            case 43:
                obj = Date.class;
                break;
            case 44:
                obj = Float.class;
                break;
            case 45:
                obj = Double.class;
                break;
            case 46:
                obj = Decimal128.class;
                break;
            case 47:
                obj = ObjectId.class;
                break;
            case 48:
                obj = UUID.class;
                break;
            case 49:
                obj = RealmAny.class;
                break;
            default:
                StringBuilder sb = new StringBuilder("Unsupported type: ");
                sb.append(realmFieldType);
                throw new IllegalArgumentException(sb.toString());
        }
        ManagedListOperator operator = getOperator(this.proxyState.getRealm$realm(), valueList, realmFieldType, obj);
        if (!realmList.isManaged() || valueList.size() != ((long) realmList.size())) {
            valueList.removeAll();
            Iterator<E> it = realmList.iterator();
            while (it.hasNext()) {
                operator.append(it.next());
            }
            return;
        }
        int size = realmList.size();
        Iterator<E> it2 = realmList.iterator();
        for (int i = 0; i < size; i++) {
            operator.set(i, it2.next());
        }
    }

    private <E> void setValueSet(String str, RealmSet<E> realmSet, RealmFieldType realmFieldType) {
        Class cls;
        OsSet valueSet = this.proxyState.getRow$realm().getValueSet(this.proxyState.getRow$realm().getColumnKey(str), realmFieldType);
        switch (1.$SwitchMap$io$realm$RealmFieldType[realmFieldType.ordinal()]) {
            case 26:
                cls = Number.class;
                break;
            case 27:
                cls = Boolean.class;
                break;
            case 28:
                cls = String.class;
                break;
            case 29:
                cls = byte[].class;
                break;
            case 30:
                cls = Date.class;
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                cls = Float.class;
                break;
            case 32:
                cls = Double.class;
                break;
            case Framer.ENTER_FRAME_PREFIX:
                cls = Decimal128.class;
                break;
            case 34:
                cls = ObjectId.class;
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                cls = UUID.class;
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
            default:
                StringBuilder sb = new StringBuilder("Unsupported type: ");
                sb.append(realmFieldType);
                throw new IllegalArgumentException(sb.toString());
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                cls = RealmAny.class;
                break;
        }
        RealmSet realmSet2 = new RealmSet(this.proxyState.getRealm$realm(), valueSet, cls);
        RealmSet realmSet3 = new RealmSet();
        realmSet3.addAll(realmSet);
        valueSet.clear();
        realmSet2.addAll(realmSet3);
    }

    public boolean equals(Object obj) {
        this.proxyState.getRealm$realm().checkIfValid();
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DynamicRealmObject dynamicRealmObject = (DynamicRealmObject) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = dynamicRealmObject.proxyState.getRealm$realm().getPath();
        if (path != null) {
            if (!path.equals(path2)) {
                return false;
            }
        } else if (path2 != null) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = dynamicRealmObject.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        if (this.proxyState.getRow$realm().getObjectKey() != dynamicRealmObject.proxyState.getRow$realm().getObjectKey()) {
            z = false;
        }
        return z;
    }

    public <E> E get(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (this.proxyState.getRow$realm().isNull(columnKey)) {
            return null;
        }
        RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(columnKey);
        switch (1.$SwitchMap$io$realm$RealmFieldType[columnType.ordinal()]) {
            case 1:
                return (E) Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(columnKey));
            case 2:
                return (E) Long.valueOf(this.proxyState.getRow$realm().getLong(columnKey));
            case 3:
                return (E) Float.valueOf(this.proxyState.getRow$realm().getFloat(columnKey));
            case 4:
                return (E) Double.valueOf(this.proxyState.getRow$realm().getDouble(columnKey));
            case 5:
                return (E) this.proxyState.getRow$realm().getString(columnKey);
            case 6:
                return (E) this.proxyState.getRow$realm().getBinaryByteArray(columnKey);
            case 7:
                return (E) this.proxyState.getRow$realm().getDate(columnKey);
            case 8:
                return (E) this.proxyState.getRow$realm().getDecimal128(columnKey);
            case 9:
                return (E) this.proxyState.getRow$realm().getObjectId(columnKey);
            case 10:
                return (E) getRealmAny(columnKey);
            case 11:
                return (E) this.proxyState.getRow$realm().getUUID(columnKey);
            case 12:
                return (E) getObject(str);
            case 13:
                return (E) getList(str);
            case 14:
                return (E) getDictionary(str, Integer.class);
            case 15:
                return (E) getDictionary(str, Boolean.class);
            case 16:
                return (E) getDictionary(str, String.class);
            case 17:
                return (E) getDictionary(str, byte[].class);
            case 18:
                return (E) getDictionary(str, Date.class);
            case 19:
                return (E) getDictionary(str, Float.class);
            case 20:
                return (E) getDictionary(str, Double.class);
            case 21:
                return (E) getDictionary(str, Decimal128.class);
            case 22:
                return (E) getDictionary(str, ObjectId.class);
            case 23:
                return (E) getDictionary(str, UUID.class);
            case 24:
                return (E) getDictionary(str, RealmAny.class);
            case 25:
                return (E) getDictionary(str);
            case 26:
                return (E) getRealmSet(str, Integer.class);
            case 27:
                return (E) getRealmSet(str, Boolean.class);
            case 28:
                return (E) getRealmSet(str, String.class);
            case 29:
                return (E) getRealmSet(str, byte[].class);
            case 30:
                return (E) getRealmSet(str, Date.class);
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                return (E) getRealmSet(str, Float.class);
            case 32:
                return (E) getRealmSet(str, Double.class);
            case Framer.ENTER_FRAME_PREFIX:
                return (E) getRealmSet(str, Decimal128.class);
            case 34:
                return (E) getRealmSet(str, ObjectId.class);
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                return (E) getRealmSet(str, UUID.class);
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                return (E) getRealmSet(str);
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                return (E) getRealmSet(str, RealmAny.class);
            default:
                StringBuilder sb = new StringBuilder("Field type not supported: ");
                sb.append(columnType);
                throw new IllegalStateException(sb.toString());
        }
    }

    public byte[] getBlob(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            return this.proxyState.getRow$realm().getBinaryByteArray(columnKey);
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnKey, RealmFieldType.BINARY);
            throw e;
        }
    }

    public boolean getBoolean(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            return this.proxyState.getRow$realm().getBoolean(columnKey);
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnKey, RealmFieldType.BOOLEAN);
            throw e;
        }
    }

    public byte getByte(String str) {
        return (byte) ((int) getLong(str));
    }

    public Date getDate(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        checkFieldType(str, columnKey, RealmFieldType.DATE);
        if (this.proxyState.getRow$realm().isNull(columnKey)) {
            return null;
        }
        return this.proxyState.getRow$realm().getDate(columnKey);
    }

    public Decimal128 getDecimal128(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        checkFieldType(str, columnKey, RealmFieldType.DECIMAL128);
        if (this.proxyState.getRow$realm().isNull(columnKey)) {
            return null;
        }
        return this.proxyState.getRow$realm().getDecimal128(columnKey);
    }

    public RealmDictionary<DynamicRealmObject> getDictionary(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            OsMap modelMap = this.proxyState.getRow$realm().getModelMap(columnKey);
            return new RealmDictionary<>(this.proxyState.getRealm$realm(), modelMap, modelMap.getTargetTable().getClassName());
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnKey, RealmFieldType.STRING_TO_LINK_MAP);
            throw e;
        }
    }

    public <E> RealmDictionary<E> getDictionary(String str, Class<E> cls) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (cls != null) {
            long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
            RealmFieldType primitiveTypeToRealmFieldType = primitiveTypeToRealmFieldType(CollectionType.DICTIONARY, cls);
            try {
                return new RealmDictionary<>(this.proxyState.getRealm$realm(), this.proxyState.getRow$realm().getValueMap(columnKey, primitiveTypeToRealmFieldType), cls);
            } catch (IllegalArgumentException e) {
                checkFieldType(str, columnKey, primitiveTypeToRealmFieldType);
                throw e;
            }
        } else {
            throw new IllegalArgumentException("Non-null 'primitiveType' required.");
        }
    }

    public double getDouble(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            return this.proxyState.getRow$realm().getDouble(columnKey);
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnKey, RealmFieldType.DOUBLE);
            throw e;
        }
    }

    public DynamicRealm getDynamicRealm() {
        BaseRealm realm$realm = realmGet$proxyState().getRealm$realm();
        realm$realm.checkIfValid();
        if (isValid()) {
            return (DynamicRealm) realm$realm;
        }
        throw new IllegalStateException("the object is already deleted.");
    }

    public String[] getFieldNames() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getColumnNames();
    }

    public RealmFieldType getFieldType(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getColumnType(this.proxyState.getRow$realm().getColumnKey(str));
    }

    public float getFloat(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            return this.proxyState.getRow$realm().getFloat(columnKey);
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnKey, RealmFieldType.FLOAT);
            throw e;
        }
    }

    public int getInt(String str) {
        return (int) getLong(str);
    }

    public RealmList<DynamicRealmObject> getList(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            OsList modelList = this.proxyState.getRow$realm().getModelList(columnKey);
            return new RealmList<>(modelList.getTargetTable().getClassName(), modelList, this.proxyState.getRealm$realm());
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnKey, RealmFieldType.LIST);
            throw e;
        }
    }

    public <E> RealmList<E> getList(String str, Class<E> cls) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (cls != null) {
            long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
            RealmFieldType primitiveTypeToRealmFieldType = primitiveTypeToRealmFieldType(CollectionType.LIST, cls);
            try {
                return new RealmList<>(cls, this.proxyState.getRow$realm().getValueList(columnKey, primitiveTypeToRealmFieldType), this.proxyState.getRealm$realm());
            } catch (IllegalArgumentException e) {
                checkFieldType(str, columnKey, primitiveTypeToRealmFieldType);
                throw e;
            }
        } else {
            throw new IllegalArgumentException("Non-null 'primitiveType' required.");
        }
    }

    public long getLong(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            return this.proxyState.getRow$realm().getLong(columnKey);
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnKey, RealmFieldType.INTEGER);
            throw e;
        }
    }

    @Nullable
    public DynamicRealmObject getObject(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        checkFieldType(str, columnKey, RealmFieldType.OBJECT);
        if (this.proxyState.getRow$realm().isNullLink(columnKey)) {
            return null;
        }
        return new DynamicRealmObject(this.proxyState.getRealm$realm(), this.proxyState.getRow$realm().getTable().getLinkTarget(columnKey).getCheckedRow(this.proxyState.getRow$realm().getLink(columnKey)));
    }

    public ObjectId getObjectId(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        checkFieldType(str, columnKey, RealmFieldType.OBJECT_ID);
        if (this.proxyState.getRow$realm().isNull(columnKey)) {
            return null;
        }
        return this.proxyState.getRow$realm().getObjectId(columnKey);
    }

    public RealmAny getRealmAny(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        checkFieldType(str, columnKey, RealmFieldType.MIXED);
        return getRealmAny(columnKey);
    }

    public RealmSet<DynamicRealmObject> getRealmSet(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            OsSet modelSet = this.proxyState.getRow$realm().getModelSet(columnKey);
            return new RealmSet<>(this.proxyState.getRealm$realm(), modelSet, modelSet.getTargetTable().getClassName());
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnKey, RealmFieldType.LINK_SET);
            throw e;
        }
    }

    public <E> RealmSet<E> getRealmSet(String str, Class<E> cls) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (cls != null) {
            long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
            RealmFieldType primitiveTypeToRealmFieldType = primitiveTypeToRealmFieldType(CollectionType.SET, cls);
            try {
                return new RealmSet<>(this.proxyState.getRealm$realm(), this.proxyState.getRow$realm().getValueSet(columnKey, primitiveTypeToRealmFieldType), cls);
            } catch (IllegalArgumentException e) {
                checkFieldType(str, columnKey, primitiveTypeToRealmFieldType);
                throw e;
            }
        } else {
            throw new IllegalArgumentException("Non-null 'primitiveType' required.");
        }
    }

    public short getShort(String str) {
        return (short) ((int) getLong(str));
    }

    public String getString(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        try {
            return this.proxyState.getRow$realm().getString(columnKey);
        } catch (IllegalArgumentException e) {
            checkFieldType(str, columnKey, RealmFieldType.STRING);
            throw e;
        }
    }

    public String getType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getTable().getClassName();
    }

    public UUID getUUID(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        checkFieldType(str, columnKey, RealmFieldType.UUID);
        if (this.proxyState.getRow$realm().isNull(columnKey)) {
            return null;
        }
        return this.proxyState.getRow$realm().getUUID(columnKey);
    }

    public boolean hasField(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (str == null || str.isEmpty()) {
            return false;
        }
        return this.proxyState.getRow$realm().hasColumn(str);
    }

    public int hashCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        String path = this.proxyState.getRealm$realm().getPath();
        String name = this.proxyState.getRow$realm().getTable().getName();
        long objectKey = this.proxyState.getRow$realm().getObjectKey();
        int i = 0;
        int hashCode = path != null ? path.hashCode() : 0;
        if (name != null) {
            i = name.hashCode();
        }
        return ((((hashCode + 527) * 31) + i) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    public boolean isNull(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        switch (1.$SwitchMap$io$realm$RealmFieldType[this.proxyState.getRow$realm().getColumnType(columnKey).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return this.proxyState.getRow$realm().isNull(columnKey);
            case 12:
                return this.proxyState.getRow$realm().isNullLink(columnKey);
            default:
                return false;
        }
    }

    public RealmResults<DynamicRealmObject> linkingObjects(String str, String str2) {
        DynamicRealm dynamicRealm = (DynamicRealm) this.proxyState.getRealm$realm();
        dynamicRealm.checkIfValid();
        this.proxyState.getRow$realm().checkIfAttached();
        RealmObjectSchema realmObjectSchema = dynamicRealm.getSchema().get(str);
        if (realmObjectSchema == null) {
            StringBuilder sb = new StringBuilder("Class not found: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (str2 == null) {
            throw new IllegalArgumentException("Non-null 'srcFieldName' required.");
        } else if (!str2.contains(".")) {
            RealmFieldType fieldType = realmObjectSchema.getFieldType(str2);
            if (fieldType == RealmFieldType.OBJECT || fieldType == RealmFieldType.LIST) {
                return RealmResults.createDynamicBacklinkResults(dynamicRealm, (UncheckedRow) this.proxyState.getRow$realm(), realmObjectSchema.getTable(), str2);
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Unexpected field type: %1$s. Field type should be either %2$s.%3$s or %2$s.%4$s.", fieldType.name(), "RealmFieldType", RealmFieldType.OBJECT.name(), RealmFieldType.LIST.name()));
        } else {
            throw new IllegalArgumentException(MSG_LINK_QUERY_NOT_SUPPORTED);
        }
    }

    @Override // io.realm.internal.RealmObjectProxy
    public void realm$injectObjectContext() {
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState realmGet$proxyState() {
        return this.proxyState;
    }

    public void set(String str, Object obj) {
        this.proxyState.getRealm$realm().checkIfValid();
        boolean z = obj instanceof String;
        String str2 = z ? (String) obj : null;
        RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(this.proxyState.getRow$realm().getColumnKey(str));
        Object obj2 = obj;
        if (z) {
            obj2 = obj;
            if (columnType != RealmFieldType.STRING) {
                switch (1.$SwitchMap$io$realm$RealmFieldType[columnType.ordinal()]) {
                    case 1:
                        obj2 = Boolean.valueOf(Boolean.parseBoolean(str2));
                        break;
                    case 2:
                        obj2 = Long.valueOf(Long.parseLong(str2));
                        break;
                    case 3:
                        obj2 = Float.valueOf(Float.parseFloat(str2));
                        break;
                    case 4:
                        obj2 = Double.valueOf(Double.parseDouble(str2));
                        break;
                    case 5:
                    case 6:
                    default:
                        throw new IllegalArgumentException(String.format(Locale.US, "Field %s is not a String field, and the provide value could not be automatically converted: %s. Use a typedsetter instead", str, obj));
                    case 7:
                        obj2 = JsonUtils.stringToDate(str2);
                        break;
                    case 8:
                        obj2 = Decimal128.c(str2);
                        break;
                    case 9:
                        obj2 = new ObjectId(str2);
                        break;
                    case 10:
                        obj2 = RealmAny.valueOf(str2);
                        break;
                    case 11:
                        obj2 = UUID.fromString(str2);
                        break;
                }
            }
        }
        if (obj2 == null) {
            setNull(str);
        } else {
            setValue(str, obj2);
        }
    }

    public void setBlob(String str, @Nullable byte[] bArr) {
        this.proxyState.getRealm$realm().checkIfValid();
        this.proxyState.getRow$realm().setBinaryByteArray(this.proxyState.getRow$realm().getColumnKey(str), bArr);
    }

    public void setBoolean(String str, boolean z) {
        this.proxyState.getRealm$realm().checkIfValid();
        this.proxyState.getRow$realm().setBoolean(this.proxyState.getRow$realm().getColumnKey(str), z);
    }

    public void setByte(String str, byte b) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setLong(this.proxyState.getRow$realm().getColumnKey(str), (long) b);
    }

    public void setDate(String str, @Nullable Date date) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (date == null) {
            this.proxyState.getRow$realm().setNull(columnKey);
        } else {
            this.proxyState.getRow$realm().setDate(columnKey, date);
        }
    }

    public void setDecimal128(String str, @Nullable Decimal128 decimal128) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (decimal128 == null) {
            this.proxyState.getRow$realm().setNull(columnKey);
        } else {
            this.proxyState.getRow$realm().setDecimal128(columnKey, decimal128);
        }
    }

    public <E> void setDictionary(String str, RealmDictionary<E> realmDictionary) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (realmDictionary != null) {
            RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(this.proxyState.getRow$realm().getColumnKey(str));
            switch (1.$SwitchMap$io$realm$RealmFieldType[columnType.ordinal()]) {
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    setValueDictionary(str, realmDictionary, columnType);
                    return;
                case 25:
                    setModelDictionary(str, realmDictionary);
                    return;
                default:
                    throw new IllegalArgumentException(String.format("Field '%s' is not a dictionary but a %s", str, columnType));
            }
        } else {
            throw new IllegalArgumentException("Non-null 'dictionary' required");
        }
    }

    public void setDouble(String str, double d) {
        this.proxyState.getRealm$realm().checkIfValid();
        this.proxyState.getRow$realm().setDouble(this.proxyState.getRow$realm().getColumnKey(str), d);
    }

    public void setFloat(String str, float f) {
        this.proxyState.getRealm$realm().checkIfValid();
        this.proxyState.getRow$realm().setFloat(this.proxyState.getRow$realm().getColumnKey(str), f);
    }

    public void setInt(String str, int i) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setLong(this.proxyState.getRow$realm().getColumnKey(str), (long) i);
    }

    public <E> void setList(String str, RealmList<E> realmList) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (realmList != null) {
            RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(this.proxyState.getRow$realm().getColumnKey(str));
            int i = 1.$SwitchMap$io$realm$RealmFieldType[columnType.ordinal()];
            if (i != 13) {
                switch (i) {
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        setValueList(str, realmList, columnType);
                        return;
                    default:
                        throw new IllegalArgumentException(String.format("Field '%s' is not a list but a %s", str, columnType));
                }
            } else {
                if (!realmList.isEmpty()) {
                    E first = realmList.first();
                    if (!(first instanceof DynamicRealmObject) && RealmModel.class.isAssignableFrom(first.getClass())) {
                        throw new IllegalArgumentException("RealmList must contain `DynamicRealmObject's, not Java model classes.");
                    }
                }
                setModelList(str, realmList);
            }
        } else {
            throw new IllegalArgumentException("Non-null 'list' required");
        }
    }

    public void setLong(String str, long j) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setLong(this.proxyState.getRow$realm().getColumnKey(str), j);
    }

    public void setNull(String str) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (this.proxyState.getRow$realm().getColumnType(columnKey) == RealmFieldType.OBJECT) {
            this.proxyState.getRow$realm().nullifyLink(columnKey);
            return;
        }
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setNull(columnKey);
    }

    public void setObject(String str, @Nullable DynamicRealmObject dynamicRealmObject) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (dynamicRealmObject == null) {
            this.proxyState.getRow$realm().nullifyLink(columnKey);
        } else if (dynamicRealmObject.proxyState.getRealm$realm() == null || dynamicRealmObject.proxyState.getRow$realm() == null) {
            throw new IllegalArgumentException("Cannot link to objects that are not part of the Realm.");
        } else if (this.proxyState.getRealm$realm() == dynamicRealmObject.proxyState.getRealm$realm()) {
            Table linkTarget = this.proxyState.getRow$realm().getTable().getLinkTarget(columnKey);
            Table table = dynamicRealmObject.proxyState.getRow$realm().getTable();
            if (linkTarget.hasSameSchema(table)) {
                this.proxyState.getRow$realm().setLink(columnKey, dynamicRealmObject.proxyState.getRow$realm().getObjectKey());
                return;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Type of object is wrong. Was %s, expected %s", table.getName(), linkTarget.getName()));
        } else {
            throw new IllegalArgumentException("Cannot add an object from another Realm instance.");
        }
    }

    public void setObjectId(String str, @Nullable ObjectId objectId) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (objectId == null) {
            this.proxyState.getRow$realm().setNull(columnKey);
        } else {
            this.proxyState.getRow$realm().setObjectId(columnKey, objectId);
        }
    }

    public void setRealmAny(String str, @Nullable RealmAny realmAny) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (realmAny == null) {
            this.proxyState.getRow$realm().setNull(columnKey);
        } else {
            this.proxyState.getRow$realm().setRealmAny(columnKey, realmAny.getNativePtr());
        }
    }

    public <E> void setRealmSet(String str, RealmSet<E> realmSet) {
        this.proxyState.getRealm$realm().checkIfValid();
        if (realmSet != null) {
            RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(this.proxyState.getRow$realm().getColumnKey(str));
            switch (1.$SwitchMap$io$realm$RealmFieldType[columnType.ordinal()]) {
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                case 32:
                case Framer.ENTER_FRAME_PREFIX:
                case 34:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                    setValueSet(str, realmSet, columnType);
                    return;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                    setModelSet(str, realmSet);
                    return;
                default:
                    throw new IllegalArgumentException(String.format("Field '%s' is not a set but a %s", str, columnType));
            }
        } else {
            throw new IllegalArgumentException("Non-null 'set' required");
        }
    }

    public void setShort(String str, short s) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setLong(this.proxyState.getRow$realm().getColumnKey(str), (long) s);
    }

    public void setString(String str, @Nullable String str2) {
        this.proxyState.getRealm$realm().checkIfValid();
        checkIsPrimaryKey(str);
        this.proxyState.getRow$realm().setString(this.proxyState.getRow$realm().getColumnKey(str), str2);
    }

    public void setUUID(String str, @Nullable UUID uuid) {
        this.proxyState.getRealm$realm().checkIfValid();
        long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
        if (uuid == null) {
            this.proxyState.getRow$realm().setNull(columnKey);
        } else {
            this.proxyState.getRow$realm().setUUID(columnKey, uuid);
        }
    }

    public String toString() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (!this.proxyState.getRow$realm().isValid()) {
            return "Invalid object";
        }
        String className = this.proxyState.getRow$realm().getTable().getClassName();
        StringBuilder sb = new StringBuilder();
        sb.append(className);
        sb.append(" = dynamic[");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        String[] fieldNames = getFieldNames();
        for (String str : fieldNames) {
            long columnKey = this.proxyState.getRow$realm().getColumnKey(str);
            RealmFieldType columnType = this.proxyState.getRow$realm().getColumnType(columnKey);
            sb2.append("{");
            sb2.append(str);
            sb2.append(":");
            Object obj = "null";
            switch (1.$SwitchMap$io$realm$RealmFieldType[columnType.ordinal()]) {
                case 1:
                    Object obj2 = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        obj2 = Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(columnKey));
                    }
                    sb2.append(obj2);
                    break;
                case 2:
                    Object obj3 = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        obj3 = Long.valueOf(this.proxyState.getRow$realm().getLong(columnKey));
                    }
                    sb2.append(obj3);
                    break;
                case 3:
                    Object obj4 = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        obj4 = Float.valueOf(this.proxyState.getRow$realm().getFloat(columnKey));
                    }
                    sb2.append(obj4);
                    break;
                case 4:
                    Object obj5 = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        obj5 = Double.valueOf(this.proxyState.getRow$realm().getDouble(columnKey));
                    }
                    sb2.append(obj5);
                    break;
                case 5:
                    sb2.append(this.proxyState.getRow$realm().getString(columnKey));
                    break;
                case 6:
                    sb2.append(Arrays.toString(this.proxyState.getRow$realm().getBinaryByteArray(columnKey)));
                    break;
                case 7:
                    Date date = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        date = this.proxyState.getRow$realm().getDate(columnKey);
                    }
                    sb2.append((Object) date);
                    break;
                case 8:
                    Decimal128 decimal128 = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        decimal128 = this.proxyState.getRow$realm().getDecimal128(columnKey);
                    }
                    sb2.append((Object) decimal128);
                    break;
                case 9:
                    ObjectId objectId = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        objectId = this.proxyState.getRow$realm().getObjectId(columnKey);
                    }
                    sb2.append((Object) objectId);
                    break;
                case 10:
                    String str2 = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        str2 = getRealmAny(columnKey);
                    }
                    sb2.append(str2);
                    break;
                case 11:
                    UUID uuid = obj;
                    if (!this.proxyState.getRow$realm().isNull(columnKey)) {
                        uuid = this.proxyState.getRow$realm().getUUID(columnKey);
                    }
                    sb2.append((Object) uuid);
                    break;
                case 12:
                    String str3 = obj;
                    if (!this.proxyState.getRow$realm().isNullLink(columnKey)) {
                        str3 = this.proxyState.getRow$realm().getTable().getLinkTarget(columnKey).getClassName();
                    }
                    sb2.append(str3);
                    break;
                case 13:
                    sb2.append(String.format(Locale.US, "RealmList<%s>[%s]", this.proxyState.getRow$realm().getTable().getLinkTarget(columnKey).getClassName(), Long.valueOf(this.proxyState.getRow$realm().getModelList(columnKey).size())));
                    break;
                case 14:
                    sb2.append(String.format(Locale.US, "RealmDictionary<Long>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 15:
                    sb2.append(String.format(Locale.US, "RealmDictionary<Boolean>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 16:
                    sb2.append(String.format(Locale.US, "RealmDictionary<String>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 17:
                    sb2.append(String.format(Locale.US, "RealmDictionary<byte[]>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 18:
                    sb2.append(String.format(Locale.US, "RealmDictionary<Date>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 19:
                    sb2.append(String.format(Locale.US, "RealmDictionary<Float>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 20:
                    sb2.append(String.format(Locale.US, "RealmDictionary<Double>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 21:
                    sb2.append(String.format(Locale.US, "RealmDictionary<Decimal128>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 22:
                    sb2.append(String.format(Locale.US, "RealmDictionary<ObjectId>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 23:
                    sb2.append(String.format(Locale.US, "RealmDictionary<UUID>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 24:
                    sb2.append(String.format(Locale.US, "RealmDictionary<RealmAny>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueMap(columnKey, columnType).size())));
                    break;
                case 25:
                    sb2.append(String.format(Locale.US, "RealmDictionary<%s>[%s]", this.proxyState.getRow$realm().getTable().getLinkTarget(columnKey).getClassName(), Long.valueOf(this.proxyState.getRow$realm().getModelMap(columnKey).size())));
                    break;
                case 26:
                    sb2.append(String.format(Locale.US, "RealmSet<Long>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 27:
                    sb2.append(String.format(Locale.US, "RealmSet<Boolean>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 28:
                    sb2.append(String.format(Locale.US, "RealmSet<String>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 29:
                    sb2.append(String.format(Locale.US, "RealmSet<byte[]>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 30:
                    sb2.append(String.format(Locale.US, "RealmSet<Date>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                    sb2.append(String.format(Locale.US, "RealmSet<Float>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 32:
                    sb2.append(String.format(Locale.US, "RealmSet<Double>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case Framer.ENTER_FRAME_PREFIX:
                    sb2.append(String.format(Locale.US, "RealmSet<Decimal128>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case 34:
                    sb2.append(String.format(Locale.US, "RealmSet<ObjectId>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                    sb2.append(String.format(Locale.US, "RealmSet<UUID>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                    sb2.append(String.format(Locale.US, "RealmSet<%s>[%s]", this.proxyState.getRow$realm().getTable().getLinkTarget(columnKey).getClassName(), Long.valueOf(this.proxyState.getRow$realm().getModelSet(columnKey).size())));
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                    sb2.append(String.format(Locale.US, "RealmSet<RealmAny>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueSet(columnKey, columnType).size())));
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                default:
                    sb2.append("?");
                    break;
                case 39:
                    sb2.append(String.format(Locale.US, "RealmList<Long>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 40:
                    sb2.append(String.format(Locale.US, "RealmList<Boolean>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 41:
                    sb2.append(String.format(Locale.US, "RealmList<String>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 42:
                    sb2.append(String.format(Locale.US, "RealmList<byte[]>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 43:
                    sb2.append(String.format(Locale.US, "RealmList<Date>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 44:
                    sb2.append(String.format(Locale.US, "RealmList<Float>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 45:
                    sb2.append(String.format(Locale.US, "RealmList<Double>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 46:
                    sb2.append(String.format(Locale.US, "RealmList<Decimal128>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 47:
                    sb2.append(String.format(Locale.US, "RealmList<ObjectId>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 48:
                    sb2.append(String.format(Locale.US, "RealmList<UUID>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
                case 49:
                    sb2.append(String.format(Locale.US, "RealmList<RealmAny>[%s]", Long.valueOf(this.proxyState.getRow$realm().getValueList(columnKey, columnType).size())));
                    break;
            }
            sb2.append("},");
        }
        sb2.replace(sb2.length() - 1, sb2.length(), "");
        sb2.append("]");
        return sb2.toString();
    }
}
