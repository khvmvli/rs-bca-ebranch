package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.NamedRunnable;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Http2Connection$5.class */
class Http2Connection$5 extends NamedRunnable {
    final /* synthetic */ Http2Connection this$0;
    final /* synthetic */ boolean val$inFinished;
    final /* synthetic */ List val$requestHeaders;
    final /* synthetic */ int val$streamId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Http2Connection$5(Http2Connection http2Connection, String str, Object[] objArr, int i, List list, boolean z) {
        super(str, objArr);
        this.this$0 = http2Connection;
        this.val$streamId = i;
        this.val$requestHeaders = list;
        this.val$inFinished = z;
    }

    public void execute() {
        boolean onHeaders = this.this$0.pushObserver.onHeaders(this.val$streamId, this.val$requestHeaders, this.val$inFinished);
        if (onHeaders) {
            try {
                this.this$0.writer.rstStream(this.val$streamId, ErrorCode.CANCEL);
            } catch (IOException e) {
                return;
            }
        }
        if (!onHeaders && !this.val$inFinished) {
            return;
        }
        synchronized (this.this$0) {
            this.this$0.currentPushRequests.remove(Integer.valueOf(this.val$streamId));
        }
    }
}
