package retrofit2;

import java.io.IOException;
import retrofit2.ExecutorCallAdapterFactory;
/* loaded from: classes2-dex2jar.jar:retrofit2/ExecutorCallAdapterFactory$ExecutorCallbackCall$1.class */
class ExecutorCallAdapterFactory$ExecutorCallbackCall$1 implements Callback<T> {
    final /* synthetic */ ExecutorCallAdapterFactory.ExecutorCallbackCall this$0;
    final /* synthetic */ Callback val$callback;

    ExecutorCallAdapterFactory$ExecutorCallbackCall$1(ExecutorCallAdapterFactory.ExecutorCallbackCall executorCallbackCall, Callback callback) {
        this.this$0 = executorCallbackCall;
        this.val$callback = callback;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call<T> call, final Throwable th) {
        this.this$0.callbackExecutor.execute(new Runnable() { // from class: retrofit2.ExecutorCallAdapterFactory$ExecutorCallbackCall$1.2
            @Override // java.lang.Runnable
            public void run() {
                ExecutorCallAdapterFactory$ExecutorCallbackCall$1.this.val$callback.onFailure(ExecutorCallAdapterFactory$ExecutorCallbackCall$1.this.this$0, th);
            }
        });
    }

    @Override // retrofit2.Callback
    public void onResponse(Call<T> call, final Response<T> response) {
        this.this$0.callbackExecutor.execute(new Runnable() { // from class: retrofit2.ExecutorCallAdapterFactory$ExecutorCallbackCall$1.1
            @Override // java.lang.Runnable
            public void run() {
                if (ExecutorCallAdapterFactory$ExecutorCallbackCall$1.this.this$0.delegate.isCanceled()) {
                    ExecutorCallAdapterFactory$ExecutorCallbackCall$1.this.val$callback.onFailure(ExecutorCallAdapterFactory$ExecutorCallbackCall$1.this.this$0, new IOException("Canceled"));
                } else {
                    ExecutorCallAdapterFactory$ExecutorCallbackCall$1.this.val$callback.onResponse(ExecutorCallAdapterFactory$ExecutorCallbackCall$1.this.this$0, response);
                }
            }
        });
    }
}
