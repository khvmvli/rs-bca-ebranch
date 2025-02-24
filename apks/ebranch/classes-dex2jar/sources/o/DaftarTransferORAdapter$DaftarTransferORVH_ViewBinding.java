package o;

import android.os.Parcel;
import com.bca.smartbranch.data.localdb.Account;
import o.ListUtil;
/* loaded from: classes-dex2jar.jar:o/DaftarTransferORAdapter$DaftarTransferORVH_ViewBinding.class */
public final class DaftarTransferORAdapter$DaftarTransferORVH_ViewBinding extends DetailTujuanBNAdapter$DetailTujuanBNVH<Account> {
    public final /* synthetic */ void a(Object obj, Parcel parcel) {
        parcel.writeParcelable(ListUtil.OneItemImmutableList.e((Account) obj), 0);
    }

    public final /* synthetic */ Object e(Parcel parcel) {
        return (Account) ListUtil.OneItemImmutableList.a(parcel.readParcelable(Account.class.getClassLoader()));
    }
}
