package o;
/* loaded from: classes2-dex2jar.jar:o/BCADollarDialog_ViewBinding.class */
final class BCADollarDialog_ViewBinding implements Runnable {
    final /* synthetic */ setJatuhTempo a;
    final /* synthetic */ infoProduct c;

    public BCADollarDialog_ViewBinding(infoProduct infoproduct, setJatuhTempo setjatuhtempo) {
        this.c = infoproduct;
        this.a = setjatuhtempo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c.a) {
            infoProduct infoproduct = this.c;
            if (infoproduct.d != null) {
                infoproduct.d.a(this.a.c());
            }
        }
    }
}
