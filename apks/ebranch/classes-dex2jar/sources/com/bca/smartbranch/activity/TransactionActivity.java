package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.Base64;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.App;
import com.bca.smartbranch.data.global.TransaksiTunda;
import com.bca.smartbranch.dialog.FingerprintDialog;
import com.bca.smartbranch.dialog.FiturSignUpDialog;
import com.bca.smartbranch.dialog.HaloBCADialog;
import com.bca.smartbranch.dialog.LogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.fragment.TransaksiBerhasilFragment;
import com.bca.smartbranch.fragment.TransaksiTundaFragment;
import com.bca.smartbranch.presenter.GetIdentityPresenter;
import com.bca.smartbranch.presenter.TransactionCountPresenter;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import o.BahasaLayananAdapter$BahasaLayananVH;
import o.HapusTransaksiBerkalaDialog_ViewBinding;
import o.Keep;
import o.KeluarFormReservationDialog_ViewBinding;
import o.KetentuanORDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Page6CSFragment;
import o.PilihSetoranActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.consumeDisplayCutout;
import o.getAnnualFeeBasicDisplayAmount;
import o.getPromotion;
import o.getResources;
import o.getUserVisibleHint;
import o.onClickNegara;
import o.onTakePicture;
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
import o.tambahPemegangKartu;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/TransactionActivity.class */
public class TransactionActivity extends BaseActivityPostLogin implements CompoundButton.OnCheckedChangeListener, GetIdentityPresenter.write, TransactionCountPresenter.read {
    @onClickNegara
    public setIncomeDisplayAmount apiService;
    @BindDrawable(2131231312)
    Drawable btnBurger;
    @BindView(2131296799)
    CoordinatorLayout clMain;
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
    @BindView(2131297307)
    ImageView ivArrowHubungi;
    @BindView(2131297310)
    ImageView ivArrowPengaturan;
    @BindView(2131297422)
    Page6CSFragment ivUserPhoto;
    @BindView(2131297423)
    ImageView ivVerified;
    @BindView(2131297766)
    LinearLayout llMain;
    @BindDrawable(2131231154)
    Drawable menuIndicator;
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
    private KeyStore p;
    private GetIdentityPresenter r;
    @BindString(2131822092)
    String retry;
    private getAnnualFeeBasicDisplayAmount s;
    @BindView(2131298421)
    setSelected swFingerprint;
    @BindView(2131298425)
    KetentuanORDialog_ViewBinding tabRingkasan;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822262)
    String toolbarTitle;
    @BindView(2131298884)
    TextView tvCount;
    @BindView(2131299730)
    TextView tvUserName;
    @BindView(2131299735)
    TextView tvVersi;
    @BindString(2131822256)
    String txtTitle;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private Keep u;
    private Signature v;
    @BindString(2131822339)
    String verifMessage;
    private TransactionCountPresenter x;
    public List<TransaksiTunda> q = new ArrayList();
    public int n = 0;
    public List<onTakePicture.write> t = new ArrayList();
    public int f = 0;

    @OnClick({2131297795})
    public void chooseHapusDaftarTransfer(View view) {
        startActivityForResult(new Intent(this, DaftarTransferMenuActivity.class), 9898);
        finish();
    }

    @OnClick({2131297796})
    public void chooseHapusTransaksiBerkala(View view) {
        startActivityForResult(new Intent(this, HapusTransaksiBerkalaActivity.class), 9898);
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

    public final void d(int i) {
        if (i > 0) {
            this.tvCount.setVisibility(0);
            TextView textView = this.tvCount;
            StringBuilder sb = new StringBuilder("");
            sb.append(i);
            textView.setText(sb.toString());
            return;
        }
        this.tvCount.setVisibility(8);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        App.d().e(this);
        TransactionCountPresenter transactionCountPresenter = new TransactionCountPresenter();
        this.x = transactionCountPresenter;
        transactionCountPresenter.b = this;
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(Html.fromHtml(this.toolbarTitle));
        GetIdentityPresenter getIdentityPresenter = new GetIdentityPresenter();
        this.r = getIdentityPresenter;
        getIdentityPresenter.d = this;
        Bundle extras = getIntent().getExtras();
        Bitmap bitmap = null;
        if (extras != null && extras.getBoolean("is_update", false)) {
            KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, "Data berhasil diubah", -1).g();
        }
        this.s = new getAnnualFeeBasicDisplayAmount();
        try {
            this.p = KeyStore.getInstance("AndroidKeyStore");
            this.v = Signature.getInstance("SHA256withECDSA");
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
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
                }
                page6CSFragment.setImageBitmap(bitmap);
            }
            this.navRingkasan.setVisibility(0);
            this.dvdRingkasan.setVisibility(0);
            this.navHapusDaftarTransfer.setVisibility(0);
            this.dvdHapusDaftarTransfer.setVisibility(0);
            this.navHapusTransaksiBerkala.setVisibility(0);
        } else {
            this.tvUserName.setText("Guest");
            this.navRingkasan.setVisibility(8);
            this.dvdRingkasan.setVisibility(8);
            this.navHapusDaftarTransfer.setVisibility(8);
            this.dvdHapusDaftarTransfer.setVisibility(8);
            this.ivVerified.setVisibility(8);
        }
        Keep keep = new Keep(this, this.drawerLayout, this.toolbar, 2131820716, 2131820715);
        this.u = keep;
        if (keep.d) {
            keep.a(keep.c, 0);
            keep.d = false;
        }
        this.u.e(this.menuIndicator);
        this.u.b = new View.OnClickListener() { // from class: com.bca.smartbranch.activity.TransactionActivity.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getResources getresources = TransactionActivity.this.drawerLayout;
                View d = getresources.d(8388611);
                if (d != null ? getresources.g(d) : false) {
                    TransactionActivity.this.drawerLayout.b(8388611, true);
                } else {
                    TransactionActivity.this.drawerLayout.a(8388611, true);
                }
            }
        };
        this.drawerLayout.setDrawerListener(this.u);
        this.u.a();
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
        KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding = this.tabRingkasan;
        ketentuanORDialog_ViewBinding.b(ketentuanORDialog_ViewBinding.a().a("Transaksi Tertunda"), ketentuanORDialog_ViewBinding.z.isEmpty());
        KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding2 = this.tabRingkasan;
        ketentuanORDialog_ViewBinding2.b(ketentuanORDialog_ViewBinding2.a().a("Bukti Transaksi"), ketentuanORDialog_ViewBinding2.z.isEmpty());
        KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding3 = this.tabRingkasan;
        AnonymousClass2 r0 = new KetentuanORDialog_ViewBinding.write() { // from class: com.bca.smartbranch.activity.TransactionActivity.2
            public final void b(KetentuanORDialog_ViewBinding.MediaBrowserCompat.ItemReceiver itemReceiver) {
                if (itemReceiver.i == 0) {
                    getUserVisibleHint getuservisiblehint = new getUserVisibleHint(TransactionActivity.this.l());
                    getuservisiblehint.d(2131297250, new TransaksiTundaFragment(), "TransaksiTundaFragment", 2);
                    getuservisiblehint.b();
                } else if (itemReceiver.i == 1) {
                    getUserVisibleHint getuservisiblehint2 = new getUserVisibleHint(TransactionActivity.this.l());
                    getuservisiblehint2.d(2131297250, new TransaksiBerhasilFragment(), "TransaksiBerhasilFragment", 2);
                    getuservisiblehint2.b();
                }
            }
        };
        if (!ketentuanORDialog_ViewBinding3.d.contains(r0)) {
            ketentuanORDialog_ViewBinding3.d.add(r0);
        }
        TextView textView3 = this.tvVersi;
        StringBuilder sb3 = new StringBuilder("Versi ");
        sb3.append(getPromotion.b(this));
        textView3.setText(sb3.toString());
        setResult(-1);
        this.sharedPreferences.edit().putBoolean("from_info_product", false).commit();
        if (extras == null || !extras.getBoolean("expired", false)) {
            getUserVisibleHint getuservisiblehint = new getUserVisibleHint(l());
            getuservisiblehint.d(2131297250, new TransaksiTundaFragment(), "TransaksiTundaFragment", 2);
            getuservisiblehint.b();
            return;
        }
        this.t.clear();
        this.q.clear();
        KetentuanORDialog_ViewBinding.MediaBrowserCompat.ItemReceiver c = this.tabRingkasan.c(1);
        KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding4 = c.h;
        if (ketentuanORDialog_ViewBinding4 != null) {
            ketentuanORDialog_ViewBinding4.a(c, true);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
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
        } else if (getAnnualFeeBasicDisplayAmount.b(this.p, this.v)) {
            FingerprintDialog fingerprintDialog = new FingerprintDialog();
            Bundle bundle2 = new Bundle();
            fingerprintDialog.a = new FingerprintManager.CryptoObject(this.v);
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
        GetIdentityPresenter getIdentityPresenter = this.r;
        Call<OpenAccountSuccessActivity<Object>> call = getIdentityPresenter.e;
        if (call != null) {
            call.cancel();
        }
        getIdentityPresenter.d = null;
        TransactionCountPresenter transactionCountPresenter = this.x;
        Call<OpenAccountSuccessActivity<onTakePicture>> call2 = transactionCountPresenter.a;
        if (call2 != null) {
            call2.cancel();
        }
        transactionCountPresenter.b = null;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onRefreshListRingkasan(BahasaLayananAdapter$BahasaLayananVH bahasaLayananAdapter$BahasaLayananVH) {
        List<onTakePicture.write> list = this.t;
        if (list != null) {
            list.clear();
        }
        List<TransaksiTunda> list2 = this.q;
        if (list2 != null) {
            list2.clear();
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.getView, android.app.Activity
    public void onResume() {
        onResume();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onStop() {
        onStop();
    }

    @OnClick({2131297802})
    public void openRingkasanActivity(View view) {
        this.drawerLayout.b(8388611, true);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "TransactionActivity";
        this.j = "TransactionActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131493010;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
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
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.activity.TransactionActivity.showSubHalloBCA(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/TransactionActivity.class
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.TransactionActivity.showSubHalloBCA(android.view.View):void");
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
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.activity.TransactionActivity.showSubPengaturan(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/TransactionActivity.class
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.TransactionActivity.showSubPengaturan(android.view.View):void");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeLogoutEvent(subsriberChooseValueSetiapTanggalEvent subsriberchoosevaluesetiaptanggalevent) {
        if (this.m != null) {
            this.apiService.c(new signUp(this.m.getSessionId())).enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.activity.TransactionActivity.1
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
