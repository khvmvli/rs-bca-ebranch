package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/UserBlockedDialog_ViewBinding.class */
public class UserBlockedDialog_ViewBinding implements Unbinder {
    private View a;
    private View c;
    private UserBlockedDialog d;
    private View e;

    public UserBlockedDialog_ViewBinding(final UserBlockedDialog userBlockedDialog, View view) {
        this.d = userBlockedDialog;
        userBlockedDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296380, "method 'clickedBatal'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.UserBlockedDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                userBlockedDialog.clickedBatal(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296378, "method 'clickedLogin'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.UserBlockedDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                userBlockedDialog.clickedLogin(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.c = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.UserBlockedDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                userBlockedDialog.close(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        UserBlockedDialog userBlockedDialog = this.d;
        if (userBlockedDialog != null) {
            this.d = null;
            userBlockedDialog.tvContent = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
