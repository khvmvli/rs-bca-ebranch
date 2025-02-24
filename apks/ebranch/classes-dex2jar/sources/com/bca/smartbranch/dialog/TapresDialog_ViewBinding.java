package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TapresDialog_ViewBinding.class */
public class TapresDialog_ViewBinding implements Unbinder {
    private View a;
    private TapresDialog b;
    private View c;
    private View e;

    public TapresDialog_ViewBinding(final TapresDialog tapresDialog, View view) {
        this.b = tapresDialog;
        tapresDialog.tvInfo = (TextView) Utils.findRequiredViewAsType(view, 2131299282, "field 'tvInfo'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TapresDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tapresDialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296392, "method 'infoProduct'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TapresDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tapresDialog.infoProduct(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296386, "method 'fillForm'");
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TapresDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                tapresDialog.fillForm(view2);
            }
        });
        tapresDialog.txtInfo = view.getContext().getResources().getString(2131822162);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TapresDialog tapresDialog = this.b;
        if (tapresDialog != null) {
            this.b = null;
            tapresDialog.tvInfo = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
