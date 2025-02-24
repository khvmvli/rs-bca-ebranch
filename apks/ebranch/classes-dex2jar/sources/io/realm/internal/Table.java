package io.realm.internal;

import com.facebook.stetho.dumpapp.Framer;
import io.realm.RealmFieldType;
import io.realm.exceptions.RealmPrimaryKeyConstraintException;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Nullable;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes-dex2jar.jar:io/realm/internal/Table.class */
public class Table implements NativeObject {
    public static final int CLASS_NAME_MAX_LENGTH;
    public static final long INFINITE;
    public static final int MAX_BINARY_SIZE;
    public static final int MAX_STRING_SIZE;
    public static final boolean NOT_NULLABLE;
    public static final int NO_MATCH;
    public static final boolean NULLABLE;
    private static final int TABLE_NAME_MAX_LENGTH;
    private static final String TABLE_PREFIX;
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final NativeContext context;
    private final long nativeTableRefPtr;
    private final OsSharedRealm sharedRealm;

    static {
        String tablePrefix = Util.getTablePrefix();
        TABLE_PREFIX = tablePrefix;
        CLASS_NAME_MAX_LENGTH = 63 - tablePrefix.length();
    }

    public Table(OsSharedRealm osSharedRealm, long j) {
        NativeContext nativeContext = osSharedRealm.context;
        this.context = nativeContext;
        this.sharedRealm = osSharedRealm;
        this.nativeTableRefPtr = j;
        nativeContext.addReference(this);
    }

    @Nullable
    public static String getClassNameForTable(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String str2 = TABLE_PREFIX;
        return !str.startsWith(str2) ? str : str.substring(str2.length());
    }

