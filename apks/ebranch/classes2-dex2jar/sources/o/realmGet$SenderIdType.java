package o;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2-dex2jar.jar:o/realmGet$SenderIdType.class */
public final class realmGet$SenderIdType extends realmSet$RepresentativeRelationship {
    private static final AtomicLong e = new AtomicLong(Long.MIN_VALUE);
    private realmGet$SenderIdNumber a;
    private realmGet$SenderIdNumber b;
    private volatile boolean i;
    private final Object g = new Object();
    private final Semaphore j = new Semaphore(2);
    private final PriorityBlockingQueue<realmGet$SenderAddress<?>> c = new PriorityBlockingQueue<>();
    private final BlockingQueue<realmGet$SenderAddress<?>> d = new LinkedBlockingQueue();
    private final Thread.UncaughtExceptionHandler f = new Thread.UncaughtExceptionHandler("Thread death: Uncaught exception on worker thread") { // from class: o.realmGet$SenderEmail
        private final String c;

        {
            setFotoKtp.b(r5);
            this.c = r5;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            synchronized (this) {
                realmGet$SenderIdType.this.q.s_().b().e(this.c, th);
            }
        }
    };
    private final Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler("Thread death: Uncaught exception on network thread") { // from class: o.realmGet$SenderEmail
        private final String c;

        {
            setFotoKtp.b(r5);
            this.c = r5;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            synchronized (this) {
                realmGet$SenderIdType.this.q.s_().b().e(this.c, th);
            }
        }
    };

    public realmGet$SenderIdType(realmGet$TxnPurpose realmget_txnpurpose) {
        super(realmget_txnpurpose);
    }

    private final void a(realmGet$SenderAddress<?> realmget_senderaddress) {
        synchronized (this.g) {
            this.c.add(realmget_senderaddress);
            realmGet$SenderIdNumber realmget_senderidnumber = this.a;
            if (realmget_senderidnumber == null) {
                realmGet$SenderIdNumber realmget_senderidnumber2 = new realmGet$SenderIdNumber(this, "Measurement Worker", this.c);
                this.a = realmget_senderidnumber2;
                realmget_senderidnumber2.setUncaughtExceptionHandler(this.f);
                this.a.start();
            } else {
                realmget_senderidnumber.b();
            }
        }
    }

    public final void a(Runnable runnable) throws IllegalStateException {
        s();
        setFotoKtp.b(runnable);
        a(new realmGet$SenderAddress<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean a() {
        return Thread.currentThread() == this.a;
    }

    public final <V> Future<V> b(Callable<V> callable) throws IllegalStateException {
        s();
        setFotoKtp.b(callable);
        realmGet$SenderAddress<?> realmget_senderaddress = new realmGet$SenderAddress<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.a) {
            if (!this.c.isEmpty()) {
                this.q.s_().c().b("Callable skipped the worker queue.");
            }
            realmget_senderaddress.run();
        } else {
            a(realmget_senderaddress);
        }
        return realmget_senderaddress;
    }

    public final void b(Runnable runnable) throws IllegalStateException {
        s();
        setFotoKtp.b(runnable);
        a(new realmGet$SenderAddress<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final <V> Future<V> c(Callable<V> callable) throws IllegalStateException {
        s();
        setFotoKtp.b(callable);
        realmGet$SenderAddress<?> realmget_senderaddress = new realmGet$SenderAddress<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.a) {
            realmget_senderaddress.run();
        } else {
            a(realmget_senderaddress);
        }
        return realmget_senderaddress;
    }

    public final void e(Runnable runnable) throws IllegalStateException {
        s();
        setFotoKtp.b(runnable);
        realmGet$SenderAddress<?> realmget_senderaddress = new realmGet$SenderAddress<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.g) {
            this.d.add(realmget_senderaddress);
            realmGet$SenderIdNumber realmget_senderidnumber = this.b;
            if (realmget_senderidnumber == null) {
                realmGet$SenderIdNumber realmget_senderidnumber2 = new realmGet$SenderIdNumber(this, "Measurement Network", this.d);
                this.b = realmget_senderidnumber2;
                realmget_senderidnumber2.setUncaughtExceptionHandler(this.h);
                this.b.start();
            } else {
                realmget_senderidnumber.b();
            }
        }
    }

    @Override // o.realmSet$RepresentativeRelationship
    protected final boolean e() {
        return false;
    }

    @Override // o.realmSet$RepresentativeName
    public final void p_() {
        if (Thread.currentThread() != this.b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // o.realmSet$RepresentativeName
    public final void r_() {
        if (Thread.currentThread() != this.a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }
}
