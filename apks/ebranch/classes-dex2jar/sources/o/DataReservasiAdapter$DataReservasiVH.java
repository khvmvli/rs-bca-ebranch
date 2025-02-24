package o;

import android.os.Parcel;
import com.bca.smartbranch.data.localdb.Kliring;
import o.ListUtil;
/* loaded from: classes-dex2jar.jar:o/DataReservasiAdapter$DataReservasiVH.class */
public final class DataReservasiAdapter$DataReservasiVH extends DetailTujuanBNAdapter$DetailTujuanBNVH<Kliring> {
    public final /* synthetic */ void a(Object obj, Parcel parcel) {
        parcel.writeParcelable(ListUtil.OneItemImmutableList.e((Kliring) obj), 0);
    }

    public final /* synthetic */ Object e(Parcel parcel) {
        return (Kliring) ListUtil.OneItemImmutableList.a(parcel.readParcelable(Kliring.class.getClassLoader()));
    }
}
