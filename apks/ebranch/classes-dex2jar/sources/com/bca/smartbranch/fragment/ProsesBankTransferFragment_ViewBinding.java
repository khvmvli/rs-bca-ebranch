package com.bca.smartbranch.fragment;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/ProsesBankTransferFragment_ViewBinding.class */
public class ProsesBankTransferFragment_ViewBinding implements Unbinder {
    private ProsesBankTransferFragment a;
    private View e;

    public ProsesBankTransferFragment_ViewBinding(final ProsesBankTransferFragment prosesBankTransferFragment, View view) {
        this.a = prosesBankTransferFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'onClicedButton'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.ProsesBankTransferFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                prosesBankTransferFragment.onClicedButton(view2);
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
