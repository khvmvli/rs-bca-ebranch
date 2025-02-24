package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/InfoDialog_ViewBinding.class */
public class InfoDialog_ViewBinding implements Unbinder {
    private View c;
    private InfoDialog e;

    public InfoDialog_ViewBinding(final InfoDialog infoDialog, View view) {
        this.e = infoDialog;
        infoDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.InfoDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                infoDialog.close();
            }
        });
        infoDialog.labelValue = view.getContext().getResources().getString(2131821618);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        InfoDialog infoDialog = this.e;
        if (infoDialog != null) {
            this.e = null;
            infoDialog.tvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
