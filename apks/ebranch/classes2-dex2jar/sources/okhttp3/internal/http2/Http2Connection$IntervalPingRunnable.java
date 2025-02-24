package okhttp3.internal.http2;

import okhttp3.internal.NamedRunnable;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Http2Connection$IntervalPingRunnable.class */
final class Http2Connection$IntervalPingRunnable extends NamedRunnable {
    final /* synthetic */ Http2Connection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Http2Connection$IntervalPingRunnable(Http2Connection http2Connection) {
        super("OkHttp %s ping", new Object[]{http2Connection.hostname});
        this.this$0 = http2Connection;
    }

    public final void execute() {
        boolean z;
        synchronized (this.this$0) {
            if (Http2Connection.access$100(this.this$0) < Http2Connection.access$200(this.this$0)) {
                z = true;
            } else {
                Http2Connection.access$208(this.this$0);
                z = false;
            }
        }
        if (z) {
            Http2Connection.access$000(this.this$0);
        } else {
            this.this$0.writePing(false, 1, 0);
        }
    }
}
