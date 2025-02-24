package o;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes-dex2jar.jar:o/getTujuanTransaksiCode.class */
public final class getTujuanTransaksiCode implements ThreadFactory {
    private final String a;
    private final ThreadFactory d = Executors.defaultThreadFactory();

    public getTujuanTransaksiCode(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Name must not be null");
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.d.newThread(new getWaktuPengirimanTransaksi(runnable, 0));
        newThread.setName(this.a);
        return newThread;
    }
}
