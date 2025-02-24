package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/OutwardRemittanceMenuActivity_ViewBinding.class */
public class OutwardRemittanceMenuActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private OutwardRemittanceMenuActivity d;
    private View e;
    private View f;
    private View h;
    private View i;
    private View j;

    public OutwardRemittanceMenuActivity_ViewBinding(final OutwardRemittanceMenuActivity outwardRemittanceMenuActivity, View view) {
        this.d = outwardRemittanceMenuActivity;
        outwardRemittanceMenuActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        outwardRemittanceMenuActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297726, "method 'onChooseMenu'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OutwardRemittanceMenuActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                outwardRemittanceMenuActivity.onChooseMenu(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297541, "method 'onChooseMenu'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OutwardRemittanceMenuActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                outwardRemittanceMenuActivity.onChooseMenu(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297775, "method 'onChooseMenu'");
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OutwardRemittanceMenuActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                outwardRemittanceMenuActivity.onChooseMenu(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131298931, "method 'detailKirimanUangNormal'");
        this.j = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OutwardRemittanceMenuActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                outwardRemittanceMenuActivity.detailKirimanUangNormal(view2);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131298927, "method 'detailBCAFullPayment'");
        this.b = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OutwardRemittanceMenuActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                outwardRemittanceMenuActivity.detailBCAFullPayment(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131298933, "method 'detailMultiCurrencyBCA'");
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OutwardRemittanceMenuActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                outwardRemittanceMenuActivity.detailMultiCurrencyBCA(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131298934, "method 'detailRTGSCNY'");
        this.f = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OutwardRemittanceMenuActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                outwardRemittanceMenuActivity.detailRTGSCNY(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131298932, "method 'detailLCS'");
        this.i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.OutwardRemittanceMenuActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                outwardRemittanceMenuActivity.detailLCS(view2);
            }
        });
        outwardRemittanceMenuActivity.toolbarTitle = view.getContext().getResources().getString(2131822238);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OutwardRemittanceMenuActivity outwardRemittanceMenuActivity = this.d;
        if (outwardRemittanceMenuActivity != null) {
            this.d = null;
            outwardRemittanceMenuActivity.toolbar = null;
            outwardRemittanceMenuActivity.txtToolbarTitle = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.i.setOnClickListener(null);
            this.i = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
