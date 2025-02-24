package o;

import android.os.Process;
/* loaded from: classes2-dex2jar.jar:o/OR1DataPengirimFragment$MediaBrowserCompat$CustomActionResultReceiver.class */
final class OR1DataPengirimFragment$MediaBrowserCompat$CustomActionResultReceiver extends Thread {
    public OR1DataPengirimFragment$MediaBrowserCompat$CustomActionResultReceiver(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        run();
    }
}
