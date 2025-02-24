package com.bca.smartbranch.fragment;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/ProsesORFragment_ViewBinding.class */
public class ProsesORFragment_ViewBinding implements Unbinder {
    private ProsesORFragment b;
    private View d;

    public ProsesORFragment_ViewBinding(final ProsesORFragment prosesORFragment, View view) {
        this.b = prosesORFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'onClicedButton'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ProsesORFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                prosesORFragment.onClicedButton(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        if (this.b != null) {
            this.b = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
