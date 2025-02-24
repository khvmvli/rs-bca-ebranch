package o;

import android.os.Parcel;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
import o.ListUtil;
/* loaded from: classes-dex2jar.jar:o/DataReservasiAdapter$DataReservasiVH_ViewBinding.class */
public final class DataReservasiAdapter$DataReservasiVH_ViewBinding extends DetailTujuanBNAdapter$DetailTujuanBNVH<BankTransferPenerima> {
    public final /* synthetic */ void a(Object obj, Parcel parcel) {
        parcel.writeParcelable(ListUtil.OneItemImmutableList.e((BankTransferPenerima) obj), 0);
    }

    public final /* synthetic */ Object e(Parcel parcel) {
        return (BankTransferPenerima) ListUtil.OneItemImmutableList.a(parcel.readParcelable(BankTransferPenerima.class.getClassLoader()));
    }
}
