package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import com.bca.smartbranch.activity.FormActivity;
import com.bca.smartbranch.data.api.response.GetAcctOpeningCategoryDataResponse;
import com.bca.smartbranch.data.localdb.Account;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.KeluarFormReservationDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import com.bca.smartbranch.fragment.Page6CFragment;
import com.bca.smartbranch.fragment.Page6CSFragment;
import com.bca.smartbranch.fragment.Page6DBCADollarFragment;
import com.bca.smartbranch.fragment.Page6DBCADollarSFragment;
import com.bca.smartbranch.fragment.Page6DTahapanBCAFragment;
import com.bca.smartbranch.fragment.Page6DTahapanBCASFragment;
import com.bca.smartbranch.fragment.Page6DTahapanXpresiFragment;
import com.bca.smartbranch.fragment.Page6DTahapanXpresiSFragment;
import com.bca.smartbranch.fragment.Page6DTapresFragment;
import com.bca.smartbranch.fragment.Page6DTapresSFragment;
import com.bca.smartbranch.fragment.Page6ELFragment;
import com.bca.smartbranch.fragment.Page6ESFragment;
import com.bca.smartbranch.fragment.Page6FLKTPFragment;
import com.bca.smartbranch.fragment.Page6FLKartuPelajarFragment;
import com.bca.smartbranch.fragment.Page6FLPasporFragment;
import com.bca.smartbranch.fragment.Page6FSFragment;
import com.bca.smartbranch.fragment.Page6GLFragment;
import com.bca.smartbranch.fragment.Page6HLFragment;
import com.bca.smartbranch.fragment.Page6ILFragment;
import com.bca.smartbranch.fragment.Page6JLFragment;
import com.bca.smartbranch.fragment.Page6KL2Fragment;
import com.bca.smartbranch.fragment.Page6KLFragment;
import com.bca.smartbranch.fragment.Page6LLFragment;
import com.bca.smartbranch.fragment.Page6MLFragment;
import com.bca.smartbranch.fragment.Page6NLFragment;
import com.bca.smartbranch.fragment.Page6OLFragment;
import com.bca.smartbranch.fragment.Page6PLFragment;
import com.bca.smartbranch.presenter.GetHBPresenter;
import io.realm.ImportFlag;
import io.realm.Realm;
import java.util.ArrayList;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.InfoProductORActivity_ViewBinding;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.clickOrangSamaDenganPemilik;
import o.documentProvider;
import o.getCardName;
import o.getPromotion;
import o.getUserVisibleHint;
import o.onClickUbahDataOrangDatangKeCabang;
import o.onUbahFormReservasiEvent;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FormActivity.class */
public class FormActivity extends BaseActivityPostLogin implements GetHBPresenter.write {
    private long A;
    private String C;
    @BindDrawable(2131231202)
    Drawable drawableIndicatorOff;
    @BindDrawable(2131231203)
    Drawable drawableIndicatorOn;
    public GetAcctOpeningCategoryDataResponse f;
    @BindView(2131297377)
    ImageView ivIndicatorClear1;
    @BindView(2131297379)
    ImageView ivIndicatorClear2;
    @BindView(2131297381)
    ImageView ivIndicatorClear3;
    @BindView(2131297383)
    ImageView ivIndicatorClear4;
    @BindView(2131297384)
    ImageView ivIndicatorClear5;
    @BindView(2131297765)
    LinearLayout llLongIndicator;
    @BindView(2131297767)
    LinearLayout llMainIndicator;
    public Account n;
    public String p;
    @BindView(2131298111)
    ProgressBar pbIndicator1;
    @BindView(2131298112)
    ProgressBar pbIndicator2;
    @BindView(2131298113)
    ProgressBar pbIndicator3;
    @BindView(2131298114)
    ProgressBar pbIndicator4;
    public boolean q;
    public User r;
    public boolean t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822243)
    String toolbarTitleBCADollar;
    @BindString(2131822203)
    String toolbarTitleDeposito;
    @BindString(2131822244)
    String toolbarTitleTahapanBCA;
    @BindString(2131822275)
    String toolbarTitleTahapanBerjangka;
    @BindString(2131822245)
    String toolbarTitleTahapanXpresi;
    @BindString(2131822246)
    String toolbarTitleTapres;
    @BindView(2131299276)
    TextView tvIndicator1;
    @BindView(2131299277)
    TextView tvIndicator2;
    @BindView(2131299278)
    TextView tvIndicator3;
    @BindView(2131299279)
    TextView tvIndicator4;
    @BindView(2131299280)
    TextView tvIndicator5;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private Bundle u;
    private GetHBPresenter v;
    public List<GetAcctOpeningCategoryDataResponse.Content> s = new ArrayList();
    public List<GetAcctOpeningCategoryDataResponse.Content> w = new ArrayList();
    public List<GetAcctOpeningCategoryDataResponse.Content> x = new ArrayList();
    public List<GetAcctOpeningCategoryDataResponse.Content> y = new ArrayList();

    private void d(int i, Fragment fragment, String str) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
        getuservisiblehint.e(2130772010, 2130772011);
        getuservisiblehint.d(2131296811, fragment, str, 2);
        getuservisiblehint.b();
    }

    private void e(int i) {
        if (i == 1) {
            this.tvIndicator1.setBackgroundResource(2131231203);
            this.tvIndicator1.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator2.setBackgroundResource(2131231202);
            this.tvIndicator2.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator3.setBackgroundResource(2131231202);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator4.setBackgroundResource(2131231202);
            this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator5.setBackgroundResource(2131231202);
            this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator1.setVisibility(0);
            this.ivIndicatorClear1.setVisibility(8);
        } else if (i == 2) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setBackgroundResource(2131231203);
            this.tvIndicator2.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator3.setBackgroundResource(2131231202);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator4.setBackgroundResource(2131231202);
            this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator5.setBackgroundResource(2131231202);
            this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator2.setVisibility(0);
            this.ivIndicatorClear2.setVisibility(8);
        } else if (i == 3) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setVisibility(8);
            this.ivIndicatorClear2.setVisibility(0);
            this.tvIndicator3.setBackgroundResource(2131231203);
            this.tvIndicator3.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator4.setBackgroundResource(2131231202);
            this.tvIndicator4.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator5.setBackgroundResource(2131231202);
            this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator3.setVisibility(0);
            this.ivIndicatorClear3.setVisibility(8);
        } else if (i == 4) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setVisibility(8);
            this.ivIndicatorClear2.setVisibility(0);
            this.tvIndicator3.setVisibility(8);
            this.ivIndicatorClear3.setVisibility(0);
            this.tvIndicator4.setBackgroundResource(2131231203);
            this.tvIndicator4.setTextColor(getResources().getColor(2131099772));
            this.tvIndicator5.setBackgroundResource(2131231202);
            this.tvIndicator5.setTextColor(getResources().getColor(2131099815));
            this.tvIndicator4.setVisibility(0);
            this.ivIndicatorClear4.setVisibility(8);
        } else if (i == 5) {
            this.tvIndicator1.setVisibility(8);
            this.ivIndicatorClear1.setVisibility(0);
            this.tvIndicator2.setVisibility(8);
            this.ivIndicatorClear2.setVisibility(0);
            this.tvIndicator3.setVisibility(8);
            this.ivIndicatorClear3.setVisibility(0);
            this.tvIndicator4.setVisibility(8);
            this.ivIndicatorClear4.setVisibility(0);
            this.tvIndicator5.setBackgroundResource(2131231203);
            this.tvIndicator5.setTextColor(getResources().getColor(2131099772));
        }
    }

    @Override // o.getView
    public void c(Fragment fragment) {
        char c;
        c(fragment);
        try {
            String tag = fragment.getTag();
            switch (tag.hashCode()) {
                case -2118893650:
                    if (tag.equals("Page6FLPasporFragment")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1948251313:
                    if (tag.equals("Page6DBCADollarFragment")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1891638594:
                    if (tag.equals("Page6ELFragment")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -1855431452:
                    if (tag.equals("Page6FSFragment")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -1658917947:
                    if (tag.equals("Page6ESFragment")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1265890937:
                    if (tag.equals("Page6CSFragment")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1030965204:
                    if (tag.equals("Page6CFragment")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -557313382:
                    if (tag.equals("Page6KL2Fragment")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -428348280:
                    if (tag.equals("Page6DTahapanXpresiSFragment")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -169764847:
                    if (tag.equals("Page6FLKartuPelajarFragment")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -164980023:
                    if (tag.equals("Page6DTapresSFragment")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 241680147:
                    if (tag.equals("Page6PLFragment")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 363010756:
                    if (tag.equals("Page6DBCADollarSFragment")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 378000106:
                    if (tag.equals("Page6FLKTPFragment")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 438193652:
                    if (tag.equals("Page6OLFragment")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 634707157:
                    if (tag.equals("Page6NLFragment")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 728518365:
                    if (tag.equals("Page6DTahapanBCASFragment")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 831220662:
                    if (tag.equals("Page6MLFragment")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 1027734167:
                    if (tag.equals("Page6LLFragment")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 1074262283:
                    if (tag.equals("Page6DTahapanXpresiFragment")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1224247672:
                    if (tag.equals("Page6KLFragment")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 1250127894:
                    if (tag.equals("Page6DTahapanBCAFragment")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1420761177:
                    if (tag.equals("Page6JLFragment")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 1617274682:
                    if (tag.equals("Page6ILFragment")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 1813788187:
                    if (tag.equals("Page6HLFragment")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 1914042026:
                    if (tag.equals("Page6DTapresFragment")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2010301692:
                    if (tag.equals("Page6GLFragment")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    e(1);
                    if (!this.r.getVerified().equals("Y") && !this.p.equals("Tahapan Berjangka") && !this.p.equals("DEPOSITO")) {
                        this.pbIndicator1.setProgress(0);
                        return;
                    }
                    ProgressBar progressBar = this.pbIndicator1;
                    progressBar.startAnimation(new getCardName(progressBar, 0.0f));
                    ProgressBar progressBar2 = this.pbIndicator2;
                    progressBar2.startAnimation(new getCardName(progressBar2, 0.0f));
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                    e(1);
                    ProgressBar progressBar3 = this.pbIndicator1;
                    progressBar3.startAnimation(new getCardName(progressBar3, 0.0f));
                    ProgressBar progressBar4 = this.pbIndicator2;
                    progressBar4.startAnimation(new getCardName(progressBar4, 0.0f));
                    this.llMainIndicator.setVisibility(0);
                    return;
                case '\n':
                    e(1);
                    ProgressBar progressBar5 = this.pbIndicator1;
                    progressBar5.startAnimation(new getCardName(progressBar5, 0.0f));
                    ProgressBar progressBar6 = this.pbIndicator2;
                    progressBar6.startAnimation(new getCardName(progressBar6, 0.0f));
                    return;
                case 11:
                    e(2);
                    ProgressBar progressBar7 = this.pbIndicator2;
                    progressBar7.startAnimation(new getCardName(progressBar7, 0.0f));
                    ProgressBar progressBar8 = this.pbIndicator1;
                    progressBar8.startAnimation(new getCardName(progressBar8, 100.0f));
                    this.llMainIndicator.setVisibility(0);
                    return;
                case '\f':
                    e(2);
                    ProgressBar progressBar9 = this.pbIndicator1;
                    progressBar9.startAnimation(new getCardName(progressBar9, 100.0f));
                    ProgressBar progressBar10 = this.pbIndicator2;
                    progressBar10.startAnimation(new getCardName(progressBar10, 0.0f));
                    return;
                case '\r':
                    e(2);
                    ProgressBar progressBar11 = this.pbIndicator1;
                    progressBar11.startAnimation(new getCardName(progressBar11, 100.0f));
                    ProgressBar progressBar12 = this.pbIndicator2;
                    progressBar12.startAnimation(new getCardName(progressBar12, 0.0f));
                    return;
                case 14:
                    e(2);
                    ProgressBar progressBar13 = this.pbIndicator1;
                    progressBar13.startAnimation(new getCardName(progressBar13, 100.0f));
                    ProgressBar progressBar14 = this.pbIndicator2;
                    progressBar14.startAnimation(new getCardName(progressBar14, 0.0f));
                    return;
                case 15:
                    e(2);
                    this.pbIndicator1.setProgress(100);
                    ProgressBar progressBar15 = this.pbIndicator2;
                    progressBar15.startAnimation(new getCardName(progressBar15, 0.0f));
                    return;
                case 16:
                case 17:
                    e(2);
                    this.pbIndicator1.setProgress(100);
                    ProgressBar progressBar16 = this.pbIndicator2;
                    progressBar16.startAnimation(new getCardName(progressBar16, 0.0f));
                    ProgressBar progressBar17 = this.pbIndicator3;
                    progressBar17.startAnimation(new getCardName(progressBar17, 0.0f));
                    return;
                case 18:
                    e(3);
                    this.pbIndicator1.setProgress(100);
                    ProgressBar progressBar18 = this.pbIndicator2;
                    progressBar18.startAnimation(new getCardName(progressBar18, 100.0f));
                    ProgressBar progressBar19 = this.pbIndicator3;
                    progressBar19.startAnimation(new getCardName(progressBar19, 0.0f));
                    return;
                case 19:
                    e(4);
                    this.pbIndicator1.setProgress(100);
                    this.pbIndicator2.setProgress(100);
                    ProgressBar progressBar20 = this.pbIndicator3;
                    progressBar20.startAnimation(new getCardName(progressBar20, 100.0f));
                    ProgressBar progressBar21 = this.pbIndicator4;
                    progressBar21.startAnimation(new getCardName(progressBar21, 0.0f));
                    return;
                case 20:
                    e(4);
                    this.pbIndicator1.setProgress(100);
                    this.pbIndicator2.setProgress(100);
                    this.pbIndicator3.setProgress(100);
                    ProgressBar progressBar22 = this.pbIndicator4;
                    progressBar22.startAnimation(new getCardName(progressBar22, 0.0f));
                    this.llMainIndicator.setVisibility(0);
                    return;
                case 21:
                case 22:
                case 23:
                case 24:
                    e(4);
                    this.pbIndicator1.setProgress(100);
                    this.pbIndicator2.setProgress(100);
                    this.pbIndicator3.setProgress(100);
                    ProgressBar progressBar23 = this.pbIndicator4;
                    progressBar23.startAnimation(new getCardName(progressBar23, 0.0f));
                    this.llMainIndicator.setVisibility(0);
                    return;
                case 25:
                case 26:
                    if (!this.C.equals("Y") && !this.p.equals("Tahapan Berjangka")) {
                        e(5);
                        ProgressBar progressBar24 = this.pbIndicator4;
                        progressBar24.startAnimation(new getCardName(progressBar24, 100.0f));
                        return;
                    }
                    if (this.r.getVerified().equals("Y")) {
                        e(2);
                        ProgressBar progressBar25 = this.pbIndicator1;
                        progressBar25.startAnimation(new getCardName(progressBar25, 100.0f));
                        return;
                    }
                    e(3);
                    ProgressBar progressBar26 = this.pbIndicator1;
                    progressBar26.startAnimation(new getCardName(progressBar26, 100.0f));
                    ProgressBar progressBar27 = this.pbIndicator2;
                    progressBar27.startAnimation(new getCardName(progressBar27, 100.0f));
                    return;
                default:
                    return;
            }
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder("FormActivity : ");
            sb.append(e);
            Log.i("EBRANCH", sb.toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        char c;
        char c2;
        char c3;
        char c4;
        d(bundle);
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.v = getHBPresenter;
        getHBPresenter.e = this;
        Bundle extras = getIntent().getExtras();
        this.u = extras;
        this.C = extras.getString("old_cust", "N");
        this.q = this.u.getBoolean("is_from_reservation", false);
        this.A = this.u.getLong("id_reservation", 0);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        if (this.m != null) {
            this.r = this.m;
        } else {
            this.r = new User();
        }
        if (this.u.getBoolean("id_draft", false)) {
            if (this.u.getParcelable("category_data") != null) {
                d((GetAcctOpeningCategoryDataResponse) ListUtil.OneItemImmutableList.a(this.u.getParcelable("category_data")));
            }
            Account account = (Account) this.k.where(Account.class).equalTo("id", Long.valueOf(this.u.getLong("account_id", 0))).findFirst();
            Account account2 = new Account();
            this.n = account2;
            account2.setId(account.getId());
            this.n.setCurrentPage(account.getCurrentPage());
            this.n.setCreatedAt(account.getCreatedAt());
            this.n.setUpdatedAt(account.getUpdatedAt());
            this.n.setEmailAddr(account.getEmailAddr());
            this.n.setAcctType(account.getAcctType());
            this.n.setFlagGuest(account.getFlagGuest());
            this.n.setOldCustFlag(account.getOldCustFlag());
            this.n.setPurposePemRek(account.getPurposePemRek());
            this.n.setPurposePemRekOthers(account.getPurposePemRekOthers());
            this.n.setLanguage(account.getLanguage());
            this.n.setDebitCardType(account.getDebitCardType());
            this.n.setFlagIB(account.getFlagIB());
            this.n.setFlagMB(account.getFlagMB());
            this.n.setEmailIB(account.getEmailIB());
            this.n.setHphoneMB(account.getHphoneMB());
            this.n.setDollarCurrCode(account.getDollarCurrCode());
            this.n.setTypeID(account.getTypeID());
            this.n.setFlagEKTP(account.getFlagEKTP());
            this.n.setNumberID(account.getNumberID());
            this.n.setExpID(account.getExpID());
            this.n.setName(account.getName());
            this.n.setSex(account.getSex());
            this.n.setLastEducation(account.getLastEducation());
            this.n.setCob(account.getCob());
            this.n.setCobIsoCode(account.getCobIsoCode());
            this.n.setPob(account.getPob());
            this.n.setDob(account.getDob());
            this.n.setMotherMaidenName(account.getMotherMaidenName());
            this.n.setMaritalStatus(account.getMaritalStatus());
            this.n.setMaritalStatusValue(account.getMaritalStatusValue());
            this.n.setReligion(account.getReligion());
            this.n.setReligionValue(account.getReligionValue());
            this.n.setReligionOthers(account.getReligionOthers());
            this.n.setCitizen(account.getCitizen());
            this.n.setCitizenValue(account.getCitizenValue());
            this.n.setCitizenOthers(account.getCitizenOthers());
            this.n.setKitasKitapFlag(account.getKitasKitapFlag());
            this.n.setKitasKitapNumber(account.getKitasKitapNumber());
            this.n.setKitasKitapExpDate(account.getKitasKitapExpDate());
            this.n.setHmPhoneCodeNumber(account.getHmPhoneCodeNumber());
            this.n.setHmPhoneNumber(account.getHmPhoneNumber());
            this.n.setHandPhoneCountryCodeNumber(account.getHandPhoneCountryCodeNumber());
            this.n.setHandPhoneNumber(account.getHandPhoneNumber());
            this.n.setFlagDifResidency(account.getFlagDifResidency());
            this.n.setResCountry(account.getResCountry());
            this.n.setResAddress(account.getResAddress());
            this.n.setResRT(account.getResRT());
            this.n.setResRW(account.getResRW());
            this.n.setResVillage(account.getResVillage());
            this.n.setResSubDistrict(account.getResSubDistrict());
            this.n.setResCity(account.getResCity());
            this.n.setResPostCode(account.getResPostCode());
            this.n.setResPhoneNumber(account.getResPhoneNumber());
            this.n.setResProvince(account.getResProvince());
            this.n.setResHouseStatus(account.getResHouseStatus());
            this.n.setHmCountry(account.getHmCountry());
            this.n.setHmAddress(account.getHmAddress());
            this.n.setHmRT(account.getHmRT());
            this.n.setHmRW(account.getHmRW());
            this.n.setHmVillage(account.getHmVillage());
            this.n.setHmSubDistrict(account.getHmSubDistrict());
            this.n.setHmCity(account.getHmCity());
            this.n.setHmPostCode(account.getHmPostCode());
            this.n.setHmHouseStatus(account.getHmHouseStatus());
            this.n.setHmProvince(account.getHmProvince());
            this.n.setFlagNPWP(account.getFlagNPWP());
            this.n.setNpwp(account.getNpwp());
            this.n.setJob(account.getJob());
            this.n.setJobValue(account.getJobValue());
            this.n.setIncomeSource(account.getIncomeSource());
            this.n.setIncomeSourceValue(account.getIncomeSourceValue());
            this.n.setIncomeSourceOthers(account.getIncomeSourceOthers());
            this.n.setSalary(account.getSalary());
            this.n.setSalaryValue(account.getSalaryValue());
            this.n.setOfficeName(account.getOfficeName());
            this.n.setOfficeAddress(account.getOfficeAddress());
            this.n.setOfficeCity(account.getOfficeCity());
            this.n.setOfficeProvince(account.getOfficeProvince());
            this.n.setOfficePostCode(account.getOfficePostCode());
            this.n.setOccupation(account.getOccupation());
            this.n.setOccupationFlagFreeText(account.getOccupationFlagFreeText());
            this.n.setOccupationValue(account.getOccupationValue());
            this.n.setBusinessField(account.getBusinessField());
            this.n.setBusinessFieldFlagFreeText(account.getBusinessFieldFlagFreeText());
            this.n.setBusinessFieldValue(account.getBusinessFieldValue());
            this.n.setJobOthers(account.getJobOthers());
            this.n.setFotoKtp(account.getFotoKtp());
            this.n.setFotoPribadi(account.getFotoPribadi());
            this.n.setFotoNpwp(account.getFotoNpwp());
            this.C = this.n.getOldCustFlag();
            if (this.n.getOldCustFlag().equals("Y")) {
                this.llLongIndicator.setVisibility(8);
            } else {
                this.llLongIndicator.setVisibility(0);
            }
            String acctType = this.n.getAcctType();
            acctType.hashCode();
            switch (acctType.hashCode()) {
                case -1797342180:
                    if (acctType.equals("Tahaka")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1797087683:
                    if (acctType.equals("Tapres")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -245309302:
                    if (acctType.equals("Tahapan Xpresi")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 116972183:
                    if (acctType.equals("Tahapan")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1008083377:
                    if (acctType.equals("Deposito")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1076132060:
                    if (acctType.equals("BCA Dollar")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            if (c3 == 0) {
                this.p = "Tahapan Berjangka";
                this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitleTahapanBerjangka));
            } else if (c3 == 1) {
                this.p = "Tapres BCA";
                this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitleTapres));
            } else if (c3 == 2) {
                this.p = "Tahapan Xpresi";
                this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitleTahapanXpresi));
            } else if (c3 == 3) {
                this.p = "Tahapan BCA";
                this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitleTahapanBCA));
            } else if (c3 == 4) {
                this.p = "DEPOSITO";
                this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitleDeposito));
            } else if (c3 == 5) {
                this.p = "BCA Dollar";
                this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitleBCADollar));
            }
            String currentPage = this.n.getCurrentPage();
            currentPage.hashCode();
            switch (currentPage.hashCode()) {
                case -2118893650:
                    if (currentPage.equals("Page6FLPasporFragment")) {
                        c4 = 0;
                        break;
                    } else {
                        c4 = 65535;
                        break;
                    }
                case -1948251313:
                    if (currentPage.equals("Page6DBCADollarFragment")) {
                        c4 = 1;
                        break;
                    } else {
                        c4 = 65535;
                        break;
                    }
                case -1891638594:
                    if (currentPage.equals("Page6ELFragment")) {
                        c4 = 2;
                        break;
                    } else {
                        c4 = 65535;
                        break;
                    }
                case -1855431452:
                    if (currentPage.equals("Page6FSFragment")) {
                        c4 = 3;
                        break;
                    } else {
                        c4 = 65535;
                        break;
                    }
                case -1658917947:
                    if (currentPage.equals("Page6ESFragment")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1265890937:
                    if (currentPage.equals("Page6CSFragment")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1030965204:
                    if (currentPage.equals("Page6CFragment")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -557313382:
                    if (currentPage.equals("Page6KL2Fragment")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -428348280:
                    if (currentPage.equals("Page6DTahapanXpresiSFragment")) {
                        c4 = '\b';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -169764847:
                    if (currentPage.equals("Page6FLKartuPelajarFragment")) {
                        c4 = '\t';
                        break;
                    }
                    c4 = 65535;
                    break;
                case -164980023:
                    if (currentPage.equals("Page6DTapresSFragment")) {
                        c4 = '\n';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 241680147:
                    if (currentPage.equals("Page6PLFragment")) {
                        c4 = 11;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 363010756:
                    if (currentPage.equals("Page6DBCADollarSFragment")) {
                        c4 = '\f';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 378000106:
                    if (currentPage.equals("Page6FLKTPFragment")) {
                        c4 = '\r';
                        break;
                    }
                    c4 = 65535;
                    break;
                case 438193652:
                    if (currentPage.equals("Page6OLFragment")) {
                        c4 = 14;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 634707157:
                    if (currentPage.equals("Page6NLFragment")) {
                        c4 = 15;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 728518365:
                    if (currentPage.equals("Page6DTahapanBCASFragment")) {
                        c4 = 16;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 831220662:
                    if (currentPage.equals("Page6MLFragment")) {
                        c4 = 17;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1027734167:
                    if (currentPage.equals("Page6LLFragment")) {
                        c4 = 18;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1074262283:
                    if (currentPage.equals("Page6DTahapanXpresiFragment")) {
                        c4 = 19;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1224247672:
                    if (currentPage.equals("Page6KLFragment")) {
                        c4 = 20;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1250127894:
                    if (currentPage.equals("Page6DTahapanBCAFragment")) {
                        c4 = 21;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1420761177:
                    if (currentPage.equals("Page6JLFragment")) {
                        c4 = 22;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1617274682:
                    if (currentPage.equals("Page6ILFragment")) {
                        c4 = 23;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1813788187:
                    if (currentPage.equals("Page6HLFragment")) {
                        c4 = 24;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1914042026:
                    if (currentPage.equals("Page6DTapresFragment")) {
                        c4 = 25;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2010301692:
                    if (currentPage.equals("Page6GLFragment")) {
                        c4 = 26;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                    d(2131296811, new Page6FLPasporFragment(), "Page6FLPasporFragment");
                    break;
                case 1:
                    d(2131296811, new Page6DBCADollarFragment(), "Page6DBCADollarFragment");
                    break;
                case 2:
                    d(2131296811, new Page6ELFragment(), "Page6ELFragment");
                    break;
                case 3:
                    d(2131296811, new Page6FSFragment(), "Page6FSFragment");
                    break;
                case 4:
                    d(2131296811, new Page6ESFragment(), "Page6ESFragment");
                    break;
                case 5:
                    d(2131296811, new Page6CSFragment(), "Page6CSFragment");
                    break;
                case 6:
                    d(2131296811, new Page6CFragment(), "Page6CFragment");
                    break;
                case 7:
                    d(2131296811, new Page6KL2Fragment(), "Page6KL2Fragment");
                    break;
                case '\b':
                    d(2131296811, new Page6DTahapanXpresiSFragment(), "Page6DTahapanXpresiSFragment");
                    break;
                case '\t':
                    d(2131296811, new Page6FLKartuPelajarFragment(), "Page6FLKartuPelajarFragment");
                    break;
                case '\n':
                    d(2131296811, new Page6DTapresSFragment(), "Page6DTapresSFragment");
                    break;
                case 11:
                    d(2131296811, new Page6PLFragment(), "Page6PLFragment");
                    break;
                case '\f':
                    d(2131296811, new Page6DBCADollarSFragment(), "Page6DBCADollarSFragment");
                    break;
                case '\r':
                    d(2131296811, new Page6FLKTPFragment(), "Page6FLKTPFragment");
                    break;
                case 14:
                    d(2131296811, new Page6OLFragment(), "Page6OLFragment");
                    break;
                case 15:
                    d(2131296811, new Page6NLFragment(), "Page6NLFragment");
                    break;
                case 16:
                    d(2131296811, new Page6DTahapanBCASFragment(), "Page6DTahapanBCASFragment");
                    break;
                case 17:
                    d(2131296811, new Page6MLFragment(), "Page6MLFragment");
                    break;
                case 18:
                    d(2131296811, new Page6LLFragment(), "Page6LLFragment");
                    break;
                case 19:
                    d(2131296811, new Page6DTahapanXpresiFragment(), "Page6DTahapanXpresiFragment");
                    break;
                case 20:
                    d(2131296811, new Page6KLFragment(), "Page6KLFragment");
                    break;
                case 21:
                    d(2131296811, new Page6DTahapanBCAFragment(), "Page6DTahapanBCAFragment");
                    break;
                case 22:
                    d(2131296811, new Page6JLFragment(), "Page6JLFragment");
                    break;
                case 23:
                    d(2131296811, new Page6ILFragment(), "Page6ILFragment");
                    break;
                case 24:
                    d(2131296811, new Page6HLFragment(), "Page6HLFragment");
                    break;
                case 25:
                    d(2131296811, new Page6DTapresFragment(), "Page6DTapresFragment");
                    break;
                case 26:
                    d(2131296811, new Page6GLFragment(), "Page6GLFragment");
                    break;
            }
            if (this.C.equals("Y") || this.p.equals("Tahapan Berjangka")) {
                this.llLongIndicator.setVisibility(8);
                if ("Y".equals(this.r.getVerified())) {
                    this.pbIndicator2.setVisibility(8);
                    this.tvIndicator3.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        String string = this.u.getString("product_type");
        this.p = string;
        string.hashCode();
        switch (string.hashCode()) {
            case -748993769:
                if (string.equals("Tahapan BCA")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -245309302:
                if (string.equals("Tahapan Xpresi")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 164545469:
                if (string.equals("Tapres BCA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1076132060:
                if (string.equals("BCA Dollar")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1269943660:
                if (string.equals("Tahapan Berjangka")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1726066065:
                if (string.equals("DEPOSITO")) {
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
            this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitleTahapanBCA));
        } else if (c == 1) {
            this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitleTahapanXpresi));
        } else if (c == 2) {
            this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitleTapres));
        } else if (c == 3) {
            this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitleBCADollar));
        } else if (c == 4) {
            this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitleTahapanBerjangka));
        } else if (c == 5) {
            this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitleDeposito));
        }
        Account account3 = new Account();
        this.n = account3;
        if (this.q) {
            Account account4 = (Account) this.k.where(Account.class).equalTo("id", Long.valueOf(this.A)).findFirst();
            if (account4 != null) {
                this.t = true;
                this.n.setId(account4.getId());
                this.n.setCurrentPage(account4.getCurrentPage());
                this.n.setCreatedAt(account4.getCreatedAt());
                this.n.setUpdatedAt(account4.getUpdatedAt());
                this.n.setEmailAddr(account4.getEmailAddr());
                this.n.setAcctType(account4.getAcctType());
                this.n.setFlagGuest(account4.getFlagGuest());
                this.n.setOldCustFlag(account4.getOldCustFlag());
                this.n.setPurposePemRek(account4.getPurposePemRek());
                this.n.setPurposePemRekOthers(account4.getPurposePemRekOthers());
                this.n.setLanguage(account4.getLanguage());
                this.n.setDebitCardType(account4.getDebitCardType());
                this.n.setFlagIB(account4.getFlagIB());
                this.n.setFlagMB(account4.getFlagMB());
                this.n.setEmailIB(account4.getEmailIB());
                this.n.setHphoneMB(account4.getHphoneMB());
                this.n.setDollarCurrCode(account4.getDollarCurrCode());
                this.n.setTypeID(account4.getTypeID());
                this.n.setFlagEKTP(account4.getFlagEKTP());
                this.n.setNumberID(account4.getNumberID());
                this.n.setExpID(account4.getExpID());
                this.n.setName(account4.getName());
                this.n.setSex(account4.getSex());
                this.n.setLastEducation(account4.getLastEducation());
                this.n.setCob(account4.getCob());
                this.n.setCobIsoCode(account4.getCobIsoCode());
                this.n.setPob(account4.getPob());
                this.n.setDob(account4.getDob());
                this.n.setMotherMaidenName(account4.getMotherMaidenName());
                this.n.setMaritalStatus(account4.getMaritalStatus());
                this.n.setMaritalStatusValue(account4.getMaritalStatusValue());
                this.n.setReligion(account4.getReligion());
                this.n.setReligionValue(account4.getReligionValue());
                this.n.setReligionOthers(account4.getReligionOthers());
                this.n.setCitizen(account4.getCitizen());
                this.n.setCitizenValue(account4.getCitizenValue());
                this.n.setCitizenOthers(account4.getCitizenOthers());
                this.n.setKitasKitapFlag(account4.getKitasKitapFlag());
                this.n.setKitasKitapNumber(account4.getKitasKitapNumber());
                this.n.setKitasKitapExpDate(account4.getKitasKitapExpDate());
                this.n.setHmPhoneCodeNumber(account4.getHmPhoneCodeNumber());
                this.n.setHmPhoneNumber(account4.getHmPhoneNumber());
                this.n.setHandPhoneCountryCodeNumber(account4.getHandPhoneCountryCodeNumber());
                this.n.setHandPhoneNumber(account4.getHandPhoneNumber());
                this.n.setFlagDifResidency(account4.getFlagDifResidency());
                this.n.setResCountry(account4.getResCountry());
                this.n.setResAddress(account4.getResAddress());
                this.n.setResRT(account4.getResRT());
                this.n.setResRW(account4.getResRW());
                this.n.setResVillage(account4.getResVillage());
                this.n.setResSubDistrict(account4.getResSubDistrict());
                this.n.setResCity(account4.getResCity());
                this.n.setResPostCode(account4.getResPostCode());
                this.n.setResPhoneNumber(account4.getResPhoneNumber());
                this.n.setResProvince(account4.getResProvince());
                this.n.setResHouseStatus(account4.getResHouseStatus());
                this.n.setHmCountry(account4.getHmCountry());
                this.n.setHmAddress(account4.getHmAddress());
                this.n.setHmRT(account4.getHmRT());
                this.n.setHmRW(account4.getHmRW());
                this.n.setHmVillage(account4.getHmVillage());
                this.n.setHmSubDistrict(account4.getHmSubDistrict());
                this.n.setHmCity(account4.getHmCity());
                this.n.setHmPostCode(account4.getHmPostCode());
                this.n.setHmHouseStatus(account4.getHmHouseStatus());
                this.n.setHmProvince(account4.getHmProvince());
                this.n.setFlagNPWP(account4.getFlagNPWP());
                this.n.setNpwp(account4.getNpwp());
                this.n.setJob(account4.getJob());
                this.n.setJobValue(account4.getJobValue());
                this.n.setIncomeSource(account4.getIncomeSource());
                this.n.setIncomeSourceValue(account4.getIncomeSourceValue());
                this.n.setIncomeSourceOthers(account4.getIncomeSourceOthers());
                this.n.setSalary(account4.getSalary());
                this.n.setSalaryValue(account4.getSalaryValue());
                this.n.setOfficeName(account4.getOfficeName());
                this.n.setOfficeAddress(account4.getOfficeAddress());
                this.n.setOfficeCity(account4.getOfficeCity());
                this.n.setOfficeProvince(account4.getOfficeProvince());
                this.n.setOfficePostCode(account4.getOfficePostCode());
                this.n.setOccupation(account4.getOccupation());
                this.n.setOccupationFlagFreeText(account4.getOccupationFlagFreeText());
                this.n.setOccupationValue(account4.getOccupationValue());
                this.n.setBusinessField(account4.getBusinessField());
                this.n.setBusinessFieldFlagFreeText(account4.getBusinessFieldFlagFreeText());
                this.n.setBusinessFieldValue(account4.getBusinessFieldValue());
                this.n.setJobOthers(account4.getJobOthers());
                this.n.setFotoKtp(account4.getFotoKtp());
                this.n.setFotoPribadi(account4.getFotoPribadi());
                this.n.setFotoNpwp(account4.getFotoNpwp());
            } else {
                this.t = false;
                this.n.setId(this.A);
                this.n.setCreatedAt(this.A);
            }
        } else {
            account3.setId(System.currentTimeMillis());
            this.n.setCreatedAt(System.currentTimeMillis());
        }
        this.n.setOldCustFlag(this.C);
        String str = this.p;
        str.hashCode();
        switch (str.hashCode()) {
            case -748993769:
                if (str.equals("Tahapan BCA")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -245309302:
                if (str.equals("Tahapan Xpresi")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 164545469:
                if (str.equals("Tapres BCA")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1076132060:
                if (str.equals("BCA Dollar")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1269943660:
                if (str.equals("Tahapan Berjangka")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1726066065:
                if (str.equals("DEPOSITO")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            this.n.setAcctType("Tahapan");
        } else if (c2 == 1) {
            this.n.setAcctType("Tahapan Xpresi");
        } else if (c2 == 2) {
            this.n.setAcctType("Tapres");
        } else if (c2 == 3) {
            this.n.setAcctType("BCA Dollar");
        } else if (c2 == 4) {
            this.n.setAcctType("Tahaka");
        } else if (c2 == 5) {
            this.n.setAcctType("Deposito");
        }
        if (this.C.equals("Y") || this.p.equals("Tahapan Berjangka")) {
            this.llLongIndicator.setVisibility(8);
            if ("Y".equals(this.r.getVerified())) {
                this.pbIndicator2.setVisibility(8);
                this.tvIndicator3.setVisibility(8);
            }
            if (this.t) {
                d(2131296811, new Page6FSFragment(), "Page6FSFragment");
            } else {
                d(2131296811, new Page6CSFragment(), "Page6CSFragment");
            }
            if (this.p.equals("Tahapan Berjangka") && !"Y".equals(this.r.getVerified())) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("MessageDialogContent", getString(2131822440));
                bundle2.putString("MessageDialogTitle", getString(2131822223));
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle2);
                messageDialog.show(l(), "MessageDialog");
                return;
            }
            return;
        }
        this.llLongIndicator.setVisibility(0);
        d(2131296811, new Page6CFragment(), "Page6CFragment");
    }

    public final void d(GetAcctOpeningCategoryDataResponse getAcctOpeningCategoryDataResponse) {
        this.f = getAcctOpeningCategoryDataResponse;
        for (GetAcctOpeningCategoryDataResponse.CategoryAcct categoryAcct : getAcctOpeningCategoryDataResponse.getListCategory()) {
            String categoryCode = categoryAcct.getCategoryCode();
            categoryCode.hashCode();
            char c = 65535;
            switch (categoryCode.hashCode()) {
                case 2043665:
                    if (categoryCode.equals("C004")) {
                        c = 0;
                        break;
                    }
                    break;
                case 2043667:
                    if (categoryCode.equals("C006")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2043692:
                    if (categoryCode.equals("C010")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2043726:
                    if (categoryCode.equals("C023")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.s = categoryAcct.getCategoryContent();
            } else if (c == 1) {
                this.w = categoryAcct.getCategoryContent();
            } else if (c == 2) {
                this.x = categoryAcct.getCategoryContent();
            } else if (c == 3) {
                this.y = categoryAcct.getCategoryContent();
            }
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        documentProvider.b().d(new clickOrangSamaDenganPemilik());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueKeluarFormReservation(onUbahFormReservasiEvent onubahformreservasievent) {
        if (onubahformreservasievent.b.equals("Y")) {
            finish();
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        if (reservasiSuccessEChannelActivity_ViewBinding.d.equals("N")) {
            this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.FormActivity.4
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    Account account = (Account) realm.where(Account.class).equalTo("id", Long.valueOf(FormActivity.this.n.getId())).findFirst();
                    if (account != null) {
                        account.deleteFromRealm();
                        documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
                    }
                }
            });
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return;
        }
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.CC5UbahVisacardActivity
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                FormActivity formActivity = FormActivity.this;
                Account account = (Account) realm.where(Account.class).equalTo("id", Long.valueOf(formActivity.n.getId())).findFirst();
                if (account == null) {
                    Account account2 = (Account) realm.createObject(Account.class, Long.valueOf(formActivity.n.getId()));
                    account2.setCurrentPage(formActivity.n.getCurrentPage());
                    account2.setCreatedAt(formActivity.n.getCreatedAt());
                    account2.setUpdatedAt(formActivity.n.getUpdatedAt());
                    account2.setEmailAddr(formActivity.n.getEmailAddr());
                    account2.setAcctType(formActivity.n.getAcctType());
                    account2.setFlagGuest(formActivity.n.getFlagGuest());
                    account2.setOldCustFlag(formActivity.n.getOldCustFlag());
                    account2.setPurposePemRek(formActivity.n.getPurposePemRek());
                    account2.setPurposePemRekOthers(formActivity.n.getPurposePemRekOthers());
                    account2.setLanguage(formActivity.n.getLanguage());
                    account2.setDebitCardType(formActivity.n.getDebitCardType());
                    account2.setFlagIB(formActivity.n.getFlagIB());
                    account2.setFlagMB(formActivity.n.getFlagMB());
                    account2.setEmailIB(formActivity.n.getEmailIB());
                    account2.setHphoneMB(formActivity.n.getHphoneMB());
                    account2.setDollarCurrCode(formActivity.n.getDollarCurrCode());
                    account2.setTypeID(formActivity.n.getTypeID());
                    account2.setFlagEKTP(formActivity.n.getFlagEKTP());
                    account2.setNumberID(formActivity.n.getNumberID());
                    account2.setExpID(formActivity.n.getExpID());
                    account2.setName(formActivity.n.getName());
                    account2.setSex(formActivity.n.getSex());
                    account2.setLastEducation(formActivity.n.getLastEducation());
                    account2.setCob(formActivity.n.getCob());
                    account2.setCobIsoCode(formActivity.n.getCobIsoCode());
                    account2.setPob(formActivity.n.getPob());
                    account2.setDob(formActivity.n.getDob());
                    account2.setMotherMaidenName(formActivity.n.getMotherMaidenName());
                    account2.setMaritalStatus(formActivity.n.getMaritalStatus());
                    account2.setMaritalStatusValue(formActivity.n.getMaritalStatusValue());
                    account2.setReligion(formActivity.n.getReligion());
                    account2.setReligionValue(formActivity.n.getReligionValue());
                    account2.setReligionOthers(formActivity.n.getReligionOthers());
                    account2.setCitizen(formActivity.n.getCitizen());
                    account2.setCitizenValue(formActivity.n.getCitizenValue());
                    account2.setCitizenOthers(formActivity.n.getCitizenOthers());
                    account2.setKitasKitapFlag(formActivity.n.getKitasKitapFlag());
                    account2.setKitasKitapNumber(formActivity.n.getKitasKitapNumber());
                    account2.setKitasKitapExpDate(formActivity.n.getKitasKitapExpDate());
                    account2.setHmPhoneCodeNumber(formActivity.n.getHmPhoneCodeNumber());
                    account2.setHmPhoneNumber(formActivity.n.getHmPhoneNumber());
                    account2.setHandPhoneCountryCodeNumber(formActivity.n.getHandPhoneCountryCodeNumber());
                    account2.setHandPhoneNumber(formActivity.n.getHandPhoneNumber());
                    account2.setFlagDifResidency(formActivity.n.getFlagDifResidency());
                    account2.setResCountry(formActivity.n.getResCountry());
                    account2.setResAddress(formActivity.n.getResAddress());
                    account2.setResRT(formActivity.n.getResRT());
                    account2.setResRW(formActivity.n.getResRW());
                    account2.setResVillage(formActivity.n.getResVillage());
                    account2.setResSubDistrict(formActivity.n.getResSubDistrict());
                    account2.setResCity(formActivity.n.getResCity());
                    account2.setResPostCode(formActivity.n.getResPostCode());
                    account2.setResPhoneNumber(formActivity.n.getResPhoneNumber());
                    account2.setResProvince(formActivity.n.getResProvince());
                    account2.setResHouseStatus(formActivity.n.getResHouseStatus());
                    account2.setHmCountry(formActivity.n.getHmCountry());
                    account2.setHmAddress(formActivity.n.getHmAddress());
                    account2.setHmRT(formActivity.n.getHmRT());
                    account2.setHmRW(formActivity.n.getHmRW());
                    account2.setHmVillage(formActivity.n.getHmVillage());
                    account2.setHmSubDistrict(formActivity.n.getHmSubDistrict());
                    account2.setHmCity(formActivity.n.getHmCity());
                    account2.setHmPostCode(formActivity.n.getHmPostCode());
                    account2.setHmHouseStatus(formActivity.n.getHmHouseStatus());
                    account2.setHmProvince(formActivity.n.getHmProvince());
                    account2.setFlagNPWP(formActivity.n.getFlagNPWP());
                    account2.setNpwp(formActivity.n.getNpwp());
                    account2.setJob(formActivity.n.getJob());
                    account2.setJobValue(formActivity.n.getJobValue());
                    account2.setIncomeSource(formActivity.n.getIncomeSource());
                    account2.setIncomeSourceValue(formActivity.n.getIncomeSourceValue());
                    account2.setIncomeSourceOthers(formActivity.n.getIncomeSourceOthers());
                    account2.setSalary(formActivity.n.getSalary());
                    account2.setSalaryValue(formActivity.n.getSalaryValue());
                    account2.setOfficeName(formActivity.n.getOfficeName());
                    account2.setOfficeAddress(formActivity.n.getOfficeAddress());
                    account2.setOfficeCity(formActivity.n.getOfficeCity());
                    account2.setOfficeProvince(formActivity.n.getOfficeProvince());
                    account2.setOfficePostCode(formActivity.n.getOfficePostCode());
                    account2.setOccupation(formActivity.n.getOccupation());
                    account2.setOccupationFlagFreeText(formActivity.n.getOccupationFlagFreeText());
                    account2.setOccupationValue(formActivity.n.getOccupationValue());
                    account2.setBusinessField(formActivity.n.getBusinessField());
                    account2.setBusinessFieldFlagFreeText(formActivity.n.getBusinessFieldFlagFreeText());
                    account2.setBusinessFieldValue(formActivity.n.getBusinessFieldValue());
                    account2.setJobOthers(formActivity.n.getJobOthers());
                    account2.setFotoKtp(formActivity.n.getFotoKtp());
                    account2.setFotoPribadi(formActivity.n.getFotoPribadi());
                    account2.setFotoNpwp(formActivity.n.getFotoNpwp());
                    formActivity.r.getAccounts().add(account2);
                    return;
                }
                account.setCurrentPage(formActivity.n.getCurrentPage());
                account.setCreatedAt(formActivity.n.getCreatedAt());
                account.setUpdatedAt(formActivity.n.getUpdatedAt());
                account.setEmailAddr(formActivity.n.getEmailAddr());
                account.setAcctType(formActivity.n.getAcctType());
                account.setFlagGuest(formActivity.n.getFlagGuest());
                account.setOldCustFlag(formActivity.n.getOldCustFlag());
                account.setPurposePemRek(formActivity.n.getPurposePemRek());
                account.setPurposePemRekOthers(formActivity.n.getPurposePemRekOthers());
                account.setLanguage(formActivity.n.getLanguage());
                account.setDebitCardType(formActivity.n.getDebitCardType());
                account.setFlagIB(formActivity.n.getFlagIB());
                account.setFlagMB(formActivity.n.getFlagMB());
                account.setEmailIB(formActivity.n.getEmailIB());
                account.setHphoneMB(formActivity.n.getHphoneMB());
                account.setDollarCurrCode(formActivity.n.getDollarCurrCode());
                account.setTypeID(formActivity.n.getTypeID());
                account.setFlagEKTP(formActivity.n.getFlagEKTP());
                account.setNumberID(formActivity.n.getNumberID());
                account.setExpID(formActivity.n.getExpID());
                account.setName(formActivity.n.getName());
                account.setSex(formActivity.n.getSex());
                account.setLastEducation(formActivity.n.getLastEducation());
                account.setCob(formActivity.n.getCob());
                account.setCobIsoCode(formActivity.n.getCobIsoCode());
                account.setPob(formActivity.n.getPob());
                account.setDob(formActivity.n.getDob());
                account.setMotherMaidenName(formActivity.n.getMotherMaidenName());
                account.setMaritalStatus(formActivity.n.getMaritalStatus());
                account.setMaritalStatusValue(formActivity.n.getMaritalStatusValue());
                account.setReligion(formActivity.n.getReligion());
                account.setReligionValue(formActivity.n.getReligionValue());
                account.setReligionOthers(formActivity.n.getReligionOthers());
                account.setCitizen(formActivity.n.getCitizen());
                account.setCitizenValue(formActivity.n.getCitizenValue());
                account.setCitizenOthers(formActivity.n.getCitizenOthers());
                account.setKitasKitapFlag(formActivity.n.getKitasKitapFlag());
                account.setKitasKitapNumber(formActivity.n.getKitasKitapNumber());
                account.setKitasKitapExpDate(formActivity.n.getKitasKitapExpDate());
                account.setHmPhoneCodeNumber(formActivity.n.getHmPhoneCodeNumber());
                account.setHmPhoneNumber(formActivity.n.getHmPhoneNumber());
                account.setHandPhoneCountryCodeNumber(formActivity.n.getHandPhoneCountryCodeNumber());
                account.setHandPhoneNumber(formActivity.n.getHandPhoneNumber());
                account.setFlagDifResidency(formActivity.n.getFlagDifResidency());
                account.setResCountry(formActivity.n.getResCountry());
                account.setResAddress(formActivity.n.getResAddress());
                account.setResRT(formActivity.n.getResRT());
                account.setResRW(formActivity.n.getResRW());
                account.setResVillage(formActivity.n.getResVillage());
                account.setResSubDistrict(formActivity.n.getResSubDistrict());
                account.setResCity(formActivity.n.getResCity());
                account.setResPostCode(formActivity.n.getResPostCode());
                account.setResPhoneNumber(formActivity.n.getResPhoneNumber());
                account.setResProvince(formActivity.n.getResProvince());
                account.setResHouseStatus(formActivity.n.getResHouseStatus());
                account.setHmCountry(formActivity.n.getHmCountry());
                account.setHmAddress(formActivity.n.getHmAddress());
                account.setHmRT(formActivity.n.getHmRT());
                account.setHmRW(formActivity.n.getHmRW());
                account.setHmVillage(formActivity.n.getHmVillage());
                account.setHmSubDistrict(formActivity.n.getHmSubDistrict());
                account.setHmCity(formActivity.n.getHmCity());
                account.setHmPostCode(formActivity.n.getHmPostCode());
                account.setHmHouseStatus(formActivity.n.getHmHouseStatus());
                account.setHmProvince(formActivity.n.getHmProvince());
                account.setFlagNPWP(formActivity.n.getFlagNPWP());
                account.setNpwp(formActivity.n.getNpwp());
                account.setJob(formActivity.n.getJob());
                account.setJobValue(formActivity.n.getJobValue());
                account.setIncomeSource(formActivity.n.getIncomeSource());
                account.setIncomeSourceValue(formActivity.n.getIncomeSourceValue());
                account.setIncomeSourceOthers(formActivity.n.getIncomeSourceOthers());
                account.setSalary(formActivity.n.getSalary());
                account.setSalaryValue(formActivity.n.getSalaryValue());
                account.setOfficeName(formActivity.n.getOfficeName());
                account.setOfficeAddress(formActivity.n.getOfficeAddress());
                account.setOfficeCity(formActivity.n.getOfficeCity());
                account.setOfficeProvince(formActivity.n.getOfficeProvince());
                account.setOfficePostCode(formActivity.n.getOfficePostCode());
                account.setOccupation(formActivity.n.getOccupation());
                account.setOccupationFlagFreeText(formActivity.n.getOccupationFlagFreeText());
                account.setOccupationValue(formActivity.n.getOccupationValue());
                account.setBusinessField(formActivity.n.getBusinessField());
                account.setBusinessFieldFlagFreeText(formActivity.n.getBusinessFieldFlagFreeText());
                account.setBusinessFieldValue(formActivity.n.getBusinessFieldValue());
                account.setJobOthers(formActivity.n.getJobOthers());
                account.setFotoKtp(formActivity.n.getFotoKtp());
                account.setFotoPribadi(formActivity.n.getFotoPribadi());
                account.setFotoNpwp(formActivity.n.getFotoNpwp());
            }
        });
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        if (tarikanReservasiUbahTransaksiActivity_ViewBinding.a.equals("Y")) {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.q) {
            return true;
        }
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        GetHBPresenter getHBPresenter = this.v;
        Call<OpenAccountSuccessActivity<Object>> call = getHBPresenter.b;
        if (call != null) {
            call.cancel();
        }
        getHBPresenter.e = null;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onGetHBEvent(onClickUbahDataOrangDatangKeCabang onclickubahdataorangdatangkecabang) {
        if (this.m != null) {
            GetHBPresenter getHBPresenter = this.v;
            Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
            getHBPresenter.b = e;
            e.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                  (r0v7 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                  (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x003c: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v3 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.FormActivity.onGetHBEvent(o.onClickUbahDataOrangDatangKeCabang):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/FormActivity.class
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetHBPresenter, state: GENERATED_AND_UNLOADED
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
                	... 23 more
                */
            /*
                this = this;
                r0 = r6
                com.bca.smartbranch.data.localdb.User r0 = r0.m
                if (r0 == 0) goto L_0x0044
                r0 = r6
                com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.v
                r7 = r0
                o.InfoProductORActivity_ViewBinding r0 = new o.InfoProductORActivity_ViewBinding
                r1 = r0
                r2 = r6
                java.lang.String r2 = r2.h
                r3 = r6
                com.bca.smartbranch.data.localdb.User r3 = r3.m
                java.lang.String r3 = r3.getSessionId()
                r4 = r6
                com.bca.smartbranch.data.localdb.User r4 = r4.m
                java.lang.String r4 = r4.getImei()
                r1.<init>(r2, r3, r4)
                r8 = r0
                r0 = r7
                o.setIncomeDisplayAmount r0 = r0.apiService
                r1 = r8
                retrofit2.Call r0 = r0.e(r1)
                r8 = r0
                r0 = r7
                r1 = r8
                r0.b = r1
                r0 = r8
                com.bca.smartbranch.presenter.GetHBPresenter$5 r1 = new com.bca.smartbranch.presenter.GetHBPresenter$5
                r2 = r1
                r3 = r7
                r2.<init>()
                r0.enqueue(r1)
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.FormActivity.onGetHBEvent(o.onClickUbahDataOrangDatangKeCabang):void");
        }

        @Override // android.app.Activity
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            getPromotion.d(this);
            if (menuItem.getItemId() == 16908332) {
                onBackPressed();
                return true;
            } else if (menuItem.getItemId() != 2131298038) {
                return onOptionsItemSelected(menuItem);
            } else {
                if (!this.r.isMember()) {
                    YakinKeluarDialog yakinKeluarDialog = new YakinKeluarDialog();
                    yakinKeluarDialog.d = "transaction_cs";
                    yakinKeluarDialog.show(l(), "YakinKeluarDialog");
                    return true;
                } else if (this.q) {
                    new KeluarFormReservationDialog().show(l(), "KeluarFormReservationDialog");
                    return true;
                } else {
                    SimpanDraftDialog simpanDraftDialog = new SimpanDraftDialog();
                    simpanDraftDialog.b = "transaction_cs";
                    simpanDraftDialog.show(l(), "SimpanDraftDialog");
                    return true;
                }
            }
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final void p() {
            setCardSlogan.e().b = "FormActivity";
            this.j = "FormActivity";
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final int q() {
            return 2131492953;
        }

        @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
        protected final Activity r() {
            return this;
        }

        public final Account s() {
            return this.n;
        }

        public final User t() {
            return this.r;
        }

        public final void v() {
            this.k.executeTransaction(new Realm.Transaction() { // from class: o.CC5UbahVisacardActivity_ViewBinding
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    realm.copyToRealmOrUpdate((Realm) FormActivity.this.n, new ImportFlag[0]);
                }
            });
            Intent intent = new Intent(this, FormSuccessActivity.class);
            intent.putExtra("Transaction_name", this.p);
            intent.putExtra("email", this.n.getEmailAddr());
            intent.putExtra("is_from_reservation", true);
            intent.putExtra("id_reservation", this.A);
            startActivity(intent);
            finish();
        }
    }
