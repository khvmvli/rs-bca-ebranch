package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/DeleteAccountSuccessDialog_ViewBinding.class */
public class DeleteAccountSuccessDialog_ViewBinding implements Unbinder {
    private DeleteAccountSuccessDialog a;
    private View d;

    public DeleteAccountSuccessDialog_ViewBinding(final DeleteAccountSuccessDialog deleteAccountSuccessDialog, View view) {
        this.a = deleteAccountSuccessDialog;
        deleteAccountSuccessDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        deleteAccountSuccessDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.DeleteAccountSuccessDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                deleteAccountSuccessDialog.close(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        deleteAccountSuccessDialog.title = resources.getString(2131822506);
        deleteAccountSuccessDialog.content = resources.getString(2131822433);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DeleteAccountSuccessDialog deleteAccountSuccessDialog = this.a;
        if (deleteAccountSuccessDialog != null) {
            this.a = null;
            deleteAccountSuccessDialog.tvTitle = null;
            deleteAccountSuccessDialog.tvContent = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
