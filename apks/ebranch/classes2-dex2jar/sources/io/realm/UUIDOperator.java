package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;
import java.util.UUID;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:io/realm/UUIDOperator.class */
class UUIDOperator extends SetValueOperator<UUID> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public UUIDOperator(BaseRealm baseRealm, OsSet osSet, Class<UUID> cls) {
        super(baseRealm, osSet, cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean add(@Nullable UUID uuid) {
        return this.osSet.add(uuid);
    }

    @Override // io.realm.SetValueOperator
    boolean addAllInternal(Collection<? extends UUID> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newUUIDCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newUUIDCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsInternal(@Nullable Object obj) {
        return this.osSet.contains(obj == null ? null : (UUID) obj);
    }

    @Override // io.realm.SetValueOperator
    boolean removeAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newUUIDCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean removeInternal(@Nullable Object obj) {
        return this.osSet.remove((UUID) obj);
    }

    @Override // io.realm.SetValueOperator
    boolean retainAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newUUIDCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }
}
