package io.realm;

import io.realm.DynamicRealm;
import io.realm.internal.OsSharedRealm;
/* loaded from: classes2-dex2jar.jar:io/realm/DynamicRealm$2$1.class */
class DynamicRealm$2$1 implements Runnable {
    final /* synthetic */ DynamicRealm.2 this$1;
    final /* synthetic */ OsSharedRealm.VersionID val$backgroundVersionID;

    DynamicRealm$2$1(DynamicRealm.2 r4, OsSharedRealm.VersionID versionID) {
        this.this$1 = r4;
        this.val$backgroundVersionID = versionID;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.this$1.this$0.isClosed()) {
            this.this$1.val$onSuccess.onSuccess();
        } else if (this.this$1.this$0.sharedRealm.getVersionID().compareTo(this.val$backgroundVersionID) < 0) {
            this.this$1.this$0.sharedRealm.realmNotifier.addTransactionCallback(new Runnable() { // from class: io.realm.DynamicRealm$2$1.1
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRealm$2$1.this.this$1.val$onSuccess.onSuccess();
                }
            });
        } else {
            this.this$1.val$onSuccess.onSuccess();
        }
    }
}
