package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR2DataTransaksiAFragment_ViewBinding.class */
public class OR2DataTransaksiAFragment_ViewBinding implements Unbinder {
    private View a;
    private OR2DataTransaksiAFragment b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private View j;

    /* renamed from: o  reason: collision with root package name */
    private View f41o;

    public OR2DataTransaksiAFragment_ViewBinding(final OR2DataTransaksiAFragment oR2DataTransaksiAFragment, View view) {
        this.b = oR2DataTransaksiAFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131296998, "field 'etJenisKodeBank' and method 'pilihJenisKodeBank'");
        oR2DataTransaksiAFragment.etJenisKodeBank = (EditText) Utils.castView(findRequiredView, 2131296998, "field 'etJenisKodeBank'", EditText.class);
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2DataTransaksiAFragment_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2DataTransaksiAFragment.pilihJenisKodeBank(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297089, "field 'etNegaraTujuan' and method 'pilihNegaraTujuan'");
        oR2DataTransaksiAFragment.etNegaraTujuan = (EditText) Utils.castView(findRequiredView2, 2131297089, "field 'etNegaraTujuan'", EditText.class);
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2DataTransaksiAFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2DataTransaksiAFragment.pilihNegaraTujuan(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297000, "field 'etJenisMataUang' and method 'pilihJenisMataUang'");
        oR2DataTransaksiAFragment.etJenisMataUang = (EditText) Utils.castView(findRequiredView3, 2131297000, "field 'etJenisMataUang'", EditText.class);
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2DataTransaksiAFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2DataTransaksiAFragment.pilihJenisMataUang(view2);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131297119, "field 'etNominal' and method 'inputChange'");
        oR2DataTransaksiAFragment.etNominal = (LogoutDialog) Utils.castView(findRequiredView4, 2131297119, "field 'etNominal'", LogoutDialog.class);
        this.i = findRequiredView4;
        findRequiredView4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.OR2DataTransaksiAFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                oR2DataTransaksiAFragment.inputChange(view2, z);
            }
        });
        oR2DataTransaksiAFragment.tilJenisKodeBank = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298546, "field 'tilJenisKodeBank'", LogoutDialog_ViewBinding.class);
        oR2DataTransaksiAFragment.tilNegaraTujuan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298635, "field 'tilNegaraTujuan'", LogoutDialog_ViewBinding.class);
        oR2DataTransaksiAFragment.tilJenisMataUang = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298548, "field 'tilJenisMataUang'", LogoutDialog_ViewBinding.class);
        oR2DataTransaksiAFragment.tilNominal = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298665, "field 'tilNominal'", LogoutDialog_ViewBinding.class);
        oR2DataTransaksiAFragment.llNominal = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297830, "field 'llNominal'", LinearLayout.class);
        oR2DataTransaksiAFragment.llInfoKurs = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297690, "field 'llInfoKurs'", LinearLayout.class);
        oR2DataTransaksiAFragment.llCurrency = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297570, "field 'llCurrency'", LinearLayout.class);
        oR2DataTransaksiAFragment.tvJenisMataUang = (TextView) Utils.findRequiredViewAsType(view, 2131299308, "field 'tvJenisMataUang'", TextView.class);
        oR2DataTransaksiAFragment.llFullAmount = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297646, "field 'llFullAmount'", LinearLayout.class);
        oR2DataTransaksiAFragment.rgFullAmount = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298215, "field 'rgFullAmount'", RadioGroup.class);
        oR2DataTransaksiAFragment.rbFullAmountYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298141, "field 'rbFullAmountYa'", RadioButton.class);
        oR2DataTransaksiAFragment.rbFullAmountTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298140, "field 'rbFullAmountTidak'", RadioButton.class);
        oR2DataTransaksiAFragment.llValueToday = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297929, "field 'llValueToday'", LinearLayout.class);
        oR2DataTransaksiAFragment.rgValueToday = (RadioGroup) Utils.findRequiredViewAsType(view, 2131298234, "field 'rgValueToday'", RadioGroup.class);
        oR2DataTransaksiAFragment.rbValueTodayYa = (RadioButton) Utils.findRequiredViewAsType(view, 2131298192, "field 'rbValueTodayYa'", RadioButton.class);
        oR2DataTransaksiAFragment.rbValueTodayTidak = (RadioButton) Utils.findRequiredViewAsType(view, 2131298191, "field 'rbValueTodayTidak'", RadioButton.class);
        oR2DataTransaksiAFragment.tvInfoFullAmount = (TextView) Utils.findRequiredViewAsType(view, 2131299284, "field 'tvInfoFullAmount'", TextView.class);
        oR2DataTransaksiAFragment.tvInfoValueToday = (TextView) Utils.findRequiredViewAsType(view, 2131299292, "field 'tvInfoValueToday'", TextView.class);
        oR2DataTransaksiAFragment.tvErrorNominal = (TextView) Utils.findRequiredViewAsType(view, 2131299137, "field 'tvErrorNominal'", TextView.class);
        oR2DataTransaksiAFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        oR2DataTransaksiAFragment.llFaVt = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297638, "field 'llFaVt'", LinearLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.c = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2DataTransaksiAFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2DataTransaksiAFragment.lanjut(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131299290, "method 'showInfoKursOR'");
        this.h = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2DataTransaksiAFragment_ViewBinding.10
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2DataTransaksiAFragment.showInfoKursOR(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131299285, "method 'showInfoFullAmountOR'");
        this.g = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2DataTransaksiAFragment_ViewBinding.7
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2DataTransaksiAFragment.showInfoFullAmountOR(view2);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, 2131297389, "method 'showInfoFullAmountOR'");
        this.f = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2DataTransaksiAFragment_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2DataTransaksiAFragment.showInfoFullAmountOR(view2);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, 2131299293, "method 'showInfoValueTodayOR'");
        this.f41o = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2DataTransaksiAFragment_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2DataTransaksiAFragment.showInfoValueTodayOR(view2);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, 2131297392, "method 'showInfoValueTodayOR'");
        this.j = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.OR2DataTransaksiAFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                oR2DataTransaksiAFragment.showInfoValueTodayOR(view2);
            }
        });
        oR2DataTransaksiAFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299022, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299110, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299024, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299137, "field 'tvErrors'", TextView.class));
        oR2DataTransaksiAFragment.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298546, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298635, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298548, "field 'tilForms'", LogoutDialog_ViewBinding.class), (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298665, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        oR2DataTransaksiAFragment.etForms = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296998, "field 'etForms'"), Utils.findRequiredView(view, 2131297089, "field 'etForms'"), Utils.findRequiredView(view, 2131297000, "field 'etForms'"), Utils.findRequiredView(view, 2131297119, "field 'etForms'"));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        OR2DataTransaksiAFragment oR2DataTransaksiAFragment = this.b;
        if (oR2DataTransaksiAFragment != null) {
            this.b = null;
            oR2DataTransaksiAFragment.etJenisKodeBank = null;
            oR2DataTransaksiAFragment.etNegaraTujuan = null;
            oR2DataTransaksiAFragment.etJenisMataUang = null;
            oR2DataTransaksiAFragment.etNominal = null;
            oR2DataTransaksiAFragment.tilJenisKodeBank = null;
            oR2DataTransaksiAFragment.tilNegaraTujuan = null;
            oR2DataTransaksiAFragment.tilJenisMataUang = null;
            oR2DataTransaksiAFragment.tilNominal = null;
            oR2DataTransaksiAFragment.llNominal = null;
            oR2DataTransaksiAFragment.llInfoKurs = null;
            oR2DataTransaksiAFragment.llCurrency = null;
            oR2DataTransaksiAFragment.tvJenisMataUang = null;
            oR2DataTransaksiAFragment.llFullAmount = null;
            oR2DataTransaksiAFragment.rgFullAmount = null;
            oR2DataTransaksiAFragment.rbFullAmountYa = null;
            oR2DataTransaksiAFragment.rbFullAmountTidak = null;
            oR2DataTransaksiAFragment.llValueToday = null;
            oR2DataTransaksiAFragment.rgValueToday = null;
            oR2DataTransaksiAFragment.rbValueTodayYa = null;
            oR2DataTransaksiAFragment.rbValueTodayTidak = null;
            oR2DataTransaksiAFragment.tvInfoFullAmount = null;
            oR2DataTransaksiAFragment.tvInfoValueToday = null;
            oR2DataTransaksiAFragment.tvErrorNominal = null;
            oR2DataTransaksiAFragment.svMain = null;
            oR2DataTransaksiAFragment.llFaVt = null;
            oR2DataTransaksiAFragment.tvErrors = null;
            oR2DataTransaksiAFragment.tilForms = null;
            oR2DataTransaksiAFragment.etForms = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.i.setOnFocusChangeListener(null);
            this.i = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.f.setOnClickListener(null);
            this.f = null;
            this.f41o.setOnClickListener(null);
            this.f41o = null;
            this.j.setOnClickListener(null);
            this.j = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
