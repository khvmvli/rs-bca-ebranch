package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ResetAccountSuccessDialog_ViewBinding.class */
public class ResetAccountSuccessDialog_ViewBinding implements Unbinder {
    private View d;
    private ResetAccountSuccessDialog e;

    public ResetAccountSuccessDialog_ViewBinding(final ResetAccountSuccessDialog resetAccountSuccessDialog, View view) {
        this.e = resetAccountSuccessDialog;
        resetAccountSuccessDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        resetAccountSuccessDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296439, "method 'profile'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ResetAccountSuccessDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                resetAccountSuccessDialog.profile(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        resetAccountSuccessDialog.title = resources.getString(2131822508);
        resetAccountSuccessDialog.content = resources.getString(2131822435);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ResetAccountSuccessDialog resetAccountSuccessDialog = this.e;
        if (resetAccountSuccessDialog != null) {
            this.e = null;
            resetAccountSuccessDialog.tvTitle = null;
            resetAccountSuccessDialog.tvContent = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
