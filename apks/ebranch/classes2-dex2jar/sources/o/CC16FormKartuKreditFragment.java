package o;

import io.realm.RealmFieldTypeConstants;
/* loaded from: classes2-dex2jar.jar:o/CC16FormKartuKreditFragment.class */
public final class CC16FormKartuKreditFragment {
    public static final CC16FormKartuKreditFragment a;
    public static final CC16FormKartuKreditFragment c;
    public static final CC16FormKartuKreditFragment g;
    public static final CC16FormKartuKreditFragment h;
    public final int i;
    public final int[] j;
    final int k;
    private final int l;
    public final onClickedHubungan m;
    final int[] n;

    /* renamed from: o */
    private final onClickedHubungan f16o;
    public static final CC16FormKartuKreditFragment b = new CC16FormKartuKreditFragment(4201, 4096, 1);
    public static final CC16FormKartuKreditFragment e = new CC16FormKartuKreditFragment(1033, 1024, 1);
    public static final CC16FormKartuKreditFragment d = new CC16FormKartuKreditFragment(19, 16, 1);
    public static final CC16FormKartuKreditFragment f = new CC16FormKartuKreditFragment(285, RealmFieldTypeConstants.SET_OFFSET, 0);

    static {
        CC16FormKartuKreditFragment cC16FormKartuKreditFragment = new CC16FormKartuKreditFragment(67, 64, 1);
        a = cC16FormKartuKreditFragment;
        CC16FormKartuKreditFragment cC16FormKartuKreditFragment2 = new CC16FormKartuKreditFragment(301, RealmFieldTypeConstants.SET_OFFSET, 1);
        g = cC16FormKartuKreditFragment2;
        c = cC16FormKartuKreditFragment2;
        h = cC16FormKartuKreditFragment;
    }

    private CC16FormKartuKreditFragment(int i, int i2, int i3) {
        this.l = i;
        this.k = i2;
        this.i = i3;
        this.j = new int[i2];
        this.n = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.j[i5] = i4;
            int i6 = i4 << 1;
            i4 = i6;
            if (i6 >= i2) {
                i4 = (i6 ^ i) & (i2 - 1);
            }
        }
        for (int i7 = 0; i7 < i2 - 1; i7++) {
            this.n[this.j[i7]] = i7;
        }
        this.m = new onClickedHubungan(this, new int[]{0});
        this.f16o = new onClickedHubungan(this, new int[]{1});
    }

    public static int b(int i, int i2) {
        return i ^ i2;
    }

    public final int d(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.j;
        int[] iArr2 = this.n;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.k - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.l));
        sb.append(',');
        sb.append(this.k);
        sb.append(')');
        return sb.toString();
    }
}
