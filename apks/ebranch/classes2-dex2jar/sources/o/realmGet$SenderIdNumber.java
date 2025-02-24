package o;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import o.realmSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/realmGet$SenderIdNumber.class */
public final class realmGet$SenderIdNumber extends Thread {
    final /* synthetic */ realmGet$SenderIdType b;
    private final BlockingQueue<realmGet$SenderAddress<?>> e;
    private boolean d = false;
    private final Object a = new Object();

    public realmGet$SenderIdNumber(realmGet$SenderIdType realmget_senderidtype, String str, BlockingQueue<realmGet$SenderAddress<?>> blockingQueue) {
        this.b = realmget_senderidtype;
        setFotoKtp.b(str);
        setFotoKtp.b(blockingQueue);
        this.e = blockingQueue;
        setName(str);
    }

    private final void d() {
        synchronized (this.b.g) {
            if (!this.d) {
                this.b.j.release();
                this.b.g.notifyAll();
                if (this == this.b.a) {
                    this.b.a = null;
                } else if (this == this.b.b) {
                    this.b.b = null;
                } else {
                    this.b.q.s_().b().b("Current scheduler thread is neither worker nor network");
                }
                this.d = true;
            }
        }
    }

    private final void d(InterruptedException interruptedException) {
        this.b.q.s_().c().e(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void b() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.b.j.acquire();
                z = true;
            } catch (InterruptedException e) {
                d(e);
            }
        }
        try {
            int i = Process.getThreadPriority(Process.myTid());
            while (true) {
                realmGet$SenderAddress<?> poll = this.e.poll();
                if (poll != null) {
                    if (true != poll.e) {
                        i = 10;
                    }
                    Process.setThreadPriority(i);
                    poll.run();
                } else {
                    synchronized (this.a) {
                        if (this.e.peek() == null) {
                            boolean unused = this.b.i;
                            try {
                                this.a.wait(30000);
                            } catch (InterruptedException e2) {
                                d(e2);
                            }
                        }
                    }
                    synchronized (this.b.g) {
                        if (this.e.peek() == null) {
                            break;
                        }
                    }
                }
            }
            if (this.b.q.t().c((String) null, realmSet.hasDone.X)) {
                d();
            }
        } finally {
            d();
        }
    }
}
