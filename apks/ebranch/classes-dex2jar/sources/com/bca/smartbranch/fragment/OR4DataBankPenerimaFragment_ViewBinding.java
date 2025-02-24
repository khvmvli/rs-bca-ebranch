package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.setOnFocusChangeListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR4DataBankPenerimaFragment_ViewBinding.class */
public class OR4DataBankPenerimaFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private OR4DataBankPenerimaFragment c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;

    public OR4DataBankPenerimaFragment_ViewBinding(final OR4DataBankPenerimaFragment oR4DataBankPenerimaFragment, View view) {
        this.c = oR4DataBankPenerimaFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297029, "field 'etKodeSwift' and method 'inputChange'");
        oR4DataBankPenerimaFragment.etKodeSwift = (AutoCompleteTextView) Utils.castView(findRequiredView, 2131297029, "field 'etKodeSwift'", AutoCompleteTextView.class);
        this.b = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR4DataBankPenerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297055, "field 'etNamaBank' and method 'inputChange'");
        oR4DataBankPenerimaFragment.etNamaBank = (EditText) Utils.castView(findRequiredView2, 2131297055, "field 'etNamaBank'", EditText.class);
        this.i = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR4DataBankPenerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297081, "field 'etNegaraBagian', method 'pilihNegaraBagian', and method 'inputChange'");
        oR4DataBankPenerimaFragment.etNegaraBagian = (EditText) Utils.castView(findRequiredView3, 2131297081, "field 'etNegaraBagian'", EditText.class);
        this.g = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR4DataBankPenerimaFragment.pilihNegaraBagian(view2);
            }
        });
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment_ViewBinding.8
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR4DataBankPenerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296928, "field 'etAlamatBank' and method 'inputChange'");
        oR4DataBankPenerimaFragment.etAlamatBank = (EditText) Utils.castView(findRequiredView4, 2131296928, "field 'etAlamatBank'", EditText.class);
        this.e = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR4DataBankPenerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297033, "field 'etKota' and method 'inputChange'");
        oR4DataBankPenerimaFragment.etKota = (EditText) Utils.castView(findRequiredView5, 2131297033, "field 'etKota'", EditText.class);
        this.f = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR4DataBankPenerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296968, "field 'etCodeword' and method 'inputChange'");
        oR4DataBankPenerimaFragment.etCodeword = (EditText) Utils.castView(findRequiredView6, 2131296968, "field 'etCodeword'", EditText.class);
        this.a = findRequiredView6;
        findRequiredView6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment_ViewBinding.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR4DataBankPenerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297181, "field 'etKeteranganAlamat' and method 'inputChange'");
        oR4DataBankPenerimaFragment.etKeteranganAlamat = (EditText) Utils.castView(findRequiredView7, 2131297181, "field 'etKeteranganAlamat'", EditText.class);
        this.j = findRequiredView7;
        findRequiredView7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment_ViewBinding.9
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR4DataBankPenerimaFragment.inputChange(view2, z);
            }
        });
        oR4DataBankPenerimaFragment.tilKodeSwift = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298576, "field 'tilKodeSwift'", LogoutDialog_ViewBinding.class);
        oR4DataBankPenerimaFragment.tilNamaBank = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298602, "field 'tilNamaBank'", LogoutDialog_ViewBinding.class);
        oR4DataBankPenerimaFragment.tilNegaraBagian = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298627, "field 'tilNegaraBagian'", LogoutDialog_ViewBinding.class);
        oR4DataBankPenerimaFragment.tilAlamatBank = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298477, "field 'tilAlamatBank'", LogoutDialog_ViewBinding.class);
        oR4DataBankPenerimaFragment.tilKota = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilKota'", LogoutDialog_ViewBinding.class);
        oR4DataBankPenerimaFragment.tilCodeword = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298519, "field 'tilCodeword'", LogoutDialog_ViewBinding.class);
        oR4DataBankPenerimaFragment.tilKeteranganAlamat = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298713, "field 'tilKeteranganAlamat'", LogoutDialog_ViewBinding.class);
        oR4DataBankPenerimaFragment.llCodeword = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297567, "field 'llCodeword'", LinearLayout.class);
        oR4DataBankPenerimaFragment.llKodeSwift = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297738, "field 'llKodeSwift'", LinearLayout.class);
        View findRequiredView8 = Utils.findRequiredView(view, 2131296396, "field 'btnLanjut' and method 'lanjut'");
        oR4DataBankPenerimaFragment.btnLanjut = (Button) Utils.castView(findRequiredView8, 2131296396, "field 'btnLanjut'", Button.class);
        this.d = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment_ViewBinding.15
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR4DataBankPenerimaFragment.lanjut(view2);
            }
        });
        oR4DataBankPenerimaFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView9 = Utils.findRequiredView(view, 2131298878, "field 'tvCheck' and method 'checkRendy'");
        oR4DataBankPenerimaFragment.tvCheck = (TextView) Utils.castView(findRequiredView9, 2131298878, "field 'tvCheck'", TextView.class);
        this.k = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR4DataBankPenerimaFragment.checkRendy(view2);
            }
        });
        oR4DataBankPenerimaFragment.lottieStatusView = (setOnFocusChangeListener) Utils.findRequiredViewAsType(view, 2131297974, "field 'lottieStatusView'", setOnFocusChangeListener.class);
        oR4DataBankPenerimaFragment.llSettleVia = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297885, "field 'llSettleVia'", LinearLayout.class);
        oR4DataBankPenerimaFragment.cbxSettleVia = (CheckBox) Utils.findRequiredViewAsType(view, 2131296471, "field 'cbxSettleVia'", CheckBox.class);
        View findRequiredView10 = Utils.findRequiredView(view, 2131297388, "method 'showInfoCodewordnOR'");
        this.h = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR4DataBankPenerimaFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR4DataBankPenerimaFragment.showInfoCodewordnOR(view2);
            }
        });
        oR4DataBankPenerimaFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299052, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298998, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299181, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299079, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299103, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298957, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299056, "field 'tvErrors'", TextView.class));
        oR4DataBankPenerimaFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298576, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298519, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298713, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298602, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298627, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298477, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298580, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        oR4DataBankPenerimaFragment.etForms = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297029, "field 'etForms'"), Utils.findRequiredView(view, 2131296968, "field 'etForms'"), Utils.findRequiredView(view, 2131297181, "field 'etForms'"), Utils.findRequiredView(view, 2131297055, "field 'etForms'"), Utils.findRequiredView(view, 2131297081, "field 'etForms'"), Utils.findRequiredView(view, 2131296928, "field 'etForms'"), Utils.findRequiredView(view, 2131297033, "field 'etForms'"));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OR4DataBankPenerimaFragment oR4DataBankPenerimaFragment = this.c;
        if (oR4DataBankPenerimaFragment != null) {
            this.c = null;
            oR4DataBankPenerimaFragment.etKodeSwift = null;
            oR4DataBankPenerimaFragment.etNamaBank = null;
            oR4DataBankPenerimaFragment.etNegaraBagian = null;
            oR4DataBankPenerimaFragment.etAlamatBank = null;
            oR4DataBankPenerimaFragment.etKota = null;
            oR4DataBankPenerimaFragment.etCodeword = null;
            oR4DataBankPenerimaFragment.etKeteranganAlamat = null;
            oR4DataBankPenerimaFragment.tilKodeSwift = null;
            oR4DataBankPenerimaFragment.tilNamaBank = null;
            oR4DataBankPenerimaFragment.tilNegaraBagian = null;
            oR4DataBankPenerimaFragment.tilAlamatBank = null;
            oR4DataBankPenerimaFragment.tilKota = null;
            oR4DataBankPenerimaFragment.tilCodeword = null;
            oR4DataBankPenerimaFragment.tilKeteranganAlamat = null;
            oR4DataBankPenerimaFragment.llCodeword = null;
            oR4DataBankPenerimaFragment.llKodeSwift = null;
            oR4DataBankPenerimaFragment.btnLanjut = null;
            oR4DataBankPenerimaFragment.svMain = null;
            oR4DataBankPenerimaFragment.tvCheck = null;
            oR4DataBankPenerimaFragment.lottieStatusView = null;
            oR4DataBankPenerimaFragment.llSettleVia = null;
            oR4DataBankPenerimaFragment.cbxSettleVia = null;
            oR4DataBankPenerimaFragment.tvErrors = null;
            oR4DataBankPenerimaFragment.tilForms = null;
            oR4DataBankPenerimaFragment.etForms = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.g.setOnClickListener(null);
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.k.setOnClickListener(null);
            this.k = null;
            this.h.setOnClickListener(null);
            this.h = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
