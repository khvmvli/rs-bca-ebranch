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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilORActivity_ViewBinding.class */
public class DetailBerhasilORActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private DetailBerhasilORActivity c;
    private View d;
    private View e;

    public DetailBerhasilORActivity_ViewBinding(final DetailBerhasilORActivity detailBerhasilORActivity, View view) {
        this.c = detailBerhasilORActivity;
        detailBerhasilORActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBerhasilORActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBerhasilORActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChange'");
        detailBerhasilORActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilORActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBerhasilORActivity.inputChange(view2, z);
            }
        });
        detailBerhasilORActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBerhasilORActivity.etAlasan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296945, "field 'etAlasan'", LogoutDialog.class);
        detailBerhasilORActivity.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        detailBerhasilORActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBerhasilORActivity.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
        detailBerhasilORActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBerhasilORActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        detailBerhasilORActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBerhasilORActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilORActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilORActivity.proses(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBerhasilORActivity.btnShare = (Button) Utils.castView(findRequiredView3, 2131296448, "field 'btnShare'", Button.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilORActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilORActivity.share(view2);
            }
        });
        detailBerhasilORActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBerhasilORActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBerhasilORActivity.tvNamaPengirim = (TextView) Utils.findRequiredViewAsType(view, 2131298910, "field 'tvNamaPengirim'", TextView.class);
        detailBerhasilORActivity.tvNamaPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131298904, "field 'tvNamaPenerima'", TextView.class);
        detailBerhasilORActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBerhasilORActivity.tvNoTelpCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299495, "field 'tvNoTelpCabang'", TextView.class);
        detailBerhasilORActivity.tvKodeSwift = (TextView) Utils.findRequiredViewAsType(view, 2131299373, "field 'tvKodeSwift'", TextView.class);
        detailBerhasilORActivity.tvBankPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131298836, "field 'tvBankPenerima'", TextView.class);
        detailBerhasilORActivity.tvMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299400, "field 'tvMataUang'", TextView.class);
        detailBerhasilORActivity.tvNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299485, "field 'tvNominal'", TextView.class);
        detailBerhasilORActivity.tvSumberDana1 = (TextView) Utils.findRequiredViewAsType(view, 2131299589, "field 'tvSumberDana1'", TextView.class);
        detailBerhasilORActivity.tvSumberDana2 = (TextView) Utils.findRequiredViewAsType(view, 2131299590, "field 'tvSumberDana2'", TextView.class);
        detailBerhasilORActivity.tvFullAmount = (TextView) Utils.findRequiredViewAsType(view, 2131299262, "field 'tvFullAmount'", TextView.class);
        detailBerhasilORActivity.tvTodayTelex = (TextView) Utils.findRequiredViewAsType(view, 2131299676, "field 'tvTodayTelex'", TextView.class);
        detailBerhasilORActivity.tvBerita = (TextView) Utils.findRequiredViewAsType(view, 2131298847, "field 'tvBerita'", TextView.class);
        detailBerhasilORActivity.tvNoPpu = (TextView) Utils.findRequiredViewAsType(view, 2131299493, "field 'tvNoPpu'", TextView.class);
        detailBerhasilORActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailBerhasilORActivity.llCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'llCabang'", LinearLayout.class);
        detailBerhasilORActivity.llNoTelpCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297825, "field 'llNoTelpCabang'", LinearLayout.class);
        detailBerhasilORActivity.llKodeSwift = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297738, "field 'llKodeSwift'", LinearLayout.class);
        detailBerhasilORActivity.llSumberDana1 = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297898, "field 'llSumberDana1'", LinearLayout.class);
        detailBerhasilORActivity.llSumberDana2 = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297899, "field 'llSumberDana2'", LinearLayout.class);
        detailBerhasilORActivity.llFullAmount = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297646, "field 'llFullAmount'", LinearLayout.class);
        detailBerhasilORActivity.llTodayTelex = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297918, "field 'llTodayTelex'", LinearLayout.class);
        detailBerhasilORActivity.llBerita = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297548, "field 'llBerita'", LinearLayout.class);
        detailBerhasilORActivity.llNoPpu = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297822, "field 'llNoPpu'", LinearLayout.class);
        detailBerhasilORActivity.tvTitleWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299674, "field 'tvTitleWaktu'", TextView.class);
        detailBerhasilORActivity.tvTitlePenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299660, "field 'tvTitlePenerima'", TextView.class);
        detailBerhasilORActivity.tvtitlePengirim = (TextView) Utils.findRequiredViewAsType(view, 2131299662, "field 'tvtitlePengirim'", TextView.class);
        detailBerhasilORActivity.tvTitleCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299627, "field 'tvTitleCabang'", TextView.class);
        detailBerhasilORActivity.tvTitleNoTelpCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299654, "field 'tvTitleNoTelpCabang'", TextView.class);
        detailBerhasilORActivity.tvTitleKodeSwift = (TextView) Utils.findRequiredViewAsType(view, 2131299634, "field 'tvTitleKodeSwift'", TextView.class);
        detailBerhasilORActivity.tvTitleBankPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299620, "field 'tvTitleBankPenerima'", TextView.class);
        detailBerhasilORActivity.tvTitleMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299640, "field 'tvTitleMataUang'", TextView.class);
        detailBerhasilORActivity.tvTitleNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299655, "field 'tvTitleNominal'", TextView.class);
        detailBerhasilORActivity.tvTitleSumberDana1 = (TextView) Utils.findRequiredViewAsType(view, 2131299666, "field 'tvTitleSumberDana1'", TextView.class);
        detailBerhasilORActivity.tvTitleSumberDana2 = (TextView) Utils.findRequiredViewAsType(view, 2131299667, "field 'tvTitleSumberDana2'", TextView.class);
        detailBerhasilORActivity.tvTitleFullAmount = (TextView) Utils.findRequiredViewAsType(view, 2131299624, "field 'tvTitleFullAmount'", TextView.class);
        detailBerhasilORActivity.tvTitleTodayTelex = (TextView) Utils.findRequiredViewAsType(view, 2131299625, "field 'tvTitleTodayTelex'", TextView.class);
        detailBerhasilORActivity.tvTitleBerita = (TextView) Utils.findRequiredViewAsType(view, 2131299623, "field 'tvTitleBerita'", TextView.class);
        detailBerhasilORActivity.tvTitleNoPpu = (TextView) Utils.findRequiredViewAsType(view, 2131299652, "field 'tvTitleNoPpu'", TextView.class);
        detailBerhasilORActivity.tvTitleNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299653, "field 'tvTitleNoReferensi'", TextView.class);
        detailBerhasilORActivity.llCatatan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297566, "field 'llCatatan'", LinearLayout.class);
        detailBerhasilORActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        detailBerhasilORActivity.cvInfo = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296838, "field 'cvInfo'", setSplitTrack.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.b = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilORActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilORActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailBerhasilORActivity.retry = resources.getString(2131822092);
        detailBerhasilORActivity.toolbarTitle = resources.getString(2131822262);
        detailBerhasilORActivity.waktuEnglish = resources.getString(2131822345);
        detailBerhasilORActivity.penerimaEnglish = resources.getString(2131822010);
        detailBerhasilORActivity.pengirimEnglish = resources.getString(2131822029);
        detailBerhasilORActivity.cabangEnglish = resources.getString(2131821416);
        detailBerhasilORActivity.noTelpEnglish = resources.getString(2131821951);
        detailBerhasilORActivity.kodeSwiftEnglish = resources.getString(2131821809);
        detailBerhasilORActivity.bankPenerimaEnglish = resources.getString(2131821350);
        detailBerhasilORActivity.mataUangEnglish = resources.getString(2131821891);
        detailBerhasilORActivity.nominalEnglish = resources.getString(2131821956);
        detailBerhasilORActivity.sumberDana1English = resources.getString(2131822137);
        detailBerhasilORActivity.sumberDana2English = resources.getString(2131822139);
        detailBerhasilORActivity.biayaFullAmountEnglish = resources.getString(2131821373);
        detailBerhasilORActivity.biayaTodayTelexEnglish = resources.getString(2131821375);
        detailBerhasilORActivity.beritaEnglish = resources.getString(2131821370);
        detailBerhasilORActivity.nomorPPUEnglish = resources.getString(2131821963);
        detailBerhasilORActivity.noReferensiEnglish = resources.getString(2131821948);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBerhasilORActivity detailBerhasilORActivity = this.c;
        if (detailBerhasilORActivity != null) {
            this.c = null;
            detailBerhasilORActivity.toolbar = null;
            detailBerhasilORActivity.txtToolbarTitle = null;
            detailBerhasilORActivity.tvErrorMessage = null;
            detailBerhasilORActivity.etKomentar = null;
            detailBerhasilORActivity.tilKomentar = null;
            detailBerhasilORActivity.etAlasan = null;
            detailBerhasilORActivity.tilAlasan = null;
            detailBerhasilORActivity.tvStatus = null;
            detailBerhasilORActivity.tvTransaksi = null;
            detailBerhasilORActivity.llMain = null;
            detailBerhasilORActivity.ratingBar = null;
            detailBerhasilORActivity.llRating = null;
            detailBerhasilORActivity.btnProses = null;
            detailBerhasilORActivity.btnShare = null;
            detailBerhasilORActivity.tvErrorKomentar = null;
            detailBerhasilORActivity.tvWaktu = null;
            detailBerhasilORActivity.tvNamaPengirim = null;
            detailBerhasilORActivity.tvNamaPenerima = null;
            detailBerhasilORActivity.tvCabang = null;
            detailBerhasilORActivity.tvNoTelpCabang = null;
            detailBerhasilORActivity.tvKodeSwift = null;
            detailBerhasilORActivity.tvBankPenerima = null;
            detailBerhasilORActivity.tvMataUang = null;
            detailBerhasilORActivity.tvNominal = null;
            detailBerhasilORActivity.tvSumberDana1 = null;
            detailBerhasilORActivity.tvSumberDana2 = null;
            detailBerhasilORActivity.tvFullAmount = null;
            detailBerhasilORActivity.tvTodayTelex = null;
            detailBerhasilORActivity.tvBerita = null;
            detailBerhasilORActivity.tvNoPpu = null;
            detailBerhasilORActivity.tvNoReferensi = null;
            detailBerhasilORActivity.llCabang = null;
            detailBerhasilORActivity.llNoTelpCabang = null;
            detailBerhasilORActivity.llKodeSwift = null;
            detailBerhasilORActivity.llSumberDana1 = null;
            detailBerhasilORActivity.llSumberDana2 = null;
            detailBerhasilORActivity.llFullAmount = null;
            detailBerhasilORActivity.llTodayTelex = null;
            detailBerhasilORActivity.llBerita = null;
            detailBerhasilORActivity.llNoPpu = null;
            detailBerhasilORActivity.tvTitleWaktu = null;
            detailBerhasilORActivity.tvTitlePenerima = null;
            detailBerhasilORActivity.tvtitlePengirim = null;
            detailBerhasilORActivity.tvTitleCabang = null;
            detailBerhasilORActivity.tvTitleNoTelpCabang = null;
            detailBerhasilORActivity.tvTitleKodeSwift = null;
            detailBerhasilORActivity.tvTitleBankPenerima = null;
            detailBerhasilORActivity.tvTitleMataUang = null;
            detailBerhasilORActivity.tvTitleNominal = null;
            detailBerhasilORActivity.tvTitleSumberDana1 = null;
            detailBerhasilORActivity.tvTitleSumberDana2 = null;
            detailBerhasilORActivity.tvTitleFullAmount = null;
            detailBerhasilORActivity.tvTitleTodayTelex = null;
            detailBerhasilORActivity.tvTitleBerita = null;
            detailBerhasilORActivity.tvTitleNoPpu = null;
            detailBerhasilORActivity.tvTitleNoReferensi = null;
            detailBerhasilORActivity.llCatatan = null;
            detailBerhasilORActivity.llShare = null;
            detailBerhasilORActivity.cvInfo = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
