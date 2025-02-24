package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes-dex2jar.jar:o/setResCity.class */
final class setResCity implements ServiceConnection, setResPhoneNumber {
    private boolean a;
    final /* synthetic */ setResRT b;
    private IBinder d;
    private final setResCountry f;
    private ComponentName i;
    private final Map c = new HashMap();
    private int e = 2;

    public setResCity(setResRT setresrt, setResCountry setrescountry) {
        this.b = setresrt;
        this.f = setrescountry;
    }

    public final void a(String str) {
        this.b.d.removeMessages(1, this.f);
        setResRT setresrt = this.b;
        setresrt.f.d(setresrt.b, this);
        this.a = false;
        this.e = 2;
    }

    public final void a(String str, Executor executor) {
        this.e = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (getTipeNasabahPengirimId.a()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            setResRT setresrt = this.b;
            boolean e = setresrt.f.e(setresrt.b, str, this.f.d(setresrt.b), this, 4225, executor);
            this.a = e;
            if (e) {
                this.b.d.sendMessageDelayed(this.b.d.obtainMessage(1, this.f), this.b.i);
            } else {
                this.e = 2;
                try {
                    setResRT setresrt2 = this.b;
                    setresrt2.f.d(setresrt2.b, this);
                } catch (IllegalArgumentException e2) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.c.isEmpty();
    }

    public final boolean b(ServiceConnection serviceConnection) {
        return this.c.containsKey(serviceConnection);
    }

    public final ComponentName c() {
        return this.i;
    }

    public final IBinder d() {
        return this.d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.c.put(serviceConnection, serviceConnection2);
    }

    public final void d(ServiceConnection serviceConnection, String str) {
        this.c.remove(serviceConnection);
    }

    public final int e() {
        return this.e;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.b.c) {
            this.b.d.removeMessages(1, this.f);
            this.d = iBinder;
            this.i = componentName;
            for (ServiceConnection serviceConnection : this.c.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.e = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.b.c) {
            this.b.d.removeMessages(1, this.f);
            this.d = null;
            this.i = componentName;
            for (ServiceConnection serviceConnection : this.c.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.e = 2;
        }
    }
}
