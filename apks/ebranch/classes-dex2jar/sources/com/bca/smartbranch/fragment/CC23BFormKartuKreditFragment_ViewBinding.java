package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC23BFormKartuKreditFragment_ViewBinding.class */
public class CC23BFormKartuKreditFragment_ViewBinding implements Unbinder {
    private CC23BFormKartuKreditFragment c;
    private View d;

    public CC23BFormKartuKreditFragment_ViewBinding(final CC23BFormKartuKreditFragment cC23BFormKartuKreditFragment, View view) {
        this.c = cC23BFormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'next'");
        cC23BFormKartuKreditFragment.btnLanjut = (Button) Utils.castView(findRequiredView, 2131296396, "field 'btnLanjut'", Button.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC23BFormKartuKreditFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC23BFormKartuKreditFragment.next(view2);
            }
        });
        cC23BFormKartuKreditFragment.rvMastercard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298330, "field 'rvMastercard'", setOnStartEnterTransitionListener.class);
        cC23BFormKartuKreditFragment.rvVisa = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298341, "field 'rvVisa'", setOnStartEnterTransitionListener.class);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC23BFormKartuKreditFragment cC23BFormKartuKreditFragment = this.c;
        if (cC23BFormKartuKreditFragment != null) {
            this.c = null;
            cC23BFormKartuKreditFragment.btnLanjut = null;
            cC23BFormKartuKreditFragment.rvMastercard = null;
            cC23BFormKartuKreditFragment.rvVisa = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
