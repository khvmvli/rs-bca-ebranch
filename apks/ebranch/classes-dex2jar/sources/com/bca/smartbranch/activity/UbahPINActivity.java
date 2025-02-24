package com.bca.smartbranch.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.UpdatePINPresenter;
import java.util.List;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.chooseReservasiCS;
import o.getPromotion;
import o.setCardSlogan;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/UbahPINActivity.class */
public class UbahPINActivity extends BaseActivityPostLogin implements UpdatePINPresenter.RemoteActionCompatParcelizer, TextWatcher {
    @BindViews({2131297160, 2131297157, 2131297158})
    List<View> etFields;
    @BindView(2131297157)
    EditText etPINBaru;
    @BindView(2131297158)
    EditText etPINBaruConfirm;
    @BindView(2131297160)
    EditText etPINLama;
    private UpdatePINPresenter f;
    @BindView(2131298783)
    ImageView ivToggleConfirmPinBaru;
    @BindView(2131298782)
    ImageView ivTogglePinBaru;
    @BindView(2131298785)
    ImageView ivTogglePinLama;
    @BindString(2131822092)
    String retry;
    @BindView(2131298420)
    ScrollView svMain;
    @BindViews({2131298696, 2131298693, 2131298694})
    List<LogoutDialog_ViewBinding> tilForms;
    @BindView(2131298693)
    LogoutDialog_ViewBinding tilPinBaru;
    @BindView(2131298694)
    LogoutDialog_ViewBinding tilPinBaruConfirm;
    @BindView(2131298696)
    LogoutDialog_ViewBinding tilPinLama;
    @BindViews({2131299163, 2131299160, 2131299161})
    List<TextView> tvErrors;

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.f.a(new chooseReservasiCS(this.m.getEmail(), getPromotion.n(this.etPINLama.getText().toString()), getPromotion.n(this.etPINBaru.getText().toString()), this.m.getSessionId(), this.m.getImei()));
    }

    @Override // com.bca.smartbranch.presenter.UpdatePINPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etPINLama.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etPINLama)).getVisibility() != 0) {
                return;
            }
            if (this.tvErrors.get(this.etFields.indexOf(this.etPINLama)).getText().toString().equals(getString(2131820974))) {
                if (this.etPINLama.getText().toString().length() == 6) {
                    this.tvErrors.get(this.etFields.indexOf(this.etPINLama)).setVisibility(8);
                    this.tilForms.get(this.etFields.indexOf(this.etPINLama)).setBackgroundResource(2131231358);
                }
            } else if (!this.etPINLama.getText().toString().isEmpty()) {
                this.tvErrors.get(this.etFields.indexOf(this.etPINLama)).setVisibility(8);
                this.tilForms.get(this.etFields.indexOf(this.etPINLama)).setBackgroundResource(2131231358);
            }
        } else if (editable == this.etPINBaru.getEditableText()) {
            if (this.tvErrors.get(this.etFields.indexOf(this.etPINBaru)).getVisibility() != 0) {
                return;
            }
            if (this.tvErrors.get(this.etFields.indexOf(this.etPINBaru)).getText().toString().equals(getString(2131820972))) {
                if (this.etPINBaru.getText().toString().length() == 6) {
                    this.tvErrors.get(this.etFields.indexOf(this.etPINBaru)).setVisibility(8);
                    this.tilForms.get(this.etFields.indexOf(this.etPINBaru)).setBackgroundResource(2131231358);
                }
            } else if (!this.etPINBaru.getText().toString().isEmpty()) {
                this.tvErrors.get(this.etFields.indexOf(this.etPINBaru)).setVisibility(8);
                this.tilForms.get(this.etFields.indexOf(this.etPINBaru)).setBackgroundResource(2131231358);
            }
        } else if (editable != this.etPINBaruConfirm.getEditableText() || this.tvErrors.get(this.etFields.indexOf(this.etPINBaruConfirm)).getVisibility() != 0) {
        } else {
            if (this.tvErrors.get(this.etFields.indexOf(this.etPINBaruConfirm)).getText().toString().equals(getString(2131820970))) {
                if (this.etPINBaruConfirm.getText().toString().length() == 6) {
                    this.tvErrors.get(this.etFields.indexOf(this.etPINBaruConfirm)).setVisibility(8);
                    this.tilForms.get(this.etFields.indexOf(this.etPINBaruConfirm)).setBackgroundResource(2131231358);
                }
            } else if (!this.etPINBaruConfirm.getText().toString().isEmpty()) {
                this.tvErrors.get(this.etFields.indexOf(this.etPINBaruConfirm)).setVisibility(8);
                this.tilForms.get(this.etFields.indexOf(this.etPINBaruConfirm)).setBackgroundResource(2131231358);
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.UpdatePINPresenter.RemoteActionCompatParcelizer
    public final void b(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.presenter.UpdatePINPresenter.RemoteActionCompatParcelizer
    public final void c(String str) {
        x();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.activity.UbahPINActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UbahPINActivity.this.u();
            }
        }).g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        UpdatePINPresenter updatePINPresenter = new UpdatePINPresenter();
        this.f = updatePINPresenter;
        updatePINPresenter.b = this;
        this.etPINLama.addTextChangedListener(this);
        this.etPINBaru.addTextChangedListener(this);
        this.etPINBaruConfirm.addTextChangedListener(this);
    }

    @Override // com.bca.smartbranch.presenter.UpdatePINPresenter.RemoteActionCompatParcelizer
    public final void d(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdatePINPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.UpdatePINPresenter.RemoteActionCompatParcelizer
    public final void g(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        bundle.putBoolean("isMessageSuccess", true);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @OnFocusChange({2131297160, 2131297157, 2131297158})
    public void inputChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131297157:
                    this.tilPinBaru.setHintEnabled(true);
                    return;
                case 2131297158:
                    this.tilPinBaruConfirm.setHintEnabled(true);
                    return;
                case 2131297159:
                default:
                    return;
                case 2131297160:
                    this.tilPinLama.setHintEnabled(true);
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131297157:
                    if (this.etPINBaru.getText().toString().isEmpty()) {
                        this.tilPinBaru.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297158:
                    if (this.etPINBaruConfirm.getText().toString().isEmpty()) {
                        this.tilPinBaruConfirm.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297159:
                default:
                    return;
                case 2131297160:
                    if (this.etPINLama.getText().toString().isEmpty()) {
                        this.tilPinLama.setHintEnabled(false);
                        return;
                    }
                    return;
            }
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        UpdatePINPresenter updatePINPresenter = this.f;
        Call<OpenAccountSuccessActivity<Object>> call = updatePINPresenter.a;
        if (call != null) {
            call.cancel();
        }
        updatePINPresenter.b = null;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "UbahPINActivity";
        this.j = "UbahPINActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131493015;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.UpdatePINPresenter.RemoteActionCompatParcelizer
    public final void s() {
        x();
        this.etPINLama.requestFocus();
        this.tvErrors.get(0).setVisibility(0);
        this.tvErrors.get(0).setText(getString(2131820975));
        this.tilPinLama.setBackgroundResource(2131230869);
    }

    @Override // com.bca.smartbranch.presenter.UpdatePINPresenter.RemoteActionCompatParcelizer
    public final void t() {
        z();
    }

    @OnClick({2131298782})
    public void togglePINBaru() {
        if (this.etPINBaru.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())) {
            this.etPINBaru.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.ivTogglePinBaru.setImageDrawable(getResources().getDrawable(2131231152));
            return;
        }
        this.etPINBaru.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        this.ivTogglePinBaru.setImageDrawable(getResources().getDrawable(2131231151));
    }

    @OnClick({2131298783})
    public void togglePINBaruConfirm() {
        if (this.etPINBaruConfirm.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())) {
            this.etPINBaruConfirm.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.ivToggleConfirmPinBaru.setImageDrawable(getResources().getDrawable(2131231152));
            return;
        }
        this.etPINBaruConfirm.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        this.ivToggleConfirmPinBaru.setImageDrawable(getResources().getDrawable(2131231151));
    }

    @OnClick({2131298785})
    public void togglePINLama() {
        if (this.etPINLama.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())) {
            this.etPINLama.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.ivTogglePinLama.setImageDrawable(getResources().getDrawable(2131231152));
            return;
        }
        this.etPINLama.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        this.ivTogglePinLama.setImageDrawable(getResources().getDrawable(2131231151));
    }

    @OnClick({2131296457})
    public void update(View view) {
        for (TextView textView : this.tvErrors) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilForms) {
            logoutDialog_ViewBinding.setBackgroundResource(2131231358);
        }
        if (this.etPINLama.length() < 6) {
            this.etPINLama.requestFocus();
            this.tvErrors.get(0).setVisibility(0);
            this.tvErrors.get(0).setText(getString(2131820974));
            this.tilPinLama.setBackgroundResource(2131230869);
        } else if (this.etPINBaru.length() < 6) {
            this.etPINBaru.requestFocus();
            this.tvErrors.get(1).setVisibility(0);
            this.tvErrors.get(1).setText(getString(2131820972));
            this.tilPinBaru.setBackgroundResource(2131230869);
        } else if (this.etPINLama.getText().toString().equals(this.etPINBaru.getText().toString())) {
            this.etPINBaru.requestFocus();
            this.tvErrors.get(1).setVisibility(0);
            this.tvErrors.get(1).setText(getString(2131820976));
            this.tilPinBaru.setBackgroundResource(2131230869);
        } else if (this.etPINBaruConfirm.length() < 6) {
            this.etPINBaruConfirm.requestFocus();
            this.tvErrors.get(2).setVisibility(0);
            this.tvErrors.get(2).setText(getString(2131820970));
            this.tilPinBaruConfirm.setBackgroundResource(2131230869);
        } else if (!this.etPINBaru.getText().toString().equals(this.etPINBaruConfirm.getText().toString())) {
            this.etPINBaruConfirm.requestFocus();
            this.tvErrors.get(2).setVisibility(0);
            this.tvErrors.get(2).setText(getString(2131820971));
            this.tilPinBaruConfirm.setBackgroundResource(2131230869);
        } else {
            u();
        }
    }
}
