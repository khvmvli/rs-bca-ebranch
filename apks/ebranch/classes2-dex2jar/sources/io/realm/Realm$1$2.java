package io.realm;

import io.realm.Realm;
import io.realm.exceptions.RealmException;
/* loaded from: classes2-dex2jar.jar:io/realm/Realm$1$2.class */
class Realm$1$2 implements Runnable {
    final /* synthetic */ Realm.1 this$1;
    final /* synthetic */ Throwable val$backgroundException;

    Realm$1$2(Realm.1 r4, Throwable th) {
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
