package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/common/ExecutorUtils$1.class */
final class ExecutorUtils$1 extends BackgroundPriorityRunnable {
    final /* synthetic */ long a;
    final /* synthetic */ TimeUnit b;
    final /* synthetic */ ExecutorService d;
    final /* synthetic */ String e;

    ExecutorUtils$1(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        this.e = str;
        this.d = executorService;
        this.a = j;
        this.b = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
    public final void onRun() {
        try {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Executing shutdown hook for ");
            sb.append(this.e);
            logger.d(sb.toString());
            this.d.shutdown();
            if (!this.d.awaitTermination(this.a, this.b)) {
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.e);
                sb2.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                logger2.d(sb2.toString());
                this.d.shutdownNow();
            }
        } catch (InterruptedException e) {
            Logger.getLogger().d(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.e));
            this.d.shutdownNow();
        }
    }
}
