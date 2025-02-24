package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC20FormKartuKreditFragment_ViewBinding.class */
public class CC20FormKartuKreditFragment_ViewBinding implements Unbinder {
    private View c;
    private CC20FormKartuKreditFragment d;

    public CC20FormKartuKreditFragment_ViewBinding(final CC20FormKartuKreditFragment cC20FormKartuKreditFragment, View view) {
        this.d = cC20FormKartuKreditFragment;
        cC20FormKartuKreditFragment.rgDestination = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298214, "field 'rgDestination'", RadioGroup.class);
        cC20FormKartuKreditFragment.rbRumah = (RadioButton) Utils.findRequiredViewAsType(view, 2131298176, "field 'rbRumah'", RadioButton.class);
        cC20FormKartuKreditFragment.rbKantor = (RadioButton) Utils.findRequiredViewAsType(view, 2131298150, "field 'rbKantor'", RadioButton.class);
        cC20FormKartuKreditFragment.rgAddCC = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298211, "field 'rgAddCC'", RadioGroup.class);
        cC20FormKartuKreditFragment.rbYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298194, "field 'rbYa'", RadioButton.class);
        cC20FormKartuKreditFragment.rbTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298183, "field 'rbTidak'", RadioButton.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296396, "method 'onCLickedLanjut'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC20FormKartuKreditFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC20FormKartuKreditFragment.onCLickedLanjut(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC20FormKartuKreditFragment cC20FormKartuKreditFragment = this.d;
        if (cC20FormKartuKreditFragment != null) {
            this.d = null;
            cC20FormKartuKreditFragment.rgDestination = null;
            cC20FormKartuKreditFragment.rbRumah = null;
            cC20FormKartuKreditFragment.rbKantor = null;
            cC20FormKartuKreditFragment.rgAddCC = null;
            cC20FormKartuKreditFragment.rbYa = null;
            cC20FormKartuKreditFragment.rbTidak = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
