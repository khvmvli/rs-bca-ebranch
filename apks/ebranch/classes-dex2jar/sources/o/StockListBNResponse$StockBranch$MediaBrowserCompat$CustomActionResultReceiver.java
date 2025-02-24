package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/StockListBNResponse$StockBranch$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class StockListBNResponse$StockBranch$MediaBrowserCompat$CustomActionResultReceiver extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable, CharSequence> {
    final /* synthetic */ boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockListBNResponse$StockBranch$MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        super(1);
        this.b = z;
    }

    @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
    public final /* synthetic */ CharSequence a(GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable) {
        String str;
        GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable2 = getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable;
        subscribeReservationRescheduleEvent.e(getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable2, "");
        if (this.b) {
            StringBuilder sb = new StringBuilder("<b> ");
            sb.append(getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable2.e);
            sb.append(": </b>");
            sb.append(getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable2.d);
            sb.append(" <br />");
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable2.e);
            sb2.append(": ");
            sb2.append(getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable2.d);
            sb2.append('\n');
            str = sb2.toString();
        }
        return str;
    }
}
