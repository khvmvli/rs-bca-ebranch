package o;

import android.os.CancellationSignal;
/* loaded from: classes-dex2jar.jar:o/setNestedScrollingEnabled.class */
public final class setNestedScrollingEnabled {
    private boolean a;
    private write b;
    private Object c;
    private boolean e;

    /* loaded from: classes-dex2jar.jar:o/setNestedScrollingEnabled$write.class */
    public interface write {
        void c();
    }

    public final boolean b() {
        boolean z;
        synchronized (this) {
            z = this.e;
        }
        return z;
    }

    public final void d() {
        synchronized (this) {
            try {
                if (!this.e) {
                    this.e = true;
                    this.a = true;
                    write write2 = this.b;
                    Object obj = this.c;
                    if (write2 != null) {
                        try {
                            write2.c();
                        } catch (Throwable th) {
                            synchronized (this) {
                                try {
                                    this.a = false;
                                    notifyAll();
                                    throw th;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }
                    if (obj != null) {
                        ((CancellationSignal) obj).cancel();
                    }
                    synchronized (this) {
                        try {
                            this.a = false;
                            notifyAll();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void d(write write2) {
        synchronized (this) {
            while (this.a) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            if (this.b != write2) {
                this.b = write2;
                if (this.e) {
                    write2.c();
                }
            }
        }
    }
}
