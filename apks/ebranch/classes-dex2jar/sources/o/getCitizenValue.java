package o;

import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/getCitizenValue.class */
final class getCitizenValue extends getEmailAddr {
    private final byte[] c;
    private final Iterable<setTransaksiTunda> d;

    private getCitizenValue(Iterable<setTransaksiTunda> iterable, byte[] bArr) {
        this.d = iterable;
        this.c = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ getCitizenValue(Iterable iterable, byte[] bArr, byte b) {
        this(iterable, bArr);
    }

    @Override // o.getEmailAddr
    public final Iterable<setTransaksiTunda> d() {
        return this.d;
    }

    @Override // o.getEmailAddr
    public final byte[] e() {
        return this.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (java.util.Arrays.equals(r3.c, r0 instanceof o.getCitizenValue ? ((o.getCitizenValue) r0).c : r0.e()) == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L_0x0009
            r0 = 1
            return r0
        L_0x0009:
            r0 = r4
            boolean r0 = r0 instanceof o.getEmailAddr
            if (r0 == 0) goto L_0x004b
            r0 = r4
            o.getEmailAddr r0 = (o.getEmailAddr) r0
            r4 = r0
            r0 = r3
            java.lang.Iterable<o.setTransaksiTunda> r0 = r0.d
            r1 = r4
            java.lang.Iterable r1 = r1.d()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            r0 = r3
            byte[] r0 = r0.c
            r6 = r0
            r0 = r4
            boolean r0 = r0 instanceof o.getCitizenValue
            if (r0 == 0) goto L_0x003a
            r0 = r4
            o.getCitizenValue r0 = (o.getCitizenValue) r0
            byte[] r0 = r0.c
            r4 = r0
            goto L_0x003f
        L_0x003a:
            r0 = r4
            byte[] r0 = r0.e()
            r4 = r0
        L_0x003f:
            r0 = r6
            r1 = r4
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L_0x0049
        L_0x0047:
            r0 = 0
            r5 = r0
        L_0x0049:
            r0 = r5
            return r0
        L_0x004b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCitizenValue.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((this.d.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendRequest{events=");
        sb.append(this.d);
        sb.append(", extras=");
        sb.append(Arrays.toString(this.c));
        sb.append("}");
        return sb.toString();
    }
}
