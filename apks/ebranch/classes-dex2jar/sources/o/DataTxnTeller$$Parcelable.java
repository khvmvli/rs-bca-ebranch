package o;

import o.performStop;
/* loaded from: classes-dex2jar.jar:o/DataTxnTeller$$Parcelable.class */
public final class DataTxnTeller$$Parcelable extends performStop.RemoteActionCompatParcelizer {
    private final long e;

    public DataTxnTeller$$Parcelable() {
        this(0, 1);
    }

    public DataTxnTeller$$Parcelable(long j) {
        this.e = j;
    }

    public /* synthetic */ DataTxnTeller$$Parcelable(long j, int i) {
        this(0);
    }

    @Override // o.performStop.RemoteActionCompatParcelizer, o.performStop.read
    public final <T extends performPictureInPictureModeChanged> T e(Class<T> cls) {
        subscribeReservationRescheduleEvent.e(cls, "");
        if (subscribeReservationRescheduleEvent.b(cls, getIsRepresentativeTransaction.class)) {
            return new getIsRepresentativeTransaction(this.e);
        }
        StringBuilder sb = new StringBuilder("Cannot create ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
