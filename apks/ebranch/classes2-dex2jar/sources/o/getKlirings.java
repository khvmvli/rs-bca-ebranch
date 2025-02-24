package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/getKlirings.class */
public final class getKlirings implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ setCreditCards b;
    final /* synthetic */ realmSet$tarikans c;
    final /* synthetic */ realmGet$idType d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getKlirings(realmGet$idType realmget_idtype, setCreditCards setcreditcards, boolean z, realmSet$tarikans realmset_tarikans) {
        this.d = realmget_idtype;
        this.b = setcreditcards;
        this.a = z;
        this.c = realmset_tarikans;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    @Override // java.lang.Runnable
    public final void run() {
        realmSet$isInputAtmPemrek realmset_isinputatmpemrek = this.d.c;
        if (realmset_isinputatmpemrek == null) {
            this.d.q.s_().b().b("Discarding data. Failed to set user property");
            return;
        }
        setFotoKtp.b(this.b);
        this.d.e(realmset_isinputatmpemrek, this.a ? null : this.c, this.b);
        this.d.r();
    }
}
