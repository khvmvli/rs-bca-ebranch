package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/UserBlockedAfterLoginDialog_ViewBinding.class */
public class UserBlockedAfterLoginDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private UserBlockedAfterLoginDialog e;

    public UserBlockedAfterLoginDialog_ViewBinding(final UserBlockedAfterLoginDialog userBlockedAfterLoginDialog, View view) {
        this.e = userBlockedAfterLoginDialog;
        userBlockedAfterLoginDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296380, "method 'clickedBatal'");
        this.c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.UserBlockedAfterLoginDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                userBlockedAfterLoginDialog.clickedBatal(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296378, "method 'clickedLogin'");
        this.b = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.UserBlockedAfterLoginDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                userBlockedAfterLoginDialog.clickedLogin(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.UserBlockedAfterLoginDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                userBlockedAfterLoginDialog.close(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        UserBlockedAfterLoginDialog userBlockedAfterLoginDialog = this.e;
        if (userBlockedAfterLoginDialog != null) {
            this.e = null;
            userBlockedAfterLoginDialog.tvContent = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
