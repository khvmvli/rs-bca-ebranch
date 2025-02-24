package okhttp3;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes2-dex2jar.jar:okhttp3/Interceptor$Chain.class */
public interface Interceptor$Chain {
    Call call();

    int connectTimeoutMillis();

    @Nullable
    Connection connection();

    Response proceed(Request request) throws IOException;

    int readTimeoutMillis();

    Request request();

    Interceptor$Chain withConnectTimeout(int i, TimeUnit timeUnit);

    Interceptor$Chain withReadTimeout(int i, TimeUnit timeUnit);

    Interceptor$Chain withWriteTimeout(int i, TimeUnit timeUnit);

    int writeTimeoutMillis();
}
