package o;

import java.util.concurrent.Executor;
/* loaded from: classes2-dex2jar.jar:o/TipeNasabahKliringDialog.class */
public final /* synthetic */ class TipeNasabahKliringDialog implements Executor {
    public static final Executor b = new TipeNasabahKliringDialog();

    private TipeNasabahKliringDialog() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
