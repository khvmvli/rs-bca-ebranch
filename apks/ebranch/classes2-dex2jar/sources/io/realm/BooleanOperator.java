package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/BooleanOperator.class */
class BooleanOperator extends SetValueOperator<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BooleanOperator(BaseRealm baseRealm, OsSet osSet, Class<Boolean> cls) {
        super(baseRealm, osSet, cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean add(@Nullable Boolean bool) {
        return this.osSet.add(bool);
    }

    @Override // io.realm.SetValueOperator
    boolean addAllInternal(Collection<? extends Boolean> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newBooleanCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newBooleanCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsInternal(@Nullable Object obj) {
        return this.osSet.contains((Boolean) obj);
    }

    @Override // io.realm.SetValueOperator
    boolean removeAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newBooleanCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean removeInternal(@Nullable Object obj) {
        return this.osSet.remove((Boolean) obj);
    }

    @Override // io.realm.SetValueOperator
    boolean retainAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newBooleanCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }
}
