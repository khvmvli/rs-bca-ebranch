package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog;
import o.LogoutDialog_ViewBinding;
import o.onAcceptKetentuanOR;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailBerhasilRONotificationActivity_ViewBinding.class */
public class DetailBerhasilRONotificationActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View d;
    private DetailBerhasilRONotificationActivity e;

    public DetailBerhasilRONotificationActivity_ViewBinding(final DetailBerhasilRONotificationActivity detailBerhasilRONotificationActivity, View view) {
        this.e = detailBerhasilRONotificationActivity;
        detailBerhasilRONotificationActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailBerhasilRONotificationActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailBerhasilRONotificationActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChange'");
        detailBerhasilRONotificationActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.d = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailBerhasilRONotificationActivity.inputChange(view2, z);
            }
        });
        detailBerhasilRONotificationActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        detailBerhasilRONotificationActivity.etAlasan = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131296945, "field 'etAlasan'", LogoutDialog.class);
        detailBerhasilRONotificationActivity.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        detailBerhasilRONotificationActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailBerhasilRONotificationActivity.tvWaktu = (TextView) Utils.findRequiredViewAsType(view, 2131299736, "field 'tvWaktu'", TextView.class);
        detailBerhasilRONotificationActivity.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        detailBerhasilRONotificationActivity.tvStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299574, "field 'tvStatus'", TextView.class);
        detailBerhasilRONotificationActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailBerhasilRONotificationActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        detailBerhasilRONotificationActivity.trCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'trCabang'", LinearLayout.class);
        detailBerhasilRONotificationActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailBerhasilRONotificationActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilRONotificationActivity.proses(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296448, "field 'btnShare' and method 'share'");
        detailBerhasilRONotificationActivity.btnShare = (Button) Utils.castView(findRequiredView3, 2131296448, "field 'btnShare'", Button.class);
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailBerhasilRONotificationActivity.share(view2);
            }
        });
        detailBerhasilRONotificationActivity.tvNama = (TextView) Utils.findRequiredViewAsType(view, 2131299416, "field 'tvNama'", TextView.class);
        detailBerhasilRONotificationActivity.lvTransaksi = (ListView) Utils.findRequiredViewAsType(view, 2131297977, "field 'lvTransaksi'", ListView.class);
        detailBerhasilRONotificationActivity.tvTransaksi = (TextView) Utils.findRequiredViewAsType(view, 2131299689, "field 'tvTransaksi'", TextView.class);
        detailBerhasilRONotificationActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailBerhasilRONotificationActivity.llShare = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297887, "field 'llShare'", LinearLayout.class);
        detailBerhasilRONotificationActivity.llRuangan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297875, "field 'llRuangan'", LinearLayout.class);
        detailBerhasilRONotificationActivity.tvJenisRuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299312, "field 'tvJenisRuangan'", TextView.class);
        Resources resources = view.getContext().getResources();
        detailBerhasilRONotificationActivity.retry = resources.getString(2131822092);
        detailBerhasilRONotificationActivity.toolbarTitle = resources.getString(2131822262);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailBerhasilRONotificationActivity detailBerhasilRONotificationActivity = this.e;
        if (detailBerhasilRONotificationActivity != null) {
            this.e = null;
            detailBerhasilRONotificationActivity.toolbar = null;
            detailBerhasilRONotificationActivity.txtToolbarTitle = null;
            detailBerhasilRONotificationActivity.tvErrorMessage = null;
            detailBerhasilRONotificationActivity.etKomentar = null;
            detailBerhasilRONotificationActivity.tilKomentar = null;
            detailBerhasilRONotificationActivity.etAlasan = null;
            detailBerhasilRONotificationActivity.tilAlasan = null;
            detailBerhasilRONotificationActivity.tvNoReferensi = null;
            detailBerhasilRONotificationActivity.tvWaktu = null;
            detailBerhasilRONotificationActivity.tvCabang = null;
            detailBerhasilRONotificationActivity.tvStatus = null;
            detailBerhasilRONotificationActivity.llMain = null;
            detailBerhasilRONotificationActivity.ratingBar = null;
            detailBerhasilRONotificationActivity.trCabang = null;
            detailBerhasilRONotificationActivity.llRating = null;
            detailBerhasilRONotificationActivity.btnProses = null;
            detailBerhasilRONotificationActivity.btnShare = null;
            detailBerhasilRONotificationActivity.tvNama = null;
            detailBerhasilRONotificationActivity.lvTransaksi = null;
            detailBerhasilRONotificationActivity.tvTransaksi = null;
            detailBerhasilRONotificationActivity.tvErrorKomentar = null;
            detailBerhasilRONotificationActivity.llShare = null;
            detailBerhasilRONotificationActivity.llRuangan = null;
            detailBerhasilRONotificationActivity.tvJenisRuangan = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
