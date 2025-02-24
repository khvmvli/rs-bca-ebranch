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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC26AFormKartuKreditFragment_ViewBinding.class */
public class CC26AFormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private CC26AFormKartuKreditFragment e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;

    public CC26AFormKartuKreditFragment_ViewBinding(final CC26AFormKartuKreditFragment cC26AFormKartuKreditFragment, View view) {
        this.e = cC26AFormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297054, "field 'etFullName' and method 'onChange'");
        cC26AFormKartuKreditFragment.etFullName = (EditText) Utils.castView(findRequiredView, 2131297054, "field 'etFullName'", EditText.class);
        this.i = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC26AFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297207, "field 'etTanggalLahir' and method 'clickTanggalLahir'");
        cC26AFormKartuKreditFragment.etTanggalLahir = (EditText) Utils.castView(findRequiredView2, 2131297207, "field 'etTanggalLahir'", EditText.class);
        this.f = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26AFormKartuKreditFragment.clickTanggalLahir(view2);
            }
        });
        cC26AFormKartuKreditFragment.rgJenisKelamin = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298217, "field 'rgJenisKelamin'", RadioGroup.class);
        cC26AFormKartuKreditFragment.rbLakiLaki = (RadioButton) Utils.findRequiredViewAsType(view, 2131298148, "field 'rbLakiLaki'", RadioButton.class);
        cC26AFormKartuKreditFragment.rbPerempuan = (RadioButton) Utils.findRequiredViewAsType(view, 2131298149, "field 'rbPerempuan'", RadioButton.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296987, "field 'etHubungan', method 'onClickHubungan', and method 'onChange'");
        cC26AFormKartuKreditFragment.etHubungan = (EditText) Utils.castView(findRequiredView3, 2131296987, "field 'etHubungan'", EditText.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26AFormKartuKreditFragment.onClickHubungan();
            }
        });
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC26AFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297094, "field 'etNoHP' and method 'onChange'");
        cC26AFormKartuKreditFragment.etNoHP = (EditText) Utils.castView(findRequiredView4, 2131297094, "field 'etNoHP'", EditText.class);
        this.j = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC26AFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296967, "field 'etBidangUsaha' and method 'onClickBidangUsaha'");
        cC26AFormKartuKreditFragment.etBidangUsaha = (EditText) Utils.castView(findRequiredView5, 2131296967, "field 'etBidangUsaha'", EditText.class);
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26AFormKartuKreditFragment.onClickBidangUsaha();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296992, "field 'etJabatan' and method 'onClickJabatan'");
        cC26AFormKartuKreditFragment.etJabatan = (EditText) Utils.castView(findRequiredView6, 2131296992, "field 'etJabatan'", EditText.class);
        this.b = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26AFormKartuKreditFragment.onClickJabatan();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297043, "field 'etLimit' and method 'onChange'");
        cC26AFormKartuKreditFragment.etLimit = (EditText) Utils.castView(findRequiredView7, 2131297043, "field 'etLimit'", EditText.class);
        this.h = findRequiredView7;
        findRequiredView7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC26AFormKartuKreditFragment.onChange(view2, z);
            }
        });
        cC26AFormKartuKreditFragment.llJob = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297705, "field 'llJob'", LinearLayout.class);
        View findRequiredView8 = Utils.findRequiredView(view, 2131297516, "field 'llTambahKartu' and method 'tambahPemegangKartu'");
        cC26AFormKartuKreditFragment.llTambahKartu = (LinearLayout) Utils.castView(findRequiredView8, 2131297516, "field 'llTambahKartu'", LinearLayout.class);
        this.g = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26AFormKartuKreditFragment.tambahPemegangKartu(view2);
            }
        });
        cC26AFormKartuKreditFragment.tilNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilNama'", LogoutDialog_ViewBinding.class);
        cC26AFormKartuKreditFragment.tilTanggalLahir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298739, "field 'tilTanggalLahir'", LogoutDialog_ViewBinding.class);
        cC26AFormKartuKreditFragment.tilHubungan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298536, "field 'tilHubungan'", LogoutDialog_ViewBinding.class);
        cC26AFormKartuKreditFragment.tilBidangUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilBidangUsaha'", LogoutDialog_ViewBinding.class);
        cC26AFormKartuKreditFragment.tilJabatan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilJabatan'", LogoutDialog_ViewBinding.class);
        cC26AFormKartuKreditFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        cC26AFormKartuKreditFragment.tilLimit = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298590, "field 'tilLimit'", LogoutDialog_ViewBinding.class);
        View findRequiredView9 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.d = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26AFormKartuKreditFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26AFormKartuKreditFragment.next(view2);
            }
        });
        cC26AFormKartuKreditFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297054, "field 'etFields'"), Utils.findRequiredView(view, 2131297207, "field 'etFields'"), Utils.findRequiredView(view, 2131296987, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"), Utils.findRequiredView(view, 2131296967, "field 'etFields'"), Utils.findRequiredView(view, 2131296992, "field 'etFields'"), Utils.findRequiredView(view, 2131297043, "field 'etFields'"));
        cC26AFormKartuKreditFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299078, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299207, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299013, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298996, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299016, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299066, "field 'tvErrors'", TextView.class));
        cC26AFormKartuKreditFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298739, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298536, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298590, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        cC26AFormKartuKreditFragment.invalidHandphoneMessage = resources.getString(2131820903);
        cC26AFormKartuKreditFragment.errorMinimalLimitBlackPlatinum = resources.getString(2131820846);
        cC26AFormKartuKreditFragment.errorMinimalLimitOrdinary = resources.getString(2131820847);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC26AFormKartuKreditFragment cC26AFormKartuKreditFragment = this.e;
        if (cC26AFormKartuKreditFragment != null) {
            this.e = null;
            cC26AFormKartuKreditFragment.etFullName = null;
            cC26AFormKartuKreditFragment.etTanggalLahir = null;
            cC26AFormKartuKreditFragment.rgJenisKelamin = null;
            cC26AFormKartuKreditFragment.rbLakiLaki = null;
            cC26AFormKartuKreditFragment.rbPerempuan = null;
            cC26AFormKartuKreditFragment.etHubungan = null;
            cC26AFormKartuKreditFragment.etNoHP = null;
            cC26AFormKartuKreditFragment.etBidangUsaha = null;
            cC26AFormKartuKreditFragment.etJabatan = null;
            cC26AFormKartuKreditFragment.etLimit = null;
            cC26AFormKartuKreditFragment.llJob = null;
            cC26AFormKartuKreditFragment.llTambahKartu = null;
            cC26AFormKartuKreditFragment.tilNama = null;
            cC26AFormKartuKreditFragment.tilTanggalLahir = null;
            cC26AFormKartuKreditFragment.tilHubungan = null;
            cC26AFormKartuKreditFragment.tilBidangUsaha = null;
            cC26AFormKartuKreditFragment.tilJabatan = null;
            cC26AFormKartuKreditFragment.tilNoHp = null;
            cC26AFormKartuKreditFragment.tilLimit = null;
            cC26AFormKartuKreditFragment.etFields = null;
            cC26AFormKartuKreditFragment.tvErrors = null;
            cC26AFormKartuKreditFragment.tilForms = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.a.setOnClickListener(null);
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
