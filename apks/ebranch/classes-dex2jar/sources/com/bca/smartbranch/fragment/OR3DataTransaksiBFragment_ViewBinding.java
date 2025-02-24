package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR3DataTransaksiBFragment_ViewBinding.class */
public class OR3DataTransaksiBFragment_ViewBinding implements Unbinder {
    private OR3DataTransaksiBFragment a;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View h;
    private View i;

    public OR3DataTransaksiBFragment_ViewBinding(final OR3DataTransaksiBFragment oR3DataTransaksiBFragment, View view) {
        this.a = oR3DataTransaksiBFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297009, "field 'etKategori' and method 'pilihKategoriTujuanTransaksiOR'");
        oR3DataTransaksiBFragment.etKategori = (EditText) Utils.castView(findRequiredView, 2131297009, "field 'etKategori'", EditText.class);
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR3DataTransaksiBFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR3DataTransaksiBFragment.pilihKategoriTujuanTransaksiOR(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297226, "field 'etTujuan' and method 'pilihTujuanTransaksi'");
        oR3DataTransaksiBFragment.etTujuan = (EditText) Utils.castView(findRequiredView2, 2131297226, "field 'etTujuan'", EditText.class);
        this.h = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR3DataTransaksiBFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR3DataTransaksiBFragment.pilihTujuanTransaksi(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297199, "field 'etSumberDana' and method 'pilihSumberDanaOR'");
        oR3DataTransaksiBFragment.etSumberDana = (EditText) Utils.castView(findRequiredView3, 2131297199, "field 'etSumberDana'", EditText.class);
        this.b = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR3DataTransaksiBFragment_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR3DataTransaksiBFragment.pilihSumberDanaOR(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296954, "field 'etBerita' and method 'inputChange'");
        oR3DataTransaksiBFragment.etBerita = (EditText) Utils.castView(findRequiredView4, 2131296954, "field 'etBerita'", EditText.class);
        this.d = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR3DataTransaksiBFragment_ViewBinding.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR3DataTransaksiBFragment.inputChange(view2, z);
            }
        });
        oR3DataTransaksiBFragment.tilKategori = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298555, "field 'tilKategori'", LogoutDialog_ViewBinding.class);
        oR3DataTransaksiBFragment.tilTujuan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298757, "field 'tilTujuan'", LogoutDialog_ViewBinding.class);
        oR3DataTransaksiBFragment.tilSumberDana = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298731, "field 'tilSumberDana'", LogoutDialog_ViewBinding.class);
        oR3DataTransaksiBFragment.tilBerita = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298504, "field 'tilBerita'", LogoutDialog_ViewBinding.class);
        oR3DataTransaksiBFragment.rgHubunganKeuangan = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298216, "field 'rgHubunganKeuangan'", RadioGroup.class);
        oR3DataTransaksiBFragment.rbHubunganKeuanganYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298145, "field 'rbHubunganKeuanganYa'", RadioButton.class);
        oR3DataTransaksiBFragment.rbHubunganKeuanganTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298144, "field 'rbHubunganKeuanganTidak'", RadioButton.class);
        oR3DataTransaksiBFragment.tvInfoHubunganKeuangan = (TextView) Utils.findRequiredViewAsType(view, 2131299286, "field 'tvInfoHubunganKeuangan'", TextView.class);
        oR3DataTransaksiBFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR3DataTransaksiBFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR3DataTransaksiBFragment.lanjut(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131299287, "method 'showInfoHubunganKeuanganOR'");
        this.i = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR3DataTransaksiBFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR3DataTransaksiBFragment.showInfoHubunganKeuanganOR(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131297390, "method 'showInfoHubunganKeuanganOR'");
        this.f = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR3DataTransaksiBFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR3DataTransaksiBFragment.showInfoHubunganKeuanganOR(view2);
            }
        });
        oR3DataTransaksiBFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299032, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299228, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299199, "field 'tvErrors'", TextView.class));
        oR3DataTransaksiBFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298555, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298757, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298731, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298504, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        oR3DataTransaksiBFragment.etForms = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297009, "field 'etForms'"), Utils.findRequiredView(view, 2131297226, "field 'etForms'"), Utils.findRequiredView(view, 2131297199, "field 'etForms'"), Utils.findRequiredView(view, 2131296954, "field 'etForms'"));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OR3DataTransaksiBFragment oR3DataTransaksiBFragment = this.a;
        if (oR3DataTransaksiBFragment != null) {
            this.a = null;
            oR3DataTransaksiBFragment.etKategori = null;
            oR3DataTransaksiBFragment.etTujuan = null;
            oR3DataTransaksiBFragment.etSumberDana = null;
            oR3DataTransaksiBFragment.etBerita = null;
            oR3DataTransaksiBFragment.tilKategori = null;
            oR3DataTransaksiBFragment.tilTujuan = null;
            oR3DataTransaksiBFragment.tilSumberDana = null;
            oR3DataTransaksiBFragment.tilBerita = null;
            oR3DataTransaksiBFragment.rgHubunganKeuangan = null;
            oR3DataTransaksiBFragment.rbHubunganKeuanganYa = null;
            oR3DataTransaksiBFragment.rbHubunganKeuanganTidak = null;
            oR3DataTransaksiBFragment.tvInfoHubunganKeuangan = null;
            oR3DataTransaksiBFragment.svMain = null;
            oR3DataTransaksiBFragment.tvErrors = null;
            oR3DataTransaksiBFragment.tilForms = null;
            oR3DataTransaksiBFragment.etForms = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.f.setOnClickListener(null);
            this.f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
