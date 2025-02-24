package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes-dex2jar.jar:o/getTotalPembayaran.class */
public final class getTotalPembayaran implements Executor {
    private final Handler b;

    public getTotalPembayaran(Looper looper) {
        this.b = new getTipeNasabahPenerima(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
