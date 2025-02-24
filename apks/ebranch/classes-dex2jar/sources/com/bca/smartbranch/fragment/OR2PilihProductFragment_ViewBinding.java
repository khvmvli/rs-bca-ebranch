package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setSplitTrack;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR2PilihProductFragment_ViewBinding.class */
public class OR2PilihProductFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private OR2PilihProductFragment d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View m;

    public OR2PilihProductFragment_ViewBinding(final OR2PilihProductFragment oR2PilihProductFragment, View view) {
        this.d = oR2PilihProductFragment;
        oR2PilihProductFragment.cvKirimanUangNormal = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296841, "field 'cvKirimanUangNormal'", setSplitTrack.class);
        oR2PilihProductFragment.cvBCAFullPaymnet = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296831, "field 'cvBCAFullPaymnet'", setSplitTrack.class);
        oR2PilihProductFragment.cvMulticurrency = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296845, "field 'cvMulticurrency'", setSplitTrack.class);
        oR2PilihProductFragment.cvRtgs = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296850, "field 'cvRtgs'", setSplitTrack.class);
        oR2PilihProductFragment.cvLcs = (setSplitTrack) Utils.findRequiredViewAsType(view, 2131296843, "field 'cvLcs'", setSplitTrack.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296397, "field 'btnLewati' and method 'lewati'");
        oR2PilihProductFragment.btnLewati = (Button) Utils.castView(findRequiredView, 2131296397, "field 'btnLewati'", Button.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2PilihProductFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2PilihProductFragment.lewati(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297726, "method 'onChooseMenu'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2PilihProductFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2PilihProductFragment.onChooseMenu(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297541, "method 'onChooseMenu'");
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2PilihProductFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2PilihProductFragment.onChooseMenu(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297775, "method 'onChooseMenu'");
        this.f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2PilihProductFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2PilihProductFragment.onChooseMenu(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297760, "method 'onChooseMenu'");
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2PilihProductFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2PilihProductFragment.onChooseMenu(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131298931, "method 'detailKirimanUangNormal'");
        this.g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2PilihProductFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2PilihProductFragment.detailKirimanUangNormal(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131298927, "method 'detailBCAFullPayment'");
        this.h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2PilihProductFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2PilihProductFragment.detailBCAFullPayment(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131298933, "method 'detailMultiCurrencyBCA'");
        this.j = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2PilihProductFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2PilihProductFragment.detailMultiCurrencyBCA(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131298934, "method 'detailRTGSCNY'");
        this.m = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2PilihProductFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2PilihProductFragment.detailRTGSCNY(view2);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131298932, "method 'detailLCS'");
        this.i = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2PilihProductFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2PilihProductFragment.detailLCS(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OR2PilihProductFragment oR2PilihProductFragment = this.d;
        if (oR2PilihProductFragment != null) {
            this.d = null;
            oR2PilihProductFragment.cvKirimanUangNormal = null;
            oR2PilihProductFragment.cvBCAFullPaymnet = null;
            oR2PilihProductFragment.cvMulticurrency = null;
            oR2PilihProductFragment.cvRtgs = null;
            oR2PilihProductFragment.cvLcs = null;
            oR2PilihProductFragment.btnLewati = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.m.setOnClickListener(null);
            this.m = null;
            this.i.setOnClickListener(null);
            this.i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
