package io.realm.internal;

import io.realm.RealmList;
import io.realm.RealmModel;
import io.realm.internal.objectstore.OsObjectBuilder;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$11.class */
class OsResults$11 implements OsResults$AddListTypeDelegate<RealmModel> {
    final /* synthetic */ OsResults this$0;

    OsResults$11(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<RealmModel> realmList) {
        osObjectBuilder.addObjectList(0, realmList);
    }
}
