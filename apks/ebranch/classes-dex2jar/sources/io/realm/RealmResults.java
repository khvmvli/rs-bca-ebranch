package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.Util;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import io.realm.rx.CollectionChange;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import javax.annotation.Nullable;
import o.Page6DTahapanXpresiSFragment_ViewBinding;
import o.Page6DTapresSFragment_ViewBinding;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes-dex2jar.jar:io/realm/RealmResults.class */
public class RealmResults<E> extends OrderedRealmCollectionImpl<E> {
    public RealmResults(BaseRealm baseRealm, OsResults osResults, Class<E> cls) {
        this(baseRealm, osResults, (Class) cls, false);
    }

    RealmResults(BaseRealm baseRealm, OsResults osResults, Class<E> cls, boolean z) {
        super(baseRealm, osResults, cls, getCollectionOperator(z, baseRealm, osResults, cls, null));
    }

    public RealmResults(BaseRealm baseRealm, OsResults osResults, String str) {
        this(baseRealm, osResults, str, false);
    }

    RealmResults(BaseRealm baseRealm, OsResults osResults, String str, boolean z) {
        super(baseRealm, osResults, str, getCollectionOperator(z, baseRealm, osResults, null, str));
    }

    private void checkForAddListener(@Nullable Object obj) {
        if (obj != null) {
            this.baseRealm.checkIfValid();
            this.baseRealm.sharedRealm.capabilities.checkCanDeliverNotification("Listeners cannot be used on current thread.");
            return;
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    private void checkForRemoveListener(@Nullable Object obj, boolean z) {
        if (z && obj == null) {
            throw new IllegalArgumentException("Listener should not be null");
        } else if (this.baseRealm.isClosed()) {
            RealmLog.warn("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.baseRealm.configuration.getPath());
        }
    }

    private void checkNonEmptyFieldName(String str) {
        if (Util.isEmptyString(str)) {
            throw new IllegalArgumentException("Non-empty 'fieldname' required.");
        }
    }

    private void checkNotNull(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Non-null 'value' required. Use 'setNull(fieldName)' instead.");
        }
    }

    private Row checkRealmObjectConstraints(String str, @Nullable RealmModel realmModel) {
        if (realmModel == null) {
            return null;
        }
        if (!RealmObject.isManaged(realmModel) || !RealmObject.isValid(realmModel)) {
            throw new IllegalArgumentException("'value' is not a valid, managed Realm object.");
        }
        ProxyState realmGet$proxyState = ((RealmObjectProxy) realmModel).realmGet$proxyState();
        if (realmGet$proxyState.getRealm$realm().getPath().equals(this.baseRealm.getPath())) {
            Table table = this.osResults.getTable();
            Table linkTarget = table.getLinkTarget(table.getColumnKey(str));
            Table table2 = realmGet$proxyState.getRow$realm().getTable();
            if (linkTarget.hasSameSchema(table2)) {
                return realmGet$proxyState.getRow$realm();
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Type of object is wrong. Was '%s', expected '%s'", table2.getClassName(), linkTarget.getClassName()));
        }
        throw new IllegalArgumentException("'value' does not belong to the same Realm as the RealmResults.");
    }

    private void checkType(String str, RealmFieldType realmFieldType) {
        String className = this.osResults.getTable().getClassName();
        RealmFieldType fieldType = this.baseRealm.getSchema().get(className).getFieldType(str);
        if (fieldType != realmFieldType) {
            throw new IllegalArgumentException(String.format("The field '%s.%s' is not of the expected type. Actual: %s, Expected: %s", className, str, fieldType, realmFieldType));
        }
    }

    private <T> void checkTypeOfListElements(RealmList<T> realmList, Class<?> cls) {
        if (!realmList.isEmpty()) {
            Class<?> cls2 = realmList.first().getClass();
            if (!cls.isAssignableFrom(cls2)) {
                throw new IllegalArgumentException(String.format("List contained the wrong type of elements. Elements of type '%s' was expected, but the actual type is '%s'", cls, cls2));
            }
        }
    }

    static <T extends RealmModel> RealmResults<T> createBacklinkResults(BaseRealm baseRealm, Row row, Class<T> cls, String str) {
        Table table = baseRealm.getSchema().getTable(cls);
        return new RealmResults<>(baseRealm, OsResults.createForBacklinks(baseRealm.sharedRealm, (UncheckedRow) row, table, str), cls);
    }

    public static RealmResults<DynamicRealmObject> createDynamicBacklinkResults(DynamicRealm dynamicRealm, UncheckedRow uncheckedRow, Table table, String str) {
        return new RealmResults<>(dynamicRealm, OsResults.createForBacklinks(dynamicRealm.sharedRealm, uncheckedRow, table, str), Table.getClassNameForTable(table.getName()));
    }

    private Class<?> getListType(RealmList realmList) {
        return !realmList.isEmpty() ? realmList.first().getClass() : Long.class;
    }

    private String mapFieldNameToInternalName(String str) {
        String str2 = str;
        if (this.baseRealm instanceof Realm) {
            str2 = this.baseRealm.getSchema().getColumnInfo(this.osResults.getTable().getClassName()).getInternalFieldName(str);
            if (str2 == null) {
                throw new IllegalArgumentException(String.format("Field '%s' does not exists.", str));
            }
        }
        return str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        add(i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add(obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(int i, Collection collection) {
        return addAll(i, collection);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return addAll(collection);
    }

    public void addChangeListener(OrderedRealmCollectionChangeListener<RealmResults<E>> orderedRealmCollectionChangeListener) {
        checkForAddListener(orderedRealmCollectionChangeListener);
        this.osResults.addListener((OsResults) this, (OrderedRealmCollectionChangeListener<OsResults>) orderedRealmCollectionChangeListener);
    }

    public void addChangeListener(RealmChangeListener<RealmResults<E>> realmChangeListener) {
        checkForAddListener(realmChangeListener);
        this.osResults.addListener((OsResults) this, (RealmChangeListener<OsResults>) realmChangeListener);
    }

    public Page6DTapresSFragment_ViewBinding<CollectionChange<RealmResults<E>>> asChangesetObservable() {
        if (this.baseRealm instanceof Realm) {
            return this.baseRealm.configuration.getRxFactory().changesetsFrom((Realm) this.baseRealm, this);
        }
        if (this.baseRealm instanceof DynamicRealm) {
            return this.baseRealm.configuration.getRxFactory().changesetsFrom((DynamicRealm) this.baseRealm, this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.baseRealm.getClass());
        sb.append(" does not support RxJava2.");
        throw new UnsupportedOperationException(sb.toString());
    }

    public Page6DTahapanXpresiSFragment_ViewBinding<RealmResults<E>> asFlowable() {
        if (this.baseRealm instanceof Realm) {
            return this.baseRealm.configuration.getRxFactory().from((Realm) this.baseRealm, this);
        }
        if (this.baseRealm instanceof DynamicRealm) {
            return this.baseRealm.configuration.getRxFactory().from((DynamicRealm) this.baseRealm, this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.baseRealm.getClass());
        sb.append(" does not support RxJava2.");
        throw new UnsupportedOperationException(sb.toString());
    }

    public String asJSON() {
        return this.osResults.toJSON(-1);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ double average(String str) {
        return average(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ void clear() {
        clear();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.List, java.util.Collection, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ boolean contains(@Nullable Object obj) {
        return contains(obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ OrderedRealmCollectionSnapshot createSnapshot() {
        return createSnapshot();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ boolean deleteAllFromRealm() {
        return deleteAllFromRealm();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ boolean deleteFirstFromRealm() {
        return deleteFirstFromRealm();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ void deleteFromRealm(int i) {
        deleteFromRealm(i);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ boolean deleteLastFromRealm() {
        return deleteLastFromRealm();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Object first() {
        return first();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Object first(@Nullable Object obj) {
        return first(obj);
    }

    @Override // io.realm.internal.Freezable
    public RealmResults<E> freeze() {
        if (isValid()) {
            BaseRealm freeze = this.baseRealm.freeze();
            OsResults freeze2 = this.osResults.freeze(freeze.sharedRealm);
            return this.className != null ? new RealmResults<>(freeze, freeze2, this.className) : new RealmResults<>(freeze, freeze2, this.classSpec);
        }
        throw new IllegalStateException("Only valid, managed RealmResults can be frozen.");
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Nullable
    public /* bridge */ /* synthetic */ Object get(int i) {
        return get(i);
    }

    @Override // io.realm.OrderedRealmCollectionImpl
    public /* bridge */ /* synthetic */ Realm getRealm() {
        return getRealm();
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
        return this.baseRealm != null && this.baseRealm.isFrozen();
    }

    @Override // io.realm.RealmCollection
    public boolean isLoaded() {
        this.baseRealm.checkIfValid();
        return this.osResults.isLoaded();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection, io.realm.internal.ManageableObject
    public /* bridge */ /* synthetic */ boolean isManaged() {
        return isManaged();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection, io.realm.internal.ManageableObject
    public /* bridge */ /* synthetic */ boolean isValid() {
        return isValid();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Object last() {
        return last();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Object last(@Nullable Object obj) {
        return last(obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // io.realm.RealmCollection
    public boolean load() {
        this.baseRealm.checkIfValid();
        this.osResults.load();
        return true;
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Number max(String str) {
        return max(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    @Nullable
    public /* bridge */ /* synthetic */ Date maxDate(String str) {
        return maxDate(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Number min(String str) {
        return min(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Date minDate(String str) {
        return minDate(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object remove(int i) {
        return remove(i);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return remove(obj);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return removeAll(collection);
    }

    public void removeAllChangeListeners() {
        checkForRemoveListener(null, false);
        this.osResults.removeAllListeners();
    }

    public void removeChangeListener(OrderedRealmCollectionChangeListener<RealmResults<E>> orderedRealmCollectionChangeListener) {
        checkForRemoveListener(orderedRealmCollectionChangeListener, true);
        this.osResults.removeListener((OsResults) this, (OrderedRealmCollectionChangeListener<OsResults>) orderedRealmCollectionChangeListener);
    }

    public void removeChangeListener(RealmChangeListener<RealmResults<E>> realmChangeListener) {
        checkForRemoveListener(realmChangeListener, true);
        this.osResults.removeListener((OsResults) this, (RealmChangeListener<OsResults>) realmChangeListener);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.List, java.util.Collection
    @Deprecated
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return set(i, obj);
    }

    public void setBlob(String str, @Nullable byte[] bArr) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.BINARY);
        this.osResults.setBlob(mapFieldNameToInternalName, bArr);
    }

    public void setBoolean(String str, boolean z) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.BOOLEAN);
        this.osResults.setBoolean(mapFieldNameToInternalName, z);
    }

    public void setByte(String str, byte b) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.INTEGER);
        this.osResults.setInt(mapFieldNameToInternalName, (long) b);
    }

    public void setDate(String str, @Nullable Date date) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.DATE);
        this.osResults.setDate(mapFieldNameToInternalName, date);
    }

    public void setDecimal128(String str, @Nullable Decimal128 decimal128) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.DECIMAL128);
        this.osResults.setDecimal128(mapFieldNameToInternalName, decimal128);
    }

    public void setDouble(String str, double d) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.DOUBLE);
        this.osResults.setDouble(mapFieldNameToInternalName, d);
    }

    public void setFloat(String str, float f) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.FLOAT);
        this.osResults.setFloat(mapFieldNameToInternalName, f);
    }

    public void setInt(String str, int i) {
        checkNonEmptyFieldName(str);
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.INTEGER);
        this.baseRealm.checkIfValidAndInTransaction();
        this.osResults.setInt(mapFieldNameToInternalName, (long) i);
    }

    public <T> void setList(String str, RealmList<T> realmList) {
        checkNonEmptyFieldName(str);
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        if (realmList != null) {
            RealmFieldType fieldType = this.baseRealm.getSchema().getSchemaForClass(this.osResults.getTable().getClassName()).getFieldType(mapFieldNameToInternalName);
            switch (1.$SwitchMap$io$realm$RealmFieldType[fieldType.ordinal()]) {
                case 9:
                    checkTypeOfListElements(realmList, RealmModel.class);
                    checkRealmObjectConstraints(mapFieldNameToInternalName, (RealmModel) realmList.first(null));
                    this.osResults.setModelList(mapFieldNameToInternalName, realmList);
                    return;
                case 10:
                    Class<?> listType = getListType(realmList);
                    if (listType.equals(Integer.class)) {
                        this.osResults.setIntegerList(mapFieldNameToInternalName, realmList);
                        return;
                    } else if (listType.equals(Long.class)) {
                        this.osResults.setLongList(mapFieldNameToInternalName, realmList);
                        return;
                    } else if (listType.equals(Short.class)) {
                        this.osResults.setShortList(mapFieldNameToInternalName, realmList);
                        return;
                    } else if (listType.equals(Byte.class)) {
                        this.osResults.setByteList(mapFieldNameToInternalName, realmList);
                        return;
                    } else {
                        throw new IllegalArgumentException(String.format("List contained the wrong type of elements. Elements that can be mapped to Integers was expected, but the actual type is '%s'", listType));
                    }
                case 11:
                    checkTypeOfListElements(realmList, Boolean.class);
                    this.osResults.setBooleanList(mapFieldNameToInternalName, realmList);
                    return;
                case 12:
                    checkTypeOfListElements(realmList, String.class);
                    this.osResults.setStringList(mapFieldNameToInternalName, realmList);
                    return;
                case 13:
                    checkTypeOfListElements(realmList, byte[].class);
                    this.osResults.setByteArrayList(mapFieldNameToInternalName, realmList);
                    return;
                case 14:
                    checkTypeOfListElements(realmList, Date.class);
                    this.osResults.setDateList(mapFieldNameToInternalName, realmList);
                    return;
                case 15:
                    checkTypeOfListElements(realmList, Decimal128.class);
                    this.osResults.setDecimal128List(mapFieldNameToInternalName, realmList);
                    return;
                case 16:
                    checkTypeOfListElements(realmList, ObjectId.class);
                    this.osResults.setObjectIdList(mapFieldNameToInternalName, realmList);
                    return;
                case 17:
                    checkTypeOfListElements(realmList, UUID.class);
                    this.osResults.setUUIDList(mapFieldNameToInternalName, realmList);
                    return;
                case 18:
                    checkTypeOfListElements(realmList, Float.class);
                    this.osResults.setFloatList(mapFieldNameToInternalName, realmList);
                    return;
                case 19:
                    checkTypeOfListElements(realmList, Double.class);
                    this.osResults.setDoubleList(mapFieldNameToInternalName, realmList);
                    return;
                default:
                    throw new IllegalArgumentException(String.format("Field '%s' is not a list but a %s", mapFieldNameToInternalName, fieldType));
            }
        } else {
            throw new IllegalArgumentException("Non-null 'list' required");
        }
    }

    public void setLong(String str, long j) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.INTEGER);
        this.osResults.setInt(mapFieldNameToInternalName, j);
    }

    public void setNull(String str) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        this.osResults.setNull(str);
    }

    public void setObject(String str, @Nullable RealmModel realmModel) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.OBJECT);
        this.osResults.setObject(mapFieldNameToInternalName, checkRealmObjectConstraints(mapFieldNameToInternalName, realmModel));
    }

    public void setObjectId(String str, @Nullable ObjectId objectId) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.OBJECT_ID);
        this.osResults.setObjectId(mapFieldNameToInternalName, objectId);
    }

    public void setShort(String str, short s) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.INTEGER);
        this.osResults.setInt(mapFieldNameToInternalName, (long) s);
    }

    public void setString(String str, @Nullable String str2) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.STRING);
        this.osResults.setString(mapFieldNameToInternalName, str2);
    }

    public void setUUID(String str, @Nullable UUID uuid) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        checkType(mapFieldNameToInternalName, RealmFieldType.UUID);
        this.osResults.setUUID(mapFieldNameToInternalName, uuid);
    }

    public void setValue(String str, @Nullable Object obj) {
        checkNonEmptyFieldName(str);
        this.baseRealm.checkIfValidAndInTransaction();
        String mapFieldNameToInternalName = mapFieldNameToInternalName(str);
        boolean z = obj instanceof String;
        String str2 = z ? (String) obj : null;
        String className = this.osResults.getTable().getClassName();
        RealmObjectSchema realmObjectSchema = getRealm().getSchema().get(className);
        if (!realmObjectSchema.hasField(mapFieldNameToInternalName)) {
            throw new IllegalArgumentException(String.format("Field '%s' could not be found in class '%s'", mapFieldNameToInternalName, className));
        } else if (obj == null) {
            this.osResults.setNull(mapFieldNameToInternalName);
        } else {
            RealmFieldType fieldType = realmObjectSchema.getFieldType(mapFieldNameToInternalName);
            Object obj2 = obj;
            if (z) {
                obj2 = obj;
                if (fieldType != RealmFieldType.STRING) {
                    switch (1.$SwitchMap$io$realm$RealmFieldType[fieldType.ordinal()]) {
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
                            obj2 = JsonUtils.stringToDate(str2);
                            break;
                        case 6:
                            obj2 = Decimal128.c(str2);
                            break;
                        case 7:
                            obj2 = new ObjectId(str2);
                            break;
                        case 8:
                            obj2 = UUID.fromString(str2);
                            break;
                        default:
                            throw new IllegalArgumentException(String.format(Locale.US, "Field %s is not a String field, and the provide value could not be automatically converted: %s. Use a typedsetter instead", mapFieldNameToInternalName, obj));
                    }
                }
            }
            Class<?> cls = obj2.getClass();
            if (cls == Boolean.class) {
                setBoolean(mapFieldNameToInternalName, ((Boolean) obj2).booleanValue());
            } else if (cls == Short.class) {
                setShort(mapFieldNameToInternalName, ((Short) obj2).shortValue());
            } else if (cls == Integer.class) {
                setInt(mapFieldNameToInternalName, ((Integer) obj2).intValue());
            } else if (cls == Long.class) {
                setLong(mapFieldNameToInternalName, ((Long) obj2).longValue());
            } else if (cls == Byte.class) {
                setByte(mapFieldNameToInternalName, ((Byte) obj2).byteValue());
            } else if (cls == Float.class) {
                setFloat(mapFieldNameToInternalName, ((Float) obj2).floatValue());
            } else if (cls == Double.class) {
                setDouble(mapFieldNameToInternalName, ((Double) obj2).doubleValue());
            } else if (cls == String.class) {
                setString(mapFieldNameToInternalName, (String) obj2);
            } else if (obj2 instanceof Date) {
                setDate(mapFieldNameToInternalName, (Date) obj2);
            } else if (obj2 instanceof Decimal128) {
                setDecimal128(mapFieldNameToInternalName, (Decimal128) obj2);
            } else if (obj2 instanceof ObjectId) {
                setObjectId(mapFieldNameToInternalName, (ObjectId) obj2);
            } else if (obj2 instanceof UUID) {
                setUUID(mapFieldNameToInternalName, (UUID) obj2);
            } else if (obj2 instanceof byte[]) {
                setBlob(mapFieldNameToInternalName, (byte[]) obj2);
            } else if (obj2 instanceof RealmModel) {
                setObject(mapFieldNameToInternalName, (RealmModel) obj2);
            } else if (cls == RealmList.class) {
                setList(mapFieldNameToInternalName, (RealmList) obj2);
            } else {
                StringBuilder sb = new StringBuilder("Value is of a type not supported: ");
                sb.append(obj2.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    @Override // io.realm.OrderedRealmCollectionImpl, java.util.AbstractCollection, java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ int size() {
        return size();
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ RealmResults sort(String str) {
        return sort(str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ RealmResults sort(String str, Sort sort) {
        return sort(str, sort);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str, Sort sort, String str2, Sort sort2) {
        return sort(new String[]{str, str2}, new Sort[]{sort, sort2});
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.OrderedRealmCollection
    public /* bridge */ /* synthetic */ RealmResults sort(String[] strArr, Sort[] sortArr) {
        return sort(strArr, sortArr);
    }

    @Override // io.realm.OrderedRealmCollectionImpl, io.realm.RealmCollection
    public /* bridge */ /* synthetic */ Number sum(String str) {
        return sum(str);
    }

    @Override // io.realm.RealmCollection
    public RealmQuery<E> where() {
        this.baseRealm.checkIfValid();
        return RealmQuery.createQueryFromResult(this);
    }
}
