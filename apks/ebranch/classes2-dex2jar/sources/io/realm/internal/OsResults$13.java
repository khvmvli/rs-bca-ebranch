package io.realm.internal;

import io.realm.RealmList;
import io.realm.internal.objectstore.OsObjectBuilder;
import org.bson.types.ObjectId;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$13.class */
class OsResults$13 implements OsResults$AddListTypeDelegate<ObjectId> {
    final /* synthetic */ OsResults this$0;

    OsResults$13(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<ObjectId> realmList) {
        osObjectBuilder.addObjectIdList(0, realmList);
    }
}
