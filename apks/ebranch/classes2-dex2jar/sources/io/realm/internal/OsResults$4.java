package io.realm.internal;

import io.realm.RealmList;
import io.realm.internal.objectstore.OsObjectBuilder;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$4.class */
class OsResults$4 implements OsResults$AddListTypeDelegate<Integer> {
    final /* synthetic */ OsResults this$0;

    OsResults$4(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<Integer> realmList) {
        osObjectBuilder.addIntegerList(0, realmList);
    }
}
