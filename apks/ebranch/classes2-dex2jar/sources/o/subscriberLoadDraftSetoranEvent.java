package o;

import java.util.Random;
/* loaded from: classes2-dex2jar.jar:o/subscriberLoadDraftSetoranEvent.class */
public final class subscriberLoadDraftSetoranEvent extends TransaksiTundaFragment_ViewBinding {
    private final read d = new read();

    /* loaded from: classes2-dex2jar.jar:o/subscriberLoadDraftSetoranEvent$read.class */
    public static final class read extends ThreadLocal<Random> {
        read() {
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Random initialValue() {
            return new Random();
        }
    }

    @Override // o.TransaksiTundaFragment_ViewBinding
    public final Random c() {
        Random random = this.d.get();
        subscribeReservationRescheduleEvent.d(random, "");
        return random;
    }
}
