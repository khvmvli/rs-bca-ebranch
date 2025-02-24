package com.bca.smartbranch.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoCodewordORActivity.class */
public class InfoCodewordORActivity extends BaseActivityPostLogin {
    @BindString(2131821255)
    String infoCodewordOR;
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
    private String f = "http://docs.google.com/gview?embedded=true&url=";
    private String n = "javascript:(function() {document.querySelector('[role=\"toolbar\"]').remove();})()";

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.pb.setVisibility(0);
        this.wvContent.invalidate();
        this.wvContent.getSettings().setJavaScriptEnabled(true);
        this.wvContent.getSettings().setSupportZoom(true);
        WebView webView = this.wvContent;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append("https://www.bca.co.id/-/media/Files/Individu/layanan/pengiriman%20uang/20210716-persyaratan-lainnya");
        webView.loadUrl(sb.toString());
        this.wvContent.setWebViewClient(new WebViewClient() { // from class: com.bca.smartbranch.activity.InfoCodewordORActivity.3
            boolean b = false;

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str) {
                if (this.b) {
                    InfoCodewordORActivity.this.wvContent.loadUrl(InfoCodewordORActivity.this.n);
                    InfoCodewordORActivity.this.pb.setVisibility(8);
                    return;
                }
                InfoCodewordORActivity.this.s();
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                this.b = true;
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                sslErrorHandler.cancel();
                InfoCodewordORActivity.this.pb.setVisibility(8);
                InfoCodewordORActivity.this.tvErrorMessage.setVisibility(0);
                InfoCodewordORActivity.this.tvErrorMessage.setText(2131822124);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        this.txtToolbarTitle.setText(this.infoCodewordOR);
        s();
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
        setCardSlogan.e().b = "InfoCodewordORActivity";
        this.j = "InfoCodewordORActivity";
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
