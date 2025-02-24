package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setSplitTrack;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/SumberDanaPilihIdentitasSetunFragment_ViewBinding.class */
public class SumberDanaPilihIdentitasSetunFragment_ViewBinding implements Unbinder {
    private View a;
    private SumberDanaPilihIdentitasSetunFragment b;
    private View c;
    private View d;
    private View e;

    public SumberDanaPilihIdentitasSetunFragment_ViewBinding(final SumberDanaPilihIdentitasSetunFragment sumberDanaPilihIdentitasSetunFragment, View view) {
        this.b = sumberDanaPilihIdentitasSetunFragment;
        sumberDanaPilihIdentitasSetunFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        sumberDanaPilihIdentitasSetunFragment.cvRekening = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296849, "field 'cvRekening'", setSplitTrack.class);
        sumberDanaPilihIdentitasSetunFragment.cvKtp = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296842, "field 'cvKtp'", setSplitTrack.class);
        sumberDanaPilihIdentitasSetunFragment.cvPaspor = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296847, "field 'cvPaspor'", setSplitTrack.class);
        sumberDanaPilihIdentitasSetunFragment.cvSiupNib = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296854, "field 'cvSiupNib'", setSplitTrack.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297868, "method 'showRekeningPage'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.SumberDanaPilihIdentitasSetunFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaPilihIdentitasSetunFragment.showRekeningPage(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297753, "method 'showKtpPage'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.SumberDanaPilihIdentitasSetunFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaPilihIdentitasSetunFragment.showKtpPage(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297840, "method 'showPasporPage'");
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.SumberDanaPilihIdentitasSetunFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaPilihIdentitasSetunFragment.showPasporPage(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297890, "method 'showSiupNibPage'");
        this.e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.SumberDanaPilihIdentitasSetunFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaPilihIdentitasSetunFragment.showSiupNibPage(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SumberDanaPilihIdentitasSetunFragment sumberDanaPilihIdentitasSetunFragment = this.b;
        if (sumberDanaPilihIdentitasSetunFragment != null) {
            this.b = null;
            sumberDanaPilihIdentitasSetunFragment.llMain = null;
            sumberDanaPilihIdentitasSetunFragment.cvRekening = null;
            sumberDanaPilihIdentitasSetunFragment.cvKtp = null;
            sumberDanaPilihIdentitasSetunFragment.cvPaspor = null;
            sumberDanaPilihIdentitasSetunFragment.cvSiupNib = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
