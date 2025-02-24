package com.bca.smartbranch.dialog;

import android.view.View;
import android.webkit.WebView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/TermConditionKartuKreditDialog_ViewBinding.class */
public class TermConditionKartuKreditDialog_ViewBinding implements Unbinder {
    private View b;
    private TermConditionKartuKreditDialog c;

    public TermConditionKartuKreditDialog_ViewBinding(final TermConditionKartuKreditDialog termConditionKartuKreditDialog, View view) {
        this.c = termConditionKartuKreditDialog;
        termConditionKartuKreditDialog.wvContent = (WebView) Utils.findRequiredViewAsType(view, 2131299811, "field 'wvContent'", WebView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.TermConditionKartuKreditDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                termConditionKartuKreditDialog.close(view2);
            }
        });
        termConditionKartuKreditDialog.termConditionTitle = view.getContext().getResources().getString(2131821633);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        TermConditionKartuKreditDialog termConditionKartuKreditDialog = this.c;
        if (termConditionKartuKreditDialog != null) {
            this.c = null;
            termConditionKartuKreditDialog.wvContent = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
