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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/SumberDanaOrangDatangKeCabangSetunFragment_ViewBinding.class */
public class SumberDanaOrangDatangKeCabangSetunFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private SumberDanaOrangDatangKeCabangSetunFragment c;
    private View d;
    private View e;

    public SumberDanaOrangDatangKeCabangSetunFragment_ViewBinding(final SumberDanaOrangDatangKeCabangSetunFragment sumberDanaOrangDatangKeCabangSetunFragment, View view) {
        this.c = sumberDanaOrangDatangKeCabangSetunFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296993, "field 'etJenisId', method 'clickJenisIdentitas', and method 'inputChange'");
        sumberDanaOrangDatangKeCabangSetunFragment.etJenisId = (EditText) Utils.castView(findRequiredView, 2131296993, "field 'etJenisId'", EditText.class);
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.SumberDanaOrangDatangKeCabangSetunFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaOrangDatangKeCabangSetunFragment.clickJenisIdentitas(view2);
            }
        });
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.SumberDanaOrangDatangKeCabangSetunFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                sumberDanaOrangDatangKeCabangSetunFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297059, "field 'etNamaId' and method 'inputChange'");
        sumberDanaOrangDatangKeCabangSetunFragment.etNamaId = (EditText) Utils.castView(findRequiredView2, 2131297059, "field 'etNamaId'", EditText.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.SumberDanaOrangDatangKeCabangSetunFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                sumberDanaOrangDatangKeCabangSetunFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297126, "field 'etNoId' and method 'inputChange'");
        sumberDanaOrangDatangKeCabangSetunFragment.etNoId = (EditText) Utils.castView(findRequiredView3, 2131297126, "field 'etNoId'", EditText.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.SumberDanaOrangDatangKeCabangSetunFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                sumberDanaOrangDatangKeCabangSetunFragment.inputChange(view2, z);
            }
        });
        sumberDanaOrangDatangKeCabangSetunFragment.etNamaOrangDatangKeCabang = (EditText) Utils.findRequiredViewAsType(view, 2131297064, "field 'etNamaOrangDatangKeCabang'", EditText.class);
        sumberDanaOrangDatangKeCabangSetunFragment.etNorekOrangDatangKeCabang = (EditText) Utils.findRequiredViewAsType(view, 2131297132, "field 'etNorekOrangDatangKeCabang'", EditText.class);
        sumberDanaOrangDatangKeCabangSetunFragment.etNoHpOrangDatangKeCabang = (EditText) Utils.findRequiredViewAsType(view, 2131297096, "field 'etNoHpOrangDatangKeCabang'", EditText.class);
        sumberDanaOrangDatangKeCabangSetunFragment.etNoIdOrangDatangKeCabang = (EditText) Utils.findRequiredViewAsType(view, 2131297102, "field 'etNoIdOrangDatangKeCabang'", EditText.class);
        sumberDanaOrangDatangKeCabangSetunFragment.etAlamatOrangYangDatangKeCabang = (EditText) Utils.findRequiredViewAsType(view, 2131296933, "field 'etAlamatOrangYangDatangKeCabang'", EditText.class);
        sumberDanaOrangDatangKeCabangSetunFragment.rgOrangDatangKeCabang = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298226, "field 'rgOrangDatangKeCabang'", RadioGroup.class);
        sumberDanaOrangDatangKeCabangSetunFragment.rbOrangDatangKeCabangYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298169, "field 'rbOrangDatangKeCabangYa'", RadioButton.class);
        sumberDanaOrangDatangKeCabangSetunFragment.rbOrangDatangKeCabangTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298168, "field 'rbOrangDatangKeCabangTidak'", RadioButton.class);
        sumberDanaOrangDatangKeCabangSetunFragment.llSama = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297877, "field 'llSama'", LinearLayout.class);
        sumberDanaOrangDatangKeCabangSetunFragment.llTidakSama = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297914, "field 'llTidakSama'", LinearLayout.class);
        sumberDanaOrangDatangKeCabangSetunFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        sumberDanaOrangDatangKeCabangSetunFragment.formJenisIdentitas = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297257, "field 'formJenisIdentitas'", LinearLayout.class);
        sumberDanaOrangDatangKeCabangSetunFragment.tilJenisId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298542, "field 'tilJenisId'", LogoutDialog_ViewBinding.class);
        sumberDanaOrangDatangKeCabangSetunFragment.tilNoId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298647, "field 'tilNoId'", LogoutDialog_ViewBinding.class);
        sumberDanaOrangDatangKeCabangSetunFragment.tilNamaId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298606, "field 'tilNamaId'", LogoutDialog_ViewBinding.class);
        sumberDanaOrangDatangKeCabangSetunFragment.tilNamaOrangDatangKeCabang = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298611, "field 'tilNamaOrangDatangKeCabang'", LogoutDialog_ViewBinding.class);
        sumberDanaOrangDatangKeCabangSetunFragment.tilNorekOrangDatangKeCabang = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298677, "field 'tilNorekOrangDatangKeCabang'", LogoutDialog_ViewBinding.class);
        sumberDanaOrangDatangKeCabangSetunFragment.tilNoIdOrangDatangKeCabang = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298648, "field 'tilNoIdOrangDatangKeCabang'", LogoutDialog_ViewBinding.class);
        sumberDanaOrangDatangKeCabangSetunFragment.tilNoHpOrangDatangKeCabang = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298642, "field 'tilNoHpOrangDatangKeCabang'", LogoutDialog_ViewBinding.class);
        sumberDanaOrangDatangKeCabangSetunFragment.tilAlamatOrangYangDatangKeCabang = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298482, "field 'tilAlamatOrangYangDatangKeCabang'", LogoutDialog_ViewBinding.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296396, "method 'clickLanjut'");
        this.b = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.SumberDanaOrangDatangKeCabangSetunFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                sumberDanaOrangDatangKeCabangSetunFragment.clickLanjut(view2);
            }
        });
        sumberDanaOrangDatangKeCabangSetunFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296993, "field 'etFields'"), Utils.findRequiredView(view, 2131297126, "field 'etFields'"), Utils.findRequiredView(view, 2131297059, "field 'etFields'"));
        sumberDanaOrangDatangKeCabangSetunFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299017, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299121, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299083, "field 'tvErrors'", TextView.class));
        sumberDanaOrangDatangKeCabangSetunFragment.tilForms = Utils.listFilteringNull(Utils.findRequiredView(view, 2131298542, "field 'tilForms'"), Utils.findRequiredView(view, 2131298647, "field 'tilForms'"), Utils.findRequiredView(view, 2131298606, "field 'tilForms'"));
        Resources resources = view.getContext().getResources();
        sumberDanaOrangDatangKeCabangSetunFragment.nomorKtp = resources.getString(2131821553);
        sumberDanaOrangDatangKeCabangSetunFragment.nomorPaspor = resources.getString(2131821556);
        sumberDanaOrangDatangKeCabangSetunFragment.nomorRekening = resources.getString(2131821949);
        sumberDanaOrangDatangKeCabangSetunFragment.labelKtp = resources.getString(2131821815);
        sumberDanaOrangDatangKeCabangSetunFragment.labelPaspor = resources.getString(2131821986);
        sumberDanaOrangDatangKeCabangSetunFragment.labelRekening = resources.getString(2131822074);
        sumberDanaOrangDatangKeCabangSetunFragment.namaSesuaiKtp = resources.getString(2131821933);
        sumberDanaOrangDatangKeCabangSetunFragment.namaSesuaiPaspor = resources.getString(2131821530);
        sumberDanaOrangDatangKeCabangSetunFragment.nama = resources.getString(2131821919);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SumberDanaOrangDatangKeCabangSetunFragment sumberDanaOrangDatangKeCabangSetunFragment = this.c;
        if (sumberDanaOrangDatangKeCabangSetunFragment != null) {
            this.c = null;
            sumberDanaOrangDatangKeCabangSetunFragment.etJenisId = null;
            sumberDanaOrangDatangKeCabangSetunFragment.etNamaId = null;
            sumberDanaOrangDatangKeCabangSetunFragment.etNoId = null;
            sumberDanaOrangDatangKeCabangSetunFragment.etNamaOrangDatangKeCabang = null;
            sumberDanaOrangDatangKeCabangSetunFragment.etNorekOrangDatangKeCabang = null;
            sumberDanaOrangDatangKeCabangSetunFragment.etNoHpOrangDatangKeCabang = null;
            sumberDanaOrangDatangKeCabangSetunFragment.etNoIdOrangDatangKeCabang = null;
            sumberDanaOrangDatangKeCabangSetunFragment.etAlamatOrangYangDatangKeCabang = null;
            sumberDanaOrangDatangKeCabangSetunFragment.rgOrangDatangKeCabang = null;
            sumberDanaOrangDatangKeCabangSetunFragment.rbOrangDatangKeCabangYa = null;
            sumberDanaOrangDatangKeCabangSetunFragment.rbOrangDatangKeCabangTidak = null;
            sumberDanaOrangDatangKeCabangSetunFragment.llSama = null;
            sumberDanaOrangDatangKeCabangSetunFragment.llTidakSama = null;
            sumberDanaOrangDatangKeCabangSetunFragment.llMain = null;
            sumberDanaOrangDatangKeCabangSetunFragment.formJenisIdentitas = null;
            sumberDanaOrangDatangKeCabangSetunFragment.tilJenisId = null;
            sumberDanaOrangDatangKeCabangSetunFragment.tilNoId = null;
            sumberDanaOrangDatangKeCabangSetunFragment.tilNamaId = null;
            sumberDanaOrangDatangKeCabangSetunFragment.tilNamaOrangDatangKeCabang = null;
            sumberDanaOrangDatangKeCabangSetunFragment.tilNorekOrangDatangKeCabang = null;
            sumberDanaOrangDatangKeCabangSetunFragment.tilNoIdOrangDatangKeCabang = null;
            sumberDanaOrangDatangKeCabangSetunFragment.tilNoHpOrangDatangKeCabang = null;
            sumberDanaOrangDatangKeCabangSetunFragment.tilAlamatOrangYangDatangKeCabang = null;
            sumberDanaOrangDatangKeCabangSetunFragment.etFields = null;
            sumberDanaOrangDatangKeCabangSetunFragment.tvErrors = null;
            sumberDanaOrangDatangKeCabangSetunFragment.tilForms = null;
            this.a.setOnClickListener(null);
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
