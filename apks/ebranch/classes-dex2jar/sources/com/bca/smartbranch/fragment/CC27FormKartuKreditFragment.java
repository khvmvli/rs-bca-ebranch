package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.CC8FormKartuKreditActivity;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.activity.OpenCCSuccessActivity;
import com.bca.smartbranch.activity.PilihBankPenerbitActivity;
import com.bca.smartbranch.data.localdb.CCOtherBankAccount;
import com.bca.smartbranch.data.localdb.CCOtherBankCreditCard;
import com.bca.smartbranch.data.localdb.Category;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import com.bca.smartbranch.data.localdb.CreditCardSupplement;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.CategoryListDialog;
import com.bca.smartbranch.dialog.ExpiredDateDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.PilihTahunBulanDialog;
import com.bca.smartbranch.dialog.SexDilaog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.TermConditionKartuKreditDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.dialog.YesNoDialog;
import com.bca.smartbranch.fragment.CC27FormKartuKreditFragment;
import com.bca.smartbranch.presenter.ApplyCCPresenter;
import com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter;
import com.facebook.stetho.dumpapp.Framer;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Checked;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import io.realm.Realm;
import io.realm.RealmList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import o.AgamaAdapter$AgamaVH_ViewBinding;
import o.FotoActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.ListUtil;
import o.LogoutDialog_ViewBinding;
import o.OR2PilihProductFragment_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Page6CSFragment;
import o.PilihBidangUsahaActivity_ViewBinding;
import o.PilihKantorCabangEChannelActivity_ViewBinding;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.TxnTellerRequest;
import o.agree100JutaTarikan;
import o.cameraCopy;
import o.cameraCopy$MediaBrowserCompat$CustomActionResultReceiver;
import o.clickOrangSamaDenganPemilik;
import o.copyWindowDataInto;
import o.documentProvider;
import o.getAnnualFeeBasicAmount;
import o.getCardCode;
import o.getIncomeDisplayAmount;
import o.getPromotion;
import o.getRepresentativeIdType;
import o.getRepresentativeName;
import o.lewati;
import o.onClickPilih;
import o.onClickUbahDataOrangDatangKeCabang;
import o.setAnnualFeeAddOnDisplayAmount;
import o.setMessage;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import o.setOnHierarchyChangeListener;
import o.setRepresentativeIdNumber;
import o.setRepresentativeIdType;
import o.setRepresentativeName;
import o.setTransactionNotes;
import o.setTransactionSource;
import o.setWarkatTime;
import o.showInfoValueTodayOR;
import o.simpanGallery;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC27FormKartuKreditFragment.class */
public class CC27FormKartuKreditFragment extends BaseFragment implements Validator.ValidationListener, showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver, ApplyCCPresenter.RemoteActionCompatParcelizer, TextWatcher, CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer {
    @Checked(messageResId = 2131820724)
    @BindView(2131296469)
    @Order(53)
    CheckBox cbxAgree;
    @BindView(2131296474)
    @NotEmpty(messageResId = 2131820843, trim = true)
    EditText cc2710EtBidangUsaha;
    @BindView(2131296475)
    EditText cc2710EtHubungan;
    @BindView(2131296476)
    EditText cc2710EtJenisKelamin;
    @BindView(2131296477)
    @Order(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S)
    setAnnualFeeAddOnDisplayAmount cc2710EtLimitKartu;
    @BindView(2131296478)
    @NotEmpty(messageResId = 2131820874, trim = true)
    @Order(49)
    EditText cc2710EtNamaLengkap;
    @BindView(2131296479)
    @NotEmpty(messageResId = 2131820902, sequence = 1, trim = true)
    @Order(51)
    EditText cc2710EtNoHP;
    @BindView(2131296480)
    EditText cc2710EtPekerjaan;
    @BindView(2131296481)
    @NotEmpty(messageResId = 2131820746, trim = true)
    @Order(50)
    EditText cc2710EtTanggalLahir;
    @BindView(2131296482)
    LinearLayout cc2710llBCACard;
    @BindView(2131296483)
    LinearLayout cc2710llBCACardEditable;
    @BindView(2131296484)
    LinearLayout cc2710llMastercard;
    @BindView(2131296485)
    LinearLayout cc2710llMastercardEditable;
    @BindView(2131296486)
    LinearLayout cc2710llVisa;
    @BindView(2131296487)
    LinearLayout cc2710llVisaEditable;
    @BindView(2131296488)
    getIncomeDisplayAmount cc2710rvBCACard;
    @BindView(2131296489)
    getIncomeDisplayAmount cc2710rvBCACardEditable;
    @BindView(2131296490)
    getIncomeDisplayAmount cc2710rvMastercard;
    @BindView(2131296491)
    getIncomeDisplayAmount cc2710rvMastercardEditable;
    @BindView(2131296492)
    getIncomeDisplayAmount cc2710rvVisa;
    @BindView(2131296493)
    getIncomeDisplayAmount cc2710rvVisaEditable;
    @BindView(2131296494)
    LogoutDialog_ViewBinding cc2710tilBidangUsaha;
    @BindView(2131296495)
    LogoutDialog_ViewBinding cc2710tilHubungan;
    @BindView(2131296496)
    LogoutDialog_ViewBinding cc2710tilJenisKelamin;
    @BindView(2131296497)
    LogoutDialog_ViewBinding cc2710tilLimitKartuTambahan;
    @BindView(2131296498)
    LogoutDialog_ViewBinding cc2710tilNamaLengkap;
    @BindView(2131296499)
    LogoutDialog_ViewBinding cc2710tilNoHp;
    @BindView(2131296500)
    LogoutDialog_ViewBinding cc2710tilPekerjaan;
    @BindView(2131296501)
    LogoutDialog_ViewBinding cc2710tilTanggalLahir;
    @BindView(2131296502)
    TextView cc2710tvBCACard;
    @BindView(2131296503)
    TextView cc2710tvBCACardEditable;
    @BindView(2131296512)
    TextView cc2710tvMastercard;
    @BindView(2131296513)
    TextView cc2710tvMastercardEditable;
    @BindView(2131296514)
    TextView cc2710tvVisa;
    @BindView(2131296515)
    TextView cc2710tvVisaEditable;
    @BindView(2131296516)
    LinearLayout cc271llBCACard;
    @BindView(2131296517)
    LinearLayout cc271llMastercard;
    @BindView(2131296518)
    LinearLayout cc271llVisa;
    @Pattern(messageResId = 2131820780, regex = "^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$", sequence = 2)
    @Order(5)
    @BindView(2131296525)
    @NotEmpty(messageResId = 2131820778, sequence = 1, trim = true)
    EditText cc272EtEmail;
    @BindView(2131296526)
    EditText cc272EtJenisId;
    @BindView(2131296527)
    EditText cc272EtJenisKelamin;
    @BindView(2131296528)
    @NotEmpty(messageResId = 2131820827, trim = true)
    @Order(12)
    EditText cc272EtMasaBerlakuKitas;
    @BindView(2131296529)
    @NotEmpty(messageResId = 2131820868, trim = true)
    @Order(2)
    EditText cc272EtNama;
    @BindView(2131296530)
    @NotEmpty(messageResId = 2131820854, trim = true)
    @Order(6)
    EditText cc272EtNamaIbu;
    @BindView(2131296531)
    @NotEmpty(messageResId = 2131820798, trim = true)
    @Order(3)
    EditText cc272EtNamaLengkap;
    @BindView(2131296532)
    @NotEmpty(messageResId = 2131820771, trim = true)
    @Order(10)
    EditText cc272EtNegara;
    @BindView(2131296533)
    @NotEmpty(messageResId = 2131820902, sequence = 1, trim = true)
    @Order(4)
    EditText cc272EtNoHP;
    @BindView(2131296535)
    @Order(1)
    EditText cc272EtNoId;
    @BindView(2131296534)
    @NotEmpty(messageResId = 2131820828, trim = true)
    @Order(11)
    EditText cc272EtNoKitas;
    @BindView(2131296536)
    @NotEmpty(messageResId = 2131820842, trim = true)
    @Order(7)
    EditText cc272EtPendidikanTerakhir;
    @BindView(2131296537)
    EditText cc272EtStatusKewarganegaraan;
    @BindView(2131296538)
    EditText cc272EtStatusPerkawinan;
    @BindView(2131296539)
    @NotEmpty(messageResId = 2131820746, trim = true)
    @Order(9)
    EditText cc272EtTanggalLahir;
    @BindView(2131296540)
    @NotEmpty(messageResId = 2131821016, trim = true)
    @Order(8)
    getCardCode cc272EtTempatLahir;
    @BindView(2131296541)
    Page6CSFragment cc272IvFotoId;
    @BindView(2131296543)
    LogoutDialog_ViewBinding cc272tilEmailAddress;
    @BindView(2131296546)
    LogoutDialog_ViewBinding cc272tilMasaBerlakuKitas;
    @BindView(2131296547)
    LogoutDialog_ViewBinding cc272tilNama;
    @BindView(2131296548)
    LogoutDialog_ViewBinding cc272tilNamaIbu;
    @BindView(2131296549)
    LogoutDialog_ViewBinding cc272tilNamaLengkap;
    @BindView(2131296550)
    LogoutDialog_ViewBinding cc272tilNegara;
    @BindView(2131296551)
    LogoutDialog_ViewBinding cc272tilNoHp;
    @BindView(2131296553)
    LogoutDialog_ViewBinding cc272tilNoId;
    @BindView(2131296552)
    LogoutDialog_ViewBinding cc272tilNoKitas;
    @BindView(2131296554)
    LogoutDialog_ViewBinding cc272tilPendidikanTerakhir;
    @BindView(2131296556)
    LogoutDialog_ViewBinding cc272tilStatusPerkawinan;
    @BindView(2131296557)
    LogoutDialog_ViewBinding cc272tilTanggalLahir;
    @BindView(2131296558)
    LogoutDialog_ViewBinding cc272tilTempatLahir;
    @BindView(2131296576)
    @NotEmpty(messageResId = 2131820732, trim = true)
    @Order(13)
    EditText cc273EtAlamat;
    @Order(15)
    @BindView(2131296577)
    @NotEmpty(messageResId = 2131820977, sequence = 1, trim = true)
    @Length(messageResId = 2131820979, min = 5, sequence = 2)
    EditText cc273EtKodePos;
    @BindView(2131296578)
    @NotEmpty(messageResId = 2131820760, trim = true)
    @Order(14)
    getCardCode cc273EtKota;
    @BindView(2131296579)
    @NotEmpty(messageResId = 2131820841, trim = true)
    @Order(17)
    EditText cc273EtLamaMenempati;
    @BindView(2131296580)
    EditText cc273EtNoTelp;
    @BindView(2131296581)
    @NotEmpty(messageResId = 2131820801, trim = true)
    @Order(16)
    EditText cc273EtStatusTempat;
    @BindView(2131296582)
    LogoutDialog_ViewBinding cc273tilAlamatSaatIni;
    @BindView(2131296583)
    LogoutDialog_ViewBinding cc273tilKodePos;
    @BindView(2131296584)
    LogoutDialog_ViewBinding cc273tilKota;
    @BindView(2131296585)
    LogoutDialog_ViewBinding cc273tilLamaMenempati;
    @BindView(2131296586)
    LogoutDialog_ViewBinding cc273tilNoTelp;
    @BindView(2131296587)
    LogoutDialog_ViewBinding cc273tilStatusRumah;
    @BindView(2131296593)
    @NotEmpty(messageResId = 2131820955, trim = true)
    @Order(26)
    EditText cc274EtAlamat;
    @BindView(2131296594)
    EditText cc274EtBidangUsaha;
    @BindView(2131296595)
    EditText cc274EtExt;
    @BindView(2131296596)
    @NotEmpty(messageResId = 2131820808, trim = true)
    @Order(23)
    EditText cc274EtJabatan;
    @BindView(2131296597)
    @NotEmpty(messageResId = 2131820816, trim = true)
    @Order(25)
    EditText cc274EtJenisUsaha;
    @Order(28)
    @BindView(2131296598)
    @NotEmpty(messageResId = 2131820977, sequence = 1, trim = true)
    @Length(messageResId = 2131820979, min = 5, sequence = 2)
    EditText cc274EtKodePos;
    @BindView(2131296599)
    @NotEmpty(messageResId = 2131820760, trim = true)
    @Order(27)
    getCardCode cc274EtKota;
    @BindView(2131296600)
    EditText cc274EtLamaBekerja;
    @BindView(2131296601)
    @NotEmpty(messageResId = 2131820766, trim = true)
    @Order(24)
    EditText cc274EtNamaPerusahaan;
    @BindView(2131296602)
    @NotEmpty(messageResId = 2131820940, sequence = 1, trim = true)
    @Order(19)
    EditText cc274EtNoNPWP;
    @BindView(2131296603)
    @NotEmpty(messageResId = 2131821020, sequence = 1, trim = true)
    @Order(29)
    EditText cc274EtNoTelp;
    @BindView(2131296604)
    @NotEmpty(messageResId = 2131820817, trim = true)
    @Order(22)
    EditText cc274EtPekerjaan;
    @BindView(2131296605)
    @NotEmpty(messageResId = 2131820848, trim = true)
    @Order(21)
    setAnnualFeeAddOnDisplayAmount cc274EtPenghasilan;
    @BindView(2131296606)
    Page6CSFragment cc274IvFotoNPWP;
    @BindView(2131296607)
    LinearLayout cc274LlDataPerusahaanEditable;
    @BindView(2131296609)
    LinearLayout cc274llJabatan;
    @BindView(2131296608)
    LinearLayout cc274llNoExt;
    @BindView(2131296611)
    LogoutDialog_ViewBinding cc274tilAlamatKantor;
    @BindView(2131296612)
    LogoutDialog_ViewBinding cc274tilBidangUsaha;
    @BindView(2131296613)
    LogoutDialog_ViewBinding cc274tilExt;
    @BindView(2131296614)
    LogoutDialog_ViewBinding cc274tilJabatan;
    @BindView(2131296615)
    LogoutDialog_ViewBinding cc274tilJenisUsaha;
    @BindView(2131296616)
    LogoutDialog_ViewBinding cc274tilKodePos;
    @BindView(2131296617)
    LogoutDialog_ViewBinding cc274tilKota;
    @BindView(2131296618)
    LogoutDialog_ViewBinding cc274tilLamaBekerja;
    @BindView(2131296619)
    LogoutDialog_ViewBinding cc274tilNamaPerusahaan;
    @BindView(2131296620)
    LogoutDialog_ViewBinding cc274tilNoNpwp;
    @BindView(2131296621)
    LogoutDialog_ViewBinding cc274tilNoTelp;
    @BindView(2131296623)
    LogoutDialog_ViewBinding cc274tilPenghasilanPerbulan;
    @BindView(2131296642)
    @NotEmpty(messageResId = 2131820741)
    @Order(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB)
    EditText cc275EtBankPenerbit;
    @BindView(2131296636)
    EditText cc275EtCabang;
    @BindView(2131296639)
    @NotEmpty(messageResId = 2131820838)
    @Order(39)
    EditText cc275EtKrisFlyer;
    @BindView(2131296640)
    EditText cc275EtNamaMarketing;
    @BindView(2131296641)
    @NotEmpty(messageResId = 2131820888)
    @Order(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF)
    EditText cc275EtNoKartuKredit;
    @BindView(2131296637)
    EditText cc275EtNoPromosi;
    @BindView(2131296638)
    @NotEmpty(messageResId = 2131820891)
    @Order(40)
    EditText cc275EtNoReferal;
    @BindView(2131296643)
    EditText cc275EtSalesNIP;
    @BindView(2131296644)
    @NotEmpty(messageResId = 2131821011)
    @Order(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC)
    EditText cc275EtTanggalExpired;
    @BindView(2131296645)
    LinearLayout cc275llSalesCode;
    @BindView(2131296647)
    LogoutDialog_ViewBinding cc275tilKodePromo;
    @BindView(2131296648)
    LogoutDialog_ViewBinding cc275tilKodeReferal;
    @BindView(2131296649)
    LogoutDialog_ViewBinding cc275tilKrisflyer;
    @BindView(2131296650)
    LogoutDialog_ViewBinding cc275tilNamaMarketing;
    @BindView(2131296651)
    LogoutDialog_ViewBinding cc275tilNoKartuKreditLain;
    @BindView(2131296652)
    LogoutDialog_ViewBinding cc275tilPenerbitKartuKredit;
    @BindView(2131296654)
    LogoutDialog_ViewBinding cc275tilTanggalExpired;
    @BindView(2131296664)
    @NotEmpty(messageResId = 2131820728, trim = true)
    @Order(32)
    EditText cc276EtAlamat;
    @BindView(2131296665)
    EditText cc276EtExt;
    @BindView(2131296666)
    @NotEmpty(messageResId = 2131820803, trim = true)
    @Order(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv)
    EditText cc276EtHubungan;
    @Order(34)
    @BindView(2131296667)
    @NotEmpty(messageResId = 2131820977, sequence = 1, trim = true)
    @Length(messageResId = 2131820979, min = 5, sequence = 2)
    EditText cc276EtKodePos;
    @BindView(2131296668)
    @NotEmpty(messageResId = 2131820760, trim = true)
    @Order(Framer.ENTER_FRAME_PREFIX)
    getCardCode cc276EtKota;
    @BindView(2131296669)
    @NotEmpty(messageResId = 2131820798, trim = true)
    @Order(30)
    EditText cc276EtNamaLengkap;
    @BindView(2131296670)
    @NotEmpty(messageResId = 2131820902, trim = true)
    @Order(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD)
    EditText cc276EtNoHP;
    @BindView(2131296671)
    EditText cc276EtTlpKantor;
    @BindView(2131296672)
    EditText cc276EtTlpRumah;
    @BindView(2131296673)
    LogoutDialog_ViewBinding cc276tilAlamat;
    @BindView(2131296674)
    LogoutDialog_ViewBinding cc276tilExt;
    @BindView(2131296675)
    LogoutDialog_ViewBinding cc276tilHubungan;
    @BindView(2131296676)
    LogoutDialog_ViewBinding cc276tilKodePos;
    @BindView(2131296677)
    LogoutDialog_ViewBinding cc276tilKota;
    @BindView(2131296678)
    LogoutDialog_ViewBinding cc276tilNamaLengkap;
    @BindView(2131296679)
    LogoutDialog_ViewBinding cc276tilNoHp;
    @BindView(2131296680)
    LogoutDialog_ViewBinding cc276tilNoTelpKantor;
    @BindView(2131296681)
    LogoutDialog_ViewBinding cc276tilNoTelpRumah;
    @BindView(2131296688)
    EditText cc277EtFasilitasPerlindungan;
    @BindView(2131296689)
    LogoutDialog_ViewBinding cc277tilFasilitasPerlindungan;
    @BindView(2131296690)
    EditText cc278EtBidangUsaha;
    @BindView(2131296691)
    EditText cc278EtHubungan;
    @BindView(2131296692)
    EditText cc278EtJenisKelamin;
    @BindView(2131296693)
    @NotEmpty(messageResId = 2131820843, trim = true)
    @Order(44)
    setAnnualFeeAddOnDisplayAmount cc278EtLimitKartu;
    @BindView(2131296694)
    @NotEmpty(messageResId = 2131820874, trim = true)
    @Order(41)
    EditText cc278EtNamaLengkap;
    @BindView(2131296695)
    @NotEmpty(messageResId = 2131820902, sequence = 1, trim = true)
    @Order(43)
    EditText cc278EtNoHP;
    @BindView(2131296696)
    EditText cc278EtPekerjaan;
    @BindView(2131296697)
    @NotEmpty(messageResId = 2131820746, trim = true)
    @Order(42)
    EditText cc278EtTanggalLahir;
    @BindView(2131296698)
    LinearLayout cc278llBCACard;
    @BindView(2131296699)
    LinearLayout cc278llBCACardEditable;
    @BindView(2131296700)
    LinearLayout cc278llMastercard;
    @BindView(2131296701)
    LinearLayout cc278llMastercardEditable;
    @BindView(2131296702)
    LinearLayout cc278llVisa;
    @BindView(2131296703)
    LinearLayout cc278llVisaEditable;
    @BindView(2131296704)
    getIncomeDisplayAmount cc278rvBCACard;
    @BindView(2131296705)
    getIncomeDisplayAmount cc278rvBCACardEditable;
    @BindView(2131296706)
    getIncomeDisplayAmount cc278rvMastercard;
    @BindView(2131296707)
    getIncomeDisplayAmount cc278rvMastercardEditable;
    @BindView(2131296708)
    getIncomeDisplayAmount cc278rvVisa;
    @BindView(2131296709)
    getIncomeDisplayAmount cc278rvVisaEditable;
    @BindView(2131296710)
    LogoutDialog_ViewBinding cc278tilBidangUsaha;
    @BindView(2131296711)
    LogoutDialog_ViewBinding cc278tilHubungan;
    @BindView(2131296712)
    LogoutDialog_ViewBinding cc278tilJenisKelamin;
    @BindView(2131296713)
    LogoutDialog_ViewBinding cc278tilLimitKartuTambahan;
    @BindView(2131296714)
    LogoutDialog_ViewBinding cc278tilNamaLengkap;
    @BindView(2131296715)
    LogoutDialog_ViewBinding cc278tilNoHp;
    @BindView(2131296716)
    LogoutDialog_ViewBinding cc278tilPekerjaan;
    @BindView(2131296717)
    LogoutDialog_ViewBinding cc278tilTanggalLahir;
    @BindView(2131296718)
    TextView cc278tvBCACard;
    @BindView(2131296719)
    TextView cc278tvBCACardEditable;
    @BindView(2131296728)
    TextView cc278tvMastercard;
    @BindView(2131296729)
    TextView cc278tvMastercardEditable;
    @BindView(2131296730)
    TextView cc278tvVisa;
    @BindView(2131296731)
    TextView cc278tvVisaEditable;
    @BindView(2131296732)
    EditText cc279EtBidangUsaha;
    @BindView(2131296733)
    EditText cc279EtHubungan;
    @BindView(2131296734)
    EditText cc279EtJenisKelamin;
    @BindView(2131296735)
    @NotEmpty(messageResId = 2131820843, trim = true)
    @Order(48)
    setAnnualFeeAddOnDisplayAmount cc279EtLimitKartu;
    @BindView(2131296736)
    @NotEmpty(messageResId = 2131820874, trim = true)
    @Order(45)
    EditText cc279EtNamaLengkap;
    @BindView(2131296737)
    @NotEmpty(messageResId = 2131820902, sequence = 1, trim = true)
    @Order(47)
    EditText cc279EtNoHP;
    @BindView(2131296738)
    EditText cc279EtPekerjaan;
    @BindView(2131296739)
    @NotEmpty(messageResId = 2131820746, trim = true)
    @Order(46)
    EditText cc279EtTanggalLahir;
    @BindView(2131296740)
    LinearLayout cc279llBCACard;
    @BindView(2131296741)
    LinearLayout cc279llBCACardEditable;
    @BindView(2131296742)
    LinearLayout cc279llMastercard;
    @BindView(2131296743)
    LinearLayout cc279llMastercardEditable;
    @BindView(2131296744)
    LinearLayout cc279llVisa;
    @BindView(2131296745)
    LinearLayout cc279llVisaEditable;
    @BindView(2131296746)
    getIncomeDisplayAmount cc279rvBCACard;
    @BindView(2131296747)
    getIncomeDisplayAmount cc279rvBCACardEditable;
    @BindView(2131296748)
    getIncomeDisplayAmount cc279rvMastercard;
    @BindView(2131296749)
    getIncomeDisplayAmount cc279rvMastercardEditable;
    @BindView(2131296750)
    getIncomeDisplayAmount cc279rvVisa;
    @BindView(2131296751)
    getIncomeDisplayAmount cc279rvVisaEditable;
    @BindView(2131296752)
    LogoutDialog_ViewBinding cc279tilBidangUsaha;
    @BindView(2131296753)
    LogoutDialog_ViewBinding cc279tilHubungan;
    @BindView(2131296754)
    LogoutDialog_ViewBinding cc279tilJenisKelamin;
    @BindView(2131296755)
    LogoutDialog_ViewBinding cc279tilLimitKartuTambahan;
    @BindView(2131296756)
    LogoutDialog_ViewBinding cc279tilNamaLengkap;
    @BindView(2131296757)
    LogoutDialog_ViewBinding cc279tilNoHp;
    @BindView(2131296758)
    LogoutDialog_ViewBinding cc279tilPekerjaan;
    @BindView(2131296759)
    LogoutDialog_ViewBinding cc279tilTanggalLahir;
    @BindView(2131296760)
    TextView cc279tvBCACard;
    @BindView(2131296761)
    TextView cc279tvBCACardEditable;
    @BindView(2131296770)
    TextView cc279tvMastercard;
    @BindView(2131296771)
    TextView cc279tvMastercardEditable;
    @BindView(2131296772)
    TextView cc279tvVisa;
    @BindView(2131296773)
    TextView cc279tvVisaEditable;
    @BindView(2131296787)
    Page6CSFragment ciFotoIdentitas;
    @BindView(2131296788)
    Page6CSFragment ciFotoIdentitasPekerjaan;
    @BindViews({2131296592, 2131296588, 2131296590, 2131296589, 2131296591})
    List<TextView> errorListDataAlamat;
    @BindViews({2131296569, 2131296563, 2131296565, 2131296567, 2131296559, 2131296564, 2131296570, 2131296574, 2131296573, 2131296561, 2131296572, 2131296566, 2131296568, 2131296562})
    List<TextView> errorListDataDiri;
    @BindViews({2131296724, 2131296727, 2131296722, 2131296721, 2131296725, 2131296720, 2131296726, 2131296723})
    List<TextView> errorListDataKartuTambahan1;
    @BindViews({2131296766, 2131296769, 2131296764, 2131296763, 2131296767, 2131296762, 2131296768, 2131296765})
    List<TextView> errorListDataKartuTambahan2;
    @BindViews({2131296508, 2131296511, 2131296506, 2131296505, 2131296509, 2131296504, 2131296510, 2131296507})
    List<TextView> errorListDataKartuTambahan3;
    @BindViews({2131296686, 2131296683, 2131296682, 2131296685, 2131296684, 2131296687})
    List<TextView> errorListDataKontakDarurat;
    @BindViews({2131296662, 2131296661, 2131296663, 2131296658, 2131296657})
    List<TextView> errorListDataLainnya;
    @BindViews({2131296632, 2131296635, 2131296626, 2131296631, 2131296625, 2131296627, 2131296624, 2131296629, 2131296628, 2131296630, 2131296633})
    List<TextView> errorListDataPekerjaan;
    @BindString(2131820846)
    String errorMinimalLimitBlackPlatinum;
    @BindString(2131820847)
    String errorMinimalLimitOrdinary;
    private CheckCCValidApplicantPresenter f;
    private ApplyCCPresenter g;
    private String h;
    private String i;
    @BindString(2131820903)
    String invalidHandphoneMessage;
    @BindString(2131820953)
    String invalidTeleponMessage;
    @BindView(2131297326)
    ImageView ivCCPilihan;
    @BindView(2131297330)
    ImageView ivDataAlamat;
    @BindView(2131297334)
    ImageView ivDataDiri;
    @BindView(2131297335)
    ImageView ivDataFasilitas;
    @BindView(2131297336)
    ImageView ivDataKartuTambahan1;
    @BindView(2131297337)
    ImageView ivDataKartuTambahan2;
    @BindView(2131297338)
    ImageView ivDataKartuTambahan3;
    @BindView(2131297340)
    ImageView ivDataLainnya;
    @BindView(2131297343)
    ImageView ivDataPekerjaan;
    @BindView(2131297339)
    ImageView ivKontakDarurat;
    private String j;
    @BindView(2131297527)
    LinearLayout llAlamatDisabled;
    @BindView(2131297528)
    LinearLayout llAlamatDomisiliDisabled;
    @BindView(2131297530)
    LinearLayout llAlamatKantorDisabled;
    @BindView(2131297554)
    LinearLayout llBidangUsahaDisabled;
    @BindView(2131297633)
    LinearLayout llEmailDisabled;
    @BindView(2131297636)
    LinearLayout llExtNoTlpKantorDisabled;
    @BindView(2131297637)
    LinearLayout llExtNoTlpKantorKontakDaruratDisabled;
    @BindView(2131297642)
    LinearLayout llFasilitasPerlindunganDisabled;
    @BindView(2131297645)
    LinearLayout llFotoNpwpDisabled;
    @BindView(2131297652)
    LinearLayout llHeaderCCPilihan;
    @BindView(2131297653)
    LinearLayout llHeaderDataAlamat;
    @BindView(2131297656)
    LinearLayout llHeaderDataDiri;
    @BindView(2131297657)
    LinearLayout llHeaderDataFasilitas;
    @BindView(2131297658)
    LinearLayout llHeaderDataKartuTambahan1;
    @BindView(2131297659)
    LinearLayout llHeaderDataKartuTambahan2;
    @BindView(2131297660)
    LinearLayout llHeaderDataKartuTambahan3;
    @BindView(2131297662)
    LinearLayout llHeaderDataLainnya;
    @BindView(2131297664)
    LinearLayout llHeaderDataPekerjaan;
    @BindView(2131297661)
    LinearLayout llHeaderKontakDarurat;
    @BindView(2131297680)
    LinearLayout llHubunganCs1Disabled;
    @BindView(2131297681)
    LinearLayout llHubunganCs2Disabled;
    @BindView(2131297682)
    LinearLayout llHubunganCs3Disabled;
    @BindView(2131297683)
    LinearLayout llHubunganDisabled;
    @BindView(2131297696)
    LinearLayout llJabatanDisabled;
    @BindView(2131297698)
    LinearLayout llJenisIdentitasDisabled;
    @BindView(2131297704)
    LinearLayout llJenkelDisabled;
    @BindView(2131297724)
    LinearLayout llKewarganegaraanDisabled;
    @BindView(2131297736)
    LinearLayout llKodePromosiDisabled;
    @BindView(2131297737)
    LinearLayout llKodeReferralDisabled;
    @BindView(2131297740)
    LinearLayout llKotaDisabled;
    @BindView(2131297747)
    LinearLayout llKotaKantorDisabled;
    @BindView(2131297749)
    LinearLayout llKotaKontakDaruratDisabled;
    @BindView(2131297752)
    LinearLayout llKrisflyerDisabled;
    @BindView(2131297756)
    LinearLayout llLamaBekerjaDisabled;
    @BindView(2131297757)
    LinearLayout llLamaMenempatiDisabled;
    @BindView(2131297433)
    LinearLayout llLayoutCCPilihan;
    @BindView(2131297436)
    LinearLayout llLayoutDataAlamat;
    @BindView(2131297574)
    LinearLayout llLayoutDataAlamatEditable;
    @BindView(2131297443)
    LinearLayout llLayoutDataAlamatUneditable;
    @BindView(2131297447)
    LinearLayout llLayoutDataDiri;
    @BindView(2131297575)
    LinearLayout llLayoutDataDiriEditable;
    @BindView(2131297449)
    LinearLayout llLayoutDataDiriUneditable;
    @BindView(2131297450)
    LinearLayout llLayoutDataFasilitas;
    @BindView(2131297576)
    LinearLayout llLayoutDataFasilitasEditable;
    @BindView(2131297451)
    LinearLayout llLayoutDataFasilitasUneditable;
    @BindView(2131297452)
    LinearLayout llLayoutDataKartuTambahan1;
    @BindView(2131297577)
    LinearLayout llLayoutDataKartuTambahan1Editable;
    @BindView(2131297578)
    LinearLayout llLayoutDataKartuTambahan1Uneditable;
    @BindView(2131297453)
    LinearLayout llLayoutDataKartuTambahan2;
    @BindView(2131297579)
    LinearLayout llLayoutDataKartuTambahan2Editable;
    @BindView(2131297580)
    LinearLayout llLayoutDataKartuTambahan2Uneditable;
    @BindView(2131297454)
    LinearLayout llLayoutDataKartuTambahan3;
    @BindView(2131297581)
    LinearLayout llLayoutDataKartuTambahan3Editable;
    @BindView(2131297582)
    LinearLayout llLayoutDataKartuTambahan3Uneditable;
    @BindView(2131297455)
    LinearLayout llLayoutDataKartuUtamaUneditable;
    @BindView(2131297456)
    LinearLayout llLayoutDataKontakDarurat;
    @BindView(2131297583)
    LinearLayout llLayoutDataKontakDaruratEditable;
    @BindView(2131297457)
    LinearLayout llLayoutDataKontakDaruratUneditable;
    @BindView(2131297458)
    LinearLayout llLayoutDataLainnya;
    @BindView(2131297584)
    LinearLayout llLayoutDataLainnyaEditable;
    @BindView(2131297460)
    LinearLayout llLayoutDataLainnyaUneditable;
    @BindView(2131297462)
    LinearLayout llLayoutDataPekerjaan;
    @BindView(2131297587)
    LinearLayout llLayoutDataPekerjaanEditable;
    @BindView(2131297464)
    LinearLayout llLayoutDataPekerjaanUneditable;
    @BindView(2131297761)
    LinearLayout llLimitCs1Disabled;
    @BindView(2131297762)
    LinearLayout llLimitCs2Disabled;
    @BindView(2131297763)
    LinearLayout llLimitCs3Disabled;
    @BindView(2131297770)
    LinearLayout llMasaBerlakuKitasDisabled;
    @BindView(2131297777)
    LinearLayout llNamaDiinginkanDisabled;
    @BindView(2131297779)
    LinearLayout llNamaIbuDisabled;
    @BindView(2131297782)
    LinearLayout llNamaLengkapDisabled;
    @BindView(2131297783)
    LinearLayout llNamaMarketingDisabled;
    @BindView(2131297786)
    LinearLayout llNamaPerusahaanDisabled;
    @BindView(2131297787)
    LinearLayout llNamaSesuaiDisabled;
    @BindView(2131297788)
    LinearLayout llNamaSesuaiIdentitasCs1Disabled;
    @BindView(2131297789)
    LinearLayout llNamaSesuaiIdentitasCs2Disabled;
    @BindView(2131297790)
    LinearLayout llNamaSesuaiIdentitasCs3Disabled;
    @BindView(2131297815)
    LinearLayout llNegaraWrapper;
    @BindView(2131297817)
    LinearLayout llNoHpDisabled;
    @BindView(2131297818)
    LinearLayout llNoHpKontakDaruratDisabled;
    @BindView(2131297820)
    LinearLayout llNoKitasDisabled;
    @BindView(2131297821)
    LinearLayout llNoKkBankLainDisabled;
    @BindView(2131297827)
    LinearLayout llNoTelpRumahDisabled;
    @BindView(2131297828)
    LinearLayout llNoTlpKantorDisabled;
    @BindView(2131297829)
    LinearLayout llNoTlpKantorKontakDaruratDisabled;
    @BindView(2131297833)
    LinearLayout llNomorIdentitasDisabled;
    @BindView(2131297834)
    LinearLayout llNomorNpwpDisabled;
    @BindView(2131297843)
    LinearLayout llPekerjaanDisabled;
    @BindView(2131297849)
    LinearLayout llPenerbitKkDisabled;
    @BindView(2131297855)
    LinearLayout llPenghasilanPerbulanDisabled;
    @BindView(2131297859)
    LinearLayout llPropertiCs1Disabled;
    @BindView(2131297860)
    LinearLayout llPropertiCs2Disabled;
    @BindView(2131297861)
    LinearLayout llPropertiCs3Disabled;
    @BindView(2131297876)
    LinearLayout llSalesCodeDisabled;
    @BindView(2131297893)
    LinearLayout llStatusPerkawinanDisabled;
    @BindView(2131297894)
    LinearLayout llStatusTempatTinggalDisabled;
    @BindView(2131297904)
    LinearLayout llSyaratKetentuan;
    @BindView(2131297906)
    LinearLayout llTanggalExpiredDisabled;
    @BindView(2131297907)
    LinearLayout llTanggalLahirCs1Disabled;
    @BindView(2131297908)
    LinearLayout llTanggalLahirCs2Disabled;
    @BindView(2131297909)
    LinearLayout llTanggalLahirCs3Disabled;
    @BindView(2131297912)
    LinearLayout llTempatLahirDisabled;
    @BindView(2131297937)
    LinearLayout llWrapperCCPilihan;
    @BindView(2131297938)
    LinearLayout llWrapperDataAlamat;
    @BindView(2131297939)
    LinearLayout llWrapperDataDiri;
    @BindView(2131297940)
    LinearLayout llWrapperDataFasilitas;
    @BindView(2131297941)
    LinearLayout llWrapperDataKartuTambahan1;
    @BindView(2131297942)
    LinearLayout llWrapperDataKartuTambahan2;
    @BindView(2131297943)
    LinearLayout llWrapperDataKartuTambahan3;
    @BindView(2131297945)
    LinearLayout llWrapperDataLainnya;
    @BindView(2131297947)
    LinearLayout llWrapperDataPekerjaan;
    @BindView(2131297944)
    LinearLayout llWrapperKontakDarurat;
    @BindView(2131296519)
    getIncomeDisplayAmount rvBCACard;
    @BindView(2131296520)
    getIncomeDisplayAmount rvMastercard;
    @BindView(2131296521)
    getIncomeDisplayAmount rvVisa;
    @BindView(2131298420)
    ScrollView svMain;
    @BindViews({2131296587, 2131296582, 2131296584, 2131296583, 2131296585, 2131296586})
    List<LogoutDialog_ViewBinding> tilListDataAlamat;
    @BindViews({2131296553, 2131296547, 2131296549, 2131296551, 2131296543, 2131296548, 2131296554, 2131296558, 2131296557, 2131296545, 2131296556, 2131296550, 2131296552, 2131296546})
    List<LogoutDialog_ViewBinding> tilListDataDiri;
    @BindViews({2131296714, 2131296717, 2131296712, 2131296711, 2131296715, 2131296710, 2131296716, 2131296713})
    List<LogoutDialog_ViewBinding> tilListDataKartuTambahan1;
    @BindViews({2131296756, 2131296759, 2131296754, 2131296753, 2131296757, 2131296752, 2131296758, 2131296755})
    List<LogoutDialog_ViewBinding> tilListDataKartuTambahan2;
    @BindViews({2131296498, 2131296501, 2131296496, 2131296495, 2131296499, 2131296494, 2131296500, 2131296497})
    List<LogoutDialog_ViewBinding> tilListDataKartuTambahan3;
    @BindViews({2131296678, 2131296675, 2131296673, 2131296677, 2131296676, 2131296679, 2131296681, 2131296680, 2131296674})
    List<LogoutDialog_ViewBinding> tilListDataKontakDarurat;
    @BindViews({2131296652, 2131296651, 2131296654, 2131296649, 2131296648})
    List<LogoutDialog_ViewBinding> tilListDataLainnya;
    @BindViews({2131296620, 2131296623, 2131296614, 2131296619, 2131296612, 2131296615, 2131296611, 2131296617, 2131296616, 2131296618, 2131296621, 2131296613})
    List<LogoutDialog_ViewBinding> tilListDataPekerjaan;
    @BindView(2131298813)
    TextView tvAlamat;
    @BindView(2131298816)
    TextView tvAlamatDomisili;
    @BindView(2131298818)
    TextView tvAlamatKantor;
    @BindView(2131296522)
    TextView tvBCACard;
    @BindView(2131298861)
    TextView tvBidangUsaha;
    @BindView(2131298950)
    TextView tvEmail;
    @BindView(2131299253)
    TextView tvExtKantor;
    @BindView(2131299254)
    TextView tvExtKontakDarurat;
    @BindView(2131299257)
    TextView tvFasilitasPerlindungan;
    @BindView(2131299270)
    TextView tvHubungan;
    @BindView(2131299271)
    TextView tvHubunganCs1;
    @BindView(2131299272)
    TextView tvHubunganCs2;
    @BindView(2131299273)
    TextView tvHubunganCs3;
    @BindView(2131299298)
    TextView tvJabatan;
    @BindView(2131299302)
    TextView tvJenisIdentitas;
    @BindView(2131299304)
    TextView tvJenisKelamin;
    @BindView(2131299305)
    TextView tvJenisKelaminCs1;
    @BindView(2131299306)
    TextView tvJenisKelaminCs2;
    @BindView(2131299307)
    TextView tvJenisKelaminCs3;
    @BindView(2131299313)
    TextView tvJenisUsaha;
    @BindView(2131299351)
    TextView tvKewarganegaraan;
    @BindView(2131299362)
    TextView tvKodeCabang;
    @BindView(2131299365)
    TextView tvKodePos;
    @BindView(2131299368)
    TextView tvKodePosKantor;
    @BindView(2131299369)
    TextView tvKodePosKontakDarurat;
    @BindView(2131299371)
    TextView tvKodePromosi;
    @BindView(2131299372)
    TextView tvKodeReferral;
    @BindView(2131299375)
    TextView tvKota;
    @BindView(2131299379)
    TextView tvKotaKantor;
    @BindView(2131299380)
    TextView tvKotaKontakDarurat;
    @BindView(2131299383)
    TextView tvKrisFlyer;
    @BindView(2131299390)
    TextView tvLamaBekerja;
    @BindView(2131299391)
    TextView tvLamaMenempati;
    @BindView(2131299392)
    TextView tvLimitCs1;
    @BindView(2131299393)
    TextView tvLimitCs2;
    @BindView(2131299394)
    TextView tvLimitCs3;
    @BindView(2131299398)
    TextView tvMasaBerlakuKitas;
    @BindView(2131296523)
    TextView tvMastercard;
    @BindView(2131299421)
    TextView tvNamaDiinginkan;
    @BindView(2131299422)
    TextView tvNamaIbu;
    @BindView(2131299425)
    TextView tvNamaLengkap;
    @BindView(2131299426)
    TextView tvNamaMarketing;
    @BindView(2131299435)
    TextView tvNamaPerusahaan;
    @BindView(2131299436)
    TextView tvNamaSesuaiId;
    @BindView(2131299437)
    TextView tvNamaSesuaiIdentitasCs1;
    @BindView(2131299438)
    TextView tvNamaSesuaiIdentitasCs2;
    @BindView(2131299439)
    TextView tvNamaSesuaiIdentitasCs3;
    @BindView(2131299442)
    TextView tvNegara;
    @BindView(2131299453)
    TextView tvNoHp;
    @BindView(2131299455)
    TextView tvNoHpCs1;
    @BindView(2131299456)
    TextView tvNoHpCs2;
    @BindView(2131299457)
    TextView tvNoHpCs3;
    @BindView(2131299458)
    TextView tvNoHpKontakDarurat;
    @BindView(2131299460)
    TextView tvNoIdentitas;
    @BindView(2131299461)
    TextView tvNoKitas;
    @BindView(2131299463)
    TextView tvNoKkBankLain;
    @BindView(2131299464)
    TextView tvNoNpwp;
    @BindView(2131299479)
    TextView tvNoTlpKantor;
    @BindView(2131299480)
    TextView tvNoTlpKantorKontakDarurat;
    @BindView(2131299481)
    TextView tvNoTlpRumah;
    @BindView(2131299482)
    TextView tvNoTlpRumahKontakDarurat;
    @BindView(2131299511)
    TextView tvPekerjaan;
    @BindView(2131299512)
    TextView tvPekerjaanCs1;
    @BindView(2131299513)
    TextView tvPekerjaanCs2;
    @BindView(2131299514)
    TextView tvPekerjaanCs3;
    @BindView(2131299516)
    TextView tvPendidikanTerakhir;
    @BindView(2131299517)
    TextView tvPenerbitKk;
    @BindView(2131299523)
    TextView tvPenghasilanPerbulan;
    @BindView(2131299540)
    TextView tvPropertiCs1;
    @BindView(2131299541)
    TextView tvPropertiCs2;
    @BindView(2131299542)
    TextView tvPropertiCs3;
    @BindView(2131299565)
    TextView tvSalesCode;
    @BindView(2131299582)
    TextView tvStatusPerkawinan;
    @BindView(2131299583)
    TextView tvStatusTempatTinggal;
    @BindView(2131299596)
    TextView tvTanggalExpired;
    @BindView(2131299598)
    TextView tvTanggalLahir;
    @BindView(2131299599)
    TextView tvTanggalLahirCs1;
    @BindView(2131299600)
    TextView tvTanggalLahirCs2;
    @BindView(2131299601)
    TextView tvTanggalLahirCs3;
    @BindView(2131299603)
    TextView tvTempatLahir;
    @BindView(2131299604)
    TextView tvTermCondition;
    @BindView(2131299616)
    TextView tvTitleAlamat;
    @BindView(2131299619)
    TextView tvTitleAlamatKantor;
    @BindView(2131299630)
    TextView tvTitleFotoIdentitas;
    @BindView(2131296575)
    TextView tvTitleFotoIdentitasEditable;
    @BindView(2131299645)
    TextView tvTitleNamaSesuaiId;
    @BindView(2131299650)
    TextView tvTitleNoIdentitas;
    @BindView(2131299651)
    TextView tvTitleNoNpwp;
    @BindView(2131299701)
    TextView tvUbahDataAlamat;
    @BindView(2131299705)
    TextView tvUbahDataDiri;
    @BindView(2131299706)
    TextView tvUbahDataFasilitas;
    @BindView(2131299707)
    TextView tvUbahDataKartuTambahan1;
    @BindView(2131299708)
    TextView tvUbahDataKartuTambahan2;
    @BindView(2131299709)
    TextView tvUbahDataKartuTambahan3;
    @BindView(2131299710)
    TextView tvUbahDataKontakDarurat;
    @BindView(2131299711)
    TextView tvUbahDataLainnya;
    @BindView(2131299713)
    TextView tvUbahDataPekerjaan;
    @BindView(2131296524)
    TextView tvVisa;
    private int u;
    @BindViews({2131296581, 2131296576, 2131296578, 2131296577, 2131296579, 2131296580})
    public List<View> viewListDataAlamat;
    @BindViews({2131296535, 2131296529, 2131296531, 2131296533, 2131296525, 2131296530, 2131296536, 2131296540, 2131296539, 2131296527, 2131296538, 2131296532, 2131296534, 2131296528})
    public List<View> viewListDataDiri;
    @BindViews({2131296688})
    public List<View> viewListDataFasilitas;
    @BindViews({2131296694, 2131296697, 2131296692, 2131296691, 2131296695, 2131296690, 2131296696, 2131296693})
    public List<View> viewListDataKartuTambahan1;
    @BindViews({2131296736, 2131296739, 2131296734, 2131296733, 2131296737, 2131296732, 2131296738, 2131296735})
    public List<View> viewListDataKartuTambahan2;
    @BindViews({2131296478, 2131296481, 2131296476, 2131296475, 2131296479, 2131296474, 2131296480, 2131296477})
    public List<View> viewListDataKartuTambahan3;
    @BindViews({2131296669, 2131296666, 2131296664, 2131296668, 2131296667, 2131296670, 2131296672, 2131296671, 2131296665})
    public List<View> viewListDataKontakDarurat;
    @BindViews({2131296642, 2131296641, 2131296644, 2131296639, 2131296638})
    public List<View> viewListDataLainnya;
    @BindViews({2131296602, 2131296605, 2131296596, 2131296601, 2131296594, 2131296597, 2131296593, 2131296599, 2131296598, 2131296600, 2131296603, 2131296595})
    public List<View> viewListDataPekerjaan;
    private Validator y;
    private boolean m = false;
    private boolean k = false;

