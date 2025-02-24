package o;

import java.util.concurrent.TimeUnit;
/* loaded from: classes2-dex2jar.jar:o/RequestOTPPresenter.class */
public final class RequestOTPPresenter extends SaveToEformPresenter implements Runnable {
    private static volatile Thread _thread;
    public static final RequestOTPPresenter a;
    private static volatile int debugStatus;
    private static final long g;

    static {
        Long l;
        RequestOTPPresenter requestOTPPresenter = new RequestOTPPresenter();
        a = requestOTPPresenter;
        requestOTPPresenter.e(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException e) {
            l = 1000L;
        }
        g = timeUnit.toNanos(l.longValue());
    }

    private RequestOTPPresenter() {
    }

    private final Thread k() {
        Thread thread;
        synchronized (this) {
            Thread thread2 = _thread;
            thread = thread2;
            if (thread2 == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    private final boolean m() {
        synchronized (this) {
            int i = debugStatus;
            if (i == 2 || i == 3) {
                return false;
            }
            debugStatus = 1;
            notifyAll();
            return true;
        }
    }

    private final void o() {
        synchronized (this) {
            int i = debugStatus;
            if (i == 2 || i == 3) {
                debugStatus = 3;
                l();
                notifyAll();
            }
        }
    }

    @Override // o.SendEmailActPresenter
    protected final Thread e() {
        Thread thread = _thread;
        Thread thread2 = thread;
        if (thread == null) {
            thread2 = k();
        }
        return thread2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [long] */
    /* JADX WARN: Type inference failed for: r0v48, types: [long] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Unknown variable types count: 3 */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RequestOTPPresenter.run():void");
    }
}
