package okhttp3.internal.http2;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import o.ChuckerDatabase;
import o.setScheme;
import o.setTookMs;
import okhttp3.internal.http2.Http2Connection;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/http2/Http2Connection$Builder.class */
public class Http2Connection$Builder {
    boolean client;
    String hostname;
    int pingIntervalMillis;
    setScheme.com_github_ChuckerTeam_Chucker_library sink;
    Socket socket;
    setTookMs source;
    Http2Connection.Listener listener = Http2Connection.Listener.REFUSE_INCOMING_STREAMS;
    PushObserver pushObserver = PushObserver.CANCEL;

    public Http2Connection$Builder(boolean z) {
        this.client = z;
    }

    public Http2Connection build() {
        return new Http2Connection(this);
    }

    public Http2Connection$Builder listener(Http2Connection.Listener listener) {
        this.listener = listener;
        return this;
    }

    public Http2Connection$Builder pingIntervalMillis(int i) {
        this.pingIntervalMillis = i;
        return this;
    }

    public Http2Connection$Builder pushObserver(PushObserver pushObserver) {
        this.pushObserver = pushObserver;
        return this;
    }

    public Http2Connection$Builder socket(Socket socket) throws IOException {
        return socket(socket, ((InetSocketAddress) socket.getRemoteSocketAddress()).getHostName(), ChuckerDatabase.b(ChuckerDatabase.a(socket)), ChuckerDatabase.d(ChuckerDatabase.e(socket)));
    }

    public Http2Connection$Builder socket(Socket socket, String str, setTookMs settookms, setScheme.com_github_ChuckerTeam_Chucker_library com_github_chuckerteam_chucker_library) {
        this.socket = socket;
        this.hostname = str;
        this.source = settookms;
        this.sink = com_github_chuckerteam_chucker_library;
        return this;
    }
}
