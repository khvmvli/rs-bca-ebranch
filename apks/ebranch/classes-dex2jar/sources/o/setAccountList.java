package o;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import o.getIbanFlag;
/* loaded from: classes-dex2jar.jar:o/setAccountList.class */
final class setAccountList {
    final ReferenceQueue<getIbanFlag<?>> a;
    getIbanFlag.read b;
    volatile boolean c;
    final Map<setCode, IconCompatParcelizer> d;
    volatile write e;
    private final Executor g;
    private final boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setAccountList$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends WeakReference<getIbanFlag<?>> {
        final boolean c;
        final setCode d;
        setIbanFlag<?> e;

        IconCompatParcelizer(setCode setcode, getIbanFlag<?> getibanflag, ReferenceQueue<? super getIbanFlag<?>> referenceQueue, boolean z) {
            super(getibanflag, referenceQueue);
            setIbanFlag<?> setibanflag;
            if (setcode != null) {
                this.d = setcode;
                if (!getibanflag.d || !z) {
                    setibanflag = null;
                } else {
                    setIbanFlag<?> setibanflag2 = getibanflag.b;
                    if (setibanflag2 != null) {
                        setibanflag = setibanflag2;
                    } else {
                        throw new NullPointerException("Argument must not be null");
                    }
                }
                this.e = setibanflag;
                this.c = getibanflag.d;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setAccountList$write.class */
    interface write {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAccountList(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: o.setAccountList.3
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return new Thread(new Runnable() { // from class: o.setAccountList.3.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "glide-active-resources");
            }
        }));
    }

    private setAccountList(boolean z, Executor executor) {
        this.d = new HashMap();
        this.a = new ReferenceQueue<>();
        this.i = z;
        this.g = executor;
        executor.execute(new Runnable() { // from class: o.setAccountList.2
            @Override // java.lang.Runnable
            public final void run() {
                setAccountList setaccountlist = setAccountList.this;
                while (!setaccountlist.c) {
                    try {
                        setaccountlist.e((IconCompatParcelizer) setaccountlist.a.remove());
                        write write2 = setaccountlist.e;
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final getIbanFlag<?> d(setCode setcode) {
        synchronized (this) {
            IconCompatParcelizer iconCompatParcelizer = this.d.get(setcode);
            if (iconCompatParcelizer == null) {
                return null;
            }
            getIbanFlag<?> getibanflag = iconCompatParcelizer.get();
            if (getibanflag == null) {
                e(iconCompatParcelizer);
            }
            return getibanflag;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(setCode setcode, getIbanFlag<?> getibanflag) {
        synchronized (this) {
            IconCompatParcelizer put = this.d.put(setcode, new IconCompatParcelizer(setcode, getibanflag, this.a, this.i));
            if (put != null) {
                put.e = null;
                put.clear();
            }
        }
    }

    final void e(IconCompatParcelizer iconCompatParcelizer) {
        synchronized (this) {
            this.d.remove(iconCompatParcelizer.d);
            if (iconCompatParcelizer.c) {
                if (iconCompatParcelizer.e != null) {
                    this.b.e(iconCompatParcelizer.d, new getIbanFlag<>(iconCompatParcelizer.e, true, false, iconCompatParcelizer.d, this.b));
                }
            }
        }
    }
}
