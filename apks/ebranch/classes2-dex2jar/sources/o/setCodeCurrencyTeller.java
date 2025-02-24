package o;
/* loaded from: classes2-dex2jar.jar:o/setCodeCurrencyTeller.class */
public final class setCodeCurrencyTeller {
    private final boolean a;
    private final boolean b;
    private final int c;
    final /* synthetic */ setIsInputAtmPemrek d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCodeCurrencyTeller(setIsInputAtmPemrek setisinputatmpemrek, int i, boolean z, boolean z2) {
        this.d = setisinputatmpemrek;
        this.c = i;
        this.a = z;
        this.b = z2;
    }

    public final void a(String str, Object obj, Object obj2) {
        this.d.d(this.c, this.a, this.b, str, obj, obj2, null);
    }

    public final void b(String str) {
        this.d.d(this.c, this.a, this.b, str, null, null, null);
    }

    public final void b(String str, Object obj, Object obj2, Object obj3) {
        this.d.d(this.c, this.a, this.b, str, obj, obj2, obj3);
    }

    public final void e(String str, Object obj) {
        this.d.d(this.c, this.a, this.b, str, obj, null, null);
    }
}
