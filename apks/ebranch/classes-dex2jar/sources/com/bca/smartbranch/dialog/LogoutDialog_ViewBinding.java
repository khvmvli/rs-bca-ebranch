package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/LogoutDialog_ViewBinding.class */
public class LogoutDialog_ViewBinding extends BaseKonfirmasiDialog_ViewBinding {
    private View d;
    private LogoutDialog e;

    public LogoutDialog_ViewBinding(final LogoutDialog logoutDialog, View view) {
        super(logoutDialog, view);
        this.e = logoutDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'clickedYes'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.LogoutDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                logoutDialog.clickedYes();
            }
        });
        Resources resources = view.getContext().getResources();
        logoutDialog.title = resources.getString(2131821875);
        logoutDialog.desc = resources.getString(2131821876);
        logoutDialog.yes = resources.getString(2131822356);
        logoutDialog.no = resources.getString(2131822169);
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog_ViewBinding, butterknife.Unbinder
    public void unbind() {
        if (this.e != null) {
            this.e = null;
            this.d.setOnClickListener(null);
            this.d = null;
            unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
