package o;

import com.bca.smartbranch.data.api.request.TxnTellerRequest;
import com.bca.smartbranch.data.api.request.UpdateTxnTellerDetailRequest;
import com.bca.smartbranch.data.api.request.UpdateTxnTellerKUDetailRequest;
import com.bca.smartbranch.data.api.request.UpdateTxnTellerSetunDetailRequest;
import com.bca.smartbranch.data.api.response.AccountOpeningResponse;
import com.bca.smartbranch.data.api.response.ActivateEChannelResponse;
import com.bca.smartbranch.data.api.response.BeneficiaryBankResponse;
import com.bca.smartbranch.data.api.response.CISNResponse;
import com.bca.smartbranch.data.api.response.CategoriesORResponse;
import com.bca.smartbranch.data.api.response.CreateQueueReservationResponse;
import com.bca.smartbranch.data.api.response.CreateReservationResponse;
import com.bca.smartbranch.data.api.response.CustDataResponse;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.DetailTransactionResponse;
import com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse;
import com.bca.smartbranch.data.api.response.GetBranchROResponse;
import com.bca.smartbranch.data.api.response.GetBranchReservationResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.api.response.GetDaftarPekerjaanResponse;
import com.bca.smartbranch.data.api.response.GetPPUNumberResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailKUResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
import com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse;
import com.bca.smartbranch.data.api.response.StockListBNResponse;
import com.bca.smartbranch.data.api.response.SubmitBankNotesResponse;
import com.bca.smartbranch.data.api.response.TujuanTransaksiORResponse;
import com.bca.smartbranch.data.api.response.TxnTellerResponse;
import com.bca.smartbranch.data.api.response.UpdateRefNumberResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
/* loaded from: classes-dex2jar.jar:o/setIncomeDisplayAmount.class */
public interface setIncomeDisplayAmount {
    @GET("SBModules/GetCreditCardOptions")
    Call<OpenAccountSuccessActivity<clikedKartuHilang>> a();

    @GET("SBModules/omni/ku/admin-fees")
    Call<OpenAccountSuccessActivity<onClickDetail>> a(@Header("beta") String str);

    @GET("SBModules/omni/eform/categories/{category-code}")
    Call<OpenAccountSuccessActivity<CategoriesORResponse>> a(@Header("beta") String str, @Path("category-code") String str2);

    @GET("SBModules/omni/administration/source-account-owner-list")
    Call<OpenAccountSuccessActivity<detailBCAFullPayment>> a(@Header("beta") String str, @Query("type") String str2, @Query("page") Integer num, @Query("size") Integer num2, @Query("keyword") String str3, @Query("keyword-type") String str4, @Query("id-type") String str5);

    @GET("SBModules/omni/reservation/v2/branches")
    Call<OpenAccountSuccessActivity<GetBranchROResponse>> a(@Header("beta") String str, @Query("city") String str2, @Query("branch-type") String str3);

    @POST("SBModules/omni/eform/resend-email")
    Call<OpenAccountSuccessActivity<Object>> a(@Header("beta") String str, @Header("email") String str2, @Body LoginSessionActivity loginSessionActivity);

    @PUT("SBModules/omni/administration/source-account-owner-list")
    Call<OpenAccountSuccessActivity<Object>> a(@Header("beta") String str, @Body onChooseMenueBranchEvent onchoosemenuebranchevent);

    @POST("SBModules/CheckVersion")
    Call<OpenAccountSuccessActivity<OpenCCSuccessActivity>> a(@Body HapusTransaksiBerkalaActivity hapusTransaksiBerkalaActivity);

    @HTTP(hasBody = true, method = "DELETE", path = "SBModules/DeleteUser")
    Call<OpenAccountSuccessActivity<Object>> a(@Body InfoDocumentUnderlyingActivity_ViewBinding infoDocumentUnderlyingActivity_ViewBinding);

    @POST("SBModules/GetAvailableBookingTime")
    Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding>> a(@Body InfoFullAmountORActivity_ViewBinding infoFullAmountORActivity_ViewBinding);

    @POST("SBModules/AccountOpening/v3")
    Call<OpenAccountSuccessActivity<AccountOpeningResponse>> a(@Body cancelPicture cancelpicture);

