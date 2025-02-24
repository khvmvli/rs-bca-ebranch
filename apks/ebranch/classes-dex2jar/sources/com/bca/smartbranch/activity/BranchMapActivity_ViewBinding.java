package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BranchMapActivity_ViewBinding.class */
public class BranchMapActivity_ViewBinding implements Unbinder {
    private View a;
    private BranchMapActivity b;
    private View c;
    private View e;

    public BranchMapActivity_ViewBinding(final BranchMapActivity branchMapActivity, View view) {
        this.b = branchMapActivity;
        branchMapActivity.clMain = (CoordinatorLayout) Utils.findRequiredViewAsType(view, 2131298420, "field 'clMain'", CoordinatorLayout.class);
        branchMapActivity.rvBranchItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298318, "field 'rvBranchItem'", setOnStartEnterTransitionListener.class);
        branchMapActivity.llBottomSheetMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296374, "field 'llBottomSheetMain'", LinearLayout.class);
        branchMapActivity.llBottomSheetSearch = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296375, "field 'llBottomSheetSearch'", LinearLayout.class);
        branchMapActivity.llPeekSheet = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297842, "field 'llPeekSheet'", LinearLayout.class);
        branchMapActivity.rvKantorCabang = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvKantorCabang'", setOnStartEnterTransitionListener.class);
        branchMapActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        branchMapActivity.tvErrorSearch = (TextView) Utils.findRequiredViewAsType(view, 2131299179, "field 'tvErrorSearch'", TextView.class);
        branchMapActivity.tvError = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvError'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297176, "field 'etSearch' and method 'onClickSearch'");
        branchMapActivity.etSearch = (EditText) Utils.castView(findRequiredView, 2131297176, "field 'etSearch'", EditText.class);
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BranchMapActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                branchMapActivity.onClickSearch(view2);
            }
        });
        branchMapActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        branchMapActivity.tvToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbar'", TextView.class);
        branchMapActivity.tvTitleCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299627, "field 'tvTitleCabang'", TextView.class);
        branchMapActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296396, "method 'onClickLanjut'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BranchMapActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                branchMapActivity.onClickLanjut(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BranchMapActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                branchMapActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        branchMapActivity.retry = resources.getString(2131822092);
        branchMapActivity.txtToolbar = resources.getString(2131822254);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BranchMapActivity branchMapActivity = this.b;
        if (branchMapActivity != null) {
            this.b = null;
            branchMapActivity.clMain = null;
            branchMapActivity.rvBranchItem = null;
            branchMapActivity.llBottomSheetMain = null;
            branchMapActivity.llBottomSheetSearch = null;
            branchMapActivity.llPeekSheet = null;
            branchMapActivity.rvKantorCabang = null;
            branchMapActivity.etFilter = null;
            branchMapActivity.tvErrorSearch = null;
            branchMapActivity.tvError = null;
            branchMapActivity.etSearch = null;
            branchMapActivity.toolbar = null;
            branchMapActivity.tvToolbar = null;
            branchMapActivity.tvTitleCabang = null;
            branchMapActivity.llMain = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
