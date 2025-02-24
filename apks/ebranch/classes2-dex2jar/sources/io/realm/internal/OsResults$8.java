package io.realm.internal;

import io.realm.RealmList;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Date;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsResults$8.class */
class OsResults$8 implements OsResults$AddListTypeDelegate<Date> {
    final /* synthetic */ OsResults this$0;

    OsResults$8(OsResults osResults) {
        this.this$0 = osResults;
    }

    @Override // io.realm.internal.OsResults$AddListTypeDelegate
    public void addList(OsObjectBuilder osObjectBuilder, RealmList<Date> realmList) {
        osObjectBuilder.addDateList(0, realmList);
    }
}
