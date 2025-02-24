package o;

import android.os.Parcel;
import com.bca.smartbranch.data.localdb.KirimanUang;
import o.ListUtil;
/* loaded from: classes-dex2jar.jar:o/isiFormOnline.class */
public final class isiFormOnline extends DetailTujuanBNAdapter$DetailTujuanBNVH<KirimanUang> {
    public final /* synthetic */ void a(Object obj, Parcel parcel) {
        parcel.writeParcelable(ListUtil.OneItemImmutableList.e((KirimanUang) obj), 0);
    }

    public final /* synthetic */ Object e(Parcel parcel) {
        return (KirimanUang) ListUtil.OneItemImmutableList.a(parcel.readParcelable(KirimanUang.class.getClassLoader()));
    }
}
