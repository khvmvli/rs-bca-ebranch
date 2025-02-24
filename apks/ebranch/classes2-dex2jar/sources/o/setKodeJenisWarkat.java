package o;

import java.util.concurrent.ExecutionException;
/* loaded from: classes2-dex2jar.jar:o/setKodeJenisWarkat.class */
final class setKodeJenisWarkat<T> implements setKodeBank<T> {
    private final int a;
    private final Object b = new Object();
    private int c;
    private int d;
    private final BahasaLayananDialog e;
    private boolean f;
    private Exception i;
    private int j;

    public setKodeJenisWarkat(int i, BahasaLayananDialog bahasaLayananDialog) {
        this.a = i;
        this.e = bahasaLayananDialog;
    }

    private final void b() {
        int i = this.c;
        int i2 = this.d;
        int i3 = this.j;
        int i4 = this.a;
        if (i + i2 + i3 != i4) {
            return;
        }
        if (this.i != null) {
            BahasaLayananDialog bahasaLayananDialog = this.e;
            bahasaLayananDialog.c(new ExecutionException(i2 + " out of " + i4 + " underlying tasks failed", this.i));
        } else if (this.f) {
            this.e.j();
        } else {
            this.e.e((Object) null);
        }
    }

    @Override // o.realmSet$jenisWarkat
    public final void a(Exception exc) {
        synchronized (this.b) {
            this.d++;
            this.i = exc;
            b();
        }
    }

    @Override // o.realmSet$nominal
    public final void a(T t) {
        synchronized (this.b) {
            this.c++;
            b();
        }
    }

    @Override // o.realmSet$kodeJenisWarkat
    public final void c() {
        synchronized (this.b) {
            this.j++;
            this.f = true;
            b();
        }
    }
}
