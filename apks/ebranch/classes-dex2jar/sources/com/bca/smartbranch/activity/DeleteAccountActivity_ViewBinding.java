package com.bca.smartbranch.activity;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.LogoutDialog_ViewBinding;
import o.setCurrencyName;
import o.setInputType;
import o.setMaxHeight;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/DeleteAccountActivity_ViewBinding.class */
public class DeleteAccountActivity_ViewBinding implements Unbinder {
    private DeleteAccountActivity a;
    private View b;

    public DeleteAccountActivity_ViewBinding(final DeleteAccountActivity deleteAccountActivity, View view) {
        this.a = deleteAccountActivity;
        deleteAccountActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        deleteAccountActivity.toolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'toolbarTitle'", TextView.class);
        deleteAccountActivity.clAlasan = (setMaxHeight) Utils.findRequiredViewAsType(view, 2131296793, "field 'clAlasan'", setMaxHeight.class);
        deleteAccountActivity.tilAlasan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298494, "field 'tilAlasan'", LogoutDialog_ViewBinding.class);
        deleteAccountActivity.etAlasan = (EditText) Utils.findRequiredViewAsType(view, 2131296945, "field 'etAlasan'", EditText.class);
        deleteAccountActivity.tvErrorAlasan = (TextView) Utils.findRequiredViewAsType(view, 2131298973, "field 'tvErrorAlasan'", TextView.class);
        deleteAccountActivity.tvCountAlasan = (TextView) Utils.findRequiredViewAsType(view, 2131298885, "field 'tvCountAlasan'", TextView.class);
        deleteAccountActivity.llTidakMenggunakan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297913, "field 'llTidakMenggunakan'", LinearLayout.class);
        deleteAccountActivity.llStoragePenuh = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297895, "field 'llStoragePenuh'", LinearLayout.class);
        deleteAccountActivity.llKesulitan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297723, "field 'llKesulitan'", LinearLayout.class);
        deleteAccountActivity.llBelumTersedia = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297546, "field 'llBelumTersedia'", LinearLayout.class);
        deleteAccountActivity.llAlasan = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297532, "field 'llAlasan'", LinearLayout.class);
        deleteAccountActivity.tvTidakMenggunakan = (TextView) Utils.findRequiredViewAsType(view, 2131299605, "field 'tvTidakMenggunakan'", TextView.class);
        deleteAccountActivity.tvStoragePenuh = (TextView) Utils.findRequiredViewAsType(view, 2131299584, "field 'tvStoragePenuh'", TextView.class);
        deleteAccountActivity.tvKesulitan = (TextView) Utils.findRequiredViewAsType(view, 2131299347, "field 'tvKesulitan'", TextView.class);
        deleteAccountActivity.tvBelumTersedia = (TextView) Utils.findRequiredViewAsType(view, 2131298844, "field 'tvBelumTersedia'", TextView.class);
        deleteAccountActivity.tvAlasan = (TextView) Utils.findRequiredViewAsType(view, 2131298826, "field 'tvAlasan'", TextView.class);
        deleteAccountActivity.rbTidakMenggunakan = (RadioButton) Utils.findRequiredViewAsType(view, 2131298184, "field 'rbTidakMenggunakan'", RadioButton.class);
        deleteAccountActivity.rbStoragePenuh = (RadioButton) Utils.findRequiredViewAsType(view, 2131298180, "field 'rbStoragePenuh'", RadioButton.class);
        deleteAccountActivity.rbKesulitan = (RadioButton) Utils.findRequiredViewAsType(view, 2131298152, "field 'rbKesulitan'", RadioButton.class);
        deleteAccountActivity.rbBelumTersedia = (RadioButton) Utils.findRequiredViewAsType(view, 2131298135, "field 'rbBelumTersedia'", RadioButton.class);
        deleteAccountActivity.rbAlasan = (RadioButton) Utils.findRequiredViewAsType(view, 2131298133, "field 'rbAlasan'", RadioButton.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296452, "method 'onSubmit'");
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.DeleteAccountActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                deleteAccountActivity.onSubmit(view2);
            }
        });
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        DeleteAccountActivity deleteAccountActivity = this.a;
        if (deleteAccountActivity != null) {
            this.a = null;
            deleteAccountActivity.toolbar = null;
            deleteAccountActivity.toolbarTitle = null;
            deleteAccountActivity.clAlasan = null;
            deleteAccountActivity.tilAlasan = null;
            deleteAccountActivity.etAlasan = null;
            deleteAccountActivity.tvErrorAlasan = null;
            deleteAccountActivity.tvCountAlasan = null;
            deleteAccountActivity.llTidakMenggunakan = null;
            deleteAccountActivity.llStoragePenuh = null;
            deleteAccountActivity.llKesulitan = null;
            deleteAccountActivity.llBelumTersedia = null;
            deleteAccountActivity.llAlasan = null;
            deleteAccountActivity.tvTidakMenggunakan = null;
            deleteAccountActivity.tvStoragePenuh = null;
            deleteAccountActivity.tvKesulitan = null;
            deleteAccountActivity.tvBelumTersedia = null;
            deleteAccountActivity.tvAlasan = null;
            deleteAccountActivity.rbTidakMenggunakan = null;
            deleteAccountActivity.rbStoragePenuh = null;
            deleteAccountActivity.rbKesulitan = null;
            deleteAccountActivity.rbBelumTersedia = null;
            deleteAccountActivity.rbAlasan = null;
            this.b.setOnClickListener(null);
            this.b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
