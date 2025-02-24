package io.realm.internal;

import io.realm.RealmList;
import io.realm.internal.objectstore.OsObjectBuilder;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$7.class */
class OsResults$7 implements OsResults$AddListTypeDelegate<byte[]> {
    final /* synthetic */ OsResults this$0;

    OsResults$7(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<byte[]> realmList) {
        osObjectBuilder.addByteArrayList(0, realmList);
    }
}
