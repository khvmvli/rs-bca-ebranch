package io.realm;

import io.realm.internal.OsSet;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.Collection;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:io/realm/BinaryOperator.class */
public class BinaryOperator extends SetValueOperator<byte[]> {
    public BinaryOperator(BaseRealm baseRealm, OsSet osSet, Class<byte[]> cls) {
        super(baseRealm, osSet, cls);
    }

    public boolean add(@Nullable byte[] bArr) {
        return this.osSet.add(bArr);
    }

    @Override // io.realm.SetValueOperator
    boolean addAllInternal(Collection<? extends byte[]> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newBinaryCollection(collection), OsSet.ExternalCollectionOperation.ADD_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newBinaryCollection(collection), OsSet.ExternalCollectionOperation.CONTAINS_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean containsInternal(@Nullable Object obj) {
        return this.osSet.contains(obj == null ? null : (byte[]) obj);
    }

    @Override // io.realm.SetValueOperator
    boolean removeAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newBinaryCollection(collection), OsSet.ExternalCollectionOperation.REMOVE_ALL);
    }

    @Override // io.realm.SetValueOperator
    boolean removeInternal(@Nullable Object obj) {
        return this.osSet.remove((byte[]) obj);
    }

    @Override // io.realm.SetValueOperator
    boolean retainAllInternal(Collection<?> collection) {
        return this.osSet.collectionFunnel(NativeRealmAnyCollection.newBinaryCollection(collection), OsSet.ExternalCollectionOperation.RETAIN_ALL);
    }
}
