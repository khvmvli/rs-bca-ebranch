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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilTellerActivity_ViewBinding.class */
public class DetailBerhasilTellerActivity_ViewBinding implements Unbinder {
    private DetailBerhasilTellerActivity a;
    private View b;
    private View c;
    private View d;
    private View e;

    public DetailBerhasilTellerActivity_ViewBinding(final DetailBerhasilTellerActivity detailBerhasilTellerActivity, View view) {
        this.a = detailBerhasilTellerActivity;
        detailBerhasilTellerActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBerhasilTellerActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBerhasilTellerActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChange'");
        detailBerhasilTellerActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.d = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTellerActivity_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBerhasilTellerActivity.inputChange(view2, z);
            }
        });
        detailBerhasilTellerActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBerhasilTellerActivity.etAlasan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296945, "field 'etAlasan'", LogoutDialog.class);
        detailBerhasilTellerActivity.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        detailBerhasilTellerActivity.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
        detailBerhasilTellerActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailBerhasilTellerActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBerhasilTellerActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBerhasilTellerActivity.tvBerita = (TextView) Utils.findRequiredViewAsType(view, 2131298847, "field 'tvBerita'", TextView.class);
        detailBerhasilTellerActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBerhasilTellerActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBerhasilTellerActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        detailBerhasilTellerActivity.trCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'trCabang'", LinearLayout.class);
        detailBerhasilTellerActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        detailBerhasilTellerActivity.llBerita = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297548, "field 'llBerita'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBerhasilTellerActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTellerActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilTellerActivity.proses(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBerhasilTellerActivity.btnShare = (Button) Utils.castView(findRequiredView3, 2131296448, "field 'btnShare'", Button.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTellerActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilTellerActivity.share(view2);
            }
        });
        detailBerhasilTellerActivity.llNamaPengirim = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297856, "field 'llNamaPengirim'", LinearLayout.class);
        detailBerhasilTellerActivity.tvNamaPengirim = (TextView) Utils.findRequiredViewAsType(view, 2131299434, "field 'tvNamaPengirim'", TextView.class);
        detailBerhasilTellerActivity.tvNamaPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131299427, "field 'tvNamaPenerima'", TextView.class);
        detailBerhasilTellerActivity.tvNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299485, "field 'tvNominal'", TextView.class);
        detailBerhasilTellerActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBerhasilTellerActivity.llPemilikSumberDana = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297847, "field 'llPemilikSumberDana'", LinearLayout.class);
        detailBerhasilTellerActivity.tvPemilikSumberDana = (TextView) Utils.findRequiredViewAsType(view, 2131299515, "field 'tvPemilikSumberDana'", TextView.class);
        detailBerhasilTellerActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        detailBerhasilTellerActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailBerhasilTellerActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.b = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTellerActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilTellerActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailBerhasilTellerActivity.retry = resources.getString(2131822092);
        detailBerhasilTellerActivity.toolbarTitle = resources.getString(2131822262);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBerhasilTellerActivity detailBerhasilTellerActivity = this.a;
        if (detailBerhasilTellerActivity != null) {
            this.a = null;
            detailBerhasilTellerActivity.toolbar = null;
            detailBerhasilTellerActivity.txtToolbarTitle = null;
            detailBerhasilTellerActivity.tvErrorMessage = null;
            detailBerhasilTellerActivity.etKomentar = null;
            detailBerhasilTellerActivity.tilKomentar = null;
            detailBerhasilTellerActivity.etAlasan = null;
            detailBerhasilTellerActivity.tilAlasan = null;
            detailBerhasilTellerActivity.tvTransaksi = null;
            detailBerhasilTellerActivity.tvNoReferensi = null;
            detailBerhasilTellerActivity.tvWaktu = null;
            detailBerhasilTellerActivity.tvCabang = null;
            detailBerhasilTellerActivity.tvBerita = null;
            detailBerhasilTellerActivity.tvStatus = null;
            detailBerhasilTellerActivity.llMain = null;
            detailBerhasilTellerActivity.ratingBar = null;
            detailBerhasilTellerActivity.trCabang = null;
            detailBerhasilTellerActivity.llRating = null;
            detailBerhasilTellerActivity.llBerita = null;
            detailBerhasilTellerActivity.btnProses = null;
            detailBerhasilTellerActivity.btnShare = null;
            detailBerhasilTellerActivity.llNamaPengirim = null;
            detailBerhasilTellerActivity.tvNamaPengirim = null;
            detailBerhasilTellerActivity.tvNamaPenerima = null;
            detailBerhasilTellerActivity.tvNominal = null;
            detailBerhasilTellerActivity.tvErrorKomentar = null;
            detailBerhasilTellerActivity.llPemilikSumberDana = null;
            detailBerhasilTellerActivity.tvPemilikSumberDana = null;
            detailBerhasilTellerActivity.llShare = null;
            detailBerhasilTellerActivity.llRuangan = null;
            detailBerhasilTellerActivity.tvJenisRuangan = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
