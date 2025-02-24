package o;
/* loaded from: classes2-dex2jar.jar:o/clikedMBCA.class */
public final class clikedMBCA {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
        if (r0 != null) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static java.lang.String b(android.content.Context r7, android.net.Uri r8) {
        /*
            r0 = r8
            java.lang.String r0 = r0.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r0.equals(r1)
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r11
            r13 = r0
            r0 = r9
            if (r0 == 0) goto L_0x0088
            r0 = r7
            android.content.ContentResolver r0 = r0.getContentResolver()
            r1 = r8
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)
            r14 = r0
            r0 = r12
            r7 = r0
            r0 = r14
            if (r0 == 0) goto L_0x0076
            r0 = r12
            r7 = r0
            r0 = r14
            boolean r0 = r0.moveToFirst()     // Catch: Exception -> 0x0055, all -> 0x0051
            if (r0 == 0) goto L_0x0076
            r0 = r14
            r1 = r14
            java.lang.String r2 = "_display_name"
            int r1 = r1.getColumnIndex(r2)     // Catch: Exception -> 0x0055, all -> 0x0051
            java.lang.String r0 = r0.getString(r1)     // Catch: Exception -> 0x0055, all -> 0x0051
            r7 = r0
            goto L_0x0076
        L_0x0051:
            r7 = move-exception
            goto L_0x0068
        L_0x0055:
            r7 = move-exception
            r0 = r7
            r0.printStackTrace()     // Catch: all -> 0x0051
            r0 = r11
            r13 = r0
            r0 = r14
            if (r0 == 0) goto L_0x0088
            r0 = r10
            r7 = r0
            goto L_0x007e
        L_0x0068:
            r0 = r14
            if (r0 == 0) goto L_0x0074
            r0 = r14
            r0.close()
        L_0x0074:
            r0 = r7
            throw r0
        L_0x0076:
            r0 = r7
            r13 = r0
            r0 = r14
            if (r0 == 0) goto L_0x0088
        L_0x007e:
            r0 = r14
            r0.close()
            r0 = r7
            r13 = r0
        L_0x0088:
            r0 = r13
            r7 = r0
            r0 = r13
            if (r0 != 0) goto L_0x00af
            r0 = r8
            java.lang.String r0 = r0.getPath()
            r8 = r0
            r0 = r8
            java.lang.String r1 = java.io.File.separator
            int r0 = r0.lastIndexOf(r1)
            r15 = r0
            r0 = r8
            r7 = r0
            r0 = r15
            r1 = -1
            if (r0 == r1) goto L_0x00af
            r0 = r8
            r1 = r15
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            r7 = r0
        L_0x00af:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.clikedMBCA.b(android.content.Context, android.net.Uri):java.lang.String");
    }
}
