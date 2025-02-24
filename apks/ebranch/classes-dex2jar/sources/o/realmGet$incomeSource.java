package o;

import java.util.concurrent.Executor;
/* loaded from: classes-dex2jar.jar:o/realmGet$incomeSource.class */
final /* synthetic */ class realmGet$incomeSource implements Executor {
    static final Executor c = new realmGet$incomeSource();

    private realmGet$incomeSource() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
