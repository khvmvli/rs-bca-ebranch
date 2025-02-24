package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindArray;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.activity.FormBankNotesActivity;
import com.bca.smartbranch.activity.FormSuccessActivity;
import com.bca.smartbranch.activity.PilihKecamatanActivity;
import com.bca.smartbranch.activity.PilihKotaActivity;
import com.bca.smartbranch.activity.PilihNegaraPemrekActivity;
import com.bca.smartbranch.activity.ReRegistrationSuccessActivity;
import com.bca.smartbranch.data.api.response.AccountOpeningResponse;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.dialog.AgamaDialog;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.JenisKartuDialog;
import com.bca.smartbranch.dialog.LimitActivationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.PenghasilanPerTahunDialog;
import com.bca.smartbranch.dialog.SexDilaog;
import com.bca.smartbranch.dialog.StatusNPWPDialog;
import com.bca.smartbranch.dialog.StatusPerkawinanDialog;
import com.bca.smartbranch.dialog.SumberPenghasilanDialog;
import com.bca.smartbranch.dialog.TermConditionDialog;
import com.bca.smartbranch.fragment.Page6PLFragment;
import com.bca.smartbranch.fragment.PenerimaFragment;
import com.bca.smartbranch.presenter.AccountOpeningPresenter;
import com.bca.smartbranch.presenter.CheckUserPresenter;
import com.bca.smartbranch.presenter.ReRegistrationPresenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.facebook.stetho.dumpapp.Framer;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Checked;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import o.AccountOpeningResponse;
import o.AccountOpeningResponse$$Parcelable;
import o.ConfirmSubBCACardAdapter$ViewHolder;
import o.InfoPromoORActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LandingActivity;
import o.ListUtil;
import o.LoginSessionActivity_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OR2PilihProductFragment_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Page6CSFragment;
import o.PilihKelurahanActivity;
import o.PilihKelurahanActivity_ViewBinding;
import o.PilihKodePosActivity;
import o.PilihKodePosActivity_ViewBinding;
import o.PilihNegaraBagianActivity;
import o.PilihNegaraPemrekActivity_ViewBinding;
import o.PilihProvinsiActivity;
import o.PilihTujuanTransaksiORActivity_ViewBinding;
import o.ProfileActivity;
import o.RegistrationActivity;
import o.RegistrationSuccessActivity_ViewBinding;
import o.ReservasiCSOActivity_ViewBinding;
import o.ReservasiListChosenActivity_ViewBinding;
import o.ReservasiSuccessActivity;
import o.ReservasiSuccessAskNextActivity_ViewBinding;
import o.ReservasiTellerSuccessActivity;
import o.ReservasiTellerSuccessActivity_ViewBinding;
import o.ReservasiTundaSuccessActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.cancelPicture;
import o.clickOrangSamaDenganPemilik;
import o.copyWindowDataInto;
import o.documentProvider;
import o.fillNoHp;
import o.getAnnualFeeAddOnAmount;
import o.getAnnualFeeBasicAmount;
import o.getPromotion;
import o.getValue;
import o.lewati;
import o.onChooseBankTujuan;
import o.onChooseKelurahanHome;
import o.onChooseKodePos;
import o.onChooseKodePosKantor;
import o.onChooseKodePosRes;
import o.onChooseKota;
import o.onChooseKotaHome;
import o.onChooseProvinsiHome;
import o.onClickPilih;
import o.onClickPlus;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnHierarchyChangeListener;
import o.setPadding;
import o.setTxnDataOutput;
import o.showInfoValueTodayOR;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6PLFragment.class */
public class Page6PLFragment extends BaseFragment implements AccountOpeningPresenter.read, showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver, Validator.ValidationListener, CheckUserPresenter.RemoteActionCompatParcelizer, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer, ReRegistrationPresenter.write, TextWatcher {
    showInfoValueTodayOR a;
    @BindView(2131296440)
    Button btnProses;
    @Checked(messageResId = 2131820725, sequence = Framer.ENTER_FRAME_PREFIX)
    @BindView(2131296469)
    CheckBox cbxAgree;
    @BindColor(2131099793)
    int colorDataGrey;
    @BindColor(2131099794)
    int colorDataGreyDarker;
    @BindView(2131296966)
    getAnnualFeeAddOnAmount etBidangPekerjaan;
    @BindView(2131297207)
    getAnnualFeeAddOnAmount etBornDate;
    @BindView(2131296967)
    @NotEmpty(messageResId = 2131820753, trim = true)
    getAnnualFeeAddOnAmount etBussinesField;
    @BindView(2131296973)
    getAnnualFeeAddOnAmount etDescPekerjaan;
    @BindView(2131297047)
    getAnnualFeeAddOnAmount etDollarCurrCode;
    @BindView(2131296976)
    getAnnualFeeAddOnAmount etEmail;
    @BindView(2131297045)
    getAnnualFeeAddOnAmount etExpId;
    @BindView(2131296930)
    @NotEmpty(messageResId = 2131820718, trim = true)
    getAnnualFeeAddOnAmount etHouseAddr;
    @BindView(2131296942)
    @NotEmpty(messageResId = 2131820719, trim = true)
    getAnnualFeeAddOnAmount etHouseAddrHome;
    @BindView(2131297035)
    @NotEmpty(messageResId = 2131820761, trim = true)
    getAnnualFeeAddOnAmount etHouseCity;
    @BindView(2131297039)
    @NotEmpty(messageResId = 2131820761, trim = true)
    getAnnualFeeAddOnAmount etHouseCityHome;
    @BindView(2131297023)
    @NotEmpty(messageResId = 2131820978, sequence = 1, trim = true)
    @Length(messageResId = 2131820979, min = 5, sequence = 2)
    getAnnualFeeAddOnAmount etHousePostCode;
    @BindView(2131297026)
    @NotEmpty(messageResId = 2131820978, sequence = 1, trim = true)
    @Length(messageResId = 2131820979, min = 5, sequence = 2)
    getAnnualFeeAddOnAmount etHousePostCodeHome;
    @BindView(2131297162)
    @NotEmpty(messageResId = 2131820981, trim = true)
    getAnnualFeeAddOnAmount etHouseProvince;
    @BindView(2131297163)
    @NotEmpty(messageResId = 2131820981, trim = true)
    getAnnualFeeAddOnAmount etHouseProvinceHome;
    @BindView(2131297168)
    @NotEmpty(messageResId = 2131820987, trim = true)
    getAnnualFeeAddOnAmount etHouseRT;
    @BindView(2131297169)
    @NotEmpty(messageResId = 2131820987, trim = true)
    EditText etHouseRTHome;
    @BindView(2131297171)
    @NotEmpty(messageResId = 2131820988, trim = true)
    getAnnualFeeAddOnAmount etHouseRW;
    @BindView(2131297172)
    @NotEmpty(messageResId = 2131820988, trim = true)
    getAnnualFeeAddOnAmount etHouseRWHome;
    @BindView(2131297012)
    @NotEmpty(messageResId = 2131821005, trim = true)
    getAnnualFeeAddOnAmount etHouseSubDistric;
    @BindView(2131297013)
    @NotEmpty(messageResId = 2131821005, trim = true)
    getAnnualFeeAddOnAmount etHouseSubDistricHome;
    @BindView(2131297015)
    @NotEmpty(messageResId = 2131821029, trim = true)
    getAnnualFeeAddOnAmount etHouseVillage;
    @BindView(2131297016)
    @NotEmpty(messageResId = 2131821029, trim = true)
    getAnnualFeeAddOnAmount etHouseVillageHome;
    @BindView(2131296990)
    getAnnualFeeAddOnAmount etInternetBanking;
    @BindView(2131297003)
    @NotEmpty(messageResId = 2131820818, trim = true)
    EditText etJenisProfesi;
    @BindView(2131297140)
    getAnnualFeeAddOnAmount etJob;
    @BindView(2131297019)
    getAnnualFeeAddOnAmount etKodeArea;
    @BindView(2131297021)
    @NotEmpty(messageResId = 2131820936, trim = true)
    getAnnualFeeAddOnAmount etKodeNegara;
    @BindView(2131297037)
    @NotEmpty(messageResId = 2131820758, trim = true)
    getAnnualFeeAddOnAmount etKotaLahir;
    @BindView(2131296946)
    getAnnualFeeAddOnAmount etLanguage;
    @BindView(2131297197)
    getAnnualFeeAddOnAmount etMaritStatus;
    @BindView(2131297046)
    getAnnualFeeAddOnAmount etMasaBerlakuKitasKitap;
    @BindView(2131297053)
    @NotEmpty(messageResId = 2131820792, sequence = 32, trim = true)
    getAnnualFeeAddOnAmount etMobileBanking;
    @BindView(2131297058)
    @NotEmpty(messageResId = 2131820849, trim = true)
    getAnnualFeeAddOnAmount etMotherName;
    @BindView(2131297060)
    @NotEmpty(messageResId = 2131820856, trim = true)
    EditText etNamaId;
    @BindView(2131297084)
    getAnnualFeeAddOnAmount etNegaraDomisili;
    @BindView(2131297085)
    getAnnualFeeAddOnAmount etNegaraHome;
    @BindView(2131297086)
    getAnnualFeeAddOnAmount etNegaraId;
    @BindView(2131297087)
    getAnnualFeeAddOnAmount etNegaraLahir;
    @BindView(2131297094)
    @NotEmpty(messageResId = 2131820885, trim = true)
    getAnnualFeeAddOnAmount etNoHp;
    @BindView(2131297103)
    getAnnualFeeAddOnAmount etNoId;
    @BindView(2131297105)
    @NotEmpty(messageResId = 2131820828, trim = true)
    getAnnualFeeAddOnAmount etNoKitasKitap;
    @BindView(2131297106)
    @NotEmpty(messageResId = 2131820940, sequence = 17, trim = true)
    @Length(messageResId = 2131820941, min = 16, sequence = 18)
    getAnnualFeeAddOnAmount etNoNPWP;
    @BindView(2131297115)
    getAnnualFeeAddOnAmount etNoTelp;
    @BindView(2131296992)
    @NotEmpty(messageResId = 2131820808, trim = true)
    getAnnualFeeAddOnAmount etOccupation;
    @BindView(2131296931)
    @NotEmpty(messageResId = 2131820955, trim = true)
    getAnnualFeeAddOnAmount etOfficeAddr;
    @BindView(2131297036)
    @NotEmpty(messageResId = 2131820761, trim = true)
    getAnnualFeeAddOnAmount etOfficeCity;
    @BindView(2131297061)
    @NotEmpty(messageResId = 2131820957, trim = true)
    getAnnualFeeAddOnAmount etOfficeName;
    @BindView(2131297024)
    @NotEmpty(messageResId = 2131820978, sequence = 1, trim = true)
    @Length(messageResId = 2131820979, min = 5, sequence = 2)
    getAnnualFeeAddOnAmount etOfficePostCode;
    @BindView(2131297164)
    @Length(messageResId = 2131820981)
    getAnnualFeeAddOnAmount etOfficeProvince;
    @BindView(2131297145)
    getAnnualFeeAddOnAmount etPenghasilan;
    @BindView(2131297146)
    @NotEmpty(messageResId = 2131820807, trim = true)
    EditText etPenghasilanLain;
    @BindView(2131297228)
    getAnnualFeeAddOnAmount etPurposePemRek;
    @BindView(2131296925)
    getAnnualFeeAddOnAmount etReligion;
    @BindView(2131296997)
    getAnnualFeeAddOnAmount etSex;
    @BindView(2131297189)
    getAnnualFeeAddOnAmount etStatusNPWP;
    @BindView(2131297202)
    getAnnualFeeAddOnAmount etSumberPenghasilan;
    @BindView(2131296996)
    getAnnualFeeAddOnAmount etTypeCard;
    @BindView(2131296994)
    getAnnualFeeAddOnAmount etTypeId;
    private AccountOpeningResponse i;
    @BindString(2131820903)
    String invalidHandphoneMessage;
    @BindString(2131820941)
    String invalidNpwpLengthMessage;
    @BindString(2131820943)
    String invalidNpwpOrangtuaEmptyMessage;
    @BindString(2131820944)
    String invalidNpwpOrangtuaLengthMessage;
    @BindString(2131820953)
    String invalidTeleponMessage;
    @BindView(2131297331)
    ImageView ivDataAlamatHome;
    @BindView(2131297332)
    ImageView ivDataAlamatResidence;
    @BindView(2131297334)
    ImageView ivDataDiri;
    @BindView(2131297343)
    ImageView ivDataPekerjaan;
    @BindView(2131297352)
    ImageView ivDataRekening;
    @BindView(2131297365)
    Page6CSFragment ivFotoNpwp;
    @BindArray(2130903070)
    String[] jenisPekerjaan;
    private AccountOpeningPresenter l;
    @BindArray(2130903088)
    String[] listSex;
    @BindView(2131297529)
    LinearLayout llAlamatKantor;
    @BindView(2131297530)
    LinearLayout llAlamatKantorDisabled;
    @BindView(2131297533)
    LinearLayout llBahasaPetunjukDisabled;
    @BindView(2131297551)
    LinearLayout llBidangPekerjaan;
    @BindView(2131297552)
    LinearLayout llBidangPekerjaanWrapper;
    @BindView(2131297553)
    LinearLayout llBidangUsaha;
    @BindView(2131297437)
    FrameLayout llDataAlamatHome;
    @BindView(2131297440)
    FrameLayout llDataAlamatResidence;
    @BindView(2131297447)
    FrameLayout llDataDiri;
    @BindView(2131297462)
    FrameLayout llDataPekerjaan;
    @BindView(2131297476)
    FrameLayout llDataRekening;
    @BindView(2131297619)
    LinearLayout llDescPekerjaan;
    @BindView(2131297620)
    LinearLayout llDescPekerjaanDisabled;
    @BindView(2131297628)
    LinearLayout llEditableIndonesianWrapper;
    @BindView(2131297629)
    LinearLayout llEditableKitasKitapWrapper;
    @BindView(2131297630)
    LinearLayout llEditableNonPasporWrapper;
    @BindView(2131297639)
    LinearLayout llFasilitasBanking;
    @BindView(2131297640)
    LinearLayout llFasilitasKlikBcaDisabled;
    @BindView(2131297641)
    LinearLayout llFasilitasMBcaDisabled;
    @BindView(2131297654)
    LinearLayout llHeaderDataAlamatHome;
    @BindView(2131297655)
    LinearLayout llHeaderDataAlamatResidence;
    @BindView(2131297656)
    LinearLayout llHeaderDataDiri;
    @BindView(2131297664)
    LinearLayout llHeaderDataPekerjaan;
    @BindView(2131297672)
    LinearLayout llHeaderDataRekening;
    @BindView(2131297694)
    LinearLayout llJabatan;
    @BindView(2131297696)
    LinearLayout llJabatanDisabled;
    @BindView(2131297699)
    LinearLayout llJenisKartuAtmDisabled;
    @BindView(2131297702)
    LinearLayout llJenisProfesiDisabled;
    @BindView(2131297712)
    LinearLayout llKecamatanDomisili;
    @BindView(2131297713)
    LinearLayout llKecamatanDomisiliDisabled;
    @BindView(2131297714)
    LinearLayout llKecamatanHome;
    @BindView(2131297715)
    LinearLayout llKecamatanHomeDisabled;
    @BindView(2131297716)
    LinearLayout llKelurahanDomisili;
    @BindView(2131297717)
    LinearLayout llKelurahanDomisiliDisabled;
    @BindView(2131297718)
    LinearLayout llKelurahanDomisiliWrapperDisabled;
    @BindView(2131297719)
    LinearLayout llKelurahanHome;
    @BindView(2131297720)
    LinearLayout llKelurahanHomeDisabled;
    @BindView(2131297721)
    LinearLayout llKelurahanHomeWrapperDisabled;
    @BindView(2131297729)
    LinearLayout llKodePosDomisiliDisabled;
    @BindView(2131297730)
    LinearLayout llKodePosHomeDisabled;
    @BindView(2131297731)
    LinearLayout llKodePosKantor;
    @BindView(2131297728)
    LinearLayout llKodePosRumahDomisili;
    @BindView(2131297734)
    LinearLayout llKodePosRumahHome;
    @BindView(2131297741)
    LinearLayout llKotaDomisili;
    @BindView(2131297742)
    LinearLayout llKotaDomisiliDisabled;
    @BindView(2131297743)
    LinearLayout llKotaDomisiliWrapperDisabled;
    @BindView(2131297750)
    LinearLayout llKotaHome;
    @BindView(2131297744)
    LinearLayout llKotaHomeDisabled;
    @BindView(2131297745)
    LinearLayout llKotaHomeWrapperDisabled;
    @BindView(2131297746)
    LinearLayout llKotaKantor;
    @BindView(2131297747)
    LinearLayout llKotaKantorDisabled;
    @BindView(2131297748)
    LinearLayout llKotaKodePosKantor;
    @BindView(2131297438)
    LinearLayout llLayoutDataAlamatHomeEditable;
    @BindView(2131297439)
    LinearLayout llLayoutDataAlamatHomeUneditable;
    @BindView(2131297441)
    LinearLayout llLayoutDataAlamatResidenceEditable;
    @BindView(2131297442)
    LinearLayout llLayoutDataAlamatResidenceUneditable;
    @BindView(2131297448)
    LinearLayout llLayoutDataDiriEditable;
    @BindView(2131297449)
    LinearLayout llLayoutDataDiriUneditable;
    @BindView(2131297463)
    LinearLayout llLayoutDataPekerjaanEditable;
    @BindView(2131297464)
    LinearLayout llLayoutDataPekerjaanUneditable;
    @BindView(2131297477)
    LinearLayout llLayoutDataRekeningEditable;
    @BindView(2131297478)
    LinearLayout llLayoutDataRekeningUneditable;
    @BindView(2131297488)
    LinearLayout llMainDataAlamatHome;
    @BindView(2131297489)
    LinearLayout llMainDataAlamatResidence;
    @BindView(2131297491)
    LinearLayout llMainDataDiri;
    @BindView(2131297493)
    LinearLayout llMainDataPekerjaan;
    @BindView(2131297496)
    LinearLayout llMainDataRekening;
    @BindView(2131297770)
    LinearLayout llMasaBerlakuKitasDisabled;
    @BindView(2131297772)
    LinearLayout llMataUangDisabled;
    @BindView(2131297780)
    LinearLayout llNamaKantor;
    @BindView(2131297781)
    LinearLayout llNamaKantorDisabled;
    @BindView(2131297810)
    LinearLayout llNegaraDomisiliDisabled;
    @BindView(2131297811)
    LinearLayout llNegaraHomeDisabled;
    @BindView(2131297812)
    LinearLayout llNegaraIdentitasDisabled;
    @BindView(2131297820)
    LinearLayout llNoKitasDisabled;
    @BindView(2131297834)
    LinearLayout llNomorNpwpDisabled;
    @BindView(2131297843)
    LinearLayout llPekerjaanDisabled;
    @BindView(2131297854)
    LinearLayout llPenghasilanDisabled;
    @BindView(2131297862)
    LinearLayout llProvinsiDomisiliDisabled;
    @BindView(2131297863)
    LinearLayout llProvinsiHomeDisabled;
    @BindView(2131297864)
    LinearLayout llProvinsiKantorDisabled;
    @BindView(2131297872)
    LinearLayout llRtRwDomisiliDisabled;
    @BindView(2131297873)
    LinearLayout llRtRwHomeDisabled;
    @BindView(2131297892)
    LinearLayout llStatusNpwpDisabled;
    @BindView(2131297902)
    LinearLayout llSumberPenghasilanDisabled;
    @BindView(2131297903)
    LinearLayout llSumberPenghasilanLainnyaDisabled;
    @BindView(2131297904)
    LinearLayout llSyaratKetentuan;
    @BindView(2131297926)
    LinearLayout llTujuanPemrekDisabled;
    private ReRegistrationPresenter m;
    private CheckUserPresenter n;
    private Validator p;
    @BindArray(2130903084)
    String[] penghasilanPertahun;
    private SendEmailTransactionSuccessPresenter q;
    @BindString(2131822092)
    String retry;
    @BindArray(2130903092)
    String[] statusPerkawinan;
    @BindArray(2130903093)
    String[] statusTempatTinggal;
    @BindArray(2130903096)
    String[] sumberPenghasilan;
    @BindView(2131298420)
    ScrollView svMain;
    @BindView(2131298474)
    LogoutDialog_ViewBinding tilAgama;
    @BindView(2131298480)
    LogoutDialog_ViewBinding tilAlamatKantor;
    @BindView(2131298479)
    LogoutDialog_ViewBinding tilAlamatSaatIni;
    @BindView(2131298491)
    LogoutDialog_ViewBinding tilAlamatSaatIniHome;
    @BindView(2131298496)
    LogoutDialog_ViewBinding tilBahasaPetunjuk;
    @BindView(2131298516)
    LogoutDialog_ViewBinding tilBidangPekerjaan;
    @BindView(2131298517)
    LogoutDialog_ViewBinding tilBidangUsaha;
    @BindView(2131298524)
    LogoutDialog_ViewBinding tilDescPekerjaan;
    @BindView(2131298527)
    LogoutDialog_ViewBinding tilEmail;
    @BindViews({2131298630, 2131298479, 2131298704, 2131298707, 2131298698, 2131298582, 2131298558, 2131298561, 2131298569})
    List<LogoutDialog_ViewBinding> tilFormGroupDataAlamat;
    @BindViews({2131298631, 2131298491, 2131298705, 2131298708, 2131298699, 2131298586, 2131298559, 2131298562, 2131298572})
    List<LogoutDialog_ViewBinding> tilFormGroupDataAlamatNKTP;
    @BindViews({2131298543, 2131298607, 2131298649, 2131298632, 2131298592, 2131298545, 2131298633, 2131298584, 2131298739, 2131298729, 2131298474, 2131298605, 2131298567, 2131298640, 2131298565, 2131298661, 2131298527, 2131298651, 2131298593})
    List<LogoutDialog_ViewBinding> tilFormGroupDataDiri;
    @BindViews({2131298652, 2131298608, 2131298688, 2131298541, 2131298517, 2131298480, 2131298583, 2131298570, 2131298700, 2131298551})
    List<LogoutDialog_ViewBinding> tilFormGroupDataPekerjaan;
    @BindViews({2131298544, 2131298539, 2131298600})
    List<LogoutDialog_ViewBinding> tilFormGroupDataRekening;
    @BindView(2131298539)
    LogoutDialog_ViewBinding tilInternetBanking;
    @BindView(2131298541)
    LogoutDialog_ViewBinding tilJabatan;
    @BindView(2131298543)
    LogoutDialog_ViewBinding tilJenisId;
    @BindView(2131298544)
    LogoutDialog_ViewBinding tilJenisKartu;
    @BindView(2131298545)
    LogoutDialog_ViewBinding tilJenisKelamin;
    @BindView(2131298551)
    LogoutDialog_ViewBinding tilJenisProfesi;
    @BindView(2131298558)
    LogoutDialog_ViewBinding tilKecamatan;
    @BindView(2131298559)
    LogoutDialog_ViewBinding tilKecamatanHome;
    @BindView(2131298561)
    LogoutDialog_ViewBinding tilKelurahan;
    @BindView(2131298562)
    LogoutDialog_ViewBinding tilKelurahanHome;
    @BindView(2131298565)
    LogoutDialog_ViewBinding tilKodeArea;
    @BindView(2131298567)
    LogoutDialog_ViewBinding tilKodeNegara;
    @BindView(2131298570)
    LogoutDialog_ViewBinding tilKodePosKantor;
    @BindView(2131298569)
    LogoutDialog_ViewBinding tilKodePosRumah;
    @BindView(2131298572)
    LogoutDialog_ViewBinding tilKodePosRumahHome;
    @BindView(2131298583)
    LogoutDialog_ViewBinding tilKotaKantor;
    @BindView(2131298584)
    LogoutDialog_ViewBinding tilKotaLahir;
    @BindView(2131298582)
    LogoutDialog_ViewBinding tilKotaRumah;
    @BindView(2131298586)
    LogoutDialog_ViewBinding tilKotaRumahHome;
    @BindView(2131298592)
    LogoutDialog_ViewBinding tilMasaBerlakuId;
    @BindView(2131298593)
    LogoutDialog_ViewBinding tilMasaBerlakuKitasKitap;
    @BindView(2131298594)
    LogoutDialog_ViewBinding tilMataUang;
    @BindView(2131298600)
    LogoutDialog_ViewBinding tilMobileBanking;
    @BindView(2131298605)
    LogoutDialog_ViewBinding tilNamaIbu;
    @BindView(2131298607)
    LogoutDialog_ViewBinding tilNamaId;
    @BindView(2131298608)
    LogoutDialog_ViewBinding tilNamaKantor;
    @BindView(2131298630)
    LogoutDialog_ViewBinding tilNegaraDomisili;
    @BindView(2131298631)
    LogoutDialog_ViewBinding tilNegaraHome;
    @BindView(2131298632)
    LogoutDialog_ViewBinding tilNegaraId;
    @BindView(2131298633)
    LogoutDialog_ViewBinding tilNegaraLahir;
    @BindView(2131298640)
    LogoutDialog_ViewBinding tilNoHp;
    @BindView(2131298651)
    LogoutDialog_ViewBinding tilNoKitasKitap;
    @BindView(2131298652)
    LogoutDialog_ViewBinding tilNoNpwp;
    @BindView(2131298661)
    LogoutDialog_ViewBinding tilNoTelp;
    @BindView(2131298649)
    LogoutDialog_ViewBinding tilNomorId;
    @BindView(2131298684)
    LogoutDialog_ViewBinding tilPekerjaan;
    @BindView(2131298687)
    LogoutDialog_ViewBinding tilPenghasilan;
    @BindView(2131298688)
    LogoutDialog_ViewBinding tilPenghasilanLain;
    @BindView(2131298698)
    LogoutDialog_ViewBinding tilProvinsi;
    @BindView(2131298699)
    LogoutDialog_ViewBinding tilProvinsiHome;
    @BindView(2131298700)
    LogoutDialog_ViewBinding tilProvinsiKantor;
    @BindView(2131298704)
    LogoutDialog_ViewBinding tilRt;
    @BindView(2131298705)
    LogoutDialog_ViewBinding tilRtHome;
    @BindView(2131298707)
    LogoutDialog_ViewBinding tilRw;
    @BindView(2131298708)
    LogoutDialog_ViewBinding tilRwHome;
    @BindView(2131298721)
    LogoutDialog_ViewBinding tilStatusNPWP;
    @BindView(2131298729)
    LogoutDialog_ViewBinding tilStatusPerkawinan;
    @BindView(2131298734)
    LogoutDialog_ViewBinding tilSumberPenghasilan;
    @BindView(2131298739)
    LogoutDialog_ViewBinding tilTanggalLahir;
    @BindView(2131298810)
    TextView tvAgama;
    @BindView(2131298816)
    TextView tvAlamatDomisili;
    @BindView(2131298817)
    TextView tvAlamatHome;
    @BindView(2131298818)
    TextView tvAlamatKantor;
    @BindView(2131298834)
    TextView tvBahasaPetunjuk;
    @BindView(2131298860)
    TextView tvBidangPekerjaan;
    @BindView(2131298861)
    TextView tvBidangUsaha;
    @BindView(2131298892)
    TextView tvDataAlamatHome;
    @BindView(2131298923)
    TextView tvDescPekerjaan;
    @BindView(2131298950)
    TextView tvEmail;
    @BindViews({2131299106, 2131298959, 2131299172, 2131299175, 2131299165, 2131299058, 2131299035, 2131299038, 2131299046})
    List<TextView> tvErrorGroupDataAlamat;
    @BindViews({2131299107, 2131298970, 2131299173, 2131299176, 2131299166, 2131299062, 2131299036, 2131299039, 2131299049})
    List<TextView> tvErrorGroupDataAlamatNKTP;
    @BindViews({2131299018, 2131299084, 2131299122, 2131299108, 2131299068, 2131299021, 2131299109, 2131299060, 2131299207, 2131299197, 2131298954, 2131299082, 2131299043, 2131299115, 2131299041, 2131299134, 2131299006, 2131299124, 2131299069})
    List<TextView> tvErrorGroupDataDiri;
    @BindViews({2131299125, 2131299085, 2131299156, 2131299016, 2131298996, 2131298960, 2131299059, 2131299047, 2131299167, 2131299027})
    List<TextView> tvErrorGroupDataPekerjaan;
    @BindViews({2131299020, 2131299015, 2131299077})
    List<TextView> tvErrorGroupDataRekening;
    @BindView(2131299255)
    TextView tvFasilitasKlikBca;
    @BindView(2131299256)
    TextView tvFasilitasMBca;
    @BindView(2131299298)
    TextView tvJabatan;
    @BindView(2131299301)
    TextView tvJenisIdentitas;
    @BindView(2131299303)
    TextView tvJenisKartuAtm;
    @BindView(2131299304)
    TextView tvJenisKelamin;
    @BindView(2131299311)
    TextView tvJenisProfesi;
    @BindView(2131299342)
    TextView tvKecamatanDomisili;
    @BindView(2131299343)
    TextView tvKecamatanHome;
    @BindView(2131299344)
    TextView tvKelurahanDomisili;
    @BindView(2131299345)
    TextView tvKelurahanHome;
    @BindView(2131299361)
    TextView tvKodeArea;
    @BindView(2131299363)
    TextView tvKodeNegara;
    @BindView(2131299366)
    TextView tvKodePosDomisili;
    @BindView(2131299367)
    TextView tvKodePosHome;
    @BindView(2131299368)
    TextView tvKodePosKantor;
    @BindView(2131299377)
    TextView tvKotaDomisili;
    @BindView(2131299378)
    TextView tvKotaHome;
    @BindView(2131299379)
    TextView tvKotaKantor;
    @BindView(2131299381)
    TextView tvKotaLahir;
    @BindView(2131299397)
    TextView tvMasaBerlakuId;
    @BindView(2131299399)
    TextView tvMasaBerlakuKitas;
    @BindView(2131299400)
    TextView tvMataUang;
    @BindView(2131299422)
    TextView tvNamaIbu;
    @BindView(2131299423)
    TextView tvNamaId;
    @BindView(2131299424)
    TextView tvNamaKantor;
    @BindView(2131299445)
    TextView tvNegaraDomisili;
    @BindView(2131299446)
    TextView tvNegaraHome;
    @BindView(2131299447)
    TextView tvNegaraId;
    @BindView(2131299448)
    TextView tvNegaraLahir;
    @BindView(2131299453)
    TextView tvNoHp;
    @BindView(2131299459)
    TextView tvNoIdentitas;
    @BindView(2131299462)
    TextView tvNoKitas;
    @BindView(2131299464)
    TextView tvNoNpwp;
    @BindView(2131299481)
    TextView tvNoTlpRumah;
    @BindView(2131299511)
    TextView tvPekerjaan;
    @BindView(2131299522)
    TextView tvPenghasilan;
    @BindView(2131299543)
    TextView tvProvinsiDomisili;
    @BindView(2131299544)
    TextView tvProvinsiHome;
    @BindView(2131299545)
    TextView tvProvinsiKantor;
    @BindView(2131299561)
    TextView tvRtDomisili;
    @BindView(2131299562)
    TextView tvRtHome;
    @BindView(2131299563)
    TextView tvRwDomisili;
    @BindView(2131299564)
    TextView tvRwHome;
    @BindView(2131299575)
    TextView tvStatusNpwp;
    @BindView(2131299582)
    TextView tvStatusPerkawinan;
    @BindView(2131299592)
    TextView tvSumberPenghasilan;
    @BindView(2131299593)
    TextView tvSumberPenghasilanLainnya;
    @BindView(2131299598)
    TextView tvTanggalLahir;
    @BindView(2131299604)
    TextView tvTermCondition;
    @BindView(2131299617)
    TextView tvTitleAlamatDomisili;
    @BindView(2131299618)
    TextView tvTitleAlamatHome;
    @BindView(2131299619)
    TextView tvTitleAlamatKantor;
    @BindView(2131299639)
    TextView tvTitleMasaBerlakuId;
    @BindView(2131299644)
    TextView tvTitleNamaKantor;
    @BindView(2131299643)
    TextView tvTitleNamaSesuaiId;
    @BindView(2131299646)
    TextView tvTitleNegaraDomisili;
    @BindView(2131299647)
    TextView tvTitleNegaraHome;
    @BindView(2131299648)
    TextView tvTitleNegaraId;
    @BindView(2131299649)
    TextView tvTitleNoIdentitas;
    @BindView(2131299651)
    TextView tvTitleNoNpwp;
    @BindView(2131299695)
    TextView tvTujuanPemrek;
    @BindView(2131299702)
    TextView tvUbahDataAlamatHome;
    @BindView(2131299703)
    TextView tvUbahDataAlamatResidence;
    @BindView(2131299705)
    TextView tvUbahDataDiri;
    @BindView(2131299713)
    TextView tvUbahDataPekerjaan;
    @BindView(2131299721)
    TextView tvUbahDataRekening;
    @BindString(2131821427)
    String txtTermCondition;
    @BindViews({2131297084, 2131296930, 2131297168, 2131297171, 2131297162, 2131297035, 2131297012, 2131297015, 2131297023})
    public List<EditText> viewGroupDataAlamat;
    @BindViews({2131297085, 2131296942, 2131297169, 2131297172, 2131297163, 2131297039, 2131297013, 2131297016, 2131297026})
    public List<EditText> viewGroupDataAlamatNKTP;
    @BindViews({2131296994, 2131297060, 2131297103, 2131297086, 2131297045, 2131296997, 2131297087, 2131297037, 2131297207, 2131297197, 2131296925, 2131297058, 2131297021, 2131297094, 2131297019, 2131297115, 2131296976, 2131297105, 2131297046})
    public List<EditText> viewGroupDataDiri;
    @BindViews({2131297106, 2131297061, 2131297146, 2131296992, 2131296967, 2131296931, 2131297036, 2131297024, 2131297164, 2131297003})
    public List<EditText> viewGroupDataPekerjaan;
    @BindViews({2131296996, 2131296990, 2131297053})
    public List<EditText> viewGroupDataRekening;
    Calendar d = Calendar.getInstance();
    private setMessage h = new setMessage();
    private boolean f = false;
    private boolean j = false;
    private boolean g = false;
    private boolean k = false;

