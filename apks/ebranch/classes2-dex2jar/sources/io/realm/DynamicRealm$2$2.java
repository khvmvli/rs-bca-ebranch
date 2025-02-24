package io.realm;

import io.realm.DynamicRealm;
import io.realm.exceptions.RealmException;
/* loaded from: classes2-dex2jar.jar:io/realm/DynamicRealm$2$2.class */
class DynamicRealm$2$2 implements Runnable {
    final /* synthetic */ DynamicRealm.2 this$1;
    final /* synthetic */ Throwable val$backgroundException;

    DynamicRealm$2$2(DynamicRealm.2 r4, Throwable th) {
        this.this$1 = r4;
        this.val$backgroundException = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.this$1.val$onError != null) {
            this.this$1.val$onError.onError(this.val$backgroundException);
            return;
        }
        throw new RealmException("Async transaction failed", this.val$backgroundException);
    }
}
