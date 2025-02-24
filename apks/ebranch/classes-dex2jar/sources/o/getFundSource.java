package o;

import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getFundSource.class */
public interface getFundSource {
    Object a(ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment);

    LiveData<List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable>> c();

    LiveData<HttpTransaction> d(long j);

    LiveData<List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable>> d(String str, String str2);

    Object e(ProsesTarikanFragment<? super List<HttpTransaction>> prosesTarikanFragment);
}
