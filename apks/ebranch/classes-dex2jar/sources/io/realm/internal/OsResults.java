package io.realm.internal;

import io.realm.OrderedRealmCollectionChangeListener;
import io.realm.RealmChangeListener;
import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.Sort;
import io.realm.internal.ObservableCollection;
import io.realm.internal.objectstore.OsKeyPathMapping;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes-dex2jar.jar:io/realm/internal/OsResults.class */
public class OsResults implements NativeObject, ObservableCollection {
    public static final byte AGGREGATE_FUNCTION_AVERAGE;
    public static final byte AGGREGATE_FUNCTION_MAXIMUM;
    public static final byte AGGREGATE_FUNCTION_MINIMUM;
    public static final byte AGGREGATE_FUNCTION_SUM;
    private static final String CLOSED_REALM_MESSAGE;
    public static final byte MODE_EMPTY;
    public static final byte MODE_LIST;
    public static final byte MODE_QUERY;
    public static final byte MODE_TABLE;
    public static final byte MODE_TABLEVIEW;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final NativeContext context;
    protected boolean loaded;
    private final long nativePtr;
    private final OsSharedRealm sharedRealm;
    private final Table table;
    private boolean isSnapshot = false;
    protected final ObserverPairList<ObservableCollection.CollectionObserverPair> observerPairs = new ObserverPairList<>();

    /* loaded from: classes-dex2jar.jar:io/realm/internal/OsResults$Iterator.class */
    public static abstract class Iterator<T> implements java.util.Iterator<T> {
        protected OsResults iteratorOsResults;
        protected int pos = -1;

        public Iterator(OsResults osResults) {
            if (!osResults.sharedRealm.isClosed()) {
                this.iteratorOsResults = osResults;
                if (!osResults.isSnapshot) {
                    if (osResults.sharedRealm.isInTransaction()) {
                        detach();
                    } else {
                        this.iteratorOsResults.sharedRealm.addIterator(this);
                    }
                }
            } else {
                throw new IllegalStateException(OsResults.CLOSED_REALM_MESSAGE);
            }
        }

        void checkValid() {
            if (this.iteratorOsResults == null) {
                throw new ConcurrentModificationException("No outside changes to a Realm is allowed while iterating a living Realm collection.");
            }
        }

        protected abstract T convertRowToObject(UncheckedRow uncheckedRow);

        public void detach() {
            this.iteratorOsResults = this.iteratorOsResults.createSnapshot();
        }

        @Nullable
        T get(int i) {
            return getInternal(i, this.iteratorOsResults);
        }

        protected abstract T getInternal(int i, OsResults osResults);

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkValid();
            boolean z = true;
            if (((long) (this.pos + 1)) >= this.iteratorOsResults.size()) {
                z = false;
            }
            return z;
        }

        public void invalidate() {
            this.iteratorOsResults = null;
        }

        @Override // java.util.Iterator
        @Nullable
        public T next() {
            checkValid();
            int i = this.pos + 1;
            this.pos = i;
            if (((long) i) < this.iteratorOsResults.size()) {
                return get(this.pos);
            }
            StringBuilder sb = new StringBuilder("Cannot access index ");
            sb.append(this.pos);
            sb.append(" when size is ");
            sb.append(this.iteratorOsResults.size());
            sb.append(". Remember to check hasNext() before using next().");
            throw new NoSuchElementException(sb.toString());
        }

