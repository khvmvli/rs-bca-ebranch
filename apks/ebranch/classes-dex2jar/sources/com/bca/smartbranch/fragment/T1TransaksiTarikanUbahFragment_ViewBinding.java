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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/T1TransaksiTarikanUbahFragment_ViewBinding.class */
public class T1TransaksiTarikanUbahFragment_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private T1TransaksiTarikanUbahFragment c;
    private View d;
    private View e;

    public T1TransaksiTarikanUbahFragment_ViewBinding(final T1TransaksiTarikanUbahFragment t1TransaksiTarikanUbahFragment, View view) {
        this.c = t1TransaksiTarikanUbahFragment;
        View findRequiredView = Utils.findRequiredView(view, 2131297107, "field 'etNorek', method 'pilihNoRek', and method 'onChange'");
        t1TransaksiTarikanUbahFragment.etNorek = (EditText) Utils.castView(findRequiredView, 2131297107, "field 'etNorek'", EditText.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.T1TransaksiTarikanUbahFragment_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                t1TransaksiTarikanUbahFragment.pilihNoRek();
            }
        });
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.T1TransaksiTarikanUbahFragment_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                t1TransaksiTarikanUbahFragment.onChange(view2, z);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297006, "field 'etJumlah' and method 'onChange'");
        t1TransaksiTarikanUbahFragment.etJumlah = (EditText) Utils.castView(findRequiredView2, 2131297006, "field 'etJumlah'", EditText.class);
        this.e = findRequiredView2;
        findRequiredView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.T1TransaksiTarikanUbahFragment_ViewBinding.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                t1TransaksiTarikanUbahFragment.onChange(view2, z);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296976, "field 'etEmail' and method 'onChange'");
        t1TransaksiTarikanUbahFragment.etEmail = (EditText) Utils.castView(findRequiredView3, 2131296976, "field 'etEmail'", EditText.class);
        this.a = findRequiredView3;
        findRequiredView3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.fragment.T1TransaksiTarikanUbahFragment_ViewBinding.1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                t1TransaksiTarikanUbahFragment.onChange(view2, z);
            }
        });
        t1TransaksiTarikanUbahFragment.tilNorek = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298653, "field 'tilNorek'", LogoutDialog_ViewBinding.class);
        t1TransaksiTarikanUbahFragment.tilJumlah = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298554, "field 'tilJumlah'", LogoutDialog_ViewBinding.class);
        t1TransaksiTarikanUbahFragment.tilEmail = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298527, "field 'tilEmail'", LogoutDialog_ViewBinding.class);
        t1TransaksiTarikanUbahFragment.svMain = (ScrollView) Utils.findRequiredViewAsType(view, 2131298420, "field 'svMain'", ScrollView.class);
        t1TransaksiTarikanUbahFragment.llJumlah = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297706, "field 'llJumlah'", LinearLayout.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.d = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.fragment.T1TransaksiTarikanUbahFragment_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                t1TransaksiTarikanUbahFragment.lanjut();
            }
        });
        t1TransaksiTarikanUbahFragment.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299126, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299030, "field 'tvErrors'", TextView.class), (TextView) Utils.findRequiredViewAsType(view, 2131299006, "field 'tvErrors'", TextView.class));
        t1TransaksiTarikanUbahFragment.tilForms = Utils.listFilteringNull(Utils.findRequiredView(view, 2131298653, "field 'tilForms'"), Utils.findRequiredView(view, 2131297706, "field 'tilForms'"), Utils.findRequiredView(view, 2131298527, "field 'tilForms'"));
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        T1TransaksiTarikanUbahFragment t1TransaksiTarikanUbahFragment = this.c;
        if (t1TransaksiTarikanUbahFragment != null) {
            this.c = null;
            t1TransaksiTarikanUbahFragment.etNorek = null;
            t1TransaksiTarikanUbahFragment.etJumlah = null;
            t1TransaksiTarikanUbahFragment.etEmail = null;
            t1TransaksiTarikanUbahFragment.tilNorek = null;
            t1TransaksiTarikanUbahFragment.tilJumlah = null;
            t1TransaksiTarikanUbahFragment.tilEmail = null;
            t1TransaksiTarikanUbahFragment.svMain = null;
            t1TransaksiTarikanUbahFragment.llJumlah = null;
            t1TransaksiTarikanUbahFragment.tvErrors = null;
            t1TransaksiTarikanUbahFragment.tilForms = null;
            this.b.setOnClickListener(null);
            this.b.setOnFocusChangeListener(null);
            this.b = null;
            this.e.setOnFocusChangeListener(null);
            this.e = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
