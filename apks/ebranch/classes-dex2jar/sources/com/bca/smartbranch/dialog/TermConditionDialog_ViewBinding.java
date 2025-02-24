package com.bca.smartbranch.dialog;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TermConditionDialog_ViewBinding.class */
public class TermConditionDialog_ViewBinding implements Unbinder {
    private TermConditionDialog c;
    private View d;

    public TermConditionDialog_ViewBinding(final TermConditionDialog termConditionDialog, View view) {
        this.c = termConditionDialog;
        termConditionDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        termConditionDialog.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        termConditionDialog.pb = (ProgressBar) Utils.findRequiredViewAsType(view, 2131298110, "field 'pb'", ProgressBar.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TermConditionDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                termConditionDialog.close(view2);
            }
        });
        termConditionDialog.termConditionTitle = view.getContext().getResources().getString(2131821633);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TermConditionDialog termConditionDialog = this.c;
        if (termConditionDialog != null) {
            this.c = null;
            termConditionDialog.tvTitle = null;
            termConditionDialog.wvContent = null;
            termConditionDialog.pb = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
