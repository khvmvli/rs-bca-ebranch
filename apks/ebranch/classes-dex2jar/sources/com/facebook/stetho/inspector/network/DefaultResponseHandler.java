package com.facebook.stetho.inspector.network;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/network/DefaultResponseHandler.class */
public class DefaultResponseHandler implements ResponseHandler {
    private int mBytesRead = 0;
    private int mDecodedBytesRead = -1;
    private final NetworkEventReporter mEventReporter;
    private final String mRequestId;

    public DefaultResponseHandler(NetworkEventReporter networkEventReporter, String str) {
        this.mEventReporter = networkEventReporter;
        this.mRequestId = str;
    }

    private void reportDataReceived() {
        NetworkEventReporter networkEventReporter = this.mEventReporter;
        String str = this.mRequestId;
        int i = this.mBytesRead;
        int i2 = this.mDecodedBytesRead;
        int i3 = i2;
        if (i2 < 0) {
            i3 = i;
        }
        networkEventReporter.dataReceived(str, i, i3);
    }

    @Override // com.facebook.stetho.inspector.network.ResponseHandler
    public void onEOF() {
        reportDataReceived();
        this.mEventReporter.responseReadFinished(this.mRequestId);
    }

    @Override // com.facebook.stetho.inspector.network.ResponseHandler
    public void onError(IOException iOException) {
        reportDataReceived();
        this.mEventReporter.responseReadFailed(this.mRequestId, iOException.toString());
    }

    @Override // com.facebook.stetho.inspector.network.ResponseHandler
    public void onRead(int i) {
        this.mBytesRead += i;
    }

    @Override // com.facebook.stetho.inspector.network.ResponseHandler
    public void onReadDecoded(int i) {
        if (this.mDecodedBytesRead == -1) {
            this.mDecodedBytesRead = 0;
        }
        this.mDecodedBytesRead += i;
    }
}
