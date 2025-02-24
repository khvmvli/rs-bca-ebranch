package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import java.util.ArrayList;
import java.util.List;
import o.DetailTundaReservasiROActivity;
import o.getPromotion;
import o.setOnStartEnterTransitionListener;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailOpenTransaksiAdapter.class */
public final class ListDetailOpenTransaksiAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    public static final Integer b = 0;
    public static final Integer e = 1;
    Context f;
    private boolean g = false;
    private List<TxnTellerResponse.ValueTxnDataDetail> i;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.class */
    class ListDetailMultiTransaksiVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298334)
        setOnStartEnterTransitionListener rvPenerima;
        @BindView(2131298372)
        View separator;
        @BindView(2131299689)
        TextView tvTransaksi;
        @BindView(2131299697)
        TextView tvUbah;

        public ListDetailMultiTransaksiVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding.class */
    public class ListDetailMultiTransaksiVH_ViewBinding implements Unbinder {
        private ListDetailMultiTransaksiVH e;

        public ListDetailMultiTransaksiVH_ViewBinding(ListDetailMultiTransaksiVH listDetailMultiTransaksiVH, View view) {
            this.e = listDetailMultiTransaksiVH;
            listDetailMultiTransaksiVH.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
            listDetailMultiTransaksiVH.tvUbah = (TextView) Utils.findRequiredViewAsType(view, 2131299697, "field 'tvUbah'", TextView.class);
            listDetailMultiTransaksiVH.rvPenerima = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298334, "field 'rvPenerima'", setOnStartEnterTransitionListener.class);
            listDetailMultiTransaksiVH.separator = Utils.findRequiredView(view, 2131298372, "field 'separator'");
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListDetailMultiTransaksiVH listDetailMultiTransaksiVH = this.e;
            if (listDetailMultiTransaksiVH != null) {
                this.e = null;
                listDetailMultiTransaksiVH.tvTransaksi = null;
                listDetailMultiTransaksiVH.tvUbah = null;
                listDetailMultiTransaksiVH.rvPenerima = null;
                listDetailMultiTransaksiVH.separator = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH.class */
    class ListDetailTransaksiVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131297434)
        RelativeLayout layoutContent;
        @BindView(2131298372)
        View separator;
        @BindView(2131299518)
        TextView tvBankName;
        @BindView(2131299468)
        TextView tvNorek;
        @BindView(2131299677)
        TextView tvTotal;
        @BindView(2131299689)
        TextView tvTransaksi;
        @BindView(2131299692)
        TextView tvTransaksiTitle;
        @BindView(2131299697)
        TextView tvUbah;
        @BindView(2131299732)
        TextView tvValue;

        public ListDetailTransaksiVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
            this.tvUbah.setVisibility(4);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailOpenTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.class */
    public class ListDetailTransaksiVH_ViewBinding implements Unbinder {
        private ListDetailTransaksiVH d;

        public ListDetailTransaksiVH_ViewBinding(ListDetailTransaksiVH listDetailTransaksiVH, View view) {
            this.d = listDetailTransaksiVH;
            listDetailTransaksiVH.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
            listDetailTransaksiVH.layoutContent = (RelativeLayout) Utils.findRequiredViewAsType(view, 2131297434, "field 'layoutContent'", RelativeLayout.class);
            listDetailTransaksiVH.tvTransaksiTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299692, "field 'tvTransaksiTitle'", TextView.class);
            listDetailTransaksiVH.tvTotal = (TextView) Utils.findRequiredViewAsType(view, 2131299677, "field 'tvTotal'", TextView.class);
            listDetailTransaksiVH.tvValue = (TextView) Utils.findRequiredViewAsType(view, 2131299732, "field 'tvValue'", TextView.class);
            listDetailTransaksiVH.tvBankName = (TextView) Utils.findRequiredViewAsType(view, 2131299518, "field 'tvBankName'", TextView.class);
            listDetailTransaksiVH.tvNorek = (TextView) Utils.findRequiredViewAsType(view, 2131299468, "field 'tvNorek'", TextView.class);
            listDetailTransaksiVH.separator = Utils.findRequiredView(view, 2131298372, "field 'separator'");
            listDetailTransaksiVH.tvUbah = (TextView) Utils.findRequiredViewAsType(view, 2131299697, "field 'tvUbah'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListDetailTransaksiVH listDetailTransaksiVH = this.d;
            if (listDetailTransaksiVH != null) {
                this.d = null;
                listDetailTransaksiVH.tvTransaksi = null;
                listDetailTransaksiVH.layoutContent = null;
                listDetailTransaksiVH.tvTransaksiTitle = null;
                listDetailTransaksiVH.tvTotal = null;
                listDetailTransaksiVH.tvValue = null;
                listDetailTransaksiVH.tvBankName = null;
                listDetailTransaksiVH.tvNorek = null;
                listDetailTransaksiVH.separator = null;
                listDetailTransaksiVH.tvUbah = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListDetailOpenTransaksiAdapter(Context context, List<TxnTellerResponse.ValueTxnDataDetail> list, boolean z) {
        new ArrayList();
        this.f = context;
        this.i = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        return i == e.intValue() ? new ListDetailMultiTransaksiVH(LayoutInflater.from(this.f).inflate(2131493319, viewGroup, false)) : new ListDetailTransaksiVH(LayoutInflater.from(this.f).inflate(2131493318, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.i.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int d(int i) {
        return this.i.get(i).getViewType().intValue();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i) {
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable instanceof ListDetailTransaksiVH) {
            ListDetailTransaksiVH listDetailTransaksiVH = (ListDetailTransaksiVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
            if (ListDetailOpenTransaksiAdapter.this.i.size() <= 1 || i != ListDetailOpenTransaksiAdapter.this.i.size() - 1) {
                listDetailTransaksiVH.separator.setVisibility(0);
            } else {
                listDetailTransaksiVH.separator.setVisibility(8);
            }
            listDetailTransaksiVH.tvUbah.setVisibility(8);
            listDetailTransaksiVH.tvTransaksiTitle.setVisibility(8);
            listDetailTransaksiVH.tvTransaksi.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getTxnType());
            String currency = ListDetailOpenTransaksiAdapter.this.i.get(i).getCurrency() != null ? ListDetailOpenTransaksiAdapter.this.i.get(i).getCurrency() : "IDR";
            TextView textView = listDetailTransaksiVH.tvTotal;
            StringBuilder sb = new StringBuilder();
            sb.append(getPromotion.j(ListDetailOpenTransaksiAdapter.this.i.get(i).getAmount().replace(".", ",")));
            sb.append(" ");
            sb.append(currency);
            textView.setText(sb.toString());
            if (ListDetailOpenTransaksiAdapter.this.i.get(i).getTxnType().equals("Transfer Valuta Asing")) {
                listDetailTransaksiVH.tvValue.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getProductTypeName());
                listDetailTransaksiVH.tvBankName.setVisibility(8);
                listDetailTransaksiVH.tvNorek.setVisibility(8);
                TextView textView2 = listDetailTransaksiVH.tvTotal;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getPromotion.j(ListDetailOpenTransaksiAdapter.this.i.get(i).getAmount().replace(".", ",")).replace(",00", ""));
                sb2.append(" ");
                sb2.append(currency);
                textView2.setText(sb2.toString());
            } else if (ListDetailOpenTransaksiAdapter.this.i.get(i).getTxnType().equals("Transfer ke Bank Lain")) {
                listDetailTransaksiVH.tvValue.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getReceiverName());
                listDetailTransaksiVH.tvTotal.setText(ListDetailOpenTransaksiAdapter.this.i.get(listDetailTransaksiVH.e()).getTotalPayment());
                listDetailTransaksiVH.tvBankName.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getBankName());
                listDetailTransaksiVH.tvNorek.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getAccountNumber());
                listDetailTransaksiVH.tvBankName.setVisibility(0);
                listDetailTransaksiVH.tvNorek.setVisibility(0);
            } else if (ListDetailOpenTransaksiAdapter.this.i.get(i).getTxnType().equals("Kliring")) {
                listDetailTransaksiVH.tvTransaksiTitle.setVisibility(0);
                listDetailTransaksiVH.tvBankName.setVisibility(0);
                listDetailTransaksiVH.tvNorek.setVisibility(0);
                listDetailTransaksiVH.tvTransaksiTitle.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getTxnType());
                listDetailTransaksiVH.tvValue.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getReceiverName());
                listDetailTransaksiVH.tvTransaksi.setText("Warkat 1");
                listDetailTransaksiVH.tvTotal.setText(ListDetailOpenTransaksiAdapter.this.i.get(listDetailTransaksiVH.e()).getAmount());
                listDetailTransaksiVH.tvBankName.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getBankName());
                listDetailTransaksiVH.tvNorek.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getAccountNumber());
            } else if (ListDetailOpenTransaksiAdapter.this.i.get(i).getTxnType().equals("Setoran Tunai")) {
                listDetailTransaksiVH.tvValue.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getReceiverName());
                TextView textView3 = listDetailTransaksiVH.tvTotal;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(getPromotion.g(ListDetailOpenTransaksiAdapter.this.i.get(i).getAmount().replace(".", ",")));
                sb3.append(" ");
                sb3.append(currency);
                textView3.setText(sb3.toString());
                listDetailTransaksiVH.tvBankName.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getBankName());
                listDetailTransaksiVH.tvNorek.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getAccountNumber());
                listDetailTransaksiVH.tvBankName.setVisibility(0);
                listDetailTransaksiVH.tvNorek.setVisibility(0);
            } else {
                listDetailTransaksiVH.tvValue.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getAccountNumber());
                listDetailTransaksiVH.tvBankName.setVisibility(8);
                listDetailTransaksiVH.tvNorek.setVisibility(8);
            }
            int e2 = listDetailTransaksiVH.e();
            int size = ListDetailOpenTransaksiAdapter.this.i.size();
            View view = listDetailTransaksiVH.separator;
            if (e2 == size - 1) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        } else if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable instanceof ListDetailMultiTransaksiVH) {
            ListDetailMultiTransaksiVH listDetailMultiTransaksiVH = (ListDetailMultiTransaksiVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
            listDetailMultiTransaksiVH.tvUbah.setVisibility(4);
            if (i == ListDetailOpenTransaksiAdapter.this.i.size() - 1) {
                listDetailMultiTransaksiVH.separator.setVisibility(8);
            }
            listDetailMultiTransaksiVH.tvTransaksi.setText(ListDetailOpenTransaksiAdapter.this.i.get(i).getTxnType());
            listDetailMultiTransaksiVH.rvPenerima.setAdapter(new DetailTundaReservasiROActivity(ListDetailOpenTransaksiAdapter.this.f, ListDetailOpenTransaksiAdapter.this.i.get(i).getTxnType(), ListDetailOpenTransaksiAdapter.this.i.get(i).getTxnSubDataDetails()));
        }
    }
}
