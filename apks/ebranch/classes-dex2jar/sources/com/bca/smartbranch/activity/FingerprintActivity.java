package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import butterknife.OnClick;
import com.bca.smartbranch.App;
import com.bca.smartbranch.dialog.FingerprintDialog;
import com.bca.smartbranch.dialog.FingerprintStatusDialog;
import com.bca.smartbranch.dialog.MessageDialog;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import o.PilihSetoranActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.documentProvider;
import o.getAnnualFeeBasicDisplayAmount;
import o.onClicedButton;
import o.onHiddenChanged;
import o.sumberDanaEvent;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FingerprintActivity.class */
public class FingerprintActivity extends BaseActivityPreLogin {
    private Bundle k;
    private boolean l;
    private String m;
    private KeyStore n;

    /* renamed from: o  reason: collision with root package name */
    private getAnnualFeeBasicDisplayAmount f14o;
    private Signature s;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    public final void b(Bundle bundle) {
        b(bundle);
        App.d().b(this);
        documentProvider.b().c(this);
        Bundle extras = getIntent().getExtras();
        this.k = extras;
        this.l = extras.getBoolean("is_from_home", false);
        this.m = this.k.getString("email_fingerprint", "");
        this.f14o = new getAnnualFeeBasicDisplayAmount();
        try {
            this.n = KeyStore.getInstance("AndroidKeyStore");
            this.s = Signature.getInstance("SHA256withECDSA");
        } catch (KeyStoreException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
        }
    }

    @OnClick({2131299348})
    public void clickedKetentuan(View view) {
    }

    @OnClick({2131296455})
    public void clickedTidak(View view) {
        this.sharedPreferences.edit().putString("is_use_fingerprint", "N").commit();
        this.sharedPreferences.edit().putString("email_fingerprint", "").commit();
        if (this.l) {
            onBackPressed();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_fingerprint_active", false);
        FingerprintStatusDialog fingerprintStatusDialog = new FingerprintStatusDialog();
        fingerprintStatusDialog.setArguments(bundle);
        fingerprintStatusDialog.show(l(), "FingerprintStatusDialog");
    }

    @OnClick({2131296461})
    public void clickedYa(View view) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (getAnnualFeeBasicDisplayAmount.b(this.n, this.s)) {
            FingerprintDialog fingerprintDialog = new FingerprintDialog();
            Bundle bundle = new Bundle();
            bundle.putString("email", this.m);
            fingerprintDialog.a = new FingerprintManager.CryptoObject(this.s);
            fingerprintDialog.setArguments(bundle);
            fingerprintDialog.show(l(), "FingerprintDialog");
            return;
        }
        this.sharedPreferences.edit().putString("is_use_fingerprint", "N").commit();
        this.sharedPreferences.edit().putString("email_fingerprint", "").commit();
        Bundle bundle2 = new Bundle();
        bundle2.putString("MessageDialogContent", getResources().getString(2131821910));
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle2);
        messageDialog.show(l(), "MessageDialog");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void fingerprintStatusSubscribe(onClicedButton onclicedbutton) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("is_member", this.k.getBoolean("is_member", false));
        intent.putExtra("multiple_login", this.k.getString("multiple_login", ""));
        intent.putExtra("message_multiple_login", this.k.getString("message_multiple_login", ""));
        startActivity(intent);
        onHiddenChanged.d((Activity) this);
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        onBackPressed();
        if (this.l) {
            documentProvider.b().d(new PilihSetoranActivity(false));
            return;
        }
        startActivity(new Intent(this, LandingActivity.class));
        overridePendingTransition(2130772009, 2130772012);
        onHiddenChanged.d((Activity) this);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        documentProvider.b().e(this);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onLoginFingerprintEvent(sumberDanaEvent sumberdanaevent) {
        this.sharedPreferences.edit().putString("is_use_fingerprint", "Y").commit();
        this.sharedPreferences.edit().putString("email_fingerprint", this.m).commit();
        if (this.l) {
            k();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_fingerprint_active", true);
        FingerprintStatusDialog fingerprintStatusDialog = new FingerprintStatusDialog();
        fingerprintStatusDialog.setArguments(bundle);
        fingerprintStatusDialog.show(l(), "FingerprintStatusDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final int p() {
        return 2131492950;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPreLogin
    protected final Activity r() {
        return this;
    }
}
