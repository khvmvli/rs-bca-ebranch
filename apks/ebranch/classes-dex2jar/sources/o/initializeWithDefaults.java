package o;

import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/initializeWithDefaults.class */
final class initializeWithDefaults extends setResponseMessage {
    final transient int[] g;
    final transient byte[][] i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public initializeWithDefaults(setResponseContentType setresponsecontenttype, int i) {
        super(null);
        defaultDumperPluginsProvider.a(setresponsecontenttype.b, 0, (long) i);
        Stetho stetho = setresponsecontenttype.d;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (stetho.c != stetho.b) {
                i3 += stetho.c - stetho.b;
                i4++;
                stetho = stetho.a;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.i = new byte[i4];
        this.g = new int[i4 << 1];
        Stetho stetho2 = setresponsecontenttype.d;
        int i5 = 0;
        while (i2 < i) {
            this.i[i5] = stetho2.d;
            int i6 = i2 + (stetho2.c - stetho2.b);
            i2 = i6;
            if (i6 > i) {
                i2 = i;
            }
            int[] iArr = this.g;
            iArr[i5] = i2;
            iArr[this.i.length + i5] = stetho2.b;
            stetho2.i = true;
            i5++;
            stetho2 = stetho2.a;
        }
    }

    private Object writeReplace() {
        return new setResponseMessage(f());
    }

    @Override // o.setResponseMessage
    public final byte a(int i) {
        defaultDumperPluginsProvider.a((long) this.g[this.i.length - 1], (long) i, 1);
        int i2 = 0;
        int binarySearch = Arrays.binarySearch(this.g, 0, this.i.length, i + 1);
        int i3 = binarySearch;
        if (binarySearch < 0) {
            i3 = binarySearch ^ -1;
        }
        if (i3 != 0) {
            i2 = this.g[i3 - 1];
        }
        int[] iArr = this.g;
        byte[][] bArr = this.i;
        return bArr[i3][(i - i2) + iArr[bArr.length + i3]];
    }

    @Override // o.setResponseMessage
    public final boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        int[] iArr = this.g;
        byte[][] bArr2 = this.i;
        if (i > iArr[bArr2.length - 1] - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int binarySearch = Arrays.binarySearch(iArr, 0, bArr2.length, i + 1);
        int i4 = binarySearch;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        if (binarySearch < 0) {
            i4 = binarySearch ^ -1;
            i7 = i3;
            i6 = i2;
            i5 = i;
        }
        while (i7 > 0) {
            int i8 = i4 == 0 ? 0 : this.g[i4 - 1];
            int min = Math.min(i7, ((this.g[i4] - i8) + i8) - i5);
            int[] iArr2 = this.g;
            byte[][] bArr3 = this.i;
            if (!defaultDumperPluginsProvider.a(bArr3[i4], (i5 - i8) + iArr2[bArr3.length + i4], bArr, i6, min)) {
                return false;
            }
            i5 += min;
            i6 += min;
            i7 -= min;
            i4++;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setResponseMessage
    public final byte[] a() {
        return f();
    }

    @Override // o.setResponseMessage
    public final setResponseMessage b() {
        return new setResponseMessage(f()).b();
    }

    @Override // o.setResponseMessage
    public final String c() {
        return new setResponseMessage(f()).c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setResponseMessage
    public final void c(setResponseContentType setresponsecontenttype) {
        int length = this.i.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            Stetho stetho = new Stetho(this.i[i], i3, (i3 + i4) - i2, true, false);
            if (setresponsecontenttype.d == null) {
                stetho.g = stetho;
                stetho.a = stetho;
                setresponsecontenttype.d = stetho;
            } else {
                Stetho stetho2 = setresponsecontenttype.d.g;
                stetho.g = stetho2;
                stetho.a = stetho2.a;
                stetho2.a.g = stetho;
                stetho2.a = stetho;
            }
            i++;
            i2 = i4;
        }
        setresponsecontenttype.b += (long) i2;
    }

    @Override // o.setResponseMessage
    public final setResponseMessage d() {
        return new setResponseMessage(f()).d();
    }

    @Override // o.setResponseMessage
    public final setResponseMessage d(int i, int i2) {
        return new setResponseMessage(f()).d(i, i2);
    }

    @Override // o.setResponseMessage
    public final boolean d(int i, setResponseMessage setresponsemessage, int i2, int i3) {
        int[] iArr = this.g;
        byte[][] bArr = this.i;
        if (iArr[bArr.length - 1] - i3 < 0) {
            return false;
        }
        int binarySearch = Arrays.binarySearch(iArr, 0, bArr.length, 1);
        int i4 = binarySearch;
        if (binarySearch < 0) {
            i4 = binarySearch ^ -1;
        }
        int i5 = 0;
        while (i3 > 0) {
            int i6 = i4 == 0 ? 0 : this.g[i4 - 1];
            int min = Math.min(i3, ((this.g[i4] - i6) + i6) - i5);
            int[] iArr2 = this.g;
            byte[][] bArr2 = this.i;
            if (!setresponsemessage.a(i2, bArr2[i4], (i5 - i6) + iArr2[bArr2.length + i4], min)) {
                return false;
            }
            i5 += min;
            i2 += min;
            i3 -= min;
            i4++;
        }
        return true;
    }

    @Override // o.setResponseMessage
    public final String e() {
        return new setResponseMessage(f()).e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (d(0, r0, 0, r0[r0.length - 1]) != false) goto L_0x0046;
     */
    @Override // o.setResponseMessage, java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            r10 = r0
            r0 = r9
            r1 = r8
            if (r0 != r1) goto L_0x0009
            r0 = 1
            return r0
        L_0x0009:
            r0 = r9
            boolean r0 = r0 instanceof o.setResponseMessage
            if (r0 == 0) goto L_0x0044
            r0 = r9
            o.setResponseMessage r0 = (o.setResponseMessage) r0
            r9 = r0
            r0 = r9
            int r0 = r0.g()
            r11 = r0
            r0 = r8
            int[] r0 = r0.g
            r12 = r0
            r0 = r8
            byte[][] r0 = r0.i
            r13 = r0
            r0 = r11
            r1 = r12
            r2 = r13
            int r2 = r2.length
            r3 = 1
            int r2 = r2 - r3
            r1 = r1[r2]
            if (r0 != r1) goto L_0x0044
            r0 = r8
            r1 = 0
            r2 = r9
            r3 = 0
            r4 = r12
            r5 = r13
            int r5 = r5.length
            r6 = 1
            int r5 = r5 - r6
            r4 = r4[r5]
            boolean r0 = r0.d(r1, r2, r3, r4)
            if (r0 != 0) goto L_0x0046
        L_0x0044:
            r0 = 0
            r10 = r0
        L_0x0046:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initializeWithDefaults.equals(java.lang.Object):boolean");
    }

    @Override // o.setResponseMessage
    public final byte[] f() {
        int[] iArr = this.g;
        byte[][] bArr = this.i;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.i[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // o.setResponseMessage
    public final int g() {
        return this.g[this.i.length - 1];
    }

    @Override // o.setResponseMessage
    public final setResponseMessage h() {
        return new setResponseMessage(f()).h();
    }

    @Override // o.setResponseMessage, java.lang.Object
    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int length = this.i.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.i[i2];
            int[] iArr = this.g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            for (int i7 = i5; i7 < (i6 - i3) + i5; i7++) {
                i4 = (i4 * 31) + bArr[i7];
            }
            i2++;
            i3 = i6;
        }
        this.e = i4;
        return i4;
    }

    @Override // o.setResponseMessage
    public final setResponseMessage i() {
        return new setResponseMessage(f()).i();
    }

    @Override // o.setResponseMessage
    public final String j() {
        return new setResponseMessage(f()).j();
    }

    @Override // o.setResponseMessage, java.lang.Object
    public final String toString() {
        return new setResponseMessage(f()).toString();
    }
}
