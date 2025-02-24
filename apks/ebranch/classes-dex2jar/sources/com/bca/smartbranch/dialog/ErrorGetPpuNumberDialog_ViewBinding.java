package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ErrorGetPpuNumberDialog_ViewBinding.class */
public class ErrorGetPpuNumberDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private ErrorGetPpuNumberDialog c;
    private View d;

    public ErrorGetPpuNumberDialog_ViewBinding(final ErrorGetPpuNumberDialog errorGetPpuNumberDialog, View view) {
        this.c = errorGetPpuNumberDialog;
        errorGetPpuNumberDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ErrorGetPpuNumberDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                errorGetPpuNumberDialog.close();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296380, "method 'clickedNo'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ErrorGetPpuNumberDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                errorGetPpuNumberDialog.clickedNo();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296458, "method 'clickedYes'");
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ErrorGetPpuNumberDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                errorGetPpuNumberDialog.clickedYes();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ErrorGetPpuNumberDialog errorGetPpuNumberDialog = this.c;
        if (errorGetPpuNumberDialog != null) {
            this.c = null;
            errorGetPpuNumberDialog.tvDesc = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
