package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/StatusPendudukDialog_ViewBinding.class */
public class StatusPendudukDialog_ViewBinding implements Unbinder {
    private StatusPendudukDialog a;
    private View c;
    private View d;

    public StatusPendudukDialog_ViewBinding(final StatusPendudukDialog statusPendudukDialog, View view) {
        this.a = statusPendudukDialog;
        statusPendudukDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        statusPendudukDialog.rvContent = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298321, "field 'rvContent'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296419, "method 'clickPilih'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.StatusPendudukDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                statusPendudukDialog.clickPilih(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.StatusPendudukDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                statusPendudukDialog.close();
            }
        });
        Resources resources = view.getContext().getResources();
        statusPendudukDialog.data = resources.getStringArray(2130903091);
        statusPendudukDialog.title = resources.getString(2131822268);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        StatusPendudukDialog statusPendudukDialog = this.a;
        if (statusPendudukDialog != null) {
            this.a = null;
            statusPendudukDialog.tvTitle = null;
            statusPendudukDialog.rvContent = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
