package com.bca.smartbranch.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import o.ChooseSubVisaAdapter$ViewHolder_ViewBinding;
import o.documentProvider;
import o.getPromotion;
import o.onClickUbahTransferBerkala;
import o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DataReservasiAdapter.class */
public final class DataReservasiAdapter extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<DataReservasiVH> {
    public List<ReservasiOnline> b;
    public boolean e = false;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DataReservasiAdapter$DataReservasiVH.class */
    class DataReservasiVH extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        @BindView(2131296394)
        Button btnIsiForm;
        @BindView(2131297412)
        ImageView ivReservasi;
        @BindView(2131297766)
        LinearLayout llMain;
        @BindView(2131298918)
        TextView tvDesc;
        @BindView(2131299071)
        TextView tvErrorMessage;
        @BindView(2131299288)
        TextView tvInfoIsiForm;
        @BindView(2131299615)
        TextView tvTitle;
        @BindView(2131299723)
        TextView tvUbahForm;

        public DataReservasiVH(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick({2131296394})
        public void isiFormOnline(View view) {
            documentProvider.b().d(new onClickUbahTransferBerkala(((ReservasiOnline) DataReservasiAdapter.this.b.get(c())).getId().longValue(), ((ReservasiOnline) DataReservasiAdapter.this.b.get(c())).getCodeTransaksi(), e()));
        }

        @OnClick({2131299723})
        public void ubahForm(View view) {
            if (((ReservasiOnline) DataReservasiAdapter.this.b.get(c())).getCodeTransaksi().equals(ReservasiOnline.SETORAN_TUNAI) || ((ReservasiOnline) DataReservasiAdapter.this.b.get(c())).getCodeTransaksi().equals(ReservasiOnline.TARIKAN_TUNAI)) {
                ChooseSubVisaAdapter$ViewHolder_ViewBinding chooseSubVisaAdapter$ViewHolder_ViewBinding = new ChooseSubVisaAdapter$ViewHolder_ViewBinding(((ReservasiOnline) DataReservasiAdapter.this.b.get(c())).getId().longValue(), ((ReservasiOnline) DataReservasiAdapter.this.b.get(c())).getCodeTransaksi(), d());
                chooseSubVisaAdapter$ViewHolder_ViewBinding.c = ((ReservasiOnline) DataReservasiAdapter.this.b.get(c())).getNominalTransaksiTeller().replaceAll("[^0-9.]", "").replace(',', '.');
                documentProvider.b().d(chooseSubVisaAdapter$ViewHolder_ViewBinding);
                return;
            }
            documentProvider.b().d(new ChooseSubVisaAdapter$ViewHolder_ViewBinding(((ReservasiOnline) DataReservasiAdapter.this.b.get(c())).getId().longValue(), ((ReservasiOnline) DataReservasiAdapter.this.b.get(c())).getCodeTransaksi(), e()));
        }
    }

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/adapter/DataReservasiAdapter$DataReservasiVH_ViewBinding.class */
    public class DataReservasiVH_ViewBinding implements Unbinder {
        private View a;
        private View b;
        private DataReservasiVH d;

