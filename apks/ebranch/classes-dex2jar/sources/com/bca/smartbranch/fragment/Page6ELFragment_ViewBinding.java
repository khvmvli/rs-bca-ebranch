package com.bca.smartbranch.fragment;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setSplitTrack;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6ELFragment_ViewBinding.class */
public class Page6ELFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private Page6ELFragment e;

    public Page6ELFragment_ViewBinding(final Page6ELFragment page6ELFragment, View view) {
        this.e = page6ELFragment;
        page6ELFragment.cvKTP = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296842, "field 'cvKTP'", setSplitTrack.class);
        page6ELFragment.cvPaspor = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296847, "field 'cvPaspor'", setSplitTrack.class);
        page6ELFragment.cvKartuPelajar = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296839, "field 'cvKartuPelajar'", setSplitTrack.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297753, "method 'showKtpPage'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6ELFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6ELFragment.showKtpPage(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297840, "method 'showPasporPage'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6ELFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6ELFragment.showPasporPage(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297709, "method 'showPelajarPage'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6ELFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6ELFragment.showPelajarPage(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6ELFragment page6ELFragment = this.e;
        if (page6ELFragment != null) {
            this.e = null;
            page6ELFragment.cvKTP = null;
            page6ELFragment.cvPaspor = null;
            page6ELFragment.cvKartuPelajar = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
