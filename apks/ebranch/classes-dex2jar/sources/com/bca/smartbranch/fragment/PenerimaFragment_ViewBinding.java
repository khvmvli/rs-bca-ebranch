package com.bca.smartbranch.fragment;

import android.content.res.Resources;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/PenerimaFragment_ViewBinding.class */
public class PenerimaFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private PenerimaFragment c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private View m;

    /* renamed from: o  reason: collision with root package name */
    private View f55o;

    public PenerimaFragment_ViewBinding(final PenerimaFragment penerimaFragment, View view) {
        this.c = penerimaFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297054, "field 'etFullName' and method 'inputChange'");
        penerimaFragment.etFullName = (AutoCompleteTextView) Utils.castView(findRequiredView, 2131297054, "field 'etFullName'", AutoCompleteTextView.class);
        this.g = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.PenerimaFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                penerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297107, "field 'etNumberRek' and method 'inputChange'");
        penerimaFragment.etNumberRek = (AutoCompleteTextView) Utils.castView(findRequiredView2, 2131297107, "field 'etNumberRek'", AutoCompleteTextView.class);
        this.j = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.PenerimaFragment_ViewBinding.9
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                penerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297182, "field 'etSimpanNama' and method 'inputChange'");
        penerimaFragment.etSimpanNama = (EditText) Utils.castView(findRequiredView3, 2131297182, "field 'etSimpanNama'", EditText.class);
        this.h = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.PenerimaFragment_ViewBinding.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                penerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297006, "field 'etJumlah' and method 'inputChange'");
        penerimaFragment.etJumlah = (EditText) Utils.castView(findRequiredView4, 2131297006, "field 'etJumlah'", EditText.class);
        this.b = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.PenerimaFragment_ViewBinding.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                penerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131296954, "field 'etNews' and method 'inputChange'");
        penerimaFragment.etNews = (EditText) Utils.castView(findRequiredView5, 2131296954, "field 'etNews'", EditText.class);
        this.a = findRequiredView5;
        findRequiredView5.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.PenerimaFragment_ViewBinding.10
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                penerimaFragment.inputChange(view2, z);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297203, "field 'etTanggalBerakhir' and method 'showDatePicker'");
        penerimaFragment.etTanggalBerakhir = (EditText) Utils.castView(findRequiredView6, 2131297203, "field 'etTanggalBerakhir'", EditText.class);
        this.f55o = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.PenerimaFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penerimaFragment.showDatePicker(view2);
            }
        });
        penerimaFragment.rbSetiap = (RadioButton) Utils.findRequiredViewAsType(view, 2131298177, "field 'rbSetiap'", RadioButton.class);
        penerimaFragment.rbSetiapHari = (RadioButton) Utils.findRequiredViewAsType(view, 2131298178, "field 'rbSetiapHari'", RadioButton.class);
        penerimaFragment.rbSetiapTanggal = (RadioButton) Utils.findRequiredViewAsType(view, 2131298179, "field 'rbSetiapTanggal'", RadioButton.class);
        penerimaFragment.etSetiap = (EditText) Utils.findRequiredViewAsType(view, 2131297177, "field 'etSetiap'", EditText.class);
        View findRequiredView7 = Utils.findRequiredView(view, 2131297179, "field 'etSetiapHari' and method 'onClickedSetiapHari'");
        penerimaFragment.etSetiapHari = (EditText) Utils.castView(findRequiredView7, 2131297179, "field 'etSetiapHari'", EditText.class);
        this.f = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.PenerimaFragment_ViewBinding.12
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penerimaFragment.onClickedSetiapHari(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297180, "field 'etSetiapTanggal' and method 'onClickedSetiapTanggal'");
        penerimaFragment.etSetiapTanggal = (EditText) Utils.castView(findRequiredView8, 2131297180, "field 'etSetiapTanggal'", EditText.class);
        this.i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.PenerimaFragment_ViewBinding.14
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penerimaFragment.onClickedSetiapTanggal(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131299400, "field 'tvMataUang' and method 'clickMataUang'");
        penerimaFragment.tvMataUang = (TextView) Utils.castView(findRequiredView9, 2131299400, "field 'tvMataUang'", TextView.class);
        this.m = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.PenerimaFragment_ViewBinding.13
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penerimaFragment.clickMataUang(view2);
            }
        });
        penerimaFragment.tilNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298601, "field 'tilNama'", LogoutDialog_ViewBinding.class);
        penerimaFragment.tilNoRek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilNoRek'", LogoutDialog_ViewBinding.class);
        penerimaFragment.tilSimpanNama = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298714, "field 'tilSimpanNama'", LogoutDialog_ViewBinding.class);
        penerimaFragment.tilJumlah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilJumlah'", LogoutDialog_ViewBinding.class);
        penerimaFragment.tilBerita = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298504, "field 'tilBerita'", LogoutDialog_ViewBinding.class);
        penerimaFragment.tilTanggalBerakhir = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298735, "field 'tilTanggalBerakhir'", LogoutDialog_ViewBinding.class);
        penerimaFragment.llJumlah = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297706, "field 'llJumlah'", LinearLayout.class);
        penerimaFragment.tvErrorTransaksiBerkala = (TextView) Utils.findRequiredViewAsType(view, 2131299227, "field 'tvErrorTransaksiBerkala'", TextView.class);
        penerimaFragment.tvErrorTanggalBerakhir = (TextView) Utils.findRequiredViewAsType(view, 2131299203, "field 'tvErrorTanggalBerakhir'", TextView.class);
        penerimaFragment.llTransaksiBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297922, "field 'llTransaksiBerkala'", LinearLayout.class);
        penerimaFragment.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView10 = Utils.findRequiredView(view, 2131296473, "field 'cbxSimpanDaftarTransfer' and method 'checkSimpanNama'");
        penerimaFragment.cbxSimpanDaftarTransfer = (CheckBox) Utils.castView(findRequiredView10, 2131296473, "field 'cbxSimpanDaftarTransfer'", CheckBox.class);
        this.e = findRequiredView10;
        ((CompoundButton) findRequiredView10).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.bca.smartbranch.fragment.PenerimaFragment_ViewBinding.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                penerimaFragment.checkSimpanNama(compoundButton, z);
            }
        });
        penerimaFragment.llSimpanNama = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297888, "field 'llSimpanNama'", LinearLayout.class);
        penerimaFragment.llSimpanNamaField = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297889, "field 'llSimpanNamaField'", LinearLayout.class);
        penerimaFragment.llFieldTransaksiBerkala = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297643, "field 'llFieldTransaksiBerkala'", LinearLayout.class);
        penerimaFragment.rgTransaksiBerkala = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298231, "field 'rgTransaksiBerkala'", RadioGroup.class);
        penerimaFragment.rbTransaksiBerkalaYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298189, "field 'rbTransaksiBerkalaYa'", RadioButton.class);
        penerimaFragment.rbTransaksiBerkalaTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298188, "field 'rbTransaksiBerkalaTidak'", RadioButton.class);
        View findRequiredView11 = Utils.findRequiredView(view, 2131296396, "method 'clickLanjut'");
        this.d = findRequiredView11;
        findRequiredView11.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.PenerimaFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penerimaFragment.clickLanjut(view2);
            }
        });
        View findRequiredView12 = Utils.findRequiredView(view, 2131299572, "method 'clickSimpanNama'");
        this.l = findRequiredView12;
        findRequiredView12.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.PenerimaFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penerimaFragment.clickSimpanNama(view2);
            }
        });
        View findRequiredView13 = Utils.findRequiredView(view, 2131297387, "method 'showInfo'");
        this.k = findRequiredView13;
        findRequiredView13.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.PenerimaFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                penerimaFragment.showInfo(view2);
            }
        });
        penerimaFragment.radioButtonList = Utils.listFilteringNull((RadioButton) Utils.findRequiredViewAsType(view, 2131298177, "field 'radioButtonList'", RadioButton.class), (RadioButton) Utils.findRequiredViewAsType(view, 2131298178, "field 'radioButtonList'", RadioButton.class), (RadioButton) Utils.findRequiredViewAsType(view, 2131298179, "field 'radioButtonList'", RadioButton.class));
        penerimaFragment.editTextList = Utils.listFilteringNull((EditText) Utils.findRequiredViewAsType(view, 2131297177, "field 'editTextList'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297179, "field 'editTextList'", EditText.class), (EditText) Utils.findRequiredViewAsType(view, 2131297180, "field 'editTextList'", EditText.class));
        penerimaFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297054, "field 'etFields'"), Utils.findRequiredView(view, 2131297107, "field 'etFields'"), Utils.findRequiredView(view, 2131297182, "field 'etFields'"), Utils.findRequiredView(view, 2131297006, "field 'etFields'"), Utils.findRequiredView(view, 2131297203, "field 'etFields'"));
        penerimaFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299078, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299182, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299030, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299203, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299227, "field 'tvErrors'", TextView.class));
        penerimaFragment.tilForms = Utils.listFilteringNull(Utils.findRequiredView(view, 2131298601, "field 'tilForms'"), Utils.findRequiredView(view, 2131298653, "field 'tilForms'"), Utils.findRequiredView(view, 2131298714, "field 'tilForms'"), Utils.findRequiredView(view, 2131297706, "field 'tilForms'"), Utils.findRequiredView(view, 2131298735, "field 'tilForms'"));
        Resources resources = view.getContext().getResources();
        penerimaFragment.arrayHari = resources.getStringArray(2130903059);
        penerimaFragment.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PenerimaFragment penerimaFragment = this.c;
        if (penerimaFragment != null) {
            this.c = null;
            penerimaFragment.etFullName = null;
            penerimaFragment.etNumberRek = null;
            penerimaFragment.etSimpanNama = null;
            penerimaFragment.etJumlah = null;
            penerimaFragment.etNews = null;
            penerimaFragment.etTanggalBerakhir = null;
            penerimaFragment.rbSetiap = null;
            penerimaFragment.rbSetiapHari = null;
            penerimaFragment.rbSetiapTanggal = null;
            penerimaFragment.etSetiap = null;
            penerimaFragment.etSetiapHari = null;
            penerimaFragment.etSetiapTanggal = null;
            penerimaFragment.tvMataUang = null;
            penerimaFragment.tilNama = null;
            penerimaFragment.tilNoRek = null;
            penerimaFragment.tilSimpanNama = null;
            penerimaFragment.tilJumlah = null;
            penerimaFragment.tilBerita = null;
            penerimaFragment.tilTanggalBerakhir = null;
            penerimaFragment.llJumlah = null;
            penerimaFragment.tvErrorTransaksiBerkala = null;
            penerimaFragment.tvErrorTanggalBerakhir = null;
            penerimaFragment.llTransaksiBerkala = null;
            penerimaFragment.llMain = null;
            penerimaFragment.cbxSimpanDaftarTransfer = null;
            penerimaFragment.llSimpanNama = null;
            penerimaFragment.llSimpanNamaField = null;
            penerimaFragment.llFieldTransaksiBerkala = null;
            penerimaFragment.rgTransaksiBerkala = null;
            penerimaFragment.rbTransaksiBerkalaYa = null;
            penerimaFragment.rbTransaksiBerkalaTidak = null;
            penerimaFragment.radioButtonList = null;
            penerimaFragment.editTextList = null;
            penerimaFragment.etFields = null;
            penerimaFragment.tvErrors = null;
            penerimaFragment.tilForms = null;
            this.g.setOnFocusChangeListener(null);
            this.g = null;
            this.j.setOnFocusChangeListener(null);
            this.j = null;
            this.h.setOnFocusChangeListener(null);
            this.h = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.f55o.setOnClickListener(null);
            this.f55o = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.m.setOnClickListener(null);
            this.m = null;
            ((CompoundButton) this.e).setOnCheckedChangeListener(null);
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.l.setOnClickListener(null);
            this.l = null;
            this.k.setOnClickListener(null);
            this.k = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
