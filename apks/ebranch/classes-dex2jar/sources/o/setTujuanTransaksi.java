package o;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes-dex2jar.jar:o/setTujuanTransaksi.class */
final class setTujuanTransaksi implements setTujuanTransaksiCode {
    private setTujuanTransaksi() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setTujuanTransaksi(setTotalNominal settotalnominal) {
    }

    @Override // o.setTujuanTransaksiCode
    public final ExecutorService a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // o.setTujuanTransaksiCode
    public final ExecutorService e(ThreadFactory threadFactory, int i) {
        return a(1, threadFactory, 1);
    }
}
