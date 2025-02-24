package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/EditDaftarTransferORActivity_ViewBinding.class */
public class EditDaftarTransferORActivity_ViewBinding implements Unbinder {
    private View a;
    private EditDaftarTransferORActivity b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View j;

    public EditDaftarTransferORActivity_ViewBinding(final EditDaftarTransferORActivity editDaftarTransferORActivity, View view) {
        this.b = editDaftarTransferORActivity;
        editDaftarTransferORActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        editDaftarTransferORActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        editDaftarTransferORActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'llMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297107, "field 'etNorek' and method 'inputChange'");
        editDaftarTransferORActivity.etNorek = (AutoCompleteTextView) Utils.castView(findRequiredView, 2131297107, "field 'etNorek'", AutoCompleteTextView.class);
        this.g = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferORActivity_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                editDaftarTransferORActivity.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297099, "field 'etNoIBAN' and method 'inputChange'");
        editDaftarTransferORActivity.etNoIBAN = (EditText) Utils.castView(findRequiredView2, 2131297099, "field 'etNoIBAN'", EditText.class);
        this.j = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferORActivity_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                editDaftarTransferORActivity.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297066, "field 'etNamaPenerima' and method 'inputChange'");
        editDaftarTransferORActivity.etNamaPenerima = (EditText) Utils.castView(findRequiredView3, 2131297066, "field 'etNamaPenerima'", EditText.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferORActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                editDaftarTransferORActivity.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296935, "field 'etAlamatPenerima' and method 'inputChange'");
        editDaftarTransferORActivity.etAlamatPenerima = (EditText) Utils.castView(findRequiredView4, 2131296935, "field 'etAlamatPenerima'", EditText.class);
        this.c = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferORActivity_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                editDaftarTransferORActivity.inputChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297038, "field 'etKotaPenerima' and method 'inputChange'");
        editDaftarTransferORActivity.etKotaPenerima = (EditText) Utils.castView(findRequiredView5, 2131297038, "field 'etKotaPenerima'", EditText.class);
        this.e = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferORActivity_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                editDaftarTransferORActivity.inputChange(view2, z);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297210, "field 'etTipeNasabahPenerima', method 'pilihTipeNasabahPenerima', and method 'inputChange'");
        editDaftarTransferORActivity.etTipeNasabahPenerima = (EditText) Utils.castView(findRequiredView6, 2131297210, "field 'etTipeNasabahPenerima'", EditText.class);
        this.f = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferORActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                editDaftarTransferORActivity.pilihTipeNasabahPenerima(view2);
            }
        });
        findRequiredView6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferORActivity_ViewBinding.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                editDaftarTransferORActivity.inputChange(view2, z);
            }
        });
        editDaftarTransferORActivity.etBankTujuan = (EditText) Utils.findRequiredViewAsType(view, 2131296948, "field 'etBankTujuan'", EditText.class);
        editDaftarTransferORActivity.etNegaraTujuan = (EditText) Utils.findRequiredViewAsType(view, 2131297089, "field 'etNegaraTujuan'", EditText.class);
        editDaftarTransferORActivity.tilNorek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilNorek'", LogoutDialog_ViewBinding.class);
        editDaftarTransferORActivity.tilNoIBAN = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298645, "field 'tilNoIBAN'", LogoutDialog_ViewBinding.class);
        editDaftarTransferORActivity.tilNamaPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298613, "field 'tilNamaPenerima'", LogoutDialog_ViewBinding.class);
        editDaftarTransferORActivity.tilAlamatPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298484, "field 'tilAlamatPenerima'", LogoutDialog_ViewBinding.class);
        editDaftarTransferORActivity.tilKotaPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298585, "field 'tilKotaPenerima'", LogoutDialog_ViewBinding.class);
        editDaftarTransferORActivity.tilTipeNasabahPenerima = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298742, "field 'tilTipeNasabahPenerima'", LogoutDialog_ViewBinding.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131296450, "method 'simpan'");
        this.d = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferORActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                editDaftarTransferORActivity.simpan();
            }
        });
        editDaftarTransferORActivity.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299119, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299089, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131298963, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299061, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299210, "field 'tvErrors'", TextView.class));
        editDaftarTransferORActivity.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298645, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298613, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298484, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298585, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298742, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        editDaftarTransferORActivity.etForms = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297107, "field 'etForms'"), Utils.findRequiredView(view, 2131297099, "field 'etForms'"), Utils.findRequiredView(view, 2131297066, "field 'etForms'"), Utils.findRequiredView(view, 2131296935, "field 'etForms'"), Utils.findRequiredView(view, 2131297038, "field 'etForms'"), Utils.findRequiredView(view, 2131297210, "field 'etForms'"));
        Resources resources = view.getContext().getResources();
        editDaftarTransferORActivity.toolbarTitle = resources.getString(2131822320);
        editDaftarTransferORActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        EditDaftarTransferORActivity editDaftarTransferORActivity = this.b;
        if (editDaftarTransferORActivity != null) {
            this.b = null;
            editDaftarTransferORActivity.toolbar = null;
            editDaftarTransferORActivity.txtToolbarTitle = null;
            editDaftarTransferORActivity.llMain = null;
            editDaftarTransferORActivity.etNorek = null;
            editDaftarTransferORActivity.etNoIBAN = null;
            editDaftarTransferORActivity.etNamaPenerima = null;
            editDaftarTransferORActivity.etAlamatPenerima = null;
            editDaftarTransferORActivity.etKotaPenerima = null;
            editDaftarTransferORActivity.etTipeNasabahPenerima = null;
            editDaftarTransferORActivity.etBankTujuan = null;
            editDaftarTransferORActivity.etNegaraTujuan = null;
            editDaftarTransferORActivity.tilNorek = null;
            editDaftarTransferORActivity.tilNoIBAN = null;
            editDaftarTransferORActivity.tilNamaPenerima = null;
            editDaftarTransferORActivity.tilAlamatPenerima = null;
            editDaftarTransferORActivity.tilKotaPenerima = null;
            editDaftarTransferORActivity.tilTipeNasabahPenerima = null;
            editDaftarTransferORActivity.tvErrors = null;
            editDaftarTransferORActivity.tilForms = null;
            editDaftarTransferORActivity.etForms = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.f.setOnClickListener(null);
            this.f.setOnFocusChangeListener(null);
            this.f = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
