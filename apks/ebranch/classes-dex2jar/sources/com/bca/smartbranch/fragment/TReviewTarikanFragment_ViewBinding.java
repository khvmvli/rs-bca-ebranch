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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/TReviewTarikanFragment_ViewBinding.class */
public class TReviewTarikanFragment_ViewBinding implements Unbinder {
    private TReviewTarikanFragment a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;

    public TReviewTarikanFragment_ViewBinding(final TReviewTarikanFragment tReviewTarikanFragment, View view) {
        this.a = tReviewTarikanFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297107, "field 'etNorek', method 'pilihNoRek', and method 'inputChangeTransaksi'");
        tReviewTarikanFragment.etNorek = (EditText) Utils.castView(findRequiredView, 2131297107, "field 'etNorek'", EditText.class);
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanFragment.pilihNoRek();
            }
        });
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                tReviewTarikanFragment.inputChangeTransaksi(view2, z);
            }
        });
        tReviewTarikanFragment.etJumlah = (EditText) Utils.findRequiredViewAsType(view, 2131297006, "field 'etJumlah'", EditText.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'inputChangeTransaksi'");
        tReviewTarikanFragment.etEmail = (EditText) Utils.castView(findRequiredView2, 2131296976, "field 'etEmail'", EditText.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                tReviewTarikanFragment.inputChangeTransaksi(view2, z);
            }
        });
        tReviewTarikanFragment.tvCabang = (TextView) Utils.findRequiredViewAsType(view, 2131298872, "field 'tvCabang'", TextView.class);
        tReviewTarikanFragment.tilNoRek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilNoRek'", LogoutDialog_ViewBinding.class);
        tReviewTarikanFragment.tilJumlah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilJumlah'", LogoutDialog_ViewBinding.class);
        tReviewTarikanFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        tReviewTarikanFragment.llCabang = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297559, "field 'llCabang'", LinearLayout.class);
        tReviewTarikanFragment.tvNorek = (TextView) Utils.findRequiredViewAsType(view, 2131299468, "field 'tvNorek'", TextView.class);
        tReviewTarikanFragment.tvJumlah = (TextView) Utils.findRequiredViewAsType(view, 2131299335, "field 'tvJumlah'", TextView.class);
        tReviewTarikanFragment.tvEmail = (TextView) Utils.findRequiredViewAsType(view, 2131298950, "field 'tvEmail'", TextView.class);
        tReviewTarikanFragment.llEmailDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297633, "field 'llEmailDisabled'", LinearLayout.class);
        tReviewTarikanFragment.llDataTransaksiDisabled = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297608, "field 'llDataTransaksiDisabled'", LinearLayout.class);
        tReviewTarikanFragment.llDataTransaksiEditable = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297609, "field 'llDataTransaksiEditable'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296469, "field 'cbxAgree' and method 'checkboxAgree'");
        tReviewTarikanFragment.cbxAgree = (CheckBox) Utils.castView(findRequiredView3, 2131296469, "field 'cbxAgree'", CheckBox.class);
        this.b = findRequiredView3;
        ((CompoundButton) findRequiredView3).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanFragment_ViewBinding.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                tReviewTarikanFragment.checkboxAgree(compoundButton, z);
            }
        });
        tReviewTarikanFragment.tvTermCondition = (TextView) Utils.findRequiredViewAsType(view, 2131299604, "field 'tvTermCondition'", TextView.class);
        tReviewTarikanFragment.llSyaratKetentuan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297904, "field 'llSyaratKetentuan'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296440, "field 'btnProses' and method 'onClickLanjut'");
        tReviewTarikanFragment.btnProses = (Button) Utils.castView(findRequiredView4, 2131296440, "field 'btnProses'", Button.class);
        this.c = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanFragment.onClickLanjut(view2);
            }
        });
        tReviewTarikanFragment.llWrapperDataTransaksi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297956, "field 'llWrapperDataTransaksi'", LinearLayout.class);
        tReviewTarikanFragment.llHeaderDataTransaksi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297673, "field 'llHeaderDataTransaksi'", LinearLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131297353, "field 'ivDataTransaksi' and method 'showDataTransaksi'");
        tReviewTarikanFragment.ivDataTransaksi = (ImageView) Utils.castView(findRequiredView5, 2131297353, "field 'ivDataTransaksi'", ImageView.class);
        this.i = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanFragment.showDataTransaksi(view2);
            }
        });
        tReviewTarikanFragment.llLayoutDataTransaksi = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297479, "field 'llLayoutDataTransaksi'", LinearLayout.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131299722, "field 'tvUbahTransaksi' and method 'onClickUbahDataTransaksi'");
        tReviewTarikanFragment.tvUbahTransaksi = (TextView) Utils.castView(findRequiredView6, 2131299722, "field 'tvUbahTransaksi'", TextView.class);
        this.f = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanFragment.onClickUbahDataTransaksi(view2);
            }
        });
        tReviewTarikanFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131298913, "method 'showDataTransaksi'");
        this.h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanFragment.showDataTransaksi(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297387, "method 'onClickInfo'");
        this.g = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.TReviewTarikanFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tReviewTarikanFragment.onClickInfo(view2);
            }
        });
        tReviewTarikanFragment.viewGroupTransaksi = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297107, "field 'viewGroupTransaksi'"), Utils.findRequiredView(view, 2131296976, "field 'viewGroupTransaksi'"));
        tReviewTarikanFragment.tvErrorsTransaksi = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrorsTransaksi'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrorsTransaksi'", TextView.class));
        tReviewTarikanFragment.tilFormsTransaksi = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilFormsTransaksi'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilFormsTransaksi'", LogoutDialog_ViewBinding.class));
        tReviewTarikanFragment.txtTermCondition = view.getContext().getResources().getString(2131821427);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TReviewTarikanFragment tReviewTarikanFragment = this.a;
        if (tReviewTarikanFragment != null) {
            this.a = null;
            tReviewTarikanFragment.etNorek = null;
            tReviewTarikanFragment.etJumlah = null;
            tReviewTarikanFragment.etEmail = null;
            tReviewTarikanFragment.tvCabang = null;
            tReviewTarikanFragment.tilNoRek = null;
            tReviewTarikanFragment.tilJumlah = null;
            tReviewTarikanFragment.tilEmail = null;
            tReviewTarikanFragment.llCabang = null;
            tReviewTarikanFragment.tvNorek = null;
            tReviewTarikanFragment.tvJumlah = null;
            tReviewTarikanFragment.tvEmail = null;
            tReviewTarikanFragment.llEmailDisabled = null;
            tReviewTarikanFragment.llDataTransaksiDisabled = null;
            tReviewTarikanFragment.llDataTransaksiEditable = null;
            tReviewTarikanFragment.cbxAgree = null;
            tReviewTarikanFragment.tvTermCondition = null;
            tReviewTarikanFragment.llSyaratKetentuan = null;
            tReviewTarikanFragment.btnProses = null;
            tReviewTarikanFragment.llWrapperDataTransaksi = null;
            tReviewTarikanFragment.llHeaderDataTransaksi = null;
            tReviewTarikanFragment.ivDataTransaksi = null;
            tReviewTarikanFragment.llLayoutDataTransaksi = null;
            tReviewTarikanFragment.tvUbahTransaksi = null;
            tReviewTarikanFragment.svMain = null;
            tReviewTarikanFragment.viewGroupTransaksi = null;
            tReviewTarikanFragment.tvErrorsTransaksi = null;
            tReviewTarikanFragment.tilFormsTransaksi = null;
            this.e.setOnClickListener(null);
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            ((CompoundButton) this.b).setOnCheckedChangeListener(null);
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
