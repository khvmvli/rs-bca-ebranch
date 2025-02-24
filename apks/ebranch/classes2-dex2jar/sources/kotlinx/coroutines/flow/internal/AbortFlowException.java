package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import o.RateTransactionPresenter;
/* loaded from: classes2-dex2jar.jar:kotlinx/coroutines/flow/internal/AbortFlowException.class */
public final class AbortFlowException extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (RateTransactionPresenter.e()) {
            return fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
