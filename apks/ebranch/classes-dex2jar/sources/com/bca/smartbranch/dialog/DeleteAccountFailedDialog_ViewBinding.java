package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/DeleteAccountFailedDialog_ViewBinding.class */
public class DeleteAccountFailedDialog_ViewBinding implements Unbinder {
    private View a;
    private DeleteAccountFailedDialog b;
    private View c;

    public DeleteAccountFailedDialog_ViewBinding(final DeleteAccountFailedDialog deleteAccountFailedDialog, View view) {
        this.b = deleteAccountFailedDialog;
        deleteAccountFailedDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        deleteAccountFailedDialog.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296385, "method 'close'");
        this.a = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.DeleteAccountFailedDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                deleteAccountFailedDialog.close(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296396, "method 'lanjut'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.DeleteAccountFailedDialog_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                deleteAccountFailedDialog.lanjut();
            }
        });
        Resources resources = view.getContext().getResources();
        deleteAccountFailedDialog.title = resources.getString(2131822506);
        deleteAccountFailedDialog.content = resources.getString(2131822432);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DeleteAccountFailedDialog deleteAccountFailedDialog = this.b;
        if (deleteAccountFailedDialog != null) {
            this.b = null;
            deleteAccountFailedDialog.tvTitle = null;
            deleteAccountFailedDialog.tvContent = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.c.setOnClickListener(null);
            this.c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
