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
import android.view.MenuItem;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.App;
import com.bca.smartbranch.dialog.FingerprintDialog;
import com.bca.smartbranch.dialog.FiturSignUpDialog;
import com.bca.smartbranch.dialog.HaloBCADialog;
import com.bca.smartbranch.dialog.LogoutDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import java.security.KeyStore;
import java.security.Signature;
import o.HapusTransaksiBerkalaDialog_ViewBinding;
import o.Keep;
import o.LogoutDialog_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Page6CSFragment;
import o.PilihSetoranActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.VersiActivity_ViewBinding;
import o.consumeDisplayCutout;
import o.getAnnualFeeBasicDisplayAmount;
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
import o.tambahPemegangKartu;
import org.greenrobot.eventbus.ThreadMode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ProfileActivity.class */
public class ProfileActivity extends BaseActivityPostLogin implements CompoundButton.OnCheckedChangeListener {
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
    @BindView(2131296976)
    EditText etEmail;
    @BindView(2131296993)
    EditText etJenisId;
    @BindView(2131297094)
    EditText etNoHP;
    @BindView(2131297126)
    EditText etNomorId;
    @BindView(2131297131)
    EditText etNorek;
    private getAnnualFeeBasicDisplayAmount f;
    @BindString(2131820903)
    String invalidHandphoneMessage;
    @BindView(2131297307)
    ImageView ivArrowHubungi;
    @BindView(2131297310)
    ImageView ivArrowPengaturan;
    @BindView(2131297366)
    Page6CSFragment ivFotoDiri;
    @BindView(2131297407)
    ImageView ivProfileVerified;
    @BindView(2131297422)
    Page6CSFragment ivUserPhoto;
    @BindView(2131297423)
    ImageView ivVerified;
    @BindString(2131821815)
    String labelKtp;
    @BindString(2131821986)
    String labelPaspor;
    @BindString(2131822074)
    String labelRekening;
    @BindView(2131297927)
    LinearLayout llPin;
    @BindView(2131296324)
    LinearLayout lnActivityMain;
    @BindDrawable(2131231154)
    Drawable menuIndicator;
    private KeyStore n;
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
    @BindString(2131821553)
    String nomorKtp;
    @BindString(2131821556)
    String nomorPaspor;
    private Keep p;
    private Signature q;
    @BindString(2131822092)
    String retry;
    @BindView(2131298421)
    setSelected swFingerprint;
    @BindView(2131298527)
    LogoutDialog_ViewBinding tilEmail;
    @BindView(2131298542)
    LogoutDialog_ViewBinding tilJenisId;
    @BindView(2131298640)
    LogoutDialog_ViewBinding tilNoHp;
    @BindView(2131298672)
    LogoutDialog_ViewBinding tilNomorId;
    @BindView(2131298676)
    LogoutDialog_ViewBinding tilNorek;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299405)
    TextView tvMembership;
    @BindView(2131299440)
    TextView tvName;
    @BindView(2131298790)
    TextView tvTitle;
    @BindView(2131299730)
    TextView tvUserName;
    @BindView(2131299735)
    TextView tvVersi;
    @BindString(2131822256)
    String txtTitle;
    @BindString(2131822339)
    String verifMessage;

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
            this.drawerLayout.b(8388611, true);
        } else {
            new FiturSignUpDialog().show(l(), "FiturSignUpDialog");
        }
    }

    @OnClick({2131297803})
    public void chooseSyaratKetentuan(View view) {
        startActivityForResult(new Intent(this, SyaratKetentuanActivity.class), 9898);
        finish();
    }

    @OnClick({2131297267})
    public void clickProfileVerify() {
        if ("Y".equalsIgnoreCase(this.m.getVerified())) {
            Bundle bundle = new Bundle();
            bundle.putString("MessageDialogContent", this.verifMessage);
            MessageDialog messageDialog = new MessageDialog();
            messageDialog.setArguments(bundle);
            messageDialog.show(l(), "MessageDialog");
        }
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        Bitmap bitmap;
        d(bundle);
        App.d().b(this);
        b(this.toolbar);
        i();
        boolean z = true;
        i().d(true);
        i().d("");
        this.tvTitle.setText(this.txtTitle);
        setResult(-1);
        Bitmap bitmap2 = null;
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
        this.p = keep;
        if (keep.d) {
            keep.a(keep.c, 0);
            keep.d = false;
        }
        this.p.e(this.menuIndicator);
        this.p.b = new View.OnClickListener() { // from class: com.bca.smartbranch.activity.ProfileActivity.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getResources getresources = ProfileActivity.this.drawerLayout;
                View d = getresources.d(8388611);
                if (d != null ? getresources.g(d) : false) {
                    ProfileActivity.this.drawerLayout.b(8388611, true);
                } else {
                    ProfileActivity.this.drawerLayout.a(8388611, true);
                }
            }
        };
        this.drawerLayout.setDrawerListener(this.p);
        this.p.a();
        this.swFingerprint.setChecked(this.sharedPreferences.getString("is_use_fingerprint", "").equals("Y"));
        this.swFingerprint.setOnCheckedChangeListener(this);
        tambahPemegangKartu tambahpemegangkartu = new tambahPemegangKartu(this);
        if (!tambahpemegangkartu.b || !tambahpemegangkartu.b() || !tambahpemegangkartu.c()) {
            z = false;
        }
        if (!z || this.m == null || !this.m.isMember()) {
            this.navFingerprint.setVisibility(8);
            this.dvdFingerprint.setVisibility(8);
        } else {
            this.navFingerprint.setVisibility(0);
            this.dvdFingerprint.setVisibility(0);
        }
        this.etEmail.setText(this.m.getEmail());
        if (this.m.getNoHandphone() == null || "".equalsIgnoreCase(this.m.getNoHandphone())) {
            this.etNoHP.setText("-");
        } else {
            this.etNoHP.setText(this.m.getNoHandphone());
        }
        TextView textView3 = this.tvName;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.m.getName());
        sb3.append(" ");
        textView3.setText(sb3.toString());
        if ("Y".equalsIgnoreCase(this.m.getVerified())) {
            this.ivProfileVerified.setVisibility(0);
        } else {
            this.ivProfileVerified.setVisibility(8);
        }
        if ("KTP".equalsIgnoreCase(this.m.getIdType())) {
            this.tilJenisId.setVisibility(0);
            this.tilNomorId.setVisibility(0);
            this.tilNomorId.setHint(this.nomorKtp);
            this.tilNorek.setVisibility(8);
            this.etJenisId.setText(this.labelKtp);
            this.etNomorId.setText(this.m.getIdNum());
        } else if ("Paspor".equalsIgnoreCase(this.m.getIdType())) {
            this.tilJenisId.setVisibility(0);
            this.tilNomorId.setVisibility(0);
            this.tilNomorId.setHint(this.nomorPaspor);
            this.tilNorek.setVisibility(8);
            this.etJenisId.setText(this.labelPaspor);
            this.etNomorId.setText(this.m.getIdNum());
        } else if (!this.m.getAcctNo().isEmpty() || "Rekening".equalsIgnoreCase(this.m.getIdType())) {
            this.tilNorek.setVisibility(0);
            this.tilJenisId.setVisibility(0);
            this.tilNomorId.setVisibility(8);
            this.etJenisId.setText(this.labelRekening);
            this.etNorek.setText(this.m.getAcctNo());
        } else {
            this.tilNorek.setVisibility(8);
            this.tilJenisId.setVisibility(8);
            this.tilNomorId.setVisibility(8);
        }
        if (!this.m.getUserPhoto().isEmpty()) {
            Page6CSFragment page6CSFragment2 = this.ivFotoDiri;
            String userPhoto2 = this.m.getUserPhoto();
            if (!"".equalsIgnoreCase(userPhoto2)) {
                byte[] decode2 = Base64.decode(userPhoto2.getBytes(), 2);
                bitmap2 = BitmapFactory.decodeByteArray(decode2, 0, decode2.length);
            }
            page6CSFragment2.setImageBitmap(bitmap2);
        }
        this.etEmail.addTextChangedListener(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0453: INVOKE  
              (wrap: android.widget.EditText : 0x0449: IGET  (r0v60 android.widget.EditText A[REMOVE]) = (r8v0 'this' com.bca.smartbranch.activity.ProfileActivity A[IMMUTABLE_TYPE, THIS]) com.bca.smartbranch.activity.ProfileActivity.etEmail android.widget.EditText)
              (wrap: o.getPromotion$3 : 0x0450: CONSTRUCTOR  (r1v38 o.getPromotion$3 A[REMOVE]) =  call: o.getPromotion.3.<init>():void type: CONSTRUCTOR)
             type: VIRTUAL call: android.widget.TextView.addTextChangedListener(android.text.TextWatcher):void in method: com.bca.smartbranch.activity.ProfileActivity.d(android.os.Bundle):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/ProfileActivity.class
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
        // Method dump skipped, instructions count: 1304
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ProfileActivity.d(android.os.Bundle):void");
    }

    @OnClick({2131296387})
    public void fillNoHp(View view) {
        if (this.etNoHP.getText().toString().isEmpty() || "-".equalsIgnoreCase(this.etNoHP.getText().toString())) {
            Intent intent = new Intent(this, UbahProfilActivity.class);
            intent.putExtra("fill_nohp", true);
            startActivity(intent);
        }
    }

    @OnClick({2131297927})
    public void goChangePIN(View view) {
        startActivity(new Intent(this, UbahPINActivity.class));
    }

    @OnClick({2131297648})
    public void goDeleteAccount(View view) {
        startActivity(new Intent(this, DeleteAccountActivity.class));
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
        } else if (getAnnualFeeBasicDisplayAmount.b(this.n, this.q)) {
            FingerprintDialog fingerprintDialog = new FingerprintDialog();
            Bundle bundle2 = new Bundle();
            fingerprintDialog.a = new FingerprintManager.CryptoObject(this.q);
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
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        k();
        return true;
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
        if ("Y".equalsIgnoreCase(this.m.getVerified())) {
            this.ivVerified.setVisibility(0);
        } else {
            this.ivVerified.setVisibility(8);
        }
        Bitmap bitmap2 = null;
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
        this.etEmail.setText(this.m.getEmail());
        if (this.m.getNoHandphone() == null || "".equalsIgnoreCase(this.m.getNoHandphone())) {
            this.etNoHP.setText("-");
        } else {
            this.etNoHP.setText(this.m.getNoHandphone());
        }
        this.tvName.setText(this.m.getName());
        if ("Y".equalsIgnoreCase(this.m.getVerified())) {
            this.ivProfileVerified.setVisibility(0);
        } else {
            this.ivProfileVerified.setVisibility(8);
        }
        if ("KTP".equalsIgnoreCase(this.m.getIdType())) {
            this.tilJenisId.setVisibility(0);
            this.tilNomorId.setVisibility(0);
            this.tilNomorId.setHint(this.nomorKtp);
            this.tilNorek.setVisibility(8);
            this.etJenisId.setText(this.labelKtp);
            this.etNomorId.setText(this.m.getIdNum());
        } else if ("Paspor".equalsIgnoreCase(this.m.getIdType())) {
            this.tilJenisId.setVisibility(0);
            this.tilNomorId.setVisibility(0);
            this.tilNomorId.setHint(this.nomorPaspor);
            this.tilNorek.setVisibility(8);
            this.etJenisId.setText(this.labelPaspor);
            this.etNomorId.setText(this.m.getIdNum());
        } else if (!this.m.getAcctNo().isEmpty() || "Rekening".equalsIgnoreCase(this.m.getIdType())) {
            this.tilNorek.setVisibility(0);
            this.tilJenisId.setVisibility(0);
            this.tilNomorId.setVisibility(8);
            this.etJenisId.setText(this.labelRekening);
            this.etNorek.setText(this.m.getAcctNo());
        } else {
            this.tilNorek.setVisibility(8);
            this.tilJenisId.setVisibility(8);
            this.tilNomorId.setVisibility(8);
        }
        if (!this.m.getUserPhoto().isEmpty()) {
            Page6CSFragment page6CSFragment2 = this.ivFotoDiri;
            String userPhoto2 = this.m.getUserPhoto();
            if (!"".equalsIgnoreCase(userPhoto2)) {
                byte[] decode2 = Base64.decode(userPhoto2.getBytes(), 2);
                bitmap2 = BitmapFactory.decodeByteArray(decode2, 0, decode2.length);
            }
            page6CSFragment2.setImageBitmap(bitmap2);
        }
    }

    @OnClick({2131297802})
    public void openRingkasanActivity(View view) {
        startActivityForResult(new Intent(this, TransactionActivity.class), 9898);
        finish();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "ProfileActivity";
        this.j = "ProfileActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492988;
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
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.activity.ProfileActivity.showSubHalloBCA(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/ProfileActivity.class
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ProfileActivity.showSubHalloBCA(android.view.View):void");
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
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.activity.ProfileActivity.showSubPengaturan(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/ProfileActivity.class
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
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ProfileActivity.showSubPengaturan(android.view.View):void");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void subscribeLogoutEvent(subsriberChooseValueSetiapTanggalEvent subsriberchoosevaluesetiaptanggalevent) {
        if (this.m != null) {
            this.apiService.c(new signUp(this.m.getSessionId())).enqueue(new Callback<OpenAccountSuccessActivity<Object>>() { // from class: com.bca.smartbranch.activity.ProfileActivity.2
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

    @OnClick({2131297421})
    public void ubahProfil(View view) {
        Intent intent = new Intent(this, UbahProfilActivity.class);
        intent.putExtra("fill_nohp", false);
        startActivity(intent);
    }
}
