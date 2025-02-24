package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.hardware.fingerprint.FingerprintManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.App;
import com.bca.smartbranch.activity.MainActivity;
import com.bca.smartbranch.adapter.MenuEbranchAdapter;
import com.bca.smartbranch.data.api.response.CustDataResponse;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.global.DaftarTransfer;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.FingerprintDialog;
import com.bca.smartbranch.dialog.FingerprintSuccessDialog;
import com.bca.smartbranch.dialog.FiturReservasiGuestDialog;
import com.bca.smartbranch.dialog.FiturSignUpDialog;
import com.bca.smartbranch.dialog.HaloBCADialog;
import com.bca.smartbranch.dialog.LogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.UpgradeAppDialog;
import com.bca.smartbranch.presenter.CheckCutOffPresenter;
import com.bca.smartbranch.presenter.CheckVersionPresenter;
import com.bca.smartbranch.presenter.DaftarTransferPresenter;
import com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter;
import com.bca.smartbranch.presenter.GetCustAcctListPresenter;
import com.bca.smartbranch.presenter.GetCustDataPresenter;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.GetIdentityPresenter;
import com.bca.smartbranch.presenter.KliringPresenter;
import com.scottyab.rootbeer.RootBeer;
import io.realm.Realm;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.ConfirmVisaAdapter$ViewHolder;
import o.HapusTransaksiBerkalaActivity;
import o.HapusTransaksiBerkalaDialog_ViewBinding;
import o.InfoProductORActivity_ViewBinding;
import o.Keep;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.OpenCCSuccessActivity;
import o.OutwardRemittanceFormActivity_ViewBinding;
import o.Page6CSFragment;
import o.PilihSetoranActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanUbahTransaksiActivity;
import o.VersiActivity_ViewBinding;
import o.chooseHome;
import o.clikedKartuHilang;
import o.clikedKeyHilang;
import o.consumeDisplayCutout;
import o.fillForm;
import o.getAnnualFeeBasicDisplayAmount;
import o.getPromotion;
import o.getResources;
import o.onChooseKotaRes;
import o.onClickNegara;
import o.setAnnualFeeAddOnAmount;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setIncomeDisplayAmount;
import o.setInputType;
import o.setMessage;
import o.setOnHierarchyChangeListener;
import o.setOnStartEnterTransitionListener;
import o.setSelected;
import o.signUp;
import o.subscribeUbahVisaCardEvent;
import o.subsriberChooseValueSetiapTanggalEvent;
import o.sumberDanaEvent;
import o.tambahPemegangKartu;
import o.ubahData;
import org.greenrobot.eventbus.ThreadMode;
import org.joda.time.format.DateTimeFormat;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/MainActivity.class */
public class MainActivity extends BaseActivityPostLogin implements CheckVersionPresenter.RemoteActionCompatParcelizer, CompoundButton.OnCheckedChangeListener, GetIdentityPresenter.write, GetCreditCardOptionsPresenter.read, CheckCutOffPresenter.read, GetCustDataPresenter.write, GetCustAcctListPresenter.read, DaftarTransferPresenter.RemoteActionCompatParcelizer, GetHBPresenter.write, KliringPresenter.RemoteActionCompatParcelizer {
    private KeyStore A;
    private KliringPresenter B;
    private Signature C;
    private GetIdentityPresenter D;
    private Keep F;
    private String H;
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    @BindDrawable(2131231312)
    Drawable btnBurger;
    @BindView(2131296893)
    getResources drawerLayout;
    @BindView(2131296897)
    View dvdFingerprint;
    @BindView(2131296899)
    View dvdHapusDaftarTransfer;
    @BindView(2131296903)
    View dvdPengaturan;
    @BindView(2131296904)
    View dvdRingkasan;
    public ListFormTeller f;
    @BindView(2131297307)
    ImageView ivArrowHubungi;
    @BindView(2131297310)
    ImageView ivArrowPengaturan;
    @BindView(2131297422)
    Page6CSFragment ivUserPhoto;
    @BindView(2131297423)
    ImageView ivVerified;
    @BindString(2131821707)
    String labelHome;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindDrawable(2131231154)
    Drawable menuIndicator;
    private CheckCutOffPresenter n;
    @BindView(2131297792)
    LinearLayout navFingerprint;
    @BindView(2131297795)
    LinearLayout navHapusDaftarTransfer;
    @BindView(2131297796)
    LinearLayout navHapusTransaksiBerkala;
    @BindView(2131297799)
    LinearLayout navPengaturan;
    @BindView(2131297802)
    LinearLayout navRingkasan;
    @BindView(2131297794)
    LinearLayout navSubHelloBCA;
    @BindView(2131297800)
    LinearLayout navSubPengaturan;
    @BindView(2131298078)
    HapusTransaksiBerkalaDialog_ViewBinding navView;
    private DaftarTransferPresenter p;
    private CheckVersionPresenter q;
    @BindString(2131822092)
    String retry;
    @BindView(2131298331)
    setOnStartEnterTransitionListener rvMenu;
    private GetCustAcctListResponse s;
    @BindView(2131298421)
    setSelected swFingerprint;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvTitle;
    @BindView(2131299730)
    TextView tvUserName;
    @BindView(2131299735)
    TextView tvVersi;
    private GetCustAcctListPresenter u;
    private getAnnualFeeBasicDisplayAmount v;
    @BindString(2131822339)
    String verifMessage;
    private GetCreditCardOptionsPresenter w;
    private GetHBPresenter x;
    private GetCustDataPresenter y;
    private RootBeer z;
    private long r = 0;
    private String G = "";
    private ArrayList<Long> t = new ArrayList<>();
    private ArrayList<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> I = new ArrayList<>();
    private ArrayList<List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer>> E = new ArrayList<>();

