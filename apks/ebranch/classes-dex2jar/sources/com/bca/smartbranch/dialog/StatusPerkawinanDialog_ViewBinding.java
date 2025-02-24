package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/StatusPerkawinanDialog_ViewBinding.class */
public class StatusPerkawinanDialog_ViewBinding implements Unbinder {
    private View b;
    private View c;
    private StatusPerkawinanDialog d;

    public StatusPerkawinanDialog_ViewBinding(final StatusPerkawinanDialog statusPerkawinanDialog, View view) {
        this.d = statusPerkawinanDialog;
        statusPerkawinanDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        statusPerkawinanDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.StatusPerkawinanDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                statusPerkawinanDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.StatusPerkawinanDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                statusPerkawinanDialog.close();
            }
        });
        statusPerkawinanDialog.title = view.getContext().getResources().getString(2131822269);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        StatusPerkawinanDialog statusPerkawinanDialog = this.d;
        if (statusPerkawinanDialog != null) {
            this.d = null;
            statusPerkawinanDialog.tvTitle = null;
            statusPerkawinanDialog.rvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
