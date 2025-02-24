package io.realm.internal;

import io.realm.RealmList;
import io.realm.internal.objectstore.OsObjectBuilder;
import org.bson.types.Decimal128;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$12.class */
class OsResults$12 implements OsResults$AddListTypeDelegate<Decimal128> {
    final /* synthetic */ OsResults this$0;

    OsResults$12(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<Decimal128> realmList) {
        osObjectBuilder.addDecimal128List(0, realmList);
    }
}
