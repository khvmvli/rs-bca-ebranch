package o;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes-dex2jar.jar:o/getNpwpImg.class */
final class getNpwpImg implements getMonthlyIncome {
    private getNpwpImg() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ getNpwpImg(getIdentityCardType getidentitycardtype) {
    }

    public static final ExecutorService e(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // o.getMonthlyIncome
    public final ExecutorService e(ThreadFactory threadFactory, int i) {
        return e(1, threadFactory, 1);
    }
}
