package com.bca.smartbranch.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.OutwardRemittanceFormActivity;
import com.bca.smartbranch.activity.PilihNegaraBagianActivity;
import com.bca.smartbranch.activity.PilihNegaraORActivity;
import com.bca.smartbranch.activity.PilihTujuanTransaksiORActivity;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.GetPPUNumberResponse;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.ErrorGetPpuNumberDialog;
import com.bca.smartbranch.dialog.HubunganKeuanganDialog;
import com.bca.smartbranch.dialog.JenisKodeBankDialog;
import com.bca.smartbranch.dialog.KategoriTujuanTransaksiORDialog;
import com.bca.smartbranch.dialog.KetentuanORDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.PilihRekeningSumberDanaDialog;
import com.bca.smartbranch.dialog.SumberDanaORDialog;
import com.bca.smartbranch.dialog.TipeNasabahDialog;
import com.bca.smartbranch.dialog.TipeTujuanTransaksiDialog;
import com.bca.smartbranch.fragment.OR6ReviewFragment;
import com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter;
import com.bca.smartbranch.presenter.GetPPUNumberPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.QuickRule;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import io.realm.Realm;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import o.CISNResponse$$Parcelable;
import o.ConfirmBCACardAdapter$ViewHolder;
import o.DetailTundaCCActivity_ViewBinding;
import o.DetailTundaTellerActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.PilihNegaraActivity;
import o.ReservasiROSuccessActivity;
import o.ReservasiTellerOActivity_ViewBinding;
import o.ReservasiTundaSuccessActivity;
import o.ResetAccountActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickOrangSamaDenganPemilik;
import o.clickedTermsCondition;
import o.copyWindowDataInto;
import o.documentProvider;
import o.getPromotion;
import o.getTxnDetail;
import o.onChooseNegara;
import o.onClickMinus;
import o.onClickUbahDataPengirim;
import o.onExitForm;
import o.onResultOk;
import o.setMessage;
import o.setReceiverNameOR;
import o.setTxnAmount;
import o.setTxnDetail;
import o.setTxnNotes;
import o.togglePINBaruConfirm;
import o.togglePINConfirm;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewFragment.class */
public class OR6ReviewFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, GetPPUNumberPresenter.read, AdapterView.OnItemClickListener, CheckDaftarTransferORPresenter.read {
    private DetailTundaCCActivity_ViewBinding a;
    private DetailTundaCCActivity_ViewBinding d;
    @BindView(2131296929)
    @NotEmpty(messageResId = 2131820726, sequence = 1, trim = true)
    EditText etAlamatBankPenerima;
    @BindView(2131296935)
    @NotEmpty(messageResId = 2131820797, sequence = 1, trim = true)
    EditText etAlamatPenerima;
    @BindView(2131296960)
    EditText etBeritaTransaksi;
    @BindView(2131296969)
    EditText etCodewordBankPenerima;
    @BindViews({2131297030, 2131297056, 2131296929, 2131297082, 2131297034, 2131296969, 2131297181})
    List<EditText> etFormsDataBankPenerima;
    @BindViews({2131297027})
    List<EditText> etFormsDataLainnya;
    @BindViews({2131297108, 2131297066, 2131297090, 2131297083, 2131296935, 2131297038, 2131297025, 2131297210, 2131297100, 2131297218, 2131297117})
    List<EditText> etFormsDataPenerima;
    @BindViews({2131297114, 2131297073, 2131297098})
    List<EditText> etFormsDataPengirim;
    @BindViews({2131297091, 2131297001, 2131297125, 2131297010, 2131297229, 2131297201, 2131296960, 2131296988, 2131296985, 2131297232})
    List<EditText> etFormsDataTransaksi;
    @BindView(2131296985)
    EditText etFullAmountTransaksi;
    @BindView(2131296988)
    EditText etHubunganKeuanganTransaksi;
    @BindView(2131297001)
    EditText etJenisMataUangTransaksi;
    @BindView(2131297002)
    EditText etJenisProdukTransaksi;
    @BindView(2131297010)
    @NotEmpty(messageResId = 2131820825, sequence = 1, trim = true)
    EditText etKategoriTransaksi;
    @BindView(2131297181)
    @NotEmpty(messageResId = 2131820998, sequence = 1, trim = true)
    EditText etKeteranganAlamatBankPenerima;
    @BindView(2131297025)
    @NotEmpty(messageResId = 2131820977, sequence = 1, trim = true)
    EditText etKodePosPenerima;
    @BindView(2131297027)
    @NotEmpty(messageResId = 2131820890)
    EditText etKodePromosi;
    @BindView(2131297030)
    @NotEmpty(messageResId = 2131820832, sequence = 1, trim = true)
    @Length(messageResId = 2131820833, min = 8, sequence = 2)
    AutoCompleteTextView etKodeSwiftBankPenerima;
    @BindView(2131297034)
    @NotEmpty(messageResId = 2131820837, sequence = 1, trim = true)
    EditText etKotaBankPenerima;
    @BindView(2131297038)
    EditText etKotaPenerima;
    @BindView(2131297056)
    @NotEmpty(messageResId = 2131820850, sequence = 1, trim = true)
    EditText etNamaBankPenerima;
    @BindView(2131297066)
    @NotEmpty(messageResId = 2131820861, sequence = 1, trim = true)
    AutoCompleteTextView etNamaPenerima;
    @BindView(2131297073)
    @NotEmpty(messageResId = 2131820867, sequence = 1, trim = true)
    EditText etNamaPengirim;
    @BindView(2131297082)
    @NotEmpty(messageResId = 2131820878, sequence = 1, trim = true)
    EditText etNegaraBagianBankPenerima;
    @BindView(2131297083)
    @NotEmpty(messageResId = 2131820879, sequence = 1, trim = true)
    EditText etNegaraBagianPenerima;
    @BindView(2131297090)
    @NotEmpty(messageResId = 2131820882, sequence = 1, trim = true)
    EditText etNegaraTujuanPenerima;
    @BindView(2131297091)
    EditText etNegaraTujuanTransaksi;
    @BindView(2131297098)
    @NotEmpty(messageResId = 2131820898, sequence = 1, trim = true)
    EditText etNoHpPengirim;
    @BindView(2131297100)
    @NotEmpty(messageResId = 2131820910, sequence = 1, trim = true)
    AutoCompleteTextView etNoIbanPenerima;
    @BindView(2131297117)
    @NotEmpty(messageResId = 2131820927, sequence = 1, trim = true)
    EditText etNoTelpPenerima;
    @BindView(2131297125)
    @NotEmpty(messageResId = 2131820906, sequence = 4, trim = true)
    CISNResponse$$Parcelable etNominalTransaksi;
    @BindView(2131297108)
    @NotEmpty(messageResId = 2131820951, sequence = 1, trim = true)
    AutoCompleteTextView etNorekPenerima;
    @BindView(2131297114)
    @NotEmpty(messageResId = 2131820949, sequence = 1, trim = true)
    @Length(messageResId = 2131820950, min = 10, sequence = 2)
    EditText etNorekPengirim;
    @BindView(2131297201)
    @NotEmpty(messageResId = 2131821006, sequence = 1, trim = true)
    EditText etSumberDanaTransaksi;
    @BindView(2131297210)
    EditText etTipeNasabahPenerima;
    @BindView(2131297218)
    @NotEmpty(messageResId = 2131821019, sequence = 1, trim = true)
    EditText etTipeTujuanTransaksiPenerima;
    @BindView(2131297229)
    @NotEmpty(messageResId = 2131821027, sequence = 1, trim = true)
    EditText etTujuanTransaksi;
    @BindView(2131297232)
    EditText etValueTodayTransaksi;
    private List<DaftarTransferResponse.DaftarTransferOutput> f;
    @BindView(2131297444)
    FrameLayout flLayoutDataBankPenerima;
    @BindView(2131297458)
    FrameLayout flLayoutDataLainnya;
    @BindView(2131297465)
    FrameLayout flLayoutDataPenerima;
    @BindView(2131297473)
    FrameLayout flLayoutDataPengirim;
    @BindView(2131297479)
    FrameLayout flLayoutDataTransaksi;
    private List<KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR> i;
    @BindView(2131297333)
    ImageView ivDataBankPenerima;
    @BindView(2131297340)
    ImageView ivDataLainnya;
    @BindView(2131297344)
    ImageView ivDataPenerima;
    @BindView(2131297350)
    ImageView ivDataPengirim;
    @BindView(2131297353)
    ImageView ivDataTransaksi;
    private CheckDaftarTransferORPresenter k;
    private Validator l;
    @BindView(2131297531)
    LinearLayout llAlamatPenerima;
    @BindView(2131297568)
    LinearLayout llCodewordBankPenerima;
    @BindView(2131297445)
    LinearLayout llDataBankPenerimaEditable;
    @BindView(2131297446)
    LinearLayout llDataBankPenerimaUneditable;
    @BindView(2131297459)
    LinearLayout llDataLainnyaEditable;
    @BindView(2131297460)
    LinearLayout llDataLainnyaUneditable;
    @BindView(2131297471)
    LinearLayout llDataPenerimaEditable;
    @BindView(2131297472)
    LinearLayout llDataPenerimaUneditable;
    @BindView(2131297474)
    LinearLayout llDataPengirimEditable;
    @BindView(2131297475)
    LinearLayout llDataPengirimUneditable;
    @BindView(2131297480)
    LinearLayout llDataTransaksiEditable;
    @BindView(2131297481)
    LinearLayout llDataTransaksiUneditable;
    @BindView(2131297651)
    LinearLayout llHeaderBankPenerima;
    @BindView(2131297662)
    LinearLayout llHeaderLainnya;
    @BindView(2131297674)
    LinearLayout llHeaderPenerima;
    @BindView(2131297675)
    LinearLayout llHeaderPengirim;
    @BindView(2131297677)
    LinearLayout llHeaderTransaksi;
    @BindView(2131297701)
    LinearLayout llJenisProdukDisabled;
    @BindView(2131297886)
    LinearLayout llKeteranganAlamatDisabled;
    @BindView(2131297732)
    LinearLayout llKodePosPenerima;
    @BindView(2131297733)
    LinearLayout llKodePosPenerimaDisabled;
    @BindView(2131297806)
    LinearLayout llNegaraBagianBankPenerima;
    @BindView(2131297807)
    LinearLayout llNegaraBagianBankPenerimaDisabled;
    @BindView(2131297808)
    LinearLayout llNegaraBagianPenerima;
    @BindView(2131297809)
    LinearLayout llNegaraBagianPenerimaDisabled;
    @BindView(2131297819)
    LinearLayout llNoIbanDisabled;
    @BindView(2131297824)
    LinearLayout llNoRekPenerimaDisabled;
    @BindView(2131297826)
    LinearLayout llNoTelpPenerimaDisabled;
    @BindView(2131297832)
    LinearLayout llNominalTransaksi;
    @BindView(2131297915)
    LinearLayout llTipeTujuanTransaksiDisabled;
    @BindView(2131297490)
    LinearLayout llWrapperDataBankPenerima;
    @BindView(2131297492)
    LinearLayout llWrapperDataLainnya;
    @BindView(2131297494)
    LinearLayout llWrapperDataPenerima;
    @BindView(2131297495)
    LinearLayout llWrapperDataPengirim;
    @BindView(2131297497)
    LinearLayout llWrapperDataTransaksi;
    private DetailTundaTellerActivity_ViewBinding m;
    private String n;

