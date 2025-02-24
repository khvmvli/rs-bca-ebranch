package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/BaseInfoDialog_ViewBinding.class */
public class BaseInfoDialog_ViewBinding implements Unbinder {
    private View a;
    private BaseInfoDialog c;

    public BaseInfoDialog_ViewBinding(final BaseInfoDialog baseInfoDialog, View view) {
        this.c = baseInfoDialog;
        baseInfoDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        baseInfoDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        baseInfoDialog.llContent = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297569, "field 'llContent'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.BaseInfoDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                baseInfoDialog.close();
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        BaseInfoDialog baseInfoDialog = this.c;
        if (baseInfoDialog != null) {
            this.c = null;
            baseInfoDialog.tvTitle = null;
            baseInfoDialog.tvDesc = null;
            baseInfoDialog.llContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
