package io.realm;

import io.realm.internal.ColumnInfo;
import io.realm.internal.Table;
/* loaded from: classes2-dex2jar.jar:io/realm/RealmObjectSchema$DynamicColumnIndices.class */
final class RealmObjectSchema$DynamicColumnIndices extends ColumnInfo {
    private final Table table;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RealmObjectSchema$DynamicColumnIndices(Table table) {
        super((ColumnInfo) null, false);
        this.table = table;
    }

    public final ColumnInfo copy(boolean z) {
        throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
    }

    public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
        throw new UnsupportedOperationException("DynamicColumnIndices cannot copy");
    }

    public final void copyFrom(ColumnInfo columnInfo) {
        throw new UnsupportedOperationException("DynamicColumnIndices cannot be copied");
    }

    public final ColumnInfo.ColumnDetails getColumnDetails(String str) {
        throw new UnsupportedOperationException("DynamicColumnIndices do not support 'getColumnDetails'");
    }

    public final long getColumnKey(String str) {
        return this.table.getColumnKey(str);
    }
}
