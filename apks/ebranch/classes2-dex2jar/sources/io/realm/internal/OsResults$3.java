package io.realm.internal;

import io.realm.RealmList;
import io.realm.internal.objectstore.OsObjectBuilder;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$3.class */
class OsResults$3 implements OsResults$AddListTypeDelegate<Short> {
    final /* synthetic */ OsResults this$0;

    OsResults$3(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<Short> realmList) {
        osObjectBuilder.addShortList(0, realmList);
    }
}
