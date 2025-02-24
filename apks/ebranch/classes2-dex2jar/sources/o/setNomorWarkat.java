package o;
/* loaded from: classes2-dex2jar.jar:o/setNomorWarkat.class */
final class setNomorWarkat implements Runnable {
    final /* synthetic */ AskOrangDatangKeCabangDialog_ViewBinding d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setNomorWarkat(AskOrangDatangKeCabangDialog_ViewBinding askOrangDatangKeCabangDialog_ViewBinding) {
        this.d = askOrangDatangKeCabangDialog_ViewBinding;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d.e) {
            AskOrangDatangKeCabangDialog_ViewBinding askOrangDatangKeCabangDialog_ViewBinding = this.d;
            if (askOrangDatangKeCabangDialog_ViewBinding.c != null) {
                askOrangDatangKeCabangDialog_ViewBinding.c.c();
            }
        }
    }
}
