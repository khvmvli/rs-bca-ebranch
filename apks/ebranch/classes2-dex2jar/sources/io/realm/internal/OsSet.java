package io.realm.internal;

import io.realm.SetChangeSet;
import io.realm.internal.ObservableSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsSet.class */
public class OsSet implements NativeObject, OsCollection {
    public static final int NOT_FOUND;
    private static final int VALUE_FOUND;
    private static final int VALUE_NOT_FOUND;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final NativeContext context;
    private final long nativePtr;
    private final OsSharedRealm osSharedRealm;
    private final Table targetTable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.realm.internal.OsSet$1 */
    /* loaded from: classes2-dex2jar.jar:io/realm/internal/OsSet$1.class */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation;

        static {
            int[] iArr = new int[ExternalCollectionOperation.values().length];
            $SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation = iArr;
            try {
                iArr[ExternalCollectionOperation.CONTAINS_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation[ExternalCollectionOperation.ADD_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation[ExternalCollectionOperation.REMOVE_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                $SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation[ExternalCollectionOperation.RETAIN_ALL.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/realm/internal/OsSet$ExternalCollectionOperation.class */
    public enum ExternalCollectionOperation {
        CONTAINS_ALL,
        ADD_ALL,
        REMOVE_ALL,
        RETAIN_ALL
    }

    private OsSet(OsSharedRealm osSharedRealm, long j, @Nullable Table table) {
        this.osSharedRealm = osSharedRealm;
        this.nativePtr = j;
        NativeContext nativeContext = osSharedRealm.context;
        this.context = nativeContext;
        this.targetTable = table;
        nativeContext.addReference(this);
    }

    public OsSet(UncheckedRow uncheckedRow, long j) {
        OsSharedRealm sharedRealm = uncheckedRow.getTable().getSharedRealm();
        this.osSharedRealm = sharedRealm;
        long[] nativeCreate = nativeCreate(sharedRealm.getNativePtr(), uncheckedRow.getNativePtr(), j);
        this.nativePtr = nativeCreate[0];
        NativeContext nativeContext = sharedRealm.context;
        this.context = nativeContext;
        nativeContext.addReference(this);
        if (nativeCreate[1] != 0) {
            this.targetTable = new Table(sharedRealm, nativeCreate[1]);
        } else {
            this.targetTable = null;
        }
    }

    private static native boolean nativeAddAllRealmAnyCollection(long j, long j2);

    private static native long[] nativeAddBinary(long j, byte[] bArr);

    private static native long[] nativeAddBoolean(long j, boolean z);

    private static native long[] nativeAddDate(long j, long j2);

    private static native long[] nativeAddDecimal128(long j, long j2, long j3);

    private static native long[] nativeAddDouble(long j, double d);

    private static native long[] nativeAddFloat(long j, float f);

    private static native long[] nativeAddLong(long j, long j2);

    private static native long[] nativeAddNull(long j);

    private static native long[] nativeAddObjectId(long j, String str);

    private static native long[] nativeAddRealmAny(long j, long j2);

    private static native long[] nativeAddRow(long j, long j2);

    private static native long[] nativeAddString(long j, String str);

    private static native long[] nativeAddUUID(long j, String str);

    private static native boolean nativeAsymmetricDifference(long j, long j2);

    private static native void nativeClear(long j);

    private static native boolean nativeContainsAll(long j, long j2);

    private static native boolean nativeContainsAllRealmAnyCollection(long j, long j2);

    private static native boolean nativeContainsBinary(long j, byte[] bArr);

    private static native boolean nativeContainsBoolean(long j, boolean z);

    private static native boolean nativeContainsDate(long j, long j2);

    private static native boolean nativeContainsDecimal128(long j, long j2, long j3);

    private static native boolean nativeContainsDouble(long j, double d);

    private static native boolean nativeContainsFloat(long j, float f);

    private static native boolean nativeContainsLong(long j, long j2);

    private static native boolean nativeContainsNull(long j);

    private static native boolean nativeContainsObjectId(long j, String str);

    private static native boolean nativeContainsRealmAny(long j, long j2);

    private static native boolean nativeContainsRow(long j, long j2);

    private static native boolean nativeContainsString(long j, String str);

    private static native boolean nativeContainsUUID(long j, String str);

    private static native long[] nativeCreate(long j, long j2, long j3);

    private static native void nativeDeleteAll(long j);

    private static native long nativeFreeze(long j, long j2);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetQuery(long j);

    private static native long nativeGetRealmAny(long j, int i);

    private static native long nativeGetRow(long j, int i);

    private static native Object nativeGetValueAtIndex(long j, int i);

    private static native boolean nativeIntersect(long j, long j2);

    private static native boolean nativeIsValid(long j);

    private static native boolean nativeRemoveAllRealmAnyCollection(long j, long j2);

    private static native long[] nativeRemoveBinary(long j, byte[] bArr);

    private static native long[] nativeRemoveBoolean(long j, boolean z);

    private static native long[] nativeRemoveDate(long j, long j2);

    private static native long[] nativeRemoveDecimal128(long j, long j2, long j3);

    private static native long[] nativeRemoveDouble(long j, double d);

    private static native long[] nativeRemoveFloat(long j, float f);

    private static native long[] nativeRemoveLong(long j, long j2);

    private static native long[] nativeRemoveNull(long j);

    private static native long[] nativeRemoveObjectId(long j, String str);

    private static native long[] nativeRemoveRealmAny(long j, long j2);

    private static native long[] nativeRemoveRow(long j, long j2);

    private static native long[] nativeRemoveString(long j, String str);

    private static native long[] nativeRemoveUUID(long j, String str);

    private static native boolean nativeRetainAllRealmAnyCollection(long j, long j2);

    private static native long nativeSize(long j);

    private static native void nativeStartListening(long j, ObservableSet observableSet);

    private static native void nativeStopListening(long j);

    private static native boolean nativeUnion(long j, long j2);

    private boolean retainAllInternal(NativeRealmAnyCollection nativeRealmAnyCollection) {
        if (size() == 0) {
            return false;
        }
        if (nativeRealmAnyCollection.getSize() != 0) {
            return nativeRetainAllRealmAnyCollection(this.nativePtr, nativeRealmAnyCollection.getNativePtr());
        }
        clear();
        return true;
    }

    public boolean add(@Nullable Boolean bool) {
        boolean z = true;
        if ((bool == null ? nativeAddNull(this.nativePtr) : nativeAddBoolean(this.nativePtr, bool.booleanValue()))[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean add(@Nullable Byte b) {
        boolean z = true;
        if ((b == null ? nativeAddNull(this.nativePtr) : nativeAddLong(this.nativePtr, b.longValue()))[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean add(@Nullable Double d) {
        boolean z = true;
        if ((d == null ? nativeAddNull(this.nativePtr) : nativeAddDouble(this.nativePtr, d.doubleValue()))[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean add(@Nullable Float f) {
        boolean z = true;
        if ((f == null ? nativeAddNull(this.nativePtr) : nativeAddFloat(this.nativePtr, f.floatValue()))[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean add(@Nullable Integer num) {
        boolean z = true;
        if ((num == null ? nativeAddNull(this.nativePtr) : nativeAddLong(this.nativePtr, num.longValue()))[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean add(@Nullable Long l) {
        boolean z = true;
        if ((l == null ? nativeAddNull(this.nativePtr) : nativeAddLong(this.nativePtr, l.longValue()))[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean add(@Nullable Short sh) {
        boolean z = true;
        if ((sh == null ? nativeAddNull(this.nativePtr) : nativeAddLong(this.nativePtr, sh.longValue()))[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean add(@Nullable String str) {
        boolean z = true;
        if ((str == null ? nativeAddNull(this.nativePtr) : nativeAddString(this.nativePtr, str))[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean add(@Nullable Date date) {
        boolean z = true;
        if ((date == null ? nativeAddNull(this.nativePtr) : nativeAddDate(this.nativePtr, date.getTime()))[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean add(@Nullable UUID uuid) {
        boolean z = true;
        if ((uuid == null ? nativeAddNull(this.nativePtr) : nativeAddUUID(this.nativePtr, uuid.toString()))[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean add(@Nullable Decimal128 decimal128) {
        boolean z = true;
        if ((decimal128 == null ? nativeAddNull(this.nativePtr) : nativeAddDecimal128(this.nativePtr, decimal128.f, decimal128.g))[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean add(@Nullable ObjectId objectId) {
        boolean z = true;
        if ((objectId == null ? nativeAddNull(this.nativePtr) : nativeAddObjectId(this.nativePtr, objectId.toString()))[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean add(@Nullable byte[] bArr) {
        boolean z = true;
        if ((bArr == null ? nativeAddNull(this.nativePtr) : nativeAddBinary(this.nativePtr, bArr))[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean addRealmAny(long j) {
        boolean z = true;
        if (nativeAddRealmAny(this.nativePtr, j)[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean addRow(long j) {
        boolean z = true;
        if (nativeAddRow(this.nativePtr, j)[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean asymmetricDifference(OsSet osSet) {
        return nativeAsymmetricDifference(this.nativePtr, osSet.getNativePtr());
    }

    public void clear() {
        nativeClear(this.nativePtr);
    }

    public boolean collectionFunnel(NativeRealmAnyCollection nativeRealmAnyCollection, ExternalCollectionOperation externalCollectionOperation) {
        int i = AnonymousClass1.$SwitchMap$io$realm$internal$OsSet$ExternalCollectionOperation[externalCollectionOperation.ordinal()];
        if (i == 1) {
            return nativeContainsAllRealmAnyCollection(this.nativePtr, nativeRealmAnyCollection.getNativePtr());
        }
        if (i == 2) {
            return nativeAddAllRealmAnyCollection(this.nativePtr, nativeRealmAnyCollection.getNativePtr());
        }
        if (i == 3) {
            return nativeRemoveAllRealmAnyCollection(this.nativePtr, nativeRealmAnyCollection.getNativePtr());
        }
        if (i == 4) {
            return retainAllInternal(nativeRealmAnyCollection);
        }
        StringBuilder sb = new StringBuilder("Unexpected value: ");
        sb.append(externalCollectionOperation);
        throw new IllegalStateException(sb.toString());
    }

    public boolean contains(@Nullable Boolean bool) {
        return bool == null ? nativeContainsNull(this.nativePtr) : nativeContainsBoolean(this.nativePtr, bool.booleanValue());
    }

    public boolean contains(@Nullable Double d) {
        return d == null ? nativeContainsNull(this.nativePtr) : nativeContainsDouble(this.nativePtr, d.doubleValue());
    }

    public boolean contains(@Nullable Float f) {
        return f == null ? nativeContainsNull(this.nativePtr) : nativeContainsFloat(this.nativePtr, f.floatValue());
    }

    public boolean contains(@Nullable Long l) {
        return l == null ? nativeContainsNull(this.nativePtr) : nativeContainsLong(this.nativePtr, l.longValue());
    }

    public boolean contains(@Nullable String str) {
        return str == null ? nativeContainsNull(this.nativePtr) : nativeContainsString(this.nativePtr, str);
    }

    public boolean contains(@Nullable Date date) {
        return date == null ? nativeContainsNull(this.nativePtr) : nativeContainsDate(this.nativePtr, date.getTime());
    }

    public boolean contains(@Nullable UUID uuid) {
        return uuid == null ? nativeContainsNull(this.nativePtr) : nativeContainsUUID(this.nativePtr, uuid.toString());
    }

    public boolean contains(@Nullable Decimal128 decimal128) {
        return decimal128 == null ? nativeContainsNull(this.nativePtr) : nativeContainsDecimal128(this.nativePtr, decimal128.f, decimal128.g);
    }

    public boolean contains(@Nullable ObjectId objectId) {
        return objectId == null ? nativeContainsNull(this.nativePtr) : nativeContainsObjectId(this.nativePtr, objectId.toString());
    }

    public boolean contains(@Nullable byte[] bArr) {
        return bArr == null ? nativeContainsNull(this.nativePtr) : nativeContainsBinary(this.nativePtr, bArr);
    }

    public boolean containsAll(OsSet osSet) {
        return nativeContainsAll(this.nativePtr, osSet.getNativePtr());
    }

    public boolean containsRealmAny(long j) {
        return nativeContainsRealmAny(this.nativePtr, j);
    }

    public boolean containsRow(long j) {
        return nativeContainsRow(this.nativePtr, j);
    }

    public void deleteAll() {
        nativeDeleteAll(this.nativePtr);
    }

    public OsSet freeze(OsSharedRealm osSharedRealm) {
        return new OsSet(osSharedRealm, nativeFreeze(this.nativePtr, osSharedRealm.getNativePtr()), this.targetTable);
    }

    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public TableQuery getQuery() {
        return new TableQuery(this.context, this.targetTable, nativeGetQuery(this.nativePtr));
    }

    public long getRealmAny(int i) {
        return nativeGetRealmAny(this.nativePtr, i);
    }

    public long getRow(int i) {
        return nativeGetRow(this.nativePtr, i);
    }

    public Table getTargetTable() {
        return this.targetTable;
    }

    public Object getValueAtIndex(int i) {
        return nativeGetValueAtIndex(this.nativePtr, i);
    }

    public boolean intersect(OsSet osSet) {
        return nativeIntersect(this.nativePtr, osSet.getNativePtr());
    }

    @Override // io.realm.internal.OsCollection
    public boolean isValid() {
        return nativeIsValid(this.nativePtr);
    }

    public <T> void notifyChangeListeners(long j, ObserverPairList<ObservableSet.SetObserverPair<T>> observerPairList) {
        SetChangeSet setChangeSet = new SetChangeSet(new OsCollectionChangeSet(j, false));
        if (!setChangeSet.isEmpty()) {
            observerPairList.foreach(new ObservableSet.Callback(setChangeSet));
        }
    }

    public boolean remove(@Nullable Boolean bool) {
        boolean z = true;
        if ((bool == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveBoolean(this.nativePtr, bool.booleanValue()))[1] != 1) {
            z = false;
        }
        return z;
    }

    public boolean remove(@Nullable Byte b) {
        boolean z = true;
        if ((b == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveLong(this.nativePtr, b.longValue()))[1] != 1) {
            z = false;
        }
        return z;
    }

    public boolean remove(@Nullable Double d) {
        boolean z = true;
        if ((d == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveDouble(this.nativePtr, d.doubleValue()))[1] != 1) {
            z = false;
        }
        return z;
    }

    public boolean remove(@Nullable Float f) {
        boolean z = true;
        if ((f == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveFloat(this.nativePtr, f.floatValue()))[1] != 1) {
            z = false;
        }
        return z;
    }

    public boolean remove(@Nullable Integer num) {
        boolean z = true;
        if ((num == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveLong(this.nativePtr, num.longValue()))[1] != 1) {
            z = false;
        }
        return z;
    }

    public boolean remove(@Nullable Long l) {
        boolean z = true;
        if ((l == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveLong(this.nativePtr, l.longValue()))[1] != 1) {
            z = false;
        }
        return z;
    }

    public boolean remove(@Nullable Short sh) {
        boolean z = true;
        if ((sh == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveLong(this.nativePtr, sh.longValue()))[1] != 1) {
            z = false;
        }
        return z;
    }

    public boolean remove(@Nullable String str) {
        boolean z = true;
        if ((str == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveString(this.nativePtr, str))[1] != 1) {
            z = false;
        }
        return z;
    }

    public boolean remove(@Nullable Date date) {
        boolean z = true;
        if ((date == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveDate(this.nativePtr, date.getTime()))[1] != 1) {
            z = false;
        }
        return z;
    }

    public boolean remove(@Nullable UUID uuid) {
        boolean z = true;
        if ((uuid == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveUUID(this.nativePtr, uuid.toString()))[1] != 1) {
            z = false;
        }
        return z;
    }

    public boolean remove(@Nullable Decimal128 decimal128) {
        boolean z = true;
        if ((decimal128 == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveDecimal128(this.nativePtr, decimal128.f, decimal128.g))[1] != 1) {
            z = false;
        }
        return z;
    }

    public boolean remove(@Nullable ObjectId objectId) {
        boolean z = true;
        if ((objectId == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveObjectId(this.nativePtr, objectId.toString()))[1] != 1) {
            z = false;
        }
        return z;
    }

    public boolean remove(@Nullable byte[] bArr) {
        boolean z = true;
        if ((bArr == null ? nativeRemoveNull(this.nativePtr) : nativeRemoveBinary(this.nativePtr, bArr))[1] != 1) {
            z = false;
        }
        return z;
    }

    public boolean removeRealmAny(long j) {
        boolean z = true;
        if (nativeRemoveRealmAny(this.nativePtr, j)[1] == 0) {
            z = false;
        }
        return z;
    }

    public boolean removeRow(long j) {
        boolean z = true;
        if (nativeRemoveRow(this.nativePtr, j)[1] == 0) {
            z = false;
        }
        return z;
    }

    public long size() {
        return nativeSize(this.nativePtr);
    }

    public void startListening(ObservableSet observableSet) {
        nativeStartListening(this.nativePtr, observableSet);
    }

    public void stopListening() {
        nativeStopListening(this.nativePtr);
    }

    public boolean union(OsSet osSet) {
        return nativeUnion(this.nativePtr, osSet.getNativePtr());
    }
}
