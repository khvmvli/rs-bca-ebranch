package o;
/* loaded from: classes2-dex2jar.jar:o/build.class */
final class build {
    private runtimeRepl a;
    private runtimeRepl d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(runtimeRepl runtimerepl) {
        synchronized (this) {
            if (runtimerepl != null) {
                runtimeRepl runtimerepl2 = this.d;
                if (runtimerepl2 != null) {
                    runtimerepl2.d = runtimerepl;
                    this.d = runtimerepl;
                } else if (this.a == null) {
                    this.d = runtimerepl;
                    this.a = runtimerepl;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final runtimeRepl b(int i) throws InterruptedException {
        runtimeRepl e;
        synchronized (this) {
            if (this.a == null) {
                wait(1000);
            }
            e = e();
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final runtimeRepl e() {
        runtimeRepl runtimerepl;
        synchronized (this) {
            runtimerepl = this.a;
            if (runtimerepl != null) {
                runtimeRepl runtimerepl2 = runtimerepl.d;
                this.a = runtimerepl2;
                if (runtimerepl2 == null) {
                    this.d = null;
                }
            }
        }
        return runtimerepl;
    }
}
