package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CekDokumenActivity.class */
public class CekDokumenActivity extends BaseActivityPostLogin {
    private Bundle f;
    @BindView(2131298110)
    ProgressBar pb;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822214)
    String toolbarTitleBCADollar;
    @BindString(2131822203)
    String toolbarTitleDeposito;
    @BindString(2131822195)
    String toolbarTitleEChannel;
    @BindString(2131822222)
    String toolbarTitleTahapanBCA;
    @BindString(2131822275)
    String toolbarTitleTahapanBerjangka;
    @BindString(2131822224)
    String toolbarTitleTahapanXpresi;
    @BindString(2131822225)
    String toolbarTitleTapres;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    @BindView(2131299811)
    WebView wvContent;

    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/CekDokumenActivity$IconCompatParcelizer.class */
    final class IconCompatParcelizer extends WebViewClient {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(CekDokumenActivity cekDokumenActivity, byte b) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            onPageFinished(webView, str);
            CekDokumenActivity.this.pb.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sslErrorHandler.cancel();
            CekDokumenActivity.this.pb.setVisibility(8);
            CekDokumenActivity.this.tvErrorMessage.setVisibility(0);
            CekDokumenActivity.this.tvErrorMessage.setText(2131822124);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dc, code lost:
        if (r0.equals("2") == false) goto L_0x00f0;
     */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 453
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.CekDokumenActivity.d(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return true;
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
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "CekDokumenActivity";
        this.j = "CekDokumenActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492957;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }
}
