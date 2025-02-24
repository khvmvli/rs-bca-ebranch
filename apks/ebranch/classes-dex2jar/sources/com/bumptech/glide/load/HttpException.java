package com.bumptech.glide.load;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:com/bumptech/glide/load/HttpException.class */
public final class HttpException extends IOException {
    private final int b;

    public HttpException(int i) {
        this("Http request failed", i);
    }

    public HttpException(String str, int i) {
        this(str, i, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public HttpException(java.lang.String r5, int r6, java.lang.Throwable r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            java.lang.String r1 = ", status code: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r8
            java.lang.String r1 = r1.toString()
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r6
            r0.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.HttpException.<init>(java.lang.String, int, java.lang.Throwable):void");
    }
}
