package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import o.GetPPUNumberPresenter;
import o.UpdateReceiverDataPresenter;
/* loaded from: classes2-dex2jar.jar:kotlinx/coroutines/TimeoutCancellationException.class */
public final class TimeoutCancellationException extends CancellationException implements GetPPUNumberPresenter<TimeoutCancellationException> {
    public final UpdateReceiverDataPresenter c;

    private TimeoutCancellationException(String str, UpdateReceiverDataPresenter updateReceiverDataPresenter) {
        super(str);
        this.c = updateReceiverDataPresenter;
    }

    @Override // o.GetPPUNumberPresenter
    public final /* synthetic */ TimeoutCancellationException c() {
        String message = getMessage();
        String str = message;
        if (message == null) {
            str = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(str, this.c);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
