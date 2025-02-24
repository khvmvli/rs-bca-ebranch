package o;
/* loaded from: classes-dex2jar.jar:o/getKliringList.class */
final class getKliringList implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ getNominalTransaksiTeller c;

    getKliringList(getNominalTransaksiTeller getnominaltransaksiteller, long j) {
        this.c = getnominaltransaksiteller;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.e(this.a);
    }
}
