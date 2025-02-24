package org.apache.commons.cli;

import o.Stetho$BuilderBasedInitializer;
import o.getInspectorModules;
/* loaded from: classes2-dex2jar.jar:org/apache/commons/cli/AlreadySelectedException.class */
public class AlreadySelectedException extends ParseException {
    private getInspectorModules a;
    private Stetho$BuilderBasedInitializer d;

    private AlreadySelectedException(String str) {
        super(str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public AlreadySelectedException(o.Stetho$BuilderBasedInitializer r5, o.getInspectorModules r6) {
        /*
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r1 = r0
            java.lang.String r2 = "The option '"
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            java.lang.String r0 = r0.e
            r8 = r0
            r0 = r8
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L_0x001f
            r0 = r6
            java.lang.String r0 = r0.a
            r9 = r0
        L_0x001f:
            r0 = r7
            r1 = r9
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "' was specified but an option from this group has already been selected: '"
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r7
            r1 = r5
            java.lang.String r1 = r1.a
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = "'"
            java.lang.StringBuffer r0 = r0.append(r1)
            r0 = r4
            r1 = r7
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.d = r1
            r0 = r4
            r1 = r6
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.cli.AlreadySelectedException.<init>(o.Stetho$BuilderBasedInitializer, o.getInspectorModules):void");
    }
}
