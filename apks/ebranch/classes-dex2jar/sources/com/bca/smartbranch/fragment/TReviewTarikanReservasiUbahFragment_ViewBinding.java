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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TReviewTarikanReservasiUbahFragment_ViewBinding.class */
public class TReviewTarikanReservasiUbahFragment_ViewBinding implements Unbinder {
    private TReviewTarikanReservasiUbahFragment a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View i;
    private View j;

    public TReviewTarikanReservasiUbahFragment_ViewBinding(final TReviewTarikanReservasiUbahFragment tReviewTarikanReservasiUbahFragment, View view) {
        this.a = tReviewTarikanReservasiUbahFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297107, "field 'etNorek', method 'pilihNoRek', and method 'inputChangeTransaksi'");
        tReviewTarikanReservasiUbahFragment.etNorek = (EditText) Utils.castView(findRequiredView, 2131297107, "field 'etNorek'", EditText.class);
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanReservasiUbahFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanReservasiUbahFragment.pilihNoRek();
            }
        });
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanReservasiUbahFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                tReviewTarikanReservasiUbahFragment.inputChangeTransaksi(view2, z);
            }
        });
        tReviewTarikanReservasiUbahFragment.etJumlah = (EditText) Utils.findRequiredViewAsType(view, 2131297006, "field 'etJumlah'", EditText.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChangeTransaksi'");
        tReviewTarikanReservasiUbahFragment.etEmail = (EditText) Utils.castView(findRequiredView2, 2131296976, "field 'etEmail'", EditText.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanReservasiUbahFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                tReviewTarikanReservasiUbahFragment.inputChangeTransaksi(view2, z);
            }
        });
        tReviewTarikanReservasiUbahFragment.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        tReviewTarikanReservasiUbahFragment.tilNoRek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilNoRek'", LogoutDialog_ViewBinding.class);
        tReviewTarikanReservasiUbahFragment.tilJumlah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilJumlah'", LogoutDialog_ViewBinding.class);
        tReviewTarikanReservasiUbahFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        tReviewTarikanReservasiUbahFragment.llCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'llCabang'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296469, "field 'cbxAgree' and method 'checkboxAgree'");
        tReviewTarikanReservasiUbahFragment.cbxAgree = (CheckBox) Utils.castView(findRequiredView3, 2131296469, "field 'cbxAgree'", CheckBox.class);
        this.d = findRequiredView3;
        ((CompoundButton) findRequiredView3).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanReservasiUbahFragment_ViewBinding.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                tReviewTarikanReservasiUbahFragment.checkboxAgree(compoundButton, z);
            }
        });
        tReviewTarikanReservasiUbahFragment.tvNorek = (TextView) Utils.findRequiredViewAsType(view, 2131299468, "field 'tvNorek'", TextView.class);
        tReviewTarikanReservasiUbahFragment.tvJumlah = (TextView) Utils.findRequiredViewAsType(view, 2131299335, "field 'tvJumlah'", TextView.class);
        tReviewTarikanReservasiUbahFragment.tvEmail = (TextView) Utils.findRequiredViewAsType(view, 2131298950, "field 'tvEmail'", TextView.class);
        tReviewTarikanReservasiUbahFragment.llEmailDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297633, "field 'llEmailDisabled'", LinearLayout.class);
        tReviewTarikanReservasiUbahFragment.llDataTransaksiDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297608, "field 'llDataTransaksiDisabled'", LinearLayout.class);
        tReviewTarikanReservasiUbahFragment.llDataTransaksiEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297609, "field 'llDataTransaksiEditable'", LinearLayout.class);
        tReviewTarikanReservasiUbahFragment.tvTermCondition = (TextView) Utils.findRequiredViewAsType(view, 2131299604, "field 'tvTermCondition'", TextView.class);
        tReviewTarikanReservasiUbahFragment.llSyaratKetentuan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297904, "field 'llSyaratKetentuan'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'onClickLanjut'");
        tReviewTarikanReservasiUbahFragment.btnProses = (Button) Utils.castView(findRequiredView4, 2131296440, "field 'btnProses'", Button.class);
        this.c = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanReservasiUbahFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanReservasiUbahFragment.onClickLanjut(view2);
            }
        });
        tReviewTarikanReservasiUbahFragment.llWrapperDataTransaksi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297956, "field 'llWrapperDataTransaksi'", LinearLayout.class);
        tReviewTarikanReservasiUbahFragment.llHeaderDataTransaksi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297673, "field 'llHeaderDataTransaksi'", LinearLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131297353, "field 'ivDataTransaksi' and method 'showDataTransaksi'");
        tReviewTarikanReservasiUbahFragment.ivDataTransaksi = (ImageView) Utils.castView(findRequiredView5, 2131297353, "field 'ivDataTransaksi'", ImageView.class);
        this.f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanReservasiUbahFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanReservasiUbahFragment.showDataTransaksi(view2);
            }
        });
        tReviewTarikanReservasiUbahFragment.llLayoutDataTransaksi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297479, "field 'llLayoutDataTransaksi'", LinearLayout.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131299722, "field 'tvUbahTransaksi' and method 'onClickUbahDataTransaksi'");
        tReviewTarikanReservasiUbahFragment.tvUbahTransaksi = (TextView) Utils.castView(findRequiredView6, 2131299722, "field 'tvUbahTransaksi'", TextView.class);
        this.i = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanReservasiUbahFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanReservasiUbahFragment.onClickUbahDataTransaksi(view2);
            }
        });
        tReviewTarikanReservasiUbahFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131298913, "method 'showDataTransaksi'");
        this.g = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanReservasiUbahFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanReservasiUbahFragment.showDataTransaksi(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297387, "method 'onClickInfo'");
        this.j = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanReservasiUbahFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanReservasiUbahFragment.onClickInfo(view2);
            }
        });
        tReviewTarikanReservasiUbahFragment.viewGroupTransaksi = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297107, "field 'viewGroupTransaksi'"), Utils.findRequiredView(view, 2131296976, "field 'viewGroupTransaksi'"));
        tReviewTarikanReservasiUbahFragment.tvErrorsTransaksi = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrorsTransaksi'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrorsTransaksi'", TextView.class));
        tReviewTarikanReservasiUbahFragment.tilFormsTransaksi = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilFormsTransaksi'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilFormsTransaksi'", LogoutDialog_ViewBinding.class));
        tReviewTarikanReservasiUbahFragment.txtTermCondition = view.getContext().getResources().getString(2131821427);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TReviewTarikanReservasiUbahFragment tReviewTarikanReservasiUbahFragment = this.a;
        if (tReviewTarikanReservasiUbahFragment != null) {
            this.a = null;
            tReviewTarikanReservasiUbahFragment.etNorek = null;
            tReviewTarikanReservasiUbahFragment.etJumlah = null;
            tReviewTarikanReservasiUbahFragment.etEmail = null;
            tReviewTarikanReservasiUbahFragment.tvCabang = null;
            tReviewTarikanReservasiUbahFragment.tilNoRek = null;
            tReviewTarikanReservasiUbahFragment.tilJumlah = null;
            tReviewTarikanReservasiUbahFragment.tilEmail = null;
            tReviewTarikanReservasiUbahFragment.llCabang = null;
            tReviewTarikanReservasiUbahFragment.cbxAgree = null;
            tReviewTarikanReservasiUbahFragment.tvNorek = null;
            tReviewTarikanReservasiUbahFragment.tvJumlah = null;
            tReviewTarikanReservasiUbahFragment.tvEmail = null;
            tReviewTarikanReservasiUbahFragment.llEmailDisabled = null;
            tReviewTarikanReservasiUbahFragment.llDataTransaksiDisabled = null;
            tReviewTarikanReservasiUbahFragment.llDataTransaksiEditable = null;
            tReviewTarikanReservasiUbahFragment.tvTermCondition = null;
            tReviewTarikanReservasiUbahFragment.llSyaratKetentuan = null;
            tReviewTarikanReservasiUbahFragment.btnProses = null;
            tReviewTarikanReservasiUbahFragment.llWrapperDataTransaksi = null;
            tReviewTarikanReservasiUbahFragment.llHeaderDataTransaksi = null;
            tReviewTarikanReservasiUbahFragment.ivDataTransaksi = null;
            tReviewTarikanReservasiUbahFragment.llLayoutDataTransaksi = null;
            tReviewTarikanReservasiUbahFragment.tvUbahTransaksi = null;
            tReviewTarikanReservasiUbahFragment.svMain = null;
            tReviewTarikanReservasiUbahFragment.viewGroupTransaksi = null;
            tReviewTarikanReservasiUbahFragment.tvErrorsTransaksi = null;
            tReviewTarikanReservasiUbahFragment.tilFormsTransaksi = null;
            this.e.setOnClickListener(null);
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            ((CompoundButton) this.d).setOnCheckedChangeListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.j.setOnClickListener(null);
            this.j = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
