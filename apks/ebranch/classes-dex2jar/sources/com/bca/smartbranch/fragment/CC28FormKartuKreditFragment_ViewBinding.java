package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC28FormKartuKreditFragment_ViewBinding.class */
public class CC28FormKartuKreditFragment_ViewBinding implements Unbinder {
    private CC28FormKartuKreditFragment b;
    private View e;

    public CC28FormKartuKreditFragment_ViewBinding(final CC28FormKartuKreditFragment cC28FormKartuKreditFragment, View view) {
        this.b = cC28FormKartuKreditFragment;
        cC28FormKartuKreditFragment.tvTermCondition = (TextView) Utils.findRequiredViewAsType(view, 2131299604, "field 'tvTermCondition'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296440, "method 'proses'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC28FormKartuKreditFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC28FormKartuKreditFragment.proses(view2);
            }
        });
        cC28FormKartuKreditFragment.txtTermCondition = view.getContext().getResources().getString(2131821427);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC28FormKartuKreditFragment cC28FormKartuKreditFragment = this.b;
        if (cC28FormKartuKreditFragment != null) {
            this.b = null;
            cC28FormKartuKreditFragment.tvTermCondition = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
