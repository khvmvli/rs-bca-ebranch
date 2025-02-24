package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN3PilihCabangFragment_ViewBinding.class */
public class BN3PilihCabangFragment_ViewBinding implements Unbinder {
    private View a;
    private BN3PilihCabangFragment c;
    private View d;

    public BN3PilihCabangFragment_ViewBinding(final BN3PilihCabangFragment bN3PilihCabangFragment, View view) {
        this.c = bN3PilihCabangFragment;
        bN3PilihCabangFragment.rvBranchItem = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298318, "field 'rvBranchItem'", setOnStartEnterTransitionListener.class);
        bN3PilihCabangFragment.llBottomSheetMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296374, "field 'llBottomSheetMain'", LinearLayout.class);
        bN3PilihCabangFragment.llBottomSheetSearch = (LinearLayout) Utils.findRequiredViewAsType(view, 2131296375, "field 'llBottomSheetSearch'", LinearLayout.class);
        bN3PilihCabangFragment.llPeekSheet = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297842, "field 'llPeekSheet'", LinearLayout.class);
        bN3PilihCabangFragment.rvKantorCabang = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298328, "field 'rvKantorCabang'", setOnStartEnterTransitionListener.class);
        bN3PilihCabangFragment.etFilter = (EditText) Utils.findRequiredViewAsType(view, 2131296980, "field 'etFilter'", EditText.class);
        bN3PilihCabangFragment.tvErrorSearch = (TextView) Utils.findRequiredViewAsType(view, 2131299179, "field 'tvErrorSearch'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297176, "field 'etSearch' and method 'onClickSearch'");
        bN3PilihCabangFragment.etSearch = (EditText) Utils.castView(findRequiredView, 2131297176, "field 'etSearch'", EditText.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.BN3PilihCabangFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN3PilihCabangFragment.onClickSearch(view2);
            }
        });
        bN3PilihCabangFragment.llCabangTidakDitemukan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297561, "field 'llCabangTidakDitemukan'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296396, "method 'onClickLanjut'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.BN3PilihCabangFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN3PilihCabangFragment.onClickLanjut(view2);
            }
        });
        bN3PilihCabangFragment.retry = view.getContext().getResources().getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BN3PilihCabangFragment bN3PilihCabangFragment = this.c;
        if (bN3PilihCabangFragment != null) {
            this.c = null;
            bN3PilihCabangFragment.rvBranchItem = null;
            bN3PilihCabangFragment.llBottomSheetMain = null;
            bN3PilihCabangFragment.llBottomSheetSearch = null;
            bN3PilihCabangFragment.llPeekSheet = null;
            bN3PilihCabangFragment.rvKantorCabang = null;
            bN3PilihCabangFragment.etFilter = null;
            bN3PilihCabangFragment.tvErrorSearch = null;
            bN3PilihCabangFragment.etSearch = null;
            bN3PilihCabangFragment.llCabangTidakDitemukan = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
