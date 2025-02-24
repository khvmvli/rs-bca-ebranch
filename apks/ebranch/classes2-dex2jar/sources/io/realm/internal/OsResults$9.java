package io.realm.internal;

import io.realm.RealmList;
import io.realm.internal.objectstore.OsObjectBuilder;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$9.class */
class OsResults$9 implements OsResults$AddListTypeDelegate<Float> {
    final /* synthetic */ OsResults this$0;

    OsResults$9(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<Float> realmList) {
        osObjectBuilder.addFloatList(0, realmList);
    }
}
