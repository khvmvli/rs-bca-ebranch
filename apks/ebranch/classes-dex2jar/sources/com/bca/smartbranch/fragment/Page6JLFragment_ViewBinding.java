package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6JLFragment_ViewBinding.class */
public class Page6JLFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private Page6JLFragment c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View l;

    /* renamed from: o  reason: collision with root package name */
    private View f52o;

    public Page6JLFragment_ViewBinding(final Page6JLFragment page6JLFragment, View view) {
        this.c = page6JLFragment;
        page6JLFragment.rgAlamatSesuai = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298212, "field 'rgAlamatSesuai'", RadioGroup.class);
        page6JLFragment.rbAlamatY = (RadioButton) Utils.findRequiredViewAsType(view, 2131298132, "field 'rbAlamatY'", RadioButton.class);
        page6JLFragment.rbAlamatN = (RadioButton) Utils.findRequiredViewAsType(view, 2131298131, "field 'rbAlamatN'", RadioButton.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297080, "field 'etNegara' and method 'onClickNegara'");
        page6JLFragment.etNegara = (EditText) Utils.castView(findRequiredView, 2131297080, "field 'etNegara'", EditText.class);
        this.i = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6JLFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6JLFragment.onClickNegara(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296927, "field 'etAlamat' and method 'inputChange'");
        page6JLFragment.etAlamat = (EditText) Utils.castView(findRequiredView2, 2131296927, "field 'etAlamat'", EditText.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6JLFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6JLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297167, "field 'etRT' and method 'inputChange'");
        page6JLFragment.etRT = (EditText) Utils.castView(findRequiredView3, 2131297167, "field 'etRT'", EditText.class);
        this.f = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6JLFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6JLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297170, "field 'etRW' and method 'inputChange'");
        page6JLFragment.etRW = (EditText) Utils.castView(findRequiredView4, 2131297170, "field 'etRW'", EditText.class);
        this.l = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.Page6JLFragment_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                page6JLFragment.inputChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297161, "field 'etProvinsi' and method 'onClickProvinsi'");
        page6JLFragment.etProvinsi = (EditText) Utils.castView(findRequiredView5, 2131297161, "field 'etProvinsi'", EditText.class);
        this.h = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6JLFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6JLFragment.onClickProvinsi(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297033, "field 'etKota' and method 'onClickKota'");
        page6JLFragment.etKota = (EditText) Utils.castView(findRequiredView6, 2131297033, "field 'etKota'", EditText.class);
        this.j = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6JLFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6JLFragment.onClickKota(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297011, "field 'etKecamatan' and method 'onClickKecamatan'");
        page6JLFragment.etKecamatan = (EditText) Utils.castView(findRequiredView7, 2131297011, "field 'etKecamatan'", EditText.class);
        this.d = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6JLFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6JLFragment.onClickKecamatan(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297014, "field 'etKelurahan' and method 'onClickKelurahan'");
        page6JLFragment.etKelurahan = (EditText) Utils.castView(findRequiredView8, 2131297014, "field 'etKelurahan'", EditText.class);
        this.e = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6JLFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6JLFragment.onClickKelurahan(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131297022, "field 'etKodePos' and method 'onClickKodePos'");
        page6JLFragment.etKodePos = (EditText) Utils.castView(findRequiredView9, 2131297022, "field 'etKodePos'", EditText.class);
        this.g = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6JLFragment_ViewBinding.11
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6JLFragment.onClickKodePos(view2);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297198, "field 'etStatusTempat' and method 'showStatusTempatTinggalDialog'");
        page6JLFragment.etStatusTempat = (EditText) Utils.castView(findRequiredView10, 2131297198, "field 'etStatusTempat'", EditText.class);
        this.f52o = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6JLFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6JLFragment.showStatusTempatTinggalDialog(view2);
            }
        });
        page6JLFragment.llAlamatTidakSama = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297914, "field 'llAlamatTidakSama'", LinearLayout.class);
        page6JLFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        page6JLFragment.llIndonesian = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297688, "field 'llIndonesian'", LinearLayout.class);
        page6JLFragment.tilAlamat = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298476, "field 'tilAlamat'", LogoutDialog_ViewBinding.class);
        page6JLFragment.tilRt = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298703, "field 'tilRt'", LogoutDialog_ViewBinding.class);
        page6JLFragment.tilRw = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298706, "field 'tilRw'", LogoutDialog_ViewBinding.class);
        page6JLFragment.tilKelurahan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298560, "field 'tilKelurahan'", LogoutDialog_ViewBinding.class);
        page6JLFragment.tilKecamatan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298557, "field 'tilKecamatan'", LogoutDialog_ViewBinding.class);
        page6JLFragment.tilKota = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKota'", LogoutDialog_ViewBinding.class);
        page6JLFragment.tilKodePos = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilKodePos'", LogoutDialog_ViewBinding.class);
        page6JLFragment.tilProvinsi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298697, "field 'tilProvinsi'", LogoutDialog_ViewBinding.class);
        page6JLFragment.tilNegara = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298626, "field 'tilNegara'", LogoutDialog_ViewBinding.class);
        page6JLFragment.tilStatusTempat = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298730, "field 'tilStatusTempat'", LogoutDialog_ViewBinding.class);
        page6JLFragment.tvAskAlamat = (TextView) Utils.findRequiredViewAsType(view, 2131298831, "field 'tvAskAlamat'", TextView.class);
        View findRequiredView11 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.a = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.Page6JLFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                page6JLFragment.next(view2);
            }
        });
        page6JLFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296927, "field 'etFields'"), Utils.findRequiredView(view, 2131297167, "field 'etFields'"), Utils.findRequiredView(view, 2131297170, "field 'etFields'"), Utils.findRequiredView(view, 2131297014, "field 'etFields'"), Utils.findRequiredView(view, 2131297011, "field 'etFields'"), Utils.findRequiredView(view, 2131297033, "field 'etFields'"), Utils.findRequiredView(view, 2131297022, "field 'etFields'"), Utils.findRequiredView(view, 2131297198, "field 'etFields'"), Utils.findRequiredView(view, 2131297161, "field 'etFields'"), Utils.findRequiredView(view, 2131297080, "field 'etFields'"));
        page6JLFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131298956, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299171, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299174, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299037, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299034, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299045, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299198, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299164, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299102, "field 'tvErrors'", TextView.class));
        page6JLFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298476, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298703, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298706, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298560, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298557, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298568, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298730, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298697, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298626, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        page6JLFragment.listStatusTempatTinggal = resources.getStringArray(2130903093);
        page6JLFragment.messageAlamatKTP = resources.getString(2131821318);
        page6JLFragment.messageAlamatPaspor = resources.getString(2131821319);
        page6JLFragment.messageAlamatKartuPelajar = resources.getString(2131821317);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        Page6JLFragment page6JLFragment = this.c;
        if (page6JLFragment != null) {
            this.c = null;
            page6JLFragment.rgAlamatSesuai = null;
            page6JLFragment.rbAlamatY = null;
            page6JLFragment.rbAlamatN = null;
            page6JLFragment.etNegara = null;
            page6JLFragment.etAlamat = null;
            page6JLFragment.etRT = null;
            page6JLFragment.etRW = null;
            page6JLFragment.etProvinsi = null;
            page6JLFragment.etKota = null;
            page6JLFragment.etKecamatan = null;
            page6JLFragment.etKelurahan = null;
            page6JLFragment.etKodePos = null;
            page6JLFragment.etStatusTempat = null;
            page6JLFragment.llAlamatTidakSama = null;
            page6JLFragment.llMain = null;
            page6JLFragment.llIndonesian = null;
            page6JLFragment.tilAlamat = null;
            page6JLFragment.tilRt = null;
            page6JLFragment.tilRw = null;
            page6JLFragment.tilKelurahan = null;
            page6JLFragment.tilKecamatan = null;
            page6JLFragment.tilKota = null;
            page6JLFragment.tilKodePos = null;
            page6JLFragment.tilProvinsi = null;
            page6JLFragment.tilNegara = null;
            page6JLFragment.tilStatusTempat = null;
            page6JLFragment.tvAskAlamat = null;
            page6JLFragment.etFields = null;
            page6JLFragment.tvErrors = null;
            page6JLFragment.tilForms = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.l.setOnFocusChangeListener(null);
            this.l = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.f52o.setOnClickListener(null);
            this.f52o = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
