package o;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import o.TujuanTransaksiORResponse;
/* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver.class */
final class TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<HttpTransaction, TujuanTransaksiORResponse$$Parcelable> {
    public static final TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver d = new TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver();

    TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver() {
        super(1);
    }

    @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
    public final /* synthetic */ TujuanTransaksiORResponse$$Parcelable a(HttpTransaction httpTransaction) {
        HttpTransaction httpTransaction2 = httpTransaction;
        subscribeReservationRescheduleEvent.e(httpTransaction2, "");
        return new TujuanTransaksiORResponse.TujuanTransaksiOR(httpTransaction2);
    }
}
