package io.realm.internal;

import io.realm.RealmList;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.UUID;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$14.class */
class OsResults$14 implements OsResults$AddListTypeDelegate<UUID> {
    final /* synthetic */ OsResults this$0;

    OsResults$14(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<UUID> realmList) {
        osObjectBuilder.addUUIDList(0, realmList);
    }
}
