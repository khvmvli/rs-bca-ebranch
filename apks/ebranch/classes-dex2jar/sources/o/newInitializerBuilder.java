package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes-dex2jar.jar:o/newInitializerBuilder.class */
public class newInitializerBuilder {
    public static final newInitializerBuilder NONE = new newInitializerBuilder() { // from class: o.newInitializerBuilder.3
        @Override // o.newInitializerBuilder
        public final newInitializerBuilder deadlineNanoTime(long j) {
            return this;
        }

        @Override // o.newInitializerBuilder
        public final void throwIfReached() throws IOException {
        }

        @Override // o.newInitializerBuilder
        public final newInitializerBuilder timeout(long j, TimeUnit timeUnit) {
            return this;
        }
    };
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    static long minTimeout(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        if (j2 != 0 && j >= j2) {
            return j2;
        }
        return j;
    }

    public newInitializerBuilder clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public newInitializerBuilder clearTimeout() {
        this.timeoutNanos = 0;
        return this;
    }

    public final newInitializerBuilder deadline(long j, TimeUnit timeUnit) {
        if (j <= 0) {
            StringBuilder sb = new StringBuilder("duration <= 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public newInitializerBuilder deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public newInitializerBuilder timeout(long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder("timeout < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j = 0;
            if (hasDeadline || timeoutNanos != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline && timeoutNanos != 0) {
                    timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
                } else if (hasDeadline) {
                    timeoutNanos = deadlineNanoTime() - nanoTime;
                }
                if (timeoutNanos > 0) {
                    long j2 = timeoutNanos / 1000000;
                    Long.signum(j2);
                    obj.wait(j2, (int) (timeoutNanos - (1000000 * j2)));
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= timeoutNanos) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
