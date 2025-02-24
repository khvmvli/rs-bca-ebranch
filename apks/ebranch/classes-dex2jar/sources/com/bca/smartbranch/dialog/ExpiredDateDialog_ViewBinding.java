package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ExpiredDateDialog_ViewBinding.class */
public class ExpiredDateDialog_ViewBinding implements Unbinder {
    private View a;
    private ExpiredDateDialog c;
    private View e;

    public ExpiredDateDialog_ViewBinding(final ExpiredDateDialog expiredDateDialog, View view) {
        this.c = expiredDateDialog;
        expiredDateDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        expiredDateDialog.rvTahun = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298335, "field 'rvTahun'", setOnStartEnterTransitionListener.class);
        expiredDateDialog.rvBulan = (setOnStartEnterTransitionListener) Utils.findRequiredViewAsType(view, 2131298319, "field 'rvBulan'", setOnStartEnterTransitionListener.class);
        View findRequiredView = Utils.findRequiredView(view, 2131299503, "method 'onClickBtnOk'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ExpiredDateDialog_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                expiredDateDialog.onClickBtnOk();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131298874, "method 'onClickBtnCancel'");
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ExpiredDateDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                expiredDateDialog.onClickBtnCancel();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ExpiredDateDialog expiredDateDialog = this.c;
        if (expiredDateDialog != null) {
            this.c = null;
            expiredDateDialog.tvTitle = null;
            expiredDateDialog.rvTahun = null;
            expiredDateDialog.rvBulan = null;
            this.e.setOnClickListener(null);
            this.e = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
