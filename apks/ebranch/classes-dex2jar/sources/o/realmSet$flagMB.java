package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmSet$flagMB.class */
public abstract class realmSet$flagMB implements Runnable {
    final /* synthetic */ realmSet$flagEKTP a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ realmSet$flagMB(realmSet$flagEKTP realmset_flagektp, realmSet$flagGuest realmset_flagguest) {
        this.a = realmset_flagektp;
    }

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.c.lock();
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e) {
                this.a.a.d(e);
            }
        } finally {
            this.a.c.unlock();
        }
    }
}
