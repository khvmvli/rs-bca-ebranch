package o;

import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes-dex2jar.jar:o/setAlert.class */
public final class setAlert implements ExecutorService {
    private static final long a = TimeUnit.SECONDS.toMillis(10);
    private static volatile int d;
    private final ExecutorService e;

    /* loaded from: classes-dex2jar.jar:o/setAlert$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        public static final IconCompatParcelizer a;
        public static final IconCompatParcelizer b;
        public static final IconCompatParcelizer c = new IconCompatParcelizer() { // from class: o.setAlert.IconCompatParcelizer.3
            @Override // o.setAlert.IconCompatParcelizer
            public final void b(Throwable th) {
            }
        };
        public static final IconCompatParcelizer e = new IconCompatParcelizer() { // from class: o.setAlert.IconCompatParcelizer.1
            @Override // o.setAlert.IconCompatParcelizer
            public final void b(Throwable th) {
                throw new RuntimeException("Request threw uncaught throwable", th);
            }
        };

        static {
            AnonymousClass5 r0 = new IconCompatParcelizer() { // from class: o.setAlert.IconCompatParcelizer.5
                @Override // o.setAlert.IconCompatParcelizer
                public final void b(Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                    }
                }
            };
            a = r0;
            b = r0;
        }

        void b(Throwable th);
    }

    /* loaded from: classes-dex2jar.jar:o/setAlert$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        String a;
        int b;
        int c;
        private long d;
        private final boolean e;
        private IconCompatParcelizer j = IconCompatParcelizer.b;

        RemoteActionCompatParcelizer(boolean z) {
            this.e = z;
        }

        public final setAlert d() {
            if (!TextUtils.isEmpty(this.a)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.b, this.c, this.d, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new setAlert$MediaBrowserCompat$CustomActionResultReceiver(this.a, this.j, this.e));
                if (this.d != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new setAlert(threadPoolExecutor);
            }
            StringBuilder sb = new StringBuilder("Name must be non-null and non-empty, but given: ");
            sb.append(this.a);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    setAlert(ExecutorService executorService) {
        this.e = executorService;
    }

    public static setAlert a() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(false);
        if (d == 0) {
            d = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = d;
        remoteActionCompatParcelizer.b = i;
        remoteActionCompatParcelizer.c = i;
        remoteActionCompatParcelizer.a = "source";
        return remoteActionCompatParcelizer.d();
    }

    public static setAlert b() {
        return new setAlert(new ThreadPoolExecutor(0, Integer.MAX_VALUE, a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new setAlert$MediaBrowserCompat$CustomActionResultReceiver("source-unlimited", IconCompatParcelizer.b, false)));
    }

    public static setAlert d() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(true);
        remoteActionCompatParcelizer.b = 1;
        remoteActionCompatParcelizer.c = 1;
        remoteActionCompatParcelizer.a = "disk-cache";
        return remoteActionCompatParcelizer.d();
    }

    public static setAlert e() {
        if (d == 0) {
            d = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = d >= 4 ? 2 : 1;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(true);
        remoteActionCompatParcelizer.b = i;
        remoteActionCompatParcelizer.c = i;
        remoteActionCompatParcelizer.a = "animation";
        return remoteActionCompatParcelizer.d();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.e.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.e.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.e.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.e.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.e.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.e.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.e.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.e.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.e.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.e.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.e.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.e.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.e.submit(callable);
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.e.toString();
    }
}
