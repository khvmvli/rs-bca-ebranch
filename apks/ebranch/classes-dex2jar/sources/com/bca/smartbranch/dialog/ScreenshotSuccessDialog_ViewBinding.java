package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/ScreenshotSuccessDialog_ViewBinding.class */
public class ScreenshotSuccessDialog_ViewBinding implements Unbinder {
    private ScreenshotSuccessDialog c;
    private View e;

    public ScreenshotSuccessDialog_ViewBinding(final ScreenshotSuccessDialog screenshotSuccessDialog, View view) {
        this.c = screenshotSuccessDialog;
        screenshotSuccessDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.ScreenshotSuccessDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                screenshotSuccessDialog.close();
            }
        });
        screenshotSuccessDialog.labelValue = view.getContext().getResources().getString(2131821624);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        ScreenshotSuccessDialog screenshotSuccessDialog = this.c;
        if (screenshotSuccessDialog != null) {
            this.c = null;
            screenshotSuccessDialog.tvContent = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
