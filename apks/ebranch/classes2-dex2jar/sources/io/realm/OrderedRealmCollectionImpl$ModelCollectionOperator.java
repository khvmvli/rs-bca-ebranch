package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.UncheckedRow;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/OrderedRealmCollectionImpl$ModelCollectionOperator.class */
class OrderedRealmCollectionImpl$ModelCollectionOperator<T> extends OrderedRealmCollectionImpl$CollectionOperator<T> {
    OrderedRealmCollectionImpl$ModelCollectionOperator(BaseRealm baseRealm, OsResults osResults, @Nullable Class<T> cls, @Nullable String str) {
        super(baseRealm, osResults, cls, str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public T convertRowToObject(UncheckedRow uncheckedRow) {
        return (T) this.baseRealm.get(this.classSpec, this.className, uncheckedRow);
    }

    @Override // io.realm.OrderedRealmCollectionImpl$CollectionOperator
    @Nullable
    public T firstImpl(boolean z, @Nullable T t) {
        return convertToObject(this.osResults.firstUncheckedRow(), z, t);
    }

    @Override // io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public T get(int i) {
        return (T) this.baseRealm.get(this.classSpec, this.className, this.osResults.getUncheckedRow(i));
    }

    @Override // io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public T getFromResults(int i, OsResults osResults) {
        return convertRowToObject(osResults.getUncheckedRow(i));
    }

    @Override // io.realm.OrderedRealmCollectionImpl$CollectionOperator
    @Nullable
    public T lastImpl(boolean z, @Nullable T t) {
        return convertToObject(this.osResults.lastUncheckedRow(), z, t);
    }
}
