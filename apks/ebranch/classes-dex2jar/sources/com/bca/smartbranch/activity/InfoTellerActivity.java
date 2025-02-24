package com.bca.smartbranch.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import com.bca.smartbranch.activity.InfoTellerActivity;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoTellerActivity.class */
public class InfoTellerActivity extends BaseActivityPostLogin {
    public String f;
    @BindView(2131298110)
    ProgressBar pb;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131298790)
    public TextView txtToolbarTitle;
    @BindView(2131299811)
    public WebView wvContent;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoTellerActivity$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer extends WebViewClient {
        private RemoteActionCompatParcelizer() {
            InfoTellerActivity.this = r4;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(InfoTellerActivity infoTellerActivity, byte b) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            onPageFinished(webView, str);
            InfoTellerActivity.this.pb.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
            InfoTellerActivity.this.pb.setVisibility(8);
            InfoTellerActivity.this.tvErrorMessage.setVisibility(0);
            InfoTellerActivity.this.tvErrorMessage.setText(2131822124);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        new Handler().postDelayed(new Runnable() { // from class: o.subscribeUbahMasterCardEvent
            @Override // java.lang.Runnable
            public final void run() {
                InfoTellerActivity infoTellerActivity = InfoTellerActivity.this;
                String string = infoTellerActivity.getIntent().getExtras().getString("url", "");
                infoTellerActivity.f = string;
                string.hashCode();
                if (string.equals("https://www.bca.co.id/transaksi-teller-smartbranch")) {
                    infoTellerActivity.txtToolbarTitle.setText(Html.fromHtml(infoTellerActivity.getResources().getString(2131822284)));
                    infoTellerActivity.wvContent.getSettings().setJavaScriptEnabled(true);
                    infoTellerActivity.wvContent.setWebViewClient(new InfoTellerActivity.RemoteActionCompatParcelizer(infoTellerActivity, (byte) 0));
                    infoTellerActivity.wvContent.loadUrl("https://www.bca.co.id/transaksi-teller-smartbranch");
                } else if (string.equals("https://www.bca.co.id/teller-smartbranch")) {
                    infoTellerActivity.txtToolbarTitle.setText(2131822283);
                    infoTellerActivity.wvContent.getSettings().setJavaScriptEnabled(true);
                    infoTellerActivity.wvContent.setWebViewClient(new InfoTellerActivity.RemoteActionCompatParcelizer(infoTellerActivity, (byte) 0));
                    infoTellerActivity.wvContent.loadUrl("https://www.bca.co.id/teller-smartbranch");
                }
            }
        }, 200);
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        k();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        this.wvContent.destroy();
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

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "InfoTellerActivity";
        this.j = "InfoTellerActivity";
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
