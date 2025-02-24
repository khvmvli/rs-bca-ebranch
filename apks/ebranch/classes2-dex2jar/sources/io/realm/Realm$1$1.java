package io.realm;

import io.realm.Realm;
import io.realm.internal.OsSharedRealm;
/* loaded from: classes2-dex2jar.jar:io/realm/Realm$1$1.class */
class Realm$1$1 implements Runnable {
    final /* synthetic */ Realm.1 this$1;
    final /* synthetic */ OsSharedRealm.VersionID val$backgroundVersionID;

    Realm$1$1(Realm.1 r4, OsSharedRealm.VersionID versionID) {
        this.this$1 = r4;
        this.val$backgroundVersionID = versionID;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.this$1.this$0.isClosed()) {
            this.this$1.val$onSuccess.onSuccess();
        } else if (this.this$1.this$0.sharedRealm.getVersionID().compareTo(this.val$backgroundVersionID) < 0) {
            this.this$1.this$0.sharedRealm.realmNotifier.addTransactionCallback(new Runnable() { // from class: io.realm.Realm$1$1.1
                @Override // java.lang.Runnable
                public void run() {
                    Realm$1$1.this.this$1.val$onSuccess.onSuccess();
                }
            });
        } else {
            this.this$1.val$onSuccess.onSuccess();
        }
    }
}