    /* renamed from: o */
    private GetPPUNumberPresenter f44o;
    private String p;
    private KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR r;
    private String s;
    @BindView(2131298420)
    ScrollView svMain;
    private int t;
    @BindView(2131298478)
    LogoutDialog_ViewBinding tilAlamatBankPenerima;
    @BindView(2131298484)
    LogoutDialog_ViewBinding tilAlamatPenerima;
    @BindView(2131298510)
    LogoutDialog_ViewBinding tilBeritaTransaksi;
    @BindView(2131298520)
    LogoutDialog_ViewBinding tilCodewordBankPenerima;
    @BindViews({2131298577, 2131298603, 2131298478, 2131298628, 2131298581, 2131298520, 2131298713})
    List<LogoutDialog_ViewBinding> tilFormDataBankPenerima;
    @BindViews({2131298574})
    List<LogoutDialog_ViewBinding> tilFormDataLainnya;
    @BindViews({2131298654, 2131298613, 2131298636, 2131298629, 2131298484, 2131298585, 2131298571, 2131298742, 2131298646, 2131298749, 2131298663})
    List<LogoutDialog_ViewBinding> tilFormDataPenerima;
    @BindViews({2131298660, 2131298619, 2131298644})
    List<LogoutDialog_ViewBinding> tilFormDataPengirim;
    @BindViews({2131298637, 2131298549, 2131298671, 2131298556, 2131298760, 2131298733, 2131298510, 2131298537, 2131298534, 2131298763})
    List<LogoutDialog_ViewBinding> tilFormDataTransaksi;
    @BindView(2131298534)
    LogoutDialog_ViewBinding tilFullAmountTransaksi;
    @BindView(2131298537)
    LogoutDialog_ViewBinding tilHubunganKeuanganTransaksi;
    @BindView(2131298549)
    LogoutDialog_ViewBinding tilJenisMataUangTransaksi;
    @BindView(2131298550)
    LogoutDialog_ViewBinding tilJenisProdukTransaksi;
    @BindView(2131298556)
    LogoutDialog_ViewBinding tilKategoriTransaksi;
    @BindView(2131298713)
    LogoutDialog_ViewBinding tilKeteranganAlamatBankPenerim;
    @BindView(2131298571)
    LogoutDialog_ViewBinding tilKodePosPenerima;
    @BindView(2131298574)
    LogoutDialog_ViewBinding tilKodePromosi;
    @BindView(2131298577)
    LogoutDialog_ViewBinding tilKodeSwiftBankPenerima;
    @BindView(2131298581)
    LogoutDialog_ViewBinding tilKotaBankPenerima;
    @BindView(2131298585)
    LogoutDialog_ViewBinding tilKotaPenerima;
    @BindView(2131298603)
    LogoutDialog_ViewBinding tilNamaBankPenerima;
    @BindView(2131298613)
    LogoutDialog_ViewBinding tilNamaPenerima;
    @BindView(2131298619)
    LogoutDialog_ViewBinding tilNamaPengirim;
    @BindView(2131298628)
    LogoutDialog_ViewBinding tilNegaraBagianBankPenerima;
    @BindView(2131298629)
    LogoutDialog_ViewBinding tilNegaraBagianPenerima;
    @BindView(2131298636)
    LogoutDialog_ViewBinding tilNegaraTujuanPenerima;
    @BindView(2131298637)
    LogoutDialog_ViewBinding tilNegaraTujuanTransaksi;
    @BindView(2131298644)
    LogoutDialog_ViewBinding tilNoHPPengirim;
    @BindView(2131298646)
    LogoutDialog_ViewBinding tilNoIbanPenerima;
    @BindView(2131298663)
    LogoutDialog_ViewBinding tilNoTelpPenerima;
    @BindView(2131298671)
    LogoutDialog_ViewBinding tilNominalTransaksi;
    @BindView(2131298654)
    LogoutDialog_ViewBinding tilNorekPenerima;
    @BindView(2131298660)
    LogoutDialog_ViewBinding tilNorekPengirim;
    @BindView(2131298733)
    LogoutDialog_ViewBinding tilSumberDanaTransaksi;
    @BindView(2131298742)
    LogoutDialog_ViewBinding tilTipeNasabahPenerima;
    @BindView(2131298749)
    LogoutDialog_ViewBinding tilTipeTujuanTransaksiPenerima;
    @BindView(2131298760)
    LogoutDialog_ViewBinding tilTujuanTransaksi;
    @BindView(2131298763)
    LogoutDialog_ViewBinding tilValueTodayTransaksi;
    @BindView(2131298814)
    TextView tvAlamatBankPenerima;
    @BindView(2131298819)
    TextView tvAlamatLengkapPenerima;
    @BindView(2131298853)
    TextView tvBeritaTransaksi;
    @BindView(2131298882)
    TextView tvCodewordBankPenerima;
    @BindViews({2131299053, 2131299080, 2131298958, 2131299104, 2131299057, 2131298999, 2131299181})
    List<TextView> tvErrorDataBankPenerima;
    @BindViews({2131299050})
    List<TextView> tvErrorDataLainnya;
    @BindViews({2131299127, 2131299089, 2131299111, 2131299105, 2131298963, 2131299061, 2131299048, 2131299210, 2131299120, 2131299218, 2131299136})
    List<TextView> tvErrorDataPenerima;
    @BindViews({2131299133, 2131299095, 2131299118})
    List<TextView> tvErrorDataPengirim;
    @BindViews({2131299112, 2131299025, 2131299143, 2131299033, 2131299231, 2131299201})
    List<TextView> tvErrorDataTransaksi;
    @BindView(2131299263)
    TextView tvFullAmountTransaksi;
    @BindView(2131299274)
    TextView tvHubunganKeuanganTransaksi;
    @BindView(2131299310)
    TextView tvJenisProduk;
    @BindView(2131299339)
    TextView tvKategoriTransaksi;
    @BindView(2131299570)
    TextView tvKeteranganAlamatBankPenerima;
    @BindView(2131299370)
    TextView tvKodePosPenerima;
    @BindView(2131299371)
    TextView tvKodePromosi;
    @BindView(2131299374)
    TextView tvKodeSwiftBankPenerima;
    @BindView(2131299376)
    TextView tvKotaBankPenerima;
    @BindView(2131299382)
    TextView tvKotaPenerima;
    @BindView(2131299309)
    TextView tvMataUangTransaksi;
    @BindView(2131299418)
    TextView tvNamaBankPenerima;
    @BindView(2131299427)
    TextView tvNamaPenerima;
    @BindView(2131299434)
    TextView tvNamaPengirim;
    @BindView(2131299443)
    TextView tvNegaraBagianBankPenerima;
    @BindView(2131299444)
    TextView tvNegaraBagianPenerima;
    @BindView(2131299450)
    TextView tvNegaraTujuanPenerima;
    @BindView(2131299451)
    TextView tvNegaraTujuanTransaksi;
    @BindView(2131299484)
    TextView tvNoHpPengirim;
    @BindView(2131299492)
    TextView tvNoIbanPenerima;
    @BindView(2131299494)
    TextView tvNoRekeningPenerima;
    @BindView(2131299478)
    TextView tvNoTelpPenerima;
    @BindView(2131299491)
    TextView tvNominalTransaksi;
    @BindView(2131299500)
    TextView tvNorekPengirim;
    @BindView(2131299591)
    TextView tvSumberDanaTransaksi;
    @BindView(2131299607)
    TextView tvTipeNasabahPenerima;
    @BindView(2131299614)
    TextView tvTipeTujuanTransaksiPenerima;
    @BindView(2131299696)
    TextView tvTujuanTransaksi;
    @BindView(2131299704)
    TextView tvUbahDataBankPenerima;
    @BindView(2131299711)
    TextView tvUbahDataLainnya;
    @BindView(2131299714)
    TextView tvUbahDataPenerima;
    @BindView(2131299720)
    TextView tvUbahDataPengirim;
    @BindView(2131299722)
    TextView tvUbahDataTransaksi;
    @BindView(2131299733)
    TextView tvValueTodayTransaksi;
    @BindViews({2131297030, 2131297056, 2131296929, 2131297082, 2131297034, 2131296969, 2131297181})
    public List<View> viewGroupDataBankPenerima;
    @BindViews({2131297027})
    public List<View> viewGroupDataLainnya;
    @BindViews({2131297108, 2131297066, 2131297090, 2131297083, 2131296935, 2131297038, 2131297025, 2131297210, 2131297100, 2131297218, 2131297117})
    public List<View> viewGroupDataPenerima;
    @BindViews({2131297114, 2131297073, 2131297098})
    public List<View> viewGroupDataPengirim;
    @BindViews({2131297091, 2131297001, 2131297125, 2131297010, 2131297229, 2131297201, 2131296960, 2131296988, 2131296985, 2131297232})
    public List<View> viewGroupDataTransaksi;
    private int x;
    private String y;
    private setMessage g = new setMessage();
    private String q = "";
    private int u = 6;
    private List<DaftarTransferResponse.DaftarTransferOutput> h = new ArrayList();
    private List<DaftarTransferResponse.DaftarTransferOutput> j = new ArrayList();

