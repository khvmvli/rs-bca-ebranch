package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.core.NativeRealmAny;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/OrderedRealmCollectionImpl$RealmAnyValueOperator.class */
class OrderedRealmCollectionImpl$RealmAnyValueOperator extends OrderedRealmCollectionImpl$PrimitiveValueOperator<RealmAny> {
    OrderedRealmCollectionImpl$RealmAnyValueOperator(BaseRealm baseRealm, OsResults osResults, @Nullable Class<RealmAny> cls, @Nullable String str) {
        super(baseRealm, osResults, cls, str);
    }

    @Override // io.realm.OrderedRealmCollectionImpl$PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public RealmAny get(int i) {
        return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.baseRealm, (NativeRealmAny) this.osResults.getValue(i)));
    }

    @Override // io.realm.OrderedRealmCollectionImpl$PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl$CollectionOperator
    public RealmAny getFromResults(int i, OsResults osResults) {
        return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.baseRealm, (NativeRealmAny) osResults.getValue(i)));
    }
}
