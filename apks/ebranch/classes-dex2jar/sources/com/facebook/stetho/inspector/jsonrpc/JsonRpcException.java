package com.facebook.stetho.inspector.jsonrpc;

import com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/jsonrpc/JsonRpcException.class */
public class JsonRpcException extends Exception {
    private final JsonRpcError mErrorMessage;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public JsonRpcException(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = r4
            com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError$ErrorCode r1 = r1.code
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            java.lang.String r1 = r1.message
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            r1 = r5
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            java.lang.Object r1 = com.facebook.stetho.common.Util.throwIfNull(r1)
            com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError r1 = (com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError) r1
            r0.mErrorMessage = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.inspector.jsonrpc.JsonRpcException.<init>(com.facebook.stetho.inspector.jsonrpc.protocol.JsonRpcError):void");
    }

    public JsonRpcError getErrorMessage() {
        return this.mErrorMessage;
    }
}
