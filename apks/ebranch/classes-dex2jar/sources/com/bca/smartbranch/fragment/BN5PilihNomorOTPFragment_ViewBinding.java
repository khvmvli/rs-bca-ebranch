package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN5PilihNomorOTPFragment_ViewBinding.class */
public class BN5PilihNomorOTPFragment_ViewBinding implements Unbinder {
    private BN5PilihNomorOTPFragment a;
    private View e;

    public BN5PilihNomorOTPFragment_ViewBinding(final BN5PilihNomorOTPFragment bN5PilihNomorOTPFragment, View view) {
        this.a = bN5PilihNomorOTPFragment;
        bN5PilihNomorOTPFragment.rvNomorOTP = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298332, "field 'rvNomorOTP'", setOnStartEnterTransitionListener.class);
        bN5PilihNomorOTPFragment.tvErrorNoOTP = (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrorNoOTP'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296442, "method 'onRequestOTP'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.BN5PilihNomorOTPFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN5PilihNomorOTPFragment.onRequestOTP(view2);
            }
        });
        bN5PilihNomorOTPFragment.retry = view.getContext().getResources().getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BN5PilihNomorOTPFragment bN5PilihNomorOTPFragment = this.a;
        if (bN5PilihNomorOTPFragment != null) {
            this.a = null;
            bN5PilihNomorOTPFragment.rvNomorOTP = null;
            bN5PilihNomorOTPFragment.tvErrorNoOTP = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
