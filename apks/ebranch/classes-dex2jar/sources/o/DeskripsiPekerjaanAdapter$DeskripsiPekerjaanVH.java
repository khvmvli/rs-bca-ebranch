package o;

import android.os.Parcel;
import com.bca.smartbranch.data.localdb.CreditCard;
import o.ListUtil;
/* loaded from: classes-dex2jar.jar:o/DeskripsiPekerjaanAdapter$DeskripsiPekerjaanVH.class */
public final class DeskripsiPekerjaanAdapter$DeskripsiPekerjaanVH extends DetailTujuanBNAdapter$DetailTujuanBNVH<CreditCard> {
    public final /* synthetic */ void a(Object obj, Parcel parcel) {
        parcel.writeParcelable(ListUtil.OneItemImmutableList.e((CreditCard) obj), 0);
    }

    public final /* synthetic */ Object e(Parcel parcel) {
        return (CreditCard) ListUtil.OneItemImmutableList.a(parcel.readParcelable(CreditCard.class.getClassLoader()));
    }
}
