package com.bca.smartbranch.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.LandingActivity;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import io.realm.Realm;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/AutoLogoutDialog.class */
public class AutoLogoutDialog extends BaseDialog {
    private String a;
    private Unbinder b;
    private String c;
    private Realm d;
    private boolean e;
    private String f;
    @BindString(2131821912)
    String labelMessageSessionExpired;
    @BindView(2131298883)
    TextView tvContent;

    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.b = ButterKnife.bind(this, view);
    }

    @OnClick({2131296385})
    public void close(View view) {
        getDialog().dismiss();
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493092;
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog, o.getText, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.d.close();
        startActivity(Intent.makeRestartActivityTask(new Intent(Realm.getApplicationContext(), LandingActivity.class).getComponent()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.c = arguments.getString("imei", "");
        this.a = arguments.getString("email", "");
        this.f = arguments.getString("message", "");
        this.e = arguments.getBoolean("is_multiple_login");
        if (this.f.isEmpty()) {
            this.tvContent.setText(Html.fromHtml(this.labelMessageSessionExpired));
        } else {
            this.tvContent.setText(this.f);
        }
        try {
            Realm defaultInstance = Realm.getDefaultInstance();
            this.d = defaultInstance;
            defaultInstance.executeTransaction(new Realm.Transaction() { // from class: o.ListTujuanTransaksiROAdapter$ListTujuanTransaksiROAdapterVH_ViewBinding
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    realm.delete(ListFormTeller.class);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.b.unbind();
    }
}
