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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilEChannelNotificationActivity_ViewBinding.class */
public class DetailBerhasilEChannelNotificationActivity_ViewBinding implements Unbinder {
    private View b;
    private DetailBerhasilEChannelNotificationActivity c;
    private View d;
    private View e;

    public DetailBerhasilEChannelNotificationActivity_ViewBinding(final DetailBerhasilEChannelNotificationActivity detailBerhasilEChannelNotificationActivity, View view) {
        this.c = detailBerhasilEChannelNotificationActivity;
        detailBerhasilEChannelNotificationActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBerhasilEChannelNotificationActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBerhasilEChannelNotificationActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChange'");
        detailBerhasilEChannelNotificationActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBerhasilEChannelNotificationActivity.inputChange(view2, z);
            }
        });
        detailBerhasilEChannelNotificationActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBerhasilEChannelNotificationActivity.etAlasan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296945, "field 'etAlasan'", LogoutDialog.class);
        detailBerhasilEChannelNotificationActivity.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        detailBerhasilEChannelNotificationActivity.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
        detailBerhasilEChannelNotificationActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailBerhasilEChannelNotificationActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBerhasilEChannelNotificationActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBerhasilEChannelNotificationActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBerhasilEChannelNotificationActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBerhasilEChannelNotificationActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        detailBerhasilEChannelNotificationActivity.trCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'trCabang'", LinearLayout.class);
        detailBerhasilEChannelNotificationActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBerhasilEChannelNotificationActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilEChannelNotificationActivity.proses(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBerhasilEChannelNotificationActivity.btnShare = (Button) Utils.castView(findRequiredView3, 2131296448, "field 'btnShare'", Button.class);
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilEChannelNotificationActivity.share(view2);
            }
        });
        detailBerhasilEChannelNotificationActivity.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299416, "field 'tvNama'", TextView.class);
        detailBerhasilEChannelNotificationActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBerhasilEChannelNotificationActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        detailBerhasilEChannelNotificationActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailBerhasilEChannelNotificationActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        Resources resources = view.getContext().getResources();
        detailBerhasilEChannelNotificationActivity.retry = resources.getString(2131822092);
        detailBerhasilEChannelNotificationActivity.toolbarTitle = resources.getString(2131822201);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBerhasilEChannelNotificationActivity detailBerhasilEChannelNotificationActivity = this.c;
        if (detailBerhasilEChannelNotificationActivity != null) {
            this.c = null;
            detailBerhasilEChannelNotificationActivity.toolbar = null;
            detailBerhasilEChannelNotificationActivity.txtToolbarTitle = null;
            detailBerhasilEChannelNotificationActivity.tvErrorMessage = null;
            detailBerhasilEChannelNotificationActivity.etKomentar = null;
            detailBerhasilEChannelNotificationActivity.tilKomentar = null;
            detailBerhasilEChannelNotificationActivity.etAlasan = null;
            detailBerhasilEChannelNotificationActivity.tilAlasan = null;
            detailBerhasilEChannelNotificationActivity.tvTransaksi = null;
            detailBerhasilEChannelNotificationActivity.tvNoReferensi = null;
            detailBerhasilEChannelNotificationActivity.tvWaktu = null;
            detailBerhasilEChannelNotificationActivity.tvCabang = null;
            detailBerhasilEChannelNotificationActivity.tvStatus = null;
            detailBerhasilEChannelNotificationActivity.llMain = null;
            detailBerhasilEChannelNotificationActivity.ratingBar = null;
            detailBerhasilEChannelNotificationActivity.trCabang = null;
            detailBerhasilEChannelNotificationActivity.llRating = null;
            detailBerhasilEChannelNotificationActivity.btnProses = null;
            detailBerhasilEChannelNotificationActivity.btnShare = null;
            detailBerhasilEChannelNotificationActivity.tvNama = null;
            detailBerhasilEChannelNotificationActivity.tvErrorKomentar = null;
            detailBerhasilEChannelNotificationActivity.llShare = null;
            detailBerhasilEChannelNotificationActivity.llRuangan = null;
            detailBerhasilEChannelNotificationActivity.tvJenisRuangan = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
