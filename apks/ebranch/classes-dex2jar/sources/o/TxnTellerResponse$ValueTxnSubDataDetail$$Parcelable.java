package o;

import o.TxnTellerResponse;
import o.performStop;
/* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable.class */
public final class TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable extends performStop.RemoteActionCompatParcelizer {
    private final long a;

    public TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable() {
        this(0, 1);
    }

    public TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable(long j) {
        this.a = j;
    }

    private /* synthetic */ TxnTellerResponse$ValueTxnSubDataDetail$$Parcelable(long j, int i) {
        this(0);
    }

    @Override // o.performStop.RemoteActionCompatParcelizer, o.performStop.read
    public final <T extends performPictureInPictureModeChanged> T e(Class<T> cls) {
        subscribeReservationRescheduleEvent.e(cls, "");
        if (subscribeReservationRescheduleEvent.b(cls, TxnTellerResponse.TxnDataOutput.class)) {
            return new TxnTellerResponse.TxnDataOutput(this.a);
        }
        StringBuilder sb = new StringBuilder("Cannot create ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
