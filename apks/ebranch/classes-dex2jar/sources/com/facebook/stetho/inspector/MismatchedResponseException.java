package com.facebook.stetho.inspector;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/MismatchedResponseException.class */
public class MismatchedResponseException extends MessageHandlingException {
    public long mRequestId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public MismatchedResponseException(long r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Response for request id "
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = ", but no such request is pending"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r7
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r0.mRequestId = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.inspector.MismatchedResponseException.<init>(long):void");
    }

    public long getRequestId() {
        return this.mRequestId;
    }
}
