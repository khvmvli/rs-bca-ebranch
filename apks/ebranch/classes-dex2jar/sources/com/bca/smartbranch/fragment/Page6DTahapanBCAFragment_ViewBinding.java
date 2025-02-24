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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6DTahapanBCAFragment_ViewBinding.class */
public class Page6DTahapanBCAFragment_ViewBinding implements Unbinder {
    private Page6DTahapanBCAFragment a;
    private View b;
    private View c;
    private View d;
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
    private View f48o;
    private View p;
    private View q;
    private View r;
    private View s;
    private View t;

    public Page6DTahapanBCAFragment_ViewBinding(final Page6DTahapanBCAFragment page6DTahapanBCAFragment, View view) {
        this.a = page6DTahapanBCAFragment;
        page6DTahapanBCAFragment.rgLanguage = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298223, "field 'rgLanguage'", RadioGroup.class);
        page6DTahapanBCAFragment.rbLanguageIna = (RadioButton) Utils.findRequiredViewAsType(view, 2131298164, "field 'rbLanguageIna'", RadioButton.class);
        page6DTahapanBCAFragment.rbLanguageEng = (RadioButton) Utils.findRequiredViewAsType(view, 2131298163, "field 'rbLanguageEng'", RadioButton.class);
        page6DTahapanBCAFragment.tbEmailCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298443, "field 'tbEmailCheck'", CheckBox.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChange'");
        page6DTahapanBCAFragment.etEmail = (getAnnualFeeAddOnAmount) Utils.castView(findRequiredView, 2131296976, "field 'etEmail'", getAnnualFeeAddOnAmount.class);
        this.g = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DTahapanBCAFragment.inputChange(view2, z);
            }
        });
        page6DTahapanBCAFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        page6DTahapanBCAFragment.tbNoHpCheck = (CheckBox) Utils.findRequiredViewAsType(view, 2131298448, "field 'tbNoHpCheck'", CheckBox.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131297094, "field 'etNoHp' and method 'inputChange'");
        page6DTahapanBCAFragment.etNoHp = (EditText) Utils.castView(findRequiredView2, 2131297094, "field 'etNoHp'", EditText.class);
        this.i = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.11
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6DTahapanBCAFragment.inputChange(view2, z);
            }
        });
        page6DTahapanBCAFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        page6DTahapanBCAFragment.tvTitleFasilitas = (TextView) Utils.findRequiredViewAsType(view, 2131299629, "field 'tvTitleFasilitas'", TextView.class);
        page6DTahapanBCAFragment.tvLanguageATM = (TextView) Utils.findRequiredViewAsType(view, 2131296946, "field 'tvLanguageATM'", TextView.class);
        page6DTahapanBCAFragment.llInternertBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297691, "field 'llInternertBanking'", LinearLayout.class);
        page6DTahapanBCAFragment.llMobileBanking = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297774, "field 'llMobileBanking'", LinearLayout.class);
        page6DTahapanBCAFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296834, "field 'cvCardSilver' and method 'onClickCardSilver'");
        page6DTahapanBCAFragment.cvCardSilver = (setSplitTrack) Utils.castView(findRequiredView3, 2131296834, "field 'cvCardSilver'", setSplitTrack.class);
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.onClickCardSilver();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296832, "field 'cvCardGold' and method 'onClickCardGold'");
        page6DTahapanBCAFragment.cvCardGold = (setSplitTrack) Utils.castView(findRequiredView4, 2131296832, "field 'cvCardGold'", setSplitTrack.class);
        this.e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.15
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.onClickCardGold();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296833, "field 'cvCardPlatinum' and method 'onClickCardPlatinum'");
        page6DTahapanBCAFragment.cvCardPlatinum = (setSplitTrack) Utils.castView(findRequiredView5, 2131296833, "field 'cvCardPlatinum'", setSplitTrack.class);
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.13
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.onClickCardPlatinum();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.d = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.16
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.next(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297565, "method 'onClickCardSilver'");
        this.m = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.19
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.onClickCardSilver();
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297324, "method 'onClickCardSilver'");
        this.j = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.17
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.onClickCardSilver();
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297618, "method 'onClickCardSilver'");
        this.t = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.18
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.onClickCardSilver();
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297563, "method 'onClickCardGold'");
        this.n = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.onClickCardGold();
            }
        });
        View findRequiredView11 = Utils.findRequiredView(view, 2131297318, "method 'onClickCardGold'");
        this.f = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.onClickCardGold();
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131297616, "method 'onClickCardGold'");
        this.q = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.onClickCardGold();
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297564, "method 'onClickCardPlatinum'");
        this.l = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.onClickCardPlatinum();
            }
        });
        View findRequiredView14 = Utils.findRequiredView(view, 2131297322, "method 'onClickCardPlatinum'");
        this.h = findRequiredView14;
        findRequiredView14.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.onClickCardPlatinum();
            }
        });
        View findRequiredView15 = Utils.findRequiredView(view, 2131297617, "method 'onClickCardPlatinum'");
        this.s = findRequiredView15;
        findRequiredView15.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.onClickCardPlatinum();
            }
        });
        View findRequiredView16 = Utils.findRequiredView(view, 2131299360, "method 'clikedKlikBCA'");
        this.p = findRequiredView16;
        findRequiredView16.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.clikedKlikBCA(view2);
            }
        });
        View findRequiredView17 = Utils.findRequiredView(view, 2131299404, "method 'clikedMBCA'");
        this.r = findRequiredView17;
        findRequiredView17.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.clikedMBCA(view2);
            }
        });
        View findRequiredView18 = Utils.findRequiredView(view, 2131297358, "method 'showInfoBanking'");
        this.k = findRequiredView18;
        findRequiredView18.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.showInfoBanking(view2);
            }
        });
        View findRequiredView19 = Utils.findRequiredView(view, 2131297404, "method 'showInfoBanking'");
        this.f48o = findRequiredView19;
        findRequiredView19.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6DTahapanBCAFragment_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6DTahapanBCAFragment.showInfoBanking(view2);
            }
        });
        page6DTahapanBCAFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296976, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"));
        page6DTahapanBCAFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299019, "field 'tvErrors'", TextView.class));
        page6DTahapanBCAFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        page6DTahapanBCAFragment.titleFasilitas = resources.getString(2131821646);
        page6DTahapanBCAFragment.txtLanguageATM = resources.getString(2131821339);
        page6DTahapanBCAFragment.invalidHandphoneMessage = resources.getString(2131820903);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6DTahapanBCAFragment page6DTahapanBCAFragment = this.a;
        if (page6DTahapanBCAFragment != null) {
            this.a = null;
            page6DTahapanBCAFragment.rgLanguage = null;
            page6DTahapanBCAFragment.rbLanguageIna = null;
            page6DTahapanBCAFragment.rbLanguageEng = null;
            page6DTahapanBCAFragment.tbEmailCheck = null;
            page6DTahapanBCAFragment.etEmail = null;
            page6DTahapanBCAFragment.tilEmail = null;
            page6DTahapanBCAFragment.tbNoHpCheck = null;
            page6DTahapanBCAFragment.etNoHp = null;
            page6DTahapanBCAFragment.tilNoHp = null;
            page6DTahapanBCAFragment.tvTitleFasilitas = null;
            page6DTahapanBCAFragment.tvLanguageATM = null;
            page6DTahapanBCAFragment.llInternertBanking = null;
            page6DTahapanBCAFragment.llMobileBanking = null;
            page6DTahapanBCAFragment.llMain = null;
            page6DTahapanBCAFragment.cvCardSilver = null;
            page6DTahapanBCAFragment.cvCardGold = null;
            page6DTahapanBCAFragment.cvCardPlatinum = null;
            page6DTahapanBCAFragment.etFields = null;
            page6DTahapanBCAFragment.tvErrors = null;
            page6DTahapanBCAFragment.tilForms = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.m.setOnClickListener(null);
            this.m = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.t.setOnClickListener(null);
            this.t = null;
            this.n.setOnClickListener(null);
            this.n = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.q.setOnClickListener(null);
            this.q = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.s.setOnClickListener(null);
            this.s = null;
            this.p.setOnClickListener(null);
            this.p = null;
            this.r.setOnClickListener(null);
            this.r = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.f48o.setOnClickListener(null);
            this.f48o = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
