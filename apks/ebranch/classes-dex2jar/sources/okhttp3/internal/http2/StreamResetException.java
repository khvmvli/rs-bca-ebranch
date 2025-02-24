package okhttp3.internal.http2;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:okhttp3/internal/http2/StreamResetException.class */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public StreamResetException(okhttp3.internal.http2.ErrorCode r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "stream was reset: "
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r6
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.errorCode = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.StreamResetException.<init>(okhttp3.internal.http2.ErrorCode):void");
    }
}
