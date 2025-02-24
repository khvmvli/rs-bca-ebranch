package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.UncheckedRow;
/* loaded from: classes2-dex2jar.jar:io/realm/OrderedRealmCollectionImpl$RealmCollectionIterator.class */
class OrderedRealmCollectionImpl$RealmCollectionIterator extends OsResults.Iterator<E> {
    final /* synthetic */ OrderedRealmCollectionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderedRealmCollectionImpl$RealmCollectionIterator(OrderedRealmCollectionImpl orderedRealmCollectionImpl) {
        super(orderedRealmCollectionImpl.osResults);
        this.this$0 = orderedRealmCollectionImpl;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [E, java.lang.Object] */
    public E convertRowToObject(UncheckedRow uncheckedRow) {
        return this.this$0.operator.convertRowToObject(uncheckedRow);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [E, java.lang.Object] */
    public E getInternal(int i, OsResults osResults) {
        return this.this$0.operator.getFromResults(i, osResults);
    }
}
