package o;

import o.realmSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/realmGet$FlagTxnBerkala.class */
public abstract class realmGet$FlagTxnBerkala extends realmSet.descTransaksi {
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$FlagTxnBerkala(realmGet$TxnPurpose realmget_txnpurpose) {
        super(realmget_txnpurpose);
        this.q.j();
    }

    protected abstract boolean b();

    protected void d() {
    }

    public final void k() {
        if (!this.d) {
            d();
            this.q.h();
            this.d = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return this.d;
    }

    public final void m() {
        if (this.d) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!b()) {
            this.q.h();
            this.d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n() {
        if (!l()) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
