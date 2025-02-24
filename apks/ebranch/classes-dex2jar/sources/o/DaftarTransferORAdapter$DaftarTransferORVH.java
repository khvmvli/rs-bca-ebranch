package o;

import android.os.Parcel;
import com.bca.smartbranch.data.localdb.BankTransfer;
import o.ListUtil;
/* loaded from: classes-dex2jar.jar:o/DaftarTransferORAdapter$DaftarTransferORVH.class */
public final class DaftarTransferORAdapter$DaftarTransferORVH extends DetailTujuanBNAdapter$DetailTujuanBNVH<BankTransfer> {
    public final /* synthetic */ void a(Object obj, Parcel parcel) {
        parcel.writeParcelable(ListUtil.OneItemImmutableList.e((BankTransfer) obj), 0);
    }

    public final /* synthetic */ Object e(Parcel parcel) {
        return (BankTransfer) ListUtil.OneItemImmutableList.a(parcel.readParcelable(BankTransfer.class.getClassLoader()));
    }
}
