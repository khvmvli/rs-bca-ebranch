package o;

import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: classes2-dex2jar.jar:o/ErrorGetAvailableBookingTimeDialog_ViewBinding.class */
final class ErrorGetAvailableBookingTimeDialog_ViewBinding {
    static final ErrorGetAvailableBookingTimeDialog_ViewBinding c = new ErrorGetAvailableBookingTimeDialog_ViewBinding(null, null);
    private final TimeZone a;
    private final Long d;

    private ErrorGetAvailableBookingTimeDialog_ViewBinding(Long l, TimeZone timeZone) {
        this.d = l;
        this.a = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Calendar e() {
        TimeZone timeZone = this.a;
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.d;
        if (l != null) {
            instance.setTimeInMillis(l.longValue());
        }
        return instance;
    }
}
