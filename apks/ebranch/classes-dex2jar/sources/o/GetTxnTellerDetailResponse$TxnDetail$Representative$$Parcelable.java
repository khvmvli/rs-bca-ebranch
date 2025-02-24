package o;
/* loaded from: classes-dex2jar.jar:o/GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.class */
public final class GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable {
    public String a;
    public String b;
    public String c;
    public Long d;
    public Long e;

    public GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable(Long l, String str, Long l2, String str2, String str3) {
        this.e = l;
        this.a = str;
        this.d = l2;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable)) {
            return false;
        }
        GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable getTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable = (GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable) obj;
        return subscribeReservationRescheduleEvent.b(this.e, getTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.e) && subscribeReservationRescheduleEvent.b((Object) this.a, (Object) getTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.a) && subscribeReservationRescheduleEvent.b(this.d, getTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.d) && subscribeReservationRescheduleEvent.b((Object) this.b, (Object) getTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.b) && subscribeReservationRescheduleEvent.b((Object) this.c, (Object) getTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.c);
    }

    public final int hashCode() {
        Long l = this.e;
        int i = 0;
        int hashCode = l == null ? 0 : l.hashCode();
        String str = this.a;
        int hashCode2 = str == null ? 0 : str.hashCode();
        Long l2 = this.d;
        int hashCode3 = l2 == null ? 0 : l2.hashCode();
        String str2 = this.b;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordedThrowableTuple(id=");
        sb.append(this.e);
        sb.append(", tag=");
        sb.append(this.a);
        sb.append(", date=");
        sb.append(this.d);
        sb.append(", clazz=");
        sb.append(this.b);
        sb.append(", message=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
