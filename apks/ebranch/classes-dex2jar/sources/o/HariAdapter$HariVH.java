package o;

import android.os.Parcel;
import com.bca.smartbranch.data.localdb.Setoran;
import o.ListUtil;
/* loaded from: classes-dex2jar.jar:o/HariAdapter$HariVH.class */
public final class HariAdapter$HariVH extends DetailTujuanBNAdapter$DetailTujuanBNVH<Setoran> {
    public final /* synthetic */ void a(Object obj, Parcel parcel) {
        parcel.writeParcelable(ListUtil.OneItemImmutableList.e((Setoran) obj), 0);
    }

    public final /* synthetic */ Object e(Parcel parcel) {
        return (Setoran) ListUtil.OneItemImmutableList.a(parcel.readParcelable(Setoran.class.getClassLoader()));
    }
}
