package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.onAcceptKetentuanOR;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBNBerhasilActivity_ViewBinding.class */
public class DetailBNBerhasilActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private DetailBNBerhasilActivity e;

    public DetailBNBerhasilActivity_ViewBinding(final DetailBNBerhasilActivity detailBNBerhasilActivity, View view) {
        this.e = detailBNBerhasilActivity;
        detailBNBerhasilActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBNBerhasilActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBNBerhasilActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBNBerhasilActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBNBerhasilActivity.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299416, "field 'tvNama'", TextView.class);
        detailBNBerhasilActivity.tvMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299400, "field 'tvMataUang'", TextView.class);
        detailBNBerhasilActivity.tvJumlahPembelian = (TextView) Utils.findRequiredViewAsType(view, 2131299327, "field 'tvJumlahPembelian'", TextView.class);
        detailBNBerhasilActivity.tvTitlePecahanUang = (TextView) Utils.findRequiredViewAsType(view, 2131299659, "field 'tvTitlePecahanUang'", TextView.class);
        detailBNBerhasilActivity.tvPecahanUang = (TextView) Utils.findRequiredViewAsType(view, 2131299510, "field 'tvPecahanUang'", TextView.class);
        detailBNBerhasilActivity.llPecahanUang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297841, "field 'llPecahanUang'", LinearLayout.class);
        detailBNBerhasilActivity.tvKurs = (TextView) Utils.findRequiredViewAsType(view, 2131299385, "field 'tvKurs'", TextView.class);
        detailBNBerhasilActivity.tvTotalPembayaran = (TextView) Utils.findRequiredViewAsType(view, 2131299684, "field 'tvTotalPembayaran'", TextView.class);
        detailBNBerhasilActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBNBerhasilActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBNBerhasilActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        detailBNBerhasilActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        detailBNBerhasilActivity.tvNoRef = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoRef'", TextView.class);
        detailBNBerhasilActivity.tvPenilaian = (TextView) Utils.findRequiredViewAsType(view, 2131299536, "field 'tvPenilaian'", TextView.class);
        detailBNBerhasilActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'onFocus'");
        detailBNBerhasilActivity.etKomentar = (EditText) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", EditText.class);
        this.c = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBNBerhasilActivity_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBNBerhasilActivity.onFocus(view2, z);
            }
        });
        detailBNBerhasilActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBNBerhasilActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBNBerhasilActivity.tvErrorRating = (TextView) Utils.findRequiredViewAsType(view, 2131299168, "field 'tvErrorRating'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBNBerhasilActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNBerhasilActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBNBerhasilActivity.proses(view2);
            }
        });
        detailBNBerhasilActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBNBerhasilActivity.btnShare = (Button) Utils.castView(findRequiredView3, 2131296448, "field 'btnShare'", Button.class);
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNBerhasilActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBNBerhasilActivity.share(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.a = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNBerhasilActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBNBerhasilActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailBNBerhasilActivity.mataUangBankNotes = resources.getStringArray(2130903078);
        detailBNBerhasilActivity.retry = resources.getString(2131822092);
        detailBNBerhasilActivity.toolbarTitle = resources.getString(2131822201);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBNBerhasilActivity detailBNBerhasilActivity = this.e;
        if (detailBNBerhasilActivity != null) {
            this.e = null;
            detailBNBerhasilActivity.toolbar = null;
            detailBNBerhasilActivity.txtToolbarTitle = null;
            detailBNBerhasilActivity.tvWaktu = null;
            detailBNBerhasilActivity.tvCabang = null;
            detailBNBerhasilActivity.tvNama = null;
            detailBNBerhasilActivity.tvMataUang = null;
            detailBNBerhasilActivity.tvJumlahPembelian = null;
            detailBNBerhasilActivity.tvTitlePecahanUang = null;
            detailBNBerhasilActivity.tvPecahanUang = null;
            detailBNBerhasilActivity.llPecahanUang = null;
            detailBNBerhasilActivity.tvKurs = null;
            detailBNBerhasilActivity.tvTotalPembayaran = null;
            detailBNBerhasilActivity.tvStatus = null;
            detailBNBerhasilActivity.llMain = null;
            detailBNBerhasilActivity.tvErrorMessage = null;
            detailBNBerhasilActivity.llRating = null;
            detailBNBerhasilActivity.tvNoRef = null;
            detailBNBerhasilActivity.tvPenilaian = null;
            detailBNBerhasilActivity.ratingBar = null;
            detailBNBerhasilActivity.etKomentar = null;
            detailBNBerhasilActivity.tilKomentar = null;
            detailBNBerhasilActivity.tvErrorKomentar = null;
            detailBNBerhasilActivity.tvErrorRating = null;
            detailBNBerhasilActivity.btnProses = null;
            detailBNBerhasilActivity.llShare = null;
            detailBNBerhasilActivity.btnShare = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
