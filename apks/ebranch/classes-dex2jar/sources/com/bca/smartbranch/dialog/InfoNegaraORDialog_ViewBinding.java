package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/InfoNegaraORDialog_ViewBinding.class */
public class InfoNegaraORDialog_ViewBinding implements Unbinder {
    private View a;
    private InfoNegaraORDialog c;

    public InfoNegaraORDialog_ViewBinding(final InfoNegaraORDialog infoNegaraORDialog, View view) {
        this.c = infoNegaraORDialog;
        infoNegaraORDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        infoNegaraORDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        infoNegaraORDialog.llContent = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297569, "field 'llContent'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.InfoNegaraORDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                infoNegaraORDialog.close();
            }
        });
        infoNegaraORDialog.labelValue = view.getContext().getResources().getString(2131821623);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoNegaraORDialog infoNegaraORDialog = this.c;
        if (infoNegaraORDialog != null) {
            this.c = null;
            infoNegaraORDialog.tvTitle = null;
            infoNegaraORDialog.tvDesc = null;
            infoNegaraORDialog.llContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
