package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/AutoLogoutDialog_ViewBinding.class */
public class AutoLogoutDialog_ViewBinding implements Unbinder {
    private View a;
    private AutoLogoutDialog b;

    public AutoLogoutDialog_ViewBinding(final AutoLogoutDialog autoLogoutDialog, View view) {
        this.b = autoLogoutDialog;
        autoLogoutDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.AutoLogoutDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                autoLogoutDialog.close(view2);
            }
        });
        autoLogoutDialog.labelMessageSessionExpired = view.getContext().getResources().getString(2131821912);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        AutoLogoutDialog autoLogoutDialog = this.b;
        if (autoLogoutDialog != null) {
            this.b = null;
            autoLogoutDialog.tvContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
