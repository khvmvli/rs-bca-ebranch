package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import o.BankTransfer$$Parcelable;
import o.realmGet$occupation;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes-dex2jar.jar:o/setKitasKitapNumber.class */
public final class setKitasKitapNumber implements Handler.Callback {
    @NotOnlyInitialized
    private final setJobValue a;
    private final Handler h;
    private final ArrayList e = new ArrayList();
    final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private volatile boolean d = false;
    private final AtomicInteger i = new AtomicInteger(0);
    private boolean g = false;
    private final Object j = new Object();

    public setKitasKitapNumber(Looper looper, setJobValue setjobvalue) {
        this.a = setjobvalue;
        this.h = new BankTransfer$$Parcelable.AnonymousClass1(looper, this);
    }

    public final void b() {
        this.d = false;
        this.i.incrementAndGet();
    }

    public final void b(int i) {
        setFotoKtp.e(this.h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.h.removeMessages(1);
        synchronized (this.j) {
            this.g = true;
            ArrayList arrayList = new ArrayList(this.e);
            int i2 = this.i.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                realmGet$occupation.IconCompatParcelizer iconCompatParcelizer = (realmGet$occupation.IconCompatParcelizer) it.next();
                if (!this.d || this.i.get() != i2) {
                    break;
                } else if (this.e.contains(iconCompatParcelizer)) {
                    iconCompatParcelizer.e(i);
                }
            }
            this.b.clear();
            this.g = false;
        }
    }

    public final void b(realmGet$occupation.read read) {
        setFotoKtp.b(read);
        synchronized (this.j) {
            if (this.c.contains(read)) {
                String valueOf = String.valueOf(read);
                Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + valueOf + " is already registered");
            } else {
                this.c.add(read);
            }
        }
    }

    public final void c(realmGet$jobValue realmget_jobvalue) {
        setFotoKtp.e(this.h, "onConnectionFailure must only be called on the Handler thread");
        this.h.removeMessages(1);
        synchronized (this.j) {
            ArrayList arrayList = new ArrayList(this.c);
            int i = this.i.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                realmGet$occupation.read read = (realmGet$occupation.read) it.next();
                if (this.d && this.i.get() == i) {
                    if (this.c.contains(read)) {
                        read.b(realmget_jobvalue);
                    }
                }
                return;
            }
        }
    }

    public final void c(realmGet$occupation.read read) {
        setFotoKtp.b(read);
        synchronized (this.j) {
            if (!this.c.remove(read)) {
                String valueOf = String.valueOf(read);
                Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + valueOf + " not found");
            }
        }
    }

    public final void d(Bundle bundle) {
        setFotoKtp.e(this.h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.j) {
            setFotoKtp.a(!this.g);
            this.h.removeMessages(1);
            this.g = true;
            setFotoKtp.a(this.b.isEmpty());
            ArrayList arrayList = new ArrayList(this.e);
            int i = this.i.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                realmGet$occupation.IconCompatParcelizer iconCompatParcelizer = (realmGet$occupation.IconCompatParcelizer) it.next();
                if (!this.d || !this.a.j() || this.i.get() != i) {
                    break;
                } else if (!this.b.contains(iconCompatParcelizer)) {
                    iconCompatParcelizer.e(bundle);
                }
            }
            this.b.clear();
            this.g = false;
        }
    }

    public final void e() {
        this.d = true;
    }

    public final void e(realmGet$occupation.IconCompatParcelizer iconCompatParcelizer) {
        setFotoKtp.b(iconCompatParcelizer);
        synchronized (this.j) {
            if (this.e.contains(iconCompatParcelizer)) {
                String valueOf = String.valueOf(iconCompatParcelizer);
                Log.w("GmsClientEvents", "registerConnectionCallbacks(): listener " + valueOf + " is already registered");
            } else {
                this.e.add(iconCompatParcelizer);
            }
        }
        if (this.a.j()) {
            Handler handler = this.h;
            handler.sendMessage(handler.obtainMessage(1, iconCompatParcelizer));
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            realmGet$occupation.IconCompatParcelizer iconCompatParcelizer = (realmGet$occupation.IconCompatParcelizer) message.obj;
            synchronized (this.j) {
                if (this.d && this.a.j() && this.e.contains(iconCompatParcelizer)) {
                    iconCompatParcelizer.e((Bundle) null);
                }
            }
            return true;
        }
        int i = message.what;
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + i, new Exception());
        return false;
    }
}
