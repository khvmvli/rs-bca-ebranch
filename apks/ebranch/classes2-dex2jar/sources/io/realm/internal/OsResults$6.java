package io.realm.internal;

import io.realm.RealmList;
import io.realm.internal.objectstore.OsObjectBuilder;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$6.class */
class OsResults$6 implements OsResults$AddListTypeDelegate<Boolean> {
    final /* synthetic */ OsResults this$0;

    OsResults$6(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<Boolean> realmList) {
        osObjectBuilder.addBooleanList(0, realmList);
    }
}
