package o;

import com.google.android.gms.tasks.RuntimeExecutionException;
/* loaded from: classes2-dex2jar.jar:o/WarkatTemp.class */
final class WarkatTemp implements Runnable {
    final /* synthetic */ setJatuhTempo d;
    final /* synthetic */ AgamaDialog e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WarkatTemp(AgamaDialog agamaDialog, setJatuhTempo setjatuhtempo) {
        this.e = agamaDialog;
        this.d = setjatuhtempo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            setJatuhTempo setjatuhtempo = (setJatuhTempo) this.e.d.then(this.d);
            if (setjatuhtempo == null) {
                this.e.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            setjatuhtempo.b(realmSet$nomorWarkat.c, this.e);
            setjatuhtempo.b(realmSet$nomorWarkat.c, this.e);
            setjatuhtempo.a(realmSet$nomorWarkat.c, this.e);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.e.e.c((Exception) e.getCause());
            } else {
                this.e.e.c(e);
            }
        } catch (Exception e2) {
            this.e.e.c(e2);
        }
    }
}
