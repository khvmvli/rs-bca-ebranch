package o;

import java.util.Iterator;
/* loaded from: classes2-dex2jar.jar:o/setBackgroundTransparent.class */
public class setBackgroundTransparent implements Iterable<Integer>, subscriberLoadDraftPemrekEvent {
    public static final read b = new read((byte) 0);
    public final int a;
    public final int c;
    public final int d;

    /* loaded from: classes2-dex2jar.jar:o/setBackgroundTransparent$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public setBackgroundTransparent(int i, int i2, int i3) {
        int i4;
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.c = i;
            if (i3 > 0) {
                i4 = i2;
                if (i < i2) {
                    i4 = i2 - SumberDanaPilihPemilikSetunFragment.e(i2, i, i3);
                }
            } else if (i3 < 0) {
                i4 = i2;
                if (i > i2) {
                    i4 = i2 + SumberDanaPilihPemilikSetunFragment.e(i, i2, -i3);
                }
            } else {
                throw new IllegalArgumentException("Step is zero.");
            }
            this.d = i4;
            this.a = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean b() {
        return this.a <= 0 ? this.c < this.d : this.c > this.d;
    }

    public final int c() {
        return this.d;
    }

    public final int d() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r3.a == r0.a) goto L_0x0040;
     */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof o.setBackgroundTransparent
            if (r0 == 0) goto L_0x0045
            r0 = r3
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0018
            r0 = r4
            o.setBackgroundTransparent r0 = (o.setBackgroundTransparent) r0
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0040
        L_0x0018:
            r0 = r3
            int r0 = r0.c
            r5 = r0
            r0 = r4
            o.setBackgroundTransparent r0 = (o.setBackgroundTransparent) r0
            r4 = r0
            r0 = r5
            r1 = r4
            int r1 = r1.c
            if (r0 != r1) goto L_0x0045
            r0 = r3
            int r0 = r0.d
            r1 = r4
            int r1 = r1.d
            if (r0 != r1) goto L_0x0045
            r0 = r3
            int r0 = r0.a
            r1 = r4
            int r1 = r1.a
            if (r0 != r1) goto L_0x0045
        L_0x0040:
            r0 = 1
            r6 = r0
            goto L_0x0047
        L_0x0045:
            r0 = 0
            r6 = r0
        L_0x0047:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setBackgroundTransparent.equals(java.lang.Object):boolean");
    }

    @Override // java.lang.Object
    public int hashCode() {
        return b() ? -1 : (((this.c * 31) + this.d) * 31) + this.a;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Integer> iterator() {
        return new setWatcher(this.c, this.d, this.a);
    }

    @Override // java.lang.Object
    public String toString() {
        int i;
        StringBuilder sb;
        if (this.a > 0) {
            sb = new StringBuilder();
            sb.append(this.c);
            sb.append("..");
            sb.append(this.d);
            sb.append(" step ");
            i = this.a;
        } else {
            sb = new StringBuilder();
            sb.append(this.c);
            sb.append(" downTo ");
            sb.append(this.d);
            sb.append(" step ");
            i = -this.a;
        }
        sb.append(i);
        return sb.toString();
    }
}