        public DataReservasiVH_ViewBinding(final DataReservasiVH dataReservasiVH, View view) {
            this.d = dataReservasiVH;
            dataReservasiVH.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
            dataReservasiVH.ivReservasi = (ImageView) Utils.findRequiredViewAsType(view, 2131297412, "field 'ivReservasi'", ImageView.class);
            dataReservasiVH.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
            dataReservasiVH.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
            dataReservasiVH.tvInfoIsiForm = (TextView) Utils.findRequiredViewAsType(view, 2131299288, "field 'tvInfoIsiForm'", TextView.class);
            View findRequiredView = Utils.findRequiredView(view, 2131296394, "field 'btnIsiForm' and method 'isiFormOnline'");
            dataReservasiVH.btnIsiForm = (Button) Utils.castView(findRequiredView, 2131296394, "field 'btnIsiForm'", Button.class);
            this.a = findRequiredView;
            findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.DataReservasiAdapter.DataReservasiVH_ViewBinding.3
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    dataReservasiVH.isiFormOnline(view2);
                }
            });
            View findRequiredView2 = Utils.findRequiredView(view, 2131299723, "field 'tvUbahForm' and method 'ubahForm'");
            dataReservasiVH.tvUbahForm = (TextView) Utils.castView(findRequiredView2, 2131299723, "field 'tvUbahForm'", TextView.class);
            this.b = findRequiredView2;
            findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.adapter.DataReservasiAdapter.DataReservasiVH_ViewBinding.4
                @Override // butterknife.internal.DebouncingOnClickListener
                public final void doClick(View view2) {
                    dataReservasiVH.ubahForm(view2);
                }
            });
            dataReservasiVH.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        }

        @Override // butterknife.Unbinder
        public void unbind() {
            DataReservasiVH dataReservasiVH = this.d;
            if (dataReservasiVH != null) {
                this.d = null;
                dataReservasiVH.llMain = null;
                dataReservasiVH.ivReservasi = null;
                dataReservasiVH.tvTitle = null;
                dataReservasiVH.tvDesc = null;
                dataReservasiVH.tvInfoIsiForm = null;
                dataReservasiVH.btnIsiForm = null;
                dataReservasiVH.tvUbahForm = null;
                dataReservasiVH.tvErrorMessage = null;
                this.a.setOnClickListener(null);
                this.a = null;
                this.b.setOnClickListener(null);
                this.b = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ DataReservasiVH a(ViewGroup viewGroup, int i) {
        return new DataReservasiVH(LayoutInflater.from(viewGroup.getContext()).inflate(2131493299, viewGroup, false));
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(DataReservasiVH dataReservasiVH, int i) {
        DataReservasiVH dataReservasiVH2 = dataReservasiVH;
        dataReservasiVH2.tvTitle.setText(this.b.get(i).getNameTransaksi());
        if (this.b.get(i).isHasDone()) {
            dataReservasiVH2.ivReservasi.setImageResource(2131231406);
            dataReservasiVH2.btnIsiForm.setVisibility(8);
            dataReservasiVH2.tvInfoIsiForm.setVisibility(8);
            if (this.b.get(i).getCodeTransaksi().equals(ReservasiOnline.SETORAN_TUNAI) || this.b.get(i).getCodeTransaksi().equals(ReservasiOnline.TARIKAN_TUNAI) || this.b.get(i).getCodeTransaksi().equals(ReservasiOnline.KIRIMAN_UANG) || this.b.get(i).getCodeTransaksi().equals(ReservasiOnline.OUTWARD_REMITTANCE) || this.b.get(i).getCodeTransaksi().equals(ReservasiOnline.KLIRING)) {
                dataReservasiVH2.tvUbahForm.setVisibility(0);
                dataReservasiVH2.tvDesc.setVisibility(0);
                if (this.b.get(i).getCodeTransaksi().equals(ReservasiOnline.OUTWARD_REMITTANCE)) {
                    TextView textView = dataReservasiVH2.tvDesc;
                    StringBuilder sb = new StringBuilder();
                    sb.append(getPromotion.j(this.b.get(i).getNominalTransaksiTeller().replace(".", "")));
                    sb.append(" ");
                    sb.append(this.b.get(i).getCodeCurrencyTeller());
                    textView.setText(sb.toString());
                } else if (this.b.get(i).getCodeTransaksi().equals(ReservasiOnline.KIRIMAN_UANG)) {
                    BigDecimal valueOf = BigDecimal.valueOf(0L);
                    BigDecimal bigDecimal = new BigDecimal(this.b.get(i).getNominalTransaksiTeller().replaceAll("[^0-9.]", "").replace(',', '.'));
                    Iterator<BankTransferPenerima> it = this.b.get(i).getPenerimaList().iterator();
                    while (it.hasNext()) {
                        valueOf = valueOf.add(new BigDecimal(it.next().getBiayaTransfer()));
                    }
                    BigDecimal add = bigDecimal.add(valueOf);
                    TextView textView2 = dataReservasiVH2.tvDesc;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(getPromotion.a(Double.valueOf(add.doubleValue())));
                    sb2.append(" ");
                    sb2.append(this.b.get(i).getCodeCurrencyTeller());
                    textView2.setText(sb2.toString());
                } else if (this.b.get(i).getCodeTransaksi().equals(ReservasiOnline.TARIKAN_TUNAI)) {
                    TextView textView3 = dataReservasiVH2.tvDesc;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(getPromotion.h(this.b.get(i).getNominalTransaksiTeller().replaceAll("[^0-9.]", "").replace(',', '.')).replace(",", "."));
                    sb3.append(" ");
                    sb3.append(this.b.get(i).getCodeCurrencyTeller());
                    textView3.setText(sb3.toString());
                } else {
                    TextView textView4 = dataReservasiVH2.tvDesc;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(getPromotion.a(Double.valueOf(Double.parseDouble(this.b.get(i).getNominalTransaksiTeller().replaceAll("[^0-9.]", "").replace(',', '.')))));
                    sb4.append(" IDR");
                    textView4.setText(sb4.toString());
                }
            } else if ((!this.b.get(i).getCodeTransaksi().equals(ReservasiOnline.PEMBUKAAN_REKENING) || !this.b.get(i).getIsInputAtmPemrek().equals("Y")) && !this.b.get(i).getCodeTransaksi().equals(ReservasiOnline.INTERNET_MOBILE_BANKING)) {
                dataReservasiVH2.tvUbahForm.setVisibility(8);
                dataReservasiVH2.tvDesc.setVisibility(8);
            } else {
                dataReservasiVH2.tvUbahForm.setVisibility(0);
            }
        } else {
            dataReservasiVH2.ivReservasi.setImageResource(this.b.get(i).getImage().intValue());
            if (!this.b.get(i).isEditable()) {
                dataReservasiVH2.llMain.setAlpha(0.5f);
                dataReservasiVH2.btnIsiForm.setVisibility(8);
                dataReservasiVH2.tvInfoIsiForm.setVisibility(0);
                dataReservasiVH2.tvUbahForm.setVisibility(8);
            } else {
                dataReservasiVH2.llMain.setAlpha(1.0f);
                dataReservasiVH2.btnIsiForm.setVisibility(0);
                dataReservasiVH2.tvInfoIsiForm.setVisibility(8);
                dataReservasiVH2.tvUbahForm.setVisibility(8);
            }
        }
        if (!this.e) {
            dataReservasiVH2.tvErrorMessage.setVisibility(8);
        } else if (this.b.get(i).isHasDone() || !this.b.get(i).isEditable()) {
            dataReservasiVH2.tvErrorMessage.setVisibility(8);
        } else {
            dataReservasiVH2.tvErrorMessage.setVisibility(0);
        }
    }
}
