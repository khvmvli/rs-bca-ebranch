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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC26BFormKartuKreditFragment_ViewBinding.class */
public class CC26BFormKartuKreditFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private CC26BFormKartuKreditFragment c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;

    public CC26BFormKartuKreditFragment_ViewBinding(final CC26BFormKartuKreditFragment cC26BFormKartuKreditFragment, View view) {
        this.c = cC26BFormKartuKreditFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297054, "field 'etFullName' and method 'onChange'");
        cC26BFormKartuKreditFragment.etFullName = (EditText) Utils.castView(findRequiredView, 2131297054, "field 'etFullName'", EditText.class);
        this.f = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC26BFormKartuKreditFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC26BFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297207, "field 'etTanggalLahir' and method 'clickTanggalLahir'");
        cC26BFormKartuKreditFragment.etTanggalLahir = (EditText) Utils.castView(findRequiredView2, 2131297207, "field 'etTanggalLahir'", EditText.class);
        this.h = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26BFormKartuKreditFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26BFormKartuKreditFragment.clickTanggalLahir(view2);
            }
        });
        cC26BFormKartuKreditFragment.rgJenisKelamin = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298217, "field 'rgJenisKelamin'", RadioGroup.class);
        cC26BFormKartuKreditFragment.rbLakiLaki = (RadioButton) Utils.findRequiredViewAsType(view, 2131298148, "field 'rbLakiLaki'", RadioButton.class);
        cC26BFormKartuKreditFragment.rbPerempuan = (RadioButton) Utils.findRequiredViewAsType(view, 2131298149, "field 'rbPerempuan'", RadioButton.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296987, "field 'etHubungan', method 'onClickHubungan', and method 'onChange'");
        cC26BFormKartuKreditFragment.etHubungan = (EditText) Utils.castView(findRequiredView3, 2131296987, "field 'etHubungan'", EditText.class);
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26BFormKartuKreditFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26BFormKartuKreditFragment.onClickHubungan();
            }
        });
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC26BFormKartuKreditFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC26BFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297094, "field 'etNoHP' and method 'onChange'");
        cC26BFormKartuKreditFragment.etNoHP = (EditText) Utils.castView(findRequiredView4, 2131297094, "field 'etNoHP'", EditText.class);
        this.g = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC26BFormKartuKreditFragment_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC26BFormKartuKreditFragment.onChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296967, "field 'etBidangUsaha' and method 'onClickBidangUsaha'");
        cC26BFormKartuKreditFragment.etBidangUsaha = (EditText) Utils.castView(findRequiredView5, 2131296967, "field 'etBidangUsaha'", EditText.class);
        this.a = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26BFormKartuKreditFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26BFormKartuKreditFragment.onClickBidangUsaha();
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296992, "field 'etJabatan' and method 'onClickJabatan'");
        cC26BFormKartuKreditFragment.etJabatan = (EditText) Utils.castView(findRequiredView6, 2131296992, "field 'etJabatan'", EditText.class);
        this.d = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26BFormKartuKreditFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26BFormKartuKreditFragment.onClickJabatan();
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297043, "field 'etLimit' and method 'onChange'");
        cC26BFormKartuKreditFragment.etLimit = (EditText) Utils.castView(findRequiredView7, 2131297043, "field 'etLimit'", EditText.class);
        this.i = findRequiredView7;
        findRequiredView7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.CC26BFormKartuKreditFragment_ViewBinding.9
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                cC26BFormKartuKreditFragment.onChange(view2, z);
            }
        });
        cC26BFormKartuKreditFragment.llJob = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297705, "field 'llJob'", LinearLayout.class);
        View findRequiredView8 = Utils.findRequiredView(view, 2131297516, "field 'llTambahKartu' and method 'tambahPemegangKartu'");
        cC26BFormKartuKreditFragment.llTambahKartu = (LinearLayout) Utils.castView(findRequiredView8, 2131297516, "field 'llTambahKartu'", LinearLayout.class);
        this.j = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26BFormKartuKreditFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26BFormKartuKreditFragment.tambahPemegangKartu(view2);
            }
        });
        cC26BFormKartuKreditFragment.tilNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilNama'", LogoutDialog_ViewBinding.class);
        cC26BFormKartuKreditFragment.tilTanggalLahir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298739, "field 'tilTanggalLahir'", LogoutDialog_ViewBinding.class);
        cC26BFormKartuKreditFragment.tilHubungan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298536, "field 'tilHubungan'", LogoutDialog_ViewBinding.class);
        cC26BFormKartuKreditFragment.tilBidangUsaha = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilBidangUsaha'", LogoutDialog_ViewBinding.class);
        cC26BFormKartuKreditFragment.tilJabatan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilJabatan'", LogoutDialog_ViewBinding.class);
        cC26BFormKartuKreditFragment.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        cC26BFormKartuKreditFragment.tilLimit = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298590, "field 'tilLimit'", LogoutDialog_ViewBinding.class);
        View findRequiredView9 = Utils.findRequiredView(view, 2131296396, "method 'next'");
        this.e = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.CC26BFormKartuKreditFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                cC26BFormKartuKreditFragment.next(view2);
            }
        });
        cC26BFormKartuKreditFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297054, "field 'etFields'"), Utils.findRequiredView(view, 2131297207, "field 'etFields'"), Utils.findRequiredView(view, 2131296987, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"), Utils.findRequiredView(view, 2131296967, "field 'etFields'"), Utils.findRequiredView(view, 2131296992, "field 'etFields'"), Utils.findRequiredView(view, 2131297043, "field 'etFields'"));
        cC26BFormKartuKreditFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299078, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299207, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299013, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298996, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299016, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299066, "field 'tvErrors'", TextView.class));
        cC26BFormKartuKreditFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298739, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298536, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298517, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298541, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298590, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        cC26BFormKartuKreditFragment.invalidHandphoneMessage = resources.getString(2131820903);
        cC26BFormKartuKreditFragment.errorMinimalLimitBlackPlatinum = resources.getString(2131820846);
        cC26BFormKartuKreditFragment.errorMinimalLimitOrdinary = resources.getString(2131820847);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        CC26BFormKartuKreditFragment cC26BFormKartuKreditFragment = this.c;
        if (cC26BFormKartuKreditFragment != null) {
            this.c = null;
            cC26BFormKartuKreditFragment.etFullName = null;
            cC26BFormKartuKreditFragment.etTanggalLahir = null;
            cC26BFormKartuKreditFragment.rgJenisKelamin = null;
            cC26BFormKartuKreditFragment.rbLakiLaki = null;
            cC26BFormKartuKreditFragment.rbPerempuan = null;
            cC26BFormKartuKreditFragment.etHubungan = null;
            cC26BFormKartuKreditFragment.etNoHP = null;
            cC26BFormKartuKreditFragment.etBidangUsaha = null;
            cC26BFormKartuKreditFragment.etJabatan = null;
            cC26BFormKartuKreditFragment.etLimit = null;
            cC26BFormKartuKreditFragment.llJob = null;
            cC26BFormKartuKreditFragment.llTambahKartu = null;
            cC26BFormKartuKreditFragment.tilNama = null;
            cC26BFormKartuKreditFragment.tilTanggalLahir = null;
            cC26BFormKartuKreditFragment.tilHubungan = null;
            cC26BFormKartuKreditFragment.tilBidangUsaha = null;
            cC26BFormKartuKreditFragment.tilJabatan = null;
            cC26BFormKartuKreditFragment.tilNoHp = null;
            cC26BFormKartuKreditFragment.tilLimit = null;
            cC26BFormKartuKreditFragment.etFields = null;
            cC26BFormKartuKreditFragment.tvErrors = null;
            cC26BFormKartuKreditFragment.tilForms = null;
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.b.setOnClickListener(null);
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