    @POST("SBModules/UpdatePINV2")
    Call<OpenAccountSuccessActivity<Object>> a(@Body chooseReservasiCS choosereservasics);

    @POST("SBModules/omni/accounts/login")
    Call<OpenAccountSuccessActivity<onChooseUlangi>> a(@Body login login);

    @POST("SBModules/UpdateTxnTellerDetail")
    Call<OpenAccountSuccessActivity<Object>> b(@Body UpdateTxnTellerDetailRequest updateTxnTellerDetailRequest);

    @GET("SBModules/omni/ors/countries")
    Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity>> b(@Header("beta") String str);

    @GET("SBModules/omni/ors/countries/states")
    Call<OpenAccountSuccessActivity<detailLCS>> b(@Query("country") String str, @Header("beta") String str2);

    @GET("SBModules/omni/administration/verified-account-list")
    Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> b(@Header("beta") String str, @Header("email") String str2, @Query("type") String str3);

    @HTTP(hasBody = true, method = "DELETE", path = "SBModules/omni/administration/transfer-list")
    Call<OpenAccountSuccessActivity<Object>> b(@Header("beta") String str, @Query("type") String str2, @Body InfoBankingtActivity infoBankingtActivity);

    @POST("SBModules/CheckCCValidApplicant")
    Call<OpenAccountSuccessActivity<Object>> b(@Body FotoActivity_ViewBinding fotoActivity_ViewBinding);

    @POST("SBModules/CreateReservation")
    Call<OpenAccountSuccessActivity<CreateReservationResponse>> b(@Body InfoBiayaActivity_ViewBinding infoBiayaActivity_ViewBinding);

    @POST("SBModules/GetBranchReservation")
    Call<OpenAccountSuccessActivity<GetBranchReservationResponse>> b(@Body InfoJenisKartuActivity infoJenisKartuActivity);

    @POST("SBModules/Reregistration")
    Call<OpenAccountSuccessActivity<Object>> b(@Body LandingActivity landingActivity);

    @POST("SBModules/SendEmailReservationSuccess")
    Call<OpenAccountSuccessActivity<Object>> b(@Body LoginSessionActivity_ViewBinding loginSessionActivity_ViewBinding);

    @POST("SBModules/banknotes/VerifyOTP")
    Call<OpenAccountSuccessActivity> b(@Body NoAtmEChannelActivity_ViewBinding noAtmEChannelActivity_ViewBinding);

    @POST("SBModules/RescheduleReservationV2")
    Call<OpenAccountSuccessActivity<CreateQueueReservationResponse>> b(@Body onAddFingerPrintSuccess onaddfingerprintsuccess);

    @POST("SBModules/SaveToEform")
    Call<OpenAccountSuccessActivity<onChooseBankPenerbit>> b(@Body onOpenFingerprintDialog onopenfingerprintdialog);

    @GET("SBModules/banknotes/CheckCutoff")
    Call<OpenAccountSuccessActivity> c();

    @GET("SBModules/omni/reservation/v2/branches-city")
    Call<OpenAccountSuccessActivity<PenggantianKartuATMActivity_ViewBinding>> c(@Header("beta") String str);

    @GET("SBModules/omni/ors/beneficiary-bank/detail/{bank-id}")
    Call<OpenAccountSuccessActivity<OpenAccountSuccessActivity_ViewBinding>> c(@Header("beta") String str, @Path("bank-id") String str2);

    @GET("SBModules/omni/eform/categories/{type}")
    Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity_ViewBinding>> c(@Header("beta") String str, @Path("type") String str2, @Query("is-map") String str3);

    @PUT("SBModules/omni/eform/teller/ku")
    Call<OpenAccountSuccessActivity<Object>> c(@Header("beta") String str, @Header("email") String str2, @Header("flagGuest") String str3, @Body UpdateTxnTellerKUDetailRequest updateTxnTellerKUDetailRequest);

    @GET("SBModules/omni/administration/transfer-list/check")
    Call<OpenAccountSuccessActivity<Object>> c(@Header("beta") String str, @Header("email") String str2, @Query("type") String str3, @Query("account-number") String str4);

    @GET("SBModules/omni/reservation/v2/branches/nearest")
    Call<OpenAccountSuccessActivity<GetBranchROResponse>> c(@Header("beta") String str, @Query("longitude") String str2, @Query("latitude") String str3, @Query("flag-transaction") String str4, @Query("branch-type") String str5);

