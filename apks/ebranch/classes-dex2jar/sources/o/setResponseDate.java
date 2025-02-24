package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/setResponseDate.class */
public class setResponseDate extends newInitializerBuilder {
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    @Nullable
    static setResponseDate head;
    private boolean inQueue;
    @Nullable
    private setResponseDate next;
    private long timeoutAt;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setResponseDate$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends Thread {
        RemoteActionCompatParcelizer() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
            r0.timedOut();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<o.setResponseDate> r0 = o.setResponseDate.class
                monitor-enter(r0)     // Catch: InterruptedException -> 0x0030
                o.setResponseDate r0 = o.setResponseDate.awaitTimeout()     // Catch: all -> 0x002a, InterruptedException -> 0x0030
                r4 = r0
                r0 = r4
                if (r0 != 0) goto L_0x0011
                java.lang.Class<o.setResponseDate> r0 = o.setResponseDate.class
                monitor-exit(r0)
                goto L_0x0000
            L_0x0011:
                r0 = r4
                o.setResponseDate r1 = o.setResponseDate.head     // Catch: all -> 0x002a
                if (r0 != r1) goto L_0x0020
                r0 = 0
                o.setResponseDate.head = r0     // Catch: all -> 0x002a
                java.lang.Class<o.setResponseDate> r0 = o.setResponseDate.class
                monitor-exit(r0)
                return
            L_0x0020:
                java.lang.Class<o.setResponseDate> r0 = o.setResponseDate.class
                monitor-exit(r0)
                r0 = r4
                r0.timedOut()     // Catch: InterruptedException -> 0x0030
                goto L_0x0000
            L_0x002a:
                r4 = move-exception
                java.lang.Class<o.setResponseDate> r0 = o.setResponseDate.class
                monitor-exit(r0)
                r0 = r4
                throw r0     // Catch: InterruptedException -> 0x0030
            L_0x0030:
                r4 = move-exception
                goto L_0x0000
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setResponseDate.RemoteActionCompatParcelizer.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    static setResponseDate awaitTimeout() throws InterruptedException {
        setResponseDate setresponsedate = head.next;
        if (setresponsedate == null) {
            long nanoTime = System.nanoTime();
            setResponseDate.class.wait(IDLE_TIMEOUT_MILLIS);
            setResponseDate setresponsedate2 = null;
            if (head.next == null) {
                setresponsedate2 = null;
                if (System.nanoTime() - nanoTime >= IDLE_TIMEOUT_NANOS) {
                    setresponsedate2 = head;
                }
            }
            return setresponsedate2;
        }
        long remainingNanos = setresponsedate.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j = remainingNanos / 1000000;
            setResponseDate.class.wait(j, (int) (remainingNanos - (1000000 * j)));
            return null;
        }
        head.next = setresponsedate.next;
        setresponsedate.next = null;
        return setresponsedate;
    }

    private static boolean cancelScheduledTimeout(setResponseDate setresponsedate) {
        synchronized (setResponseDate.class) {
            try {
                setResponseDate setresponsedate2 = head;
                while (setresponsedate2 != null) {
                    setResponseDate setresponsedate3 = setresponsedate2.next;
                    if (setresponsedate3 == setresponsedate) {
                        setresponsedate2.next = setresponsedate.next;
                        setresponsedate.next = null;
                        return false;
                    }
                    setresponsedate2 = setresponsedate3;
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    private static void scheduleTimeout(setResponseDate setresponsedate, long j, boolean z) {
        synchronized (setResponseDate.class) {
            try {
                if (head == null) {
                    head = new setResponseDate();
                    new RemoteActionCompatParcelizer().start();
                }
                long nanoTime = System.nanoTime();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i != 0 && z) {
                    setresponsedate.timeoutAt = Math.min(j, setresponsedate.deadlineNanoTime() - nanoTime) + nanoTime;
                } else if (i != 0) {
                    setresponsedate.timeoutAt = j + nanoTime;
                } else if (z) {
                    setresponsedate.timeoutAt = setresponsedate.deadlineNanoTime();
                } else {
                    throw new AssertionError();
                }
                long remainingNanos = setresponsedate.remainingNanos(nanoTime);
                setResponseDate setresponsedate2 = head;
                while (true) {
                    setResponseDate setresponsedate3 = setresponsedate2.next;
                    if (setresponsedate3 == null || remainingNanos < setresponsedate3.remainingNanos(nanoTime)) {
                        break;
                    }
                    setresponsedate2 = setresponsedate2.next;
                }
                setresponsedate.next = setresponsedate2.next;
                setresponsedate2.next = setresponsedate;
                if (setresponsedate2 == head) {
                    setResponseDate.class.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.inQueue = true;
                scheduleTimeout(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    final IOException exit(IOException iOException) throws IOException {
        return !exit() ? iOException : newTimeoutException(iOException);
    }

    final void exit(boolean z) throws IOException {
        if (exit() && z) {
            throw newTimeoutException(null);
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    protected IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final initialize sink(initialize initialize) {
        return new 4(this, initialize);
    }

    public final defaultInspectorModulesProvider source(defaultInspectorModulesProvider defaultinspectormodulesprovider) {
        return new 2(this, defaultinspectormodulesprovider);
    }

    protected void timedOut() {
    }
}
