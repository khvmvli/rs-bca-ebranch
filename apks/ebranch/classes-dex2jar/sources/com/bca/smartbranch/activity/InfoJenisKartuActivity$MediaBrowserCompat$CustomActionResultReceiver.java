package com.bca.smartbranch.activity;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoJenisKartuActivity$MediaBrowserCompat$CustomActionResultReceiver.class */
final class InfoJenisKartuActivity$MediaBrowserCompat$CustomActionResultReceiver extends WebViewClient {
    final /* synthetic */ InfoJenisKartuActivity a;

    private InfoJenisKartuActivity$MediaBrowserCompat$CustomActionResultReceiver(InfoJenisKartuActivity infoJenisKartuActivity) {
        this.a = infoJenisKartuActivity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ InfoJenisKartuActivity$MediaBrowserCompat$CustomActionResultReceiver(InfoJenisKartuActivity infoJenisKartuActivity, byte b) {
        this(infoJenisKartuActivity);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        onPageFinished(webView, str);
        this.a.pb.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.cancel();
        this.a.pb.setVisibility(8);
        this.a.tvErrorMessage.setVisibility(0);
        this.a.tvErrorMessage.setText(2131822124);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }
}
