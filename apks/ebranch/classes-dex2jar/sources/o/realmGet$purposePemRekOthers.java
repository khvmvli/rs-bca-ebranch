package o;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import o.BankTransfer$$Parcelable;
import o.realmGet$occupationFlagFreeText;
import o.realmGet$oldCustFlag;
/* loaded from: classes-dex2jar.jar:o/realmGet$purposePemRekOthers.class */
public abstract class realmGet$purposePemRekOthers<R extends realmGet$oldCustFlag> extends realmGet$occupationFlagFreeText<R> {
    static final ThreadLocal d = new ThreadLocal() { // from class: o.realmSet$resPostCode
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ Object initialValue() {
            return false;
        }
    };
    protected final WeakReference a;
    protected final read b;
    private realmSet$resRW c;
    private final Object e;
    private final CountDownLatch f;
    private realmGet$oldCustFlag g;
    private final ArrayList h;
    private final AtomicReference i;
    private realmGet$officeName j;
    private Status k;
    private boolean l;
    private volatile boolean m;
    private boolean n;

    /* renamed from: o */
    private setFlagEKTP f182o;
    private boolean s;
    private volatile realmSet$officePostCode t;

    /* loaded from: classes-dex2jar.jar:o/realmGet$purposePemRekOthers$read.class */
    public static final class read<R extends realmGet$oldCustFlag> extends BankTransfer$$Parcelable.AnonymousClass1 {
        public read() {
            super(Looper.getMainLooper());
        }

        public read(Looper looper) {
            super(looper);
        }

        public final void d(realmGet$officeName realmget_officename, realmGet$oldCustFlag realmget_oldcustflag) {
            if (realmget_officename != null) {
                sendMessage(obtainMessage(1, new Pair(realmget_officename, realmget_oldcustflag)));
                return;
            }
            throw new NullPointerException("null reference");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                realmGet$officeName realmget_officename = (realmGet$officeName) pair.first;
                realmGet$oldCustFlag realmget_oldcustflag = (realmGet$oldCustFlag) pair.second;
                try {
                    realmget_officename.c(realmget_oldcustflag);
                } catch (RuntimeException e) {
                    realmGet$purposePemRekOthers.a(realmget_oldcustflag);
                    throw e;
                }
            } else if (i != 2) {
                int i2 = message.what;
                StringBuilder sb = new StringBuilder("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((realmGet$purposePemRekOthers) message.obj).b(Status.g);
            }
        }
    }

    @Deprecated
    realmGet$purposePemRekOthers() {
        this.e = new Object();
        this.f = new CountDownLatch(1);
        this.h = new ArrayList();
        this.i = new AtomicReference();
        this.s = false;
        this.b = new read(Looper.getMainLooper());
        this.a = new WeakReference(null);
    }

    public realmGet$purposePemRekOthers(realmGet$occupation realmget_occupation) {
        this.e = new Object();
        this.f = new CountDownLatch(1);
        this.h = new ArrayList();
        this.i = new AtomicReference();
        this.s = false;
        this.b = new read(realmget_occupation != null ? realmget_occupation.e() : Looper.getMainLooper());
        this.a = new WeakReference(realmget_occupation);
    }

    public static void a(realmGet$oldCustFlag realmget_oldcustflag) {
        if (realmget_oldcustflag instanceof realmGet$occupationValue) {
            try {
                ((realmGet$occupationValue) realmget_oldcustflag).b();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(realmget_oldcustflag))), e);
            }
        }
    }

    private final void c(realmGet$oldCustFlag realmget_oldcustflag) {
        this.g = realmget_oldcustflag;
        this.k = realmget_oldcustflag.e();
        this.f182o = null;
        this.f.countDown();
        if (this.l) {
            this.j = null;
        } else {
            realmGet$officeName realmget_officename = this.j;
            if (realmget_officename != null) {
                this.b.removeMessages(2);
                this.b.d(realmget_officename, d());
            } else if (this.g instanceof realmGet$occupationValue) {
                this.c = new Object(null) { // from class: o.realmSet$resRW
                    protected final void finalize() throws Throwable {
                        realmGet$purposePemRekOthers.a(realmGet$purposePemRekOthers.this.g);
                        finalize();
                    }
                };
            }
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((realmGet$occupationFlagFreeText.IconCompatParcelizer) arrayList.get(i)).d(this.k);
        }
        this.h.clear();
    }

    private final realmGet$oldCustFlag d() {
        realmGet$oldCustFlag realmget_oldcustflag;
        synchronized (this.e) {
            setFotoKtp.c(!this.m, "Result has already been consumed.");
            setFotoKtp.c(c(), "Result is not ready.");
            realmget_oldcustflag = this.g;
            this.g = null;
            this.j = null;
            this.m = true;
        }
        realmSet$oldCustFlag realmset_oldcustflag = (realmSet$oldCustFlag) this.i.getAndSet(null);
        if (realmset_oldcustflag != null) {
            realmset_oldcustflag.e.b.remove(this);
        }
        return (realmGet$oldCustFlag) setFotoKtp.b(realmget_oldcustflag);
    }

    public final void a(realmSet$oldCustFlag realmset_oldcustflag) {
        this.i.set(realmset_oldcustflag);
    }

    public void b() {
        synchronized (this.e) {
            if (!this.l && !this.m) {
                setFlagEKTP setflagektp = this.f182o;
                if (setflagektp != null) {
                    try {
                        setflagektp.d();
                    } catch (RemoteException e) {
                    }
                }
                a(this.g);
                this.l = true;
                c(e(Status.a));
            }
        }
    }

    @Deprecated
    public final void b(Status status) {
        synchronized (this.e) {
            if (!c()) {
                e((realmGet$purposePemRekOthers<R>) e(status));
                this.n = true;
            }
        }
    }

    @Override // o.realmGet$occupationFlagFreeText
    public final void b(realmGet$occupationFlagFreeText.IconCompatParcelizer iconCompatParcelizer) {
        setFotoKtp.d(iconCompatParcelizer != null, "Callback cannot be null.");
        synchronized (this.e) {
            if (c()) {
                iconCompatParcelizer.d(this.k);
            } else {
                this.h.add(iconCompatParcelizer);
            }
        }
    }

    public final boolean c() {
        return this.f.getCount() == 0;
    }

    protected abstract R e(Status status);

    @Override // o.realmGet$occupationFlagFreeText
    public final void e(realmGet$officeName<? super R> realmget_officename) {
        synchronized (this.e) {
            if (realmget_officename == null) {
                this.j = null;
                return;
            }
            boolean z = true;
            setFotoKtp.c(!this.m, "Result has already been consumed.");
            if (this.t != null) {
                z = false;
            }
            setFotoKtp.c(z, "Cannot set callbacks if then() has been called.");
            if (!e()) {
                if (c()) {
                    this.b.d(realmget_officename, d());
                } else {
                    this.j = realmget_officename;
                }
            }
        }
    }

    public final void e(R r) {
        synchronized (this.e) {
            if (this.n || this.l) {
                a(r);
                return;
            }
            c();
            setFotoKtp.c(!c(), "Results have already been set");
            setFotoKtp.c(!this.m, "Result has already been consumed");
            c(r);
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this.e) {
            z = this.l;
        }
        return z;
    }

    public final boolean f() {
        boolean e;
        synchronized (this.e) {
            if (((realmGet$occupation) this.a.get()) == null || !this.s) {
                b();
            }
            e = e();
        }
        return e;
    }

    public final void j() {
        this.s = this.s || ((Boolean) d.get()).booleanValue();
    }
}
