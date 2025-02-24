package com.google.android.gms.common.api;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/common/api/ApiException.class */
public class ApiException extends Exception {
    @Deprecated
    protected final Status c;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public ApiException(com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            r0 = r4
            int r0 = r0.h
            r5 = r0
            r0 = r4
            java.lang.String r0 = r0.j
            if (r0 == 0) goto L_0x0014
            r0 = r4
            java.lang.String r0 = r0.j
            r6 = r0
            goto L_0x0017
        L_0x0014:
            java.lang.String r0 = ""
            r6 = r0
        L_0x0017:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            r1 = r7
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.ApiException.<init>(com.google.android.gms.common.api.Status):void");
    }

    public final Status c() {
        return this.c;
    }
}
