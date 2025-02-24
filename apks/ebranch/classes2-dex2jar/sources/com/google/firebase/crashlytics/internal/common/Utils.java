package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.realmSet;
import o.setJatuhTempo;
import o.setJenisWarkat;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/common/Utils.class */
public final class Utils {
    private static final ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    private Utils() {
    }

    public static <T> T awaitEvenIfOnMainThread(setJatuhTempo<T> setjatuhtempo) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        setjatuhtempo.b(TASK_CONTINUATION_EXECUTOR_SERVICE, new realmSet.kodeBank(countDownLatch) { // from class: com.google.firebase.crashlytics.internal.common.Utils$$ExternalSyntheticLambda0
            public final /* synthetic */ CountDownLatch f$0;

            {
                this.f$0 = r4;
            }

            public final Object then(setJatuhTempo setjatuhtempo2) {
                return this.f$0.countDown();
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (setjatuhtempo.b()) {
            return (T) setjatuhtempo.c();
        }
        if (setjatuhtempo.a()) {
            throw new CancellationException("Task is already canceled");
        } else if (setjatuhtempo.e()) {
            throw new IllegalStateException(setjatuhtempo.d());
        } else {
            throw new TimeoutException();
        }
    }

    public static <T> setJatuhTempo<T> callTask(Executor executor, final Callable<setJatuhTempo<T>> callable) {
        final setJenisWarkat setjeniswarkat = new setJenisWarkat();
        executor.execute(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.Utils.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ((setJatuhTempo) callable.call()).b(new realmSet.kodeBank<T, Void>() { // from class: com.google.firebase.crashlytics.internal.common.Utils.1.1
                        public final /* synthetic */ Object then(setJatuhTempo setjatuhtempo) throws Exception {
                            if (setjatuhtempo.b()) {
                                setJenisWarkat setjeniswarkat2 = setjeniswarkat;
                                setjeniswarkat2.c.e(setjatuhtempo.c());
                                return null;
                            }
                            setJenisWarkat setjeniswarkat3 = setjeniswarkat;
                            setjeniswarkat3.c.c(setjatuhtempo.d());
                            return null;
                        }
                    });
                } catch (Exception e) {
                    setjeniswarkat.c.c(e);
                }
            }
        });
        return setjeniswarkat.c;
    }

    public static <T> setJatuhTempo<T> race(setJatuhTempo<T> setjatuhtempo, setJatuhTempo<T> setjatuhtempo2) {
        final setJenisWarkat setjeniswarkat = new setJenisWarkat();
        AnonymousClass4 r0 = new realmSet.kodeBank<T, Void>() { // from class: com.google.firebase.crashlytics.internal.common.Utils.4
            public final /* synthetic */ Object then(setJatuhTempo setjatuhtempo3) throws Exception {
                if (setjatuhtempo3.b()) {
                    setJenisWarkat setjeniswarkat2 = setjeniswarkat;
                    setjeniswarkat2.c.a(setjatuhtempo3.c());
                    return null;
                }
                setJenisWarkat setjeniswarkat3 = setjeniswarkat;
                setjeniswarkat3.c.a(setjatuhtempo3.d());
                return null;
            }
        };
        setjatuhtempo.b(r0);
        setjatuhtempo2.b(r0);
        return setjeniswarkat.c;
    }
}
