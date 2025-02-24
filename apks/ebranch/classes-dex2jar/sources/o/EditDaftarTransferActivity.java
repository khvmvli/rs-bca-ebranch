package o;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/EditDaftarTransferActivity.class */
public final class EditDaftarTransferActivity extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<read> {
    private final List<BankTransferPenerima> b;
    private final Context e;

    /* loaded from: classes-dex2jar.jar:o/EditDaftarTransferActivity$read.class */
    public final class read extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        final /* synthetic */ EditDaftarTransferActivity q;
        final ListMultipleReservasiAdapter$ListMultipleReservasiVH t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(EditDaftarTransferActivity editDaftarTransferActivity, ListMultipleReservasiAdapter$ListMultipleReservasiVH listMultipleReservasiAdapter$ListMultipleReservasiVH) {
            super(listMultipleReservasiAdapter$ListMultipleReservasiVH.e);
            subscribeReservationRescheduleEvent.e(listMultipleReservasiAdapter$ListMultipleReservasiVH, "");
            this.q = editDaftarTransferActivity;
            this.t = listMultipleReservasiAdapter$ListMultipleReservasiVH;
        }

        public static int c(int i, Resources resources) {
            subscribeReservationRescheduleEvent.e(resources, "");
            float applyDimension = TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
            if (!Float.isNaN(applyDimension)) {
                return Math.round(applyDimension);
            }
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
    }

    public EditDaftarTransferActivity(Context context, List<BankTransferPenerima> list) {
        subscribeReservationRescheduleEvent.e(context, "");
        subscribeReservationRescheduleEvent.e(list, "");
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
        BankTransferPenerima bankTransferPenerima = this.b.get(i);
        int size = this.b.size();
        subscribeReservationRescheduleEvent.e(bankTransferPenerima, "");
        TextView textView = read3.t.g;
        StringBuilder sb = new StringBuilder("Penerima ");
        sb.append(read3.e() + 1);
        textView.setText(sb.toString());
        read3.t.c.setText(bankTransferPenerima.getNorekPenerima());
        read3.t.h.setText(bankTransferPenerima.getNamaPenerima());
        read3.t.f.setText(bankTransferPenerima.getBankTujuanPenerima());
        BigDecimal add = new BigDecimal(bankTransferPenerima.getNominalPenerima()).add(new BigDecimal(bankTransferPenerima.getBiayaTransfer()));
        subscribeReservationRescheduleEvent.d(add, "");
        TextView textView2 = read3.t.a;
        StringBuilder sb2 = new StringBuilder();
        String obj = add.setScale(2, RoundingMode.CEILING).toString();
        subscribeReservationRescheduleEvent.d(obj, "");
        sb2.append(getPromotion.j(CheckOTPSessionPresenter.a(obj, ".", ",", false)));
        sb2.append(" IDR");
        textView2.setText(sb2.toString());
        if (size > 1) {
            read3.t.g.setVisibility(0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            Resources resources = read3.q.e.getResources();
            subscribeReservationRescheduleEvent.d(resources, "");
            int c = read.c(16, resources);
            Resources resources2 = read3.q.e.getResources();
            subscribeReservationRescheduleEvent.d(resources2, "");
            layoutParams.setMargins(c, read.c(8, resources2), 0, 0);
            read3.t.e.setLayoutParams(layoutParams);
        } else {
            read3.t.g.setVisibility(8);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            Resources resources3 = read3.q.e.getResources();
            subscribeReservationRescheduleEvent.d(resources3, "");
            layoutParams2.setMargins(0, read.c(8, resources3), 0, 0);
            read3.t.e.setLayoutParams(layoutParams2);
        }
        if (read3.e() == read3.q.b.size() - 1) {
            read3.t.d.setVisibility(8);
        } else {
            read3.t.d.setVisibility(0);
        }
    }
}
