package o;

import android.os.Parcel;
import com.bca.smartbranch.data.localdb.Warkat;
import o.ListUtil;
/* loaded from: classes-dex2jar.jar:o/DeskripsiPekerjaanAdapter$DeskripsiPekerjaanVH_ViewBinding.class */
public final class DeskripsiPekerjaanAdapter$DeskripsiPekerjaanVH_ViewBinding extends DetailTujuanBNAdapter$DetailTujuanBNVH<Warkat> {
    public final /* synthetic */ void a(Object obj, Parcel parcel) {
        parcel.writeParcelable(ListUtil.OneItemImmutableList.e((Warkat) obj), 0);
    }

    public final /* synthetic */ Object e(Parcel parcel) {
        return (Warkat) ListUtil.OneItemImmutableList.a(parcel.readParcelable(Warkat.class.getClassLoader()));
    }
}
