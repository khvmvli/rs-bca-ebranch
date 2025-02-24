package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ErrorGetBranchDialog_ViewBinding.class */
public class ErrorGetBranchDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View d;
    private ErrorGetBranchDialog e;

    public ErrorGetBranchDialog_ViewBinding(final ErrorGetBranchDialog errorGetBranchDialog, View view) {
        this.e = errorGetBranchDialog;
        errorGetBranchDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ErrorGetBranchDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                errorGetBranchDialog.close();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296380, "method 'clickedNo'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ErrorGetBranchDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                errorGetBranchDialog.clickedNo();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296458, "method 'clickedYes'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ErrorGetBranchDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                errorGetBranchDialog.clickedYes();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ErrorGetBranchDialog errorGetBranchDialog = this.e;
        if (errorGetBranchDialog != null) {
            this.e = null;
            errorGetBranchDialog.tvDesc = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
