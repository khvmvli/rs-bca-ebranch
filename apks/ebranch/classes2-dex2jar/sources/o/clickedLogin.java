package o;

import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2-dex2jar.jar:o/clickedLogin.class */
public class clickedLogin {
    private int a;
    private long b;
    private final Utils d = Utils.getInstance();
    private static final long e = TimeUnit.HOURS.toMillis(24);
    private static final long c = TimeUnit.MINUTES.toMillis(30);

    private static boolean c(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    private long e(int i) {
        synchronized (this) {
            if (!(i == 429 || (i >= 500 && i < 600))) {
                return e;
            }
            return (long) Math.min(Math.pow(2.0d, (double) this.a) + ((double) this.d.getRandomDelayForSyncPrevention()), (double) c);
        }
    }

    public final void d(int i) {
        synchronized (this) {
            if (c(i)) {
                synchronized (this) {
                    this.a = 0;
                }
                return;
            }
            this.a++;
            this.b = this.d.currentTimeInMillis() + e(i);
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this) {
            if (this.a != 0) {
                if (this.d.currentTimeInMillis() <= this.b) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }
}
