package org.apache.commons.cli;

import o.getInspectorModules;
/* loaded from: classes2-dex2jar.jar:org/apache/commons/cli/MissingArgumentException.class */
public class MissingArgumentException extends ParseException {
    private getInspectorModules d;

    private MissingArgumentException(String str) {
        super(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public MissingArgumentException(o.getInspectorModules r5) {
        /*
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            java.lang.String r2 = "Missing argument for option: "
            r1.<init>(r2)
            r6 = r0
            r0 = r5
            java.lang.String r0 = r0.e
            r7 = r0
            r0 = r7
            r8 = r0
            r0 = r7
            if (r0 != 0) goto L_0x001c
            r0 = r5
            java.lang.String r0 = r0.a
            r8 = r0
        L_0x001c:
            r0 = r6
            r1 = r8
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r4
            r1 = r6
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.cli.MissingArgumentException.<init>(o.getInspectorModules):void");
    }
}
