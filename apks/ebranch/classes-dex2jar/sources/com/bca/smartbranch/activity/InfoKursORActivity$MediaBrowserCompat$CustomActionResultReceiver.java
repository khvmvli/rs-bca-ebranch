package com.bca.smartbranch.activity;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoKursORActivity$MediaBrowserCompat$CustomActionResultReceiver.class */
final class InfoKursORActivity$MediaBrowserCompat$CustomActionResultReceiver extends WebViewClient {
    final /* synthetic */ InfoKursORActivity b;

    private InfoKursORActivity$MediaBrowserCompat$CustomActionResultReceiver(InfoKursORActivity infoKursORActivity) {
        this.b = infoKursORActivity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ InfoKursORActivity$MediaBrowserCompat$CustomActionResultReceiver(InfoKursORActivity infoKursORActivity, byte b) {
        this(infoKursORActivity);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        onPageFinished(webView, str);
        this.b.pb.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.cancel();
        this.b.pb.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }
}
