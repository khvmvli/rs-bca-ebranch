package o;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2-dex2jar.jar:o/ErrorGetRateBNDialog_ViewBinding.class */
final class ErrorGetRateBNDialog_ViewBinding {
    static AtomicReference<ErrorGetAvailableBookingTimeDialog_ViewBinding> c = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar c(Calendar calendar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance2.clear();
        instance2.set(instance.get(1), instance.get(2), instance.get(5));
        return instance2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Calendar d() {
        ErrorGetAvailableBookingTimeDialog_ViewBinding errorGetAvailableBookingTimeDialog_ViewBinding = c.get();
        ErrorGetAvailableBookingTimeDialog_ViewBinding errorGetAvailableBookingTimeDialog_ViewBinding2 = errorGetAvailableBookingTimeDialog_ViewBinding;
        if (errorGetAvailableBookingTimeDialog_ViewBinding == null) {
            errorGetAvailableBookingTimeDialog_ViewBinding2 = ErrorGetAvailableBookingTimeDialog_ViewBinding.c;
        }
        Calendar e = errorGetAvailableBookingTimeDialog_ViewBinding2.e();
        e.set(11, 0);
        e.set(12, 0);
        e.set(13, 0);
        e.set(14, 0);
        e.setTimeZone(TimeZone.getTimeZone("UTC"));
        return e;
    }
}
