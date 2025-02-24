package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/StatusKewarganegaraanDialog_ViewBinding.class */
public class StatusKewarganegaraanDialog_ViewBinding implements Unbinder {
    private View a;
    private StatusKewarganegaraanDialog b;
    private View e;

    public StatusKewarganegaraanDialog_ViewBinding(final StatusKewarganegaraanDialog statusKewarganegaraanDialog, View view) {
        this.b = statusKewarganegaraanDialog;
        statusKewarganegaraanDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        statusKewarganegaraanDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.StatusKewarganegaraanDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                statusKewarganegaraanDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.StatusKewarganegaraanDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                statusKewarganegaraanDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        statusKewarganegaraanDialog.data = resources.getStringArray(2130903089);
        statusKewarganegaraanDialog.title = resources.getString(2131822266);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        StatusKewarganegaraanDialog statusKewarganegaraanDialog = this.b;
        if (statusKewarganegaraanDialog != null) {
            this.b = null;
            statusKewarganegaraanDialog.tvTitle = null;
            statusKewarganegaraanDialog.rvContent = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
