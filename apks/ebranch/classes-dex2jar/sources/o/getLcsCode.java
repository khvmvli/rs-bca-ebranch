package o;

import android.content.Context;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getLcsCode.class */
public final class getLcsCode implements TujuanTransaksiORResponse$$Parcelable {
    private final List<TujuanTransaksiORResponse> b;

    public getLcsCode(List<HttpTransaction> list, boolean z) {
        subscribeReservationRescheduleEvent.e(list, "");
        List<HttpTransaction> list2 = list;
        subscribeReservationRescheduleEvent.e(list2, "");
        ArrayList arrayList = new ArrayList(list2 instanceof Collection ? list2.size() : 10);
        for (HttpTransaction httpTransaction : list2) {
            arrayList.add(new TujuanTransaksiORResponse(httpTransaction, false));
        }
        this.b = arrayList;
    }

    @Override // o.TujuanTransaksiORResponse$$Parcelable
    public final defaultInspectorModulesProvider b(Context context) {
        subscribeReservationRescheduleEvent.e(context, "");
        setResponseContentType setresponsecontenttype = new setResponseContentType();
        List<TujuanTransaksiORResponse> list = this.b;
        StringBuilder sb = new StringBuilder("\n");
        sb.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.n));
        sb.append('\n');
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.m));
        sb2.append('\n');
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder("\n");
        sb3.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.k));
        sb3.append('\n');
        setresponsecontenttype.d(onClickUbahDataAlamatIdentitas.c(list, obj, obj2, sb3.toString(), 0, null, new T1TransaksiTarikanUbahFragment_ViewBinding<TujuanTransaksiORResponse, CharSequence>(context) { // from class: o.getLcsCode$MediaBrowserCompat$CustomActionResultReceiver
            final /* synthetic */ Context c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = r4;
            }

            @Override // o.T1TransaksiTarikanUbahFragment_ViewBinding
            public final /* synthetic */ CharSequence a(TujuanTransaksiORResponse tujuanTransaksiORResponse) {
                TujuanTransaksiORResponse tujuanTransaksiORResponse2 = tujuanTransaksiORResponse;
                subscribeReservationRescheduleEvent.e(tujuanTransaksiORResponse2, "");
                String e = getSttCode.e(tujuanTransaksiORResponse2, this.c);
                subscribeReservationRescheduleEvent.d(e, "");
                return e;
            }
        }, 24));
        return setresponsecontenttype;
    }
}
