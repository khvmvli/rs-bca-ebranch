package o;
/* loaded from: classes2-dex2jar.jar:o/CC20FormKartuKreditFragment.class */
final class CC20FormKartuKreditFragment {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(CC18FormKartuKreditFragment cC18FormKartuKreditFragment, boolean z) {
        int i = z ? cC18FormKartuKreditFragment.b : cC18FormKartuKreditFragment.c;
        int i2 = z ? cC18FormKartuKreditFragment.c : cC18FormKartuKreditFragment.b;
        byte[][] bArr = cC18FormKartuKreditFragment.e;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b2 = z ? bArr[i4][i6] : bArr[i6][i4];
                if (b2 == b) {
                    i5++;
                    b = b;
                } else {
                    i3 = i3;
                    if (i5 >= 5) {
                        i3 += (i5 - 5) + 3;
                    }
                    b = b2;
                    i5 = 1;
                }
            }
            i3 = i3;
            if (i5 >= 5) {
                i3 += (i5 - 5) + 3;
            }
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }
}
