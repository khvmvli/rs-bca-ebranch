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
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getPromotion;
import o.setPadding;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/SumberDanaPilihPemilikSetunFragment.class */
public class SumberDanaPilihPemilikSetunFragment extends BaseFragment implements GetFundPurposePresenter.IconCompatParcelizer {
    private GetFundPurposePresenter a;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindView(2131297838)
    LinearLayout llOrangLain;
    @BindView(2131297857)
    LinearLayout llPerusahaan;
    @BindView(2131297879)
    LinearLayout llSayaSendiri;

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
        return 2131493274;
    }

    @OnClick({2131297838})
    public void clickOrangLain(View view) {
        ((FormTellerActivity) getActivity()).f.setSourceAccountOwnerType("Orang Lain");
        c(2131296811, new SumberDanaPilihIdentitasSetunFragment(), "SumberDanaPilihIdentitasSetunFragment");
    }

    @OnClick({2131297857})
    public void clickPerusahaan(View view) {
        ((FormTellerActivity) getActivity()).f.setSourceAccountOwnerType("Perusahaan");
        c(2131296811, new SumberDanaPilihIdentitasSetunFragment(), "SumberDanaPilihIdentitasSetunFragment");
    }

    @OnClick({2131297879})
    public void clickSayaSendiri(View view) {
        ((FormTellerActivity) getActivity()).f.setSourceAccountOwnerType("Saya Sendiri");
        ((FormTellerActivity) getActivity()).f.setSenderIdType("Rekening");
        if (!((FormTellerActivity) getActivity()).n.getVerified().equalsIgnoreCase("Y")) {
            c(2131296811, new SumberDanaPilihIdentitasSetunFragment(), "SumberDanaPilihIdentitasSetunFragment");
        } else if (Double.parseDouble(((FormTellerActivity) getActivity()).f.getTxnAmount().replace(",", ".")) >= 1.0E8d) {
            boolean equalsIgnoreCase = ((FormTellerActivity) getActivity()).f.getSourceAccountOwnerType().equalsIgnoreCase("Perusahaan");
            GetFundPurposePresenter getFundPurposePresenter = this.a;
            String e = getPromotion.e(this.e);
            getFundPurposePresenter.e.g_();
            getFundPurposePresenter.b(e, "Y", equalsIgnoreCase);
        } else {
            c(2131296811, new SumberDanaDataPemilikSetunFragment(), "SumberDanaDataPemilikSetunFragment");
        }
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
        e(2131296811, new PenerimaFragment(), "PenerimaFragment");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        documentProvider.b().e(this);
        GetFundPurposePresenter getFundPurposePresenter = this.a;
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
        documentProvider.b().c(this);
        ((setPadding) getActivity()).i();
        ((setPadding) getActivity()).i().d(true);
        ((setPadding) getActivity()).i().d("");
        GetFundPurposePresenter getFundPurposePresenter = new GetFundPurposePresenter();
        this.a = getFundPurposePresenter;
        getFundPurposePresenter.e = this;
        ((FormTellerActivity) getActivity()).f.setCurrentPage("SumberDanaPilihPemilikFragment");
    }
}
