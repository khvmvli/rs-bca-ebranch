package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.App;
import com.bca.smartbranch.adapter.TransaksiBerkalaAdapter;
import com.bca.smartbranch.dialog.AutoLogoutDialog;
import com.bca.smartbranch.dialog.FingerprintDialog;
import com.bca.smartbranch.dialog.FingerprintSuccessDialog;
import com.bca.smartbranch.dialog.FiturSignUpDialog;
import com.bca.smartbranch.dialog.HaloBCADialog;
import com.bca.smartbranch.dialog.LogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter;
import com.bca.smartbranch.presenter.GetIdentityPresenter;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import o.HapusTransaksiBerkalaDialog_ViewBinding;
import o.InfoPromoORActivity;
import o.Keep;
import o.OpenAccountSuccessActivity;
import o.OutwardRemittanceMenuActivity;
import o.Page6CSFragment;
import o.PilihSetoranActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.VersiActivity_ViewBinding;
import o.consumeDisplayCutout;
import o.getAnnualFeeBasicDisplayAmount;
import o.getIncomeDisplayAmount;
import o.getPromotion;
import o.getResources;
import o.onClickNegara;
import o.setAnnualFeeAddOnAmount;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setIncomeDisplayAmount;
import o.setInputType;
import o.setMessage;
import o.setOnHierarchyChangeListener;
import o.setSelected;
import o.signUp;
import o.subsriberChooseValueSetiapTanggalEvent;
import o.sumberDanaEvent;
import o.tambahPemegangKartu;
import org.greenrobot.eventbus.ThreadMode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/HapusTransaksiBerkalaActivity.class */
public class HapusTransaksiBerkalaActivity extends BaseActivityPostLogin implements DaftarTransferBerkalaPresenter.IconCompatParcelizer, GetIdentityPresenter.write, CompoundButton.OnCheckedChangeListener {
    @onClickNegara
    setIncomeDisplayAmount apiService;
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
    private TransaksiBerkalaAdapter f;
    @BindString(2131821702)
    String hapusTransaksiBerkalaBerhasil;
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
    @BindView(2131297634)
    LinearLayout llEmpty;
    @BindView(2131297969)
    LinearLayout lnMain;
    @BindDrawable(2131231154)
    Drawable menuIndicator;
    private DaftarTransferBerkalaPresenter n;
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
    private getAnnualFeeBasicDisplayAmount p;
    private Keep q;
    private Signature r;
    @BindString(2131822092)
    String retry;
    @BindView(2131298325)
    getIncomeDisplayAmount rvHapusTransaksiBerkala;
    private KeyStore s;
    @BindView(2131298421)
    setSelected swFingerprint;
    private GetIdentityPresenter t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822208)
    String toolbarTitleHapusTransaksiBerkala;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299690)
    TextView tvTransaksiEmpty;
    @BindView(2131299730)
    TextView tvUserName;
    @BindView(2131299735)
    TextView tvVersi;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    @BindString(2131822339)
    String verifMessage;
    private List<OutwardRemittanceMenuActivity.IconCompatParcelizer> w = new ArrayList();
    private ViewAnimator x;

    @Override // com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter.IconCompatParcelizer
    public final void a(String str) {
        x();
        setResult(0);
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter.IconCompatParcelizer
    public final void a(List<OutwardRemittanceMenuActivity.IconCompatParcelizer> list) {
        this.x.setDisplayedChild(0);
        this.w = list;
        TransaksiBerkalaAdapter transaksiBerkalaAdapter = this.f;
        transaksiBerkalaAdapter.b = list;
        transaksiBerkalaAdapter.a.b();
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter.IconCompatParcelizer
    public final void b(String str) {
        this.x.setDisplayedChild(1);
        this.tvErrorMessage.setText(str);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter.IconCompatParcelizer
    public final void c(String str) {
        x();
        setResult(0);
        Bundle bundle = new Bundle();
        bundle.putString("imei", this.m.getImei());
        bundle.putString("email", this.m.getEmail());
        bundle.putString("message", str);
        bundle.putBoolean("is_multiple_login", true);
        AutoLogoutDialog autoLogoutDialog = new AutoLogoutDialog();
        autoLogoutDialog.setArguments(bundle);
        autoLogoutDialog.show(l(), "AutoLogoutDialog");
    }

    @OnClick({2131297795})
    public void chooseHapusDaftarTransfer(View view) {
        startActivityForResult(new Intent(this, DaftarTransferMenuActivity.class), 9898);
        finish();
    }

    @OnClick({2131297796})
    public void chooseHapusTransaksiBerkala(View view) {
        this.drawerLayout.b(8388611, true);
    }

    @OnClick({2131297797})
    public void chooseHome(View view) {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
    }

    @OnClick({2131299539})
    public void chooseProfile(View view) {
        if (this.m != null) {
            startActivityForResult(new Intent(this, ProfileActivity.class), 9898);
            finish();
            return;
        }
        new FiturSignUpDialog().show(l(), "FiturSignUpDialog");
    }

    @OnClick({2131297803})
    public void chooseSyaratKetentuan(View view) {
        startActivityForResult(new Intent(this, SyaratKetentuanActivity.class), 9898);
        finish();
    }

    @OnClick({2131297266})
    public void clickProfileVerify() {
    }

    @OnClick({2131297798})
    public void clickedKeluar(View view) {
        if (this.m != null) {
            new LogoutDialog().show(l(), "LogoutDialog");
            return;
        }
        setResult(0);
        startActivity(new Intent(this, LandingActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        setOnHierarchyChangeListener.d((Activity) this);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        Bitmap bitmap;
        d(bundle);
        this.x = (ViewAnimator) findViewById(2131299749);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(this.toolbarTitleHapusTransaksiBerkala);
        App.d().c(this);
        GetIdentityPresenter getIdentityPresenter = new GetIdentityPresenter();
        this.t = getIdentityPresenter;
        getIdentityPresenter.d = this;
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
        this.q = keep;
        if (keep.d) {
            keep.a(keep.c, 0);
            keep.d = false;
        }
        this.q.e(this.menuIndicator);
        this.q.b = new View.OnClickListener() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getResources getresources = HapusTransaksiBerkalaActivity.this.drawerLayout;
                View d = getresources.d(8388611);
                if (d != null ? getresources.g(d) : false) {
                    HapusTransaksiBerkalaActivity.this.drawerLayout.b(8388611, true);
                } else {
                    HapusTransaksiBerkalaActivity.this.drawerLayout.a(8388611, true);
                }
            }
        };
        this.drawerLayout.setDrawerListener(this.q);
        this.q.a();
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
        this.p = new getAnnualFeeBasicDisplayAmount();
        try {
            this.s = KeyStore.getInstance("AndroidKeyStore");
            this.r = Signature.getInstance("SHA256withECDSA");
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
        }
        TextView textView3 = this.tvVersi;
        StringBuilder sb3 = new StringBuilder("Versi ");
        sb3.append(getPromotion.b(this));
        textView3.setText(sb3.toString());
        setResult(-1);
        DaftarTransferBerkalaPresenter daftarTransferBerkalaPresenter = new DaftarTransferBerkalaPresenter();
        this.n = daftarTransferBerkalaPresenter;
        daftarTransferBerkalaPresenter.e = this;
        this.f = new TransaksiBerkalaAdapter(this, this.w);
        this.rvHapusTransaksiBerkala.setLayoutManager(new LinearLayoutManager(1, false));
        this.tvTransaksiEmpty.setText("Transaksi Berkala");
        this.rvHapusTransaksiBerkala.setEmptyView(this.llEmpty);
        this.rvHapusTransaksiBerkala.setAdapter(this.f);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter.IconCompatParcelizer
    public final void d(String str) {
        this.x.setDisplayedChild(1);
        this.tvErrorMessage.setText(str);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter.IconCompatParcelizer
    public final void e(String str) {
        this.x.setDisplayedChild(1);
        this.tvErrorMessage.setText(str);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void isUseFingerprint(PilihSetoranActivity pilihSetoranActivity) {
        this.swFingerprint.setChecked(pilihSetoranActivity.b);
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        getResources getresources;
        if (i == 9898 && i2 == -1 && (getresources = this.drawerLayout) != null) {
            View d = getresources.d(8388611);
            if (d != null ? getresources.c(d) : false) {
                this.drawerLayout.b(8388611, false);
            }
        }
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return;
        }
        onBackPressed();
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
        } else if (getAnnualFeeBasicDisplayAmount.b(this.s, this.r)) {
            FingerprintDialog fingerprintDialog = new FingerprintDialog();
            Bundle bundle2 = new Bundle();
            fingerprintDialog.a = new FingerprintManager.CryptoObject(this.r);
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

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        DaftarTransferBerkalaPresenter daftarTransferBerkalaPresenter = this.n;
        Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity>> call = daftarTransferBerkalaPresenter.a;
        if (call != null) {
            call.cancel();
        }
        daftarTransferBerkalaPresenter.e = null;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onLoginFingerprintEvent(sumberDanaEvent sumberdanaevent) {
        this.sharedPreferences.edit().putString("is_use_fingerprint", "Y").commit();
        this.sharedPreferences.edit().putString("email_fingerprint", this.m.getEmail()).commit();
        new FingerprintSuccessDialog().show(l(), "FingerprintSuccessDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.getView, android.app.Activity
    public void onResume() {
        onResume();
        InfoPromoORActivity infoPromoORActivity = new InfoPromoORActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Setoran Tunai");
        DaftarTransferBerkalaPresenter daftarTransferBerkalaPresenter = this.n;
        daftarTransferBerkalaPresenter.e.s();
        Call<OpenAccountSuccessActivity<OutwardRemittanceMenuActivity>> e = daftarTransferBerkalaPresenter.apiService.e(infoPromoORActivity);
        daftarTransferBerkalaPresenter.a = e;
        e.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004b: INVOKE  
              (r0v8 'e' retrofit2.Call<o.OpenAccountSuccessActivity<o.OutwardRemittanceMenuActivity>>)
              (wrap: com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter$4 : 0x0048: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter$4 A[REMOVE]) = (r0v3 'daftarTransferBerkalaPresenter' com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter) call: com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter.4.<init>(com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity.onResume():void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/HapusTransaksiBerkalaActivity.class
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter, state: GENERATED_AND_UNLOADED
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
            r0 = r7
            r0.onResume()
            o.InfoPromoORActivity r0 = new o.InfoPromoORActivity
            r1 = r0
            r2 = r7
            com.bca.smartbranch.data.localdb.User r2 = r2.m
            java.lang.String r2 = r2.getEmail()
            r3 = r7
            com.bca.smartbranch.data.localdb.User r3 = r3.m
            java.lang.String r3 = r3.getSessionId()
            r4 = r7
            com.bca.smartbranch.data.localdb.User r4 = r4.m
            java.lang.String r4 = r4.getImei()
            java.lang.String r5 = "Setoran Tunai"
            r1.<init>(r2, r3, r4, r5)
            r8 = r0
            r0 = r7
            com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter r0 = r0.n
            r9 = r0
            r0 = r9
            com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter$IconCompatParcelizer r0 = r0.e
            r0.s()
            r0 = r9
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r8
            retrofit2.Call r0 = r0.e(r1)
            r8 = r0
            r0 = r9
            r1 = r8
            r0.a = r1
            r0 = r8
            com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter$4 r1 = new com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter$4
            r2 = r1
            r3 = r9
            r2.<init>()
            r0.enqueue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity.onResume():void");
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
        finish();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "HapusTransaksiBerkalaActivity";
        this.j = "HapusTransaksiBerkalaActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492958;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferBerkalaPresenter.IconCompatParcelizer
    public final void s() {
        this.x.setDisplayedChild(2);
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
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity.showSubHalloBCA(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/HapusTransaksiBerkalaActivity.class
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity.showSubHalloBCA(android.view.View):void");
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
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity.showSubPengaturan(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/HapusTransaksiBerkalaActivity.class
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity.showSubPengaturan(android.view.View):void");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeLogoutEvent(subsriberChooseValueSetiapTanggalEvent subsriberchoosevaluesetiaptanggalevent) {
        if (this.m != null) {
            this.apiService.c(new signUp(this.m.getSessionId())).enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.activity.HapusTransaksiBerkalaActivity.5
                public final void onFailure(Call<OpenAccountSuccessActivity<Object>> call, Throwable th) {
                }

                public final void onResponse(Call<OpenAccountSuccessActivity<Object>> call, Response<OpenAccountSuccessActivity<Object>> response) {
                }
            });
        }
        this.editor.putString("email", "");
        this.editor.commit();
        setResult(0);
        Intent intent = new Intent(this, LandingActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
        overridePendingTransition(2130772009, 2130772012);
    }
}