        @Override // java.util.Iterator
        @Deprecated
        public void remove() {
            throw new UnsupportedOperationException("remove() is not supported by RealmResults iterators.");
        }
    }

    /* loaded from: classes-dex2jar.jar:io/realm/internal/OsResults$Mode.class */
    public enum Mode {
        EMPTY,
        TABLE,
        PRIMITIVE_LIST,
        QUERY,
        TABLEVIEW;

        static Mode getByValue(byte b) {
            if (b == 0) {
                return EMPTY;
            }
            if (b == 1) {
                return TABLE;
            }
            if (b == 2) {
                return PRIMITIVE_LIST;
            }
            if (b == 3) {
                return QUERY;
            }
            if (b == 4) {
                return TABLEVIEW;
            }
            StringBuilder sb = new StringBuilder("Invalid value: ");
            sb.append((int) b);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    OsResults(OsSharedRealm osSharedRealm, long j) {
        boolean z = false;
        this.sharedRealm = osSharedRealm;
        NativeContext nativeContext = osSharedRealm.context;
        this.context = nativeContext;
        this.nativePtr = j;
        nativeContext.addReference(this);
        this.loaded = getMode() != Mode.QUERY ? true : z;
        this.table = new Table(osSharedRealm, nativeGetTable(j));
    }

    OsResults(OsSharedRealm osSharedRealm, Table table, long j) {
        boolean z = false;
        this.sharedRealm = osSharedRealm;
        NativeContext nativeContext = osSharedRealm.context;
        this.context = nativeContext;
        this.table = table;
        this.nativePtr = j;
        nativeContext.addReference(this);
        this.loaded = getMode() != Mode.QUERY ? true : z;
    }

    private <T> void addTypeSpecificList(String str, RealmList<T> realmList, AddListTypeDelegate<T> addListTypeDelegate) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(getTable(), Collections.EMPTY_SET);
        addListTypeDelegate.addList(osObjectBuilder, realmList);
        try {
            nativeSetList(this.nativePtr, str, osObjectBuilder.getNativePtr());
        } finally {
            osObjectBuilder.close();
        }
    }

    public static OsResults createForBacklinks(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow, Table table, String str) {
        return new OsResults(osSharedRealm, table, nativeCreateResultsFromBacklinks(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr(), table.getNativePtr(), table.getColumnKey(str)));
    }

    public static OsResults createFromMap(OsSharedRealm osSharedRealm, long j) {
        return new OsResults(osSharedRealm, j);
    }

    public static OsResults createFromQuery(OsSharedRealm osSharedRealm, TableQuery tableQuery) {
        tableQuery.validateQuery();
        return new OsResults(osSharedRealm, tableQuery.getTable(), nativeCreateResults(osSharedRealm.getNativePtr(), tableQuery.getNativePtr()));
    }

    private static native Object nativeAggregate(long j, long j2, byte b);

    private static native void nativeClear(long j);

    private static native boolean nativeContains(long j, long j2);

    protected static native long nativeCreateResults(long j, long j2);

    private static native long nativeCreateResultsFromBacklinks(long j, long j2, long j3, long j4);

    private static native long nativeCreateSnapshot(long j);

    private static native void nativeDelete(long j, long j2);

    private static native boolean nativeDeleteFirst(long j);

    private static native boolean nativeDeleteLast(long j);

    private static native void nativeEvaluateQueryIfNeeded(long j, boolean z);

    private static native long nativeFirstRow(long j);

    private static native long nativeFreeze(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private static native byte nativeGetMode(long j);

    private static native long nativeGetRow(long j, int i);

    private static native long nativeGetTable(long j);

    private static native Object nativeGetValue(long j, int i);

    private static native long nativeIndexOf(long j, long j2);

    private static native boolean nativeIsValid(long j);

    private static native long nativeLastRow(long j);

    private static native void nativeSetBinary(long j, String str, @Nullable byte[] bArr);

    private static native void nativeSetBoolean(long j, String str, boolean z);

    private static native void nativeSetDecimal128(long j, String str, long j2, long j3);

    private static native void nativeSetDouble(long j, String str, double d);

    private static native void nativeSetFloat(long j, String str, float f);

    private static native void nativeSetInt(long j, String str, long j2);

    private static native void nativeSetList(long j, String str, long j2);

    private static native void nativeSetNull(long j, String str);

    private static native void nativeSetObject(long j, String str, long j2);

    private static native void nativeSetObjectId(long j, String str, String str2);

    private static native void nativeSetString(long j, String str, @Nullable String str2);

    private static native void nativeSetTimestamp(long j, String str, long j2);

    private static native void nativeSetUUID(long j, String str, String str2);

    private static native long nativeSize(long j);

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    private static native long nativeStringDescriptor(long j, String str, long j2);

    private static native long nativeWhere(long j);

    private static native String toJSON(long j, int i);

    public <T> void addListener(T t, OrderedRealmCollectionChangeListener<T> orderedRealmCollectionChangeListener) {
        if (this.observerPairs.isEmpty()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.add(new ObservableCollection.CollectionObserverPair(t, orderedRealmCollectionChangeListener));
    }

    public <T> void addListener(T t, RealmChangeListener<T> realmChangeListener) {
        addListener((OsResults) t, (OrderedRealmCollectionChangeListener<OsResults>) new ObservableCollection.RealmChangeListenerWrapper(realmChangeListener));
    }

    public Date aggregateDate(Aggregate aggregate, long j) {
        return (Date) nativeAggregate(this.nativePtr, j, aggregate.getValue());
    }

    public Number aggregateNumber(Aggregate aggregate, long j) {
        return (Number) nativeAggregate(this.nativePtr, j, aggregate.getValue());
    }

    public void clear() {
        nativeClear(this.nativePtr);
    }

    public boolean contains(UncheckedRow uncheckedRow) {
        return nativeContains(this.nativePtr, uncheckedRow.getNativePtr());
    }

    public OsResults createSnapshot() {
        if (this.isSnapshot) {
            return this;
        }
        OsResults osResults = new OsResults(this.sharedRealm, this.table, nativeCreateSnapshot(this.nativePtr));
        osResults.isSnapshot = true;
        return osResults;
    }

    public void delete(long j) {
        nativeDelete(this.nativePtr, j);
    }

    public boolean deleteFirst() {
        return nativeDeleteFirst(this.nativePtr);
    }

    public boolean deleteLast() {
        return nativeDeleteLast(this.nativePtr);
    }

    public OsResults distinct(@Nullable OsKeyPathMapping osKeyPathMapping, String[] strArr) {
        return new OsResults(this.sharedRealm, this.table, nativeStringDescriptor(this.nativePtr, TableQuery.buildDistinctDescriptor(strArr), osKeyPathMapping != null ? osKeyPathMapping.getNativePtr() : 0));
    }

    public UncheckedRow firstUncheckedRow() {
        long nativeFirstRow = nativeFirstRow(this.nativePtr);
        if (nativeFirstRow != 0) {
            return this.table.getUncheckedRowByPointer(nativeFirstRow);
        }
        return null;
    }

    public OsResults freeze(OsSharedRealm osSharedRealm) {
        OsResults osResults = new OsResults(osSharedRealm, this.table.freeze(osSharedRealm), nativeFreeze(this.nativePtr, osSharedRealm.getNativePtr()));
        if (isLoaded()) {
            osResults.load();
        }
        return osResults;
    }

    public Mode getMode() {
        return Mode.getByValue(nativeGetMode(this.nativePtr));
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.nativePtr;
    }

    public Table getTable() {
        return this.table;
    }

    public UncheckedRow getUncheckedRow(int i) {
        return this.table.getUncheckedRowByPointer(nativeGetRow(this.nativePtr, i));
    }

    public Object getValue(int i) {
        return nativeGetValue(this.nativePtr, i);
    }

    public int indexOf(UncheckedRow uncheckedRow) {
        long nativeIndexOf = nativeIndexOf(this.nativePtr, uncheckedRow.getNativePtr());
        return nativeIndexOf > 2147483647L ? Integer.MAX_VALUE : (int) nativeIndexOf;
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public boolean isValid() {
        return nativeIsValid(this.nativePtr);
    }

    public UncheckedRow lastUncheckedRow() {
        long nativeLastRow = nativeLastRow(this.nativePtr);
        if (nativeLastRow != 0) {
            return this.table.getUncheckedRowByPointer(nativeLastRow);
        }
        return null;
    }

    public void load() {
        if (!this.loaded) {
            nativeEvaluateQueryIfNeeded(this.nativePtr, false);
            notifyChangeListeners(0);
        }
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j) {
        EmptyLoadChangeSet emptyLoadChangeSet = j == 0 ? new EmptyLoadChangeSet() : new OsCollectionChangeSet(j, !isLoaded());
        if (!emptyLoadChangeSet.isEmpty() || !isLoaded()) {
            this.loaded = true;
            this.observerPairs.foreach(new ObservableCollection.Callback(emptyLoadChangeSet));
        }
    }

    public void removeAllListeners() {
        this.observerPairs.clear();
        nativeStopListening(this.nativePtr);
    }

    public <T> void removeListener(T t, OrderedRealmCollectionChangeListener<T> orderedRealmCollectionChangeListener) {
        this.observerPairs.remove(t, orderedRealmCollectionChangeListener);
        if (this.observerPairs.isEmpty()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public <T> void removeListener(T t, RealmChangeListener<T> realmChangeListener) {
        removeListener((OsResults) t, (OrderedRealmCollectionChangeListener<OsResults>) new ObservableCollection.RealmChangeListenerWrapper(realmChangeListener));
    }

    public void setBlob(String str, @Nullable byte[] bArr) {
        nativeSetBinary(this.nativePtr, str, bArr);
    }

    public void setBoolean(String str, boolean z) {
        nativeSetBoolean(this.nativePtr, str, z);
    }

    public void setBooleanList(String str, RealmList<Boolean> realmList) {
        addTypeSpecificList(str, realmList, new 6(this));
    }

    public void setByteArrayList(String str, RealmList<byte[]> realmList) {
        addTypeSpecificList(str, realmList, new 7(this));
    }

    public void setByteList(String str, RealmList<Byte> realmList) {
        addTypeSpecificList(str, realmList, new 2(this));
    }

    public void setDate(String str, @Nullable Date date) {
        if (date == null) {
            nativeSetNull(this.nativePtr, str);
        } else {
            nativeSetTimestamp(this.nativePtr, str, date.getTime());
        }
    }

    public void setDateList(String str, RealmList<Date> realmList) {
        addTypeSpecificList(str, realmList, new 8(this));
    }

    public void setDecimal128(String str, @Nullable Decimal128 decimal128) {
        if (decimal128 == null) {
            nativeSetNull(this.nativePtr, str);
        } else {
            nativeSetDecimal128(this.nativePtr, str, decimal128.f, decimal128.g);
        }
    }

    public void setDecimal128List(String str, RealmList<Decimal128> realmList) {
        addTypeSpecificList(str, realmList, new 12(this));
    }

    public void setDouble(String str, double d) {
        nativeSetDouble(this.nativePtr, str, d);
    }

    public void setDoubleList(String str, RealmList<Double> realmList) {
        addTypeSpecificList(str, realmList, new 10(this));
    }

    public void setFloat(String str, float f) {
        nativeSetFloat(this.nativePtr, str, f);
    }

    public void setFloatList(String str, RealmList<Float> realmList) {
        addTypeSpecificList(str, realmList, new 9(this));
    }

    public void setInt(String str, long j) {
        nativeSetInt(this.nativePtr, str, j);
    }

    public void setIntegerList(String str, RealmList<Integer> realmList) {
        addTypeSpecificList(str, realmList, new 4(this));
    }

    public void setLongList(String str, RealmList<Long> realmList) {
        addTypeSpecificList(str, realmList, new 5(this));
    }

    public void setModelList(String str, RealmList<RealmModel> realmList) {
        addTypeSpecificList(str, realmList, new 11(this));
    }

    public void setNull(String str) {
        nativeSetNull(this.nativePtr, str);
    }

    public void setObject(String str, @Nullable Row row) {
        long j;
        if (row == null) {
            setNull(str);
            return;
        }
        if (row instanceof UncheckedRow) {
            j = ((UncheckedRow) row).getNativePtr();
        } else if (row instanceof CheckedRow) {
            j = ((CheckedRow) row).getNativePtr();
        } else {
            StringBuilder sb = new StringBuilder("Unsupported Row type: ");
            sb.append(row.getClass().getCanonicalName());
            throw new UnsupportedOperationException(sb.toString());
        }
        nativeSetObject(this.nativePtr, str, j);
    }

    public void setObjectId(String str, @Nullable ObjectId objectId) {
        if (objectId == null) {
            nativeSetNull(this.nativePtr, str);
        } else {
            nativeSetObjectId(this.nativePtr, str, objectId.toString());
        }
    }

    public void setObjectIdList(String str, RealmList<ObjectId> realmList) {
        addTypeSpecificList(str, realmList, new 13(this));
    }

    public void setShortList(String str, RealmList<Short> realmList) {
        addTypeSpecificList(str, realmList, new 3(this));
    }

    public void setString(String str, @Nullable String str2) {
        nativeSetString(this.nativePtr, str, str2);
    }

    public void setStringList(String str, RealmList<String> realmList) {
        addTypeSpecificList(str, realmList, new 1(this));
    }

    public void setUUID(String str, @Nullable UUID uuid) {
        if (uuid == null) {
            nativeSetNull(this.nativePtr, str);
        } else {
            nativeSetUUID(this.nativePtr, str, uuid.toString());
        }
    }

    public void setUUIDList(String str, RealmList<UUID> realmList) {
        addTypeSpecificList(str, realmList, new 14(this));
    }

    public long size() {
        return nativeSize(this.nativePtr);
    }

    public OsResults sort(@Nullable OsKeyPathMapping osKeyPathMapping, String str, Sort sort) {
        return new OsResults(this.sharedRealm, this.table, nativeStringDescriptor(this.nativePtr, TableQuery.buildSortDescriptor(new String[]{str}, new Sort[]{sort}), osKeyPathMapping != null ? osKeyPathMapping.getNativePtr() : 0));
    }

    public OsResults sort(@Nullable OsKeyPathMapping osKeyPathMapping, String[] strArr, Sort[] sortArr) {
        if (sortArr == null || sortArr.length == 0) {
            throw new IllegalArgumentException("You must provide at least one sort order.");
        } else if (strArr.length == sortArr.length) {
            return new OsResults(this.sharedRealm, this.table, nativeStringDescriptor(this.nativePtr, TableQuery.buildSortDescriptor(strArr, sortArr), osKeyPathMapping != null ? osKeyPathMapping.getNativePtr() : 0));
        } else {
            throw new IllegalArgumentException("Number of fields and sort orders do not match.");
        }
    }

    public String toJSON(int i) {
        return toJSON(this.nativePtr, i);
    }

    public TableQuery where() {
        return new TableQuery(this.context, this.table, nativeWhere(this.nativePtr));
    }
}
