package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC21AFormKartuKreditFragment_ViewBinding.class */
public class CC21AFormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private CC21AFormKartuKreditFragment e;

    public CC21AFormKartuKreditFragment_ViewBinding(final CC21AFormKartuKreditFragment cC21AFormKartuKreditFragment, View view) {
        this.e = cC21AFormKartuKreditFragment;
        cC21AFormKartuKreditFragment.rvData = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298323, "field 'rvData'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'next'");
        cC21AFormKartuKreditFragment.btnLanjut = (Button) Utils.castView(findRequiredView, 2131296396, "field 'btnLanjut'", Button.class);
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC21AFormKartuKreditFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC21AFormKartuKreditFragment.next(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC21AFormKartuKreditFragment cC21AFormKartuKreditFragment = this.e;
        if (cC21AFormKartuKreditFragment != null) {
            this.e = null;
            cC21AFormKartuKreditFragment.rvData = null;
            cC21AFormKartuKreditFragment.btnLanjut = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
