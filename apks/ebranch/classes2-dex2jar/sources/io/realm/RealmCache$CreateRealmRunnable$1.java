package io.realm;

import io.realm.RealmCache;
/* loaded from: classes2-dex2jar.jar:io/realm/RealmCache$CreateRealmRunnable$1.class */
class RealmCache$CreateRealmRunnable$1 implements Runnable {
    final /* synthetic */ RealmCache.CreateRealmRunnable this$0;

    RealmCache$CreateRealmRunnable$1(RealmCache.CreateRealmRunnable createRealmRunnable) {
        this.this$0 = createRealmRunnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th;
        if (RealmCache.CreateRealmRunnable.access$100(this.this$0) == null || RealmCache.CreateRealmRunnable.access$100(this.this$0).isCancelled()) {
            RealmCache.CreateRealmRunnable.access$200(this.this$0).countDown();
            return;
        }
        BaseRealm baseRealm = null;
        try {
            baseRealm = RealmCache.createRealmOrGetFromCache(RealmCache.CreateRealmRunnable.access$300(this.this$0), RealmCache.CreateRealmRunnable.access$400(this.this$0));
            RealmCache.CreateRealmRunnable.access$200(this.this$0).countDown();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            RealmCache.CreateRealmRunnable.access$200(this.this$0).countDown();
        }
        if (baseRealm != null) {
            RealmCache.CreateRealmRunnable.access$500(this.this$0).onSuccess(baseRealm);
        } else {
            RealmCache.CreateRealmRunnable.access$500(this.this$0).onError(th);
        }
    }
}
