package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/BaseDialog.class */
final class BaseDialog implements Executor {
    private final Handler c = new realmGet.TujuanTransaksiKode(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.post(runnable);
    }
}
