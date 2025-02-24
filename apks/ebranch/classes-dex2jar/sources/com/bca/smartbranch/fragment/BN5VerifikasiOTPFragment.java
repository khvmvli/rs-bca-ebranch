package com.bca.smartbranch.fragment;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindArray;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.FormBankNotesActivity;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.RequestOTPPresenter;
import com.bca.smartbranch.presenter.VerifyOTPPresenter;
import o.ConfirmSubMastercardAdapter$ViewHolder;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LandingActivity_ViewBinding;
import o.NoAtmEChannelActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Page6DBCADollarFragment;
import o.Page6DBCADollarSFragment_ViewBinding;
import o.getPromotion;
import o.showInfoBanking;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN5VerifikasiOTPFragment.class */
public class BN5VerifikasiOTPFragment extends BaseFragment implements RequestOTPPresenter.IconCompatParcelizer, VerifyOTPPresenter.read {
    private ConfirmSubMastercardAdapter$ViewHolder a;
    @BindView(2131296396)
    Button btnLanjut;
    private CountDownTimer d;
    @BindString(2131820830)
    String errorEmptyOTP;
    @BindString(2131820831)
    String errorNotValidOTP;
    @BindView(2131297139)
    Page6DBCADollarSFragment_ViewBinding etOtp;
    private RequestOTPPresenter g;
    private VerifyOTPPresenter i;
    private User j;
    @BindArray(2130903081)
    String[] listNoHandphone;
    @BindString(2131821911)
    String messageOTP;
    @BindString(2131822092)
    String retry;
    @BindString(2131822063)
    String titlePage;
    @BindView(2131299044)
    TextView tvErrorKodeOtp;
    @BindView(2131299549)
    TextView tvRequest;
    @BindView(2131299465)
    TextView tvTitlePage;

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LandingActivity_ViewBinding landingActivity_ViewBinding = new LandingActivity_ViewBinding();
        landingActivity_ViewBinding.e = this.j.getEmail();
        landingActivity_ViewBinding.d = this.j.getImei();
        landingActivity_ViewBinding.c = this.j.getSessionId();
        landingActivity_ViewBinding.a = this.a.h.e;
        this.g.b(landingActivity_ViewBinding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        NoAtmEChannelActivity_ViewBinding noAtmEChannelActivity_ViewBinding = new NoAtmEChannelActivity_ViewBinding();
        noAtmEChannelActivity_ViewBinding.b = this.j.getEmail();
        noAtmEChannelActivity_ViewBinding.d = this.j.getImei();
        noAtmEChannelActivity_ViewBinding.c = this.j.getSessionId();
        Page6DBCADollarSFragment_ViewBinding page6DBCADollarSFragment_ViewBinding = this.etOtp;
        showInfoBanking showinfobanking = page6DBCADollarSFragment_ViewBinding.c;
        noAtmEChannelActivity_ViewBinding.a = (showinfobanking == null || showinfobanking.getText() == null) ? null : page6DBCADollarSFragment_ViewBinding.c.getText().toString();
        this.i.b(noAtmEChannelActivity_ViewBinding);
    }

