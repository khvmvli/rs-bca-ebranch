package io.realm.internal;

import io.realm.RealmList;
import io.realm.internal.objectstore.OsObjectBuilder;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$2.class */
class OsResults$2 implements OsResults$AddListTypeDelegate<Byte> {
    final /* synthetic */ OsResults this$0;

    OsResults$2(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<Byte> realmList) {
        osObjectBuilder.addByteList(0, realmList);
    }
}
