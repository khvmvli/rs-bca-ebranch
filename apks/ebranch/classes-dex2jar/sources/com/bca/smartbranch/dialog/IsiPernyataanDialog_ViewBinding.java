package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/IsiPernyataanDialog_ViewBinding.class */
public class IsiPernyataanDialog_ViewBinding implements Unbinder {
    private View a;
    private IsiPernyataanDialog d;

    public IsiPernyataanDialog_ViewBinding(final IsiPernyataanDialog isiPernyataanDialog, View view) {
        this.d = isiPernyataanDialog;
        isiPernyataanDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.IsiPernyataanDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                isiPernyataanDialog.close();
            }
        });
        isiPernyataanDialog.labelValue = view.getContext().getResources().getString(2131821627);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        IsiPernyataanDialog isiPernyataanDialog = this.d;
        if (isiPernyataanDialog != null) {
            this.d = null;
            isiPernyataanDialog.tvContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
