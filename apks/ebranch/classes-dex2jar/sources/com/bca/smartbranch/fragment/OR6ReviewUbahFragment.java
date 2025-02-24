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
import com.bca.smartbranch.activity.OutwardRemittanceFormUbahActivity;
import com.bca.smartbranch.activity.PilihNegaraBagianActivity;
import com.bca.smartbranch.activity.PilihNegaraORActivity;
import com.bca.smartbranch.activity.PilihTujuanTransaksiORActivity;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.GetTxnTellerDetailResponse;
import com.bca.smartbranch.data.api.response.KategoriTujuanTransaksiORResponse;
import com.bca.smartbranch.dialog.HubunganKeuanganDialog;
import com.bca.smartbranch.dialog.JenisKodeBankDialog;
import com.bca.smartbranch.dialog.KategoriTujuanTransaksiORDialog;
import com.bca.smartbranch.dialog.PilihRekeningSumberDanaDialog;
import com.bca.smartbranch.dialog.SumberDanaORDialog;
import com.bca.smartbranch.dialog.TipeNasabahDialog;
import com.bca.smartbranch.dialog.TipeTujuanTransaksiDialog;
import com.bca.smartbranch.fragment.OR6ReviewUbahFragment;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.QuickRule;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import o.CISNResponse$$Parcelable;
import o.DetailTundaCCActivity_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.PilihNegaraActivity;
import o.ReservasiROSuccessActivity;
import o.ReservasiTellerOActivity_ViewBinding;
import o.ReservasiTundaSuccessActivity;
import o.ResetAccountActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.UpdateTxnTellerDetailRequest$InputSchema$$Parcelable;
import o.UpdateTxnTellerKUDetailRequest;
import o.UpdateTxnTellerKUDetailRequest$$Parcelable;
import o.clickOrangSamaDenganPemilik;
import o.copyWindowDataInto;
import o.documentProvider;
import o.getAddress3;
import o.getPromotion;
import o.onChooseNegara;
import o.onClickMinus;
import o.onExitForm;
import o.setMessage;
import o.togglePINBaruConfirm;
import o.togglePINConfirm;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewUbahFragment.class */
public class OR6ReviewUbahFragment extends BaseFragment implements Validator.ValidationListener, TextWatcher, AdapterView.OnItemClickListener {
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
    private List<DaftarTransferResponse.DaftarTransferOutput> g;
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
    private KategoriTujuanTransaksiORResponse.KategoriTujuanTransaksiOR l;
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
    private Validator m;
    private int n;

    /* renamed from: o */
    private int f46o;
    @BindView(2131298420)
    ScrollView svMain;
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
    private setMessage h = new setMessage();
    private int k = 6;
    private List<DaftarTransferResponse.DaftarTransferOutput> j = new ArrayList();
    private List<DaftarTransferResponse.DaftarTransferOutput> f = new ArrayList();

