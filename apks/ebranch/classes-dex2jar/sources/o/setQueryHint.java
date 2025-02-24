package o;

import java.util.concurrent.Executor;
/* loaded from: classes-dex2jar.jar:o/setQueryHint.class */
public class setQueryHint extends setSuggestionsAdapter {
    private static volatile setQueryHint c;
    public setSuggestionsAdapter a;
    private setSuggestionsAdapter e;
    private static final Executor d = new Executor() { // from class: o.setQueryHint.1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            setQueryHint.c().a.c(runnable);
        }
    };
    private static final Executor b = new Executor() { // from class: o.setQueryHint.2
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            setQueryHint.c().a.e(runnable);
        }
    };

    private setQueryHint() {
        setSearchableInfo setsearchableinfo = new setSearchableInfo();
        this.e = setsearchableinfo;
        this.a = setsearchableinfo;
    }

    public static setQueryHint c() {
        if (c != null) {
            return c;
        }
        synchronized (setQueryHint.class) {
            try {
                if (c == null) {
                    c = new setQueryHint();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static Executor e() {
        return b;
    }

    @Override // o.setSuggestionsAdapter
    public final void c(Runnable runnable) {
        this.a.c(runnable);
    }

    @Override // o.setSuggestionsAdapter
    public final boolean d() {
        return this.a.d();
    }

    @Override // o.setSuggestionsAdapter
    public final void e(Runnable runnable) {
        this.a.e(runnable);
    }
}
