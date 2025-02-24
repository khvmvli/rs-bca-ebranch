package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC21CFormKartuKreditFragment_ViewBinding.class */
public class CC21CFormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private CC21CFormKartuKreditFragment e;

    public CC21CFormKartuKreditFragment_ViewBinding(final CC21CFormKartuKreditFragment cC21CFormKartuKreditFragment, View view) {
        this.e = cC21CFormKartuKreditFragment;
        cC21CFormKartuKreditFragment.rvData = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298323, "field 'rvData'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'next'");
        cC21CFormKartuKreditFragment.btnLanjut = (Button) Utils.castView(findRequiredView, 2131296396, "field 'btnLanjut'", Button.class);
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC21CFormKartuKreditFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC21CFormKartuKreditFragment.next(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC21CFormKartuKreditFragment cC21CFormKartuKreditFragment = this.e;
        if (cC21CFormKartuKreditFragment != null) {
            this.e = null;
            cC21CFormKartuKreditFragment.rvData = null;
            cC21CFormKartuKreditFragment.btnLanjut = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
