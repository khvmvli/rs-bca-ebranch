package o;

import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes-dex2jar.jar:o/Fragment$5.class */
public final class Fragment$5 {
    public static final InquiryLoadDataBTPresenter c(onActivityStopped onactivitystopped) {
        subscribeReservationRescheduleEvent.e(onactivitystopped, "");
        Map<String, Object> map = onactivitystopped.b;
        subscribeReservationRescheduleEvent.d(map, "");
        Object obj = map.get("QueryDispatcher");
        Object obj2 = obj;
        if (obj == null) {
            Executor executor = onactivitystopped.j;
            subscribeReservationRescheduleEvent.d(executor, "");
            obj2 = TransactionPresenter.c(executor);
            map.put("QueryDispatcher", obj2);
        }
        subscribeReservationRescheduleEvent.c(obj2);
        return (InquiryLoadDataBTPresenter) obj2;
    }

    public static final InquiryLoadDataBTPresenter d(onActivityStopped onactivitystopped) {
        subscribeReservationRescheduleEvent.e(onactivitystopped, "");
        Map<String, Object> map = onactivitystopped.b;
        subscribeReservationRescheduleEvent.d(map, "");
        Object obj = map.get("TransactionDispatcher");
        Object obj2 = obj;
        if (obj == null) {
            Executor executor = onactivitystopped.f;
            subscribeReservationRescheduleEvent.d(executor, "");
            obj2 = TransactionPresenter.c(executor);
            map.put("TransactionDispatcher", obj2);
        }
        subscribeReservationRescheduleEvent.c(obj2);
        return (InquiryLoadDataBTPresenter) obj2;
    }
}
