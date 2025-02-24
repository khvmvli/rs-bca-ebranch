package o;

import java.util.concurrent.locks.LockSupport;
/* loaded from: classes2-dex2jar.jar:o/SendEmailActPresenter.class */
public abstract class SendEmailActPresenter extends SendEmailTransactionSuccessPresenter {
    protected final void b(long j, SaveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver) {
        if (RateTransactionPresenter.c()) {
            if (!(this != RequestOTPPresenter.a)) {
                throw new AssertionError();
            }
        }
        RequestOTPPresenter.a.c(j, saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver);
    }

    protected abstract Thread e();

    protected final void n() {
        Thread e = e();
        if (Thread.currentThread() != e && ForgotEmailPassPresenter.e == null) {
            LockSupport.unpark(e);
        }
    }
}
