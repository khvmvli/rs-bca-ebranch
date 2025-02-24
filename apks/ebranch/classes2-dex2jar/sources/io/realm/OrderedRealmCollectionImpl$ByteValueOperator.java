package io.realm;

import io.realm.internal.OsResults;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/OrderedRealmCollectionImpl$ByteValueOperator.class */
class OrderedRealmCollectionImpl$ByteValueOperator extends OrderedRealmCollectionImpl$PrimitiveValueOperator<Byte> {
    OrderedRealmCollectionImpl$ByteValueOperator(BaseRealm baseRealm, OsResults osResults, @Nullable Class<Byte> cls, @Nullable String str) {
        super(baseRealm, osResults, cls, str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl$PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public Byte get(int i) {
        return Byte.valueOf(((Long) this.osResults.getValue(i)).byteValue());
    }

    @Override // io.realm.OrderedRealmCollectionImpl$PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public Byte getFromResults(int i, OsResults osResults) {
        Long l = (Long) osResults.getValue(i);
        if (l == null) {
            return null;
        }
        return Byte.valueOf(l.byteValue());
    }
}
