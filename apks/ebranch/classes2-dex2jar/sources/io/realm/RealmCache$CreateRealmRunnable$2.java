package io.realm;

import io.realm.RealmCache;
/* loaded from: classes2-dex2jar.jar:io/realm/RealmCache$CreateRealmRunnable$2.class */
class RealmCache$CreateRealmRunnable$2 implements Runnable {
    final /* synthetic */ RealmCache.CreateRealmRunnable this$0;
    final /* synthetic */ Throwable val$e;

    RealmCache$CreateRealmRunnable$2(RealmCache.CreateRealmRunnable createRealmRunnable, Throwable th) {
        this.this$0 = createRealmRunnable;
        this.val$e = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        RealmCache.CreateRealmRunnable.access$500(this.this$0).onError(this.val$e);
    }
}
