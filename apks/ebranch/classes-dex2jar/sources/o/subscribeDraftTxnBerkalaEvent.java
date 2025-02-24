package o;

import java.io.Serializable;
/* loaded from: classes-dex2jar.jar:o/subscribeDraftTxnBerkalaEvent.class */
public abstract class subscribeDraftTxnBerkalaEvent<R> implements TransaksiTundaFragment<R>, Serializable {
    private final int arity;

    public subscribeDraftTxnBerkalaEvent(int i) {
        this.arity = i;
    }

    @Override // o.TransaksiTundaFragment
    public int getArity() {
        return this.arity;
    }

    @Override // java.lang.Object
    public String toString() {
        String b = subscriberLoadDraftBankTransferEvent.b(this);
        subscribeReservationRescheduleEvent.d(b, "");
        return b;
    }
}
