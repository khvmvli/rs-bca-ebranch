package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/realmSet$isMember.class */
public abstract class realmSet$isMember extends realmSet$creditCards {
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmSet$isMember(realmSet$kirimanUangs realmset_kirimanuangs) {
        super(realmset_kirimanuangs);
        this.h.e();
    }

    protected abstract boolean n();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v() {
        if (!w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w() {
        return this.d;
    }

    public final void y() {
        if (!this.d) {
            n();
            this.h.b();
            this.d = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
