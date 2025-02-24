package com.bca.smartbranch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import java.util.ArrayList;
import java.util.List;
import o.ChooseSubMastercardAdapter$ViewHolder_ViewBinding;
import o.DetailTundaTellerActivity;
import o.documentProvider;
import o.getIncomeAmount;
import o.getPromotion;
import o.setOnStartEnterTransitionListener;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailTransaksiAdapter.class */
public final class ListDetailTransaksiAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    public static final Integer b = 0;
    public static final Integer e = 1;
    private boolean f;
    private List<DetailTransactionResponse.ValueTxnDataDetail> g;
    Context h;
    String j;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH.class */
    class ListDetailMultiTransaksiVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131298334)
        setOnStartEnterTransitionListener rvPenerima;
        @BindView(2131298372)
        View separator;
        String t;
        @BindView(2131299689)
        TextView tvTransaksi;
        @BindView(2131299697)
        TextView tvUbah;

        public ListDetailMultiTransaksiVH(View view, String str) {
            super(view);
            this.t = str;
            ButterKnife.bind(this, view);
        }

        @OnClick({2131299697})
        public void onUbah(View view) {
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailTransaksiAdapter$ListDetailMultiTransaksiVH_ViewBinding.class */
    public class ListDetailMultiTransaksiVH_ViewBinding implements Unbinder {
        private ListDetailMultiTransaksiVH b;
        private View c;

        public ListDetailMultiTransaksiVH_ViewBinding(final ListDetailMultiTransaksiVH listDetailMultiTransaksiVH, View view) {
            this.b = listDetailMultiTransaksiVH;
            listDetailMultiTransaksiVH.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131299697, "field 'tvUbah' and method 'onUbah'");
            listDetailMultiTransaksiVH.tvUbah = (TextView) Utils.castView(findRequiredView, 2131299697, "field 'tvUbah'", TextView.class);
            this.c = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListDetailTransaksiAdapter.ListDetailMultiTransaksiVH_ViewBinding.5
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listDetailMultiTransaksiVH.onUbah(view2);
                }
            });
            listDetailMultiTransaksiVH.rvPenerima = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298334, "field 'rvPenerima'", setOnStartEnterTransitionListener.class);
            listDetailMultiTransaksiVH.separator = Utils.findRequiredView(view, 2131298372, "field 'separator'");
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListDetailMultiTransaksiVH listDetailMultiTransaksiVH = this.b;
            if (listDetailMultiTransaksiVH != null) {
                this.b = null;
                listDetailMultiTransaksiVH.tvTransaksi = null;
                listDetailMultiTransaksiVH.tvUbah = null;
                listDetailMultiTransaksiVH.rvPenerima = null;
                listDetailMultiTransaksiVH.separator = null;
                this.c.setOnClickListener(null);
                this.c = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailTransaksiAdapter$ListDetailTransaksiVH.class */
    class ListDetailTransaksiVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
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
        @BindView(2131299732)
        TextView tvValue;

        public ListDetailTransaksiVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131299697})
        public void onUbah(View view) {
            documentProvider.b().d(new ChooseSubMastercardAdapter$ViewHolder_ViewBinding(((DetailTransactionResponse.ValueTxnDataDetail) ListDetailTransaksiAdapter.this.g.get(d())).getToken(), ((DetailTransactionResponse.ValueTxnDataDetail) ListDetailTransaksiAdapter.this.g.get(d())).getNoreffAnak(), ((DetailTransactionResponse.ValueTxnDataDetail) ListDetailTransaksiAdapter.this.g.get(e())).getTxnType(), Integer.valueOf(e())));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailTransaksiAdapter$ListDetailTransaksiVH_ViewBinding.class */
    public class ListDetailTransaksiVH_ViewBinding implements Unbinder {
        private View d;
        private ListDetailTransaksiVH e;

        public ListDetailTransaksiVH_ViewBinding(final ListDetailTransaksiVH listDetailTransaksiVH, View view) {
            this.e = listDetailTransaksiVH;
            listDetailTransaksiVH.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
            listDetailTransaksiVH.tvTotal = (TextView) Utils.findRequiredViewAsType(view, 2131299677, "field 'tvTotal'", TextView.class);
            listDetailTransaksiVH.tvValue = (TextView) Utils.findRequiredViewAsType(view, 2131299732, "field 'tvValue'", TextView.class);
            listDetailTransaksiVH.tvBankName = (TextView) Utils.findRequiredViewAsType(view, 2131299518, "field 'tvBankName'", TextView.class);
            listDetailTransaksiVH.tvNorek = (TextView) Utils.findRequiredViewAsType(view, 2131299468, "field 'tvNorek'", TextView.class);
            listDetailTransaksiVH.separator = Utils.findRequiredView(view, 2131298372, "field 'separator'");
            View findRequiredView = Utils.findRequiredView(view, 2131299697, "method 'onUbah'");
            this.d = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListDetailTransaksiAdapter.ListDetailTransaksiVH_ViewBinding.1
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listDetailTransaksiVH.onUbah(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListDetailTransaksiVH listDetailTransaksiVH = this.e;
            if (listDetailTransaksiVH != null) {
                this.e = null;
                listDetailTransaksiVH.tvTransaksi = null;
                listDetailTransaksiVH.tvTotal = null;
                listDetailTransaksiVH.tvValue = null;
                listDetailTransaksiVH.tvBankName = null;
                listDetailTransaksiVH.tvNorek = null;
                listDetailTransaksiVH.separator = null;
                this.d.setOnClickListener(null);
                this.d = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListDetailTransaksiAdapter(Context context, List<DetailTransactionResponse.ValueTxnDataDetail> list, boolean z, String str) {
        new ArrayList();
        this.h = context;
        this.g = list;
        this.f = z;
        this.j = str;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        return i == e.intValue() ? new ListDetailMultiTransaksiVH(LayoutInflater.from(this.h).inflate(2131493319, viewGroup, false), this.j) : new ListDetailTransaksiVH(LayoutInflater.from(this.h).inflate(2131493318, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.g.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int d(int i) {
        return this.g.get(i).getViewType().intValue();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i) {
        String str;
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable instanceof ListDetailTransaksiVH) {
            ListDetailTransaksiVH listDetailTransaksiVH = (ListDetailTransaksiVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
            TextView textView = listDetailTransaksiVH.tvTransaksi;
            List<DetailTransactionResponse.ValueTxnDataDetail> list = ListDetailTransaksiAdapter.this.g;
            setOnStartEnterTransitionListener setonstartentertransitionlistener = listDetailTransaksiVH.h;
            int i2 = -1;
            textView.setText(list.get(setonstartentertransitionlistener == null ? -1 : setonstartentertransitionlistener.e(listDetailTransaksiVH)).getTxnType());
            List<DetailTransactionResponse.ValueTxnDataDetail> list2 = ListDetailTransaksiAdapter.this.g;
            setOnStartEnterTransitionListener setonstartentertransitionlistener2 = listDetailTransaksiVH.h;
            if (list2.get(setonstartentertransitionlistener2 == null ? -1 : setonstartentertransitionlistener2.e(listDetailTransaksiVH)).getCurrency() != null) {
                List<DetailTransactionResponse.ValueTxnDataDetail> list3 = ListDetailTransaksiAdapter.this.g;
                setOnStartEnterTransitionListener setonstartentertransitionlistener3 = listDetailTransaksiVH.h;
                if (setonstartentertransitionlistener3 != null) {
                    i2 = setonstartentertransitionlistener3.e(listDetailTransaksiVH);
                }
                str = list3.get(i2).getCurrency();
            } else {
                str = "IDR";
            }
            TextView textView2 = listDetailTransaksiVH.tvTotal;
            StringBuilder sb = new StringBuilder();
            sb.append(getPromotion.j(ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getAmount().replace(".", ",")));
            sb.append(" ");
            sb.append(str);
            textView2.setText(sb.toString());
            if (ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getTxnType().equals("Transfer Valuta Asing")) {
                listDetailTransaksiVH.tvValue.setText(ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getProductTypeName());
                listDetailTransaksiVH.tvBankName.setVisibility(8);
                listDetailTransaksiVH.tvNorek.setVisibility(8);
            } else if (ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getTxnType().equals("Transfer ke Bank Lain")) {
                listDetailTransaksiVH.tvValue.setText(ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getReceiverName());
                listDetailTransaksiVH.tvTotal.setText(ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getTotalPayment());
                listDetailTransaksiVH.tvBankName.setText(ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getBankName());
                listDetailTransaksiVH.tvNorek.setText(ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getAccountNumber());
                listDetailTransaksiVH.tvBankName.setVisibility(0);
                listDetailTransaksiVH.tvNorek.setVisibility(0);
            } else {
                if (ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getTxnType().equals("Kliring")) {
                    listDetailTransaksiVH.tvTotal.setText(ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getAmount());
                } else if (ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getTxnType().equals("Setoran Tunai")) {
                    listDetailTransaksiVH.tvValue.setText(ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getReceiverName());
                    TextView textView3 = listDetailTransaksiVH.tvTotal;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(getPromotion.g(ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getAmount().replace(".", ",")));
                    sb2.append(" ");
                    sb2.append(str);
                    textView3.setText(sb2.toString());
                    listDetailTransaksiVH.tvBankName.setText(ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getBankName());
                    listDetailTransaksiVH.tvNorek.setText(ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getAccountNumber());
                    listDetailTransaksiVH.tvBankName.setVisibility(0);
                    listDetailTransaksiVH.tvNorek.setVisibility(0);
                }
                listDetailTransaksiVH.tvValue.setText(ListDetailTransaksiAdapter.this.g.get(listDetailTransaksiVH.e()).getAccountNumber());
                listDetailTransaksiVH.tvBankName.setVisibility(8);
                listDetailTransaksiVH.tvNorek.setVisibility(8);
            }
            int e2 = listDetailTransaksiVH.e();
            int size = ListDetailTransaksiAdapter.this.g.size();
            View view = listDetailTransaksiVH.separator;
            if (e2 == size - 1) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        } else if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable instanceof ListDetailMultiTransaksiVH) {
            ListDetailMultiTransaksiVH listDetailMultiTransaksiVH = (ListDetailMultiTransaksiVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
            listDetailMultiTransaksiVH.tvUbah.setClickable(true);
            listDetailMultiTransaksiVH.tvTransaksi.setText(ListDetailTransaksiAdapter.this.g.get(listDetailMultiTransaksiVH.e()).getTxnType());
            listDetailMultiTransaksiVH.rvPenerima.setAdapter(new DetailTundaTellerActivity(listDetailMultiTransaksiVH.t, ListDetailTransaksiAdapter.this.h, ListDetailTransaksiAdapter.this.g.get(listDetailMultiTransaksiVH.e()).getTxnSubDataDetails()));
            listDetailMultiTransaksiVH.tvUbah.setOnClickListener(new getIncomeAmount() { // from class: com.bca.smartbranch.adapter.ListDetailTransaksiAdapter.ListDetailMultiTransaksiVH.3
                @Override // o.getIncomeAmount
                public final void b(View view2) {
                    if (ListDetailMultiTransaksiVH.this.tvUbah.isClickable()) {
                        ListDetailMultiTransaksiVH.this.tvUbah.setClickable(false);
                        documentProvider.b().d(new ChooseSubMastercardAdapter$ViewHolder_ViewBinding(((DetailTransactionResponse.ValueTxnDataDetail) ListDetailTransaksiAdapter.this.g.get(ListDetailMultiTransaksiVH.this.d())).getToken(), ((DetailTransactionResponse.ValueTxnDataDetail) ListDetailTransaksiAdapter.this.g.get(ListDetailMultiTransaksiVH.this.d())).getNoreffAnak(), ((DetailTransactionResponse.ValueTxnDataDetail) ListDetailTransaksiAdapter.this.g.get(ListDetailMultiTransaksiVH.this.e())).getTxnType(), Integer.valueOf(ListDetailMultiTransaksiVH.this.e())));
                    }
                }
            });
            if (listDetailMultiTransaksiVH.e() == ListDetailTransaksiAdapter.this.g.size() - 1) {
                listDetailMultiTransaksiVH.separator.setVisibility(8);
            }
        }
    }
}
