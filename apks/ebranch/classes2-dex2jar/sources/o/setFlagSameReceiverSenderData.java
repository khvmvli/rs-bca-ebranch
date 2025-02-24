package o;

import o.Setoran$$Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/setFlagSameReceiverSenderData.class */
public final class setFlagSameReceiverSenderData implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ long b;
    final /* synthetic */ getTanggalJatuhTempo c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;
    final /* synthetic */ Setoran$$Parcelable.AnonymousClass1 g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setFlagSameReceiverSenderData(Setoran$$Parcelable.AnonymousClass1 r5, getTanggalJatuhTempo gettanggaljatuhtempo, long j, int i, long j2, boolean z) {
        this.g = r5;
        this.c = gettanggaljatuhtempo;
        this.d = j;
        this.e = i;
        this.b = j2;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.c(this.c);
        this.g.b(this.d, false);
        Setoran$$Parcelable.AnonymousClass1.d(this.g, this.c, this.e, this.b, true, this.a);
    }
}
