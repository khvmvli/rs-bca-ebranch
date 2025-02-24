package o;

import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
/* loaded from: classes2-dex2jar.jar:o/realmGet$SenderAddress.class */
public final class realmGet$SenderAddress<V> extends FutureTask<V> implements Comparable<realmGet$SenderAddress<V>> {
    private final long a;
    final /* synthetic */ realmGet$SenderIdType b;
    private final String c;
    final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public realmGet$SenderAddress(realmGet$SenderIdType realmget_senderidtype, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.b = realmget_senderidtype;
        setFotoKtp.b(str);
        long andIncrement = realmGet$SenderIdType.e.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.e = z;
        if (andIncrement == Long.MAX_VALUE) {
            realmget_senderidtype.q.s_().b().b("Tasks index overflow");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public realmGet$SenderAddress(realmGet$SenderIdType realmget_senderidtype, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.b = realmget_senderidtype;
        setFotoKtp.b("Task exception on worker thread");
        long andIncrement = realmGet$SenderIdType.e.getAndIncrement();
        this.a = andIncrement;
        this.c = "Task exception on worker thread";
        this.e = z;
        if (andIncrement == Long.MAX_VALUE) {
            realmget_senderidtype.q.s_().b().b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        realmGet$SenderAddress realmget_senderaddress = (realmGet$SenderAddress) obj;
        boolean z = this.e;
        int i = -1;
        if (z == realmget_senderaddress.e) {
            int i2 = (this.a > realmget_senderaddress.a ? 1 : (this.a == realmget_senderaddress.a ? 0 : -1));
            if (i2 >= 0) {
                if (i2 <= 0) {
                    this.b.q.s_().d().e("Two tasks share the same index. index", Long.valueOf(this.a));
                    return 0;
                }
            }
            return i;
        } else if (z) {
            return -1;
        }
        i = 1;
        return i;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.b.q.s_().b().e(this.c, th);
        if ((th instanceof realmGet$SenderName) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        setException(th);
    }
}
