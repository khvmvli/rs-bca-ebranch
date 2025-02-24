package com.bca.smartbranch.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.FormTellerActivity;
import com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.GetFundPurposePresenter;
import io.realm.Realm;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.setPadding;
import o.setSplitTrack;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/SumberDanaPilihIdentitasSetunFragment.class */
public class SumberDanaPilihIdentitasSetunFragment extends BaseFragment implements GetFundPurposePresenter.IconCompatParcelizer {
    @BindView(2131296842)
    setSplitTrack cvKtp;
    @BindView(2131296847)
    setSplitTrack cvPaspor;
    @BindView(2131296849)
    setSplitTrack cvRekening;
    @BindView(2131296854)
    setSplitTrack cvSiupNib;
    private GetFundPurposePresenter d;
    @BindView(2131297766)
    LinearLayout llMain;

    private void b() {
        if (Double.parseDouble(((FormTellerActivity) getActivity()).f.getTxnAmount().replace(",", ".")) >= 1.0E8d) {
            boolean equalsIgnoreCase = ((FormTellerActivity) getActivity()).f.getSourceAccountOwnerType().equalsIgnoreCase("Perusahaan");
            GetFundPurposePresenter getFundPurposePresenter = this.d;
            String e = getPromotion.e(this.e);
            getFundPurposePresenter.e.g_();
            getFundPurposePresenter.b(e, "Y", equalsIgnoreCase);
            return;
        }
        c(2131296811, new SumberDanaDataPemilikSetunFragment(), "SumberDanaDataPemilikSetunFragment");
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void A(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void a_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
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

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void b_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getFragmentManager(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493273;
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void e(MasterFundSourcePurposeResponse masterFundSourcePurposeResponse) {
        h();
        ((FormTellerActivity) getActivity()).q = masterFundSourcePurposeResponse.getFundSource();
        ((FormTellerActivity) getActivity()).s = masterFundSourcePurposeResponse.getTransactionPurpose();
        c(2131296811, new SumberDanaDataPemilikSetunFragment(), "SumberDanaDataPemilikSetunFragment");
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void g_() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void m(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        ((FormTellerActivity) getActivity()).f.setSenderIdType("");
        e(2131296811, new PenerimaFragment(), "PenerimaFragment");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.c.close();
        documentProvider.b().e(this);
        GetFundPurposePresenter getFundPurposePresenter = this.d;
        Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> call = getFundPurposePresenter.c;
        if (call != null) {
            call.cancel();
        }
        getFundPurposePresenter.e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.c = Realm.getDefaultInstance();
        documentProvider.b().c(this);
        ((setPadding) getActivity()).i();
        ((setPadding) getActivity()).i().d(true);
        ((setPadding) getActivity()).i().d("");
        ((FormTellerActivity) getActivity()).f.setCurrentPage("SumberDanaPilihIdentitasSetunFragment");
        GetFundPurposePresenter getFundPurposePresenter = new GetFundPurposePresenter();
        this.d = getFundPurposePresenter;
        getFundPurposePresenter.e = this;
        if (((FormTellerActivity) getActivity()).f.getSourceAccountOwnerType().equals("Perusahaan")) {
            this.cvRekening.setVisibility(0);
            this.cvKtp.setVisibility(8);
            this.cvPaspor.setVisibility(8);
            this.cvSiupNib.setVisibility(0);
            return;
        }
        this.cvRekening.setVisibility(0);
        this.cvKtp.setVisibility(0);
        this.cvPaspor.setVisibility(0);
        this.cvSiupNib.setVisibility(8);
    }

    @OnClick({2131297753})
    public void showKtpPage(View view) {
        ((FormTellerActivity) getActivity()).f.setSenderIdType("KTP");
        b();
    }

    @OnClick({2131297840})
    public void showPasporPage(View view) {
        ((FormTellerActivity) getActivity()).f.setSenderIdType("Paspor");
        b();
    }

    @OnClick({2131297868})
    public void showRekeningPage(View view) {
        ((FormTellerActivity) getActivity()).f.setSenderIdType("Rekening");
        b();
    }

    @OnClick({2131297890})
    public void showSiupNibPage(View view) {
        ((FormTellerActivity) getActivity()).f.setSenderIdType("SIUP");
        b();
    }
}
