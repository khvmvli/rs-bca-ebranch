package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC17FormKartuKreditFragment_ViewBinding.class */
public class CC17FormKartuKreditFragment_ViewBinding implements Unbinder {
    private CC17FormKartuKreditFragment a;
    private View c;

    public CC17FormKartuKreditFragment_ViewBinding(final CC17FormKartuKreditFragment cC17FormKartuKreditFragment, View view) {
        this.a = cC17FormKartuKreditFragment;
        cC17FormKartuKreditFragment.rgPenambahanFasilitas = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298227, "field 'rgPenambahanFasilitas'", RadioGroup.class);
        cC17FormKartuKreditFragment.rbYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298194, "field 'rbYa'", RadioButton.class);
        cC17FormKartuKreditFragment.rbTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298183, "field 'rbTidak'", RadioButton.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC17FormKartuKreditFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC17FormKartuKreditFragment.next(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC17FormKartuKreditFragment cC17FormKartuKreditFragment = this.a;
        if (cC17FormKartuKreditFragment != null) {
            this.a = null;
            cC17FormKartuKreditFragment.rgPenambahanFasilitas = null;
            cC17FormKartuKreditFragment.rbYa = null;
            cC17FormKartuKreditFragment.rbTidak = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
