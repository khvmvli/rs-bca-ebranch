package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.dialog.LimitActivationDialog;
import com.bca.smartbranch.dialog.LinkActivationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.SendEmailActPresenter;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LoginActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/RegistrationSuccessActivity.class */
public class RegistrationSuccessActivity extends BaseActivityPreLogin implements SendEmailActPresenter.write {
    private SendEmailActPresenter k;

    /* renamed from: o  reason: collision with root package name */
    private String f22o;
    @BindString(2131822079)
    String resendActivationLink;
    @BindString(2131822092)
    String retry;
    @BindString(2131821863)
    String successRegistrationDesc;
    @BindView(2131298420)
    ScrollView svMain;
    @BindView(2131299586)
    TextView tvSuccessContent;

    static /* synthetic */ void c(RegistrationSuccessActivity registrationSuccessActivity) {
        registrationSuccessActivity.k.d(new LoginActivity_ViewBinding(registrationSuccessActivity.f22o));
    }

    @Override // com.bca.smartbranch.presenter.SendEmailActPresenter.write
    public final void a(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    public final void b(Bundle bundle) {
        b(bundle);
        this.f22o = getIntent().getExtras().getString("email", "");
        SendEmailActPresenter sendEmailActPresenter = new SendEmailActPresenter();
        this.k = sendEmailActPresenter;
        sendEmailActPresenter.b = this;
    }

    @Override // com.bca.smartbranch.presenter.SendEmailActPresenter.write
    public final void b(String str) {
        q();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.SendEmailActPresenter.write
    public final void c(String str) {
        q();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.RegistrationSuccessActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegistrationSuccessActivity.c(RegistrationSuccessActivity.this);
            }
        }).g();
    }

    @OnClick({2131296385})
    public void close(View view) {
        finish();
    }

    @Override // com.bca.smartbranch.presenter.SendEmailActPresenter.write
    public final void e(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        LimitActivationDialog limitActivationDialog = new LimitActivationDialog();
        limitActivationDialog.setArguments(bundle);
        limitActivationDialog.show(l(), LimitActivationDialog.TAG);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        SendEmailActPresenter sendEmailActPresenter = this.k;
        Call<OpenAccountSuccessActivity<Object>> call = sendEmailActPresenter.c;
        if (call != null) {
            call.cancel();
        }
        sendEmailActPresenter.b = null;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final int p() {
        return 2131493002;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131299550})
    public void resendLinkActivation(View view) {
        this.k.d(new LoginActivity_ViewBinding(this.f22o));
    }

    @Override // com.bca.smartbranch.presenter.SendEmailActPresenter.write
    public final void s() {
        q();
        new LinkActivationDialog().show(l(), LinkActivationDialog.TAG);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailActPresenter.write
    public final void w() {
        t();
    }
}
