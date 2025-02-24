package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC23CFormKartuKreditFragment_ViewBinding.class */
public class CC23CFormKartuKreditFragment_ViewBinding implements Unbinder {
    private View b;
    private CC23CFormKartuKreditFragment d;

    public CC23CFormKartuKreditFragment_ViewBinding(final CC23CFormKartuKreditFragment cC23CFormKartuKreditFragment, View view) {
        this.d = cC23CFormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'next'");
        cC23CFormKartuKreditFragment.btnLanjut = (Button) Utils.castView(findRequiredView, 2131296396, "field 'btnLanjut'", Button.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC23CFormKartuKreditFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC23CFormKartuKreditFragment.next(view2);
            }
        });
        cC23CFormKartuKreditFragment.rvMastercard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298330, "field 'rvMastercard'", setOnStartEnterTransitionListener.class);
        cC23CFormKartuKreditFragment.rvVisa = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298341, "field 'rvVisa'", setOnStartEnterTransitionListener.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC23CFormKartuKreditFragment cC23CFormKartuKreditFragment = this.d;
        if (cC23CFormKartuKreditFragment != null) {
            this.d = null;
            cC23CFormKartuKreditFragment.btnLanjut = null;
            cC23CFormKartuKreditFragment.rvMastercard = null;
            cC23CFormKartuKreditFragment.rvVisa = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
