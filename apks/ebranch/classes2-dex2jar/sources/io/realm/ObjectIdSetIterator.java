package io.realm;

import io.realm.internal.OsSet;
import org.bson.types.ObjectId;
/* loaded from: classes2-dex2jar.jar:io/realm/ObjectIdSetIterator.class */
class ObjectIdSetIterator extends SetIterator<ObjectId> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ObjectIdSetIterator(OsSet osSet, BaseRealm baseRealm) {
        super(osSet, baseRealm);
    }
}
