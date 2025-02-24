package o;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* loaded from: classes-dex2jar.jar:o/setResRT.class */
public final class setResRT extends setEmailAddr {
    private final setResPostCode a;
    private final Context b;
    private volatile Handler d;
    private volatile Executor j;
    private final HashMap c = new HashMap();
    private final getAlamatPengirim f = getAlamatPengirim.b();
    private final long h = 5000;
    private final long i = 300000;

    public setResRT(Context context, Looper looper, Executor executor) {
        setResPostCode setrespostcode = new setResPostCode(this, null);
        this.a = setrespostcode;
        this.b = context.getApplicationContext();
        this.d = new getTipeNasabahPenerima(looper, setrespostcode);
        this.j = executor;
    }

    @Override // o.setEmailAddr
    protected final void a(setResCountry setrescountry, ServiceConnection serviceConnection, String str) {
        setFotoKtp.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            setResCity setrescity = (setResCity) this.c.get(setrescountry);
            if (setrescity == null) {
                String obj = setrescountry.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (setrescity.b(serviceConnection)) {
                setrescity.d(serviceConnection, str);
                if (setrescity.b()) {
                    this.d.sendMessageDelayed(this.d.obtainMessage(0, setrescountry), this.h);
                }
            } else {
                String obj2 = setrescountry.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    @Override // o.setEmailAddr
    public final boolean e(setResCountry setrescountry, ServiceConnection serviceConnection, String str, Executor executor) {
        setResCity setrescity;
        boolean a;
        setFotoKtp.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            setResCity setrescity2 = (setResCity) this.c.get(setrescountry);
            Executor executor2 = executor;
            if (executor == null) {
                executor2 = this.j;
            }
            if (setrescity2 == null) {
                setResCity setrescity3 = new setResCity(this, setrescountry);
                setrescity3.d(serviceConnection, serviceConnection, str);
                setrescity3.a(str, executor2);
                this.c.put(setrescountry, setrescity3);
                setrescity = setrescity3;
            } else {
                this.d.removeMessages(0, setrescountry);
                if (!setrescity2.b(serviceConnection)) {
                    setrescity2.d(serviceConnection, serviceConnection, str);
                    int e = setrescity2.e();
                    if (e == 1) {
                        serviceConnection.onServiceConnected(setrescity2.c(), setrescity2.d());
                        setrescity = setrescity2;
                    } else if (e != 2) {
                        setrescity = setrescity2;
                    } else {
                        setrescity2.a(str, executor2);
                        setrescity = setrescity2;
                    }
                } else {
                    String obj = setrescountry.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            a = setrescity.a();
        }
        return a;
    }
}