    public static /* synthetic */ void a(Realm realm) {
        Iterator<E> it = realm.where(CreditCard.class).equalTo("isDraft", Boolean.FALSE).findAll().iterator();
        while (it.hasNext()) {
            CreditCard creditCard = (CreditCard) it.next();
            if (creditCard != null) {
                creditCard.cascadeDelete();
            }
        }
    }

    private List<ConfirmVisaAdapter$ViewHolder> v() {
        int[] iArr = new int[9];
        iArr[0] = 2131231369;
        iArr[1] = 2131231283;
        iArr[2] = 2131231223;
        iArr[3] = 2131230821;
        iArr[4] = 2131231231;
        iArr[5] = 2131231275;
        iArr[6] = 2131231280;
        iArr[7] = 2131231213;
        iArr[8] = 2131231056;
        if (this.m == null) {
            iArr[4] = 2131231232;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            ConfirmVisaAdapter$ViewHolder confirmVisaAdapter$ViewHolder = new ConfirmVisaAdapter$ViewHolder();
            confirmVisaAdapter$ViewHolder.a = iArr[i];
            confirmVisaAdapter$ViewHolder.d = getResources().getString(new int[]{2131822110, 2131822165, 2131821806, 2131821348, 2131821890, 2131822338, 2131822001, 2131822017, 2131821741}[i]);
            if (i == 8 && this.m == null) {
                confirmVisaAdapter$ViewHolder.c = false;
                confirmVisaAdapter$ViewHolder.a = 2131231162;
            }
            if (i == 4 && this.m == null) {
                confirmVisaAdapter$ViewHolder.c = false;
                confirmVisaAdapter$ViewHolder.a = 2131231232;
            }
            if (i == 5 && this.m == null) {
                confirmVisaAdapter$ViewHolder.c = false;
                confirmVisaAdapter$ViewHolder.a = 2131231276;
            }
            arrayList.add(confirmVisaAdapter$ViewHolder);
        }
        return arrayList;
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void B(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read
    public final void B_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.CheckVersionPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.CheckCutOffPresenter.read, com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", str);
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(l(), "MessageDialog");
    }

    @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
    public final void b(GetCustAcctListResponse getCustAcctListResponse) {
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read, com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read, com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b_(String str) {
        x();
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
    public final void c(GetCustAcctListResponse getCustAcctListResponse) {
        if (this.G.equals("tarikan")) {
            x();
            Intent intent = new Intent(this, TarikanTransaksiActivity.class);
            intent.putExtra("id_draft", false);
            intent.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            startActivity(intent);
        } else if (this.G.equals("bank_transfer")) {
            x();
            Intent intent2 = new Intent(this, ubahData.class);
            intent2.putExtra("id_draft", false);
            intent2.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            startActivity(intent2);
        } else if (this.G.equals("kirim_uang")) {
            x();
            Intent intent3 = new Intent(this, OutwardRemittanceFormActivity.class);
            intent3.putExtra("ListAcct", ListUtil.OneItemImmutableList.e(getCustAcctListResponse));
            startActivity(intent3);
        } else if (this.G.equals("kliring")) {
            this.s = getCustAcctListResponse;
            this.I.clear();
            this.E.clear();
            this.B.d(this.m, "Individu");
        }
    }

    @Override // com.bca.smartbranch.presenter.CheckVersionPresenter.RemoteActionCompatParcelizer
    public final void c(OpenCCSuccessActivity openCCSuccessActivity) {
        x();
        String str = openCCSuccessActivity.e;
        String str2 = openCCSuccessActivity.a;
        String str3 = openCCSuccessActivity.c;
        str.hashCode();
        if (str.equals("UF") || str.equals("UNF")) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_member", false);
            bundle.putString("upgrade_type", str);
            bundle.putString("upgrade_message", str2);
            bundle.putString("upgrade_url", str3);
            UpgradeAppDialog upgradeAppDialog = new UpgradeAppDialog();
            upgradeAppDialog.setArguments(bundle);
            upgradeAppDialog.show(l(), "UpgradeAppDialog");
        }
    }

    @OnClick({2131297795})
    public void chooseHapusDaftarTransfer(View view) {
        startActivityForResult(new Intent(this, DaftarTransferMenuActivity.class), 9898);
        this.drawerLayout.b(8388611);
    }

    @OnClick({2131297796})
    public void chooseHapusTransaksiBerkala(View view) {
        startActivityForResult(new Intent(this, HapusTransaksiBerkalaActivity.class), 9898);
        this.drawerLayout.b(8388611);
    }

    @OnClick({2131297797})
    public void chooseHome(View view) {
        this.drawerLayout.b(8388611, true);
    }

    @OnClick({2131299539})
    public void chooseProfile(View view) {
        if (this.m != null) {
            startActivityForResult(new Intent(this, ProfileActivity.class), 9898);
            this.drawerLayout.b(8388611);
            return;
        }
        new FiturSignUpDialog().show(l(), "FiturSignUpDialog");
    }

    @OnClick({2131298299})
    public void chooseReservasiCS() {
        if (this.m == null || !this.m.isMember()) {
            new FiturReservasiGuestDialog().show(l(), "FiturSignUpDialog");
        } else {
            startActivityForResult(new Intent(this, ReservasiCSOActivity.class), 0);
        }
    }

    @OnClick({2131298300})
    public void chooseReservasiTeller() {
        if (this.m == null || !this.m.isMember()) {
            new FiturReservasiGuestDialog().show(l(), "FiturSignUpDialog");
        } else {
            startActivityForResult(new Intent(this, ReservasiTellerOActivity.class), 0);
        }
    }

    @OnClick({2131297803})
    public void chooseSyaratKetentuan(View view) {
        startActivityForResult(new Intent(this, SyaratKetentuanActivity.class), 9898);
        this.drawerLayout.b(8388611);
    }

    @OnClick({2131297266})
    public void clickProfileVerify() {
    }

    @OnClick({2131297798})
    public void clickedKeluar(View view) {
        if (this.m != null) {
            new LogoutDialog().show(l(), "LogoutDialog");
        } else {
            onBackPressed();
        }
    }

    @OnClick({2131299258})
    public void clickedTvFinger(View view) {
        this.swFingerprint.performClick();
    }

    @OnClick({2131297791})
    public void clikedEmailHalloBCA(View view) {
        consumeDisplayCutout.read.e(this).d("message/rfc822").b("halobca@bca.co.id").c((CharSequence) "Send Email").b();
    }

    @OnClick({2131297804})
    public void clikedTeleponHalloBCA(View view) {
        new HaloBCADialog().show(l(), "HaloBCADialog");
    }

    @OnClick({2131297805})
    public void clikedTwitterHalloBCA(View view) {
        setAnnualFeeAddOnAmount setannualfeeaddonamount = new setAnnualFeeAddOnAmount(this, "@HaloBCA");
        setannualfeeaddonamount.a.startActivity(setannualfeeaddonamount.c());
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        Bitmap bitmap;
        d(bundle);
        App.d().d(this);
        b(this.toolbar);
        i().d("");
        GetCreditCardOptionsPresenter getCreditCardOptionsPresenter = new GetCreditCardOptionsPresenter();
        this.w = getCreditCardOptionsPresenter;
        getCreditCardOptionsPresenter.c = this;
        CheckVersionPresenter checkVersionPresenter = new CheckVersionPresenter();
        this.q = checkVersionPresenter;
        checkVersionPresenter.c = this;
        GetIdentityPresenter getIdentityPresenter = new GetIdentityPresenter();
        this.D = getIdentityPresenter;
        getIdentityPresenter.d = this;
        CheckCutOffPresenter checkCutOffPresenter = new CheckCutOffPresenter();
        this.n = checkCutOffPresenter;
        checkCutOffPresenter.b = this;
        GetCustDataPresenter getCustDataPresenter = new GetCustDataPresenter();
        this.y = getCustDataPresenter;
        getCustDataPresenter.d = this;
        GetCustAcctListPresenter getCustAcctListPresenter = new GetCustAcctListPresenter();
        this.u = getCustAcctListPresenter;
        getCustAcctListPresenter.e = this;
        KliringPresenter kliringPresenter = new KliringPresenter();
        this.B = kliringPresenter;
        kliringPresenter.d = this;
        DaftarTransferPresenter daftarTransferPresenter = new DaftarTransferPresenter();
        this.p = daftarTransferPresenter;
        daftarTransferPresenter.c = this;
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.x = getHBPresenter;
        getHBPresenter.e = this;
        this.z = new RootBeer(this);
        this.tvTitle.setText(this.labelHome);
        if (this.m == null || this.m.getAcctNo() == null || this.m.getAcctNo().isEmpty()) {
            this.H = "N";
        } else {
            this.H = "Y";
        }
        if (this.m != null) {
            if (this.m.getName().length() > 15) {
                TextView textView = this.tvUserName;
                StringBuilder sb = new StringBuilder();
                sb.append(this.m.getName().substring(0, 15));
                sb.append("... ");
                textView.setText(sb.toString());
            } else {
                TextView textView2 = this.tvUserName;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.m.getName());
                sb2.append(" ");
                textView2.setText(sb2.toString());
            }
            if ("Y".equalsIgnoreCase(this.m.getVerified())) {
                this.ivVerified.setVisibility(0);
            } else {
                this.ivVerified.setVisibility(8);
            }
            if (!this.m.getUserPhoto().isEmpty()) {
                Page6CSFragment page6CSFragment = this.ivUserPhoto;
                String userPhoto = this.m.getUserPhoto();
                if (!"".equalsIgnoreCase(userPhoto)) {
                    byte[] decode = Base64.decode(userPhoto.getBytes(), 2);
                    bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                } else {
                    bitmap = null;
                }
                page6CSFragment.setImageBitmap(bitmap);
            }
            this.navRingkasan.setVisibility(0);
            this.dvdRingkasan.setVisibility(0);
            this.navPengaturan.setVisibility(0);
            this.dvdPengaturan.setVisibility(0);
            this.navHapusDaftarTransfer.setVisibility(0);
            this.navHapusTransaksiBerkala.setVisibility(0);
        } else {
            this.tvUserName.setText("Guest");
            this.navRingkasan.setVisibility(8);
            this.dvdRingkasan.setVisibility(8);
            this.navPengaturan.setVisibility(8);
            this.dvdPengaturan.setVisibility(8);
            this.ivVerified.setVisibility(8);
        }
        Keep keep = new Keep(this, this.drawerLayout, this.toolbar, 2131820716, 2131820715);
        this.F = keep;
        if (keep.d) {
            keep.a(keep.c, 0);
            keep.d = false;
        }
        this.F.e(this.menuIndicator);
        this.F.b = new View.OnClickListener() { // from class: com.bca.smartbranch.activity.MainActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getResources getresources = MainActivity.this.drawerLayout;
                View d = getresources.d(8388611);
                if (d != null ? getresources.g(d) : false) {
                    MainActivity.this.drawerLayout.b(8388611, true);
                } else {
                    MainActivity.this.drawerLayout.a(8388611, true);
                }
            }
        };
        this.drawerLayout.setDrawerListener(this.F);
        this.F.a();
        this.swFingerprint.setChecked(this.sharedPreferences.getString("is_use_fingerprint", "").equals("Y"));
        this.swFingerprint.setOnCheckedChangeListener(this);
        tambahPemegangKartu tambahpemegangkartu = new tambahPemegangKartu(this);
        if (!(tambahpemegangkartu.b && tambahpemegangkartu.b() && tambahpemegangkartu.c()) || this.m == null || !this.m.isMember()) {
            this.navFingerprint.setVisibility(8);
            this.dvdFingerprint.setVisibility(8);
        } else {
            this.navFingerprint.setVisibility(0);
            this.dvdFingerprint.setVisibility(0);
        }
        this.rvMenu.setLayoutManager(new LinearLayoutManager(0, false));
        this.rvMenu.setAdapter(new MenuEbranchAdapter(this, v()));
        this.v = new getAnnualFeeBasicDisplayAmount();
        try {
            this.A = KeyStore.getInstance("AndroidKeyStore");
            this.C = Signature.getInstance("SHA256withECDSA");
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
        }
        TextView textView3 = this.tvVersi;
        StringBuilder sb3 = new StringBuilder("Versi ");
        sb3.append(getPromotion.b(this));
        textView3.setText(sb3.toString());
        this.z.isRootedWithBusyBoxCheck();
        if (this.m == null) {
            CheckVersionPresenter checkVersionPresenter2 = this.q;
            HapusTransaksiBerkalaActivity hapusTransaksiBerkalaActivity = new HapusTransaksiBerkalaActivity(getPromotion.c(), String.valueOf(getPromotion.b(this)));
            checkVersionPresenter2.c.g_();
            Call<OpenAccountSuccessActivity<OpenCCSuccessActivity>> a = checkVersionPresenter2.apiService.a(hapusTransaksiBerkalaActivity);
            checkVersionPresenter2.e = a;
            a.enqueue(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03e0: INVOKE  
                  (r0v91 'a' retrofit2.Call<o.OpenAccountSuccessActivity<o.OpenCCSuccessActivity>>)
                  (wrap: com.bca.smartbranch.presenter.CheckVersionPresenter$4 : 0x03dd: CONSTRUCTOR  (r1v63 com.bca.smartbranch.presenter.CheckVersionPresenter$4 A[REMOVE]) = (r0v85 'checkVersionPresenter2' com.bca.smartbranch.presenter.CheckVersionPresenter) call: com.bca.smartbranch.presenter.CheckVersionPresenter.4.<init>(com.bca.smartbranch.presenter.CheckVersionPresenter):void type: CONSTRUCTOR)
                 type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.MainActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/MainActivity.class
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.CheckVersionPresenter, state: GENERATED_AND_UNLOADED
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
                	... 21 more
                */
            /*
            // Method dump skipped, instructions count: 1047
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.MainActivity.d(android.os.Bundle):void");
        }

        @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write
        public final void d(CustDataResponse custDataResponse) {
            x();
            Intent intent = new Intent(this, FormBankNotesActivity.class);
            intent.putExtra("data_cust", ListUtil.OneItemImmutableList.e(custDataResponse));
            startActivity(intent);
        }

        @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
        public final void d(List<clikedKeyHilang> list) {
            x();
            this.t.clear();
            for (clikedKeyHilang clikedkeyhilang : list) {
                if (clikedkeyhilang.d.equals("Y")) {
                    this.t.add(Long.valueOf(clikedkeyhilang.e));
                }
            }
            Intent intent = new Intent(this, subscribeUbahVisaCardEvent.class);
            if (this.m.getVerified().equals("Y")) {
                Kliring kliring = new Kliring();
                String str = (this.m.getNoHandphone() == null || this.m.getNoHandphone().isEmpty()) ? "" : "62";
                kliring.setId(System.currentTimeMillis());
                kliring.setNamaPenerima(this.m.getName());
                kliring.setKodeNegara(str);
                kliring.setNomorHp(this.m.getNoHandphone());
                kliring.setTipeNasabah("Individu");
                kliring.setTipeNasabahId("0");
                intent.putExtra("list_acct", ListUtil.OneItemImmutableList.e(this.s));
                intent.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.I));
                intent.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.t));
                intent.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.E));
                intent.putExtra("Kliring_first_row", ListUtil.OneItemImmutableList.e(kliring));
                intent.putExtra("isAutoFill", true);
            } else {
                intent.putExtra("SUMBER_DANA", ListUtil.OneItemImmutableList.e(this.I));
                intent.putExtra("AVAILABLE_DATE", ListUtil.OneItemImmutableList.e(this.t));
                intent.putExtra("TUJUAN_TRANSAKSI", ListUtil.OneItemImmutableList.e(this.E));
            }
            startActivity(intent);
        }

        @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read
        public final void d(clikedKartuHilang clikedkartuhilang) {
            this.k.executeTransaction(new Realm.Transaction() { // from class: o.onUpdateProfileEvent
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    MainActivity.a(realm);
                }
            });
            x();
            Intent intent = new Intent(this, CC3ChooseBCACardActivity.class);
            intent.putExtra("LIST_CARD", ListUtil.OneItemImmutableList.e(clikedkartuhilang.a));
            startActivity(intent);
        }

        public final /* synthetic */ void e(Realm realm) {
            for (int i = 0; i < this.m.getCreditCards().size(); i++) {
                CreditCard creditCard = (CreditCard) realm.where(CreditCard.class).equalTo("id", this.m.getCreditCards().get(i).getId()).findFirst();
                if (creditCard != null) {
                    creditCard.deleteFromRealm();
                }
            }
        }

        @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        public final void e(String str) {
            x();
            ArrayList arrayList = new ArrayList();
            Intent intent = new Intent(this, FormTellerActivity.class);
            intent.putExtra("TellerType", "setoran");
            intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
            intent.putExtra("old_cust", this.H);
            startActivity(intent);
        }

        @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        public final void e(List<DaftarTransferResponse.DaftarTransferOutput> list) {
            x();
            ArrayList arrayList = new ArrayList();
            for (DaftarTransferResponse.DaftarTransferOutput daftarTransferOutput : list) {
                DaftarTransfer daftarTransfer = new DaftarTransfer();
                daftarTransfer.setAccountName(daftarTransferOutput.getAccountName());
                daftarTransfer.setAliasName(daftarTransferOutput.getAliasName());
                daftarTransfer.setAccountNumber(daftarTransferOutput.getAccountNumber());
                arrayList.add(daftarTransfer);
            }
            Intent intent = new Intent(this, FormTellerActivity.class);
            intent.putExtra("TellerType", "setoran");
            intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
            intent.putExtra("old_cust", this.H);
            startActivity(intent);
        }

        @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
        public final void e(List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list, List<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> list2) {
            this.I.add(list);
            this.E.add(list2);
            if (this.I.size() >= 2 || this.E.size() >= 2 || this.m.getVerified().equals("Y")) {
                this.B.a(this.m, DateTimeFormat.forPattern("yyyyMMdd").print(KliringPresenter.e(0).getTimeInMillis()), DateTimeFormat.forPattern("yyyyMMdd").print(KliringPresenter.e(14).getTimeInMillis()));
                return;
            }
            this.B.d(this.m, "Perusahaan");
        }

        @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        public final void e_(String str) {
            x();
            ArrayList arrayList = new ArrayList();
            Intent intent = new Intent(this, FormTellerActivity.class);
            intent.putExtra("TellerType", "setoran");
            intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
            intent.putExtra("old_cust", this.H);
            startActivity(intent);
        }

        @Override // com.bca.smartbranch.presenter.CheckCutOffPresenter.read
        public final void f(String str) {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
        }

        @Override // com.bca.smartbranch.presenter.CheckVersionPresenter.RemoteActionCompatParcelizer, com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read, com.bca.smartbranch.presenter.CheckCutOffPresenter.read, com.bca.smartbranch.presenter.GetCustDataPresenter.write, com.bca.smartbranch.presenter.GetCustAcctListPresenter.read, com.bca.smartbranch.presenter.CancelTundaPresenter.IconCompatParcelizer, com.bca.smartbranch.presenter.CancelReservationPresenter.write
        public final void g_() {
            z();
        }

        @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
        public final void g_(String str) {
            x();
            ArrayList arrayList = new ArrayList();
            Intent intent = new Intent(this, FormTellerActivity.class);
            intent.putExtra("TellerType", "setoran");
            intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
            intent.putExtra("old_cust", this.H);
            startActivity(intent);
        }

        @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write
        public final void i(String str) {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void isUseFingerprint(PilihSetoranActivity pilihSetoranActivity) {
            this.swFingerprint.setChecked(pilihSetoranActivity.b);
        }

        @Override // com.bca.smartbranch.presenter.CheckVersionPresenter.RemoteActionCompatParcelizer
        public final void j(String str) {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
        }

        @Override // com.bca.smartbranch.presenter.CheckVersionPresenter.RemoteActionCompatParcelizer
        public final void l(String str) {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
        }

        @Override // com.bca.smartbranch.presenter.CheckCutOffPresenter.read
        public final void m(String str) {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
        }

        @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write
        public final void n(String str) {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
        }

        @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
        public final void o(String str) {
            x();
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", str);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
        }

        @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity
        public void onActivityResult(int i, int i2, Intent intent) {
            getResources getresources;
            onActivityResult(i, i2, intent);
            if (i == 9898 && i2 == -1 && (getresources = this.drawerLayout) != null) {
                View d = getresources.d(8388611);
                if (d != null ? getresources.c(d) : false) {
                    this.drawerLayout.b(8388611, false);
                }
            }
        }

        @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
        public void onBackPressed() {
            startActivity(new Intent(this, LandingActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            setOnHierarchyChangeListener.d((Activity) this);
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z) {
                this.sharedPreferences.edit().putString("is_use_fingerprint", "N").commit();
                this.sharedPreferences.edit().putString("email_fingerprint", "").commit();
            } else if (Build.VERSION.SDK_INT < 23) {
                this.sharedPreferences.edit().putString("is_use_fingerprint", "N").commit();
                this.sharedPreferences.edit().putString("email_fingerprint", "").commit();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", "Device anda tidak mendukung untuk fitur fingerprint");
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(l(), "MessageDialog");
                this.swFingerprint.setChecked(false);
            } else if (getAnnualFeeBasicDisplayAmount.b(this.A, this.C)) {
                FingerprintDialog fingerprintDialog = new FingerprintDialog();
                Bundle bundle2 = new Bundle();
                fingerprintDialog.a = new FingerprintManager.CryptoObject(this.C);
                fingerprintDialog.setArguments(bundle2);
                fingerprintDialog.show(l(), "FingerprintDialog");
            } else {
                this.sharedPreferences.edit().putString("is_use_fingerprint", "N").commit();
                this.sharedPreferences.edit().putString("email_fingerprint", "").commit();
                Bundle bundle3 = new Bundle();
                bundle3.putString("MessageDialogContent", getResources().getString(2131821910));
                MessageDialog messageDialog2 = new MessageDialog();
                messageDialog2.setArguments(bundle3);
                messageDialog2.show(l(), "MessageDialog");
                this.swFingerprint.setChecked(false);
            }
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public void onChooseMenueBranchEvent(onChooseKotaRes onchoosekotares) {
            if (this.m != null) {
                GetHBPresenter getHBPresenter = this.x;
                Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
                getHBPresenter.b = e;
                e.enqueue(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003f: INVOKE  
                      (r0v127 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
                      (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x003c: CONSTRUCTOR  (r1v42 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v123 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
                     type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.MainActivity.onChooseMenueBranchEvent(o.onChooseKotaRes):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/MainActivity.class
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
                    	... 21 more
                    */
                /*
                // Method dump skipped, instructions count: 745
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.MainActivity.onChooseMenueBranchEvent(o.onChooseKotaRes):void");
            }

            @Override // android.app.Activity
            public boolean onCreateOptionsMenu(Menu menu) {
                return true;
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onCreditCardRedirect(TarikanUbahTransaksiActivity tarikanUbahTransaksiActivity) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://webform.bca.co.id/applycc/#/?campaign_id=IPEBR"));
                startActivity(intent);
            }

            @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
            public void onDestroy() {
                onDestroy();
                CheckVersionPresenter checkVersionPresenter = this.q;
                Call<OpenAccountSuccessActivity<OpenCCSuccessActivity>> call = checkVersionPresenter.e;
                if (call != null) {
                    call.cancel();
                }
                checkVersionPresenter.c = null;
                GetIdentityPresenter getIdentityPresenter = this.D;
                Call<OpenAccountSuccessActivity<Object>> call2 = getIdentityPresenter.e;
                if (call2 != null) {
                    call2.cancel();
                }
                getIdentityPresenter.d = null;
                GetCreditCardOptionsPresenter getCreditCardOptionsPresenter = this.w;
                Call<OpenAccountSuccessActivity<clikedKartuHilang>> call3 = getCreditCardOptionsPresenter.a;
                if (call3 != null) {
                    call3.cancel();
                }
                getCreditCardOptionsPresenter.c = null;
                CheckCutOffPresenter checkCutOffPresenter = this.n;
                Call<OpenAccountSuccessActivity> call4 = checkCutOffPresenter.d;
                if (call4 != null) {
                    call4.cancel();
                }
                checkCutOffPresenter.b = null;
                GetCustDataPresenter getCustDataPresenter = this.y;
                Call<OpenAccountSuccessActivity<CustDataResponse>> call5 = getCustDataPresenter.b;
                if (call5 != null) {
                    call5.cancel();
                }
                getCustDataPresenter.d = null;
                GetCustAcctListPresenter getCustAcctListPresenter = this.u;
                Call<OpenAccountSuccessActivity<GetCustAcctListResponse>> call6 = getCustAcctListPresenter.b;
                if (call6 != null) {
                    call6.cancel();
                }
                getCustAcctListPresenter.e = null;
                this.B.b();
                DaftarTransferPresenter daftarTransferPresenter = this.p;
                Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call7 = daftarTransferPresenter.a;
                if (call7 != null) {
                    call7.cancel();
                }
                daftarTransferPresenter.c = null;
                GetHBPresenter getHBPresenter = this.x;
                Call<OpenAccountSuccessActivity<Object>> call8 = getHBPresenter.b;
                if (call8 != null) {
                    call8.cancel();
                }
                getHBPresenter.e = null;
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void onLoginFingerprintEvent(sumberDanaEvent sumberdanaevent) {
                this.sharedPreferences.edit().putString("is_use_fingerprint", "Y").commit();
                this.sharedPreferences.edit().putString("email_fingerprint", this.m.getEmail()).commit();
                new FingerprintSuccessDialog().show(l(), "FingerprintSuccessDialog");
            }

            @Override // android.app.Activity
            public boolean onOptionsItemSelected(MenuItem menuItem) {
                return onOptionsItemSelected(menuItem);
            }

            @Override // android.view.Window.Callback
            public void onPointerCaptureChanged(boolean z) {
                onPointerCaptureChanged(z);
            }

            @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
            public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                onRequestPermissionsResult(i, strArr, iArr);
                chooseHome.b(this, i, iArr);
            }

            @Stetho$Initializer$RealSocketHandlerFactory(e = ThreadMode.MAIN)
            public void onUpdateProfileEvent(VersiActivity_ViewBinding versiActivity_ViewBinding) {
                Bitmap bitmap;
                if (this.m.getName().length() > 15) {
                    TextView textView = this.tvUserName;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.m.getName().substring(0, 15));
                    sb.append("... ");
                    textView.setText(sb.toString());
                } else {
                    TextView textView2 = this.tvUserName;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.m.getName());
                    sb2.append(" ");
                    textView2.setText(sb2.toString());
                }
                if (!this.m.getUserPhoto().isEmpty()) {
                    Page6CSFragment page6CSFragment = this.ivUserPhoto;
                    String userPhoto = this.m.getUserPhoto();
                    if (!"".equalsIgnoreCase(userPhoto)) {
                        byte[] decode = Base64.decode(userPhoto.getBytes(), 2);
                        bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    } else {
                        bitmap = null;
                    }
                    page6CSFragment.setImageBitmap(bitmap);
                } else {
                    this.ivUserPhoto.setImageResource(2131231178);
                }
                if ("Y".equalsIgnoreCase(this.m.getVerified())) {
                    this.ivVerified.setVisibility(0);
                } else {
                    this.ivVerified.setVisibility(8);
                }
            }

            @OnClick({2131297802})
            public void openRingkasanActivity(View view) {
                startActivityForResult(new Intent(this, TransactionActivity.class), 9898);
                this.drawerLayout.b(8388611);
            }

            @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
            protected final void p() {
                setCardSlogan.e().b = "MainActivity";
                this.j = "MainActivity";
            }

            @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
            protected final int q() {
                return 2131492966;
            }

            @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
            protected final Activity r() {
                return this;
            }

            @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
            public final void r(String str) {
                x();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(l(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read
            public final void r_(String str) {
                x();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(l(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
            public final void s() {
                z();
            }

            @Override // com.bca.smartbranch.presenter.KliringPresenter.RemoteActionCompatParcelizer
            public final void s(String str) {
                x();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(l(), "MessageDialog");
            }

            @Override // com.bca.smartbranch.presenter.GetCreditCardOptionsPresenter.read
            public final void s_(String str) {
                x();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(l(), "MessageDialog");
            }

            @OnClick({2131297793})
            public void showSubHalloBCA(View view) {
                setMessage setmessage = new setMessage();
                if (this.navSubHelloBCA.getVisibility() == 8) {
                    ImageView imageView = this.ivArrowHubungi;
                    setmessage.c = new RotateAnimation(0.0f, 90.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                    setmessage.c(this.navSubHelloBCA);
                    return;
                }
                ImageView imageView2 = this.ivArrowHubungi;
                setmessage.c = new RotateAnimation(90.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView2);
                LinearLayout linearLayout = this.navSubHelloBCA;
                setmessage.a = linearLayout.getMeasuredHeight();
                setmessage.b = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                      (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v6 o.setMessage$1 A[REMOVE]) = (r0v0 'setmessage' o.setMessage), (r0v9 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                      (r0v0 'setmessage' o.setMessage)
                     o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.activity.MainActivity.showSubHalloBCA(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/MainActivity.class
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
                    o.setMessage r0 = new o.setMessage
                    r1 = r0
                    r1.<init>()
                    r11 = r0
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.navSubHelloBCA
                    int r0 = r0.getVisibility()
                    r1 = 8
                    if (r0 != r1) goto L_0x003e
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivArrowHubungi
                    r12 = r0
                    r0 = r11
                    android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                    r2 = r1
                    r3 = 0
                    r4 = 1119092736(0x42b40000, float:90.0)
                    r5 = 1
                    r6 = 1056964608(0x3f000000, float:0.5)
                    r7 = 1
                    r8 = 1056964608(0x3f000000, float:0.5)
                    r2.<init>(r3, r4, r5, r6, r7, r8)
                    r0.c = r1
                    r0 = r11
                    r1 = r12
                    r0.e(r1)
                    r0 = r11
                    r1 = r10
                    android.widget.LinearLayout r1 = r1.navSubHelloBCA
                    r0.c(r1)
                    return
                L_0x003e:
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivArrowHubungi
                    r12 = r0
                    r0 = r11
                    android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                    r2 = r1
                    r3 = 1119092736(0x42b40000, float:90.0)
                    r4 = 0
                    r5 = 1
                    r6 = 1056964608(0x3f000000, float:0.5)
                    r7 = 1
                    r8 = 1056964608(0x3f000000, float:0.5)
                    r2.<init>(r3, r4, r5, r6, r7, r8)
                    r0.c = r1
                    r0 = r11
                    r1 = r12
                    r0.e(r1)
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.navSubHelloBCA
                    r12 = r0
                    r0 = r11
                    r1 = r12
                    int r1 = r1.getMeasuredHeight()
                    r0.a = r1
                    r0 = r11
                    o.setMessage$1 r1 = new o.setMessage$1
                    r2 = r1
                    r3 = r11
                    r4 = r12
                    r2.<init>(r4)
                    r0.b = r1
                    r0 = r11
                    r1 = r12
                    r0.b(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.MainActivity.showSubHalloBCA(android.view.View):void");
            }

            @OnClick({2131297799})
            public void showSubPengaturan(View view) {
                setMessage setmessage = new setMessage();
                if (this.navSubPengaturan.getVisibility() == 8) {
                    ImageView imageView = this.ivArrowPengaturan;
                    setmessage.c = new RotateAnimation(0.0f, 90.0f, 1, 0.5f, 1, 0.5f);
                    setmessage.e(imageView);
                    setmessage.c(this.navSubPengaturan);
                    return;
                }
                ImageView imageView2 = this.ivArrowPengaturan;
                setmessage.c = new RotateAnimation(90.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(imageView2);
                LinearLayout linearLayout = this.navSubPengaturan;
                setmessage.a = linearLayout.getMeasuredHeight();
                setmessage.b = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: IPUT  
                      (wrap: o.setMessage$1 : 0x0073: CONSTRUCTOR  (r1v6 o.setMessage$1 A[REMOVE]) = (r0v0 'setmessage' o.setMessage), (r0v9 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                      (r0v0 'setmessage' o.setMessage)
                     o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.activity.MainActivity.showSubPengaturan(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/MainActivity.class
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
                    o.setMessage r0 = new o.setMessage
                    r1 = r0
                    r1.<init>()
                    r11 = r0
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.navSubPengaturan
                    int r0 = r0.getVisibility()
                    r1 = 8
                    if (r0 != r1) goto L_0x003e
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivArrowPengaturan
                    r12 = r0
                    r0 = r11
                    android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                    r2 = r1
                    r3 = 0
                    r4 = 1119092736(0x42b40000, float:90.0)
                    r5 = 1
                    r6 = 1056964608(0x3f000000, float:0.5)
                    r7 = 1
                    r8 = 1056964608(0x3f000000, float:0.5)
                    r2.<init>(r3, r4, r5, r6, r7, r8)
                    r0.c = r1
                    r0 = r11
                    r1 = r12
                    r0.e(r1)
                    r0 = r11
                    r1 = r10
                    android.widget.LinearLayout r1 = r1.navSubPengaturan
                    r0.c(r1)
                    return
                L_0x003e:
                    r0 = r10
                    android.widget.ImageView r0 = r0.ivArrowPengaturan
                    r12 = r0
                    r0 = r11
                    android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
                    r2 = r1
                    r3 = 1119092736(0x42b40000, float:90.0)
                    r4 = 0
                    r5 = 1
                    r6 = 1056964608(0x3f000000, float:0.5)
                    r7 = 1
                    r8 = 1056964608(0x3f000000, float:0.5)
                    r2.<init>(r3, r4, r5, r6, r7, r8)
                    r0.c = r1
                    r0 = r11
                    r1 = r12
                    r0.e(r1)
                    r0 = r10
                    android.widget.LinearLayout r0 = r0.navSubPengaturan
                    r12 = r0
                    r0 = r11
                    r1 = r12
                    int r1 = r1.getMeasuredHeight()
                    r0.a = r1
                    r0 = r11
                    o.setMessage$1 r1 = new o.setMessage$1
                    r2 = r1
                    r3 = r11
                    r4 = r12
                    r2.<init>(r4)
                    r0.b = r1
                    r0 = r11
                    r1 = r12
                    r0.b(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.MainActivity.showSubPengaturan(android.view.View):void");
            }

            @Stetho$Initializer$RealSocketHandlerFactory
            public void subscribeLogoutEvent(subsriberChooseValueSetiapTanggalEvent subsriberchoosevaluesetiaptanggalevent) {
                if (this.m != null) {
                    this.apiService.c(new signUp(this.m.getSessionId())).enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.activity.MainActivity.3
                        public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                        }

                        public final void onResponse(Call<OpenAccountSuccessActivity<Object>> call, Response<OpenAccountSuccessActivity<Object>> response) {
                        }
                    });
                }
                this.editor.putString("email", "");
                this.editor.commit();
                startActivity(new Intent(this, LandingActivity.class));
                overridePendingTransition(2130772009, 2130772012);
                finish();
            }

            @Override // com.bca.smartbranch.presenter.CheckCutOffPresenter.read
            public final void t() {
                if (this.m == null || !this.m.getVerified().equals("Y")) {
                    x();
                    startActivity(new Intent(this, FormBankNotesActivity.class));
                    return;
                }
                fillForm fillform = new fillForm();
                fillform.e = "";
                fillform.c = this.m.getEmail();
                fillform.a = this.m.getImei();
                fillform.b = this.m.getSessionId();
                this.y.e(fillform);
            }

            @Override // com.bca.smartbranch.presenter.GetCustDataPresenter.write
            public final void u() {
            }

            @Override // com.bca.smartbranch.presenter.GetCustAcctListPresenter.read
            public final void v(String str) {
                x();
                Bundle bundle = new Bundle();
                bundle.putString("MessageDialogContent", str);
                MessageDialog messageDialog = new MessageDialog();
                messageDialog.setArguments(bundle);
                messageDialog.show(l(), "MessageDialog");
            }
        }
