package o;

import java.util.concurrent.Executor;
/* loaded from: classes2-dex2jar.jar:o/search.class */
public final /* synthetic */ class search implements Executor {
    public static final Executor e = new search();

    private search() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
