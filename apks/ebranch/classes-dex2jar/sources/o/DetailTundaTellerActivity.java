package o;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/DetailTundaTellerActivity.class */
public final class DetailTundaTellerActivity extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<read> {
    private final List<DetailTransactionResponse.ValueTxnSubDataDetail> b;
    private final Context e;
    private final String j;

    /* loaded from: classes-dex2jar.jar:o/DetailTundaTellerActivity$read.class */
    public final class read extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        final /* synthetic */ DetailTundaTellerActivity q;
        final ListMultipleReservasiAdapter$ListMultipleReservasiVH t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(DetailTundaTellerActivity detailTundaTellerActivity, ListMultipleReservasiAdapter$ListMultipleReservasiVH listMultipleReservasiAdapter$ListMultipleReservasiVH) {
            super(listMultipleReservasiAdapter$ListMultipleReservasiVH.e);
            subscribeReservationRescheduleEvent.e(listMultipleReservasiAdapter$ListMultipleReservasiVH, "");
            this.q = detailTundaTellerActivity;
            this.t = listMultipleReservasiAdapter$ListMultipleReservasiVH;
        }

        public static int a(int i, Resources resources) {
            subscribeReservationRescheduleEvent.e(resources, "");
            float applyDimension = TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
            if (!Float.isNaN(applyDimension)) {
                return Math.round(applyDimension);
            }
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
    }

    public DetailTundaTellerActivity(String str, Context context, List<DetailTransactionResponse.ValueTxnSubDataDetail> list) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(context, "");
        subscribeReservationRescheduleEvent.e(list, "");
        this.j = str;
        this.e = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ read a(ViewGroup viewGroup, int i) {
        subscribeReservationRescheduleEvent.e(viewGroup, "");
        ListMultipleReservasiAdapter$ListMultipleReservasiVH e = ListMultipleReservasiAdapter$ListMultipleReservasiVH.e(LayoutInflater.from(this.e).inflate(2131493317, viewGroup, false));
        subscribeReservationRescheduleEvent.d(e, "");
        return new read(this, e);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(read read2, int i) {
        read read3 = read2;
        subscribeReservationRescheduleEvent.e(read3, "");
        DetailTransactionResponse.ValueTxnSubDataDetail valueTxnSubDataDetail = this.b.get(i);
        int size = this.b.size();
        subscribeReservationRescheduleEvent.e(valueTxnSubDataDetail, "");
        TextView textView = read3.t.g;
        StringBuilder sb = new StringBuilder();
        sb.append(read3.q.j);
        sb.append(' ');
        sb.append(read3.e() + 1);
        textView.setText(sb.toString());
        read3.t.c.setText(valueTxnSubDataDetail.getAccountNumber());
        read3.t.h.setText(valueTxnSubDataDetail.getReceiverName());
        read3.t.f.setText(valueTxnSubDataDetail.getBankName());
        TextView textView2 = read3.t.a;
        String totalPayment = valueTxnSubDataDetail.getTotalPayment();
        textView2.setText(totalPayment != null ? totalPayment : valueTxnSubDataDetail.getAmount());
        if (size > 1 || CheckOTPSessionPresenter.d("Warkat", read3.q.j, true)) {
            read3.t.g.setVisibility(0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            Resources resources = read3.q.e.getResources();
            subscribeReservationRescheduleEvent.d(resources, "");
            int a = read.a(16, resources);
            Resources resources2 = read3.q.e.getResources();
            subscribeReservationRescheduleEvent.d(resources2, "");
            layoutParams.setMargins(a, read.a(8, resources2), 0, 0);
            read3.t.e.setLayoutParams(layoutParams);
        } else {
            read3.t.g.setVisibility(8);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            Resources resources3 = read3.q.e.getResources();
            subscribeReservationRescheduleEvent.d(resources3, "");
            layoutParams2.setMargins(0, read.a(8, resources3), 0, 0);
            read3.t.e.setLayoutParams(layoutParams2);
        }
        if (read3.e() == read3.q.b.size() - 1) {
            read3.t.d.setVisibility(8);
        }
    }
}
