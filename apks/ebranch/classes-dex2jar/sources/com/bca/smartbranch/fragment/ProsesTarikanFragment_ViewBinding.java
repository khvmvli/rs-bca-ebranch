package com.bca.smartbranch.fragment;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/ProsesTarikanFragment_ViewBinding.class */
public class ProsesTarikanFragment_ViewBinding implements Unbinder {
    private ProsesTarikanFragment d;
    private View e;

    public ProsesTarikanFragment_ViewBinding(final ProsesTarikanFragment prosesTarikanFragment, View view) {
        this.d = prosesTarikanFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'onClicedButton'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ProsesTarikanFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                prosesTarikanFragment.onClicedButton(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        if (this.d != null) {
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
