package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/MasaBerlakuKTPDialog_ViewBinding.class */
public class MasaBerlakuKTPDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private MasaBerlakuKTPDialog c;
    private View d;
    private View e;
    private View g;
    private View i;
    private View j;

    public MasaBerlakuKTPDialog_ViewBinding(final MasaBerlakuKTPDialog masaBerlakuKTPDialog, View view) {
        this.c = masaBerlakuKTPDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131298139, "field 'rbEktp' and method 'chooseTypeKtp'");
        masaBerlakuKTPDialog.rbEktp = (RadioButton) Utils.castView(findRequiredView, 2131298139, "field 'rbEktp'", RadioButton.class);
        this.i = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.MasaBerlakuKTPDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                masaBerlakuKTPDialog.chooseTypeKtp(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131298161, "field 'rbKtp' and method 'chooseTypeKtp'");
        masaBerlakuKTPDialog.rbKtp = (RadioButton) Utils.castView(findRequiredView2, 2131298161, "field 'rbKtp'", RadioButton.class);
        this.g = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.MasaBerlakuKTPDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                masaBerlakuKTPDialog.chooseTypeKtp(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131297044, "field 'etMasaBerlaku' and method 'showDatePicker'");
        masaBerlakuKTPDialog.etMasaBerlaku = (EditText) Utils.castView(findRequiredView3, 2131297044, "field 'etMasaBerlaku'", EditText.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.MasaBerlakuKTPDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                masaBerlakuKTPDialog.showDatePicker(view2);
            }
        });
        masaBerlakuKTPDialog.tilMasaBerlaku = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298591, "field 'tilMasaBerlaku'", LogoutDialog_ViewBinding.class);
        masaBerlakuKTPDialog.tvErrorMasaBerlaku = (TextView) Utils.findRequiredViewAsType(view, 2131299067, "field 'tvErrorMasaBerlaku'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, 2131296419, "method 'clickedPilih'");
        this.b = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.MasaBerlakuKTPDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                masaBerlakuKTPDialog.clickedPilih();
            }
        });
        View findRequiredView5 = Utils.findRequiredView(view, 2131297631, "method 'chooseTypeKtp'");
        this.e = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.MasaBerlakuKTPDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                masaBerlakuKTPDialog.chooseTypeKtp(view2);
            }
        });
        View findRequiredView6 = Utils.findRequiredView(view, 2131297753, "method 'chooseTypeKtp'");
        this.j = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.MasaBerlakuKTPDialog_ViewBinding.6
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                masaBerlakuKTPDialog.chooseTypeKtp(view2);
            }
        });
        View findRequiredView7 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.MasaBerlakuKTPDialog_ViewBinding.8
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                masaBerlakuKTPDialog.close();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        MasaBerlakuKTPDialog masaBerlakuKTPDialog = this.c;
        if (masaBerlakuKTPDialog != null) {
            this.c = null;
            masaBerlakuKTPDialog.rbEktp = null;
            masaBerlakuKTPDialog.rbKtp = null;
            masaBerlakuKTPDialog.etMasaBerlaku = null;
            masaBerlakuKTPDialog.tilMasaBerlaku = null;
            masaBerlakuKTPDialog.tvErrorMasaBerlaku = null;
            this.i.setOnClickListener(null);
            this.i = null;
            this.g.setOnClickListener(null);
            this.g = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
