package o;

import android.content.Intent;
import o.Page6KLFragment;
/* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$ItemReceiver.class */
final class TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$ItemReceiver extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
    final /* synthetic */ TujuanTransaksiORResponse$$Parcelable b;
    int c;
    final /* synthetic */ TxnTellerResponse$TxnDataOutput$$Parcelable d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$ItemReceiver(TujuanTransaksiORResponse$$Parcelable tujuanTransaksiORResponse$$Parcelable, TxnTellerResponse$TxnDataOutput$$Parcelable txnTellerResponse$TxnDataOutput$$Parcelable, ProsesTarikanFragment<? super TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$ItemReceiver> prosesTarikanFragment) {
        super(2, prosesTarikanFragment);
        this.b = tujuanTransaksiORResponse$$Parcelable;
        this.d = txnTellerResponse$TxnDataOutput$$Parcelable;
    }

    public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
        return new TxnTellerResponse$TxnDataOutput$$Parcelable$MediaBrowserCompat$ItemReceiver(this.b, this.d, prosesTarikanFragment);
    }

    @Override // o.onClickInfo
    public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
        return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
    }

    public final Object invokeSuspend(Object obj) {
        ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (obj instanceof Page6KLFragment.IconCompatParcelizer) {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
        } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
            TujuanTransaksiORResponse$$Parcelable tujuanTransaksiORResponse$$Parcelable = this.b;
            TxnTellerResponse$TxnDataOutput$$Parcelable txnTellerResponse$TxnDataOutput$$Parcelable = this.d;
            TxnTellerResponse$TxnDataOutput$$Parcelable txnTellerResponse$TxnDataOutput$$Parcelable2 = txnTellerResponse$TxnDataOutput$$Parcelable;
            String string = txnTellerResponse$TxnDataOutput$$Parcelable.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.K);
            subscribeReservationRescheduleEvent.d(string, "");
            String string2 = this.d.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.N);
            subscribeReservationRescheduleEvent.d(string2, "");
            this.c = 1;
            Object b = getSttCode.b(tujuanTransaksiORResponse$$Parcelable, txnTellerResponse$TxnDataOutput$$Parcelable2, "transaction.txt", string, string2, "transaction", (ProsesTarikanFragment) this);
            obj = b;
            if (b == reviewSetoranFragment_ViewBinding) {
                return reviewSetoranFragment_ViewBinding;
            }
        } else {
            throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
        }
        Intent intent = (Intent) obj;
        if (intent != null) {
            this.d.startActivity(intent);
        }
        return onCLickStatusNpwp.e;
    }
}
