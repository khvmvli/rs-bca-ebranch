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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC26CFormKartuKreditFragment_ViewBinding.class */
public class CC26CFormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private CC26CFormKartuKreditFragment e;
    private View g;
    private View h;
    private View i;
    private View j;

    public CC26CFormKartuKreditFragment_ViewBinding(final CC26CFormKartuKreditFragment cC26CFormKartuKreditFragment, View view) {
        this.e = cC26CFormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297054, "field 'etFullName' and method 'onChange'");
        cC26CFormKartuKreditFragment.etFullName = (EditText) Utils.castView(findRequiredView, 2131297054, "field 'etFullName'", EditText.class);
        this.h = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC26CFormKartuKreditFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC26CFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297207, "field 'etTanggalLahir' and method 'clickTanggalLahir'");
        cC26CFormKartuKreditFragment.etTanggalLahir = (EditText) Utils.castView(findRequiredView2, 2131297207, "field 'etTanggalLahir'", EditText.class);
        this.g = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26CFormKartuKreditFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26CFormKartuKreditFragment.clickTanggalLahir(view2);
            }
        });
        cC26CFormKartuKreditFragment.rgJenisKelamin = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298217, "field 'rgJenisKelamin'", RadioGroup.class);
        cC26CFormKartuKreditFragment.rbLakiLaki = (RadioButton) Utils.findRequiredViewAsType(view, 2131298148, "field 'rbLakiLaki'", RadioButton.class);
        cC26CFormKartuKreditFragment.rbPerempuan = (RadioButton) Utils.findRequiredViewAsType(view, 2131298149, "field 'rbPerempuan'", RadioButton.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296987, "field 'etHubungan', method 'onClickHubungan', and method 'onChange'");
        cC26CFormKartuKreditFragment.etHubungan = (EditText) Utils.castView(findRequiredView3, 2131296987, "field 'etHubungan'", EditText.class);
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26CFormKartuKreditFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26CFormKartuKreditFragment.onClickHubungan();
            }
        });
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC26CFormKartuKreditFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC26CFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297094, "field 'etNoHP' and method 'onChange'");
        cC26CFormKartuKreditFragment.etNoHP = (EditText) Utils.castView(findRequiredView4, 2131297094, "field 'etNoHP'", EditText.class);
        this.i = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC26CFormKartuKreditFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC26CFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296967, "field 'etBidangUsaha' and method 'onClickBidangUsaha'");
        cC26CFormKartuKreditFragment.etBidangUsaha = (EditText) Utils.castView(findRequiredView5, 2131296967, "field 'etBidangUsaha'", EditText.class);
        this.b = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26CFormKartuKreditFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26CFormKartuKreditFragment.onClickBidangUsaha();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296992, "field 'etJabatan' and method 'onClickJabatan'");
        cC26CFormKartuKreditFragment.etJabatan = (EditText) Utils.castView(findRequiredView6, 2131296992, "field 'etJabatan'", EditText.class);
        this.a = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26CFormKartuKreditFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26CFormKartuKreditFragment.onClickJabatan();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297043, "field 'etLimit' and method 'onChange'");
        cC26CFormKartuKreditFragment.etLimit = (EditText) Utils.castView(findRequiredView7, 2131297043, "field 'etLimit'", EditText.class);
        this.j = findRequiredView7;
        findRequiredView7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC26CFormKartuKreditFragment_ViewBinding.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC26CFormKartuKreditFragment.onChange(view2, z);
            }
        });
        cC26CFormKartuKreditFragment.llJob = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297705, "field 'llJob'", LinearLayout.class);
        cC26CFormKartuKreditFragment.llTambahKartu = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297516, "field 'llTambahKartu'", LinearLayout.class);
        cC26CFormKartuKreditFragment.tilNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilNama'", LogoutDialog_ViewBinding.class);
        cC26CFormKartuKreditFragment.tilTanggalLahir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298739, "field 'tilTanggalLahir'", LogoutDialog_ViewBinding.class);
        cC26CFormKartuKreditFragment.tilHubungan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298536, "field 'tilHubungan'", LogoutDialog_ViewBinding.class);
        cC26CFormKartuKreditFragment.tilBidangUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilBidangUsaha'", LogoutDialog_ViewBinding.class);
        cC26CFormKartuKreditFragment.tilJabatan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilJabatan'", LogoutDialog_ViewBinding.class);
        cC26CFormKartuKreditFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        cC26CFormKartuKreditFragment.tilLimit = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298590, "field 'tilLimit'", LogoutDialog_ViewBinding.class);
        View findRequiredView8 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.d = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26CFormKartuKreditFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26CFormKartuKreditFragment.next(view2);
            }
        });
        cC26CFormKartuKreditFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297054, "field 'etFields'"), Utils.findRequiredView(view, 2131297207, "field 'etFields'"), Utils.findRequiredView(view, 2131296987, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"), Utils.findRequiredView(view, 2131296967, "field 'etFields'"), Utils.findRequiredView(view, 2131296992, "field 'etFields'"), Utils.findRequiredView(view, 2131297043, "field 'etFields'"));
        cC26CFormKartuKreditFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299078, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299207, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299013, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298996, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299016, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299066, "field 'tvErrors'", TextView.class));
        cC26CFormKartuKreditFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298739, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298536, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298590, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        cC26CFormKartuKreditFragment.invalidHandphoneMessage = resources.getString(2131820903);
        cC26CFormKartuKreditFragment.errorMinimalLimitBlackPlatinum = resources.getString(2131820846);
        cC26CFormKartuKreditFragment.errorMinimalLimitOrdinary = resources.getString(2131820847);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC26CFormKartuKreditFragment cC26CFormKartuKreditFragment = this.e;
        if (cC26CFormKartuKreditFragment != null) {
            this.e = null;
            cC26CFormKartuKreditFragment.etFullName = null;
            cC26CFormKartuKreditFragment.etTanggalLahir = null;
            cC26CFormKartuKreditFragment.rgJenisKelamin = null;
            cC26CFormKartuKreditFragment.rbLakiLaki = null;
            cC26CFormKartuKreditFragment.rbPerempuan = null;
            cC26CFormKartuKreditFragment.etHubungan = null;
            cC26CFormKartuKreditFragment.etNoHP = null;
            cC26CFormKartuKreditFragment.etBidangUsaha = null;
            cC26CFormKartuKreditFragment.etJabatan = null;
            cC26CFormKartuKreditFragment.etLimit = null;
            cC26CFormKartuKreditFragment.llJob = null;
            cC26CFormKartuKreditFragment.llTambahKartu = null;
            cC26CFormKartuKreditFragment.tilNama = null;
            cC26CFormKartuKreditFragment.tilTanggalLahir = null;
            cC26CFormKartuKreditFragment.tilHubungan = null;
            cC26CFormKartuKreditFragment.tilBidangUsaha = null;
            cC26CFormKartuKreditFragment.tilJabatan = null;
            cC26CFormKartuKreditFragment.tilNoHp = null;
            cC26CFormKartuKreditFragment.tilLimit = null;
            cC26CFormKartuKreditFragment.etFields = null;
            cC26CFormKartuKreditFragment.tvErrors = null;
            cC26CFormKartuKreditFragment.tilForms = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.c.setOnClickListener(null);
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
