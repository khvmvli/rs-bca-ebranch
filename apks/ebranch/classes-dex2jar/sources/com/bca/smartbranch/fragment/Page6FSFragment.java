package com.bca.smartbranch.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.BindColor;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.activity.FormBankNotesActivity;
import com.bca.smartbranch.activity.FormSuccessActivity;
import com.bca.smartbranch.activity.ReRegistrationSuccessActivity;
import com.bca.smartbranch.data.api.response.AccountOpeningResponse;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.JenisKartuDialog;
import com.bca.smartbranch.dialog.LimitActivationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.TermConditionDialog;
import com.bca.smartbranch.dialog.UserBlockedAfterLoginDialog;
import com.bca.smartbranch.fragment.Page6FSFragment;
import com.bca.smartbranch.presenter.AccountOpeningPresenter;
import com.bca.smartbranch.presenter.CheckUserPresenter;
import com.bca.smartbranch.presenter.ReRegistrationPresenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Checked;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.mobsandgeeks.saripaar.annotation.Order;
import com.mobsandgeeks.saripaar.annotation.Pattern;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.List;
import o.ConfirmSubBCACardAdapter$ViewHolder;
import o.InfoPromoORActivity_ViewBinding;
import o.KeluarFormReservationDialog_ViewBinding;
import o.LandingActivity;
import o.ListUtil;
import o.LoginSessionActivity_ViewBinding;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.ReservasiTundaSuccessActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.cancelPicture;
import o.clickOrangSamaDenganPemilik;
import o.copyWindowDataInto;
import o.documentProvider;
import o.fillNoHp;
import o.getAnnualFeeAddOnAmount;
import o.getPromotion;
import o.onChooseBankTujuan;
import o.onClickPlus;
import o.setBankBicCode;
import o.setCurrentItem;
import o.setMessage;
import o.setOnHierarchyChangeListener;
import o.setPadding;
import o.setTransactionNotes1;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6FSFragment.class */
public class Page6FSFragment extends BaseFragment implements AccountOpeningPresenter.read, Validator.ValidationListener, CheckUserPresenter.RemoteActionCompatParcelizer, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer, ReRegistrationPresenter.write, TextWatcher {
    private AccountOpeningResponse a;
    @BindView(2131296440)
    Button btnProses;
    @Checked(messageResId = 2131820725, sequence = 9)
    @BindView(2131296469)
    @Order(6)
    CheckBox cbxAgree;
    @BindColor(2131099763)
    int colorDataGrey;
    @BindColor(2131099762)
    int colorDataGreyDarker;
    @BindView(2131297047)
    TextView etDollarCurrCode;
    @Pattern(messageResId = 2131820780, regex = "^(?=[^@]*[A-z])(\\.?[A-z0-9_-]){0,}@[A-z0-9-]+\\.([A-z]{1,6}\\.)?[A-z]{2,6}$", sequence = 4)
    @Order(2)
    @BindView(2131296977)
    @NotEmpty(messageResId = 2131820778, sequence = 3, trim = true)
    getAnnualFeeAddOnAmount etEmailAddr;
    @BindView(2131296990)
    getAnnualFeeAddOnAmount etInternetBanking;
    @BindView(2131296946)
    TextView etLanguage;
    @BindView(2131297053)
    @NotEmpty(messageResId = 2131820792, sequence = 8, trim = true)
    @Order(5)
    getAnnualFeeAddOnAmount etMobileBanking;
    @BindView(2131297092)
    @NotEmpty(messageResId = 2131820933, sequence = 1, trim = true)
    @Order(1)
    setCurrentItem etNoATM;
    @BindView(2131297228)
    TextView etPurposePemRek;
    @BindView(2131296996)
    @NotEmpty(messageResId = 2131820811, sequence = 5, trim = true)
    @Order(3)
    getAnnualFeeAddOnAmount etTypeCard;
    private ReRegistrationPresenter g;
    private CheckUserPresenter h;
    @BindString(2131821161)
    String hintAtm;
    private AccountOpeningPresenter i;
    @BindView(2131297334)
    ImageView ivDataDiri;
    @BindView(2131297352)
    ImageView ivDataRekening;
    @BindView(2131297533)
    LinearLayout llBahasaPetunjukDisabled;
    @BindView(2131297447)
    LinearLayout llDetailDataDiri;
    @BindView(2131297476)
    LinearLayout llDetailDataRekening;
    @BindView(2131297633)
    LinearLayout llEmailDisabled;
    @BindView(2131297639)
    LinearLayout llFasilitasBanking;
    @BindView(2131297640)
    LinearLayout llFasilitasKlikBcaDisabled;
    @BindView(2131297641)
    LinearLayout llFasilitasMBcaDisabled;
    @BindView(2131297656)
    LinearLayout llHeaderDataDiri;
    @BindView(2131297672)
    LinearLayout llHeaderDataRekening;
    @BindView(2131297699)
    LinearLayout llJenisKartuAtmDisabled;
    @BindView(2131297448)
    LinearLayout llLayoutDataDiriEditable;
    @BindView(2131297449)
    LinearLayout llLayoutDataDiriUneditable;
    @BindView(2131297477)
    LinearLayout llLayoutDataRekeningEditable;
    @BindView(2131297478)
    LinearLayout llLayoutDataRekeningUneditable;
    @BindView(2131297772)
    LinearLayout llMataUangDisabled;
    @BindView(2131297816)
    LinearLayout llNoAtmDisabled;
    @BindView(2131297904)
    LinearLayout llSyaratKetentuan;
    @BindView(2131297926)
    LinearLayout llTujuanPemrekDisabled;
    private SendEmailTransactionSuccessPresenter m;
    private Validator n;
    @BindString(2131822092)
    String retry;
    @BindView(2131298420)
    ScrollView svMain;
    @BindView(2131298496)
    LogoutDialog_ViewBinding tilBahasaPetunjuk;
    @BindViews({2131298638, 2131298527})
    List<LogoutDialog_ViewBinding> tilFormDataDiri;
    @BindViews({2131298544, 2131298539, 2131298600})
    List<LogoutDialog_ViewBinding> tilFormDataRekening;
    @BindView(2131298539)
    LogoutDialog_ViewBinding tilInternetBanking;
    @BindView(2131298544)
    LogoutDialog_ViewBinding tilJenisKartu;
    @BindView(2131298594)
    LogoutDialog_ViewBinding tilMataUang;
    @BindView(2131298600)
    LogoutDialog_ViewBinding tilMobileBanking;
    @BindView(2131298834)
    TextView tvBahasaPetunjuk;
    @BindView(2131298950)
    TextView tvEmail;
    @BindViews({2131299114, 2131299006})
    List<TextView> tvErrorDataDiri;
    @BindViews({2131299020, 2131299015, 2131299077})
    List<TextView> tvErrorDataRekening;
    @BindView(2131299255)
    TextView tvFasilitasKlikBca;
    @BindView(2131299256)
    TextView tvFasilitasMBca;
    @BindView(2131299303)
    TextView tvJenisKartuAtm;
    @BindView(2131299400)
    TextView tvMataUang;
    @BindView(2131299452)
    TextView tvNoAtm;
    @BindView(2131299604)
    TextView tvTermCondition;
    @BindView(2131299695)
    TextView tvTujuanPemrek;
    @BindView(2131299705)
    TextView tvUbahDataDiri;
    @BindView(2131299721)
    TextView tvUbahDataRekening;
    @BindString(2131821427)
    String txtTermCondition;
    @BindViews({2131297092, 2131296977})
    public List<View> viewGroupDataDiri;
    @BindViews({2131296996, 2131296990, 2131297053})
    public List<View> viewGroupDataRekening;
    private setMessage d = new setMessage();
    private boolean f = false;
    private boolean j = false;

