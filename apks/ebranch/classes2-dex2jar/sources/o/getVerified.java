package o;
/* loaded from: classes2-dex2jar.jar:o/getVerified.class */
final class getVerified implements Runnable {
    final /* synthetic */ realmSet$isInputAtmPemrek b;
    final /* synthetic */ realmGet$eChannels c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getVerified(realmGet$eChannels realmget_echannels, realmSet$isInputAtmPemrek realmset_isinputatmpemrek) {
        this.c = realmget_echannels;
        this.b = realmset_isinputatmpemrek;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.c) {
            this.c.a = false;
            if (!this.c.b.g()) {
                this.c.b.q.s_().i().b("Connected to service");
                this.c.b.b(this.b);
            }
        }
    }
}
