package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/common/ExecutorUtils$4.class */
final class ExecutorUtils$4 implements ThreadFactory {
    final /* synthetic */ String b;
    final /* synthetic */ AtomicLong d;

    ExecutorUtils$4(String str, AtomicLong atomicLong) {
        this.b = str;
        this.d = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new BackgroundPriorityRunnable() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils$4.4
            @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
            public final void onRun() {
                runnable.run();
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(this.d.getAndIncrement());
        newThread.setName(sb.toString());
        return newThread;
    }
}
