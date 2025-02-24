package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TReviewTarikanUbahFragment_ViewBinding.class */
public class TReviewTarikanUbahFragment_ViewBinding implements Unbinder {
    private TReviewTarikanUbahFragment a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View i;
    private View j;

    public TReviewTarikanUbahFragment_ViewBinding(final TReviewTarikanUbahFragment tReviewTarikanUbahFragment, View view) {
        this.a = tReviewTarikanUbahFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297107, "field 'etNorek', method 'pilihNoRek', and method 'inputChangeTransaksi'");
        tReviewTarikanUbahFragment.etNorek = (EditText) Utils.castView(findRequiredView, 2131297107, "field 'etNorek'", EditText.class);
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanUbahFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanUbahFragment.pilihNoRek();
            }
        });
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanUbahFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                tReviewTarikanUbahFragment.inputChangeTransaksi(view2, z);
            }
        });
        tReviewTarikanUbahFragment.etJumlah = (EditText) Utils.findRequiredViewAsType(view, 2131297006, "field 'etJumlah'", EditText.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChangeTransaksi'");
        tReviewTarikanUbahFragment.etEmail = (EditText) Utils.castView(findRequiredView2, 2131296976, "field 'etEmail'", EditText.class);
        this.c = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanUbahFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                tReviewTarikanUbahFragment.inputChangeTransaksi(view2, z);
            }
        });
        tReviewTarikanUbahFragment.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        tReviewTarikanUbahFragment.tilNoRek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilNoRek'", LogoutDialog_ViewBinding.class);
        tReviewTarikanUbahFragment.tilJumlah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilJumlah'", LogoutDialog_ViewBinding.class);
        tReviewTarikanUbahFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        tReviewTarikanUbahFragment.llCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'llCabang'", LinearLayout.class);
        tReviewTarikanUbahFragment.tvNorek = (TextView) Utils.findRequiredViewAsType(view, 2131299468, "field 'tvNorek'", TextView.class);
        tReviewTarikanUbahFragment.tvJumlah = (TextView) Utils.findRequiredViewAsType(view, 2131299335, "field 'tvJumlah'", TextView.class);
        tReviewTarikanUbahFragment.tvEmail = (TextView) Utils.findRequiredViewAsType(view, 2131298950, "field 'tvEmail'", TextView.class);
        tReviewTarikanUbahFragment.llEmailDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297633, "field 'llEmailDisabled'", LinearLayout.class);
        tReviewTarikanUbahFragment.llDataTransaksiDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297608, "field 'llDataTransaksiDisabled'", LinearLayout.class);
        tReviewTarikanUbahFragment.llDataTransaksiEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297609, "field 'llDataTransaksiEditable'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296469, "field 'cbxAgree' and method 'checkboxAgree'");
        tReviewTarikanUbahFragment.cbxAgree = (CheckBox) Utils.castView(findRequiredView3, 2131296469, "field 'cbxAgree'", CheckBox.class);
        this.b = findRequiredView3;
        ((CompoundButton) findRequiredView3).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanUbahFragment_ViewBinding.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                tReviewTarikanUbahFragment.checkboxAgree(compoundButton, z);
            }
        });
        tReviewTarikanUbahFragment.tvTermCondition = (TextView) Utils.findRequiredViewAsType(view, 2131299604, "field 'tvTermCondition'", TextView.class);
        tReviewTarikanUbahFragment.llSyaratKetentuan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297904, "field 'llSyaratKetentuan'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'onClickLanjut'");
        tReviewTarikanUbahFragment.btnProses = (Button) Utils.castView(findRequiredView4, 2131296440, "field 'btnProses'", Button.class);
        this.d = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanUbahFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanUbahFragment.onClickLanjut(view2);
            }
        });
        tReviewTarikanUbahFragment.llWrapperDataTransaksi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297956, "field 'llWrapperDataTransaksi'", LinearLayout.class);
        tReviewTarikanUbahFragment.llHeaderDataTransaksi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297673, "field 'llHeaderDataTransaksi'", LinearLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131297353, "field 'ivDataTransaksi' and method 'showDataTransaksi'");
        tReviewTarikanUbahFragment.ivDataTransaksi = (ImageView) Utils.castView(findRequiredView5, 2131297353, "field 'ivDataTransaksi'", ImageView.class);
        this.j = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanUbahFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanUbahFragment.showDataTransaksi(view2);
            }
        });
        tReviewTarikanUbahFragment.llLayoutDataTransaksi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297479, "field 'llLayoutDataTransaksi'", LinearLayout.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131299722, "field 'tvUbahTransaksi' and method 'onClickUbahDataTransaksi'");
        tReviewTarikanUbahFragment.tvUbahTransaksi = (TextView) Utils.castView(findRequiredView6, 2131299722, "field 'tvUbahTransaksi'", TextView.class);
        this.f = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanUbahFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanUbahFragment.onClickUbahDataTransaksi(view2);
            }
        });
        tReviewTarikanUbahFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131298913, "method 'showDataTransaksi'");
        this.i = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanUbahFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanUbahFragment.showDataTransaksi(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297387, "method 'onClickInfo'");
        this.g = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanUbahFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanUbahFragment.onClickInfo(view2);
            }
        });
        tReviewTarikanUbahFragment.viewGroupTransaksi = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297107, "field 'viewGroupTransaksi'"), Utils.findRequiredView(view, 2131296976, "field 'viewGroupTransaksi'"));
        tReviewTarikanUbahFragment.tvErrorsTransaksi = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrorsTransaksi'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrorsTransaksi'", TextView.class));
        tReviewTarikanUbahFragment.tilFormsTransaksi = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilFormsTransaksi'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilFormsTransaksi'", LogoutDialog_ViewBinding.class));
        tReviewTarikanUbahFragment.txtTermCondition = view.getContext().getResources().getString(2131821427);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TReviewTarikanUbahFragment tReviewTarikanUbahFragment = this.a;
        if (tReviewTarikanUbahFragment != null) {
            this.a = null;
            tReviewTarikanUbahFragment.etNorek = null;
            tReviewTarikanUbahFragment.etJumlah = null;
            tReviewTarikanUbahFragment.etEmail = null;
            tReviewTarikanUbahFragment.tvCabang = null;
            tReviewTarikanUbahFragment.tilNoRek = null;
            tReviewTarikanUbahFragment.tilJumlah = null;
            tReviewTarikanUbahFragment.tilEmail = null;
            tReviewTarikanUbahFragment.llCabang = null;
            tReviewTarikanUbahFragment.tvNorek = null;
            tReviewTarikanUbahFragment.tvJumlah = null;
            tReviewTarikanUbahFragment.tvEmail = null;
            tReviewTarikanUbahFragment.llEmailDisabled = null;
            tReviewTarikanUbahFragment.llDataTransaksiDisabled = null;
            tReviewTarikanUbahFragment.llDataTransaksiEditable = null;
            tReviewTarikanUbahFragment.cbxAgree = null;
            tReviewTarikanUbahFragment.tvTermCondition = null;
            tReviewTarikanUbahFragment.llSyaratKetentuan = null;
            tReviewTarikanUbahFragment.btnProses = null;
            tReviewTarikanUbahFragment.llWrapperDataTransaksi = null;
            tReviewTarikanUbahFragment.llHeaderDataTransaksi = null;
            tReviewTarikanUbahFragment.ivDataTransaksi = null;
            tReviewTarikanUbahFragment.llLayoutDataTransaksi = null;
            tReviewTarikanUbahFragment.tvUbahTransaksi = null;
            tReviewTarikanUbahFragment.svMain = null;
            tReviewTarikanUbahFragment.viewGroupTransaksi = null;
            tReviewTarikanUbahFragment.tvErrorsTransaksi = null;
            tReviewTarikanUbahFragment.tilFormsTransaksi = null;
            this.e.setOnClickListener(null);
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            ((CompoundButton) this.b).setOnCheckedChangeListener(null);
            this.b = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
