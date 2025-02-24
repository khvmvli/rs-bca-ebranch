package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import o.GetPPUNumberPresenter;
import o.RateTransactionPresenter;
import o.UpdateReceiverDataPresenter;
import o.subscribeReservationRescheduleEvent;
/* loaded from: classes2-dex2jar.jar:kotlinx/coroutines/JobCancellationException.class */
public final class JobCancellationException extends CancellationException implements GetPPUNumberPresenter<JobCancellationException> {
    public final UpdateReceiverDataPresenter d;

    public JobCancellationException(String str, Throwable th, UpdateReceiverDataPresenter updateReceiverDataPresenter) {
        super(str);
        this.d = updateReceiverDataPresenter;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // o.GetPPUNumberPresenter
    public final /* synthetic */ JobCancellationException c() {
        JobCancellationException jobCancellationException;
        if (RateTransactionPresenter.e()) {
            String message = getMessage();
            subscribeReservationRescheduleEvent.c(message);
            jobCancellationException = new JobCancellationException(message, this, this.d);
        } else {
            jobCancellationException = null;
        }
        return jobCancellationException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (o.subscribeReservationRescheduleEvent.b(r0.getCause(), getCause()) != false) goto L_0x0040;
     */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            r1 = r3
            if (r0 == r1) goto L_0x0040
            r0 = r4
            boolean r0 = r0 instanceof kotlinx.coroutines.JobCancellationException
            if (r0 == 0) goto L_0x003b
            r0 = r4
            kotlinx.coroutines.JobCancellationException r0 = (kotlinx.coroutines.JobCancellationException) r0
            r4 = r0
            r0 = r4
            java.lang.String r0 = r0.getMessage()
            r1 = r3
            java.lang.String r1 = r1.getMessage()
            boolean r0 = o.subscribeReservationRescheduleEvent.b(r0, r1)
            if (r0 == 0) goto L_0x003b
            r0 = r4
            o.UpdateReceiverDataPresenter r0 = r0.d
            r1 = r3
            o.UpdateReceiverDataPresenter r1 = r1.d
            boolean r0 = o.subscribeReservationRescheduleEvent.b(r0, r1)
            if (r0 == 0) goto L_0x003b
            r0 = r4
            java.lang.Throwable r0 = r0.getCause()
            r1 = r3
            java.lang.Throwable r1 = r1.getCause()
            boolean r0 = o.subscribeReservationRescheduleEvent.b(r0, r1)
            if (r0 != 0) goto L_0x0040
        L_0x003b:
            r0 = 0
            r5 = r0
            goto L_0x0042
        L_0x0040:
            r0 = 1
            r5 = r0
        L_0x0042:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobCancellationException.equals(java.lang.Object):boolean");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (RateTransactionPresenter.e()) {
            return fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        String message = getMessage();
        subscribeReservationRescheduleEvent.c(message);
        int hashCode = message.hashCode();
        int hashCode2 = this.d.hashCode();
        Throwable cause = getCause();
        return (((hashCode * 31) + hashCode2) * 31) + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable, java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString());
        sb.append("; job=");
        sb.append(this.d);
        return sb.toString();
    }
}
