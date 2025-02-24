package o;

import android.os.Handler;
import o.realmSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmGet$listWarkat.class */
public abstract class realmGet$listWarkat {
    private static volatile Handler a;
    private final Runnable b;
    private volatile long d;
    private final realmSet.RepresentativeIdNumber e;

    realmGet$listWarkat(realmSet.RepresentativeIdNumber representativeIdNumber) {
        setFotoKtp.b(representativeIdNumber);
        this.e = representativeIdNumber;
        this.b = new Runnable(representativeIdNumber) { // from class: o.realmGet$beritaAcara
            final /* synthetic */ realmSet.RepresentativeIdNumber e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.e.n_();
                if (setSetorans.a()) {
                    this.e.o_().b(this);
                    return;
                }
                boolean d = realmGet$listWarkat.this.d();
                realmGet$listWarkat.this.d = 0;
                if (d) {
                    realmGet$listWarkat.this.c();
                }
            }
        };
    }

    private final Handler b() {
        Handler handler;
        if (a != null) {
            return a;
        }
        synchronized (realmGet$listWarkat.class) {
            try {
                if (a == null) {
                    a = new getPreferredMailingAddress(this.e.t_().getMainLooper());
                }
                handler = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    final void a() {
        this.d = 0;
        b().removeCallbacks(this.b);
    }

    public abstract void c();

    public final boolean d() {
        return this.d != 0;
    }

    public final void e(long j) {
        a();
        if (j >= 0) {
            this.d = this.e.q_().e();
            if (!b().postDelayed(this.b, j)) {
                this.e.s_().b().e("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }
}
