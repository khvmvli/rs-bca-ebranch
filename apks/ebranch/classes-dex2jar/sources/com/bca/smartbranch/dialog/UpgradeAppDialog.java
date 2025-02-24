package com.bca.smartbranch.dialog;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bca.smartbranch.activity.LandingActivity;
import com.bca.smartbranch.activity.MainActivity;
import o.VersiActivity;
import o.documentProvider;
import o.setOnHierarchyChangeListener;
import o.tambahPemegangKartu;
import o.update;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/UpgradeAppDialog.class */
public class UpgradeAppDialog extends BaseDialog {
    private Boolean a;
    private Bundle b;
    @BindView(2131296417)
    Button btnOk;
    @BindView(2131296451)
    Button btnSkip;
    private String c;
    private Unbinder d;
    private String e;
    private Boolean f;
    private String g;
    private String h;
    private String i;
    private String j;
    @BindView(2131298883)
    TextView tvContent;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void bindViews(View view) {
        bindViews(view);
        this.d = ButterKnife.bind(this, view);
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog
    protected int getContentView() {
        return 2131493112;
    }

    @OnClick({2131296417})
    public void ok(View view) {
        String str = this.j;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        startActivity(intent);
    }

    @Override // o.getText, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        Bundle arguments = getArguments();
        this.b = arguments;
        this.c = arguments.getString("is_use_fingerprint", "");
        this.e = this.b.getString("email_fingerprint", "");
        this.g = this.b.getString("upgrade_type", "");
        this.h = this.b.getString("upgrade_message", "");
        this.j = this.b.getString("upgrade_url", "");
        this.f = Boolean.valueOf(this.b.getBoolean("multiple_login"));
        this.i = this.b.getString("message_multiple_login", "");
        this.a = Boolean.valueOf(this.b.getBoolean("is_member", false));
    }

    @Override // com.bca.smartbranch.dialog.BaseDialog, o.getText, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if ("UF".equalsIgnoreCase(this.g) && !this.a.booleanValue()) {
            getActivity().startActivity(new Intent(getActivity(), LandingActivity.class));
            getActivity().overridePendingTransition(2130772009, 2130772012);
            getActivity().finishAffinity();
        }
        onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        getDialog().setCanceledOnTouchOutside(false);
        this.tvContent.setText(this.h);
        if ("UF".equalsIgnoreCase(this.g)) {
            this.btnSkip.setVisibility(8);
        } else {
            this.btnSkip.setVisibility(0);
        }
    }

    @OnClick({2131296451})
    public void skip(View view) {
        boolean z = this.b.getBoolean("isLoginSession", false);
        if (!this.a.booleanValue()) {
            getDialog().dismiss();
        } else if (z) {
            getActivity().finish();
            if (this.f.booleanValue()) {
                documentProvider.b().d(new update(this.i));
            }
        } else {
            tambahPemegangKartu tambahpemegangkartu = new tambahPemegangKartu(getContext());
            boolean z2 = false;
            if (tambahpemegangkartu.b) {
                z2 = false;
                if (tambahpemegangkartu.b()) {
                    z2 = false;
                    if (tambahpemegangkartu.c()) {
                        z2 = true;
                    }
                }
            }
            if (!z2 || !this.c.isEmpty()) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("isMember", this.a);
                intent.putExtra("multiple_login", this.f);
                intent.putExtra("multiple_login", this.i);
                startActivity(intent);
                setOnHierarchyChangeListener.d((Activity) getActivity());
                return;
            }
            dismiss();
            documentProvider.b().d(new VersiActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.dialog.BaseDialog
    public void unbindViews() {
        unbindViews();
        this.d.unbind();
    }
}
