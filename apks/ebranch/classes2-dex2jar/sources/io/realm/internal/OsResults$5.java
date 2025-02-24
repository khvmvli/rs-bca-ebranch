package io.realm.internal;

import io.realm.RealmList;
import io.realm.internal.objectstore.OsObjectBuilder;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$5.class */
class OsResults$5 implements OsResults$AddListTypeDelegate<Long> {
    final /* synthetic */ OsResults this$0;

    OsResults$5(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<Long> realmList) {
        osObjectBuilder.addLongList(0, realmList);
    }
}