    @GET("SBModules/ebranch/address/{toSearch}")
    Call<OpenAccountSuccessActivity<OpenAccountActivity>> c(@Path("toSearch") String str, @QueryMap Map<String, String> map);

    @POST("SBModules/omni/administration/update-profile")
    Call<OpenAccountSuccessActivity<Object>> c(@Header("beta") String str, @Body chooseReservasiTeller choosereservasiteller);

    @POST("SBModules/CancelReservation")
    Call<OpenAccountSuccessActivity<Object>> c(@Body FormUbahTellerActivity_ViewBinding formUbahTellerActivity_ViewBinding);

    @POST("SBModules/ebranch/ActivateEChannel")
    Call<OpenAccountSuccessActivity<ActivateEChannelResponse>> c(@Body FotoActivity fotoActivity);

    @POST("SBModules/CreateQueueReservation")
    Call<OpenAccountSuccessActivity<CreateQueueReservationResponse>> c(@Body HapusTransaksiBerkalaActivity_ViewBinding hapusTransaksiBerkalaActivity_ViewBinding);

    @POST("SBModules/GetEstimatedServiceTime")
    Call<OpenAccountSuccessActivity<detailMultiCurrencyBCA>> c(@Body InfoCodewordORActivity_ViewBinding infoCodewordORActivity_ViewBinding);

    @POST("SBModules/GetAreaReservation")
    Call<OpenAccountSuccessActivity<onChooseMenu>> c(@Body InfoFullAmountORActivity infoFullAmountORActivity);

    @POST("SBModules/GetAvailableBookingTimeV2")
    Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity_ViewBinding>> c(@Body InfoKursORActivity_ViewBinding infoKursORActivity_ViewBinding);

    @POST("SBModules/banknotes/GetRate")
    Call<OpenAccountSuccessActivity<onChooseLanjut>> c(@Body InfoTellerActivity infoTellerActivity);

    @POST("SBModules/ebranch/ocr")
    Call<OpenAccountSuccessActivity<PhotoCardActivity_ViewBinding>> c(@Body InfoValueTodayORActivity_ViewBinding infoValueTodayORActivity_ViewBinding);

    @POST("SBModules/SendEmailAcctOpenSuccess")
    Call<OpenAccountSuccessActivity<Object>> c(@Body LoginSessionActivity_ViewBinding loginSessionActivity_ViewBinding);

    @POST("SBModules/UpdateRefNumber")
    Call<OpenAccountSuccessActivity<UpdateRefNumberResponse>> c(@Body MainActivity_ViewBinding mainActivity_ViewBinding);

    @POST("SBModules/banknotes/UpdateReceiverData")
    Call<OpenAccountSuccessActivity> c(@Body NoAtmEChannelActivity noAtmEChannelActivity);

    @POST("SBModules/ApplyCreditCard")
    Call<OpenAccountSuccessActivity<simpanGallery>> c(@Body cameraCopy cameracopy);

    @POST("SBModules/ebranch/BranchDetail")
    Call<OpenAccountSuccessActivity<OutwardRemittanceFormActivity>> c(@Body capturePic capturepic);

    @POST("SBModules/RescheduleReservation")
    Call<OpenAccountSuccessActivity<CreateReservationResponse>> c(@Body clickedRemember clickedremember);

    @POST("SBModules/RegistrationV2")
    Call<OpenAccountSuccessActivity<Object>> c(@Body forgotPin forgotpin);

    @POST("SBModules/Logout")
    Call<OpenAccountSuccessActivity<Object>> c(@Body signUp signup);

    @GET("SBModules/ebranch/countries")
    Call<OpenAccountSuccessActivity<OpenCCSuccessActivity_ViewBinding>> d();

    @GET("SBModules/omni/ku/bank-domestic/list-bank")
    Call<OpenAccountSuccessActivity<OpenAccountActivity_ViewBinding>> d(@Header("beta") String str);

    @POST("SBModules/omni/eform/teller/v2")
    Call<OpenAccountSuccessActivity<TxnTellerResponse>> d(@Header("beta") String str, @Body TxnTellerRequest txnTellerRequest);

    @GET("SBModules/omni/bank/bank-list")
    Call<OpenAccountSuccessActivity<onClickMenu>> d(@Header("beta") String str, @Query("request-type") String str2);

