package o;

import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/Stetho.class */
final class Stetho {
    Stetho a;
    int b;
    int c;
    final byte[] d;
    boolean e;
    Stetho g;
    boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Stetho() {
        this.d = new byte[8192];
        this.e = true;
        this.i = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Stetho(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.d = bArr;
        this.b = i;
        this.c = i2;
        this.i = z;
        this.e = z2;
    }

    final Stetho b() {
        return new Stetho((byte[]) this.d.clone(), this.b, this.c, false, true);
    }

    @Nullable
    public final Stetho c() {
        Stetho stetho = this.a;
        Stetho stetho2 = stetho != this ? stetho : null;
        Stetho stetho3 = this.g;
        stetho3.a = stetho;
        this.a.g = stetho3;
        this.a = null;
        this.g = null;
        return stetho2;
    }

    public final void d(Stetho stetho, int i) {
        if (stetho.e) {
            int i2 = stetho.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!stetho.i) {
                    int i4 = stetho.b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = stetho.d;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        stetho.c -= stetho.b;
                        stetho.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.d, this.b, stetho.d, stetho.c, i);
            stetho.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
