package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/getAlamatPengirim.class */
public final class getAlamatPengirim {
    private static final Object d = new Object();
    @Nullable
    private static volatile getAlamatPengirim e;
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    private getAlamatPengirim() {
    }

    public static getAlamatPengirim b() {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new getAlamatPengirim();
                }
            }
        }
        getAlamatPengirim getalamatpengirim = e;
        if (getalamatpengirim != null) {
            return getalamatpengirim;
        }
        throw new NullPointerException("null reference");
    }

    private static final boolean c(Context context, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        Executor executor2 = executor;
        if (executor == null) {
            executor2 = null;
        }
        return (!(Build.VERSION.SDK_INT >= 29) || executor2 == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor2, serviceConnection);
    }

    @ResultIgnorabilityUnspecified
    public final boolean b(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return c(context, context.getClass().getName(), intent, serviceConnection, i, null);
    }

    /* JADX WARN: Finally extract failed */
    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((realmGet$jenisWarkatTransaksi.a.e(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e2) {
            }
        }
        if (!(serviceConnection instanceof setResPhoneNumber)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.a.putIfAbsent(serviceConnection, serviceConnection);
            if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean c = c(context, intent, serviceConnection, i, executor);
                z = c;
                if (!c) {
                    this.a.remove(serviceConnection, serviceConnection);
                    return false;
                }
            } catch (Throwable th) {
                this.a.remove(serviceConnection, serviceConnection);
                throw th;
            }
        } else {
            z = c(context, intent, serviceConnection, i, executor);
        }
        return z;
    }

    public final void d(Context context, ServiceConnection serviceConnection) {
        if (!(!(serviceConnection instanceof setResPhoneNumber)) || !this.a.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException e2) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) this.a.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException e3) {
                }
            } finally {
                this.a.remove(serviceConnection);
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        return c(context, str, intent, serviceConnection, 4225, executor);
    }
}
