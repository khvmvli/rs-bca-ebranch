package o;

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
@onChooseValueDescPekerjaan
/* loaded from: classes-dex2jar.jar:o/setBenefit.class */
public interface setBenefit {
    void a(LoginSessionActivity loginSessionActivity);

    void a(SyaratKetentuanActivity syaratKetentuanActivity);

    void a(ApplyCCPresenter applyCCPresenter);

    void a(BankListPresenter bankListPresenter);

    void a(BeneficiaryBankDetailPresenter beneficiaryBankDetailPresenter);

    void a(CheckCutOffPresenter checkCutOffPresenter);

    void a(CheckDaftarTransferORPresenter checkDaftarTransferORPresenter);

    void a(CurrenciesORPresenter currenciesORPresenter);

    void a(DaftarTransferLoadDataORPresenter daftarTransferLoadDataORPresenter);

    void a(DaftarTransferPresenter daftarTransferPresenter);

    void a(GetAreaPresenter getAreaPresenter);

    void a(GetCreditCardOptionsPresenter getCreditCardOptionsPresenter);

    void a(GetCustAcctListPresenter getCustAcctListPresenter);

    void a(GetRatePresenter getRatePresenter);

    void a(InquiryBankByBICPresenter inquiryBankByBICPresenter);

    void a(KategoriTujuanTransaksiORPresenter kategoriTujuanTransaksiORPresenter);

    void a(OcrPresenter ocrPresenter);

    void a(ReRegistrationPresenter reRegistrationPresenter);

    void a(RequestOTPPresenter requestOTPPresenter);

    void a(SubmitKliringCompletePresenter submitKliringCompletePresenter);

    void a(UpdateDeleteDaftarPemilikSumberDanaPresenter updateDeleteDaftarPemilikSumberDanaPresenter);

    void a(UpdatePINPresenter updatePINPresenter);

    void a(UpdateProfilePresenter updateProfilePresenter);

    void b(BaseActivityPreLogin baseActivityPreLogin);

    void b(DetailBerhasilNotificationActivity detailBerhasilNotificationActivity);

    void b(LoginActivity loginActivity);

    void b(ProfileActivity profileActivity);

    void b(BaseDialog baseDialog);

    void b(AdminFeesPresenter adminFeesPresenter);

    void b(BeneficiaryBankPresenter beneficiaryBankPresenter);

    void b(CategoriesKUPresenter categoriesKUPresenter);

    void b(CheckUserPresenter checkUserPresenter);

    void b(CheckVersionPresenter checkVersionPresenter);

    void b(CreateQueueReservationPresenter createQueueReservationPresenter);

    void b(DaftarPemilikSumberDanaPresenter daftarPemilikSumberDanaPresenter);

    void b(DaftarTransferBerkalaPresenter daftarTransferBerkalaPresenter);

    void b(DaftarTransferSetunFromUbahReservasiPresenter daftarTransferSetunFromUbahReservasiPresenter);

    void b(DeleteTxnBerkalaDraftPresenter deleteTxnBerkalaDraftPresenter);

    void b(GetAddressPresenter getAddressPresenter);

    void b(GetAvailableBookingPresenter getAvailableBookingPresenter);

    void b(GetAvailableBookingV2Presenter getAvailableBookingV2Presenter);

    void b(GetCategoriesORPresenter getCategoriesORPresenter);

    void b(GetCategoryPresenter getCategoryPresenter);

    void b(GetCurrenciesBNPresenter getCurrenciesBNPresenter);

    void b(GetEstimasiReservasiPresenter getEstimasiReservasiPresenter);

    void b(GetFundPurposePresenter getFundPurposePresenter);

    void b(GetHBPresenter getHBPresenter);

    void b(RescheduleReservationV2Presenter rescheduleReservationV2Presenter);

    void b(ReservasiListChosenPresenter reservasiListChosenPresenter);

    void b(ResetAccountPresenter resetAccountPresenter);

    void b(SendEmailActPresenter sendEmailActPresenter);

    void b(UpdateDeleteDaftarTransferPresenter updateDeleteDaftarTransferPresenter);

    void c(BaseActivityPostLogin baseActivityPostLogin);

    void c(BaseActivityPostLoginKotlin baseActivityPostLoginKotlin);

