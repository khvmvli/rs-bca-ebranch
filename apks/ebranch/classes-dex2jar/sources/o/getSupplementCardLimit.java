package o;

import com.google.android.gms.internal.measurement.zzkn;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/getSupplementCardLimit.class */
public final class getSupplementCardLimit {
    private static final getSupplementCardLimit d = new getSupplementCardLimit(0, new int[0], new Object[0], false);
    private int a;
    private int b;
    private int[] c;
    private Object[] e;
    private boolean f;

    private getSupplementCardLimit() {
        this(0, new int[8], new Object[8], true);
    }

    private getSupplementCardLimit(int i, int[] iArr, Object[] objArr, boolean z) {
        this.b = -1;
        this.a = i;
        this.c = iArr;
        this.e = objArr;
        this.f = z;
    }

    public static getSupplementCardLimit a() {
        return d;
    }

    public static getSupplementCardLimit c(getSupplementCardLimit getsupplementcardlimit, getSupplementCardLimit getsupplementcardlimit2) {
        int i = getsupplementcardlimit.a + getsupplementcardlimit2.a;
        int[] copyOf = Arrays.copyOf(getsupplementcardlimit.c, i);
        System.arraycopy(getsupplementcardlimit2.c, 0, copyOf, getsupplementcardlimit.a, getsupplementcardlimit2.a);
        Object[] copyOf2 = Arrays.copyOf(getsupplementcardlimit.e, i);
        System.arraycopy(getsupplementcardlimit2.e, 0, copyOf2, getsupplementcardlimit.a, getsupplementcardlimit2.a);
        return new getSupplementCardLimit(i, copyOf, copyOf2, true);
    }

    public static getSupplementCardLimit d() {
        return new getSupplementCardLimit(0, new int[8], new Object[8], true);
    }

    public final void b() {
        this.f = false;
    }

    public final void b(int i, Object obj) {
        if (this.f) {
            int i2 = this.a;
            int[] iArr = this.c;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.c = Arrays.copyOf(iArr, i3);
                this.e = Arrays.copyOf(this.e, i3);
            }
            int[] iArr2 = this.c;
            int i4 = this.a;
            iArr2[i4] = i;
            this.e[i4] = obj;
            this.a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int c() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.c[i3];
            setCurrOfficePostCode setcurrofficepostcode = (setCurrOfficePostCode) this.e[i3];
            int h = setCustomerName.h(8);
            int b = setcurrofficepostcode.b();
            i2 += h + h + setCustomerName.h(16) + setCustomerName.h(i4 >>> 3) + setCustomerName.h(24) + setCustomerName.h(b) + b;
        }
        this.b = i2;
        return i2;
    }

    public final void d(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            realmGet$cardImageOrientation.d(sb, i, String.valueOf(this.c[i2] >>> 3), this.e[i2]);
        }
    }

    public final int e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.b;
        if (i5 != -1) {
            return i5;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.a; i7++) {
            int i8 = this.c[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 != 0) {
                if (i10 == 1) {
                    ((Long) this.e[i7]).longValue();
                    i = setCustomerName.h(i9 << 3) + 8;
                } else if (i10 == 2) {
                    setCurrOfficePostCode setcurrofficepostcode = (setCurrOfficePostCode) this.e[i7];
                    int h = setCustomerName.h(i9 << 3);
                    int b = setcurrofficepostcode.b();
                    i2 = i6;
                    i = h + setCustomerName.h(b) + b;
                    i6 = i2 + i;
                } else if (i10 == 3) {
                    int a = setCustomerName.a(i9);
                    i3 = a + a;
                    i4 = ((getSupplementCardLimit) this.e[i7]).e();
                } else if (i10 == 5) {
                    ((Integer) this.e[i7]).intValue();
                    i = setCustomerName.h(i9 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzkn.d());
                }
                i2 = i6;
                i6 = i2 + i;
            } else {
                long longValue = ((Long) this.e[i7]).longValue();
                i3 = setCustomerName.h(i9 << 3);
                i4 = setCustomerName.b(longValue);
            }
            i = i3 + i4;
            i2 = i6;
            i6 = i2 + i;
        }
        this.b = i6;
        return i6;
    }

    public final void e(setEmergencyContactOfficeExt setemergencycontactofficeext) throws IOException {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.c[i];
                Object obj = this.e[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    setemergencycontactofficeext.a(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    setemergencycontactofficeext.c(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    setemergencycontactofficeext.a(i3, (setCurrOfficePostCode) obj);
                } else if (i4 == 3) {
                    setemergencycontactofficeext.b(i3);
                    ((getSupplementCardLimit) obj).e(setemergencycontactofficeext);
                    setemergencycontactofficeext.a(i3);
                } else if (i4 == 5) {
                    setemergencycontactofficeext.a(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkn.d());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof getSupplementCardLimit)) {
            return false;
        }
        getSupplementCardLimit getsupplementcardlimit = (getSupplementCardLimit) obj;
        int i = this.a;
        if (i != getsupplementcardlimit.a) {
            return false;
        }
        int[] iArr = this.c;
        int[] iArr2 = getsupplementcardlimit.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        Object[] objArr = this.e;
        Object[] objArr2 = getsupplementcardlimit.e;
        int i3 = this.a;
        for (int i4 = 0; i4 < i3; i4++) {
            if (!objArr[i4].equals(objArr2[i4])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        int[] iArr = this.c;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        Object[] objArr = this.e;
        int i5 = this.a;
        for (int i6 = 0; i6 < i5; i6++) {
            i2 = (i2 * 31) + objArr[i6].hashCode();
        }
        return ((((i + 527) * 31) + i3) * 31) + i2;
    }
}
