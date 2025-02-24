package com.bca.smartbranch.fragment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindArray;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.FormTellerActivity;
import com.bca.smartbranch.data.global.DaftarTransfer;
import com.bca.smartbranch.dialog.AskOrangDatangKeCabangDialog;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.HariDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.PilihJenisIdentitasDialog;
import com.bca.smartbranch.dialog.PilihJenisIdentitasPemilikSumberDanaDialog;
import com.bca.smartbranch.dialog.SetiapTanggalDialog;
import com.bca.smartbranch.dialog.SumberDanaDialog;
import com.bca.smartbranch.dialog.TermConditionDialog;
import com.bca.smartbranch.dialog.TujuanTransaksiDialog;
import com.bca.smartbranch.fragment.ReviewSetoranFragment;
import com.bca.smartbranch.presenter.CheckDaftarTransferPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.QuickRule;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Checked;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import io.realm.CollectionUtils;
import io.realm.Realm;
import java.util.Calendar;
import java.util.List;
import o.ActivateEChannelResponse;
import o.ActivateEChannelResponse$Description$$Parcelable;
import o.ActivateEChannelResponse$TxnDataOutput$$Parcelable;
import o.ConfirmSubBCACardAdapter$ViewHolder;
import o.DetailTundaEChannelActivity;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OR2PilihProductFragment_ViewBinding;
import o.ReservasiCSOActivity;
import o.ReservasiTellerOActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.SyaratKetentuanActivity;
import o.clickOrangSamaDenganPemilik;
import o.copyWindowDataInto;
import o.documentProvider;
import o.getAbanoCode;
import o.getAnnualFeeAddOnDisplayAmount;
import o.getAnnualFeeBasicAmount;
import o.getCardImageOrientation;
import o.getPromotion;
import o.getText;
import o.goChangePIN;
import o.lewati;
import o.onExitTransaction;
import o.onRetry;
import o.register;
import o.setMessage;
import o.showInfoValueTodayOR;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/ReviewSetoranFragment.class */
public class ReviewSetoranFragment extends BaseFragment implements Validator.ValidationListener, showInfoValueTodayOR.MediaBrowserCompat.CustomActionResultReceiver, TextWatcher, AdapterView.OnItemClickListener, CheckDaftarTransferPresenter.read {
    private DetailTundaEChannelActivity a;
    @BindString(2131821060)
    String alamatSesuaiKtp;
    @BindString(2131821061)
    String alamatSesuaiPaspor;
    @BindArray(2130903059)
    String[] arrayHari;
    @BindView(2131296440)
    Button btnProses;
    @Checked(messageResId = 2131820725, sequence = 3)
    @BindView(2131296469)
    CheckBox cbxAgree;
    @BindColor(2131099820)
    int colorPaleBlue;
    @BindColor(2131099821)
    int colorPaleGrey;
    private DetailTundaEChannelActivity d;
    @BindView(2131297147)
    @Order(11)
    EditText etAlamatPengirim;
    @BindView(2131296954)
    @Order(3)
    EditText etBeritaSetoran;
    @BindView(2131297148)
    @Order(7)
    EditText etJenisId;
    @BindView(2131297006)
    @Order(2)
    EditText etJumlahSetoran;
    @BindView(2131297142)
    @NotEmpty(messageResId = 2131820852, trim = true)
    AutoCompleteTextView etNamaPenerima;
    @BindView(2131297149)
    @Order(8)
    EditText etNamaPengirim;
    @BindView(2131297150)
    @NotEmpty(messageResId = 2131820902, sequence = 1, trim = true)
    @Order(12)
    EditText etNoHpPengirim;
    @BindView(2131297151)
    @Order(9)
    EditText etNoIDPengirim;
    @BindView(2131297143)
    @NotEmpty(messageResId = 2131820920, sequence = 1, trim = true)
    @Length(messageResId = 2131820948, min = 10, sequence = 2)
    AutoCompleteTextView etNoRekPenerima;
    @BindView(2131297134)
    @Order(10)
    EditText etNorekPengirim;
    @BindView(2131297135)
    @Order(16)
    EditText etOrangJenisId;
    @BindView(2131297136)
    @Order(17)
    EditText etOrangNama;
    @BindView(2131297137)
    @Order(18)
    EditText etOrangNoID;
    @BindView(2131297138)
    @Order(15)
    EditText etOrangSamaDenganPemilik;
    @BindView(2131297152)
    @Order(6)
    EditText etPengirimPemilikSumberDana;
    @BindView(2131297153)
    @Order(13)
    EditText etPengirimSumberDana;
    @BindView(2131297154)
    @Order(14)
    EditText etPengirimTujuanTransaksi;
    @BindView(2131297178)
    @NotEmpty(messageResId = 2131820995, trim = true)
    @Order(4)
    EditText etSetiapBeberapaHari;
    @BindView(2131297144)
    @NotEmpty(messageResId = 2131820999, trim = true)
    @Order(1)
    EditText etSimpanNama;
    @BindView(2131297203)
    @Order(5)
    EditText etTanggalBerakhir;
    private List<DaftarTransfer> f;
    @BindView(2131297257)
    LinearLayout formJenisIdentitas;
    private setMessage g = new setMessage();
    private CheckDaftarTransferPresenter h;
    private Validator i;
    @BindString(2131820903)
    String invalidHandphoneMessage;
    @BindView(2131297342)
    ImageView ivDataOrangDatangKeCabang;
    @BindView(2131297344)
    ImageView ivDataPenerima;
    @BindView(2131297350)
    ImageView ivPengirim;
    @BindView(2131297419)
    ImageView ivTransaksiSetoran;
    @BindView(2131297420)
    ImageView ivTransferBerkala;
    @BindString(2131821815)
    String labelKtp;
    @BindString(2131821986)
    String labelPaspor;
    @BindString(2131822074)
    String labelRekening;
    @BindString(2131821580)
    String labelSetiapBeberapaHari;
    @BindString(2131821581)
    String labelSetiapHari;
    @BindString(2131821582)
    String labelSetiapTanggal;
    @BindString(2131822122)
    String labelSiupNib;
    @BindView(2131297573)
    LinearLayout llData100TransaksiSetoran;
    @BindView(2131297585)
    LinearLayout llDataOrangDatangKeCabang;
    @BindView(2131297586)
    LinearLayout llDataOrangDatangKeCabangDisabled;
    @BindView(2131297588)
    LinearLayout llDataPenerima;
    @BindView(2131297599)
    LinearLayout llDataPenerimaDisabled;
    @BindView(2131297600)
    LinearLayout llDataPengirim;
    @BindView(2131297602)
    LinearLayout llDataPengirimDisabled;
    @BindView(2131297610)
    LinearLayout llDataTransaksiSetoran;
    @BindView(2131297611)
    LinearLayout llDataTransaksiSetoranDisabled;
    @BindView(2131297606)
    LinearLayout llDataTransferBerkala;
    @BindView(2131297607)
    LinearLayout llDataTransferBerkalaDisabled;
    @BindView(2131297663)
    LinearLayout llHeaderDataOrangDatangKeCabang;
    @BindView(2131297665)
    LinearLayout llHeaderDataPenerima;
    @BindView(2131297671)
    LinearLayout llHeaderPengirim;
    @BindView(2131297678)
    LinearLayout llHeaderTransaksiSetoran;
    @BindView(2131297679)
    LinearLayout llHeaderTransferBerkala;
    @BindView(2131297461)
    LinearLayout llLayoutDataOrangDatangKeCabang;
    @BindView(2131297465)
    LinearLayout llLayoutDataPenerima;
    @BindView(2131297473)
    LinearLayout llLayoutPengirim;
    @BindView(2131297503)
    LinearLayout llLayoutTransaksiSetoran;
    @BindView(2131297504)
    LinearLayout llLayoutTransferBerkala;
    @BindView(2131297904)
    LinearLayout llSyaratKetentuan;
    @BindView(2131297928)
    LinearLayout llUneditableBedaDenganPemilikSumberDana;
    @BindView(2131297946)
    LinearLayout llWrapperDataOrangDatangKeCabang;
    @BindView(2131297948)
    LinearLayout llWrapperDataPenerima;
    @BindView(2131297954)
    LinearLayout llWrapperPengirim;
    @BindView(2131297963)
    LinearLayout llWrapperTransaksiSetoran;
    @BindView(2131297964)
    LinearLayout llWrapperTransferBerkala;
    @BindString(2131821931)
    String namaPerusahaan;
    @BindString(2131821919)
    String namaRekening;
    @BindString(2131821933)
    String namaSesuaiKtp;
    @BindString(2131821530)
    String namaSesuaiPaspor;
    @BindString(2131821553)
    String nomorKtp;
    @BindString(2131821556)
    String nomorPaspor;
    @BindString(2131821949)
    String nomorRekening;
    @BindString(2131821192)
    String nomorSiupNib;
    @BindView(2131298286)
    RelativeLayout rlOrangSamaDenganPemilikSdUneditable;
    @BindView(2131298289)
    RelativeLayout rlPenerimaSimpanNamaDisabled;
    @BindView(2131298290)
    RelativeLayout rlPengirimAlamatDisabled;
    @BindView(2131298291)
    RelativeLayout rlPengirimJenisIdDisabled;
    @BindView(2131298292)
    RelativeLayout rlPengirimNamaDisabled;
    @BindView(2131298293)
    RelativeLayout rlPengirimNoHpDisabled;
    @BindView(2131298294)
    RelativeLayout rlPengirimNoIdDisabled;
    @BindView(2131298295)
    RelativeLayout rlPengirimNorekDisabled;
    @BindView(2131298296)
    RelativeLayout rlPengirimPemilikSumberDanaDisabled;
    @BindView(2131298297)
    RelativeLayout rlPengirimSumberDanaDisabled;
    @BindView(2131298298)
    RelativeLayout rlPengirimTujuanDisabled;
    @BindView(2131298420)
    ScrollView svMain;
    @BindView(2131298481)
    LogoutDialog_ViewBinding tilALamatLengkap;
    @BindView(2131298504)
    LogoutDialog_ViewBinding tilBerita;
    @BindViews({2131298683, 2131298680, 2131298682, 2131298681})
    List<LogoutDialog_ViewBinding> tilFormsOrangDatangKeCabang;
    @BindViews({2131298601, 2131298653, 2131298714})
    List<LogoutDialog_ViewBinding> tilFormsPenerima;
    @BindViews({2131298542, 2131298647, 2131298609, 2131298679, 2131298481, 2131298640, 2131298689, 2131298690, 2131298685})
    List<LogoutDialog_ViewBinding> tilFormsPengirim;
    @BindViews({2131298554, 2131298504})
    List<LogoutDialog_ViewBinding> tilFormsSetoran;
    @BindViews({2131298712, 2131298735})
    List<LogoutDialog_ViewBinding> tilFormsTransaksiBerkala;
    @BindView(2131298542)
    LogoutDialog_ViewBinding tilJenisId;
    @BindView(2131298554)
    LogoutDialog_ViewBinding tilJumlah;
    @BindView(2131298601)
    LogoutDialog_ViewBinding tilNama;
    @BindView(2131298609)
    LogoutDialog_ViewBinding tilNamaLengkap;
    @BindView(2131298640)
    LogoutDialog_ViewBinding tilNoHp;
    @BindView(2131298647)
    LogoutDialog_ViewBinding tilNoId;
    @BindView(2131298653)
    LogoutDialog_ViewBinding tilNorek;
    @BindView(2131298679)
    LogoutDialog_ViewBinding tilNorekPengirim;
    @BindView(2131298680)
    LogoutDialog_ViewBinding tilOrangJenisId;
    @BindView(2131298681)
    LogoutDialog_ViewBinding tilOrangNama;
    @BindView(2131298682)
    LogoutDialog_ViewBinding tilOrangNoId;
    @BindView(2131298683)
    LogoutDialog_ViewBinding tilOrangSamaDenganPemilik;
    @BindView(2131298685)
    LogoutDialog_ViewBinding tilPemilikSumberDana;
    @BindView(2131298689)
    LogoutDialog_ViewBinding tilPengirimSumberDana;
    @BindView(2131298690)
    LogoutDialog_ViewBinding tilPengirimTujuanTransaksi;
    @BindView(2131298712)
    LogoutDialog_ViewBinding tilSetiapBeberapaHari;
    @BindView(2131298714)
    LogoutDialog_ViewBinding tilSimpanNama;
    @BindView(2131298735)
    LogoutDialog_ViewBinding tilTanggalBerakhir;
    @BindView(2131299569)
    TextView tvBerkalaSetiap;
    @BindView(2131299595)
    TextView tvBerkalaTanggalBerakhir;
    @BindView(2131299665)
    TextView tvBerkalaTitleSetiap;
    @BindView(2131299180)
    TextView tvErrorSetiapBeberapaHari;
    @BindViews({2131299152, 2131299149, 2131299151, 2131299150})
    List<TextView> tvErrorsOrangDatangKeCabang;
    @BindViews({2131299078, 2131299126, 2131299182})
    List<TextView> tvErrorsPenerima;
    @BindViews({2131299157, 2131299121, 2131299086, 2131299148, 2131298961, 2131299115, 2131299199, 2131299231})
    List<TextView> tvErrorsPengirim;
    @BindView(2131299504)
    TextView tvOrangJenisID;
    @BindView(2131299505)
    TextView tvOrangNama;
    @BindView(2131299506)
    TextView tvOrangNomorID;
    @BindView(2131299507)
    TextView tvOrangSamaDenganPemilikSD;
    @BindView(2131299508)
    TextView tvOrangTitleNama;
    @BindView(2131299509)
    TextView tvOrangTitleNomorID;
    @BindView(2131299519)
    TextView tvPenerimaNama;
    @BindView(2131299520)
    TextView tvPenerimaNorek;
    @BindView(2131299521)
    TextView tvPenerimaSimpanNama;
    @BindView(2131299524)
    TextView tvPengirimAlamat;
    @BindView(2131299525)
    TextView tvPengirimJenisId;
    @BindView(2131299526)
    TextView tvPengirimNama;
    @BindView(2131299527)
    TextView tvPengirimNoHp;
    @BindView(2131299528)
    TextView tvPengirimNoId;
    @BindView(2131299529)
    TextView tvPengirimNoRek;
    @BindView(2131299530)
    TextView tvPengirimPemilikSumberDana;
    @BindView(2131299531)
    TextView tvPengirimSumberDana;
    @BindView(2131299532)
    TextView tvPengirimTitleAlamat;
    @BindView(2131299533)
    TextView tvPengirimTitleNama;
    @BindView(2131299534)
    TextView tvPengirimTitleNoId;
    @BindView(2131299535)
    TextView tvPengirimTujuanTransaksi;
    @BindView(2131299604)
    TextView tvTermCondition;
    @BindView(2131298847)
    TextView tvTransaksiBerita;
    @BindView(2131299316)
    TextView tvTransaksiJumlah;
    @BindView(2131299712)
    TextView tvUbahDataOrangDatangKeCabang;
    @BindView(2131299714)
    TextView tvUbahPenerima;
    @BindView(2131299720)
    TextView tvUbahPengirim;
    @BindView(2131299728)
    TextView tvUbahTransaksiBerkala;
    @BindView(2131299727)
    TextView tvUbahTransaksiSetoran;
    @BindString(2131821427)
    String txtTermCondition;
    @BindViews({2131297138, 2131297135, 2131297137, 2131297136})
    public List<View> viewGroupOrangDatangKeCabang;
    @BindViews({2131297142, 2131297143, 2131297144})
    public List<View> viewGroupPenerima;
    @BindViews({2131297148, 2131297151, 2131297149, 2131297134, 2131297147, 2131297150, 2131297153, 2131297154, 2131297152})
    public List<View> viewGroupPengirim;
    @BindViews({2131297178, 2131297203})
    public List<View> viewGroupTransaksiBerkala;
    @BindViews({2131296954})
    public List<View> viewGroupTransaksiSetoran;

