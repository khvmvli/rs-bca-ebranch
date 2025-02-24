package com.bca.smartbranch.activity;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/InfoFullAmountORActivity$MediaBrowserCompat$CustomActionResultReceiver.class */
final class InfoFullAmountORActivity$MediaBrowserCompat$CustomActionResultReceiver extends WebViewClient {
    final /* synthetic */ InfoFullAmountORActivity d;

    private InfoFullAmountORActivity$MediaBrowserCompat$CustomActionResultReceiver(InfoFullAmountORActivity infoFullAmountORActivity) {
        this.d = infoFullAmountORActivity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ InfoFullAmountORActivity$MediaBrowserCompat$CustomActionResultReceiver(InfoFullAmountORActivity infoFullAmountORActivity, byte b) {
        this(infoFullAmountORActivity);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        onPageFinished(webView, str);
        this.d.pb.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.cancel();
        this.d.pb.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }
}
