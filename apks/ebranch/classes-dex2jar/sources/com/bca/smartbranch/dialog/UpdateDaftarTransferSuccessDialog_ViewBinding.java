package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/UpdateDaftarTransferSuccessDialog_ViewBinding.class */
public class UpdateDaftarTransferSuccessDialog_ViewBinding implements Unbinder {
    private UpdateDaftarTransferSuccessDialog c;
    private View d;

    public UpdateDaftarTransferSuccessDialog_ViewBinding(final UpdateDaftarTransferSuccessDialog updateDaftarTransferSuccessDialog, View view) {
        this.c = updateDaftarTransferSuccessDialog;
        updateDaftarTransferSuccessDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        updateDaftarTransferSuccessDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvDesc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'onClickClose'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.UpdateDaftarTransferSuccessDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                updateDaftarTransferSuccessDialog.onClickClose(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        updateDaftarTransferSuccessDialog.title = resources.getString(2131822509);
        updateDaftarTransferSuccessDialog.desc = resources.getString(2131822334);
        updateDaftarTransferSuccessDialog.yes = resources.getString(2131821409);
        updateDaftarTransferSuccessDialog.no = resources.getString(2131821405);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        UpdateDaftarTransferSuccessDialog updateDaftarTransferSuccessDialog = this.c;
        if (updateDaftarTransferSuccessDialog != null) {
            this.c = null;
            updateDaftarTransferSuccessDialog.tvTitle = null;
            updateDaftarTransferSuccessDialog.tvDesc = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
