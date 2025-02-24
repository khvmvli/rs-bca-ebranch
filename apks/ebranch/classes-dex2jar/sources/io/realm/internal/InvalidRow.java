package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
/* loaded from: classes-dex2jar.jar:io/realm/internal/InvalidRow.class */
public enum InvalidRow implements Row {
    INSTANCE;

    private RuntimeException getStubException() {
        return new IllegalStateException("Object is no longer managed by Realm. Has it been deleted?");
    }

    @Override // io.realm.internal.Row
    public final void checkIfAttached() {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final long createEmbeddedObject(long j, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final Row freeze(OsSharedRealm osSharedRealm) {
        return INSTANCE;
    }

    @Override // io.realm.internal.Row
    public final byte[] getBinaryByteArray(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final boolean getBoolean(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final long getColumnCount() {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final long getColumnKey(String str) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final String[] getColumnNames() {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final RealmFieldType getColumnType(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final Date getDate(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final Decimal128 getDecimal128(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final double getDouble(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final float getFloat(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final long getLink(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final long getLong(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final OsList getModelList(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final OsMap getModelMap(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final OsSet getModelSet(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final NativeRealmAny getNativeRealmAny(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final ObjectId getObjectId(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final long getObjectKey() {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final OsMap getRealmAnyMap(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final OsSet getRealmAnySet(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final String getString(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final Table getTable() {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final UUID getUUID(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final OsList getValueList(long j, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final OsMap getValueMap(long j, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final OsSet getValueSet(long j, RealmFieldType realmFieldType) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final boolean hasColumn(String str) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final boolean isLoaded() {
        return true;
    }

    @Override // io.realm.internal.Row
    public final boolean isNull(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final boolean isNullLink(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final boolean isValid() {
        return false;
    }

    @Override // io.realm.internal.Row
    public final void nullifyLink(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final void setBinaryByteArray(long j, byte[] bArr) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final void setBoolean(long j, boolean z) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final void setDate(long j, Date date) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final void setDecimal128(long j, Decimal128 decimal128) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final void setDouble(long j, double d) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final void setFloat(long j, float f) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final void setLink(long j, long j2) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final void setLong(long j, long j2) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final void setNull(long j) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final void setObjectId(long j, ObjectId objectId) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final void setRealmAny(long j, long j2) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final void setString(long j, String str) {
        throw getStubException();
    }

    @Override // io.realm.internal.Row
    public final void setUUID(long j, UUID uuid) {
        throw getStubException();
    }
}
