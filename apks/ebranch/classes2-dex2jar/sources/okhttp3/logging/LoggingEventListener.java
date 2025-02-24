package okhttp3.logging;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
/* loaded from: classes2-dex2jar.jar:okhttp3/logging/LoggingEventListener.class */
public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    /* loaded from: classes2-dex2jar.jar:okhttp3/logging/LoggingEventListener$Factory.class */
    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        public Factory() {
            this(HttpLoggingInterceptor.Logger.DEFAULT);
        }

        public Factory(HttpLoggingInterceptor.Logger logger) {
            this.logger = logger;
        }

        public EventListener create(Call call) {
            return new LoggingEventListener(this.logger);
        }
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.logger = logger;
    }

    private void logWithTime(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        HttpLoggingInterceptor.Logger logger = this.logger;
        StringBuilder sb = new StringBuilder("[");
        sb.append(millis);
        sb.append(" ms] ");
        sb.append(str);
        logger.log(sb.toString());
    }

    public final void callEnd(Call call) {
        logWithTime("callEnd");
    }

    public final void callFailed(Call call, IOException iOException) {
        StringBuilder sb = new StringBuilder("callFailed: ");
        sb.append(iOException);
        logWithTime(sb.toString());
    }

    public final void callStart(Call call) {
        this.startNs = System.nanoTime();
        StringBuilder sb = new StringBuilder("callStart: ");
        sb.append(call.request());
        logWithTime(sb.toString());
    }

    public final void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol) {
        StringBuilder sb = new StringBuilder("connectEnd: ");
        sb.append(protocol);
        logWithTime(sb.toString());
    }

    public final void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol, IOException iOException) {
        StringBuilder sb = new StringBuilder("connectFailed: ");
        sb.append(protocol);
        sb.append(" ");
        sb.append(iOException);
        logWithTime(sb.toString());
    }

    public final void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        StringBuilder sb = new StringBuilder("connectStart: ");
        sb.append(inetSocketAddress);
        sb.append(" ");
        sb.append(proxy);
        logWithTime(sb.toString());
    }

    public final void connectionAcquired(Call call, Connection connection) {
        StringBuilder sb = new StringBuilder("connectionAcquired: ");
        sb.append(connection);
        logWithTime(sb.toString());
    }

    public final void connectionReleased(Call call, Connection connection) {
        logWithTime("connectionReleased");
    }

    public final void dnsEnd(Call call, String str, List<InetAddress> list) {
        StringBuilder sb = new StringBuilder("dnsEnd: ");
        sb.append(list);
        logWithTime(sb.toString());
    }

    public final void dnsStart(Call call, String str) {
        StringBuilder sb = new StringBuilder("dnsStart: ");
        sb.append(str);
        logWithTime(sb.toString());
    }

    public final void requestBodyEnd(Call call, long j) {
        StringBuilder sb = new StringBuilder("requestBodyEnd: byteCount=");
        sb.append(j);
        logWithTime(sb.toString());
    }

    public final void requestBodyStart(Call call) {
        logWithTime("requestBodyStart");
    }

    public final void requestHeadersEnd(Call call, Request request) {
        logWithTime("requestHeadersEnd");
    }

    public final void requestHeadersStart(Call call) {
        logWithTime("requestHeadersStart");
    }

    public final void responseBodyEnd(Call call, long j) {
        StringBuilder sb = new StringBuilder("responseBodyEnd: byteCount=");
        sb.append(j);
        logWithTime(sb.toString());
    }

    public final void responseBodyStart(Call call) {
        logWithTime("responseBodyStart");
    }

    public final void responseHeadersEnd(Call call, Response response) {
        StringBuilder sb = new StringBuilder("responseHeadersEnd: ");
        sb.append(response);
        logWithTime(sb.toString());
    }

    public final void responseHeadersStart(Call call) {
        logWithTime("responseHeadersStart");
    }

    public final void secureConnectEnd(Call call, @Nullable Handshake handshake) {
        logWithTime("secureConnectEnd");
    }

    public final void secureConnectStart(Call call) {
        logWithTime("secureConnectStart");
    }
}
