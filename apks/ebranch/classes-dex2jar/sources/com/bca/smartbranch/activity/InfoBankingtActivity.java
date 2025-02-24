package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import com.bca.smartbranch.data.localdb.Account;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.SimpanDraftDialog;
import com.bca.smartbranch.dialog.YakinKeluarDialog;
import io.realm.Case;
import io.realm.Realm;
import o.ReservasiSuccessEChannelActivity_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.TarikanReservasiUbahTransaksiActivity_ViewBinding;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setOnHierarchyChangeListener;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoBankingtActivity.class */
public class InfoBankingtActivity extends BaseActivityPostLogin {
    private Bundle f;
    private Account n;
    private User p;
    @BindView(2131298110)
    ProgressBar pb;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    @BindView(2131299811)
    WebView wvContent;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoBankingtActivity$RemoteActionCompatParcelizer.class */
    final class RemoteActionCompatParcelizer extends WebViewClient {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(InfoBankingtActivity infoBankingtActivity, byte b) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            onPageFinished(webView, str);
            InfoBankingtActivity.this.pb.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
            InfoBankingtActivity.this.pb.setVisibility(8);
            InfoBankingtActivity.this.tvErrorMessage.setVisibility(0);
            InfoBankingtActivity.this.tvErrorMessage.setText(2131822124);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.f = getIntent().getExtras();
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.wvContent.getSettings().setJavaScriptEnabled(true);
        this.wvContent.setWebViewClient(new RemoteActionCompatParcelizer(this, (byte) 0));
        this.n = (Account) this.k.where(Account.class).equalTo("id", Long.valueOf(this.f.getLong("current_account_id"))).findFirst();
        this.p = (User) this.k.where(User.class).equalTo("email", this.f.getString("current_user_id"), Case.INSENSITIVE).findFirst();
        String string = this.f.getString("banking_type");
        string.hashCode();
        if (string.equals("INFO M-BCA")) {
            this.txtToolbarTitle.setText(Html.fromHtml("INFO M-BCA"));
            this.wvContent.loadUrl("https://www.bca.co.id/Individu/Produk/E-Banking/m-bca-smartbranch");
        } else if (string.equals("INFO KLIKBCA")) {
            this.txtToolbarTitle.setText(Html.fromHtml("INFO KLIKBCA"));
            this.wvContent.loadUrl("https://www.bca.co.id/Individu/Produk/E-Banking/klikbca-smartbranch");
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueSimpanDraft(ReservasiSuccessEChannelActivity_ViewBinding reservasiSuccessEChannelActivity_ViewBinding) {
        String str = reservasiSuccessEChannelActivity_ViewBinding.d;
        str.hashCode();
        if (str.equals("N")) {
            this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.InfoBankingtActivity.3
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    InfoBankingtActivity.this.n.deleteFromRealm();
                }
            });
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            setOnHierarchyChangeListener.d((Activity) this);
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onChooseValueYakinKeluar(TarikanReservasiUbahTransaksiActivity_ViewBinding tarikanReservasiUbahTransaksiActivity_ViewBinding) {
        String str = tarikanReservasiUbahTransaksiActivity_ViewBinding.a;
        str.hashCode();
        if (str.equals("Y")) {
            this.k.executeTransaction(new Realm.Transaction() { // from class: com.bca.smartbranch.activity.InfoBankingtActivity.1
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    InfoBankingtActivity.this.n.deleteFromRealm();
                }
            });
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            setOnHierarchyChangeListener.d((Activity) this);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return onCreateOptionsMenu(menu);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        this.wvContent.destroy();
        onDestroy();
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
            if (this.m != null) {
                new SimpanDraftDialog().show(l(), "SimpanDraftDialog");
                return true;
            }
            new YakinKeluarDialog().show(l(), "YakinKeluarDialog");
            return true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "InfoBankingActivity";
        this.j = "InfoBankingActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131493019;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
