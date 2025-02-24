package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DeleteAccountConfirmationActivity_ViewBinding.class */
public class DeleteAccountConfirmationActivity_ViewBinding implements Unbinder {
    private DeleteAccountConfirmationActivity c;
    private View e;

    public DeleteAccountConfirmationActivity_ViewBinding(final DeleteAccountConfirmationActivity deleteAccountConfirmationActivity, View view) {
        this.c = deleteAccountConfirmationActivity;
        deleteAccountConfirmationActivity.lnMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'lnMain'", LinearLayout.class);
        deleteAccountConfirmationActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        deleteAccountConfirmationActivity.toolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'toolbarTitle'", TextView.class);
        deleteAccountConfirmationActivity.tilKonfirmasi = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298579, "field 'tilKonfirmasi'", LogoutDialog_ViewBinding.class);
        deleteAccountConfirmationActivity.etKonfirmasi = (EditText) Utils.findRequiredViewAsType(view, 2131297032, "field 'etKonfirmasi'", EditText.class);
        deleteAccountConfirmationActivity.tvErrorKonfirmasi = (TextView) Utils.findRequiredViewAsType(view, 2131299055, "field 'tvErrorKonfirmasi'", TextView.class);
        deleteAccountConfirmationActivity.tvContent = (TextView) Utils.findRequiredViewAsType(view, 2131298883, "field 'tvContent'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296452, "method 'onSubmit'");
        this.e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DeleteAccountConfirmationActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                deleteAccountConfirmationActivity.onSubmit(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        deleteAccountConfirmationActivity.stringTitle = resources.getString(2131822038);
        deleteAccountConfirmationActivity.stringContent = resources.getString(2131822438);
        deleteAccountConfirmationActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DeleteAccountConfirmationActivity deleteAccountConfirmationActivity = this.c;
        if (deleteAccountConfirmationActivity != null) {
            this.c = null;
            deleteAccountConfirmationActivity.lnMain = null;
            deleteAccountConfirmationActivity.toolbar = null;
            deleteAccountConfirmationActivity.toolbarTitle = null;
            deleteAccountConfirmationActivity.tilKonfirmasi = null;
            deleteAccountConfirmationActivity.etKonfirmasi = null;
            deleteAccountConfirmationActivity.tvErrorKonfirmasi = null;
            deleteAccountConfirmationActivity.tvContent = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
