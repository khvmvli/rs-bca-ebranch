package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog;
import o.LogoutDialog_ViewBinding;
import o.onAcceptKetentuanOR;
import o.setCurrencyName;
import o.setInputType;
import o.setSplitTrack;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilBTActivity_ViewBinding.class */
public class DetailBerhasilBTActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private DetailBerhasilBTActivity e;

    public DetailBerhasilBTActivity_ViewBinding(final DetailBerhasilBTActivity detailBerhasilBTActivity, View view) {
        this.e = detailBerhasilBTActivity;
        detailBerhasilBTActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBerhasilBTActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBerhasilBTActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChange'");
        detailBerhasilBTActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.d = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilBTActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBerhasilBTActivity.inputChange(view2, z);
            }
        });
        detailBerhasilBTActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBerhasilBTActivity.etAlasan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296945, "field 'etAlasan'", LogoutDialog.class);
        detailBerhasilBTActivity.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        detailBerhasilBTActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBerhasilBTActivity.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
        detailBerhasilBTActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBerhasilBTActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        detailBerhasilBTActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBerhasilBTActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilBTActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilBTActivity.proses(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBerhasilBTActivity.btnShare = (Button) Utils.castView(findRequiredView3, 2131296448, "field 'btnShare'", Button.class);
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilBTActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilBTActivity.share(view2);
            }
        });
        detailBerhasilBTActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBerhasilBTActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBerhasilBTActivity.tvNorekSumberDana = (TextView) Utils.findRequiredViewAsType(view, 2131299501, "field 'tvNorekSumberDana'", TextView.class);
        detailBerhasilBTActivity.tvNamaPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131298904, "field 'tvNamaPenerima'", TextView.class);
        detailBerhasilBTActivity.tvBankTujuan = (TextView) Utils.findRequiredViewAsType(view, 2131298837, "field 'tvBankTujuan'", TextView.class);
        detailBerhasilBTActivity.tvNamaPengirim = (TextView) Utils.findRequiredViewAsType(view, 2131298910, "field 'tvNamaPengirim'", TextView.class);
        detailBerhasilBTActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBerhasilBTActivity.tvNoTelpCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299495, "field 'tvNoTelpCabang'", TextView.class);
        detailBerhasilBTActivity.tvSaranaPembayaran = (TextView) Utils.findRequiredViewAsType(view, 2131299567, "field 'tvSaranaPembayaran'", TextView.class);
        detailBerhasilBTActivity.tvNomorWarkat = (TextView) Utils.findRequiredViewAsType(view, 2131299496, "field 'tvNomorWarkat'", TextView.class);
        detailBerhasilBTActivity.tvWaktuPengiriman = (TextView) Utils.findRequiredViewAsType(view, 2131299737, "field 'tvWaktuPengiriman'", TextView.class);
        detailBerhasilBTActivity.tvTanggalPelaksanaan = (TextView) Utils.findRequiredViewAsType(view, 2131299602, "field 'tvTanggalPelaksanaan'", TextView.class);
        detailBerhasilBTActivity.tvTotalBiayaTransfer = (TextView) Utils.findRequiredViewAsType(view, 2131299679, "field 'tvTotalBiayaTransfer'", TextView.class);
        detailBerhasilBTActivity.tvTotalNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299681, "field 'tvTotalNominal'", TextView.class);
        detailBerhasilBTActivity.tvTotalPembayaran = (TextView) Utils.findRequiredViewAsType(view, 2131299684, "field 'tvTotalPembayaran'", TextView.class);
        detailBerhasilBTActivity.tvNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299485, "field 'tvNominal'", TextView.class);
        detailBerhasilBTActivity.tvBiayaTransfer = (TextView) Utils.findRequiredViewAsType(view, 2131298859, "field 'tvBiayaTransfer'", TextView.class);
        detailBerhasilBTActivity.tvBerita = (TextView) Utils.findRequiredViewAsType(view, 2131298847, "field 'tvBerita'", TextView.class);
        detailBerhasilBTActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailBerhasilBTActivity.llNorekSumberDana = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297837, "field 'llNorekSumberDana'", LinearLayout.class);
        detailBerhasilBTActivity.llPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297850, "field 'llPenerima'", LinearLayout.class);
        detailBerhasilBTActivity.llBankTujuan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297539, "field 'llBankTujuan'", LinearLayout.class);
        detailBerhasilBTActivity.llPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297856, "field 'llPengirim'", LinearLayout.class);
        detailBerhasilBTActivity.llSaranaPembayaran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297878, "field 'llSaranaPembayaran'", LinearLayout.class);
        detailBerhasilBTActivity.llNomorWarkat = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297835, "field 'llNomorWarkat'", LinearLayout.class);
        detailBerhasilBTActivity.llWaktuPengiriman = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297932, "field 'llWaktuPengiriman'", LinearLayout.class);
        detailBerhasilBTActivity.llTanggalPelaksanaan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297910, "field 'llTanggalPelaksanaan'", LinearLayout.class);
        detailBerhasilBTActivity.llDetailPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297624, "field 'llDetailPenerima'", LinearLayout.class);
        detailBerhasilBTActivity.llTotalBiayaTransfer = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297919, "field 'llTotalBiayaTransfer'", LinearLayout.class);
        detailBerhasilBTActivity.llTotalNominal = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297920, "field 'llTotalNominal'", LinearLayout.class);
        detailBerhasilBTActivity.llTotalPembayaran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297921, "field 'llTotalPembayaran'", LinearLayout.class);
        detailBerhasilBTActivity.llNominal = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297830, "field 'llNominal'", LinearLayout.class);
        detailBerhasilBTActivity.llBiayaTransfer = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297550, "field 'llBiayaTransfer'", LinearLayout.class);
        detailBerhasilBTActivity.llBerita = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297548, "field 'llBerita'", LinearLayout.class);
        detailBerhasilBTActivity.llCatatan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297566, "field 'llCatatan'", LinearLayout.class);
        detailBerhasilBTActivity.llCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'llCabang'", LinearLayout.class);
        detailBerhasilBTActivity.llNoTelpCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297825, "field 'llNoTelpCabang'", LinearLayout.class);
        detailBerhasilBTActivity.cvInfo = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296838, "field 'cvInfo'", setSplitTrack.class);
        detailBerhasilBTActivity.tvTransactionType = (TextView) Utils.findRequiredViewAsType(view, 2131299688, "field 'tvTransactionType'", TextView.class);
        detailBerhasilBTActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        detailBerhasilBTActivity.lvDetailPenerima = (ListView) Utils.findRequiredViewAsType(view, 2131297976, "field 'lvDetailPenerima'", ListView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.b = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilBTActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilBTActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailBerhasilBTActivity.retry = resources.getString(2131822092);
        detailBerhasilBTActivity.toolbarTitle = resources.getString(2131822262);
        detailBerhasilBTActivity.pendebetanDana = resources.getString(2131822007);
        detailBerhasilBTActivity.buktiKirim = resources.getString(2131821412);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBerhasilBTActivity detailBerhasilBTActivity = this.e;
        if (detailBerhasilBTActivity != null) {
            this.e = null;
            detailBerhasilBTActivity.toolbar = null;
            detailBerhasilBTActivity.txtToolbarTitle = null;
            detailBerhasilBTActivity.tvErrorMessage = null;
            detailBerhasilBTActivity.etKomentar = null;
            detailBerhasilBTActivity.tilKomentar = null;
            detailBerhasilBTActivity.etAlasan = null;
            detailBerhasilBTActivity.tilAlasan = null;
            detailBerhasilBTActivity.tvStatus = null;
            detailBerhasilBTActivity.tvTransaksi = null;
            detailBerhasilBTActivity.llMain = null;
            detailBerhasilBTActivity.ratingBar = null;
            detailBerhasilBTActivity.llRating = null;
            detailBerhasilBTActivity.btnProses = null;
            detailBerhasilBTActivity.btnShare = null;
            detailBerhasilBTActivity.tvErrorKomentar = null;
            detailBerhasilBTActivity.tvWaktu = null;
            detailBerhasilBTActivity.tvNorekSumberDana = null;
            detailBerhasilBTActivity.tvNamaPenerima = null;
            detailBerhasilBTActivity.tvBankTujuan = null;
            detailBerhasilBTActivity.tvNamaPengirim = null;
            detailBerhasilBTActivity.tvCabang = null;
            detailBerhasilBTActivity.tvNoTelpCabang = null;
            detailBerhasilBTActivity.tvSaranaPembayaran = null;
            detailBerhasilBTActivity.tvNomorWarkat = null;
            detailBerhasilBTActivity.tvWaktuPengiriman = null;
            detailBerhasilBTActivity.tvTanggalPelaksanaan = null;
            detailBerhasilBTActivity.tvTotalBiayaTransfer = null;
            detailBerhasilBTActivity.tvTotalNominal = null;
            detailBerhasilBTActivity.tvTotalPembayaran = null;
            detailBerhasilBTActivity.tvNominal = null;
            detailBerhasilBTActivity.tvBiayaTransfer = null;
            detailBerhasilBTActivity.tvBerita = null;
            detailBerhasilBTActivity.tvNoReferensi = null;
            detailBerhasilBTActivity.llNorekSumberDana = null;
            detailBerhasilBTActivity.llPenerima = null;
            detailBerhasilBTActivity.llBankTujuan = null;
            detailBerhasilBTActivity.llPengirim = null;
            detailBerhasilBTActivity.llSaranaPembayaran = null;
            detailBerhasilBTActivity.llNomorWarkat = null;
            detailBerhasilBTActivity.llWaktuPengiriman = null;
            detailBerhasilBTActivity.llTanggalPelaksanaan = null;
            detailBerhasilBTActivity.llDetailPenerima = null;
            detailBerhasilBTActivity.llTotalBiayaTransfer = null;
            detailBerhasilBTActivity.llTotalNominal = null;
            detailBerhasilBTActivity.llTotalPembayaran = null;
            detailBerhasilBTActivity.llNominal = null;
            detailBerhasilBTActivity.llBiayaTransfer = null;
            detailBerhasilBTActivity.llBerita = null;
            detailBerhasilBTActivity.llCatatan = null;
            detailBerhasilBTActivity.llCabang = null;
            detailBerhasilBTActivity.llNoTelpCabang = null;
            detailBerhasilBTActivity.cvInfo = null;
            detailBerhasilBTActivity.tvTransactionType = null;
            detailBerhasilBTActivity.llShare = null;
            detailBerhasilBTActivity.lvDetailPenerima = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