    /* renamed from: o */
    private boolean f38o = false;
    private boolean s = false;
    private boolean r = false;
    private boolean n = false;
    private boolean t = false;
    private boolean l = false;
    private boolean q = false;
    private boolean p = false;
    private setMessage d = new setMessage();
    setMessage a = new setMessage();

    private void a(EditText editText, AgamaAdapter$AgamaVH_ViewBinding agamaAdapter$AgamaVH_ViewBinding) {
        if (agamaAdapter$AgamaVH_ViewBinding.e > 0 && agamaAdapter$AgamaVH_ViewBinding.b > 0) {
            editText.setText(getString(2131822367, Integer.valueOf(agamaAdapter$AgamaVH_ViewBinding.e), Integer.valueOf(agamaAdapter$AgamaVH_ViewBinding.b)));
        } else if (agamaAdapter$AgamaVH_ViewBinding.e > 0) {
            editText.setText(getString(2131822366, Integer.valueOf(agamaAdapter$AgamaVH_ViewBinding.e)));
        } else {
            editText.setText(getString(2131822364, Integer.valueOf(agamaAdapter$AgamaVH_ViewBinding.b)));
        }
    }

    static /* synthetic */ void a(CC27FormKartuKreditFragment cC27FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC27FormKartuKreditFragment.errorListDataKontakDarurat, cC27FormKartuKreditFragment.tilListDataKontakDarurat, cC27FormKartuKreditFragment.viewListDataKontakDarurat, editText);
    }

    private void b() {
        int i;
        this.tvJenisIdentitas.setText(this.cc272EtJenisId.getText().toString());
        this.tvNoIdentitas.setText(this.cc272EtNoId.getText().toString());
        this.tvNamaSesuaiId.setText(this.cc272EtNama.getText().toString());
        this.tvNamaDiinginkan.setText(this.cc272EtNamaLengkap.getText().toString());
        this.tvNoHp.setText(this.cc272EtNoHP.getText().toString());
        this.tvEmail.setText(this.cc272EtEmail.getText().toString());
        this.tvJenisKelamin.setText(this.cc272EtJenisKelamin.getText().toString());
        this.tvTempatLahir.setText(this.cc272EtTempatLahir.getText().toString());
        this.tvTanggalLahir.setText(this.cc272EtTanggalLahir.getText().toString());
        this.tvStatusPerkawinan.setText(this.cc272EtStatusPerkawinan.getText().toString());
        this.tvPendidikanTerakhir.setText(this.cc272EtPendidikanTerakhir.getText().toString());
        this.tvNamaIbu.setText(this.cc272EtNamaIbu.getText().toString());
        this.tvKewarganegaraan.setText(this.cc272EtStatusKewarganegaraan.getText().toString());
        this.tvNegara.setText(this.cc272EtNegara.getText().toString());
        this.tvNoKitas.setText(this.cc272EtNoKitas.getText().toString());
        this.tvMasaBerlakuKitas.setText(this.cc272EtMasaBerlakuKitas.getText().toString());
        if (((CC8FormKartuKreditActivity) getActivity()).n.getIdentityCardType().equals("KTP")) {
            this.tvTitleFotoIdentitas.setText(getActivity().getResources().getString(2131821475));
            this.tvTitleNoIdentitas.setText(getActivity().getResources().getString(2131821553));
            this.tvTitleNamaSesuaiId.setText(getActivity().getResources().getString(2131821933));
        } else if (((CC8FormKartuKreditActivity) getActivity()).n.getIdentityCardType().equals("Paspor")) {
            this.tvTitleFotoIdentitas.setText(getActivity().getResources().getString(2131821477));
            this.tvTitleNoIdentitas.setText(getActivity().getResources().getString(2131821556));
            this.tvTitleNamaSesuaiId.setText(getActivity().getResources().getString(2131821925));
        }
        if (((CC8FormKartuKreditActivity) getActivity()).n.getNationality().equals("ID")) {
            this.llNegaraWrapper.setVisibility(8);
            this.llLayoutDataDiriUneditable.removeView(this.llNoKitasDisabled);
            this.llLayoutDataDiriUneditable.removeView(this.llMasaBerlakuKitasDisabled);
            i = 0;
        } else {
            this.llNegaraWrapper.setVisibility(0);
            i = 0;
            if (((CC8FormKartuKreditActivity) getActivity()).n.getKitasKitapFlag().equals("1")) {
                this.llLayoutDataDiriUneditable.removeView(this.llNoKitasDisabled);
                this.llLayoutDataDiriUneditable.removeView(this.llMasaBerlakuKitasDisabled);
                i = 0;
            }
        }
        while (i < this.llLayoutDataDiriUneditable.getChildCount()) {
            View childAt = this.llLayoutDataDiriUneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
            i++;
        }
    }

    private void b(int i, Calendar calendar, Calendar calendar2) {
        Calendar instance = Calendar.getInstance();
        showInfoValueTodayOR e = showInfoValueTodayOR.e(this, instance.get(1), instance.get(2), instance.get(5));
        if (calendar != null) {
            OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding = e.b;
            Calendar calendar3 = (Calendar) calendar.clone();
            calendar3.set(11, 0);
            calendar3.set(12, 0);
            calendar3.set(13, 0);
            calendar3.set(14, 0);
            oR2PilihProductFragment_ViewBinding.e = calendar3;
            lewati lewati = e.d;
            if (lewati != null) {
                lewati.c.h();
            }
        }
        if (calendar2 != null) {
            OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding2 = e.b;
            Calendar calendar4 = (Calendar) calendar2.clone();
            calendar4.set(11, 0);
            calendar4.set(12, 0);
            calendar4.set(13, 0);
            calendar4.set(14, 0);
            oR2PilihProductFragment_ViewBinding2.b = calendar4;
            lewati lewati2 = e.d;
            if (lewati2 != null) {
                lewati2.c.h();
            }
        }
        int color = getResources().getColor(2131099765);
        e.a = Color.argb(255, Color.red(color), Color.green(color), Color.blue(color));
        e.show(getActivity().getFragmentManager(), String.valueOf(i));
    }

    static /* synthetic */ void b(CC27FormKartuKreditFragment cC27FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC27FormKartuKreditFragment.errorListDataKartuTambahan3, cC27FormKartuKreditFragment.tilListDataKartuTambahan3, cC27FormKartuKreditFragment.viewListDataKartuTambahan3, editText);
    }

    private static void c(View view, int i, int i2, int i3) {
        String str;
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            editText.setError(null);
            StringBuilder sb = new StringBuilder();
            if (String.valueOf(i3).length() < 2) {
                StringBuilder sb2 = new StringBuilder("0");
                sb2.append(String.valueOf(i3));
                str = sb2.toString();
            } else {
                str = String.valueOf(i3);
            }
            sb.append(str);
            sb.append(" ");
            sb.append(getAnnualFeeBasicAmount.a(i2));
            sb.append(" ");
            sb.append(i);
            editText.setText(sb.toString());
        }
    }

    static /* synthetic */ void c(CC27FormKartuKreditFragment cC27FormKartuKreditFragment, EditText editText) {
        getPromotion.d(cC27FormKartuKreditFragment.getContext(), cC27FormKartuKreditFragment.errorListDataDiri, cC27FormKartuKreditFragment.tilListDataDiri, cC27FormKartuKreditFragment.viewListDataDiri, editText);
    }

    private void d() {
        this.tvAlamat.setText(this.cc273EtAlamat.getText().toString());
        this.tvKota.setText(this.cc273EtKota.getText().toString());
        this.tvKodePos.setText(this.cc273EtKodePos.getText().toString());
        this.tvStatusTempatTinggal.setText(this.cc273EtStatusTempat.getText().toString());
        this.tvLamaMenempati.setText(this.cc273EtLamaMenempati.getText().toString());
        this.tvNoTlpRumah.setText(this.cc273EtNoTelp.getText().toString());
        for (int i = 0; i < this.llLayoutDataAlamatUneditable.getChildCount(); i++) {
            View childAt = this.llLayoutDataAlamatUneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    static /* synthetic */ void d(CC27FormKartuKreditFragment cC27FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC27FormKartuKreditFragment.errorListDataKartuTambahan2, cC27FormKartuKreditFragment.tilListDataKartuTambahan2, cC27FormKartuKreditFragment.viewListDataKartuTambahan2, editText);
    }

    static /* synthetic */ void e(CC27FormKartuKreditFragment cC27FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC27FormKartuKreditFragment.errorListDataKartuTambahan1, cC27FormKartuKreditFragment.tilListDataKartuTambahan1, cC27FormKartuKreditFragment.viewListDataKartuTambahan1, editText);
    }

    private void f() {
        this.tvFasilitasPerlindungan.setText(this.cc277EtFasilitasPerlindungan.getText().toString());
        for (int i = 0; i < this.llLayoutDataFasilitasUneditable.getChildCount(); i++) {
            View childAt = this.llLayoutDataFasilitasUneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    static /* synthetic */ void f(CC27FormKartuKreditFragment cC27FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC27FormKartuKreditFragment.errorListDataLainnya, cC27FormKartuKreditFragment.tilListDataLainnya, cC27FormKartuKreditFragment.viewListDataLainnya, editText);
    }

    static /* synthetic */ void g(CC27FormKartuKreditFragment cC27FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC27FormKartuKreditFragment.errorListDataPekerjaan, cC27FormKartuKreditFragment.tilListDataPekerjaan, cC27FormKartuKreditFragment.viewListDataPekerjaan, editText);
    }

    static /* synthetic */ void h(CC27FormKartuKreditFragment cC27FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC27FormKartuKreditFragment.errorListDataAlamat, cC27FormKartuKreditFragment.tilListDataAlamat, cC27FormKartuKreditFragment.viewListDataAlamat, editText);
    }

    private void i() {
        this.tvNamaSesuaiIdentitasCs2.setText(this.cc279EtNamaLengkap.getText().toString());
        this.tvTanggalLahirCs2.setText(this.cc279EtTanggalLahir.getText().toString());
        this.tvJenisKelaminCs2.setText(this.cc279EtJenisKelamin.getText().toString());
        this.tvHubunganCs2.setText(this.cc279EtHubungan.getText().toString());
        this.tvNoHpCs2.setText(this.cc279EtNoHP.getText().toString());
        this.tvPropertiCs2.setText(this.cc279EtBidangUsaha.getText().toString());
        this.tvPekerjaanCs2.setText(this.cc279EtPekerjaan.getText().toString());
        TextView textView = this.tvLimitCs2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.cc279EtLimitKartu.getText().toString());
        sb.append(" IDR");
        textView.setText(sb.toString());
        for (int i = 0; i < this.llLayoutDataKartuTambahan2Uneditable.getChildCount(); i++) {
            View childAt = this.llLayoutDataKartuTambahan2Uneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    static /* synthetic */ void i(CC27FormKartuKreditFragment cC27FormKartuKreditFragment, EditText editText) {
        getPromotion.c(cC27FormKartuKreditFragment.getContext(), cC27FormKartuKreditFragment.errorListDataDiri, cC27FormKartuKreditFragment.tilListDataDiri, cC27FormKartuKreditFragment.viewListDataDiri, editText);
    }

    private void j() {
        this.tvNamaSesuaiIdentitasCs1.setText(this.cc278EtNamaLengkap.getText().toString());
        this.tvTanggalLahirCs1.setText(this.cc278EtTanggalLahir.getText().toString());
        this.tvJenisKelaminCs1.setText(this.cc278EtJenisKelamin.getText().toString());
        this.tvHubunganCs1.setText(this.cc278EtHubungan.getText().toString());
        this.tvNoHpCs1.setText(this.cc278EtNoHP.getText().toString());
        this.tvPropertiCs1.setText(this.cc278EtBidangUsaha.getText().toString());
        this.tvPekerjaanCs1.setText(this.cc278EtPekerjaan.getText().toString());
        TextView textView = this.tvLimitCs1;
        StringBuilder sb = new StringBuilder();
        sb.append(this.cc278EtLimitKartu.getText().toString());
        sb.append(" IDR");
        textView.setText(sb.toString());
        for (int i = 0; i < this.llLayoutDataKartuTambahan1Uneditable.getChildCount(); i++) {
            View childAt = this.llLayoutDataKartuTambahan1Uneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    static /* synthetic */ void j(CC27FormKartuKreditFragment cC27FormKartuKreditFragment, EditText editText) {
        getPromotion.b(cC27FormKartuKreditFragment.errorListDataDiri, cC27FormKartuKreditFragment.tilListDataDiri, cC27FormKartuKreditFragment.viewListDataDiri, editText);
    }

    private void k() {
        this.tvNamaLengkap.setText(this.cc276EtNamaLengkap.getText().toString());
        this.tvHubungan.setText(this.cc276EtHubungan.getText().toString());
        this.tvAlamatDomisili.setText(this.cc276EtAlamat.getText().toString());
        this.tvKotaKontakDarurat.setText(this.cc276EtKota.getText().toString());
        this.tvKodePosKontakDarurat.setText(this.cc276EtKodePos.getText().toString());
        this.tvNoHpKontakDarurat.setText(this.cc276EtNoHP.getText().toString());
        this.tvNoTlpRumahKontakDarurat.setText(this.cc276EtTlpRumah.getText().toString());
        this.tvNoTlpKantorKontakDarurat.setText(this.cc276EtTlpKantor.getText().toString());
        this.tvExtKontakDarurat.setText(this.cc276EtExt.getText().toString());
        if (this.cc276EtExt.getText().toString().isEmpty()) {
            this.llExtNoTlpKantorKontakDaruratDisabled.setVisibility(8);
        }
        for (int i = 0; i < this.llLayoutDataKontakDaruratUneditable.getChildCount(); i++) {
            View childAt = this.llLayoutDataKontakDaruratUneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    private void l() {
        this.tvNoNpwp.setText(this.cc274EtNoNPWP.getText().toString());
        this.tvPekerjaan.setText(this.cc274EtPekerjaan.getText().toString());
        this.tvJabatan.setText(this.cc274EtJabatan.getText().toString());
        TextView textView = this.tvPenghasilanPerbulan;
        StringBuilder sb = new StringBuilder();
        sb.append(this.cc274EtPenghasilan.getText().toString());
        sb.append(" IDR");
        textView.setText(sb.toString());
        this.tvNamaPerusahaan.setText(this.cc274EtNamaPerusahaan.getText().toString());
        this.tvBidangUsaha.setText(this.cc274EtBidangUsaha.getText().toString());
        this.tvJenisUsaha.setText(this.cc274EtJenisUsaha.getText().toString());
        this.tvLamaBekerja.setText(this.cc274EtLamaBekerja.getText().toString());
        this.tvAlamatKantor.setText(this.cc274EtAlamat.getText().toString());
        this.tvKotaKantor.setText(this.cc274EtKota.getText().toString());
        this.tvKodePosKantor.setText(this.cc274EtKodePos.getText().toString());
        this.tvNoTlpKantor.setText(this.cc274EtNoTelp.getText().toString());
        this.tvExtKantor.setText(this.cc274EtExt.getText().toString());
        if (this.cc274EtExt.getText().toString().isEmpty()) {
            this.llExtNoTlpKantorDisabled.setVisibility(8);
        }
        if (((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Wiraswasta")) {
            this.tvTitleAlamatKantor.setText(2131821063);
        } else {
            this.tvTitleAlamatKantor.setText(2131821050);
        }
        if (((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Ibu Rumah Tangga") || ((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Pelajar")) {
            this.llJabatanDisabled.setVisibility(8);
            this.llLayoutDataPekerjaanUneditable.removeView(this.llNamaPerusahaanDisabled);
            this.llLayoutDataPekerjaanUneditable.removeView(this.llBidangUsahaDisabled);
            this.llLayoutDataPekerjaanUneditable.removeView(this.llLamaBekerjaDisabled);
            this.llLayoutDataPekerjaanUneditable.removeView(this.llAlamatKantorDisabled);
            this.llLayoutDataPekerjaanUneditable.removeView(this.llKotaKantorDisabled);
            this.llLayoutDataPekerjaanUneditable.removeView(this.llNoTlpKantorDisabled);
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

    private void m() {
        for (int i = 0; i < this.llLayoutDataKartuUtamaUneditable.getChildCount(); i++) {
            View childAt = this.llLayoutDataKartuUtamaUneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    private void n() {
        this.tvPenerbitKk.setText(this.cc275EtBankPenerbit.getText().toString());
        this.tvNoKkBankLain.setText(this.cc275EtNoKartuKredit.getText().toString());
        this.tvTanggalExpired.setText(this.cc275EtTanggalExpired.getText().toString());
        this.tvKrisFlyer.setText(this.cc275EtKrisFlyer.getText().toString());
        this.tvKodeReferral.setText(this.cc275EtNoReferal.getText().toString());
        this.tvKodePromosi.setText(this.cc275EtNoPromosi.getText().toString());
        this.tvNamaMarketing.setText(this.cc275EtNamaMarketing.getText().toString());
        this.tvSalesCode.setText(this.cc275EtSalesNIP.getText().toString());
        this.tvKodeCabang.setText(this.cc275EtCabang.getText().toString());
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getFlagOtherCC().equals("Y")) {
            this.llLayoutDataLainnyaUneditable.removeView(this.llPenerbitKkDisabled);
            this.llLayoutDataLainnyaUneditable.removeView(this.llNoKkBankLainDisabled);
            this.llLayoutDataLainnyaUneditable.removeView(this.llTanggalExpiredDisabled);
        }
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getFlagCardKrisFlyer().equals("Y")) {
            this.llLayoutDataLainnyaUneditable.removeView(this.llKrisflyerDisabled);
        }
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getFlagReferalCode().equals("Y")) {
            this.llLayoutDataLainnyaUneditable.removeView(this.llKodeReferralDisabled);
        }
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getFlagPromotionCode().equals("Y")) {
            this.llLayoutDataLainnyaUneditable.removeView(this.llKodePromosiDisabled);
        }
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getFlagReferenceSales().equals("Y")) {
            this.llLayoutDataLainnyaUneditable.removeView(this.llNamaMarketingDisabled);
            this.llLayoutDataLainnyaUneditable.removeView(this.llSalesCodeDisabled);
        }
        if (this.llLayoutDataLainnyaUneditable.getChildCount() == 0) {
            this.llWrapperDataLainnya.setVisibility(8);
            return;
        }
        for (int i = 0; i < this.llLayoutDataLainnyaUneditable.getChildCount(); i++) {
            View childAt = this.llLayoutDataLainnyaUneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    private void o() {
        this.tvNamaSesuaiIdentitasCs3.setText(this.cc2710EtNamaLengkap.getText().toString());
        this.tvTanggalLahirCs3.setText(this.cc2710EtTanggalLahir.getText().toString());
        this.tvJenisKelaminCs3.setText(this.cc2710EtJenisKelamin.getText().toString());
        this.tvHubunganCs3.setText(this.cc2710EtHubungan.getText().toString());
        this.tvNoHpCs3.setText(this.cc2710EtNoHP.getText().toString());
        this.tvPropertiCs3.setText(this.cc2710EtBidangUsaha.getText().toString());
        this.tvPekerjaanCs3.setText(this.cc2710EtPekerjaan.getText().toString());
        TextView textView = this.tvLimitCs3;
        StringBuilder sb = new StringBuilder();
        sb.append(this.cc2710EtLimitKartu.getText().toString());
        sb.append(" IDR");
        textView.setText(sb.toString());
        for (int i = 0; i < this.llLayoutDataKartuTambahan3Uneditable.getChildCount(); i++) {
            View childAt = this.llLayoutDataKartuTambahan3Uneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    private void s() {
        startActivity(new Intent(getContext(), MainActivity.class));
        getActivity().overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void SubscribeBidangUsaha(PilihKantorCabangEChannelActivity_ViewBinding pilihKantorCabangEChannelActivity_ViewBinding) {
        this.cc274EtBidangUsaha.setError(null);
        this.cc274EtBidangUsaha.setText(pilihKantorCabangEChannelActivity_ViewBinding.c);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void SubscribeExpiredDate(final AgamaAdapter$AgamaVH_ViewBinding agamaAdapter$AgamaVH_ViewBinding) {
        this.cc275EtTanggalExpired.setError(null);
        this.cc275EtTanggalExpired.setText(getString(2131822365, getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.b), 2, "0"), getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.e).substring(2, 4), 2, "0")));
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.19
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CCOtherBankCreditCard cCOtherBankCreditCard = ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0);
                StringBuilder sb = new StringBuilder();
                sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.b), 2, "0"));
                sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.e).substring(2, 4), 2, "0"));
                cCOtherBankCreditCard.setExpired(sb.toString());
            }
        });
    }

    @Override // com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer
    public final void a() {
        int i;
        CreditCard creditCard = ((CC8FormKartuKreditActivity) getActivity()).n;
        String str = "";
        String imei = this.e != null ? this.e.getImei() : "";
        String sessionId = this.e != null ? this.e.getSessionId() : "";
        String str2 = this.e != null ? "N" : "Y";
        cameraCopy cameracopy = new cameraCopy();
        cameracopy.aw = sessionId;
        cameracopy.U = imei;
        cameracopy.r = creditCard.getEmailAddr();
        if (str2.equals("N")) {
            cameracopy.W = this.e.getEmail();
        } else {
            cameracopy.W = "";
        }
        cameracopy.F = str2;
        cameracopy.I = creditCard.getFlagBCAAccount();
        cameracopy.e = creditCard.getBcaAccountNumber();
        cameracopy.c = creditCard.getBcaDebitCardNumber();
        cameracopy.b = creditCard.getBcaDebitCardType();
        cameracopy.s = creditCard.getCustomerName();
        cameracopy.t = creditCard.getCustomerFullName();
        cameracopy.T = creditCard.getIdentityCardType();
        cameracopy.X = creditCard.getIdentityCardNumber();
        cameracopy.h = creditCard.getBirthPlace();
        cameracopy.j = creditCard.getBirthDate();
        cameracopy.G = creditCard.getGender();
        cameracopy.ae = creditCard.getNationality();
        cameracopy.J = creditCard.getHmAddress();
        cameracopy.S = creditCard.getHmRT();
        cameracopy.O = creditCard.getHmRW();
        cameracopy.L = creditCard.getHmKecamatan();
        cameracopy.N = creditCard.getHmKelurahan();
        cameracopy.M = creditCard.getHmCity();
        cameracopy.R = creditCard.getHmPostCode();
        cameracopy.K = creditCard.getHmHouseStatus().getCode();
        cameracopy.P = creditCard.getHmStayPeriod();
        cameracopy.ac = creditCard.getMobileNumber();
        cameracopy.ai = creditCard.getPhoneNumber();
        cameracopy.aa = creditCard.getMotherMaidenName();
        cameracopy.V = creditCard.getLastEducation().getCode();
        cameracopy.Z = creditCard.getMaritalStatus().getCode();
        cameracopy.av = "0";
        cameracopy.al = creditCard.getPreferredMailingAddress();
        cameracopy.ag = creditCard.getNpwp();
        cameracopy.ad = creditCard.getOfficePosition().getCode();
        cameracopy.ab = creditCard.getMonthlyIncome();
        cameracopy.Y = creditCard.getMonthlyOtherIncome();
        cameracopy.am = creditCard.getPrevCompanyName();
        cameracopy.ak = creditCard.getPrevWorkPeriod();
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Ibu Rumah Tangga") || !((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Pelajar")) {
            cameracopy.f = creditCard.getCurrCompanyName();
            cameracopy.q = creditCard.getCurrWorkPeriod();
            cameracopy.i = creditCard.getCurrOfficeBusinessField().getCode();
            cameracopy.g = creditCard.getCurrOfficeAddress();
            cameracopy.n = creditCard.getCurrOfficeCity();
            cameracopy.f135o = creditCard.getCurrOfficePostCode();
            cameracopy.m = creditCard.getCurrOfficePhoneNumber();
            cameracopy.l = creditCard.getCurrOfficeExtensionNumber();
            cameracopy.k = creditCard.getCurrOfficeEmailAddress();
        } else {
            cameracopy.f = "";
            cameracopy.q = "";
            cameracopy.i = "";
            cameracopy.g = "";
            cameracopy.n = "";
            cameracopy.f135o = "";
            cameracopy.m = "";
            cameracopy.l = "";
            cameracopy.k = "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<CCOtherBankAccount> it = creditCard.getCcOtherBankAccounts().iterator();
        while (it.hasNext()) {
            CCOtherBankAccount next = it.next();
            cameraCopy.read read = new cameraCopy.read();
            read.d = next.getBankName().getCode();
            read.c = next.getAccounttype();
            read.b = next.getAccountNumber();
            arrayList.add(read);
        }
        cameracopy.af = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator<CCOtherBankCreditCard> it2 = creditCard.getCcOtherBankCreditCards().iterator();
        while (it2.hasNext()) {
            CCOtherBankCreditCard next2 = it2.next();
            cameraCopy$MediaBrowserCompat$CustomActionResultReceiver cameracopy_mediabrowsercompat_customactionresultreceiver = new cameraCopy$MediaBrowserCompat$CustomActionResultReceiver();
            cameracopy_mediabrowsercompat_customactionresultreceiver.d = next2.getBankName().getCode();
            cameracopy_mediabrowsercompat_customactionresultreceiver.e = next2.getCardNumber();
            cameracopy_mediabrowsercompat_customactionresultreceiver.b = next2.getExpired();
            arrayList2.add(cameracopy_mediabrowsercompat_customactionresultreceiver);
        }
        cameracopy.aj = arrayList2;
        cameracopy.v = creditCard.getEmergencyContactName();
        cameracopy.B = creditCard.getEmergencyContactRelation().getCode();
        cameracopy.p = creditCard.getEmergencyContactAddress();
        cameracopy.u = creditCard.getEmergencyContactCity();
        cameracopy.D = creditCard.getEmergencyContactPhoneNumber();
        cameracopy.z = creditCard.getEmergencyContactOfficePhone();
        cameracopy.w = creditCard.getEmergencyContactOfficeExt();
        cameracopy.x = creditCard.getEmergencyContactMobileNumber();
        cameracopy.y = creditCard.getEmergencyContactBCACardNumber();
        cameracopy.C = "N";
        cameracopy.a = creditCard.getAutodebetAccountNumber();
        cameracopy.d = creditCard.getAutodebetPercentage();
        cameracopy.H = creditCard.getFlagAgreeLifeInsurance();
        cameracopy.A = "N";
        cameracopy.E = creditCard.getFlagSubmitSupplement();
        cameracopy.ar = creditCard.getPromotionCode();
        cameracopy.at = String.valueOf(creditCard.getCreditCardSupplements().size());
        ArrayList arrayList3 = new ArrayList();
        Iterator<CreditCardSupplement> it3 = creditCard.getCreditCardSupplements().iterator();
        int i2 = 0;
        while (true) {
            i = 1;
            int i3 = 1;
            if (!it3.hasNext()) {
                break;
            }
            CreditCardSupplement next3 = it3.next();
            cameraCopy.write write = new cameraCopy.write();
            write.b = next3.getCustomerName();
            write.a = next3.getBirthDate();
            write.c = next3.getGender();
            write.i = next3.getRelationship().getCode();
            write.g = next3.getMobileNumber();
            write.d = next3.getJobSector().getCode();
            write.f = next3.getOccupation().getCode();
            RealmList<CreditCardOptions> supplementCardOptions = creditCard.getCreditCardSupplements().get(i2).getSupplementCardOptions();
            String cardID = supplementCardOptions.get(0).getCardID();
            String str3 = cardID;
            if (supplementCardOptions.size() > 0) {
                while (true) {
                    str3 = cardID;
                    if (i3 < supplementCardOptions.size()) {
                        StringBuilder sb = new StringBuilder(";");
                        sb.append(supplementCardOptions.get(i3).getCardID());
                        cardID = cardID.concat(sb.toString());
                        i3++;
                    }
                }
            }
            write.h = str3;
            write.j = next3.getSupplementCardLimit();
            write.e = next3.getIdentityCardImg();
            arrayList3.add(write);
            i2++;
        }
        cameracopy.au = arrayList3;
        RealmList<CreditCardOptions> creditCardOptions = creditCard.getCreditCardOptions();
        if (creditCardOptions != null) {
            String cardID2 = creditCardOptions.get(0).getCardID();
            str = cardID2;
            if (creditCardOptions.size() > 0) {
                while (true) {
                    str = cardID2;
                    if (i >= creditCardOptions.size()) {
                        break;
                    }
                    StringBuilder sb2 = new StringBuilder(";");
                    sb2.append(creditCardOptions.get(i).getCardID());
                    cardID2 = cardID2.concat(sb2.toString());
                    i++;
                }
            }
        }
        cameracopy.an = str;
        cameracopy.aq = creditCard.getReferenceSalesName();
        cameracopy.ao = creditCard.getReferenceSalesCode();
        cameracopy.ap = creditCard.getReferenceBranchCode();
        cameracopy.Q = creditCard.getIdentityCardImg();
        cameracopy.ah = creditCard.getNpwpImg();
        ApplyCCPresenter applyCCPresenter = this.g;
        applyCCPresenter.e.e();
        Call<OpenAccountSuccessActivity<simpanGallery>> c = applyCCPresenter.apiService.c(cameracopy);
        applyCCPresenter.b = c;
        c.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05f6: INVOKE  
              (r0v118 'c' retrofit2.Call<o.OpenAccountSuccessActivity<o.simpanGallery>>)
              (wrap: com.bca.smartbranch.presenter.ApplyCCPresenter$1 : 0x05f3: CONSTRUCTOR  (r1v133 com.bca.smartbranch.presenter.ApplyCCPresenter$1 A[REMOVE]) = (r0v113 'applyCCPresenter' com.bca.smartbranch.presenter.ApplyCCPresenter) call: com.bca.smartbranch.presenter.ApplyCCPresenter.1.<init>(com.bca.smartbranch.presenter.ApplyCCPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.a():void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC27FormKartuKreditFragment.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.ApplyCCPresenter, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 15 more
            */
        /*
        // Method dump skipped, instructions count: 1532
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.a():void");
    }

    @Override // com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(final Editable editable) {
        if (!this.c.isInTransaction()) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.16
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (editable == CC27FormKartuKreditFragment.this.cc272EtNoId.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.c(cC27FormKartuKreditFragment, cC27FormKartuKreditFragment.cc272EtNoId);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setIdentityCardNumber(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc272EtNama.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment2 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.j(cC27FormKartuKreditFragment2, cC27FormKartuKreditFragment2.cc272EtNama);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setCustomerName(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc272EtNamaLengkap.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment3 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.j(cC27FormKartuKreditFragment3, cC27FormKartuKreditFragment3.cc272EtNamaLengkap);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setCustomerFullName(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc272EtNoHP.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment4 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.j(cC27FormKartuKreditFragment4, cC27FormKartuKreditFragment4.cc272EtNoHP);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setMobileNumber(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc272EtEmail.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment5 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.i(cC27FormKartuKreditFragment5, cC27FormKartuKreditFragment5.cc272EtEmail);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setEmailAddr(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc272EtNamaIbu.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment6 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.j(cC27FormKartuKreditFragment6, cC27FormKartuKreditFragment6.cc272EtNamaIbu);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setMotherMaidenName(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc272EtTempatLahir.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment7 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.j(cC27FormKartuKreditFragment7, cC27FormKartuKreditFragment7.cc272EtTempatLahir);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setBirthPlace(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc272EtNoKitas.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment8 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.j(cC27FormKartuKreditFragment8, cC27FormKartuKreditFragment8.cc272EtNoKitas);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setKitasKitapNumber(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc273EtAlamat.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment9 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.h(cC27FormKartuKreditFragment9, cC27FormKartuKreditFragment9.cc273EtAlamat);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setHmAddress(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc273EtKota.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment10 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.h(cC27FormKartuKreditFragment10, cC27FormKartuKreditFragment10.cc273EtKota);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setHmCity(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc273EtKodePos.getEditableText()) {
                        if (CC27FormKartuKreditFragment.this.errorListDataAlamat.get(CC27FormKartuKreditFragment.this.viewListDataAlamat.indexOf(CC27FormKartuKreditFragment.this.cc273EtKodePos)).getVisibility() == 0) {
                            if (CC27FormKartuKreditFragment.this.errorListDataAlamat.get(CC27FormKartuKreditFragment.this.viewListDataAlamat.indexOf(CC27FormKartuKreditFragment.this.cc273EtKodePos)).getText().toString().equals(CC27FormKartuKreditFragment.this.getString(2131820979))) {
                                if (CC27FormKartuKreditFragment.this.cc273EtKodePos.getText().toString().length() == 5) {
                                    List<TextView> list = CC27FormKartuKreditFragment.this.errorListDataAlamat;
                                    List<LogoutDialog_ViewBinding> list2 = CC27FormKartuKreditFragment.this.tilListDataAlamat;
                                    int indexOf = CC27FormKartuKreditFragment.this.viewListDataAlamat.indexOf(CC27FormKartuKreditFragment.this.cc273EtKodePos);
                                    list.get(indexOf).setVisibility(8);
                                    list2.get(indexOf).setBackgroundResource(2131230847);
                                }
                            } else if (!CC27FormKartuKreditFragment.this.cc273EtKodePos.getText().toString().isEmpty()) {
                                List<TextView> list3 = CC27FormKartuKreditFragment.this.errorListDataAlamat;
                                List<LogoutDialog_ViewBinding> list4 = CC27FormKartuKreditFragment.this.tilListDataAlamat;
                                int indexOf2 = CC27FormKartuKreditFragment.this.viewListDataAlamat.indexOf(CC27FormKartuKreditFragment.this.cc273EtKodePos);
                                list3.get(indexOf2).setVisibility(8);
                                list4.get(indexOf2).setBackgroundResource(2131230847);
                            }
                        }
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setHmPostCode(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc273EtNoTelp.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setPhoneNumber(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc274EtNoNPWP.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment11 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.g(cC27FormKartuKreditFragment11, cC27FormKartuKreditFragment11.cc274EtNoNPWP);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setNpwp(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc274EtPenghasilan.getEditableText()) {
                        CC27FormKartuKreditFragment.this.cc274EtPenghasilan.removeTextChangedListener(CC27FormKartuKreditFragment.this);
                        int length = CC27FormKartuKreditFragment.this.cc274EtPenghasilan.length();
                        CC27FormKartuKreditFragment.this.cc274EtPenghasilan.setText(getPromotion.i(CC27FormKartuKreditFragment.this.cc274EtPenghasilan.getText().toString()));
                        int length2 = CC27FormKartuKreditFragment.this.cc274EtPenghasilan.length();
                        if ((CC27FormKartuKreditFragment.this.u + length2) - length > 0) {
                            CC27FormKartuKreditFragment.this.cc274EtPenghasilan.setSelection((CC27FormKartuKreditFragment.this.u + length2) - length);
                        } else {
                            CC27FormKartuKreditFragment.this.cc274EtPenghasilan.setSelection(0);
                        }
                        CC27FormKartuKreditFragment.this.cc274EtPenghasilan.addTextChangedListener(CC27FormKartuKreditFragment.this);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setMonthlyIncome(CC27FormKartuKreditFragment.this.cc274EtPenghasilan.getText().toString().replaceAll("\\.", ""));
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment12 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.g(cC27FormKartuKreditFragment12, cC27FormKartuKreditFragment12.cc274EtPenghasilan);
                    } else if (editable == CC27FormKartuKreditFragment.this.cc274EtNamaPerusahaan.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment13 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.g(cC27FormKartuKreditFragment13, cC27FormKartuKreditFragment13.cc274EtNamaPerusahaan);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setCurrCompanyName(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc274EtJenisUsaha.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment14 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.g(cC27FormKartuKreditFragment14, cC27FormKartuKreditFragment14.cc274EtJenisUsaha);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setCurrCompanyBusinessType(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc274EtJabatan.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment15 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.g(cC27FormKartuKreditFragment15, cC27FormKartuKreditFragment15.cc274EtJabatan);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setCurrCompanyPosition(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc274EtAlamat.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment16 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.g(cC27FormKartuKreditFragment16, cC27FormKartuKreditFragment16.cc274EtAlamat);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeAddress(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc274EtKota.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment17 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.g(cC27FormKartuKreditFragment17, cC27FormKartuKreditFragment17.cc274EtKota);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeCity(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc274EtKodePos.getEditableText()) {
                        if (CC27FormKartuKreditFragment.this.errorListDataPekerjaan.get(CC27FormKartuKreditFragment.this.viewListDataPekerjaan.indexOf(CC27FormKartuKreditFragment.this.cc274EtKodePos)).getVisibility() == 0) {
                            if (CC27FormKartuKreditFragment.this.errorListDataPekerjaan.get(CC27FormKartuKreditFragment.this.viewListDataPekerjaan.indexOf(CC27FormKartuKreditFragment.this.cc274EtKodePos)).getText().toString().equals(CC27FormKartuKreditFragment.this.getString(2131820979))) {
                                if (CC27FormKartuKreditFragment.this.cc274EtKodePos.getText().toString().length() == 5) {
                                    List<TextView> list5 = CC27FormKartuKreditFragment.this.errorListDataPekerjaan;
                                    List<LogoutDialog_ViewBinding> list6 = CC27FormKartuKreditFragment.this.tilListDataPekerjaan;
                                    int indexOf3 = CC27FormKartuKreditFragment.this.viewListDataPekerjaan.indexOf(CC27FormKartuKreditFragment.this.cc274EtKodePos);
                                    list5.get(indexOf3).setVisibility(8);
                                    list6.get(indexOf3).setBackgroundResource(2131230847);
                                }
                            } else if (!CC27FormKartuKreditFragment.this.cc274EtKodePos.getText().toString().isEmpty()) {
                                List<TextView> list7 = CC27FormKartuKreditFragment.this.errorListDataPekerjaan;
                                List<LogoutDialog_ViewBinding> list8 = CC27FormKartuKreditFragment.this.tilListDataPekerjaan;
                                int indexOf4 = CC27FormKartuKreditFragment.this.viewListDataPekerjaan.indexOf(CC27FormKartuKreditFragment.this.cc274EtKodePos);
                                list7.get(indexOf4).setVisibility(8);
                                list8.get(indexOf4).setBackgroundResource(2131230847);
                            }
                        }
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setCurrOfficePostCode(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc274EtNoTelp.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment18 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.g(cC27FormKartuKreditFragment18, cC27FormKartuKreditFragment18.cc274EtNoTelp);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setCurrOfficePhoneNumber(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc274EtExt.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeExtensionNumber(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc275EtNoKartuKredit.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment19 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.f(cC27FormKartuKreditFragment19, cC27FormKartuKreditFragment19.cc275EtNoKartuKredit);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0).setCardNumber(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc276EtNamaLengkap.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment20 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.a(cC27FormKartuKreditFragment20, cC27FormKartuKreditFragment20.cc276EtNamaLengkap);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactName(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc276EtAlamat.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment21 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.a(cC27FormKartuKreditFragment21, cC27FormKartuKreditFragment21.cc276EtAlamat);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactAddress(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc276EtKota.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment22 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.a(cC27FormKartuKreditFragment22, cC27FormKartuKreditFragment22.cc276EtKota);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactCity(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc276EtKodePos.getEditableText()) {
                        if (CC27FormKartuKreditFragment.this.errorListDataKontakDarurat.get(CC27FormKartuKreditFragment.this.viewListDataKontakDarurat.indexOf(CC27FormKartuKreditFragment.this.cc276EtKodePos)).getVisibility() == 0) {
                            if (CC27FormKartuKreditFragment.this.errorListDataKontakDarurat.get(CC27FormKartuKreditFragment.this.viewListDataKontakDarurat.indexOf(CC27FormKartuKreditFragment.this.cc276EtKodePos)).getText().toString().equals(CC27FormKartuKreditFragment.this.getString(2131820979))) {
                                if (CC27FormKartuKreditFragment.this.cc276EtKodePos.getText().toString().length() == 5) {
                                    List<TextView> list9 = CC27FormKartuKreditFragment.this.errorListDataKontakDarurat;
                                    List<LogoutDialog_ViewBinding> list10 = CC27FormKartuKreditFragment.this.tilListDataKontakDarurat;
                                    int indexOf5 = CC27FormKartuKreditFragment.this.viewListDataKontakDarurat.indexOf(CC27FormKartuKreditFragment.this.cc276EtKodePos);
                                    list9.get(indexOf5).setVisibility(8);
                                    list10.get(indexOf5).setBackgroundResource(2131230847);
                                }
                            } else if (!CC27FormKartuKreditFragment.this.cc276EtKodePos.getText().toString().isEmpty()) {
                                List<TextView> list11 = CC27FormKartuKreditFragment.this.errorListDataKontakDarurat;
                                List<LogoutDialog_ViewBinding> list12 = CC27FormKartuKreditFragment.this.tilListDataKontakDarurat;
                                int indexOf6 = CC27FormKartuKreditFragment.this.viewListDataKontakDarurat.indexOf(CC27FormKartuKreditFragment.this.cc276EtKodePos);
                                list11.get(indexOf6).setVisibility(8);
                                list12.get(indexOf6).setBackgroundResource(2131230847);
                            }
                        }
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactPostalCode(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc276EtTlpKantor.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactOfficePhone(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc276EtTlpRumah.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactPhoneNumber(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc276EtExt.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactOfficeExt(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc276EtNoHP.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment23 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.a(cC27FormKartuKreditFragment23, cC27FormKartuKreditFragment23.cc276EtNoHP);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactMobileNumber(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc278EtNamaLengkap.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment24 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.e(cC27FormKartuKreditFragment24, cC27FormKartuKreditFragment24.cc278EtNamaLengkap);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(0).setCustomerName(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc278EtNoHP.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment25 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.e(cC27FormKartuKreditFragment25, cC27FormKartuKreditFragment25.cc278EtNoHP);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(0).setMobileNumber(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc275EtNoPromosi.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setPromotionCode(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc275EtNamaMarketing.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setReferenceSalesName(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc275EtSalesNIP.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setReferenceSalesCode(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc275EtCabang.getEditableText()) {
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setReferenceBranchCode(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc275EtNoReferal.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment26 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.f(cC27FormKartuKreditFragment26, cC27FormKartuKreditFragment26.cc275EtNoReferal);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setReferalCode(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc275EtKrisFlyer.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment27 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.f(cC27FormKartuKreditFragment27, cC27FormKartuKreditFragment27.cc275EtKrisFlyer);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setNoCardKrisFlyer(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc278EtLimitKartu.getEditableText()) {
                        CC27FormKartuKreditFragment.this.cc278EtLimitKartu.removeTextChangedListener(CC27FormKartuKreditFragment.this);
                        int length3 = CC27FormKartuKreditFragment.this.cc278EtLimitKartu.length();
                        CC27FormKartuKreditFragment.this.cc278EtLimitKartu.setText(getPromotion.i(CC27FormKartuKreditFragment.this.cc278EtLimitKartu.getText().toString()));
                        int length4 = CC27FormKartuKreditFragment.this.cc278EtLimitKartu.length();
                        if ((CC27FormKartuKreditFragment.this.u + length4) - length3 > 0) {
                            CC27FormKartuKreditFragment.this.cc278EtLimitKartu.setSelection((CC27FormKartuKreditFragment.this.u + length4) - length3);
                        } else {
                            CC27FormKartuKreditFragment.this.cc278EtLimitKartu.setSelection(0);
                        }
                        CC27FormKartuKreditFragment.this.cc278EtLimitKartu.addTextChangedListener(CC27FormKartuKreditFragment.this);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(0).setSupplementCardLimit(CC27FormKartuKreditFragment.this.cc278EtLimitKartu.getText().toString().replaceAll("\\.", ""));
                        if (CC27FormKartuKreditFragment.this.errorListDataKartuTambahan1.get(CC27FormKartuKreditFragment.this.viewListDataKartuTambahan1.indexOf(CC27FormKartuKreditFragment.this.cc278EtLimitKartu)).getVisibility() != 0) {
                            return;
                        }
                        if (CC27FormKartuKreditFragment.this.errorListDataKartuTambahan1.get(CC27FormKartuKreditFragment.this.viewListDataKartuTambahan1.indexOf(CC27FormKartuKreditFragment.this.cc278EtLimitKartu)).getText().toString().equals(CC27FormKartuKreditFragment.this.errorMinimalLimitBlackPlatinum)) {
                            if (Long.parseLong(CC27FormKartuKreditFragment.this.cc278EtLimitKartu.getText().toString().replaceAll("\\.", "")) >= 5000000) {
                                List<TextView> list13 = CC27FormKartuKreditFragment.this.errorListDataKartuTambahan1;
                                List<LogoutDialog_ViewBinding> list14 = CC27FormKartuKreditFragment.this.tilListDataKartuTambahan1;
                                int indexOf7 = CC27FormKartuKreditFragment.this.viewListDataKartuTambahan1.indexOf(CC27FormKartuKreditFragment.this.cc278EtLimitKartu);
                                list13.get(indexOf7).setVisibility(8);
                                list14.get(indexOf7).setBackgroundResource(2131230847);
                            }
                        } else if (!CC27FormKartuKreditFragment.this.errorListDataKartuTambahan1.get(CC27FormKartuKreditFragment.this.viewListDataKartuTambahan1.indexOf(CC27FormKartuKreditFragment.this.cc278EtLimitKartu)).getText().toString().equals(CC27FormKartuKreditFragment.this.errorMinimalLimitOrdinary)) {
                            CC27FormKartuKreditFragment cC27FormKartuKreditFragment28 = CC27FormKartuKreditFragment.this;
                            CC27FormKartuKreditFragment.e(cC27FormKartuKreditFragment28, cC27FormKartuKreditFragment28.cc278EtLimitKartu);
                        } else if (Long.parseLong(CC27FormKartuKreditFragment.this.cc278EtLimitKartu.getText().toString().replaceAll("\\.", "")) >= 1000000) {
                            List<TextView> list15 = CC27FormKartuKreditFragment.this.errorListDataKartuTambahan1;
                            List<LogoutDialog_ViewBinding> list16 = CC27FormKartuKreditFragment.this.tilListDataKartuTambahan1;
                            int indexOf8 = CC27FormKartuKreditFragment.this.viewListDataKartuTambahan1.indexOf(CC27FormKartuKreditFragment.this.cc278EtLimitKartu);
                            list15.get(indexOf8).setVisibility(8);
                            list16.get(indexOf8).setBackgroundResource(2131230847);
                        }
                    } else if (editable == CC27FormKartuKreditFragment.this.cc279EtNamaLengkap.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment29 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.d(cC27FormKartuKreditFragment29, cC27FormKartuKreditFragment29.cc279EtNamaLengkap);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(1).setCustomerName(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc279EtNoHP.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment30 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.d(cC27FormKartuKreditFragment30, cC27FormKartuKreditFragment30.cc279EtNoHP);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(1).setMobileNumber(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc279EtLimitKartu.getEditableText()) {
                        CC27FormKartuKreditFragment.this.cc279EtLimitKartu.removeTextChangedListener(CC27FormKartuKreditFragment.this);
                        int length5 = CC27FormKartuKreditFragment.this.cc279EtLimitKartu.length();
                        CC27FormKartuKreditFragment.this.cc279EtLimitKartu.setText(getPromotion.i(CC27FormKartuKreditFragment.this.cc279EtLimitKartu.getText().toString()));
                        int length6 = CC27FormKartuKreditFragment.this.cc279EtLimitKartu.length();
                        if ((CC27FormKartuKreditFragment.this.u + length6) - length5 > 0) {
                            CC27FormKartuKreditFragment.this.cc279EtLimitKartu.setSelection((CC27FormKartuKreditFragment.this.u + length6) - length5);
                        } else {
                            CC27FormKartuKreditFragment.this.cc279EtLimitKartu.setSelection(0);
                        }
                        CC27FormKartuKreditFragment.this.cc279EtLimitKartu.addTextChangedListener(CC27FormKartuKreditFragment.this);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(1).setSupplementCardLimit(CC27FormKartuKreditFragment.this.cc279EtLimitKartu.getText().toString().replaceAll("\\.", ""));
                        if (CC27FormKartuKreditFragment.this.errorListDataKartuTambahan2.get(CC27FormKartuKreditFragment.this.viewListDataKartuTambahan2.indexOf(CC27FormKartuKreditFragment.this.cc279EtLimitKartu)).getVisibility() != 0) {
                            return;
                        }
                        if (CC27FormKartuKreditFragment.this.errorListDataKartuTambahan2.get(CC27FormKartuKreditFragment.this.viewListDataKartuTambahan2.indexOf(CC27FormKartuKreditFragment.this.cc279EtLimitKartu)).getText().toString().equals(CC27FormKartuKreditFragment.this.errorMinimalLimitBlackPlatinum)) {
                            if (Long.parseLong(CC27FormKartuKreditFragment.this.cc279EtLimitKartu.getText().toString().replaceAll("\\.", "")) >= 5000000) {
                                List<TextView> list17 = CC27FormKartuKreditFragment.this.errorListDataKartuTambahan2;
                                List<LogoutDialog_ViewBinding> list18 = CC27FormKartuKreditFragment.this.tilListDataKartuTambahan2;
                                int indexOf9 = CC27FormKartuKreditFragment.this.viewListDataKartuTambahan2.indexOf(CC27FormKartuKreditFragment.this.cc279EtLimitKartu);
                                list17.get(indexOf9).setVisibility(8);
                                list18.get(indexOf9).setBackgroundResource(2131230847);
                            }
                        } else if (!CC27FormKartuKreditFragment.this.errorListDataKartuTambahan2.get(CC27FormKartuKreditFragment.this.viewListDataKartuTambahan2.indexOf(CC27FormKartuKreditFragment.this.cc279EtLimitKartu)).getText().toString().equals(CC27FormKartuKreditFragment.this.errorMinimalLimitOrdinary)) {
                            CC27FormKartuKreditFragment cC27FormKartuKreditFragment31 = CC27FormKartuKreditFragment.this;
                            CC27FormKartuKreditFragment.d(cC27FormKartuKreditFragment31, cC27FormKartuKreditFragment31.cc279EtLimitKartu);
                        } else if (Long.parseLong(CC27FormKartuKreditFragment.this.cc279EtLimitKartu.getText().toString().replaceAll("\\.", "")) >= 1000000) {
                            List<TextView> list19 = CC27FormKartuKreditFragment.this.errorListDataKartuTambahan2;
                            List<LogoutDialog_ViewBinding> list20 = CC27FormKartuKreditFragment.this.tilListDataKartuTambahan2;
                            int indexOf10 = CC27FormKartuKreditFragment.this.viewListDataKartuTambahan2.indexOf(CC27FormKartuKreditFragment.this.cc279EtLimitKartu);
                            list19.get(indexOf10).setVisibility(8);
                            list20.get(indexOf10).setBackgroundResource(2131230847);
                        }
                    } else if (editable == CC27FormKartuKreditFragment.this.cc2710EtNamaLengkap.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment32 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.b(cC27FormKartuKreditFragment32, cC27FormKartuKreditFragment32.cc2710EtNamaLengkap);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(2).setCustomerName(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc2710EtNoHP.getEditableText()) {
                        CC27FormKartuKreditFragment cC27FormKartuKreditFragment33 = CC27FormKartuKreditFragment.this;
                        CC27FormKartuKreditFragment.d(cC27FormKartuKreditFragment33, cC27FormKartuKreditFragment33.cc2710EtNoHP);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(2).setMobileNumber(editable.toString());
                    } else if (editable == CC27FormKartuKreditFragment.this.cc2710EtLimitKartu.getEditableText()) {
                        CC27FormKartuKreditFragment.this.cc2710EtLimitKartu.removeTextChangedListener(CC27FormKartuKreditFragment.this);
                        int length7 = CC27FormKartuKreditFragment.this.cc2710EtLimitKartu.length();
                        CC27FormKartuKreditFragment.this.cc2710EtLimitKartu.setText(getPromotion.i(CC27FormKartuKreditFragment.this.cc2710EtLimitKartu.getText().toString()));
                        int length8 = CC27FormKartuKreditFragment.this.cc2710EtLimitKartu.length();
                        if ((CC27FormKartuKreditFragment.this.u + length8) - length7 > 0) {
                            CC27FormKartuKreditFragment.this.cc2710EtLimitKartu.setSelection((CC27FormKartuKreditFragment.this.u + length8) - length7);
                        } else {
                            CC27FormKartuKreditFragment.this.cc2710EtLimitKartu.setSelection(0);
                        }
                        CC27FormKartuKreditFragment.this.cc2710EtLimitKartu.addTextChangedListener(CC27FormKartuKreditFragment.this);
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(2).setSupplementCardLimit(CC27FormKartuKreditFragment.this.cc2710EtLimitKartu.getText().toString().replaceAll("\\.", ""));
                        if (CC27FormKartuKreditFragment.this.errorListDataKartuTambahan3.get(CC27FormKartuKreditFragment.this.viewListDataKartuTambahan3.indexOf(CC27FormKartuKreditFragment.this.cc2710EtLimitKartu)).getVisibility() != 0) {
                            return;
                        }
                        if (CC27FormKartuKreditFragment.this.errorListDataKartuTambahan3.get(CC27FormKartuKreditFragment.this.viewListDataKartuTambahan3.indexOf(CC27FormKartuKreditFragment.this.cc2710EtLimitKartu)).getText().toString().equals(CC27FormKartuKreditFragment.this.errorMinimalLimitBlackPlatinum)) {
                            if (Long.parseLong(CC27FormKartuKreditFragment.this.cc2710EtLimitKartu.getText().toString().replaceAll("\\.", "")) >= 5000000) {
                                List<TextView> list21 = CC27FormKartuKreditFragment.this.errorListDataKartuTambahan3;
                                List<LogoutDialog_ViewBinding> list22 = CC27FormKartuKreditFragment.this.tilListDataKartuTambahan3;
                                int indexOf11 = CC27FormKartuKreditFragment.this.viewListDataKartuTambahan3.indexOf(CC27FormKartuKreditFragment.this.cc2710EtLimitKartu);
                                list21.get(indexOf11).setVisibility(8);
                                list22.get(indexOf11).setBackgroundResource(2131230847);
                            }
                        } else if (!CC27FormKartuKreditFragment.this.errorListDataKartuTambahan3.get(CC27FormKartuKreditFragment.this.viewListDataKartuTambahan3.indexOf(CC27FormKartuKreditFragment.this.cc2710EtLimitKartu)).getText().toString().equals(CC27FormKartuKreditFragment.this.errorMinimalLimitOrdinary)) {
                            CC27FormKartuKreditFragment cC27FormKartuKreditFragment34 = CC27FormKartuKreditFragment.this;
                            CC27FormKartuKreditFragment.d(cC27FormKartuKreditFragment34, cC27FormKartuKreditFragment34.cc2710EtLimitKartu);
                        } else if (Long.parseLong(CC27FormKartuKreditFragment.this.cc2710EtLimitKartu.getText().toString().replaceAll("\\.", "")) >= 1000000) {
                            List<TextView> list23 = CC27FormKartuKreditFragment.this.errorListDataKartuTambahan3;
                            List<LogoutDialog_ViewBinding> list24 = CC27FormKartuKreditFragment.this.tilListDataKartuTambahan3;
                            int indexOf12 = CC27FormKartuKreditFragment.this.viewListDataKartuTambahan3.indexOf(CC27FormKartuKreditFragment.this.cc2710EtLimitKartu);
                            list23.get(indexOf12).setVisibility(8);
                            list24.get(indexOf12).setBackgroundResource(2131230847);
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0a69  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0ad4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0bb0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0bca  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0e9a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0f09  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x11d5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x123c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x14e6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x1577 A[LOOP:1: B:197:0x1569->B:199:0x1577, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x15b8 A[LOOP:2: B:201:0x15aa->B:203:0x15b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x15f9 A[LOOP:3: B:205:0x15eb->B:207:0x15f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x163a A[LOOP:4: B:209:0x162c->B:211:0x163a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x167b A[LOOP:5: B:213:0x166d->B:215:0x167b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x16bc A[LOOP:6: B:217:0x16ae->B:219:0x16bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x16fd A[LOOP:7: B:221:0x16ef->B:223:0x16fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x173e A[LOOP:8: B:225:0x1730->B:227:0x173e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x095f  */
    @Override // com.bca.smartbranch.fragment.BaseFragment
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void b(android.view.View r11) {
        /*
        // Method dump skipped, instructions count: 6374
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.b(android.view.View):void");
    }

    @Override // com.bca.smartbranch.presenter.ApplyCCPresenter.RemoteActionCompatParcelizer
    public final void b(String str) {
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

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493182;
    }

    @Override // com.bca.smartbranch.presenter.ApplyCCPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.OcrPresenter$MediaBrowserCompat$CustomActionResultReceiver
    public final void c(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((CC8FormKartuKreditActivity) getActivity()).llMain, str, 0).g();
    }

    @Override // com.bca.smartbranch.presenter.ApplyCCPresenter.RemoteActionCompatParcelizer
    public final void c(simpanGallery simpangallery) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.20
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.deleteFromRealm();
            }
        });
        h();
        Intent intent = new Intent(getContext(), OpenCCSuccessActivity.class);
        intent.putExtra("no_reff", simpangallery.e);
        intent.putExtra("notes", simpangallery.a);
        startActivity(intent);
    }

    @OnClick({2131299604})
    public void clickedTermsCondition(View view) {
        new TermConditionKartuKreditDialog().show(getActivity().l(), "TermConditionDialog");
    }

    @Override // com.bca.smartbranch.presenter.ApplyCCPresenter.RemoteActionCompatParcelizer
    public final void d(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    public final void d(showInfoValueTodayOR showinfovaluetodayor, int i, int i2, int i3) {
        try {
            switch (Integer.parseInt(showinfovaluetodayor.getTag())) {
                case 2131296481:
                    c(this.cc2710EtTanggalLahir, i, i2, i3);
                    this.cc2710tilTanggalLahir.setHintEnabled(true);
                    this.c.executeTransaction(new Realm.Transaction(i, i2, i3) { // from class: o.TxnTellerRequest$TxnDataInput$$Parcelable
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ int d;

                        {
                            this.d = r5;
                            this.a = r6;
                            this.b = r7;
                        }

                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(2).setBirthDate(getAnnualFeeBasicAmount.c(this.d, this.a, this.b));
                        }
                    });
                    if (DateTimeFormat.forPattern("ddMMyyyy").parseDateTime(((CC8FormKartuKreditActivity) getActivity()).n.getCreditCardSupplements().get(2).getBirthDate()).isBefore(DateTime.now().minusYears(17))) {
                        List<TextView> list = this.errorListDataKartuTambahan3;
                        List<LogoutDialog_ViewBinding> list2 = this.tilListDataKartuTambahan3;
                        int indexOf = this.viewListDataKartuTambahan3.indexOf(this.cc2710EtTanggalLahir);
                        list.get(indexOf).setVisibility(8);
                        list2.get(indexOf).setBackgroundResource(2131230847);
                        return;
                    }
                    return;
                case 2131296528:
                    c(this.cc272EtMasaBerlakuKitas, i, i2, i3);
                    this.cc272tilMasaBerlakuKitas.setHintEnabled(true);
                    this.c.executeTransaction(new TxnTellerRequest.TxnDataInput.Representative(this, i, i2, i3));
                    return;
                case 2131296539:
                    c(this.cc272EtTanggalLahir, i, i2, i3);
                    this.cc272tilTanggalLahir.setHintEnabled(true);
                    this.c.executeTransaction(new Realm.Transaction(i, i2, i3) { // from class: o.getRepresentativeIdNumber
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int c;
                        public final /* synthetic */ int d;

                        {
                            this.a = r5;
                            this.c = r6;
                            this.d = r7;
                        }

                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setBirthDate(getAnnualFeeBasicAmount.c(this.a, this.c, this.d));
                        }
                    });
                    DateTime parseDateTime = DateTimeFormat.forPattern("ddMMyyyy").parseDateTime(((CC8FormKartuKreditActivity) getActivity()).n.getBirthDate());
                    if (parseDateTime.isBefore(DateTime.now().minusYears(21)) && parseDateTime.isAfter(DateTime.now().minusYears(65))) {
                        List<TextView> list3 = this.errorListDataDiri;
                        List<LogoutDialog_ViewBinding> list4 = this.tilListDataDiri;
                        int indexOf2 = this.viewListDataDiri.indexOf(this.cc272EtTanggalLahir);
                        list3.get(indexOf2).setVisibility(8);
                        list4.get(indexOf2).setBackgroundResource(2131230847);
                        return;
                    }
                    return;
                case 2131296697:
                    c(this.cc278EtTanggalLahir, i, i2, i3);
                    this.cc278tilTanggalLahir.setHintEnabled(true);
                    this.c.executeTransaction(new Realm.Transaction(i, i2, i3) { // from class: o.setWarkatType
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int b;
                        public final /* synthetic */ int e;

                        {
                            this.a = r5;
                            this.e = r6;
                            this.b = r7;
                        }

                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(0).setBirthDate(getAnnualFeeBasicAmount.c(this.a, this.e, this.b));
                        }
                    });
                    if (DateTimeFormat.forPattern("ddMMyyyy").parseDateTime(((CC8FormKartuKreditActivity) getActivity()).n.getCreditCardSupplements().get(0).getBirthDate()).isBefore(DateTime.now().minusYears(17))) {
                        List<TextView> list5 = this.errorListDataKartuTambahan1;
                        List<LogoutDialog_ViewBinding> list6 = this.tilListDataKartuTambahan1;
                        int indexOf3 = this.viewListDataKartuTambahan1.indexOf(this.cc278EtTanggalLahir);
                        list5.get(indexOf3).setVisibility(8);
                        list6.get(indexOf3).setBackgroundResource(2131230847);
                        return;
                    }
                    return;
                case 2131296739:
                    c(this.cc279EtTanggalLahir, i, i2, i3);
                    this.cc279tilTanggalLahir.setHintEnabled(true);
                    this.c.executeTransaction(new Realm.Transaction(i, i2, i3) { // from class: o.setTransactionNotes2
                        public final /* synthetic */ int a;
                        public final /* synthetic */ int d;
                        public final /* synthetic */ int e;

                        {
                            this.d = r5;
                            this.a = r6;
                            this.e = r7;
                        }

                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(1).setBirthDate(getAnnualFeeBasicAmount.c(this.d, this.a, this.e));
                        }
                    });
                    if (DateTimeFormat.forPattern("ddMMyyyy").parseDateTime(((CC8FormKartuKreditActivity) getActivity()).n.getCreditCardSupplements().get(1).getBirthDate()).isBefore(DateTime.now().minusYears(17))) {
                        List<TextView> list7 = this.errorListDataKartuTambahan2;
                        List<LogoutDialog_ViewBinding> list8 = this.tilListDataKartuTambahan2;
                        int indexOf4 = this.viewListDataKartuTambahan2.indexOf(this.cc279EtTanggalLahir);
                        list7.get(indexOf4).setVisibility(8);
                        list8.get(indexOf4).setBackgroundResource(2131230847);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (IllegalArgumentException e) {
        }
    }

    @Override // com.bca.smartbranch.presenter.ApplyCCPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer
    public final void e() {
        g();
    }

    @Override // com.bca.smartbranch.presenter.CheckCCValidApplicantPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((CC8FormKartuKreditActivity) getActivity()).llMain, str, -1).g();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getFlagSubmitSupplement().equals("Y")) {
            e(2131296811, new CC20FormKartuKreditFragment(), "CC20FormKartuKreditFragment");
        } else if (((CC8FormKartuKreditActivity) getActivity()).n.getCreditCardSupplements().size() == 1) {
            e(2131296811, new CC26AFormKartuKreditFragment(), "CC26AFormKartuKreditFragment");
        } else if (((CC8FormKartuKreditActivity) getActivity()).n.getCreditCardSupplements().size() == 2) {
            e(2131296811, new CC26BFormKartuKreditFragment(), "CC26BFormKartuKreditFragment");
        } else if (((CC8FormKartuKreditActivity) getActivity()).n.getCreditCardSupplements().size() == 3) {
            e(2131296811, new CC26CFormKartuKreditFragment(), "CC26CFormKartuKreditFragment");
        }
    }

    @Override // com.bca.smartbranch.presenter.ApplyCCPresenter.RemoteActionCompatParcelizer
    public final void i(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((CC8FormKartuKreditActivity) getActivity()).llMain, str, -1).g();
    }

    @Override // com.bca.smartbranch.presenter.ApplyCCPresenter.RemoteActionCompatParcelizer
    public final void j(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onBankPenerbitEvent(final PilihBidangUsahaActivity_ViewBinding pilihBidangUsahaActivity_ViewBinding) {
        this.cc275EtBankPenerbit.setError(null);
        this.cc275EtBankPenerbit.setText(pilihBidangUsahaActivity_ViewBinding.a.getDescription());
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.13
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                if (((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0).getBankName() != null) {
                    ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0).getBankName().deleteFromRealm();
                }
                Category category = (Category) realm.createObject(Category.class);
                category.setCode(pilihBidangUsahaActivity_ViewBinding.a.getCode());
                category.setDescription(pilihBidangUsahaActivity_ViewBinding.a.getDescription());
                ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0).setBankName(category);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseCategoryEvent(final CategoryListDialog.write write) {
        char c;
        String str = write.c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1621915162:
                if (str.equals("maritalstatus")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -290756696:
                if (str.equals("education")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -261851592:
                if (str.equals("relationship")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 636205370:
                if (str.equals("businessfield")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1615358283:
                if (str.equals("occupation")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1812291985:
                if (str.equals("homestatus")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            this.cc272EtStatusPerkawinan.setError(null);
            this.cc272EtStatusPerkawinan.setText(write.a.getDescription());
            this.c.executeTransaction(new Realm.Transaction(write) { // from class: o.setWarkatDueDate
                public final /* synthetic */ CategoryListDialog.write e;

                {
                    this.e = r5;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC27FormKartuKreditFragment cC27FormKartuKreditFragment = CC27FormKartuKreditFragment.this;
                    CategoryListDialog.write write2 = this.e;
                    if (((CC8FormKartuKreditActivity) cC27FormKartuKreditFragment.getActivity()).n.getMaritalStatus() != null) {
                        ((CC8FormKartuKreditActivity) cC27FormKartuKreditFragment.getActivity()).n.getMaritalStatus().deleteFromRealm();
                    }
                    Category category = (Category) realm.createObject(Category.class);
                    category.setCode(write2.a.getCode());
                    category.setDescription(write2.a.getDescription());
                    ((CC8FormKartuKreditActivity) cC27FormKartuKreditFragment.getActivity()).n.setMaritalStatus(category);
                }
            });
        } else if (c == 1) {
            this.cc272EtPendidikanTerakhir.setError(null);
            this.cc272EtPendidikanTerakhir.setText(write.a.getDescription());
            this.c.executeTransaction(new Realm.Transaction(write) { // from class: o.setValueToday
                public final /* synthetic */ CategoryListDialog.write a;

                {
                    this.a = r5;
                }

                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CC27FormKartuKreditFragment cC27FormKartuKreditFragment = CC27FormKartuKreditFragment.this;
                    CategoryListDialog.write write2 = this.a;
                    if (((CC8FormKartuKreditActivity) cC27FormKartuKreditFragment.getActivity()).n.getLastEducation() != null) {
                        ((CC8FormKartuKreditActivity) cC27FormKartuKreditFragment.getActivity()).n.getLastEducation().deleteFromRealm();
                    }
                    Category category = (Category) realm.createObject(Category.class);
                    category.setCode(write2.a.getCode());
                    category.setDescription(write2.a.getDescription());
                    ((CC8FormKartuKreditActivity) cC27FormKartuKreditFragment.getActivity()).n.setLastEducation(category);
                }
            });
        } else if (c != 2) {
            if (c != 3) {
                if (c != 4) {
                    if (c == 5) {
                        this.cc273EtStatusTempat.setError(null);
                        this.cc273EtStatusTempat.setText(write.a.getDescription());
                        this.c.executeTransaction(new Realm.Transaction(write) { // from class: o.setWarkatNumber
                            public final /* synthetic */ CategoryListDialog.write b;

                            {
                                this.b = r5;
                            }

                            @Override // io.realm.Realm.Transaction
                            public final void execute(Realm realm) {
                                CC27FormKartuKreditFragment cC27FormKartuKreditFragment = CC27FormKartuKreditFragment.this;
                                CategoryListDialog.write write2 = this.b;
                                if (((CC8FormKartuKreditActivity) cC27FormKartuKreditFragment.getActivity()).n.getHmHouseStatus() != null) {
                                    ((CC8FormKartuKreditActivity) cC27FormKartuKreditFragment.getActivity()).n.getHmHouseStatus().deleteFromRealm();
                                }
                                Category category = (Category) realm.createObject(Category.class);
                                category.setCode(write2.a.getCode());
                                category.setDescription(write2.a.getDescription());
                                ((CC8FormKartuKreditActivity) cC27FormKartuKreditFragment.getActivity()).n.setHmHouseStatus(category);
                            }
                        });
                    }
                } else if (write.d.equals("2131296696")) {
                    this.cc278EtPekerjaan.setError(null);
                    this.cc278EtPekerjaan.setText(write.a.getDescription());
                    this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.7
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            if (((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().size() > 0) {
                                ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(0).getOccupation().deleteFromRealm();
                            }
                            Category category = (Category) realm.createObject(Category.class);
                            category.setCode(write.a.getCode());
                            category.setDescription(write.a.getDescription());
                            ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(0).setOccupation(category);
                        }
                    });
                } else if (write.d.equals("2131296738")) {
                    this.cc279EtPekerjaan.setError(null);
                    this.cc279EtPekerjaan.setText(write.a.getDescription());
                    this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.10
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            if (((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().size() >= 2) {
                                ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(1).getOccupation().deleteFromRealm();
                            }
                            Category category = (Category) realm.createObject(Category.class);
                            category.setCode(write.a.getCode());
                            category.setDescription(write.a.getDescription());
                            ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(1).setOccupation(category);
                        }
                    });
                } else if (write.d.equals("2131296480")) {
                    this.cc2710EtPekerjaan.setError(null);
                    this.cc2710EtPekerjaan.setText(write.a.getDescription());
                    this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.6
                        @Override // io.realm.Realm.Transaction
                        public final void execute(Realm realm) {
                            if (((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().size() >= 3) {
                                ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(2).getOccupation().deleteFromRealm();
                            }
                            Category category = (Category) realm.createObject(Category.class);
                            category.setCode(write.a.getCode());
                            category.setDescription(write.a.getDescription());
                            ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(2).setOccupation(category);
                        }
                    });
                }
            } else if (write.d.equals("2131296594")) {
                this.cc274EtBidangUsaha.setError(null);
                this.cc274EtBidangUsaha.setText(write.a.getDescription());
                this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.8
                    @Override // io.realm.Realm.Transaction
                    public final void execute(Realm realm) {
                        if (((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCurrOfficeBusinessField() != null) {
                            ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCurrOfficeBusinessField().deleteFromRealm();
                        }
                        Category category = (Category) realm.createObject(Category.class);
                        category.setCode(write.a.getCode());
                        category.setDescription(write.a.getDescription());
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setCurrOfficeBusinessField(category);
                    }
                });
            } else if (write.d.equals("2131296690")) {
                this.cc278EtBidangUsaha.setError(null);
                this.cc278EtBidangUsaha.setText(write.a.getDescription());
                this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.9
                    @Override // io.realm.Realm.Transaction
                    public final void execute(Realm realm) {
                        if (((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().size() > 0) {
                            ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(0).getJobSector().deleteFromRealm();
                        }
                        Category category = (Category) realm.createObject(Category.class);
                        category.setCode(write.a.getCode());
                        category.setDescription(write.a.getDescription());
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(0).setJobSector(category);
                    }
                });
            } else if (write.d.equals("2131296732")) {
                this.cc279EtBidangUsaha.setError(null);
                this.cc279EtBidangUsaha.setText(write.a.getDescription());
                this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.14
                    @Override // io.realm.Realm.Transaction
                    public final void execute(Realm realm) {
                        if (((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().size() >= 2) {
                            ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(1).getJobSector().deleteFromRealm();
                        }
                        Category category = (Category) realm.createObject(Category.class);
                        category.setCode(write.a.getCode());
                        category.setDescription(write.a.getDescription());
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(1).setJobSector(category);
                    }
                });
            } else if (write.d.equals("2131296474")) {
                this.cc2710EtBidangUsaha.setError(null);
                this.cc2710EtBidangUsaha.setText(write.a.getDescription());
                this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.15
                    @Override // io.realm.Realm.Transaction
                    public final void execute(Realm realm) {
                        if (((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().size() >= 3) {
                            ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(2).getJobSector().deleteFromRealm();
                        }
                        Category category = (Category) realm.createObject(Category.class);
                        category.setCode(write.a.getCode());
                        category.setDescription(write.a.getDescription());
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(2).setJobSector(category);
                    }
                });
            }
        } else if (write.d.equals("2131296666")) {
            this.cc276EtHubungan.setText(write.a.getDescription());
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getEmergencyContactRelation() != null) {
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getEmergencyContactRelation().deleteFromRealm();
                    }
                    Category category = (Category) realm.createObject(Category.class);
                    category.setCode(write.a.getCode());
                    category.setDescription(write.a.getDescription());
                    ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.setEmergencyContactRelation(category);
                }
            });
        } else if (write.d.equals("2131296691")) {
            this.cc278EtHubungan.setText(write.a.getDescription());
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.5
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().size() > 0) {
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(0).getRelationship().deleteFromRealm();
                    }
                    Category category = (Category) realm.createObject(Category.class);
                    category.setCode(write.a.getCode());
                    category.setDescription(write.a.getDescription());
                    ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(0).setRelationship(category);
                }
            });
        } else if (write.d.equals("2131296733")) {
            this.cc279EtHubungan.setText(write.a.getDescription());
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().size() >= 2) {
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(1).getRelationship().deleteFromRealm();
                    }
                    Category category = (Category) realm.createObject(Category.class);
                    category.setCode(write.a.getCode());
                    category.setDescription(write.a.getDescription());
                    ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(1).setRelationship(category);
                }
            });
        } else if (write.d.equals("2131296475")) {
            this.cc2710EtHubungan.setText(write.a.getDescription());
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.2
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    if (((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().size() >= 3) {
                        ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(2).getRelationship().deleteFromRealm();
                    }
                    Category category = (Category) realm.createObject(Category.class);
                    category.setCode(write.a.getCode());
                    category.setDescription(write.a.getDescription());
                    ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCreditCardSupplements().get(2).setRelationship(category);
                }
            });
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueFasilitasPerlindungan(agree100JutaTarikan agree100jutatarikan) {
        String str = agree100jutatarikan.a.equals("Ya") ? "Y" : "N";
        this.cc277EtFasilitasPerlindungan.setText(agree100jutatarikan.a);
        this.cc277tilFasilitasPerlindungan.setHintEnabled(true);
        this.c.executeTransaction(new Realm.Transaction(str) { // from class: o.getRepresentativeRelationship
            public final /* synthetic */ String e;

            {
                this.e = r5;
            }

            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                CC27FormKartuKreditFragment cC27FormKartuKreditFragment = CC27FormKartuKreditFragment.this;
                ((CC8FormKartuKreditActivity) cC27FormKartuKreditFragment.getActivity()).n.setFlagAgreeLifeInsurance(this.e);
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.29
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            s();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.30
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.cascadeDelete();
                }
            });
            s();
        }
    }

    @OnClick({2131299701})
    public void onClickUbahDataAlamat(View view) {
        this.tvUbahDataAlamat.setVisibility(8);
        this.llLayoutDataAlamatEditable.setVisibility(0);
        this.llLayoutDataAlamatUneditable.setVisibility(8);
        setTransactionSource settransactionsource = new Runnable() { // from class: o.setTransactionSource
            @Override // java.lang.Runnable
            public final void run() {
                CC27FormKartuKreditFragment cC27FormKartuKreditFragment = CC27FormKartuKreditFragment.this;
                EditText editText = null;
                for (int size = cC27FormKartuKreditFragment.viewListDataAlamat.size() - 1; size >= 0; size--) {
                    editText = editText;
                    if (cC27FormKartuKreditFragment.viewListDataAlamat.get(size).getVisibility() == 0) {
                        editText = editText;
                        if (cC27FormKartuKreditFragment.viewListDataAlamat.get(size).isFocusable()) {
                            editText = editText;
                            if (cC27FormKartuKreditFragment.viewListDataAlamat.get(size).isEnabled()) {
                                editText = (EditText) cC27FormKartuKreditFragment.viewListDataAlamat.get(size);
                            }
                        }
                    }
                }
                if (editText != null) {
                    editText.requestFocus();
                }
            }
        };
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataAlamat.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataAlamat.getVisibility() == 8) {
            this.d.c(this.llLayoutDataAlamat);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataAlamat;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            new Handler().postDelayed(settransactionsource, 300);
            return;
        }
        settransactionsource.run();
    }

    @OnClick({2131299705})
    public void onClickUbahDataDiri(View view) {
        this.tvUbahDataDiri.setVisibility(8);
        this.llLayoutDataDiriEditable.setVisibility(0);
        this.llLayoutDataDiriUneditable.setVisibility(8);
        getRepresentativeIdType getrepresentativeidtype = new Runnable() { // from class: o.getRepresentativeIdType
            @Override // java.lang.Runnable
            public final void run() {
                CC27FormKartuKreditFragment cC27FormKartuKreditFragment = CC27FormKartuKreditFragment.this;
                EditText editText = null;
                for (int size = cC27FormKartuKreditFragment.viewListDataDiri.size() - 1; size >= 0; size--) {
                    editText = editText;
                    if (cC27FormKartuKreditFragment.viewListDataDiri.get(size).getVisibility() == 0) {
                        editText = editText;
                        if (cC27FormKartuKreditFragment.viewListDataDiri.get(size).isFocusable()) {
                            editText = editText;
                            if (cC27FormKartuKreditFragment.viewListDataDiri.get(size).isEnabled()) {
                                editText = (EditText) cC27FormKartuKreditFragment.viewListDataDiri.get(size);
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
        if (this.llLayoutDataDiri.getVisibility() == 8) {
            this.d.c(this.llLayoutDataDiri);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataDiri;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            new Handler().postDelayed(getrepresentativeidtype, 300);
            return;
        }
        getrepresentativeidtype.run();
    }

    @OnClick({2131299706})
    public void onClickUbahDataFasilitas(View view) {
        this.tvUbahDataFasilitas.setVisibility(8);
        this.llLayoutDataFasilitasEditable.setVisibility(0);
        this.llLayoutDataFasilitasUneditable.setVisibility(8);
        setRepresentativeName setrepresentativename = new Runnable() { // from class: o.setRepresentativeName
            @Override // java.lang.Runnable
            public final void run() {
                CC27FormKartuKreditFragment cC27FormKartuKreditFragment = CC27FormKartuKreditFragment.this;
                EditText editText = null;
                for (int size = cC27FormKartuKreditFragment.viewListDataFasilitas.size() - 1; size >= 0; size--) {
                    editText = editText;
                    if (cC27FormKartuKreditFragment.viewListDataFasilitas.get(size).getVisibility() == 0) {
                        editText = editText;
                        if (cC27FormKartuKreditFragment.viewListDataFasilitas.get(size).isFocusable()) {
                            editText = editText;
                            if (cC27FormKartuKreditFragment.viewListDataFasilitas.get(size).isEnabled()) {
                                editText = (EditText) cC27FormKartuKreditFragment.viewListDataFasilitas.get(size);
                            }
                        }
                    }
                }
                if (editText != null) {
                    editText.requestFocus();
                }
            }
        };
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataFasilitas.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataFasilitas.getVisibility() == 8) {
            this.d.c(this.llLayoutDataFasilitas);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataFasilitas;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            new Handler().postDelayed(setrepresentativename, 300);
            return;
        }
        setrepresentativename.run();
    }

    @OnClick({2131299707})
    public void onClickUbahDataKartuTambahan1(View view) {
        this.tvUbahDataKartuTambahan1.setVisibility(8);
        this.llLayoutDataKartuTambahan1Editable.setVisibility(0);
        this.llLayoutDataKartuTambahan1Uneditable.setVisibility(8);
        setRepresentativeIdType setrepresentativeidtype = new Runnable() { // from class: o.setRepresentativeIdType
            @Override // java.lang.Runnable
            public final void run() {
                CC27FormKartuKreditFragment cC27FormKartuKreditFragment = CC27FormKartuKreditFragment.this;
                EditText editText = null;
                for (int size = cC27FormKartuKreditFragment.viewListDataKartuTambahan1.size() - 1; size >= 0; size--) {
                    editText = editText;
                    if (cC27FormKartuKreditFragment.viewListDataKartuTambahan1.get(size).getVisibility() == 0) {
                        editText = editText;
                        if (cC27FormKartuKreditFragment.viewListDataKartuTambahan1.get(size).isFocusable()) {
                            editText = editText;
                            if (cC27FormKartuKreditFragment.viewListDataKartuTambahan1.get(size).isEnabled()) {
                                editText = (EditText) cC27FormKartuKreditFragment.viewListDataKartuTambahan1.get(size);
                            }
                        }
                    }
                }
                if (editText != null) {
                    editText.requestFocus();
                }
            }
        };
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataKartuTambahan1.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataKartuTambahan1.getVisibility() == 8) {
            this.d.c(this.llLayoutDataKartuTambahan1);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataKartuTambahan1;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            new Handler().postDelayed(setrepresentativeidtype, 300);
            return;
        }
        setrepresentativeidtype.run();
    }

    @OnClick({2131299708})
    public void onClickUbahDataKartuTambahan2(View view) {
        this.tvUbahDataKartuTambahan2.setVisibility(8);
        this.llLayoutDataKartuTambahan2Editable.setVisibility(0);
        this.llLayoutDataKartuTambahan2Uneditable.setVisibility(8);
        TxnTellerRequest.TxnDataInput.TxnDataInputWarkat txnDataInputWarkat = new TxnTellerRequest.TxnDataInput.TxnDataInputWarkat(this);
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataKartuTambahan2.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataKartuTambahan2.getVisibility() == 8) {
            this.d.c(this.llLayoutDataKartuTambahan2);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataKartuTambahan2;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            new Handler().postDelayed(txnDataInputWarkat, 300);
            return;
        }
        txnDataInputWarkat.run();
    }

    @OnClick({2131299709})
    public void onClickUbahDataKartuTambahan3(View view) {
        this.tvUbahDataKartuTambahan3.setVisibility(8);
        this.llLayoutDataKartuTambahan3Editable.setVisibility(0);
        this.llLayoutDataKartuTambahan3Uneditable.setVisibility(8);
        setTransactionNotes settransactionnotes = new Runnable() { // from class: o.setTransactionNotes
            @Override // java.lang.Runnable
            public final void run() {
                CC27FormKartuKreditFragment cC27FormKartuKreditFragment = CC27FormKartuKreditFragment.this;
                EditText editText = null;
                for (int size = cC27FormKartuKreditFragment.viewListDataKartuTambahan3.size() - 1; size >= 0; size--) {
                    editText = editText;
                    if (cC27FormKartuKreditFragment.viewListDataKartuTambahan3.get(size).getVisibility() == 0) {
                        editText = editText;
                        if (cC27FormKartuKreditFragment.viewListDataKartuTambahan3.get(size).isFocusable()) {
                            editText = editText;
                            if (cC27FormKartuKreditFragment.viewListDataKartuTambahan3.get(size).isEnabled()) {
                                editText = (EditText) cC27FormKartuKreditFragment.viewListDataKartuTambahan3.get(size);
                            }
                        }
                    }
                }
                if (editText != null) {
                    editText.requestFocus();
                }
            }
        };
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataKartuTambahan3.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataKartuTambahan3.getVisibility() == 8) {
            this.d.c(this.llLayoutDataKartuTambahan3);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataKartuTambahan3;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            new Handler().postDelayed(settransactionnotes, 300);
            return;
        }
        settransactionnotes.run();
    }

    @OnClick({2131299710})
    public void onClickUbahDataKontakDarurat(View view) {
        this.tvUbahDataKontakDarurat.setVisibility(8);
        this.llLayoutDataKontakDaruratEditable.setVisibility(0);
        this.llLayoutDataKontakDaruratUneditable.setVisibility(8);
        setWarkatTime setwarkattime = new Runnable() { // from class: o.setWarkatTime
            @Override // java.lang.Runnable
            public final void run() {
                CC27FormKartuKreditFragment cC27FormKartuKreditFragment = CC27FormKartuKreditFragment.this;
                EditText editText = null;
                for (int size = cC27FormKartuKreditFragment.viewListDataKontakDarurat.size() - 1; size >= 0; size--) {
                    editText = editText;
                    if (cC27FormKartuKreditFragment.viewListDataKontakDarurat.get(size).getVisibility() == 0) {
                        editText = editText;
                        if (cC27FormKartuKreditFragment.viewListDataKontakDarurat.get(size).isFocusable()) {
                            editText = editText;
                            if (cC27FormKartuKreditFragment.viewListDataKontakDarurat.get(size).isEnabled()) {
                                editText = (EditText) cC27FormKartuKreditFragment.viewListDataKontakDarurat.get(size);
                            }
                        }
                    }
                }
                if (editText != null) {
                    editText.requestFocus();
                }
            }
        };
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderKontakDarurat.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataKontakDarurat.getVisibility() == 8) {
            this.d.c(this.llLayoutDataKontakDarurat);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivKontakDarurat;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            new Handler().postDelayed(setwarkattime, 300);
            return;
        }
        setwarkattime.run();
    }

    @OnClick({2131299711})
    public void onClickUbahDataLainnya(View view) {
        this.tvUbahDataLainnya.setVisibility(8);
        this.llLayoutDataLainnyaEditable.setVisibility(0);
        this.llLayoutDataLainnyaUneditable.setVisibility(8);
        getRepresentativeName getrepresentativename = new Runnable() { // from class: o.getRepresentativeName
            @Override // java.lang.Runnable
            public final void run() {
                CC27FormKartuKreditFragment cC27FormKartuKreditFragment = CC27FormKartuKreditFragment.this;
                EditText editText = null;
                for (int size = cC27FormKartuKreditFragment.viewListDataLainnya.size() - 1; size >= 0; size--) {
                    editText = editText;
                    if (cC27FormKartuKreditFragment.viewListDataLainnya.get(size).getVisibility() == 0) {
                        editText = editText;
                        if (cC27FormKartuKreditFragment.viewListDataLainnya.get(size).isFocusable()) {
                            editText = editText;
                            if (cC27FormKartuKreditFragment.viewListDataLainnya.get(size).isEnabled()) {
                                editText = (EditText) cC27FormKartuKreditFragment.viewListDataLainnya.get(size);
                            }
                        }
                    }
                }
                if (editText != null) {
                    editText.requestFocus();
                }
            }
        };
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataLainnya.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataLainnya.getVisibility() == 8) {
            this.d.c(this.llLayoutDataLainnya);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataLainnya;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            new Handler().postDelayed(getrepresentativename, 300);
            return;
        }
        getrepresentativename.run();
    }

    @OnClick({2131299713})
    public void onClickUbahDataPekerjaan(View view) {
        this.tvUbahDataPekerjaan.setVisibility(8);
        this.llLayoutDataPekerjaanEditable.setVisibility(0);
        this.llLayoutDataPekerjaanUneditable.setVisibility(8);
        setRepresentativeIdNumber setrepresentativeidnumber = new Runnable() { // from class: o.setRepresentativeIdNumber
            @Override // java.lang.Runnable
            public final void run() {
                CC27FormKartuKreditFragment cC27FormKartuKreditFragment = CC27FormKartuKreditFragment.this;
                EditText editText = null;
                for (int size = cC27FormKartuKreditFragment.viewListDataPekerjaan.size() - 1; size >= 0; size--) {
                    editText = editText;
                    if (cC27FormKartuKreditFragment.viewListDataPekerjaan.get(size).getVisibility() == 0) {
                        editText = editText;
                        if (cC27FormKartuKreditFragment.viewListDataPekerjaan.get(size).isFocusable()) {
                            editText = editText;
                            if (cC27FormKartuKreditFragment.viewListDataPekerjaan.get(size).isEnabled()) {
                                editText = (EditText) cC27FormKartuKreditFragment.viewListDataPekerjaan.get(size);
                            }
                        }
                    }
                }
                if (editText != null) {
                    editText.requestFocus();
                }
            }
        };
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataPekerjaan.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataPekerjaan.getVisibility() == 8) {
            this.d.c(this.llLayoutDataPekerjaan);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataPekerjaan;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            new Handler().postDelayed(setrepresentativeidnumber, 300);
            return;
        }
        setrepresentativeidnumber.run();
    }

    @OnClick({2131296478, 2131296481, 2131296476, 2131296475, 2131296474, 2131296480})
    public void onClickedUbahCC2710(View view) {
        switch (view.getId()) {
            case 2131296474:
                Bundle bundle = new Bundle();
                bundle.putString("type_category", "businessfield");
                bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).r));
                bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc2710EtBidangUsaha.getText().toString());
                CategoryListDialog categoryListDialog = new CategoryListDialog();
                categoryListDialog.setArguments(bundle);
                categoryListDialog.show(getFragmentManager(), "2131296474");
                return;
            case 2131296475:
                Bundle bundle2 = new Bundle();
                bundle2.putString("type_category", "relationship");
                bundle2.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).w));
                bundle2.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc2710EtHubungan.getText().toString());
                CategoryListDialog categoryListDialog2 = new CategoryListDialog();
                categoryListDialog2.setArguments(bundle2);
                categoryListDialog2.show(getFragmentManager(), "2131296475");
                return;
            case 2131296476:
                SexDilaog sexDilaog = new SexDilaog();
                Bundle bundle3 = new Bundle();
                bundle3.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc2710EtJenisKelamin.getText().toString());
                sexDilaog.setArguments(bundle3);
                sexDilaog.show(getFragmentManager(), "2131296476");
                return;
            case 2131296477:
            case 2131296478:
            case 2131296479:
            default:
                return;
            case 2131296480:
                Bundle bundle4 = new Bundle();
                bundle4.putString("type_category", "occupation");
                bundle4.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).u));
                bundle4.putString("TYPE_OCCUPATION", "pekerjaan");
                bundle4.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc2710EtPekerjaan.getText().toString());
                CategoryListDialog categoryListDialog3 = new CategoryListDialog();
                categoryListDialog3.setArguments(bundle4);
                categoryListDialog3.show(getFragmentManager(), "2131296480");
                return;
            case 2131296481:
                b(2131296481, null, Calendar.getInstance());
                return;
        }
    }

    @OnClick({2131296536, 2131296539, 2131296527, 2131296538, 2131296528})
    public void onClickedUbahCC272(View view) {
        switch (view.getId()) {
            case 2131296527:
                SexDilaog sexDilaog = new SexDilaog();
                Bundle bundle = new Bundle();
                bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc272EtJenisKelamin.getText().toString());
                sexDilaog.setArguments(bundle);
                sexDilaog.show(getFragmentManager(), "2131296527");
                return;
            case 2131296528:
                b(2131296528, null, Calendar.getInstance());
                return;
            case 2131296536:
                Bundle bundle2 = new Bundle();
                bundle2.putString("type_category", "education");
                bundle2.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).q));
                bundle2.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc272EtPendidikanTerakhir.getText().toString());
                CategoryListDialog categoryListDialog = new CategoryListDialog();
                categoryListDialog.setArguments(bundle2);
                categoryListDialog.show(getFragmentManager(), "2131296536");
                return;
            case 2131296538:
                Bundle bundle3 = new Bundle();
                bundle3.putString("type_category", "maritalstatus");
                bundle3.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).v));
                bundle3.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc272EtStatusPerkawinan.getText().toString());
                CategoryListDialog categoryListDialog2 = new CategoryListDialog();
                categoryListDialog2.setArguments(bundle3);
                categoryListDialog2.show(getFragmentManager(), "2131296538");
                return;
            case 2131296539:
                b(2131296539, null, Calendar.getInstance());
                return;
            default:
                return;
        }
    }

    @OnClick({2131296581, 2131296579})
    public void onClickedUbahCC273(View view) {
        String str;
        int id = view.getId();
        if (id == 2131296579) {
            String str2 = "";
            if (!((CC8FormKartuKreditActivity) getActivity()).n.getHmStayPeriod().isEmpty()) {
                str = ((CC8FormKartuKreditActivity) getActivity()).n.getHmStayPeriod().substring(0, 2);
                str2 = ((CC8FormKartuKreditActivity) getActivity()).n.getHmStayPeriod().substring(2, 4);
            } else {
                str = "";
            }
            Bundle bundle = new Bundle();
            bundle.putString("title", getString(2131821825));
            bundle.putString("tahun", str2);
            bundle.putString("bulan", str);
            PilihTahunBulanDialog pilihTahunBulanDialog = new PilihTahunBulanDialog();
            pilihTahunBulanDialog.setArguments(bundle);
            pilihTahunBulanDialog.show(getFragmentManager(), "2131296579");
        } else if (id == 2131296581) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("type_category", "homestatus");
            bundle2.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).y));
            bundle2.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc273EtStatusTempat.getText().toString());
            CategoryListDialog categoryListDialog = new CategoryListDialog();
            categoryListDialog.setArguments(bundle2);
            categoryListDialog.show(getFragmentManager(), "2131296581");
        }
    }

    @OnClick({2131296594, 2131296600})
    public void onClickedUbahCC274(View view) {
        String str;
        int id = view.getId();
        if (id == 2131296594) {
            Bundle bundle = new Bundle();
            bundle.putString("type_category", "businessfield");
            bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).r));
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc274EtBidangUsaha.getText().toString());
            CategoryListDialog categoryListDialog = new CategoryListDialog();
            categoryListDialog.setArguments(bundle);
            categoryListDialog.show(getFragmentManager(), "2131296594");
        } else if (id == 2131296600) {
            String str2 = "";
            if (!((CC8FormKartuKreditActivity) getActivity()).n.getCurrWorkPeriod().isEmpty()) {
                str = ((CC8FormKartuKreditActivity) getActivity()).n.getCurrWorkPeriod().substring(0, 2);
                str2 = ((CC8FormKartuKreditActivity) getActivity()).n.getCurrWorkPeriod().substring(2, 4);
            } else {
                str = "";
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("title", getString(2131821823));
            bundle2.putString("tahun", str2);
            bundle2.putString("bulan", str);
            PilihTahunBulanDialog pilihTahunBulanDialog = new PilihTahunBulanDialog();
            pilihTahunBulanDialog.setArguments(bundle2);
            pilihTahunBulanDialog.show(getFragmentManager(), "2131296600");
        }
    }

    @OnClick({2131296642, 2131296644})
    public void onClickedUbahCC275(View view) {
        String str;
        int id = view.getId();
        if (id == 2131296642) {
            Intent intent = new Intent(getContext(), PilihBankPenerbitActivity.class);
            intent.putExtra("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).s));
            startActivity(intent);
        } else if (id == 2131296644) {
            String str2 = "";
            if (!((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards().get(0).getExpired().isEmpty()) {
                str = ((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards().get(0).getExpired().substring(0, 2);
                str2 = ((CC8FormKartuKreditActivity) getActivity()).n.getCcOtherBankCreditCards().get(0).getExpired().substring(2, 4);
            } else {
                str = "";
            }
            Bundle bundle = new Bundle();
            bundle.putString("title", getString(2131822158));
            bundle.putString("tahun", str2);
            bundle.putString("bulan", str);
            ExpiredDateDialog expiredDateDialog = new ExpiredDateDialog();
            expiredDateDialog.setArguments(bundle);
            expiredDateDialog.show(getFragmentManager(), "2131296644");
        }
    }

    @OnClick({2131296666})
    public void onClickedUbahCC276(View view) {
        if (view.getId() == 2131296666) {
            Bundle bundle = new Bundle();
            bundle.putString("type_category", "relationship");
            bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).w));
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc276EtHubungan.getText().toString());
            CategoryListDialog categoryListDialog = new CategoryListDialog();
            categoryListDialog.setArguments(bundle);
            categoryListDialog.show(getFragmentManager(), "2131296666");
        }
    }

    @OnClick({2131296688})
    public void onClickedUbahCC277(View view) {
        if (view.getId() == 2131296688) {
            Bundle bundle = new Bundle();
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc277EtFasilitasPerlindungan.getText().toString());
            YesNoDialog yesNoDialog = new YesNoDialog();
            yesNoDialog.setArguments(bundle);
            yesNoDialog.show(getFragmentManager(), "YesNoDialog");
        }
    }

    @OnClick({2131296697, 2131296692, 2131296691, 2131296690, 2131296696})
    public void onClickedUbahCC278(View view) {
        switch (view.getId()) {
            case 2131296690:
                Bundle bundle = new Bundle();
                bundle.putString("type_category", "businessfield");
                bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).r));
                bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc278EtBidangUsaha.getText().toString());
                CategoryListDialog categoryListDialog = new CategoryListDialog();
                categoryListDialog.setArguments(bundle);
                categoryListDialog.show(getFragmentManager(), "2131296690");
                return;
            case 2131296691:
                Bundle bundle2 = new Bundle();
                bundle2.putString("type_category", "relationship");
                bundle2.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).w));
                bundle2.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc278EtHubungan.getText().toString());
                CategoryListDialog categoryListDialog2 = new CategoryListDialog();
                categoryListDialog2.setArguments(bundle2);
                categoryListDialog2.show(getFragmentManager(), "2131296691");
                return;
            case 2131296692:
                SexDilaog sexDilaog = new SexDilaog();
                Bundle bundle3 = new Bundle();
                bundle3.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc278EtJenisKelamin.getText().toString());
                sexDilaog.setArguments(bundle3);
                sexDilaog.show(getFragmentManager(), "2131296692");
                return;
            case 2131296693:
            case 2131296694:
            case 2131296695:
            default:
                return;
            case 2131296696:
                Bundle bundle4 = new Bundle();
                bundle4.putString("type_category", "occupation");
                bundle4.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).u));
                bundle4.putString("TYPE_OCCUPATION", "pekerjaan");
                bundle4.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc278EtPekerjaan.getText().toString());
                CategoryListDialog categoryListDialog3 = new CategoryListDialog();
                categoryListDialog3.setArguments(bundle4);
                categoryListDialog3.show(getFragmentManager(), "2131296696");
                return;
            case 2131296697:
                b(2131296697, null, Calendar.getInstance());
                return;
        }
    }

    @OnClick({2131296739, 2131296734, 2131296733, 2131296732, 2131296738})
    public void onClickedUbahCC279(View view) {
        switch (view.getId()) {
            case 2131296732:
                Bundle bundle = new Bundle();
                bundle.putString("type_category", "businessfield");
                bundle.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).r));
                bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc279EtBidangUsaha.getText().toString());
                CategoryListDialog categoryListDialog = new CategoryListDialog();
                categoryListDialog.setArguments(bundle);
                categoryListDialog.show(getFragmentManager(), "2131296732");
                return;
            case 2131296733:
                Bundle bundle2 = new Bundle();
                bundle2.putString("type_category", "relationship");
                bundle2.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).w));
                bundle2.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc279EtHubungan.getText().toString());
                CategoryListDialog categoryListDialog2 = new CategoryListDialog();
                categoryListDialog2.setArguments(bundle2);
                categoryListDialog2.show(getFragmentManager(), "2131296733");
                return;
            case 2131296734:
                SexDilaog sexDilaog = new SexDilaog();
                Bundle bundle3 = new Bundle();
                bundle3.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc279EtJenisKelamin.getText().toString());
                sexDilaog.setArguments(bundle3);
                sexDilaog.show(getFragmentManager(), "2131296734");
                return;
            case 2131296735:
            case 2131296736:
            case 2131296737:
            default:
                return;
            case 2131296738:
                Bundle bundle4 = new Bundle();
                bundle4.putString("type_category", "occupation");
                bundle4.putParcelable("list_data", ListUtil.OneItemImmutableList.e(((CC8FormKartuKreditActivity) getActivity()).u));
                bundle4.putString("TYPE_OCCUPATION", "pekerjaan");
                bundle4.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.cc279EtPekerjaan.getText().toString());
                CategoryListDialog categoryListDialog3 = new CategoryListDialog();
                categoryListDialog3.setArguments(bundle4);
                categoryListDialog3.show(getFragmentManager(), "2131296738");
                return;
            case 2131296739:
                b(2131296739, null, Calendar.getInstance());
                return;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(2131558409, menu);
        onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        documentProvider.b().e(this);
        CheckCCValidApplicantPresenter checkCCValidApplicantPresenter = this.f;
        Call<OpenAccountSuccessActivity<Object>> call = checkCCValidApplicantPresenter.a;
        if (call != null) {
            call.cancel();
        }
        checkCCValidApplicantPresenter.d = null;
        ApplyCCPresenter applyCCPresenter = this.g;
        Call<OpenAccountSuccessActivity<simpanGallery>> call2 = applyCCPresenter.b;
        if (call2 != null) {
            call2.cancel();
        }
        applyCCPresenter.e = null;
    }

    @OnFocusChange({2131296535, 2131296529, 2131296531, 2131296533, 2131296525, 2131296530, 2131296540, 2131296534})
    public void onFocusCc272(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296525:
                    this.cc272tilEmailAddress.setHintEnabled(true);
                    return;
                case 2131296529:
                    this.cc272tilNama.setHintEnabled(true);
                    return;
                case 2131296530:
                    this.cc272tilNamaIbu.setHintEnabled(true);
                    return;
                case 2131296531:
                    this.cc272tilNamaLengkap.setHintEnabled(true);
                    return;
                case 2131296533:
                    this.cc272tilNoHp.setHintEnabled(true);
                    return;
                case 2131296534:
                    this.cc272tilNoKitas.setHintEnabled(true);
                    return;
                case 2131296535:
                    this.cc272tilNoId.setHintEnabled(true);
                    return;
                case 2131296540:
                    this.cc272tilTempatLahir.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296525:
                    if (this.cc272EtEmail.getText().toString().isEmpty()) {
                        this.cc272tilEmailAddress.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296529:
                    if (this.cc272EtNama.getText().toString().isEmpty()) {
                        this.cc272tilNama.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296530:
                    if (this.cc272EtNamaIbu.getText().toString().isEmpty()) {
                        this.cc272tilNamaIbu.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296531:
                    if (this.cc272EtNamaLengkap.getText().toString().isEmpty()) {
                        this.cc272tilNamaLengkap.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296533:
                    if (this.cc272EtNoHP.getText().toString().isEmpty()) {
                        this.cc272tilNoHp.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296534:
                    if (this.cc272EtNoKitas.getText().toString().isEmpty()) {
                        this.cc272tilNoKitas.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296535:
                    if (this.cc272EtNoId.getText().toString().isEmpty()) {
                        this.cc272tilNoId.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296540:
                    if (this.cc272EtTempatLahir.getText().toString().isEmpty()) {
                        this.cc272tilTempatLahir.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @OnFocusChange({2131296478, 2131296479, 2131296477})
    public void onFocuscc2710(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296477:
                    this.cc2710tilLimitKartuTambahan.setHintEnabled(true);
                    this.cc2710EtLimitKartu.setSuffix(" IDR");
                    return;
                case 2131296478:
                    this.cc2710tilNamaLengkap.setHintEnabled(true);
                    return;
                case 2131296479:
                    this.cc2710tilNoHp.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296477:
                    if (this.cc2710EtLimitKartu.getText().toString().isEmpty()) {
                        this.cc2710tilLimitKartuTambahan.setHintEnabled(false);
                        this.cc2710EtLimitKartu.setSuffix("");
                        return;
                    }
                    return;
                case 2131296478:
                    if (this.cc2710EtNamaLengkap.getText().toString().isEmpty()) {
                        this.cc2710tilNamaLengkap.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296479:
                    if (this.cc2710EtNoHP.getText().toString().isEmpty()) {
                        this.cc2710tilNoHp.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @OnFocusChange({2131296576, 2131296578, 2131296577, 2131296580})
    public void onFocuscc273(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296576:
                    this.cc273tilAlamatSaatIni.setHintEnabled(true);
                    return;
                case 2131296577:
                    this.cc273tilKodePos.setHintEnabled(true);
                    return;
                case 2131296578:
                    this.cc273tilKota.setHintEnabled(true);
                    return;
                case 2131296579:
                default:
                    return;
                case 2131296580:
                    this.cc273tilNoTelp.setHintEnabled(true);
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296576:
                    if (this.cc273EtAlamat.getText().toString().isEmpty()) {
                        this.cc273tilAlamatSaatIni.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296577:
                    if (this.cc273EtKodePos.getText().toString().isEmpty()) {
                        this.cc273tilKodePos.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296578:
                    if (this.cc273EtKota.getText().toString().isEmpty()) {
                        this.cc273tilKota.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296579:
                default:
                    return;
                case 2131296580:
                    if (this.cc273EtNoTelp.getText().toString().isEmpty()) {
                        this.cc273tilNoTelp.setHintEnabled(false);
                        return;
                    }
                    return;
            }
        }
    }

    @OnFocusChange({2131296602, 2131296605, 2131296596, 2131296601, 2131296597, 2131296593, 2131296599, 2131296598, 2131296603, 2131296595})
    public void onFocuscc274(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296593:
                    this.cc274tilAlamatKantor.setHintEnabled(true);
                    return;
                case 2131296594:
                case 2131296600:
                case 2131296604:
                default:
                    return;
                case 2131296595:
                    this.cc274tilExt.setHintEnabled(true);
                    return;
                case 2131296596:
                    this.cc274tilJabatan.setHintEnabled(true);
                    return;
                case 2131296597:
                    this.cc274tilJenisUsaha.setHintEnabled(true);
                    return;
                case 2131296598:
                    this.cc274tilKodePos.setHintEnabled(true);
                    return;
                case 2131296599:
                    this.cc274tilKota.setHintEnabled(true);
                    return;
                case 2131296601:
                    this.cc274tilNamaPerusahaan.setHintEnabled(true);
                    return;
                case 2131296602:
                    this.cc274tilNoNpwp.setHintEnabled(true);
                    return;
                case 2131296603:
                    this.cc274tilNoTelp.setHintEnabled(true);
                    return;
                case 2131296605:
                    this.cc274tilPenghasilanPerbulan.setHintEnabled(true);
                    this.cc274EtPenghasilan.setSuffix(" IDR");
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296593:
                    if (this.cc274EtAlamat.getText().toString().isEmpty()) {
                        this.cc274tilAlamatKantor.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296594:
                case 2131296600:
                case 2131296604:
                default:
                    return;
                case 2131296595:
                    if (this.cc274EtExt.getText().toString().isEmpty()) {
                        this.cc274tilExt.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296596:
                    if (this.cc274EtJabatan.getText().toString().isEmpty()) {
                        this.cc274tilJabatan.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296597:
                    if (this.cc274EtJenisUsaha.getText().toString().isEmpty()) {
                        this.cc274tilJenisUsaha.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296598:
                    if (this.cc274EtKodePos.getText().toString().isEmpty()) {
                        this.cc274tilKodePos.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296599:
                    if (this.cc274EtKota.getText().toString().isEmpty()) {
                        this.cc274tilKota.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296601:
                    if (this.cc274EtNamaPerusahaan.getText().toString().isEmpty()) {
                        this.cc274tilNamaPerusahaan.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296602:
                    if (this.cc274EtNoNPWP.getText().toString().isEmpty()) {
                        this.cc274tilNoNpwp.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296603:
                    if (this.cc274EtNoTelp.getText().toString().isEmpty()) {
                        this.cc274tilNoTelp.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296605:
                    if (this.cc274EtPenghasilan.getText().toString().isEmpty()) {
                        this.cc274tilPenghasilanPerbulan.setHintEnabled(false);
                        this.cc274EtPenghasilan.setSuffix("");
                        return;
                    }
                    return;
            }
        }
    }

    @OnFocusChange({2131296641, 2131296639, 2131296638})
    public void onFocuscc275(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296638:
                    this.cc275tilKodeReferal.setHintEnabled(true);
                    return;
                case 2131296639:
                    this.cc275tilKrisflyer.setHintEnabled(true);
                    return;
                case 2131296640:
                default:
                    return;
                case 2131296641:
                    this.cc275tilNoKartuKreditLain.setHintEnabled(true);
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296638:
                    if (this.cc275EtNoReferal.getText().toString().isEmpty()) {
                        this.cc275tilKodeReferal.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296639:
                    if (this.cc275EtKrisFlyer.getText().toString().isEmpty()) {
                        this.cc275tilKrisflyer.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296640:
                default:
                    return;
                case 2131296641:
                    if (this.cc275EtNoKartuKredit.getText().toString().isEmpty()) {
                        this.cc275tilNoKartuKreditLain.setHintEnabled(false);
                        return;
                    }
                    return;
            }
        }
    }

    @OnFocusChange({2131296669, 2131296664, 2131296668, 2131296667, 2131296670, 2131296672, 2131296671, 2131296665})
    public void onFocuscc276(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296664:
                    this.cc276tilAlamat.setHintEnabled(true);
                    return;
                case 2131296665:
                    this.cc276tilExt.setHintEnabled(true);
                    return;
                case 2131296666:
                default:
                    return;
                case 2131296667:
                    this.cc276tilKodePos.setHintEnabled(true);
                    return;
                case 2131296668:
                    this.cc276tilKota.setHintEnabled(true);
                    return;
                case 2131296669:
                    this.cc276tilNamaLengkap.setHintEnabled(true);
                    return;
                case 2131296670:
                    this.cc276tilNoHp.setHintEnabled(true);
                    return;
                case 2131296671:
                    this.cc276tilNoTelpKantor.setHintEnabled(true);
                    return;
                case 2131296672:
                    this.cc276tilNoTelpRumah.setHintEnabled(true);
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296664:
                    if (this.cc276EtAlamat.getText().toString().isEmpty()) {
                        this.cc276tilAlamat.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296665:
                    if (this.cc276EtExt.getText().toString().isEmpty()) {
                        this.cc276tilExt.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296666:
                default:
                    return;
                case 2131296667:
                    if (this.cc276EtKodePos.getText().toString().isEmpty()) {
                        this.cc276tilKodePos.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296668:
                    if (this.cc276EtKota.getText().toString().isEmpty()) {
                        this.cc276tilKota.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296669:
                    if (this.cc276EtNamaLengkap.getText().toString().isEmpty()) {
                        this.cc276tilNamaLengkap.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296670:
                    if (this.cc276EtNoHP.getText().toString().isEmpty()) {
                        this.cc276tilNoHp.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296671:
                    if (this.cc276EtTlpKantor.getText().toString().isEmpty()) {
                        this.cc276tilNoTelpKantor.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296672:
                    if (this.cc276EtTlpRumah.getText().toString().isEmpty()) {
                        this.cc276tilNoTelpRumah.setHintEnabled(false);
                        return;
                    }
                    return;
            }
        }
    }

    @OnFocusChange({2131296694, 2131296695, 2131296693})
    public void onFocuscc278(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296693:
                    this.cc278tilLimitKartuTambahan.setHintEnabled(true);
                    this.cc278EtLimitKartu.setSuffix(" IDR");
                    return;
                case 2131296694:
                    this.cc278tilNamaLengkap.setHintEnabled(true);
                    return;
                case 2131296695:
                    this.cc278tilNoHp.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296693:
                    if (this.cc278EtLimitKartu.getText().toString().isEmpty()) {
                        this.cc278tilLimitKartuTambahan.setHintEnabled(false);
                        this.cc278EtLimitKartu.setSuffix("");
                        return;
                    }
                    return;
                case 2131296694:
                    if (this.cc278EtNamaLengkap.getText().toString().isEmpty()) {
                        this.cc278tilNamaLengkap.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296695:
                    if (this.cc278EtNoHP.getText().toString().isEmpty()) {
                        this.cc278tilNoHp.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @OnFocusChange({2131296736, 2131296737, 2131296735})
    public void onFocuscc279(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296735:
                    this.cc279tilLimitKartuTambahan.setHintEnabled(true);
                    this.cc279EtLimitKartu.setSuffix(" IDR");
                    return;
                case 2131296736:
                    this.cc279tilNamaLengkap.setHintEnabled(true);
                    return;
                case 2131296737:
                    this.cc279tilNoHp.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296735:
                    if (this.cc279EtLimitKartu.getText().toString().isEmpty()) {
                        this.cc279tilLimitKartuTambahan.setHintEnabled(false);
                        this.cc279EtLimitKartu.setSuffix("");
                        return;
                    }
                    return;
                case 2131296736:
                    if (this.cc279EtNamaLengkap.getText().toString().isEmpty()) {
                        this.cc279tilNamaLengkap.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296737:
                    if (this.cc279EtNoHP.getText().toString().isEmpty()) {
                        this.cc279tilNoHp.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        getPromotion.d(getActivity());
        if (menuItem.getItemId() == 16908332) {
            if (!((CC8FormKartuKreditActivity) getActivity()).n.getFlagSubmitSupplement().equals("Y")) {
                e(2131296811, new CC20FormKartuKreditFragment(), "CC20FormKartuKreditFragment");
                return true;
            } else if (((CC8FormKartuKreditActivity) getActivity()).n.getCreditCardSupplements().size() == 1) {
                e(2131296811, new CC26AFormKartuKreditFragment(), "CC26AFormKartuKreditFragment");
                return true;
            } else if (((CC8FormKartuKreditActivity) getActivity()).n.getCreditCardSupplements().size() == 2) {
                e(2131296811, new CC26BFormKartuKreditFragment(), "CC26BFormKartuKreditFragment");
                return true;
            } else if (((CC8FormKartuKreditActivity) getActivity()).n.getCreditCardSupplements().size() != 3) {
                return true;
            } else {
                e(2131296811, new CC26CFormKartuKreditFragment(), "CC26CFormKartuKreditFragment");
                return true;
            }
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            if (((CC8FormKartuKreditActivity) getActivity()).p.isMember()) {
                new SimpanDraftDialog().show(getFragmentManager(), "SimpanDraftDialog");
                return true;
            }
            new YakinKeluarDialog().show(getFragmentManager(), "YakinKeluarDialog");
            return true;
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 == 0) {
            this.u = i + 1;
        } else {
            this.u = i;
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationFailed(List<ValidationError> list) {
        LinearLayout linearLayout;
        EditText editText = null;
        LinearLayout linearLayout2 = null;
        for (ValidationError validationError : list) {
            View view = validationError.getView();
            String message = validationError.getFailedRules().get(0).getMessage(getContext());
            if (this.viewListDataDiri.contains(view)) {
                if (this.llLayoutDataDiri.getVisibility() == 8) {
                    this.a.c(this.llLayoutDataDiri);
                    setMessage setmessage = this.a;
                    ImageView imageView = this.ivDataDiri;
                    setmessage.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                }
                linearLayout = linearLayout2;
                if (linearLayout2 == null) {
                    linearLayout = this.llWrapperDataDiri;
                }
            } else if (this.viewListDataAlamat.contains(view)) {
                if (this.llLayoutDataAlamat.getVisibility() == 8) {
                    this.a.c(this.llLayoutDataAlamat);
                    setMessage setmessage2 = this.a;
                    ImageView imageView2 = this.ivDataAlamat;
                    setmessage2.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    setmessage2.e(imageView2);
                }
                linearLayout = linearLayout2;
                if (linearLayout2 == null) {
                    linearLayout = this.llWrapperDataAlamat;
                }
            } else if (this.viewListDataPekerjaan.contains(view)) {
                if (this.llLayoutDataPekerjaan.getVisibility() == 8) {
                    this.a.c(this.llLayoutDataPekerjaan);
                    setMessage setmessage3 = this.a;
                    ImageView imageView3 = this.ivDataPekerjaan;
                    setmessage3.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    setmessage3.e(imageView3);
                }
                linearLayout = linearLayout2;
                if (linearLayout2 == null) {
                    linearLayout = this.llWrapperDataPekerjaan;
                }
            } else if (this.viewListDataKontakDarurat.contains(view)) {
                if (this.llLayoutDataKontakDarurat.getVisibility() == 8) {
                    this.a.c(this.llLayoutDataKontakDarurat);
                    setMessage setmessage4 = this.a;
                    ImageView imageView4 = this.ivKontakDarurat;
                    setmessage4.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    setmessage4.e(imageView4);
                }
                linearLayout = linearLayout2;
                if (linearLayout2 == null) {
                    linearLayout = this.llWrapperKontakDarurat;
                }
            } else if (this.viewListDataFasilitas.contains(view)) {
                if (this.llLayoutDataFasilitas.getVisibility() == 8) {
                    this.a.c(this.llLayoutDataFasilitas);
                    setMessage setmessage5 = this.a;
                    ImageView imageView5 = this.ivDataFasilitas;
                    setmessage5.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    setmessage5.e(imageView5);
                }
                linearLayout = linearLayout2;
                if (linearLayout2 == null) {
                    linearLayout = this.llWrapperDataFasilitas;
                }
            } else if (this.viewListDataLainnya.contains(view)) {
                if (this.llLayoutDataLainnya.getVisibility() == 8) {
                    this.a.c(this.llLayoutDataLainnya);
                    setMessage setmessage6 = this.a;
                    ImageView imageView6 = this.ivDataLainnya;
                    setmessage6.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    setmessage6.e(imageView6);
                }
                linearLayout = linearLayout2;
                if (linearLayout2 == null) {
                    linearLayout = this.llWrapperDataFasilitas;
                }
            } else if (this.viewListDataKartuTambahan1.contains(view)) {
                if (this.llLayoutDataKartuTambahan1.getVisibility() == 8) {
                    this.a.c(this.llLayoutDataKartuTambahan1);
                    setMessage setmessage7 = this.a;
                    ImageView imageView7 = this.ivDataKartuTambahan1;
                    setmessage7.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    setmessage7.e(imageView7);
                }
                linearLayout = linearLayout2;
                if (linearLayout2 == null) {
                    linearLayout = this.llWrapperDataKartuTambahan1;
                }
            } else if (this.viewListDataKartuTambahan2.contains(view)) {
                if (this.llLayoutDataKartuTambahan2.getVisibility() == 8) {
                    this.a.c(this.llLayoutDataKartuTambahan2);
                    setMessage setmessage8 = this.a;
                    ImageView imageView8 = this.ivDataKartuTambahan2;
                    setmessage8.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    setmessage8.e(imageView8);
                }
                linearLayout = linearLayout2;
                if (linearLayout2 == null) {
                    linearLayout = this.llWrapperDataKartuTambahan2;
                }
            } else {
                linearLayout = linearLayout2;
                if (this.viewListDataKartuTambahan3.contains(view)) {
                    if (this.llLayoutDataKartuTambahan3.getVisibility() == 8) {
                        this.a.c(this.llLayoutDataKartuTambahan3);
                        setMessage setmessage9 = this.a;
                        ImageView imageView9 = this.ivDataKartuTambahan3;
                        setmessage9.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                        setmessage9.e(imageView9);
                    }
                    linearLayout = linearLayout2;
                    if (linearLayout2 == null) {
                        linearLayout = this.llWrapperDataKartuTambahan3;
                    }
                }
            }
            if ((view instanceof EditText) || (view instanceof getCardCode)) {
                EditText editText2 = editText;
                if (editText == null) {
                    editText2 = (EditText) view;
                }
                switch (view.getId()) {
                    case 2131296477:
                        this.errorListDataKartuTambahan3.get(7).setVisibility(0);
                        this.errorListDataKartuTambahan3.get(7).setText(message);
                        this.tilListDataKartuTambahan3.get(7).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296478:
                        this.errorListDataKartuTambahan3.get(0).setVisibility(0);
                        this.errorListDataKartuTambahan3.get(0).setText(message);
                        this.tilListDataKartuTambahan3.get(0).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296479:
                        this.errorListDataKartuTambahan3.get(4).setVisibility(0);
                        this.errorListDataKartuTambahan3.get(4).setText(message);
                        this.tilListDataKartuTambahan3.get(4).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296481:
                        this.errorListDataKartuTambahan3.get(1).setVisibility(0);
                        this.errorListDataKartuTambahan3.get(1).setText(message);
                        this.tilListDataKartuTambahan3.get(1).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296525:
                        this.errorListDataDiri.get(4).setVisibility(0);
                        this.errorListDataDiri.get(4).setText(message);
                        this.tilListDataDiri.get(4).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296529:
                        this.errorListDataDiri.get(1).setVisibility(0);
                        this.errorListDataDiri.get(1).setText(message);
                        this.tilListDataDiri.get(1).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296530:
                        this.errorListDataDiri.get(5).setVisibility(0);
                        this.errorListDataDiri.get(5).setText(message);
                        this.tilListDataDiri.get(5).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296531:
                        this.errorListDataDiri.get(2).setVisibility(0);
                        if (((CC8FormKartuKreditActivity) getActivity()).n.getIdentityCardType().equals("KTP")) {
                            TextView textView = this.errorListDataDiri.get(2);
                            StringBuilder sb = new StringBuilder();
                            sb.append(getString(2131821933));
                            sb.append(" belum diisi");
                            textView.setText(sb.toString());
                        } else {
                            TextView textView2 = this.errorListDataDiri.get(2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(getString(2131821925));
                            sb2.append(" belum diisi");
                            textView2.setText(sb2.toString());
                        }
                        this.tilListDataDiri.get(2).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296532:
                        this.errorListDataDiri.get(11).setVisibility(0);
                        this.errorListDataDiri.get(11).setText(message);
                        this.tilListDataDiri.get(11).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296533:
                        this.errorListDataDiri.get(3).setVisibility(0);
                        this.errorListDataDiri.get(3).setText(message);
                        this.tilListDataDiri.get(3).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296534:
                        this.errorListDataDiri.get(12).setVisibility(0);
                        this.errorListDataDiri.get(12).setText(message);
                        this.tilListDataDiri.get(12).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296535:
                        this.errorListDataDiri.get(0).setVisibility(0);
                        this.errorListDataDiri.get(0).setText(message);
                        this.tilListDataDiri.get(0).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296536:
                        this.errorListDataDiri.get(6).setVisibility(0);
                        this.errorListDataDiri.get(6).setText(message);
                        this.tilListDataDiri.get(6).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296539:
                        this.errorListDataDiri.get(8).setVisibility(0);
                        this.errorListDataDiri.get(8).setText(message);
                        this.tilListDataDiri.get(8).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296540:
                        this.errorListDataDiri.get(7).setVisibility(0);
                        this.errorListDataDiri.get(7).setText(message);
                        this.tilListDataDiri.get(7).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296576:
                        this.errorListDataAlamat.get(1).setVisibility(0);
                        this.errorListDataAlamat.get(1).setText(message);
                        this.tilListDataAlamat.get(1).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296577:
                        this.errorListDataAlamat.get(3).setVisibility(0);
                        this.errorListDataAlamat.get(3).setText(message);
                        this.tilListDataAlamat.get(3).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296578:
                        this.errorListDataAlamat.get(2).setVisibility(0);
                        this.errorListDataAlamat.get(2).setText(message);
                        this.tilListDataAlamat.get(2).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296593:
                        this.errorListDataPekerjaan.get(6).setVisibility(0);
                        if (((CC8FormKartuKreditActivity) getActivity()).n.getOfficePosition().getDescription().contains("Wiraswasta")) {
                            TextView textView3 = this.errorListDataPekerjaan.get(6);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(getString(2131821063));
                            sb3.append(" belum diisi");
                            textView3.setText(sb3.toString());
                        } else {
                            TextView textView4 = this.errorListDataPekerjaan.get(6);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(getString(2131821050));
                            sb4.append(" belum diisi");
                            textView4.setText(sb4.toString());
                        }
                        this.tilListDataPekerjaan.get(6).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296596:
                        this.errorListDataPekerjaan.get(2).setVisibility(0);
                        this.errorListDataPekerjaan.get(2).setText(message);
                        this.tilListDataPekerjaan.get(2).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296597:
                        this.errorListDataPekerjaan.get(5).setVisibility(0);
                        this.errorListDataPekerjaan.get(5).setText(message);
                        this.tilListDataPekerjaan.get(5).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296598:
                        this.errorListDataPekerjaan.get(8).setVisibility(0);
                        this.errorListDataPekerjaan.get(8).setText(message);
                        this.tilListDataPekerjaan.get(8).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296599:
                        this.errorListDataPekerjaan.get(7).setVisibility(0);
                        this.errorListDataPekerjaan.get(7).setText(message);
                        this.tilListDataPekerjaan.get(7).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296601:
                        this.errorListDataPekerjaan.get(3).setVisibility(0);
                        this.errorListDataPekerjaan.get(3).setText(message);
                        this.tilListDataPekerjaan.get(3).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296602:
                        this.errorListDataPekerjaan.get(0).setVisibility(0);
                        this.errorListDataPekerjaan.get(0).setText(message);
                        this.tilListDataPekerjaan.get(0).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296603:
                        this.errorListDataPekerjaan.get(10).setVisibility(0);
                        this.errorListDataPekerjaan.get(10).setText(message);
                        this.tilListDataPekerjaan.get(10).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296605:
                        this.errorListDataPekerjaan.get(1).setVisibility(0);
                        this.errorListDataPekerjaan.get(1).setText(message);
                        this.tilListDataPekerjaan.get(1).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296638:
                        this.errorListDataLainnya.get(4).setVisibility(0);
                        this.errorListDataLainnya.get(4).setText(message);
                        this.tilListDataLainnya.get(4).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296639:
                        this.errorListDataLainnya.get(3).setVisibility(0);
                        this.errorListDataLainnya.get(3).setText(message);
                        this.tilListDataLainnya.get(3).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296641:
                        this.errorListDataLainnya.get(1).setVisibility(0);
                        this.errorListDataLainnya.get(1).setText(message);
                        this.tilListDataLainnya.get(1).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296664:
                        this.errorListDataKontakDarurat.get(2).setVisibility(0);
                        this.errorListDataKontakDarurat.get(2).setText(message);
                        this.tilListDataKontakDarurat.get(2).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296667:
                        this.errorListDataKontakDarurat.get(4).setVisibility(0);
                        this.errorListDataKontakDarurat.get(4).setText(message);
                        this.tilListDataKontakDarurat.get(4).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296668:
                        this.errorListDataKontakDarurat.get(3).setVisibility(0);
                        this.errorListDataKontakDarurat.get(3).setText(message);
                        this.tilListDataKontakDarurat.get(3).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296669:
                        this.errorListDataKontakDarurat.get(0).setVisibility(0);
                        this.errorListDataKontakDarurat.get(0).setText(message);
                        this.tilListDataKontakDarurat.get(0).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296670:
                        this.errorListDataKontakDarurat.get(5).setVisibility(0);
                        this.errorListDataKontakDarurat.get(5).setText(message);
                        this.tilListDataKontakDarurat.get(5).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296693:
                        this.errorListDataKartuTambahan1.get(7).setVisibility(0);
                        this.errorListDataKartuTambahan1.get(7).setText(message);
                        this.tilListDataKartuTambahan1.get(7).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296694:
                        this.errorListDataKartuTambahan1.get(0).setVisibility(0);
                        this.errorListDataKartuTambahan1.get(0).setText(message);
                        this.tilListDataKartuTambahan1.get(0).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296695:
                        this.errorListDataKartuTambahan1.get(4).setVisibility(0);
                        this.errorListDataKartuTambahan1.get(4).setText(message);
                        this.tilListDataKartuTambahan1.get(4).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296697:
                        this.errorListDataKartuTambahan1.get(1).setVisibility(0);
                        this.errorListDataKartuTambahan1.get(1).setText(message);
                        this.tilListDataKartuTambahan1.get(1).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296735:
                        this.errorListDataKartuTambahan2.get(7).setVisibility(0);
                        this.errorListDataKartuTambahan2.get(7).setText(message);
                        this.tilListDataKartuTambahan2.get(7).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296736:
                        this.errorListDataKartuTambahan2.get(0).setVisibility(0);
                        this.errorListDataKartuTambahan2.get(0).setText(message);
                        this.tilListDataKartuTambahan2.get(0).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296737:
                        this.errorListDataKartuTambahan2.get(4).setVisibility(0);
                        this.errorListDataKartuTambahan2.get(4).setText(message);
                        this.tilListDataKartuTambahan2.get(4).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    case 2131296739:
                        this.errorListDataKartuTambahan2.get(1).setVisibility(0);
                        this.errorListDataKartuTambahan2.get(1).setText(message);
                        this.tilListDataKartuTambahan2.get(1).setBackgroundResource(2131230870);
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                    default:
                        editText = editText2;
                        linearLayout2 = linearLayout;
                        continue;
                }
            } else if (view instanceof CheckBox) {
                this.cbxAgree.setBackgroundDrawable(copyWindowDataInto.b(getContext(), 2131231323));
                this.tvTermCondition.setTextColor(copyWindowDataInto.a(getContext(), 2131099826));
                linearLayout2 = linearLayout;
            } else {
                b(this.svMain, message);
                linearLayout2 = linearLayout;
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        documentProvider.b().d(new onClickUbahDataOrangDatangKeCabang());
        String str = "KTP";
        if (!((CC8FormKartuKreditActivity) getActivity()).n.getIdentityCardType().equals("KTP")) {
            str = ((CC8FormKartuKreditActivity) getActivity()).n.getIdentityCardType().equals("Paspor") ? "PASSPORT" : "";
        }
        this.f.b(new FotoActivity_ViewBinding(this.cc272EtNoId.getText().toString(), str));
    }

    @OnClick({2131296440})
    public void proses(View view) {
        getPromotion.d(getActivity());
        for (TextView textView : this.errorListDataDiri) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilListDataDiri) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        for (TextView textView2 : this.errorListDataAlamat) {
            textView2.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding2 : this.tilListDataAlamat) {
            logoutDialog_ViewBinding2.setBackgroundResource(2131230847);
        }
        for (TextView textView3 : this.errorListDataPekerjaan) {
            textView3.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding3 : this.tilListDataPekerjaan) {
            logoutDialog_ViewBinding3.setBackgroundResource(2131230847);
        }
        for (TextView textView4 : this.errorListDataKontakDarurat) {
            textView4.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding4 : this.tilListDataKontakDarurat) {
            logoutDialog_ViewBinding4.setBackgroundResource(2131230847);
        }
        for (TextView textView5 : this.errorListDataLainnya) {
            textView5.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding5 : this.tilListDataLainnya) {
            logoutDialog_ViewBinding5.setBackgroundResource(2131230847);
        }
        for (TextView textView6 : this.errorListDataKartuTambahan1) {
            textView6.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding6 : this.tilListDataKartuTambahan1) {
            logoutDialog_ViewBinding6.setBackgroundResource(2131230847);
        }
        for (TextView textView7 : this.errorListDataKartuTambahan2) {
            textView7.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding7 : this.tilListDataKartuTambahan2) {
            logoutDialog_ViewBinding7.setBackgroundResource(2131230847);
        }
        for (TextView textView8 : this.errorListDataKartuTambahan3) {
            textView8.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding8 : this.tilListDataKartuTambahan3) {
            logoutDialog_ViewBinding8.setBackgroundResource(2131230847);
        }
        this.y.validate();
    }

    @OnClick({2131298891, 2131297330})
    public void showDataAlamat(View view) {
        this.f38o = true;
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataAlamat.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataAlamat.getVisibility() == 8) {
            this.d.c(this.llLayoutDataAlamat);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataAlamat;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            return;
        }
        setMessage setmessage2 = this.d;
        LinearLayout linearLayout = this.llLayoutDataAlamat;
        setmessage2.a = linearLayout.getMeasuredHeight();
        setmessage2.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: IPUT  
              (wrap: o.setMessage$1 : 0x0071: CONSTRUCTOR  (r1v5 o.setMessage$1 A[REMOVE]) = (r0v10 'setmessage2' o.setMessage), (r0v12 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v10 'setmessage2' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataAlamat(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC27FormKartuKreditFragment.class
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
            r1 = 1
            r0.f38o = r1
            r0 = r10
            android.widget.LinearLayout r0 = r0.llHeaderDataAlamat
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setCrossFadeEnabled(r1)
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataAlamat
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0058
            r0 = r10
            o.setMessage r0 = r0.d
            r1 = r10
            android.widget.LinearLayout r1 = r1.llLayoutDataAlamat
            r0.c(r1)
            r0 = r10
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataAlamat
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
        L_0x0058:
            r0 = r10
            o.setMessage r0 = r0.d
            r13 = r0
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataAlamat
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
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataAlamat
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataAlamat(android.view.View):void");
    }

    @OnClick({2131298877, 2131297326})
    public void showDataCCPilihan(View view) {
        this.m = true;
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderCCPilihan.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutCCPilihan.getVisibility() == 8) {
            this.d.c(this.llLayoutCCPilihan);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivCCPilihan;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            return;
        }
        setMessage setmessage2 = this.d;
        LinearLayout linearLayout = this.llLayoutCCPilihan;
        setmessage2.a = linearLayout.getMeasuredHeight();
        setmessage2.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: IPUT  
              (wrap: o.setMessage$1 : 0x0071: CONSTRUCTOR  (r1v5 o.setMessage$1 A[REMOVE]) = (r0v10 'setmessage2' o.setMessage), (r0v12 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v10 'setmessage2' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataCCPilihan(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC27FormKartuKreditFragment.class
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
            r1 = 1
            r0.m = r1
            r0 = r10
            android.widget.LinearLayout r0 = r0.llHeaderCCPilihan
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setCrossFadeEnabled(r1)
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutCCPilihan
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0058
            r0 = r10
            o.setMessage r0 = r0.d
            r1 = r10
            android.widget.LinearLayout r1 = r1.llLayoutCCPilihan
            r0.c(r1)
            r0 = r10
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivCCPilihan
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
        L_0x0058:
            r0 = r10
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutCCPilihan
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
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivCCPilihan
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataCCPilihan(android.view.View):void");
    }

    @OnClick({2131298895, 2131297334})
    public void showDataDiri(View view) {
        this.k = true;
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderCCPilihan.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataDiri.getVisibility() == 8) {
            this.d.c(this.llLayoutDataDiri);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataDiri;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            return;
        }
        setMessage setmessage2 = this.d;
        LinearLayout linearLayout = this.llLayoutDataDiri;
        setmessage2.a = linearLayout.getMeasuredHeight();
        setmessage2.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: IPUT  
              (wrap: o.setMessage$1 : 0x0071: CONSTRUCTOR  (r1v5 o.setMessage$1 A[REMOVE]) = (r0v10 'setmessage2' o.setMessage), (r0v12 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v10 'setmessage2' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataDiri(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC27FormKartuKreditFragment.class
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
            r1 = 1
            r0.k = r1
            r0 = r10
            android.widget.LinearLayout r0 = r0.llHeaderCCPilihan
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setCrossFadeEnabled(r1)
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataDiri
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0058
            r0 = r10
            o.setMessage r0 = r0.d
            r1 = r10
            android.widget.LinearLayout r1 = r1.llLayoutDataDiri
            r0.c(r1)
            r0 = r10
            o.setMessage r0 = r0.d
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
        L_0x0058:
            r0 = r10
            o.setMessage r0 = r0.d
            r13 = r0
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataDiri
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
            o.setMessage r0 = r0.d
            r13 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataDiri
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataDiri(android.view.View):void");
    }

    @OnClick({2131298896, 2131297335})
    public void showDataFasilitas(View view) {
        this.n = true;
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataFasilitas.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataFasilitas.getVisibility() == 8) {
            this.d.c(this.llLayoutDataFasilitas);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataFasilitas;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            return;
        }
        setMessage setmessage2 = this.d;
        LinearLayout linearLayout = this.llLayoutDataFasilitas;
        setmessage2.a = linearLayout.getMeasuredHeight();
        setmessage2.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: IPUT  
              (wrap: o.setMessage$1 : 0x0071: CONSTRUCTOR  (r1v5 o.setMessage$1 A[REMOVE]) = (r0v10 'setmessage2' o.setMessage), (r0v12 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v10 'setmessage2' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataFasilitas(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC27FormKartuKreditFragment.class
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
            r1 = 1
            r0.n = r1
            r0 = r10
            android.widget.LinearLayout r0 = r0.llHeaderDataFasilitas
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setCrossFadeEnabled(r1)
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataFasilitas
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0058
            r0 = r10
            o.setMessage r0 = r0.d
            r1 = r10
            android.widget.LinearLayout r1 = r1.llLayoutDataFasilitas
            r0.c(r1)
            r0 = r10
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataFasilitas
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
        L_0x0058:
            r0 = r10
            o.setMessage r0 = r0.d
            r13 = r0
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataFasilitas
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
            o.setMessage r0 = r0.d
            r13 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataFasilitas
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataFasilitas(android.view.View):void");
    }

    @OnClick({2131298897, 2131297336})
    public void showDataKartuTambahan1(View view) {
        this.l = true;
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataKartuTambahan1.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataKartuTambahan1.getVisibility() == 8) {
            this.d.c(this.llLayoutDataKartuTambahan1);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataKartuTambahan1;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            return;
        }
        setMessage setmessage2 = this.d;
        LinearLayout linearLayout = this.llLayoutDataKartuTambahan1;
        setmessage2.a = linearLayout.getMeasuredHeight();
        setmessage2.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: IPUT  
              (wrap: o.setMessage$1 : 0x0071: CONSTRUCTOR  (r1v5 o.setMessage$1 A[REMOVE]) = (r0v10 'setmessage2' o.setMessage), (r0v12 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v10 'setmessage2' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataKartuTambahan1(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC27FormKartuKreditFragment.class
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
            r1 = 1
            r0.l = r1
            r0 = r10
            android.widget.LinearLayout r0 = r0.llHeaderDataKartuTambahan1
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setCrossFadeEnabled(r1)
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataKartuTambahan1
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0058
            r0 = r10
            o.setMessage r0 = r0.d
            r1 = r10
            android.widget.LinearLayout r1 = r1.llLayoutDataKartuTambahan1
            r0.c(r1)
            r0 = r10
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataKartuTambahan1
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
        L_0x0058:
            r0 = r10
            o.setMessage r0 = r0.d
            r13 = r0
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataKartuTambahan1
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
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataKartuTambahan1
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataKartuTambahan1(android.view.View):void");
    }

    @OnClick({2131298898, 2131297337})
    public void showDataKartuTambahan2(View view) {
        this.q = true;
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataKartuTambahan2.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataKartuTambahan2.getVisibility() == 8) {
            this.d.c(this.llLayoutDataKartuTambahan2);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataKartuTambahan2;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            return;
        }
        setMessage setmessage2 = this.d;
        LinearLayout linearLayout = this.llLayoutDataKartuTambahan2;
        setmessage2.a = linearLayout.getMeasuredHeight();
        setmessage2.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: IPUT  
              (wrap: o.setMessage$1 : 0x0071: CONSTRUCTOR  (r1v5 o.setMessage$1 A[REMOVE]) = (r0v10 'setmessage2' o.setMessage), (r0v12 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v10 'setmessage2' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataKartuTambahan2(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC27FormKartuKreditFragment.class
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
            r1 = 1
            r0.q = r1
            r0 = r10
            android.widget.LinearLayout r0 = r0.llHeaderDataKartuTambahan2
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setCrossFadeEnabled(r1)
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataKartuTambahan2
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0058
            r0 = r10
            o.setMessage r0 = r0.d
            r1 = r10
            android.widget.LinearLayout r1 = r1.llLayoutDataKartuTambahan2
            r0.c(r1)
            r0 = r10
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataKartuTambahan2
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
        L_0x0058:
            r0 = r10
            o.setMessage r0 = r0.d
            r13 = r0
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataKartuTambahan2
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
            o.setMessage r0 = r0.d
            r13 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataKartuTambahan2
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataKartuTambahan2(android.view.View):void");
    }

    @OnClick({2131298899, 2131297338})
    public void showDataKartuTambahan3(View view) {
        this.p = true;
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataKartuTambahan3.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataKartuTambahan3.getVisibility() == 8) {
            this.d.c(this.llLayoutDataKartuTambahan3);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataKartuTambahan3;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            return;
        }
        setMessage setmessage2 = this.d;
        LinearLayout linearLayout = this.llLayoutDataKartuTambahan3;
        setmessage2.a = linearLayout.getMeasuredHeight();
        setmessage2.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: IPUT  
              (wrap: o.setMessage$1 : 0x0071: CONSTRUCTOR  (r1v5 o.setMessage$1 A[REMOVE]) = (r0v10 'setmessage2' o.setMessage), (r0v12 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v10 'setmessage2' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataKartuTambahan3(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC27FormKartuKreditFragment.class
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
            r1 = 1
            r0.p = r1
            r0 = r10
            android.widget.LinearLayout r0 = r0.llHeaderDataKartuTambahan3
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setCrossFadeEnabled(r1)
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataKartuTambahan3
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0058
            r0 = r10
            o.setMessage r0 = r0.d
            r1 = r10
            android.widget.LinearLayout r1 = r1.llLayoutDataKartuTambahan3
            r0.c(r1)
            r0 = r10
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataKartuTambahan3
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
        L_0x0058:
            r0 = r10
            o.setMessage r0 = r0.d
            r13 = r0
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataKartuTambahan3
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
            o.setMessage r0 = r0.d
            r13 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataKartuTambahan3
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataKartuTambahan3(android.view.View):void");
    }

    @OnClick({2131298900, 2131297339})
    public void showDataKontakDarurat(View view) {
        this.r = true;
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderKontakDarurat.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataKontakDarurat.getVisibility() == 8) {
            this.d.c(this.llLayoutDataKontakDarurat);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivKontakDarurat;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            return;
        }
        setMessage setmessage2 = this.d;
        LinearLayout linearLayout = this.llLayoutDataKontakDarurat;
        setmessage2.a = linearLayout.getMeasuredHeight();
        setmessage2.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: IPUT  
              (wrap: o.setMessage$1 : 0x0071: CONSTRUCTOR  (r1v5 o.setMessage$1 A[REMOVE]) = (r0v10 'setmessage2' o.setMessage), (r0v12 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v10 'setmessage2' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataKontakDarurat(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC27FormKartuKreditFragment.class
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
            r1 = 1
            r0.r = r1
            r0 = r10
            android.widget.LinearLayout r0 = r0.llHeaderKontakDarurat
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setCrossFadeEnabled(r1)
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataKontakDarurat
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0058
            r0 = r10
            o.setMessage r0 = r0.d
            r1 = r10
            android.widget.LinearLayout r1 = r1.llLayoutDataKontakDarurat
            r0.c(r1)
            r0 = r10
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivKontakDarurat
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
        L_0x0058:
            r0 = r10
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataKontakDarurat
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
            o.setMessage r0 = r0.d
            r13 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivKontakDarurat
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataKontakDarurat(android.view.View):void");
    }

    @OnClick({2131298901, 2131297340})
    public void showDataLainnya(View view) {
        this.t = true;
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataLainnya.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataLainnya.getVisibility() == 8) {
            this.d.c(this.llLayoutDataLainnya);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataLainnya;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            return;
        }
        setMessage setmessage2 = this.d;
        LinearLayout linearLayout = this.llLayoutDataLainnya;
        setmessage2.a = linearLayout.getMeasuredHeight();
        setmessage2.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: IPUT  
              (wrap: o.setMessage$1 : 0x0071: CONSTRUCTOR  (r1v5 o.setMessage$1 A[REMOVE]) = (r0v10 'setmessage2' o.setMessage), (r0v12 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v10 'setmessage2' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataLainnya(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC27FormKartuKreditFragment.class
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
            r1 = 1
            r0.t = r1
            r0 = r10
            android.widget.LinearLayout r0 = r0.llHeaderDataLainnya
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setCrossFadeEnabled(r1)
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataLainnya
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0058
            r0 = r10
            o.setMessage r0 = r0.d
            r1 = r10
            android.widget.LinearLayout r1 = r1.llLayoutDataLainnya
            r0.c(r1)
            r0 = r10
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataLainnya
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
        L_0x0058:
            r0 = r10
            o.setMessage r0 = r0.d
            r13 = r0
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataLainnya
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
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataLainnya
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataLainnya(android.view.View):void");
    }

    @OnClick({2131298903, 2131297343})
    public void showDataPekerjaan(View view) {
        this.s = true;
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataPekerjaan.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutDataPekerjaan.getVisibility() == 8) {
            this.d.c(this.llLayoutDataPekerjaan);
            setMessage setmessage = this.d;
            ImageView imageView = this.ivDataPekerjaan;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            return;
        }
        setMessage setmessage2 = this.d;
        LinearLayout linearLayout = this.llLayoutDataPekerjaan;
        setmessage2.a = linearLayout.getMeasuredHeight();
        setmessage2.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0074: IPUT  
              (wrap: o.setMessage$1 : 0x0071: CONSTRUCTOR  (r1v5 o.setMessage$1 A[REMOVE]) = (r0v10 'setmessage2' o.setMessage), (r0v12 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v10 'setmessage2' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataPekerjaan(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/CC27FormKartuKreditFragment.class
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
            r1 = 1
            r0.s = r1
            r0 = r10
            android.widget.LinearLayout r0 = r0.llHeaderDataPekerjaan
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setCrossFadeEnabled(r1)
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataPekerjaan
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0058
            r0 = r10
            o.setMessage r0 = r0.d
            r1 = r10
            android.widget.LinearLayout r1 = r1.llLayoutDataPekerjaan
            r0.c(r1)
            r0 = r10
            o.setMessage r0 = r0.d
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
        L_0x0058:
            r0 = r10
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutDataPekerjaan
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
            o.setMessage r0 = r0.d
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivDataPekerjaan
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.showDataPekerjaan(android.view.View):void");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribePilihBulanTahun(final AgamaAdapter$AgamaVH_ViewBinding agamaAdapter$AgamaVH_ViewBinding) {
        if (agamaAdapter$AgamaVH_ViewBinding.c.equals("2131296579")) {
            a(this.cc273EtLamaMenempati, agamaAdapter$AgamaVH_ViewBinding);
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.12
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CreditCard creditCard = ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n;
                    StringBuilder sb = new StringBuilder();
                    sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.b), 2, "0"));
                    sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.e), 2, "0"));
                    creditCard.setHmStayPeriod(sb.toString());
                }
            });
        } else if (agamaAdapter$AgamaVH_ViewBinding.c.equals("2131296600")) {
            a(this.cc274EtLamaBekerja, agamaAdapter$AgamaVH_ViewBinding);
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.17
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CreditCard creditCard = ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n;
                    StringBuilder sb = new StringBuilder();
                    sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.b), 2, "0"));
                    sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.e), 2, "0"));
                    creditCard.setCurrWorkPeriod(sb.toString());
                }
            });
        } else if (agamaAdapter$AgamaVH_ViewBinding.c.equals("2131296644")) {
            this.cc275EtTanggalExpired.setText(getString(2131822365, getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.b), 2, "0"), getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.e).substring(2, 4), 2, "0")));
            this.cc275tilTanggalExpired.setHintEnabled(true);
            this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.CC27FormKartuKreditFragment.18
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    CCOtherBankCreditCard cCOtherBankCreditCard = ((CC8FormKartuKreditActivity) CC27FormKartuKreditFragment.this.getActivity()).n.getCcOtherBankCreditCards().get(0);
                    StringBuilder sb = new StringBuilder();
                    sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.b), 2, "0"));
                    sb.append(getPromotion.a(String.valueOf(agamaAdapter$AgamaVH_ViewBinding.e).substring(2, 4), 2, "0"));
                    cCOtherBankCreditCard.setExpired(sb.toString());
                }
            });
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeSexEvent(onClickPilih onclickpilih) {
        if (onclickpilih.a.equals("2131296527")) {
            this.cc272EtJenisKelamin.setText(onclickpilih.b);
        } else if (onclickpilih.a.equals("2131296692")) {
            this.cc278EtJenisKelamin.setText(onclickpilih.b);
        } else if (onclickpilih.a.equals("2131296734")) {
            this.cc279EtJenisKelamin.setText(onclickpilih.b);
        } else if (onclickpilih.a.equals("2131296476")) {
            this.cc2710EtJenisKelamin.setText(onclickpilih.b);
        }
    }
}
