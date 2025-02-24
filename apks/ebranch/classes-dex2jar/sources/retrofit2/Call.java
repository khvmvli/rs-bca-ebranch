package retrofit2;

import java.io.IOException;
import okhttp3.Request;
/* loaded from: classes-dex2jar.jar:retrofit2/Call.class */
public interface Call<T> extends Cloneable {
    void cancel();

    @Override // java.lang.Object
    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();
}
