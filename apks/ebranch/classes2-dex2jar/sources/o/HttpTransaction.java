package o;
/* loaded from: classes2-dex2jar.jar:o/HttpTransaction.class */
public final class HttpTransaction {
    public static final HttpTransaction b = new HttpTransaction();
    private static final ThreadLocal<SendEmailTransactionSuccessPresenter> d = new ThreadLocal<>();

    private HttpTransaction() {
    }

    public static void b(SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter) {
        d.set(sendEmailTransactionSuccessPresenter);
    }

    public static void c() {
        d.set(null);
    }

    public static SendEmailTransactionSuccessPresenter d() {
        ThreadLocal<SendEmailTransactionSuccessPresenter> threadLocal = d;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = threadLocal.get();
        GetAvailableBookingPresenter getAvailableBookingPresenter = sendEmailTransactionSuccessPresenter;
        if (sendEmailTransactionSuccessPresenter == null) {
            getAvailableBookingPresenter = new GetAvailableBookingPresenter(Thread.currentThread());
            threadLocal.set(getAvailableBookingPresenter);
        }
        return getAvailableBookingPresenter;
    }
}
