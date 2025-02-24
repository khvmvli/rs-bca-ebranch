package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.Page6CSFragment;
import o.getCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/UbahProfilActivity_ViewBinding.class */
public class UbahProfilActivity_ViewBinding implements Unbinder {
    private UbahProfilActivity a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View j;

    public UbahProfilActivity_ViewBinding(final UbahProfilActivity ubahProfilActivity, View view) {
        this.a = ubahProfilActivity;
        ubahProfilActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        ubahProfilActivity.tilFotoProfil = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298533, "field 'tilFotoProfil'", LogoutDialog_ViewBinding.class);
        ubahProfilActivity.tilNamaProfil = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298621, "field 'tilNamaProfil'", LogoutDialog_ViewBinding.class);
        ubahProfilActivity.tilNoHp = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilNoHp'", LogoutDialog_ViewBinding.class);
        ubahProfilActivity.tilNorek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298676, "field 'tilNorek'", LogoutDialog_ViewBinding.class);
        ubahProfilActivity.tilJenisId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298542, "field 'tilJenisId'", LogoutDialog_ViewBinding.class);
        ubahProfilActivity.tilNoId = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298647, "field 'tilNoId'", LogoutDialog_ViewBinding.class);
        ubahProfilActivity.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297075, "field 'etNamaProfil' and method 'inputChange'");
        ubahProfilActivity.etNamaProfil = (EditText) Utils.castView(findRequiredView, 2131297075, "field 'etNamaProfil'", EditText.class);
        this.e = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.UbahProfilActivity_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ubahProfilActivity.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297131, "field 'etNorek' and method 'inputChange'");
        ubahProfilActivity.etNorek = (EditText) Utils.castView(findRequiredView2, 2131297131, "field 'etNorek'", EditText.class);
        this.j = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.UbahProfilActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ubahProfilActivity.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297101, "field 'etNoId' and method 'inputChange'");
        ubahProfilActivity.etNoId = (EditText) Utils.castView(findRequiredView3, 2131297101, "field 'etNoId'", EditText.class);
        this.h = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.UbahProfilActivity_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ubahProfilActivity.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296984, "field 'etFotoProfil' and method 'inputChange'");
        ubahProfilActivity.etFotoProfil = (EditText) Utils.castView(findRequiredView4, 2131296984, "field 'etFotoProfil'", EditText.class);
        this.c = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.UbahProfilActivity_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ubahProfilActivity.inputChange(view2, z);
            }
        });
        ubahProfilActivity.etEmail = (EditText) Utils.findRequiredViewAsType(view, 2131296976, "field 'etEmail'", EditText.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131297094, "field 'etNoHp' and method 'inputChange'");
        ubahProfilActivity.etNoHp = (getCardSlogan) Utils.castView(findRequiredView5, 2131297094, "field 'etNoHp'", getCardSlogan.class);
        this.g = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.UbahProfilActivity_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ubahProfilActivity.inputChange(view2, z);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131296993, "field 'etJenisId', method 'onClickJenisId', and method 'inputChange'");
        ubahProfilActivity.etJenisId = (EditText) Utils.castView(findRequiredView6, 2131296993, "field 'etJenisId'", EditText.class);
        this.d = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.UbahProfilActivity_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                ubahProfilActivity.onClickJenisId(view2);
            }
        });
        findRequiredView6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.UbahProfilActivity_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ubahProfilActivity.inputChange(view2, z);
            }
        });
        ubahProfilActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        ubahProfilActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        ubahProfilActivity.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131297366, "field 'ivFotoProfil' and method 'ivfotoProfil'");
        ubahProfilActivity.ivFotoProfil = (Page6CSFragment) Utils.castView(findRequiredView7, 2131297366, "field 'ivFotoProfil'", Page6CSFragment.class);
        this.f = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.UbahProfilActivity_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                ubahProfilActivity.ivfotoProfil(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131296450, "method 'updateProfil'");
        this.b = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.UbahProfilActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                ubahProfilActivity.updateProfil(view2);
            }
        });
        ubahProfilActivity.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297075, "field 'etFields'"), Utils.findRequiredView(view, 2131297131, "field 'etFields'"), Utils.findRequiredView(view, 2131297101, "field 'etFields'"), Utils.findRequiredView(view, 2131297094, "field 'etFields'"));
        ubahProfilActivity.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299097, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299146, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299121, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299115, "field 'tvErrors'", TextView.class));
        ubahProfilActivity.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298621, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298676, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298647, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298640, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        Resources resources = view.getContext().getResources();
        ubahProfilActivity.retry = resources.getString(2131822092);
        ubahProfilActivity.nomorKtp = resources.getString(2131821553);
        ubahProfilActivity.nomorPaspor = resources.getString(2131821556);
        ubahProfilActivity.rekening = resources.getString(2131822074);
        ubahProfilActivity.ktp = resources.getString(2131821815);
        ubahProfilActivity.paspor = resources.getString(2131821986);
        ubahProfilActivity.dialogSuccessMessage = resources.getString(2131822071);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        UbahProfilActivity ubahProfilActivity = this.a;
        if (ubahProfilActivity != null) {
            this.a = null;
            ubahProfilActivity.llMain = null;
            ubahProfilActivity.tilFotoProfil = null;
            ubahProfilActivity.tilNamaProfil = null;
            ubahProfilActivity.tilNoHp = null;
            ubahProfilActivity.tilNorek = null;
            ubahProfilActivity.tilJenisId = null;
            ubahProfilActivity.tilNoId = null;
            ubahProfilActivity.tilEmail = null;
            ubahProfilActivity.etNamaProfil = null;
            ubahProfilActivity.etNorek = null;
            ubahProfilActivity.etNoId = null;
            ubahProfilActivity.etFotoProfil = null;
            ubahProfilActivity.etEmail = null;
            ubahProfilActivity.etNoHp = null;
            ubahProfilActivity.etJenisId = null;
            ubahProfilActivity.toolbar = null;
            ubahProfilActivity.txtToolbarTitle = null;
            ubahProfilActivity.svMain = null;
            ubahProfilActivity.ivFotoProfil = null;
            ubahProfilActivity.etFields = null;
            ubahProfilActivity.tvErrors = null;
            ubahProfilActivity.tilForms = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.d.setOnClickListener(null);
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