    void c(BaseFragment baseFragment);

    void c(ActivateEChannelPresenter activateEChannelPresenter);

    void c(GetAcctOpeningCategoryDataPresenter getAcctOpeningCategoryDataPresenter);

    void c(GetAvailableBranchPresenter getAvailableBranchPresenter);

    void c(GetBranchPresenter getBranchPresenter);

    void c(GetCitySearchPresenter getCitySearchPresenter);

    void c(GetCustDataPresenter getCustDataPresenter);

    void c(GetIdentityPresenter getIdentityPresenter);

    void c(GetTxnTellerDetailPresenter getTxnTellerDetailPresenter);

    void c(InquiryLoadDataBTPresenter inquiryLoadDataBTPresenter);

    void c(LoginPresenter loginPresenter);

    void c(RateTransactionPresenter rateTransactionPresenter);

    void c(RegistrationPresenter registrationPresenter);

    void c(RootDetectorPresenter rootDetectorPresenter);

    void c(SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter);

    void c(SubmitBankNotesPresenter submitBankNotesPresenter);

    void c(TxnTellerPresenter txnTellerPresenter);

    void c(VTandFAPresenter vTandFAPresenter);

    void d(App app);

    void d(LandingActivity landingActivity);

    void d(MainActivity mainActivity);

    void d(BranchDetailPresenter branchDetailPresenter);

    void d(CancelReservationPresenter cancelReservationPresenter);

    void d(CancelTundaPresenter cancelTundaPresenter);

    void d(CheckCCValidApplicantPresenter checkCCValidApplicantPresenter);

    void d(CountriesORPresenter countriesORPresenter);

    void d(CountryStatePresenter countryStatePresenter);

    void d(DeleteTxnBerkalaPresenter deleteTxnBerkalaPresenter);

    void d(DeleteUserPresenter deleteUserPresenter);

    void d(ForgotEmailPassPresenter forgotEmailPassPresenter);

    void d(GetBankSpecialRelationPresenter getBankSpecialRelationPresenter);

    void d(GetBranchROPresenter getBranchROPresenter);

    void d(GetDaftarDetailPekerjaanPresenter getDaftarDetailPekerjaanPresenter);

    void d(GetTxnBerkalaDetailPresenter getTxnBerkalaDetailPresenter);

    void d(GetTxnTellerDetailKUPresenter getTxnTellerDetailKUPresenter);

    void d(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter);

    void d(KliringPresenter kliringPresenter);

    void d(LoginFingerprintPresenter loginFingerprintPresenter);

    void d(SaveToEformPresenter saveToEformPresenter);

    void d(TransactionCountPresenter transactionCountPresenter);

    void d(UpdateReceiverDataPresenter updateReceiverDataPresenter);

    void d(UpdateTxnTellerDetailPresenter updateTxnTellerDetailPresenter);

    void d(UpdateTxnTellerSetunDetailPresenter updateTxnTellerSetunDetailPresenter);

    void d(VerifyOTPPresenter verifyOTPPresenter);

    void e(TransactionActivity transactionActivity);

    void e(BaseFragmentKotlin baseFragmentKotlin);

    void e(AccountOpeningPresenter accountOpeningPresenter);

    void e(CheckCISNPresenter checkCISNPresenter);

    void e(CheckDaftarTransferPresenter checkDaftarTransferPresenter);

    void e(CheckOTPSessionPresenter checkOTPSessionPresenter);

    void e(CreateReservationPresenter createReservationPresenter);

    void e(DetailTransactionPresenter detailTransactionPresenter);

    void e(GetBranchByCityPresenter getBranchByCityPresenter);

    void e(GetCountriesPresenter getCountriesPresenter);

    void e(GetDaftarPekerjaanPresenter getDaftarPekerjaanPresenter);

    void e(GetPPUNumberPresenter getPPUNumberPresenter);

    void e(InquiryEditDataORPresenter inquiryEditDataORPresenter);

    void e(RescheduleReservationPresenter rescheduleReservationPresenter);

    void e(TransactionPresenter transactionPresenter);

    void e(TujuanTransaksiORPresenter tujuanTransaksiORPresenter);

    void e(UpdateTxnTellerKUDetailPresenter updateTxnTellerKUDetailPresenter);
}
