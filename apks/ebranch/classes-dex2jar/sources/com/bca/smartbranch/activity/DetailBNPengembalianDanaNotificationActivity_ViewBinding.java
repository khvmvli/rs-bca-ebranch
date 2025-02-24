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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBNPengembalianDanaNotificationActivity_ViewBinding.class */
public class DetailBNPengembalianDanaNotificationActivity_ViewBinding implements Unbinder {
    private View a;
    private DetailBNPengembalianDanaNotificationActivity b;
    private View c;
    private View d;
    private View e;
    private View j;

    public DetailBNPengembalianDanaNotificationActivity_ViewBinding(final DetailBNPengembalianDanaNotificationActivity detailBNPengembalianDanaNotificationActivity, View view) {
        this.b = detailBNPengembalianDanaNotificationActivity;
        detailBNPengembalianDanaNotificationActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBNPengembalianDanaNotificationActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBNPengembalianDanaNotificationActivity.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299416, "field 'tvNama'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tvTanggal = (TextView) Utils.findRequiredViewAsType(view, 2131299594, "field 'tvTanggal'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tvKurs = (TextView) Utils.findRequiredViewAsType(view, 2131299385, "field 'tvKurs'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tvTotal = (TextView) Utils.findRequiredViewAsType(view, 2131299677, "field 'tvTotal'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tvMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299400, "field 'tvMataUang'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tvJumlahPembelian = (TextView) Utils.findRequiredViewAsType(view, 2131299327, "field 'tvJumlahPembelian'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tvTitlePecahanUang = (TextView) Utils.findRequiredViewAsType(view, 2131299659, "field 'tvTitlePecahanUang'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tvPecahanUang = (TextView) Utils.findRequiredViewAsType(view, 2131299510, "field 'tvPecahanUang'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.llPecahanUang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297841, "field 'llPecahanUang'", LinearLayout.class);
        detailBNPengembalianDanaNotificationActivity.tvMataUangSebelumnya = (TextView) Utils.findRequiredViewAsType(view, 2131299402, "field 'tvMataUangSebelumnya'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tvKursSebelumnya = (TextView) Utils.findRequiredViewAsType(view, 2131299386, "field 'tvKursSebelumnya'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tvTotalSebelumnya = (TextView) Utils.findRequiredViewAsType(view, 2131299685, "field 'tvTotalSebelumnya'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.llDetail = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297621, "field 'llDetail'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297371, "field 'ivHeader' and method 'onToggleTransaksi'");
        detailBNPengembalianDanaNotificationActivity.ivHeader = (ImageView) Utils.castView(findRequiredView, 2131297371, "field 'ivHeader'", ImageView.class);
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNPengembalianDanaNotificationActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBNPengembalianDanaNotificationActivity.onToggleTransaksi(view2);
            }
        });
        detailBNPengembalianDanaNotificationActivity.tvPenilaian = (TextView) Utils.findRequiredViewAsType(view, 2131299536, "field 'tvPenilaian'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'onFocus'");
        detailBNPengembalianDanaNotificationActivity.etKomentar = (EditText) Utils.castView(findRequiredView2, 2131297031, "field 'etKomentar'", EditText.class);
        this.a = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBNPengembalianDanaNotificationActivity_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBNPengembalianDanaNotificationActivity.onFocus(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBNPengembalianDanaNotificationActivity.btnProses = (Button) Utils.castView(findRequiredView3, 2131296440, "field 'btnProses'", Button.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNPengembalianDanaNotificationActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBNPengembalianDanaNotificationActivity.proses(view2);
            }
        });
        detailBNPengembalianDanaNotificationActivity.tvNoRef = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoRef'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tvErrorRating = (TextView) Utils.findRequiredViewAsType(view, 2131299168, "field 'tvErrorRating'", TextView.class);
        detailBNPengembalianDanaNotificationActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBNPengembalianDanaNotificationActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131297650, "method 'onToggleTransaksi'");
        this.e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNPengembalianDanaNotificationActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBNPengembalianDanaNotificationActivity.onToggleTransaksi(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131299268, "method 'onToggleTransaksi'");
        this.j = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNPengembalianDanaNotificationActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBNPengembalianDanaNotificationActivity.onToggleTransaksi(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailBNPengembalianDanaNotificationActivity.mataUangBankNotes = resources.getStringArray(2130903078);
        detailBNPengembalianDanaNotificationActivity.retry = resources.getString(2131822092);
        detailBNPengembalianDanaNotificationActivity.toolbarTitle = resources.getString(2131822201);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBNPengembalianDanaNotificationActivity detailBNPengembalianDanaNotificationActivity = this.b;
        if (detailBNPengembalianDanaNotificationActivity != null) {
            this.b = null;
            detailBNPengembalianDanaNotificationActivity.toolbar = null;
            detailBNPengembalianDanaNotificationActivity.txtToolbarTitle = null;
            detailBNPengembalianDanaNotificationActivity.tvErrorMessage = null;
            detailBNPengembalianDanaNotificationActivity.llMain = null;
            detailBNPengembalianDanaNotificationActivity.tvNama = null;
            detailBNPengembalianDanaNotificationActivity.tvTanggal = null;
            detailBNPengembalianDanaNotificationActivity.tvCabang = null;
            detailBNPengembalianDanaNotificationActivity.tvKurs = null;
            detailBNPengembalianDanaNotificationActivity.tvTotal = null;
            detailBNPengembalianDanaNotificationActivity.tvMataUang = null;
            detailBNPengembalianDanaNotificationActivity.tvJumlahPembelian = null;
            detailBNPengembalianDanaNotificationActivity.tvTitlePecahanUang = null;
            detailBNPengembalianDanaNotificationActivity.tvPecahanUang = null;
            detailBNPengembalianDanaNotificationActivity.llPecahanUang = null;
            detailBNPengembalianDanaNotificationActivity.tvMataUangSebelumnya = null;
            detailBNPengembalianDanaNotificationActivity.tvKursSebelumnya = null;
            detailBNPengembalianDanaNotificationActivity.tvTotalSebelumnya = null;
            detailBNPengembalianDanaNotificationActivity.llDetail = null;
            detailBNPengembalianDanaNotificationActivity.ivHeader = null;
            detailBNPengembalianDanaNotificationActivity.tvPenilaian = null;
            detailBNPengembalianDanaNotificationActivity.ratingBar = null;
            detailBNPengembalianDanaNotificationActivity.etKomentar = null;
            detailBNPengembalianDanaNotificationActivity.btnProses = null;
            detailBNPengembalianDanaNotificationActivity.tvNoRef = null;
            detailBNPengembalianDanaNotificationActivity.tvErrorKomentar = null;
            detailBNPengembalianDanaNotificationActivity.tvErrorRating = null;
            detailBNPengembalianDanaNotificationActivity.tilKomentar = null;
            detailBNPengembalianDanaNotificationActivity.llRating = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.j.setOnClickListener(null);
            this.j = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
