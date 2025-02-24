package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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
import o.setMaxHeight;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailStatusPengajuanCCNotificationActivity_ViewBinding.class */
public class DetailStatusPengajuanCCNotificationActivity_ViewBinding implements Unbinder {
    private DetailStatusPengajuanCCNotificationActivity a;
    private View c;
    private View e;

    public DetailStatusPengajuanCCNotificationActivity_ViewBinding(final DetailStatusPengajuanCCNotificationActivity detailStatusPengajuanCCNotificationActivity, View view) {
        this.a = detailStatusPengajuanCCNotificationActivity;
        detailStatusPengajuanCCNotificationActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailStatusPengajuanCCNotificationActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailStatusPengajuanCCNotificationActivity.ivQrCode = (ImageView) Utils.findRequiredViewAsType(view, 2131297409, "field 'ivQrCode'", ImageView.class);
        detailStatusPengajuanCCNotificationActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.tvInprogressStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299295, "field 'tvInprogressStatus'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.tvInprogressDate = (TextView) Utils.findRequiredViewAsType(view, 2131299294, "field 'tvInprogressDate'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.tvDiterimaStatus = (TextView) Utils.findRequiredViewAsType(view, 2131298942, "field 'tvDiterimaStatus'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.tvDiterimaDate = (TextView) Utils.findRequiredViewAsType(view, 2131298940, "field 'tvDiterimaDate'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.tvDiterimaNamaPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131298941, "field 'tvDiterimaNamaPenerima'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.tvDitolakStatus = (TextView) Utils.findRequiredViewAsType(view, 2131298945, "field 'tvDitolakStatus'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.tvDitolakDate = (TextView) Utils.findRequiredViewAsType(view, 2131298943, "field 'tvDitolakDate'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.tvDitolakDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298944, "field 'tvDitolakDesc'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.tvDireturStatus = (TextView) Utils.findRequiredViewAsType(view, 2131298938, "field 'tvDireturStatus'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.tvDireturDate = (TextView) Utils.findRequiredViewAsType(view, 2131298937, "field 'tvDireturDate'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.tvNote = (TextView) Utils.findRequiredViewAsType(view, 2131299502, "field 'tvNote'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChange'");
        detailStatusPengajuanCCNotificationActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailStatusPengajuanCCNotificationActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailStatusPengajuanCCNotificationActivity.inputChange(view2, z);
            }
        });
        detailStatusPengajuanCCNotificationActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailStatusPengajuanCCNotificationActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailStatusPengajuanCCNotificationActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailStatusPengajuanCCNotificationActivity.proses(view2);
            }
        });
        detailStatusPengajuanCCNotificationActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.llInfo = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297689, "field 'llInfo'", LinearLayout.class);
        detailStatusPengajuanCCNotificationActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        detailStatusPengajuanCCNotificationActivity.clDiretur = (setMaxHeight) Utils.findRequiredViewAsType(view, 2131296794, "field 'clDiretur'", setMaxHeight.class);
        detailStatusPengajuanCCNotificationActivity.clDiterima = (setMaxHeight) Utils.findRequiredViewAsType(view, 2131296795, "field 'clDiterima'", setMaxHeight.class);
        detailStatusPengajuanCCNotificationActivity.clInprogress = (setMaxHeight) Utils.findRequiredViewAsType(view, 2131296798, "field 'clInprogress'", setMaxHeight.class);
        detailStatusPengajuanCCNotificationActivity.clDitolak = (setMaxHeight) Utils.findRequiredViewAsType(view, 2131296796, "field 'clDitolak'", setMaxHeight.class);
        detailStatusPengajuanCCNotificationActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailStatusPengajuanCCNotificationActivity.tvHaloBCA1 = (TextView) Utils.findRequiredViewAsType(view, 2131299266, "field 'tvHaloBCA1'", TextView.class);
        Resources resources = view.getContext().getResources();
        detailStatusPengajuanCCNotificationActivity.retry = resources.getString(2131822092);
        detailStatusPengajuanCCNotificationActivity.hubungiHaloBCA = resources.getString(2131821713);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailStatusPengajuanCCNotificationActivity detailStatusPengajuanCCNotificationActivity = this.a;
        if (detailStatusPengajuanCCNotificationActivity != null) {
            this.a = null;
            detailStatusPengajuanCCNotificationActivity.toolbar = null;
            detailStatusPengajuanCCNotificationActivity.txtToolbarTitle = null;
            detailStatusPengajuanCCNotificationActivity.llMain = null;
            detailStatusPengajuanCCNotificationActivity.ivQrCode = null;
            detailStatusPengajuanCCNotificationActivity.tvNoReferensi = null;
            detailStatusPengajuanCCNotificationActivity.tvInprogressStatus = null;
            detailStatusPengajuanCCNotificationActivity.tvInprogressDate = null;
            detailStatusPengajuanCCNotificationActivity.tvDiterimaStatus = null;
            detailStatusPengajuanCCNotificationActivity.tvDiterimaDate = null;
            detailStatusPengajuanCCNotificationActivity.tvDiterimaNamaPenerima = null;
            detailStatusPengajuanCCNotificationActivity.tvDitolakStatus = null;
            detailStatusPengajuanCCNotificationActivity.tvDitolakDate = null;
            detailStatusPengajuanCCNotificationActivity.tvDitolakDesc = null;
            detailStatusPengajuanCCNotificationActivity.tvDireturStatus = null;
            detailStatusPengajuanCCNotificationActivity.tvDireturDate = null;
            detailStatusPengajuanCCNotificationActivity.tvNote = null;
            detailStatusPengajuanCCNotificationActivity.ratingBar = null;
            detailStatusPengajuanCCNotificationActivity.etKomentar = null;
            detailStatusPengajuanCCNotificationActivity.tilKomentar = null;
            detailStatusPengajuanCCNotificationActivity.btnProses = null;
            detailStatusPengajuanCCNotificationActivity.tvErrorMessage = null;
            detailStatusPengajuanCCNotificationActivity.llInfo = null;
            detailStatusPengajuanCCNotificationActivity.llRating = null;
            detailStatusPengajuanCCNotificationActivity.clDiretur = null;
            detailStatusPengajuanCCNotificationActivity.clDiterima = null;
            detailStatusPengajuanCCNotificationActivity.clInprogress = null;
            detailStatusPengajuanCCNotificationActivity.clDitolak = null;
            detailStatusPengajuanCCNotificationActivity.tvErrorKomentar = null;
            detailStatusPengajuanCCNotificationActivity.tvHaloBCA1 = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
