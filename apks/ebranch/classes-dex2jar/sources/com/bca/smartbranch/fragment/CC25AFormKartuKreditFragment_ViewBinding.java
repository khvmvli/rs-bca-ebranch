package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC25AFormKartuKreditFragment_ViewBinding.class */
public class CC25AFormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private CC25AFormKartuKreditFragment b;
    private View c;
    private View d;
    private View e;

    public CC25AFormKartuKreditFragment_ViewBinding(final CC25AFormKartuKreditFragment cC25AFormKartuKreditFragment, View view) {
        this.b = cC25AFormKartuKreditFragment;
        cC25AFormKartuKreditFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        cC25AFormKartuKreditFragment.llBcaCard = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297545, "field 'llBcaCard'", LinearLayout.class);
        cC25AFormKartuKreditFragment.llMasterCard = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297771, "field 'llMasterCard'", LinearLayout.class);
        cC25AFormKartuKreditFragment.dvdMastercard = Utils.findRequiredView(view, 2131296901, "field 'dvdMastercard'");
        cC25AFormKartuKreditFragment.llVisaCard = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297931, "field 'llVisaCard'", LinearLayout.class);
        cC25AFormKartuKreditFragment.dvdVisacard = Utils.findRequiredView(view, 2131296908, "field 'dvdVisacard'");
        cC25AFormKartuKreditFragment.rvBcaCard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298317, "field 'rvBcaCard'", setOnStartEnterTransitionListener.class);
        cC25AFormKartuKreditFragment.rvMasterCard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298330, "field 'rvMasterCard'", setOnStartEnterTransitionListener.class);
        cC25AFormKartuKreditFragment.rvVisaCard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298342, "field 'rvVisaCard'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299698, "method 'ubahBcaCard'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC25AFormKartuKreditFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC25AFormKartuKreditFragment.ubahBcaCard();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131299725, "method 'ubahMasterCard'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC25AFormKartuKreditFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC25AFormKartuKreditFragment.ubahMasterCard();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131299729, "method 'ubahVisaCard'");
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC25AFormKartuKreditFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC25AFormKartuKreditFragment.ubahVisaCard();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.d = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC25AFormKartuKreditFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC25AFormKartuKreditFragment.next(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC25AFormKartuKreditFragment cC25AFormKartuKreditFragment = this.b;
        if (cC25AFormKartuKreditFragment != null) {
            this.b = null;
            cC25AFormKartuKreditFragment.llMain = null;
            cC25AFormKartuKreditFragment.llBcaCard = null;
            cC25AFormKartuKreditFragment.llMasterCard = null;
            cC25AFormKartuKreditFragment.dvdMastercard = null;
            cC25AFormKartuKreditFragment.llVisaCard = null;
            cC25AFormKartuKreditFragment.dvdVisacard = null;
            cC25AFormKartuKreditFragment.rvBcaCard = null;
            cC25AFormKartuKreditFragment.rvMasterCard = null;
            cC25AFormKartuKreditFragment.rvVisaCard = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
