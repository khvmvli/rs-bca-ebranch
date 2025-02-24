package o;
/* renamed from: o.realmSet$email  reason: case insensitive filesystem */
/* loaded from: classes2-dex2jar.jar:o/realmSet$email.class */
final class C0001realmSet$email {
    private final getNoTelpKontakPengirim c;
    private long d;

    public C0001realmSet$email(getNoTelpKontakPengirim getnotelpkontakpengirim) {
        setFotoKtp.b(getnotelpkontakpengirim);
        this.c = getnotelpkontakpengirim;
    }

    public final void a() {
        this.d = 0;
    }

    public final void b() {
        this.d = this.c.b();
    }

    public final boolean b(long j) {
        return this.d == 0 || this.c.b() - this.d >= 3600000;
    }
}
