package okhttp3.internal.http2;

import okhttp3.internal.NamedRunnable;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Http2Connection$7.class */
class Http2Connection$7 extends NamedRunnable {
    final /* synthetic */ Http2Connection this$0;
    final /* synthetic */ ErrorCode val$errorCode;
    final /* synthetic */ int val$streamId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Http2Connection$7(Http2Connection http2Connection, String str, Object[] objArr, int i, ErrorCode errorCode) {
        super(str, objArr);
        this.this$0 = http2Connection;
        this.val$streamId = i;
        this.val$errorCode = errorCode;
    }

    public void execute() {
        this.this$0.pushObserver.onReset(this.val$streamId, this.val$errorCode);
        synchronized (this.this$0) {
            this.this$0.currentPushRequests.remove(Integer.valueOf(this.val$streamId));
        }
    }
}
