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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilTarikanNotificationActivity_ViewBinding.class */
public class DetailBerhasilTarikanNotificationActivity_ViewBinding implements Unbinder {
    private DetailBerhasilTarikanNotificationActivity a;
    private View b;
    private View c;
    private View e;

    public DetailBerhasilTarikanNotificationActivity_ViewBinding(final DetailBerhasilTarikanNotificationActivity detailBerhasilTarikanNotificationActivity, View view) {
        this.a = detailBerhasilTarikanNotificationActivity;
        detailBerhasilTarikanNotificationActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBerhasilTarikanNotificationActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBerhasilTarikanNotificationActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChange'");
        detailBerhasilTarikanNotificationActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBerhasilTarikanNotificationActivity.inputChange(view2, z);
            }
        });
        detailBerhasilTarikanNotificationActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBerhasilTarikanNotificationActivity.etAlasan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296945, "field 'etAlasan'", LogoutDialog.class);
        detailBerhasilTarikanNotificationActivity.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        detailBerhasilTarikanNotificationActivity.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
        detailBerhasilTarikanNotificationActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailBerhasilTarikanNotificationActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBerhasilTarikanNotificationActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBerhasilTarikanNotificationActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBerhasilTarikanNotificationActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBerhasilTarikanNotificationActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        detailBerhasilTarikanNotificationActivity.trCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'trCabang'", LinearLayout.class);
        detailBerhasilTarikanNotificationActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBerhasilTarikanNotificationActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilTarikanNotificationActivity.proses(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBerhasilTarikanNotificationActivity.btnShare = (Button) Utils.castView(findRequiredView3, 2131296448, "field 'btnShare'", Button.class);
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilTarikanNotificationActivity.share(view2);
            }
        });
        detailBerhasilTarikanNotificationActivity.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299416, "field 'tvNama'", TextView.class);
        detailBerhasilTarikanNotificationActivity.tvNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299485, "field 'tvNominal'", TextView.class);
        detailBerhasilTarikanNotificationActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBerhasilTarikanNotificationActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        detailBerhasilTarikanNotificationActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailBerhasilTarikanNotificationActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        Resources resources = view.getContext().getResources();
        detailBerhasilTarikanNotificationActivity.retry = resources.getString(2131822092);
        detailBerhasilTarikanNotificationActivity.toolbarTitle = resources.getString(2131822262);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBerhasilTarikanNotificationActivity detailBerhasilTarikanNotificationActivity = this.a;
        if (detailBerhasilTarikanNotificationActivity != null) {
            this.a = null;
            detailBerhasilTarikanNotificationActivity.toolbar = null;
            detailBerhasilTarikanNotificationActivity.txtToolbarTitle = null;
            detailBerhasilTarikanNotificationActivity.tvErrorMessage = null;
            detailBerhasilTarikanNotificationActivity.etKomentar = null;
            detailBerhasilTarikanNotificationActivity.tilKomentar = null;
            detailBerhasilTarikanNotificationActivity.etAlasan = null;
            detailBerhasilTarikanNotificationActivity.tilAlasan = null;
            detailBerhasilTarikanNotificationActivity.tvTransaksi = null;
            detailBerhasilTarikanNotificationActivity.tvNoReferensi = null;
            detailBerhasilTarikanNotificationActivity.tvWaktu = null;
            detailBerhasilTarikanNotificationActivity.tvCabang = null;
            detailBerhasilTarikanNotificationActivity.tvStatus = null;
            detailBerhasilTarikanNotificationActivity.llMain = null;
            detailBerhasilTarikanNotificationActivity.ratingBar = null;
            detailBerhasilTarikanNotificationActivity.trCabang = null;
            detailBerhasilTarikanNotificationActivity.llRating = null;
            detailBerhasilTarikanNotificationActivity.btnProses = null;
            detailBerhasilTarikanNotificationActivity.btnShare = null;
            detailBerhasilTarikanNotificationActivity.tvNama = null;
            detailBerhasilTarikanNotificationActivity.tvNominal = null;
            detailBerhasilTarikanNotificationActivity.tvErrorKomentar = null;
            detailBerhasilTarikanNotificationActivity.llShare = null;
            detailBerhasilTarikanNotificationActivity.llRuangan = null;
            detailBerhasilTarikanNotificationActivity.tvJenisRuangan = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
