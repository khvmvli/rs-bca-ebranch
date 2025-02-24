package o;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import o.Page6KLFragment;
import o.TxnTellerResponse;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/DaftarTransfer$$Parcelable$MediaBrowserCompat$MediaItem.class */
public final class DaftarTransfer$$Parcelable$MediaBrowserCompat$MediaItem extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super Boolean>, Object> {
    final /* synthetic */ HttpTransaction a;
    final /* synthetic */ Uri b;
    final /* synthetic */ TxnTellerResponse.ValueTxnDataDetail c;
    int d;
    final /* synthetic */ DaftarTransfer$$Parcelable e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DaftarTransfer$$Parcelable$MediaBrowserCompat$MediaItem(DaftarTransfer$$Parcelable daftarTransfer$$Parcelable, Uri uri, TxnTellerResponse.ValueTxnDataDetail valueTxnDataDetail, HttpTransaction httpTransaction, ProsesTarikanFragment<? super DaftarTransfer$$Parcelable$MediaBrowserCompat$MediaItem> prosesTarikanFragment) {
        super(2, prosesTarikanFragment);
        this.e = daftarTransfer$$Parcelable;
        this.b = uri;
        this.c = valueTxnDataDetail;
        this.a = httpTransaction;
    }

    public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
        return new DaftarTransfer$$Parcelable$MediaBrowserCompat$MediaItem(this.e, this.b, this.c, this.a, prosesTarikanFragment);
    }

    @Override // o.onClickInfo
    public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super Boolean> prosesTarikanFragment) {
        return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
    }

    public final Object invokeSuspend(Object obj) {
        ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
        if (this.d != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
            try {
                ParcelFileDescriptor openFileDescriptor = this.e.requireContext().getContentResolver().openFileDescriptor(this.b, "w");
                if (openFileDescriptor != null) {
                    ParcelFileDescriptor parcelFileDescriptor = openFileDescriptor;
                    TxnTellerResponse.ValueTxnDataDetail valueTxnDataDetail = this.c;
                    HttpTransaction httpTransaction = this.a;
                    FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                    FileOutputStream fileOutputStream2 = fileOutputStream;
                    int i = DaftarTransfer$$Parcelable$MediaBrowserCompat$MediaItem$MediaBrowserCompat$CustomActionResultReceiver.b[valueTxnDataDetail.ordinal()];
                    if (i == 1) {
                        String requestBody = httpTransaction.getRequestBody();
                        if (requestBody != null) {
                            byte[] bytes = requestBody.getBytes(CheckUserPresenter.i);
                            subscribeReservationRescheduleEvent.d(bytes, "");
                            onClickInfoBiaya.e(new ByteArrayInputStream(bytes), fileOutputStream2, 0, 2);
                        } else {
                            throw new IOException("Transaction not ready");
                        }
                    } else if (i == 2) {
                        String responseBody = httpTransaction.getResponseBody();
                        if (responseBody != null) {
                            byte[] bytes2 = responseBody.getBytes(CheckUserPresenter.i);
                            subscribeReservationRescheduleEvent.d(bytes2, "");
                            onClickInfoBiaya.e(new ByteArrayInputStream(bytes2), fileOutputStream2, 0, 2);
                        } else {
                            throw new IOException("Transaction not ready");
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    T1TransaksiTarikanFragment_ViewBinding.a(fileOutputStream, (Throwable) null);
                    T1TransaksiTarikanFragment_ViewBinding.a(parcelFileDescriptor, (Throwable) null);
                }
                return true;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        } else {
            throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
        }
    }
}
