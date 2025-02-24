package o;

import o.Setoran$$Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/getJumlah.class */
public final class getJumlah implements Runnable {
    final /* synthetic */ getTanggalJatuhTempo a;
    final /* synthetic */ int b;
    final /* synthetic */ Setoran$$Parcelable.AnonymousClass1 c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getJumlah(Setoran$$Parcelable.AnonymousClass1 r5, getTanggalJatuhTempo gettanggaljatuhtempo, int i, long j, boolean z) {
        this.c = r5;
        this.a = gettanggaljatuhtempo;
        this.b = i;
        this.d = j;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c(this.a);
        Setoran$$Parcelable.AnonymousClass1.d(this.c, this.a, this.b, this.d, false, this.e);
    }
}