    private void a() {
        ((FormTellerActivity) getActivity()).f.setSenderName(this.etNamaPengirim.getText().toString());
        ((FormTellerActivity) getActivity()).f.setSenderIdType(this.etJenisId.getText().toString().equalsIgnoreCase(this.labelSiupNib) ? "SIUP" : this.etJenisId.getText().toString());
        if (((FormTellerActivity) getActivity()).f.getSenderIdType().equalsIgnoreCase("Rekening")) {
            ((FormTellerActivity) getActivity()).f.setSenderIdNumber(this.etNorekPengirim.getText().toString());
        } else {
            ((FormTellerActivity) getActivity()).f.setSenderIdNumber(this.etNoIDPengirim.getText().toString());
        }
        ((FormTellerActivity) getActivity()).f.setSenderAddress(this.etAlamatPengirim.getText().toString());
        ((FormTellerActivity) getActivity()).f.setSenderPhone(this.etNoHpPengirim.getText().toString());
        ((FormTellerActivity) getActivity()).f.setReceiverName(this.etNamaPenerima.getText().toString());
        ((FormTellerActivity) getActivity()).f.setReceiverAccount(this.etNoRekPenerima.getText().toString());
        ((FormTellerActivity) getActivity()).f.setReceiverAlias(this.etSimpanNama.getText().toString());
        ((FormTellerActivity) getActivity()).f.setTxnSource(this.etPengirimSumberDana.getText().toString());
        ((FormTellerActivity) getActivity()).f.setTxnPurpose(this.etPengirimTujuanTransaksi.getText().toString());
        ((FormTellerActivity) getActivity()).f.setTxnNotes(this.etBeritaSetoran.getText().toString());
        if ("Y".equalsIgnoreCase(((FormTellerActivity) getActivity()).f.getFlagTxnBerkala()) && "Hari".equalsIgnoreCase(((FormTellerActivity) getActivity()).f.getRecurringVar())) {
            ((FormTellerActivity) getActivity()).f.setRecurringValue(this.etSetiapBeberapaHari.getText().toString());
        }
        ((FormTellerActivity) getActivity()).f.setSourceAccountOwnerType(this.etPengirimPemilikSumberDana.getText().toString());
        ((FormTellerActivity) getActivity()).f.setFlagSameReceiverSenderData(this.etOrangSamaDenganPemilik.getText().toString());
        if ("Ya".equalsIgnoreCase(this.etOrangSamaDenganPemilik.getText().toString())) {
            ((FormTellerActivity) getActivity()).f.setFlagRepresentativeTransaction("Y");
        } else {
            ((FormTellerActivity) getActivity()).f.setFlagRepresentativeTransaction("N");
        }
        ((FormTellerActivity) getActivity()).f.setRepresentativeIdType(this.etOrangJenisId.getText().toString());
        ((FormTellerActivity) getActivity()).f.setRepresentativeIdNumber(this.etOrangNoID.getText().toString());
        ((FormTellerActivity) getActivity()).f.setRepresentativeName(this.etOrangNama.getText().toString());
        c(2131296811, new ProsesSetoranFragment(), "ProsesSetoranFragment");
    }

    private void c(int i) {
        this.tvErrorsPenerima.get(i).setVisibility(8);
        this.tilFormsPenerima.get(i).setBackgroundResource(2131230847);
    }

    static /* synthetic */ void c(ReviewSetoranFragment reviewSetoranFragment) {
        reviewSetoranFragment.h.e(reviewSetoranFragment.e, "Setoran Tunai", ((FormTellerActivity) reviewSetoranFragment.getActivity()).f.getReceiverAccount(), "");
    }

