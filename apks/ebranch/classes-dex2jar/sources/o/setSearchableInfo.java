package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes-dex2jar.jar:o/setSearchableInfo.class */
public final class setSearchableInfo extends setSuggestionsAdapter {
    private volatile Handler c;
    private final Object a = new Object();
    private final ExecutorService d = Executors.newFixedThreadPool(4, new ThreadFactory() { // from class: o.setSearchableInfo.5
        private final AtomicInteger b = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.b.getAndIncrement())));
            return thread;
        }
    });

    private static Handler b(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e) {
            return new Handler(looper);
        } catch (InvocationTargetException e2) {
            return new Handler(looper);
        }
    }

    @Override // o.setSuggestionsAdapter
    public final void c(Runnable runnable) {
        if (this.c == null) {
            synchronized (this.a) {
                if (this.c == null) {
                    this.c = b(Looper.getMainLooper());
                }
            }
        }
        this.c.post(runnable);
    }

    @Override // o.setSuggestionsAdapter
    public final boolean d() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // o.setSuggestionsAdapter
    public final void e(Runnable runnable) {
        this.d.execute(runnable);
    }
}
