package o;

import java.util.Arrays;
/* loaded from: classes2-dex2jar.jar:o/SubscribeExpired.class */
public final class SubscribeExpired implements Cloneable {
    public int[] a;
    public int d;

    public SubscribeExpired() {
        this.d = 0;
        this.a = new int[1];
    }

    private SubscribeExpired(int[] iArr, int i) {
        this.a = iArr;
        this.d = i;
    }

    private void b(int i) {
        int[] iArr = this.a;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.a = iArr2;
        }
    }

    public final void a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        b(this.d + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public final void a(boolean z) {
        b(this.d + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.d;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.d++;
    }

    public final void b(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < 8; i7++) {
                i6 = i6;
                if (((1 << (i4 & 31)) & this.a[i4 / 32]) != 0) {
                    i6 |= 1 << (7 - i7);
                }
                i4++;
            }
            bArr[i5 + 0] = (byte) ((byte) i6);
        }
    }

    public final void b(SubscribeExpired subscribeExpired) {
        int i = subscribeExpired.d;
        b(this.d + i);
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = true;
            if (((1 << (i2 & 31)) & subscribeExpired.a[i2 / 32]) == 0) {
                z = false;
            }
            a(z);
        }
    }

    @Override // java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return new SubscribeExpired((int[]) this.a.clone(), this.d);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof SubscribeExpired)) {
            return false;
        }
        SubscribeExpired subscribeExpired = (SubscribeExpired) obj;
        return this.d == subscribeExpired.d && Arrays.equals(this.a, subscribeExpired.a);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return (this.d * 31) + Arrays.hashCode(this.a);
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder(this.d);
        for (int i = 0; i < this.d; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            boolean z = true;
            if (((1 << (i & 31)) & this.a[i / 32]) == 0) {
                z = false;
            }
            sb.append(z ? 'X' : '.');
        }
        return sb.toString();
    }
}
