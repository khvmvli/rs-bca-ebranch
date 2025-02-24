package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BranchMapTarikanActivity_ViewBinding.class */
public class BranchMapTarikanActivity_ViewBinding implements Unbinder {
    private View a;
    private BranchMapTarikanActivity b;
    private View c;
    private View d;
    private View e;

    public BranchMapTarikanActivity_ViewBinding(final BranchMapTarikanActivity branchMapTarikanActivity, View view) {
        this.b = branchMapTarikanActivity;
        branchMapTarikanActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        branchMapTarikanActivity.clMain = (CoordinatorLayout) Utils.findRequiredViewAsType(view, 2131296799, "field 'clMain'", CoordinatorLayout.class);
        branchMapTarikanActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        branchMapTarikanActivity.tvToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbar'", TextView.class);
        branchMapTarikanActivity.llDetailBranch = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297622, "field 'llDetailBranch'", LinearLayout.class);
        branchMapTarikanActivity.tvBranchName = (TextView) Utils.findRequiredViewAsType(view, 2131298867, "field 'tvBranchName'", TextView.class);
        branchMapTarikanActivity.tvBranchAddress = (TextView) Utils.findRequiredViewAsType(view, 2131298864, "field 'tvBranchAddress'", TextView.class);
        branchMapTarikanActivity.tvDistance = (TextView) Utils.findRequiredViewAsType(view, 2131298939, "field 'tvDistance'", TextView.class);
        branchMapTarikanActivity.tvNoTelp = (TextView) Utils.findRequiredViewAsType(view, 2131299476, "field 'tvNoTelp'", TextView.class);
        branchMapTarikanActivity.rvBranchItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298318, "field 'rvBranchItem'", setOnStartEnterTransitionListener.class);
        branchMapTarikanActivity.llListBranchMap = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296374, "field 'llListBranchMap'", LinearLayout.class);
        branchMapTarikanActivity.llBottomSheetSearch = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296375, "field 'llBottomSheetSearch'", LinearLayout.class);
        branchMapTarikanActivity.llPeekSheet = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297842, "field 'llPeekSheet'", LinearLayout.class);
        branchMapTarikanActivity.rvKantorCabang = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvKantorCabang'", setOnStartEnterTransitionListener.class);
        branchMapTarikanActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        branchMapTarikanActivity.tvErrorSearch = (TextView) Utils.findRequiredViewAsType(view, 2131299179, "field 'tvErrorSearch'", TextView.class);
        branchMapTarikanActivity.tvError = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvError'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297176, "field 'etSearch' and method 'onClickSearch'");
        branchMapTarikanActivity.etSearch = (EditText) Utils.castView(findRequiredView, 2131297176, "field 'etSearch'", EditText.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BranchMapTarikanActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                branchMapTarikanActivity.onClickSearch(view2);
            }
        });
        branchMapTarikanActivity.llCabangTidakDitemukan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297561, "field 'llCabangTidakDitemukan'", LinearLayout.class);
        branchMapTarikanActivity.btnLanjut = (Button) Utils.findRequiredViewAsType(view, 2131296396, "field 'btnLanjut'", Button.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296447, "method 'onClickSelesai'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BranchMapTarikanActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                branchMapTarikanActivity.onClickSelesai(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296390, "method 'onClickHubungiCabang'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BranchMapTarikanActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                branchMapTarikanActivity.onClickHubungiCabang();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BranchMapTarikanActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                branchMapTarikanActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        branchMapTarikanActivity.txtToolbar = resources.getString(2131822047);
        branchMapTarikanActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BranchMapTarikanActivity branchMapTarikanActivity = this.b;
        if (branchMapTarikanActivity != null) {
            this.b = null;
            branchMapTarikanActivity.llMain = null;
            branchMapTarikanActivity.clMain = null;
            branchMapTarikanActivity.toolbar = null;
            branchMapTarikanActivity.tvToolbar = null;
            branchMapTarikanActivity.llDetailBranch = null;
            branchMapTarikanActivity.tvBranchName = null;
            branchMapTarikanActivity.tvBranchAddress = null;
            branchMapTarikanActivity.tvDistance = null;
            branchMapTarikanActivity.tvNoTelp = null;
            branchMapTarikanActivity.rvBranchItem = null;
            branchMapTarikanActivity.llListBranchMap = null;
            branchMapTarikanActivity.llBottomSheetSearch = null;
            branchMapTarikanActivity.llPeekSheet = null;
            branchMapTarikanActivity.rvKantorCabang = null;
            branchMapTarikanActivity.etFilter = null;
            branchMapTarikanActivity.tvErrorSearch = null;
            branchMapTarikanActivity.tvError = null;
            branchMapTarikanActivity.etSearch = null;
            branchMapTarikanActivity.llCabangTidakDitemukan = null;
            branchMapTarikanActivity.btnLanjut = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
