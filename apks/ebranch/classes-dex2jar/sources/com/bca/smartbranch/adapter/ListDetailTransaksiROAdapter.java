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
import o.getPromotion;
import o.setOnStartEnterTransitionListener;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailTransaksiROAdapter.class */
public final class ListDetailTransaksiROAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    public static final Integer b = 0;
    public static final Integer e = 1;
    String f;
    private List<DetailTransactionResponse.ValueTxnDataDetail> g;
    private boolean i;
    Context j;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH.class */
    class ListDetailMultiTransaksiVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        String q;
        @BindView(2131298334)
        setOnStartEnterTransitionListener rvPenerima;
        @BindView(2131298372)
        View separator;
        @BindView(2131299689)
        TextView tvTransaksi;
        @BindView(2131299697)
        TextView tvUbah;

        public ListDetailMultiTransaksiVH(View view, String str) {
            super(view);
            this.q = str;
            ButterKnife.bind(this, view);
        }

        @OnClick({2131299697})
        public void onUbah(View view) {
            documentProvider.b().d(new ChooseSubMastercardAdapter$ViewHolder_ViewBinding(((DetailTransactionResponse.ValueTxnDataDetail) ListDetailTransaksiROAdapter.this.g.get(e())).getToken(), ((DetailTransactionResponse.ValueTxnDataDetail) ListDetailTransaksiROAdapter.this.g.get(d())).getNoreffAnak(), ((DetailTransactionResponse.ValueTxnDataDetail) ListDetailTransaksiROAdapter.this.g.get(e())).getTxnType(), Integer.valueOf(e())));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailTransaksiROAdapter$ListDetailMultiTransaksiVH_ViewBinding.class */
    public class ListDetailMultiTransaksiVH_ViewBinding implements Unbinder {
        private View a;
        private ListDetailMultiTransaksiVH c;

        public ListDetailMultiTransaksiVH_ViewBinding(final ListDetailMultiTransaksiVH listDetailMultiTransaksiVH, View view) {
            this.c = listDetailMultiTransaksiVH;
            listDetailMultiTransaksiVH.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
            listDetailMultiTransaksiVH.rvPenerima = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298334, "field 'rvPenerima'", setOnStartEnterTransitionListener.class);
            listDetailMultiTransaksiVH.separator = Utils.findRequiredView(view, 2131298372, "field 'separator'");
            View findRequiredView = Utils.findRequiredView(view, 2131299697, "field 'tvUbah' and method 'onUbah'");
            listDetailMultiTransaksiVH.tvUbah = (TextView) Utils.castView(findRequiredView, 2131299697, "field 'tvUbah'", TextView.class);
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListDetailTransaksiROAdapter.ListDetailMultiTransaksiVH_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listDetailMultiTransaksiVH.onUbah(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListDetailMultiTransaksiVH listDetailMultiTransaksiVH = this.c;
            if (listDetailMultiTransaksiVH != null) {
                this.c = null;
                listDetailMultiTransaksiVH.tvTransaksi = null;
                listDetailMultiTransaksiVH.rvPenerima = null;
                listDetailMultiTransaksiVH.separator = null;
                listDetailMultiTransaksiVH.tvUbah = null;
                this.a.setOnClickListener(null);
                this.a = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailTransaksiROAdapter$ListDetailTransaksiVH.class */
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
        @BindView(2131299697)
        TextView tvUbah;
        @BindView(2131299732)
        TextView tvValue;

        public ListDetailTransaksiVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131299697})
        public void onUbah(View view) {
            documentProvider.b().d(new ChooseSubMastercardAdapter$ViewHolder_ViewBinding(((DetailTransactionResponse.ValueTxnDataDetail) ListDetailTransaksiROAdapter.this.g.get(d())).getToken(), ((DetailTransactionResponse.ValueTxnDataDetail) ListDetailTransaksiROAdapter.this.g.get(d())).getNoreffAnak(), ((DetailTransactionResponse.ValueTxnDataDetail) ListDetailTransaksiROAdapter.this.g.get(e())).getTxnType(), Integer.valueOf(e())));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/ListDetailTransaksiROAdapter$ListDetailTransaksiVH_ViewBinding.class */
    public class ListDetailTransaksiVH_ViewBinding implements Unbinder {
        private ListDetailTransaksiVH a;
        private View c;

        public ListDetailTransaksiVH_ViewBinding(final ListDetailTransaksiVH listDetailTransaksiVH, View view) {
            this.a = listDetailTransaksiVH;
            listDetailTransaksiVH.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
            listDetailTransaksiVH.tvTotal = (TextView) Utils.findRequiredViewAsType(view, 2131299677, "field 'tvTotal'", TextView.class);
            listDetailTransaksiVH.tvValue = (TextView) Utils.findRequiredViewAsType(view, 2131299732, "field 'tvValue'", TextView.class);
            listDetailTransaksiVH.tvBankName = (TextView) Utils.findRequiredViewAsType(view, 2131299518, "field 'tvBankName'", TextView.class);
            listDetailTransaksiVH.tvNorek = (TextView) Utils.findRequiredViewAsType(view, 2131299468, "field 'tvNorek'", TextView.class);
            listDetailTransaksiVH.separator = Utils.findRequiredView(view, 2131298372, "field 'separator'");
            View findRequiredView = Utils.findRequiredView(view, 2131299697, "field 'tvUbah' and method 'onUbah'");
            listDetailTransaksiVH.tvUbah = (TextView) Utils.castView(findRequiredView, 2131299697, "field 'tvUbah'", TextView.class);
            this.c = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.ListDetailTransaksiROAdapter.ListDetailTransaksiVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    listDetailTransaksiVH.onUbah(view2);
                }
            });
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            ListDetailTransaksiVH listDetailTransaksiVH = this.a;
            if (listDetailTransaksiVH != null) {
                this.a = null;
                listDetailTransaksiVH.tvTransaksi = null;
                listDetailTransaksiVH.tvTotal = null;
                listDetailTransaksiVH.tvValue = null;
                listDetailTransaksiVH.tvBankName = null;
                listDetailTransaksiVH.tvNorek = null;
                listDetailTransaksiVH.separator = null;
                listDetailTransaksiVH.tvUbah = null;
                this.c.setOnClickListener(null);
                this.c = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public ListDetailTransaksiROAdapter(Context context, List<DetailTransactionResponse.ValueTxnDataDetail> list, boolean z, String str) {
        new ArrayList();
        this.j = context;
        this.g = list;
        this.i = z;
        this.f = str;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        return i == e.intValue() ? new ListDetailMultiTransaksiVH(LayoutInflater.from(this.j).inflate(2131493319, viewGroup, false), this.f) : new ListDetailTransaksiVH(LayoutInflater.from(this.j).inflate(2131493318, viewGroup, false));
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
        View view;
        String str;
        int i2 = 8;
        if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable instanceof ListDetailTransaksiVH) {
            ListDetailTransaksiVH listDetailTransaksiVH = (ListDetailTransaksiVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
            TextView textView = listDetailTransaksiVH.tvTransaksi;
            List<DetailTransactionResponse.ValueTxnDataDetail> list = ListDetailTransaksiROAdapter.this.g;
            setOnStartEnterTransitionListener setonstartentertransitionlistener = listDetailTransaksiVH.h;
            int i3 = -1;
            textView.setText(list.get(setonstartentertransitionlistener == null ? -1 : setonstartentertransitionlistener.e(listDetailTransaksiVH)).getTxnType());
            List<DetailTransactionResponse.ValueTxnDataDetail> list2 = ListDetailTransaksiROAdapter.this.g;
            setOnStartEnterTransitionListener setonstartentertransitionlistener2 = listDetailTransaksiVH.h;
            if (list2.get(setonstartentertransitionlistener2 == null ? -1 : setonstartentertransitionlistener2.e(listDetailTransaksiVH)).getAmount().equalsIgnoreCase("0")) {
                listDetailTransaksiVH.tvValue.setText("Reservasi");
                listDetailTransaksiVH.tvTotal.setVisibility(8);
                listDetailTransaksiVH.tvUbah.setVisibility(4);
            } else {
                List<DetailTransactionResponse.ValueTxnDataDetail> list3 = ListDetailTransaksiROAdapter.this.g;
                setOnStartEnterTransitionListener setonstartentertransitionlistener3 = listDetailTransaksiVH.h;
                if (list3.get(setonstartentertransitionlistener3 == null ? -1 : setonstartentertransitionlistener3.e(listDetailTransaksiVH)).getCurrency() != null) {
                    List<DetailTransactionResponse.ValueTxnDataDetail> list4 = ListDetailTransaksiROAdapter.this.g;
                    setOnStartEnterTransitionListener setonstartentertransitionlistener4 = listDetailTransaksiVH.h;
                    if (setonstartentertransitionlistener4 != null) {
                        i3 = setonstartentertransitionlistener4.e(listDetailTransaksiVH);
                    }
                    str = list4.get(i3).getCurrency();
                } else {
                    str = "IDR";
                }
                TextView textView2 = listDetailTransaksiVH.tvTotal;
                StringBuilder sb = new StringBuilder();
                sb.append(getPromotion.j(ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getAmount().replace(".", ",")));
                sb.append(" ");
                sb.append(str);
                textView2.setText(sb.toString());
                if (ListDetailTransaksiROAdapter.this.i) {
                    listDetailTransaksiVH.tvUbah.setVisibility(4);
                } else {
                    listDetailTransaksiVH.tvUbah.setVisibility(0);
                }
                listDetailTransaksiVH.tvTotal.setVisibility(0);
                if (ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getTxnType().equals("Transfer Valuta Asing")) {
                    listDetailTransaksiVH.tvValue.setText(ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getProductTypeName());
                    listDetailTransaksiVH.tvBankName.setVisibility(8);
                    listDetailTransaksiVH.tvNorek.setVisibility(8);
                } else if (ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getTxnType().equals("Transfer ke Bank Lain")) {
                    listDetailTransaksiVH.tvTotal.setText(ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getTotalPayment());
                    listDetailTransaksiVH.tvValue.setText(ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getReceiverName());
                    listDetailTransaksiVH.tvBankName.setText(ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getBankName());
                    listDetailTransaksiVH.tvNorek.setText(ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getAccountNumber());
                    listDetailTransaksiVH.tvBankName.setVisibility(0);
                    listDetailTransaksiVH.tvNorek.setVisibility(0);
                } else {
                    if (ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getTxnType().equals("Kliring")) {
                        listDetailTransaksiVH.tvTotal.setText(ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getAmount());
                    } else if (ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getTxnType().equals("Setoran Tunai")) {
                        listDetailTransaksiVH.tvValue.setText(ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getReceiverName());
                        TextView textView3 = listDetailTransaksiVH.tvTotal;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(getPromotion.g(ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getAmount().replace(".", ",")));
                        sb2.append(" ");
                        sb2.append(str);
                        textView3.setText(sb2.toString());
                        listDetailTransaksiVH.tvBankName.setText(ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getBankName());
                        listDetailTransaksiVH.tvNorek.setText(ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getAccountNumber());
                        listDetailTransaksiVH.tvBankName.setVisibility(0);
                        listDetailTransaksiVH.tvNorek.setVisibility(0);
                    }
                    listDetailTransaksiVH.tvValue.setText(ListDetailTransaksiROAdapter.this.g.get(listDetailTransaksiVH.e()).getAccountNumber());
                    listDetailTransaksiVH.tvBankName.setVisibility(8);
                    listDetailTransaksiVH.tvNorek.setVisibility(8);
                }
            }
            int e2 = listDetailTransaksiVH.e();
            int size = ListDetailTransaksiROAdapter.this.g.size();
            View view2 = listDetailTransaksiVH.separator;
            if (e2 == size - 1) {
                view2.setVisibility(8);
            } else {
                view2.setVisibility(0);
            }
        } else if (setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable instanceof ListDetailMultiTransaksiVH) {
            ListDetailMultiTransaksiVH listDetailMultiTransaksiVH = (ListDetailMultiTransaksiVH) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable;
            if (ListDetailTransaksiROAdapter.this.i) {
                listDetailMultiTransaksiVH.tvUbah.setVisibility(4);
            } else {
                listDetailMultiTransaksiVH.tvUbah.setVisibility(0);
            }
            listDetailMultiTransaksiVH.tvTransaksi.setText(ListDetailTransaksiROAdapter.this.g.get(listDetailMultiTransaksiVH.e()).getTxnType());
            listDetailMultiTransaksiVH.rvPenerima.setAdapter(new DetailTundaTellerActivity(listDetailMultiTransaksiVH.q, ListDetailTransaksiROAdapter.this.j, ListDetailTransaksiROAdapter.this.g.get(listDetailMultiTransaksiVH.e()).getTxnSubDataDetails()));
            if (ListDetailTransaksiROAdapter.this.g.size() <= 1 || listDetailMultiTransaksiVH.e() == ListDetailTransaksiROAdapter.this.g.size() - 1) {
                view = listDetailMultiTransaksiVH.separator;
            } else {
                view = listDetailMultiTransaksiVH.separator;
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }
}
