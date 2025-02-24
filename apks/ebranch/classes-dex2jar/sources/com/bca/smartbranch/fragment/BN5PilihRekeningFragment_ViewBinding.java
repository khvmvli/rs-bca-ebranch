package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN5PilihRekeningFragment_ViewBinding.class */
public class BN5PilihRekeningFragment_ViewBinding implements Unbinder {
    private BN5PilihRekeningFragment a;
    private View d;

    public BN5PilihRekeningFragment_ViewBinding(final BN5PilihRekeningFragment bN5PilihRekeningFragment, View view) {
        this.a = bN5PilihRekeningFragment;
        bN5PilihRekeningFragment.rvNomorRekening = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298333, "field 'rvNomorRekening'", setOnStartEnterTransitionListener.class);
        bN5PilihRekeningFragment.tvErrorNoRek = (TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrorNoRek'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.BN5PilihRekeningFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                bN5PilihRekeningFragment.lanjut();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BN5PilihRekeningFragment bN5PilihRekeningFragment = this.a;
        if (bN5PilihRekeningFragment != null) {
            this.a = null;
            bN5PilihRekeningFragment.rvNomorRekening = null;
            bN5PilihRekeningFragment.tvErrorNoRek = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
