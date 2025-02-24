package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/MessageDialog_ViewBinding.class */
public class MessageDialog_ViewBinding implements Unbinder {
    private MessageDialog d;
    private View e;

    public MessageDialog_ViewBinding(final MessageDialog messageDialog, View view) {
        this.d = messageDialog;
        messageDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        messageDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.MessageDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                messageDialog.close(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        MessageDialog messageDialog = this.d;
        if (messageDialog != null) {
            this.d = null;
            messageDialog.tvTitle = null;
            messageDialog.tvContent = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
