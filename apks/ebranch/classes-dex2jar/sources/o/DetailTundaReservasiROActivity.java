package o;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import java.util.List;
import java.util.Locale;
/* loaded from: classes-dex2jar.jar:o/DetailTundaReservasiROActivity.class */
public final class DetailTundaReservasiROActivity extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<IconCompatParcelizer> {
    private final Context b;
    private final List<TxnTellerResponse.ValueTxnSubDataDetail> e;
    private final String g;

    /* loaded from: classes-dex2jar.jar:o/DetailTundaReservasiROActivity$IconCompatParcelizer.class */
    public final class IconCompatParcelizer extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        final /* synthetic */ DetailTundaReservasiROActivity q;
        final ListMultipleReservasiAdapter$ListMultipleReservasiVH t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(DetailTundaReservasiROActivity detailTundaReservasiROActivity, ListMultipleReservasiAdapter$ListMultipleReservasiVH listMultipleReservasiAdapter$ListMultipleReservasiVH) {
            super(listMultipleReservasiAdapter$ListMultipleReservasiVH.e);
            subscribeReservationRescheduleEvent.e(listMultipleReservasiAdapter$ListMultipleReservasiVH, "");
            this.q = detailTundaReservasiROActivity;
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

    public DetailTundaReservasiROActivity(Context context, String str, List<TxnTellerResponse.ValueTxnSubDataDetail> list) {
        subscribeReservationRescheduleEvent.e(context, "");
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(list, "");
        this.b = context;
        this.g = str;
        this.e = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ IconCompatParcelizer a(ViewGroup viewGroup, int i) {
        subscribeReservationRescheduleEvent.e(viewGroup, "");
        ListMultipleReservasiAdapter$ListMultipleReservasiVH e = ListMultipleReservasiAdapter$ListMultipleReservasiVH.e(LayoutInflater.from(this.b).inflate(2131493317, viewGroup, false));
        subscribeReservationRescheduleEvent.d(e, "");
        return new IconCompatParcelizer(this, e);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(IconCompatParcelizer iconCompatParcelizer, int i) {
        IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
        subscribeReservationRescheduleEvent.e(iconCompatParcelizer2, "");
        TxnTellerResponse.ValueTxnSubDataDetail valueTxnSubDataDetail = this.e.get(i);
        int size = this.e.size();
        subscribeReservationRescheduleEvent.e(valueTxnSubDataDetail, "");
        iconCompatParcelizer2.t.c.setText(valueTxnSubDataDetail.getAccountNumber());
        iconCompatParcelizer2.t.h.setText(valueTxnSubDataDetail.getReceiverName());
        iconCompatParcelizer2.t.f.setText(valueTxnSubDataDetail.getBankName());
        iconCompatParcelizer2.t.a.setText(valueTxnSubDataDetail.getTotalPayment());
        String str = iconCompatParcelizer2.q.g;
        Locale locale = Locale.getDefault();
        subscribeReservationRescheduleEvent.d(locale, "");
        String lowerCase = str.toLowerCase(locale);
        subscribeReservationRescheduleEvent.d(lowerCase, "");
        if (subscribeReservationRescheduleEvent.b((Object) lowerCase, (Object) "kliring")) {
            TextView textView = iconCompatParcelizer2.t.g;
            StringBuilder sb = new StringBuilder("Warkat ");
            sb.append(iconCompatParcelizer2.e() + 1);
            textView.setText(sb.toString());
            iconCompatParcelizer2.t.a.setText(valueTxnSubDataDetail.getAmount());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            Resources resources = iconCompatParcelizer2.q.b.getResources();
            subscribeReservationRescheduleEvent.d(resources, "");
            int a = IconCompatParcelizer.a(16, resources);
            Resources resources2 = iconCompatParcelizer2.q.b.getResources();
            subscribeReservationRescheduleEvent.d(resources2, "");
            layoutParams.setMargins(a, IconCompatParcelizer.a(8, resources2), 0, 0);
            iconCompatParcelizer2.t.e.setLayoutParams(layoutParams);
        } else {
            TextView textView2 = iconCompatParcelizer2.t.g;
            StringBuilder sb2 = new StringBuilder("Penerima ");
            sb2.append(iconCompatParcelizer2.e() + 1);
            textView2.setText(sb2.toString());
            if (size > 1) {
                iconCompatParcelizer2.t.g.setVisibility(0);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                Resources resources3 = iconCompatParcelizer2.q.b.getResources();
                subscribeReservationRescheduleEvent.d(resources3, "");
                int a2 = IconCompatParcelizer.a(16, resources3);
                Resources resources4 = iconCompatParcelizer2.q.b.getResources();
                subscribeReservationRescheduleEvent.d(resources4, "");
                layoutParams2.setMargins(a2, IconCompatParcelizer.a(8, resources4), 0, 0);
                iconCompatParcelizer2.t.e.setLayoutParams(layoutParams2);
            } else {
                iconCompatParcelizer2.t.g.setVisibility(8);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
                Resources resources5 = iconCompatParcelizer2.q.b.getResources();
                subscribeReservationRescheduleEvent.d(resources5, "");
                layoutParams3.setMargins(0, IconCompatParcelizer.a(8, resources5), 0, 0);
                iconCompatParcelizer2.t.e.setLayoutParams(layoutParams3);
            }
        }
        if (iconCompatParcelizer2.e() == iconCompatParcelizer2.q.e.size() - 1) {
            iconCompatParcelizer2.t.d.setVisibility(8);
        }
    }
}
