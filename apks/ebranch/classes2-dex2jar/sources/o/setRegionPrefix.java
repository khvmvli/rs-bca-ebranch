package o;
/* loaded from: classes2-dex2jar.jar:o/setRegionPrefix.class */
public final class setRegionPrefix extends setBackgroundTransparent {
    public static final RemoteActionCompatParcelizer e = new RemoteActionCompatParcelizer((byte) 0);
    private static final setRegionPrefix j = new setRegionPrefix(1, 0);

    /* loaded from: classes2-dex2jar.jar:o/setRegionPrefix$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    public setRegionPrefix(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // o.setBackgroundTransparent
    public final boolean b() {
        return d() > c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        if ((r0.d() > r0.c()) == false) goto L_0x0047;
     */
    @Override // o.setBackgroundTransparent, java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof o.setRegionPrefix
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x006b
            r0 = r3
            int r0 = r0.d()
            r1 = r3
            int r1 = r1.c()
            if (r0 <= r1) goto L_0x001c
            r0 = 1
            r7 = r0
            goto L_0x001f
        L_0x001c:
            r0 = 0
            r7 = r0
        L_0x001f:
            r0 = r7
            if (r0 == 0) goto L_0x0047
            r0 = r4
            o.setRegionPrefix r0 = (o.setRegionPrefix) r0
            r8 = r0
            r0 = r8
            int r0 = r0.d()
            r1 = r8
            int r1 = r1.c()
            if (r0 <= r1) goto L_0x003d
            r0 = 1
            r7 = r0
            goto L_0x0040
        L_0x003d:
            r0 = 0
            r7 = r0
        L_0x0040:
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L_0x006d
        L_0x0047:
            r0 = r3
            int r0 = r0.d()
            r7 = r0
            r0 = r4
            o.setRegionPrefix r0 = (o.setRegionPrefix) r0
            r4 = r0
            r0 = r7
            r1 = r4
            int r1 = r1.d()
            if (r0 != r1) goto L_0x006b
            r0 = r3
            int r0 = r0.c()
            r1 = r4
            int r1 = r1.c()
            if (r0 != r1) goto L_0x006b
            r0 = r6
            r5 = r0
            goto L_0x006d
        L_0x006b:
            r0 = 0
            r5 = r0
        L_0x006d:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setRegionPrefix.equals(java.lang.Object):boolean");
    }

    @Override // o.setBackgroundTransparent, java.lang.Object
    public final int hashCode() {
        return d() > c() ? -1 : (d() * 31) + c();
    }

    @Override // o.setBackgroundTransparent, java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(d());
        sb.append("..");
        sb.append(c());
        return sb.toString();
    }
}
