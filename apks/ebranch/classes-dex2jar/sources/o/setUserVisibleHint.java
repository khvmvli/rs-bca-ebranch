package o;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes-dex2jar.jar:o/setUserVisibleHint.class */
public final class setUserVisibleHint {
    final long b;
    setOnScrollListener c;
    final Executor d;
    setScrollingTouchSlop a = null;

    /* renamed from: o  reason: collision with root package name */
    private final Handler f292o = new Handler(Looper.getMainLooper());
    Runnable j = null;
    final Object i = new Object();
    int g = 0;
    long f = SystemClock.uptimeMillis();
    boolean h = false;
    private final Runnable m = new Runnable() { // from class: o.setUserVisibleHint.4
        @Override // java.lang.Runnable
        public final void run() {
            setUserVisibleHint.this.d.execute(setUserVisibleHint.this.e);
        }
    };
    final Runnable e = new Runnable() { // from class: o.setUserVisibleHint.1
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (setUserVisibleHint.this.i) {
                if (SystemClock.uptimeMillis() - setUserVisibleHint.this.f >= setUserVisibleHint.this.b) {
                    if (setUserVisibleHint.this.g == 0) {
                        if (setUserVisibleHint.this.j != null) {
                            setUserVisibleHint.this.j.run();
                            if (setUserVisibleHint.this.c != null && setUserVisibleHint.this.c.h()) {
                                try {
                                    setUserVisibleHint.this.c.close();
                                    setUserVisibleHint.this.c = null;
                                } catch (IOException e) {
                                    throw e;
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                    }
                }
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public setUserVisibleHint(long j, TimeUnit timeUnit, Executor executor) {
        this.b = timeUnit.toMillis(j);
        this.d = executor;
    }

    public final <V> V a(setSwitchMinWidth<setOnScrollListener, V> setswitchminwidth) {
        try {
            return setswitchminwidth.c(b());
        } finally {
            c();
        }
    }

    public final setOnScrollListener b() {
        synchronized (this.i) {
            this.f292o.removeCallbacks(this.m);
            this.g++;
            if (!this.h) {
                setOnScrollListener setonscrolllistener = this.c;
                if (setonscrolllistener == null || !setonscrolllistener.h()) {
                    setScrollingTouchSlop setscrollingtouchslop = this.a;
                    if (setscrollingtouchslop != null) {
                        setOnScrollListener e = setscrollingtouchslop.e();
                        this.c = e;
                        return e;
                    }
                    throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                return this.c;
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    public final void c() {
        synchronized (this.i) {
            int i = this.g;
            if (i > 0) {
                int i2 = i - 1;
                this.g = i2;
                if (i2 == 0) {
                    if (this.c != null) {
                        this.f292o.postDelayed(this.m, this.b);
                    } else {
                        return;
                    }
                }
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
        }
    }

    public final setOnScrollListener d() {
        setOnScrollListener setonscrolllistener;
        synchronized (this.i) {
            setonscrolllistener = this.c;
        }
        return setonscrolllistener;
    }
}
