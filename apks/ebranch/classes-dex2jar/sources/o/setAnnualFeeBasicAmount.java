package o;

import android.app.Application;
import android.content.SharedPreferences;
import com.bca.smartbranch.App;
import com.bca.smartbranch.activity.BaseActivityPostLogin;
import com.bca.smartbranch.activity.BaseActivityPostLoginKotlin;
import com.bca.smartbranch.activity.BaseActivityPreLogin;
import com.bca.smartbranch.activity.DetailBerhasilNotificationActivity;
import com.bca.smartbranch.activity.LandingActivity;
import com.bca.smartbranch.activity.LoginActivity;
import com.bca.smartbranch.activity.LoginSessionActivity;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.activity.ProfileActivity;
import com.bca.smartbranch.activity.SyaratKetentuanActivity;
import com.bca.smartbranch.activity.TransactionActivity;
import com.bca.smartbranch.dialog.BaseDialog;
import com.bca.smartbranch.fragment.BaseFragment;
import com.bca.smartbranch.fragment.BaseFragmentKotlin;
import com.bca.smartbranch.injection.module.AppModule;
import com.bca.smartbranch.injection.module.DataModule;
import com.bca.smartbranch.injection.module.NetworkModule;
import com.bca.smartbranch.presenter.AccountOpeningPresenter;
import com.bca.smartbranch.presenter.ActivateEChannelPresenter;
import com.bca.smartbranch.presenter.AdminFeesPresenter;
import com.bca.smartbranch.presenter.ApplyCCPresenter;
import com.bca.smartbranch.presenter.BankListPresenter;
import com.bca.smartbranch.presenter.BeneficiaryBankDetailPresenter;
import com.bca.smartbranch.presenter.BeneficiaryBankPresenter;
import com.bca.smartbranch.presenter.BranchDetailPresenter;
import com.bca.smartbranch.presenter.CancelReservationPresenter;
import com.bca.smartbranch.presenter.CancelTundaPresenter;
import com.bca.smartbranch.presenter.CategoriesKUPresenter;
import com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter;
import com.bca.smartbranch.presenter.CheckCISNPresenter;
import com.bca.smartbranch.presenter.CheckCutOffPresenter;
import com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter;
import com.bca.smartbranch.presenter.CheckDaftarTransferPresenter;
import com.bca.smartbranch.presenter.CheckOTPSessionPresenter;
import com.bca.smartbranch.presenter.CheckUserPresenter;
import com.bca.smartbranch.presenter.CheckVersionPresenter;
import com.bca.smartbranch.presenter.CountriesORPresenter;
import com.bca.smartbranch.presenter.CountryStatePresenter;
import com.bca.smartbranch.presenter.CreateQueueReservationPresenter;
import com.bca.smartbranch.presenter.CreateReservationPresenter;
import com.bca.smartbranch.presenter.CurrenciesORPresenter;
import com.bca.smartbranch.presenter.DaftarPemilikSumberDanaPresenter;
import com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter;
import com.bca.smartbranch.presenter.DaftarTransferLoadDataORPresenter;
import com.bca.smartbranch.presenter.DaftarTransferPresenter;
import com.bca.smartbranch.presenter.DaftarTransferSetunFromUbahReservasiPresenter;
import com.bca.smartbranch.presenter.DeleteTxnBerkalaDraftPresenter;
import com.bca.smartbranch.presenter.DeleteTxnBerkalaPresenter;
import com.bca.smartbranch.presenter.DeleteUserPresenter;
import com.bca.smartbranch.presenter.DetailTransactionPresenter;
import com.bca.smartbranch.presenter.ForgotEmailPassPresenter;
import com.bca.smartbranch.presenter.GetAcctOpeningCategoryDataPresenter;
import com.bca.smartbranch.presenter.GetAddressPresenter;
import com.bca.smartbranch.presenter.GetAreaPresenter;
import com.bca.smartbranch.presenter.GetAvailableBookingPresenter;
import com.bca.smartbranch.presenter.GetAvailableBookingV2Presenter;
import com.bca.smartbranch.presenter.GetAvailableBranchPresenter;
import com.bca.smartbranch.presenter.GetBankSpecialRelationPresenter;
import com.bca.smartbranch.presenter.GetBranchByCityPresenter;
import com.bca.smartbranch.presenter.GetBranchPresenter;
import com.bca.smartbranch.presenter.GetBranchROPresenter;
import com.bca.smartbranch.presenter.GetCategoriesORPresenter;
import com.bca.smartbranch.presenter.GetCategoryPresenter;
import com.bca.smartbranch.presenter.GetCitySearchPresenter;
import com.bca.smartbranch.presenter.GetCountriesPresenter;
import com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter;
import com.bca.smartbranch.presenter.GetCurrenciesBNPresenter;
import com.bca.smartbranch.presenter.GetCustAcctListPresenter;
import com.bca.smartbranch.presenter.GetCustDataPresenter;
import com.bca.smartbranch.presenter.GetDaftarDetailPekerjaanPresenter;
import com.bca.smartbranch.presenter.GetDaftarPekerjaanPresenter;
import com.bca.smartbranch.presenter.GetEstimasiReservasiPresenter;
import com.bca.smartbranch.presenter.GetFundPurposePresenter;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.GetIdentityPresenter;
import com.bca.smartbranch.presenter.GetPPUNumberPresenter;
import com.bca.smartbranch.presenter.GetRatePresenter;
import com.bca.smartbranch.presenter.GetTxnBerkalaDetailPresenter;
import com.bca.smartbranch.presenter.GetTxnTellerDetailKUPresenter;
import com.bca.smartbranch.presenter.GetTxnTellerDetailPresenter;
import com.bca.smartbranch.presenter.InquiryBankByBICPresenter;
import com.bca.smartbranch.presenter.InquiryEditDataORPresenter;
import com.bca.smartbranch.presenter.InquiryLoadDataBTPresenter;
import com.bca.smartbranch.presenter.InquiryLoadDataSetunPresenter;
import com.bca.smartbranch.presenter.KategoriTujuanTransaksiORPresenter;
import com.bca.smartbranch.presenter.KliringPresenter;
import com.bca.smartbranch.presenter.LoginFingerprintPresenter;
import com.bca.smartbranch.presenter.LoginPresenter;
import com.bca.smartbranch.presenter.OcrPresenter;
import com.bca.smartbranch.presenter.RateTransactionPresenter;
import com.bca.smartbranch.presenter.ReRegistrationPresenter;
import com.bca.smartbranch.presenter.RegistrationPresenter;
import com.bca.smartbranch.presenter.RequestOTPPresenter;
import com.bca.smartbranch.presenter.RescheduleReservationPresenter;
import com.bca.smartbranch.presenter.RescheduleReservationV2Presenter;
import com.bca.smartbranch.presenter.ReservasiListChosenPresenter;
import com.bca.smartbranch.presenter.ResetAccountPresenter;
import com.bca.smartbranch.presenter.RootDetectorPresenter;
import com.bca.smartbranch.presenter.SaveToEformPresenter;
import com.bca.smartbranch.presenter.SendEmailActPresenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.bca.smartbranch.presenter.SubmitBankNotesPresenter;
import com.bca.smartbranch.presenter.SubmitKliringCompletePresenter;
import com.bca.smartbranch.presenter.TransactionCountPresenter;
import com.bca.smartbranch.presenter.TransactionPresenter;
import com.bca.smartbranch.presenter.TujuanTransaksiORPresenter;
import com.bca.smartbranch.presenter.TxnTellerPresenter;
import com.bca.smartbranch.presenter.UpdateDeleteDaftarPemilikSumberDanaPresenter;
import com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter;
import com.bca.smartbranch.presenter.UpdatePINPresenter;
import com.bca.smartbranch.presenter.UpdateProfilePresenter;
import com.bca.smartbranch.presenter.UpdateReceiverDataPresenter;
import com.bca.smartbranch.presenter.UpdateTxnTellerDetailPresenter;
import com.bca.smartbranch.presenter.UpdateTxnTellerKUDetailPresenter;
import com.bca.smartbranch.presenter.UpdateTxnTellerSetunDetailPresenter;
import com.bca.smartbranch.presenter.VTandFAPresenter;
import com.bca.smartbranch.presenter.VerifyOTPPresenter;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
/* loaded from: classes-dex2jar.jar:o/setAnnualFeeBasicAmount.class */
public final class setAnnualFeeBasicAmount implements setBenefit {
    private Page6JLFragment_ViewBinding<HttpUrl> a;
    private Page6JLFragment_ViewBinding<Application> b;
    private Page6JLFragment_ViewBinding<setIncomeDisplayAmount> c;
    private Page6JLFragment_ViewBinding<Retrofit> d;
    private Page6JLFragment_ViewBinding<OkHttpClient> e;
    private Page6JLFragment_ViewBinding<SharedPreferences.Editor> h;
    private Page6JLFragment_ViewBinding<SharedPreferences> i;

