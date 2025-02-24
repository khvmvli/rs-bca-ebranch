package com.bca.smartbranch.dialog;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ExitReservasiDialog_ViewBinding.class */
public class ExitReservasiDialog_ViewBinding extends BaseKonfirmasiDialog_ViewBinding {
    private View b;
    private ExitReservasiDialog d;

    public ExitReservasiDialog_ViewBinding(final ExitReservasiDialog exitReservasiDialog, View view) {
        super(exitReservasiDialog, view);
        this.d = exitReservasiDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'onClickYes'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ExitReservasiDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                exitReservasiDialog.onClickYes(view2);
            }
        });
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog_ViewBinding, butterknife.Unbinder
    public void unbind() {
        if (this.d != null) {
            this.d = null;
            this.b.setOnClickListener(null);
            this.b = null;
            unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
