package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC25BFormKartuKreditFragment_ViewBinding.class */
public class CC25BFormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private CC25BFormKartuKreditFragment b;
    private View c;
    private View d;
    private View e;

    public CC25BFormKartuKreditFragment_ViewBinding(final CC25BFormKartuKreditFragment cC25BFormKartuKreditFragment, View view) {
        this.b = cC25BFormKartuKreditFragment;
        cC25BFormKartuKreditFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        cC25BFormKartuKreditFragment.llBcaCard = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297545, "field 'llBcaCard'", LinearLayout.class);
        cC25BFormKartuKreditFragment.llMasterCard = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297771, "field 'llMasterCard'", LinearLayout.class);
        cC25BFormKartuKreditFragment.dvdMastercard = Utils.findRequiredView(view, 2131296901, "field 'dvdMastercard'");
        cC25BFormKartuKreditFragment.llVisaCard = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297931, "field 'llVisaCard'", LinearLayout.class);
        cC25BFormKartuKreditFragment.dvdVisacard = Utils.findRequiredView(view, 2131296908, "field 'dvdVisacard'");
        cC25BFormKartuKreditFragment.rvBcaCard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298317, "field 'rvBcaCard'", setOnStartEnterTransitionListener.class);
        cC25BFormKartuKreditFragment.rvMasterCard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298330, "field 'rvMasterCard'", setOnStartEnterTransitionListener.class);
        cC25BFormKartuKreditFragment.rvVisaCard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298342, "field 'rvVisaCard'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299698, "method 'ubahBcaCard'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC25BFormKartuKreditFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC25BFormKartuKreditFragment.ubahBcaCard();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131299725, "method 'ubahMasterCard'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC25BFormKartuKreditFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC25BFormKartuKreditFragment.ubahMasterCard();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131299729, "method 'ubahVisaCard'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC25BFormKartuKreditFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC25BFormKartuKreditFragment.ubahVisaCard();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC25BFormKartuKreditFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC25BFormKartuKreditFragment.next(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC25BFormKartuKreditFragment cC25BFormKartuKreditFragment = this.b;
        if (cC25BFormKartuKreditFragment != null) {
            this.b = null;
            cC25BFormKartuKreditFragment.llMain = null;
            cC25BFormKartuKreditFragment.llBcaCard = null;
            cC25BFormKartuKreditFragment.llMasterCard = null;
            cC25BFormKartuKreditFragment.dvdMastercard = null;
            cC25BFormKartuKreditFragment.llVisaCard = null;
            cC25BFormKartuKreditFragment.dvdVisacard = null;
            cC25BFormKartuKreditFragment.rvBcaCard = null;
            cC25BFormKartuKreditFragment.rvMasterCard = null;
            cC25BFormKartuKreditFragment.rvVisaCard = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
