package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ErrorGetRateBNDialog_ViewBinding.class */
public class ErrorGetRateBNDialog_ViewBinding implements Unbinder {
    private View a;
    private ErrorGetRateBNDialog b;
    private View c;
    private View e;

    public ErrorGetRateBNDialog_ViewBinding(final ErrorGetRateBNDialog errorGetRateBNDialog, View view) {
        this.b = errorGetRateBNDialog;
        errorGetRateBNDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ErrorGetRateBNDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                errorGetRateBNDialog.close();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296380, "method 'clickedNo'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ErrorGetRateBNDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                errorGetRateBNDialog.clickedNo();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296458, "method 'clickedYes'");
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ErrorGetRateBNDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                errorGetRateBNDialog.clickedYes();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ErrorGetRateBNDialog errorGetRateBNDialog = this.b;
        if (errorGetRateBNDialog != null) {
            this.b = null;
            errorGetRateBNDialog.tvDesc = null;
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
