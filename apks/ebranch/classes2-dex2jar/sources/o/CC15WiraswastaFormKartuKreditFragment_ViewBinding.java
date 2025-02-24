package o;
/* loaded from: classes2-dex2jar.jar:o/CC15WiraswastaFormKartuKreditFragment_ViewBinding.class */
public final class CC15WiraswastaFormKartuKreditFragment_ViewBinding {
    public static CC15WiraswastaFormKartuKreditFragment c(CC19FormKartuKreditFragment cC19FormKartuKreditFragment, int i, int i2, int i3) {
        CC18FormKartuKreditFragment cC18FormKartuKreditFragment = cC19FormKartuKreditFragment.c;
        if (cC18FormKartuKreditFragment != null) {
            int i4 = cC18FormKartuKreditFragment.c;
            int i5 = cC18FormKartuKreditFragment.b;
            int i6 = i3 << 1;
            int i7 = i4 + i6;
            int i8 = i6 + i5;
            int max = Math.max(i, i7);
            int max2 = Math.max(i2, i8);
            int min = Math.min(max / i7, max2 / i8);
            int i9 = (max - (i4 * min)) / 2;
            int i10 = (max2 - (i5 * min)) / 2;
            CC15WiraswastaFormKartuKreditFragment cC15WiraswastaFormKartuKreditFragment = new CC15WiraswastaFormKartuKreditFragment(max, max2);
            int i11 = 0;
            while (i11 < i5) {
                int i12 = 0;
                while (i12 < i4) {
                    if (cC18FormKartuKreditFragment.e[i11][i12] == 1) {
                        if (i10 < 0 || i9 < 0) {
                            throw new IllegalArgumentException("Left and top must be nonnegative");
                        } else if (min <= 0 || min <= 0) {
                            throw new IllegalArgumentException("Height and width must be at least 1");
                        } else {
                            int i13 = min + i9;
                            int i14 = min + i10;
                            if (i14 > cC15WiraswastaFormKartuKreditFragment.c || i13 > cC15WiraswastaFormKartuKreditFragment.e) {
                                throw new IllegalArgumentException("The region must fit inside the matrix");
                            }
                            for (int i15 = i10; i15 < i14; i15++) {
                                int i16 = cC15WiraswastaFormKartuKreditFragment.d;
                                for (int i17 = i9; i17 < i13; i17++) {
                                    int[] iArr = cC15WiraswastaFormKartuKreditFragment.a;
                                    int i18 = (i17 / 32) + (i16 * i15);
                                    iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                                }
                            }
                        }
                    }
                    i12++;
                    i9 += min;
                }
                i11++;
                i10 += min;
            }
            return cC15WiraswastaFormKartuKreditFragment;
        }
        throw new IllegalStateException();
    }
}
