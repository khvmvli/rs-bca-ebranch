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
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/EditDaftarTransferActivity_ViewBinding.class */
public class EditDaftarTransferActivity_ViewBinding implements Unbinder {
    private View a;
    private EditDaftarTransferActivity c;
    private View d;

    public EditDaftarTransferActivity_ViewBinding(final EditDaftarTransferActivity editDaftarTransferActivity, View view) {
        this.c = editDaftarTransferActivity;
        editDaftarTransferActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        editDaftarTransferActivity.txtToolbarTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'txtToolbarTitle'", TextView.class);
        editDaftarTransferActivity.etNamaPemilik = (EditText) Utils.findRequiredViewAsType(view, 2131297065, "field 'etNamaPemilik'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297017, "field 'etKeterangan' and method 'onFocusChange'");
        editDaftarTransferActivity.etKeterangan = (EditText) Utils.castView(findRequiredView, 2131297017, "field 'etKeterangan'", EditText.class);
        this.a = findRequiredView;
        findRequiredView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferActivity_ViewBinding.5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                editDaftarTransferActivity.onFocusChange(view2, z);
            }
        });
        editDaftarTransferActivity.etNomorRekening = (EditText) Utils.findRequiredViewAsType(view, 2131297128, "field 'etNomorRekening'", EditText.class);
        editDaftarTransferActivity.tilKeterangan = (LogoutDialog_ViewBinding) Utils.findRequiredViewAsType(view, 2131298563, "field 'tilKeterangan'", LogoutDialog_ViewBinding.class);
        editDaftarTransferActivity.lnMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297969, "field 'lnMain'", LinearLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, 2131296450, "method 'simpan'");
        this.d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.EditDaftarTransferActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                editDaftarTransferActivity.simpan();
            }
        });
        Resources resources = view.getContext().getResources();
        editDaftarTransferActivity.toolbarTitle = resources.getString(2131822320);
        editDaftarTransferActivity.retry = resources.getString(2131822092);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        EditDaftarTransferActivity editDaftarTransferActivity = this.c;
        if (editDaftarTransferActivity != null) {
            this.c = null;
            editDaftarTransferActivity.toolbar = null;
            editDaftarTransferActivity.txtToolbarTitle = null;
            editDaftarTransferActivity.etNamaPemilik = null;
            editDaftarTransferActivity.etKeterangan = null;
            editDaftarTransferActivity.etNomorRekening = null;
            editDaftarTransferActivity.tilKeterangan = null;
            editDaftarTransferActivity.lnMain = null;
            this.a.setOnFocusChangeListener(null);
            this.a = null;
            this.d.setOnClickListener(null);
            this.d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