    /* loaded from: classes-dex2jar.jar:o/setAnnualFeeBasicAmount$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        public AppModule b;
        public DataModule c;
        public NetworkModule d;

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    private setAnnualFeeBasicAmount(AppModule appModule, NetworkModule networkModule, DataModule dataModule) {
        Page6JLFragment_ViewBinding<Application> a = OR6ReviewFragment_ViewBinding.a(new setCardCode(appModule));
        this.b = a;
        Page6JLFragment_ViewBinding<SharedPreferences> a2 = OR6ReviewFragment_ViewBinding.a(new setCardName(dataModule, a));
        this.i = a2;
        this.h = OR6ReviewFragment_ViewBinding.a(new setAnnualFeeBasicDisplayAmount(dataModule, a2));
        this.a = OR6ReviewFragment_ViewBinding.a(new setCardID(networkModule));
        Page6JLFragment_ViewBinding<OkHttpClient> a3 = OR6ReviewFragment_ViewBinding.a(new setCardImagePath(networkModule));
        this.e = a3;
        Page6JLFragment_ViewBinding<Retrofit> a4 = OR6ReviewFragment_ViewBinding.a(new setCardGroupType(networkModule, this.a, a3));
        this.d = a4;
        this.c = OR6ReviewFragment_ViewBinding.a(new setCardImageOrientation(networkModule, a4));
    }

    public /* synthetic */ setAnnualFeeBasicAmount(AppModule appModule, NetworkModule networkModule, DataModule dataModule, byte b) {
        this(appModule, networkModule, dataModule);
    }

