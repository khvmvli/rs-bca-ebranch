package o;

import com.bca.smartbranch.data.api.response.StockListBNResponse;
import com.bca.smartbranch.fragment.BN3PilihCabangFragment;
import java.util.Comparator;
/* loaded from: classes-dex2jar.jar:o/TransaksiBerhasilWarkatLIstPushNotifAdapter$TransaksiBerhasilWarkatListVH_ViewBinding.class */
public final /* synthetic */ class TransaksiBerhasilWarkatLIstPushNotifAdapter$TransaksiBerhasilWarkatListVH_ViewBinding implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return BN3PilihCabangFragment.d((StockListBNResponse.StockBranch) obj, (StockListBNResponse.StockBranch) obj2);
    }
}
