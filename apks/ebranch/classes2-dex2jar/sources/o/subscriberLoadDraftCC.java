package o;

import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/subscriberLoadDraftCC.class */
public class subscriberLoadDraftCC {
    public static List a(Object obj) {
        if ((obj instanceof subscriberLoadDraftPemrekEvent) && !(obj instanceof setShowAlways)) {
            b(obj, "kotlin.collections.MutableList");
        }
        return c(obj);
    }

    private static void b(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(str);
        throw ((ClassCastException) subscribeReservationRescheduleEvent.c(new ClassCastException(sb.toString()), subscriberLoadDraftCC.class.getName()));
    }

    private static List c(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) subscribeReservationRescheduleEvent.c(e, subscriberLoadDraftCC.class.getName()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static java.lang.Object d(java.lang.Object r4, int r5) {
        /*
        // Method dump skipped, instructions count: 375
        */
        throw new UnsupportedOperationException("Method not decompiled: o.subscriberLoadDraftCC.d(java.lang.Object, int):java.lang.Object");
    }
}
