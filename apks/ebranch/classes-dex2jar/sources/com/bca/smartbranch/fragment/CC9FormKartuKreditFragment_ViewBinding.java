package com.bca.smartbranch.fragment;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setSplitTrack;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC9FormKartuKreditFragment_ViewBinding.class */
public class CC9FormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private CC9FormKartuKreditFragment d;
    private View e;

    public CC9FormKartuKreditFragment_ViewBinding(final CC9FormKartuKreditFragment cC9FormKartuKreditFragment, View view) {
        this.d = cC9FormKartuKreditFragment;
        cC9FormKartuKreditFragment.cvKtp = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296842, "field 'cvKtp'", setSplitTrack.class);
        cC9FormKartuKreditFragment.cvPaspor = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296847, "field 'cvPaspor'", setSplitTrack.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297753, "method 'showKtpPage'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC9FormKartuKreditFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC9FormKartuKreditFragment.showKtpPage(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297840, "method 'showPasporPage'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC9FormKartuKreditFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC9FormKartuKreditFragment.showPasporPage(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC9FormKartuKreditFragment cC9FormKartuKreditFragment = this.d;
        if (cC9FormKartuKreditFragment != null) {
            this.d = null;
            cC9FormKartuKreditFragment.cvKtp = null;
            cC9FormKartuKreditFragment.cvPaspor = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
