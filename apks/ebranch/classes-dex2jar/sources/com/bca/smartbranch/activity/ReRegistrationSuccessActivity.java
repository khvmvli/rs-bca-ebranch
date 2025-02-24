package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.dialog.LimitActivationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.ReRegistrationPresenter;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LandingActivity;
import o.OpenAccountSuccessActivity;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReRegistrationSuccessActivity.class */
public class ReRegistrationSuccessActivity extends BaseActivityPreLogin implements ReRegistrationPresenter.write {
    private String k;

    /* renamed from: o  reason: collision with root package name */
    private ReRegistrationPresenter f21o;
    @BindString(2131822079)
    String resendActivationLink;
    @BindString(2131822092)
    String retry;
    @BindString(2131821863)
    String successRegistrationDesc;
    @BindView(2131298420)
    ScrollView svMain;
    @BindView(2131299550)
    TextView tvResendLinkActivation;
    @BindView(2131299586)
    TextView tvSuccessContent;

    static /* synthetic */ void e(ReRegistrationSuccessActivity reRegistrationSuccessActivity) {
        reRegistrationSuccessActivity.f21o.e(new LandingActivity(reRegistrationSuccessActivity.k));
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void a_(String str) {
        q();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.ReRegistrationSuccessActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReRegistrationSuccessActivity.e(ReRegistrationSuccessActivity.this);
            }
        }).g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    public final void b(Bundle bundle) {
        b(bundle);
        this.k = getIntent().getExtras().getString("email", "");
        ReRegistrationPresenter reRegistrationPresenter = new ReRegistrationPresenter();
        this.f21o = reRegistrationPresenter;
        reRegistrationPresenter.e = this;
        Bundle bundle2 = new Bundle();
        bundle2.putString("MessageDialogTitle", getString(2131820702));
        bundle2.putString("MessageDialogContent", getString(2131820701));
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle2);
        messageDialog.show(l(), "MessageDialog");
        this.tvSuccessContent.setText(this.successRegistrationDesc);
        this.tvResendLinkActivation.setText(Html.fromHtml(this.resendActivationLink));
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void c(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        LimitActivationDialog limitActivationDialog = new LimitActivationDialog();
        limitActivationDialog.setArguments(bundle);
        limitActivationDialog.show(l(), LimitActivationDialog.TAG);
    }

    @OnClick({2131296385})
    public void close(View view) {
        if (isTaskRoot()) {
            startActivity(new Intent(this, LoginActivity.class));
        }
        finish();
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void g_() {
        t();
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void h_(String str) {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void j(String str) {
        q();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, LoginActivity.class));
        } else {
            onBackPressed();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        ReRegistrationPresenter reRegistrationPresenter = this.f21o;
        Call<OpenAccountSuccessActivity<Object>> call = reRegistrationPresenter.b;
        if (call != null) {
            call.cancel();
        }
        reRegistrationPresenter.e = null;
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
        this.f21o.e(new LandingActivity(this.k));
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void y() {
        q();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogTitle", getString(2131820702));
        bundle.putString("MessageDialogContent", getString(2131820701));
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }
}
