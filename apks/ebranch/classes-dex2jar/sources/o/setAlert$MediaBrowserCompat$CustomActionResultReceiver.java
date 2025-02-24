package o;

import android.os.Process;
import android.os.StrictMode;
import java.util.concurrent.ThreadFactory;
import o.setAlert;
/* loaded from: classes-dex2jar.jar:o/setAlert$MediaBrowserCompat$CustomActionResultReceiver.class */
final class setAlert$MediaBrowserCompat$CustomActionResultReceiver implements ThreadFactory {
    private final String a;
    private int c;
    final setAlert.IconCompatParcelizer d;
    final boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAlert$MediaBrowserCompat$CustomActionResultReceiver(String str, setAlert.IconCompatParcelizer iconCompatParcelizer, boolean z) {
        this.a = str;
        this.d = iconCompatParcelizer;
        this.e = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AnonymousClass4 r0;
        synchronized (this) {
            StringBuilder sb = new StringBuilder("glide-");
            sb.append(this.a);
            sb.append("-thread-");
            sb.append(this.c);
            r0 = new Thread(runnable, sb.toString()) { // from class: o.setAlert$MediaBrowserCompat$CustomActionResultReceiver.4
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    Process.setThreadPriority(9);
                    if (setAlert$MediaBrowserCompat$CustomActionResultReceiver.this.e) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        run();
                    } catch (Throwable th) {
                        setAlert$MediaBrowserCompat$CustomActionResultReceiver.this.d.b(th);
                    }
                }
            };
            this.c++;
        }
        return r0;
    }
}