    /* renamed from: o */
    private boolean f53o = false;

    /* renamed from: a */
    public void e() {
        j();
        if (!((FormActivity) getActivity()).n.getTypeID().equals("Paspor")) {
            ((FormActivity) getActivity()).n.setCitizen("ID");
            ((FormActivity) getActivity()).n.setHmCountry("INDONESIA");
        }
        cancelPicture cancelpicture = new cancelPicture();
        cancelpicture.c = ((FormActivity) getActivity()).n.getAcctType();
        cancelpicture.ab = ((FormActivity) getActivity()).n.getOldCustFlag();
        cancelpicture.f136o = ((FormActivity) getActivity()).n.getFlagGuest();
        if (((FormActivity) getActivity()).n.getFlagEKTP().equals("1")) {
            cancelpicture.ao = "e-KTP";
        } else {
            cancelpicture.ao = ((FormActivity) getActivity()).n.getTypeID();
        }
        cancelpicture.S = ((FormActivity) getActivity()).n.getNumberID();
        cancelpicture.h = ((FormActivity) getActivity()).n.getExpID();
        cancelpicture.Y = ((FormActivity) getActivity()).n.getPurposePemRek();
        if (!((FormActivity) getActivity()).n.getLanguage().isEmpty()) {
            cancelpicture.K = ((FormActivity) getActivity()).n.getLanguage();
        } else {
            cancelpicture.K = "Indonesia";
        }
        cancelpicture.m = ((FormActivity) getActivity()).n.getFlagIB();
        cancelpicture.k = ((FormActivity) getActivity()).n.getFlagMB();
        cancelpicture.B = ((FormActivity) getActivity()).n.getHphoneMB();
        String str = "";
        if (!((FormActivity) getActivity()).n.getFlagIB().equals("1") || !((FormActivity) getActivity()).n.getFlagMB().equals("1")) {
            cancelpicture.w = "";
        } else {
            cancelpicture.w = ((FormActivity) getActivity()).n.getHphoneMB();
        }
        cancelpicture.O = ((FormActivity) getActivity()).n.getMotherMaidenName();
        cancelpicture.Q = ((FormActivity) getActivity()).n.getName();
        cancelpicture.ap = ((FormActivity) getActivity()).n.getSex();
        cancelpicture.aa = ((FormActivity) getActivity()).n.getPob();
        cancelpicture.i = ((FormActivity) getActivity()).n.getDob();
        cancelpicture.L = ((FormActivity) getActivity()).n.getMaritalStatus();
        cancelpicture.ac = ((FormActivity) getActivity()).n.getReligion();
        cancelpicture.l = ((FormActivity) getActivity()).n.getHandPhoneNumber();
        cancelpicture.a = ((FormActivity) getActivity()).n.getCitizen();
        cancelpicture.r = ((FormActivity) getActivity()).n.getHmCountry();
        cancelpicture.n = ((FormActivity) getActivity()).n.getHmAddress();
        String format = !((FormActivity) getActivity()).n.getHmRT().isEmpty() ? String.format("%03d", Integer.valueOf(((FormActivity) getActivity()).n.getHmRT())) : "";
        String format2 = !((FormActivity) getActivity()).n.getHmRW().isEmpty() ? String.format("%03d", Integer.valueOf(((FormActivity) getActivity()).n.getHmRW())) : "";
        cancelpicture.u = format;
        cancelpicture.v = format2;
        cancelpicture.y = ((FormActivity) getActivity()).n.getHmVillage();
        cancelpicture.x = ((FormActivity) getActivity()).n.getHmSubDistrict();
        cancelpicture.t = ((FormActivity) getActivity()).n.getHmCity();
        cancelpicture.q = ((FormActivity) getActivity()).n.getHmPostCode();
        cancelpicture.s = ((FormActivity) getActivity()).n.getHmProvince();
        cancelpicture.J = ((FormActivity) getActivity()).n.getHmPhoneCodeNumber();
        cancelpicture.p = ((FormActivity) getActivity()).n.getHmPhoneNumber();
        cancelpicture.f = ((FormActivity) getActivity()).n.getFlagDifResidency();
        if ("N".equals(((FormActivity) getActivity()).n.getFlagDifResidency())) {
            cancelpicture.ag = ((FormActivity) getActivity()).n.getHmCountry();
            cancelpicture.af = ((FormActivity) getActivity()).n.getHmAddress();
            String format3 = !((FormActivity) getActivity()).n.getHmRT().isEmpty() ? String.format("%03d", Integer.valueOf(((FormActivity) getActivity()).n.getHmRT())) : "";
            String format4 = !((FormActivity) getActivity()).n.getHmRW().isEmpty() ? String.format("%03d", Integer.valueOf(((FormActivity) getActivity()).n.getHmRW())) : "";
            cancelpicture.al = format3;
            cancelpicture.aj = format4;
            cancelpicture.am = ((FormActivity) getActivity()).n.getHmVillage();
            cancelpicture.ak = ((FormActivity) getActivity()).n.getHmSubDistrict();
            cancelpicture.ah = ((FormActivity) getActivity()).n.getHmCity();
            cancelpicture.ae = ((FormActivity) getActivity()).n.getHmPostCode();
            cancelpicture.ad = ((FormActivity) getActivity()).n.getHmProvince();
        } else {
            cancelpicture.ag = ((FormActivity) getActivity()).n.getResCountry();
            cancelpicture.af = ((FormActivity) getActivity()).n.getResAddress();
            String format5 = !((FormActivity) getActivity()).n.getResRT().isEmpty() ? String.format("%03d", Integer.valueOf(((FormActivity) getActivity()).n.getResRT())) : "";
            String format6 = !((FormActivity) getActivity()).n.getResRW().isEmpty() ? String.format("%03d", Integer.valueOf(((FormActivity) getActivity()).n.getResRW())) : "";
            cancelpicture.al = format5;
            cancelpicture.aj = format6;
            cancelpicture.am = ((FormActivity) getActivity()).n.getResVillage();
            cancelpicture.ak = ((FormActivity) getActivity()).n.getResSubDistrict();
            cancelpicture.ah = ((FormActivity) getActivity()).n.getResCity();
            cancelpicture.ae = ((FormActivity) getActivity()).n.getResPostCode();
            cancelpicture.ad = ((FormActivity) getActivity()).n.getResProvince();
        }
        cancelpicture.P = ((FormActivity) getActivity()).n.getFlagNPWP();
        cancelpicture.R = ((FormActivity) getActivity()).n.getNpwp();
        cancelpicture.D = ((FormActivity) getActivity()).n.getIncomeSource();
        cancelpicture.ai = ((FormActivity) getActivity()).n.getSalary();
        cancelpicture.H = ((FormActivity) getActivity()).n.getJob();
        cancelpicture.T = ((FormActivity) getActivity()).n.getOfficeName();
        cancelpicture.V = ((FormActivity) getActivity()).n.getOccupation();
        cancelpicture.d = ((FormActivity) getActivity()).n.getBusinessField();
        cancelpicture.X = ((FormActivity) getActivity()).n.getOfficeAddress();
        cancelpicture.U = ((FormActivity) getActivity()).n.getOfficeCity();
        cancelpicture.W = ((FormActivity) getActivity()).n.getOfficePostCode();
        cancelpicture.Z = ((FormActivity) getActivity()).n.getOfficeProvince();
        cancelpicture.e = ((FormActivity) getActivity()).n.getDebitCardType();
        cancelpicture.g = ((FormActivity) getActivity()).n.getDollarCurrCode();
        cancelpicture.E = ((FormActivity) getActivity()).n.getKitasKitapFlag();
        cancelpicture.I = ((FormActivity) getActivity()).n.getKitasKitapNumber();
        cancelpicture.G = ((FormActivity) getActivity()).n.getKitasKitapExpDate();
        cancelpicture.z = ((FormActivity) getActivity()).n.getIncomeSourceOthers();
        cancelpicture.F = ((FormActivity) getActivity()).n.getJobOthers();
        cancelpicture.j = ((FormActivity) getActivity()).n.getEmailAddr();
        cancelpicture.ar = this.e != null ? this.e.getSessionId() : "";
        if (this.e != null) {
            str = this.e.getImei();
        }
        cancelpicture.C = str;
        cancelpicture.b = ((FormActivity) getActivity()).n.getCobIsoCode();
        cancelpicture.M = ((FormActivity) getActivity()).n.getHandPhoneCountryCodeNumber();
        cancelpicture.N = "62";
        ArrayList arrayList = new ArrayList();
        if (!((FormActivity) getActivity()).n.getFotoKtp().isEmpty()) {
            InfoPromoORActivity_ViewBinding infoPromoORActivity_ViewBinding = new InfoPromoORActivity_ViewBinding();
            infoPromoORActivity_ViewBinding.a = "2";
            infoPromoORActivity_ViewBinding.e = ((FormActivity) getActivity()).n.getFotoKtp();
            arrayList.add(infoPromoORActivity_ViewBinding);
        }
        if (!((FormActivity) getActivity()).n.getFotoPribadi().isEmpty()) {
            InfoPromoORActivity_ViewBinding infoPromoORActivity_ViewBinding2 = new InfoPromoORActivity_ViewBinding();
            infoPromoORActivity_ViewBinding2.a = "1";
            infoPromoORActivity_ViewBinding2.e = ((FormActivity) getActivity()).n.getFotoPribadi();
            arrayList.add(infoPromoORActivity_ViewBinding2);
        }
        if (!((FormActivity) getActivity()).n.getFotoNpwp().isEmpty()) {
            InfoPromoORActivity_ViewBinding infoPromoORActivity_ViewBinding3 = new InfoPromoORActivity_ViewBinding();
            infoPromoORActivity_ViewBinding3.a = "3";
            infoPromoORActivity_ViewBinding3.e = ((FormActivity) getActivity()).n.getFotoNpwp();
            arrayList.add(infoPromoORActivity_ViewBinding3);
        }
        cancelpicture.A = arrayList;
        this.l.e(cancelpicture);
    }