    @Override // com.bca.smartbranch.presenter.VerifyOTPPresenter.read
    public final void a() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.RequestOTPPresenter.IconCompatParcelizer
    public final void a(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.fragment.BN5VerifikasiOTPFragment.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BN5VerifikasiOTPFragment.this.i();
            }
        }).g();
    }

    @Override // com.bca.smartbranch.presenter.RequestOTPPresenter.IconCompatParcelizer
    public final void b() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.RequestOTPPresenter.IconCompatParcelizer
    public final void b(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.j.getImei());
        bundle.putString("email", this.j.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493164;
    }

    @Override // com.bca.smartbranch.presenter.RequestOTPPresenter.IconCompatParcelizer
    public final void c(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogTitle", "Info");
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.VerifyOTPPresenter.read
    public final void d() {
        getPromotion.d(getContext());
        h();
        d(2131296811, this, new BN5PilihRekeningFragment(), "BN5PilihRekeningFragment");
    }

    @Override // com.bca.smartbranch.presenter.RequestOTPPresenter.IconCompatParcelizer
    public final void d(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.RequestOTPPresenter.IconCompatParcelizer
    public final void e() {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogTitle", "Info");
        bundle.putString("MessageDialogContent", this.messageOTP);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
        this.tvRequest.setEnabled(false);
        this.tvRequest.setTextColor(getContext().getResources().getColor(2131099840));
        this.d.start();
    }

    @Override // com.bca.smartbranch.presenter.RequestOTPPresenter.IconCompatParcelizer
    public final void e(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.j.getImei());
        bundle.putString("email", this.j.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.VerifyOTPPresenter.read
    public final void f(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.fragment.BN5VerifikasiOTPFragment.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BN5VerifikasiOTPFragment.this.j();
            }
        }).g();
    }

    @Override // com.bca.smartbranch.presenter.VerifyOTPPresenter.read
    public final void g(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.VerifyOTPPresenter.read
    public final void i(String str) {
        h();
        this.etOtp.b();
        this.tvErrorKodeOtp.setVisibility(0);
        this.tvErrorKodeOtp.setText(str);
    }

    @OnClick({2131296396})
    public void lanjut() {
        this.tvErrorKodeOtp.setVisibility(8);
        Page6DBCADollarSFragment_ViewBinding page6DBCADollarSFragment_ViewBinding = this.etOtp;
        showInfoBanking showinfobanking = page6DBCADollarSFragment_ViewBinding.c;
        if (((showinfobanking == null || showinfobanking.getText() == null) ? null : page6DBCADollarSFragment_ViewBinding.c.getText().toString()).isEmpty()) {
            this.etOtp.b();
            this.tvErrorKodeOtp.setVisibility(0);
            this.tvErrorKodeOtp.setText(this.errorEmptyOTP);
            return;
        }
        Page6DBCADollarSFragment_ViewBinding page6DBCADollarSFragment_ViewBinding2 = this.etOtp;
        showInfoBanking showinfobanking2 = page6DBCADollarSFragment_ViewBinding2.c;
        String str = null;
        if (showinfobanking2 != null) {
            str = null;
            if (showinfobanking2.getText() != null) {
                str = page6DBCADollarSFragment_ViewBinding2.c.getText().toString();
            }
        }
        if (str.length() < 6) {
            this.etOtp.b();
            this.tvErrorKodeOtp.setVisibility(0);
            this.tvErrorKodeOtp.setText(this.errorNotValidOTP);
            return;
        }
        j();
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.d.cancel();
        VerifyOTPPresenter verifyOTPPresenter = this.i;
        Call<OpenAccountSuccessActivity> call = verifyOTPPresenter.e;
        if (call != null) {
            call.cancel();
        }
        verifyOTPPresenter.d = null;
        RequestOTPPresenter requestOTPPresenter = this.g;
        Call<OpenAccountSuccessActivity> call2 = requestOTPPresenter.a;
        if (call2 != null) {
            call2.cancel();
        }
        requestOTPPresenter.b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        this.tvTitlePage.setText(Html.fromHtml(this.titlePage));
        Bundle bundle2 = new Bundle();
        bundle2.putString("MessageDialogTitle", "Info");
        bundle2.putString("MessageDialogContent", this.messageOTP);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle2);
        messageDialog.show(getFragmentManager(), "MessageDialog");
        RequestOTPPresenter requestOTPPresenter = new RequestOTPPresenter();
        this.g = requestOTPPresenter;
        requestOTPPresenter.b = this;
        VerifyOTPPresenter verifyOTPPresenter = new VerifyOTPPresenter();
        this.i = verifyOTPPresenter;
        verifyOTPPresenter.d = this;
        this.j = ((FormBankNotesActivity) getActivity()).w();
        this.a = ((FormBankNotesActivity) getActivity()).n;
        this.tvTitlePage.setText(String.format(getString(2131821794), this.a.h.b));
        AnonymousClass5 r0 = new CountDownTimer(30000, 1000) { // from class: com.bca.smartbranch.fragment.BN5VerifikasiOTPFragment.5
            @Override // android.os.CountDownTimer
            public final void onFinish() {
                BN5VerifikasiOTPFragment.this.tvRequest.setEnabled(true);
                BN5VerifikasiOTPFragment.this.tvRequest.setText("KIRIM ULANG KODE OTP");
                BN5VerifikasiOTPFragment.this.tvRequest.setTextColor(BN5VerifikasiOTPFragment.this.getContext().getResources().getColor(2131099735));
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
                TextView textView = BN5VerifikasiOTPFragment.this.tvRequest;
                StringBuilder sb = new StringBuilder("Kirim ulang kode OTP (");
                sb.append((j / 1000) + 1);
                sb.append("s)");
                textView.setText(sb.toString());
            }
        };
        this.d = r0;
        r0.start();
        this.etOtp.setOtpListener(new Page6DBCADollarFragment() { // from class: com.bca.smartbranch.fragment.BN5VerifikasiOTPFragment.4
            public final void a() {
                BN5VerifikasiOTPFragment.this.tvErrorKodeOtp.setVisibility(8);
            }

            public final void e() {
                BN5VerifikasiOTPFragment.this.tvErrorKodeOtp.setVisibility(8);
                BN5VerifikasiOTPFragment.this.j();
            }
        });
        showInfoBanking showinfobanking = this.etOtp.c;
        if (showinfobanking != null) {
            showinfobanking.requestFocus();
        }
    }

    @OnClick({2131299549})
    public void requestOTP() {
        i();
    }
}
