package okhttp3.internal.connection;

import java.io.IOException;
import o.setScheme;
import o.setTookMs;
import okhttp3.internal.ws.RealWebSocket;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/connection/RealConnection$1.class */
class RealConnection$1 extends RealWebSocket.Streams {
    final /* synthetic */ RealConnection this$0;
    final /* synthetic */ StreamAllocation val$streamAllocation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealConnection$1(RealConnection realConnection, boolean z, setTookMs settookms, setScheme.com_github_ChuckerTeam_Chucker_library com_github_chuckerteam_chucker_library, StreamAllocation streamAllocation) {
        super(z, settookms, com_github_chuckerteam_chucker_library);
        this.this$0 = realConnection;
        this.val$streamAllocation = streamAllocation;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        StreamAllocation streamAllocation = this.val$streamAllocation;
        streamAllocation.streamFinished(true, streamAllocation.codec(), -1, (IOException) null);
    }
}
