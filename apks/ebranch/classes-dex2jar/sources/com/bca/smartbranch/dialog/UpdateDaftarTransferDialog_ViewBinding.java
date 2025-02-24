package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/UpdateDaftarTransferDialog_ViewBinding.class */
public class UpdateDaftarTransferDialog_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private UpdateDaftarTransferDialog d;
    private View e;

    public UpdateDaftarTransferDialog_ViewBinding(final UpdateDaftarTransferDialog updateDaftarTransferDialog, View view) {
        this.d = updateDaftarTransferDialog;
        updateDaftarTransferDialog.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131299615, "field 'tvTitle'", TextView.class);
        updateDaftarTransferDialog.tvDesc = (TextView) Utils.findRequiredViewAsType(view, 2131298918, "field 'tvDesc'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296416, "field 'btnNo' and method 'onClickNo'");
        updateDaftarTransferDialog.btnNo = (Button) Utils.castView(findRequiredView, 2131296416, "field 'btnNo'", Button.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.UpdateDaftarTransferDialog_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                updateDaftarTransferDialog.onClickNo(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296462, "field 'btnYes' and method 'onClickYes'");
        updateDaftarTransferDialog.btnYes = (Button) Utils.castView(findRequiredView2, 2131296462, "field 'btnYes'", Button.class);
        this.a = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.UpdateDaftarTransferDialog_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                updateDaftarTransferDialog.onClickYes(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296385, "method 'onClickNo'");
        this.e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.dialog.UpdateDaftarTransferDialog_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                updateDaftarTransferDialog.onClickNo(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        updateDaftarTransferDialog.title = resources.getString(2131821716);
        updateDaftarTransferDialog.desc = resources.getString(2131822333);
        updateDaftarTransferDialog.yes = resources.getString(2131821409);
        updateDaftarTransferDialog.no = resources.getString(2131821405);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        UpdateDaftarTransferDialog updateDaftarTransferDialog = this.d;
        if (updateDaftarTransferDialog != null) {
            this.d = null;
            updateDaftarTransferDialog.tvTitle = null;
            updateDaftarTransferDialog.tvDesc = null;
            updateDaftarTransferDialog.btnNo = null;
            updateDaftarTransferDialog.btnYes = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
