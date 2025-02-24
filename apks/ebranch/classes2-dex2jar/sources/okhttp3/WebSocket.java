package okhttp3;

import javax.annotation.Nullable;
import o.setResponseMessage;
/* loaded from: classes2-dex2jar.jar:okhttp3/WebSocket.class */
public interface WebSocket {
    void cancel();

    boolean close(int i, @Nullable String str);

    long queueSize();

    Request request();

    boolean send(String str);

    boolean send(setResponseMessage setresponsemessage);
}
