package com.bca.smartbranch.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/T1TransaksiTarikanFragment_ViewBinding.class */
public class T1TransaksiTarikanFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private View d;
    private T1TransaksiTarikanFragment e;
    private View g;

    public T1TransaksiTarikanFragment_ViewBinding(final T1TransaksiTarikanFragment t1TransaksiTarikanFragment, View view) {
        this.e = t1TransaksiTarikanFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297107, "field 'etNorek', method 'pilihNoRek', and method 'onChange'");
        t1TransaksiTarikanFragment.etNorek = (EditText) Utils.castView(findRequiredView, 2131297107, "field 'etNorek'", EditText.class);
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.T1TransaksiTarikanFragment_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                t1TransaksiTarikanFragment.pilihNoRek();
            }
        });
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.T1TransaksiTarikanFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                t1TransaksiTarikanFragment.onChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297006, "field 'etJumlah' and method 'onChange'");
        t1TransaksiTarikanFragment.etJumlah = (EditText) Utils.castView(findRequiredView2, 2131297006, "field 'etJumlah'", EditText.class);
        this.b = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.T1TransaksiTarikanFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                t1TransaksiTarikanFragment.onChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'onChange'");
        t1TransaksiTarikanFragment.etEmail = (EditText) Utils.castView(findRequiredView3, 2131296976, "field 'etEmail'", EditText.class);
        this.c = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.T1TransaksiTarikanFragment_ViewBinding.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                t1TransaksiTarikanFragment.onChange(view2, z);
            }
        });
        t1TransaksiTarikanFragment.tilNorek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilNorek'", LogoutDialog_ViewBinding.class);
        t1TransaksiTarikanFragment.tilJumlah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilJumlah'", LogoutDialog_ViewBinding.class);
        t1TransaksiTarikanFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        t1TransaksiTarikanFragment.llJumlah = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297706, "field 'llJumlah'", LinearLayout.class);
        t1TransaksiTarikanFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.a = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.T1TransaksiTarikanFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                t1TransaksiTarikanFragment.lanjut();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131299283, "method 'onClickInfoBiaya'");
        this.g = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.T1TransaksiTarikanFragment_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                t1TransaksiTarikanFragment.onClickInfoBiaya();
            }
        });
        t1TransaksiTarikanFragment.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131297107, "field 'etFields'"), Utils.findRequiredView(view, 2131297006, "field 'etFields'"), Utils.findRequiredView(view, 2131296976, "field 'etFields'"));
        t1TransaksiTarikanFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299030, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class));
        t1TransaksiTarikanFragment.tilForms = Utils.listFilteringNull(Utils.findRequiredView(view, 2131298653, "field 'tilForms'"), Utils.findRequiredView(view, 2131297706, "field 'tilForms'"), Utils.findRequiredView(view, 2131298527, "field 'tilForms'"));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        T1TransaksiTarikanFragment t1TransaksiTarikanFragment = this.e;
        if (t1TransaksiTarikanFragment != null) {
            this.e = null;
            t1TransaksiTarikanFragment.etNorek = null;
            t1TransaksiTarikanFragment.etJumlah = null;
            t1TransaksiTarikanFragment.etEmail = null;
            t1TransaksiTarikanFragment.tilNorek = null;
            t1TransaksiTarikanFragment.tilJumlah = null;
            t1TransaksiTarikanFragment.tilEmail = null;
            t1TransaksiTarikanFragment.llJumlah = null;
            t1TransaksiTarikanFragment.svMain = null;
            t1TransaksiTarikanFragment.etFields = null;
            t1TransaksiTarikanFragment.tvErrors = null;
            t1TransaksiTarikanFragment.tilForms = null;
            this.d.setOnClickListener(null);
            this.d.setOnFocusChangeListener(null);
            this.d = null;
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.g.setOnClickListener(null);
            this.g = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
