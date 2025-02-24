package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import o.RateTransactionPresenter;
/* loaded from: classes2-dex2jar.jar:kotlinx/coroutines/flow/internal/ChildCancelledException.class */
public final class ChildCancelledException extends CancellationException {
    public ChildCancelledException() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (RateTransactionPresenter.e()) {
            return fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
