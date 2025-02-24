package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bca.smartbranch.data.global.TransaksiTundaSubDetail;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import o.getPromotion;
import o.setOnStartEnterTransitionListener;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiTundaSubDetailAdapter.class */
public final class TransaksiTundaSubDetailAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    private List<TransaksiTundaSubDetail> b;
    private final Context e;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH.class */
    class TransaksiTundaSubDetailAdapterVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297410)
        ImageView ivQuickAction;
        @BindView(2131297411)
        ImageView ivRedLine;
        @BindView(2131298313)
        RelativeLayout rlMain;
        @BindView(2131298340)
        setOnStartEnterTransitionListener rvTxnSubDetail;
        @BindView(2131298828)
        TextView tvAmmount;
        @BindView(2131299672)
        TextView tvTitleTransaksi;
        @BindView(2131299734)
        TextView tvValueTransaksi;

        public TransaksiTundaSubDetailAdapterVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/TransaksiTundaSubDetailAdapter$TransaksiTundaSubDetailAdapterVH_ViewBinding.class */
    public class TransaksiTundaSubDetailAdapterVH_ViewBinding implements Unbinder {
        private TransaksiTundaSubDetailAdapterVH b;

        public TransaksiTundaSubDetailAdapterVH_ViewBinding(TransaksiTundaSubDetailAdapterVH transaksiTundaSubDetailAdapterVH, View view) {
            this.b = transaksiTundaSubDetailAdapterVH;
            transaksiTundaSubDetailAdapterVH.tvTitleTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299672, "field 'tvTitleTransaksi'", TextView.class);
            transaksiTundaSubDetailAdapterVH.tvValueTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299734, "field 'tvValueTransaksi'", TextView.class);
            transaksiTundaSubDetailAdapterVH.tvAmmount = (TextView) Utils.findRequiredViewAsType(view, 2131298828, "field 'tvAmmount'", TextView.class);
            transaksiTundaSubDetailAdapterVH.ivRedLine = (ImageView) Utils.findRequiredViewAsType(view, 2131297411, "field 'ivRedLine'", ImageView.class);
            transaksiTundaSubDetailAdapterVH.rlMain = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131298313, "field 'rlMain'", RelativeLayout.class);
            transaksiTundaSubDetailAdapterVH.ivQuickAction = (ImageView) Utils.findRequiredViewAsType(view, 2131297410, "field 'ivQuickAction'", ImageView.class);
            transaksiTundaSubDetailAdapterVH.rvTxnSubDetail = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298340, "field 'rvTxnSubDetail'", setOnStartEnterTransitionListener.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            TransaksiTundaSubDetailAdapterVH transaksiTundaSubDetailAdapterVH = this.b;
            if (transaksiTundaSubDetailAdapterVH != null) {
                this.b = null;
                transaksiTundaSubDetailAdapterVH.tvTitleTransaksi = null;
                transaksiTundaSubDetailAdapterVH.tvValueTransaksi = null;
                transaksiTundaSubDetailAdapterVH.tvAmmount = null;
                transaksiTundaSubDetailAdapterVH.ivRedLine = null;
                transaksiTundaSubDetailAdapterVH.rlMain = null;
                transaksiTundaSubDetailAdapterVH.ivQuickAction = null;
                transaksiTundaSubDetailAdapterVH.rvTxnSubDetail = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public TransaksiTundaSubDetailAdapter(Context context, List<TransaksiTundaSubDetail> list) {
        this.e = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        return new TransaksiTundaSubDetailAdapterVH(LayoutInflater.from(this.e).inflate(2131493330, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i) {
        TransaksiTundaSubDetailAdapterVH transaksiTundaSubDetailAdapterVH = (TransaksiTundaSubDetailAdapterVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
        transaksiTundaSubDetailAdapterVH.ivRedLine.setVisibility(8);
        transaksiTundaSubDetailAdapterVH.rvTxnSubDetail.setVisibility(8);
        transaksiTundaSubDetailAdapterVH.ivQuickAction.setVisibility(4);
        TextView textView = transaksiTundaSubDetailAdapterVH.tvTitleTransaksi;
        StringBuilder sb = new StringBuilder("Penerima ");
        sb.append(i + 1);
        textView.setText(sb.toString());
        BigDecimal add = new BigDecimal(this.b.get(i).getAmount()).add(new BigDecimal(this.b.get(i).getFee()));
        transaksiTundaSubDetailAdapterVH.tvValueTransaksi.setText(this.b.get(i).getReceiverName());
        TextView textView2 = transaksiTundaSubDetailAdapterVH.tvAmmount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getPromotion.j(add.setScale(2, RoundingMode.CEILING).toString().replace(".", ",")));
        sb2.append(" ");
        sb2.append(this.b.get(i).getCurrency());
        textView2.setText(sb2.toString());
    }
}
