package o;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2-dex2jar.jar:o/GetCurrenciesBNPresenter.class */
public final class GetCurrenciesBNPresenter extends SubmitBankNotesPresenter {
    public static final GetCurrenciesBNPresenter b = new GetCurrenciesBNPresenter();
    private static final int d;
    private static boolean h;
    private static volatile Executor pool;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100 A[SYNTHETIC] */
    static {
        /*
        // Method dump skipped, instructions count: 318
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GetCurrenciesBNPresenter.m204clinit():void");
    }

    private GetCurrenciesBNPresenter() {
    }

    private final Executor a() {
        ExecutorService executorService;
        synchronized (this) {
            Executor executor = pool;
            executorService = executor;
            if (executor == null) {
                ExecutorService c = c();
                pool = c;
                executorService = c;
            }
        }
        return executorService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static boolean b(java.lang.Class<?> r4, java.util.concurrent.ExecutorService r5) {
        /*
            r0 = r5
            o.GetEstimasiReservasiPresenter r1 = new o.GetEstimasiReservasiPresenter
            r2 = r1
            r2.<init>()
            java.util.concurrent.Future r0 = r0.submit(r1)
            r0 = 0
            r6 = r0
            r0 = r4
            java.lang.String r1 = "getPoolSize"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: all -> 0x0045
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: all -> 0x0045
            r1 = r5
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: all -> 0x0045
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: all -> 0x0045
            r4 = r0
            r0 = r4
            boolean r0 = r0 instanceof java.lang.Integer     // Catch: all -> 0x0045
            if (r0 == 0) goto L_0x0032
            r0 = r4
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: all -> 0x0045
            r4 = r0
            goto L_0x0034
        L_0x0032:
            r0 = 0
            r4 = r0
        L_0x0034:
            r0 = r4
            if (r0 != 0) goto L_0x003a
            r0 = 0
            return r0
        L_0x003a:
            r0 = r4
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0043
            r0 = 1
            r6 = r0
        L_0x0043:
            r0 = r6
            return r0
        L_0x0045:
            r4 = move-exception
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GetCurrenciesBNPresenter.b(java.lang.Class, java.util.concurrent.ExecutorService):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private final java.util.concurrent.ExecutorService c() {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GetCurrenciesBNPresenter.c():java.util.concurrent.ExecutorService");
    }

    public static /* synthetic */ Thread e(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, subscribeReservationRescheduleEvent.b("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    public static /* synthetic */ void e() {
    }

    private static int h() {
        Integer valueOf = Integer.valueOf(d);
        int i = 1;
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            i = Runtime.getRuntime().availableProcessors() - 1;
            if (i < 1) {
            }
        } else {
            i = valueOf.intValue();
        }
        return i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // o.InquiryLoadDataBTPresenter
    public final void d(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Runnable runnable) {
        try {
            Executor executor = pool;
            Executor executor2 = executor;
            if (executor == null) {
                executor2 = a();
            }
            GetAcctOpeningCategoryDataPresenter getAcctOpeningCategoryDataPresenter = ForgotEmailPassPresenter.e;
            executor2.execute(getAcctOpeningCategoryDataPresenter == null ? runnable : getAcctOpeningCategoryDataPresenter.a());
        } catch (RejectedExecutionException e) {
            RequestOTPPresenter.a.d(runnable);
        }
    }

    @Override // o.InquiryLoadDataBTPresenter, java.lang.Object
    public final String toString() {
        return "CommonPool";
    }
}
