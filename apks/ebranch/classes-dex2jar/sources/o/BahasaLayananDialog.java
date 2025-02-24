package o;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import o.Warkat$;
import o.realmSet;
/* loaded from: classes-dex2jar.jar:o/BahasaLayananDialog.class */
public final class BahasaLayananDialog<TResult> extends setJatuhTempo<TResult> {
    private volatile boolean b;
    private boolean d;
    private Object e;
    private Exception f;
    private final Object a = new Object();
    private final BahasaLayananDialog_ViewBinding c = new BahasaLayananDialog_ViewBinding();

    private final void f() {
        synchronized (this.a) {
            if (this.d) {
                this.c.e(this);
            }
        }
    }

    private final void g() {
        if (this.d) {
            throw DuplicateTaskCompletionException.e(this);
        }
    }

    private final void h() {
        setFotoKtp.c(this.d, "Task is not yet complete");
    }

    private final void i() {
        if (this.b) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @Override // o.setJatuhTempo
    public final setJatuhTempo<TResult> a(Executor executor, realmSet.kodeJenisWarkat kodejeniswarkat) {
        this.c.d(new AskOrangDatangKeCabangDialog_ViewBinding(executor, kodejeniswarkat));
        f();
        return this;
    }

    @Override // o.setJatuhTempo
    public final boolean a() {
        return this.b;
    }

    public final boolean a(Exception exc) {
        setFotoKtp.a(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.d) {
                return false;
            }
            this.d = true;
            this.f = exc;
            this.c.e(this);
            return true;
        }
    }

    public final boolean a(Object obj) {
        synchronized (this.a) {
            if (this.d) {
                return false;
            }
            this.d = true;
            this.e = obj;
            this.c.e(this);
            return true;
        }
    }

    @Override // o.setJatuhTempo
    public final setJatuhTempo<TResult> b(Executor executor, realmSet.jenisWarkat jeniswarkat) {
        this.c.d(new AskOrangDatangKeCabangDialog(executor, jeniswarkat));
        f();
        return this;
    }

    @Override // o.setJatuhTempo
    public final <TContinuationResult> setJatuhTempo<TContinuationResult> b(Executor executor, realmSet$kodeBank<TResult, TContinuationResult> realmset_kodebank) {
        BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
        this.c.d(new Warkat$.Parcelable(executor, realmset_kodebank, bahasaLayananDialog));
        f();
        return bahasaLayananDialog;
    }

    @Override // o.setJatuhTempo
    public final setJatuhTempo<TResult> b(Executor executor, realmSet.nominal<? super TResult> nominal) {
        this.c.d(new infoProduct(executor, nominal));
        f();
        return this;
    }

    @Override // o.setJatuhTempo
    public final <TContinuationResult> setJatuhTempo<TContinuationResult> b(realmSet$kodeBank<TResult, TContinuationResult> realmset_kodebank) {
        return b(realmSet.nomorWarkat.a, realmset_kodebank);
    }

    @Override // o.setJatuhTempo
    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.d) {
                z = false;
                if (!this.b) {
                    z = false;
                    if (this.f == null) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    @Override // o.setJatuhTempo
    public final TResult c() {
        TResult tresult;
        synchronized (this.a) {
            h();
            i();
            Exception exc = this.f;
            if (exc == null) {
                tresult = (TResult) this.e;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return tresult;
    }

    @Override // o.setJatuhTempo
    public final <TContinuationResult> setJatuhTempo<TContinuationResult> c(realmSet.namaBank<TResult, TContinuationResult> namabank) {
        Executor executor = realmSet.nomorWarkat.a;
        BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
        this.c.d(new BN5KonfirmasiTransaksiDialog(executor, namabank, bahasaLayananDialog));
        f();
        return bahasaLayananDialog;
    }

    public final void c(Exception exc) {
        setFotoKtp.a(exc, "Exception must not be null");
        synchronized (this.a) {
            g();
            this.d = true;
            this.f = exc;
        }
        this.c.e(this);
    }

    @Override // o.setJatuhTempo
    public final Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // o.setJatuhTempo
    public final <X extends Throwable> TResult d(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.a) {
            h();
            i();
            if (!cls.isInstance(this.f)) {
                Exception exc = this.f;
                if (exc == null) {
                    tresult = (TResult) this.e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw cls.cast(this.f);
            }
        }
        return tresult;
    }

    @Override // o.setJatuhTempo
    public final <TContinuationResult> setJatuhTempo<TContinuationResult> d(Executor executor, realmSet$kodeBank<TResult, setJatuhTempo<TContinuationResult>> realmset_kodebank) {
        BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
        this.c.d(new AgamaDialog(executor, realmset_kodebank, bahasaLayananDialog));
        f();
        return bahasaLayananDialog;
    }

    @Override // o.setJatuhTempo
    public final setJatuhTempo<TResult> d(realmSet.localClearingCodeBank<TResult> localclearingcodebank) {
        this.c.d(new clickPilih(realmSet.nomorWarkat.a, localclearingcodebank));
        f();
        return this;
    }

    @Override // o.setJatuhTempo
    public final setJatuhTempo<TResult> e(Executor executor, realmSet.localClearingCodeBank<TResult> localclearingcodebank) {
        this.c.d(new clickPilih(executor, localclearingcodebank));
        f();
        return this;
    }

    @Override // o.setJatuhTempo
    public final <TContinuationResult> setJatuhTempo<TContinuationResult> e(Executor executor, realmSet.namaBank<TResult, TContinuationResult> namabank) {
        BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
        this.c.d(new BN5KonfirmasiTransaksiDialog(executor, namabank, bahasaLayananDialog));
        f();
        return bahasaLayananDialog;
    }

    public final void e(Object obj) {
        synchronized (this.a) {
            g();
            this.d = true;
            this.e = obj;
        }
        this.c.e(this);
    }

    @Override // o.setJatuhTempo
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    public final boolean j() {
        synchronized (this.a) {
            if (this.d) {
                return false;
            }
            this.d = true;
            this.b = true;
            this.c.e(this);
            return true;
        }
    }
}
