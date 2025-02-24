package o;

import androidx.lifecycle.LiveData;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getCategorySttDesc.class */
public interface getCategorySttDesc {
    LiveData<List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable>> b();

    LiveData<HttpTransaction> b(long j);

    LiveData<List<GetTxnTellerDetailResponse$TxnDetail$$Parcelable>> b(String str, String str2);

    Object b(ProsesTarikanFragment<? super onCLickStatusNpwp> prosesTarikanFragment);

    Object e(ProsesTarikanFragment<? super List<HttpTransaction>> prosesTarikanFragment);
}
