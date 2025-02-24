package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ResetAccountActivity_ViewBinding.class */
public class ResetAccountActivity_ViewBinding implements Unbinder {
    private View a;
    private View c;
    private ResetAccountActivity d;

    public ResetAccountActivity_ViewBinding(final ResetAccountActivity resetAccountActivity, View view) {
        this.d = resetAccountActivity;
        resetAccountActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        resetAccountActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        resetAccountActivity.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        resetAccountActivity.tilConfirm = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298521, "field 'tilConfirm'", LogoutDialog_ViewBinding.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296970, "field 'etConfirm' and method 'inputChange'");
        resetAccountActivity.etConfirm = (EditText) Utils.castView(findRequiredView, 2131296970, "field 'etConfirm'", EditText.class);
        this.c = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.ResetAccountActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                resetAccountActivity.inputChange(view2, z);
            }
        });
        resetAccountActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296445, "method 'resetAccount'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.ResetAccountActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                resetAccountActivity.resetAccount();
            }
        });
        resetAccountActivity.etFields = Utils.listFilteringNull(Utils.findRequiredView(view, 2131296970, "field 'etFields'"));
        resetAccountActivity.tilForms = Utils.listFilteringNull((LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298521, "field 'tilForms'", LogoutDialog_ViewBinding.class));
        resetAccountActivity.tvErrors = Utils.listFilteringNull((TextView) Utils.findRequiredViewAsType(view, 2131299000, "field 'tvErrors'", TextView.class));
        Resources resources = view.getContext().getResources();
        resetAccountActivity.toolbarTitle = resources.getString(2131822039);
        resetAccountActivity.descResetAccount = resources.getString(2131821609);
        resetAccountActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ResetAccountActivity resetAccountActivity = this.d;
        if (resetAccountActivity != null) {
            this.d = null;
            resetAccountActivity.toolbar = null;
            resetAccountActivity.txtToolbarTitle = null;
            resetAccountActivity.tvDesc = null;
            resetAccountActivity.tilConfirm = null;
            resetAccountActivity.etConfirm = null;
            resetAccountActivity.llMain = null;
            resetAccountActivity.etFields = null;
            resetAccountActivity.tilForms = null;
            resetAccountActivity.tvErrors = null;
            this.c.setOnFocusChangeListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
