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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBNBerhasilNotificationActivity_ViewBinding.class */
public class DetailBNBerhasilNotificationActivity_ViewBinding implements Unbinder {
    private View a;
    private DetailBNBerhasilNotificationActivity b;
    private View c;
    private View d;

    public DetailBNBerhasilNotificationActivity_ViewBinding(final DetailBNBerhasilNotificationActivity detailBNBerhasilNotificationActivity, View view) {
        this.b = detailBNBerhasilNotificationActivity;
        detailBNBerhasilNotificationActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBNBerhasilNotificationActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBNBerhasilNotificationActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBNBerhasilNotificationActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBNBerhasilNotificationActivity.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299416, "field 'tvNama'", TextView.class);
        detailBNBerhasilNotificationActivity.tvMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299400, "field 'tvMataUang'", TextView.class);
        detailBNBerhasilNotificationActivity.tvJumlahPembelian = (TextView) Utils.findRequiredViewAsType(view, 2131299327, "field 'tvJumlahPembelian'", TextView.class);
        detailBNBerhasilNotificationActivity.tvKurs = (TextView) Utils.findRequiredViewAsType(view, 2131299385, "field 'tvKurs'", TextView.class);
        detailBNBerhasilNotificationActivity.tvTotalPembayaran = (TextView) Utils.findRequiredViewAsType(view, 2131299684, "field 'tvTotalPembayaran'", TextView.class);
        detailBNBerhasilNotificationActivity.tvTitlePecahanUang = (TextView) Utils.findRequiredViewAsType(view, 2131299659, "field 'tvTitlePecahanUang'", TextView.class);
        detailBNBerhasilNotificationActivity.tvPecahanUang = (TextView) Utils.findRequiredViewAsType(view, 2131299510, "field 'tvPecahanUang'", TextView.class);
        detailBNBerhasilNotificationActivity.llPecahanUang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297841, "field 'llPecahanUang'", LinearLayout.class);
        detailBNBerhasilNotificationActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBNBerhasilNotificationActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBNBerhasilNotificationActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        detailBNBerhasilNotificationActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        detailBNBerhasilNotificationActivity.tvNoRef = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoRef'", TextView.class);
        detailBNBerhasilNotificationActivity.tvPenilaian = (TextView) Utils.findRequiredViewAsType(view, 2131299536, "field 'tvPenilaian'", TextView.class);
        detailBNBerhasilNotificationActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'onFocus'");
        detailBNBerhasilNotificationActivity.etKomentar = (EditText) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", EditText.class);
        this.a = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBNBerhasilNotificationActivity.onFocus(view2, z);
            }
        });
        detailBNBerhasilNotificationActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBNBerhasilNotificationActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBNBerhasilNotificationActivity.tvErrorRating = (TextView) Utils.findRequiredViewAsType(view, 2131299168, "field 'tvErrorRating'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBNBerhasilNotificationActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBNBerhasilNotificationActivity.proses(view2);
            }
        });
        detailBNBerhasilNotificationActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBNBerhasilNotificationActivity.btnShare = (Button) Utils.castView(findRequiredView3, 2131296448, "field 'btnShare'", Button.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBNBerhasilNotificationActivity.share(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailBNBerhasilNotificationActivity.mataUangBankNotes = resources.getStringArray(2130903078);
        detailBNBerhasilNotificationActivity.retry = resources.getString(2131822092);
        detailBNBerhasilNotificationActivity.toolbarTitle = resources.getString(2131822201);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBNBerhasilNotificationActivity detailBNBerhasilNotificationActivity = this.b;
        if (detailBNBerhasilNotificationActivity != null) {
            this.b = null;
            detailBNBerhasilNotificationActivity.toolbar = null;
            detailBNBerhasilNotificationActivity.txtToolbarTitle = null;
            detailBNBerhasilNotificationActivity.tvWaktu = null;
            detailBNBerhasilNotificationActivity.tvCabang = null;
            detailBNBerhasilNotificationActivity.tvNama = null;
            detailBNBerhasilNotificationActivity.tvMataUang = null;
            detailBNBerhasilNotificationActivity.tvJumlahPembelian = null;
            detailBNBerhasilNotificationActivity.tvKurs = null;
            detailBNBerhasilNotificationActivity.tvTotalPembayaran = null;
            detailBNBerhasilNotificationActivity.tvTitlePecahanUang = null;
            detailBNBerhasilNotificationActivity.tvPecahanUang = null;
            detailBNBerhasilNotificationActivity.llPecahanUang = null;
            detailBNBerhasilNotificationActivity.tvStatus = null;
            detailBNBerhasilNotificationActivity.llMain = null;
            detailBNBerhasilNotificationActivity.tvErrorMessage = null;
            detailBNBerhasilNotificationActivity.llRating = null;
            detailBNBerhasilNotificationActivity.tvNoRef = null;
            detailBNBerhasilNotificationActivity.tvPenilaian = null;
            detailBNBerhasilNotificationActivity.ratingBar = null;
            detailBNBerhasilNotificationActivity.etKomentar = null;
            detailBNBerhasilNotificationActivity.tilKomentar = null;
            detailBNBerhasilNotificationActivity.tvErrorKomentar = null;
            detailBNBerhasilNotificationActivity.tvErrorRating = null;
            detailBNBerhasilNotificationActivity.btnProses = null;
            detailBNBerhasilNotificationActivity.llShare = null;
            detailBNBerhasilNotificationActivity.btnShare = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