    private void d() {
        for (TextView textView : this.tvErrorsOrangDatangKeCabang) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilFormsOrangDatangKeCabang) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        this.etOrangJenisId.setText("");
        this.etOrangJenisId.clearFocus();
        this.etOrangNoID.setText("");
        this.etOrangNoID.clearFocus();
        this.etOrangNama.setText("");
        this.etOrangNama.clearFocus();
        if (this.etOrangJenisId.hasFocus()) {
            this.tilOrangJenisId.setHintEnabled(true);
        } else {
            this.tilOrangJenisId.setHintEnabled(false);
        }
        if (this.etOrangNama.hasFocus()) {
            this.tilOrangNama.setHintEnabled(true);
        } else {
            this.tilOrangNama.setHintEnabled(false);
        }
        if (this.etOrangNoID.hasFocus()) {
            this.tilOrangNoId.setHintEnabled(true);
        } else {
            this.tilOrangNoId.setHintEnabled(false);
        }
    }

    private void d(int i) {
        this.tvErrorsPengirim.get(i).setVisibility(8);
        this.tilFormsPengirim.get(i).setBackgroundResource(2131230847);
    }

    private void e() {
        this.i.put(this.etOrangJenisId, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment.7
            public final String getMessage(Context context) {
                return context.getString(2131820809);
            }

            public final /* synthetic */ boolean isValid(View view) {
                return !((EditText) view).getText().toString().isEmpty();
            }

            public final /* synthetic */ boolean isValid(Object obj) {
                return !((EditText) obj).getText().toString().isEmpty();
            }
        });
        this.etOrangNama.setTag(((FormTellerActivity) getActivity()).f.getRepresentativeIdType());
        final EditText editText = this.etOrangNama;
        this.i.put(editText, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment.4
            private boolean b() {
                if (r0.getTag().toString().equalsIgnoreCase("KTP") && r0.getText().toString().isEmpty()) {
                    return false;
                }
                if (r0.getTag().toString().equalsIgnoreCase("Paspor") && r0.getText().toString().isEmpty()) {
                    return false;
                }
                if (!r0.getTag().toString().equalsIgnoreCase("Rekening") || !r0.getText().toString().isEmpty()) {
                    return !r0.getTag().toString().equalsIgnoreCase("Perusahaan") || !r0.getText().toString().isEmpty();
                }
                return false;
            }

            public final String getMessage(Context context) {
                return (!r0.getTag().toString().equalsIgnoreCase("KTP") || !r0.getText().toString().isEmpty()) ? (!r0.getTag().toString().equalsIgnoreCase("Paspor") || !r0.getText().toString().isEmpty()) ? (!r0.getTag().toString().equalsIgnoreCase("Rekening") || !r0.getText().toString().isEmpty()) ? (!r0.getTag().toString().equalsIgnoreCase("Perusahaan") || !r0.getText().toString().isEmpty()) ? context.getString(2131820869) : context.getString(2131820863) : context.getString(2131820852) : context.getString(2131820866) : context.getString(2131820865);
            }

            public final /* synthetic */ boolean isValid(View view) {
                return b();
            }

            public final /* synthetic */ boolean isValid(Object obj) {
                return b();
            }
        });
        this.etOrangNoID.setTag(((FormTellerActivity) getActivity()).f.getRepresentativeIdType());
        final EditText editText2 = this.etOrangNoID;
        this.i.put(editText2, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment.1
            private boolean c() {
                return r0.getTag().toString().equalsIgnoreCase("KTP") ? r0.getText().length() == 16 : r0.getTag().toString().equalsIgnoreCase("Paspor") ? !r0.getText().toString().isEmpty() : r0.getTag().toString().equalsIgnoreCase("Rekening") ? r0.getText().length() == 10 : !r0.getTag().toString().equalsIgnoreCase("SIUP") || !r0.getText().toString().isEmpty();
            }

            public final String getMessage(Context context) {
                return r0.getTag().toString().equalsIgnoreCase("KTP") ? r0.getText().toString().isEmpty() ? context.getString(2131820937) : context.getString(2131820938) : r0.getTag().toString().equalsIgnoreCase("Paspor") ? r0.getText().toString().isEmpty() ? context.getString(2131820945) : context.getString(2131820946) : r0.getTag().toString().equalsIgnoreCase("Rekening") ? r0.getText().toString().isEmpty() ? context.getString(2131820920) : context.getString(2131820948) : r0.getTag().toString().equalsIgnoreCase("SIUP") ? context.getString(2131820926) : context.getString(2131820932);
            }

            public final /* synthetic */ boolean isValid(View view) {
                return c();
            }

            public final /* synthetic */ boolean isValid(Object obj) {
                return c();
            }
        });
    }

    private void e(int i) {
        this.tvErrorsOrangDatangKeCabang.get(i).setVisibility(8);
        this.tilFormsOrangDatangKeCabang.get(i).setBackgroundResource(2131230847);
    }

    private void e(EditText editText, LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
        editText.setEnabled(false);
        editText.setTextColor(ColorStateList.valueOf(getResources().getColor(2131099774)));
        logoutDialog_ViewBinding.setHintTextAppearance(2131886849);
        logoutDialog_ViewBinding.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099739)));
    }

    private boolean f() {
        return Double.parseDouble(((FormTellerActivity) getActivity()).f.getTxnAmount().replace(",", ".")) >= 1.0E8d;
    }

    private void i() {
        this.h.e(this.e, "Setoran Tunai", ((FormTellerActivity) getActivity()).f.getReceiverAccount(), "");
    }

    private void j() {
        this.i.removeRules(this.etOrangJenisId);
        this.i.removeRules(this.etOrangNama);
        this.i.removeRules(this.etOrangNoID);
    }

    private void k() {
        this.tvPenerimaNama.setText(this.etNamaPenerima.getText().toString());
        this.tvPenerimaNorek.setText(this.etNoRekPenerima.getText().toString());
        this.tvPenerimaSimpanNama.setText(this.etSimpanNama.getText().toString());
        if (!((FormTellerActivity) getActivity()).f.getFlagDaftarTransfer().equalsIgnoreCase("Y")) {
            this.llDataPenerimaDisabled.removeView(this.rlPenerimaSimpanNamaDisabled);
        }
        for (int i = 0; i < this.llDataPenerimaDisabled.getChildCount(); i++) {
            View childAt = this.llDataPenerimaDisabled.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    private void l() {
        this.tvTransaksiJumlah.setText(this.etJumlahSetoran.getText().toString());
        this.tvTransaksiBerita.setText(this.etBeritaSetoran.getText().toString());
        for (int i = 0; i < this.llDataTransaksiSetoranDisabled.getChildCount(); i++) {
            View childAt = this.llDataTransaksiSetoranDisabled.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    private void m() {
        this.tvBerkalaSetiap.setText(this.etSetiapBeberapaHari.getText().toString());
        this.tvBerkalaTanggalBerakhir.setText(this.etTanggalBerakhir.getText().toString());
        for (int i = 0; i < this.llDataTransferBerkalaDisabled.getChildCount(); i++) {
            View childAt = this.llDataTransferBerkalaDisabled.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    private void n() {
        this.tvOrangSamaDenganPemilikSD.setText(this.etOrangSamaDenganPemilik.getText().toString());
        this.tvOrangJenisID.setText(this.etOrangJenisId.getText().toString());
        this.tvOrangNama.setText(this.etOrangNama.getText().toString());
        this.tvOrangNomorID.setText(this.etOrangNoID.getText().toString());
        this.rlOrangSamaDenganPemilikSdUneditable.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
        for (int i = 0; i < this.llUneditableBedaDenganPemilikSumberDana.getChildCount(); i++) {
            View childAt = this.llUneditableBedaDenganPemilikSumberDana.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            }
        }
    }

    private void o() {
        this.tvPengirimPemilikSumberDana.setText(this.etPengirimPemilikSumberDana.getText().toString());
        this.tvPengirimJenisId.setText(this.etJenisId.getText().toString());
        this.tvPengirimNama.setText(this.etNamaPengirim.getText().toString());
        this.tvPengirimNoId.setText(this.etNoIDPengirim.getText().toString());
        this.tvPengirimNoRek.setText(this.etNorekPengirim.getText().toString());
        this.tvPengirimAlamat.setText(this.etAlamatPengirim.getText().toString());
        this.tvPengirimNoHp.setText(this.etNoHpPengirim.getText().toString());
        this.tvPengirimTujuanTransaksi.setText(this.etPengirimTujuanTransaksi.getText().toString());
        this.tvPengirimSumberDana.setText(this.etPengirimSumberDana.getText().toString());
        if (((FormTellerActivity) getActivity()).f.getSourceAccountOwnerType().equalsIgnoreCase("Perusahaan")) {
            if (((FormTellerActivity) getActivity()).f.getSenderIdType().equalsIgnoreCase("SIUP")) {
                this.llDataPengirimDisabled.removeView(this.rlPengirimNorekDisabled);
                this.llDataPengirimDisabled.removeView(this.rlPengirimAlamatDisabled);
                this.llDataPengirimDisabled.removeView(this.rlPengirimNoHpDisabled);
            } else {
                this.llDataPengirimDisabled.removeView(this.rlPengirimNoIdDisabled);
                this.llDataPengirimDisabled.removeView(this.rlPengirimAlamatDisabled);
            }
        } else if (((FormTellerActivity) getActivity()).f.getSenderIdType().equalsIgnoreCase("Rekening")) {
            this.llDataPengirimDisabled.removeView(this.rlPengirimNoIdDisabled);
            this.llDataPengirimDisabled.removeView(this.rlPengirimAlamatDisabled);
        } else {
            this.llDataPengirimDisabled.removeView(this.rlPengirimNorekDisabled);
        }
        if (!f()) {
            this.llDataPengirimDisabled.removeView(this.rlPengirimTujuanDisabled);
            this.llDataPengirimDisabled.removeView(this.rlPengirimSumberDanaDisabled);
        }
        for (int i = 0; i < this.llDataPengirimDisabled.getChildCount(); i++) {
            View childAt = this.llDataPengirimDisabled.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read, com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void a_(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).e(2131822092, new View.OnClickListener() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewSetoranFragment.c(ReviewSetoranFragment.this);
            }
        }).g();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etNamaPenerima.getEditableText()) {
            if (this.tvErrorsPenerima.get(this.viewGroupPenerima.indexOf(this.etNamaPenerima)).getVisibility() == 0 && !this.etNamaPenerima.getText().toString().isEmpty()) {
                c(this.viewGroupPenerima.indexOf(this.etNamaPenerima));
            }
        } else if (editable == this.etNoRekPenerima.getEditableText()) {
            if (this.tvErrorsPenerima.get(this.viewGroupPenerima.indexOf(this.etNoRekPenerima)).getVisibility() != 0) {
                return;
            }
            if (this.tvErrorsPenerima.get(this.viewGroupPenerima.indexOf(this.etNoRekPenerima)).getText().equals(getString(2131820920))) {
                if (!this.etNoRekPenerima.getText().toString().isEmpty()) {
                    c(this.viewGroupPenerima.indexOf(this.etNoRekPenerima));
                }
            } else if (this.tvErrorsPenerima.get(this.viewGroupPenerima.indexOf(this.etNoRekPenerima)).getText().equals(getString(2131820948)) && this.etNoRekPenerima.getText().toString().length() >= 10) {
                c(this.viewGroupPenerima.indexOf(this.etNoRekPenerima));
            }
        } else if (editable == this.etSimpanNama.getEditableText()) {
            if (this.tvErrorsPenerima.get(this.viewGroupPenerima.indexOf(this.etSimpanNama)).getVisibility() == 0 && !this.etSimpanNama.getText().toString().isEmpty()) {
                c(this.viewGroupPenerima.indexOf(this.etSimpanNama));
            }
        } else if (editable == this.etNoIDPengirim.getEditableText()) {
            if (this.tvErrorsPengirim.get(this.viewGroupPengirim.indexOf(this.etNoIDPengirim)).getVisibility() == 0 && getPromotion.d(getContext(), this.tvErrorsPengirim.get(this.viewGroupPengirim.indexOf(this.etNoIDPengirim)).getText().toString(), this.etNoIDPengirim)) {
                d(this.viewGroupPengirim.indexOf(this.etNoIDPengirim));
            }
        } else if (editable == this.etNamaPengirim.getEditableText()) {
            if (this.tvErrorsPengirim.get(this.viewGroupPengirim.indexOf(this.etNamaPengirim)).getVisibility() == 0 && !this.etNamaPengirim.getText().toString().isEmpty()) {
                d(this.viewGroupPengirim.indexOf(this.etNamaPengirim));
            }
        } else if (editable == this.etNorekPengirim.getEditableText()) {
            if (this.tvErrorsPengirim.get(this.viewGroupPengirim.indexOf(this.etNorekPengirim)).getVisibility() != 0) {
                return;
            }
            if (this.tvErrorsPengirim.get(this.viewGroupPengirim.indexOf(this.etNorekPengirim)).getText().equals(getString(2131820920))) {
                if (!this.etNorekPengirim.getText().toString().isEmpty()) {
                    d(this.viewGroupPengirim.indexOf(this.etNorekPengirim));
                }
            } else if (this.tvErrorsPengirim.get(this.viewGroupPengirim.indexOf(this.etNorekPengirim)).getText().equals(getString(2131820948)) && this.etNorekPengirim.getText().toString().length() >= 10) {
                d(this.viewGroupPengirim.indexOf(this.etNorekPengirim));
            }
        } else if (editable == this.etAlamatPengirim.getEditableText()) {
            if (this.tvErrorsPengirim.get(this.viewGroupPengirim.indexOf(this.etAlamatPengirim)).getVisibility() == 0 && !this.etAlamatPengirim.getText().toString().isEmpty()) {
                d(this.viewGroupPengirim.indexOf(this.etAlamatPengirim));
            }
        } else if (editable == this.etNoHpPengirim.getEditableText()) {
            if (this.tvErrorsPengirim.get(this.viewGroupPengirim.indexOf(this.etNoHpPengirim)).getVisibility() == 0 && !this.etNoHpPengirim.getText().toString().isEmpty()) {
                d(this.viewGroupPengirim.indexOf(this.etNoHpPengirim));
            }
        } else if (editable == this.etOrangNama.getEditableText()) {
            if (this.tvErrorsOrangDatangKeCabang.get(this.viewGroupOrangDatangKeCabang.indexOf(this.etOrangNama)).getVisibility() == 0 && !this.etOrangNama.getText().toString().isEmpty()) {
                e(this.viewGroupOrangDatangKeCabang.indexOf(this.etOrangNama));
            }
        } else if (editable == this.etOrangNoID.getEditableText()) {
            if (this.tvErrorsOrangDatangKeCabang.get(this.viewGroupOrangDatangKeCabang.indexOf(this.etOrangNoID)).getVisibility() == 0 && !this.etOrangNoID.getText().toString().isEmpty()) {
                e(this.viewGroupOrangDatangKeCabang.indexOf(this.etOrangNoID));
            }
        } else if (editable == this.etSetiapBeberapaHari.getEditableText()) {
            if (this.tvErrorSetiapBeberapaHari.getVisibility() == 0 && !this.etSetiapBeberapaHari.getText().toString().isEmpty()) {
                this.tvErrorSetiapBeberapaHari.setVisibility(8);
                this.tilSetiapBeberapaHari.setBackgroundResource(2131230847);
            }
            if (this.etSetiapBeberapaHari.getText().toString().equals("0")) {
                this.etSetiapBeberapaHari.setText("");
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read
    public final void b() {
        h();
        a();
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read, com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read, com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
    public final void b_(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493256;
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read
    public final void c(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @OnCheckedChanged({2131296469})
    public void checkboxAgree(CompoundButton compoundButton, boolean z) {
        this.cbxAgree.setBackgroundDrawable(copyWindowDataInto.b(getContext(), 2131231322));
        this.tvTermCondition.setTextColor(copyWindowDataInto.a(getContext(), 2131099737));
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void chooseValueAskOrangDatangKeCabangEvent(goChangePIN gochangepin) {
        String str = gochangepin.a;
        str.hashCode();
        if (str.equals("Ya")) {
            this.etOrangSamaDenganPemilik.setText("Ya");
            d();
            this.formJenisIdentitas.setVisibility(8);
            this.tilOrangJenisId.setVisibility(8);
            this.formJenisIdentitas.setVisibility(8);
            j();
        } else if (str.equals("Tidak")) {
            this.etOrangSamaDenganPemilik.setText("Tidak");
            d();
            this.formJenisIdentitas.setVisibility(8);
            this.tilOrangJenisId.setVisibility(0);
            e();
        }
    }

    @OnClick({2131297135})
    public void clickJenisIdentitas(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etOrangJenisId.getText().toString());
        PilihJenisIdentitasDialog pilihJenisIdentitasDialog = new PilihJenisIdentitasDialog();
        pilihJenisIdentitasDialog.setArguments(bundle);
        pilihJenisIdentitasDialog.show(getParentFragmentManager(), "PilihJenisIdentitasDialog");
    }

    @OnClick({2131297148})
    public void clickJenisIdentitasPemilikSumberDana(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etJenisId.getText().toString());
        bundle.putString("owner_id_type", ((FormTellerActivity) getActivity()).f.getSourceAccountOwnerType());
        PilihJenisIdentitasPemilikSumberDanaDialog pilihJenisIdentitasPemilikSumberDanaDialog = new PilihJenisIdentitasPemilikSumberDanaDialog();
        pilihJenisIdentitasPemilikSumberDanaDialog.setArguments(bundle);
        pilihJenisIdentitasPemilikSumberDanaDialog.show(getParentFragmentManager(), "PilihJenisIdentitasPemilikSumberDanaDialog");
    }

    @OnClick({2131297138})
    public void clickOrangSamaDenganPemilik(View view) {
        Bundle bundle = new Bundle();
        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etOrangSamaDenganPemilik.getText().toString());
        AskOrangDatangKeCabangDialog askOrangDatangKeCabangDialog = new AskOrangDatangKeCabangDialog();
        askOrangDatangKeCabangDialog.setArguments(bundle);
        askOrangDatangKeCabangDialog.show(getParentFragmentManager(), "AskOrangDatangKeCabangDialog");
    }

    @OnClick({2131297153, 2131297154})
    public void clickView(View view) {
        String str;
        Bundle bundle = new Bundle();
        int id = view.getId();
        getText gettext = null;
        switch (id) {
            case 2131297153:
                gettext = new SumberDanaDialog();
                bundle.putStringArray(CollectionUtils.LIST_TYPE, ((FormTellerActivity) getActivity()).q);
                bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etPengirimSumberDana.getText().toString());
                str = "SumberDanaDialog";
                break;
            case 2131297154:
                gettext = new TujuanTransaksiDialog();
                bundle.putStringArray(CollectionUtils.LIST_TYPE, ((FormTellerActivity) getActivity()).s);
                bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etPengirimTujuanTransaksi.getText().toString());
                str = "TujuanTransaksiDialog";
                break;
            default:
                str = null;
                break;
        }
        if (gettext != null) {
            gettext.setArguments(bundle);
            gettext.show(getActivity().l(), str);
        }
    }

    @OnClick({2131299604})
    public void clickedTermsCondition(View view) {
        new TermConditionDialog().show(getActivity().l(), "TermConditionDialog");
    }

    public final void d(showInfoValueTodayOR showinfovaluetodayor, int i, int i2, int i3) {
        String str;
        this.etTanggalBerakhir.setError(null);
        EditText editText = this.etTanggalBerakhir;
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
        ((FormTellerActivity) getActivity()).f.setRecurringEndDate(getAnnualFeeBasicAmount.d(i, i2, i3));
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read
    public final void e(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void eventJenisIdentitas(onRetry onretry) {
        if (!onretry.d.equalsIgnoreCase(String.valueOf(this.etOrangJenisId.getText()))) {
            d();
            this.tilOrangJenisId.setHintEnabled(true);
            this.etOrangJenisId.setText(onretry.d);
            this.formJenisIdentitas.setVisibility(0);
            if (onretry.d.equalsIgnoreCase(this.labelKtp)) {
                this.etOrangNoID.setTag("KTP");
                getPromotion.c(this.etOrangNoID, "KTP");
                if (this.tilOrangNoId.t) {
                    this.tilOrangNoId.setHint(this.nomorKtp);
                } else {
                    this.etOrangNoID.setHint(this.nomorKtp);
                }
                this.etOrangNama.setTag("KTP");
                if (this.tilOrangNama.t) {
                    this.tilOrangNama.setHint(this.namaSesuaiKtp);
                } else {
                    this.etOrangNama.setHint(this.namaSesuaiKtp);
                }
            } else if (onretry.d.equalsIgnoreCase(this.labelPaspor)) {
                this.etOrangNoID.setTag("Paspor");
                getPromotion.c(this.etOrangNoID, "Paspor");
                if (this.tilOrangNoId.t) {
                    this.tilOrangNoId.setHint(this.nomorPaspor);
                } else {
                    this.etOrangNoID.setHint(this.nomorPaspor);
                }
                this.etOrangNama.setTag("Paspor");
                if (this.tilOrangNama.t) {
                    this.tilOrangNama.setHint(this.namaSesuaiPaspor);
                } else {
                    this.etOrangNama.setHint(this.namaSesuaiPaspor);
                }
            } else {
                this.etOrangNoID.setTag("Rekening");
                this.etOrangNoID.setInputType(2);
                this.etOrangNoID.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
                this.etOrangNoID.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
                if (this.tilOrangNoId.t) {
                    this.tilOrangNoId.setHint(this.nomorRekening);
                } else {
                    this.etOrangNoID.setHint(this.nomorRekening);
                }
                this.etOrangNama.setTag("Rekening");
                if (this.tilOrangNama.t) {
                    this.tilOrangNama.setHint(this.namaRekening);
                } else {
                    this.etOrangNama.setHint(this.namaRekening);
                }
            }
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void eventJenisIdentitasPemilikSumberDana(ReservasiCSOActivity reservasiCSOActivity) {
        if (!reservasiCSOActivity.d.equalsIgnoreCase(this.etJenisId.getText().toString())) {
            this.tilJenisId.setHintEnabled(true);
            this.etJenisId.setText(reservasiCSOActivity.d);
            this.tvErrorsPengirim.get(2).setVisibility(8);
            this.tvErrorsPengirim.get(1).setVisibility(8);
            this.tvErrorsPengirim.get(3).setVisibility(8);
            this.tvErrorsPengirim.get(4).setVisibility(8);
            this.tilNamaLengkap.setBackgroundResource(2131230847);
            this.tilNoId.setBackgroundResource(2131230847);
            this.tilNorekPengirim.setBackgroundResource(2131230847);
            this.tilALamatLengkap.setBackgroundResource(2131230847);
            this.etNamaPengirim.setText("");
            this.etNamaPengirim.clearFocus();
            this.etNoIDPengirim.setText("");
            this.etNoIDPengirim.clearFocus();
            this.etNorekPengirim.setText("");
            this.etNorekPengirim.clearFocus();
            this.etAlamatPengirim.setText("");
            this.etAlamatPengirim.clearFocus();
            if (this.etNamaPengirim.hasFocus()) {
                this.tilNamaLengkap.setHintEnabled(true);
            } else {
                this.tilNamaLengkap.setHintEnabled(false);
            }
            if (this.etNoIDPengirim.hasFocus()) {
                this.tilNoId.setHintEnabled(true);
            } else {
                this.tilNoId.setHintEnabled(false);
            }
            if (this.etNorekPengirim.hasFocus()) {
                this.tilNorekPengirim.setHintEnabled(true);
            } else {
                this.tilNorekPengirim.setHintEnabled(false);
            }
            if (this.etAlamatPengirim.hasFocus()) {
                this.tilALamatLengkap.setHintEnabled(true);
            } else {
                this.tilALamatLengkap.setHintEnabled(false);
            }
            if (reservasiCSOActivity.d.equalsIgnoreCase(this.labelKtp)) {
                this.tilNoId.setVisibility(0);
                this.tilNorekPengirim.setVisibility(8);
                this.tilALamatLengkap.setVisibility(0);
                this.i.removeRules(this.viewGroupPengirim.get(3));
                this.etNoIDPengirim.setTag("KTP");
                this.etNoIDPengirim.setInputType(2);
                this.etNoIDPengirim.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
                this.etNoIDPengirim.setFilters(new InputFilter[]{new InputFilter.LengthFilter(16)});
                if (this.tilNoId.t) {
                    this.tilNoId.setHint(this.nomorKtp);
                } else {
                    this.etNoIDPengirim.setHint(this.nomorKtp);
                }
                this.etNamaPengirim.setTag("KTP");
                if (this.tilNamaLengkap.t) {
                    this.tilNamaLengkap.setHint(this.namaSesuaiKtp);
                } else {
                    this.etNamaPengirim.setHint(this.namaSesuaiKtp);
                }
                this.etAlamatPengirim.setTag("KTP");
                if (this.tilALamatLengkap.t) {
                    this.tilALamatLengkap.setHint(this.alamatSesuaiKtp);
                } else {
                    this.etAlamatPengirim.setHint(this.alamatSesuaiKtp);
                }
                final EditText editText = this.etNoIDPengirim;
                this.i.put(editText, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment.1
                    private boolean c() {
                        return r0.getTag().toString().equalsIgnoreCase("KTP") ? r0.getText().length() == 16 : r0.getTag().toString().equalsIgnoreCase("Paspor") ? !r0.getText().toString().isEmpty() : r0.getTag().toString().equalsIgnoreCase("Rekening") ? r0.getText().length() == 10 : !r0.getTag().toString().equalsIgnoreCase("SIUP") || !r0.getText().toString().isEmpty();
                    }

                    public final String getMessage(Context context) {
                        return r0.getTag().toString().equalsIgnoreCase("KTP") ? r0.getText().toString().isEmpty() ? context.getString(2131820937) : context.getString(2131820938) : r0.getTag().toString().equalsIgnoreCase("Paspor") ? r0.getText().toString().isEmpty() ? context.getString(2131820945) : context.getString(2131820946) : r0.getTag().toString().equalsIgnoreCase("Rekening") ? r0.getText().toString().isEmpty() ? context.getString(2131820920) : context.getString(2131820948) : r0.getTag().toString().equalsIgnoreCase("SIUP") ? context.getString(2131820926) : context.getString(2131820932);
                    }

                    public final /* synthetic */ boolean isValid(View view) {
                        return c();
                    }

                    public final /* synthetic */ boolean isValid(Object obj) {
                        return c();
                    }
                });
                final EditText editText2 = this.etAlamatPengirim;
                this.i.put(editText2, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment.6
                    public final String getMessage(Context context) {
                        return (!r0.getTag().toString().equalsIgnoreCase("KTP") || !r0.getText().toString().isEmpty()) ? (!r0.getTag().toString().equalsIgnoreCase("Paspor") || !r0.getText().toString().isEmpty()) ? context.getString(2131820730) : context.getString(2131820734) : context.getString(2131820733);
                    }

                    public final /* synthetic */ boolean isValid(View view) {
                        return !r0.getText().toString().isEmpty();
                    }

                    public final /* synthetic */ boolean isValid(Object obj) {
                        return !r0.getText().toString().isEmpty();
                    }
                });
            } else if (reservasiCSOActivity.d.equalsIgnoreCase(this.labelPaspor)) {
                this.tilNoId.setVisibility(0);
                this.tilNorekPengirim.setVisibility(8);
                this.tilALamatLengkap.setVisibility(0);
                this.i.removeRules(this.viewGroupPengirim.get(3));
                this.etNoIDPengirim.setTag("Paspor");
                getPromotion.c(this.etNoIDPengirim, "Paspor");
                if (this.tilNoId.t) {
                    this.tilNoId.setHint(this.nomorPaspor);
                } else {
                    this.etNoIDPengirim.setHint(this.nomorPaspor);
                }
                this.etNamaPengirim.setTag("Paspor");
                if (this.tilNamaLengkap.t) {
                    this.tilNamaLengkap.setHint(this.namaSesuaiPaspor);
                } else {
                    this.etNamaPengirim.setHint(this.namaSesuaiPaspor);
                }
                this.etAlamatPengirim.setTag("Paspor");
                if (this.tilALamatLengkap.t) {
                    this.tilALamatLengkap.setHint(this.alamatSesuaiPaspor);
                } else {
                    this.etAlamatPengirim.setHint(this.alamatSesuaiPaspor);
                }
                final EditText editText3 = this.etNoIDPengirim;
                this.i.put(editText3, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment.1
                    private boolean c() {
                        return r0.getTag().toString().equalsIgnoreCase("KTP") ? r0.getText().length() == 16 : r0.getTag().toString().equalsIgnoreCase("Paspor") ? !r0.getText().toString().isEmpty() : r0.getTag().toString().equalsIgnoreCase("Rekening") ? r0.getText().length() == 10 : !r0.getTag().toString().equalsIgnoreCase("SIUP") || !r0.getText().toString().isEmpty();
                    }

                    public final String getMessage(Context context) {
                        return r0.getTag().toString().equalsIgnoreCase("KTP") ? r0.getText().toString().isEmpty() ? context.getString(2131820937) : context.getString(2131820938) : r0.getTag().toString().equalsIgnoreCase("Paspor") ? r0.getText().toString().isEmpty() ? context.getString(2131820945) : context.getString(2131820946) : r0.getTag().toString().equalsIgnoreCase("Rekening") ? r0.getText().toString().isEmpty() ? context.getString(2131820920) : context.getString(2131820948) : r0.getTag().toString().equalsIgnoreCase("SIUP") ? context.getString(2131820926) : context.getString(2131820932);
                    }

                    public final /* synthetic */ boolean isValid(View view) {
                        return c();
                    }

                    public final /* synthetic */ boolean isValid(Object obj) {
                        return c();
                    }
                });
                final EditText editText4 = this.etAlamatPengirim;
                this.i.put(editText4, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment.6
                    public final String getMessage(Context context) {
                        return (!r0.getTag().toString().equalsIgnoreCase("KTP") || !r0.getText().toString().isEmpty()) ? (!r0.getTag().toString().equalsIgnoreCase("Paspor") || !r0.getText().toString().isEmpty()) ? context.getString(2131820730) : context.getString(2131820734) : context.getString(2131820733);
                    }

                    public final /* synthetic */ boolean isValid(View view) {
                        return !r0.getText().toString().isEmpty();
                    }

                    public final /* synthetic */ boolean isValid(Object obj) {
                        return !r0.getText().toString().isEmpty();
                    }
                });
            } else if (reservasiCSOActivity.d.equalsIgnoreCase(this.labelSiupNib)) {
                this.tilNoId.setVisibility(0);
                this.tilNorekPengirim.setVisibility(8);
                this.tilALamatLengkap.setVisibility(8);
                this.tilNoHp.setVisibility(8);
                this.etNoHpPengirim.getText().clear();
                this.i.removeRules(this.viewGroupPengirim.get(3));
                this.i.removeRules(this.viewGroupPengirim.get(5));
                this.etNoIDPengirim.setTag("SIUP");
                getPromotion.c(this.etNoIDPengirim, "SIUP");
                if (this.tilNoId.t) {
                    this.tilNoId.setHint(this.nomorSiupNib);
                } else {
                    this.etNoIDPengirim.setHint(this.nomorSiupNib);
                }
                this.etNamaPengirim.setTag("Perusahaan");
                if (this.tilNamaLengkap.t) {
                    this.tilNamaLengkap.setHint(this.namaPerusahaan);
                } else {
                    this.etNamaPengirim.setHint(this.namaPerusahaan);
                }
                final EditText editText5 = this.etNoIDPengirim;
                this.i.put(editText5, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment.1
                    private boolean c() {
                        return r0.getTag().toString().equalsIgnoreCase("KTP") ? r0.getText().length() == 16 : r0.getTag().toString().equalsIgnoreCase("Paspor") ? !r0.getText().toString().isEmpty() : r0.getTag().toString().equalsIgnoreCase("Rekening") ? r0.getText().length() == 10 : !r0.getTag().toString().equalsIgnoreCase("SIUP") || !r0.getText().toString().isEmpty();
                    }

                    public final String getMessage(Context context) {
                        return r0.getTag().toString().equalsIgnoreCase("KTP") ? r0.getText().toString().isEmpty() ? context.getString(2131820937) : context.getString(2131820938) : r0.getTag().toString().equalsIgnoreCase("Paspor") ? r0.getText().toString().isEmpty() ? context.getString(2131820945) : context.getString(2131820946) : r0.getTag().toString().equalsIgnoreCase("Rekening") ? r0.getText().toString().isEmpty() ? context.getString(2131820920) : context.getString(2131820948) : r0.getTag().toString().equalsIgnoreCase("SIUP") ? context.getString(2131820926) : context.getString(2131820932);
                    }

                    public final /* synthetic */ boolean isValid(View view) {
                        return c();
                    }

                    public final /* synthetic */ boolean isValid(Object obj) {
                        return c();
                    }
                });
            } else {
                this.tilNoId.setVisibility(8);
                this.tilNorekPengirim.setVisibility(0);
                this.tilALamatLengkap.setVisibility(8);
                this.tilNoHp.setVisibility(0);
                this.i.removeRules(this.viewGroupPengirim.get(1));
                this.i.removeRules(this.viewGroupPengirim.get(4));
                this.etNorekPengirim.setTag("Rekening");
                this.etNorekPengirim.setInputType(2);
                this.etNorekPengirim.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
                this.etNorekPengirim.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
                if (this.tilNorekPengirim.t) {
                    this.tilNorekPengirim.setHint(this.nomorRekening);
                } else {
                    this.etNorekPengirim.setHint(this.nomorRekening);
                }
                if (((FormTellerActivity) getActivity()).f.getSourceAccountOwnerType().equalsIgnoreCase("Perusahaan")) {
                    this.etNamaPengirim.setTag("Perusahaan");
                } else {
                    this.etNamaPengirim.setTag("Rekening");
                }
                if (this.tilNamaLengkap.t) {
                    if (((FormTellerActivity) getActivity()).f.getSourceAccountOwnerType().equalsIgnoreCase("Perusahaan")) {
                        this.tilNamaLengkap.setHint(this.namaPerusahaan);
                    } else {
                        this.tilNamaLengkap.setHint(this.namaRekening);
                    }
                } else if (((FormTellerActivity) getActivity()).f.getSourceAccountOwnerType().equalsIgnoreCase("Perusahaan")) {
                    this.etNamaPengirim.setHint(this.namaPerusahaan);
                } else {
                    this.etNamaPengirim.setHint(this.namaRekening);
                }
                final EditText editText6 = this.etNorekPengirim;
                this.i.put(editText6, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment.1
                    private boolean c() {
                        return r0.getTag().toString().equalsIgnoreCase("KTP") ? r0.getText().length() == 16 : r0.getTag().toString().equalsIgnoreCase("Paspor") ? !r0.getText().toString().isEmpty() : r0.getTag().toString().equalsIgnoreCase("Rekening") ? r0.getText().length() == 10 : !r0.getTag().toString().equalsIgnoreCase("SIUP") || !r0.getText().toString().isEmpty();
                    }

                    public final String getMessage(Context context) {
                        return r0.getTag().toString().equalsIgnoreCase("KTP") ? r0.getText().toString().isEmpty() ? context.getString(2131820937) : context.getString(2131820938) : r0.getTag().toString().equalsIgnoreCase("Paspor") ? r0.getText().toString().isEmpty() ? context.getString(2131820945) : context.getString(2131820946) : r0.getTag().toString().equalsIgnoreCase("Rekening") ? r0.getText().toString().isEmpty() ? context.getString(2131820920) : context.getString(2131820948) : r0.getTag().toString().equalsIgnoreCase("SIUP") ? context.getString(2131820926) : context.getString(2131820932);
                    }

                    public final /* synthetic */ boolean isValid(View view) {
                        return c();
                    }

                    public final /* synthetic */ boolean isValid(Object obj) {
                        return c();
                    }
                });
                ConfirmSubBCACardAdapter$ViewHolder confirmSubBCACardAdapter$ViewHolder = new ConfirmSubBCACardAdapter$ViewHolder();
                confirmSubBCACardAdapter$ViewHolder.c = 2131820902;
                confirmSubBCACardAdapter$ViewHolder.e = 2131820905;
                confirmSubBCACardAdapter$ViewHolder.d = 2131820903;
                confirmSubBCACardAdapter$ViewHolder.a = 2131820904;
                Validator validator = this.i;
                EditText editText7 = this.etNoHpPengirim;
                validator.put(editText7, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05fc: INVOKE  
                      (r0v110 'validator' com.mobsandgeeks.saripaar.Validator)
                      (r0v112 'editText7' android.widget.EditText)
                      (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v6 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                      (wrap: o.getPromotion$2 : 0x05f8: CONSTRUCTOR  
                      (r0v112 'editText7' android.widget.EditText)
                      (r0v104 'confirmSubBCACardAdapter$ViewHolder' o.ConfirmSubBCACardAdapter$ViewHolder)
                     call: o.getPromotion.2.<init>(android.widget.EditText, o.ConfirmSubBCACardAdapter$ViewHolder):void type: CONSTRUCTOR)
                     elemType: com.mobsandgeeks.saripaar.QuickRule)
                     type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.ReviewSetoranFragment.eventJenisIdentitasPemilikSumberDana(o.ReservasiCSOActivity):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/ReviewSetoranFragment.class
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:155)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:132)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:155)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:132)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
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
                    	... 31 more
                    */
                /*
                // Method dump skipped, instructions count: 1536
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.ReviewSetoranFragment.eventJenisIdentitasPemilikSumberDana(o.ReservasiCSOActivity):void");
            }

            @Override // com.bca.smartbranch.presenter.CheckDaftarTransferPresenter.read, com.bca.smartbranch.presenter.GetFundPurposePresenter.IconCompatParcelizer
            public final void g_() {
                g();
            }

            @OnFocusChange({2131297142, 2131297143, 2131297144, 2131296954, 2131297178, 2131297149, 2131297151, 2131297134, 2131297147, 2131297150, 2131297136, 2131297137})
            public void inputChangePenerima(View view, boolean z) {
                if (z) {
                    switch (view.getId()) {
                        case 2131296954:
                            this.tilBerita.setHintEnabled(true);
                            return;
                        case 2131297134:
                            this.tilNorekPengirim.setHintEnabled(true);
                            return;
                        case 2131297136:
                            this.tilOrangNama.setHintEnabled(true);
                            return;
                        case 2131297137:
                            this.tilOrangNoId.setHintEnabled(true);
                            return;
                        case 2131297142:
                            this.tilNama.setHintEnabled(true);
                            return;
                        case 2131297143:
                            this.tilNorek.setHintEnabled(true);
                            return;
                        case 2131297144:
                            this.tilSimpanNama.setHintEnabled(true);
                            return;
                        case 2131297147:
                            this.tilALamatLengkap.setHintEnabled(true);
                            return;
                        case 2131297149:
                            this.tilNamaLengkap.setHintEnabled(true);
                            return;
                        case 2131297150:
                            this.tilNoHp.setHintEnabled(true);
                            return;
                        case 2131297151:
                            this.tilNoId.setHintEnabled(true);
                            return;
                        case 2131297178:
                            this.tilSetiapBeberapaHari.setHintEnabled(true);
                            return;
                        default:
                            return;
                    }
                } else {
                    switch (view.getId()) {
                        case 2131296954:
                            if (this.etBeritaSetoran.getText().toString().isEmpty()) {
                                this.tilBerita.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297134:
                            if (this.etNorekPengirim.getText().toString().isEmpty()) {
                                this.tilNorekPengirim.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297136:
                            if (this.etOrangNama.getText().toString().isEmpty()) {
                                this.tilOrangNama.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297137:
                            if (this.etOrangNoID.getText().toString().isEmpty()) {
                                this.tilOrangNoId.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297142:
                            if (this.etNamaPenerima.getText().toString().isEmpty()) {
                                this.tilNama.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297143:
                            if (this.etNoRekPenerima.getText().toString().isEmpty()) {
                                this.tilNorek.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297144:
                            if (this.etSimpanNama.getText().toString().isEmpty()) {
                                this.tilSimpanNama.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297147:
                            if (this.etAlamatPengirim.getText().toString().isEmpty()) {
                                this.tilALamatLengkap.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297149:
                            if (this.etNamaPengirim.getText().toString().isEmpty()) {
                                this.tilNamaLengkap.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297150:
                            if (this.etNoHpPengirim.getText().toString().isEmpty()) {
                                this.tilNoHp.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297151:
                            if (this.etNoIDPengirim.getText().toString().isEmpty()) {
                                this.tilNoId.setHintEnabled(false);
                                return;
                            }
                            return;
                        case 2131297178:
                            if (this.etSetiapBeberapaHari.getText().toString().isEmpty()) {
                                this.tilSetiapBeberapaHari.setHintEnabled(false);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
                if (((FormTellerActivity) getActivity()).w) {
                    e(2131296811, new PenerimaFragment(), "PenerimaFragment");
                } else {
                    e(2131296811, new SumberDanaOrangDatangKeCabangSetunFragment(), "SumberDanaOrangDatangKeCabangSetunFragment");
                }
            }

            @OnClick({2131296440})
            public void onClicedButton(View view) {
                getPromotion.d(requireContext());
                for (TextView textView : this.tvErrorsPenerima) {
                    textView.setVisibility(8);
                }
                for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilFormsPenerima) {
                    logoutDialog_ViewBinding.setBackgroundResource(2131231360);
                }
                for (TextView textView2 : this.tvErrorsPengirim) {
                    textView2.setVisibility(8);
                }
                for (LogoutDialog_ViewBinding logoutDialog_ViewBinding2 : this.tilFormsPengirim) {
                    logoutDialog_ViewBinding2.setBackgroundResource(2131231360);
                }
                for (TextView textView3 : this.tvErrorsOrangDatangKeCabang) {
                    textView3.setVisibility(8);
                }
                for (LogoutDialog_ViewBinding logoutDialog_ViewBinding3 : this.tilFormsOrangDatangKeCabang) {
                    logoutDialog_ViewBinding3.setBackgroundResource(2131231360);
                }
                this.tvErrorSetiapBeberapaHari.setVisibility(8);
                this.tilSetiapBeberapaHari.setBackgroundResource(2131231360);
                this.i.validate();
            }

            @OnClick({2131299712})
            public void onClickUbahDataOrangDatangKeCabang(View view) {
                this.tvUbahDataOrangDatangKeCabang.setVisibility(8);
                this.llDataOrangDatangKeCabangDisabled.setVisibility(8);
                this.llDataOrangDatangKeCabang.setVisibility(0);
                ActivateEChannelResponse.Description description = new ActivateEChannelResponse.Description(this);
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataOrangDatangKeCabang.getBackground();
                transitionDrawable.setCrossFadeEnabled(true);
                if (this.llLayoutDataOrangDatangKeCabang.getVisibility() == 8) {
                    this.g.c(this.llLayoutDataOrangDatangKeCabang);
                    setMessage setmessage = this.g;
                    ImageView imageView = this.ivDataOrangDatangKeCabang;
                    setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                    transitionDrawable.startTransition(0);
                    new Handler().postDelayed(description, 300);
                    return;
                }
                description.run();
            }

            @OnClick({2131299714})
            public void onClickUbahDataPenerima(View view) {
                this.tvUbahPenerima.setVisibility(8);
                this.llDataPenerimaDisabled.setVisibility(8);
                this.llDataPenerima.setVisibility(0);
                ActivateEChannelResponse$Description$$Parcelable activateEChannelResponse$Description$$Parcelable = new Runnable() { // from class: o.ActivateEChannelResponse$Description$$Parcelable
                    @Override // java.lang.Runnable
                    public final void run() {
                        ReviewSetoranFragment reviewSetoranFragment = ReviewSetoranFragment.this;
                        EditText editText = null;
                        for (int size = reviewSetoranFragment.viewGroupPenerima.size() - 1; size >= 0; size--) {
                            editText = editText;
                            if (reviewSetoranFragment.viewGroupPenerima.get(size).getVisibility() == 0) {
                                editText = editText;
                                if (reviewSetoranFragment.viewGroupPenerima.get(size).isFocusable()) {
                                    editText = editText;
                                    if (reviewSetoranFragment.viewGroupPenerima.get(size).isEnabled()) {
                                        editText = (EditText) reviewSetoranFragment.viewGroupPenerima.get(size);
                                    }
                                }
                            }
                        }
                        if (editText != null) {
                            editText.requestFocus();
                        }
                    }
                };
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataPenerima.getBackground();
                transitionDrawable.setCrossFadeEnabled(true);
                if (this.llLayoutDataPenerima.getVisibility() == 8) {
                    this.g.c(this.llLayoutDataPenerima);
                    setMessage setmessage = this.g;
                    ImageView imageView = this.ivDataPenerima;
                    setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                    transitionDrawable.startTransition(0);
                    new Handler().postDelayed(activateEChannelResponse$Description$$Parcelable, 300);
                    return;
                }
                activateEChannelResponse$Description$$Parcelable.run();
            }

            @OnClick({2131299720})
            public void onClickUbahDataPengirim(View view) {
                this.tvUbahPengirim.setVisibility(8);
                this.llDataPengirimDisabled.setVisibility(8);
                this.llDataPengirim.setVisibility(0);
                ActivateEChannelResponse$TxnDataOutput$$Parcelable activateEChannelResponse$TxnDataOutput$$Parcelable = new Runnable() { // from class: o.ActivateEChannelResponse$TxnDataOutput$$Parcelable
                    @Override // java.lang.Runnable
                    public final void run() {
                        ReviewSetoranFragment reviewSetoranFragment = ReviewSetoranFragment.this;
                        EditText editText = null;
                        for (int size = reviewSetoranFragment.viewGroupPengirim.size() - 1; size >= 0; size--) {
                            editText = editText;
                            if (reviewSetoranFragment.viewGroupPengirim.get(size).getVisibility() == 0) {
                                editText = editText;
                                if (reviewSetoranFragment.viewGroupPengirim.get(size).isFocusable()) {
                                    editText = editText;
                                    if (reviewSetoranFragment.viewGroupPengirim.get(size).isEnabled()) {
                                        editText = (EditText) reviewSetoranFragment.viewGroupPengirim.get(size);
                                    }
                                }
                            }
                        }
                        if (editText != null) {
                            editText.requestFocus();
                        }
                    }
                };
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderPengirim.getBackground();
                transitionDrawable.setCrossFadeEnabled(true);
                if (this.llLayoutPengirim.getVisibility() == 8) {
                    this.g.c(this.llLayoutPengirim);
                    setMessage setmessage = this.g;
                    ImageView imageView = this.ivPengirim;
                    setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                    transitionDrawable.startTransition(0);
                    new Handler().postDelayed(activateEChannelResponse$TxnDataOutput$$Parcelable, 300);
                    return;
                }
                activateEChannelResponse$TxnDataOutput$$Parcelable.run();
            }

            @OnClick({2131299727})
            public void onClickUbahTransaksiSetoran(View view) {
                this.tvUbahTransaksiSetoran.setVisibility(8);
                this.llDataTransaksiSetoranDisabled.setVisibility(8);
                this.llDataTransaksiSetoran.setVisibility(0);
                getAbanoCode getabanocode = new Runnable() { // from class: o.getAbanoCode
                    @Override // java.lang.Runnable
                    public final void run() {
                        ReviewSetoranFragment reviewSetoranFragment = ReviewSetoranFragment.this;
                        EditText editText = null;
                        for (int size = reviewSetoranFragment.viewGroupTransaksiSetoran.size() - 1; size >= 0; size--) {
                            editText = editText;
                            if (reviewSetoranFragment.viewGroupTransaksiSetoran.get(size).getVisibility() == 0) {
                                editText = editText;
                                if (reviewSetoranFragment.viewGroupTransaksiSetoran.get(size).isFocusable()) {
                                    editText = editText;
                                    if (reviewSetoranFragment.viewGroupTransaksiSetoran.get(size).isEnabled()) {
                                        editText = (EditText) reviewSetoranFragment.viewGroupTransaksiSetoran.get(size);
                                    }
                                }
                            }
                        }
                        if (editText != null) {
                            editText.requestFocus();
                        }
                    }
                };
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderTransaksiSetoran.getBackground();
                transitionDrawable.setCrossFadeEnabled(true);
                if (this.llLayoutTransaksiSetoran.getVisibility() == 8) {
                    this.g.c(this.llLayoutTransaksiSetoran);
                    setMessage setmessage = this.g;
                    ImageView imageView = this.ivTransaksiSetoran;
                    setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                    transitionDrawable.startTransition(0);
                    new Handler().postDelayed(getabanocode, 300);
                    return;
                }
                getabanocode.run();
            }

            @OnClick({2131299728})
            public void onClickUbahTransferBerkala(View view) {
                this.tvUbahTransaksiBerkala.setVisibility(8);
                this.llDataTransferBerkalaDisabled.setVisibility(8);
                this.llDataTransferBerkala.setVisibility(0);
                ActivateEChannelResponse.TxnDataOutput txnDataOutput = new ActivateEChannelResponse.TxnDataOutput(this);
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderTransferBerkala.getBackground();
                transitionDrawable.setCrossFadeEnabled(true);
                if (this.llLayoutTransferBerkala.getVisibility() == 8) {
                    this.g.c(this.llLayoutTransferBerkala);
                    setMessage setmessage = this.g;
                    ImageView imageView = this.ivTransferBerkala;
                    setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                    transitionDrawable.startTransition(0);
                    new Handler().postDelayed(txnDataOutput, 300);
                    return;
                }
                txnDataOutput.run();
            }

            @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
            public void onDestroyView() {
                onDestroyView();
                this.c.close();
                documentProvider.b().e(this);
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (this.etNamaPenerima.isFocused()) {
                    this.etNamaPenerima.setAdapter(null);
                    this.etNamaPenerima.setText(this.a.d.get(i).d);
                    AutoCompleteTextView autoCompleteTextView = this.etNamaPenerima;
                    autoCompleteTextView.setSelection(autoCompleteTextView.length());
                    this.etNoRekPenerima.setText(this.a.d.get(i).b);
                    AutoCompleteTextView autoCompleteTextView2 = this.etNoRekPenerima;
                    autoCompleteTextView2.setSelection(autoCompleteTextView2.length());
                    this.etNamaPenerima.setAdapter(this.a);
                    this.tilFormsPenerima.get(0).setHintEnabled(true);
                    this.tilFormsPenerima.get(1).setHintEnabled(true);
                } else if (this.etNoRekPenerima.isFocused()) {
                    this.etNoRekPenerima.setAdapter(null);
                    this.etNamaPenerima.setText(this.d.d.get(i).d);
                    AutoCompleteTextView autoCompleteTextView3 = this.etNamaPenerima;
                    autoCompleteTextView3.setSelection(autoCompleteTextView3.length());
                    this.etNoRekPenerima.setText(this.d.d.get(i).b);
                    AutoCompleteTextView autoCompleteTextView4 = this.etNoRekPenerima;
                    autoCompleteTextView4.setSelection(autoCompleteTextView4.length());
                    this.etNoRekPenerima.setAdapter(this.d);
                    this.tilFormsPenerima.get(0).setHintEnabled(true);
                    this.tilFormsPenerima.get(1).setHintEnabled(true);
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
            public void onValidationFailed(List<ValidationError> list) {
                LinearLayout linearLayout;
                EditText editText = null;
                LinearLayout linearLayout2 = null;
                for (ValidationError validationError : list) {
                    View view = validationError.getView();
                    String message = validationError.getFailedRules().get(0).getMessage(getContext());
                    if (this.viewGroupPenerima.contains(view)) {
                        if (this.llLayoutDataPenerima.getVisibility() == 8) {
                            this.g.c(this.llLayoutDataPenerima);
                            setMessage setmessage = this.g;
                            ImageView imageView = this.ivDataPenerima;
                            setmessage.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                            setmessage.e(imageView);
                        }
                        linearLayout = linearLayout2;
                        if (linearLayout2 == null) {
                            linearLayout = this.llWrapperDataPenerima;
                        }
                    } else if (this.viewGroupPengirim.contains(view)) {
                        if (this.llLayoutPengirim.getVisibility() == 8) {
                            this.g.c(this.llLayoutPengirim);
                            setMessage setmessage2 = this.g;
                            ImageView imageView2 = this.ivPengirim;
                            setmessage2.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                            setmessage2.e(imageView2);
                        }
                        linearLayout = linearLayout2;
                        if (linearLayout2 == null) {
                            linearLayout = this.llWrapperPengirim;
                        }
                    } else if (this.viewGroupTransaksiBerkala.contains(view)) {
                        if (this.llLayoutTransferBerkala.getVisibility() == 8) {
                            this.g.c(this.llLayoutTransferBerkala);
                            setMessage setmessage3 = this.g;
                            ImageView imageView3 = this.ivTransferBerkala;
                            setmessage3.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                            setmessage3.e(imageView3);
                        }
                        linearLayout = linearLayout2;
                        if (linearLayout2 == null) {
                            linearLayout = this.llWrapperTransferBerkala;
                        }
                    } else {
                        linearLayout = linearLayout2;
                        if (this.viewGroupOrangDatangKeCabang.contains(view)) {
                            if (this.llLayoutDataOrangDatangKeCabang.getVisibility() == 8) {
                                this.g.c(this.llLayoutDataOrangDatangKeCabang);
                                setMessage setmessage4 = this.g;
                                ImageView imageView4 = this.ivDataOrangDatangKeCabang;
                                setmessage4.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                                setmessage4.e(imageView4);
                            }
                            linearLayout = linearLayout2;
                            if (linearLayout2 == null) {
                                linearLayout = this.llWrapperDataOrangDatangKeCabang;
                            }
                        }
                    }
                    if (view instanceof EditText) {
                        EditText editText2 = editText;
                        if (editText == null) {
                            editText2 = (EditText) view;
                        }
                        switch (view.getId()) {
                            case 2131297134:
                                this.tvErrorsPengirim.get(3).setVisibility(0);
                                this.tvErrorsPengirim.get(3).setText(message);
                                this.tilFormsPengirim.get(3).setBackgroundResource(2131230870);
                                editText = editText2;
                                linearLayout2 = linearLayout;
                                continue;
                            case 2131297135:
                                this.tvErrorsOrangDatangKeCabang.get(1).setVisibility(0);
                                this.tvErrorsOrangDatangKeCabang.get(1).setText(message);
                                this.tilFormsOrangDatangKeCabang.get(1).setBackgroundResource(2131230870);
                                editText = editText2;
                                linearLayout2 = linearLayout;
                                continue;
                            case 2131297136:
                                this.tvErrorsOrangDatangKeCabang.get(3).setVisibility(0);
                                this.tvErrorsOrangDatangKeCabang.get(3).setText(message);
                                this.tilFormsOrangDatangKeCabang.get(3).setBackgroundResource(2131230870);
                                editText = editText2;
                                linearLayout2 = linearLayout;
                                continue;
                            case 2131297137:
                                this.tvErrorsOrangDatangKeCabang.get(2).setVisibility(0);
                                this.tvErrorsOrangDatangKeCabang.get(2).setText(message);
                                this.tilFormsOrangDatangKeCabang.get(2).setBackgroundResource(2131230870);
                                editText = editText2;
                                linearLayout2 = linearLayout;
                                continue;
                            case 2131297142:
                                this.tvErrorsPenerima.get(0).setVisibility(0);
                                this.tvErrorsPenerima.get(0).setText(message);
                                this.tilFormsPenerima.get(0).setBackgroundResource(2131230870);
                                editText = editText2;
                                linearLayout2 = linearLayout;
                                continue;
                            case 2131297143:
                                this.tvErrorsPenerima.get(1).setVisibility(0);
                                this.tvErrorsPenerima.get(1).setText(message);
                                this.tilFormsPenerima.get(1).setBackgroundResource(2131230870);
                                editText = editText2;
                                linearLayout2 = linearLayout;
                                continue;
                            case 2131297144:
                                this.tvErrorsPenerima.get(2).setVisibility(0);
                                this.tvErrorsPenerima.get(2).setText(message);
                                this.tilFormsPenerima.get(2).setBackgroundResource(2131230870);
                                editText = editText2;
                                linearLayout2 = linearLayout;
                                continue;
                            case 2131297147:
                                this.tvErrorsPengirim.get(4).setVisibility(0);
                                this.tvErrorsPengirim.get(4).setText(message);
                                this.tilFormsPengirim.get(4).setBackgroundResource(2131230870);
                                editText = editText2;
                                linearLayout2 = linearLayout;
                                continue;
                            case 2131297149:
                                this.tvErrorsPengirim.get(2).setVisibility(0);
                                this.tvErrorsPengirim.get(2).setText(message);
                                this.tilFormsPengirim.get(2).setBackgroundResource(2131230870);
                                editText = editText2;
                                linearLayout2 = linearLayout;
                                continue;
                            case 2131297150:
                                this.tvErrorsPengirim.get(5).setVisibility(0);
                                this.tvErrorsPengirim.get(5).setText(message);
                                this.tilFormsPengirim.get(5).setBackgroundResource(2131230870);
                                editText = editText2;
                                linearLayout2 = linearLayout;
                                continue;
                            case 2131297151:
                                this.tvErrorsPengirim.get(1).setVisibility(0);
                                this.tvErrorsPengirim.get(1).setText(message);
                                this.tilFormsPengirim.get(1).setBackgroundResource(2131230870);
                                editText = editText2;
                                linearLayout2 = linearLayout;
                                continue;
                            case 2131297153:
                                this.tvErrorsPengirim.get(6).setVisibility(0);
                                this.tvErrorsPengirim.get(6).setText(message);
                                this.tilFormsPengirim.get(6).setBackgroundResource(2131230870);
                                editText = editText2;
                                linearLayout2 = linearLayout;
                                continue;
                            case 2131297154:
                                this.tvErrorsPengirim.get(7).setVisibility(0);
                                this.tvErrorsPengirim.get(7).setText(message);
                                this.tilFormsPengirim.get(7).setBackgroundResource(2131230870);
                                editText = editText2;
                                linearLayout2 = linearLayout;
                                continue;
                            case 2131297178:
                                this.tvErrorSetiapBeberapaHari.setVisibility(0);
                                this.tvErrorSetiapBeberapaHari.setText(message);
                                this.tilSetiapBeberapaHari.setBackgroundResource(2131230870);
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
                if (((FormTellerActivity) getActivity()).f.getFlagDaftarTransfer().equalsIgnoreCase("Y")) {
                    i();
                } else {
                    a();
                }
            }

            @Override // androidx.fragment.app.Fragment
            public void onViewCreated(View view, Bundle bundle) {
                onViewCreated(view, bundle);
                setHasOptionsMenu(true);
                documentProvider.b().c(this);
                this.c = Realm.getDefaultInstance();
                int i = 0;
                ((FormTellerActivity) getActivity()).rlToolbar.setVisibility(0);
                ((FormTellerActivity) getActivity()).llMainIndicator.setVisibility(0);
                CheckDaftarTransferPresenter checkDaftarTransferPresenter = new CheckDaftarTransferPresenter();
                this.h = checkDaftarTransferPresenter;
                checkDaftarTransferPresenter.c = this;
                Validator validator = new Validator(this);
                this.i = validator;
                validator.setValidationListener(this);
                this.i.validateInvisibleViews(true);
                ((FormTellerActivity) getActivity()).f.setCurrentPage("ReviewSetoranFragment");
                this.etNamaPenerima.setFilters(new InputFilter[]{new getAnnualFeeAddOnDisplayAmount(getResources().getString(2131822495)), new InputFilter.LengthFilter(30)});
                this.etNoRekPenerima.setFilters(new InputFilter[]{new getAnnualFeeAddOnDisplayAmount(getResources().getString(2131820714)), new InputFilter.LengthFilter(10)});
                this.etNamaPenerima.setText(((FormTellerActivity) getActivity()).f.getReceiverName());
                this.etNoRekPenerima.setText(((FormTellerActivity) getActivity()).f.getReceiverAccount());
                this.etSimpanNama.setText(((FormTellerActivity) getActivity()).f.getReceiverAlias());
                if (!((FormTellerActivity) getActivity()).f.getFlagDaftarTransfer().equalsIgnoreCase("Y")) {
                    this.tilSimpanNama.setVisibility(8);
                    this.i.removeRules(this.etSimpanNama);
                } else {
                    this.i.put(this.etSimpanNama, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.ReviewSetoranFragment.5
                        /* renamed from: c */
                        public boolean isValid(EditText editText) {
                            if (editText.getText().toString().isEmpty()) {
                                return false;
                            }
                            for (DaftarTransfer daftarTransfer : ReviewSetoranFragment.this.f) {
                                if (daftarTransfer.getAliasName().equalsIgnoreCase(ReviewSetoranFragment.this.etSimpanNama.getText().toString()) && daftarTransfer.getAccountName().equalsIgnoreCase(ReviewSetoranFragment.this.etNamaPenerima.getText().toString())) {
                                    return false;
                                }
                            }
                            return true;
                        }

                        public final String getMessage(Context context) {
                            return ReviewSetoranFragment.this.etSimpanNama.getText().toString().isEmpty() ? ReviewSetoranFragment.this.getString(2131820999) : ReviewSetoranFragment.this.getString(2131820764);
                        }
                    });
                }
                this.etBeritaSetoran.setFilters(new InputFilter[]{new getAnnualFeeAddOnDisplayAmount(getResources().getString(2131822496)), new InputFilter.LengthFilter(60)});
                String txnAmount = ((FormTellerActivity) getActivity()).f.getTxnAmount();
                EditText editText = this.etJumlahSetoran;
                StringBuilder sb = new StringBuilder();
                sb.append(getPromotion.g(txnAmount));
                sb.append(" IDR");
                editText.setText(sb.toString());
                this.etBeritaSetoran.setText(((FormTellerActivity) getActivity()).f.getTxnNotes());
                this.etBeritaSetoran.setOnTouchListener(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01cf: INVOKE  
                      (wrap: android.widget.EditText : 0x01c5: IGET  (r0v60 android.widget.EditText A[REMOVE]) = (r10v0 'this' com.bca.smartbranch.fragment.ReviewSetoranFragment A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.fragment.ReviewSetoranFragment.etBeritaSetoran android.widget.EditText)
                      (wrap: o.getPromotion$4 : 0x01cc: CONSTRUCTOR  (r1v47 o.getPromotion$4 A[REMOVE]) =  call: o.getPromotion.4.<init>():void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.view.View.setOnTouchListener(android.view.View$OnTouchListener):void in method: com.bca.smartbranch.fragment.ReviewSetoranFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/ReviewSetoranFragment.class
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.getPromotion, state: GENERATED_AND_UNLOADED
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
                // Method dump skipped, instructions count: 3919
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.ReviewSetoranFragment.onViewCreated(android.view.View, android.os.Bundle):void");
            }

            @OnClick({2131298902, 2131297342})
            public void showDataOrangDatangKeCabang(View view) {
                getPromotion.d(getActivity());
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataOrangDatangKeCabang.getBackground();
                transitionDrawable.setCrossFadeEnabled(true);
                if (this.llLayoutDataOrangDatangKeCabang.getVisibility() == 8) {
                    this.g.c(this.llLayoutDataOrangDatangKeCabang);
                    setMessage setmessage = this.g;
                    ImageView imageView = this.ivDataOrangDatangKeCabang;
                    setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                    transitionDrawable.startTransition(0);
                    return;
                }
                setMessage setmessage2 = this.g;
                LinearLayout linearLayout = this.llLayoutDataOrangDatangKeCabang;
                setmessage2.a = linearLayout.getMeasuredHeight();
                setmessage2.b = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                      (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                      (r0v11 'setmessage2' o.setMessage)
                     o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.ReviewSetoranFragment.showDataOrangDatangKeCabang(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/ReviewSetoranFragment.class
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
                    android.widget.LinearLayout r0 = r0.llHeaderDataOrangDatangKeCabang
                    android.graphics.drawable.Drawable r0 = r0.getBackground()
                    android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                    r11 = r0
                    r0 = r11
                    r1 = 1
                    r0.setCrossFadeEnabled(r1)
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.llLayoutDataOrangDatangKeCabang
                    int r0 = r0.getVisibility()
                    r1 = 8
                    if (r0 != r1) goto L_0x005a
                    r0 = r10
                    o.setMessage r0 = r0.g
                    r1 = r10
                    android.widget.LinearLayout r1 = r1.llLayoutDataOrangDatangKeCabang
                    r0.c(r1)
                    r0 = r10
                    o.setMessage r0 = r0.g
                    r12 = r0
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivDataOrangDatangKeCabang
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
                    o.setMessage r0 = r0.g
                    r13 = r0
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.llLayoutDataOrangDatangKeCabang
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
                    o.setMessage r0 = r0.g
                    r13 = r0
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivDataOrangDatangKeCabang
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
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.ReviewSetoranFragment.showDataOrangDatangKeCabang(android.view.View):void");
            }

            @OnClick({2131298904, 2131297344})
            public void showDataPenerima(View view) {
                getPromotion.d(getActivity());
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataPenerima.getBackground();
                transitionDrawable.setCrossFadeEnabled(true);
                if (this.llLayoutDataPenerima.getVisibility() == 8) {
                    this.g.c(this.llLayoutDataPenerima);
                    setMessage setmessage = this.g;
                    ImageView imageView = this.ivDataPenerima;
                    setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                    transitionDrawable.startTransition(0);
                    return;
                }
                setMessage setmessage2 = this.g;
                LinearLayout linearLayout = this.llLayoutDataPenerima;
                setmessage2.a = linearLayout.getMeasuredHeight();
                setmessage2.b = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                      (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                      (r0v11 'setmessage2' o.setMessage)
                     o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.ReviewSetoranFragment.showDataPenerima(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/ReviewSetoranFragment.class
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
                    android.widget.LinearLayout r0 = r0.llHeaderDataPenerima
                    android.graphics.drawable.Drawable r0 = r0.getBackground()
                    android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                    r11 = r0
                    r0 = r11
                    r1 = 1
                    r0.setCrossFadeEnabled(r1)
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.llLayoutDataPenerima
                    int r0 = r0.getVisibility()
                    r1 = 8
                    if (r0 != r1) goto L_0x005a
                    r0 = r10
                    o.setMessage r0 = r0.g
                    r1 = r10
                    android.widget.LinearLayout r1 = r1.llLayoutDataPenerima
                    r0.c(r1)
                    r0 = r10
                    o.setMessage r0 = r0.g
                    r12 = r0
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivDataPenerima
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
                    o.setMessage r0 = r0.g
                    r12 = r0
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.llLayoutDataPenerima
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
                    o.setMessage r0 = r0.g
                    r12 = r0
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivDataPenerima
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
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.ReviewSetoranFragment.showDataPenerima(android.view.View):void");
            }

            @OnClick({2131298910, 2131297350})
            public void showDataPengirim(View view) {
                getPromotion.d(getActivity());
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderPengirim.getBackground();
                transitionDrawable.setCrossFadeEnabled(true);
                if (this.llLayoutPengirim.getVisibility() == 8) {
                    this.g.c(this.llLayoutPengirim);
                    setMessage setmessage = this.g;
                    ImageView imageView = this.ivPengirim;
                    setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                    transitionDrawable.startTransition(0);
                    return;
                }
                setMessage setmessage2 = this.g;
                LinearLayout linearLayout = this.llLayoutPengirim;
                setmessage2.a = linearLayout.getMeasuredHeight();
                setmessage2.b = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                      (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                      (r0v11 'setmessage2' o.setMessage)
                     o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.ReviewSetoranFragment.showDataPengirim(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/ReviewSetoranFragment.class
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
                    android.widget.LinearLayout r0 = r0.llHeaderPengirim
                    android.graphics.drawable.Drawable r0 = r0.getBackground()
                    android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                    r11 = r0
                    r0 = r11
                    r1 = 1
                    r0.setCrossFadeEnabled(r1)
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.llLayoutPengirim
                    int r0 = r0.getVisibility()
                    r1 = 8
                    if (r0 != r1) goto L_0x005a
                    r0 = r10
                    o.setMessage r0 = r0.g
                    r1 = r10
                    android.widget.LinearLayout r1 = r1.llLayoutPengirim
                    r0.c(r1)
                    r0 = r10
                    o.setMessage r0 = r0.g
                    r12 = r0
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivPengirim
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
                    o.setMessage r0 = r0.g
                    r12 = r0
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.llLayoutPengirim
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
                    o.setMessage r0 = r0.g
                    r13 = r0
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivPengirim
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
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.ReviewSetoranFragment.showDataPengirim(android.view.View):void");
            }

            @OnClick({2131299693, 2131297420})
            public void showDataTransaksiBerkala(View view) {
                getPromotion.d(getActivity());
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderTransferBerkala.getBackground();
                transitionDrawable.setCrossFadeEnabled(true);
                if (this.llLayoutTransferBerkala.getVisibility() == 8) {
                    this.g.c(this.llLayoutTransferBerkala);
                    setMessage setmessage = this.g;
                    ImageView imageView = this.ivTransferBerkala;
                    setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                    transitionDrawable.startTransition(0);
                    return;
                }
                setMessage setmessage2 = this.g;
                LinearLayout linearLayout = this.llLayoutTransferBerkala;
                setmessage2.a = linearLayout.getMeasuredHeight();
                setmessage2.b = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                      (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                      (r0v11 'setmessage2' o.setMessage)
                     o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.ReviewSetoranFragment.showDataTransaksiBerkala(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/ReviewSetoranFragment.class
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
                    android.widget.LinearLayout r0 = r0.llHeaderTransferBerkala
                    android.graphics.drawable.Drawable r0 = r0.getBackground()
                    android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                    r11 = r0
                    r0 = r11
                    r1 = 1
                    r0.setCrossFadeEnabled(r1)
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.llLayoutTransferBerkala
                    int r0 = r0.getVisibility()
                    r1 = 8
                    if (r0 != r1) goto L_0x005a
                    r0 = r10
                    o.setMessage r0 = r0.g
                    r1 = r10
                    android.widget.LinearLayout r1 = r1.llLayoutTransferBerkala
                    r0.c(r1)
                    r0 = r10
                    o.setMessage r0 = r0.g
                    r12 = r0
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivTransferBerkala
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
                    o.setMessage r0 = r0.g
                    r13 = r0
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.llLayoutTransferBerkala
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
                    o.setMessage r0 = r0.g
                    r13 = r0
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivTransferBerkala
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
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.ReviewSetoranFragment.showDataTransaksiBerkala(android.view.View):void");
            }

            @OnClick({2131299691, 2131297419})
            public void showDataTransaksiSetoran(View view) {
                getPromotion.d(getActivity());
                TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderTransaksiSetoran.getBackground();
                transitionDrawable.setCrossFadeEnabled(true);
                if (this.llLayoutTransaksiSetoran.getVisibility() == 8) {
                    this.g.c(this.llLayoutTransaksiSetoran);
                    setMessage setmessage = this.g;
                    ImageView imageView = this.ivTransaksiSetoran;
                    setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                    transitionDrawable.startTransition(0);
                    return;
                }
                setMessage setmessage2 = this.g;
                LinearLayout linearLayout = this.llLayoutTransaksiSetoran;
                setmessage2.a = linearLayout.getMeasuredHeight();
                setmessage2.b = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                      (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                      (r0v11 'setmessage2' o.setMessage)
                     o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.ReviewSetoranFragment.showDataTransaksiSetoran(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/ReviewSetoranFragment.class
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
                    android.widget.LinearLayout r0 = r0.llHeaderTransaksiSetoran
                    android.graphics.drawable.Drawable r0 = r0.getBackground()
                    android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                    r11 = r0
                    r0 = r11
                    r1 = 1
                    r0.setCrossFadeEnabled(r1)
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.llLayoutTransaksiSetoran
                    int r0 = r0.getVisibility()
                    r1 = 8
                    if (r0 != r1) goto L_0x005a
                    r0 = r10
                    o.setMessage r0 = r0.g
                    r1 = r10
                    android.widget.LinearLayout r1 = r1.llLayoutTransaksiSetoran
                    r0.c(r1)
                    r0 = r10
                    o.setMessage r0 = r0.g
                    r12 = r0
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivTransaksiSetoran
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
                    o.setMessage r0 = r0.g
                    r12 = r0
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.llLayoutTransaksiSetoran
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
                    o.setMessage r0 = r0.g
                    r13 = r0
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivTransaksiSetoran
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
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.ReviewSetoranFragment.showDataTransaksiSetoran(android.view.View):void");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void subsriberChooseValueHariEvent(register register) {
                this.tvErrorSetiapBeberapaHari.setVisibility(8);
                this.tilSetiapBeberapaHari.setBackgroundResource(2131230847);
                this.etSetiapBeberapaHari.setText(this.arrayHari[register.d]);
                ((FormTellerActivity) getActivity()).f.setRecurringValue(String.valueOf(register.d + 1));
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void subsriberChooseValueSetiapTanggalEvent(onExitTransaction onexittransaction) {
                this.tvErrorSetiapBeberapaHari.setVisibility(8);
                this.tilSetiapBeberapaHari.setBackgroundResource(2131230847);
                this.etSetiapBeberapaHari.setText(onexittransaction.a);
                ((FormTellerActivity) getActivity()).f.setRecurringValue(onexittransaction.a);
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void sumberDanaEvent(ReservasiTellerOActivity_ViewBinding reservasiTellerOActivity_ViewBinding) {
                d(this.viewGroupPengirim.indexOf(this.etPengirimSumberDana));
                this.tilPengirimSumberDana.setHintEnabled(true);
                this.etPengirimSumberDana.setText(reservasiTellerOActivity_ViewBinding.a);
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void tujuanTransaksiEvent(SyaratKetentuanActivity syaratKetentuanActivity) {
                d(this.viewGroupPengirim.indexOf(this.etPengirimTujuanTransaksi));
                this.tilPengirimTujuanTransaksi.setHintEnabled(true);
                this.etPengirimTujuanTransaksi.setText(syaratKetentuanActivity.c);
            }

            @OnClick({2131297178, 2131297203})
            public void updateDaftarTransfer(View view) {
                int id = view.getId();
                if (id == 2131297178) {
                    String recurringVar = ((FormTellerActivity) getActivity()).f.getRecurringVar();
                    recurringVar.hashCode();
                    int hashCode = recurringVar.hashCode();
                    char c = 65535;
                    if (hashCode != -1990173661) {
                        if (hashCode != 2241808) {
                            if (hashCode == 122683404 && recurringVar.equals("Tanggal")) {
                                c = 2;
                            }
                        } else if (recurringVar.equals("Hari")) {
                            c = 1;
                        }
                    } else if (recurringVar.equals("Minggu")) {
                        c = 0;
                    }
                    if (c == 0) {
                        Bundle bundle = new Bundle();
                        bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etSetiapBeberapaHari.getText().toString());
                        HariDialog hariDialog = new HariDialog();
                        hariDialog.setArguments(bundle);
                        hariDialog.show(getFragmentManager(), "HariDialog");
                    } else if (c == 1) {
                        this.etSetiapBeberapaHari.setInputType(2);
                        this.etSetiapBeberapaHari.setFilters(new InputFilter[]{new getCardImageOrientation(1, 99)});
                        getPromotion.a(this.etSetiapBeberapaHari);
                    } else if (c == 2) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etSetiapBeberapaHari.getText().toString());
                        SetiapTanggalDialog setiapTanggalDialog = new SetiapTanggalDialog();
                        setiapTanggalDialog.setArguments(bundle2);
                        setiapTanggalDialog.show(getFragmentManager(), "SetiapTanggalDialog");
                    }
                } else if (id == 2131297203) {
                    Calendar instance = Calendar.getInstance();
                    showInfoValueTodayOR e = showInfoValueTodayOR.e(this, instance.get(1), instance.get(2), instance.get(5));
                    OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding = e.b;
                    Calendar calendar = (Calendar) instance.clone();
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    oR2PilihProductFragment_ViewBinding.e = calendar;
                    lewati lewati = e.d;
                    if (lewati != null) {
                        lewati.c.h();
                    }
                    int color = getResources().getColor(2131099765);
                    e.a = Color.argb(255, Color.red(color), Color.green(color), Color.blue(color));
                    e.show(getActivity().getFragmentManager(), "");
                }
            }
        }
