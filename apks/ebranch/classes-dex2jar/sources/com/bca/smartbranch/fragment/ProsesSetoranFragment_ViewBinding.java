package com.bca.smartbranch.fragment;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/ProsesSetoranFragment_ViewBinding.class */
public class ProsesSetoranFragment_ViewBinding implements Unbinder {
    private ProsesSetoranFragment a;
    private View e;

    public ProsesSetoranFragment_ViewBinding(final ProsesSetoranFragment prosesSetoranFragment, View view) {
        this.a = prosesSetoranFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'onClicedButton'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ProsesSetoranFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                prosesSetoranFragment.onClicedButton(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        if (this.a != null) {
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
