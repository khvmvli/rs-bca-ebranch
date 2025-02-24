package o;

import java.io.Closeable;
/* loaded from: classes2-dex2jar.jar:o/T1TransaksiTarikanFragment_ViewBinding.class */
public final class T1TransaksiTarikanFragment_ViewBinding {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            subscribeReservationRescheduleEvent.e(th, "");
            subscribeReservationRescheduleEvent.e(th2, "");
            if (th != th2) {
                clickOrangLain.c.a(th, th2);
            }
        }
    }
}
