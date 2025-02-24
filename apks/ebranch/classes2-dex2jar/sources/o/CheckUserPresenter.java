package o;

import java.nio.charset.Charset;
/* loaded from: classes2-dex2jar.jar:o/CheckUserPresenter.class */
public final class CheckUserPresenter {
    public static final Charset a;
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static final CheckUserPresenter e = new CheckUserPresenter();
    public static final Charset f;
    public static final Charset i;

    static {
        Charset forName = Charset.forName("UTF-8");
        subscribeReservationRescheduleEvent.d(forName, "");
        i = forName;
        Charset forName2 = Charset.forName("UTF-16");
        subscribeReservationRescheduleEvent.d(forName2, "");
        d = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        subscribeReservationRescheduleEvent.d(forName3, "");
        a = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        subscribeReservationRescheduleEvent.d(forName4, "");
        f = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        subscribeReservationRescheduleEvent.d(forName5, "");
        c = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        subscribeReservationRescheduleEvent.d(forName6, "");
        b = forName6;
    }

    private CheckUserPresenter() {
    }
}
