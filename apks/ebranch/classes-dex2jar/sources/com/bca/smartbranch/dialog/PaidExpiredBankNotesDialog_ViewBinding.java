package com.bca.smartbranch.dialog;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/PaidExpiredBankNotesDialog_ViewBinding.class */
public class PaidExpiredBankNotesDialog_ViewBinding implements Unbinder {
    private View b;
    private PaidExpiredBankNotesDialog c;

    public PaidExpiredBankNotesDialog_ViewBinding(final PaidExpiredBankNotesDialog paidExpiredBankNotesDialog, View view) {
        this.c = paidExpiredBankNotesDialog;
        paidExpiredBankNotesDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        paidExpiredBankNotesDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.PaidExpiredBankNotesDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                paidExpiredBankNotesDialog.close(view2);
            }
        });
        paidExpiredBankNotesDialog.messageTitle = view.getContext().getResources().getString(2131821616);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PaidExpiredBankNotesDialog paidExpiredBankNotesDialog = this.c;
        if (paidExpiredBankNotesDialog != null) {
            this.c = null;
            paidExpiredBankNotesDialog.tvTitle = null;
            paidExpiredBankNotesDialog.tvContent = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
