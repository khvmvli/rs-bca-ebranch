package o;
/* loaded from: classes-dex2jar.jar:o/setIconified.class */
final class setIconified {
    int i = 0;
    int f = 0;
    int h = Integer.MIN_VALUE;
    int c = Integer.MIN_VALUE;
    int e = 0;
    int d = 0;
    boolean a = false;
    boolean b = false;

    public final void b(int i, int i2) {
        this.b = false;
        if (i != Integer.MIN_VALUE) {
            this.e = i;
            this.i = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.d = i2;
            this.f = i2;
        }
    }

    public final void d(int i, int i2) {
        this.h = i;
        this.c = i2;
        this.b = true;
        if (this.a) {
            if (i2 != Integer.MIN_VALUE) {
                this.i = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.i = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f = i2;
        }
    }
}
