package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC25CFormKartuKreditFragment_ViewBinding.class */
public class CC25CFormKartuKreditFragment_ViewBinding implements Unbinder {
    private CC25CFormKartuKreditFragment a;
    private View b;
    private View c;
    private View d;
    private View e;

    public CC25CFormKartuKreditFragment_ViewBinding(final CC25CFormKartuKreditFragment cC25CFormKartuKreditFragment, View view) {
        this.a = cC25CFormKartuKreditFragment;
        cC25CFormKartuKreditFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        cC25CFormKartuKreditFragment.llBcaCard = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297545, "field 'llBcaCard'", LinearLayout.class);
        cC25CFormKartuKreditFragment.llMasterCard = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297771, "field 'llMasterCard'", LinearLayout.class);
        cC25CFormKartuKreditFragment.dvdMastercard = Utils.findRequiredView(view, 2131296901, "field 'dvdMastercard'");
        cC25CFormKartuKreditFragment.llVisaCard = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297931, "field 'llVisaCard'", LinearLayout.class);
        cC25CFormKartuKreditFragment.dvdVisacard = Utils.findRequiredView(view, 2131296908, "field 'dvdVisacard'");
        cC25CFormKartuKreditFragment.rvBcaCard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298317, "field 'rvBcaCard'", setOnStartEnterTransitionListener.class);
        cC25CFormKartuKreditFragment.rvMasterCard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298330, "field 'rvMasterCard'", setOnStartEnterTransitionListener.class);
        cC25CFormKartuKreditFragment.rvVisaCard = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298342, "field 'rvVisaCard'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299698, "method 'ubahBcaCard'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC25CFormKartuKreditFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC25CFormKartuKreditFragment.ubahBcaCard();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131299725, "method 'ubahMasterCard'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC25CFormKartuKreditFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC25CFormKartuKreditFragment.ubahMasterCard();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131299729, "method 'ubahVisaCard'");
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC25CFormKartuKreditFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC25CFormKartuKreditFragment.ubahVisaCard();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.c = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC25CFormKartuKreditFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC25CFormKartuKreditFragment.next(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC25CFormKartuKreditFragment cC25CFormKartuKreditFragment = this.a;
        if (cC25CFormKartuKreditFragment != null) {
            this.a = null;
            cC25CFormKartuKreditFragment.llMain = null;
            cC25CFormKartuKreditFragment.llBcaCard = null;
            cC25CFormKartuKreditFragment.llMasterCard = null;
            cC25CFormKartuKreditFragment.dvdMastercard = null;
            cC25CFormKartuKreditFragment.llVisaCard = null;
            cC25CFormKartuKreditFragment.dvdVisacard = null;
            cC25CFormKartuKreditFragment.rvBcaCard = null;
            cC25CFormKartuKreditFragment.rvMasterCard = null;
            cC25CFormKartuKreditFragment.rvVisaCard = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
