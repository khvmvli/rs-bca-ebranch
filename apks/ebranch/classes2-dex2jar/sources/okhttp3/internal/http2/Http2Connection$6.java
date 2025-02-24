package okhttp3.internal.http2;

import java.io.IOException;
import o.setResponseContentType;
import okhttp3.internal.NamedRunnable;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Http2Connection$6.class */
class Http2Connection$6 extends NamedRunnable {
    final /* synthetic */ Http2Connection this$0;
    final /* synthetic */ setResponseContentType val$buffer;
    final /* synthetic */ int val$byteCount;
    final /* synthetic */ boolean val$inFinished;
    final /* synthetic */ int val$streamId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Http2Connection$6(Http2Connection http2Connection, String str, Object[] objArr, int i, setResponseContentType setresponsecontenttype, int i2, boolean z) {
        super(str, objArr);
        this.this$0 = http2Connection;
        this.val$streamId = i;
        this.val$buffer = setresponsecontenttype;
        this.val$byteCount = i2;
        this.val$inFinished = z;
    }

    public void execute() {
        try {
            boolean onData = this.this$0.pushObserver.onData(this.val$streamId, this.val$buffer, this.val$byteCount, this.val$inFinished);
            if (onData) {
                this.this$0.writer.rstStream(this.val$streamId, ErrorCode.CANCEL);
            }
            if (!onData && !this.val$inFinished) {
                return;
            }
            synchronized (this.this$0) {
                this.this$0.currentPushRequests.remove(Integer.valueOf(this.val$streamId));
            }
        } catch (IOException e) {
        }
    }
}
