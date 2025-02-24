package o;

import android.os.Process;
/* loaded from: classes-dex2jar.jar:o/getWaktuPengirimanTransaksi.class */
final class getWaktuPengirimanTransaksi implements Runnable {
    private final Runnable b;

    public getWaktuPengirimanTransaksi(Runnable runnable, int i) {
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.b.run();
    }
}
