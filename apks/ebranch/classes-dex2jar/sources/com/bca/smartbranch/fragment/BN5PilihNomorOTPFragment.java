package com.bca.smartbranch.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.FormBankNotesActivity;
import com.bca.smartbranch.adapter.NomorOTPAdapter;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.RequestOTPPresenter;
import java.util.ArrayList;
import java.util.List;
import o.ConfirmSubMastercardAdapter$ViewHolder;
import o.ConfirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver;
import o.DaftarTransferAdapter$DaftarTransferVH;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LandingActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.setOnStartEnterTransitionListener;
import o.togglePINBaru;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/BN5PilihNomorOTPFragment.class */
public class BN5PilihNomorOTPFragment extends BaseFragment implements RequestOTPPresenter.IconCompatParcelizer {
    private List<ConfirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver> a;
    private List<DaftarTransferAdapter$DaftarTransferVH> d = new ArrayList();
    private ConfirmSubMastercardAdapter$ViewHolder f;
    private RequestOTPPresenter i;
    private NomorOTPAdapter j;
    @BindString(2131822092)
    String retry;
    @BindView(2131298332)
    setOnStartEnterTransitionListener rvNomorOTP;
    @BindView(2131299115)
    TextView tvErrorNoOTP;

    public void a() {
        LandingActivity_ViewBinding landingActivity_ViewBinding = new LandingActivity_ViewBinding();
        landingActivity_ViewBinding.e = this.e.getEmail();
        landingActivity_ViewBinding.d = this.e.getImei();
        landingActivity_ViewBinding.c = this.e.getSessionId();
        landingActivity_ViewBinding.a = this.a.get(this.j.e).e;
        this.i.b(landingActivity_ViewBinding);
    }

    @Override // com.bca.smartbranch.presenter.RequestOTPPresenter.IconCompatParcelizer
    public final void a(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.fragment.BN5PilihNomorOTPFragment.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BN5PilihNomorOTPFragment.this.a();
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
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493162;
    }

    @Override // com.bca.smartbranch.presenter.RequestOTPPresenter.IconCompatParcelizer
    public final void c(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.RequestOTPPresenter.IconCompatParcelizer
    public final void d(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.RequestOTPPresenter.IconCompatParcelizer
    public final void e() {
        h();
        ((FormBankNotesActivity) getActivity()).n.h = this.a.get(this.j.e);
        d(2131296811, this, new BN5VerifikasiOTPFragment(), "BN5VerifikasiOTPFragment");
    }

    @Override // com.bca.smartbranch.presenter.RequestOTPPresenter.IconCompatParcelizer
    public final void e(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        documentProvider.b().e(this);
        RequestOTPPresenter requestOTPPresenter = this.i;
        Call<OpenAccountSuccessActivity> call = requestOTPPresenter.a;
        if (call != null) {
            call.cancel();
        }
        requestOTPPresenter.b = null;
        onDestroy();
    }

    @OnClick({2131296442})
    public void onRequestOTP(View view) {
        this.tvErrorNoOTP.setVisibility(8);
        if (this.j.e < 0) {
            this.tvErrorNoOTP.setVisibility(0);
        } else {
            a();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onSelectNomorOTP(togglePINBaru togglepinbaru) {
        this.tvErrorNoOTP.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        documentProvider.b().c(this);
        RequestOTPPresenter requestOTPPresenter = new RequestOTPPresenter();
        this.i = requestOTPPresenter;
        requestOTPPresenter.b = this;
        this.e = ((FormBankNotesActivity) getActivity()).w();
        ConfirmSubMastercardAdapter$ViewHolder confirmSubMastercardAdapter$ViewHolder = ((FormBankNotesActivity) getActivity()).n;
        this.f = confirmSubMastercardAdapter$ViewHolder;
        List<ConfirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver> list = confirmSubMastercardAdapter$ViewHolder.e;
        this.a = list;
        for (ConfirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver confirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver : list) {
            DaftarTransferAdapter$DaftarTransferVH daftarTransferAdapter$DaftarTransferVH = new DaftarTransferAdapter$DaftarTransferVH();
            daftarTransferAdapter$DaftarTransferVH.e = confirmSubMastercardAdapter$ViewHolder$MediaBrowserCompat$CustomActionResultReceiver.b;
            daftarTransferAdapter$DaftarTransferVH.d = false;
            this.d.add(daftarTransferAdapter$DaftarTransferVH);
        }
        this.j = new NomorOTPAdapter(getContext(), this.d);
        setOnStartEnterTransitionListener setonstartentertransitionlistener = this.rvNomorOTP;
        getContext();
        setonstartentertransitionlistener.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvNomorOTP.setAdapter(this.j);
    }
}
