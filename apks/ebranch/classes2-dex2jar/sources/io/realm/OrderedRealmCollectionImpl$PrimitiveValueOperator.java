package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.UncheckedRow;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/OrderedRealmCollectionImpl$PrimitiveValueOperator.class */
class OrderedRealmCollectionImpl$PrimitiveValueOperator<T> extends OrderedRealmCollectionImpl$CollectionOperator<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public OrderedRealmCollectionImpl$PrimitiveValueOperator(BaseRealm baseRealm, OsResults osResults, @Nullable Class<T> cls, @Nullable String str) {
        super(baseRealm, osResults, cls, str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public T convertRowToObject(UncheckedRow uncheckedRow) {
        throw new UnsupportedOperationException("Method 'convertRowToObject' cannot be used on primitive Realm collections.");
    }

    @Override // io.realm.OrderedRealmCollectionImpl$CollectionOperator
    @Nullable
    public T firstImpl(boolean z, @Nullable T t) {
        return this.osResults.size() != 0 ? (T) this.osResults.getValue(0) : t;
    }

    @Override // io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public T get(int i) {
        return (T) this.osResults.getValue(i);
    }

    @Override // io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public T getFromResults(int i, OsResults osResults) {
        return (T) osResults.getValue(i);
    }

    @Override // io.realm.OrderedRealmCollectionImpl$CollectionOperator
    @Nullable
    public T lastImpl(boolean z, @Nullable T t) {
        int size = (int) this.osResults.size();
        return size != 0 ? (T) this.osResults.getValue(size - 1) : t;
    }
}
