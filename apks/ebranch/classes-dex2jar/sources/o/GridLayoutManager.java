package o;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* loaded from: classes-dex2jar.jar:o/GridLayoutManager.class */
final class GridLayoutManager implements Executor {
    private Runnable a;
    private final Executor c;
    private final ArrayDeque<Runnable> d = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GridLayoutManager(Executor executor) {
        this.c = executor;
    }

    final void c() {
        synchronized (this) {
            Runnable poll = this.d.poll();
            this.a = poll;
            if (poll != null) {
                this.c.execute(poll);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this) {
            this.d.offer(new Runnable() { // from class: o.GridLayoutManager.4
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        GridLayoutManager.this.c();
                    }
                }
            });
            if (this.a == null) {
                c();
            }
        }
    }
}
