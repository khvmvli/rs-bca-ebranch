package io.realm;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import org.bson.types.ObjectId;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:io/realm/ObjectIdRealmAnyOperator.class */
public final class ObjectIdRealmAnyOperator extends PrimitiveRealmAnyOperator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ObjectIdRealmAnyOperator(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asObjectId(), RealmAny.Type.OBJECT_ID, nativeRealmAny);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ObjectIdRealmAnyOperator(ObjectId objectId) {
        super(objectId, RealmAny.Type.OBJECT_ID);
    }

    @Override // io.realm.RealmAnyOperator
    protected final NativeRealmAny createNativeRealmAny() {
        return new NativeRealmAny((ObjectId) getValue(ObjectId.class));
    }
}
