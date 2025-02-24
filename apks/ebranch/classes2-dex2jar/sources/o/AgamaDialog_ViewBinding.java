package o;
/* loaded from: classes2-dex2jar.jar:o/AgamaDialog_ViewBinding.class */
final class AgamaDialog_ViewBinding implements Runnable {
    final /* synthetic */ setJatuhTempo c;
    final /* synthetic */ AskOrangDatangKeCabangDialog d;

    public AgamaDialog_ViewBinding(AskOrangDatangKeCabangDialog askOrangDatangKeCabangDialog, setJatuhTempo setjatuhtempo) {
        this.d = askOrangDatangKeCabangDialog;
        this.c = setjatuhtempo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d.d) {
            AskOrangDatangKeCabangDialog askOrangDatangKeCabangDialog = this.d;
            if (askOrangDatangKeCabangDialog.a != null) {
                askOrangDatangKeCabangDialog.a.a((Exception) setFotoKtp.b(this.c.d()));
            }
        }
    }
}
