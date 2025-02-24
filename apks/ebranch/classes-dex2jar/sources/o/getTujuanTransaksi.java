package o;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes-dex2jar.jar:o/getTujuanTransaksi.class */
public final class getTujuanTransaksi implements ThreadFactory {
    private final String b;
    private final AtomicInteger e = new AtomicInteger();
    private final ThreadFactory c = Executors.defaultThreadFactory();

    public getTujuanTransaksi(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Name must not be null");
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.c.newThread(new getWaktuPengirimanTransaksi(runnable, 0));
        int andIncrement = this.e.getAndIncrement();
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
