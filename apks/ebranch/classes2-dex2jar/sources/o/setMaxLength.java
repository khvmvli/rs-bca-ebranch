package o;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* loaded from: classes2-dex2jar.jar:o/setMaxLength.class */
public final class setMaxLength extends TransaksiTundaFragment_ViewBinding {
    @Override // o.TransaksiTundaFragment_ViewBinding
    public final Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        subscribeReservationRescheduleEvent.d(current, "");
        return current;
    }
}
