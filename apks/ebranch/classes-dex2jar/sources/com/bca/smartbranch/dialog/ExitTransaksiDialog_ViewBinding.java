package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ExitTransaksiDialog_ViewBinding.class */
public class ExitTransaksiDialog_ViewBinding implements Unbinder {
    private ExitTransaksiDialog c;
    private View e;

    public ExitTransaksiDialog_ViewBinding(final ExitTransaksiDialog exitTransaksiDialog, View view) {
        this.c = exitTransaksiDialog;
        exitTransaksiDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        exitTransaksiDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'onClickClose'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ExitTransaksiDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                exitTransaksiDialog.onClickClose(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ExitTransaksiDialog exitTransaksiDialog = this.c;
        if (exitTransaksiDialog != null) {
            this.c = null;
            exitTransaksiDialog.tvTitle = null;
            exitTransaksiDialog.tvContent = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
