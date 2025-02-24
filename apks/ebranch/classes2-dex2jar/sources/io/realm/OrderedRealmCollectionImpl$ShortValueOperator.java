package io.realm;

import io.realm.internal.OsResults;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/OrderedRealmCollectionImpl$ShortValueOperator.class */
class OrderedRealmCollectionImpl$ShortValueOperator extends OrderedRealmCollectionImpl$PrimitiveValueOperator<Short> {
    OrderedRealmCollectionImpl$ShortValueOperator(BaseRealm baseRealm, OsResults osResults, @Nullable Class<Short> cls, @Nullable String str) {
        super(baseRealm, osResults, cls, str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl$PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public Short get(int i) {
        return Short.valueOf(((Long) this.osResults.getValue(i)).shortValue());
    }

    @Override // io.realm.OrderedRealmCollectionImpl$PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public Short getFromResults(int i, OsResults osResults) {
        Long l = (Long) osResults.getValue(i);
        if (l == null) {
            return null;
        }
        return Short.valueOf(l.shortValue());
    }
}
