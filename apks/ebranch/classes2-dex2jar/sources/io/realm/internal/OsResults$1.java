package io.realm.internal;

import io.realm.RealmList;
import io.realm.internal.objectstore.OsObjectBuilder;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$1.class */
class OsResults$1 implements OsResults$AddListTypeDelegate<String> {
    final /* synthetic */ OsResults this$0;

    OsResults$1(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<String> realmList) {
        osObjectBuilder.addStringList(0, realmList);
    }
}