    private void a() {
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

    private void a(EditText editText) {
        this.tvErrorDataPengirim.get(this.viewGroupDataPengirim.indexOf(editText)).setVisibility(8);
        this.tilFormDataPengirim.get(this.viewGroupDataPengirim.indexOf(editText)).setBackgroundResource(2131230847);
    }

    private void b() {
        this.tvKodeSwiftBankPenerima.setText(this.etKodeSwiftBankPenerima.getText().toString());
        this.tvNamaBankPenerima.setText(this.etNamaBankPenerima.getText().toString());
        this.tvAlamatBankPenerima.setText(this.etAlamatBankPenerima.getText().toString());
        this.tvNegaraBagianBankPenerima.setText(this.etNegaraBagianBankPenerima.getText().toString());
        this.tvKotaBankPenerima.setText(this.etKotaBankPenerima.getText().toString());
        this.tvCodewordBankPenerima.setText(this.etCodewordBankPenerima.getText().toString());
        this.tvKeteranganAlamatBankPenerima.setText(this.etKeteranganAlamatBankPenerima.getText().toString());
        if (this.etNegaraBagianBankPenerima.getText().toString().isEmpty()) {
            this.llNegaraBagianBankPenerimaDisabled.setVisibility(8);
        }
        if (((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getAdditionalBankInfo().isEmpty()) {
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

    private static void b(int i, LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
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

    private void b(EditText editText) {
        this.tvErrorDataBankPenerima.get(this.viewGroupDataBankPenerima.indexOf(editText)).setVisibility(8);
        this.tilFormDataBankPenerima.get(this.viewGroupDataBankPenerima.indexOf(editText)).setBackgroundResource(2131230847);
    }

    private void d() {
        this.tilNamaBankPenerima.setHintTextAppearance(2131886848);
        this.tilNegaraBagianBankPenerima.setHintTextAppearance(2131886848);
        this.tilAlamatBankPenerima.setHintTextAppearance(2131886848);
        this.tilKotaBankPenerima.setHintTextAppearance(2131886848);
        b(getResources().getColor(2131099740), this.tilNamaBankPenerima);
        b(getResources().getColor(2131099740), this.tilNegaraBagianBankPenerima);
        b(getResources().getColor(2131099740), this.tilAlamatBankPenerima);
        b(getResources().getColor(2131099740), this.tilKotaBankPenerima);
        this.etNamaBankPenerima.setTextColor(getResources().getColor(2131099773));
        this.etNegaraBagianBankPenerima.setTextColor(getResources().getColor(2131099773));
        this.etAlamatBankPenerima.setTextColor(getResources().getColor(2131099773));
        this.etKotaBankPenerima.setTextColor(getResources().getColor(2131099773));
        this.etNamaBankPenerima.setEnabled(false);
        this.etNegaraBagianBankPenerima.setEnabled(false);
        this.etAlamatBankPenerima.setEnabled(false);
        this.etKotaBankPenerima.setEnabled(false);
    }

    private void d(EditText editText) {
        this.tvErrorDataPenerima.get(this.viewGroupDataPenerima.indexOf(editText)).setVisibility(8);
        this.tilFormDataPenerima.get(this.viewGroupDataPenerima.indexOf(editText)).setBackgroundResource(2131230847);
    }

    private void d(final EditText editText, final int i) {
        StringBuilder sb = new StringBuilder("Kode Kliring Lokal harus ");
        sb.append(i);
        sb.append(" karakter");
        final String obj = sb.toString();
        this.m.put(editText, new QuickRule<EditText>() { // from class: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.5
            private boolean d() {
                return !editText.getText().toString().isEmpty() && editText.getText().toString().length() >= i;
            }

            public final String getMessage(Context context) {
                return editText.getText().toString().isEmpty() ? context.getString(2131820763) : obj;
            }

            public final /* synthetic */ boolean isValid(View view) {
                return d();
            }

            public final /* synthetic */ boolean isValid(Object obj2) {
                return d();
            }
        });
    }

    private void e() {
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
        if (((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getFlag_iban().equals("Y")) {
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

    private void f() {
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
        this.tvKategoriTransaksi.setText(this.etKategoriTransaksi.getText().toString());
        this.tvTujuanTransaksi.setText(this.etTujuanTransaksi.getText().toString());
        this.tvSumberDanaTransaksi.setText(this.etSumberDanaTransaksi.getText().toString());
        this.tvBeritaTransaksi.setText(this.etBeritaTransaksi.getText().toString());
        this.tvHubunganKeuanganTransaksi.setText(this.etHubunganKeuanganTransaksi.getText().toString());
        if (((OutwardRemittanceFormUbahActivity) getActivity()).q.equals("O")) {
            this.tilJenisMataUangTransaksi.setHintTextAppearance(2131886848);
            this.tilFullAmountTransaksi.setHintTextAppearance(2131886848);
            this.tilValueTodayTransaksi.setHintTextAppearance(2131886848);
            b(getResources().getColor(2131099740), this.tilJenisMataUangTransaksi);
            b(getResources().getColor(2131099740), this.tilFullAmountTransaksi);
            b(getResources().getColor(2131099740), this.tilValueTodayTransaksi);
            this.etJenisMataUangTransaksi.setTextColor(getResources().getColor(2131099773));
            this.etFullAmountTransaksi.setTextColor(getResources().getColor(2131099773));
            this.etValueTodayTransaksi.setTextColor(getResources().getColor(2131099773));
            this.etJenisMataUangTransaksi.setEnabled(false);
            this.etFullAmountTransaksi.setEnabled(false);
            this.etValueTodayTransaksi.setEnabled(false);
            i = 0;
        } else {
            i = 0;
            if (((OutwardRemittanceFormUbahActivity) getActivity()).q.equals("M")) {
                this.tilJenisMataUangTransaksi.setHintTextAppearance(2131886848);
                b(getResources().getColor(2131099740), this.tilJenisMataUangTransaksi);
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

    private void i() {
        GetTxnTellerDetailResponse.TxnDetail txnDetail = ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail();
        txnDetail.setTxnAmount(getPromotion.c(this.etNominalTransaksi.getText().toString()));
        txnDetail.setPic(this.etNamaPengirim.getText().toString());
        txnDetail.setSenderPhone(this.etNoHpPengirim.getText().toString());
        txnDetail.setAccountNumber(this.etNorekPengirim.getText().toString());
        txnDetail.setPromotionCode(this.etKodePromosi.getText().toString());
        txnDetail.setReceiverName(this.etNamaPenerima.getText().toString());
        txnDetail.setReceiverCity(this.etKotaPenerima.getText().toString());
        if (txnDetail.getFlag_iban().equals("Y")) {
            txnDetail.setIbanAccountNumber(this.etNoIbanPenerima.getText().toString());
        } else {
            txnDetail.setIbanAccountNumber(this.etNorekPenerima.getText().toString());
        }
        txnDetail.setAdditionalBankInfo(this.etKeteranganAlamatBankPenerima.getText().toString());
        String product = txnDetail.getProduct();
        product.hashCode();
        int hashCode = product.hashCode();
        char c = 65535;
        if (hashCode != 70) {
            if (hashCode != 79) {
                if (hashCode != 76) {
                    if (hashCode == 77 && product.equals("M")) {
                        c = 2;
                    }
                } else if (product.equals("L")) {
                    c = 1;
                }
            } else if (product.equals("O")) {
                c = 3;
            }
        } else if (product.equals("F")) {
            c = 0;
        }
        if (c == 0) {
            if (txnDetail.getCountryCode().equals("CA") || txnDetail.getCountryCode().equals("AU")) {
                txnDetail.setLocalClearingCode(this.etCodewordBankPenerima.getText().toString());
            } else {
                txnDetail.setLocalClearingCode("");
            }
            StringBuilder sb = new StringBuilder("/FP/S/");
            sb.append(this.etCodewordBankPenerima.getText().toString());
            txnDetail.setCodeword(sb.toString());
            if (txnDetail.getCurrency().equals("USD")) {
                StringBuilder sb2 = new StringBuilder("/");
                sb2.append(this.etKotaPenerima.getText().toString());
                sb2.append("/");
                sb2.append(this.etKodePosPenerima.getText().toString());
                sb2.append("/");
                sb2.append(this.etNegaraBagianPenerima.getText().toString());
                txnDetail.setAddress2(sb2.toString());
            } else if (txnDetail.getCurrency().equals("AUD")) {
                StringBuilder sb3 = new StringBuilder("/");
                sb3.append(this.etKotaPenerima.getText().toString());
                sb3.append("/");
                sb3.append(this.etKodePosPenerima.getText().toString());
                sb3.append("/");
                sb3.append(txnDetail.getReceiverStates());
                txnDetail.setAddress2(sb3.toString());
            }
            if (txnDetail.getAddress2() != null && txnDetail.getAddress2().length() > 35) {
                txnDetail.setAddress2(txnDetail.getAddress2().substring(0, 35));
            }
            if (txnDetail.getReceiverCountry().equals("US")) {
                txnDetail.setReceiverStates(txnDetail.getReceiverStates());
            } else if (txnDetail.getReceiverCountry().equals("AU") && txnDetail.getCurrency().equals("AUD")) {
                txnDetail.setReceiverStates("");
            }
        } else if (c == 1) {
            txnDetail.setLocalClearingCode(this.etCodewordBankPenerima.getText().toString());
            txnDetail.setCodeword("/LCS");
            txnDetail.setReceiverStates(txnDetail.getReceiverStates());
        } else if (c == 2) {
            txnDetail.setLocalClearingCode(this.etCodewordBankPenerima.getText().toString());
            StringBuilder sb4 = new StringBuilder("/MULTI/");
            sb4.append(txnDetail.getCurrency());
            txnDetail.setCodeword(sb4.toString());
            txnDetail.setReceiverStates(txnDetail.getReceiverStates());
        } else if (c == 3) {
            txnDetail.setLocalClearingCode(this.etCodewordBankPenerima.getText().toString());
        }
        String trim = this.etBeritaTransaksi.getText().toString().replace("\n", " ").trim();
        if (!txnDetail.getCountryCode().startsWith("CN") || !txnDetail.getProduct().equals("O")) {
            txnDetail.setAddress(this.etAlamatPenerima.getText().toString().replace("\n", " ").trim());
            if (trim.length() > 35) {
                txnDetail.setTxnNotes(trim.substring(0, 35));
                txnDetail.setTxnNotes2(trim.substring(35));
            } else {
                txnDetail.setTxnNotes(trim);
                txnDetail.setTxnNotes2("");
            }
        } else {
            StringBuilder sb5 = new StringBuilder("PHOB:");
            sb5.append(this.etNoTelpPenerima.getText().toString());
            txnDetail.setTxnNotes(sb5.toString());
            txnDetail.setTxnNotes2(trim);
            StringBuilder sb6 = new StringBuilder("ADD.");
            sb6.append(this.etAlamatPenerima.getText().toString().replace("\n", " ").trim());
            txnDetail.setAddress(sb6.toString());
        }
        ((OutwardRemittanceFormUbahActivity) getActivity()).s();
    }

    private void j() {
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

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etNorekPengirim.getEditableText()) {
            if (this.tvErrorDataPengirim.get(this.viewGroupDataPengirim.indexOf(this.etNorekPengirim)).getVisibility() != 0) {
                return;
            }
            if (this.tvErrorDataPengirim.get(this.viewGroupDataPengirim.indexOf(this.etNorekPengirim)).getText().equals(getString(2131820949))) {
                if (!this.etNorekPengirim.getText().toString().isEmpty()) {
                    a(this.etNorekPengirim);
                }
            } else if (this.tvErrorDataPengirim.get(this.viewGroupDataPengirim.indexOf(this.etNorekPengirim)).getText().equals(getString(2131820950)) && this.etNorekPengirim.getText().toString().length() >= 10) {
                a(this.etNorekPengirim);
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
                this.etNominalTransaksi.setSuffix(((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getCurrency().substring(0, 3));
            }
            if (this.tvErrorDataTransaksi.get(this.viewGroupDataTransaksi.indexOf(this.etNominalTransaksi)).getVisibility() == 0) {
                if (this.tvErrorDataTransaksi.get(this.viewGroupDataTransaksi.indexOf(this.etNominalTransaksi)).getText().toString().equals(getString(2131820906))) {
                    if (!this.etNominalTransaksi.getText().toString().isEmpty()) {
                        this.tvErrorDataTransaksi.get(this.viewGroupDataTransaksi.indexOf(this.etNominalTransaksi)).setVisibility(8);
                        this.llNominalTransaksi.setBackgroundResource(2131230847);
                    }
                } else if (!this.etNominalTransaksi.getText().toString().isEmpty()) {
                    if (BigDecimal.valueOf(Double.parseDouble(this.etNominalTransaksi.getText().toString().replaceAll("\\.", "").replace(",", "."))).doubleValue() >= BigDecimal.valueOf(Double.parseDouble(((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getLimitMin())).doubleValue()) {
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
                    b(this.etCodewordBankPenerima);
                }
            } else if (this.etCodewordBankPenerima.getText().toString().length() >= this.f46o) {
                b(this.etCodewordBankPenerima);
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
            } else if (this.etKodePosPenerima.getText().toString().length() >= this.k) {
                d(this.etKodePosPenerima);
            }
        } else if (editable == this.etNoIbanPenerima.getEditableText()) {
            if (this.tvErrorDataPenerima.get(this.viewGroupDataPenerima.indexOf(this.etNoIbanPenerima)).getVisibility() != 0) {
                return;
            }
            if (this.tvErrorDataPenerima.get(this.viewGroupDataPenerima.indexOf(this.etNoIbanPenerima)).getText().toString().equals(getString(2131820910))) {
                if (!this.etNoIbanPenerima.getText().toString().isEmpty()) {
                    d(this.etNoIbanPenerima);
                }
            } else if (this.etNoIbanPenerima.getText().toString().length() >= 2 && this.etNoIbanPenerima.getText().toString().substring(0, 2).equalsIgnoreCase(this.etNoIbanPenerima.getTag().toString())) {
                d(this.etNoIbanPenerima);
            }
        } else if (editable == this.etKodePromosi.getEditableText()) {
            getPromotion.b(this.tvErrorDataLainnya, this.tilFormDataLainnya, this.viewGroupDataLainnya, this.etKodePromosi);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493199;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        getActivity().finish();
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

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseHubunganKeuanganOR(togglePINConfirm togglepinconfirm) {
        this.etHubunganKeuanganTransaksi.setError(null);
        this.tilHubunganKeuanganTransaksi.setHintEnabled(true);
        this.etHubunganKeuanganTransaksi.setText(togglepinconfirm.a);
        ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setFinancialRelation(togglepinconfirm.a.equalsIgnoreCase("Ya") ? "A" : "N");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseJenisKodeBankTransaksi(onClickMinus onclickminus) {
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseKategoriTujuanTransaksiOR(onExitForm onexitform) {
        this.l = this.i.get(onexitform.e);
        this.etKategoriTransaksi.setError(null);
        this.tilKategoriTransaksi.setHintEnabled(true);
        this.etKategoriTransaksi.setText(this.l.getCategorySttDesc());
        m();
        this.etTujuanTransaksi.setText("");
        this.tilTujuanTransaksi.setHintEnabled(false);
        this.tilTujuanTransaksi.setVisibility(0);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseNegaraBagian(PilihNegaraActivity pilihNegaraActivity) {
        d(this.etNegaraBagianPenerima);
        this.etNegaraBagianPenerima.setError(null);
        this.tilNegaraBagianPenerima.setHintEnabled(true);
        this.etNegaraBagianPenerima.setText(pilihNegaraActivity.e);
        ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setReceiverStates(pilihNegaraActivity.b);
        ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setReceiverStatesName(pilihNegaraActivity.e);
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
        String str = ((OutwardRemittanceFormUbahActivity) getActivity()).q;
        str.hashCode();
        if (!str.equals("O")) {
            this.llNegaraBagianPenerima.setVisibility(8);
            this.llKodePosPenerima.setVisibility(8);
            this.m.removeRules(this.etNegaraBagianPenerima);
            this.m.removeRules(this.etKodePosPenerima);
        } else if (onchoosenegara.d.equals("US")) {
            this.llNegaraBagianPenerima.setVisibility(0);
            Validator validator = this.m;
            EditText editText = this.etNegaraBagianPenerima;
            validator.put(editText, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b6: INVOKE  
                  (r0v42 'validator' com.mobsandgeeks.saripaar.Validator)
                  (r0v44 'editText' android.widget.EditText)
                  (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v1 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                  (wrap: o.getPromotion$10 : 0x00b2: CONSTRUCTOR  (r0v44 'editText' android.widget.EditText), (2131820879 int) call: o.getPromotion.10.<init>(android.widget.EditText, int):void type: CONSTRUCTOR)
                 elemType: com.mobsandgeeks.saripaar.QuickRule)
                 type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.onChooseNegaraTujuan(o.onChooseNegara):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewUbahFragment.class
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
            // Method dump skipped, instructions count: 249
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.onChooseNegaraTujuan(o.onChooseNegara):void");
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChoosePilihNorekPengirim(ReservasiROSuccessActivity reservasiROSuccessActivity) {
            if (!reservasiROSuccessActivity.d.isEmpty()) {
                a(this.etNorekPengirim);
                this.etNorekPengirim.setText(reservasiROSuccessActivity.d.split("-")[0].trim());
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
            ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setTxnSourceValue(reservasiTellerOActivity_ViewBinding.a);
            ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setTxnSource(String.format("%02d", Integer.valueOf(Integer.parseInt(reservasiTellerOActivity_ViewBinding.d))));
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChooseTipeNasabahPenerima(ReservasiTundaSuccessActivity reservasiTundaSuccessActivity) {
            this.etTipeNasabahPenerima.setError(null);
            this.tilTipeNasabahPenerima.setHintEnabled(true);
            this.etTipeNasabahPenerima.setText(reservasiTundaSuccessActivity.a);
            if (reservasiTundaSuccessActivity.a.equals("Individu")) {
                ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setCustomerType("I");
            } else {
                ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setCustomerType("P");
            }
            d(this.etTipeTujuanTransaksiPenerima);
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
                ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setTxnPurposeType("B");
            }
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChooseTipeTujuanTransaksiPenerima(ResetAccountActivity resetAccountActivity) {
            d(this.etTipeTujuanTransaksiPenerima);
            this.etTipeTujuanTransaksiPenerima.setError(null);
            this.tilTipeTujuanTransaksiPenerima.setHintEnabled(true);
            this.etTipeTujuanTransaksiPenerima.setText(resetAccountActivity.a);
            if (resetAccountActivity.a.equals("Bisnis")) {
                ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setTxnPurposeType("B");
            } else {
                ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setTxnPurposeType("N");
            }
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChooseTujuanTransaksiOR(togglePINBaruConfirm togglepinbaruconfirm) {
            this.etTujuanTransaksi.setError(null);
            this.tilTujuanTransaksi.setHintEnabled(true);
            this.etTujuanTransaksi.setText(togglepinbaruconfirm.c);
            EditText editText = this.etTujuanTransaksi;
            this.tvErrorDataTransaksi.get(this.viewGroupDataTransaksi.indexOf(editText)).setVisibility(8);
            this.tilFormDataTransaksi.get(this.viewGroupDataTransaksi.indexOf(editText)).setBackgroundResource(2131230847);
            ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setTxnPurposeValue(togglepinbaruconfirm.c);
            ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setTxnPurpose(String.format("%02d", Integer.valueOf(Integer.parseInt(togglepinbaruconfirm.e))));
        }

        @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
        public void onDestroyView() {
            documentProvider.b().e(this);
            onDestroyView();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String substring = ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getCurrency().substring(0, 3);
            if (this.etNamaPenerima.isFocused()) {
                this.etNamaPenerima.setAdapter(null);
                this.etNamaPenerima.setText(this.a.e.get(i).d);
                AutoCompleteTextView autoCompleteTextView = this.etNamaPenerima;
                autoCompleteTextView.setSelection(autoCompleteTextView.length());
                this.etNamaPenerima.setAdapter(this.a);
                if (((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getFlag_iban().equals("Y")) {
                    this.etNoIbanPenerima.setText(this.a.e.get(i).b);
                    AutoCompleteTextView autoCompleteTextView2 = this.etNoIbanPenerima;
                    autoCompleteTextView2.setSelection(autoCompleteTextView2.length());
                    this.tilNoIbanPenerima.setHintEnabled(true);
                } else {
                    this.etNorekPenerima.setText(this.a.e.get(i).b);
                    AutoCompleteTextView autoCompleteTextView3 = this.etNorekPenerima;
                    autoCompleteTextView3.setSelection(autoCompleteTextView3.length());
                    this.tilNorekPenerima.setHintEnabled(true);
                }
                this.etAlamatPenerima.setText(this.a.e.get(i).f);
                EditText editText = this.etAlamatPenerima;
                editText.setSelection(editText.length());
                this.tilAlamatPenerima.setHintEnabled(true);
                this.etKotaPenerima.setText(this.a.e.get(i).i);
                EditText editText2 = this.etKotaPenerima;
                editText2.setSelection(editText2.length());
                if (!this.etKotaPenerima.getText().toString().isEmpty()) {
                    this.tilKotaPenerima.setHintEnabled(true);
                }
                this.etNegaraTujuanPenerima.setText(this.a.e.get(i).k);
                ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setReceiverCountry(this.a.e.get(i).h);
                ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setReceiverCountryName(this.a.e.get(i).k);
                if (this.etNegaraTujuanPenerima.isEnabled()) {
                    d(this.etNegaraTujuanPenerima);
                    this.tilNegaraTujuanPenerima.setHintEnabled(true);
                    String str = ((OutwardRemittanceFormUbahActivity) getActivity()).q;
                    str.hashCode();
                    if (!str.equals("O")) {
                        this.tilNegaraBagianPenerima.setVisibility(8);
                        this.tilKodePosPenerima.setVisibility(8);
                    } else if (this.a.e.get(i).h.equals("US")) {
                        this.tilNegaraBagianPenerima.setVisibility(0);
                    } else {
                        this.tilNegaraBagianPenerima.setVisibility(8);
                    }
                }
                d(this.etTipeNasabahPenerima);
                this.etTipeNasabahPenerima.setError(null);
                if (this.a.e.get(i).g.equalsIgnoreCase("I")) {
                    this.etTipeNasabahPenerima.setText("Individu");
                    ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setCustomerType("I");
                } else if (this.a.e.get(i).g.equalsIgnoreCase("P")) {
                    this.etTipeNasabahPenerima.setText("Perusahaan");
                    ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setCustomerType("P");
                } else {
                    this.etTipeNasabahPenerima.setText("");
                    ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setCustomerType("");
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
                    ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setTxnPurposeType("");
                    return;
                }
                this.tilTipeTujuanTransaksiPenerima.setVisibility(0);
            } else if (this.etNorekPenerima.isFocused() || this.etNoIbanPenerima.isFocused()) {
                if (this.etNorekPenerima.isFocused()) {
                    this.etNorekPenerima.setAdapter(null);
                    this.etNorekPenerima.setText(this.d.e.get(i).b);
                    AutoCompleteTextView autoCompleteTextView4 = this.etNorekPenerima;
                    autoCompleteTextView4.setSelection(autoCompleteTextView4.length());
                    this.etNorekPenerima.setAdapter(this.d);
                } else if (this.etNoIbanPenerima.isFocused()) {
                    this.etNoIbanPenerima.setAdapter(null);
                    this.etNoIbanPenerima.setText(this.d.e.get(i).b);
                    AutoCompleteTextView autoCompleteTextView5 = this.etNoIbanPenerima;
                    autoCompleteTextView5.setSelection(autoCompleteTextView5.length());
                    this.etNoIbanPenerima.setAdapter(this.d);
                }
                this.etNamaPenerima.setText(this.d.e.get(i).d);
                AutoCompleteTextView autoCompleteTextView6 = this.etNamaPenerima;
                autoCompleteTextView6.setSelection(autoCompleteTextView6.length());
                this.tilNamaPenerima.setHintEnabled(true);
                this.etAlamatPenerima.setText(this.d.e.get(i).f);
                EditText editText4 = this.etAlamatPenerima;
                editText4.setSelection(editText4.length());
                this.tilAlamatPenerima.setHintEnabled(true);
                this.etKotaPenerima.setText(this.d.e.get(i).i);
                EditText editText5 = this.etKotaPenerima;
                editText5.setSelection(editText5.length());
                if (!this.etKotaPenerima.getText().toString().isEmpty()) {
                    this.tilKotaPenerima.setHintEnabled(true);
                }
                this.etNegaraTujuanPenerima.setText(this.d.e.get(i).k);
                ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setReceiverCountry(this.d.e.get(i).h);
                ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setReceiverCountryName(this.d.e.get(i).k);
                if (this.etNegaraTujuanPenerima.isEnabled()) {
                    d(this.etNegaraTujuanPenerima);
                    this.tilNegaraTujuanPenerima.setHintEnabled(true);
                    String str2 = ((OutwardRemittanceFormUbahActivity) getActivity()).q;
                    str2.hashCode();
                    if (!str2.equals("O")) {
                        this.tilNegaraBagianPenerima.setVisibility(8);
                        this.tilKodePosPenerima.setVisibility(8);
                    } else if (this.d.e.get(i).h.equals("US")) {
                        this.tilNegaraBagianPenerima.setVisibility(0);
                    } else {
                        this.tilNegaraBagianPenerima.setVisibility(8);
                    }
                }
                d(this.etTipeNasabahPenerima);
                this.etTipeNasabahPenerima.setError(null);
                if (this.d.e.get(i).g.equalsIgnoreCase("I")) {
                    this.etTipeNasabahPenerima.setText("Individu");
                    ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setCustomerType("I");
                } else if (this.d.e.get(i).g.equalsIgnoreCase("P")) {
                    this.etTipeNasabahPenerima.setText("Perusahaan");
                    ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setCustomerType("P");
                } else {
                    this.etTipeNasabahPenerima.setText("");
                    ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setCustomerType("");
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
                    ((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().setTxnPurposeType("");
                    return;
                }
                this.tilTipeTujuanTransaksiPenerima.setVisibility(0);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i2 == 0) {
                this.n = i + 1;
            } else {
                this.n = i;
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
                        this.h.c(this.flLayoutDataPengirim);
                        setMessage setmessage = this.h;
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
                        this.h.c(this.flLayoutDataTransaksi);
                        setMessage setmessage2 = this.h;
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
                        this.h.c(this.flLayoutDataBankPenerima);
                        setMessage setmessage3 = this.h;
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
                        this.h.c(this.flLayoutDataPenerima);
                        setMessage setmessage4 = this.h;
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
                            this.h.c(this.flLayoutDataLainnya);
                            setMessage setmessage5 = this.h;
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
            if (!((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getLimitMin().isEmpty() && !this.etNominalTransaksi.getText().toString().isEmpty()) {
                if (BigDecimal.valueOf(Double.parseDouble(this.etNominalTransaksi.getText().toString().replaceAll("\\.", "").replace(",", "."))).doubleValue() < BigDecimal.valueOf(Double.parseDouble(((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getLimitMin())).doubleValue()) {
                    this.tvErrorDataTransaksi.get(3).setVisibility(0);
                    TextView textView = this.tvErrorDataTransaksi.get(3);
                    StringBuilder sb = new StringBuilder("Nominal minimal ");
                    sb.append(getPromotion.i(((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getLimitMin().replace(".", ",")));
                    sb.append(" ");
                    sb.append(((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getCurrency().substring(0, 3));
                    textView.setText(sb.toString());
                    this.llNominalTransaksi.setBackgroundResource(2131230870);
                }
            }
            final LinearLayout linearLayout = z8 ? this.llWrapperDataPengirim : z7 ? this.llWrapperDataTransaksi : z6 ? this.llWrapperDataBankPenerima : z5 ? this.llWrapperDataPenerima : z9 ? this.llWrapperDataLainnya : null;
            if (editText != null) {
                editText.requestFocus();
            }
            if (linearLayout != null) {
                new Handler().post(new Runnable() { // from class: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        OR6ReviewUbahFragment.this.svMain.scrollTo(0, linearLayout.getTop());
                    }
                });
            }
        }

        @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
        public void onValidationSucceeded() {
            ((OutwardRemittanceFormUbahActivity) getActivity()).t();
            if (!((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getLimitMin().isEmpty()) {
                if (BigDecimal.valueOf(Double.parseDouble(this.etNominalTransaksi.getText().toString().replaceAll("\\.", "").replace(",", "."))).doubleValue() < BigDecimal.valueOf(Double.parseDouble(((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getLimitMin())).doubleValue()) {
                    this.tvErrorDataTransaksi.get(2).setVisibility(0);
                    TextView textView = this.tvErrorDataTransaksi.get(2);
                    StringBuilder sb = new StringBuilder("Nominal minimal ");
                    sb.append(getPromotion.i(((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getLimitMin().replace(".", ",")));
                    sb.append(" ");
                    sb.append(((OutwardRemittanceFormUbahActivity) getActivity()).f.getTxnDetail().getCurrency().substring(0, 3));
                    textView.setText(sb.toString());
                    this.llNominalTransaksi.setBackgroundResource(2131230870);
                    return;
                }
            }
            i();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0527, code lost:
            if (r13 != 2) goto L_0x0544;
         */
        /* JADX WARN: Removed duplicated region for block: B:108:0x05d0  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x05f1  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0635  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0640  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0668  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x06de  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x085d  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x095d  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x0a50  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x0b7c  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0b89  */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0bc5  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x0bd3  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x0bfc  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x0ccd  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x0cf1  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x0dbc  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x0e2f  */
        /* JADX WARN: Removed duplicated region for block: B:218:0x0e49  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x0e67  */
        /* JADX WARN: Removed duplicated region for block: B:259:0x0feb  */
        /* JADX WARN: Removed duplicated region for block: B:262:0x1031  */
        /* JADX WARN: Removed duplicated region for block: B:270:0x10c0  */
        /* JADX WARN: Removed duplicated region for block: B:304:0x11eb  */
        /* JADX WARN: Removed duplicated region for block: B:350:0x133d  */
        /* JADX WARN: Removed duplicated region for block: B:351:0x138c  */
        /* JADX WARN: Removed duplicated region for block: B:354:0x142d  */
        /* JADX WARN: Removed duplicated region for block: B:360:0x145a A[LOOP:2: B:358:0x144d->B:360:0x145a, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:364:0x1497 A[LOOP:3: B:362:0x148a->B:364:0x1497, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:368:0x14d9 A[LOOP:4: B:366:0x14c8->B:368:0x14d9, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:371:0x1516 A[LOOP:5: B:369:0x1509->B:371:0x1516, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:374:0x155d  */
        @Override // androidx.fragment.app.Fragment
        /* Code decompiled incorrectly, please refer to instructions dump */
        public void onViewCreated(android.view.View r11, android.os.Bundle r12) {
            /*
            // Method dump skipped, instructions count: 5638
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.onViewCreated(android.view.View, android.os.Bundle):void");
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
            boolean z = false;
            intent.putExtra("is_from_reservation", false);
            intent.putExtra("is_from_edit", true);
            if (((OutwardRemittanceFormUbahActivity) getActivity()).p == null || ((OutwardRemittanceFormUbahActivity) getActivity()).p.getCountAll() == 0) {
                z = true;
            }
            intent.putExtra("is_save_draft_and_hit_service", z);
            startActivity(intent);
        }

        @OnClick({2131297090})
        public void pilihNegaraTujuanPenerima(View view) {
            Intent intent = new Intent(getContext(), PilihNegaraORActivity.class);
            intent.putExtra("title", "Pilih Negara");
            boolean z = false;
            intent.putExtra("is_from_reservation", false);
            intent.putExtra("is_from_edit", true);
            if (((OutwardRemittanceFormUbahActivity) getActivity()).p == null || ((OutwardRemittanceFormUbahActivity) getActivity()).p.getCountAll() == 0) {
                z = true;
            }
            intent.putExtra("is_save_draft_and_hit_service", z);
            startActivity(intent);
        }

        @OnClick({2131297114})
        public void pilihNorekPengirim(View view) {
            if (this.e != null && this.e.getVerified().equals("Y")) {
                PilihRekeningSumberDanaDialog pilihRekeningSumberDanaDialog = new PilihRekeningSumberDanaDialog();
                pilihRekeningSumberDanaDialog.d = ((OutwardRemittanceFormUbahActivity) getActivity()).s;
                pilihRekeningSumberDanaDialog.b = this.etNorekPengirim.getText().toString();
                pilihRekeningSumberDanaDialog.show(getFragmentManager(), "PilihRekeningSumberDanaDialog");
            }
        }

        @OnClick({2131297201})
        public void pilihSumberDanaOR(View view) {
            Bundle bundle = new Bundle();
            bundle.putString(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, this.etSumberDanaTransaksi.getText().toString());
            SumberDanaORDialog sumberDanaORDialog = new SumberDanaORDialog(((OutwardRemittanceFormUbahActivity) getActivity()).t);
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
            intent.putExtra("code", this.l.getCategorySttCode());
            boolean z = false;
            intent.putExtra("is_from_reservation", false);
            intent.putExtra("is_from_edit", true);
            if (((OutwardRemittanceFormUbahActivity) getActivity()).p == null || ((OutwardRemittanceFormUbahActivity) getActivity()).p.getCountAll() == 0) {
                z = true;
            }
            intent.putExtra("is_save_draft_and_hit_service", z);
            startActivity(intent);
        }

        @OnClick({2131296440})
        public void proses(View view) {
            getPromotion.d(getContext());
            m();
            this.m.validate();
        }

        @OnClick({2131299722})
        public void setTvUbahDataTransaksi(View view) {
            this.tvUbahDataTransaksi.setVisibility(8);
            this.llDataTransaksiEditable.setVisibility(0);
            this.llDataTransaksiUneditable.setVisibility(8);
            UpdateTxnTellerKUDetailRequest updateTxnTellerKUDetailRequest = new Runnable() { // from class: o.UpdateTxnTellerKUDetailRequest

                /* loaded from: classes-dex2jar.jar:o/UpdateTxnTellerKUDetailRequest$TxnDetail.class */
                public final /* synthetic */ class TxnDetail implements Runnable {
                    public final /* synthetic */ OR6ReviewUbahFragment d;

                    public /* synthetic */ TxnDetail(OR6ReviewUbahFragment oR6ReviewUbahFragment) {
                        this.d = oR6ReviewUbahFragment;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        OR6ReviewUbahFragment oR6ReviewUbahFragment = this.d;
                        EditText editText = null;
                        for (int size = oR6ReviewUbahFragment.viewGroupDataLainnya.size() - 1; size >= 0; size--) {
                            editText = editText;
                            if (oR6ReviewUbahFragment.viewGroupDataLainnya.get(size).getVisibility() == 0) {
                                editText = editText;
                                if (oR6ReviewUbahFragment.viewGroupDataLainnya.get(size).isFocusable()) {
                                    editText = editText;
                                    if (oR6ReviewUbahFragment.viewGroupDataLainnya.get(size).isEnabled()) {
                                        editText = (EditText) oR6ReviewUbahFragment.viewGroupDataLainnya.get(size);
                                    }
                                }
                            }
                        }
                        if (editText != null) {
                            editText.requestFocus();
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    OR6ReviewUbahFragment oR6ReviewUbahFragment = OR6ReviewUbahFragment.this;
                    EditText editText = null;
                    for (int size = oR6ReviewUbahFragment.viewGroupDataTransaksi.size() - 1; size >= 0; size--) {
                        editText = editText;
                        if (oR6ReviewUbahFragment.viewGroupDataTransaksi.get(size).getVisibility() == 0) {
                            editText = editText;
                            if (oR6ReviewUbahFragment.viewGroupDataTransaksi.get(size).isFocusable()) {
                                editText = editText;
                                if (oR6ReviewUbahFragment.viewGroupDataTransaksi.get(size).isEnabled()) {
                                    editText = (EditText) oR6ReviewUbahFragment.viewGroupDataTransaksi.get(size);
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
                this.h.c(this.flLayoutDataTransaksi);
                setMessage setmessage = this.h;
                ImageView imageView = this.ivDataTransaksi;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                new Handler().postDelayed(updateTxnTellerKUDetailRequest, 300);
                return;
            }
            updateTxnTellerKUDetailRequest.run();
        }

        @OnClick({2131297333, 2131298894})
        public void showDataBankPenerima(View view) {
            getPromotion.d(getActivity());
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderBankPenerima.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataBankPenerima.getVisibility() == 8) {
                this.h.c(this.flLayoutDataBankPenerima);
                setMessage setmessage = this.h;
                ImageView imageView = this.ivDataBankPenerima;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.reverseTransition(0);
                return;
            }
            setMessage setmessage2 = this.h;
            FrameLayout frameLayout = this.flLayoutDataBankPenerima;
            setmessage2.a = frameLayout.getMeasuredHeight();
            setmessage2.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                  (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v11 'setmessage2' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.showDataBankPenerima(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewUbahFragment.class
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
                o.setMessage r0 = r0.h
                r1 = r10
                android.widget.FrameLayout r1 = r1.flLayoutDataBankPenerima
                r0.c(r1)
                r0 = r10
                o.setMessage r0 = r0.h
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
                o.setMessage r0 = r0.h
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
                o.setMessage r0 = r0.h
                r12 = r0
                r0 = r10
                android.widget.ImageView r0 = r0.ivDataBankPenerima
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
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.showDataBankPenerima(android.view.View):void");
        }

        @OnClick({2131297340, 2131298901})
        public void showDataLainnya(View view) {
            getPromotion.d(getActivity());
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderLainnya.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataLainnya.getVisibility() == 8) {
                this.h.c(this.flLayoutDataLainnya);
                setMessage setmessage = this.h;
                ImageView imageView = this.ivDataLainnya;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.reverseTransition(0);
                return;
            }
            setMessage setmessage2 = this.h;
            FrameLayout frameLayout = this.flLayoutDataLainnya;
            setmessage2.a = frameLayout.getMeasuredHeight();
            setmessage2.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                  (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v11 'setmessage2' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.showDataLainnya(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewUbahFragment.class
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
                o.setMessage r0 = r0.h
                r1 = r10
                android.widget.FrameLayout r1 = r1.flLayoutDataLainnya
                r0.c(r1)
                r0 = r10
                o.setMessage r0 = r0.h
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
                o.setMessage r0 = r0.h
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
                o.setMessage r0 = r0.h
                r13 = r0
                r0 = r10
                android.widget.ImageView r0 = r0.ivDataLainnya
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
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.showDataLainnya(android.view.View):void");
        }

        @OnClick({2131297344, 2131298904})
        public void showDataPenerima(View view) {
            getPromotion.d(getActivity());
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderPenerima.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataPenerima.getVisibility() == 8) {
                this.h.c(this.flLayoutDataPenerima);
                setMessage setmessage = this.h;
                ImageView imageView = this.ivDataPenerima;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.reverseTransition(0);
                return;
            }
            setMessage setmessage2 = this.h;
            FrameLayout frameLayout = this.flLayoutDataPenerima;
            setmessage2.a = frameLayout.getMeasuredHeight();
            setmessage2.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                  (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v11 'setmessage2' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.showDataPenerima(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewUbahFragment.class
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
                o.setMessage r0 = r0.h
                r1 = r10
                android.widget.FrameLayout r1 = r1.flLayoutDataPenerima
                r0.c(r1)
                r0 = r10
                o.setMessage r0 = r0.h
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
                o.setMessage r0 = r0.h
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
                o.setMessage r0 = r0.h
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
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.showDataPenerima(android.view.View):void");
        }

        @OnClick({2131297350, 2131298910})
        public void showDataPengirim(View view) {
            getPromotion.d(getActivity());
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderPengirim.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataPengirim.getVisibility() == 8) {
                this.h.c(this.flLayoutDataPengirim);
                setMessage setmessage = this.h;
                ImageView imageView = this.ivDataPengirim;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.reverseTransition(0);
                return;
            }
            setMessage setmessage2 = this.h;
            FrameLayout frameLayout = this.flLayoutDataPengirim;
            setmessage2.a = frameLayout.getMeasuredHeight();
            setmessage2.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                  (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v11 'setmessage2' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.showDataPengirim(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewUbahFragment.class
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
                o.setMessage r0 = r0.h
                r1 = r10
                android.widget.FrameLayout r1 = r1.flLayoutDataPengirim
                r0.c(r1)
                r0 = r10
                o.setMessage r0 = r0.h
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
                o.setMessage r0 = r0.h
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
                o.setMessage r0 = r0.h
                r13 = r0
                r0 = r10
                android.widget.ImageView r0 = r0.ivDataPengirim
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
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.showDataPengirim(android.view.View):void");
        }

        @OnClick({2131297353, 2131298912})
        public void showDataTransaksi(View view) {
            getPromotion.d(getActivity());
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderTransaksi.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataTransaksi.getVisibility() == 8) {
                this.h.c(this.flLayoutDataTransaksi);
                setMessage setmessage = this.h;
                ImageView imageView = this.ivDataTransaksi;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.reverseTransition(0);
                return;
            }
            setMessage setmessage2 = this.h;
            FrameLayout frameLayout = this.flLayoutDataTransaksi;
            setmessage2.a = frameLayout.getMeasuredHeight();
            setmessage2.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                  (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'frameLayout' android.widget.FrameLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v11 'setmessage2' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.showDataTransaksi(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/OR6ReviewUbahFragment.class
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
                o.setMessage r0 = r0.h
                r1 = r10
                android.widget.FrameLayout r1 = r1.flLayoutDataTransaksi
                r0.c(r1)
                r0 = r10
                o.setMessage r0 = r0.h
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
                o.setMessage r0 = r0.h
                r13 = r0
                r0 = r10
                android.widget.FrameLayout r0 = r0.flLayoutDataTransaksi
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
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.OR6ReviewUbahFragment.showDataTransaksi(android.view.View):void");
        }

        @OnClick({2131299704})
        public void ubahDataBankPenerima(View view) {
            this.tvUbahDataBankPenerima.setVisibility(8);
            this.llDataBankPenerimaEditable.setVisibility(0);
            this.llDataBankPenerimaUneditable.setVisibility(8);
            UpdateTxnTellerKUDetailRequest$$Parcelable updateTxnTellerKUDetailRequest$$Parcelable = new Runnable() { // from class: o.UpdateTxnTellerKUDetailRequest$$Parcelable
                @Override // java.lang.Runnable
                public final void run() {
                    OR6ReviewUbahFragment oR6ReviewUbahFragment = OR6ReviewUbahFragment.this;
                    EditText editText = null;
                    for (int size = oR6ReviewUbahFragment.viewGroupDataBankPenerima.size() - 1; size >= 0; size--) {
                        editText = editText;
                        if (oR6ReviewUbahFragment.viewGroupDataBankPenerima.get(size).getVisibility() == 0) {
                            editText = editText;
                            if (oR6ReviewUbahFragment.viewGroupDataBankPenerima.get(size).isFocusable()) {
                                editText = editText;
                                if (oR6ReviewUbahFragment.viewGroupDataBankPenerima.get(size).isEnabled()) {
                                    editText = (EditText) oR6ReviewUbahFragment.viewGroupDataBankPenerima.get(size);
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
                this.h.c(this.flLayoutDataBankPenerima);
                setMessage setmessage = this.h;
                ImageView imageView = this.ivDataBankPenerima;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                new Handler().postDelayed(updateTxnTellerKUDetailRequest$$Parcelable, 300);
                return;
            }
            updateTxnTellerKUDetailRequest$$Parcelable.run();
        }

        @OnClick({2131299711})
        public void ubahDataLainnya(View view) {
            this.tvUbahDataLainnya.setVisibility(8);
            this.llDataLainnyaEditable.setVisibility(0);
            this.llDataLainnyaUneditable.setVisibility(8);
            UpdateTxnTellerKUDetailRequest.TxnDetail txnDetail = new UpdateTxnTellerKUDetailRequest.TxnDetail(this);
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderLainnya.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.flLayoutDataLainnya.getVisibility() == 8) {
                this.h.c(this.flLayoutDataLainnya);
                setMessage setmessage = this.h;
                ImageView imageView = this.ivDataLainnya;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                new Handler().postDelayed(txnDetail, 300);
                return;
            }
            txnDetail.run();
        }

        @OnClick({2131299714})
        public void ubahDataPenerima(View view) {
            this.tvUbahDataPenerima.setVisibility(8);
            this.llDataPenerimaEditable.setVisibility(0);
            this.llDataPenerimaUneditable.setVisibility(8);
            UpdateTxnTellerDetailRequest$InputSchema$$Parcelable updateTxnTellerDetailRequest$InputSchema$$Parcelable = new Runnable() { // from class: o.UpdateTxnTellerDetailRequest$InputSchema$$Parcelable
                @Override // java.lang.Runnable
                public final void run() {
                    OR6ReviewUbahFragment oR6ReviewUbahFragment = OR6ReviewUbahFragment.this;
                    EditText editText = null;
                    for (int size = oR6ReviewUbahFragment.viewGroupDataPenerima.size() - 1; size >= 0; size--) {
                        editText = editText;
                        if (oR6ReviewUbahFragment.viewGroupDataPenerima.get(size).getVisibility() == 0) {
                            editText = editText;
                            if (oR6ReviewUbahFragment.viewGroupDataPenerima.get(size).isFocusable()) {
                                editText = editText;
                                if (oR6ReviewUbahFragment.viewGroupDataPenerima.get(size).isEnabled()) {
                                    editText = (EditText) oR6ReviewUbahFragment.viewGroupDataPenerima.get(size);
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
                this.h.c(this.flLayoutDataPenerima);
                setMessage setmessage = this.h;
                ImageView imageView = this.ivDataPenerima;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                new Handler().postDelayed(updateTxnTellerDetailRequest$InputSchema$$Parcelable, 300);
                return;
            }
            updateTxnTellerDetailRequest$InputSchema$$Parcelable.run();
        }

        @OnClick({2131299720})
        public void ubahDataPengirim(View view) {
            this.tvUbahDataPengirim.setVisibility(8);
            this.llDataPengirimEditable.setVisibility(0);
            this.llDataPengirimUneditable.setVisibility(8);
            getAddress3 getaddress3 = new Runnable() { // from class: o.getAddress3
                @Override // java.lang.Runnable
                public final void run() {
                    OR6ReviewUbahFragment oR6ReviewUbahFragment = OR6ReviewUbahFragment.this;
                    EditText editText = null;
                    for (int size = oR6ReviewUbahFragment.viewGroupDataPengirim.size() - 1; size >= 0; size--) {
                        editText = editText;
                        if (oR6ReviewUbahFragment.viewGroupDataPengirim.get(size).getVisibility() == 0) {
                            editText = editText;
                            if (oR6ReviewUbahFragment.viewGroupDataPengirim.get(size).isFocusable()) {
                                editText = editText;
                                if (oR6ReviewUbahFragment.viewGroupDataPengirim.get(size).isEnabled()) {
                                    editText = (EditText) oR6ReviewUbahFragment.viewGroupDataPengirim.get(size);
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
                this.h.c(this.flLayoutDataPengirim);
                setMessage setmessage = this.h;
                ImageView imageView = this.ivDataPengirim;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                new Handler().postDelayed(getaddress3, 300);
                return;
            }
            getaddress3.run();
        }
    }
