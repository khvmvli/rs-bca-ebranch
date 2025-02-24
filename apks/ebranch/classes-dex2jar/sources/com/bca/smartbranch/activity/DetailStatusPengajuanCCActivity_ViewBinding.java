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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DetailStatusPengajuanCCActivity_ViewBinding.class */
public class DetailStatusPengajuanCCActivity_ViewBinding implements Unbinder {
    private View a;
    private DetailStatusPengajuanCCActivity b;
    private View c;
    private View d;

    public DetailStatusPengajuanCCActivity_ViewBinding(final DetailStatusPengajuanCCActivity detailStatusPengajuanCCActivity, View view) {
        this.b = detailStatusPengajuanCCActivity;
        detailStatusPengajuanCCActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        detailStatusPengajuanCCActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        detailStatusPengajuanCCActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        detailStatusPengajuanCCActivity.ivQrCode = (ImageView) Utils.findRequiredViewAsType(view, 2131297409, "field 'ivQrCode'", ImageView.class);
        detailStatusPengajuanCCActivity.tvNoReferensi = (TextView) Utils.findRequiredViewAsType(view, 2131299467, "field 'tvNoReferensi'", TextView.class);
        detailStatusPengajuanCCActivity.tvInprogressStatus = (TextView) Utils.findRequiredViewAsType(view, 2131299295, "field 'tvInprogressStatus'", TextView.class);
        detailStatusPengajuanCCActivity.tvInprogressDate = (TextView) Utils.findRequiredViewAsType(view, 2131299294, "field 'tvInprogressDate'", TextView.class);
        detailStatusPengajuanCCActivity.tvDiterimaStatus = (TextView) Utils.findRequiredViewAsType(view, 2131298942, "field 'tvDiterimaStatus'", TextView.class);
        detailStatusPengajuanCCActivity.tvDiterimaDate = (TextView) Utils.findRequiredViewAsType(view, 2131298940, "field 'tvDiterimaDate'", TextView.class);
        detailStatusPengajuanCCActivity.tvDiterimaNamaPenerima = (TextView) Utils.findRequiredViewAsType(view, 2131298941, "field 'tvDiterimaNamaPenerima'", TextView.class);
        detailStatusPengajuanCCActivity.tvDitolakStatus = (TextView) Utils.findRequiredViewAsType(view, 2131298945, "field 'tvDitolakStatus'", TextView.class);
        detailStatusPengajuanCCActivity.tvDitolakDate = (TextView) Utils.findRequiredViewAsType(view, 2131298943, "field 'tvDitolakDate'", TextView.class);
        detailStatusPengajuanCCActivity.tvDitolakDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298944, "field 'tvDitolakDesc'", TextView.class);
        detailStatusPengajuanCCActivity.tvDireturStatus = (TextView) Utils.findRequiredViewAsType(view, 2131298938, "field 'tvDireturStatus'", TextView.class);
        detailStatusPengajuanCCActivity.tvDireturDate = (TextView) Utils.findRequiredViewAsType(view, 2131298937, "field 'tvDireturDate'", TextView.class);
        detailStatusPengajuanCCActivity.tvNote = (TextView) Utils.findRequiredViewAsType(view, 2131299502, "field 'tvNote'", TextView.class);
        detailStatusPengajuanCCActivity.ratingBar = (onAcceptKetentuanOR) Utils.findRequiredViewAsType(view, 2131298126, "field 'ratingBar'", onAcceptKetentuanOR.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297031, "field 'etKomentar' and method 'inputChange'");
        detailStatusPengajuanCCActivity.etKomentar = (LogoutDialog) Utils.castView(findRequiredView, 2131297031, "field 'etKomentar'", LogoutDialog.class);
        this.d = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.DetailStatusPengajuanCCActivity_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                detailStatusPengajuanCCActivity.inputChange(view2, z);
            }
        });
        detailStatusPengajuanCCActivity.tilKomentar = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298578, "field 'tilKomentar'", LogoutDialog_ViewBinding.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'proses'");
        detailStatusPengajuanCCActivity.btnProses = (Button) Utils.castView(findRequiredView2, 2131296440, "field 'btnProses'", Button.class);
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailStatusPengajuanCCActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailStatusPengajuanCCActivity.proses(view2);
            }
        });
        detailStatusPengajuanCCActivity.tvErrorMessage = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvErrorMessage'", TextView.class);
        detailStatusPengajuanCCActivity.llInfo = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297689, "field 'llInfo'", LinearLayout.class);
        detailStatusPengajuanCCActivity.llRating = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297867, "field 'llRating'", LinearLayout.class);
        detailStatusPengajuanCCActivity.clDiretur = (setMaxHeight) Utils.findRequiredViewAsType(view, 2131296794, "field 'clDiretur'", setMaxHeight.class);
        detailStatusPengajuanCCActivity.clDiterima = (setMaxHeight) Utils.findRequiredViewAsType(view, 2131296795, "field 'clDiterima'", setMaxHeight.class);
        detailStatusPengajuanCCActivity.clInprogress = (setMaxHeight) Utils.findRequiredViewAsType(view, 2131296798, "field 'clInprogress'", setMaxHeight.class);
        detailStatusPengajuanCCActivity.clDitolak = (setMaxHeight) Utils.findRequiredViewAsType(view, 2131296796, "field 'clDitolak'", setMaxHeight.class);
        detailStatusPengajuanCCActivity.tvErrorKomentar = (TextView) Utils.findRequiredViewAsType(view, 2131299054, "field 'tvErrorKomentar'", TextView.class);
        detailStatusPengajuanCCActivity.tvErrorRating = (TextView) Utils.findRequiredViewAsType(view, 2131299168, "field 'tvErrorRating'", TextView.class);
        detailStatusPengajuanCCActivity.tvHaloBCA1 = (TextView) Utils.findRequiredViewAsType(view, 2131299266, "field 'tvHaloBCA1'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DetailStatusPengajuanCCActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                detailStatusPengajuanCCActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        detailStatusPengajuanCCActivity.retry = resources.getString(2131822092);
        detailStatusPengajuanCCActivity.hubungiHaloBCA = resources.getString(2131821713);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DetailStatusPengajuanCCActivity detailStatusPengajuanCCActivity = this.b;
        if (detailStatusPengajuanCCActivity != null) {
            this.b = null;
            detailStatusPengajuanCCActivity.toolbar = null;
            detailStatusPengajuanCCActivity.txtToolbarTitle = null;
            detailStatusPengajuanCCActivity.llMain = null;
            detailStatusPengajuanCCActivity.ivQrCode = null;
            detailStatusPengajuanCCActivity.tvNoReferensi = null;
            detailStatusPengajuanCCActivity.tvInprogressStatus = null;
            detailStatusPengajuanCCActivity.tvInprogressDate = null;
            detailStatusPengajuanCCActivity.tvDiterimaStatus = null;
            detailStatusPengajuanCCActivity.tvDiterimaDate = null;
            detailStatusPengajuanCCActivity.tvDiterimaNamaPenerima = null;
            detailStatusPengajuanCCActivity.tvDitolakStatus = null;
            detailStatusPengajuanCCActivity.tvDitolakDate = null;
            detailStatusPengajuanCCActivity.tvDitolakDesc = null;
            detailStatusPengajuanCCActivity.tvDireturStatus = null;
            detailStatusPengajuanCCActivity.tvDireturDate = null;
            detailStatusPengajuanCCActivity.tvNote = null;
            detailStatusPengajuanCCActivity.ratingBar = null;
            detailStatusPengajuanCCActivity.etKomentar = null;
            detailStatusPengajuanCCActivity.tilKomentar = null;
            detailStatusPengajuanCCActivity.btnProses = null;
            detailStatusPengajuanCCActivity.tvErrorMessage = null;
            detailStatusPengajuanCCActivity.llInfo = null;
            detailStatusPengajuanCCActivity.llRating = null;
            detailStatusPengajuanCCActivity.clDiretur = null;
            detailStatusPengajuanCCActivity.clDiterima = null;
            detailStatusPengajuanCCActivity.clInprogress = null;
            detailStatusPengajuanCCActivity.clDitolak = null;
            detailStatusPengajuanCCActivity.tvErrorKomentar = null;
            detailStatusPengajuanCCActivity.tvErrorRating = null;
            detailStatusPengajuanCCActivity.tvHaloBCA1 = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
