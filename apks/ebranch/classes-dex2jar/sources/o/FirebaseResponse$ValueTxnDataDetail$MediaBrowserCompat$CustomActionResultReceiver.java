package o;

import java.io.File;
import o.FirebaseResponse;
/* loaded from: classes-dex2jar.jar:o/FirebaseResponse$ValueTxnDataDetail$MediaBrowserCompat$CustomActionResultReceiver.class */
public class FirebaseResponse$ValueTxnDataDetail$MediaBrowserCompat$CustomActionResultReceiver<Data> implements GetAcctOpeningCategoryDataResponse<File, Data> {
    private final FirebaseResponse.ValueTxnDataDetail.IconCompatParcelizer<Data> a;

    public FirebaseResponse$ValueTxnDataDetail$MediaBrowserCompat$CustomActionResultReceiver(FirebaseResponse.ValueTxnDataDetail.IconCompatParcelizer<Data> iconCompatParcelizer) {
        this.a = iconCompatParcelizer;
    }

    @Override // o.GetAcctOpeningCategoryDataResponse
    public final getAmountKliring<File, Data> e(getListCategory getlistcategory) {
        return new FirebaseResponse.ValueTxnDataDetail(this.a);
    }
}