    private static void a(int i, LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
        try {
            Field declaredField = logoutDialog_ViewBinding.getClass().getDeclaredField("focusedTextColor");
            declaredField.setAccessible(true);
            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[0]}, new int[]{i});
            declaredField.set(logoutDialog_ViewBinding, colorStateList);
            Field declaredField2 = LogoutDialog_ViewBinding.class.getDeclaredField("g");
            declaredField2.setAccessible(true);
            declaredField2.set(logoutDialog_ViewBinding, colorStateList);
            Method declaredMethod = logoutDialog_ViewBinding.getClass().getDeclaredMethod("updateLabelState", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(logoutDialog_ViewBinding, Boolean.TRUE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(EditText editText) {
        this.tvErrorDataPenerima.get(this.viewGroupDataPenerima.indexOf(editText)).setVisibility(8);
        this.tilFormDataPenerima.get(this.viewGroupDataPenerima.indexOf(editText)).setBackgroundResource(2131230847);
    }

    private void b() {
        GetPPUNumberPresenter getPPUNumberPresenter = this.f44o;
        String e = getPromotion.e(this.e);
        getPPUNumberPresenter.b.u();
        Call<OpenAccountSuccessActivity<GetPPUNumberResponse>> j = getPPUNumberPresenter.apiService.j(e);
        getPPUNumberPresenter.c = j;
        j.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: INVOKE  
              (r0v9 'j' retrofit2.Call<o.OpenAccountSuccessActivity<com.bca.smartbranch.data.api.response.GetPPUNumberResponse>>)
              (wrap: com.bca.smartbranch.presenter.GetPPUNumberPresenter$1 : 0x002c: CONSTRUCTOR  (r1v2 com.bca.smartbranch.presenter.GetPPUNumberPresenter$1 A[REMOVE]) = (r0v1 'getPPUNumberPresenter' com.bca.smartbranch.presenter.GetPPUNumberPresenter) call: com.bca.smartbranch.presenter.GetPPUNumberPresenter.1.<init>(com.bca.smartbranch.presenter.GetPPUNumberPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.fragment.OR6ReviewFragment.b():void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewFragment.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetPPUNumberPresenter, state: GENERATED_AND_UNLOADED
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
            this = this;
            r0 = r5
            com.bca.smartbranch.presenter.GetPPUNumberPresenter r0 = r0.f44o
            r6 = r0
            r0 = r5
            com.bca.smartbranch.data.localdb.User r0 = r0.e
            java.lang.String r0 = o.getPromotion.e(r0)
            r7 = r0
            r0 = r6
            com.bca.smartbranch.presenter.GetPPUNumberPresenter$read r0 = r0.b
            r0.u()
            r0 = r6
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r7
            retrofit2.Call r0 = r0.j(r1)
            r7 = r0
            r0 = r6
            r1 = r7
            r0.c = r1
            r0 = r7
            com.bca.smartbranch.presenter.GetPPUNumberPresenter$1 r1 = new com.bca.smartbranch.presenter.GetPPUNumberPresenter$1
            r2 = r1
            r3 = r6
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewFragment.b():void");
    }

    private void b(EditText editText) {
        this.tvErrorDataPengirim.get(this.viewGroupDataPengirim.indexOf(editText)).setVisibility(8);
        this.tilFormDataPengirim.get(this.viewGroupDataPengirim.indexOf(editText)).setBackgroundResource(2131230847);
    }

    private void c(EditText editText) {
        this.tvErrorDataBankPenerima.get(this.viewGroupDataBankPenerima.indexOf(editText)).setVisibility(8);
        this.tilFormDataBankPenerima.get(this.viewGroupDataBankPenerima.indexOf(editText)).setBackgroundResource(2131230847);
    }

    private void d() {
        this.tvKodeSwiftBankPenerima.setText(this.etKodeSwiftBankPenerima.getText().toString());
        this.tvNamaBankPenerima.setText(this.etNamaBankPenerima.getText().toString());
        this.tvAlamatBankPenerima.setText(this.etAlamatBankPenerima.getText().toString());
        this.tvNegaraBagianBankPenerima.setText(this.etNegaraBagianBankPenerima.getText().toString());
        this.tvKotaBankPenerima.setText(this.etKotaBankPenerima.getText().toString());
        this.tvCodewordBankPenerima.setText(this.etCodewordBankPenerima.getText().toString());
        this.tvKeteranganAlamatBankPenerima.setText(this.etKeteranganAlamatBankPenerima.getText().toString());
        if (((OutwardRemittanceFormActivity) getActivity()).n.getNegaraBagianBankPenerima().isEmpty()) {
            this.llNegaraBagianBankPenerimaDisabled.setVisibility(8);
        }
        if (!((OutwardRemittanceFormActivity) getActivity()).n.getFlagAlamatBankPenerimaBelumSesuai().equals("Y")) {
            this.llDataBankPenerimaUneditable.removeView(this.llKeteranganAlamatDisabled);
        }
        for (int i = 0; i < this.llDataBankPenerimaUneditable.getChildCount(); i++) {
            View childAt = this.llDataBankPenerimaUneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    private void d(final EditText editText, final int i) {
        StringBuilder sb = new StringBuilder("Kode Kliring Lokal harus ");
        sb.append(i);
        sb.append(" karakter");
        final String obj = sb.toString();
        this.l.put(editText, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment.1
            private boolean e() {
                return !editText.getText().toString().isEmpty() && editText.getText().toString().length() >= i;
            }

            public final String getMessage(Context context) {
                return editText.getText().toString().isEmpty() ? context.getString(2131820763) : obj;
            }

            public final /* synthetic */ boolean isValid(View view) {
                return e();
            }

            public final /* synthetic */ boolean isValid(Object obj2) {
                return e();
            }
        });
    }

    private void e() {
        this.tilNamaBankPenerima.setHintTextAppearance(2131886848);
        this.tilNegaraBagianBankPenerima.setHintTextAppearance(2131886848);
        this.tilAlamatBankPenerima.setHintTextAppearance(2131886848);
        this.tilKotaBankPenerima.setHintTextAppearance(2131886848);
        a(getResources().getColor(2131099740), this.tilNamaBankPenerima);
        a(getResources().getColor(2131099740), this.tilNegaraBagianBankPenerima);
        a(getResources().getColor(2131099740), this.tilAlamatBankPenerima);
        a(getResources().getColor(2131099740), this.tilKotaBankPenerima);
        this.etNamaBankPenerima.setTextColor(getResources().getColor(2131099773));
        this.etNegaraBagianBankPenerima.setTextColor(getResources().getColor(2131099773));
        this.etAlamatBankPenerima.setTextColor(getResources().getColor(2131099773));
        this.etKotaBankPenerima.setTextColor(getResources().getColor(2131099773));
        this.etNamaBankPenerima.setEnabled(false);
        this.etNegaraBagianBankPenerima.setEnabled(false);
        this.etAlamatBankPenerima.setEnabled(false);
        this.etKotaBankPenerima.setEnabled(false);
    }

    private void f() {
        this.tvNorekPengirim.setText(this.etNorekPengirim.getText().toString());
        this.tvNamaPengirim.setText(this.etNamaPengirim.getText().toString());
        this.tvNoHpPengirim.setText(this.etNoHpPengirim.getText().toString());
        for (int i = 0; i < this.llDataPengirimUneditable.getChildCount(); i++) {
            View childAt = this.llDataPengirimUneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    private void i() {
        this.tvKodePromosi.setText(this.etKodePromosi.getText().toString());
        for (int i = 0; i < this.llDataLainnyaUneditable.getChildCount(); i++) {
            View childAt = this.llDataLainnyaUneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    private void j() {
        this.tvNoRekeningPenerima.setText(this.etNorekPenerima.getText().toString());
        this.tvNoIbanPenerima.setText(this.etNoIbanPenerima.getText().toString());
        this.tvNamaPenerima.setText(this.etNamaPenerima.getText().toString());
        this.tvNoTelpPenerima.setText(this.etNoTelpPenerima.getText().toString());
        this.tvNegaraTujuanPenerima.setText(this.etNegaraTujuanPenerima.getText().toString());
        this.tvAlamatLengkapPenerima.setText(this.etAlamatPenerima.getText().toString());
        this.tvKotaPenerima.setText(this.etKotaPenerima.getText().toString());
        this.tvNegaraBagianPenerima.setText(this.etNegaraBagianPenerima.getText().toString());
        this.tvKodePosPenerima.setText(this.etKodePosPenerima.getText().toString());
        this.tvTipeNasabahPenerima.setText(this.etTipeNasabahPenerima.getText().toString());
        this.tvTipeTujuanTransaksiPenerima.setText(this.etTipeTujuanTransaksiPenerima.getText().toString());
        if (((OutwardRemittanceFormActivity) getActivity()).n.isFlagIBAN()) {
            this.llDataPenerimaUneditable.removeView(this.llNoRekPenerimaDisabled);
        } else {
            this.llDataPenerimaUneditable.removeView(this.llNoIbanDisabled);
        }
        if (this.etNegaraBagianPenerima.getText().toString().isEmpty()) {
            this.llDataPenerimaUneditable.removeView(this.llNegaraBagianPenerimaDisabled);
        }
        if (this.etKodePosPenerima.getText().toString().isEmpty()) {
            this.llKodePosPenerimaDisabled.setVisibility(8);
        }
        if (this.etTipeTujuanTransaksiPenerima.getText().toString().isEmpty()) {
            this.llDataPenerimaUneditable.removeView(this.llTipeTujuanTransaksiDisabled);
        }
        if (this.tilNoTelpPenerima.getVisibility() == 8) {
            this.llDataPenerimaUneditable.removeView(this.llNoTelpPenerimaDisabled);
        }
        for (int i = 0; i < this.llDataPenerimaUneditable.getChildCount(); i++) {
            View childAt = this.llDataPenerimaUneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
        }
    }

    private void l() {
        char c;
        int i;
        this.tvNegaraTujuanTransaksi.setText(this.etNegaraTujuanTransaksi.getText().toString());
        this.tvMataUangTransaksi.setText(this.etJenisMataUangTransaksi.getText().toString());
        TextView textView = this.tvNominalTransaksi;
        StringBuilder sb = new StringBuilder();
        sb.append(this.etNominalTransaksi.getText().toString());
        sb.append(" ");
        sb.append(this.tvMataUangTransaksi.getText().toString().substring(0, 3));
        textView.setText(sb.toString());
        this.tvFullAmountTransaksi.setText(this.etFullAmountTransaksi.getText().toString());
        this.tvValueTodayTransaksi.setText(this.etValueTodayTransaksi.getText().toString());
        String typeOfProduct = ((OutwardRemittanceFormActivity) getActivity()).n.getTypeOfProduct();
        typeOfProduct.hashCode();
        int hashCode = typeOfProduct.hashCode();
        if (hashCode == 52) {
            if (typeOfProduct.equals("4")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 70) {
            if (typeOfProduct.equals("F")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode == 79) {
            if (typeOfProduct.equals("O")) {
                c = 4;
            }
            c = 65535;
        } else if (hashCode != 76) {
            if (hashCode == 77 && typeOfProduct.equals("M")) {
                c = 3;
            }
            c = 65535;
        } else {
            if (typeOfProduct.equals("L")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            this.tvJenisProduk.setText(2131822093);
            this.etJenisProdukTransaksi.setText(2131822093);
        } else if (c == 1) {
            this.tvJenisProduk.setText(2131821362);
            this.etJenisProdukTransaksi.setText(2131821362);
        } else if (c == 2) {
            this.tvJenisProduk.setText(2131821871);
            this.etJenisProdukTransaksi.setText(2131821871);
        } else if (c == 3) {
            this.tvJenisProduk.setText(2131821916);
            this.etJenisProdukTransaksi.setText(2131821916);
        } else if (c == 4) {
            this.llDataTransaksiUneditable.removeView(this.llJenisProdukDisabled);
            this.tilJenisProdukTransaksi.setVisibility(8);
        }
        this.tvKategoriTransaksi.setText(this.etKategoriTransaksi.getText().toString());
        this.tvTujuanTransaksi.setText(this.etTujuanTransaksi.getText().toString());
        this.tvSumberDanaTransaksi.setText(this.etSumberDanaTransaksi.getText().toString());
        this.tvBeritaTransaksi.setText(this.etBeritaTransaksi.getText().toString());
        this.tvHubunganKeuanganTransaksi.setText(this.etHubunganKeuanganTransaksi.getText().toString());
        if (((OutwardRemittanceFormActivity) getActivity()).v.equals("O")) {
            this.tilJenisMataUangTransaksi.setHintTextAppearance(2131886848);
            this.tilFullAmountTransaksi.setHintTextAppearance(2131886848);
            this.tilValueTodayTransaksi.setHintTextAppearance(2131886848);
            a(getResources().getColor(2131099740), this.tilJenisMataUangTransaksi);
            a(getResources().getColor(2131099740), this.tilFullAmountTransaksi);
            a(getResources().getColor(2131099740), this.tilValueTodayTransaksi);
            this.etJenisMataUangTransaksi.setTextColor(getResources().getColor(2131099773));
            this.etFullAmountTransaksi.setTextColor(getResources().getColor(2131099773));
            this.etValueTodayTransaksi.setTextColor(getResources().getColor(2131099773));
            this.etJenisMataUangTransaksi.setEnabled(false);
            this.etFullAmountTransaksi.setEnabled(false);
            this.etValueTodayTransaksi.setEnabled(false);
            i = 0;
        } else {
            i = 0;
            if (((OutwardRemittanceFormActivity) getActivity()).v.equals("M")) {
                this.tilJenisMataUangTransaksi.setHintTextAppearance(2131886848);
                a(getResources().getColor(2131099740), this.tilJenisMataUangTransaksi);
                this.etJenisMataUangTransaksi.setTextColor(getResources().getColor(2131099773));
                this.etJenisMataUangTransaksi.setEnabled(false);
                i = 0;
            }
        }
        while (i < this.llDataTransaksiUneditable.getChildCount()) {
            View childAt = this.llDataTransaksiUneditable.getChildAt(i);
            if (i % 2 != 0) {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099820));
            } else {
                childAt.setBackgroundColor(copyWindowDataInto.a(getContext(), 2131099821));
            }
            i++;
        }
    }

    private void m() {
        for (TextView textView : this.tvErrorDataPengirim) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilFormDataPengirim) {
            logoutDialog_ViewBinding.setBackgroundResource(2131231360);
        }
        for (TextView textView2 : this.tvErrorDataTransaksi) {
            textView2.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding2 : this.tilFormDataTransaksi) {
            logoutDialog_ViewBinding2.setBackgroundResource(2131231360);
        }
        this.tilFormDataTransaksi.get(2).setBackgroundResource(2131230847);
        this.llNominalTransaksi.setBackgroundResource(2131230853);
        for (TextView textView3 : this.tvErrorDataBankPenerima) {
            textView3.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding3 : this.tilFormDataBankPenerima) {
            logoutDialog_ViewBinding3.setBackgroundResource(2131231360);
        }
        for (TextView textView4 : this.tvErrorDataPenerima) {
            textView4.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding4 : this.tilFormDataPenerima) {
            logoutDialog_ViewBinding4.setBackgroundResource(2131231360);
        }
    }

    private void n() {
        if (!((OutwardRemittanceFormActivity) getActivity()).n.getFlagSimpanDaftarTransferPenerima().equals("Y") || ((OutwardRemittanceFormActivity) getActivity()).n.getFlagUpdateDaftarTransferPenerima()) {
            ((OutwardRemittanceFormActivity) getActivity()).q = 0;
            new KetentuanORDialog().show(getFragmentManager(), "KetentuanORDialog");
            return;
        }
        String str = "";
        String email = this.e != null ? this.e.getEmail() : "";
        String imei = this.e != null ? this.e.getImei() : "";
        if (this.e != null) {
            str = this.e.getSessionId();
        }
        onResultOk onresultok = new onResultOk();
        onresultok.b = email;
        onresultok.a = imei;
        onresultok.e = str;
        onresultok.c = "Transfer Valuta Asing";
        if (((OutwardRemittanceFormActivity) getActivity()).n.isFlagIBAN()) {
            this.k.d(this.e, "Transfer Valuta Asing", this.etNoIbanPenerima.getText().toString(), "Y");
        } else {
            this.k.d(this.e, "Transfer Valuta Asing", this.etNorekPenerima.getText().toString(), "N");
        }
    }

    private void o() {
        ((OutwardRemittanceFormActivity) getActivity()).n.setNorekPengirim(this.etNorekPengirim.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setNamaPengirim(this.etNamaPengirim.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setNoHpPengirim(this.etNoHpPengirim.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setNominalTransaksi(getPromotion.j(this.etNominalTransaksi.getText().toString()));
        ((OutwardRemittanceFormActivity) getActivity()).n.setBeritaTransaksi(this.etBeritaTransaksi.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setKategoriTujuanTransaksiKode(this.r.getCategorySttCode());
        ((OutwardRemittanceFormActivity) getActivity()).n.setKategoriTujuanTransaksi(this.r.getCategorySttDesc());
        ((OutwardRemittanceFormActivity) getActivity()).n.setTujuanTransaksi(this.etTujuanTransaksi.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setTujuanTransaksiKode(this.y);
        ((OutwardRemittanceFormActivity) getActivity()).n.setSumberDanaTransaksi(this.etSumberDanaTransaksi.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setSumberDanaTransaksiKode(this.p);
        ((OutwardRemittanceFormActivity) getActivity()).n.setFlagHubunganKeuanganTransaksi(this.etHubunganKeuanganTransaksi.getText().toString().equalsIgnoreCase("Ya") ? "A" : "N");
        ((OutwardRemittanceFormActivity) getActivity()).n.setCodewordBankPenerima(this.etCodewordBankPenerima.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setKeteranganAlamatBankPenerima(this.etKeteranganAlamatBankPenerima.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setNorekPenerima(this.etNorekPenerima.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setNamaPenerima(this.etNamaPenerima.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setNoTelpPenerima(this.etNoTelpPenerima.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerima(this.etNegaraTujuanPenerima.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianPenerima(this.etNegaraBagianPenerima.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerimaISO(this.s);
        ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraBagianPenerimaCode(this.n);
        ((OutwardRemittanceFormActivity) getActivity()).n.setAlamatLengkapPenerima(this.etAlamatPenerima.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setKotaPenerima(this.etKotaPenerima.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setKodePosPenerima(this.etKodePosPenerima.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setNoIBANPenerima(this.etNoIbanPenerima.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setTipeNasabahPenerima(this.etTipeNasabahPenerima.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setTipeTujuanTransaksiPenerima(this.etTipeTujuanTransaksiPenerima.getText().toString());
        ((OutwardRemittanceFormActivity) getActivity()).n.setPromoCode(this.etKodePromosi.getText().toString());
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void a() {
        ((OutwardRemittanceFormActivity) getActivity()).q = 0;
        new KetentuanORDialog().show(getFragmentManager(), "KetentuanORDialog");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etNorekPengirim.getEditableText()) {
            if (this.tvErrorDataPengirim.get(this.viewGroupDataPengirim.indexOf(this.etNorekPengirim)).getVisibility() != 0) {
                return;
            }
            if (this.tvErrorDataPengirim.get(this.viewGroupDataPengirim.indexOf(this.etNorekPengirim)).getText().equals(getString(2131820949))) {
                if (!this.etNorekPengirim.getText().toString().isEmpty()) {
                    b(this.etNorekPengirim);
                }
            } else if (this.tvErrorDataPengirim.get(this.viewGroupDataPengirim.indexOf(this.etNorekPengirim)).getText().equals(getString(2131820950)) && this.etNorekPengirim.getText().toString().length() >= 10) {
                b(this.etNorekPengirim);
            }
        } else if (editable == this.etNamaPengirim.getEditableText()) {
            getPromotion.b(this.tvErrorDataPengirim, this.tilFormDataPengirim, this.viewGroupDataPengirim, this.etNamaPengirim);
        } else if (editable == this.etNoHpPengirim.getEditableText()) {
            getPromotion.b(this.tvErrorDataPengirim, this.tilFormDataPengirim, this.viewGroupDataPengirim, this.etNoHpPengirim);
        } else if (editable == this.etNominalTransaksi.getEditableText()) {
            this.etNominalTransaksi.removeTextChangedListener(this);
            String replaceAll = this.etNominalTransaksi.getText().toString().replaceAll("[^0-9.,]", "");
            String str = replaceAll;
            if (!this.etNominalTransaksi.getText().toString().contains(",")) {
                str = replaceAll;
                if (this.etNominalTransaksi.length() > 17) {
                    str = this.etNominalTransaksi.getText().toString().substring(0, 17);
                }
            }
            String str2 = str;
            if (str.equals("0")) {
                str2 = "";
            }
            if (str2.isEmpty()) {
                this.etNominalTransaksi.setSuffix("");
            } else {
                this.etNominalTransaksi.setSuffix(((OutwardRemittanceFormActivity) getActivity()).n.getJenisMataUangTransaksi().substring(0, 3));
            }
            if (this.tvErrorDataTransaksi.get(this.viewGroupDataTransaksi.indexOf(this.etNominalTransaksi)).getVisibility() == 0) {
                if (this.tvErrorDataTransaksi.get(this.viewGroupDataTransaksi.indexOf(this.etNominalTransaksi)).getText().toString().equals(getString(2131820906))) {
                    if (!this.etNominalTransaksi.getText().toString().isEmpty()) {
                        this.tvErrorDataTransaksi.get(this.viewGroupDataTransaksi.indexOf(this.etNominalTransaksi)).setVisibility(8);
                        this.llNominalTransaksi.setBackgroundResource(2131230847);
                    }
                } else if (!this.etNominalTransaksi.getText().toString().isEmpty()) {
                    if (BigDecimal.valueOf(Double.parseDouble(this.etNominalTransaksi.getText().toString().replaceAll("\\.", "").replace(",", "."))).doubleValue() >= BigDecimal.valueOf(Double.parseDouble(((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi())).doubleValue()) {
                        this.tvErrorDataTransaksi.get(this.viewGroupDataTransaksi.indexOf(this.etNominalTransaksi)).setVisibility(8);
                        this.llNominalTransaksi.setBackgroundResource(2131230847);
                    }
                }
            }
            this.etNominalTransaksi.length();
            this.etNominalTransaksi.setText(getPromotion.e(str2, 12, 2));
            this.etNominalTransaksi.setSelection(this.etNominalTransaksi.length());
            this.etNominalTransaksi.addTextChangedListener(this);
        } else if (editable == this.etCodewordBankPenerima.getEditableText()) {
            if (this.tvErrorDataBankPenerima.get(this.viewGroupDataBankPenerima.indexOf(this.etCodewordBankPenerima)).getVisibility() != 0) {
                return;
            }
            if (this.tvErrorDataBankPenerima.get(this.viewGroupDataBankPenerima.indexOf(this.etCodewordBankPenerima)).getText().toString().equals(getString(2131820763))) {
                if (!this.etCodewordBankPenerima.getText().toString().isEmpty()) {
                    c(this.etCodewordBankPenerima);
                }
            } else if (this.etCodewordBankPenerima.getText().toString().length() >= this.x) {
                c(this.etCodewordBankPenerima);
            }
        } else if (editable == this.etKeteranganAlamatBankPenerima.getEditableText()) {
            getPromotion.b(this.tvErrorDataBankPenerima, this.tilFormDataBankPenerima, this.viewGroupDataBankPenerima, this.etKeteranganAlamatBankPenerima);
        } else if (editable == this.etNorekPenerima.getEditableText()) {
            getPromotion.b(this.tvErrorDataPenerima, this.tilFormDataPenerima, this.viewGroupDataPenerima, this.etNorekPenerima);
        } else if (editable == this.etNamaPenerima.getEditableText()) {
            getPromotion.b(this.tvErrorDataPenerima, this.tilFormDataPenerima, this.viewGroupDataPenerima, this.etNamaPenerima);
        } else if (editable == this.etNoTelpPenerima.getEditableText()) {
            getPromotion.b(this.tvErrorDataPenerima, this.tilFormDataPenerima, this.viewGroupDataPenerima, this.etNoTelpPenerima);
        } else if (editable == this.etNegaraTujuanPenerima.getEditableText()) {
            getPromotion.b(this.tvErrorDataPenerima, this.tilFormDataPenerima, this.viewGroupDataPenerima, this.etNegaraTujuanPenerima);
        } else if (editable == this.etAlamatPenerima.getEditableText()) {
            getPromotion.b(this.tvErrorDataPenerima, this.tilFormDataPenerima, this.viewGroupDataPenerima, this.etAlamatPenerima);
        } else if (editable == this.etKotaPenerima.getEditableText()) {
            getPromotion.b(this.tvErrorDataPenerima, this.tilFormDataPenerima, this.viewGroupDataPenerima, this.etKotaPenerima);
        } else if (editable == this.etKodePosPenerima.getEditableText()) {
            if (this.tvErrorDataPenerima.get(this.viewGroupDataPenerima.indexOf(this.etKodePosPenerima)).getVisibility() != 0) {
                return;
            }
            if (this.tvErrorDataPenerima.get(this.viewGroupDataPenerima.indexOf(this.etKodePosPenerima)).getText().toString().equals(getString(2131820977))) {
                getPromotion.b(this.tvErrorDataPenerima, this.tilFormDataPenerima, this.viewGroupDataPenerima, this.etKodePosPenerima);
            } else if (this.etKodePosPenerima.getText().toString().length() >= this.u) {
                a(this.etKodePosPenerima);
            }
        } else if (editable == this.etNoIbanPenerima.getEditableText()) {
            if (this.tvErrorDataPenerima.get(this.viewGroupDataPenerima.indexOf(this.etNoIbanPenerima)).getVisibility() != 0) {
                return;
            }
            if (this.tvErrorDataPenerima.get(this.viewGroupDataPenerima.indexOf(this.etNoIbanPenerima)).getText().toString().equals(getString(2131820910))) {
                if (!this.etNoIbanPenerima.getText().toString().isEmpty()) {
                    a(this.etNoIbanPenerima);
                }
            } else if (this.etNoIbanPenerima.getText().toString().length() >= 2 && this.etNoIbanPenerima.getText().toString().substring(0, 2).equalsIgnoreCase(this.etNoIbanPenerima.getTag().toString())) {
                a(this.etNoIbanPenerima);
            }
        } else if (editable == this.etKodePromosi.getEditableText()) {
            getPromotion.b(this.tvErrorDataLainnya, this.tilFormDataLainnya, this.viewGroupDataLainnya, this.etKodePromosi);
        }
    }

    @Override // com.bca.smartbranch.presenter.GetPPUNumberPresenter.read
    public final void b(GetPPUNumberResponse getPPUNumberResponse) {
        h();
        o();
        ((OutwardRemittanceFormActivity) getActivity()).n.setPPUNumber(getPPUNumberResponse.getPpuNumber());
        c(2131296811, new ProsesORFragment(), "ProsesORFragment");
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read, com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void b(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.e.getImei());
        bundle.putString("email", this.e.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(getActivity().l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read, com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
    public final void b_(String str) {
        h();
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
        return 2131493199;
    }

    @Override // com.bca.smartbranch.presenter.GetPPUNumberPresenter.read
    public final void d(String str) {
        h();
        if (((OutwardRemittanceFormActivity) getActivity()).q >= 3) {
            ((OutwardRemittanceFormActivity) getActivity()).u();
            ((OutwardRemittanceFormActivity) getActivity()).q = 0;
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        ErrorGetPpuNumberDialog errorGetPpuNumberDialog = new ErrorGetPpuNumberDialog();
        errorGetPpuNumberDialog.setArguments(bundle);
        errorGetPpuNumberDialog.show(getActivity().l(), "ErrorGetPpuNumberDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetPPUNumberPresenter.read
    public final void e(String str) {
        h();
        if (((OutwardRemittanceFormActivity) getActivity()).q >= 3) {
            ((OutwardRemittanceFormActivity) getActivity()).u();
            ((OutwardRemittanceFormActivity) getActivity()).q = 0;
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        ErrorGetPpuNumberDialog errorGetPpuNumberDialog = new ErrorGetPpuNumberDialog();
        errorGetPpuNumberDialog.setArguments(bundle);
        errorGetPpuNumberDialog.show(getActivity().l(), "ErrorGetPpuNumberDialog");
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void f(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        this.c.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment.4
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
            }
        });
        e(2131296811, new OR6DataLainnyaFragment(), "OR6DataLainnyaFragment");
    }

    @Override // com.bca.smartbranch.presenter.GetPPUNumberPresenter.read, com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void g(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, ((OutwardRemittanceFormActivity) getActivity()).llMain, str, 0).g();
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void i(String str) {
        h();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getActivity().l(), "MessageDialog");
    }

    @OnFocusChange({2131297114, 2131297027, 2131297073, 2131297098, 2131297125, 2131296960, 2131297030, 2131297056, 2131297082, 2131296929, 2131297034, 2131296969, 2131297108, 2131297100, 2131297066, 2131296935, 2131297038, 2131297025, 2131297117, 2131297181})
    public void inputChange(View view, boolean z) {
        if (z) {
            switch (view.getId()) {
                case 2131296929:
                    this.tilAlamatBankPenerima.setHintEnabled(true);
                    return;
                case 2131296935:
                    this.tilAlamatPenerima.setHintEnabled(true);
                    return;
                case 2131296960:
                    this.tilBeritaTransaksi.setHintEnabled(true);
                    return;
                case 2131296969:
                    this.tilCodewordBankPenerima.setHintEnabled(true);
                    return;
                case 2131297025:
                    this.tilKodePosPenerima.setHintEnabled(true);
                    return;
                case 2131297027:
                    this.tilKodePromosi.setHintEnabled(true);
                    return;
                case 2131297030:
                    this.tilKodeSwiftBankPenerima.setHintEnabled(true);
                    return;
                case 2131297034:
                    this.tilKotaBankPenerima.setHintEnabled(true);
                    return;
                case 2131297038:
                    this.tilKotaPenerima.setHintEnabled(true);
                    return;
                case 2131297056:
                    this.tilNamaBankPenerima.setHintEnabled(true);
                    return;
                case 2131297066:
                    this.tilNamaPenerima.setHintEnabled(true);
                    return;
                case 2131297073:
                    this.tilNamaPengirim.setHintEnabled(true);
                    return;
                case 2131297082:
                    this.tilNegaraBagianBankPenerima.setHintEnabled(true);
                    return;
                case 2131297090:
                    this.tilNegaraTujuanPenerima.setHintEnabled(true);
                    return;
                case 2131297098:
                    this.tilNoHPPengirim.setHintEnabled(true);
                    return;
                case 2131297100:
                    this.tilNoIbanPenerima.setHintEnabled(true);
                    return;
                case 2131297108:
                    this.tilNorekPenerima.setHintEnabled(true);
                    return;
                case 2131297114:
                    this.tilNorekPengirim.setHintEnabled(true);
                    return;
                case 2131297117:
                    this.tilNoTelpPenerima.setHintEnabled(true);
                    return;
                case 2131297125:
                    if (this.tvErrorDataTransaksi.get(2).getVisibility() != 0) {
                        this.llNominalTransaksi.setBackgroundResource(2131230828);
                    }
                    this.tilNominalTransaksi.setHintEnabled(true);
                    return;
                case 2131297181:
                    this.tilKeteranganAlamatBankPenerim.setHintEnabled(true);
                    return;
                default:
                    return;
            }
        } else {
            switch (view.getId()) {
                case 2131296929:
                    if (this.etAlamatBankPenerima.getText().toString().isEmpty()) {
                        this.tilAlamatBankPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296935:
                    if (this.etAlamatPenerima.getText().toString().isEmpty()) {
                        this.tilAlamatPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296960:
                    if (this.etBeritaTransaksi.getText().toString().isEmpty()) {
                        this.tilBeritaTransaksi.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131296969:
                    if (this.etCodewordBankPenerima.getText().toString().isEmpty()) {
                        this.tilCodewordBankPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297025:
                    if (this.etKodePosPenerima.getText().toString().isEmpty()) {
                        this.tilKodePosPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297027:
                    if (this.etKodePromosi.getText().toString().isEmpty()) {
                        this.tilKodePromosi.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297030:
                    if (this.etKodeSwiftBankPenerima.getText().toString().isEmpty()) {
                        this.tilKodeSwiftBankPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297034:
                    if (this.etKotaBankPenerima.getText().toString().isEmpty()) {
                        this.tilKotaBankPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297038:
                    if (this.etKotaPenerima.getText().toString().isEmpty()) {
                        this.tilKotaPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297056:
                    if (this.etNamaBankPenerima.getText().toString().isEmpty()) {
                        this.tilNamaBankPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297066:
                    if (this.etNamaPenerima.getText().toString().isEmpty()) {
                        this.tilNamaPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297073:
                    if (this.etNamaPengirim.getText().toString().isEmpty()) {
                        this.tilNamaPengirim.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297082:
                    if (this.etNegaraBagianBankPenerima.getText().toString().isEmpty()) {
                        this.tilNegaraBagianBankPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297090:
                    if (this.etNegaraTujuanPenerima.getText().toString().isEmpty()) {
                        this.tilNegaraTujuanPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297098:
                    if (this.etNoHpPengirim.getText().toString().isEmpty()) {
                        this.tilNoHPPengirim.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297100:
                    if (this.etNoIbanPenerima.getText().toString().isEmpty()) {
                        this.tilNoIbanPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297108:
                    if (this.etNorekPenerima.getText().toString().isEmpty()) {
                        this.tilNorekPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297114:
                    if (this.etNorekPengirim.getText().toString().isEmpty()) {
                        this.tilNorekPengirim.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297117:
                    if (this.etNoTelpPenerima.getText().toString().isEmpty()) {
                        this.tilNoTelpPenerima.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297125:
                    if (this.tvErrorDataTransaksi.get(2).getVisibility() != 0) {
                        this.llNominalTransaksi.setBackgroundResource(2131230853);
                    }
                    if (this.etNominalTransaksi.getText().toString().isEmpty()) {
                        this.tilNominalTransaksi.setHintEnabled(false);
                        return;
                    }
                    return;
                case 2131297181:
                    if (this.etKeteranganAlamatBankPenerima.getText().toString().isEmpty()) {
                        this.tilKeteranganAlamatBankPenerim.setHintEnabled(false);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read
    public final void j(String str) {
        h();
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, -1).g();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onAcceptKetentuanOR(onClickUbahDataPengirim onclickubahdatapengirim) {
        b();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseHubunganKeuanganOR(togglePINConfirm togglepinconfirm) {
        this.etHubunganKeuanganTransaksi.setError(null);
        this.tilHubunganKeuanganTransaksi.setHintEnabled(true);
        this.etHubunganKeuanganTransaksi.setText(togglepinconfirm.a);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseJenisKodeBankTransaksi(onClickMinus onclickminus) {
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKategoriTujuanTransaksiOR(onExitForm onexitform) {
        this.r = this.i.get(onexitform.e);
        this.etKategoriTransaksi.setError(null);
        this.tilKategoriTransaksi.setHintEnabled(true);
        this.etKategoriTransaksi.setText(this.r.getCategorySttDesc());
        m();
        this.etTujuanTransaksi.setText("");
        this.tilTujuanTransaksi.setHintEnabled(false);
        this.tilTujuanTransaksi.setVisibility(0);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseNegaraBagian(PilihNegaraActivity pilihNegaraActivity) {
        a(this.etNegaraBagianPenerima);
        this.etNegaraBagianPenerima.setError(null);
        this.tilNegaraBagianPenerima.setHintEnabled(true);
        this.etNegaraBagianPenerima.setText(pilihNegaraActivity.e);
        this.n = pilihNegaraActivity.b;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseNegaraTujuan(onChooseNegara onchoosenegara) {
        this.etNegaraTujuanPenerima.setError(null);
        this.tilNegaraTujuanPenerima.setHintEnabled(true);
        this.etNegaraTujuanPenerima.setText(onchoosenegara.b);
        this.etNegaraBagianPenerima.setText("");
        this.tilNegaraBagianPenerima.setHintEnabled(false);
        this.etKodePosPenerima.setText("");
        this.tilKodePosPenerima.setHintEnabled(false);
        String str = ((OutwardRemittanceFormActivity) getActivity()).v;
        str.hashCode();
        if (!str.equals("O")) {
            this.llNegaraBagianPenerima.setVisibility(8);
            this.llKodePosPenerima.setVisibility(8);
            this.l.removeRules(this.etNegaraBagianPenerima);
            this.l.removeRules(this.etKodePosPenerima);
        } else if (onchoosenegara.d.equals("US")) {
            this.llNegaraBagianPenerima.setVisibility(0);
            Validator validator = this.l;
            EditText editText = this.etNegaraBagianPenerima;
            validator.put(editText, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b6: INVOKE  
                  (r0v33 'validator' com.mobsandgeeks.saripaar.Validator)
                  (r0v35 'editText' android.widget.EditText)
                  (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v1 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                  (wrap: o.getPromotion$10 : 0x00b2: CONSTRUCTOR  (r0v35 'editText' android.widget.EditText), (2131820879 int) call: o.getPromotion.10.<init>(android.widget.EditText, int):void type: CONSTRUCTOR)
                 elemType: com.mobsandgeeks.saripaar.QuickRule)
                 type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.OR6ReviewFragment.onChooseNegaraTujuan(o.onChooseNegara):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewFragment.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:155)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:132)
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
                	... 23 more
                */
            /*
            // Method dump skipped, instructions count: 217
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewFragment.onChooseNegaraTujuan(o.onChooseNegara):void");
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChoosePilihNorekPengirim(ReservasiROSuccessActivity reservasiROSuccessActivity) {
            if (!reservasiROSuccessActivity.d.isEmpty()) {
                b(this.etNorekPengirim);
                this.etNorekPengirim.setText(reservasiROSuccessActivity.d.split("-")[0].trim());
                ((OutwardRemittanceFormActivity) getActivity()).n.setNorekPengirim(this.etNorekPengirim.getText().toString());
                this.tilNorekPengirim.setHintEnabled(true);
                return;
            }
            this.tilNorekPengirim.setHintEnabled(false);
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChooseSumberDanaOR(ReservasiTellerOActivity_ViewBinding reservasiTellerOActivity_ViewBinding) {
            this.etSumberDanaTransaksi.setError(null);
            this.tilSumberDanaTransaksi.setHintEnabled(true);
            this.etSumberDanaTransaksi.setText(reservasiTellerOActivity_ViewBinding.a);
            this.p = reservasiTellerOActivity_ViewBinding.d;
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChooseTipeNasabahPenerima(ReservasiTundaSuccessActivity reservasiTundaSuccessActivity) {
            this.etTipeNasabahPenerima.setError(null);
            this.tilTipeNasabahPenerima.setHintEnabled(true);
            this.etTipeNasabahPenerima.setText(reservasiTundaSuccessActivity.a);
            a(this.etTipeTujuanTransaksiPenerima);
            if (this.etJenisMataUangTransaksi.getText().toString().startsWith("CNY")) {
                this.etTipeTujuanTransaksiPenerima.setText("");
                this.tilTipeTujuanTransaksiPenerima.setHintEnabled(false);
                if (this.etTipeNasabahPenerima.getText().toString().equalsIgnoreCase("Individu")) {
                    this.tilTipeTujuanTransaksiPenerima.setVisibility(0);
                    this.etTipeTujuanTransaksiPenerima.setEnabled(true);
                    this.tilTipeTujuanTransaksiPenerima.setBackgroundResource(2131230847);
                    this.tilTipeTujuanTransaksiPenerima.setHintTextAppearance(2131886846);
                    this.tilTipeTujuanTransaksiPenerima.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099731)));
                    return;
                }
                this.tilTipeTujuanTransaksiPenerima.setVisibility(0);
                this.etTipeTujuanTransaksiPenerima.setEnabled(false);
                this.tilTipeTujuanTransaksiPenerima.setBackgroundDrawable(new ColorDrawable(0));
                this.tilTipeTujuanTransaksiPenerima.setHintTextAppearance(2131886849);
                this.tilTipeTujuanTransaksiPenerima.setDefaultHintTextColor(ColorStateList.valueOf(getResources().getColor(2131099739)));
                this.etTipeTujuanTransaksiPenerima.setText("Bisnis");
                this.tilTipeTujuanTransaksiPenerima.setHintEnabled(true);
            }
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChooseTipeTujuanTransaksiPenerima(ResetAccountActivity resetAccountActivity) {
            a(this.etTipeTujuanTransaksiPenerima);
            this.etTipeTujuanTransaksiPenerima.setError(null);
            this.tilTipeTujuanTransaksiPenerima.setHintEnabled(true);
            this.etTipeTujuanTransaksiPenerima.setText(resetAccountActivity.a);
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChooseTujuanTransaksiOR(togglePINBaruConfirm togglepinbaruconfirm) {
            this.etTujuanTransaksi.setError(null);
            this.tilTujuanTransaksi.setHintEnabled(true);
            this.etTujuanTransaksi.setText(togglepinbaruconfirm.c);
            EditText editText = this.etTujuanTransaksi;
            this.tvErrorDataTransaksi.get(this.viewGroupDataTransaksi.indexOf(editText)).setVisibility(8);
            this.tilFormDataTransaksi.get(this.viewGroupDataTransaksi.indexOf(editText)).setBackgroundResource(2131230847);
            this.y = togglepinbaruconfirm.e;
        }

        @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
        public void onDestroyView() {
            documentProvider.b().e(this);
            onDestroyView();
            GetPPUNumberPresenter getPPUNumberPresenter = this.f44o;
            Call<OpenAccountSuccessActivity<GetPPUNumberResponse>> call = getPPUNumberPresenter.c;
            if (call != null) {
                call.cancel();
            }
            getPPUNumberPresenter.b = null;
            CheckDaftarTransferORPresenter checkDaftarTransferORPresenter = this.k;
            Call<OpenAccountSuccessActivity<Object>> call2 = checkDaftarTransferORPresenter.e;
            if (call2 != null) {
                call2.cancel();
            }
            checkDaftarTransferORPresenter.a = null;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String substring = ((OutwardRemittanceFormActivity) getActivity()).n.getJenisMataUangTransaksi().substring(0, 3);
            if (this.etNamaPenerima.isFocused()) {
                this.etNamaPenerima.setAdapter(null);
                this.etNamaPenerima.setText(this.d.e.get(i).d);
                AutoCompleteTextView autoCompleteTextView = this.etNamaPenerima;
                autoCompleteTextView.setSelection(autoCompleteTextView.length());
                this.etNamaPenerima.setAdapter(this.d);
                if (((OutwardRemittanceFormActivity) getActivity()).n.isFlagIBAN()) {
                    this.etNoIbanPenerima.setText(this.d.e.get(i).b);
                    AutoCompleteTextView autoCompleteTextView2 = this.etNoIbanPenerima;
                    autoCompleteTextView2.setSelection(autoCompleteTextView2.length());
                    this.tilNoIbanPenerima.setHintEnabled(true);
                } else {
                    this.etNorekPenerima.setText(this.d.e.get(i).b);
                    AutoCompleteTextView autoCompleteTextView3 = this.etNorekPenerima;
                    autoCompleteTextView3.setSelection(autoCompleteTextView3.length());
                    this.tilNorekPenerima.setHintEnabled(true);
                }
                this.etAlamatPenerima.setText(this.d.e.get(i).f);
                EditText editText = this.etAlamatPenerima;
                editText.setSelection(editText.length());
                this.tilAlamatPenerima.setHintEnabled(true);
                this.etKotaPenerima.setText(this.d.e.get(i).i);
                EditText editText2 = this.etKotaPenerima;
                editText2.setSelection(editText2.length());
                if (!this.etKotaPenerima.getText().toString().isEmpty()) {
                    this.tilKotaPenerima.setHintEnabled(true);
                }
                this.etNegaraTujuanPenerima.setText(this.d.e.get(i).k);
                ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerimaISO(this.d.e.get(i).h);
                ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerima(this.d.e.get(i).k);
                if (this.etNegaraTujuanPenerima.isEnabled()) {
                    a(this.etNegaraTujuanPenerima);
                    this.tilNegaraTujuanPenerima.setHintEnabled(true);
                    String str = ((OutwardRemittanceFormActivity) getActivity()).v;
                    str.hashCode();
                    if (!str.equals("O")) {
                        this.tilNegaraBagianPenerima.setVisibility(8);
                        this.tilKodePosPenerima.setVisibility(8);
                    } else if (this.d.e.get(i).h.equals("US")) {
                        this.tilNegaraBagianPenerima.setVisibility(0);
                    } else {
                        this.tilNegaraBagianPenerima.setVisibility(8);
                    }
                }
                a(this.etTipeNasabahPenerima);
                this.etTipeNasabahPenerima.setError(null);
                if (this.d.e.get(i).g.equalsIgnoreCase("I")) {
                    this.etTipeNasabahPenerima.setText("Individu");
                } else if (this.d.e.get(i).g.equalsIgnoreCase("P")) {
                    this.etTipeNasabahPenerima.setText("Perusahaan");
                } else {
                    this.etTipeNasabahPenerima.setText("");
                }
                EditText editText3 = this.etTipeNasabahPenerima;
                editText3.setSelection(editText3.length());
                this.tilTipeNasabahPenerima.setHintEnabled(true);
                if (!this.etTipeNasabahPenerima.getText().toString().equalsIgnoreCase("Individu") || !substring.equals("CNY")) {
                    this.tvErrorDataPenerima.get(this.viewGroupDataPenerima.indexOf(this.etTipeTujuanTransaksiPenerima)).setVisibility(8);
                    this.tilFormDataPenerima.get(this.viewGroupDataPenerima.indexOf(this.etTipeTujuanTransaksiPenerima)).setBackgroundResource(2131230847);
                    this.tilTipeTujuanTransaksiPenerima.setVisibility(8);
                    this.tilTipeTujuanTransaksiPenerima.setHintEnabled(false);
                    this.etTipeTujuanTransaksiPenerima.setText("");
                    return;
                }
                this.tilTipeTujuanTransaksiPenerima.setVisibility(0);
            } else if (this.etNorekPenerima.isFocused() || this.etNoIbanPenerima.isFocused()) {
                if (this.etNorekPenerima.isFocused()) {
                    this.etNorekPenerima.setAdapter(null);
                    this.etNorekPenerima.setText(this.a.e.get(i).b);
                    AutoCompleteTextView autoCompleteTextView4 = this.etNorekPenerima;
                    autoCompleteTextView4.setSelection(autoCompleteTextView4.length());
                    this.etNorekPenerima.setAdapter(this.a);
                } else if (this.etNoIbanPenerima.isFocused()) {
                    this.etNoIbanPenerima.setAdapter(null);
                    this.etNoIbanPenerima.setText(this.a.e.get(i).b);
                    AutoCompleteTextView autoCompleteTextView5 = this.etNoIbanPenerima;
                    autoCompleteTextView5.setSelection(autoCompleteTextView5.length());
                    this.etNoIbanPenerima.setAdapter(this.a);
                }
                this.etNamaPenerima.setText(this.a.e.get(i).d);
                AutoCompleteTextView autoCompleteTextView6 = this.etNamaPenerima;
                autoCompleteTextView6.setSelection(autoCompleteTextView6.length());
                this.tilNamaPenerima.setHintEnabled(true);
                this.etAlamatPenerima.setText(this.a.e.get(i).f);
                EditText editText4 = this.etAlamatPenerima;
                editText4.setSelection(editText4.length());
                this.tilAlamatPenerima.setHintEnabled(true);
                this.etKotaPenerima.setText(this.a.e.get(i).i);
                EditText editText5 = this.etKotaPenerima;
                editText5.setSelection(editText5.length());
                if (!this.etKotaPenerima.getText().toString().isEmpty()) {
                    this.tilKotaPenerima.setHintEnabled(true);
                }
                this.etNegaraTujuanPenerima.setText(this.a.e.get(i).k);
                ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerimaISO(this.a.e.get(i).h);
                ((OutwardRemittanceFormActivity) getActivity()).n.setNegaraTujuanPenerima(this.a.e.get(i).k);
                if (this.etNegaraTujuanPenerima.isEnabled()) {
                    a(this.etNegaraTujuanPenerima);
                    this.tilNegaraTujuanPenerima.setHintEnabled(true);
                    String str2 = ((OutwardRemittanceFormActivity) getActivity()).v;
                    str2.hashCode();
                    if (!str2.equals("O")) {
                        this.tilNegaraBagianPenerima.setVisibility(8);
                        this.tilKodePosPenerima.setVisibility(8);
                    } else if (this.a.e.get(i).h.equals("US")) {
                        this.tilNegaraBagianPenerima.setVisibility(0);
                    } else {
                        this.tilNegaraBagianPenerima.setVisibility(8);
                    }
                }
                a(this.etTipeNasabahPenerima);
                this.etTipeNasabahPenerima.setError(null);
                if (this.a.e.get(i).g.equalsIgnoreCase("I")) {
                    this.etTipeNasabahPenerima.setText("Individu");
                } else if (this.a.e.get(i).g.equalsIgnoreCase("P")) {
                    this.etTipeNasabahPenerima.setText("Perusahaan");
                } else {
                    this.etTipeNasabahPenerima.setText("");
                }
                EditText editText6 = this.etTipeNasabahPenerima;
                editText6.setSelection(editText6.length());
                this.tilTipeNasabahPenerima.setHintEnabled(true);
                if (!this.etTipeNasabahPenerima.getText().toString().equalsIgnoreCase("Individu") || !substring.equals("CNY")) {
                    this.tvErrorDataPenerima.get(this.viewGroupDataPenerima.indexOf(this.etTipeTujuanTransaksiPenerima)).setVisibility(8);
                    this.tilFormDataPenerima.get(this.viewGroupDataPenerima.indexOf(this.etTipeTujuanTransaksiPenerima)).setBackgroundResource(2131230847);
                    this.tilTipeTujuanTransaksiPenerima.setVisibility(8);
                    this.tilTipeTujuanTransaksiPenerima.setHintEnabled(false);
                    this.etTipeTujuanTransaksiPenerima.setText("");
                    return;
                }
                this.tilTipeTujuanTransaksiPenerima.setVisibility(0);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i2 == 0) {
                this.t = i + 1;
            } else {
                this.t = i;
            }
        }

        @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
        public void onValidationFailed(List<ValidationError> list) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            EditText editText = null;
            for (ValidationError validationError : list) {
                View view = validationError.getView();
                String message = validationError.getFailedRules().get(0).getMessage(getContext());
                if (this.viewGroupDataPengirim.contains(view)) {
                    if (this.flLayoutDataPengirim.getVisibility() == 8) {
                        this.g.c(this.flLayoutDataPengirim);
                        setMessage setmessage = this.g;
                        ImageView imageView = this.ivDataPengirim;
                        setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                        setmessage.e(imageView);
                    }
                    z4 = true;
                    z3 = z5;
                    z2 = z6;
                    z = z7;
                } else if (this.viewGroupDataTransaksi.contains(view)) {
                    if (this.flLayoutDataTransaksi.getVisibility() == 8) {
                        this.g.c(this.flLayoutDataTransaksi);
                        setMessage setmessage2 = this.g;
                        ImageView imageView2 = this.ivDataTransaksi;
                        setmessage2.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                        setmessage2.e(imageView2);
                    }
                    z = true;
                    z3 = z5;
                    z2 = z6;
                    z4 = z8;
                } else if (this.viewGroupDataBankPenerima.contains(view)) {
                    if (this.flLayoutDataBankPenerima.getVisibility() == 8) {
                        this.g.c(this.flLayoutDataBankPenerima);
                        setMessage setmessage3 = this.g;
                        ImageView imageView3 = this.ivDataBankPenerima;
                        setmessage3.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                        setmessage3.e(imageView3);
                    }
                    z2 = true;
                    z3 = z5;
                    z = z7;
                    z4 = z8;
                } else if (this.viewGroupDataPenerima.contains(view)) {
                    if (this.flLayoutDataPenerima.getVisibility() == 8) {
                        this.g.c(this.flLayoutDataPenerima);
                        setMessage setmessage4 = this.g;
                        ImageView imageView4 = this.ivDataPenerima;
                        setmessage4.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                        setmessage4.e(imageView4);
                    }
                    z3 = true;
                    z2 = z6;
                    z = z7;
                    z4 = z8;
                } else {
                    z3 = z5;
                    z2 = z6;
                    z = z7;
                    z4 = z8;
                    if (this.viewGroupDataLainnya.contains(view)) {
                        if (this.flLayoutDataLainnya.getVisibility() == 8) {
                            this.g.c(this.flLayoutDataLainnya);
                            setMessage setmessage5 = this.g;
                            ImageView imageView5 = this.ivDataLainnya;
                            setmessage5.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                            setmessage5.e(imageView5);
                        }
                        z9 = true;
                        z4 = z8;
                        z = z7;
                        z2 = z6;
                        z3 = z5;
                    }
                }
                if (view instanceof EditText) {
                    EditText editText2 = editText;
                    if (editText == null) {
                        editText2 = (EditText) view;
                    }
                    switch (view.getId()) {
                        case 2131296935:
                            this.tvErrorDataPenerima.get(4).setVisibility(0);
                            this.tvErrorDataPenerima.get(4).setText(message);
                            this.tilFormDataPenerima.get(4).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131296969:
                            this.tvErrorDataBankPenerima.get(5).setVisibility(0);
                            this.tvErrorDataBankPenerima.get(5).setText(message);
                            this.tilFormDataBankPenerima.get(5).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297025:
                            this.tvErrorDataPenerima.get(6).setVisibility(0);
                            this.tvErrorDataPenerima.get(6).setText(message);
                            this.tilFormDataPenerima.get(6).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297027:
                            this.tvErrorDataLainnya.get(0).setVisibility(0);
                            this.tvErrorDataLainnya.get(0).setText(message);
                            this.tilFormDataLainnya.get(0).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297030:
                            this.tvErrorDataBankPenerima.get(0).setVisibility(0);
                            this.tvErrorDataBankPenerima.get(0).setText(message);
                            this.tilFormDataBankPenerima.get(0).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297038:
                            this.tvErrorDataPenerima.get(5).setVisibility(0);
                            this.tvErrorDataPenerima.get(5).setText(message);
                            this.tilFormDataPenerima.get(5).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297066:
                            this.tvErrorDataPenerima.get(1).setVisibility(0);
                            this.tvErrorDataPenerima.get(1).setText(message);
                            this.tilFormDataPenerima.get(1).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297073:
                            this.tvErrorDataPengirim.get(1).setVisibility(0);
                            this.tvErrorDataPengirim.get(1).setText(message);
                            this.tilFormDataPengirim.get(1).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297083:
                            this.tvErrorDataPenerima.get(3).setVisibility(0);
                            this.tvErrorDataPenerima.get(3).setText(message);
                            this.tilFormDataPenerima.get(3).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297090:
                            this.tvErrorDataPenerima.get(2).setVisibility(0);
                            this.tvErrorDataPenerima.get(2).setText(message);
                            this.tilFormDataPenerima.get(2).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297098:
                            this.tvErrorDataPengirim.get(2).setVisibility(0);
                            this.tvErrorDataPengirim.get(2).setText(message);
                            this.tilFormDataPengirim.get(2).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297100:
                            this.tvErrorDataPenerima.get(8).setVisibility(0);
                            this.tvErrorDataPenerima.get(8).setText(message);
                            this.tilFormDataPenerima.get(8).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297108:
                            this.tvErrorDataPenerima.get(0).setVisibility(0);
                            this.tvErrorDataPenerima.get(0).setText(message);
                            this.tilFormDataPenerima.get(0).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297114:
                            this.tvErrorDataPengirim.get(0).setVisibility(0);
                            this.tvErrorDataPengirim.get(0).setText(message);
                            this.tilFormDataPengirim.get(0).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297117:
                            this.tvErrorDataPenerima.get(10).setVisibility(0);
                            this.tvErrorDataPenerima.get(10).setText(message);
                            this.tilFormDataPenerima.get(10).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297125:
                            this.tvErrorDataTransaksi.get(2).setVisibility(0);
                            this.tvErrorDataTransaksi.get(2).setText(message);
                            this.llNominalTransaksi.setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297181:
                            this.tvErrorDataBankPenerima.get(6).setVisibility(0);
                            this.tvErrorDataBankPenerima.get(6).setText(message);
                            this.tilFormDataBankPenerima.get(6).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297218:
                            this.tvErrorDataPenerima.get(9).setVisibility(0);
                            this.tvErrorDataPenerima.get(9).setText(message);
                            this.tilFormDataPenerima.get(9).setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        case 2131297229:
                            this.tvErrorDataTransaksi.get(4).setVisibility(0);
                            this.tvErrorDataTransaksi.get(4).setText(message);
                            this.tilTujuanTransaksi.setBackgroundResource(2131230870);
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                        default:
                            z5 = z3;
                            z6 = z2;
                            z7 = z;
                            z8 = z4;
                            editText = editText2;
                            continue;
                    }
                } else if (view instanceof CheckBox) {
                    z5 = z3;
                    z6 = z2;
                    z7 = z;
                    z8 = z4;
                } else {
                    b(this.svMain, message);
                    z5 = z3;
                    z6 = z2;
                    z7 = z;
                    z8 = z4;
                }
            }
            if (!((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi().isEmpty() && !this.etNominalTransaksi.getText().toString().isEmpty()) {
                if (BigDecimal.valueOf(Double.parseDouble(this.etNominalTransaksi.getText().toString().replaceAll("\\.", "").replace(",", "."))).doubleValue() < BigDecimal.valueOf(Double.parseDouble(((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi())).doubleValue()) {
                    this.tvErrorDataTransaksi.get(3).setVisibility(0);
                    TextView textView = this.tvErrorDataTransaksi.get(3);
                    StringBuilder sb = new StringBuilder("Nominal minimal ");
                    sb.append(getPromotion.i(((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi().replace(".", ",")));
                    sb.append(" ");
                    sb.append(((OutwardRemittanceFormActivity) getActivity()).n.getJenisMataUangTransaksi().substring(0, 3));
                    textView.setText(sb.toString());
                    this.llNominalTransaksi.setBackgroundResource(2131230870);
                }
            }
            final LinearLayout linearLayout = z8 ? this.llWrapperDataPengirim : z7 ? this.llWrapperDataTransaksi : z6 ? this.llWrapperDataBankPenerima : z5 ? this.llWrapperDataPenerima : z9 ? this.llWrapperDataLainnya : null;
            if (editText != null) {
                editText.requestFocus();
            }
            if (linearLayout != null) {
                new Handler().post(new Runnable() { // from class: com.bca.smartbranch.fragment.OR6ReviewFragment.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        OR6ReviewFragment.this.svMain.scrollTo(0, linearLayout.getTop());
                    }
                });
            }
        }

        @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
        public void onValidationSucceeded() {
            ((OutwardRemittanceFormActivity) getActivity()).t();
            if (!((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi().isEmpty()) {
                if (BigDecimal.valueOf(Double.parseDouble(this.etNominalTransaksi.getText().toString().replaceAll("\\.", "").replace(",", "."))).doubleValue() < BigDecimal.valueOf(Double.parseDouble(((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi())).doubleValue()) {
                    this.tvErrorDataTransaksi.get(2).setVisibility(0);
                    TextView textView = this.tvErrorDataTransaksi.get(2);
                    StringBuilder sb = new StringBuilder("Nominal minimal ");
                    sb.append(getPromotion.i(((OutwardRemittanceFormActivity) getActivity()).n.getLimitMinNominalTransaksi().replace(".", ",")));
                    sb.append(" ");
                    sb.append(((OutwardRemittanceFormActivity) getActivity()).n.getJenisMataUangTransaksi().substring(0, 3));
                    textView.setText(sb.toString());
                    this.llNominalTransaksi.setBackgroundResource(2131230870);
                    return;
                }
            }
            n();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0375, code lost:
            if (r14 != 2) goto L_0x0392;
         */
        /* JADX WARN: Removed duplicated region for block: B:107:0x06c5  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x07c0  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x08e1  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x0a1f  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0a2d  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0a4e  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0b03  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0b27  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0bad  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x0c17  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0c2e  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x0c4c  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x0ddf  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x0e1c  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x0e9a  */
        /* JADX WARN: Removed duplicated region for block: B:247:0x0fc5  */
        /* JADX WARN: Removed duplicated region for block: B:293:0x10f4  */
        /* JADX WARN: Removed duplicated region for block: B:294:0x1143  */
        /* JADX WARN: Removed duplicated region for block: B:297:0x11dd  */
        /* JADX WARN: Removed duplicated region for block: B:298:0x11e9  */
        /* JADX WARN: Removed duplicated region for block: B:301:0x1207  */
        /* JADX WARN: Removed duplicated region for block: B:304:0x1225  */
        /* JADX WARN: Removed duplicated region for block: B:308:0x123a A[LOOP:2: B:306:0x122c->B:308:0x123a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:312:0x127b A[LOOP:3: B:310:0x126d->B:312:0x127b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:316:0x12bc A[LOOP:4: B:314:0x12ae->B:316:0x12bc, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:320:0x12fd A[LOOP:5: B:318:0x12ef->B:320:0x12fd, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:323:0x1370  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0434  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x043f  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0469  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x04d6  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x053c  */
        @Override // androidx.fragment.app.Fragment
        /* Code decompiled incorrectly, please refer to instructions dump */
        public void onViewCreated(android.view.View r11, android.os.Bundle r12) {
            /*
            // Method dump skipped, instructions count: 5145
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewFragment.onViewCreated(android.view.View, android.os.Bundle):void");
        }

        @OnClick({2131296988})
        public void pilihHubunganKeuanganOR(View view) {
            Bundle bundle = new Bundle();
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etHubunganKeuanganTransaksi.getText().toString());
            HubunganKeuanganDialog hubunganKeuanganDialog = new HubunganKeuanganDialog();
            hubunganKeuanganDialog.setArguments(bundle);
            hubunganKeuanganDialog.show(getFragmentManager(), "HubunganKeuanganDialog");
        }

        @OnClick({2131296999})
        public void pilihJenisKodeBankTransaksi(View view) {
            new JenisKodeBankDialog().show(getFragmentManager(), "JenisKodeBankDialog");
        }

        @OnClick({2131297010})
        public void pilihKategoriTujuanTransaksiOR(View view) {
            ArrayList arrayList = new ArrayList();
            for (KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR kategoriTujuanTransaksiOR : this.i) {
                arrayList.add(kategoriTujuanTransaksiOR.getCategorySttDesc());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            Bundle bundle = new Bundle();
            bundle.putStringArray("listdata", strArr);
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etKategoriTransaksi.getText().toString());
            KategoriTujuanTransaksiORDialog kategoriTujuanTransaksiORDialog = new KategoriTujuanTransaksiORDialog();
            kategoriTujuanTransaksiORDialog.setArguments(bundle);
            kategoriTujuanTransaksiORDialog.show(getFragmentManager(), "KategoriTujuanTransaksiORDialog");
        }

        @OnClick({2131297083})
        public void pilihNegaraBagian(View view) {
            Intent intent = new Intent(getContext(), PilihNegaraBagianActivity.class);
            intent.putExtra("country", this.etNegaraTujuanPenerima.getText().toString());
            intent.putExtra("is_from_reservation", ((OutwardRemittanceFormActivity) getActivity()).s);
            intent.putExtra("is_save_draft_and_hit_service", ((OutwardRemittanceFormActivity) getActivity()).u == null || ((OutwardRemittanceFormActivity) getActivity()).u.getCountAll() == 0);
            startActivity(intent);
        }

        @OnClick({2131297090})
        public void pilihNegaraTujuanPenerima(View view) {
            Intent intent = new Intent(getContext(), PilihNegaraORActivity.class);
            intent.putExtra("title", "Pilih Negara");
            intent.putExtra("is_from_reservation", ((OutwardRemittanceFormActivity) getActivity()).s);
            intent.putExtra("is_save_draft_and_hit_service", ((OutwardRemittanceFormActivity) getActivity()).u == null || ((OutwardRemittanceFormActivity) getActivity()).u.getCountAll() == 0);
            startActivity(intent);
        }

        @OnClick({2131297114})
        public void pilihNorekPengirim(View view) {
            if (this.e != null && this.e.getVerified().equals("Y")) {
                PilihRekeningSumberDanaDialog pilihRekeningSumberDanaDialog = new PilihRekeningSumberDanaDialog();
                pilihRekeningSumberDanaDialog.d = ((OutwardRemittanceFormActivity) getActivity()).y;
                pilihRekeningSumberDanaDialog.b = this.etNorekPengirim.getText().toString();
                pilihRekeningSumberDanaDialog.show(getFragmentManager(), "PilihRekeningSumberDanaDialog");
            }
        }

        @OnClick({2131297201})
        public void pilihSumberDanaOR(View view) {
            Bundle bundle = new Bundle();
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etSumberDanaTransaksi.getText().toString());
            SumberDanaORDialog sumberDanaORDialog = new SumberDanaORDialog(((OutwardRemittanceFormActivity) getActivity()).w);
            sumberDanaORDialog.setArguments(bundle);
            sumberDanaORDialog.show(getFragmentManager(), "SumberDanaORDialog");
        }

        @OnClick({2131297210})
        public void pilihTipeNasabahPenerima(View view) {
            Bundle bundle = new Bundle();
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etTipeNasabahPenerima.getText().toString());
            TipeNasabahDialog tipeNasabahDialog = new TipeNasabahDialog();
            tipeNasabahDialog.setArguments(bundle);
            tipeNasabahDialog.show(getFragmentManager(), "TipeNasabahDialog");
        }

        @OnClick({2131297218})
        public void pilihTipeTujuanTransaksiPenerima(View view) {
            Bundle bundle = new Bundle();
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etTipeTujuanTransaksiPenerima.getText().toString());
            TipeTujuanTransaksiDialog tipeTujuanTransaksiDialog = new TipeTujuanTransaksiDialog();
            tipeTujuanTransaksiDialog.setArguments(bundle);
            tipeTujuanTransaksiDialog.show(getFragmentManager(), "TipeTujuanTransaksiDialog");
        }

        @OnClick({2131297229})
        public void pilihTujuanTransaksi(View view) {
            Intent intent = new Intent(getContext(), PilihTujuanTransaksiORActivity.class);
            intent.putExtra("code", this.r.getCategorySttCode());
            intent.putExtra("is_from_reservation", ((OutwardRemittanceFormActivity) getActivity()).s);
            intent.putExtra("is_save_draft_and_hit_service", ((OutwardRemittanceFormActivity) getActivity()).u == null || ((OutwardRemittanceFormActivity) getActivity()).u.getCountAll() == 0);
            startActivity(intent);
        }

        @OnClick({2131296440})
        public void proses(View view) {
            getPromotion.d(getContext());
            m();
            this.l.validate();
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void retryPpuNumber(clickedTermsCondition clickedtermscondition) {
            ((OutwardRemittanceFormActivity) getActivity()).q++;
            b();
        }

        @OnClick({2131299722})
        public void setTvUbahDataTransaksi(View view) {
            this.tvUbahDataTransaksi.setVisibility(8);
            this.llDataTransaksiEditable.setVisibility(0);
            this.llDataTransaksiUneditable.setVisibility(8);
            setReceiverNameOR setreceivernameor = new Runnable() { // from class: o.setReceiverNameOR
                @Override // java.lang.Runnable
                public final void run() {
                    OR6ReviewFragment oR6ReviewFragment = OR6ReviewFragment.this;
                    EditText editText = null;
                    for (int size = oR6ReviewFragment.viewGroupDataTransaksi.size() - 1; size >= 0; size--) {
                        editText = editText;
                        if (oR6ReviewFragment.viewGroupDataTransaksi.get(size).getVisibility() == 0) {
                            editText = editText;
                            if (oR6ReviewFragment.viewGroupDataTransaksi.get(size).isFocusable()) {
                                editText = editText;
                                if (oR6ReviewFragment.viewGroupDataTransaksi.get(size).isEnabled()) {
                                    editText = (EditText) oR6ReviewFragment.viewGroupDataTransaksi.get(size);
                                }
                            }
                        }
                    }
                    if (editText != null) {
                        editText.requestFocus();
                    }
                }
            };
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderTransaksi.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataTransaksi.getVisibility() == 8) {
                this.g.c(this.flLayoutDataTransaksi);
                setMessage setmessage = this.g;
                ImageView imageView = this.ivDataTransaksi;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                new Handler().postDelayed(setreceivernameor, 300);
                return;
            }
            setreceivernameor.run();
        }

        @OnClick({2131297333, 2131298894})
        public void showDataBankPenerima(View view) {
            getPromotion.d(getActivity());
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderBankPenerima.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataBankPenerima.getVisibility() == 8) {
                this.g.c(this.flLayoutDataBankPenerima);
                setMessage setmessage = this.g;
                ImageView imageView = this.ivDataBankPenerima;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.reverseTransition(0);
                return;
            }
            setMessage setmessage2 = this.g;
            FrameLayout frameLayout = this.flLayoutDataBankPenerima;
            setmessage2.a = frameLayout.getMeasuredHeight();
            setmessage2.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                  (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v11 'setmessage2' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.OR6ReviewFragment.showDataBankPenerima(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewFragment.class
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
                android.widget.LinearLayout r0 = r0.llHeaderBankPenerima
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                r11 = r0
                r0 = r11
                r1 = 1
                r0.setCrossFadeEnabled(r1)
                r0 = r10
                android.widget.FrameLayout r0 = r0.flLayoutDataBankPenerima
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 != r1) goto L_0x005a
                r0 = r10
                o.setMessage r0 = r0.g
                r1 = r10
                android.widget.FrameLayout r1 = r1.flLayoutDataBankPenerima
                r0.c(r1)
                r0 = r10
                o.setMessage r0 = r0.g
                r12 = r0
                r0 = r10
                android.widget.ImageView r0 = r0.ivDataBankPenerima
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
                r0.reverseTransition(r1)
                return
            L_0x005a:
                r0 = r10
                o.setMessage r0 = r0.g
                r12 = r0
                r0 = r10
                android.widget.FrameLayout r0 = r0.flLayoutDataBankPenerima
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
                android.widget.ImageView r0 = r0.ivDataBankPenerima
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
                r0.startTransition(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewFragment.showDataBankPenerima(android.view.View):void");
        }

        @OnClick({2131297340, 2131298901})
        public void showDataLainnya(View view) {
            getPromotion.d(getActivity());
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderLainnya.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataLainnya.getVisibility() == 8) {
                this.g.c(this.flLayoutDataLainnya);
                setMessage setmessage = this.g;
                ImageView imageView = this.ivDataLainnya;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.reverseTransition(0);
                return;
            }
            setMessage setmessage2 = this.g;
            FrameLayout frameLayout = this.flLayoutDataLainnya;
            setmessage2.a = frameLayout.getMeasuredHeight();
            setmessage2.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                  (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v11 'setmessage2' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.OR6ReviewFragment.showDataLainnya(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewFragment.class
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
                android.widget.LinearLayout r0 = r0.llHeaderLainnya
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                r11 = r0
                r0 = r11
                r1 = 1
                r0.setCrossFadeEnabled(r1)
                r0 = r10
                android.widget.FrameLayout r0 = r0.flLayoutDataLainnya
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 != r1) goto L_0x005a
                r0 = r10
                o.setMessage r0 = r0.g
                r1 = r10
                android.widget.FrameLayout r1 = r1.flLayoutDataLainnya
                r0.c(r1)
                r0 = r10
                o.setMessage r0 = r0.g
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
                r0.reverseTransition(r1)
                return
            L_0x005a:
                r0 = r10
                o.setMessage r0 = r0.g
                r13 = r0
                r0 = r10
                android.widget.FrameLayout r0 = r0.flLayoutDataLainnya
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
                r0.startTransition(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewFragment.showDataLainnya(android.view.View):void");
        }

        @OnClick({2131297344, 2131298904})
        public void showDataPenerima(View view) {
            getPromotion.d(getActivity());
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderPenerima.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataPenerima.getVisibility() == 8) {
                this.g.c(this.flLayoutDataPenerima);
                setMessage setmessage = this.g;
                ImageView imageView = this.ivDataPenerima;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.reverseTransition(0);
                return;
            }
            setMessage setmessage2 = this.g;
            FrameLayout frameLayout = this.flLayoutDataPenerima;
            setmessage2.a = frameLayout.getMeasuredHeight();
            setmessage2.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                  (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v11 'setmessage2' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.OR6ReviewFragment.showDataPenerima(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewFragment.class
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
                android.widget.LinearLayout r0 = r0.llHeaderPenerima
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                r11 = r0
                r0 = r11
                r1 = 1
                r0.setCrossFadeEnabled(r1)
                r0 = r10
                android.widget.FrameLayout r0 = r0.flLayoutDataPenerima
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 != r1) goto L_0x005a
                r0 = r10
                o.setMessage r0 = r0.g
                r1 = r10
                android.widget.FrameLayout r1 = r1.flLayoutDataPenerima
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
                r0.reverseTransition(r1)
                return
            L_0x005a:
                r0 = r10
                o.setMessage r0 = r0.g
                r13 = r0
                r0 = r10
                android.widget.FrameLayout r0 = r0.flLayoutDataPenerima
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
                android.widget.ImageView r0 = r0.ivDataPenerima
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
                r0.startTransition(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewFragment.showDataPenerima(android.view.View):void");
        }

        @OnClick({2131297350, 2131298910})
        public void showDataPengirim(View view) {
            getPromotion.d(getActivity());
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderPengirim.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataPengirim.getVisibility() == 8) {
                this.g.c(this.flLayoutDataPengirim);
                setMessage setmessage = this.g;
                ImageView imageView = this.ivDataPengirim;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.reverseTransition(0);
                return;
            }
            setMessage setmessage2 = this.g;
            FrameLayout frameLayout = this.flLayoutDataPengirim;
            setmessage2.a = frameLayout.getMeasuredHeight();
            setmessage2.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                  (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v11 'setmessage2' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.OR6ReviewFragment.showDataPengirim(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewFragment.class
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
                android.widget.FrameLayout r0 = r0.flLayoutDataPengirim
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 != r1) goto L_0x005a
                r0 = r10
                o.setMessage r0 = r0.g
                r1 = r10
                android.widget.FrameLayout r1 = r1.flLayoutDataPengirim
                r0.c(r1)
                r0 = r10
                o.setMessage r0 = r0.g
                r12 = r0
                r0 = r10
                android.widget.ImageView r0 = r0.ivDataPengirim
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
                r0.reverseTransition(r1)
                return
            L_0x005a:
                r0 = r10
                o.setMessage r0 = r0.g
                r12 = r0
                r0 = r10
                android.widget.FrameLayout r0 = r0.flLayoutDataPengirim
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
                android.widget.ImageView r0 = r0.ivDataPengirim
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
                r0.startTransition(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewFragment.showDataPengirim(android.view.View):void");
        }

        @OnClick({2131297353, 2131298912})
        public void showDataTransaksi(View view) {
            getPromotion.d(getActivity());
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderTransaksi.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataTransaksi.getVisibility() == 8) {
                this.g.c(this.flLayoutDataTransaksi);
                setMessage setmessage = this.g;
                ImageView imageView = this.ivDataTransaksi;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.reverseTransition(0);
                return;
            }
            setMessage setmessage2 = this.g;
            FrameLayout frameLayout = this.flLayoutDataTransaksi;
            setmessage2.a = frameLayout.getMeasuredHeight();
            setmessage2.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                  (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v11 'setmessage2' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.OR6ReviewFragment.showDataTransaksi(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewFragment.class
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
                android.widget.LinearLayout r0 = r0.llHeaderTransaksi
                android.graphics.drawable.Drawable r0 = r0.getBackground()
                android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
                r11 = r0
                r0 = r11
                r1 = 1
                r0.setCrossFadeEnabled(r1)
                r0 = r10
                android.widget.FrameLayout r0 = r0.flLayoutDataTransaksi
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 != r1) goto L_0x005a
                r0 = r10
                o.setMessage r0 = r0.g
                r1 = r10
                android.widget.FrameLayout r1 = r1.flLayoutDataTransaksi
                r0.c(r1)
                r0 = r10
                o.setMessage r0 = r0.g
                r12 = r0
                r0 = r10
                android.widget.ImageView r0 = r0.ivDataTransaksi
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
                r0.reverseTransition(r1)
                return
            L_0x005a:
                r0 = r10
                o.setMessage r0 = r0.g
                r12 = r0
                r0 = r10
                android.widget.FrameLayout r0 = r0.flLayoutDataTransaksi
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
                android.widget.ImageView r0 = r0.ivDataTransaksi
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
                r0.startTransition(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewFragment.showDataTransaksi(android.view.View):void");
        }

        @Override // com.bca.smartbranch.presenter.GetPPUNumberPresenter.read, com.bca.smartbranch.presenter.CheckDaftarTransferORPresenter.read, com.bca.smartbranch.presenter.UpdateDeleteDaftarTransferPresenter.write
        public final void u() {
            g();
        }

        @OnClick({2131299704})
        public void ubahDataBankPenerima(View view) {
            this.tvUbahDataBankPenerima.setVisibility(8);
            this.llDataBankPenerimaEditable.setVisibility(0);
            this.llDataBankPenerimaUneditable.setVisibility(8);
            setTxnAmount settxnamount = new Runnable() { // from class: o.setTxnAmount
                @Override // java.lang.Runnable
                public final void run() {
                    OR6ReviewFragment oR6ReviewFragment = OR6ReviewFragment.this;
                    EditText editText = null;
                    for (int size = oR6ReviewFragment.viewGroupDataBankPenerima.size() - 1; size >= 0; size--) {
                        editText = editText;
                        if (oR6ReviewFragment.viewGroupDataBankPenerima.get(size).getVisibility() == 0) {
                            editText = editText;
                            if (oR6ReviewFragment.viewGroupDataBankPenerima.get(size).isFocusable()) {
                                editText = editText;
                                if (oR6ReviewFragment.viewGroupDataBankPenerima.get(size).isEnabled()) {
                                    editText = (EditText) oR6ReviewFragment.viewGroupDataBankPenerima.get(size);
                                }
                            }
                        }
                    }
                    if (editText != null) {
                        editText.requestFocus();
                    }
                }
            };
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderBankPenerima.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataBankPenerima.getVisibility() == 8) {
                this.g.c(this.flLayoutDataBankPenerima);
                setMessage setmessage = this.g;
                ImageView imageView = this.ivDataBankPenerima;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                new Handler().postDelayed(settxnamount, 300);
                return;
            }
            settxnamount.run();
        }

        @OnClick({2131299711})
        public void ubahDataLainnya(View view) {
            this.tvUbahDataLainnya.setVisibility(8);
            this.llDataLainnyaEditable.setVisibility(0);
            this.llDataLainnyaUneditable.setVisibility(8);
            setTxnDetail settxndetail = new Runnable() { // from class: o.setTxnDetail
                @Override // java.lang.Runnable
                public final void run() {
                    OR6ReviewFragment oR6ReviewFragment = OR6ReviewFragment.this;
                    EditText editText = null;
                    for (int size = oR6ReviewFragment.viewGroupDataLainnya.size() - 1; size >= 0; size--) {
                        editText = editText;
                        if (oR6ReviewFragment.viewGroupDataLainnya.get(size).getVisibility() == 0) {
                            editText = editText;
                            if (oR6ReviewFragment.viewGroupDataLainnya.get(size).isFocusable()) {
                                editText = editText;
                                if (oR6ReviewFragment.viewGroupDataLainnya.get(size).isEnabled()) {
                                    editText = (EditText) oR6ReviewFragment.viewGroupDataLainnya.get(size);
                                }
                            }
                        }
                    }
                    if (editText != null) {
                        editText.requestFocus();
                    }
                }
            };
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderLainnya.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataLainnya.getVisibility() == 8) {
                this.g.c(this.flLayoutDataLainnya);
                setMessage setmessage = this.g;
                ImageView imageView = this.ivDataLainnya;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                new Handler().postDelayed(settxndetail, 300);
                return;
            }
            settxndetail.run();
        }

        @OnClick({2131299714})
        public void ubahDataPenerima(View view) {
            this.tvUbahDataPenerima.setVisibility(8);
            this.llDataPenerimaEditable.setVisibility(0);
            this.llDataPenerimaUneditable.setVisibility(8);
            getTxnDetail gettxndetail = new Runnable() { // from class: o.getTxnDetail
                @Override // java.lang.Runnable
                public final void run() {
                    OR6ReviewFragment oR6ReviewFragment = OR6ReviewFragment.this;
                    EditText editText = null;
                    for (int size = oR6ReviewFragment.viewGroupDataPenerima.size() - 1; size >= 0; size--) {
                        editText = editText;
                        if (oR6ReviewFragment.viewGroupDataPenerima.get(size).getVisibility() == 0) {
                            editText = editText;
                            if (oR6ReviewFragment.viewGroupDataPenerima.get(size).isFocusable()) {
                                editText = editText;
                                if (oR6ReviewFragment.viewGroupDataPenerima.get(size).isEnabled()) {
                                    editText = (EditText) oR6ReviewFragment.viewGroupDataPenerima.get(size);
                                }
                            }
                        }
                    }
                    if (editText != null) {
                        editText.requestFocus();
                    }
                }
            };
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderPenerima.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataPenerima.getVisibility() == 8) {
                this.g.c(this.flLayoutDataPenerima);
                setMessage setmessage = this.g;
                ImageView imageView = this.ivDataPenerima;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                new Handler().postDelayed(gettxndetail, 300);
                return;
            }
            gettxndetail.run();
        }

        @OnClick({2131299720})
        public void ubahDataPengirim(View view) {
            this.tvUbahDataPengirim.setVisibility(8);
            this.llDataPengirimEditable.setVisibility(0);
            this.llDataPengirimUneditable.setVisibility(8);
            setTxnNotes settxnnotes = new Runnable() { // from class: o.setTxnNotes
                @Override // java.lang.Runnable
                public final void run() {
                    OR6ReviewFragment oR6ReviewFragment = OR6ReviewFragment.this;
                    EditText editText = null;
                    for (int size = oR6ReviewFragment.viewGroupDataPengirim.size() - 1; size >= 0; size--) {
                        editText = editText;
                        if (oR6ReviewFragment.viewGroupDataPengirim.get(size).getVisibility() == 0) {
                            editText = editText;
                            if (oR6ReviewFragment.viewGroupDataPengirim.get(size).isFocusable()) {
                                editText = editText;
                                if (oR6ReviewFragment.viewGroupDataPengirim.get(size).isEnabled()) {
                                    editText = (EditText) oR6ReviewFragment.viewGroupDataPengirim.get(size);
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
            if (this.flLayoutDataPengirim.getVisibility() == 8) {
                this.g.c(this.flLayoutDataPengirim);
                setMessage setmessage = this.g;
                ImageView imageView = this.ivDataPengirim;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                new Handler().postDelayed(settxnnotes, 300);
                return;
            }
            settxnnotes.run();
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void updateDataToDraft(ConfirmBCACardAdapter$ViewHolder confirmBCACardAdapter$ViewHolder) {
            o();
            ((OutwardRemittanceFormActivity) getActivity()).y();
        }
    }