    @Override // o.setBenefit
    public final void a(LoginSessionActivity loginSessionActivity) {
        ((BaseActivityPreLogin) loginSessionActivity).sharedPreferences = this.i.c();
        loginSessionActivity.editor = this.h.c();
        loginSessionActivity.sharedPreferences = this.i.c();
    }

    @Override // o.setBenefit
    public final void a(SyaratKetentuanActivity syaratKetentuanActivity) {
        syaratKetentuanActivity.sharedPreferences = this.i.c();
        syaratKetentuanActivity.editor = this.h.c();
        syaratKetentuanActivity.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(ApplyCCPresenter applyCCPresenter) {
        applyCCPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(BankListPresenter bankListPresenter) {
        bankListPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(BeneficiaryBankDetailPresenter beneficiaryBankDetailPresenter) {
        beneficiaryBankDetailPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(CheckCutOffPresenter checkCutOffPresenter) {
        checkCutOffPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(CheckDaftarTransferORPresenter checkDaftarTransferORPresenter) {
        checkDaftarTransferORPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(CurrenciesORPresenter currenciesORPresenter) {
        currenciesORPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(DaftarTransferLoadDataORPresenter daftarTransferLoadDataORPresenter) {
        daftarTransferLoadDataORPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(DaftarTransferPresenter daftarTransferPresenter) {
        daftarTransferPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(GetAreaPresenter getAreaPresenter) {
        getAreaPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(GetCreditCardOptionsPresenter getCreditCardOptionsPresenter) {
        getCreditCardOptionsPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(GetCustAcctListPresenter getCustAcctListPresenter) {
        getCustAcctListPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(GetRatePresenter getRatePresenter) {
        getRatePresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(InquiryBankByBICPresenter inquiryBankByBICPresenter) {
        inquiryBankByBICPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(KategoriTujuanTransaksiORPresenter kategoriTujuanTransaksiORPresenter) {
        kategoriTujuanTransaksiORPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(OcrPresenter ocrPresenter) {
        ocrPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(ReRegistrationPresenter reRegistrationPresenter) {
        reRegistrationPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(RequestOTPPresenter requestOTPPresenter) {
        requestOTPPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(SubmitKliringCompletePresenter submitKliringCompletePresenter) {
        submitKliringCompletePresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(UpdateDeleteDaftarPemilikSumberDanaPresenter updateDeleteDaftarPemilikSumberDanaPresenter) {
        updateDeleteDaftarPemilikSumberDanaPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(UpdatePINPresenter updatePINPresenter) {
        updatePINPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void a(UpdateProfilePresenter updateProfilePresenter) {
        updateProfilePresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(BaseActivityPreLogin baseActivityPreLogin) {
        baseActivityPreLogin.sharedPreferences = this.i.c();
    }

    @Override // o.setBenefit
    public final void b(DetailBerhasilNotificationActivity detailBerhasilNotificationActivity) {
        detailBerhasilNotificationActivity.sharedPreferences = this.i.c();
        detailBerhasilNotificationActivity.editor = this.h.c();
    }

    @Override // o.setBenefit
    public final void b(LoginActivity loginActivity) {
        ((BaseActivityPreLogin) loginActivity).sharedPreferences = this.i.c();
        loginActivity.editor = this.h.c();
        loginActivity.sharedPreferences = this.i.c();
    }

    @Override // o.setBenefit
    public final void b(ProfileActivity profileActivity) {
        profileActivity.sharedPreferences = this.i.c();
        profileActivity.editor = this.h.c();
        profileActivity.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(BaseDialog baseDialog) {
        baseDialog.sharedPreferences = this.i.c();
    }

    @Override // o.setBenefit
    public final void b(AdminFeesPresenter adminFeesPresenter) {
        adminFeesPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(BeneficiaryBankPresenter beneficiaryBankPresenter) {
        beneficiaryBankPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(CategoriesKUPresenter categoriesKUPresenter) {
        categoriesKUPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(CheckUserPresenter checkUserPresenter) {
        checkUserPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(CheckVersionPresenter checkVersionPresenter) {
        checkVersionPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(CreateQueueReservationPresenter createQueueReservationPresenter) {
        createQueueReservationPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(DaftarPemilikSumberDanaPresenter daftarPemilikSumberDanaPresenter) {
        daftarPemilikSumberDanaPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(DaftarTransferBerkalaPresenter daftarTransferBerkalaPresenter) {
        daftarTransferBerkalaPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(DaftarTransferSetunFromUbahReservasiPresenter daftarTransferSetunFromUbahReservasiPresenter) {
        daftarTransferSetunFromUbahReservasiPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(DeleteTxnBerkalaDraftPresenter deleteTxnBerkalaDraftPresenter) {
        deleteTxnBerkalaDraftPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(GetAddressPresenter getAddressPresenter) {
        getAddressPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(GetAvailableBookingPresenter getAvailableBookingPresenter) {
        getAvailableBookingPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(GetAvailableBookingV2Presenter getAvailableBookingV2Presenter) {
        getAvailableBookingV2Presenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(GetCategoriesORPresenter getCategoriesORPresenter) {
        getCategoriesORPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(GetCategoryPresenter getCategoryPresenter) {
        getCategoryPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(GetCurrenciesBNPresenter getCurrenciesBNPresenter) {
        getCurrenciesBNPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(GetEstimasiReservasiPresenter getEstimasiReservasiPresenter) {
        getEstimasiReservasiPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(GetFundPurposePresenter getFundPurposePresenter) {
        getFundPurposePresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(GetHBPresenter getHBPresenter) {
        getHBPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(RescheduleReservationV2Presenter rescheduleReservationV2Presenter) {
        rescheduleReservationV2Presenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(ReservasiListChosenPresenter reservasiListChosenPresenter) {
        reservasiListChosenPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(ResetAccountPresenter resetAccountPresenter) {
        resetAccountPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(SendEmailActPresenter sendEmailActPresenter) {
        sendEmailActPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void b(UpdateDeleteDaftarTransferPresenter updateDeleteDaftarTransferPresenter) {
        updateDeleteDaftarTransferPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(BaseActivityPostLogin baseActivityPostLogin) {
        baseActivityPostLogin.sharedPreferences = this.i.c();
        baseActivityPostLogin.editor = this.h.c();
    }

    @Override // o.setBenefit
    public final void c(BaseActivityPostLoginKotlin baseActivityPostLoginKotlin) {
        baseActivityPostLoginKotlin.sharedPreferences = this.i.c();
        baseActivityPostLoginKotlin.editor = this.h.c();
    }

    @Override // o.setBenefit
    public final void c(BaseFragment baseFragment) {
        baseFragment.sharedPreferences = this.i.c();
        baseFragment.editor = this.h.c();
    }

    @Override // o.setBenefit
    public final void c(ActivateEChannelPresenter activateEChannelPresenter) {
        activateEChannelPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(GetAcctOpeningCategoryDataPresenter getAcctOpeningCategoryDataPresenter) {
        getAcctOpeningCategoryDataPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(GetAvailableBranchPresenter getAvailableBranchPresenter) {
        getAvailableBranchPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(GetBranchPresenter getBranchPresenter) {
        getBranchPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(GetCitySearchPresenter getCitySearchPresenter) {
        getCitySearchPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(GetCustDataPresenter getCustDataPresenter) {
        getCustDataPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(GetIdentityPresenter getIdentityPresenter) {
        getIdentityPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(GetTxnTellerDetailPresenter getTxnTellerDetailPresenter) {
        getTxnTellerDetailPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter) {
        inquiryLoadDataBTPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(LoginPresenter loginPresenter) {
        loginPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(RateTransactionPresenter rateTransactionPresenter) {
        rateTransactionPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(RegistrationPresenter registrationPresenter) {
        registrationPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(RootDetectorPresenter rootDetectorPresenter) {
        rootDetectorPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter) {
        sendEmailTransactionSuccessPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(SubmitBankNotesPresenter submitBankNotesPresenter) {
        submitBankNotesPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(TxnTellerPresenter txnTellerPresenter) {
        txnTellerPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void c(VTandFAPresenter vTandFAPresenter) {
        vTandFAPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(App app) {
        app.sharedPreferences = this.i.c();
        app.editor = this.h.c();
    }

    @Override // o.setBenefit
    public final void d(LandingActivity landingActivity) {
        landingActivity.sharedPreferences = this.i.c();
        landingActivity.editor = this.h.c();
    }

    @Override // o.setBenefit
    public final void d(MainActivity mainActivity) {
        mainActivity.sharedPreferences = this.i.c();
        mainActivity.editor = this.h.c();
        mainActivity.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(BranchDetailPresenter branchDetailPresenter) {
        branchDetailPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(CancelReservationPresenter cancelReservationPresenter) {
        cancelReservationPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(CancelTundaPresenter cancelTundaPresenter) {
        cancelTundaPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(CheckCCValidApplicantPresenter checkCCValidApplicantPresenter) {
        checkCCValidApplicantPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(CountriesORPresenter countriesORPresenter) {
        countriesORPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(CountryStatePresenter countryStatePresenter) {
        countryStatePresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(DeleteTxnBerkalaPresenter deleteTxnBerkalaPresenter) {
        deleteTxnBerkalaPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(DeleteUserPresenter deleteUserPresenter) {
        deleteUserPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(ForgotEmailPassPresenter forgotEmailPassPresenter) {
        forgotEmailPassPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(GetBankSpecialRelationPresenter getBankSpecialRelationPresenter) {
        getBankSpecialRelationPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(GetBranchROPresenter getBranchROPresenter) {
        getBranchROPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(GetDaftarDetailPekerjaanPresenter getDaftarDetailPekerjaanPresenter) {
        getDaftarDetailPekerjaanPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(GetTxnBerkalaDetailPresenter getTxnBerkalaDetailPresenter) {
        getTxnBerkalaDetailPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(GetTxnTellerDetailKUPresenter getTxnTellerDetailKUPresenter) {
        getTxnTellerDetailKUPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter) {
        inquiryLoadDataSetunPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(KliringPresenter kliringPresenter) {
        kliringPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(LoginFingerprintPresenter loginFingerprintPresenter) {
        loginFingerprintPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(SaveToEformPresenter saveToEformPresenter) {
        saveToEformPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(TransactionCountPresenter transactionCountPresenter) {
        transactionCountPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(UpdateReceiverDataPresenter updateReceiverDataPresenter) {
        updateReceiverDataPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(UpdateTxnTellerDetailPresenter updateTxnTellerDetailPresenter) {
        updateTxnTellerDetailPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(UpdateTxnTellerSetunDetailPresenter updateTxnTellerSetunDetailPresenter) {
        updateTxnTellerSetunDetailPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void d(VerifyOTPPresenter verifyOTPPresenter) {
        verifyOTPPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(TransactionActivity transactionActivity) {
        transactionActivity.sharedPreferences = this.i.c();
        transactionActivity.editor = this.h.c();
        transactionActivity.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(BaseFragmentKotlin baseFragmentKotlin) {
        baseFragmentKotlin.sharedPreferences = this.i.c();
        baseFragmentKotlin.editor = this.h.c();
    }

    @Override // o.setBenefit
    public final void e(AccountOpeningPresenter accountOpeningPresenter) {
        accountOpeningPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(CheckCISNPresenter checkCISNPresenter) {
        checkCISNPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(CheckDaftarTransferPresenter checkDaftarTransferPresenter) {
        checkDaftarTransferPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(CheckOTPSessionPresenter checkOTPSessionPresenter) {
        checkOTPSessionPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(CreateReservationPresenter createReservationPresenter) {
        createReservationPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(DetailTransactionPresenter detailTransactionPresenter) {
        detailTransactionPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(GetBranchByCityPresenter getBranchByCityPresenter) {
        getBranchByCityPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(GetCountriesPresenter getCountriesPresenter) {
        getCountriesPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter) {
        getDaftarPekerjaanPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(GetPPUNumberPresenter getPPUNumberPresenter) {
        getPPUNumberPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(InquiryEditDataORPresenter inquiryEditDataORPresenter) {
        inquiryEditDataORPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(RescheduleReservationPresenter rescheduleReservationPresenter) {
        rescheduleReservationPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(TransactionPresenter transactionPresenter) {
        transactionPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(TujuanTransaksiORPresenter tujuanTransaksiORPresenter) {
        tujuanTransaksiORPresenter.apiService = this.c.c();
    }

    @Override // o.setBenefit
    public final void e(UpdateTxnTellerKUDetailPresenter updateTxnTellerKUDetailPresenter) {
        updateTxnTellerKUDetailPresenter.apiService = this.c.c();
    }
}
