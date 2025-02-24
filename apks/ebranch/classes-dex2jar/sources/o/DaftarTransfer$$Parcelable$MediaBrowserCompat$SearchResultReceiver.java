package o;

import android.net.Uri;
import android.widget.Toast;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import o.Page6KLFragment;
import o.TxnTellerResponse;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/DaftarTransfer$$Parcelable$MediaBrowserCompat$SearchResultReceiver.class */
public final class DaftarTransfer$$Parcelable$MediaBrowserCompat$SearchResultReceiver extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp>, Object> {
    final /* synthetic */ HttpTransaction a;
    final /* synthetic */ Uri b;
    final /* synthetic */ DaftarTransfer$$Parcelable d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DaftarTransfer$$Parcelable$MediaBrowserCompat$SearchResultReceiver(DaftarTransfer$$Parcelable daftarTransfer$$Parcelable, Uri uri, HttpTransaction httpTransaction, ProsesTarikanFragment<? super DaftarTransfer$$Parcelable$MediaBrowserCompat$SearchResultReceiver> prosesTarikanFragment) {
        super(2, prosesTarikanFragment);
        this.d = daftarTransfer$$Parcelable;
        this.b = uri;
        this.a = httpTransaction;
    }

    public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
        return new DaftarTransfer$$Parcelable$MediaBrowserCompat$SearchResultReceiver(this.d, this.b, this.a, prosesTarikanFragment);
    }

    @Override // o.onClickInfo
    public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment) {
        return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
    }

    public final Object invokeSuspend(Object obj) {
        ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (obj instanceof Page6KLFragment.IconCompatParcelizer) {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
        } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
            DaftarTransfer$$Parcelable daftarTransfer$$Parcelable = this.d;
            TxnTellerResponse.ValueTxnDataDetail c = DaftarTransfer$$Parcelable.c(daftarTransfer$$Parcelable);
            Uri uri = this.b;
            subscribeReservationRescheduleEvent.d(uri, "");
            HttpTransaction httpTransaction = this.a;
            this.e = 1;
            Object obj2 = GetAreaPresenter.a(ReservasiListChosenPresenter.a(), new DaftarTransfer$$Parcelable$MediaBrowserCompat$MediaItem(daftarTransfer$$Parcelable, uri, c, httpTransaction, null), (ProsesTarikanFragment) this);
            obj = obj2;
            if (obj2 == reviewSetoranFragment_ViewBinding) {
                return reviewSetoranFragment_ViewBinding;
            }
        } else {
            throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
        }
        Toast.makeText(this.d.getContext(), ((Boolean) obj).booleanValue() ? setCurrencyName$MediaBrowserCompat$ItemReceiver.q : setCurrencyName$MediaBrowserCompat$ItemReceiver.f212o, 0).show();
        return onCLickStatusNpwp.e;
    }
}
