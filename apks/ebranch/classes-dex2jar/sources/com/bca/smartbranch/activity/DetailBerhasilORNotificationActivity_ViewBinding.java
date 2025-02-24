package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilORNotificationActivity_ViewBinding.class */
public class DetailBerhasilORNotificationActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private DetailBerhasilORNotificationActivity c;
    private View e;

    public DetailBerhasilORNotificationActivity_ViewBinding(final DetailBerhasilORNotificationActivity detailBerhasilORNotificationActivity, View view) {
        this.c = detailBerhasilORNotificationActivity;
        detailBerhasilORNotificationActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBerhasilORNotificationActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBerhasilORNotificationActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChange'");
        detailBerhasilORNotificationActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.a = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilORNotificationActivity_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBerhasilORNotificationActivity.inputChange(view2, z);
            }
        });
        detailBerhasilORNotificationActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBerhasilORNotificationActivity.etAlasan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296945, "field 'etAlasan'", LogoutDialog.class);
        detailBerhasilORNotificationActivity.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        detailBerhasilORNotificationActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBerhasilORNotificationActivity.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
        detailBerhasilORNotificationActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBerhasilORNotificationActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        detailBerhasilORNotificationActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBerhasilORNotificationActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilORNotificationActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilORNotificationActivity.proses(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBerhasilORNotificationActivity.btnShare = (Button) Utils.castView(findRequiredView3, 2131296448, "field 'btnShare'", Button.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilORNotificationActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilORNotificationActivity.share(view2);
            }
        });
        detailBerhasilORNotificationActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBerhasilORNotificationActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBerhasilORNotificationActivity.tvNamaPengirim = (TextView) Utils.findRequiredViewAsType(view, 2131298910, "field 'tvNamaPengirim'", TextView.class);
        detailBerhasilORNotificationActivity.tvNamaPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131298904, "field 'tvNamaPenerima'", TextView.class);
        detailBerhasilORNotificationActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBerhasilORNotificationActivity.tvNoTelpCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299495, "field 'tvNoTelpCabang'", TextView.class);
        detailBerhasilORNotificationActivity.tvKodeSwift = (TextView) Utils.findRequiredViewAsType(view, 2131299373, "field 'tvKodeSwift'", TextView.class);
        detailBerhasilORNotificationActivity.tvBankPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131298836, "field 'tvBankPenerima'", TextView.class);
        detailBerhasilORNotificationActivity.tvMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299400, "field 'tvMataUang'", TextView.class);
        detailBerhasilORNotificationActivity.tvNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299485, "field 'tvNominal'", TextView.class);
        detailBerhasilORNotificationActivity.tvSumberDana1 = (TextView) Utils.findRequiredViewAsType(view, 2131299589, "field 'tvSumberDana1'", TextView.class);
        detailBerhasilORNotificationActivity.tvSumberDana2 = (TextView) Utils.findRequiredViewAsType(view, 2131299590, "field 'tvSumberDana2'", TextView.class);
        detailBerhasilORNotificationActivity.tvFullAmount = (TextView) Utils.findRequiredViewAsType(view, 2131299262, "field 'tvFullAmount'", TextView.class);
        detailBerhasilORNotificationActivity.tvTodayTelex = (TextView) Utils.findRequiredViewAsType(view, 2131299676, "field 'tvTodayTelex'", TextView.class);
        detailBerhasilORNotificationActivity.tvBerita = (TextView) Utils.findRequiredViewAsType(view, 2131298847, "field 'tvBerita'", TextView.class);
        detailBerhasilORNotificationActivity.tvNoPpu = (TextView) Utils.findRequiredViewAsType(view, 2131299493, "field 'tvNoPpu'", TextView.class);
        detailBerhasilORNotificationActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailBerhasilORNotificationActivity.llCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'llCabang'", LinearLayout.class);
        detailBerhasilORNotificationActivity.llNoTelpCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297825, "field 'llNoTelpCabang'", LinearLayout.class);
        detailBerhasilORNotificationActivity.llKodeSwift = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297738, "field 'llKodeSwift'", LinearLayout.class);
        detailBerhasilORNotificationActivity.llSumberDana1 = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297898, "field 'llSumberDana1'", LinearLayout.class);
        detailBerhasilORNotificationActivity.llSumberDana2 = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297899, "field 'llSumberDana2'", LinearLayout.class);
        detailBerhasilORNotificationActivity.llFullAmount = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297646, "field 'llFullAmount'", LinearLayout.class);
        detailBerhasilORNotificationActivity.llTodayTelex = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297918, "field 'llTodayTelex'", LinearLayout.class);
        detailBerhasilORNotificationActivity.llBerita = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297548, "field 'llBerita'", LinearLayout.class);
        detailBerhasilORNotificationActivity.llNoPpu = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297822, "field 'llNoPpu'", LinearLayout.class);
        detailBerhasilORNotificationActivity.tvTitleWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299674, "field 'tvTitleWaktu'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitlePenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299660, "field 'tvTitlePenerima'", TextView.class);
        detailBerhasilORNotificationActivity.tvtitlePengirim = (TextView) Utils.findRequiredViewAsType(view, 2131299662, "field 'tvtitlePengirim'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitleCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299627, "field 'tvTitleCabang'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitleNoTelpCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299654, "field 'tvTitleNoTelpCabang'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitleKodeSwift = (TextView) Utils.findRequiredViewAsType(view, 2131299634, "field 'tvTitleKodeSwift'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitleBankPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299620, "field 'tvTitleBankPenerima'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitleMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299640, "field 'tvTitleMataUang'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitleNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299655, "field 'tvTitleNominal'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitleSumberDana1 = (TextView) Utils.findRequiredViewAsType(view, 2131299666, "field 'tvTitleSumberDana1'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitleSumberDana2 = (TextView) Utils.findRequiredViewAsType(view, 2131299667, "field 'tvTitleSumberDana2'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitleFullAmount = (TextView) Utils.findRequiredViewAsType(view, 2131299624, "field 'tvTitleFullAmount'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitleTodayTelex = (TextView) Utils.findRequiredViewAsType(view, 2131299625, "field 'tvTitleTodayTelex'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitleBerita = (TextView) Utils.findRequiredViewAsType(view, 2131299623, "field 'tvTitleBerita'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitleNoPpu = (TextView) Utils.findRequiredViewAsType(view, 2131299652, "field 'tvTitleNoPpu'", TextView.class);
        detailBerhasilORNotificationActivity.tvTitleNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299653, "field 'tvTitleNoReferensi'", TextView.class);
        detailBerhasilORNotificationActivity.llCatatan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297566, "field 'llCatatan'", LinearLayout.class);
        detailBerhasilORNotificationActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        detailBerhasilORNotificationActivity.cvInfo = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296838, "field 'cvInfo'", setSplitTrack.class);
        Resources resources = view.getContext().getResources();
        detailBerhasilORNotificationActivity.retry = resources.getString(2131822092);
        detailBerhasilORNotificationActivity.toolbarTitle = resources.getString(2131822262);
        detailBerhasilORNotificationActivity.waktuEnglish = resources.getString(2131822345);
        detailBerhasilORNotificationActivity.penerimaEnglish = resources.getString(2131822010);
        detailBerhasilORNotificationActivity.pengirimEnglish = resources.getString(2131822029);
        detailBerhasilORNotificationActivity.cabangEnglish = resources.getString(2131821416);
        detailBerhasilORNotificationActivity.noTelpEnglish = resources.getString(2131821951);
        detailBerhasilORNotificationActivity.kodeSwiftEnglish = resources.getString(2131821809);
        detailBerhasilORNotificationActivity.bankPenerimaEnglish = resources.getString(2131821350);
        detailBerhasilORNotificationActivity.mataUangEnglish = resources.getString(2131821891);
        detailBerhasilORNotificationActivity.nominalEnglish = resources.getString(2131821956);
        detailBerhasilORNotificationActivity.sumberDana1English = resources.getString(2131822137);
        detailBerhasilORNotificationActivity.sumberDana2English = resources.getString(2131822139);
        detailBerhasilORNotificationActivity.biayaFullAmountEnglish = resources.getString(2131821373);
        detailBerhasilORNotificationActivity.biayaTodayTelexEnglish = resources.getString(2131821375);
        detailBerhasilORNotificationActivity.beritaEnglish = resources.getString(2131821370);
        detailBerhasilORNotificationActivity.nomorPPUEnglish = resources.getString(2131821963);
        detailBerhasilORNotificationActivity.noReferensiEnglish = resources.getString(2131821948);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBerhasilORNotificationActivity detailBerhasilORNotificationActivity = this.c;
        if (detailBerhasilORNotificationActivity != null) {
            this.c = null;
            detailBerhasilORNotificationActivity.toolbar = null;
            detailBerhasilORNotificationActivity.txtToolbarTitle = null;
            detailBerhasilORNotificationActivity.tvErrorMessage = null;
            detailBerhasilORNotificationActivity.etKomentar = null;
            detailBerhasilORNotificationActivity.tilKomentar = null;
            detailBerhasilORNotificationActivity.etAlasan = null;
            detailBerhasilORNotificationActivity.tilAlasan = null;
            detailBerhasilORNotificationActivity.tvStatus = null;
            detailBerhasilORNotificationActivity.tvTransaksi = null;
            detailBerhasilORNotificationActivity.llMain = null;
            detailBerhasilORNotificationActivity.ratingBar = null;
            detailBerhasilORNotificationActivity.llRating = null;
            detailBerhasilORNotificationActivity.btnProses = null;
            detailBerhasilORNotificationActivity.btnShare = null;
            detailBerhasilORNotificationActivity.tvErrorKomentar = null;
            detailBerhasilORNotificationActivity.tvWaktu = null;
            detailBerhasilORNotificationActivity.tvNamaPengirim = null;
            detailBerhasilORNotificationActivity.tvNamaPenerima = null;
            detailBerhasilORNotificationActivity.tvCabang = null;
            detailBerhasilORNotificationActivity.tvNoTelpCabang = null;
            detailBerhasilORNotificationActivity.tvKodeSwift = null;
            detailBerhasilORNotificationActivity.tvBankPenerima = null;
            detailBerhasilORNotificationActivity.tvMataUang = null;
            detailBerhasilORNotificationActivity.tvNominal = null;
            detailBerhasilORNotificationActivity.tvSumberDana1 = null;
            detailBerhasilORNotificationActivity.tvSumberDana2 = null;
            detailBerhasilORNotificationActivity.tvFullAmount = null;
            detailBerhasilORNotificationActivity.tvTodayTelex = null;
            detailBerhasilORNotificationActivity.tvBerita = null;
            detailBerhasilORNotificationActivity.tvNoPpu = null;
            detailBerhasilORNotificationActivity.tvNoReferensi = null;
            detailBerhasilORNotificationActivity.llCabang = null;
            detailBerhasilORNotificationActivity.llNoTelpCabang = null;
            detailBerhasilORNotificationActivity.llKodeSwift = null;
            detailBerhasilORNotificationActivity.llSumberDana1 = null;
            detailBerhasilORNotificationActivity.llSumberDana2 = null;
            detailBerhasilORNotificationActivity.llFullAmount = null;
            detailBerhasilORNotificationActivity.llTodayTelex = null;
            detailBerhasilORNotificationActivity.llBerita = null;
            detailBerhasilORNotificationActivity.llNoPpu = null;
            detailBerhasilORNotificationActivity.tvTitleWaktu = null;
            detailBerhasilORNotificationActivity.tvTitlePenerima = null;
            detailBerhasilORNotificationActivity.tvtitlePengirim = null;
            detailBerhasilORNotificationActivity.tvTitleCabang = null;
            detailBerhasilORNotificationActivity.tvTitleNoTelpCabang = null;
            detailBerhasilORNotificationActivity.tvTitleKodeSwift = null;
            detailBerhasilORNotificationActivity.tvTitleBankPenerima = null;
            detailBerhasilORNotificationActivity.tvTitleMataUang = null;
            detailBerhasilORNotificationActivity.tvTitleNominal = null;
            detailBerhasilORNotificationActivity.tvTitleSumberDana1 = null;
            detailBerhasilORNotificationActivity.tvTitleSumberDana2 = null;
            detailBerhasilORNotificationActivity.tvTitleFullAmount = null;
            detailBerhasilORNotificationActivity.tvTitleTodayTelex = null;
            detailBerhasilORNotificationActivity.tvTitleBerita = null;
            detailBerhasilORNotificationActivity.tvTitleNoPpu = null;
            detailBerhasilORNotificationActivity.tvTitleNoReferensi = null;
            detailBerhasilORNotificationActivity.llCatatan = null;
            detailBerhasilORNotificationActivity.llShare = null;
            detailBerhasilORNotificationActivity.cvInfo = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