    private void a(int i) {
        ((LinearLayout) getActivity().findViewById(i)).setVisibility(8);
    }

    private void a(List<TextView> list, List<LogoutDialog_ViewBinding> list2, List<EditText> list3, EditText editText) {
        if (list.get(list3.indexOf(editText)).getVisibility() == 0 && !editText.getText().toString().isEmpty()) {
            int indexOf = list3.indexOf(editText);
            list.get(indexOf).setVisibility(8);
            list2.get(indexOf).setBackgroundResource(2131230847);
        }
    }

    private void b() {
        this.tvNoNpwp.setText(this.etNoNPWP.getText().toString());
        this.tvStatusNpwp.setText(this.etStatusNPWP.getText().toString());
        this.tvPekerjaan.setText(this.etJob.getText().toString());
        this.tvDescPekerjaan.setText(this.etDescPekerjaan.getText().toString());
        this.tvBidangPekerjaan.setText(this.etBidangPekerjaan.getText().toString());
        this.tvSumberPenghasilan.setText(this.etSumberPenghasilan.getText().toString());
        this.tvSumberPenghasilanLainnya.setText(this.etPenghasilanLain.getText().toString());
        this.tvPenghasilan.setText(this.etPenghasilan.getText().toString());
        this.tvJenisProfesi.setText(this.etJenisProfesi.getText().toString());
        this.tvJabatan.setText(this.etOccupation.getText().toString());
        this.tvBidangUsaha.setText(this.etBussinesField.getText().toString());
        this.tvNamaKantor.setText(this.etOfficeName.getText().toString());
        this.tvAlamatKantor.setText(this.etOfficeAddr.getText().toString());
        this.tvProvinsiKantor.setText(this.etOfficeProvince.getText().toString());
        this.tvKotaKantor.setText(this.etOfficeCity.getText().toString());
        this.tvKodePosKantor.setText(this.etOfficePostCode.getText().toString());
        if (((FormActivity) getActivity()).n.getFlagNPWP().equals("N")) {
            if (((FormActivity) getActivity()).n.getTypeID().equals("Kartu Pelajar")) {
                this.llLayoutDataPekerjaanUneditable.removeView(this.llStatusNpwpDisabled);
                this.tvTitleNoNpwp.setText(2131821186);
                if (((FormActivity) getActivity()).n.getNpwp().isEmpty()) {
                    this.llLayoutDataPekerjaanUneditable.removeView(this.llNomorNpwpDisabled);
                    this.p.removeRules(this.etNoNPWP);
                }
            } else {
                this.llLayoutDataPekerjaanUneditable.removeView(this.llNomorNpwpDisabled);
                this.llLayoutDataPekerjaanUneditable.removeView(this.llStatusNpwpDisabled);
                this.p.removeRules(this.etNoNPWP);
            }
        }
        if (((FormActivity) getActivity()).n.getOccupationValue().isEmpty() || ((FormActivity) getActivity()).n.getOccupationValue().equals("-")) {
            this.llLayoutDataPekerjaanUneditable.removeView(this.llDescPekerjaanDisabled);
            this.p.removeRules(this.etDescPekerjaan);
        }
        if (((FormActivity) getActivity()).n.getBusinessFieldValue().isEmpty() || ((FormActivity) getActivity()).n.getBusinessFieldValue().equals("-")) {
            this.llBidangPekerjaanWrapper.setVisibility(8);
            this.p.removeRules(this.etBidangPekerjaan);
        }
        if (((FormActivity) getActivity()).n.getJobOthers().isEmpty()) {
            this.llLayoutDataPekerjaanUneditable.removeView(this.llJenisProfesiDisabled);
            this.p.removeRules(this.etJenisProfesi);
        }
        if ("1".equals(((FormActivity) getActivity()).n.getJob())) {
            this.tvTitleNamaKantor.setText(getActivity().getResources().getString(2131821535));
            this.tvTitleAlamatKantor.setText(getActivity().getResources().getString(2131821454));
        } else if ("8".equals(((FormActivity) getActivity()).n.getJob()) || "9".equals(((FormActivity) getActivity()).n.getJob()) || ReservasiOnline.LAYANAN_GIRO.equals(((FormActivity) getActivity()).n.getJob()) || "15".equals(((FormActivity) getActivity()).n.getJob())) {
            this.tvTitleNamaKantor.setText(getActivity().getResources().getString(2131821538));
            this.tvTitleAlamatKantor.setText(getActivity().getResources().getString(2131821458));
        } else if ("2".equals(((FormActivity) getActivity()).n.getJob())) {
            this.llLayoutDataPekerjaanUneditable.removeView(this.llNamaKantorDisabled);
            this.llLayoutDataPekerjaanUneditable.removeView(this.llAlamatKantorDisabled);
            this.llLayoutDataPekerjaanUneditable.removeView(this.llProvinsiKantorDisabled);
            this.llLayoutDataPekerjaanUneditable.removeView(this.llKotaKantorDisabled);
            this.llLayoutDataPekerjaanUneditable.removeView(this.llJabatanDisabled);
            this.p.removeRules(this.etOfficeName);
            this.p.removeRules(this.etOfficeAddr);
            this.p.removeRules(this.etOfficeProvince);
            this.p.removeRules(this.etOfficeCity);
            this.p.removeRules(this.etOfficePostCode);
            this.p.removeRules(this.etOccupation);
        }
        if (!this.etSumberPenghasilan.getText().toString().equalsIgnoreCase("Lainnya")) {
            this.llLayoutDataPekerjaanUneditable.removeView(this.llSumberPenghasilanLainnyaDisabled);
        }
        for (int i = 0; i < this.llLayoutDataPekerjaanUneditable.getChildCount(); i++) {
            View childAt = this.llLayoutDataPekerjaanUneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    private void b(int i) {
        List<TextView> list = this.tvErrorGroupDataDiri;
        List<LogoutDialog_ViewBinding> list2 = this.tilFormGroupDataDiri;
        list.get(i).setVisibility(8);
        list2.get(i).setBackgroundResource(2131230847);
    }

    private void c(int i) {
        List<TextView> list = this.tvErrorGroupDataAlamat;
        List<LogoutDialog_ViewBinding> list2 = this.tilFormGroupDataAlamat;
        list.get(i).setVisibility(8);
        list2.get(i).setBackgroundResource(2131230847);
    }

    private void d(int i) {
        List<TextView> list = this.tvErrorGroupDataAlamatNKTP;
        List<LogoutDialog_ViewBinding> list2 = this.tilFormGroupDataAlamatNKTP;
        list.get(i).setVisibility(8);
        list2.get(i).setBackgroundResource(2131230847);
    }

    private void e(int i) {
        List<TextView> list = this.tvErrorGroupDataPekerjaan;
        List<LogoutDialog_ViewBinding> list2 = this.tilFormGroupDataPekerjaan;
        list.get(i).setVisibility(8);
        list2.get(i).setBackgroundResource(2131230847);
    }

    private void j() {
        ((FormActivity) getActivity()).n.setNumberID(this.etNoId.getText().toString());
        ((FormActivity) getActivity()).n.setMotherMaidenName(this.etMotherName.getText().toString());
        ((FormActivity) getActivity()).n.setHmPhoneNumber(this.etNoTelp.getText().toString());
        ((FormActivity) getActivity()).n.setHmPhoneCodeNumber(this.etKodeArea.getText().toString());
        ((FormActivity) getActivity()).n.setHandPhoneNumber(this.etNoHp.getText().toString());
        ((FormActivity) getActivity()).n.setKitasKitapNumber(this.etNoKitasKitap.getText().toString());
        ((FormActivity) getActivity()).n.setEmailAddr(this.etEmail.getText().toString());
        ((FormActivity) getActivity()).n.setName(this.etNamaId.getText().toString());
        if (!"KTP".equals(((FormActivity) getActivity()).n.getTypeID())) {
            ((FormActivity) getActivity()).n.setHmAddress(this.etHouseAddrHome.getText().toString());
            ((FormActivity) getActivity()).n.setHmRT(this.etHouseRTHome.getText().toString());
            ((FormActivity) getActivity()).n.setHmRW(this.etHouseRWHome.getText().toString());
            ((FormActivity) getActivity()).n.setHmVillage(this.etHouseVillageHome.getText().toString());
            ((FormActivity) getActivity()).n.setHmSubDistrict(this.etHouseSubDistricHome.getText().toString());
            ((FormActivity) getActivity()).n.setHmCity(this.etHouseCityHome.getText().toString());
            ((FormActivity) getActivity()).n.setHmPostCode(this.etHousePostCodeHome.getText().toString());
            ((FormActivity) getActivity()).n.setHmProvince(this.etHouseProvinceHome.getText().toString());
        }
        ((FormActivity) getActivity()).n.setResAddress(this.etHouseAddr.getText().toString());
        ((FormActivity) getActivity()).n.setResRT(this.etHouseRT.getText().toString());
        ((FormActivity) getActivity()).n.setResRW(this.etHouseRW.getText().toString());
        ((FormActivity) getActivity()).n.setResVillage(this.etHouseVillage.getText().toString());
        ((FormActivity) getActivity()).n.setResSubDistrict(this.etHouseSubDistric.getText().toString());
        ((FormActivity) getActivity()).n.setResCity(this.etHouseCity.getText().toString());
        ((FormActivity) getActivity()).n.setResPostCode(this.etHousePostCode.getText().toString());
        ((FormActivity) getActivity()).n.setResProvince(this.etHouseProvince.getText().toString());
        ((FormActivity) getActivity()).n.setNpwp(this.etNoNPWP.getText().toString());
        ((FormActivity) getActivity()).n.setOccupation(this.etOccupation.getText().toString());
        ((FormActivity) getActivity()).n.setBusinessField(this.etBussinesField.getText().toString());
        ((FormActivity) getActivity()).n.setJobOthers(this.etJenisProfesi.getText().toString());
        ((FormActivity) getActivity()).n.setOfficeCity(this.etOfficeCity.getText().toString());
        ((FormActivity) getActivity()).n.setOfficeProvince(this.etOfficeProvince.getText().toString());
        ((FormActivity) getActivity()).n.setOfficePostCode(this.etOfficePostCode.getText().toString());
        ((FormActivity) getActivity()).n.setOfficeName(this.etOfficeName.getText().toString());
        ((FormActivity) getActivity()).n.setOfficeAddress(this.etOfficeAddr.getText().toString());
        ((FormActivity) getActivity()).n.setEmailIB(this.etInternetBanking.getText().toString());
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        h();
        Intent intent = new Intent(getContext(), FormSuccessActivity.class);
        intent.putExtra("Transaction_name", ((FormActivity) getActivity()).p);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.i));
        intent.putExtra("email", ((FormActivity) getActivity()).n.getEmailAddr());
        startActivity(intent);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    @Override // com.bca.smartbranch.presenter.AccountOpeningPresenter.read, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        h();
        if (this.i != null) {
            Intent intent = new Intent(getContext(), FormSuccessActivity.class);
            intent.putExtra("Transaction_name", ((FormActivity) getActivity()).p);
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.i));
            intent.putExtra("email", ((FormActivity) getActivity()).n.getEmailAddr());
            startActivity(intent);
            setOnHierarchyChangeListener.d((Activity) getActivity());
            return;
        }
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: o.getTxnDataOutput
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Page6PLFragment.this.e();
            }
        }).g();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etNoId.getEditableText()) {
            if (this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etNoId)).getVisibility() == 0 && getPromotion.d(getContext(), this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etNoId)).getText().toString(), this.etNoId)) {
                b(this.viewGroupDataDiri.indexOf(this.etNoId));
            }
            ((FormActivity) getActivity()).n.setNumberID(editable.toString());
        } else if (editable == this.etMotherName.getEditableText()) {
            a(this.tvErrorGroupDataDiri, this.tilFormGroupDataDiri, this.viewGroupDataDiri, this.etMotherName);
            ((FormActivity) getActivity()).n.setMotherMaidenName(editable.toString());
        } else if (editable == this.etNegaraLahir.getEditableText()) {
            a(this.tvErrorGroupDataDiri, this.tilFormGroupDataDiri, this.viewGroupDataDiri, this.etNegaraLahir);
            ((FormActivity) getActivity()).n.setCob(editable.toString());
        } else if (editable == this.etKotaLahir.getEditableText()) {
            a(this.tvErrorGroupDataDiri, this.tilFormGroupDataDiri, this.viewGroupDataDiri, this.etKotaLahir);
            ((FormActivity) getActivity()).n.setPob(editable.toString());
        } else if (editable == this.etNoKitasKitap.getEditableText()) {
            a(this.tvErrorGroupDataDiri, this.tilFormGroupDataDiri, this.viewGroupDataDiri, this.etNoKitasKitap);
            ((FormActivity) getActivity()).n.setKitasKitapNumber(editable.toString());
        } else if (editable == this.etNoHp.getEditableText()) {
            a(this.tvErrorGroupDataDiri, this.tilFormGroupDataDiri, this.viewGroupDataDiri, this.etNoHp);
            ((FormActivity) getActivity()).n.setHandPhoneNumber(editable.toString());
        } else if (editable == this.etKodeNegara.getEditableText()) {
            a(this.tvErrorGroupDataDiri, this.tilFormGroupDataDiri, this.viewGroupDataDiri, this.etKodeNegara);
            ((FormActivity) getActivity()).n.setHandPhoneCountryCodeNumber(editable.toString());
        } else if (editable == this.etNoTelp.getEditableText()) {
            if (this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etKodeArea)).getVisibility() == 0 || this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etNoTelp)).getVisibility() == 0) {
                if (!this.etNoTelp.getText().toString().isEmpty()) {
                    b(this.viewGroupDataDiri.indexOf(this.etNoTelp));
                } else {
                    b(this.viewGroupDataDiri.indexOf(this.etKodeArea));
                }
            }
            ((FormActivity) getActivity()).n.setHmPhoneNumber(editable.toString());
        } else if (editable == this.etKodeArea.getEditableText()) {
            if (this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etKodeArea)).getVisibility() == 0 || this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etNoTelp)).getVisibility() == 0) {
                if (!this.etKodeArea.getText().toString().isEmpty()) {
                    b(this.viewGroupDataDiri.indexOf(this.etKodeArea));
                } else {
                    b(this.viewGroupDataDiri.indexOf(this.etNoTelp));
                }
            }
            ((FormActivity) getActivity()).n.setHmPhoneCodeNumber(editable.toString());
        } else if (editable == this.etEmail.getEditableText()) {
            if (this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etEmail)).getVisibility() == 0 && getPromotion.a(getContext(), this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etEmail)).getText().toString(), this.etEmail)) {
                b(this.viewGroupDataDiri.indexOf(this.etEmail));
            }
            ((FormActivity) getActivity()).n.setEmailAddr(editable.toString());
        } else if (editable == this.etNamaId.getEditableText()) {
            a(this.tvErrorGroupDataDiri, this.tilFormGroupDataDiri, this.viewGroupDataDiri, this.etNamaId);
            ((FormActivity) getActivity()).n.setName(editable.toString());
        } else if (editable == this.etHouseAddrHome.getEditableText()) {
            a(this.tvErrorGroupDataAlamatNKTP, this.tilFormGroupDataAlamatNKTP, this.viewGroupDataAlamatNKTP, this.etHouseAddrHome);
            ((FormActivity) getActivity()).n.setHmAddress(editable.toString());
        } else if (editable == this.etHouseRTHome.getEditableText()) {
            a(this.tvErrorGroupDataAlamatNKTP, this.tilFormGroupDataAlamatNKTP, this.viewGroupDataAlamatNKTP, this.etHouseRTHome);
            ((FormActivity) getActivity()).n.setHmRT(editable.toString());
        } else if (editable == this.etHouseRWHome.getEditableText()) {
            a(this.tvErrorGroupDataAlamatNKTP, this.tilFormGroupDataAlamatNKTP, this.viewGroupDataAlamatNKTP, this.etHouseRWHome);
            ((FormActivity) getActivity()).n.setHmRW(editable.toString());
        } else if (editable == this.etHouseAddr.getEditableText()) {
            a(this.tvErrorGroupDataAlamat, this.tilFormGroupDataAlamat, this.viewGroupDataAlamat, this.etHouseAddr);
            ((FormActivity) getActivity()).n.setResAddress(editable.toString());
        } else if (editable == this.etHouseRT.getEditableText()) {
            a(this.tvErrorGroupDataAlamat, this.tilFormGroupDataAlamat, this.viewGroupDataAlamat, this.etHouseRT);
            ((FormActivity) getActivity()).n.setResRT(editable.toString());
        } else if (editable == this.etHouseRW.getEditableText()) {
            a(this.tvErrorGroupDataAlamat, this.tilFormGroupDataAlamat, this.viewGroupDataAlamat, this.etHouseRW);
            ((FormActivity) getActivity()).n.setResRW(editable.toString());
        } else if (editable == this.etNoNPWP.getEditableText()) {
            a(this.tvErrorGroupDataPekerjaan, this.tilFormGroupDataPekerjaan, this.viewGroupDataPekerjaan, this.etNoNPWP);
            ((FormActivity) getActivity()).n.setNpwp(editable.toString());
        } else if (editable == this.etJenisProfesi.getEditableText()) {
            a(this.tvErrorGroupDataPekerjaan, this.tilFormGroupDataPekerjaan, this.viewGroupDataPekerjaan, this.etJenisProfesi);
            ((FormActivity) getActivity()).n.setJobOthers(editable.toString());
        } else if (editable == this.etOfficeName.getEditableText()) {
            a(this.tvErrorGroupDataPekerjaan, this.tilFormGroupDataPekerjaan, this.viewGroupDataPekerjaan, this.etOfficeName);
            ((FormActivity) getActivity()).n.setOfficeName(editable.toString());
        } else if (editable == this.etOccupation.getEditableText()) {
            a(this.tvErrorGroupDataPekerjaan, this.tilFormGroupDataPekerjaan, this.viewGroupDataPekerjaan, this.etOccupation);
            ((FormActivity) getActivity()).n.setOccupation(editable.toString());
        } else if (editable == this.etBussinesField.getEditableText()) {
            a(this.tvErrorGroupDataPekerjaan, this.tilFormGroupDataPekerjaan, this.viewGroupDataPekerjaan, this.etBussinesField);
            ((FormActivity) getActivity()).n.setBusinessField(editable.toString());
        } else if (editable == this.etOfficeAddr.getEditableText()) {
            a(this.tvErrorGroupDataPekerjaan, this.tilFormGroupDataPekerjaan, this.viewGroupDataPekerjaan, this.etOfficeAddr);
            ((FormActivity) getActivity()).n.setOfficeAddress(editable.toString());
        } else if (editable == this.etMobileBanking.getEditableText()) {
            a(this.tvErrorGroupDataRekening, this.tilFormGroupDataRekening, this.viewGroupDataRekening, this.etMobileBanking);
            ((FormActivity) getActivity()).n.setHphoneMB(editable.toString());
        } else if (editable == this.etPenghasilanLain.getEditableText()) {
            a(this.tvErrorGroupDataPekerjaan, this.tilFormGroupDataPekerjaan, this.viewGroupDataPekerjaan, this.etPenghasilanLain);
            ((FormActivity) getActivity()).n.setIncomeSourceOthers(editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493142;
    }

    @Override // com.bca.smartbranch.presenter.AccountOpeningPresenter.read
    public final void c(AccountOpeningResponse accountOpeningResponse) {
        this.i = accountOpeningResponse;
        this.q.d(new LoginSessionActivity_ViewBinding(((FormActivity) getActivity()).n.getEmailAddr(), accountOpeningResponse.getTxnDataOutput().getNoReff()));
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void c(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("desc", str);
        LimitActivationDialog limitActivationDialog = new LimitActivationDialog();
        limitActivationDialog.setArguments(bundle);
        limitActivationDialog.show(getParentFragmentManager(), LimitActivationDialog.TAG);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        h();
        Intent intent = new Intent(getContext(), FormSuccessActivity.class);
        intent.putExtra("Transaction_name", ((FormActivity) getActivity()).p);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.i));
        intent.putExtra("email", ((FormActivity) getActivity()).n.getEmailAddr());
        startActivity(intent);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    @OnClick({2131299604})
    public void clickedTermsCondition(View view) {
        new TermConditionDialog().show(getActivity().l(), "TermConditionDialog");
    }

    @Override // com.bca.smartbranch.presenter.AccountOpeningPresenter.read
    public final void d() {
    }

    public final void d(showInfoValueTodayOR showinfovaluetodayor, int i, int i2, int i3) {
        char c;
        String tag = showinfovaluetodayor.getTag();
        tag.hashCode();
        int hashCode = tag.hashCode();
        if (hashCode == -1971358235) {
            if (tag.equals("picked_born_date")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -1746846948) {
            if (hashCode == 1803408359 && tag.equals("picked_exp_kitas")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (tag.equals("picked_exp_id")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            this.etBornDate.setText(getAnnualFeeBasicAmount.a(i, i2, i3));
            ((FormActivity) getActivity()).n.setDob(getAnnualFeeBasicAmount.a(i, i2, i3));
        } else if (c == 1) {
            this.etExpId.setText(getAnnualFeeBasicAmount.a(i, i2, i3));
            ((FormActivity) getActivity()).n.setExpID(getAnnualFeeBasicAmount.a(i, i2, i3));
        } else if (c == 2) {
            this.etMasaBerlakuKitasKitap.setText(getAnnualFeeBasicAmount.a(i, i2, i3));
            ((FormActivity) getActivity()).n.setKitasKitapExpDate(getAnnualFeeBasicAmount.a(i, i2, i3));
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        h();
        Intent intent = new Intent(getContext(), FormSuccessActivity.class);
        intent.putExtra("Transaction_name", ((FormActivity) getActivity()).p);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.i));
        intent.putExtra("email", ((FormActivity) getActivity()).n.getEmailAddr());
        intent.putExtra("email_success", str);
        startActivity(intent);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    @Override // com.bca.smartbranch.presenter.AccountOpeningPresenter.read
    public final void f(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        char c;
        getPromotion.d(getActivity());
        String job = ((FormActivity) getActivity()).n.getJob();
        job.hashCode();
        int hashCode = job.hashCode();
        if (hashCode == 1567) {
            if (job.equals(ReservasiOnline.LAYANAN_GIRO)) {
                c = '\t';
            }
            c = 65535;
        } else if (hashCode == 1574) {
            if (job.equals(ReservasiOnline.INTERNET_MOBILE_BANKING)) {
                c = '\n';
            }
            c = 65535;
        } else if (hashCode != 1575) {
            switch (hashCode) {
                case 49:
                    if (job.equals("1")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 50:
                    if (job.equals("2")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 51:
                    if (job.equals("3")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                    if (job.equals("4")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 53:
                    if (job.equals("5")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 54:
                    if (job.equals("6")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 55:
                    if (job.equals("7")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 56:
                    if (job.equals("8")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 57:
                    if (job.equals("9")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } else {
            if (job.equals("18")) {
                c = 11;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                e(2131296811, new Page6LLFragment(), "Page6LLFragment");
                return;
            case 1:
                e(2131296811, new Page6KL2Fragment(), "Page6KL2Fragment");
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                e(2131296811, new Page6MLFragment(), "Page6MLFragment");
                return;
            case 7:
            case '\b':
            case '\t':
                e(2131296811, new Page6NLFragment(), "Page6NLFragment");
                return;
            case '\n':
            case 11:
                e(2131296811, new Page6OLFragment(), "Page6OLFragment");
                return;
            default:
                return;
        }
    }

    @Override // com.bca.smartbranch.presenter.AccountOpeningPresenter.read
    public final void g(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.AccountOpeningPresenter.read, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.AccountOpeningPresenter.read
    public final void h(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void h_(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getFragmentManager(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.AccountOpeningPresenter.read
    public final void i(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
    public final void j(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((FormBankNotesActivity) getActivity()).llMain, str, -1).g();
    }

    @OnClick({2131296440})
    public void next(View view) {
        getPromotion.d(getActivity());
        for (TextView textView : this.tvErrorGroupDataDiri) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilFormGroupDataDiri) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        for (TextView textView2 : this.tvErrorGroupDataAlamatNKTP) {
            textView2.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding2 : this.tilFormGroupDataAlamatNKTP) {
            logoutDialog_ViewBinding2.setBackgroundResource(2131230847);
        }
        for (TextView textView3 : this.tvErrorGroupDataAlamat) {
            textView3.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding3 : this.tilFormGroupDataAlamat) {
            logoutDialog_ViewBinding3.setBackgroundResource(2131230847);
        }
        for (TextView textView4 : this.tvErrorGroupDataPekerjaan) {
            textView4.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding4 : this.tilFormGroupDataPekerjaan) {
            logoutDialog_ViewBinding4.setBackgroundResource(2131230847);
        }
        for (TextView textView5 : this.tvErrorGroupDataRekening) {
            textView5.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding5 : this.tilFormGroupDataRekening) {
            logoutDialog_ViewBinding5.setBackgroundResource(2131230847);
        }
        this.p.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onAktivasiUlangEvent(onChooseBankTujuan onchoosebanktujuan) {
        this.m.e(new LandingActivity(this.e != null ? this.e.getEmail() : ""));
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseBahasa(fillNoHp fillnohp) {
        this.etLanguage.setText(fillnohp.d);
        int i = fillnohp.e;
        if (i == 0) {
            ((FormActivity) getActivity()).n.setLanguage("Indonesia");
        } else if (i == 1) {
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogTitle", getResources().getString(2131821997));
            bundle.putString("MessageDialogContent", getResources().getString(2131821909));
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(getActivity().l(), "MessageDialog");
            ((FormActivity) getActivity()).n.setLanguage("English");
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKecamatan(PilihKelurahanActivity_ViewBinding pilihKelurahanActivity_ViewBinding) {
        c(this.viewGroupDataAlamat.indexOf(this.etHouseSubDistric));
        c(this.viewGroupDataAlamat.indexOf(this.etHouseVillage));
        c(this.viewGroupDataAlamat.indexOf(this.etHousePostCode));
        this.llKelurahanDomisili.setVisibility(0);
        this.tilKelurahan.setHintEnabled(false);
        this.llKodePosRumahDomisili.setVisibility(8);
        this.etHouseVillage.getText().clear();
        this.etHousePostCode.getText().clear();
        this.tilKecamatan.setHintEnabled(true);
        this.etHouseSubDistric.setText(pilihKelurahanActivity_ViewBinding.d);
        ((FormActivity) getActivity()).n.setResSubDistrict(pilihKelurahanActivity_ViewBinding.d);
        ((FormActivity) getActivity()).n.setResVillage("");
        ((FormActivity) getActivity()).n.setResPostCode("");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKecamatanHome(onChooseKelurahanHome onchoosekelurahanhome) {
        d(this.viewGroupDataAlamatNKTP.indexOf(this.etHouseSubDistricHome));
        d(this.viewGroupDataAlamatNKTP.indexOf(this.etHouseVillageHome));
        d(this.viewGroupDataAlamatNKTP.indexOf(this.etHousePostCodeHome));
        this.llKelurahanHome.setVisibility(0);
        this.tilKelurahanHome.setHintEnabled(false);
        this.llKodePosRumahHome.setVisibility(8);
        this.etHouseVillageHome.getText().clear();
        this.etHousePostCodeHome.getText().clear();
        this.tilKecamatanHome.setHintEnabled(true);
        this.etHouseSubDistricHome.setText(onchoosekelurahanhome.c);
        ((FormActivity) getActivity()).n.setHmSubDistrict(onchoosekelurahanhome.c);
        ((FormActivity) getActivity()).n.setHmVillage("");
        ((FormActivity) getActivity()).n.setHmPostCode("");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKelurahan(onChooseKodePos onchoosekodepos) {
        c(this.viewGroupDataAlamat.indexOf(this.etHouseVillage));
        c(this.viewGroupDataAlamat.indexOf(this.etHousePostCode));
        this.llKodePosRumahDomisili.setVisibility(0);
        this.tilKodePosRumah.setHintEnabled(false);
        this.etHousePostCode.getText().clear();
        this.tilKelurahan.setHintEnabled(true);
        this.etHouseVillage.setText(onchoosekodepos.a);
        ((FormActivity) getActivity()).n.setResVillage(onchoosekodepos.a);
        ((FormActivity) getActivity()).n.setResPostCode("");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKelurahanHome(PilihKelurahanActivity pilihKelurahanActivity) {
        d(this.viewGroupDataAlamatNKTP.indexOf(this.etHouseVillageHome));
        d(this.viewGroupDataAlamatNKTP.indexOf(this.etHousePostCodeHome));
        this.llKodePosRumahHome.setVisibility(0);
        this.tilKodePosRumahHome.setHintEnabled(false);
        this.etHousePostCodeHome.getText().clear();
        this.tilKelurahanHome.setHintEnabled(true);
        this.etHouseVillageHome.setText(pilihKelurahanActivity.a);
        ((FormActivity) getActivity()).n.setHmVillage(pilihKelurahanActivity.a);
        ((FormActivity) getActivity()).n.setHmPostCode("");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKodePos(onChooseKodePosKantor onchoosekodeposkantor) {
        c(this.viewGroupDataAlamat.indexOf(this.etHousePostCode));
        this.tilKodePosRumah.setHintEnabled(true);
        this.etHousePostCode.setText(onchoosekodeposkantor.b);
        ((FormActivity) getActivity()).n.setResPostCode(onchoosekodeposkantor.b);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKodePosHome(PilihKodePosActivity pilihKodePosActivity) {
        d(this.viewGroupDataAlamatNKTP.indexOf(this.etHousePostCodeHome));
        this.tilKodePosRumahHome.setHintEnabled(true);
        this.etHousePostCodeHome.setText(pilihKodePosActivity.d);
        ((FormActivity) getActivity()).n.setHmPostCode(pilihKodePosActivity.d);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKodePosKantor(onChooseKodePosRes onchoosekodeposres) {
        e(this.viewGroupDataPekerjaan.indexOf(this.etOfficePostCode));
        this.tilKodePosKantor.setHintEnabled(true);
        this.etOfficePostCode.setText(onchoosekodeposres.d);
        ((FormActivity) getActivity()).n.setOfficePostCode(onchoosekodeposres.d);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKota(onChooseKota onchoosekota) {
        c(this.viewGroupDataAlamat.indexOf(this.etHouseCity));
        c(this.viewGroupDataAlamat.indexOf(this.etHouseSubDistric));
        c(this.viewGroupDataAlamat.indexOf(this.etHouseVillage));
        c(this.viewGroupDataAlamat.indexOf(this.etHousePostCode));
        this.llKecamatanDomisili.setVisibility(0);
        this.tilKecamatan.setHintEnabled(false);
        this.llKelurahanDomisili.setVisibility(8);
        this.llKodePosRumahDomisili.setVisibility(8);
        this.etHouseVillage.getText().clear();
        this.etHouseSubDistric.getText().clear();
        this.etHousePostCode.getText().clear();
        this.tilKotaRumah.setHintEnabled(true);
        this.etHouseCity.setText(onchoosekota.e);
        ((FormActivity) getActivity()).n.setResCity(onchoosekota.e);
        ((FormActivity) getActivity()).n.setResSubDistrict("");
        ((FormActivity) getActivity()).n.setResVillage("");
        ((FormActivity) getActivity()).n.setResPostCode("");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKotaHome(PilihKodePosActivity_ViewBinding pilihKodePosActivity_ViewBinding) {
        d(this.viewGroupDataAlamatNKTP.indexOf(this.etHouseCityHome));
        d(this.viewGroupDataAlamatNKTP.indexOf(this.etHouseSubDistricHome));
        d(this.viewGroupDataAlamatNKTP.indexOf(this.etHouseVillageHome));
        d(this.viewGroupDataAlamatNKTP.indexOf(this.etHousePostCodeHome));
        this.llKecamatanHome.setVisibility(0);
        this.tilKecamatanHome.setHintEnabled(false);
        this.llKelurahanHome.setVisibility(8);
        this.llKodePosRumahHome.setVisibility(8);
        this.etHouseVillageHome.getText().clear();
        this.etHouseSubDistricHome.getText().clear();
        this.etHousePostCodeHome.getText().clear();
        this.tilKotaRumahHome.setHintEnabled(true);
        this.etHouseCityHome.setText(pilihKodePosActivity_ViewBinding.d);
        ((FormActivity) getActivity()).n.setHmCity(pilihKodePosActivity_ViewBinding.d);
        ((FormActivity) getActivity()).n.setHmSubDistrict("");
        ((FormActivity) getActivity()).n.setHmVillage("");
        ((FormActivity) getActivity()).n.setHmPostCode("");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKotaKantor(onChooseKotaHome onchoosekotahome) {
        e(this.viewGroupDataPekerjaan.indexOf(this.etOfficeCity));
        e(this.viewGroupDataPekerjaan.indexOf(this.etOfficePostCode));
        this.llKodePosKantor.setVisibility(0);
        this.tilKodePosKantor.setHintEnabled(false);
        this.etOfficePostCode.getText().clear();
        this.tilKotaKantor.setHintEnabled(true);
        this.etOfficeCity.setText(onchoosekotahome.c);
        ((FormActivity) getActivity()).n.setOfficeCity(onchoosekotahome.c);
        ((FormActivity) getActivity()).n.setOfficePostCode("");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseNegara(PilihNegaraBagianActivity pilihNegaraBagianActivity) {
        char c;
        String str = pilihNegaraBagianActivity.b;
        str.hashCode();
        switch (str.hashCode()) {
            case -1949526823:
                if (str.equals("NEGARA_DOMISILI")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 60914281:
                if (str.equals("NEGARA_ALAMAT")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 480732368:
                if (str.equals("NEGARA_PASPOR")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 981633949:
                if (str.equals("NEGARA_LAHIR")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.etNegaraDomisili.setError(null);
            this.tilNegaraDomisili.setHintEnabled(true);
            this.etNegaraDomisili.setText(pilihNegaraBagianActivity.c);
            ((FormActivity) getActivity()).n.setResCountry(pilihNegaraBagianActivity.c);
            this.etHouseAddr.getText().clear();
            this.etHouseAddr.clearFocus();
            this.tilAlamatSaatIni.setHintEnabled(false);
            c(this.viewGroupDataAlamat.indexOf(this.etHouseAddr));
            if (pilihNegaraBagianActivity.c.equalsIgnoreCase("INDONESIA")) {
                this.llEditableIndonesianWrapper.setVisibility(0);
                Validator validator = this.p;
                getAnnualFeeAddOnAmount getannualfeeaddonamount = this.etHouseRT;
                validator.put(getannualfeeaddonamount, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01ee: INVOKE  
                      (r0v118 'validator' com.mobsandgeeks.saripaar.Validator)
                      (r0v120 'getannualfeeaddonamount' o.getAnnualFeeAddOnAmount)
                      (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v3 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                      (wrap: o.getPromotion$10 : 0x01ea: CONSTRUCTOR  (r0v120 'getannualfeeaddonamount' o.getAnnualFeeAddOnAmount), (2131820987 int) call: o.getPromotion.10.<init>(android.widget.EditText, int):void type: CONSTRUCTOR)
                     elemType: com.mobsandgeeks.saripaar.QuickRule)
                     type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.Page6PLFragment.onChooseNegara(o.PilihNegaraBagianActivity):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6PLFragment.class
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getPromotion, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                    	at jadx.core.codegen.InsnGen.processVarArg(InsnGen.java:998)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:971)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                    	... 29 more
                    */
                /*
                // Method dump skipped, instructions count: 1065
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6PLFragment.onChooseNegara(o.PilihNegaraBagianActivity):void");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseProvinsi(PilihProvinsiActivity pilihProvinsiActivity) {
                c(this.viewGroupDataAlamat.indexOf(this.etHouseProvince));
                c(this.viewGroupDataAlamat.indexOf(this.etHouseCity));
                c(this.viewGroupDataAlamat.indexOf(this.etHouseSubDistric));
                c(this.viewGroupDataAlamat.indexOf(this.etHouseVillage));
                c(this.viewGroupDataAlamat.indexOf(this.etHousePostCode));
                this.llKotaDomisili.setVisibility(0);
                this.tilKotaRumah.setHintEnabled(false);
                this.llKecamatanDomisili.setVisibility(8);
                this.llKelurahanDomisili.setVisibility(8);
                this.llKodePosRumahDomisili.setVisibility(8);
                this.etHouseCity.getText().clear();
                this.etHouseVillage.getText().clear();
                this.etHouseSubDistric.getText().clear();
                this.etHousePostCode.getText().clear();
                this.tilProvinsi.setHintEnabled(true);
                this.etHouseProvince.setText(pilihProvinsiActivity.e);
                ((FormActivity) getActivity()).n.setResProvince(pilihProvinsiActivity.e);
                ((FormActivity) getActivity()).n.setResCity("");
                ((FormActivity) getActivity()).n.setResSubDistrict("");
                ((FormActivity) getActivity()).n.setResVillage("");
                ((FormActivity) getActivity()).n.setResPostCode("");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseProvinsiHome(PilihNegaraPemrekActivity_ViewBinding pilihNegaraPemrekActivity_ViewBinding) {
                d(this.viewGroupDataAlamatNKTP.indexOf(this.etHouseProvinceHome));
                d(this.viewGroupDataAlamatNKTP.indexOf(this.etHouseCityHome));
                d(this.viewGroupDataAlamatNKTP.indexOf(this.etHouseSubDistricHome));
                d(this.viewGroupDataAlamatNKTP.indexOf(this.etHouseVillageHome));
                d(this.viewGroupDataAlamatNKTP.indexOf(this.etHousePostCodeHome));
                this.llKotaHome.setVisibility(0);
                this.tilKotaRumahHome.setHintEnabled(false);
                this.llKecamatanHome.setVisibility(8);
                this.llKelurahanHome.setVisibility(8);
                this.llKodePosRumahHome.setVisibility(8);
                this.etHouseCityHome.getText().clear();
                this.etHouseVillageHome.getText().clear();
                this.etHouseSubDistricHome.getText().clear();
                this.etHousePostCodeHome.getText().clear();
                this.tilProvinsiHome.setHintEnabled(true);
                this.etHouseProvinceHome.setText(pilihNegaraPemrekActivity_ViewBinding.d);
                ((FormActivity) getActivity()).n.setHmProvince(pilihNegaraPemrekActivity_ViewBinding.d);
                ((FormActivity) getActivity()).n.setHmCity("");
                ((FormActivity) getActivity()).n.setHmSubDistrict("");
                ((FormActivity) getActivity()).n.setHmVillage("");
                ((FormActivity) getActivity()).n.setHmPostCode("");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseProvinsiKantor(onChooseProvinsiHome onchooseprovinsihome) {
                e(this.viewGroupDataPekerjaan.indexOf(this.etOfficeProvince));
                e(this.viewGroupDataPekerjaan.indexOf(this.etOfficeCity));
                e(this.viewGroupDataPekerjaan.indexOf(this.etOfficePostCode));
                this.llKotaKantor.setVisibility(0);
                this.tilKotaKantor.setHintEnabled(false);
                this.llKodePosKantor.setVisibility(8);
                this.etOfficeCity.getText().clear();
                this.etOfficePostCode.getText().clear();
                this.tilProvinsiKantor.setHintEnabled(true);
                this.etOfficeProvince.setText(onchooseprovinsihome.d);
                ((FormActivity) getActivity()).n.setOfficeProvince(onchooseprovinsihome.d);
                ((FormActivity) getActivity()).n.setOfficeCity("");
                ((FormActivity) getActivity()).n.setOfficePostCode("");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseTujuan(ReservasiTundaSuccessActivity_ViewBinding reservasiTundaSuccessActivity_ViewBinding) {
                this.etPurposePemRek.setText(reservasiTundaSuccessActivity_ViewBinding.e);
                ((FormActivity) getActivity()).n.setPurposePemRek(String.valueOf(reservasiTundaSuccessActivity_ViewBinding.a + 1));
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValueAgamaEvent(ProfileActivity profileActivity) {
                b(this.viewGroupDataDiri.indexOf(this.etReligion));
                this.etReligion.setError(null);
                this.tilAgama.setHintEnabled(true);
                this.etReligion.setText(profileActivity.b);
                ((FormActivity) getActivity()).n.setReligion(profileActivity.c);
                ((FormActivity) getActivity()).n.setReligionValue(profileActivity.b);
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValueBidangPekerjaan(PilihTujuanTransaksiORActivity_ViewBinding pilihTujuanTransaksiORActivity_ViewBinding) {
                this.tilBidangUsaha.setHintEnabled(true);
                this.etBussinesField.setText("");
                ((FormActivity) getActivity()).n.setBusinessField("");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValueDescPekerjaan(RegistrationActivity registrationActivity) {
                this.tilJabatan.setHintEnabled(true);
                this.etOccupation.setText("");
                ((FormActivity) getActivity()).n.setOccupation("");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValueJenisKartuEvent(onClickPlus onclickplus) {
                this.etTypeCard.setError(null);
                this.etTypeCard.setText(onclickplus.e);
                ((FormActivity) getActivity()).n.setDebitCardType(onclickplus.e);
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValueJenisPekerjaan(RegistrationSuccessActivity_ViewBinding registrationSuccessActivity_ViewBinding) {
                this.tilPekerjaan.setHintEnabled(true);
                this.etJob.setError(null);
                this.etJob.setText(this.jenisPekerjaan[registrationSuccessActivity_ViewBinding.e]);
                if (!registrationSuccessActivity_ViewBinding.a.isEmpty()) {
                    this.tilJabatan.setHintEnabled(true);
                    this.etOccupation.setText(registrationSuccessActivity_ViewBinding.a);
                }
                if (!((FormActivity) getActivity()).n.getJob().equals(String.valueOf(registrationSuccessActivity_ViewBinding.e + 1))) {
                    ((FormActivity) getActivity()).n.setJob(String.valueOf(registrationSuccessActivity_ViewBinding.e + 1));
                    ((FormActivity) getActivity()).n.setOfficeName("");
                    ((FormActivity) getActivity()).n.setOfficeAddress("");
                    ((FormActivity) getActivity()).n.setOfficeCity("");
                    ((FormActivity) getActivity()).n.setOfficePostCode("");
                    ((FormActivity) getActivity()).n.setOccupation(registrationSuccessActivity_ViewBinding.a);
                    ((FormActivity) getActivity()).n.setBusinessField("");
                    ((FormActivity) getActivity()).n.setJobOthers("");
                }
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValuePendidikanEvent(ReservasiCSOActivity_ViewBinding reservasiCSOActivity_ViewBinding) {
                ((FormActivity) getActivity()).n.setLastEducation(reservasiCSOActivity_ViewBinding.d);
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValuePenghasilanPerTahun(ReservasiSuccessActivity reservasiSuccessActivity) {
                this.etPenghasilan.setError(null);
                this.tilPenghasilan.setHintEnabled(true);
                this.etPenghasilan.setText(((FormActivity) getActivity()).x.get(reservasiSuccessActivity.c).getContentName().getIndonesian());
                ((FormActivity) getActivity()).n.setSalary(((FormActivity) getActivity()).x.get(reservasiSuccessActivity.c).getContentOrder());
                ((FormActivity) getActivity()).n.setSalaryValue(((FormActivity) getActivity()).x.get(reservasiSuccessActivity.c).getContentName().getIndonesian());
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValuePerkawinanEvent(ReservasiListChosenActivity_ViewBinding reservasiListChosenActivity_ViewBinding) {
                b(this.viewGroupDataDiri.indexOf(this.etMaritStatus));
                this.etMaritStatus.setError(null);
                this.etMaritStatus.setText(reservasiListChosenActivity_ViewBinding.d);
                ((FormActivity) getActivity()).n.setMaritalStatus(reservasiListChosenActivity_ViewBinding.c);
                ((FormActivity) getActivity()).n.setMaritalStatusValue(reservasiListChosenActivity_ViewBinding.d);
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValueStatusNPWP(ReservasiSuccessAskNextActivity_ViewBinding reservasiSuccessAskNextActivity_ViewBinding) {
                this.tilStatusNPWP.setHintEnabled(true);
                this.etStatusNPWP.setText(reservasiSuccessAskNextActivity_ViewBinding.d);
                if (reservasiSuccessAskNextActivity_ViewBinding.d.equals("Individu")) {
                    ((FormActivity) getActivity()).n.setFlagNPWP("I");
                } else {
                    ((FormActivity) getActivity()).n.setFlagNPWP("S");
                }
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValueStatusTempatTinggal(ReservasiTellerSuccessActivity reservasiTellerSuccessActivity) {
                ((FormActivity) getActivity()).n.setHmHouseStatus(String.valueOf(reservasiTellerSuccessActivity.d + 1));
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onChooseValueSumberPenghasilan(ReservasiTellerSuccessActivity_ViewBinding reservasiTellerSuccessActivity_ViewBinding) {
                e(this.viewGroupDataPekerjaan.indexOf(this.etPenghasilanLain));
                this.etSumberPenghasilan.setError(null);
                this.tilSumberPenghasilan.setHintEnabled(true);
                this.etSumberPenghasilan.setText(((FormActivity) getActivity()).w.get(reservasiTellerSuccessActivity_ViewBinding.d).getContentName().getIndonesian());
                ((FormActivity) getActivity()).n.setIncomeSource(((FormActivity) getActivity()).w.get(reservasiTellerSuccessActivity_ViewBinding.d).getContentOrder());
                ((FormActivity) getActivity()).n.setIncomeSourceValue(((FormActivity) getActivity()).w.get(reservasiTellerSuccessActivity_ViewBinding.d).getContentName().getIndonesian());
                if (!"Lainnya".equals(this.etSumberPenghasilan.getText().toString())) {
                    e(this.viewGroupDataPekerjaan.indexOf(this.etPenghasilanLain));
                    this.p.removeRules(this.etPenghasilanLain);
                } else {
                    Validator validator = this.p;
                    EditText editText = this.etPenghasilanLain;
                    validator.put(editText, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e2: INVOKE  
                          (r0v34 'validator' com.mobsandgeeks.saripaar.Validator)
                          (r0v36 'editText' android.widget.EditText)
                          (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v11 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                          (wrap: o.getPromotion$10 : 0x00de: CONSTRUCTOR  (r0v36 'editText' android.widget.EditText), (2131820807 int) call: o.getPromotion.10.<init>(android.widget.EditText, int):void type: CONSTRUCTOR)
                         elemType: com.mobsandgeeks.saripaar.QuickRule)
                         type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.Page6PLFragment.onChooseValueSumberPenghasilan(o.ReservasiTellerSuccessActivity_ViewBinding):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6PLFragment.class
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getPromotion, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                        	at jadx.core.codegen.InsnGen.processVarArg(InsnGen.java:998)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:971)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                        	... 21 more
                        */
                    /*
                    // Method dump skipped, instructions count: 320
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6PLFragment.onChooseValueSumberPenghasilan(o.ReservasiTellerSuccessActivity_ViewBinding):void");
                }

                @OnClick({2131296996})
                public void onClickDataRekening(View view) {
                    if (view.getId() == 2131296996) {
                        getView().clearFocus();
                        JenisKartuDialog jenisKartuDialog = new JenisKartuDialog();
                        Bundle bundle = new Bundle();
                        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etTypeCard.getText().toString());
                        jenisKartuDialog.setArguments(bundle);
                        jenisKartuDialog.show(getFragmentManager(), "JenisKartuDialog");
                    }
                }

                @OnClick({2131299703})
                public void onClickUbahDataAlamat(View view) {
                    this.tvUbahDataAlamatResidence.setVisibility(8);
                    this.llLayoutDataAlamatResidenceEditable.setVisibility(0);
                    this.llLayoutDataAlamatResidenceUneditable.setVisibility(8);
                    AccountOpeningResponse$$Parcelable accountOpeningResponse$$Parcelable = new Runnable() { // from class: o.AccountOpeningResponse$$Parcelable
                        @Override // java.lang.Runnable
                        public final void run() {
                            Page6PLFragment page6PLFragment = Page6PLFragment.this;
                            EditText editText = null;
                            for (int size = page6PLFragment.viewGroupDataAlamat.size() - 1; size >= 0; size--) {
                                editText = editText;
                                if (page6PLFragment.viewGroupDataAlamat.get(size).getVisibility() == 0) {
                                    editText = editText;
                                    if (page6PLFragment.viewGroupDataAlamat.get(size).isFocusable()) {
                                        editText = editText;
                                        if (page6PLFragment.viewGroupDataAlamat.get(size).isEnabled()) {
                                            editText = page6PLFragment.viewGroupDataAlamat.get(size);
                                        }
                                    }
                                }
                            }
                            if (editText != null) {
                                editText.requestFocus();
                            }
                        }
                    };
                    TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataAlamatResidence.getBackground();
                    transitionDrawable.setCrossFadeEnabled(true);
                    if (this.llDataAlamatResidence.getVisibility() == 8) {
                        this.h.c(this.llDataAlamatResidence);
                        setMessage setmessage = this.h;
                        ImageView imageView = this.ivDataAlamatResidence;
                        setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                        setmessage.e(imageView);
                        transitionDrawable.startTransition(0);
                        new Handler().postDelayed(accountOpeningResponse$$Parcelable, 300);
                        return;
                    }
                    accountOpeningResponse$$Parcelable.run();
                }

                @OnClick({2131299702})
                public void onClickUbahDataAlamatIdentitas(View view) {
                    this.tvUbahDataAlamatHome.setVisibility(8);
                    this.llLayoutDataAlamatHomeEditable.setVisibility(0);
                    this.llLayoutDataAlamatHomeUneditable.setVisibility(8);
                    setTxnDataOutput settxndataoutput = new Runnable() { // from class: o.setTxnDataOutput
                        @Override // java.lang.Runnable
                        public final void run() {
                            Page6PLFragment page6PLFragment = Page6PLFragment.this;
                            EditText editText = null;
                            for (int size = page6PLFragment.viewGroupDataAlamatNKTP.size() - 1; size >= 0; size--) {
                                editText = editText;
                                if (page6PLFragment.viewGroupDataAlamatNKTP.get(size).getVisibility() == 0) {
                                    editText = editText;
                                    if (page6PLFragment.viewGroupDataAlamatNKTP.get(size).isFocusable()) {
                                        editText = editText;
                                        if (page6PLFragment.viewGroupDataAlamatNKTP.get(size).isEnabled()) {
                                            editText = page6PLFragment.viewGroupDataAlamatNKTP.get(size);
                                        }
                                    }
                                }
                            }
                            if (editText != null) {
                                editText.requestFocus();
                            }
                        }
                    };
                    TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataAlamatHome.getBackground();
                    transitionDrawable.setCrossFadeEnabled(true);
                    if (this.llDataAlamatHome.getVisibility() == 8) {
                        this.h.c(this.llDataAlamatHome);
                        setMessage setmessage = this.h;
                        ImageView imageView = this.ivDataAlamatHome;
                        setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                        setmessage.e(imageView);
                        transitionDrawable.startTransition(0);
                        new Handler().postDelayed(settxndataoutput, 300);
                        return;
                    }
                    settxndataoutput.run();
                }

                @OnClick({2131299705})
                public void onClickUbahDataDiri(View view) {
                    this.tvUbahDataDiri.setVisibility(8);
                    this.llLayoutDataDiriEditable.setVisibility(0);
                    this.llLayoutDataDiriUneditable.setVisibility(8);
                    getValue getvalue = new Runnable() { // from class: o.getValue
                        @Override // java.lang.Runnable
                        public final void run() {
                            Page6PLFragment page6PLFragment = Page6PLFragment.this;
                            EditText editText = null;
                            for (int size = page6PLFragment.viewGroupDataDiri.size() - 1; size >= 0; size--) {
                                editText = editText;
                                if (page6PLFragment.viewGroupDataDiri.get(size).getVisibility() == 0) {
                                    editText = editText;
                                    if (page6PLFragment.viewGroupDataDiri.get(size).isFocusable()) {
                                        editText = editText;
                                        if (page6PLFragment.viewGroupDataDiri.get(size).isEnabled()) {
                                            editText = page6PLFragment.viewGroupDataDiri.get(size);
                                        }
                                    }
                                }
                            }
                            if (editText != null) {
                                editText.requestFocus();
                            }
                        }
                    };
                    TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataDiri.getBackground();
                    transitionDrawable.setCrossFadeEnabled(true);
                    if (this.llDataDiri.getVisibility() == 8) {
                        this.h.c(this.llDataDiri);
                        setMessage setmessage = this.h;
                        ImageView imageView = this.ivDataDiri;
                        setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                        setmessage.e(imageView);
                        transitionDrawable.startTransition(0);
                        new Handler().postDelayed(getvalue, 300);
                        return;
                    }
                    getvalue.run();
                }

                @OnClick({2131299713})
                public void onClickUbahDataPekerjaan(View view) {
                    this.tvUbahDataPekerjaan.setVisibility(8);
                    this.llLayoutDataPekerjaanEditable.setVisibility(0);
                    this.llLayoutDataPekerjaanUneditable.setVisibility(8);
                    AccountOpeningResponse.Description description = new AccountOpeningResponse.Description(this);
                    TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataPekerjaan.getBackground();
                    transitionDrawable.setCrossFadeEnabled(true);
                    if (this.llDataPekerjaan.getVisibility() == 8) {
                        this.h.c(this.llDataPekerjaan);
                        setMessage setmessage = this.h;
                        ImageView imageView = this.ivDataPekerjaan;
                        setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                        setmessage.e(imageView);
                        transitionDrawable.startTransition(0);
                        new Handler().postDelayed(description, 300);
                        return;
                    }
                    description.run();
                }

                @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
                public void onCreate(Bundle bundle) {
                    onCreate(bundle);
                    this.l = new AccountOpeningPresenter();
                }

                @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
                public void onDestroyView() {
                    onDestroyView();
                    this.c.close();
                    AccountOpeningPresenter accountOpeningPresenter = this.l;
                    Call<OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.AccountOpeningResponse>> call = accountOpeningPresenter.a;
                    if (call != null) {
                        call.cancel();
                    }
                    accountOpeningPresenter.c = null;
                    CheckUserPresenter checkUserPresenter = this.n;
                    Call<OpenAccountSuccessActivity<Object>> call2 = checkUserPresenter.d;
                    if (call2 != null) {
                        call2.cancel();
                    }
                    checkUserPresenter.b = null;
                    SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.q;
                    Call<OpenAccountSuccessActivity<Object>> call3 = sendEmailTransactionSuccessPresenter.a;
                    if (call3 != null) {
                        call3.cancel();
                    }
                    sendEmailTransactionSuccessPresenter.b = null;
                    ReRegistrationPresenter reRegistrationPresenter = this.m;
                    Call<OpenAccountSuccessActivity<Object>> call4 = reRegistrationPresenter.b;
                    if (call4 != null) {
                        call4.cancel();
                    }
                    reRegistrationPresenter.e = null;
                    documentProvider.b().e(this);
                }

                @OnFocusChange({2131297084, 2131296930, 2131297168, 2131297171, 2131297162, 2131297035, 2131297012, 2131297015, 2131297023})
                public void onFocusChangeAlamat(View view, boolean z) {
                    if (z) {
                        switch (view.getId()) {
                            case 2131296930:
                                this.tilAlamatSaatIni.setHintEnabled(true);
                                return;
                            case 2131297012:
                                this.tilKecamatan.setHintEnabled(true);
                                return;
                            case 2131297015:
                                this.tilKelurahan.setHintEnabled(true);
                                return;
                            case 2131297023:
                                this.tilKodePosRumah.setHintEnabled(true);
                                return;
                            case 2131297035:
                                this.tilKotaRumah.setHintEnabled(true);
                                return;
                            case 2131297084:
                                this.tilNegaraDomisili.setHintEnabled(true);
                                return;
                            case 2131297162:
                                this.tilProvinsi.setHintEnabled(true);
                                return;
                            case 2131297168:
                                this.tilRt.setHintEnabled(true);
                                return;
                            case 2131297171:
                                this.tilRw.setHintEnabled(true);
                                return;
                            default:
                                return;
                        }
                    } else {
                        switch (view.getId()) {
                            case 2131296930:
                                if (this.etHouseAddr.getText().toString().isEmpty()) {
                                    this.tilAlamatSaatIni.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297012:
                                if (this.etHouseSubDistric.getText().toString().isEmpty()) {
                                    this.tilKecamatan.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297015:
                                if (this.etHouseVillage.getText().toString().isEmpty()) {
                                    this.tilKelurahan.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297023:
                                if (this.etHousePostCode.getText().toString().isEmpty()) {
                                    this.tilKodePosRumah.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297035:
                                if (this.etHouseCity.getText().toString().isEmpty()) {
                                    this.tilKotaRumah.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297084:
                                if (this.etNegaraDomisili.getText().toString().isEmpty()) {
                                    this.tilNegaraDomisili.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297162:
                                if (this.etHouseProvince.getText().toString().isEmpty()) {
                                    this.tilProvinsi.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297168:
                                if (this.etHouseRT.getText().toString().isEmpty()) {
                                    this.tilRt.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297171:
                                if (this.etHouseRW.getText().toString().isEmpty()) {
                                    this.tilRw.setHintEnabled(false);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                }

                @OnFocusChange({2131297085, 2131296942, 2131297169, 2131297172, 2131297163, 2131297039, 2131297013, 2131297016, 2131297026})
                public void onFocusChangeAlamatNonKtp(View view, boolean z) {
                    if (z) {
                        switch (view.getId()) {
                            case 2131296942:
                                this.tilAlamatSaatIniHome.setHintEnabled(true);
                                return;
                            case 2131297013:
                                this.tilKecamatanHome.setHintEnabled(true);
                                return;
                            case 2131297016:
                                this.tilKelurahanHome.setHintEnabled(true);
                                return;
                            case 2131297026:
                                this.tilKodePosRumahHome.setHintEnabled(true);
                                return;
                            case 2131297039:
                                this.tilKotaRumahHome.setHintEnabled(true);
                                return;
                            case 2131297085:
                                this.tilNegaraHome.setHintEnabled(true);
                                return;
                            case 2131297163:
                                this.tilProvinsiHome.setHintEnabled(true);
                                return;
                            case 2131297169:
                                this.tilRtHome.setHintEnabled(true);
                                return;
                            case 2131297172:
                                this.tilRwHome.setHintEnabled(true);
                                return;
                            default:
                                return;
                        }
                    } else {
                        switch (view.getId()) {
                            case 2131296942:
                                if (this.etHouseAddrHome.getText().toString().isEmpty()) {
                                    this.tilAlamatSaatIniHome.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297013:
                                if (this.etHouseSubDistricHome.getText().toString().isEmpty()) {
                                    this.tilKecamatanHome.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297016:
                                if (this.etHouseVillageHome.getText().toString().isEmpty()) {
                                    this.tilKelurahanHome.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297026:
                                if (this.etHousePostCodeHome.getText().toString().isEmpty()) {
                                    this.tilKodePosRumahHome.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297039:
                                if (this.etHouseCityHome.getText().toString().isEmpty()) {
                                    this.tilKotaRumahHome.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297085:
                                if (this.etNegaraHome.getText().toString().isEmpty()) {
                                    this.tilNegaraHome.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297163:
                                if (this.etHouseProvinceHome.getText().toString().isEmpty()) {
                                    this.tilProvinsiHome.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297169:
                                if (this.etHouseRTHome.getText().toString().isEmpty()) {
                                    this.tilRtHome.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297172:
                                if (this.etHouseRWHome.getText().toString().isEmpty()) {
                                    this.tilRwHome.setHintEnabled(false);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @OnFocusChange({2131297060, 2131297103, 2131297086, 2131297045, 2131296997, 2131297087, 2131297037, 2131297207, 2131297197, 2131296925, 2131297058, 2131297021, 2131297094, 2131297019, 2131297115, 2131297105, 2131297046, 2131296976})
                public void onFocusChangeDataDiri(View view, boolean z) {
                    if (z) {
                        switch (view.getId()) {
                            case 2131296925:
                                this.tilAgama.setHintEnabled(true);
                                return;
                            case 2131296976:
                                this.tilEmail.setHintEnabled(true);
                                return;
                            case 2131296997:
                                this.tilJenisKelamin.setHintEnabled(true);
                                return;
                            case 2131297019:
                                this.tilKodeArea.setHintEnabled(true);
                                return;
                            case 2131297021:
                                this.tilKodeNegara.setHintEnabled(true);
                                return;
                            case 2131297037:
                                this.tilKotaLahir.setHintEnabled(true);
                                this.tilTanggalLahir.setHintEnabled(true);
                                break;
                            case 2131297045:
                                this.tilMasaBerlakuId.setHintEnabled(true);
                                return;
                            case 2131297046:
                                this.tilMasaBerlakuKitasKitap.setHintEnabled(true);
                                return;
                            case 2131297058:
                                this.tilNamaIbu.setHintEnabled(true);
                                return;
                            case 2131297060:
                                this.tilNamaId.setHintEnabled(true);
                                return;
                            case 2131297086:
                                this.tilNegaraId.setHintEnabled(true);
                                return;
                            case 2131297087:
                                this.tilNegaraLahir.setHintEnabled(true);
                                this.tilKotaLahir.setHintEnabled(true);
                                this.tilTanggalLahir.setHintEnabled(true);
                                break;
                            case 2131297094:
                                this.tilNoHp.setHintEnabled(true);
                                return;
                            case 2131297103:
                                this.tilNomorId.setHintEnabled(true);
                                return;
                            case 2131297105:
                                this.tilNoKitasKitap.setHintEnabled(true);
                                return;
                            case 2131297115:
                                this.tilNoTelp.setHintEnabled(true);
                                return;
                            case 2131297197:
                                break;
                            case 2131297207:
                                this.tilTanggalLahir.setHintEnabled(true);
                                break;
                            default:
                                return;
                        }
                        this.tilStatusPerkawinan.setHintEnabled(true);
                        return;
                    }
                    switch (view.getId()) {
                        case 2131296925:
                            if (this.etReligion.getText().toString().isEmpty()) {
                                this.tilAgama.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131296976:
                            if (this.etEmail.getText().toString().isEmpty()) {
                                this.tilEmail.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131296997:
                            if (this.etSex.getText().toString().isEmpty()) {
                                this.tilJenisKelamin.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297019:
                            if (this.etKodeArea.getText().toString().isEmpty()) {
                                this.tilKodeArea.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297021:
                            if (this.etKodeNegara.getText().toString().isEmpty()) {
                                this.tilKodeNegara.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297037:
                            if (this.etKotaLahir.getText().toString().isEmpty()) {
                                this.tilKotaLahir.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297045:
                            if (this.etExpId.getText().toString().isEmpty()) {
                                this.tilMasaBerlakuId.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297046:
                            if (this.etMasaBerlakuKitasKitap.getText().toString().isEmpty()) {
                                this.tilMasaBerlakuKitasKitap.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297058:
                            if (this.etMotherName.getText().toString().isEmpty()) {
                                this.tilNamaIbu.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297060:
                            if (this.etNamaId.getText().toString().isEmpty()) {
                                this.tilNamaId.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297086:
                            if (this.etNegaraId.getText().toString().isEmpty()) {
                                this.tilNegaraId.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297087:
                            if (this.etNegaraLahir.getText().toString().isEmpty()) {
                                this.tilNegaraLahir.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297094:
                            if (this.etNoHp.getText().toString().isEmpty()) {
                                this.tilNoHp.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297103:
                            if (this.etNoId.getText().toString().isEmpty()) {
                                this.tilNomorId.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297105:
                            if (this.etNoKitasKitap.getText().toString().isEmpty()) {
                                this.tilNoKitasKitap.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297115:
                            if (this.etNoTelp.getText().toString().isEmpty()) {
                                this.tilNoTelp.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297197:
                            if (this.etMaritStatus.getText().toString().isEmpty()) {
                                this.tilStatusPerkawinan.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297207:
                            if (this.etBornDate.getText().toString().isEmpty()) {
                                this.tilTanggalLahir.setHintEnabled(false);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }

                @OnFocusChange({2131297106, 2131297061, 2131297146, 2131296992, 2131296967, 2131296931, 2131297036, 2131297024, 2131297164, 2131297003})
                public void onFocusChangePekerjaan(View view, boolean z) {
                    if (z) {
                        switch (view.getId()) {
                            case 2131296931:
                                this.tilAlamatKantor.setHintEnabled(true);
                                return;
                            case 2131296967:
                                this.tilBidangUsaha.setHintEnabled(true);
                                return;
                            case 2131296992:
                                this.tilJabatan.setHintEnabled(true);
                                return;
                            case 2131297003:
                                this.tilJenisProfesi.setHintEnabled(true);
                                return;
                            case 2131297024:
                                this.tilKodePosKantor.setHintEnabled(true);
                                return;
                            case 2131297036:
                                this.tilKotaKantor.setHintEnabled(true);
                                return;
                            case 2131297061:
                                this.tilNamaKantor.setHintEnabled(true);
                                return;
                            case 2131297106:
                                this.tilNoNpwp.setHintEnabled(true);
                                return;
                            case 2131297146:
                                this.tilPenghasilanLain.setHintEnabled(true);
                                return;
                            case 2131297164:
                                this.tilProvinsiKantor.setHintEnabled(true);
                                return;
                            default:
                                return;
                        }
                    } else {
                        switch (view.getId()) {
                            case 2131296931:
                                if (this.etOfficeAddr.getText().toString().isEmpty()) {
                                    this.tilAlamatKantor.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131296967:
                                if (this.etBussinesField.getText().toString().isEmpty()) {
                                    this.tilBidangUsaha.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131296992:
                                if (this.etOccupation.getText().toString().isEmpty()) {
                                    this.tilJabatan.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297003:
                                if (this.etJenisProfesi.getText().toString().isEmpty()) {
                                    this.tilJenisProfesi.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297024:
                                if (this.etOfficePostCode.getText().toString().isEmpty()) {
                                    this.tilKodePosKantor.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297036:
                                if (this.etOfficeCity.getText().toString().isEmpty()) {
                                    this.tilKotaKantor.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297061:
                                if (this.etOfficeName.getText().toString().isEmpty()) {
                                    this.tilNamaKantor.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297106:
                                if (this.etNoNPWP.getText().toString().isEmpty()) {
                                    this.tilNoNpwp.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297146:
                                if (this.etPenghasilanLain.getText().toString().isEmpty()) {
                                    this.tilPenghasilanLain.setHintEnabled(false);
                                    return;
                                }
                                return;
                            case 2131297164:
                                if (this.etOfficeProvince.getText().toString().isEmpty()) {
                                    this.tilProvinsiKantor.setHintEnabled(false);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    }
                }

                @OnFocusChange({2131296996, 2131296990, 2131297053})
                public void onFocusChangeRekening(View view, boolean z) {
                    if (z) {
                        int id = view.getId();
                        if (id == 2131296990) {
                            this.tilInternetBanking.setHintEnabled(true);
                        } else if (id == 2131296996) {
                            this.tilJenisKartu.setHintEnabled(true);
                        } else if (id == 2131297053) {
                            this.tilMobileBanking.setHintEnabled(true);
                        }
                    } else {
                        int id2 = view.getId();
                        if (id2 != 2131296990) {
                            if (id2 != 2131296996) {
                                if (id2 == 2131297053 && this.etMobileBanking.getText().toString().isEmpty()) {
                                    this.tilMobileBanking.setHintEnabled(false);
                                }
                            } else if (this.etTypeCard.getText().toString().isEmpty()) {
                                this.tilJenisKartu.setHintEnabled(false);
                            }
                        } else if (this.etInternetBanking.getText().toString().isEmpty()) {
                            this.tilInternetBanking.setHintEnabled(false);
                        }
                    }
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @OnClick({2131297163, 2131297039, 2131297013, 2131297016, 2131297026, 2131297085})
                public void onUbahFieldDataAlamatHome(View view) {
                    switch (view.getId()) {
                        case 2131297013:
                            Intent intent = new Intent(getContext(), PilihKecamatanActivity.class);
                            intent.putExtra("provinsi", this.etHouseProvinceHome.getText().toString());
                            intent.putExtra("kota", this.etHouseCityHome.getText().toString());
                            intent.putExtra("type", "HOME");
                            startActivity(intent);
                            return;
                        case 2131297016:
                            Intent intent2 = new Intent(getContext(), com.bca.smartbranch.activity.PilihKelurahanActivity.class);
                            intent2.putExtra("provinsi", this.etHouseProvinceHome.getText().toString());
                            intent2.putExtra("kota", this.etHouseCityHome.getText().toString());
                            intent2.putExtra("kecamatan", this.etHouseSubDistricHome.getText().toString());
                            intent2.putExtra("type", "HOME");
                            startActivity(intent2);
                            return;
                        case 2131297026:
                            Intent intent3 = new Intent(getContext(), com.bca.smartbranch.activity.PilihKodePosActivity.class);
                            intent3.putExtra("provinsi", this.etHouseProvinceHome.getText().toString());
                            intent3.putExtra("kota", this.etHouseCityHome.getText().toString());
                            intent3.putExtra("kecamatan", this.etHouseSubDistricHome.getText().toString());
                            intent3.putExtra("kelurahan", this.etHouseVillageHome.getText().toString());
                            intent3.putExtra("type", "HOME");
                            startActivity(intent3);
                            return;
                        case 2131297039:
                            Intent intent4 = new Intent(getContext(), PilihKotaActivity.class);
                            intent4.putExtra("provinsi", this.etHouseProvinceHome.getText().toString());
                            intent4.putExtra("type", "HOME");
                            startActivity(intent4);
                            return;
                        case 2131297085:
                            Intent intent5 = new Intent(getContext(), PilihNegaraPemrekActivity.class);
                            intent5.putExtra("type", "NEGARA_ALAMAT");
                            startActivity(intent5);
                            return;
                        case 2131297163:
                            Intent intent6 = new Intent(getContext(), com.bca.smartbranch.activity.PilihProvinsiActivity.class);
                            intent6.putExtra("type", "HOME");
                            startActivity(intent6);
                            return;
                        default:
                            return;
                    }
                }

                @OnClick({2131297162, 2131297035, 2131297012, 2131297015, 2131297023, 2131297084})
                public void onUbahFieldDataAlamatRes(View view) {
                    switch (view.getId()) {
                        case 2131297012:
                            Intent intent = new Intent(getContext(), PilihKecamatanActivity.class);
                            intent.putExtra("provinsi", this.etHouseProvince.getText().toString());
                            intent.putExtra("kota", this.etHouseCity.getText().toString());
                            intent.putExtra("type", "RES");
                            startActivity(intent);
                            return;
                        case 2131297015:
                            Intent intent2 = new Intent(getContext(), com.bca.smartbranch.activity.PilihKelurahanActivity.class);
                            intent2.putExtra("provinsi", this.etHouseProvince.getText().toString());
                            intent2.putExtra("kota", this.etHouseCity.getText().toString());
                            intent2.putExtra("kecamatan", this.etHouseSubDistric.getText().toString());
                            intent2.putExtra("type", "RES");
                            startActivity(intent2);
                            return;
                        case 2131297023:
                            Intent intent3 = new Intent(getContext(), com.bca.smartbranch.activity.PilihKodePosActivity.class);
                            intent3.putExtra("provinsi", this.etHouseProvince.getText().toString());
                            intent3.putExtra("kota", this.etHouseCity.getText().toString());
                            intent3.putExtra("kecamatan", this.etHouseSubDistric.getText().toString());
                            intent3.putExtra("kelurahan", this.etHouseVillage.getText().toString());
                            intent3.putExtra("type", "RES");
                            startActivity(intent3);
                            return;
                        case 2131297035:
                            Intent intent4 = new Intent(getContext(), PilihKotaActivity.class);
                            intent4.putExtra("provinsi", this.etHouseProvince.getText().toString());
                            intent4.putExtra("type", "RES");
                            startActivity(intent4);
                            return;
                        case 2131297084:
                            Intent intent5 = new Intent(getContext(), PilihNegaraPemrekActivity.class);
                            intent5.putExtra("type", "NEGARA_DOMISILI");
                            startActivity(intent5);
                            return;
                        case 2131297162:
                            Intent intent6 = new Intent(getContext(), com.bca.smartbranch.activity.PilihProvinsiActivity.class);
                            intent6.putExtra("type", "RES");
                            startActivity(intent6);
                            return;
                        default:
                            return;
                    }
                }

                @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
                public void onValidationFailed(List<ValidationError> list) {
                    EditText editText;
                    LinearLayout linearLayout;
                    EditText editText2 = null;
                    LinearLayout linearLayout2 = null;
                    for (ValidationError validationError : list) {
                        View view = validationError.getView();
                        String message = validationError.getFailedRules().get(0).getMessage(getContext());
                        LinearLayout linearLayout3 = linearLayout2;
                        if (!this.etNoTelp.getText().toString().isEmpty()) {
                            linearLayout3 = linearLayout2;
                            if (this.etKodeArea.getText().toString().isEmpty()) {
                                this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etKodeArea)).setVisibility(0);
                                this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etKodeArea)).setText(2131820935);
                                this.tilFormGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etKodeArea)).setBackgroundResource(2131230870);
                                linearLayout3 = linearLayout2;
                                if (linearLayout2 == null) {
                                    linearLayout3 = this.llMainDataDiri;
                                }
                            }
                        }
                        LinearLayout linearLayout4 = linearLayout3;
                        if (!this.etKodeArea.getText().toString().isEmpty()) {
                            linearLayout4 = linearLayout3;
                            if (this.etNoTelp.getText().toString().isEmpty()) {
                                this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etNoTelp)).setVisibility(0);
                                this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etNoTelp)).setText(2131820897);
                                this.tilFormGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etNoTelp)).setBackgroundResource(2131230870);
                                linearLayout4 = linearLayout3;
                                if (linearLayout3 == null) {
                                    linearLayout4 = this.llMainDataDiri;
                                }
                            }
                        }
                        if (this.viewGroupDataDiri.contains(view)) {
                            if (this.llDataDiri.getVisibility() == 8) {
                                this.h.c(this.llDataDiri);
                                setMessage setmessage = this.h;
                                ImageView imageView = this.ivDataDiri;
                                setmessage.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                                setmessage.e(imageView);
                            }
                            EditText editText3 = editText2;
                            if (view instanceof EditText) {
                                EditText editText4 = editText2;
                                if (editText2 == null) {
                                    editText4 = (EditText) view;
                                }
                                this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(view)).setVisibility(0);
                                this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(view)).setText(message);
                                this.tilFormGroupDataDiri.get(this.viewGroupDataDiri.indexOf(view)).setBackgroundResource(2131230870);
                                editText3 = editText4;
                                if (view.getId() == 2131297060) {
                                    if (((FormActivity) getActivity()).n.getTypeID().equals("Paspor")) {
                                        TextView textView = this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(view));
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(getString(2131821530));
                                        sb.append(" belum diisi");
                                        textView.setText(sb.toString());
                                        editText3 = editText4;
                                    } else if (((FormActivity) getActivity()).n.getTypeID().equals("Kartu Pelajar")) {
                                        TextView textView2 = this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(view));
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(getString(2131821532));
                                        sb2.append(" belum diisi");
                                        textView2.setText(sb2.toString());
                                        editText3 = editText4;
                                    } else {
                                        TextView textView3 = this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(view));
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(getString(2131821525));
                                        sb3.append(" belum diisi");
                                        textView3.setText(sb3.toString());
                                        editText3 = editText4;
                                    }
                                }
                            }
                            editText = editText3;
                            linearLayout = linearLayout4;
                            if (linearLayout4 == null) {
                                linearLayout = this.llMainDataDiri;
                                editText = editText3;
                            }
                        } else if (this.viewGroupDataAlamatNKTP.contains(view)) {
                            if (this.llDataAlamatHome.getVisibility() == 8) {
                                this.h.c(this.llDataAlamatHome);
                                setMessage setmessage2 = this.h;
                                ImageView imageView2 = this.ivDataAlamatHome;
                                setmessage2.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                                setmessage2.e(imageView2);
                            }
                            EditText editText5 = editText2;
                            if (view instanceof EditText) {
                                EditText editText6 = editText2;
                                if (editText2 == null) {
                                    editText6 = (EditText) view;
                                }
                                this.tvErrorGroupDataAlamatNKTP.get(this.viewGroupDataAlamatNKTP.indexOf(view)).setVisibility(0);
                                this.tvErrorGroupDataAlamatNKTP.get(this.viewGroupDataAlamatNKTP.indexOf(view)).setText(message);
                                this.tilFormGroupDataAlamatNKTP.get(this.viewGroupDataAlamatNKTP.indexOf(view)).setBackgroundResource(2131230870);
                                editText5 = editText6;
                                if (view.getId() == 2131296942) {
                                    if (((FormActivity) getActivity()).n.getTypeID().equals("Paspor")) {
                                        TextView textView4 = this.tvErrorGroupDataAlamatNKTP.get(this.viewGroupDataAlamatNKTP.indexOf(view));
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append(getString(2131821061));
                                        sb4.append(" belum diisi");
                                        textView4.setText(sb4.toString());
                                        editText5 = editText6;
                                    } else if (((FormActivity) getActivity()).n.getTypeID().equals("Kartu Pelajar")) {
                                        TextView textView5 = this.tvErrorGroupDataAlamatNKTP.get(this.viewGroupDataAlamatNKTP.indexOf(view));
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(getString(2131821059));
                                        sb5.append(" belum diisi");
                                        textView5.setText(sb5.toString());
                                        editText5 = editText6;
                                    } else {
                                        TextView textView6 = this.tvErrorGroupDataAlamatNKTP.get(this.viewGroupDataAlamatNKTP.indexOf(view));
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append(getString(2131821060));
                                        sb6.append(" belum diisi");
                                        textView6.setText(sb6.toString());
                                        editText5 = editText6;
                                    }
                                }
                            }
                            editText = editText5;
                            linearLayout = linearLayout4;
                            if (linearLayout4 == null) {
                                linearLayout = this.llMainDataAlamatHome;
                                editText = editText5;
                            }
                        } else if (this.viewGroupDataAlamat.contains(view)) {
                            if (this.llDataAlamatResidence.getVisibility() == 8) {
                                this.h.c(this.llDataAlamatResidence);
                                setMessage setmessage3 = this.h;
                                ImageView imageView3 = this.ivDataAlamatResidence;
                                setmessage3.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                                setmessage3.e(imageView3);
                            }
                            EditText editText7 = editText2;
                            if (view instanceof EditText) {
                                editText7 = editText2;
                                if (editText2 == null) {
                                    editText7 = (EditText) view;
                                }
                                this.tvErrorGroupDataAlamat.get(this.viewGroupDataAlamat.indexOf(view)).setVisibility(0);
                                this.tvErrorGroupDataAlamat.get(this.viewGroupDataAlamat.indexOf(view)).setText(message);
                                this.tilFormGroupDataAlamat.get(this.viewGroupDataAlamat.indexOf(view)).setBackgroundResource(2131230870);
                            }
                            editText = editText7;
                            linearLayout = linearLayout4;
                            if (linearLayout4 == null) {
                                linearLayout = this.llMainDataAlamatResidence;
                                editText = editText7;
                            }
                        } else if (this.viewGroupDataPekerjaan.contains(view)) {
                            if (this.llDataPekerjaan.getVisibility() == 8) {
                                this.h.c(this.llDataPekerjaan);
                                setMessage setmessage4 = this.h;
                                ImageView imageView4 = this.ivDataPekerjaan;
                                setmessage4.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                                setmessage4.e(imageView4);
                            }
                            EditText editText8 = editText2;
                            if (view instanceof EditText) {
                                EditText editText9 = editText2;
                                if (editText2 == null) {
                                    editText9 = (EditText) view;
                                }
                                this.tvErrorGroupDataPekerjaan.get(this.viewGroupDataPekerjaan.indexOf(view)).setVisibility(0);
                                this.tvErrorGroupDataPekerjaan.get(this.viewGroupDataPekerjaan.indexOf(view)).setText(message);
                                this.tilFormGroupDataPekerjaan.get(this.viewGroupDataPekerjaan.indexOf(view)).setBackgroundResource(2131230870);
                                if (view.getId() == 2131297106) {
                                    if (!((FormActivity) getActivity()).n.getTypeID().equals("Kartu Pelajar")) {
                                        this.tvErrorGroupDataPekerjaan.get(this.viewGroupDataPekerjaan.indexOf(view)).setText(message);
                                        editText8 = editText9;
                                    } else if (message.equalsIgnoreCase(this.invalidNpwpLengthMessage)) {
                                        this.tvErrorGroupDataPekerjaan.get(this.viewGroupDataPekerjaan.indexOf(view)).setText(this.invalidNpwpOrangtuaLengthMessage);
                                        editText8 = editText9;
                                    } else {
                                        this.tvErrorGroupDataPekerjaan.get(this.viewGroupDataPekerjaan.indexOf(view)).setText(this.invalidNpwpOrangtuaEmptyMessage);
                                        editText8 = editText9;
                                    }
                                } else if (view.getId() != 2131297061) {
                                    editText8 = editText9;
                                    if (view.getId() == 2131296931) {
                                        if ("1".equals(((FormActivity) getActivity()).n.getJob())) {
                                            TextView textView7 = this.tvErrorGroupDataPekerjaan.get(this.viewGroupDataPekerjaan.indexOf(view));
                                            StringBuilder sb7 = new StringBuilder();
                                            sb7.append(getString(2131821055));
                                            sb7.append(" belum diisi");
                                            textView7.setText(sb7.toString());
                                            editText8 = editText9;
                                        } else if ("8".equals(((FormActivity) getActivity()).n.getJob()) || "9".equals(((FormActivity) getActivity()).n.getJob()) || ReservasiOnline.LAYANAN_GIRO.equals(((FormActivity) getActivity()).n.getJob()) || "15".equals(((FormActivity) getActivity()).n.getJob())) {
                                            TextView textView8 = this.tvErrorGroupDataPekerjaan.get(this.viewGroupDataPekerjaan.indexOf(view));
                                            StringBuilder sb8 = new StringBuilder();
                                            sb8.append(getString(2131821063));
                                            sb8.append(" belum diisi");
                                            textView8.setText(sb8.toString());
                                            editText8 = editText9;
                                        } else {
                                            this.tvErrorGroupDataPekerjaan.get(this.viewGroupDataPekerjaan.indexOf(view)).setText(message);
                                            editText8 = editText9;
                                        }
                                    }
                                } else if ("1".equals(((FormActivity) getActivity()).n.getJob())) {
                                    TextView textView9 = this.tvErrorGroupDataPekerjaan.get(this.viewGroupDataPekerjaan.indexOf(view));
                                    StringBuilder sb9 = new StringBuilder();
                                    sb9.append(getString(2131821143));
                                    sb9.append(" belum diisi");
                                    textView9.setText(sb9.toString());
                                    editText8 = editText9;
                                } else if ("8".equals(((FormActivity) getActivity()).n.getJob()) || "9".equals(((FormActivity) getActivity()).n.getJob()) || ReservasiOnline.LAYANAN_GIRO.equals(((FormActivity) getActivity()).n.getJob()) || "15".equals(((FormActivity) getActivity()).n.getJob())) {
                                    TextView textView10 = this.tvErrorGroupDataPekerjaan.get(this.viewGroupDataPekerjaan.indexOf(view));
                                    StringBuilder sb10 = new StringBuilder();
                                    sb10.append(getString(2131821149));
                                    sb10.append(" belum diisi");
                                    textView10.setText(sb10.toString());
                                    editText8 = editText9;
                                } else {
                                    this.tvErrorGroupDataPekerjaan.get(this.viewGroupDataPekerjaan.indexOf(view)).setText(message);
                                    editText8 = editText9;
                                }
                            }
                            editText = editText8;
                            linearLayout = linearLayout4;
                            if (linearLayout4 == null) {
                                linearLayout = this.llMainDataPekerjaan;
                                editText = editText8;
                            }
                        } else {
                            editText = editText2;
                            linearLayout = linearLayout4;
                            if (this.viewGroupDataRekening.contains(view)) {
                                if (this.llDataRekening.getVisibility() == 8) {
                                    this.h.c(this.llDataRekening);
                                    setMessage setmessage5 = this.h;
                                    ImageView imageView5 = this.ivDataRekening;
                                    setmessage5.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                                    setmessage5.e(imageView5);
                                }
                                EditText editText10 = editText2;
                                if (view instanceof EditText) {
                                    editText10 = editText2;
                                    if (editText2 == null) {
                                        editText10 = (EditText) view;
                                    }
                                    this.tvErrorGroupDataRekening.get(this.viewGroupDataRekening.indexOf(view)).setVisibility(0);
                                    this.tvErrorGroupDataRekening.get(this.viewGroupDataRekening.indexOf(view)).setText(message);
                                    this.tilFormGroupDataRekening.get(this.viewGroupDataRekening.indexOf(view)).setBackgroundResource(2131230870);
                                }
                                editText = editText10;
                                linearLayout = linearLayout4;
                                if (linearLayout4 == null) {
                                    linearLayout = this.llMainDataRekening;
                                    editText = editText10;
                                }
                            }
                        }
                        editText2 = editText;
                        linearLayout2 = linearLayout;
                        if (view instanceof CheckBox) {
                            this.cbxAgree.setBackgroundDrawable(copyWindowDataInto.b(getContext(), 2131231323));
                            this.tvTermCondition.setTextColor(copyWindowDataInto.a(getContext(), 2131099826));
                            editText2 = editText;
                            linearLayout2 = linearLayout;
                        }
                    }
                    if (editText2 != null) {
                        editText2.requestFocus();
                    }
                }

                @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
                public void onValidationSucceeded() {
                    if (!this.etNoTelp.getText().toString().isEmpty() && this.etKodeArea.getText().toString().isEmpty()) {
                        this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etKodeArea)).setVisibility(0);
                        this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etKodeArea)).setText(2131820935);
                        this.tilFormGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etKodeArea)).setBackgroundResource(2131230870);
                    } else if (!this.etKodeArea.getText().toString().isEmpty() && this.etNoTelp.getText().toString().isEmpty()) {
                        this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etNoTelp)).setVisibility(0);
                        this.tvErrorGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etNoTelp)).setText(2131820897);
                        this.tilFormGroupDataDiri.get(this.viewGroupDataDiri.indexOf(this.etNoTelp)).setBackgroundResource(2131230870);
                    } else if (((FormActivity) getActivity()).q) {
                        j();
                        ((FormActivity) getActivity()).v();
                    } else {
                        e();
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public void onViewCreated(View view, Bundle bundle) {
                    onViewCreated(view, bundle);
                    setHasOptionsMenu(true);
                    documentProvider.b().c(this);
                    this.c = Realm.getDefaultInstance();
                    this.l.c = this;
                    ((setPadding) getActivity()).i();
                    ((setPadding) getActivity()).i().d(true);
                    ((setPadding) getActivity()).i().d("");
                    Validator validator = new Validator(this);
                    this.p = validator;
                    validator.setValidationListener(this);
                    this.p.validateInvisibleViews(true);
                    CheckUserPresenter checkUserPresenter = new CheckUserPresenter();
                    this.n = checkUserPresenter;
                    checkUserPresenter.b = this;
                    SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
                    this.q = sendEmailTransactionSuccessPresenter;
                    sendEmailTransactionSuccessPresenter.b = this;
                    ReRegistrationPresenter reRegistrationPresenter = new ReRegistrationPresenter();
                    this.m = reRegistrationPresenter;
                    reRegistrationPresenter.e = this;
                    ((FormActivity) getActivity()).n.setCurrentPage("Page6PLFragment");
                    if (!"Tahapan BCA".equals(((FormActivity) getActivity()).p)) {
                        this.p.removeRules(this.etTypeCard);
                    }
                    if (!"1".equals(((FormActivity) getActivity()).n.getFlagMB())) {
                        this.p.removeRules(this.etMobileBanking);
                    }
                    if ("Y".equals(((FormActivity) getActivity()).n.getFlagGuest())) {
                        this.llSyaratKetentuan.setVisibility(0);
                        this.tvTermCondition.setText(Html.fromHtml(this.txtTermCondition));
                    } else {
                        this.p.removeRules(this.cbxAgree);
                    }
                    if (this.etNoHp.getVisibility() == 0) {
                        ConfirmSubBCACardAdapter$ViewHolder confirmSubBCACardAdapter$ViewHolder = new ConfirmSubBCACardAdapter$ViewHolder();
                        confirmSubBCACardAdapter$ViewHolder.c = 2131820902;
                        confirmSubBCACardAdapter$ViewHolder.e = 2131820905;
                        confirmSubBCACardAdapter$ViewHolder.d = 2131820903;
                        confirmSubBCACardAdapter$ViewHolder.a = 2131820904;
                        Validator validator2 = this.p;
                        getAnnualFeeAddOnAmount getannualfeeaddonamount = this.etNoHp;
                        validator2.put(getannualfeeaddonamount, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0174: INVOKE  
                              (r0v1158 'validator2' com.mobsandgeeks.saripaar.Validator)
                              (r0v1160 'getannualfeeaddonamount' o.getAnnualFeeAddOnAmount)
                              (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v50 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                              (wrap: o.getPromotion$2 : 0x0170: CONSTRUCTOR  
                              (r0v1160 'getannualfeeaddonamount' o.getAnnualFeeAddOnAmount)
                              (r0v1152 'confirmSubBCACardAdapter$ViewHolder' o.ConfirmSubBCACardAdapter$ViewHolder)
                             call: o.getPromotion.2.<init>(android.widget.EditText, o.ConfirmSubBCACardAdapter$ViewHolder):void type: CONSTRUCTOR)
                             elemType: com.mobsandgeeks.saripaar.QuickRule)
                             type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.Page6PLFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6PLFragment.class
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getPromotion, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                            	at jadx.core.codegen.InsnGen.processVarArg(InsnGen.java:998)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:971)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                            	... 21 more
                            */
                        /*
                        // Method dump skipped, instructions count: 6725
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6PLFragment.onViewCreated(android.view.View, android.os.Bundle):void");
                    }

                    @OnClick({2131297332, 2131298893})
                    public void showDataAlamat(View view) {
                        getPromotion.d(getActivity());
                        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataAlamatResidence.getBackground();
                        transitionDrawable.setCrossFadeEnabled(true);
                        if (this.llDataAlamatResidence.getVisibility() == 8) {
                            this.h.c(this.llDataAlamatResidence);
                            setMessage setmessage = this.h;
                            ImageView imageView = this.ivDataAlamatResidence;
                            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                            setmessage.e(imageView);
                            transitionDrawable.startTransition(0);
                            return;
                        }
                        setMessage setmessage2 = this.h;
                        FrameLayout frameLayout = this.llDataAlamatResidence;
                        setmessage2.a = frameLayout.getMeasuredHeight();
                        setmessage2.b = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                              (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                              (r0v11 'setmessage2' o.setMessage)
                             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6PLFragment.showDataAlamat(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6PLFragment.class
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                            	... 19 more
                            */
                        /*
                            this = this;
                            r0 = r10
                            o.getView r0 = r0.getActivity()
                            o.getPromotion.d(r0)
                            r0 = r10
                            android.widget.LinearLayout r0 = r0.llHeaderDataAlamatResidence
                            android.graphics.drawable.Drawable r0 = r0.getBackground()
                            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                            r11 = r0
                            r0 = r11
                            r1 = 1
                            r0.setCrossFadeEnabled(r1)
                            r0 = r10
                            android.widget.FrameLayout r0 = r0.llDataAlamatResidence
                            int r0 = r0.getVisibility()
                            r1 = 8
                            if (r0 != r1) goto L_0x005a
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r1 = r10
                            android.widget.FrameLayout r1 = r1.llDataAlamatResidence
                            r0.c(r1)
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r12 = r0
                            r0 = r10
                            android.widget.ImageView r0 = r0.ivDataAlamatResidence
                            r13 = r0
                            r0 = r12
                            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                            r2 = r1
                            r3 = 0
                            r4 = -1020002304(0xffffffffc3340000, float:-180.0)
                            r5 = 1
                            r6 = 1056964608(0x3f000000, float:0.5)
                            r7 = 1
                            r8 = 1056964608(0x3f000000, float:0.5)
                            r2.<init>(r3, r4, r5, r6, r7, r8)
                            r0.c = r1
                            r0 = r12
                            r1 = r13
                            r0.e(r1)
                            r0 = r11
                            r1 = 0
                            r0.startTransition(r1)
                            return
                        L_0x005a:
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r12 = r0
                            r0 = r10
                            android.widget.FrameLayout r0 = r0.llDataAlamatResidence
                            r13 = r0
                            r0 = r12
                            r1 = r13
                            int r1 = r1.getMeasuredHeight()
                            r0.a = r1
                            r0 = r12
                            o.setMessage$1 r1 = new o.setMessage$1
                            r2 = r1
                            r3 = r12
                            r4 = r13
                            r2.<init>(r4)
                            r0.b = r1
                            r0 = r12
                            r1 = r13
                            r0.b(r1)
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r12 = r0
                            r0 = r10
                            android.widget.ImageView r0 = r0.ivDataAlamatResidence
                            r13 = r0
                            r0 = r12
                            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                            r2 = r1
                            r3 = -1020002304(0xffffffffc3340000, float:-180.0)
                            r4 = 0
                            r5 = 1
                            r6 = 1056964608(0x3f000000, float:0.5)
                            r7 = 1
                            r8 = 1056964608(0x3f000000, float:0.5)
                            r2.<init>(r3, r4, r5, r6, r7, r8)
                            r0.c = r1
                            r0 = r12
                            r1 = r13
                            r0.e(r1)
                            r0 = r11
                            r1 = 0
                            r0.reverseTransition(r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6PLFragment.showDataAlamat(android.view.View):void");
                    }

                    @OnClick({2131297331, 2131298892})
                    public void showDataAlamatNKTP(View view) {
                        getPromotion.d(getActivity());
                        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataAlamatHome.getBackground();
                        transitionDrawable.setCrossFadeEnabled(true);
                        if (this.llDataAlamatHome.getVisibility() == 8) {
                            this.h.c(this.llDataAlamatHome);
                            setMessage setmessage = this.h;
                            ImageView imageView = this.ivDataAlamatHome;
                            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                            setmessage.e(imageView);
                            transitionDrawable.startTransition(0);
                            return;
                        }
                        setMessage setmessage2 = this.h;
                        FrameLayout frameLayout = this.llDataAlamatHome;
                        setmessage2.a = frameLayout.getMeasuredHeight();
                        setmessage2.b = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                              (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                              (r0v11 'setmessage2' o.setMessage)
                             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6PLFragment.showDataAlamatNKTP(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6PLFragment.class
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                            	... 19 more
                            */
                        /*
                            this = this;
                            r0 = r10
                            o.getView r0 = r0.getActivity()
                            o.getPromotion.d(r0)
                            r0 = r10
                            android.widget.LinearLayout r0 = r0.llHeaderDataAlamatHome
                            android.graphics.drawable.Drawable r0 = r0.getBackground()
                            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                            r11 = r0
                            r0 = r11
                            r1 = 1
                            r0.setCrossFadeEnabled(r1)
                            r0 = r10
                            android.widget.FrameLayout r0 = r0.llDataAlamatHome
                            int r0 = r0.getVisibility()
                            r1 = 8
                            if (r0 != r1) goto L_0x005a
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r1 = r10
                            android.widget.FrameLayout r1 = r1.llDataAlamatHome
                            r0.c(r1)
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r12 = r0
                            r0 = r10
                            android.widget.ImageView r0 = r0.ivDataAlamatHome
                            r13 = r0
                            r0 = r12
                            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                            r2 = r1
                            r3 = 0
                            r4 = -1020002304(0xffffffffc3340000, float:-180.0)
                            r5 = 1
                            r6 = 1056964608(0x3f000000, float:0.5)
                            r7 = 1
                            r8 = 1056964608(0x3f000000, float:0.5)
                            r2.<init>(r3, r4, r5, r6, r7, r8)
                            r0.c = r1
                            r0 = r12
                            r1 = r13
                            r0.e(r1)
                            r0 = r11
                            r1 = 0
                            r0.startTransition(r1)
                            return
                        L_0x005a:
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r12 = r0
                            r0 = r10
                            android.widget.FrameLayout r0 = r0.llDataAlamatHome
                            r13 = r0
                            r0 = r12
                            r1 = r13
                            int r1 = r1.getMeasuredHeight()
                            r0.a = r1
                            r0 = r12
                            o.setMessage$1 r1 = new o.setMessage$1
                            r2 = r1
                            r3 = r12
                            r4 = r13
                            r2.<init>(r4)
                            r0.b = r1
                            r0 = r12
                            r1 = r13
                            r0.b(r1)
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r12 = r0
                            r0 = r10
                            android.widget.ImageView r0 = r0.ivDataAlamatHome
                            r13 = r0
                            r0 = r12
                            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                            r2 = r1
                            r3 = -1020002304(0xffffffffc3340000, float:-180.0)
                            r4 = 0
                            r5 = 1
                            r6 = 1056964608(0x3f000000, float:0.5)
                            r7 = 1
                            r8 = 1056964608(0x3f000000, float:0.5)
                            r2.<init>(r3, r4, r5, r6, r7, r8)
                            r0.c = r1
                            r0 = r12
                            r1 = r13
                            r0.e(r1)
                            r0 = r11
                            r1 = 0
                            r0.reverseTransition(r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6PLFragment.showDataAlamatNKTP(android.view.View):void");
                    }

                    @OnClick({2131297334, 2131298895})
                    public void showDataDiri(View view) {
                        getPromotion.d(getActivity());
                        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataDiri.getBackground();
                        transitionDrawable.setCrossFadeEnabled(true);
                        if (this.llDataDiri.getVisibility() == 8) {
                            this.h.c(this.llDataDiri);
                            setMessage setmessage = this.h;
                            ImageView imageView = this.ivDataDiri;
                            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                            setmessage.e(imageView);
                            transitionDrawable.startTransition(0);
                            return;
                        }
                        setMessage setmessage2 = this.h;
                        FrameLayout frameLayout = this.llDataDiri;
                        setmessage2.a = frameLayout.getMeasuredHeight();
                        setmessage2.b = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                              (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                              (r0v11 'setmessage2' o.setMessage)
                             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6PLFragment.showDataDiri(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6PLFragment.class
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                            	... 19 more
                            */
                        /*
                            this = this;
                            r0 = r10
                            o.getView r0 = r0.getActivity()
                            o.getPromotion.d(r0)
                            r0 = r10
                            android.widget.LinearLayout r0 = r0.llHeaderDataDiri
                            android.graphics.drawable.Drawable r0 = r0.getBackground()
                            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                            r11 = r0
                            r0 = r11
                            r1 = 1
                            r0.setCrossFadeEnabled(r1)
                            r0 = r10
                            android.widget.FrameLayout r0 = r0.llDataDiri
                            int r0 = r0.getVisibility()
                            r1 = 8
                            if (r0 != r1) goto L_0x005a
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r1 = r10
                            android.widget.FrameLayout r1 = r1.llDataDiri
                            r0.c(r1)
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r12 = r0
                            r0 = r10
                            android.widget.ImageView r0 = r0.ivDataDiri
                            r13 = r0
                            r0 = r12
                            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                            r2 = r1
                            r3 = 0
                            r4 = -1020002304(0xffffffffc3340000, float:-180.0)
                            r5 = 1
                            r6 = 1056964608(0x3f000000, float:0.5)
                            r7 = 1
                            r8 = 1056964608(0x3f000000, float:0.5)
                            r2.<init>(r3, r4, r5, r6, r7, r8)
                            r0.c = r1
                            r0 = r12
                            r1 = r13
                            r0.e(r1)
                            r0 = r11
                            r1 = 0
                            r0.startTransition(r1)
                            return
                        L_0x005a:
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r12 = r0
                            r0 = r10
                            android.widget.FrameLayout r0 = r0.llDataDiri
                            r13 = r0
                            r0 = r12
                            r1 = r13
                            int r1 = r1.getMeasuredHeight()
                            r0.a = r1
                            r0 = r12
                            o.setMessage$1 r1 = new o.setMessage$1
                            r2 = r1
                            r3 = r12
                            r4 = r13
                            r2.<init>(r4)
                            r0.b = r1
                            r0 = r12
                            r1 = r13
                            r0.b(r1)
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r12 = r0
                            r0 = r10
                            android.widget.ImageView r0 = r0.ivDataDiri
                            r13 = r0
                            r0 = r12
                            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                            r2 = r1
                            r3 = -1020002304(0xffffffffc3340000, float:-180.0)
                            r4 = 0
                            r5 = 1
                            r6 = 1056964608(0x3f000000, float:0.5)
                            r7 = 1
                            r8 = 1056964608(0x3f000000, float:0.5)
                            r2.<init>(r3, r4, r5, r6, r7, r8)
                            r0.c = r1
                            r0 = r12
                            r1 = r13
                            r0.e(r1)
                            r0 = r11
                            r1 = 0
                            r0.reverseTransition(r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6PLFragment.showDataDiri(android.view.View):void");
                    }

                    @OnClick({2131297343, 2131298903})
                    public void showDataPekerjaan(View view) {
                        getPromotion.d(getActivity());
                        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataPekerjaan.getBackground();
                        transitionDrawable.setCrossFadeEnabled(true);
                        if (this.llDataPekerjaan.getVisibility() == 8) {
                            this.h.c(this.llDataPekerjaan);
                            setMessage setmessage = this.h;
                            ImageView imageView = this.ivDataPekerjaan;
                            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                            setmessage.e(imageView);
                            transitionDrawable.startTransition(0);
                            return;
                        }
                        setMessage setmessage2 = this.h;
                        FrameLayout frameLayout = this.llDataPekerjaan;
                        setmessage2.a = frameLayout.getMeasuredHeight();
                        setmessage2.b = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                              (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                              (r0v11 'setmessage2' o.setMessage)
                             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6PLFragment.showDataPekerjaan(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6PLFragment.class
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                            	... 19 more
                            */
                        /*
                            this = this;
                            r0 = r10
                            o.getView r0 = r0.getActivity()
                            o.getPromotion.d(r0)
                            r0 = r10
                            android.widget.LinearLayout r0 = r0.llHeaderDataPekerjaan
                            android.graphics.drawable.Drawable r0 = r0.getBackground()
                            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                            r11 = r0
                            r0 = r11
                            r1 = 1
                            r0.setCrossFadeEnabled(r1)
                            r0 = r10
                            android.widget.FrameLayout r0 = r0.llDataPekerjaan
                            int r0 = r0.getVisibility()
                            r1 = 8
                            if (r0 != r1) goto L_0x005a
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r1 = r10
                            android.widget.FrameLayout r1 = r1.llDataPekerjaan
                            r0.c(r1)
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r12 = r0
                            r0 = r10
                            android.widget.ImageView r0 = r0.ivDataPekerjaan
                            r13 = r0
                            r0 = r12
                            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                            r2 = r1
                            r3 = 0
                            r4 = -1020002304(0xffffffffc3340000, float:-180.0)
                            r5 = 1
                            r6 = 1056964608(0x3f000000, float:0.5)
                            r7 = 1
                            r8 = 1056964608(0x3f000000, float:0.5)
                            r2.<init>(r3, r4, r5, r6, r7, r8)
                            r0.c = r1
                            r0 = r12
                            r1 = r13
                            r0.e(r1)
                            r0 = r11
                            r1 = 0
                            r0.startTransition(r1)
                            return
                        L_0x005a:
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r13 = r0
                            r0 = r10
                            android.widget.FrameLayout r0 = r0.llDataPekerjaan
                            r12 = r0
                            r0 = r13
                            r1 = r12
                            int r1 = r1.getMeasuredHeight()
                            r0.a = r1
                            r0 = r13
                            o.setMessage$1 r1 = new o.setMessage$1
                            r2 = r1
                            r3 = r13
                            r4 = r12
                            r2.<init>(r4)
                            r0.b = r1
                            r0 = r13
                            r1 = r12
                            r0.b(r1)
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r13 = r0
                            r0 = r10
                            android.widget.ImageView r0 = r0.ivDataPekerjaan
                            r12 = r0
                            r0 = r13
                            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                            r2 = r1
                            r3 = -1020002304(0xffffffffc3340000, float:-180.0)
                            r4 = 0
                            r5 = 1
                            r6 = 1056964608(0x3f000000, float:0.5)
                            r7 = 1
                            r8 = 1056964608(0x3f000000, float:0.5)
                            r2.<init>(r3, r4, r5, r6, r7, r8)
                            r0.c = r1
                            r0 = r13
                            r1 = r12
                            r0.e(r1)
                            r0 = r11
                            r1 = 0
                            r0.reverseTransition(r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6PLFragment.showDataPekerjaan(android.view.View):void");
                    }

                    @OnClick({2131297352, 2131298911})
                    public void showDataRekening(View view) {
                        getPromotion.d(getActivity());
                        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataRekening.getBackground();
                        transitionDrawable.setCrossFadeEnabled(true);
                        if (this.llDataRekening.getVisibility() == 8) {
                            this.h.c(this.llDataRekening);
                            setMessage setmessage = this.h;
                            ImageView imageView = this.ivDataRekening;
                            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                            setmessage.e(imageView);
                            transitionDrawable.startTransition(0);
                            return;
                        }
                        setMessage setmessage2 = this.h;
                        FrameLayout frameLayout = this.llDataRekening;
                        setmessage2.a = frameLayout.getMeasuredHeight();
                        setmessage2.b = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                              (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                              (r0v11 'setmessage2' o.setMessage)
                             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6PLFragment.showDataRekening(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6PLFragment.class
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                            	... 19 more
                            */
                        /*
                            this = this;
                            r0 = r10
                            o.getView r0 = r0.getActivity()
                            o.getPromotion.d(r0)
                            r0 = r10
                            android.widget.LinearLayout r0 = r0.llHeaderDataRekening
                            android.graphics.drawable.Drawable r0 = r0.getBackground()
                            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                            r11 = r0
                            r0 = r11
                            r1 = 1
                            r0.setCrossFadeEnabled(r1)
                            r0 = r10
                            android.widget.FrameLayout r0 = r0.llDataRekening
                            int r0 = r0.getVisibility()
                            r1 = 8
                            if (r0 != r1) goto L_0x005a
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r1 = r10
                            android.widget.FrameLayout r1 = r1.llDataRekening
                            r0.c(r1)
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r12 = r0
                            r0 = r10
                            android.widget.ImageView r0 = r0.ivDataRekening
                            r13 = r0
                            r0 = r12
                            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                            r2 = r1
                            r3 = 0
                            r4 = -1020002304(0xffffffffc3340000, float:-180.0)
                            r5 = 1
                            r6 = 1056964608(0x3f000000, float:0.5)
                            r7 = 1
                            r8 = 1056964608(0x3f000000, float:0.5)
                            r2.<init>(r3, r4, r5, r6, r7, r8)
                            r0.c = r1
                            r0 = r12
                            r1 = r13
                            r0.e(r1)
                            r0 = r11
                            r1 = 0
                            r0.startTransition(r1)
                            return
                        L_0x005a:
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r12 = r0
                            r0 = r10
                            android.widget.FrameLayout r0 = r0.llDataRekening
                            r13 = r0
                            r0 = r12
                            r1 = r13
                            int r1 = r1.getMeasuredHeight()
                            r0.a = r1
                            r0 = r12
                            o.setMessage$1 r1 = new o.setMessage$1
                            r2 = r1
                            r3 = r12
                            r4 = r13
                            r2.<init>(r4)
                            r0.b = r1
                            r0 = r12
                            r1 = r13
                            r0.b(r1)
                            r0 = r10
                            o.setMessage r0 = r0.h
                            r13 = r0
                            r0 = r10
                            android.widget.ImageView r0 = r0.ivDataRekening
                            r12 = r0
                            r0 = r13
                            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                            r2 = r1
                            r3 = -1020002304(0xffffffffc3340000, float:-180.0)
                            r4 = 0
                            r5 = 1
                            r6 = 1056964608(0x3f000000, float:0.5)
                            r7 = 1
                            r8 = 1056964608(0x3f000000, float:0.5)
                            r2.<init>(r3, r4, r5, r6, r7, r8)
                            r0.c = r1
                            r0 = r13
                            r1 = r12
                            r0.e(r1)
                            r0 = r11
                            r1 = 0
                            r0.reverseTransition(r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6PLFragment.showDataRekening(android.view.View):void");
                    }

                    @Stetho$Initializer$RealSocketHandlerFactory
                    public void subscribeSexEvent(onClickPilih onclickpilih) {
                        this.etSex.setError(null);
                        this.etSex.setText(this.listSex[onclickpilih.d]);
                        if (onclickpilih.d == 0) {
                            ((FormActivity) getActivity()).n.setSex("L");
                        } else {
                            ((FormActivity) getActivity()).n.setSex("P");
                        }
                    }

                    @OnClick({2131299721})
                    public void ubahDataRekening(View view) {
                        this.tvUbahDataRekening.setVisibility(8);
                        this.llLayoutDataRekeningEditable.setVisibility(0);
                        this.llLayoutDataRekeningUneditable.setVisibility(8);
                        o.AccountOpeningResponse accountOpeningResponse = new Runnable() { // from class: o.AccountOpeningResponse

                            /* loaded from: classes-dex2jar.jar:o/AccountOpeningResponse$Description.class */
                            public final /* synthetic */ class Description implements Runnable {
                                public final /* synthetic */ Page6PLFragment a;

                                public /* synthetic */ Description(Page6PLFragment page6PLFragment) {
                                    this.a = page6PLFragment;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Page6PLFragment page6PLFragment = this.a;
                                    EditText editText = null;
                                    for (int size = page6PLFragment.viewGroupDataPekerjaan.size() - 1; size >= 0; size--) {
                                        editText = editText;
                                        if (page6PLFragment.viewGroupDataPekerjaan.get(size).getVisibility() == 0) {
                                            editText = editText;
                                            if (page6PLFragment.viewGroupDataPekerjaan.get(size).isFocusable()) {
                                                editText = editText;
                                                if (page6PLFragment.viewGroupDataPekerjaan.get(size).isEnabled()) {
                                                    editText = page6PLFragment.viewGroupDataPekerjaan.get(size);
                                                }
                                            }
                                        }
                                    }
                                    if (editText != null) {
                                        editText.requestFocus();
                                    }
                                }
                            }

                            /* loaded from: classes-dex2jar.jar:o/AccountOpeningResponse$TxnDataOutput.class */
                            public final /* synthetic */ class TxnDataOutput implements Realm.Transaction {
                                public final /* synthetic */ PenerimaFragment c;

                                public /* synthetic */ TxnDataOutput(PenerimaFragment penerimaFragment) {
                                    this.c = penerimaFragment;
                                }

                                @Override // io.realm.Realm.Transaction
                                public final void execute(Realm realm) {
                                    this.c.a();
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                Page6PLFragment page6PLFragment = Page6PLFragment.this;
                                EditText editText = null;
                                for (int size = page6PLFragment.viewGroupDataRekening.size() - 1; size >= 0; size--) {
                                    editText = editText;
                                    if (page6PLFragment.viewGroupDataRekening.get(size).getVisibility() == 0) {
                                        editText = editText;
                                        if (page6PLFragment.viewGroupDataRekening.get(size).isFocusable()) {
                                            editText = editText;
                                            if (page6PLFragment.viewGroupDataRekening.get(size).isEnabled()) {
                                                editText = page6PLFragment.viewGroupDataRekening.get(size);
                                            }
                                        }
                                    }
                                }
                                if (editText != null) {
                                    editText.requestFocus();
                                }
                            }
                        };
                        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataRekening.getBackground();
                        transitionDrawable.setCrossFadeEnabled(true);
                        if (this.llDataRekening.getVisibility() == 8) {
                            this.h.c(this.llDataRekening);
                            setMessage setmessage = this.h;
                            ImageView imageView = this.ivDataRekening;
                            setmessage.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                            setmessage.e(imageView);
                            transitionDrawable.startTransition(0);
                            new Handler().postDelayed(accountOpeningResponse, 300);
                            return;
                        }
                        accountOpeningResponse.run();
                    }

                    @OnClick({2131297045, 2131297046, 2131297197, 2131297207, 2131296997, 2131296925, 2131297086, 2131297087})
                    public void updateDataDiri(View view) {
                        switch (view.getId()) {
                            case 2131296925:
                                AgamaDialog agamaDialog = new AgamaDialog(((FormActivity) getActivity()).y);
                                Bundle bundle = new Bundle();
                                bundle.putString("agama", this.etReligion.getText().toString());
                                agamaDialog.setArguments(bundle);
                                agamaDialog.show(getFragmentManager(), "AgamaDialog");
                                return;
                            case 2131296997:
                                getView().clearFocus();
                                SexDilaog sexDilaog = new SexDilaog();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etSex.getText().toString());
                                sexDilaog.setArguments(bundle2);
                                sexDilaog.show(getFragmentManager(), "SexDilaog");
                                return;
                            case 2131297045:
                                getView().clearFocus();
                                showInfoValueTodayOR e = showInfoValueTodayOR.e(this, this.d.get(1), this.d.get(2), this.d.get(5));
                                this.a = e;
                                Calendar calendar = this.d;
                                OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding = e.b;
                                Calendar calendar2 = (Calendar) calendar.clone();
                                calendar2.set(11, 0);
                                calendar2.set(12, 0);
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                                oR2PilihProductFragment_ViewBinding.e = calendar2;
                                lewati lewati = e.d;
                                if (lewati != null) {
                                    lewati.c.h();
                                }
                                showInfoValueTodayOR showinfovaluetodayor = this.a;
                                int color = getResources().getColor(2131099765);
                                showinfovaluetodayor.a = Color.argb(255, Color.red(color), Color.green(color), Color.blue(color));
                                this.a.show(getActivity().getFragmentManager(), "picked_exp_id");
                                return;
                            case 2131297046:
                                getView().clearFocus();
                                showInfoValueTodayOR e2 = showInfoValueTodayOR.e(this, this.d.get(1), this.d.get(2), this.d.get(5));
                                this.a = e2;
                                Calendar calendar3 = this.d;
                                OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding2 = e2.b;
                                Calendar calendar4 = (Calendar) calendar3.clone();
                                calendar4.set(11, 0);
                                calendar4.set(12, 0);
                                calendar4.set(13, 0);
                                calendar4.set(14, 0);
                                oR2PilihProductFragment_ViewBinding2.e = calendar4;
                                lewati lewati2 = e2.d;
                                if (lewati2 != null) {
                                    lewati2.c.h();
                                }
                                showInfoValueTodayOR showinfovaluetodayor2 = this.a;
                                int color2 = getResources().getColor(2131099765);
                                showinfovaluetodayor2.a = Color.argb(255, Color.red(color2), Color.green(color2), Color.blue(color2));
                                this.a.show(getActivity().getFragmentManager(), "picked_exp_kitas");
                                return;
                            case 2131297086:
                                Intent intent = new Intent(getContext(), PilihNegaraPemrekActivity.class);
                                intent.putExtra("type", "NEGARA_PASPOR");
                                startActivity(intent);
                                return;
                            case 2131297087:
                                Intent intent2 = new Intent(getContext(), PilihNegaraPemrekActivity.class);
                                intent2.putExtra("type", "NEGARA_LAHIR");
                                startActivity(intent2);
                                return;
                            case 2131297197:
                                getView().clearFocus();
                                StatusPerkawinanDialog statusPerkawinanDialog = new StatusPerkawinanDialog(((FormActivity) getActivity()).s);
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("status", this.etMaritStatus.getText().toString());
                                statusPerkawinanDialog.setArguments(bundle3);
                                statusPerkawinanDialog.show(getFragmentManager(), "StatusPerkawinanDialog");
                                return;
                            case 2131297207:
                                getView().clearFocus();
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(1901, 0, 1);
                                showInfoValueTodayOR e3 = showInfoValueTodayOR.e(this, this.d.get(1), this.d.get(2), this.d.get(5));
                                this.a = e3;
                                Calendar calendar5 = this.d;
                                OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding3 = e3.b;
                                Calendar calendar6 = (Calendar) calendar5.clone();
                                calendar6.set(11, 0);
                                calendar6.set(12, 0);
                                calendar6.set(13, 0);
                                calendar6.set(14, 0);
                                oR2PilihProductFragment_ViewBinding3.b = calendar6;
                                lewati lewati3 = e3.d;
                                if (lewati3 != null) {
                                    lewati3.c.h();
                                }
                                showInfoValueTodayOR showinfovaluetodayor3 = this.a;
                                OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding4 = showinfovaluetodayor3.b;
                                Calendar calendar7 = (Calendar) gregorianCalendar.clone();
                                calendar7.set(11, 0);
                                calendar7.set(12, 0);
                                calendar7.set(13, 0);
                                calendar7.set(14, 0);
                                oR2PilihProductFragment_ViewBinding4.e = calendar7;
                                lewati lewati4 = showinfovaluetodayor3.d;
                                if (lewati4 != null) {
                                    lewati4.c.h();
                                }
                                showInfoValueTodayOR showinfovaluetodayor4 = this.a;
                                int color3 = getResources().getColor(2131099765);
                                showinfovaluetodayor4.a = Color.argb(255, Color.red(color3), Color.green(color3), Color.blue(color3));
                                this.a.show(getActivity().getFragmentManager(), "picked_born_date");
                                return;
                            default:
                                return;
                        }
                    }

                    @OnClick({2131297202, 2131297145, 2131297189, 2131297164, 2131297036, 2131297024})
                    public void updateDataPekerjaan(View view) {
                        switch (view.getId()) {
                            case 2131297024:
                                Intent intent = new Intent(getContext(), com.bca.smartbranch.activity.PilihKodePosActivity.class);
                                intent.putExtra("provinsi", this.etOfficeProvince.getText().toString());
                                intent.putExtra("kota", this.etOfficeCity.getText().toString());
                                intent.putExtra("type", "KANTOR");
                                startActivity(intent);
                                return;
                            case 2131297036:
                                Intent intent2 = new Intent(getContext(), PilihKotaActivity.class);
                                intent2.putExtra("provinsi", this.etOfficeProvince.getText().toString());
                                intent2.putExtra("type", "KANTOR");
                                startActivity(intent2);
                                return;
                            case 2131297145:
                                PenghasilanPerTahunDialog penghasilanPerTahunDialog = new PenghasilanPerTahunDialog(((FormActivity) getActivity()).x);
                                Bundle bundle = new Bundle();
                                bundle.putString("title", getString(2131822027));
                                bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etPenghasilan.getText().toString());
                                penghasilanPerTahunDialog.setArguments(bundle);
                                penghasilanPerTahunDialog.show(getFragmentManager(), "PenghasilanPerTahunDialog");
                                return;
                            case 2131297164:
                                Intent intent3 = new Intent(getContext(), com.bca.smartbranch.activity.PilihProvinsiActivity.class);
                                intent3.putExtra("type", "KANTOR");
                                startActivity(intent3);
                                return;
                            case 2131297189:
                                StatusNPWPDialog statusNPWPDialog = new StatusNPWPDialog();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etStatusNPWP.getText().toString());
                                statusNPWPDialog.setArguments(bundle2);
                                statusNPWPDialog.show(getFragmentManager(), "StatusNPWPDialog");
                                return;
                            case 2131297202:
                                SumberPenghasilanDialog sumberPenghasilanDialog = new SumberPenghasilanDialog(((FormActivity) getActivity()).w);
                                Bundle bundle3 = new Bundle();
                                bundle3.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etSumberPenghasilan.getText().toString());
                                sumberPenghasilanDialog.setArguments(bundle3);
                                sumberPenghasilanDialog.show(getFragmentManager(), "SumberPenghasilanDialog");
                                return;
                            default:
                                return;
                        }
                    }

                    @Override // com.bca.smartbranch.presenter.ReRegistrationPresenter.write
                    public final void y() {
                        h();
                        Intent intent = new Intent(getContext(), ReRegistrationSuccessActivity.class);
                        intent.putExtra("email", this.e != null ? this.e.getEmail() : "");
                        startActivity(intent);
                        getActivity().finishAffinity();
                    }
                }
