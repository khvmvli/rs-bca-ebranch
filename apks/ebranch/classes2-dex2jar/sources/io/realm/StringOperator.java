package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/StringOperator.class */
class StringOperator extends SetValueOperator<String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public StringOperator(BaseRealm baseRealm, OsSet osSet, Class<String> cls) {
        super(baseRealm, osSet, cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean add(@Nullable String str) {
        return this.osSet.add(str);
    }

    @Override // io.realm.SetValueOperator
    boolean addAllInternal(Collection<? extends String> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newStringCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newStringCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsInternal(@Nullable Object obj) {
        return this.osSet.contains((String) obj);
    }

    @Override // io.realm.SetValueOperator
    boolean removeAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newStringCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean removeInternal(@Nullable Object obj) {
        return this.osSet.remove((String) obj);
    }

    @Override // io.realm.SetValueOperator
    boolean retainAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newStringCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }
}
