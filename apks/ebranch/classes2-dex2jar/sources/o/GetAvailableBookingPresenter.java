package o;
/* loaded from: classes2-dex2jar.jar:o/GetAvailableBookingPresenter.class */
public final class GetAvailableBookingPresenter extends SaveToEformPresenter {
    private final Thread a;

    public GetAvailableBookingPresenter(Thread thread) {
        this.a = thread;
    }

    @Override // o.SendEmailActPresenter
    protected final Thread e() {
        return this.a;
    }
}
