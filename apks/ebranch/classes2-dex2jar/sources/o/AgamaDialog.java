package o;

import java.util.concurrent.Executor;
import o.realmSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/AgamaDialog.class */
public final class AgamaDialog<TResult, TContinuationResult> implements realmSet$nominal<TContinuationResult>, realmSet$jenisWarkat, realmSet$kodeJenisWarkat, AutoLogoutDialog_ViewBinding {
    private final Executor a;
    private final realmSet.kodeBank d;
    private final BahasaLayananDialog e;

    public AgamaDialog(Executor executor, realmSet.kodeBank kodebank, BahasaLayananDialog bahasaLayananDialog) {
        this.a = executor;
        this.d = kodebank;
        this.e = bahasaLayananDialog;
    }

    @Override // o.realmSet$jenisWarkat
    public final void a(Exception exc) {
        this.e.c(exc);
    }

    @Override // o.realmSet$nominal
    public final void a(TContinuationResult tcontinuationresult) {
        this.e.e(tcontinuationresult);
    }

    @Override // o.realmSet$kodeJenisWarkat
    public final void c() {
        this.e.j();
    }

    public final void c(setJatuhTempo setjatuhtempo) {
        this.a.execute(new WarkatTemp(this, setjatuhtempo));
    }
}
