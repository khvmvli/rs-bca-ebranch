package io.realm.internal;

import io.realm.RealmList;
import io.realm.internal.objectstore.OsObjectBuilder;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$10.class */
class OsResults$10 implements OsResults$AddListTypeDelegate<Double> {
    final /* synthetic */ OsResults this$0;

    OsResults$10(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<Double> realmList) {
        osObjectBuilder.addDoubleList(0, realmList);
    }
}
