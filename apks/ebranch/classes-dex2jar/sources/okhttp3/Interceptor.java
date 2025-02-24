package okhttp3;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:okhttp3/Interceptor.class */
public interface Interceptor {
    Response intercept(Chain chain) throws IOException;
}
