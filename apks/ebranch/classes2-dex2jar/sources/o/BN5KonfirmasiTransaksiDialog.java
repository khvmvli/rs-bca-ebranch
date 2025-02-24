package o;

import java.util.concurrent.Executor;
/* loaded from: classes2-dex2jar.jar:o/BN5KonfirmasiTransaksiDialog.class */
public final class BN5KonfirmasiTransaksiDialog<TResult, TContinuationResult> implements realmSet$nominal<TContinuationResult>, realmSet$jenisWarkat, realmSet$kodeJenisWarkat, AutoLogoutDialog_ViewBinding {
    private final BahasaLayananDialog b;
    private final realmSet$namaBank d;
    private final Executor e;

    public BN5KonfirmasiTransaksiDialog(Executor executor, realmSet$namaBank realmset_namabank, BahasaLayananDialog bahasaLayananDialog) {
        this.e = executor;
        this.d = realmset_namabank;
        this.b = bahasaLayananDialog;
    }

    public static /* bridge */ /* synthetic */ realmSet$namaBank d(BN5KonfirmasiTransaksiDialog bN5KonfirmasiTransaksiDialog) {
        return bN5KonfirmasiTransaksiDialog.d;
    }

    @Override // o.realmSet$jenisWarkat
    public final void a(Exception exc) {
        this.b.c(exc);
    }

    @Override // o.realmSet$nominal
    public final void a(TContinuationResult tcontinuationresult) {
        this.b.e(tcontinuationresult);
    }

    @Override // o.realmSet$kodeJenisWarkat
    public final void c() {
        this.b.j();
    }

    public final void c(setJatuhTempo setjatuhtempo) {
        this.e.execute(new BCADollarDialog(this, setjatuhtempo));
    }
}