    public static String getTableNameForClass(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TABLE_PREFIX);
        sb.append(str);
        return sb.toString();
    }

    private boolean isPrimaryKey(long j) {
        return getColumnName(j).equals(OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, getClassName()));
    }

    private native long nativeAddColumn(long j, int i, String str, boolean z);

    private native long nativeAddColumnDictionaryLink(long j, int i, String str, long j2);

    private native long nativeAddColumnLink(long j, int i, String str, long j2);

    private native long nativeAddColumnSetLink(long j, int i, String str, long j2);

    private native long nativeAddPrimitiveDictionaryColumn(long j, int i, String str, boolean z);

    private native long nativeAddPrimitiveListColumn(long j, int i, String str, boolean z);

    private native long nativeAddPrimitiveSetColumn(long j, int i, String str, boolean z);

    private native void nativeAddSearchIndex(long j, long j2);

    private native void nativeClear(long j);

    private native void nativeConvertColumnToNotNullable(long j, long j2, boolean z);

    private native void nativeConvertColumnToNullable(long j, long j2, boolean z);

    private native long nativeCountDouble(long j, long j2, double d);

    private native long nativeCountFloat(long j, long j2, float f);

    private native long nativeCountLong(long j, long j2, long j3);

    private native long nativeCountString(long j, long j2, String str);

    private native long nativeFindFirstBool(long j, long j2, boolean z);

    public static native long nativeFindFirstDecimal128(long j, long j2, long j3, long j4);

    private native long nativeFindFirstDouble(long j, long j2, double d);

    private native long nativeFindFirstFloat(long j, long j2, float f);

    public static native long nativeFindFirstInt(long j, long j2, long j3);

    public static native long nativeFindFirstNull(long j, long j2);

    public static native long nativeFindFirstObjectId(long j, long j2, String str);

    public static native long nativeFindFirstString(long j, long j2, String str);

    private native long nativeFindFirstTimestamp(long j, long j2, long j3);

    public static native long nativeFindFirstUUID(long j, long j2, String str);

    private static native long nativeFreeze(long j, long j2);

    private native boolean nativeGetBoolean(long j, long j2, long j3);

    private native byte[] nativeGetByteArray(long j, long j2, long j3);

    private native long nativeGetColumnCount(long j);

    private native long nativeGetColumnKey(long j, String str);

    private native String nativeGetColumnName(long j, long j2);

    private native String[] nativeGetColumnNames(long j);

    private native int nativeGetColumnType(long j, long j2);

    private native long[] nativeGetDecimal128(long j, long j2, long j3);

    private native double nativeGetDouble(long j, long j2, long j3);

    private static native long nativeGetFinalizerPtr();

    private native float nativeGetFloat(long j, long j2, long j3);

    private native long nativeGetLink(long j, long j2, long j3);

    private native long nativeGetLinkTarget(long j, long j2);

    private native long nativeGetLong(long j, long j2, long j3);

    private native String nativeGetName(long j);

    private native String nativeGetObjectId(long j, long j2, long j3);

    private native String nativeGetString(long j, long j2, long j3);

    private native long nativeGetTimestamp(long j, long j2, long j3);

    private native boolean nativeHasSameSchema(long j, long j2);

    private native boolean nativeHasSearchIndex(long j, long j2);

    public static native void nativeIncrementLong(long j, long j2, long j3, long j4);

    private native boolean nativeIsColumnNullable(long j, long j2);

    private static native boolean nativeIsEmbedded(long j);

    private native boolean nativeIsNull(long j, long j2, long j3);

    private native boolean nativeIsNullLink(long j, long j2, long j3);

    private native boolean nativeIsValid(long j);

    private native void nativeMoveLastOver(long j, long j2);

    public static native void nativeNullifyLink(long j, long j2, long j3);

    private native void nativeRemoveColumn(long j, long j2);

    private native void nativeRemoveSearchIndex(long j, long j2);

    private native void nativeRenameColumn(long j, long j2, String str);

    public static native void nativeSetBoolean(long j, long j2, long j3, boolean z, boolean z2);

    public static native void nativeSetByteArray(long j, long j2, long j3, byte[] bArr, boolean z);

    public static native void nativeSetDecimal128(long j, long j2, long j3, long j4, long j5, boolean z);

    public static native void nativeSetDouble(long j, long j2, long j3, double d, boolean z);

    private static native boolean nativeSetEmbedded(long j, boolean z);

    public static native void nativeSetFloat(long j, long j2, long j3, float f, boolean z);

    public static native void nativeSetLink(long j, long j2, long j3, long j4, boolean z);

    public static native void nativeSetLong(long j, long j2, long j3, long j4, boolean z);

    public static native void nativeSetNull(long j, long j2, long j3, boolean z);

    public static native void nativeSetObjectId(long j, long j2, long j3, String str, boolean z);

    public static native void nativeSetRealmAny(long j, long j2, long j3, long j4, boolean z);

    public static native void nativeSetString(long j, long j2, long j3, String str, boolean z);

    public static native void nativeSetTimestamp(long j, long j2, long j3, long j4, boolean z);

    public static native void nativeSetUUID(long j, long j2, long j3, String str, boolean z);

    private native long nativeSize(long j);

    private native long nativeWhere(long j);

    public static void throwDuplicatePrimaryKeyException(Object obj) {
        StringBuilder sb = new StringBuilder("Value already exists: ");
        sb.append(obj);
        throw new RealmPrimaryKeyConstraintException(sb.toString());
    }

    private static void throwImmutable() {
        throw new IllegalStateException("Cannot modify managed objects outside of a write transaction.");
    }

    private void verifyColumnName(String str) {
        if (str.length() > 63) {
            throw new IllegalArgumentException("Column names are currently limited to max 63 characters.");
        }
    }

    public long addColumn(RealmFieldType realmFieldType, String str) {
        return addColumn(realmFieldType, str, false);
    }

    public long addColumn(RealmFieldType realmFieldType, String str, boolean z) {
        verifyColumnName(str);
        switch (1.$SwitchMap$io$realm$RealmFieldType[realmFieldType.ordinal()]) {
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
                return nativeAddColumn(this.nativeTableRefPtr, realmFieldType.getNativeValue(), str, z);
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return nativeAddPrimitiveListColumn(this.nativeTableRefPtr, realmFieldType.getNativeValue() - Property.TYPE_ARRAY, str, z);
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
            case 32:
            case Framer.ENTER_FRAME_PREFIX:
                return nativeAddPrimitiveDictionaryColumn(this.nativeTableRefPtr, realmFieldType.getNativeValue() - Property.TYPE_DICTIONARY, str, z);
            case 34:
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                return nativeAddPrimitiveSetColumn(this.nativeTableRefPtr, realmFieldType.getNativeValue() - Property.TYPE_SET, str, z);
            default:
                StringBuilder sb = new StringBuilder("Unsupported type: ");
                sb.append(realmFieldType);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public long addColumnDictionaryLink(RealmFieldType realmFieldType, String str, Table table) {
        verifyColumnName(str);
        return nativeAddColumnDictionaryLink(this.nativeTableRefPtr, realmFieldType.getNativeValue(), str, table.nativeTableRefPtr);
    }

    public long addColumnLink(RealmFieldType realmFieldType, String str, Table table) {
        verifyColumnName(str);
        return nativeAddColumnLink(this.nativeTableRefPtr, realmFieldType.getNativeValue(), str, table.nativeTableRefPtr);
    }

    public long addColumnSetLink(RealmFieldType realmFieldType, String str, Table table) {
        verifyColumnName(str);
        return nativeAddColumnSetLink(this.nativeTableRefPtr, realmFieldType.getNativeValue(), str, table.nativeTableRefPtr);
    }

    public void addSearchIndex(long j) {
        checkImmutable();
        nativeAddSearchIndex(this.nativeTableRefPtr, j);
    }

    public void checkImmutable() {
        if (isImmutable()) {
            throwImmutable();
        }
    }

    public void clear() {
        checkImmutable();
        nativeClear(this.nativeTableRefPtr);
    }

    public void convertColumnToNotNullable(long j) {
        if (!this.sharedRealm.isSyncRealm()) {
            nativeConvertColumnToNotNullable(this.nativeTableRefPtr, j, isPrimaryKey(j));
            return;
        }
        throw new IllegalStateException("This method is only available for non-synchronized Realms");
    }

    public void convertColumnToNullable(long j) {
        if (!this.sharedRealm.isSyncRealm()) {
            nativeConvertColumnToNullable(this.nativeTableRefPtr, j, isPrimaryKey(j));
            return;
        }
        throw new IllegalStateException("This method is only available for non-synchronized Realms");
    }

    public long count(long j, double d) {
        return nativeCountDouble(this.nativeTableRefPtr, j, d);
    }

    public long count(long j, float f) {
        return nativeCountFloat(this.nativeTableRefPtr, j, f);
    }

    public long count(long j, long j2) {
        return nativeCountLong(this.nativeTableRefPtr, j, j2);
    }

    public long count(long j, String str) {
        return nativeCountString(this.nativeTableRefPtr, j, str);
    }

    public long findFirstBoolean(long j, boolean z) {
        return nativeFindFirstBool(this.nativeTableRefPtr, j, z);
    }

    public long findFirstDate(long j, Date date) {
        if (date != null) {
            return nativeFindFirstTimestamp(this.nativeTableRefPtr, j, date.getTime());
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public long findFirstDecimal128(long j, Decimal128 decimal128) {
        if (decimal128 != null) {
            return nativeFindFirstDecimal128(this.nativeTableRefPtr, j, decimal128.f, decimal128.g);
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public long findFirstDouble(long j, double d) {
        return nativeFindFirstDouble(this.nativeTableRefPtr, j, d);
    }

    public long findFirstFloat(long j, float f) {
        return nativeFindFirstFloat(this.nativeTableRefPtr, j, f);
    }

    public long findFirstLong(long j, long j2) {
        return nativeFindFirstInt(this.nativeTableRefPtr, j, j2);
    }

    public long findFirstNull(long j) {
        return nativeFindFirstNull(this.nativeTableRefPtr, j);
    }

    public long findFirstObjectId(long j, ObjectId objectId) {
        if (objectId != null) {
            return nativeFindFirstObjectId(this.nativeTableRefPtr, j, objectId.toString());
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public long findFirstString(long j, String str) {
        if (str != null) {
            return nativeFindFirstString(this.nativeTableRefPtr, j, str);
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public long findFirstUUID(long j, UUID uuid) {
        if (uuid != null) {
            return nativeFindFirstUUID(this.nativeTableRefPtr, j, uuid.toString());
        }
        throw new IllegalArgumentException("null is not supported");
    }

    public Table freeze(OsSharedRealm osSharedRealm) {
        if (osSharedRealm.isFrozen()) {
            return new Table(osSharedRealm, nativeFreeze(osSharedRealm.getNativePtr(), this.nativeTableRefPtr));
        }
        throw new IllegalArgumentException("Frozen Realm required");
    }

    public byte[] getBinaryByteArray(long j, long j2) {
        return nativeGetByteArray(this.nativeTableRefPtr, j, j2);
    }

    public boolean getBoolean(long j, long j2) {
        return nativeGetBoolean(this.nativeTableRefPtr, j, j2);
    }

    public CheckedRow getCheckedRow(long j) {
        return CheckedRow.get(this.context, this, j);
    }

    public String getClassName() {
        String classNameForTable = getClassNameForTable(getName());
        if (!Util.isEmptyString(classNameForTable)) {
            return classNameForTable;
        }
        throw new IllegalStateException("This object class is no longer part of the schema for the Realm file. It is therefor not possible to access the schema name.");
    }

    public long getColumnCount() {
        return nativeGetColumnCount(this.nativeTableRefPtr);
    }

    public long getColumnKey(String str) {
        if (str != null) {
            return nativeGetColumnKey(this.nativeTableRefPtr, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    public String getColumnName(long j) {
        return nativeGetColumnName(this.nativeTableRefPtr, j);
    }

    public String[] getColumnNames() {
        return nativeGetColumnNames(this.nativeTableRefPtr);
    }

    public RealmFieldType getColumnType(long j) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.nativeTableRefPtr, j));
    }

    public Date getDate(long j, long j2) {
        return new Date(nativeGetTimestamp(this.nativeTableRefPtr, j, j2));
    }

    public double getDouble(long j, long j2) {
        return nativeGetDouble(this.nativeTableRefPtr, j, j2);
    }

    public float getFloat(long j, long j2) {
        return nativeGetFloat(this.nativeTableRefPtr, j, j2);
    }

    public long getLink(long j, long j2) {
        return nativeGetLink(this.nativeTableRefPtr, j, j2);
    }

    public Table getLinkTarget(long j) {
        return new Table(this.sharedRealm, nativeGetLinkTarget(this.nativeTableRefPtr, j));
    }

    public long getLong(long j, long j2) {
        return nativeGetLong(this.nativeTableRefPtr, j, j2);
    }

    @Nullable
    public String getName() {
        return nativeGetName(this.nativeTableRefPtr);
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.nativeTableRefPtr;
    }

    public OsSharedRealm getSharedRealm() {
        return this.sharedRealm;
    }

    public String getString(long j, long j2) {
        return nativeGetString(this.nativeTableRefPtr, j, j2);
    }

    public Table getTable() {
        return this;
    }

    public UncheckedRow getUncheckedRow(long j) {
        return UncheckedRow.getByRowKey(this.context, this, j);
    }

    public UncheckedRow getUncheckedRowByPointer(long j) {
        return UncheckedRow.getByRowPointer(this.context, this, j);
    }

    public boolean hasSameSchema(Table table) {
        if (table != null) {
            return nativeHasSameSchema(this.nativeTableRefPtr, table.nativeTableRefPtr);
        }
        throw new IllegalArgumentException("The argument cannot be null");
    }

    public boolean hasSearchIndex(long j) {
        return nativeHasSearchIndex(this.nativeTableRefPtr, j);
    }

    public void incrementLong(long j, long j2, long j3) {
        checkImmutable();
        nativeIncrementLong(this.nativeTableRefPtr, j, j2, j3);
    }

    public boolean isColumnNullable(long j) {
        return nativeIsColumnNullable(this.nativeTableRefPtr, j);
    }

    public boolean isEmbedded() {
        return nativeIsEmbedded(this.nativeTableRefPtr);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    boolean isImmutable() {
        OsSharedRealm osSharedRealm = this.sharedRealm;
        return osSharedRealm != null && !osSharedRealm.isInTransaction();
    }

    public boolean isNullLink(long j, long j2) {
        return nativeIsNullLink(this.nativeTableRefPtr, j, j2);
    }

    public boolean isValid() {
        long j = this.nativeTableRefPtr;
        return j != 0 && nativeIsValid(j);
    }

    public void moveLastOver(long j) {
        checkImmutable();
        nativeMoveLastOver(this.nativeTableRefPtr, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public native long nativeGetRowPtr(long j, long j2);

    public void nullifyLink(long j, long j2) {
        nativeNullifyLink(this.nativeTableRefPtr, j, j2);
    }

    public void removeColumn(long j) {
        String className = getClassName();
        String columnName = getColumnName(j);
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, getClassName());
        nativeRemoveColumn(this.nativeTableRefPtr, j);
        if (columnName.equals(primaryKeyForObject)) {
            OsObjectStore.setPrimaryKeyForObject(this.sharedRealm, className, null);
        }
    }

    public void removeSearchIndex(long j) {
        checkImmutable();
        nativeRemoveSearchIndex(this.nativeTableRefPtr, j);
    }

    public void renameColumn(long j, String str) {
        verifyColumnName(str);
        String nativeGetColumnName = nativeGetColumnName(this.nativeTableRefPtr, j);
        String primaryKeyForObject = OsObjectStore.getPrimaryKeyForObject(this.sharedRealm, getClassName());
        nativeRenameColumn(this.nativeTableRefPtr, j, str);
        if (nativeGetColumnName.equals(primaryKeyForObject)) {
            try {
                OsObjectStore.setPrimaryKeyForObject(this.sharedRealm, getClassName(), str);
            } catch (Exception e) {
                nativeRenameColumn(this.nativeTableRefPtr, j, nativeGetColumnName);
                throw new RuntimeException(e);
            }
        }
    }

    public void setBinaryByteArray(long j, long j2, byte[] bArr, boolean z) {
        checkImmutable();
        nativeSetByteArray(this.nativeTableRefPtr, j, j2, bArr, z);
    }

    public void setBoolean(long j, long j2, boolean z, boolean z2) {
        checkImmutable();
        nativeSetBoolean(this.nativeTableRefPtr, j, j2, z, z2);
    }

    public void setDate(long j, long j2, Date date, boolean z) {
        if (date != null) {
            checkImmutable();
            nativeSetTimestamp(this.nativeTableRefPtr, j, j2, date.getTime(), z);
            return;
        }
        throw new IllegalArgumentException("Null Date is not allowed.");
    }

    public void setDecimal128(long j, long j2, @Nullable Decimal128 decimal128, boolean z) {
        checkImmutable();
        if (decimal128 == null) {
            nativeSetNull(this.nativeTableRefPtr, j, j2, z);
        } else {
            nativeSetDecimal128(this.nativeTableRefPtr, j, j2, decimal128.f, decimal128.g, z);
        }
    }

    public void setDouble(long j, long j2, double d, boolean z) {
        checkImmutable();
        nativeSetDouble(this.nativeTableRefPtr, j, j2, d, z);
    }

    public boolean setEmbedded(boolean z) {
        return nativeSetEmbedded(this.nativeTableRefPtr, z);
    }

    public void setFloat(long j, long j2, float f, boolean z) {
        checkImmutable();
        nativeSetFloat(this.nativeTableRefPtr, j, j2, f, z);
    }

    public void setLink(long j, long j2, long j3, boolean z) {
        checkImmutable();
        nativeSetLink(this.nativeTableRefPtr, j, j2, j3, z);
    }

    public void setLong(long j, long j2, long j3, boolean z) {
        checkImmutable();
        nativeSetLong(this.nativeTableRefPtr, j, j2, j3, z);
    }

    public void setNull(long j, long j2, boolean z) {
        checkImmutable();
        nativeSetNull(this.nativeTableRefPtr, j, j2, z);
    }

    public void setObjectId(long j, long j2, @Nullable ObjectId objectId, boolean z) {
        checkImmutable();
        if (objectId == null) {
            nativeSetNull(this.nativeTableRefPtr, j, j2, z);
        } else {
            nativeSetObjectId(this.nativeTableRefPtr, j, j2, objectId.toString(), z);
        }
    }

    public void setRealmAny(long j, long j2, long j3, boolean z) {
        checkImmutable();
        nativeSetRealmAny(this.nativeTableRefPtr, j, j2, j3, z);
    }

    public void setString(long j, long j2, @Nullable String str, boolean z) {
        checkImmutable();
        if (str == null) {
            nativeSetNull(this.nativeTableRefPtr, j, j2, z);
        } else {
            nativeSetString(this.nativeTableRefPtr, j, j2, str, z);
        }
    }

    public void setUUID(long j, long j2, @Nullable UUID uuid, boolean z) {
        checkImmutable();
        if (uuid == null) {
            nativeSetNull(this.nativeTableRefPtr, j, j2, z);
        } else {
            nativeSetUUID(this.nativeTableRefPtr, j, j2, uuid.toString(), z);
        }
    }

    public long size() {
        return nativeSize(this.nativeTableRefPtr);
    }

    public String toString() {
        long columnCount = getColumnCount();
        String name = getName();
        StringBuilder sb = new StringBuilder("The Table ");
        if (name != null && !name.isEmpty()) {
            sb.append(getName());
            sb.append(" ");
        }
        sb.append("contains ");
        sb.append(columnCount);
        sb.append(" columns: ");
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            String str = columnNames[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append(str);
            i++;
            z = false;
        }
        sb.append(". And ");
        sb.append(size());
        sb.append(" rows.");
        return sb.toString();
    }

    public TableQuery where() {
        return new TableQuery(this.context, this, nativeWhere(this.nativeTableRefPtr));
    }
}
