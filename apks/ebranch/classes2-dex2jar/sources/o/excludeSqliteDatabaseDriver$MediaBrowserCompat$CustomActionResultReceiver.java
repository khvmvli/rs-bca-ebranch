package o;

import android.os.Looper;
import org.greenrobot.eventbus.EventBusException;
/* loaded from: classes2-dex2jar.jar:o/excludeSqliteDatabaseDriver$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class excludeSqliteDatabaseDriver$MediaBrowserCompat$CustomActionResultReceiver implements excludeSqliteDatabaseDriver {
    private final Looper e;

    public excludeSqliteDatabaseDriver$MediaBrowserCompat$CustomActionResultReceiver(Looper looper) {
        this.e = looper;
    }

    @Override // o.excludeSqliteDatabaseDriver
    public final Stetho$InitializerBuilder d(documentProvider documentprovider) {
        return new Stetho$InitializerBuilder(documentprovider, this.e, 10) { // from class: o.Stetho$Initializer
            private final documentProvider d;
            private boolean e;
            private final int c = 10;
            private final build b = new build();

            /* JADX INFO: Access modifiers changed from: protected */
            {
                this.d = r5;
            }

            @Override // o.Stetho$InitializerBuilder
            public final void a(store store, Object obj) {
                runtimeRepl c = runtimeRepl.c(store, obj);
                synchronized (this) {
                    this.b.a(c);
                    if (!this.e) {
                        this.e = true;
                        if (!sendMessage(obtainMessage())) {
                            throw new EventBusException("Could not send handler message");
                        }
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
                if (sendMessage(obtainMessage()) == false) goto L_0x007c;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
                r7 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
                throw new org.greenrobot.eventbus.EventBusException("Could not send handler message");
             */
            @Override // android.os.Handler
            /* Code decompiled incorrectly, please refer to instructions dump */
            public final void handleMessage(android.os.Message r6) {
                /*
                    r5 = this;
                    r0 = 0
                    r7 = r0
                    long r0 = android.os.SystemClock.uptimeMillis()     // Catch: all -> 0x0088
                    r8 = r0
                L_0x0006:
                    r0 = r5
                    o.build r0 = r0.b     // Catch: all -> 0x0088
                    o.runtimeRepl r0 = r0.e()     // Catch: all -> 0x0088
                    r10 = r0
                    r0 = r10
                    r6 = r0
                    r0 = r10
                    if (r0 != 0) goto L_0x0037
                    r0 = r5
                    monitor-enter(r0)     // Catch: all -> 0x0088
                    r0 = r5
                    o.build r0 = r0.b     // Catch: all -> 0x0032
                    o.runtimeRepl r0 = r0.e()     // Catch: all -> 0x0032
                    r6 = r0
                    r0 = r6
                    if (r0 != 0) goto L_0x002d
                    r0 = r5
                    monitor-exit(r0)
                L_0x0027:
                    r0 = r5
                    r1 = r7
                    r0.e = r1
                    return
                L_0x002d:
                    r0 = r5
                    monitor-exit(r0)
                    goto L_0x0037
                L_0x0032:
                    r6 = move-exception
                    r0 = r5
                    monitor-exit(r0)
                    r0 = r6
                    throw r0     // Catch: all -> 0x0088
                L_0x0037:
                    r0 = r5
                    o.documentProvider r0 = r0.d     // Catch: all -> 0x0088
                    r11 = r0
                    r0 = r6
                    java.lang.Object r0 = r0.e     // Catch: all -> 0x0088
                    r10 = r0
                    r0 = r6
                    o.store r0 = r0.b     // Catch: all -> 0x0088
                    r12 = r0
                    r0 = r6
                    o.runtimeRepl.e(r0)     // Catch: all -> 0x0088
                    r0 = r12
                    boolean r0 = r0.e     // Catch: all -> 0x0088
                    if (r0 == 0) goto L_0x005e
                    r0 = r11
                    r1 = r12
                    r2 = r10
                    r0.a(r1, r2)     // Catch: all -> 0x0088
                L_0x005e:
                    long r0 = android.os.SystemClock.uptimeMillis()     // Catch: all -> 0x0088, all -> 0x0088
                    r1 = r8
                    long r0 = r0 - r1
                    r1 = r5
                    int r1 = r1.c     // Catch: all -> 0x0088
                    long r1 = (long) r1     // Catch: all -> 0x0088
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 < 0) goto L_0x0006
                    r0 = r5
                    r1 = r5
                    android.os.Message r1 = r1.obtainMessage()     // Catch: all -> 0x0088
                    boolean r0 = r0.sendMessage(r1)     // Catch: all -> 0x0088
                    if (r0 == 0) goto L_0x007c
                    r0 = 1
                    r7 = r0
                    goto L_0x0027
                L_0x007c:
                    org.greenrobot.eventbus.EventBusException r0 = new org.greenrobot.eventbus.EventBusException     // Catch: all -> 0x0088
                    r6 = r0
                    r0 = r6
                    java.lang.String r1 = "Could not send handler message"
                    r0.<init>(r1)     // Catch: all -> 0x0088
                    r0 = r6
                    throw r0     // Catch: all -> 0x0088
                L_0x0088:
                    r6 = move-exception
                    r0 = r5
                    r1 = 0
                    r0.e = r1
                    r0 = r6
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.Stetho$Initializer.handleMessage(android.os.Message):void");
            }
        };
    }

    @Override // o.excludeSqliteDatabaseDriver
    public final boolean d() {
        return this.e == Looper.myLooper();
    }
}
