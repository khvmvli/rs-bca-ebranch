package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.data.api.response.DaftarTransferResponse;
import com.bca.smartbranch.data.global.DaftarTransfer;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.presenter.DaftarTransferPresenter;
import java.util.ArrayList;
import java.util.List;
import o.InfoProductActivity;
import o.ListUtil;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.clickJenisIdentitasPemilikSumberDana;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/AskAccountActivity.class */
public class AskAccountActivity extends BaseActivityPostLogin implements DaftarTransferPresenter.RemoteActionCompatParcelizer {
    private DaftarTransferPresenter f;
    @BindView(2131297766)
    LinearLayout llMain;
    private boolean n;
    private String p;
    private long q;
    @BindString(2131822092)
    String retry;
    private String s;
    private String t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822243)
    String toolbarTitleBCADollar;
    @BindString(2131822203)
    String toolbarTitleDeposito;
    @BindString(2131822281)
    String toolbarTitleSetoran;
    @BindString(2131822244)
    String toolbarTitleTahapanBCA;
    @BindString(2131822275)
    String toolbarTitleTahapanBerjangka;
    @BindString(2131822245)
    String toolbarTitleTahapanXpresi;
    @BindString(2131822246)
    String toolbarTitleTapres;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void h(String str) {
        char c;
        Intent intent;
        String str2 = this.t;
        str2.hashCode();
        switch (str2.hashCode()) {
            case -748993769:
                if (str2.equals("Tahapan BCA")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -245309302:
                if (str2.equals("Tahapan Xpresi")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 164545469:
                if (str2.equals("Tapres BCA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1076132060:
                if (str2.equals("BCA Dollar")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1269943660:
                if (str2.equals("Tahapan Berjangka")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1726066065:
                if (str2.equals("DEPOSITO")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1985800370:
                if (str2.equals("setoran")) {
                    c = 6;
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
            case 2:
            case 3:
            case 5:
                intent = new Intent(this, FormActivity.class);
                intent.putExtra("id_draft", false);
                intent.putExtra("product_type", this.t);
                break;
            case 4:
                if (!str.equals("Y")) {
                    if (str.equals("N")) {
                        Bundle bundle = new Bundle();
                        bundle.putString("MessageDialogContent", getString(2131822440));
                        bundle.putString("MessageDialogTitle", getString(2131822223));
                        MessageDialog messageDialog = new MessageDialog();
                        messageDialog.setArguments(bundle);
                        messageDialog.show(l(), "MessageDialog");
                    }
                    intent = null;
                    break;
                } else {
                    intent = new Intent(this, FormActivity.class);
                    intent.putExtra("id_draft", false);
                    intent.putExtra("product_type", this.t);
                    break;
                }
            case 6:
                if (this.m == null) {
                    intent = new Intent(this, FormTellerActivity.class);
                    intent.putExtra("title", this.s);
                    intent.putExtra("TellerType", "setoran");
                    break;
                } else {
                    this.p = str;
                    this.f.d(new InfoProductActivity(this.m.getEmail(), this.m.getSessionId(), this.m.getImei(), "Setoran Tunai"), true);
                    intent = null;
                    break;
                }
            default:
                intent = null;
                break;
        }
        if (intent != null) {
            boolean z = this.n;
            if (z) {
                intent.putExtra("is_from_reservation", z);
                intent.putExtra("id_reservation", this.q);
            }
            intent.putExtra("old_cust", str);
            startActivity(intent);
        }
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormTellerActivity.class);
        intent.putExtra("title", this.s);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("old_cust", this.p);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        boolean z = this.n;
        if (z) {
            intent.putExtra("is_from_reservation", z);
            intent.putExtra("id_reservation", this.q);
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void b_(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormTellerActivity.class);
        intent.putExtra("title", this.s);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("old_cust", this.p);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        boolean z = this.n;
        if (z) {
            intent.putExtra("is_from_reservation", z);
            intent.putExtra("id_reservation", this.q);
        }
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011a, code lost:
        if (r0.equals("Tahapan BCA") != false) goto L_0x0122;
     */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 438
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.AskAccountActivity.d(android.os.Bundle):void");
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormTellerActivity.class);
        intent.putExtra("title", this.s);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("old_cust", this.p);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        boolean z = this.n;
        if (z) {
            intent.putExtra("is_from_reservation", z);
            intent.putExtra("id_reservation", this.q);
        }
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
        intent.putExtra("title", this.s);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("old_cust", this.p);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        boolean z = this.n;
        if (z) {
            intent.putExtra("is_from_reservation", z);
            intent.putExtra("id_reservation", this.q);
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void e_(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormTellerActivity.class);
        intent.putExtra("title", this.s);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("old_cust", this.p);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        boolean z = this.n;
        if (z) {
            intent.putExtra("is_from_reservation", z);
            intent.putExtra("id_reservation", this.q);
        }
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void g_(String str) {
        x();
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(this, FormTellerActivity.class);
        intent.putExtra("title", this.s);
        intent.putExtra("TellerType", "setoran");
        intent.putExtra("old_cust", this.p);
        intent.putExtra("daftar_transfer", ListUtil.OneItemImmutableList.e(arrayList));
        boolean z = this.n;
        if (z) {
            intent.putExtra("is_from_reservation", z);
            intent.putExtra("id_reservation", this.q);
        }
        startActivity(intent);
    }

    @OnClick({2131296416})
    public void no(View view) {
        h("N");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.n) {
            return true;
        }
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        DaftarTransferPresenter daftarTransferPresenter = this.f;
        Call<OpenAccountSuccessActivity<DaftarTransferResponse>> call = daftarTransferPresenter.a;
        if (call != null) {
            call.cancel();
        }
        daftarTransferPresenter.c = null;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onFormSuccess(clickJenisIdentitasPemilikSumberDana clickjenisidentitaspemiliksumberdana) {
        finish();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            k();
            return true;
        } else if (itemId != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "AskAccountActivity";
        this.j = "AskAccountActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492894;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @Override // com.bca.smartbranch.presenter.DaftarTransferPresenter.RemoteActionCompatParcelizer
    public final void s() {
        z();
    }

    @OnClick({2131296462})
    public void yes(View view) {
        h("Y");
    }
}
