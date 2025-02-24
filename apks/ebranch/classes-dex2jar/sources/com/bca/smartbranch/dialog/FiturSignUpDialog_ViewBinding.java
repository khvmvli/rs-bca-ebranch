package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/FiturSignUpDialog_ViewBinding.class */
public class FiturSignUpDialog_ViewBinding extends BaseKonfirmasiDialog_ViewBinding {
    private FiturSignUpDialog c;
    private View d;

    public FiturSignUpDialog_ViewBinding(final FiturSignUpDialog fiturSignUpDialog, View view) {
        super(fiturSignUpDialog, view);
        this.c = fiturSignUpDialog;
        View findRequiredView = Utils.findRequiredView(view, 2131296462, "method 'clickedYes'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.FiturSignUpDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fiturSignUpDialog.clickedYes();
            }
        });
        Resources resources = view.getContext().getResources();
        fiturSignUpDialog.title = resources.getString(2131822326);
        fiturSignUpDialog.desc = resources.getString(2131822327);
        fiturSignUpDialog.yes = resources.getString(2131822357);
        fiturSignUpDialog.no = resources.getString(2131822172);
    }

    @Override // com.bca.smartbranch.dialog.BaseKonfirmasiDialog_ViewBinding, butterknife.Unbinder
    public void unbind() {
        if (this.c != null) {
            this.c = null;
            this.d.setOnClickListener(null);
            this.d = null;
            unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
