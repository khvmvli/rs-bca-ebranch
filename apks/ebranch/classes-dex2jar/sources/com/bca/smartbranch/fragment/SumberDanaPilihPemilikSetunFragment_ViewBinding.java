package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/SumberDanaPilihPemilikSetunFragment_ViewBinding.class */
public class SumberDanaPilihPemilikSetunFragment_ViewBinding implements Unbinder {
    private View a;
    private SumberDanaPilihPemilikSetunFragment b;
    private View c;
    private View e;

    public SumberDanaPilihPemilikSetunFragment_ViewBinding(final SumberDanaPilihPemilikSetunFragment sumberDanaPilihPemilikSetunFragment, View view) {
        this.b = sumberDanaPilihPemilikSetunFragment;
        sumberDanaPilihPemilikSetunFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297879, "field 'llSayaSendiri' and method 'clickSayaSendiri'");
        sumberDanaPilihPemilikSetunFragment.llSayaSendiri = (LinearLayout) Utils.castView(findRequiredView, 2131297879, "field 'llSayaSendiri'", LinearLayout.class);
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.SumberDanaPilihPemilikSetunFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaPilihPemilikSetunFragment.clickSayaSendiri(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297838, "field 'llOrangLain' and method 'clickOrangLain'");
        sumberDanaPilihPemilikSetunFragment.llOrangLain = (LinearLayout) Utils.castView(findRequiredView2, 2131297838, "field 'llOrangLain'", LinearLayout.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.SumberDanaPilihPemilikSetunFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaPilihPemilikSetunFragment.clickOrangLain(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297857, "field 'llPerusahaan' and method 'clickPerusahaan'");
        sumberDanaPilihPemilikSetunFragment.llPerusahaan = (LinearLayout) Utils.castView(findRequiredView3, 2131297857, "field 'llPerusahaan'", LinearLayout.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.SumberDanaPilihPemilikSetunFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaPilihPemilikSetunFragment.clickPerusahaan(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SumberDanaPilihPemilikSetunFragment sumberDanaPilihPemilikSetunFragment = this.b;
        if (sumberDanaPilihPemilikSetunFragment != null) {
            this.b = null;
            sumberDanaPilihPemilikSetunFragment.llMain = null;
            sumberDanaPilihPemilikSetunFragment.llSayaSendiri = null;
            sumberDanaPilihPemilikSetunFragment.llOrangLain = null;
            sumberDanaPilihPemilikSetunFragment.llPerusahaan = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
