package o;

import android.graphics.Path;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
/* loaded from: classes-dex2jar.jar:o/BindFont.class */
public final class BindFont<T> {
    public static Executor b = Executors.newCachedThreadPool();
    private volatile BindBitmap<T> a;
    private final Set<BindBool<T>> c;
    private final Handler d;
    private final Set<BindBool<Throwable>> e;

    /* loaded from: classes-dex2jar.jar:o/BindFont$RemoteActionCompatParcelizer.class */
    final class RemoteActionCompatParcelizer extends FutureTask<BindBitmap<T>> {
        RemoteActionCompatParcelizer(Callable<BindBitmap<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected final void done() {
            if (!isCancelled()) {
                try {
                    BindFont.a(BindFont.this, get());
                } catch (InterruptedException | ExecutionException e) {
                    BindFont.a(BindFont.this, new BindBitmap(e));
                }
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/BindFont$TypefaceStyle.class */
    public final class TypefaceStyle {
        List<OnTouch> d = new ArrayList();

        public final void a(Path path) {
            for (int size = this.d.size() - 1; size >= 0; size--) {
                copyNoRef.a(path, this.d.get(size));
            }
        }
    }

    public BindFont(Callable<BindBitmap<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BindFont(Callable<BindBitmap<T>> callable, boolean z) {
        this.c = new LinkedHashSet(1);
        this.e = new LinkedHashSet(1);
        this.d = new Handler(Looper.getMainLooper());
        this.a = null;
        if (z) {
            try {
                BindBitmap<T> call = callable.call();
                if (this.a == null) {
                    this.a = call;
                    this.d.post(new Runnable() { // from class: o.BindFont.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (BindFont.this.a != null) {
                                BindBitmap bindBitmap = BindFont.this.a;
                                if (bindBitmap.b != 0) {
                                    BindFont.c(BindFont.this, bindBitmap.b);
                                } else {
                                    BindFont.d(BindFont.this, bindBitmap.c);
                                }
                            }
                        }
                    });
                    return;
                }
                throw new IllegalStateException("A task may only be set once.");
            } catch (Throwable th) {
                BindBitmap<T> bindBitmap = new BindBitmap<>(th);
                if (this.a == null) {
                    this.a = bindBitmap;
                    this.d.post(new Runnable() { // from class: o.BindFont.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (BindFont.this.a != null) {
                                BindBitmap bindBitmap2 = BindFont.this.a;
                                if (bindBitmap2.b != 0) {
                                    BindFont.c(BindFont.this, bindBitmap2.b);
                                } else {
                                    BindFont.d(BindFont.this, bindBitmap2.c);
                                }
                            }
                        }
                    });
                    return;
                }
                throw new IllegalStateException("A task may only be set once.");
            }
        } else {
            b.execute(new RemoteActionCompatParcelizer(callable));
        }
    }

    static /* synthetic */ void a(BindFont bindFont, BindBitmap bindBitmap) {
        if (bindFont.a == null) {
            bindFont.a = bindBitmap;
            bindFont.d.post(new Runnable() { // from class: o.BindFont.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (BindFont.this.a != null) {
                        BindBitmap bindBitmap2 = BindFont.this.a;
                        if (bindBitmap2.b != 0) {
                            BindFont.c(BindFont.this, bindBitmap2.b);
                        } else {
                            BindFont.d(BindFont.this, bindBitmap2.c);
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    static /* synthetic */ void c(BindFont bindFont, Object obj) {
        synchronized (bindFont) {
            for (BindBool bindBool : new ArrayList(bindFont.c)) {
                bindBool.d(obj);
            }
        }
    }

    static /* synthetic */ void d(BindFont bindFont, Throwable th) {
        synchronized (bindFont) {
            ArrayList<BindBool> arrayList = new ArrayList(bindFont.e);
            if (arrayList.isEmpty()) {
                AvailableBookingTimeActivity_ViewBinding.a("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            for (BindBool bindBool : arrayList) {
                bindBool.d(th);
            }
        }
    }

    public final BindFont<T> a(BindBool<T> bindBool) {
        synchronized (this) {
            this.c.remove(bindBool);
        }
        return this;
    }

    public final BindFont<T> c(BindBool<T> bindBool) {
        synchronized (this) {
            if (!(this.a == null || this.a.b == null)) {
                bindBool.d(this.a.b);
            }
            this.c.add(bindBool);
        }
        return this;
    }

    public final BindFont<T> d(BindBool<Throwable> bindBool) {
        synchronized (this) {
            this.e.remove(bindBool);
        }
        return this;
    }

    public final BindFont<T> e(BindBool<Throwable> bindBool) {
        synchronized (this) {
            if (!(this.a == null || this.a.c == null)) {
                bindBool.d(this.a.c);
            }
            this.e.add(bindBool);
        }
        return this;
    }
}
