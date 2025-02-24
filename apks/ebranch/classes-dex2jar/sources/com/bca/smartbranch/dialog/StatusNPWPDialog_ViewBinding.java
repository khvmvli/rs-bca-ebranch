package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/StatusNPWPDialog_ViewBinding.class */
public class StatusNPWPDialog_ViewBinding implements Unbinder {
    private View c;
    private StatusNPWPDialog d;
    private View e;

    public StatusNPWPDialog_ViewBinding(final StatusNPWPDialog statusNPWPDialog, View view) {
        this.d = statusNPWPDialog;
        statusNPWPDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        statusNPWPDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.StatusNPWPDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                statusNPWPDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.StatusNPWPDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                statusNPWPDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        statusNPWPDialog.data = resources.getStringArray(2130903090);
        statusNPWPDialog.title = resources.getString(2131822267);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        StatusNPWPDialog statusNPWPDialog = this.d;
        if (statusNPWPDialog != null) {
            this.d = null;
            statusNPWPDialog.tvTitle = null;
            statusNPWPDialog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
