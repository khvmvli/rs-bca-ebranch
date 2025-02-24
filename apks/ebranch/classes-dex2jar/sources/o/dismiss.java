package o;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/dismiss.class */
public final class dismiss {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/dismiss$read.class */
    public static final class read<T> implements Runnable {
        private Callable<T> a;
        private onCancel<T> b;
        private Handler d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public read(Handler handler, Callable<T> callable, onCancel<T> oncancel) {
            this.a = callable;
            this.b = oncancel;
            this.d = handler;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final T t;
            try {
                t = this.a.call();
            } catch (Exception e) {
                t = null;
            }
            final onCancel<T> oncancel = this.b;
            this.d.post(new Runnable() { // from class: o.dismiss.read.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    oncancel.e(t);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T d(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException e3) {
            throw new InterruptedException("timeout");
        }
    }
}
