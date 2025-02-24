package o;

import android.os.Parcel;
import com.bca.smartbranch.data.localdb.Tarikan;
import o.ListUtil;
/* loaded from: classes-dex2jar.jar:o/HariAdapter$HariVH_ViewBinding.class */
public final class HariAdapter$HariVH_ViewBinding extends DetailTujuanBNAdapter$DetailTujuanBNVH<Tarikan> {
    public final /* synthetic */ void a(Object obj, Parcel parcel) {
        parcel.writeParcelable(ListUtil.OneItemImmutableList.e((Tarikan) obj), 0);
    }

    public final /* synthetic */ Object e(Parcel parcel) {
        return (Tarikan) ListUtil.OneItemImmutableList.a(parcel.readParcelable(Tarikan.class.getClassLoader()));
    }
}
