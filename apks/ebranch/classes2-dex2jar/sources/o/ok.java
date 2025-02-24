package o;

import java.util.concurrent.Executor;
/* loaded from: classes2-dex2jar.jar:o/ok.class */
public final /* synthetic */ class ok implements Executor {
    public static final Executor d = new ok();

    private ok() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
