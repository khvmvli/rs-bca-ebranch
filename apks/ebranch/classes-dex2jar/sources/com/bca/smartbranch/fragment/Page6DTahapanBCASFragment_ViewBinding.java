package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.getAnnualFeeAddOnAmount;
import o.setSplitTrack;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6DTahapanBCASFragment_ViewBinding.class */
public class Page6DTahapanBCASFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private Page6DTahapanBCASFragment d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View m;
    private View n;

    /* renamed from: o  reason: collision with root package name */
    private View f49o;
    private View p;
    private View q;
    private View r;
    private View s;
    private View t;

    public Page6DTahapanBCASFragment_ViewBinding(final Page6DTahapanBCASFragment page6DTahapanBCASFragment, View view) {
        this.d = page6DTahapanBCASFragment;
        page6DTahapanBCASFragment.rgLanguage = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298223, "field 'rgLanguage'", RadioGroup.class);
        page6DTahapanBCASFragment.rbLanguageIna = (RadioButton) Utils.findRequiredViewAsType(view, 2131298164, "field 'rbLanguageIna'", RadioButton.class);
        page6DTahapanBCASFragment.rbLanguageEng = (RadioButton) Utils.findRequiredViewAsType(view, 2131298163, "field 'rbLanguageEng'", RadioButton.class);
        page6DTahapanBCASFragment.tbEmailCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298443, "field 'tbEmailCheck'", CheckBox.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChange'");
        page6DTahapanBCASFragment.etEmail = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView, 2131296976, "field 'etEmail'", getAnnualFeeAddOnAmount.class);
        this.f = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DTahapanBCASFragment.inputChange(view2, z);
            }
        });
        page6DTahapanBCASFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        page6DTahapanBCASFragment.tbNoHpCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298448, "field 'tbNoHpCheck'", CheckBox.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297094, "field 'etNoHp' and method 'inputChange'");
        page6DTahapanBCASFragment.etNoHp = (EditText) Utils.castView(findRequiredView2, 2131297094, "field 'etNoHp'", EditText.class);
        this.i = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.13
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DTahapanBCASFragment.inputChange(view2, z);
            }
        });
        page6DTahapanBCASFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        page6DTahapanBCASFragment.tvTitleFasilitas = (TextView) Utils.findRequiredViewAsType(view, 2131299629, "field 'tvTitleFasilitas'", TextView.class);
        page6DTahapanBCASFragment.tvLanguageATM = (TextView) Utils.findRequiredViewAsType(view, 2131296946, "field 'tvLanguageATM'", TextView.class);
        page6DTahapanBCASFragment.llInternertBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297691, "field 'llInternertBanking'", LinearLayout.class);
        page6DTahapanBCASFragment.llMobileBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297774, "field 'llMobileBanking'", LinearLayout.class);
        page6DTahapanBCASFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296834, "field 'cvCardSilver' and method 'onClickCardSilver'");
        page6DTahapanBCASFragment.cvCardSilver = (setSplitTrack) Utils.castView(findRequiredView3, 2131296834, "field 'cvCardSilver'", setSplitTrack.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.onClickCardSilver();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296832, "field 'cvCardGold' and method 'onClickCardGold'");
        page6DTahapanBCASFragment.cvCardGold = (setSplitTrack) Utils.castView(findRequiredView4, 2131296832, "field 'cvCardGold'", setSplitTrack.class);
        this.c = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.15
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.onClickCardGold();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296833, "field 'cvCardPlatinum' and method 'onClickCardPlatinum'");
        page6DTahapanBCASFragment.cvCardPlatinum = (setSplitTrack) Utils.castView(findRequiredView5, 2131296833, "field 'cvCardPlatinum'", setSplitTrack.class);
        this.e = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.11
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.onClickCardPlatinum();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.b = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.20
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.next(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297565, "method 'onClickCardSilver'");
        this.n = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.16
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.onClickCardSilver();
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297324, "method 'onClickCardSilver'");
        this.g = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.18
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.onClickCardSilver();
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297618, "method 'onClickCardSilver'");
        this.s = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.19
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.onClickCardSilver();
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297563, "method 'onClickCardGold'");
        this.l = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.onClickCardGold();
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297318, "method 'onClickCardGold'");
        this.j = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.onClickCardGold();
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297616, "method 'onClickCardGold'");
        this.t = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.onClickCardGold();
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297564, "method 'onClickCardPlatinum'");
        this.m = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.onClickCardPlatinum();
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131297322, "method 'onClickCardPlatinum'");
        this.h = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.onClickCardPlatinum();
            }
        });
        View findRequiredView15 = Utils.findRequiredView(view, 2131297617, "method 'onClickCardPlatinum'");
        this.p = findRequiredView15;
        findRequiredView15.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.onClickCardPlatinum();
            }
        });
        View findRequiredView16 = Utils.findRequiredView(view, 2131299360, "method 'clikedKlikBCA'");
        this.r = findRequiredView16;
        findRequiredView16.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.clikedKlikBCA(view2);
            }
        });
        View findRequiredView17 = Utils.findRequiredView(view, 2131299404, "method 'clikedMBCA'");
        this.q = findRequiredView17;
        findRequiredView17.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.clikedMBCA(view2);
            }
        });
        View findRequiredView18 = Utils.findRequiredView(view, 2131297358, "method 'showInfoBanking'");
        this.k = findRequiredView18;
        findRequiredView18.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.showInfoBanking(view2);
            }
        });
        View findRequiredView19 = Utils.findRequiredView(view, 2131297404, "method 'showInfoBanking'");
        this.f49o = findRequiredView19;
        findRequiredView19.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCASFragment_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCASFragment.showInfoBanking(view2);
            }
        });
        page6DTahapanBCASFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296976, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"));
        page6DTahapanBCASFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299019, "field 'tvErrors'", TextView.class));
        page6DTahapanBCASFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        page6DTahapanBCASFragment.titleFasilitas = resources.getString(2131821646);
        page6DTahapanBCASFragment.txtLanguageATM = resources.getString(2131821339);
        page6DTahapanBCASFragment.invalidHandphoneMessage = resources.getString(2131820903);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6DTahapanBCASFragment page6DTahapanBCASFragment = this.d;
        if (page6DTahapanBCASFragment != null) {
            this.d = null;
            page6DTahapanBCASFragment.rgLanguage = null;
            page6DTahapanBCASFragment.rbLanguageIna = null;
            page6DTahapanBCASFragment.rbLanguageEng = null;
            page6DTahapanBCASFragment.tbEmailCheck = null;
            page6DTahapanBCASFragment.etEmail = null;
            page6DTahapanBCASFragment.tilEmail = null;
            page6DTahapanBCASFragment.tbNoHpCheck = null;
            page6DTahapanBCASFragment.etNoHp = null;
            page6DTahapanBCASFragment.tilNoHp = null;
            page6DTahapanBCASFragment.tvTitleFasilitas = null;
            page6DTahapanBCASFragment.tvLanguageATM = null;
            page6DTahapanBCASFragment.llInternertBanking = null;
            page6DTahapanBCASFragment.llMobileBanking = null;
            page6DTahapanBCASFragment.llMain = null;
            page6DTahapanBCASFragment.cvCardSilver = null;
            page6DTahapanBCASFragment.cvCardGold = null;
            page6DTahapanBCASFragment.cvCardPlatinum = null;
            page6DTahapanBCASFragment.etFields = null;
            page6DTahapanBCASFragment.tvErrors = null;
            page6DTahapanBCASFragment.tilForms = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.s.setOnClickListener(null);
            this.s = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.t.setOnClickListener(null);
            this.t = null;
            this.m.setOnClickListener(null);
            this.m = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.p.setOnClickListener(null);
            this.p = null;
            this.r.setOnClickListener(null);
            this.r = null;
            this.q.setOnClickListener(null);
            this.q = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.f49o.setOnClickListener(null);
            this.f49o = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
