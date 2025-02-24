package o;

import o.realmGet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/geteChannels.class */
public final class geteChannels implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ realmGet$idType b;
    final /* synthetic */ realmGet.tipeNasabah c;
    final /* synthetic */ boolean d;
    final /* synthetic */ setCreditCards e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public geteChannels(realmGet$idType realmget_idtype, boolean z, setCreditCards setcreditcards, boolean z2, realmGet.tipeNasabah tipenasabah, String str) {
        this.b = realmget_idtype;
        this.e = setcreditcards;
        this.d = z2;
        this.c = tipenasabah;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    @Override // java.lang.Runnable
    public final void run() {
        realmSet$isInputAtmPemrek realmset_isinputatmpemrek = this.b.c;
        if (realmset_isinputatmpemrek == null) {
            this.b.q.s_().b().b("Discarding data. Failed to send event to service");
            return;
        }
        setFotoKtp.b(this.e);
        this.b.e(realmset_isinputatmpemrek, this.d ? null : this.c, this.e);
        this.b.r();
    }
}
