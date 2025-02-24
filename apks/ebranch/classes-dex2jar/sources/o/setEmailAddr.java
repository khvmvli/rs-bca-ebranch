package o;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
/* loaded from: classes-dex2jar.jar:o/setEmailAddr.class */
public abstract class setEmailAddr {
    private static setResRT a;
    private static final Object b = new Object();
    private static Executor c;
    private static boolean d;
    static HandlerThread e;

    public static HandlerThread a() {
        synchronized (b) {
            HandlerThread handlerThread = e;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            e = handlerThread2;
            handlerThread2.start();
            return e;
        }
    }

    public static setEmailAddr a(Context context) {
        synchronized (b) {
            if (a == null) {
                a = new setResRT(context.getApplicationContext(), d ? a().getLooper() : context.getMainLooper(), c);
            }
        }
        return a;
    }

    public static int d() {
        return 4225;
    }

    protected abstract void a(setResCountry setrescountry, ServiceConnection serviceConnection, String str);

    public final void b(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        a(new setResCountry(str, str2, 4225, z), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean e(setResCountry setrescountry, ServiceConnection serviceConnection, String str, Executor executor);
}
