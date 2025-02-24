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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilTellerNotificationActivity_ViewBinding.class */
public class DetailBerhasilTellerNotificationActivity_ViewBinding implements Unbinder {
    private DetailBerhasilTellerNotificationActivity a;
    private View b;
    private View d;
    private View e;

    public DetailBerhasilTellerNotificationActivity_ViewBinding(final DetailBerhasilTellerNotificationActivity detailBerhasilTellerNotificationActivity, View view) {
        this.a = detailBerhasilTellerNotificationActivity;
        detailBerhasilTellerNotificationActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBerhasilTellerNotificationActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBerhasilTellerNotificationActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChange'");
        detailBerhasilTellerNotificationActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.d = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBerhasilTellerNotificationActivity.inputChange(view2, z);
            }
        });
        detailBerhasilTellerNotificationActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBerhasilTellerNotificationActivity.etAlasan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296945, "field 'etAlasan'", LogoutDialog.class);
        detailBerhasilTellerNotificationActivity.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        detailBerhasilTellerNotificationActivity.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
        detailBerhasilTellerNotificationActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailBerhasilTellerNotificationActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBerhasilTellerNotificationActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBerhasilTellerNotificationActivity.tvBerita = (TextView) Utils.findRequiredViewAsType(view, 2131298847, "field 'tvBerita'", TextView.class);
        detailBerhasilTellerNotificationActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBerhasilTellerNotificationActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBerhasilTellerNotificationActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        detailBerhasilTellerNotificationActivity.trCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'trCabang'", LinearLayout.class);
        detailBerhasilTellerNotificationActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        detailBerhasilTellerNotificationActivity.llBerita = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297548, "field 'llBerita'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBerhasilTellerNotificationActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilTellerNotificationActivity.proses(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBerhasilTellerNotificationActivity.btnShare = (Button) Utils.castView(findRequiredView3, 2131296448, "field 'btnShare'", Button.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilTellerNotificationActivity.share(view2);
            }
        });
        detailBerhasilTellerNotificationActivity.llNamaPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297856, "field 'llNamaPengirim'", LinearLayout.class);
        detailBerhasilTellerNotificationActivity.tvNamaPengirim = (TextView) Utils.findRequiredViewAsType(view, 2131299434, "field 'tvNamaPengirim'", TextView.class);
        detailBerhasilTellerNotificationActivity.tvNamaPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299427, "field 'tvNamaPenerima'", TextView.class);
        detailBerhasilTellerNotificationActivity.tvNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299485, "field 'tvNominal'", TextView.class);
        detailBerhasilTellerNotificationActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBerhasilTellerNotificationActivity.llPemilikSumberDana = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297847, "field 'llPemilikSumberDana'", LinearLayout.class);
        detailBerhasilTellerNotificationActivity.tvPemilikSumberDana = (TextView) Utils.findRequiredViewAsType(view, 2131299515, "field 'tvPemilikSumberDana'", TextView.class);
        detailBerhasilTellerNotificationActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        detailBerhasilTellerNotificationActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailBerhasilTellerNotificationActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        Resources resources = view.getContext().getResources();
        detailBerhasilTellerNotificationActivity.retry = resources.getString(2131822092);
        detailBerhasilTellerNotificationActivity.toolbarTitle = resources.getString(2131822262);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBerhasilTellerNotificationActivity detailBerhasilTellerNotificationActivity = this.a;
        if (detailBerhasilTellerNotificationActivity != null) {
            this.a = null;
            detailBerhasilTellerNotificationActivity.toolbar = null;
            detailBerhasilTellerNotificationActivity.txtToolbarTitle = null;
            detailBerhasilTellerNotificationActivity.tvErrorMessage = null;
            detailBerhasilTellerNotificationActivity.etKomentar = null;
            detailBerhasilTellerNotificationActivity.tilKomentar = null;
            detailBerhasilTellerNotificationActivity.etAlasan = null;
            detailBerhasilTellerNotificationActivity.tilAlasan = null;
            detailBerhasilTellerNotificationActivity.tvTransaksi = null;
            detailBerhasilTellerNotificationActivity.tvNoReferensi = null;
            detailBerhasilTellerNotificationActivity.tvWaktu = null;
            detailBerhasilTellerNotificationActivity.tvCabang = null;
            detailBerhasilTellerNotificationActivity.tvBerita = null;
            detailBerhasilTellerNotificationActivity.tvStatus = null;
            detailBerhasilTellerNotificationActivity.llMain = null;
            detailBerhasilTellerNotificationActivity.ratingBar = null;
            detailBerhasilTellerNotificationActivity.trCabang = null;
            detailBerhasilTellerNotificationActivity.llRating = null;
            detailBerhasilTellerNotificationActivity.llBerita = null;
            detailBerhasilTellerNotificationActivity.btnProses = null;
            detailBerhasilTellerNotificationActivity.btnShare = null;
            detailBerhasilTellerNotificationActivity.llNamaPengirim = null;
            detailBerhasilTellerNotificationActivity.tvNamaPengirim = null;
            detailBerhasilTellerNotificationActivity.tvNamaPenerima = null;
            detailBerhasilTellerNotificationActivity.tvNominal = null;
            detailBerhasilTellerNotificationActivity.tvErrorKomentar = null;
            detailBerhasilTellerNotificationActivity.llPemilikSumberDana = null;
            detailBerhasilTellerNotificationActivity.tvPemilikSumberDana = null;
            detailBerhasilTellerNotificationActivity.llShare = null;
            detailBerhasilTellerNotificationActivity.llRuangan = null;
            detailBerhasilTellerNotificationActivity.tvJenisRuangan = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
