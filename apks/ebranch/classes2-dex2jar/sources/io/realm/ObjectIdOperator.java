package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;
import javax.annotation.Nullable;
import org.bson.types.ObjectId;
/* loaded from: classes2-dex2jar.jar:io/realm/ObjectIdOperator.class */
class ObjectIdOperator extends SetValueOperator<ObjectId> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ObjectIdOperator(BaseRealm baseRealm, OsSet osSet, Class<ObjectId> cls) {
        super(baseRealm, osSet, cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean add(@Nullable ObjectId objectId) {
        return this.osSet.add(objectId);
    }

    @Override // io.realm.SetValueOperator
    boolean addAllInternal(Collection<? extends ObjectId> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsInternal(@Nullable Object obj) {
        return this.osSet.contains(obj == null ? null : (ObjectId) obj);
    }

    @Override // io.realm.SetValueOperator
    boolean removeAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean removeInternal(@Nullable Object obj) {
        return this.osSet.remove((ObjectId) obj);
    }

    @Override // io.realm.SetValueOperator
    boolean retainAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newObjectIdCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }
}
