package o;

import o.Setoran$$Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/setIsLongForm.class */
public final class setIsLongForm implements Runnable {
    final /* synthetic */ getTanggalJatuhTempo a;
    final /* synthetic */ Setoran$$Parcelable.AnonymousClass1 b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setIsLongForm(Setoran$$Parcelable.AnonymousClass1 r5, getTanggalJatuhTempo gettanggaljatuhtempo, int i, long j, boolean z) {
        this.b = r5;
        this.a = gettanggaljatuhtempo;
        this.e = i;
        this.c = j;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c(this.a);
        Setoran$$Parcelable.AnonymousClass1.d(this.b, this.a, this.e, this.c, false, this.d);
    }
}
