package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/realmSet$RepresentativeRelationship.class */
public abstract class realmSet$RepresentativeRelationship extends realmSet$RepresentativeName {
    private boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmSet$RepresentativeRelationship(realmGet$TxnPurpose realmget_txnpurpose) {
        super(realmget_txnpurpose);
        this.q.j();
    }

    protected abstract boolean e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() {
        return this.b;
    }

    public final void q() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!e()) {
            this.q.h();
            this.b = true;
        }
    }

    public final void r() {
        if (!this.b) {
            u_();
            this.q.h();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s() {
        if (!p()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    protected void u_() {
    }
}
