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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BranchMapROActivity_ViewBinding.class */
public class BranchMapROActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private BranchMapROActivity d;
    private View e;

    public BranchMapROActivity_ViewBinding(final BranchMapROActivity branchMapROActivity, View view) {
        this.d = branchMapROActivity;
        branchMapROActivity.clMain = (CoordinatorLayout) Utils.findRequiredViewAsType(view, 2131298420, "field 'clMain'", CoordinatorLayout.class);
        branchMapROActivity.rvBranchItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298318, "field 'rvBranchItem'", setOnStartEnterTransitionListener.class);
        branchMapROActivity.llBottomSheetMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296374, "field 'llBottomSheetMain'", LinearLayout.class);
        branchMapROActivity.llBottomSheetSearch = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296375, "field 'llBottomSheetSearch'", LinearLayout.class);
        branchMapROActivity.llPeekSheet = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297842, "field 'llPeekSheet'", LinearLayout.class);
        branchMapROActivity.rvKantorCabang = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvKantorCabang'", setOnStartEnterTransitionListener.class);
        branchMapROActivity.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        branchMapROActivity.tvErrorSearch = (TextView) Utils.findRequiredViewAsType(view, 2131299179, "field 'tvErrorSearch'", TextView.class);
        branchMapROActivity.tvError = (TextView) Utils.findRequiredViewAsType(view, 2131299071, "field 'tvError'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297176, "field 'etSearch' and method 'onClickSearch'");
        branchMapROActivity.etSearch = (EditText) Utils.castView(findRequiredView, 2131297176, "field 'etSearch'", EditText.class);
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BranchMapROActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                branchMapROActivity.onClickSearch(view2);
            }
        });
        branchMapROActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        branchMapROActivity.tvToolbar = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvToolbar'", TextView.class);
        branchMapROActivity.tvTitleCabang = (TextView) Utils.findRequiredViewAsType(view, 2131299627, "field 'tvTitleCabang'", TextView.class);
        branchMapROActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296396, "method 'onClickLanjut'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BranchMapROActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                branchMapROActivity.onClickLanjut(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296446, "method 'retry'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.BranchMapROActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                branchMapROActivity.retry(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        branchMapROActivity.retry = resources.getString(2131822092);
        branchMapROActivity.txtToolbar = resources.getString(2131822254);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BranchMapROActivity branchMapROActivity = this.d;
        if (branchMapROActivity != null) {
            this.d = null;
            branchMapROActivity.clMain = null;
            branchMapROActivity.rvBranchItem = null;
            branchMapROActivity.llBottomSheetMain = null;
            branchMapROActivity.llBottomSheetSearch = null;
            branchMapROActivity.llPeekSheet = null;
            branchMapROActivity.rvKantorCabang = null;
            branchMapROActivity.etFilter = null;
            branchMapROActivity.tvErrorSearch = null;
            branchMapROActivity.tvError = null;
            branchMapROActivity.etSearch = null;
            branchMapROActivity.toolbar = null;
            branchMapROActivity.tvToolbar = null;
            branchMapROActivity.tvTitleCabang = null;
            branchMapROActivity.llMain = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
