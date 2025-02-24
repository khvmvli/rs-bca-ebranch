package o;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes-dex2jar.jar:o/setFlag_iban.class */
public final class setFlag_iban {
    public static final setFlag_iban c = new setFlag_iban();
    private static final boolean d = true;

    private setFlag_iban() {
    }

    public static final void a(Context context) {
        subscribeReservationRescheduleEvent.e(context, "");
        new setNotes(context).d.cancel(3546);
    }

    public static final Intent b(Context context) {
        subscribeReservationRescheduleEvent.e(context, "");
        Intent flags = new Intent(context, setSttCode.class).setFlags(268435456);
        subscribeReservationRescheduleEvent.d(flags, "");
        return flags;
    }

    public static final void c(Context context) {
        subscribeReservationRescheduleEvent.e(context, "");
        new setNotes(context).d.cancel(1138);
    }

    public static final Intent e(Context context, int i) {
        subscribeReservationRescheduleEvent.e(context, "");
        subscribeReservationRescheduleEvent.e(context, "");
        Intent flags = new Intent(context, setSttCode.class).setFlags(268435456);
        subscribeReservationRescheduleEvent.d(flags, "");
        Intent putExtra = flags.putExtra("EXTRA_SCREEN", 2);
        subscribeReservationRescheduleEvent.d(putExtra, "");
        return putExtra;
    }
}
