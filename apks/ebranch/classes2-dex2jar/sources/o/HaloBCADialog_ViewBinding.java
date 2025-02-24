package o;
/* loaded from: classes2-dex2jar.jar:o/HaloBCADialog_ViewBinding.class */
public final class HaloBCADialog_ViewBinding {
    public static float a(float f, float f2, float f3, float f4, float f5, float f6) {
        double d = (double) (0.0f - f);
        double d2 = (double) (0.0f - f2);
        float hypot = (float) Math.hypot(d, d2);
        double d3 = (double) (f5 - f);
        float hypot2 = (float) Math.hypot(d3, d2);
        double d4 = (double) (f6 - f2);
        return b(hypot, hypot2, (float) Math.hypot(d3, d4), (float) Math.hypot(d, d4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r3 <= r6) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static float b(float r3, float r4, float r5, float r6) {
        /*
            r0 = r3
            r1 = r4
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            r0 = r3
            r1 = r5
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            r0 = r3
            r7 = r0
            r0 = r3
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0036
        L_0x0015:
            r0 = r4
            r1 = r5
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            r0 = r4
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            r0 = r4
            r7 = r0
            goto L_0x0036
        L_0x0027:
            r0 = r5
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0033
            r0 = r5
            r7 = r0
            goto L_0x0036
        L_0x0033:
            r0 = r6
            r7 = r0
        L_0x0036:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.HaloBCADialog_ViewBinding.b(float, float, float, float):float");
    }
}
