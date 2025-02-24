package o;

import android.graphics.BitmapFactory;
/* loaded from: classes2-dex2jar.jar:o/Page6DBCADollarFragment_ViewBinding.class */
final class Page6DBCADollarFragment_ViewBinding {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
        if (r0 < 0) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static android.graphics.Bitmap a(android.content.Context r8, android.net.Uri r9, float r10, float r11, android.graphics.Bitmap.Config r12) {
        /*
        // Method dump skipped, instructions count: 621
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Page6DBCADollarFragment_ViewBinding.a(android.content.Context, android.net.Uri, float, float, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    private static int d(BitmapFactory.Options options, int i, int i2) {
        int i3;
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > i2 || i5 > i) {
            int round = Math.round(((float) i4) / ((float) i2));
            int round2 = Math.round(((float) i5) / ((float) i));
            i3 = round;
            if (round >= round2) {
                i3 = round2;
            }
        } else {
            i3 = 1;
        }
        float f = (float) (i5 * i4);
        while (f / ((float) (i3 * i3)) > ((float) ((i * i2) << 1))) {
            i3++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.StringBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.String] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static java.io.File d(android.content.Context r6, android.net.Uri r7, float r8, float r9, android.graphics.Bitmap.CompressFormat r10, android.graphics.Bitmap.Config r11, int r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 282
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Page6DBCADollarFragment_ViewBinding.d(android.content.Context, android.net.Uri, float, float, android.graphics.Bitmap$CompressFormat, android.graphics.Bitmap$Config, int, java.lang.String):java.io.File");
    }
}
