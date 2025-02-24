package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC21BFormKartuKreditFragment_ViewBinding.class */
public class CC21BFormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private CC21BFormKartuKreditFragment e;

    public CC21BFormKartuKreditFragment_ViewBinding(final CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment, View view) {
        this.e = cC21BFormKartuKreditFragment;
        cC21BFormKartuKreditFragment.rvData = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298323, "field 'rvData'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'next'");
        cC21BFormKartuKreditFragment.btnLanjut = (Button) Utils.castView(findRequiredView, 2131296396, "field 'btnLanjut'", Button.class);
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC21BFormKartuKreditFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC21BFormKartuKreditFragment.next(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment = this.e;
        if (cC21BFormKartuKreditFragment != null) {
            this.e = null;
            cC21BFormKartuKreditFragment.rvData = null;
            cC21BFormKartuKreditFragment.btnLanjut = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
