package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/EditTransaksiBerkalaActivity_ViewBinding.class */
public class EditTransaksiBerkalaActivity_ViewBinding implements Unbinder {
    private EditTransaksiBerkalaActivity a;
    private View e;

    public EditTransaksiBerkalaActivity_ViewBinding(final EditTransaksiBerkalaActivity editTransaksiBerkalaActivity, View view) {
        this.a = editTransaksiBerkalaActivity;
        editTransaksiBerkalaActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        editTransaksiBerkalaActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        editTransaksiBerkalaActivity.etNamaPemilik = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297065, "field 'etNamaPemilik'", LogoutDialog.class);
        editTransaksiBerkalaActivity.etNominal = (LogoutDialog) Utils.findRequiredViewAsType(view, 2131297119, "field 'etNominal'", LogoutDialog.class);
        editTransaksiBerkalaActivity.lnMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'lnMain'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296389, "method 'hapus'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.EditTransaksiBerkalaActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                editTransaksiBerkalaActivity.hapus();
            }
        });
        Resources resources = view.getContext().getResources();
        editTransaksiBerkalaActivity.toolbarTitle = resources.getString(2131822208);
        editTransaksiBerkalaActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        EditTransaksiBerkalaActivity editTransaksiBerkalaActivity = this.a;
        if (editTransaksiBerkalaActivity != null) {
            this.a = null;
            editTransaksiBerkalaActivity.toolbar = null;
            editTransaksiBerkalaActivity.txtToolbarTitle = null;
            editTransaksiBerkalaActivity.etNamaPemilik = null;
            editTransaksiBerkalaActivity.etNominal = null;
            editTransaksiBerkalaActivity.lnMain = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
