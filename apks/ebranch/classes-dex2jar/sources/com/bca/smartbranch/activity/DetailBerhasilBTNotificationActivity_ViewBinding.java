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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilBTNotificationActivity_ViewBinding.class */
public class DetailBerhasilBTNotificationActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private DetailBerhasilBTNotificationActivity c;
    private View e;

    public DetailBerhasilBTNotificationActivity_ViewBinding(final DetailBerhasilBTNotificationActivity detailBerhasilBTNotificationActivity, View view) {
        this.c = detailBerhasilBTNotificationActivity;
        detailBerhasilBTNotificationActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBerhasilBTNotificationActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBerhasilBTNotificationActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChange'");
        detailBerhasilBTNotificationActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBerhasilBTNotificationActivity.inputChange(view2, z);
            }
        });
        detailBerhasilBTNotificationActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBerhasilBTNotificationActivity.etAlasan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296945, "field 'etAlasan'", LogoutDialog.class);
        detailBerhasilBTNotificationActivity.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        detailBerhasilBTNotificationActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBerhasilBTNotificationActivity.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
        detailBerhasilBTNotificationActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        detailBerhasilBTNotificationActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBerhasilBTNotificationActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilBTNotificationActivity.proses(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBerhasilBTNotificationActivity.btnShare = (Button) Utils.castView(findRequiredView3, 2131296448, "field 'btnShare'", Button.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilBTNotificationActivity.share(view2);
            }
        });
        detailBerhasilBTNotificationActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBerhasilBTNotificationActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBerhasilBTNotificationActivity.tvNorekSumberDana = (TextView) Utils.findRequiredViewAsType(view, 2131299501, "field 'tvNorekSumberDana'", TextView.class);
        detailBerhasilBTNotificationActivity.tvNamaPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131298904, "field 'tvNamaPenerima'", TextView.class);
        detailBerhasilBTNotificationActivity.tvBankTujuan = (TextView) Utils.findRequiredViewAsType(view, 2131298837, "field 'tvBankTujuan'", TextView.class);
        detailBerhasilBTNotificationActivity.tvNamaPengirim = (TextView) Utils.findRequiredViewAsType(view, 2131298910, "field 'tvNamaPengirim'", TextView.class);
        detailBerhasilBTNotificationActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBerhasilBTNotificationActivity.tvNoTelpCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299495, "field 'tvNoTelpCabang'", TextView.class);
        detailBerhasilBTNotificationActivity.tvSaranaPembayaran = (TextView) Utils.findRequiredViewAsType(view, 2131299567, "field 'tvSaranaPembayaran'", TextView.class);
        detailBerhasilBTNotificationActivity.tvNomorWarkat = (TextView) Utils.findRequiredViewAsType(view, 2131299496, "field 'tvNomorWarkat'", TextView.class);
        detailBerhasilBTNotificationActivity.tvWaktuPengiriman = (TextView) Utils.findRequiredViewAsType(view, 2131299737, "field 'tvWaktuPengiriman'", TextView.class);
        detailBerhasilBTNotificationActivity.tvTanggalPelaksanaan = (TextView) Utils.findRequiredViewAsType(view, 2131299602, "field 'tvTanggalPelaksanaan'", TextView.class);
        detailBerhasilBTNotificationActivity.tvTotalBiayaTransfer = (TextView) Utils.findRequiredViewAsType(view, 2131299679, "field 'tvTotalBiayaTransfer'", TextView.class);
        detailBerhasilBTNotificationActivity.tvTotalNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299681, "field 'tvTotalNominal'", TextView.class);
        detailBerhasilBTNotificationActivity.tvTotalPembayaran = (TextView) Utils.findRequiredViewAsType(view, 2131299684, "field 'tvTotalPembayaran'", TextView.class);
        detailBerhasilBTNotificationActivity.tvNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299485, "field 'tvNominal'", TextView.class);
        detailBerhasilBTNotificationActivity.tvBiayaTransfer = (TextView) Utils.findRequiredViewAsType(view, 2131298859, "field 'tvBiayaTransfer'", TextView.class);
        detailBerhasilBTNotificationActivity.tvBerita = (TextView) Utils.findRequiredViewAsType(view, 2131298847, "field 'tvBerita'", TextView.class);
        detailBerhasilBTNotificationActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailBerhasilBTNotificationActivity.llNorekSumberDana = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297837, "field 'llNorekSumberDana'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297850, "field 'llPenerima'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llBankTujuan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297539, "field 'llBankTujuan'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297856, "field 'llPengirim'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llSaranaPembayaran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297878, "field 'llSaranaPembayaran'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llNomorWarkat = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297835, "field 'llNomorWarkat'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llWaktuPengiriman = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297932, "field 'llWaktuPengiriman'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llTanggalPelaksanaan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297910, "field 'llTanggalPelaksanaan'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llDetailPenerima = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297624, "field 'llDetailPenerima'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llTotalBiayaTransfer = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297919, "field 'llTotalBiayaTransfer'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llTotalNominal = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297920, "field 'llTotalNominal'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llTotalPembayaran = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297921, "field 'llTotalPembayaran'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llNominal = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297830, "field 'llNominal'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llBiayaTransfer = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297550, "field 'llBiayaTransfer'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llBerita = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297548, "field 'llBerita'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llCatatan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297566, "field 'llCatatan'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'llCabang'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.llNoTelpCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297825, "field 'llNoTelpCabang'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.cvInfo = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296838, "field 'cvInfo'", setSplitTrack.class);
        detailBerhasilBTNotificationActivity.tvTransactionType = (TextView) Utils.findRequiredViewAsType(view, 2131299688, "field 'tvTransactionType'", TextView.class);
        detailBerhasilBTNotificationActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        detailBerhasilBTNotificationActivity.lvDetailPenerima = (ListView) Utils.findRequiredViewAsType(view, 2131297976, "field 'lvDetailPenerima'", ListView.class);
        Resources resources = view.getContext().getResources();
        detailBerhasilBTNotificationActivity.retry = resources.getString(2131822092);
        detailBerhasilBTNotificationActivity.toolbarTitle = resources.getString(2131822262);
        detailBerhasilBTNotificationActivity.pendebetanDana = resources.getString(2131822007);
        detailBerhasilBTNotificationActivity.buktiKirim = resources.getString(2131821412);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBerhasilBTNotificationActivity detailBerhasilBTNotificationActivity = this.c;
        if (detailBerhasilBTNotificationActivity != null) {
            this.c = null;
            detailBerhasilBTNotificationActivity.toolbar = null;
            detailBerhasilBTNotificationActivity.txtToolbarTitle = null;
            detailBerhasilBTNotificationActivity.tvErrorMessage = null;
            detailBerhasilBTNotificationActivity.etKomentar = null;
            detailBerhasilBTNotificationActivity.tilKomentar = null;
            detailBerhasilBTNotificationActivity.etAlasan = null;
            detailBerhasilBTNotificationActivity.tilAlasan = null;
            detailBerhasilBTNotificationActivity.tvStatus = null;
            detailBerhasilBTNotificationActivity.tvTransaksi = null;
            detailBerhasilBTNotificationActivity.llMain = null;
            detailBerhasilBTNotificationActivity.ratingBar = null;
            detailBerhasilBTNotificationActivity.llRating = null;
            detailBerhasilBTNotificationActivity.btnProses = null;
            detailBerhasilBTNotificationActivity.btnShare = null;
            detailBerhasilBTNotificationActivity.tvErrorKomentar = null;
            detailBerhasilBTNotificationActivity.tvWaktu = null;
            detailBerhasilBTNotificationActivity.tvNorekSumberDana = null;
            detailBerhasilBTNotificationActivity.tvNamaPenerima = null;
            detailBerhasilBTNotificationActivity.tvBankTujuan = null;
            detailBerhasilBTNotificationActivity.tvNamaPengirim = null;
            detailBerhasilBTNotificationActivity.tvCabang = null;
            detailBerhasilBTNotificationActivity.tvNoTelpCabang = null;
            detailBerhasilBTNotificationActivity.tvSaranaPembayaran = null;
            detailBerhasilBTNotificationActivity.tvNomorWarkat = null;
            detailBerhasilBTNotificationActivity.tvWaktuPengiriman = null;
            detailBerhasilBTNotificationActivity.tvTanggalPelaksanaan = null;
            detailBerhasilBTNotificationActivity.tvTotalBiayaTransfer = null;
            detailBerhasilBTNotificationActivity.tvTotalNominal = null;
            detailBerhasilBTNotificationActivity.tvTotalPembayaran = null;
            detailBerhasilBTNotificationActivity.tvNominal = null;
            detailBerhasilBTNotificationActivity.tvBiayaTransfer = null;
            detailBerhasilBTNotificationActivity.tvBerita = null;
            detailBerhasilBTNotificationActivity.tvNoReferensi = null;
            detailBerhasilBTNotificationActivity.llNorekSumberDana = null;
            detailBerhasilBTNotificationActivity.llPenerima = null;
            detailBerhasilBTNotificationActivity.llBankTujuan = null;
            detailBerhasilBTNotificationActivity.llPengirim = null;
            detailBerhasilBTNotificationActivity.llSaranaPembayaran = null;
            detailBerhasilBTNotificationActivity.llNomorWarkat = null;
            detailBerhasilBTNotificationActivity.llWaktuPengiriman = null;
            detailBerhasilBTNotificationActivity.llTanggalPelaksanaan = null;
            detailBerhasilBTNotificationActivity.llDetailPenerima = null;
            detailBerhasilBTNotificationActivity.llTotalBiayaTransfer = null;
            detailBerhasilBTNotificationActivity.llTotalNominal = null;
            detailBerhasilBTNotificationActivity.llTotalPembayaran = null;
            detailBerhasilBTNotificationActivity.llNominal = null;
            detailBerhasilBTNotificationActivity.llBiayaTransfer = null;
            detailBerhasilBTNotificationActivity.llBerita = null;
            detailBerhasilBTNotificationActivity.llCatatan = null;
            detailBerhasilBTNotificationActivity.llCabang = null;
            detailBerhasilBTNotificationActivity.llNoTelpCabang = null;
            detailBerhasilBTNotificationActivity.cvInfo = null;
            detailBerhasilBTNotificationActivity.tvTransactionType = null;
            detailBerhasilBTNotificationActivity.llShare = null;
            detailBerhasilBTNotificationActivity.lvDetailPenerima = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
