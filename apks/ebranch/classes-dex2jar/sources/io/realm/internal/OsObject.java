package io.realm.internal;

import io.realm.ObjectChangeSet;
import io.realm.RealmFieldType;
import io.realm.RealmModel;
import io.realm.RealmObjectChangeListener;
import io.realm.exceptions.RealmException;
import io.realm.internal.ObserverPairList;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.ObjectId;
/* loaded from: classes-dex2jar.jar:io/realm/internal/OsObject.class */
public class OsObject implements NativeObject {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;
    private ObserverPairList<ObjectObserverPair> observerPairs = new ObserverPairList<>();

    /* loaded from: classes-dex2jar.jar:io/realm/internal/OsObject$ObjectObserverPair.class */
    public static class ObjectObserverPair<T extends RealmModel> extends ObserverPairList.ObserverPair<T, RealmObjectChangeListener<T>> {
        public ObjectObserverPair(T t, RealmObjectChangeListener<T> realmObjectChangeListener) {
            super(t, realmObjectChangeListener);
        }

        public void onChange(T t, @Nullable ObjectChangeSet objectChangeSet) {
            ((RealmObjectChangeListener) this.listener).onChange(t, objectChangeSet);
        }
    }

    public OsObject(OsSharedRealm osSharedRealm, UncheckedRow uncheckedRow) {
        this.nativePtr = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr());
        osSharedRealm.context.addReference(this);
    }

    public static UncheckedRow create(Table table) {
        return new UncheckedRow(table.getSharedRealm().context, table, nativeCreateNewObject(table.getNativePtr()));
    }

    public static long createEmbeddedObject(Table table, long j, long j2) {
        return nativeCreateEmbeddedObject(table.getNativePtr(), j, j2);
    }

    public static long createRow(Table table) {
        return nativeCreateRow(table.getNativePtr());
    }

    public static long createRowWithPrimaryKey(Table table, long j, @Nullable Object obj) {
        RealmFieldType columnType = table.getColumnType(j);
        OsSharedRealm sharedRealm = table.getSharedRealm();
        if (columnType == RealmFieldType.STRING) {
            if (obj == null || (obj instanceof String)) {
                return nativeCreateRowWithStringPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), j, (String) obj);
            }
            StringBuilder sb = new StringBuilder("Primary key value is not a String: ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        } else if (columnType == RealmFieldType.INTEGER) {
            return nativeCreateRowWithLongPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), j, obj == null ? 0 : Long.parseLong(obj.toString()), obj == null);
        } else {
            String str = null;
            String str2 = null;
            if (columnType == RealmFieldType.OBJECT_ID) {
                if (obj == null || (obj instanceof ObjectId)) {
                    if (obj != null) {
                        str2 = obj.toString();
                    }
                    return nativeCreateRowWithObjectIdPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), j, str2);
                }
                StringBuilder sb2 = new StringBuilder("Primary key value is not an ObjectId: ");
                sb2.append(obj);
                throw new IllegalArgumentException(sb2.toString());
            } else if (columnType != RealmFieldType.UUID) {
                StringBuilder sb3 = new StringBuilder("Cannot check for duplicate rows for unsupported primary key type: ");
                sb3.append(columnType);
                throw new RealmException(sb3.toString());
            } else if (obj == null || (obj instanceof UUID)) {
                if (obj != null) {
                    str = obj.toString();
                }
                return nativeCreateRowWithUUIDPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), j, str);
            } else {
                StringBuilder sb4 = new StringBuilder("Primary key value is not an UUID: ");
                sb4.append(obj);
                throw new IllegalArgumentException(sb4.toString());
            }
        }
    }

    public static UncheckedRow createWithPrimaryKey(Table table, @Nullable Object obj) {
        long andVerifyPrimaryKeyColumnIndex = getAndVerifyPrimaryKeyColumnIndex(table);
        RealmFieldType columnType = table.getColumnType(andVerifyPrimaryKeyColumnIndex);
        OsSharedRealm sharedRealm = table.getSharedRealm();
        if (columnType == RealmFieldType.STRING) {
            if (obj == null || (obj instanceof String)) {
                return new UncheckedRow(sharedRealm.context, table, nativeCreateNewObjectWithStringPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, (String) obj));
            }
            StringBuilder sb = new StringBuilder("Primary key value is not a String: ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString());
        } else if (columnType == RealmFieldType.INTEGER) {
            return new UncheckedRow(sharedRealm.context, table, nativeCreateNewObjectWithLongPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? 0 : Long.parseLong(obj.toString()), obj == null));
        } else if (columnType == RealmFieldType.OBJECT_ID) {
            return new UncheckedRow(sharedRealm.context, table, nativeCreateNewObjectWithObjectIdPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? null : obj.toString()));
        } else if (columnType == RealmFieldType.UUID) {
            return new UncheckedRow(sharedRealm.context, table, nativeCreateNewObjectWithUUIDPrimaryKey(sharedRealm.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, obj == null ? null : obj.toString()));
        } else {
            StringBuilder sb2 = new StringBuilder("Cannot check for duplicate rows for unsupported primary key type: ");
            sb2.append(columnType);
            throw new RealmException(sb2.toString());
        }
    }

    private static long getAndVerifyPrimaryKeyColumnIndex(Table table) {
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(table.getSharedRealm(), table.getClassName());
        if (primaryKeyForObject != null) {
            return table.getColumnKey(primaryKeyForObject);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(table.getName());
        sb.append(" has no primary key defined.");
        throw new IllegalStateException(sb.toString());
    }

    private static native long nativeCreate(long j, long j2);

    private static native long nativeCreateEmbeddedObject(long j, long j2, long j3);

    private static native long nativeCreateNewObject(long j);

    private static native long nativeCreateNewObjectWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateNewObjectWithStringPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateNewObjectWithUUIDPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateRow(long j);

    private static native long nativeCreateRowWithLongPrimaryKey(long j, long j2, long j3, long j4, boolean z);

    private static native long nativeCreateRowWithObjectIdPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateRowWithStringPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeCreateRowWithUUIDPrimaryKey(long j, long j2, long j3, @Nullable String str);

    private static native long nativeGetFinalizerPtr();

    private native void nativeStartListening(long j);

    private native void nativeStopListening(long j);

    private void notifyChangeListeners(String[] strArr) {
        this.observerPairs.foreach(new Callback(strArr));
    }

    public <T extends RealmModel> void addListener(T t, RealmObjectChangeListener<T> realmObjectChangeListener) {
        if (this.observerPairs.isEmpty()) {
            nativeStartListening(this.nativePtr);
        }
        this.observerPairs.add(new ObjectObserverPair(t, realmObjectChangeListener));
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.nativePtr;
    }

    public <T extends RealmModel> void removeListener(T t) {
        this.observerPairs.removeByObserver(t);
        if (this.observerPairs.isEmpty()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public <T extends RealmModel> void removeListener(T t, RealmObjectChangeListener<T> realmObjectChangeListener) {
        this.observerPairs.remove(t, realmObjectChangeListener);
        if (this.observerPairs.isEmpty()) {
            nativeStopListening(this.nativePtr);
        }
    }

    public void setObserverPairs(ObserverPairList<ObjectObserverPair> observerPairList) {
        if (this.observerPairs.isEmpty()) {
            this.observerPairs = observerPairList;
            if (!observerPairList.isEmpty()) {
                nativeStartListening(this.nativePtr);
                return;
            }
            return;
        }
        throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
    }
}
