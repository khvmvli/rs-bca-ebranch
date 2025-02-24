package com.bca.smartbranch.dialog;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/DepositoDialog_ViewBinding.class */
public class DepositoDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private DepositoDialog d;
    private View e;

    public DepositoDialog_ViewBinding(final DepositoDialog depositoDialog, View view) {
        this.d = depositoDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.DepositoDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                depositoDialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296392, "method 'infoProduct'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.DepositoDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                depositoDialog.infoProduct(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296386, "method 'fillForm'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.DepositoDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                depositoDialog.fillForm(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        if (this.d != null) {
            this.d = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
