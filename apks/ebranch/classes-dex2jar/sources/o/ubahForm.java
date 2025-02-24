package o;

import android.os.Parcel;
import com.bca.smartbranch.data.localdb.EChannel;
import o.ListUtil;
/* loaded from: classes-dex2jar.jar:o/ubahForm.class */
public final class ubahForm extends DetailTujuanBNAdapter$DetailTujuanBNVH<EChannel> {
    public final /* synthetic */ void a(Object obj, Parcel parcel) {
        parcel.writeParcelable(ListUtil.OneItemImmutableList.e((EChannel) obj), 0);
    }

    public final /* synthetic */ Object e(Parcel parcel) {
        return (EChannel) ListUtil.OneItemImmutableList.a(parcel.readParcelable(EChannel.class.getClassLoader()));
    }
}
