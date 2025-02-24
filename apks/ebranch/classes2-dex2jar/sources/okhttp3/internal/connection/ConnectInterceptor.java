package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Interceptor$Chain;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/connection/ConnectInterceptor.class */
public final class ConnectInterceptor implements Interceptor {
    public final OkHttpClient client;

    public ConnectInterceptor(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    public final Response intercept(Interceptor$Chain interceptor$Chain) throws IOException {
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) interceptor$Chain;
        Request request = realInterceptorChain.request();
        StreamAllocation streamAllocation = realInterceptorChain.streamAllocation();
        return realInterceptorChain.proceed(request, streamAllocation, streamAllocation.newStream(this.client, interceptor$Chain, !request.method().equals("GET")), streamAllocation.connection());
    }
}
