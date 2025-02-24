package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/EditDaftarTransferBTActivity_ViewBinding.class */
public class EditDaftarTransferBTActivity_ViewBinding implements Unbinder {
    private View a;
    private EditDaftarTransferBTActivity b;
    private View c;
    private View d;
    private View e;

    public EditDaftarTransferBTActivity_ViewBinding(final EditDaftarTransferBTActivity editDaftarTransferBTActivity, View view) {
        this.b = editDaftarTransferBTActivity;
        editDaftarTransferBTActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        editDaftarTransferBTActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        editDaftarTransferBTActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'llMain'", LinearLayout.class);
        editDaftarTransferBTActivity.etNorek = (AutoCompleteTextView) Utils.findRequiredViewAsType(view, 2131297107, "field 'etNorek'", AutoCompleteTextView.class);
        editDaftarTransferBTActivity.etNamaPenerima = (EditText) Utils.findRequiredViewAsType(view, 2131297066, "field 'etNamaPenerima'", EditText.class);
        editDaftarTransferBTActivity.etBankTujuan = (EditText) Utils.findRequiredViewAsType(view, 2131296948, "field 'etBankTujuan'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296935, "field 'etAlamatPenerima' and method 'inputChange'");
        editDaftarTransferBTActivity.etAlamatPenerima = (EditText) Utils.castView(findRequiredView, 2131296935, "field 'etAlamatPenerima'", EditText.class);
        this.d = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferBTActivity_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                editDaftarTransferBTActivity.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297210, "field 'etTipeNasabahPenerima', method 'pilihTipeNasabahPenerima', and method 'inputChange'");
        editDaftarTransferBTActivity.etTipeNasabahPenerima = (EditText) Utils.castView(findRequiredView2, 2131297210, "field 'etTipeNasabahPenerima'", EditText.class);
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferBTActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                editDaftarTransferBTActivity.pilihTipeNasabahPenerima(view2);
            }
        });
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferBTActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                editDaftarTransferBTActivity.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297190, "field 'etStatusPenduduk', method 'pilihStatusPenduduk', and method 'inputChange'");
        editDaftarTransferBTActivity.etStatusPenduduk = (EditText) Utils.castView(findRequiredView3, 2131297190, "field 'etStatusPenduduk'", EditText.class);
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferBTActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                editDaftarTransferBTActivity.pilihStatusPenduduk(view2);
            }
        });
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferBTActivity_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                editDaftarTransferBTActivity.inputChange(view2, z);
            }
        });
        editDaftarTransferBTActivity.rgKewarganegaraan = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298219, "field 'rgKewarganegaraan'", RadioGroup.class);
        editDaftarTransferBTActivity.rbKewarganegaraanWni = (RadioButton) Utils.findRequiredViewAsType(view, 2131298154, "field 'rbKewarganegaraanWni'", RadioButton.class);
        editDaftarTransferBTActivity.rbKewarganegaraanWna = (RadioButton) Utils.findRequiredViewAsType(view, 2131298153, "field 'rbKewarganegaraanWna'", RadioButton.class);
        editDaftarTransferBTActivity.tilAlamatPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298484, "field 'tilAlamatPenerima'", LogoutDialog_ViewBinding.class);
        editDaftarTransferBTActivity.tilTipeNasabahPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298742, "field 'tilTipeNasabahPenerima'", LogoutDialog_ViewBinding.class);
        editDaftarTransferBTActivity.tilStatusPenduduk = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298722, "field 'tilStatusPenduduk'", LogoutDialog_ViewBinding.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296450, "method 'simpan'");
        this.a = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferBTActivity_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                editDaftarTransferBTActivity.simpan();
            }
        });
        editDaftarTransferBTActivity.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131298963, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299210, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299190, "field 'tvErrors'", TextView.class));
        editDaftarTransferBTActivity.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298484, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298742, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298722, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        editDaftarTransferBTActivity.etForms = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296935, "field 'etForms'"), Utils.findRequiredView(view, 2131297210, "field 'etForms'"), Utils.findRequiredView(view, 2131297190, "field 'etForms'"));
        Resources resources = view.getContext().getResources();
        editDaftarTransferBTActivity.toolbarTitle = resources.getString(2131822320);
        editDaftarTransferBTActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        EditDaftarTransferBTActivity editDaftarTransferBTActivity = this.b;
        if (editDaftarTransferBTActivity != null) {
            this.b = null;
            editDaftarTransferBTActivity.toolbar = null;
            editDaftarTransferBTActivity.txtToolbarTitle = null;
            editDaftarTransferBTActivity.llMain = null;
            editDaftarTransferBTActivity.etNorek = null;
            editDaftarTransferBTActivity.etNamaPenerima = null;
            editDaftarTransferBTActivity.etBankTujuan = null;
            editDaftarTransferBTActivity.etAlamatPenerima = null;
            editDaftarTransferBTActivity.etTipeNasabahPenerima = null;
            editDaftarTransferBTActivity.etStatusPenduduk = null;
            editDaftarTransferBTActivity.rgKewarganegaraan = null;
            editDaftarTransferBTActivity.rbKewarganegaraanWni = null;
            editDaftarTransferBTActivity.rbKewarganegaraanWna = null;
            editDaftarTransferBTActivity.tilAlamatPenerima = null;
            editDaftarTransferBTActivity.tilTipeNasabahPenerima = null;
            editDaftarTransferBTActivity.tilStatusPenduduk = null;
            editDaftarTransferBTActivity.tvErrors = null;
            editDaftarTransferBTActivity.tilForms = null;
            editDaftarTransferBTActivity.etForms = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.c.setOnClickListener(null);
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
