package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.dialog.LimitActivationDialog;
import com.bca.smartbranch.dialog.LimitPengaturanPINDialog;
import com.bca.smartbranch.dialog.LinkUbahPINDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.ForgotEmailPassPresenter;
import o.InfoCodewordORActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ForgotPassSuccessActivity.class */
public class ForgotPassSuccessActivity extends BaseActivityPreLogin implements ForgotEmailPassPresenter.write {
    private String k;
    private ForgotEmailPassPresenter m;
    @BindString(2131822092)
    String retry;
    @BindView(2131298420)
    ScrollView svMain;

    static /* synthetic */ void d(ForgotPassSuccessActivity forgotPassSuccessActivity) {
        forgotPassSuccessActivity.m.e(new InfoCodewordORActivity(forgotPassSuccessActivity.k));
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write
    public final void a(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write, com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void a_(String str) {
        q();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.ForgotPassSuccessActivity.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ForgotPassSuccessActivity.d(ForgotPassSuccessActivity.this);
            }
        }).g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    public final void b(Bundle bundle) {
        b(bundle);
        ForgotEmailPassPresenter forgotEmailPassPresenter = new ForgotEmailPassPresenter();
        this.m = forgotEmailPassPresenter;
        forgotEmailPassPresenter.d = this;
        this.k = getIntent().getExtras().getString("email", "");
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write, com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void c(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        LimitPengaturanPINDialog limitPengaturanPINDialog = new LimitPengaturanPINDialog();
        limitPengaturanPINDialog.setArguments(bundle);
        limitPengaturanPINDialog.show(l(), LimitActivationDialog.TAG);
    }

    @OnClick({2131296385})
    public void close(View view) {
        k();
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write
    public final void d(String str) {
        q();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write, com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void g_() {
        t();
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write
    public final void i(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        ForgotEmailPassPresenter forgotEmailPassPresenter = this.m;
        Call<OpenAccountSuccessActivity<Object>> call = forgotEmailPassPresenter.e;
        if (call != null) {
            call.cancel();
        }
        forgotEmailPassPresenter.d = null;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final int p() {
        return 2131492952;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131299550})
    public void resendLinkActivation(View view) {
        this.m.e(new InfoCodewordORActivity(this.k));
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write
    public final void u() {
    }

    @Override // com.bca.smartbranch.presenter.ForgotEmailPassPresenter.write
    public final void v() {
        q();
        new LinkUbahPINDialog().show(l(), LinkUbahPINDialog.TAG);
    }
}
