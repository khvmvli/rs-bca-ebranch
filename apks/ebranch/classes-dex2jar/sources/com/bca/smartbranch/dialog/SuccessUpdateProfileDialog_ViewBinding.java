package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/SuccessUpdateProfileDialog_ViewBinding.class */
public class SuccessUpdateProfileDialog_ViewBinding implements Unbinder {
    private SuccessUpdateProfileDialog a;
    private View e;

    public SuccessUpdateProfileDialog_ViewBinding(final SuccessUpdateProfileDialog successUpdateProfileDialog, View view) {
        this.a = successUpdateProfileDialog;
        successUpdateProfileDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        successUpdateProfileDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.SuccessUpdateProfileDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                successUpdateProfileDialog.close(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        SuccessUpdateProfileDialog successUpdateProfileDialog = this.a;
        if (successUpdateProfileDialog != null) {
            this.a = null;
            successUpdateProfileDialog.tvTitle = null;
            successUpdateProfileDialog.tvContent = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
