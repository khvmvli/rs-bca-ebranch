package o;
/* loaded from: classes2-dex2jar.jar:o/setNameTransaksi.class */
final class setNameTransaksi implements Runnable {
    final /* synthetic */ setNominalTransaksiTeller b;
    final /* synthetic */ boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setNameTransaksi(setNominalTransaksiTeller setnominaltransaksiteller, boolean z) {
        this.b = setnominaltransaksiteller;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.b(this.d);
    }
}
