package o;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
/* loaded from: classes2-dex2jar.jar:o/BCADollarDialog.class */
final class BCADollarDialog implements Runnable {
    final /* synthetic */ setJatuhTempo a;
    final /* synthetic */ BN5KonfirmasiTransaksiDialog b;

    public BCADollarDialog(BN5KonfirmasiTransaksiDialog bN5KonfirmasiTransaksiDialog, setJatuhTempo setjatuhtempo) {
        this.b = bN5KonfirmasiTransaksiDialog;
        this.a = setjatuhtempo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            setJatuhTempo a = this.b.d.a(this.a.c());
            if (a == null) {
                this.b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a.b(realmSet$nomorWarkat.c, this.b);
            a.b(realmSet$nomorWarkat.c, this.b);
            a.a(realmSet$nomorWarkat.c, this.b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.b.a((Exception) e.getCause());
            } else {
                this.b.a((Exception) e);
            }
        } catch (CancellationException e2) {
            this.b.c();
        } catch (Exception e3) {
            this.b.a(e3);
        }
    }
}