    @PUT("SBModules/omni/eform/teller/{token}")
    Call<OpenAccountSuccessActivity<Object>> d(@Header("beta") String str, @Path("token") String str2, @Body UpdateTxnTellerSetunDetailRequest updateTxnTellerSetunDetailRequest);

    @GET("SBModules/omni/dates")
    Call<OpenAccountSuccessActivity<clikedKartuRusak>> d(@Header("beta") String str, @Query("start-date") String str2, @Query("end-date") String str3);

    @GET("SBModules/omni/administration/transfer-list/check")
    Call<OpenAccountSuccessActivity<Object>> d(@Header("beta") String str, @Header("email") String str2, @Query("type") String str3, @Query("account-number") String str4, @Query("flag-iban") String str5);

    @POST("SBModules/DeleteTxnBerkalaDraft")
    Call<OpenAccountSuccessActivity<Object>> d(@Body InfoBiayaActivity infoBiayaActivity);

    @POST("SBModules/LoginFingerprint")
    Call<OpenAccountSuccessActivity<onChooseUlangi>> d(@Body InfoValueTodayORActivity infoValueTodayORActivity);

    @POST("SBModules/banknotes/RequestOTP")
    Call<OpenAccountSuccessActivity> d(@Body LandingActivity_ViewBinding landingActivity_ViewBinding);

    @POST("SBModules/RateTransaction")
    Call<OpenAccountSuccessActivity<Object>> d(@Body loginAsGuest loginasguest);

    @GET("SBModules/GetAcctOpeningCategoryData")
    Call<OpenAccountSuccessActivity<GetAcctOpeningCategoryDataResponse>> e();

    @GET("SBModules/GetCategory/{category}")
    Call<OpenAccountSuccessActivity<clikedKeyRusak>> e(@Path("category") String str);

    @GET("SBModules/omni/administration/{id-num}")
    Call<OpenAccountSuccessActivity<CISNResponse>> e(@Header("beta") String str, @Path("id-num") String str2);

    @GET("SBModules/omni/ors/beneficiary-bank/{countrycode}")
    Call<OpenAccountSuccessActivity<BeneficiaryBankResponse>> e(@Header("beta") String str, @Path("countrycode") String str2, @Query("bank-type") String str3);

    @GET("SBModules/omni/history/detail")
    Call<OpenAccountSuccessActivity<DetailTransactionResponse>> e(@Header("beta") String str, @Query("type") String str2, @Query("txn-type") String str3, @Query("no-reff") String str4, @Query("token") String str5);

    @PUT("SBModules/omni/administration/transfer-list")
    Call<OpenAccountSuccessActivity<Object>> e(@Header("beta") String str, @Query("type") String str2, @Body MainActivity mainActivity);

    @HTTP(hasBody = true, method = "DELETE", path = "SBModules/omni/administration/source-account-owner-list")
    Call<OpenAccountSuccessActivity<Object>> e(@Header("beta") String str, @Body onChooseMenueBranchEvent onchoosemenuebranchevent);

    @POST("SBModules/DeleteTxnBerkala")
    Call<OpenAccountSuccessActivity<Object>> e(@Body InfoBankingtActivity_ViewBinding infoBankingtActivity_ViewBinding);

    @POST("SBModules/ForgotPassEmail")
    Call<OpenAccountSuccessActivity<Object>> e(@Body InfoCodewordORActivity infoCodewordORActivity);

    @POST("SBModules/GetHB")
    Call<OpenAccountSuccessActivity<Object>> e(@Body InfoProductORActivity_ViewBinding infoProductORActivity_ViewBinding);

    @POST("SBModules/GetTxnBerkala")
    Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity>> e(@Body InfoPromoORActivity infoPromoORActivity);

    @POST("SBModules/GetTxnBerkalaDetail")
    Call<OpenAccountSuccessActivity<PenggantianKeyBCAActivity_ViewBinding>> e(@Body InfoTellerActivity_ViewBinding infoTellerActivity_ViewBinding);

    @POST("SBModules/root-detection")
    Call<OpenAccountSuccessActivity<Object>> e(@Body LoginActivity loginActivity);

    @POST("SBModules/SendEmailAct")
    Call<OpenAccountSuccessActivity<Object>> e(@Body LoginActivity_ViewBinding loginActivity_ViewBinding);

