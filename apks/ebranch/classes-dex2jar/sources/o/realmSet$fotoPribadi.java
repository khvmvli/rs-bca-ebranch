package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmSet$fotoPribadi.class */
public abstract class realmSet$fotoPribadi {
    private final realmSet$fotoNpwp a;

    /* JADX INFO: Access modifiers changed from: protected */
    public realmSet$fotoPribadi(realmSet$fotoNpwp realmset_fotonpwp) {
        this.a = realmset_fotonpwp;
    }

    public final void b(realmSet$hmPhoneCodeNumber realmset_hmphonecodenumber) {
        realmset_hmphonecodenumber.j.lock();
        try {
            if (realmset_hmphonecodenumber.n == this.a) {
                d();
            }
        } finally {
            realmset_hmphonecodenumber.j.unlock();
        }
    }

    protected abstract void d();
}
