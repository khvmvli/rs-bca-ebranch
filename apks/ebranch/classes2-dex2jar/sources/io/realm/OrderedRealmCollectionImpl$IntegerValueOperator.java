package io.realm;

import io.realm.internal.OsResults;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/OrderedRealmCollectionImpl$IntegerValueOperator.class */
class OrderedRealmCollectionImpl$IntegerValueOperator extends OrderedRealmCollectionImpl$PrimitiveValueOperator<Integer> {
    OrderedRealmCollectionImpl$IntegerValueOperator(BaseRealm baseRealm, OsResults osResults, @Nullable Class<Integer> cls, @Nullable String str) {
        super(baseRealm, osResults, cls, str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl$PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public Integer get(int i) {
        return Integer.valueOf(((Long) this.osResults.getValue(i)).intValue());
    }

    @Override // io.realm.OrderedRealmCollectionImpl$PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public Integer getFromResults(int i, OsResults osResults) {
        Long l = (Long) osResults.getValue(i);
        if (l == null) {
            return null;
        }
        return Integer.valueOf(l.intValue());
    }
}