    @POST("SBModules/CancelTransactionV2")
    Call<OpenAccountSuccessActivity<Object>> e(@Body choosePic choosepic);

    @POST("SBModules/banknotes/GetCustData")
    Call<OpenAccountSuccessActivity<CustDataResponse>> e(@Body fillForm fillform);

    @POST("SBModules/banknotes/CheckOTPSession")
    Call<OpenAccountSuccessActivity> e(@Body retakePicture retakepicture);

    @POST("SBModules/banknotes/CreateBNBuyTxn")
    Call<OpenAccountSuccessActivity<SubmitBankNotesResponse>> e(@Body togglePIN togglepin);

    @PUT("SBModules/omni/administration/reset-account")
    Call<OpenAccountSuccessActivity<Object>> f(@Header("beta") String str);

    @GET("SBModules/omni/eform/categories/tujuan-transaksi-setun")
    Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> f(@Header("beta") String str, @Query("is-map") String str2);

    @GET("SBModules/omni/banknote/v2/branches")
    Call<OpenAccountSuccessActivity<StockListBNResponse>> f(@Query("amount") String str, @Query("denom") String str2, @Header("beta") String str3);

    @GET("SBModules/ebranch/form-category/{category}")
    Call<OpenAccountSuccessActivity<GetDaftarPekerjaanResponse>> g(@Path("category") String str);

    @GET("SBModules/omni/ors/v2/countries/{countrycode}")
    Call<OpenAccountSuccessActivity<OutwardRemittanceFormUbahActivity_ViewBinding>> g(@Path("countrycode") String str, @Header("beta") String str2);

    @GET("SBModules/omni/banknote/denom")
    Call<OpenAccountSuccessActivity<detailKirimanUangNormal>> h(@Header("beta") String str);

    @GET("SBModules/omni/ors/rendy/bank/bic")
    Call<OpenAccountSuccessActivity<PhotoCardActivity>> h(@Header("beta") String str, @Query("bic-code") String str2);

    @GET("SBModules/omni/ors/monalisa/stt")
    Call<OpenAccountSuccessActivity<TujuanTransaksiORResponse>> h(@Header("beta") String str, @Query("category-stt-code") String str2, @Query("stt-code-filter") String str3);

    @GET("SBModules/omni/ors/monalisa/stt-category")
    Call<OpenAccountSuccessActivity<KategoriTujuanTransaksiORResponse>> i(@Header("beta") String str);

    @GET("SBModules/omni/eform/categories/sumber-dana-setun-badan")
    Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> i(@Header("beta") String str, @Query("is-map") String str2);

    @POST("SBModules/omni/ors/ppu")
    Call<OpenAccountSuccessActivity<GetPPUNumberResponse>> j(@Header("beta") String str);

    @GET("SBModules/omni/eform/categories/sumber-dana-setun")
    Call<OpenAccountSuccessActivity<MasterFundSourcePurposeResponse>> j(@Header("beta") String str, @Query("is-map") String str2);

    @GET("SBModules/omni/ors/v2/countries/{countrycode}/currencies/{currencycode}")
    Call<OpenAccountSuccessActivity<PilihBankPenerbitActivity_ViewBinding>> j(@Path("countrycode") String str, @Path("currencycode") String str2, @Header("beta") String str3);

    @GET("SBModules/omni/eform/teller/{token}")
    Call<OpenAccountSuccessActivity<GetTxnTellerDetailResponse>> k(@Header("beta") String str, @Path("token") String str2);

    @GET("SBModules/omni/eform/teller/{token}/ku")
    Call<OpenAccountSuccessActivity<GetTxnTellerDetailKUResponse>> l(@Header("beta") String str, @Path("token") String str2);

    @GET("SBModules/omni/ors/monalisa/stt")
    Call<OpenAccountSuccessActivity<TujuanTransaksiORResponse>> m(@Header("beta") String str, @Query("stt-code") String str2);

    @GET("SBModules/omni/administration/transfer-list")
    Call<OpenAccountSuccessActivity<DaftarTransferResponse>> n(@Header("beta") String str, @Query("type") String str2);

    @GET("SBModules/omni/history")
    Call<OpenAccountSuccessActivity<onTakePicture>> o(@Header("beta") String str, @Query("type") String str2);
}
