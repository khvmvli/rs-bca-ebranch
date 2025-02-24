package o;

import java.util.concurrent.Executor;
/* loaded from: classes2-dex2jar.jar:o/TipeNasabahDialog.class */
public final /* synthetic */ class TipeNasabahDialog implements Executor {
    public static final Executor a = new TipeNasabahDialog();

    private TipeNasabahDialog() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
