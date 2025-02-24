package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.onAcceptKetentuanOR;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBNPengembalianDanaActivity_ViewBinding.class */
public class DetailBNPengembalianDanaActivity_ViewBinding implements Unbinder {
    private DetailBNPengembalianDanaActivity a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View h;

    public DetailBNPengembalianDanaActivity_ViewBinding(final DetailBNPengembalianDanaActivity detailBNPengembalianDanaActivity, View view) {
        this.a = detailBNPengembalianDanaActivity;
        detailBNPengembalianDanaActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBNPengembalianDanaActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBNPengembalianDanaActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        detailBNPengembalianDanaActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBNPengembalianDanaActivity.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299416, "field 'tvNama'", TextView.class);
        detailBNPengembalianDanaActivity.tvTanggal = (TextView) Utils.findRequiredViewAsType(view, 2131299594, "field 'tvTanggal'", TextView.class);
        detailBNPengembalianDanaActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBNPengembalianDanaActivity.tvKurs = (TextView) Utils.findRequiredViewAsType(view, 2131299385, "field 'tvKurs'", TextView.class);
        detailBNPengembalianDanaActivity.tvTotal = (TextView) Utils.findRequiredViewAsType(view, 2131299677, "field 'tvTotal'", TextView.class);
        detailBNPengembalianDanaActivity.tvMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299400, "field 'tvMataUang'", TextView.class);
        detailBNPengembalianDanaActivity.tvJumlahPembelian = (TextView) Utils.findRequiredViewAsType(view, 2131299327, "field 'tvJumlahPembelian'", TextView.class);
        detailBNPengembalianDanaActivity.tvTitlePecahanUang = (TextView) Utils.findRequiredViewAsType(view, 2131299659, "field 'tvTitlePecahanUang'", TextView.class);
        detailBNPengembalianDanaActivity.tvPecahanUang = (TextView) Utils.findRequiredViewAsType(view, 2131299510, "field 'tvPecahanUang'", TextView.class);
        detailBNPengembalianDanaActivity.llPecahanUang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297841, "field 'llPecahanUang'", LinearLayout.class);
        detailBNPengembalianDanaActivity.tvMataUangSebelumnya = (TextView) Utils.findRequiredViewAsType(view, 2131299402, "field 'tvMataUangSebelumnya'", TextView.class);
        detailBNPengembalianDanaActivity.tvKursSebelumnya = (TextView) Utils.findRequiredViewAsType(view, 2131299386, "field 'tvKursSebelumnya'", TextView.class);
        detailBNPengembalianDanaActivity.tvTotalSebelumnya = (TextView) Utils.findRequiredViewAsType(view, 2131299685, "field 'tvTotalSebelumnya'", TextView.class);
        detailBNPengembalianDanaActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297371, "field 'ivHeader' and method 'onToggleTransaksi'");
        detailBNPengembalianDanaActivity.ivHeader = (ImageView) Utils.castView(findRequiredView, 2131297371, "field 'ivHeader'", ImageView.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNPengembalianDanaActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBNPengembalianDanaActivity.onToggleTransaksi(view2);
            }
        });
        detailBNPengembalianDanaActivity.tvPenilaian = (TextView) Utils.findRequiredViewAsType(view, 2131299536, "field 'tvPenilaian'", TextView.class);
        detailBNPengembalianDanaActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'onFocus'");
        detailBNPengembalianDanaActivity.etKomentar = (EditText) Utils.castView(findRequiredView2, 2131297031, "field 'etKomentar'", EditText.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBNPengembalianDanaActivity_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBNPengembalianDanaActivity.onFocus(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBNPengembalianDanaActivity.btnProses = (Button) Utils.castView(findRequiredView3, 2131296440, "field 'btnProses'", Button.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNPengembalianDanaActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBNPengembalianDanaActivity.proses(view2);
            }
        });
        detailBNPengembalianDanaActivity.tvNoRef = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoRef'", TextView.class);
        detailBNPengembalianDanaActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBNPengembalianDanaActivity.tvErrorRating = (TextView) Utils.findRequiredViewAsType(view, 2131299168, "field 'tvErrorRating'", TextView.class);
        detailBNPengembalianDanaActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBNPengembalianDanaActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131297650, "method 'onToggleTransaksi'");
        this.e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNPengembalianDanaActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBNPengembalianDanaActivity.onToggleTransaksi(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131299268, "method 'onToggleTransaksi'");
        this.h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNPengembalianDanaActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBNPengembalianDanaActivity.onToggleTransaksi(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailBNPengembalianDanaActivity.mataUangBankNotes = resources.getStringArray(2130903078);
        detailBNPengembalianDanaActivity.retry = resources.getString(2131822092);
        detailBNPengembalianDanaActivity.toolbarTitle = resources.getString(2131822201);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBNPengembalianDanaActivity detailBNPengembalianDanaActivity = this.a;
        if (detailBNPengembalianDanaActivity != null) {
            this.a = null;
            detailBNPengembalianDanaActivity.toolbar = null;
            detailBNPengembalianDanaActivity.txtToolbarTitle = null;
            detailBNPengembalianDanaActivity.tvErrorMessage = null;
            detailBNPengembalianDanaActivity.llMain = null;
            detailBNPengembalianDanaActivity.tvNama = null;
            detailBNPengembalianDanaActivity.tvTanggal = null;
            detailBNPengembalianDanaActivity.tvCabang = null;
            detailBNPengembalianDanaActivity.tvKurs = null;
            detailBNPengembalianDanaActivity.tvTotal = null;
            detailBNPengembalianDanaActivity.tvMataUang = null;
            detailBNPengembalianDanaActivity.tvJumlahPembelian = null;
            detailBNPengembalianDanaActivity.tvTitlePecahanUang = null;
            detailBNPengembalianDanaActivity.tvPecahanUang = null;
            detailBNPengembalianDanaActivity.llPecahanUang = null;
            detailBNPengembalianDanaActivity.tvMataUangSebelumnya = null;
            detailBNPengembalianDanaActivity.tvKursSebelumnya = null;
            detailBNPengembalianDanaActivity.tvTotalSebelumnya = null;
            detailBNPengembalianDanaActivity.llDetail = null;
            detailBNPengembalianDanaActivity.ivHeader = null;
            detailBNPengembalianDanaActivity.tvPenilaian = null;
            detailBNPengembalianDanaActivity.ratingBar = null;
            detailBNPengembalianDanaActivity.etKomentar = null;
            detailBNPengembalianDanaActivity.btnProses = null;
            detailBNPengembalianDanaActivity.tvNoRef = null;
            detailBNPengembalianDanaActivity.tvErrorKomentar = null;
            detailBNPengembalianDanaActivity.tvErrorRating = null;
            detailBNPengembalianDanaActivity.tilKomentar = null;
            detailBNPengembalianDanaActivity.llRating = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.h.setOnClickListener(null);
            this.h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
