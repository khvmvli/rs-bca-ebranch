package o;

import java.util.Arrays;
/* loaded from: classes2-dex2jar.jar:o/CC15WiraswastaFormKartuKreditFragment.class */
public final class CC15WiraswastaFormKartuKreditFragment implements Cloneable {
    public final int[] a;
    public final int c;
    public final int d;
    public final int e;

    public CC15WiraswastaFormKartuKreditFragment(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.e = i;
        this.c = i2;
        int i3 = (i + 31) / 32;
        this.d = i3;
        this.a = new int[i3 * i2];
    }

    private CC15WiraswastaFormKartuKreditFragment(int i, int i2, int i3, int[] iArr) {
        this.e = i;
        this.c = i2;
        this.d = i3;
        this.a = iArr;
    }

    public final boolean b(int i, int i2) {
        return ((this.a[(i2 * this.d) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    @Override // java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new CC15WiraswastaFormKartuKreditFragment(this.e, this.c, this.d, (int[]) this.a.clone());
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof CC15WiraswastaFormKartuKreditFragment)) {
            return false;
        }
        CC15WiraswastaFormKartuKreditFragment cC15WiraswastaFormKartuKreditFragment = (CC15WiraswastaFormKartuKreditFragment) obj;
        return this.e == cC15WiraswastaFormKartuKreditFragment.e && this.c == cC15WiraswastaFormKartuKreditFragment.c && this.d == cC15WiraswastaFormKartuKreditFragment.d && Arrays.equals(this.a, cC15WiraswastaFormKartuKreditFragment.a);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        int i = this.e;
        return (((((((i * 31) + i) * 31) + this.c) * 31) + this.d) * 31) + Arrays.hashCode(this.a);
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder(this.c * (this.e + 1));
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.e; i2++) {
                sb.append(b(i2, i) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
