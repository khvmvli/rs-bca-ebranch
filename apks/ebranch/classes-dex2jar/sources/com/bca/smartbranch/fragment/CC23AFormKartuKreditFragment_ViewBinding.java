package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC23AFormKartuKreditFragment_ViewBinding.class */
public class CC23AFormKartuKreditFragment_ViewBinding implements Unbinder {
    private CC23AFormKartuKreditFragment b;
    private View e;

    public CC23AFormKartuKreditFragment_ViewBinding(final CC23AFormKartuKreditFragment cC23AFormKartuKreditFragment, View view) {
        this.b = cC23AFormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'next'");
        cC23AFormKartuKreditFragment.btnLanjut = (Button) Utils.castView(findRequiredView, 2131296396, "field 'btnLanjut'", Button.class);
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC23AFormKartuKreditFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC23AFormKartuKreditFragment.next(view2);
            }
        });
        cC23AFormKartuKreditFragment.rvMastercard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298330, "field 'rvMastercard'", setOnStartEnterTransitionListener.class);
        cC23AFormKartuKreditFragment.rvVisa = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298341, "field 'rvVisa'", setOnStartEnterTransitionListener.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC23AFormKartuKreditFragment cC23AFormKartuKreditFragment = this.b;
        if (cC23AFormKartuKreditFragment != null) {
            this.b = null;
            cC23AFormKartuKreditFragment.btnLanjut = null;
            cC23AFormKartuKreditFragment.rvMastercard = null;
            cC23AFormKartuKreditFragment.rvVisa = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