    private void b() {
        ((FormActivity) getActivity()).n.setNumberID(this.etNoATM.e.e);
        ((FormActivity) getActivity()).n.setEmailAddr(this.etEmailAddr.getText().toString());
        ((FormActivity) getActivity()).n.setEmailIB(this.etInternetBanking.getText().toString());
        if (!this.etTypeCard.getText().toString().isEmpty()) {
            ((FormActivity) getActivity()).n.setDebitCardType(this.etTypeCard.getText().toString());
        }
    }

    private void d(int i) {
        this.tvErrorDataDiri.get(i).setVisibility(8);
        this.tilFormDataDiri.get(i).setBackgroundResource(2131230847);
    }

    public void e() {
        b();
        cancelPicture cancelpicture = new cancelPicture();
        cancelpicture.c = ((FormActivity) getActivity()).n.getAcctType();
        cancelpicture.ab = ((FormActivity) getActivity()).n.getOldCustFlag();
        cancelpicture.f136o = ((FormActivity) getActivity()).n.getFlagGuest();
        cancelpicture.ao = ((FormActivity) getActivity()).n.getTypeID();
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
        cancelpicture.n = ((FormActivity) getActivity()).n.getHmAddress();
        cancelpicture.u = ((FormActivity) getActivity()).n.getHmRT();
        cancelpicture.v = ((FormActivity) getActivity()).n.getHmRW();
        cancelpicture.y = ((FormActivity) getActivity()).n.getHmVillage();
        cancelpicture.x = ((FormActivity) getActivity()).n.getHmSubDistrict();
        cancelpicture.t = ((FormActivity) getActivity()).n.getHmCity();
        cancelpicture.q = ((FormActivity) getActivity()).n.getHmPostCode();
        cancelpicture.p = ((FormActivity) getActivity()).n.getHmPhoneNumber();
        cancelpicture.f = ((FormActivity) getActivity()).n.getFlagDifResidency();
        cancelpicture.af = ((FormActivity) getActivity()).n.getResAddress();
        cancelpicture.al = ((FormActivity) getActivity()).n.getResRT();
        cancelpicture.aj = ((FormActivity) getActivity()).n.getResRW();
        cancelpicture.am = ((FormActivity) getActivity()).n.getResVillage();
        cancelpicture.ak = ((FormActivity) getActivity()).n.getResSubDistrict();
        cancelpicture.ah = ((FormActivity) getActivity()).n.getResCity();
        cancelpicture.ae = ((FormActivity) getActivity()).n.getResPostCode();
        cancelpicture.P = ((FormActivity) getActivity()).n.getNpwp();
        cancelpicture.D = ((FormActivity) getActivity()).n.getIncomeSource();
        cancelpicture.ai = ((FormActivity) getActivity()).n.getSalary();
        cancelpicture.H = ((FormActivity) getActivity()).n.getJob();
        cancelpicture.T = ((FormActivity) getActivity()).n.getOfficeName();
        cancelpicture.V = ((FormActivity) getActivity()).n.getOccupation();
        cancelpicture.d = ((FormActivity) getActivity()).n.getBusinessField();
        cancelpicture.X = ((FormActivity) getActivity()).n.getOfficeAddress();
        cancelpicture.U = ((FormActivity) getActivity()).n.getOfficeCity();
        cancelpicture.W = ((FormActivity) getActivity()).n.getOfficePostCode();
        cancelpicture.e = ((FormActivity) getActivity()).n.getDebitCardType();
        cancelpicture.g = ((FormActivity) getActivity()).n.getDollarCurrCode();
        cancelpicture.a = ((FormActivity) getActivity()).n.getCitizen();
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
        cancelpicture.b = ((FormActivity) getActivity()).n.getCob();
        cancelpicture.M = ((FormActivity) getActivity()).n.getHandPhoneCountryCodeNumber();
        cancelpicture.ag = ((FormActivity) getActivity()).n.getResCountry();
        cancelpicture.r = ((FormActivity) getActivity()).n.getHmCountry();
        cancelpicture.N = "62";
        ArrayList arrayList = new ArrayList();
        if (!((FormActivity) getActivity()).n.getFotoPribadi().isEmpty()) {
            InfoPromoORActivity_ViewBinding infoPromoORActivity_ViewBinding = new InfoPromoORActivity_ViewBinding();
            infoPromoORActivity_ViewBinding.a = "1";
            infoPromoORActivity_ViewBinding.e = ((FormActivity) getActivity()).n.getFotoPribadi();
            arrayList.add(infoPromoORActivity_ViewBinding);
        }
        cancelpicture.A = arrayList;
        this.i.e(cancelpicture);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        h();
        Intent intent = new Intent(getContext(), FormSuccessActivity.class);
        intent.putExtra("Transaction_name", ((FormActivity) getActivity()).p);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.a));
        intent.putExtra("email", ((FormActivity) getActivity()).n.getEmailAddr());
        startActivity(intent);
        setOnHierarchyChangeListener.d((Activity) getActivity());
    }

    @Override // com.bca.smartbranch.presenter.AccountOpeningPresenter.read, com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        h();
        if (this.a != null) {
            Intent intent = new Intent(getContext(), FormSuccessActivity.class);
            intent.putExtra("Transaction_name", ((FormActivity) getActivity()).p);
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.a));
            intent.putExtra("email", ((FormActivity) getActivity()).n.getEmailAddr());
            startActivity(intent);
            setOnHierarchyChangeListener.d((Activity) getActivity());
            return;
        }
        KeluarFormReservationDialog_ViewBinding.a(null, this.svMain, str, 0).b(this.retry, new View.OnClickListener() { // from class: com.bca.smartbranch.fragment.Page6FSFragment.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Page6FSFragment.this.e();
            }
        }).g();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable == this.etNoATM.getEditableText()) {
            if (this.tvErrorDataDiri.get(this.viewGroupDataDiri.indexOf(this.etNoATM)).getVisibility() == 0 && getPromotion.b(getContext(), this.tvErrorDataDiri.get(this.viewGroupDataDiri.indexOf(this.etNoATM)).getText().toString(), this.etNoATM)) {
                d(this.viewGroupDataDiri.indexOf(this.etNoATM));
            }
        } else if (editable == this.etEmailAddr.getEditableText()) {
            if (this.tvErrorDataDiri.get(this.viewGroupDataDiri.indexOf(this.etEmailAddr)).getVisibility() == 0 && getPromotion.a(getContext(), this.tvErrorDataDiri.get(this.viewGroupDataDiri.indexOf(this.etEmailAddr)).getText().toString(), this.etEmailAddr)) {
                d(this.viewGroupDataDiri.indexOf(this.etEmailAddr));
            }
        } else if (editable == this.etMobileBanking.getEditableText() && this.tvErrorDataRekening.get(this.viewGroupDataRekening.indexOf(this.etMobileBanking)).getVisibility() == 0 && !this.etMobileBanking.getText().toString().isEmpty()) {
            int indexOf = this.viewGroupDataRekening.indexOf(this.etMobileBanking);
            this.tvErrorDataRekening.get(indexOf).setVisibility(8);
            this.tilFormDataRekening.get(indexOf).setBackgroundResource(2131230847);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.bca.smartbranch.fragment.BaseFragment
    protected final int c() {
        return 2131493125;
    }

    @Override // com.bca.smartbranch.presenter.AccountOpeningPresenter.read
    public final void c(AccountOpeningResponse accountOpeningResponse) {
        this.a = accountOpeningResponse;
        this.m.d(new LoginSessionActivity_ViewBinding(((FormActivity) getActivity()).n.getEmailAddr(), accountOpeningResponse.getTxnDataOutput().getNoReff()));
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
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.a));
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
        h();
        new UserBlockedAfterLoginDialog().show(getFragmentManager(), "UserBlockedAfterLoginDialog");
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        h();
        Intent intent = new Intent(getContext(), FormSuccessActivity.class);
        intent.putExtra("Transaction_name", ((FormActivity) getActivity()).p);
        intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, ListUtil.OneItemImmutableList.e(this.a));
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

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fragmentBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        if (((FormActivity) getActivity()).t) {
            setOnHierarchyChangeListener.a((Activity) getActivity());
        } else if ("Y".equals(((FormActivity) getActivity()).r.getVerified())) {
            String str = ((FormActivity) getActivity()).p;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -748993769:
                    if (str.equals("Tahapan BCA")) {
                        c = 0;
                        break;
                    }
                    break;
                case -245309302:
                    if (str.equals("Tahapan Xpresi")) {
                        c = 1;
                        break;
                    }
                    break;
                case 164545469:
                    if (str.equals("Tapres BCA")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1076132060:
                    if (str.equals("BCA Dollar")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1269943660:
                    if (str.equals("Tahapan Berjangka")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1726066065:
                    if (str.equals("DEPOSITO")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                e(2131296811, new Page6DTahapanBCASFragment(), "Page6DTahapanBCASFragment");
            } else if (c == 1) {
                e(2131296811, new Page6DTahapanXpresiSFragment(), "Page6DTahapanXpresiSFragment");
            } else if (c == 2) {
                e(2131296811, new Page6DTapresSFragment(), "Page6DTapresSFragment");
            } else if (c == 3) {
                e(2131296811, new Page6DBCADollarSFragment(), "Page6DBCADollarSFragment");
            } else if (c == 4 || c == 5) {
                e(2131296811, new Page6CSFragment(), "Page6CSFragment");
            }
        } else {
            e(2131296811, new Page6ESFragment(), "Page6ESFragment");
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
        for (TextView textView : this.tvErrorDataDiri) {
            textView.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : this.tilFormDataDiri) {
            logoutDialog_ViewBinding.setBackgroundResource(2131231360);
        }
        for (TextView textView2 : this.tvErrorDataRekening) {
            textView2.setVisibility(8);
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding2 : this.tilFormDataRekening) {
            logoutDialog_ViewBinding2.setBackgroundResource(2131231360);
        }
        this.n.validate();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onAktivasiUlangEvent(onChooseBankTujuan onchoosebanktujuan) {
        this.g.e(new LandingActivity(this.e != null ? this.e.getEmail() : ""));
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
    public void onChooseTujuan(ReservasiTundaSuccessActivity_ViewBinding reservasiTundaSuccessActivity_ViewBinding) {
        this.etPurposePemRek.setText(reservasiTundaSuccessActivity_ViewBinding.e);
        ((FormActivity) getActivity()).n.setPurposePemRek(String.valueOf(reservasiTundaSuccessActivity_ViewBinding.a + 1));
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueJenisKartuEvent(onClickPlus onclickplus) {
        this.etTypeCard.setError(null);
        this.etTypeCard.setText(onclickplus.e);
        ((FormActivity) getActivity()).n.setDebitCardType(onclickplus.e);
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

    @Override // com.bca.smartbranch.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        onDestroyView();
        this.c.close();
        AccountOpeningPresenter accountOpeningPresenter = this.i;
        Call<OpenAccountSuccessActivity<AccountOpeningResponse>> call = accountOpeningPresenter.a;
        if (call != null) {
            call.cancel();
        }
        accountOpeningPresenter.c = null;
        CheckUserPresenter checkUserPresenter = this.h;
        Call<OpenAccountSuccessActivity<Object>> call2 = checkUserPresenter.d;
        if (call2 != null) {
            call2.cancel();
        }
        checkUserPresenter.b = null;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.m;
        Call<OpenAccountSuccessActivity<Object>> call3 = sendEmailTransactionSuccessPresenter.a;
        if (call3 != null) {
            call3.cancel();
        }
        sendEmailTransactionSuccessPresenter.b = null;
        ReRegistrationPresenter reRegistrationPresenter = this.g;
        Call<OpenAccountSuccessActivity<Object>> call4 = reRegistrationPresenter.b;
        if (call4 != null) {
            call4.cancel();
        }
        reRegistrationPresenter.e = null;
        documentProvider.b().e(this);
    }

    @OnFocusChange({2131297092, 2131296977})
    public void onFocusChangeDataDiri(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131296977) {
                this.tilFormDataDiri.get(1).setHintEnabled(true);
            } else if (id == 2131297092) {
                this.tilFormDataDiri.get(0).setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131296977) {
                if (id2 == 2131297092 && this.etNoATM.e.e.isEmpty()) {
                    this.tilFormDataDiri.get(0).setHintEnabled(false);
                }
            } else if (this.etEmailAddr.getText().toString().isEmpty()) {
                this.tilFormDataDiri.get(1).setHintEnabled(false);
            }
        }
    }

    @OnFocusChange({2131296990, 2131297053})
    public void onFocusChangeDataRekening(View view, boolean z) {
        if (z) {
            int id = view.getId();
            if (id == 2131296990) {
                this.tilInternetBanking.setHintEnabled(true);
            } else if (id == 2131297053) {
                this.tilMobileBanking.setHintEnabled(true);
            }
        } else {
            int id2 = view.getId();
            if (id2 != 2131296990) {
                if (id2 == 2131297053 && this.etMobileBanking.getText().toString().isEmpty()) {
                    this.tilMobileBanking.setHintEnabled(false);
                }
            } else if (this.etInternetBanking.getText().toString().isEmpty()) {
                this.tilInternetBanking.setHintEnabled(false);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationFailed(List<ValidationError> list) {
        EditText editText = null;
        for (ValidationError validationError : list) {
            View view = validationError.getView();
            String message = validationError.getFailedRules().get(0).getMessage(getContext());
            if (this.viewGroupDataDiri.contains(view)) {
                if (this.llDetailDataDiri.getVisibility() == 8) {
                    this.d.c(this.llDetailDataDiri);
                    setMessage setmessage = this.d;
                    ImageView imageView = this.ivDataDiri;
                    setmessage.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                }
            } else if (this.viewGroupDataRekening.contains(view) && this.llDetailDataRekening.getVisibility() == 8) {
                this.d.c(this.llDetailDataRekening);
                setMessage setmessage2 = this.d;
                ImageView imageView2 = this.ivDataRekening;
                setmessage2.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                setmessage2.e(imageView2);
            }
            if (view instanceof EditText) {
                EditText editText2 = editText;
                if (editText == null) {
                    editText2 = (EditText) view;
                }
                switch (view.getId()) {
                    case 2131296977:
                        this.tvErrorDataDiri.get(1).setVisibility(0);
                        this.tvErrorDataDiri.get(1).setText(message);
                        this.tilFormDataDiri.get(1).setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131296990:
                        this.tvErrorDataRekening.get(1).setVisibility(0);
                        this.tvErrorDataRekening.get(1).setText(message);
                        this.tilFormDataRekening.get(1).setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131296996:
                        this.tvErrorDataRekening.get(0).setVisibility(0);
                        this.tvErrorDataRekening.get(0).setText(message);
                        this.tilFormDataRekening.get(0).setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297053:
                        this.tvErrorDataRekening.get(2).setVisibility(0);
                        this.tvErrorDataRekening.get(2).setText(message);
                        this.tilFormDataRekening.get(2).setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    case 2131297092:
                        this.tvErrorDataDiri.get(0).setVisibility(0);
                        this.tvErrorDataDiri.get(0).setText(message);
                        this.tilFormDataDiri.get(0).setBackgroundResource(2131230870);
                        editText = editText2;
                        continue;
                    default:
                        editText = editText2;
                        continue;
                }
            } else if (view instanceof CheckBox) {
                this.cbxAgree.setBackgroundDrawable(copyWindowDataInto.b(getContext(), 2131231323));
                this.tvTermCondition.setTextColor(copyWindowDataInto.a(getContext(), 2131099826));
            } else {
                b(this.svMain, message);
            }
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }

    @Override // com.mobsandgeeks.saripaar.Validator.ValidationListener
    public void onValidationSucceeded() {
        if (((FormActivity) getActivity()).q) {
            b();
            ((FormActivity) getActivity()).v();
            return;
        }
        e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        documentProvider.b().c(this);
        this.c = Realm.getDefaultInstance();
        AccountOpeningPresenter accountOpeningPresenter = new AccountOpeningPresenter();
        this.i = accountOpeningPresenter;
        accountOpeningPresenter.c = this;
        CheckUserPresenter checkUserPresenter = new CheckUserPresenter();
        this.h = checkUserPresenter;
        checkUserPresenter.b = this;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
        this.m = sendEmailTransactionSuccessPresenter;
        sendEmailTransactionSuccessPresenter.b = this;
        ReRegistrationPresenter reRegistrationPresenter = new ReRegistrationPresenter();
        this.g = reRegistrationPresenter;
        reRegistrationPresenter.e = this;
        ((setPadding) getActivity()).i();
        ((setPadding) getActivity()).i().d(true);
        ((setPadding) getActivity()).i().d("");
        Validator validator = new Validator(this);
        this.n = validator;
        validator.setValidationListener(this);
        this.n.validateInvisibleViews(true);
        if (this.etMobileBanking.getVisibility() == 0) {
            ConfirmSubBCACardAdapter$ViewHolder confirmSubBCACardAdapter$ViewHolder = new ConfirmSubBCACardAdapter$ViewHolder();
            confirmSubBCACardAdapter$ViewHolder.c = 2131820792;
            confirmSubBCACardAdapter$ViewHolder.e = 2131820905;
            confirmSubBCACardAdapter$ViewHolder.d = 2131820903;
            confirmSubBCACardAdapter$ViewHolder.a = 2131820904;
            Validator validator2 = this.n;
            getAnnualFeeAddOnAmount getannualfeeaddonamount = this.etMobileBanking;
            validator2.put(getannualfeeaddonamount, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f6: INVOKE  
                  (r0v374 'validator2' com.mobsandgeeks.saripaar.Validator)
                  (r0v376 'getannualfeeaddonamount' o.getAnnualFeeAddOnAmount)
                  (wrap: com.mobsandgeeks.saripaar.QuickRule[] : ?: FILLED_NEW_ARRAY  (r2v13 com.mobsandgeeks.saripaar.QuickRule[] A[REMOVE]) = 
                  (wrap: o.getPromotion$2 : 0x00f2: CONSTRUCTOR  
                  (r0v376 'getannualfeeaddonamount' o.getAnnualFeeAddOnAmount)
                  (r0v368 'confirmSubBCACardAdapter$ViewHolder' o.ConfirmSubBCACardAdapter$ViewHolder)
                 call: o.getPromotion.2.<init>(android.widget.EditText, o.ConfirmSubBCACardAdapter$ViewHolder):void type: CONSTRUCTOR)
                 elemType: com.mobsandgeeks.saripaar.QuickRule)
                 type: VIRTUAL call: com.mobsandgeeks.saripaar.Validator.put(android.view.View, com.mobsandgeeks.saripaar.QuickRule[]):void in method: com.bca.smartbranch.fragment.Page6FSFragment.onViewCreated(android.view.View, android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6FSFragment.class
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
            // Method dump skipped, instructions count: 1998
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6FSFragment.onViewCreated(android.view.View, android.os.Bundle):void");
        }

        @OnClick({2131297334, 2131298895})
        public void showDataDiri(View view) {
            getPromotion.d(getActivity());
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataDiri.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.llDetailDataDiri.getVisibility() == 8) {
                this.d.c(this.llDetailDataDiri);
                setMessage setmessage = this.d;
                ImageView imageView = this.ivDataDiri;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                return;
            }
            setMessage setmessage2 = this.d;
            LinearLayout linearLayout = this.llDetailDataDiri;
            setmessage2.a = linearLayout.getMeasuredHeight();
            setmessage2.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                  (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v11 'setmessage2' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6FSFragment.showDataDiri(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6FSFragment.class
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
                android.widget.LinearLayout r0 = r0.llDetailDataDiri
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 != r1) goto L_0x005a
                r0 = r10
                o.setMessage r0 = r0.d
                r1 = r10
                android.widget.LinearLayout r1 = r1.llDetailDataDiri
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
            L_0x005a:
                r0 = r10
                o.setMessage r0 = r0.d
                r13 = r0
                r0 = r10
                android.widget.LinearLayout r0 = r0.llDetailDataDiri
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
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6FSFragment.showDataDiri(android.view.View):void");
        }

        @OnClick({2131297352, 2131298911})
        public void showDataRekening(View view) {
            getPromotion.d(getActivity());
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderDataRekening.getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (this.llDetailDataRekening.getVisibility() == 8) {
                this.d.c(this.llDetailDataRekening);
                setMessage setmessage = this.d;
                ImageView imageView = this.ivDataRekening;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                return;
            }
            setMessage setmessage2 = this.d;
            LinearLayout linearLayout = this.llDetailDataRekening;
            setmessage2.a = linearLayout.getMeasuredHeight();
            setmessage2.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                  (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v11 'setmessage2' o.setMessage), (r0v13 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v11 'setmessage2' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.fragment.Page6FSFragment.showDataRekening(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/fragment/Page6FSFragment.class
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
                android.widget.LinearLayout r0 = r0.llDetailDataRekening
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 != r1) goto L_0x005a
                r0 = r10
                o.setMessage r0 = r0.d
                r1 = r10
                android.widget.LinearLayout r1 = r1.llDetailDataRekening
                r0.c(r1)
                r0 = r10
                o.setMessage r0 = r0.d
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
                o.setMessage r0 = r0.d
                r13 = r0
                r0 = r10
                android.widget.LinearLayout r0 = r0.llDetailDataRekening
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
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.fragment.Page6FSFragment.showDataRekening(android.view.View):void");
        }

        @OnClick({2131299705})
        public void ubahDataDiri(View view) {
            this.tvUbahDataDiri.setVisibility(8);
            this.llLayoutDataDiriEditable.setVisibility(0);
            this.llLayoutDataDiriUneditable.setVisibility(8);
            setTransactionNotes1 settransactionnotes1 = new Runnable() { // from class: o.setTransactionNotes1
                @Override // java.lang.Runnable
                public final void run() {
                    Page6FSFragment page6FSFragment = Page6FSFragment.this;
                    EditText editText = null;
                    for (int size = page6FSFragment.viewGroupDataDiri.size() - 1; size >= 0; size--) {
                        editText = editText;
                        if (page6FSFragment.viewGroupDataDiri.get(size).getVisibility() == 0) {
                            editText = editText;
                            if (page6FSFragment.viewGroupDataDiri.get(size).isFocusable()) {
                                editText = editText;
                                if (page6FSFragment.viewGroupDataDiri.get(size).isEnabled()) {
                                    editText = (EditText) page6FSFragment.viewGroupDataDiri.get(size);
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
            if (this.llDetailDataDiri.getVisibility() == 8) {
                this.d.c(this.llDetailDataDiri);
                setMessage setmessage = this.d;
                ImageView imageView = this.ivDataDiri;
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                new Handler().postDelayed(settransactionnotes1, 300);
                return;
            }
            settransactionnotes1.run();
        }

        @OnClick({2131299721})
        public void ubahDataRekening(View view) {
            this.tvUbahDataRekening.setVisibility(8);
            this.llLayoutDataRekeningEditable.setVisibility(0);
            this.llLayoutDataRekeningUneditable.setVisibility(8);
            setBankBicCode setbankbiccode = new Runnable() { // from class: o.setBankBicCode
                @Override // java.lang.Runnable
                public final void run() {
                    Page6FSFragment page6FSFragment = Page6FSFragment.this;
                    EditText editText = null;
                    for (int size = page6FSFragment.viewGroupDataRekening.size() - 1; size >= 0; size--) {
                        editText = editText;
                        if (page6FSFragment.viewGroupDataRekening.get(size).getVisibility() == 0) {
                            editText = editText;
                            if (page6FSFragment.viewGroupDataRekening.get(size).isFocusable()) {
                                editText = editText;
                                if (page6FSFragment.viewGroupDataRekening.get(size).isEnabled()) {
                                    editText = (EditText) page6FSFragment.viewGroupDataRekening.get(size);
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
            if (this.llDetailDataRekening.getVisibility() == 8) {
                this.d.c(this.llDetailDataRekening);
                setMessage setmessage = this.d;
                ImageView imageView = this.ivDataRekening;
                setmessage.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView);
                transitionDrawable.startTransition(0);
                new Handler().postDelayed(setbankbiccode, 300);
                return;
            }
            setbankbiccode.run();
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
