package o;
/* loaded from: classes2-dex2jar.jar:o/AutoLogoutDialog.class */
final class AutoLogoutDialog implements Runnable {
    final /* synthetic */ clickPilih a;
    final /* synthetic */ setJatuhTempo d;

    public AutoLogoutDialog(clickPilih clickpilih, setJatuhTempo setjatuhtempo) {
        this.a = clickpilih;
        this.d = setjatuhtempo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.c) {
            clickPilih clickpilih = this.a;
            if (clickpilih.a != null) {
                clickpilih.a.b(this.d);
            }
        }
    }
}
